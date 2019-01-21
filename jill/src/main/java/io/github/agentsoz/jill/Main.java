package io.github.agentsoz.jill;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2019 by its authors. See AUTHORS file.
 * %%
 * This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public License along with this program.
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
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

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>Main class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
public final class Main {

  /** Constant <code>LOGGER_NAME="io.github.agentsoz.jill"</code>. */
  public static final String LOGGER_NAME = "io.github.agentsoz.jill";
  /** Constant <code>logger</code>. */
  public static Logger logger;

  /**
   * Used to mark if all the pools of agents are idle or not.
   */
  static int npools;
  static int poolsize;
  static IntentionSelector[] intentionSelectors;
  /** Constant <code>poolsIdle</code>. */
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
    // Parse the command line options
    ArgumentsLoader.parse(args);

    // Load the configuration
    Config config = ArgumentsLoader.getConfig();

    // Initialise the system with the given arguments
    if (!init(config)) {
      return;
    }

    // load all extensions
    if (!Program.loadExtensions(config)) {
      return;
    }

    // Start the engine
    start(config);

    // Wait until the agents become idle
    waitUntilIdle();

    // finish up
    finish();
  }

  /**
   * Initialises the Jill engine.
   *
   * @param config a valid loaded configuration
   * @return a boolean.
   */
  public static boolean init(Config config) {

    // Pause for key press from user if requested
    if (config.isDoPauseForUserInput()) {
      Program.pauseForUserInput();
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

    // Create the agents
    t0 = System.currentTimeMillis();
    for (Config.AgentTypeData agentType : config.getAgents()) {
      if (!ProgramLoader.loadAgent(agentType.getClassname(), agentType.getCount(),
          GlobalState.agents)) {
        // return unsuccessful
        return false;
      }
    }
    long t1 = System.currentTimeMillis();
    logger.info("Created " + GlobalState.agents.size() + agentsIn + Log.formattedDuration(t0, t1));

    // Initialise the thread pools
    Program.initIntentionSelectionPools(numAgents, config.getNumThreads());


    // Redirect the agent program output if specified
    if (config.getProgramOutputFile() != null) {
      try {
        writer = new PrintStream(config.getProgramOutputFile(), "UTF-8");
      } catch (FileNotFoundException | UnsupportedEncodingException e) {
        logger.error("Could not open program outout file " + config.getProgramOutputFile(), e);
      }
    } else {
      writer = System.out;
    }

    // Initialise the intention selection threads
    Program.initIntentionSelectionThreads(config);

    // return success
    return true;
  }

  /**
   * Starts the Jill engine. Must have previously been initialised (see {@link #init(Config)}).
   *
   * @param config a valid config
   */
  public static void start(Config config) {
    // Start the agents
    long t0 = System.currentTimeMillis();
    int index = 0;
    int subIndex = 0;
    for (Config.AgentTypeData agentType : config.getAgents()) {
      index = subIndex;
      String[] args = (agentType.getArgs() == null || agentType.getArgs().isEmpty()) ? new String[0]
          : agentType.getArgs().toArray(new String[agentType.getArgs().size()]);
      for (subIndex = index; subIndex < index + agentType.getCount(); subIndex++) {
        // Get the agent
        Agent agent = (Agent) GlobalState.agents.get(subIndex);
        // Start the agent
        agent.start(writer, args);
      }
    }
    long t1 = System.currentTimeMillis();
    logger.info("Started " + GlobalState.agents.size() + agentsIn + Log.formattedDuration(t0, t1));

    // Start the intention selection threads
    Program.startIntentionSelectionThreads();

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
    logger.info(
        "Finished running " + GlobalState.agents.size() + agentsIn + Log.formattedDuration(t0, t1));
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
    Program.shutdownIntentionSelectionThreads();

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
    logger
        .info("Terminated " + GlobalState.agents.size() + agentsIn + Log.formattedDuration(t0, t1));
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
   * Checks if the {@link io.github.agentsoz.jill.core.IntentionSelector} pools have finished,
   * i.e., all agents in the pools are idle.
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
   * Flags to the given intentions selection pool that an external message is waiting to be
   * processed.
   *
   * @param toPool ID of the intention selection pool
   */
  public static void flagMessageTo(int toPool) {
    intentionSelectors[toPool].flagMessage();
  }
}
