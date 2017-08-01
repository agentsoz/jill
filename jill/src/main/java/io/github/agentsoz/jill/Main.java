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
   * Program entry
   * 
   * @param args command line arguments
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
    }
  }

  public static void init(Config config) throws Exception {

    // Pause for key press from user if requested
    if (config.isDoPauseForUserInput()) {
      pauseForUserInput();
    }

    // Configure logging
    Log.createLogger("", config.getLogLevel(), config.getLogFile());

    int NUMAGENTS = 0;
    for (Config.AgentTypeData agentType : config.getAgents()) {
      NUMAGENTS += agentType.getCount();
    }
    int INCREMENT = 10000;

    GlobalState.reset();
    GlobalState.agents = new AObjectCatalog("agents", NUMAGENTS, INCREMENT);


    // Create the central belief base
    GlobalState.beliefbase = new ABeliefStore(NUMAGENTS, config.getNumThreads());
    long t0, t1;

    // Create the agents
    t0 = System.currentTimeMillis();
    for (Config.AgentTypeData agentType : config.getAgents()) {
      ProgramLoader.loadAgent(agentType.getClassname(), agentType.getCount(), GlobalState.agents);
    }
    t1 = System.currentTimeMillis();
    Log.info("Created " + GlobalState.agents.size() + " agents in " + (t1 - t0) + " ms");

    // Initialise the thread pools
    initIntentionSelectionPools(NUMAGENTS, config.getNumThreads());


    // Redirect the agent program output if specified
    if (config.getProgramOutputFile() != null) {
      try {
        writer = new PrintStream(config.getProgramOutputFile(), "UTF-8");
      } catch (Exception e) {
        e.printStackTrace();
      }
    } else {
      writer = System.out;
    }

    // Initialise the intention selection threads
    initIntentionSelectionThreads(config);

  }

  public static void start(Config config) {
    // Start the agents
    long t0 = System.currentTimeMillis();
    int i = -1;
    for (Config.AgentTypeData agentType : config.getAgents()) {
      i++;
      String[] args = (agentType.getArgs() == null || agentType.getArgs().isEmpty()) ? new String[0]
          : agentType.getArgs().toArray(new String[agentType.getArgs().size()]);
      for (int j = i; j < i + agentType.getCount(); j++) {
        // Get the agent
        Agent agent = (Agent) GlobalState.agents.get(j);
        // Start the agent
        agent.start(writer, args);
      }
    }
    long t1 = System.currentTimeMillis();
    Log.info("Started " + GlobalState.agents.size() + " agents in " + (t1 - t0) + " ms");

    // Start the intention selection threads
    startIntentionSelectionThreads();

  }

  public static void waitUntilIdle() {
    // Wait till we are all done
    long t0 = System.currentTimeMillis();

    synchronized (poolsIdle) {
      while (!arePoolsIdle()) {
        try {
          poolsIdle.wait();
        } catch (InterruptedException e) {
          Log.error("Failed to wait on termination condition: " + e.getMessage());
        }
      }
    }

    long t1 = System.currentTimeMillis();
    Log.info("Finished running " + GlobalState.agents.size() + " agents in " + (t1 - t0) + " ms");
  }

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
    Log.info("Terminated " + GlobalState.agents.size() + " agents in " + (t1 - t0) + " ms");
  }

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

  public static boolean arePoolsFinished() {
    boolean finished = true;
    for (int i = 0; i < intentionSelectors.length; i++) {
      finished &= (intentionSelectors[i] == null);
    }
    return finished;
  }

  public static void flagPoolIdle() {
    synchronized (poolsIdle) {
      poolsIdle.notifyAll();
    }
  }

  public static void initIntentionSelectionPools(int nagents, int ncores) {
    poolsize = (nagents > ncores) ? (nagents / ncores) : 1;
    npools = (nagents > ncores) ? ncores : nagents;
  }


  /**
   * Starts the intention selection threads that each handle a pool of agents
   * 
   * @param config the global configuration object
   */
  public static void initIntentionSelectionThreads(Config config) {
    int ncores = config.getNumThreads();
    intentionSelectors = new IntentionSelector[ncores];
    for (int i = 0; i < npools; i++) {
      int start = i * poolsize;
      int size = (i + 1 < npools) ? poolsize : GlobalState.agents.size() - start;
      intentionSelectors[i] = new IntentionSelector(i, config.getRandomSeed(), start, size);
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
   * 
   * @param agentId the agent is question
   * @param isIdle the new idle status of this agent
   */
  public static void setAgentIdle(int agentId, boolean isIdle) {
    int poolid = poolid(agentId);
    intentionSelectors[poolid].setAgentIdle(agentId, isIdle);
  }

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

  public static void flagMessageTo(int toPool) {
    intentionSelectors[toPool].flagMessage();
  }

  public static void registerExtension(JillExtension extension) {
    if (extension != null) {
      GlobalState.eventHandlers.add(extension);
      Log.info("Registered Jill extension: " + extension);
    } else {
      Log.warn("Cannot register null extension; will ignore.");
    }
  }
}
