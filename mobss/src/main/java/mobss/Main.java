package mobss;

/*
 * #%L
 * MOBSS, Masses of BDI-agents for Social Simulation
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

import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import mobss.core.GlobalState;
import mobss.core.IntentionSelector;
import mobss.core.ProgramLoader;
import mobss.lang.Agent;
import mobss.util.ArgumentsLoader;
import mobss.util.Catalog;

public class Main {

	private final static Logger logger = Logger.getLogger("");
	private static FileHandler fh = null;


	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Parse the command line options
		ArgumentsLoader.parse(args);
		
		// Configure logging
		try {
			fh = new FileHandler(ArgumentsLoader.getLogFile(), false);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Logger thisLogger = Logger.getLogger("");
		fh.setFormatter(new SimpleFormatter());
		thisLogger.addHandler(fh);
		thisLogger.setLevel(ArgumentsLoader.getLogLevel());                    

		int NUMAGENTS = ArgumentsLoader.getNumAgents(); 
		int INCREMENT = 10000;

		GlobalState.agents = new Catalog("agents", NUMAGENTS, INCREMENT);

		long t0, t1;
		
		// Create the agents
		t0 = System.currentTimeMillis();
		ProgramLoader.load(ArgumentsLoader.getAgentClass(), NUMAGENTS, GlobalState.agents);
		t1 = System.currentTimeMillis();
		logger.info(": Created " + GlobalState.agents.size() + " agents ("+(t1-t0)+" ms)");


		// Redirect the agent program output if specified
		PrintWriter writer = null;
		if (ArgumentsLoader.getProgramOutputFile() != null) {
			try {
				writer = new PrintWriter(ArgumentsLoader.getProgramOutputFile(), "UTF-8");
			} catch (Exception e) {
				e.printStackTrace();
			}
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
		logger.info(": Started " + GlobalState.agents.size() + " agents ("+(t1-t0)+" ms)");

		// Wait till we are all done
		t0 = System.currentTimeMillis();
		int cycles = ArgumentsLoader.getNumCycles();
		int ncores = ArgumentsLoader.getNumThreads();
		int poolsize = GlobalState.agents.size()/ncores;
		int cycle = 0;
		while (cycles == -1 || cycle  < cycles) {
	        ExecutorService executor = Executors.newFixedThreadPool(ncores);
	        for (int i = 0; i < ncores; i++) {
	        	int start = i*poolsize;
	        	int size = (start+poolsize<=GlobalState.agents.size()) ? poolsize : 
	        		poolsize - (GlobalState.agents.size()-start);
				executor.execute(new IntentionSelector(ArgumentsLoader.getRandomSeed(), start,size));
	        }
			executor.shutdown();
			try {
				executor.awaitTermination(10, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				logger.warning(e.getMessage());
			}
			if (cycles != -1) {
				cycle++;
			}
		}
		t1 = System.currentTimeMillis();
		logger.info(": Finished running "+cycle+" execution cycles with " + GlobalState.agents.size() + " agents ("+(t1-t0)+" ms)");

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
		logger.info(": Terminated " + GlobalState.agents.size() + " agents ("+(t1-t0)+" ms)");

	}
}
