package io.github.agentsoz.jill;

/*-
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2025 by its authors. See AUTHORS file.
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */

import io.github.agentsoz.jill.config.Config;
import io.github.agentsoz.jill.core.GlobalState;
import io.github.agentsoz.jill.core.IntentionSelector;
import io.github.agentsoz.jill.core.ProgramLoader;
import io.github.agentsoz.jill.lang.JillExtension;
import java.util.Scanner;


/**
 * <p>Program class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 * @since 0.3.4
 */
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
    Scanner in = new Scanner(System.in); //NOPMD - ensure resources are closed after use
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
      Thread thread = new Thread(Main.intentionSelectors[i]);
      thread.setName("jill-" + i);
      thread.start(); // start and wait at the entry barrier
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
