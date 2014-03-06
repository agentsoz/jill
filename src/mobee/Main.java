package mobee;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import mobee.core.GlobalState;
import mobee.core.IntentionSelector;
import mobee.core.ProgramLoader;
import mobee.lang.Agent;
import mobee.util.ArgumentsLoader;
import mobee.util.Catalog;

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
		int cycles = 1;
		while(IntentionSelector.run()) {
			cycles++;
		}
		t1 = System.currentTimeMillis();
		logger.info(": Finished running "+cycles+" execution cycles with " + GlobalState.agents.size() + " agents ("+(t1-t0)+" ms)");

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
