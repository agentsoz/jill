package io.github.agentsoz.jill.util;

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

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import io.github.agentsoz.jill.Main;
import io.github.agentsoz.jill.config.Config;
import io.github.agentsoz.jill.config.GlobalConstant;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * <p>ArgumentsLoader class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
public final class ArgumentsLoader {

  private static Config config;

  /**
   * This class cannot be instantiated.
   */
  private ArgumentsLoader() {

  }

  /**
   * Returns a usage string for the Jill command line arguments.
   *
   * @return the usage string
   */
  public static String usage() {
    return GlobalConstant.APP_HEADER + "\n\n" + "usage: " + Main.class.getName()
        + "  [options] --agent-class <agentclass> --num-agents <numagents>" + "\n"
        + "   --config <string>                 load configuration from string" + "\n"
        + "   --configfile <file>               load configuration from file" + "\n"
        + "   --exit-on-idle <boolean>          forces system exit when all agents are "
        + "idle (default is '" + GlobalConstant.EXIT_ON_IDLE + "')\n"
        + "   --help                            print this usage message and exit \n"
        + "   --plan-selection-policy <policy>  policy for selecting from plan instances "
        + "(FIRST, RANDOM, or LAST (default is '" + GlobalConstant.PLAN_SELECTION_POLICY + "')\n"
        + "   --plan-instances-limit <number>   maximum number of applicable plan instances "
        + "to consider (default is '" + GlobalConstant.PLAN_INSTANCES_LIMIT + "')\n";
  }

  /**
   * Parses the given command line arguments.
   *
   * @param args the command line arguments
   */
  public static void parse(String[] args) {
    for (int i = 0; args != null && i < args.length; i++) {
      // First parse args that don't require an option
      if ("--help".equals(args[i])) {
        abort(null);
      }
      // Now parse args that must be accompanied by an option
      if (i + 1 < args.length) {
        parseArgumentWithOption(args[i], args[++i]); // force increment the counter
      }
    }
    // Abort if required args were not given
    if (config == null) {
      abort("Configuration file or string was not given");
    } else if (config.getAgents() == null || config.getAgents().isEmpty()) {
      abort("Configuration is missing agents specification");
    }
  }

  /**
   * Parses the given command line argument and associated option. Will abort if an unrecoverable
   * error occurs.
   * 
   * @param arg the argument to parse
   * @param opt the options to parse for that argument
   */
  private static void parseArgumentWithOption(String arg, String opt) {
    switch (arg) {
      case "--config":
        config = loadConfigFromString(opt);
        break;
      case "--configfile":
        config = loadConfigFromFile(opt);
        break;
      case "--exit-on-idle":
        GlobalConstant.EXIT_ON_IDLE = Boolean.parseBoolean(opt);
        break;
      case "--plan-selection-policy":
        try {
          GlobalConstant.PLAN_SELECTION_POLICY = GlobalConstant.PlanSelectionPolicy.valueOf(opt);
        } catch (IllegalArgumentException e) {
          abort("Unknown plan selection policy '" + opt + "'");
        }
        break;
      case "--plan-instances-limit":
        try {
          GlobalConstant.PLAN_INSTANCES_LIMIT = Integer.parseInt(opt);
        } catch (NumberFormatException e) {
          abort("Option value '" + opt + "' is not a number");
        }
        break;
      default:
        // Ignore any other arguments (which may be used by components external to Jill)
        break;
    }
  }

  private static void abort(String err) {
    int withCode = 0;
    if (err != null) {
      withCode = 1;
      System.err.println("\nERROR: " + err + "\n");
    }
    System.out.println(usage());
    System.exit(withCode);
  }

  /**
   * <p>getExtensions.</p>
   *
   * @return an array of {@link java.lang.String} objects.
   */
  public static String[] getExtensions() {
    return new String[0];
  }

  /**
   * <p>Getter for the field <code>config</code>.</p>
   *
   * @return a {@link io.github.agentsoz.jill.config.Config} object.
   */
  public static Config getConfig() {
    return config;
  }

  /**
   * Loads the Jill startup configuration object. <p> Configuration is specified at run time via one
   * of the following two options: <ul> <li>{@code --config <string>}</li> <li>
   * {@code --configfile <file>}</li> </ul> The contents of {@code <string>} or {@code <file>} are
   * parsed in exactly the same way. The expected syntax is JSON format. If both options are
   * specified, then last specified option will overrule. </p>
   * 
   * @return the Jill startup configuration object
   */
  static Config loadConfigFromString(String str) {
    Gson gson = new Gson();
    Config config = null;
    try {
      config = gson.fromJson(str, Config.class);
    } catch (JsonSyntaxException e) {
      abort("Invalid JSON syntax in " + str + ": " + e.getMessage());
    }
    return config;
  }

  static Config loadConfigFromFile(String str) {
    Gson gson = new Gson();
    Config config = null;
    try {
      config = gson.fromJson(new BufferedReader(new FileReader(str)), Config.class);
    } catch (JsonSyntaxException e) {
      abort("Invalid JSON syntax in " + str + ": " + e.getMessage());
    } catch (JsonIOException e) {
      abort("Could not read config from " + str + ": " + e.getMessage());
    } catch (FileNotFoundException e) {
      abort("Config file " + str + " not found: " + e.getMessage());
    }
    return config;
  }

  /**
   * <p>reset.</p>
   */
  public static void reset() {
    config = null;
  }
}
