package agentsoz.jill;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2015 by its authors. See AUTHORS file.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

import java.io.PrintStream;
import java.util.Scanner;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import agentsoz.jill.config.GlobalConstant;
import agentsoz.jill.core.GlobalState;
import agentsoz.jill.core.IntentionSelector;
import agentsoz.jill.core.ProgramLoader;
import agentsoz.jill.core.beliefbase.abs.ABeliefStore;
import agentsoz.jill.lang.Agent;
import agentsoz.jill.util.AObjectCatalog;
import agentsoz.jill.util.ArgumentsLoader;
import agentsoz.jill.util.BitVector;
import agentsoz.jill.util.Log;

public class Main {

	/**
	 * Used to mark if all the pools of agents are idle or not
	 */
	private static int npools;
	private static int poolsize;
	private static BitVector[] agentsIdle;
	private static Integer poolsIdle = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Parse the command line options
		ArgumentsLoader.parse(args);
		
		// Pause for key press from user if requested
		if (ArgumentsLoader.doPauseForUserInput()) { pauseForUserInput(); }
		
		// Configure logging
        Log.createLogger("", ArgumentsLoader.getLogLevel(), ArgumentsLoader.getLogFile());

		int NUMAGENTS = ArgumentsLoader.getNumAgents(); 
		int INCREMENT = 10000;

		GlobalState.reset();
		GlobalState.agents = new AObjectCatalog("agents", NUMAGENTS, INCREMENT);

		// Create the central belief base
		GlobalState.beliefbase = new ABeliefStore(NUMAGENTS, ArgumentsLoader.getNumThreads());
		long t0, t1;
		
		// Create the agents
		t0 = System.currentTimeMillis();
		if (!ProgramLoader.load(ArgumentsLoader.getAgentClass(), NUMAGENTS, GlobalState.agents)) {
			return;
		}
		t1 = System.currentTimeMillis();
		Log.info("Created " + GlobalState.agents.size() + " agents ("+(t1-t0)+" ms)");


		// Redirect the agent program output if specified
		PrintStream writer = null;
		if (ArgumentsLoader.getProgramOutputFile() != null) {
			try {
				writer = new PrintStream(ArgumentsLoader.getProgramOutputFile(), "UTF-8");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			writer = System.out;
		}
		
		// Start the intention selection threads
		CyclicBarrier[] barriers = startIntentionSelectionThreads();
		CyclicBarrier entryBarrier = barriers[0], exitBarrier = barriers[1];

		// Start the agents
		t0 = System.currentTimeMillis();
		for (int i = 0; i < GlobalState.agents.size(); i++) {
			// Get the agent
			Agent agent = (Agent)GlobalState.agents.get(i);
			// Start the agent
			agent.start(writer, ArgumentsLoader.getProgramArguments());
		}
		t1 = System.currentTimeMillis();
		Log.info("Started " + GlobalState.agents.size() + " agents ("+(t1-t0)+" ms)");


		// Wait till we are all done
		t0 = System.currentTimeMillis();
		int cycle = 0;
		do {
			resetPoolsIdle();
			try {
				entryBarrier.await(); // Threads start their step now
			} catch (InterruptedException | BrokenBarrierException e) {
				Log.error(e.getMessage());
			} 
			cycle++;
			try {
				exitBarrier.await(); // Threads finish their step now, and wait at next start
			} catch (InterruptedException | BrokenBarrierException e) {
				Log.error(e.getMessage());
			} 
		} while (GlobalConstant.EXIT_ON_IDLE && !arePoolsIdle());
		t1 = System.currentTimeMillis();
		Log.info("Finished running "+cycle+" execution cycles with " + GlobalState.agents.size() + " agents ("+(t1-t0)+" ms)");

		// Finish the agents
		t0 = System.currentTimeMillis();
		for (int i = 0; i < GlobalState.agents.size(); i++) {
			// Get the agent
			Agent agent = (Agent)GlobalState.agents.get(i);
			// Terminate the agent
			agent.finish();
		}
		// Close the writer
		if (writer != null) {
			writer.close();
		}
		t1 = System.currentTimeMillis();
		Log.info("Terminated " + GlobalState.agents.size() + " agents ("+(t1-t0)+" ms)");

	}
	
	/**
	 * Checks if the system is idle, i.e., all the agents pools are idle
	 * @return
	 */
	public static boolean arePoolsIdle() {
		return poolsIdle == npools;
	}
	
	private static void resetPoolsIdle() {
		synchronized(poolsIdle) {
			poolsIdle = 0;
		}
	}

	/** 
	 * Records the idle state of a pool 
	 * @param state
	 */
	public static void addPoolIdleState(boolean isIdle) {
		synchronized(poolsIdle) {
			if (isIdle) {
				poolsIdle++;
			}
		}
	}
	
	/**
	 * Starts the intention selection threads that each handle a pool of agents
	 * @return the number of threads started
	 */
	private static CyclicBarrier[] startIntentionSelectionThreads() {
		CyclicBarrier[] barriers = new CyclicBarrier[2];
		int ncores = ArgumentsLoader.getNumThreads();
		int nagents = GlobalState.agents.size();
		poolsize = (nagents > ncores) ? (nagents/ncores) : 1;
		npools = (nagents > ncores) ? ncores : nagents;
		barriers[0] = new CyclicBarrier(npools+1);
		barriers[1] = new CyclicBarrier(npools+1);

		IntentionSelector[] intentionSelectors = new IntentionSelector[ncores];
        for (int i = 0; i < npools; i++) {
        	int start = i*poolsize;
        	int size = (i+1 < npools) ? poolsize : GlobalState.agents.size()-start;
        	intentionSelectors[i] = new IntentionSelector(ArgumentsLoader.getRandomSeed(), start,size, barriers[0], barriers[1]);
        	new Thread(intentionSelectors[i]).start(); // start and wait at the entry barrier
        }
        
        // Initialise the agents idle cache
		agentsIdle = new BitVector[npools];
        for (int i = 0; i < npools; i++) {
        	agentsIdle[i] = new BitVector(poolsize, 512);
			// Set all agents to idle
			for (int j = 0; j < poolsize; j++) {
				agentsIdle[i].setBit(j, true);
			}
        }
        return barriers;
	}
	/*
	private static void initAgentsIdleCache(int nagents, int npools) {
		int nBytes = (nagents/8)+1;
		synchronized(lockAgentsIdle) {
			// Initialise the agents idle cache
			agentsIdle = new byte[nBytes];
			// Set all agents to idle
			for (int i = 0; i < agentsIdle.length; i++) {
				agentsIdle[i] = (byte)0xff;
			}
		}
	}
	*/
	/**
	 * Sets a bit in the agentsIdle cache, to mark if this agent is idle (or not).
	 * @param agentId
	 * @param isIdle
	 */
	public static void setAgentIdle(int agentId, boolean isIdle) {
		
		int poolid = agentId/poolsize;
		int bit = agentId%poolsize;
		agentsIdle[poolid].setBit(bit, isIdle);
		/*
		int byteIndex = agentId/8;
		int bitIndex = agentId%8;
		int mask = ~(1 << bitIndex) & 0xff;
		int state = ((isIdle) ? 1 : 0) << bitIndex;
		synchronized(lockAgentsIdle) {
			agentsIdle[byteIndex] &= mask; // clear the bit
			agentsIdle[byteIndex] |= state; // set the bit
		}
		*/
	}
	
	public static boolean isAgentIdle(int agentId) {
		int poolid = agentId/poolsize;
		int bit = agentId%poolsize;
		return agentsIdle[poolid].isSet(bit);
		/*
		int byteIndex = agentId/8;
		int bitIndex = agentId%8;
		int mask = 1 << bitIndex;
		int state = (agentsIdle[byteIndex] & mask) >> bitIndex;
		return (state == 1);
		*/
	}
	
	/**
	 * Waits for user to press a key before continuing.
	 * Useful for connecting to a profiler
	 */
	private static void pauseForUserInput() {
		System.out.println("Press the Enter/Return key to continue..");
		Scanner in = new Scanner(System.in);
		in.nextLine();
		in.close();
	}

}
