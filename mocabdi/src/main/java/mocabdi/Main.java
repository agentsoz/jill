/*
    MocaBDI, millions of cognitive (BDI) agents
    Copyright (C) 2014 Dhirendra Singh

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

    Contact: Dhirendra Singh <dhi.singh@gmail.com>
*/


package mocabdi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import mocabdi.core.GlobalState;
import mocabdi.core.IntentionSelector;
import mocabdi.core.ProgramLoader;
import mocabdi.lang.Agent;
import mocabdi.util.ArgumentsLoader;
import mocabdi.util.Catalog;

public class Main {

	public static final String APP_NAME = "MoBee (C) 2014 RMIT Agents Group";
	public static final String APP_VERSION = "0.1";
	public static String getAppHeader() {   return APP_NAME + " Ver " + APP_VERSION; }

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
		GlobalState.agentsIntentions = new Catalog("agentsIntentions", NUMAGENTS, INCREMENT);

		long t0, t1;
		
		// Create the agents
		t0 = System.currentTimeMillis();
		ProgramLoader.load(ArgumentsLoader.getAgentClass(), NUMAGENTS, GlobalState.agents);
		t1 = System.currentTimeMillis();
		logger.info(": Created " + GlobalState.agents.size() + " agents ("+(t1-t0)+" ms)");


		// Start the agents
		t0 = System.currentTimeMillis();
		for (int i = 0; i < GlobalState.agents.size(); i++) {
			// Get the agent
			Agent agent = (Agent)GlobalState.agents.get(i);
			//Attach its intentions stack to the global intentions structure
			GlobalState.agentsIntentions.push(agent.getExecutionStack());
			// Start the agent
			agent.start();
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
				executor.execute(new IntentionSelector(start,size));
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
		t1 = System.currentTimeMillis();
		logger.info(": Terminated " + GlobalState.agents.size() + " agents ("+(t1-t0)+" ms)");

	}
}
