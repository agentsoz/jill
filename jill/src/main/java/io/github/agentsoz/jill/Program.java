package io.github.agentsoz.jill;

import io.github.agentsoz.jill.config.Config;
import io.github.agentsoz.jill.core.GlobalState;
import io.github.agentsoz.jill.core.IntentionSelector;
import io.github.agentsoz.jill.core.ProgramLoader;
import io.github.agentsoz.jill.lang.JillExtension;

import java.util.Scanner;


public final class Program {

  /**
   * This class cannot be instantiated.
   */
  private Program() {}

  /**
   * Waits for user to press a key before continuing. Useful for connecting to a profiler
   */
  static void pauseForUserInput() {
    System.out.println("Press the Enter/Return key to continue..");
    Scanner in = new Scanner(System.in);
    in.nextLine();
    in.close();
  }

  /**
   * Initialises the intention selection pools.
   * 
   * @param nagents total number of agents to distribution between the intention selection pools
   * @param ncores total number of cores
   */
  public static void initIntentionSelectionPools(int nagents, int ncores) {
    Main.poolsize = (nagents > ncores) ? (nagents / ncores) : 1;
    Main.npools = (nagents > ncores) ? ncores : nagents;
  }

  /**
   * Starts the intention selection threads that each handle a pool of agents.
   * 
   * @param config the global configuration object
   */
  static void initIntentionSelectionThreads(Config config) {
    int ncores = config.getNumThreads();
    Main.intentionSelectors = new IntentionSelector[ncores];
    for (int i = 0; i < Main.npools; i++) {
      Main.intentionSelectors[i] = new IntentionSelector(i, config.getRandomSeed());
    }
  }

  /**
   * Starts the intention selection threads.
   */
  static void startIntentionSelectionThreads() {
    for (int i = 0; i < Main.npools; i++) {
      new Thread(Main.intentionSelectors[i]).start(); // start and wait at the entry barrier
    }
  }

  /**
   * Stops the intention selection threads.
   */
  static void shutdownIntentionSelectionThreads() {
    for (int i = 0; i < Main.npools; i++) {
      Main.intentionSelectors[i].shutdown();
    }
  }

  /**
   * Loads any configured extensions (see {@link JillExtension}).
   * 
   * @param config a valid configuration
   * @return true if successfully loaded, false otherwise
   */
  static boolean loadExtensions(Config config) {
    if (config.getExtensions() == null) {
      return true;
    }
    for (Config.ExtensionData extensionData : config.getExtensions()) {
      JillExtension extension = ProgramLoader.loadExtension(extensionData.getClassname());
      if (extension != null) {
        Program.registerExtension(extension);
        extension.init(extensionData.getArgs().toArray(new String[0]));
      } else {
        return false;
      }
    }
    return true;
  }

  /**
   * Registers a new Jill extension.
   * 
   * @param extension the extension to register
   */
  public static void registerExtension(JillExtension extension) {
    if (extension != null) {
      GlobalState.eventHandlers.add(extension);
      Main.logger.info("Registered Jill extension: " + extension);
    } else {
      Main.logger.warn("Cannot register null extension; will ignore.");
    }
  }



}
