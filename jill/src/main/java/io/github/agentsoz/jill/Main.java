package io.github.agentsoz.jill;

/*
 * #%L Jill Cognitive Agents Platform %% Copyright (C) 2014 - 2017 by its authors. See AUTHORS file.
 * %% This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public License along with this program.
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>. #L%
 */

import io.github.agentsoz.jill.config.Config;
import io.github.agentsoz.jill.core.GlobalState;
import io.github.agentsoz.jill.core.IntentionSelector;
import io.github.agentsoz.jill.core.ProgramLoader;
import io.github.agentsoz.jill.core.beliefbase.abs.ABeliefStore;
import io.github.agentsoz.jill.lang.Agent;
import io.github.agentsoz.jill.lang.JillExtension;
import io.github.agentsoz.jill.util.AObjectCatalog;
import io.github.agentsoz.jill.util.ArgumentsLoader;
import io.github.agentsoz.jill.util.Log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

  public static final String LOGGER_NAME = "io.github.agentsoz.jill";
  public static Logger logger;

  /**
   * Used to mark if all the pools of agents are idle or not.
   */
  private static int npools;
  private static int poolsize;
  private static IntentionSelector[] intentionSelectors;
  public static AtomicInteger poolsIdle = new AtomicInteger();
  private static PrintStream writer;

  private static final String agentsIn = " agents in ";
  
  /**
   * This class cannot be instantiated.
   */
  private Main() {
    
  }
  
  /**
   * Program entry
   * 
   * @param args command line arguments.
   */
  public static void main(String[] args) {
    try {
      // Parse the command line options
      ArgumentsLoader.parse(args);

      // Load the configuration
      Config config = ArgumentsLoader.getConfig();

      // Initialise the system with the given arguments
      init(config);

      // load all extensions
      loadExtensions(config);

      // Start the engine
      start(config);

      // Wait until the agents become idle
      waitUntilIdle();

      // finish up
      finish();
    } catch (Exception e) {
      Logger logger = LoggerFactory.getLogger(Main.LOGGER_NAME);
      logger.error("ERROR during Jill execution", e);
    }
  }

  /**
   * Initialises the Jill engine.
   * 
   * @param config a valid loaded configuration
   * @throws Exception thrown if something went wrong
   */
  public static void init(Config config) throws Exception {

    // Pause for key press from user if requested
    if (config.isDoPauseForUserInput()) {
      pauseForUserInput();
    }

    // Configure logging
    Log.createLogger(Main.LOGGER_NAME, config.getLogLevel(), config.getLogFile());
    logger = LoggerFactory.getLogger(Main.LOGGER_NAME);

    int numAgents = 0;
    for (Config.AgentTypeData agentType : config.getAgents()) {
      numAgents += agentType.getCount();
    }
    final int increment = 10000;

    GlobalState.reset();
    GlobalState.agents = new AObjectCatalog("agents", numAgents, increment);


    // Create the central belief base
    GlobalState.beliefbase = new ABeliefStore(numAgents, config.getNumThreads());
    long t0;
    long t1;

    // Create the agents
    t0 = System.currentTimeMillis();
    for (Config.AgentTypeData agentType : config.getAgents()) {
      ProgramLoader.loadAgent(agentType.getClassname(), agentType.getCount(), GlobalState.agents);
    }
    t1 = System.currentTimeMillis();
    logger.info(
        "Created " + GlobalState.agents.size() + agentsIn + Log.formattedDuration(t0, t1));

    // Initialise the thread pools
    initIntentionSelectionPools(numAgents, config.getNumThreads());


    // Redirect the agent program output if specified
    if (config.getProgramOutputFile() != null) {
      try {
        writer = new PrintStream(config.getProgramOutputFile(), "UTF-8");
      } catch (Exception e) {
        Logger logger = LoggerFactory.getLogger(Main.LOGGER_NAME);
        logger.error("Could not open program outout file " + config.getProgramOutputFile(), e);
      }
    } else {
      writer = System.out;
    }

    // Initialise the intention selection threads
    initIntentionSelectionThreads(config);

  }

  /**
   * Starts the Jill engine. Must have previously been initialised (see {@link #init(Config)}).
   * 
   * @param config a valid config
   */
  public static void start(Config config) {
    // Start the agents
    long t0 = System.currentTimeMillis();
    int index = -1;
    for (Config.AgentTypeData agentType : config.getAgents()) {
      index++;
      String[] args = (agentType.getArgs() == null || agentType.getArgs().isEmpty()) ? new String[0]
          : agentType.getArgs().toArray(new String[agentType.getArgs().size()]);
      for (int j = index; j < index + agentType.getCount(); j++) {
        // Get the agent
        Agent agent = (Agent) GlobalState.agents.get(j);
        // Start the agent
        agent.start(writer, args);
      }
    }
    long t1 = System.currentTimeMillis();
    logger.info(
        "Started " + GlobalState.agents.size() + agentsIn + Log.formattedDuration(t0, t1));

    // Start the intention selection threads
    startIntentionSelectionThreads();

  }

  /**
   * Blocks until all agents have finished executing plans and have gone idle.
   */
  public static void waitUntilIdle() {
    // Wait till we are all done
    long t0 = System.currentTimeMillis();

    synchronized (poolsIdle) {
      while (!arePoolsIdle()) {
        try {
          poolsIdle.wait();
        } catch (InterruptedException e) {
          logger.error("Failed to wait on termination condition: " + e.getMessage());
        }
      }
    }

    long t1 = System.currentTimeMillis();
    logger.info("Finished running " + GlobalState.agents.size() + agentsIn
        + Log.formattedDuration(t0, t1));
  }

  /**
   * Termiantes the Jill engine.
   */
  public static void finish() {
    // Terminate the extensions first
    for (JillExtension extension : GlobalState.eventHandlers) {
      extension.finish();
    }

    // Now shut down the threads
    shutdownIntentionSelectionThreads();

    // Finish the agents
    long t0 = System.currentTimeMillis();
    for (int i = 0; i < GlobalState.agents.size(); i++) {
      // Get the agent
      Agent agent = (Agent) GlobalState.agents.get(i);
      // Terminate the agent
      agent.finish();
    }
    // Close the writer
    if (writer != null) {
      writer.close();
    }
    long t1 = System.currentTimeMillis();
    logger.info(
        "Terminated " + GlobalState.agents.size() + agentsIn + Log.formattedDuration(t0, t1));
  }

  /**
   * Loads any configured extensions (see {@link JillExtension}).
   * 
   * @param config a valid configuration
   * @throws Exception thrown if something went wrong
   */
  private static void loadExtensions(Config config) throws Exception {
    if (config.getExtensions() == null) {
      return;
    }
    for (Config.ExtensionData extensionData : config.getExtensions()) {
      JillExtension extension = ProgramLoader.loadExtension(extensionData.getClassname());
      if (extension != null) {
        registerExtension(extension);
        extension.init(extensionData.getArgs().toArray(new String[0]));;
      }
    }
  }

  /**
   * Checks if the system is idle, i.e., all the agents pools are idle
   * 
   * @return true if idle, false otherwise
   */
  public static boolean arePoolsIdle() {
    boolean idle = true;
    for (int i = 0; i < npools; i++) {
      idle &= (intentionSelectors[i] == null) || intentionSelectors[i].isIdle();
    }
    return idle;
  }

  /**
   * Checks if the {@link IntentionSelector} pools have finished, i.e., all agents in the pools are
   * idle.
   * 
   * @return true if pools have finished, false otherwise
   */
  public static boolean arePoolsFinished() {
    boolean finished = true;
    for (int i = 0; i < intentionSelectors.length; i++) {
      finished &= (intentionSelectors[i] == null);
    }
    return finished;
  }

  /**
   * Notifies all threads waiting on {@link #poolsIdle}.
   */
  public static void flagPoolIdle() {
    synchronized (poolsIdle) {
      poolsIdle.notifyAll();
    }
  }

  /**
   * Initialises the intention selection pools.
   * 
   * @param nagents total number of agents to distribution between the intention selection pools
   * @param ncores total number of cores
   */
  public static void initIntentionSelectionPools(int nagents, int ncores) {
    poolsize = (nagents > ncores) ? (nagents / ncores) : 1;
    npools = (nagents > ncores) ? ncores : nagents;
  }


  /**
   * Starts the intention selection threads that each handle a pool of agents.
   * 
   * @param config the global configuration object
   */
  private static void initIntentionSelectionThreads(Config config) {
    int ncores = config.getNumThreads();
    intentionSelectors = new IntentionSelector[ncores];
    for (int i = 0; i < npools; i++) {
      intentionSelectors[i] = new IntentionSelector(i, config.getRandomSeed());
    }
  }

  /**
   * Starts the intention selection threads.
   */
  private static void startIntentionSelectionThreads() {
    for (int i = 0; i < npools; i++) {
      new Thread(intentionSelectors[i]).start(); // start and wait at the entry barrier
    }
  }

  /**
   * Stops the intention selection threads.
   */
  private static void shutdownIntentionSelectionThreads() {
    for (int i = 0; i < npools; i++) {
      intentionSelectors[i].shutdown();
    }
  }

  /**
   * Sets a bit in the agentsIdle cache, to mark if this agent is idle (or not).
   * 
   * @param agentId the agent is question
   * @param isIdle the new idle status of this agent
   */
  public static void setAgentIdle(int agentId, boolean isIdle) {
    int poolid = poolid(agentId);
    intentionSelectors[poolid].setAgentIdle(agentId, isIdle);
  }

  /**
   * Gets the ID of the intention selection pool to which the given agent belongs.
   * 
   * @param agentid ID of the agent for which the pool ID is being requested
   * @return ID of the pool to which this agent belongs
   */
  public static int poolid(int agentid) {
    int poolid = agentid / poolsize;
    if (poolid + 1 > npools) {
      poolid = npools - 1;
    }
    return poolid;
  }

  /**
   * Waits for user to press a key before continuing. Useful for connecting to a profiler
   */
  private static void pauseForUserInput() {
    System.out.println("Press the Enter/Return key to continue..");
    Scanner in = new Scanner(System.in);
    in.nextLine();
    in.close();
  }

  /**
   * Flags to the given intentions selection pool that an external message is waiting to be
   * processed.
   * 
   * @param toPool ID of the intention selection pool
   */
  public static void flagMessageTo(int toPool) {
    intentionSelectors[toPool].flagMessage();
  }

  /**
   * Registers a new Jill extension.
   * 
   * @param extension the extension to register
   */
  public static void registerExtension(JillExtension extension) {
    if (extension != null) {
      GlobalState.eventHandlers.add(extension);
      logger.info("Registered Jill extension: " + extension);
    } else {
      logger.warn("Cannot register null extension; will ignore.");
    }
  }
}
