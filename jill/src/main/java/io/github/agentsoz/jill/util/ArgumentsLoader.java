package io.github.agentsoz.jill.util;

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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import io.github.agentsoz.jill.Main;
import io.github.agentsoz.jill.config.Config;
import io.github.agentsoz.jill.config.GlobalConstant;

public class ArgumentsLoader {

  private static Config config = null;

  public static String usage() {
    return GlobalConstant.APP_HEADER + "\n\n" + "usage: " + Main.class.getName()
        + "  [options] --agent-class <agentclass> --num-agents <numagents>" + "\n"
        + "   --config <string>                 load configuration from string" + "\n"
        + "   --configfile <file>               load configuration from file" + "\n"
        + "   --exit-on-idle <boolean>          forces system exit when all agents are idle (default is '"
        + GlobalConstant.EXIT_ON_IDLE + "')\n"
        + "   --help                            print this usage message and exit \n"
        + "   --plan-selection-policy <policy>  policy for selecting from plan instances (FIRST, RANDOM, or LAST (default is '"
        + GlobalConstant.PLAN_SELECTION_POLICY + "')\n"
        + "   --plan-instances-limit <number>   maximum number of applicable plan instances to consider (default is '"
        + GlobalConstant.PLAN_INSTANCES_LIMIT + "')\n";
  }

  public static void parse(String[] args) {
    for (int i = 0; i < args.length; i++) {
      switch (args[i]) {
        case "--config":
          if (i + 1 < args.length) {
            i++;
            config = loadConfigFromString(args[i]);
          }
          break;
        case "--configfile":
          if (i + 1 < args.length) {
            i++;
            config = loadConfigFromFile(args[i]);
          }
          break;
        case "--exit-on-idle":
          if (i + 1 < args.length) {
            i++;
            try {
              GlobalConstant.EXIT_ON_IDLE = Boolean.parseBoolean(args[i]);
            } catch (Exception e) {
              abort("Option value '" + args[i] + "' is not a boolean");
            }
          }
          break;
        case "--help":
          abort(null);
          break;
        case "--plan-selection-policy":
          if (i + 1 < args.length) {
            i++;
            try {
              GlobalConstant.PLAN_SELECTION_POLICY =
                  GlobalConstant.PlanSelectionPolicy.valueOf(args[i]);
            } catch (Exception e) {
              abort("Unknown plan selection policy '" + args[i] + "'");
            }
          }
          break;
        case "--plan-instances-limit":
          if (i + 1 < args.length) {
            i++;
            try {
              GlobalConstant.PLAN_INSTANCES_LIMIT = Integer.parseInt(args[i]);
            } catch (Exception e) {
              abort("Option value '" + args[i] + "' is not a number");
            }
          }
          break;
      }
    }
    // Abort if required args were not given
    if (config == null) {
      abort("Configuration file or string was not given");
    } else if (config.getAgents() == null || config.getAgents().isEmpty()) {
      abort("Configuration is missing agents specification");
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

  public static String[] getExtensions() {
    return new String[0];
  }

  public static Config getConfig() {
    return config;
  }

  /**
   * Loads the Jill startup configuration object.
   * <p>
   * Configuration is specified at run time via one of the following two options:
   * <ul>
   * <li>{@code --config <string>}</li>
   * <li>{@code --configfile <file>}</li>
   * </ul>
   * The contents of {@code <string>} or {@code <file>} are parsed in exactly the same way. The
   * expected syntax is JSON format. If both options are specified, then last specified option will
   * overrule.
   * </p>
   * 
   * @return the Jill startup configuration object
   */
  static Config loadConfigFromString(String str) {
    Gson g = new Gson();
    Config c = null;
    try {
      c = g.fromJson(str, Config.class);
    } catch (JsonSyntaxException e) {
      abort("Invalid JSON syntax in " + str + ": " + e.getMessage());
    } catch (JsonIOException e) {
      abort("Could not read config from " + str + ": " + e.getMessage());
    } catch (Exception e) {
      abort("Could not load config file " + str + ": " + e.getMessage());
    }
    return c;
  }

  static Config loadConfigFromFile(String str) {
    Gson g = new Gson();
    Config c = null;
    try {
      c = g.fromJson(new BufferedReader(new FileReader(str)), Config.class);
    } catch (JsonSyntaxException e) {
      abort("Invalid JSON syntax in " + str + ": " + e.getMessage());
    } catch (JsonIOException e) {
      abort("Could not read config from " + str + ": " + e.getMessage());
    } catch (FileNotFoundException e) {
      abort("Config file " + str + " not found: " + e.getMessage());
    } catch (Exception e) {
      abort("Could not load config file " + str + ": " + e.getMessage());
    }
    return c;
  }

  public static void reset() {
    config = null;
  }
}
