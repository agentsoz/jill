package io.github.agentsoz.jill;

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

import io.github.agentsoz.jill.core.GlobalState;
import io.github.agentsoz.jill.core.IntentionSelector;
import io.github.agentsoz.jill.core.ProgramLoader;
import io.github.agentsoz.jill.core.beliefbase.abs.ABeliefStore;
import io.github.agentsoz.jill.lang.Agent;
import io.github.agentsoz.jill.util.AObjectCatalog;
import io.github.agentsoz.jill.util.ArgumentsLoader;
import io.github.agentsoz.jill.util.Log;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

	/**
	 * Used to mark if all the pools of agents are idle or not
	 */
	private static int npools;
	private static int poolsize;
	private static IntentionSelector[] intentionSelectors;
	public static AtomicInteger poolsIdle = new AtomicInteger();
	private static PrintStream writer;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Initialise the system with the given arguments
		init(args);
		
		// Start the engine
		start();
		
		// Wait until the agents become idle
		waitUntilIdle();

		// finish up
		finish();
	}
	
	public static void init(String[] args) {

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
		Log.info("Created " + GlobalState.agents.size() + " agents in "+(t1-t0)+" ms");

		// Initialise the thread pools
		initIntentionSelectionPools(NUMAGENTS, ArgumentsLoader.getNumThreads());


		// Redirect the agent program output if specified
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
		initIntentionSelectionThreads();
		
	}
	
	public static void start() {
		// Start the agents
		long t0 = System.currentTimeMillis();
		for (int i = 0; i < GlobalState.agents.size(); i++) {
			// Get the agent
			Agent agent = (Agent)GlobalState.agents.get(i);
			// Start the agent
			agent.start(writer, ArgumentsLoader.getProgramArguments());
		}
		long t1 = System.currentTimeMillis();
		Log.info("Started " + GlobalState.agents.size() + " agents in "+(t1-t0)+" ms");

		// Start the intention selection threads
		startIntentionSelectionThreads();
		
	}
	
	public static void waitUntilIdle() {
		// Wait till we are all done
		long t0 = System.currentTimeMillis();
		
		synchronized(poolsIdle) {
			while(!arePoolsIdle()) {
				try {
					poolsIdle.wait();
				} catch (InterruptedException e) {
					Log.error("Failed to wait on termination condition: " + e.getMessage());
				}
			}
		}
		
		long t1 = System.currentTimeMillis();
		Log.info("Finished running " + GlobalState.agents.size() + " agents in "+(t1-t0)+" ms");
	}

	public static void finish() {
		// Now shut down the threads
		shutdownIntentionSelectionThreads();

		// Finish the agents
		long t0 = System.currentTimeMillis();
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
		long t1 = System.currentTimeMillis();
		Log.info("Terminated " + GlobalState.agents.size() + " agents in "+(t1-t0)+" ms");
	}
	
	/**
	 * Checks if the system is idle, i.e., all the agents pools are idle
	 * @return
	 */
	public static boolean arePoolsIdle() {
		boolean idle = true;
		for (int i = 0; i < npools; i++) {
			idle &= (intentionSelectors[i] == null) || intentionSelectors[i].isIdle();
		}
		return idle;
	}

	public static boolean arePoolsFinished() {
		boolean finished = true;
		for (int i = 0; i < intentionSelectors.length; i++) {
			finished &= (intentionSelectors[i] == null);
		}
		return finished;
	}
	
	public static void flagPoolIdle() {
		synchronized(poolsIdle) {
			poolsIdle.notifyAll();
		}
	}

	public static void initIntentionSelectionPools(int nagents, int ncores) {
		poolsize = (nagents > ncores) ? (nagents/ncores) : 1;
		npools = (nagents > ncores) ? ncores : nagents;
	}
	

	/**
	 * Starts the intention selection threads that each handle a pool of agents
	 * @return the number of threads started
	 */
	public static void initIntentionSelectionThreads() {
		int ncores = ArgumentsLoader.getNumThreads();
		intentionSelectors = new IntentionSelector[ncores];
        for (int i = 0; i < npools; i++) {
        	int start = i*poolsize;
        	int size = (i+1 < npools) ? poolsize : GlobalState.agents.size()-start;
        	intentionSelectors[i] = new IntentionSelector(i, ArgumentsLoader.getRandomSeed(), start,size);
        }
	}

	public static void startIntentionSelectionThreads() {
        for (int i = 0; i < npools; i++) {
        	new Thread(intentionSelectors[i]).start(); // start and wait at the entry barrier
        }
	}

	public static void shutdownIntentionSelectionThreads() {
        for (int i = 0; i < npools; i++) {
        	intentionSelectors[i].shutdown(); 
        }
	}

	/**
	 * Sets a bit in the agentsIdle cache, to mark if this agent is idle (or not).
	 * @param agentId
	 * @param isIdle
	 */
	public static void setAgentIdle(int agentId, boolean isIdle) {
		int poolid = poolid(agentId);
		intentionSelectors[poolid].setAgentIdle(agentId, isIdle);
	}

	public static int poolid(int agentid) {
		int poolid = agentid/poolsize;
		if (poolid+1 > npools) {
			poolid = npools-1;
		}
		return poolid;
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

	public static void flagMessageTo(int toPool) {
		intentionSelectors[toPool].flagMessage();
	}

}
