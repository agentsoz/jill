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
import agentsoz.jill.lang.Agent;
import agentsoz.jill.util.AObjectCatalog;
import agentsoz.jill.util.ArgumentsLoader;
import agentsoz.jill.util.Log;

public class Main {
	
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
		int ncores = ArgumentsLoader.getNumThreads();
		int nagents = GlobalState.agents.size();
		int poolsize = (nagents > ncores) ? (nagents/ncores) : 1;
		int npools = (nagents > ncores) ? ncores : nagents;
		GlobalState.poolIdle = new boolean[ncores];
		for (int k = 0; k < GlobalState.poolIdle.length; k++) {
			GlobalState.poolIdle[k] = true;
		}
		int cycle = 0;
		/*
		do {
			cycle++;
	        ExecutorService executor = Executors.newFixedThreadPool(ncores);
	        for (int i = 0; i < npools; i++) {
	        	int start = i*poolsize;
	        	int size = (i+1 < npools) ? poolsize : GlobalState.agents.size()-start;
				executor.execute(new IntentionSelector(i, ArgumentsLoader.getRandomSeed(), start,size));
	        }
			executor.shutdown();
			try {
				executor.awaitTermination(10, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				Log.warn(e.getMessage());
			}
		} while (GlobalConstant.EXIT_ON_IDLE && !isIdle());
		*/
		CyclicBarrier entryBarrier = new CyclicBarrier(npools+1);
		CyclicBarrier exitBarrier = new CyclicBarrier(npools+1);
		IntentionSelector[] intentionSelectors = new IntentionSelector[ncores];
        for (int i = 0; i < npools; i++) {
        	int start = i*poolsize;
        	int size = (i+1 < npools) ? poolsize : GlobalState.agents.size()-start;
        	intentionSelectors[i] = new IntentionSelector(i, ArgumentsLoader.getRandomSeed(), start,size, entryBarrier, exitBarrier);
        	new Thread(intentionSelectors[i]).start(); // start and wait at the entry barrier
        }
		do {
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
		} while (GlobalConstant.EXIT_ON_IDLE && !isIdle());
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
		if (writer != null) {
			writer.close();
		}
		t1 = System.currentTimeMillis();
		Log.info("Terminated " + GlobalState.agents.size() + " agents ("+(t1-t0)+" ms)");

	}
	
	/**
	 * Checks if the system is idle, i.e., all the agents are idle with
	 * empty execution stacks
	 * @return
	 */
	public static boolean isIdle() {
		boolean idle = true;
		for (int i = 0; i < GlobalState.poolIdle.length; i++) {
			idle &= GlobalState.poolIdle[i];
		}
		return idle;
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
