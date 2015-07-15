package agentsoz.jill.util;

/*
 * #%L
 * Jill Cognitive Agents Platform
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

import ch.qos.logback.classic.Level;
import agentsoz.jill.Main;
import agentsoz.jill.config.GlobalConstant;

public class ArgumentsLoader {

	private static String logFile = "Run.log";
	private static Level logLevel = Level.WARN;
	private static String agentClass = null;
	private static int numAgents = 0;
	private static int numThreads = Runtime.getRuntime().availableProcessors();
	private static String pargs = "";
	private static long randomSeed = -1;
	private static String pout = null;
	private static boolean doPauseForUserInput = false;
	
	public static String usage() {
		return GlobalConstant.APP_HEADER + "\n\n" +
			"usage: " + Main.class.getName() + 
			"  [options] --agent-class <agentclass> --num-agents <numagents>" + "\n" +
			"   --agent-class <agentclass>        agent class to load" + "\n" +
			"   --debug-level <debuglevel>        debug level (ERROR, WARN, INFO, DEBUG, or TRACE)" + "\n" +
			"   --exit-on-idle <boolean>          forces system exit when all agents are idle (default is '"+GlobalConstant.EXIT_ON_IDLE+"')\n" +
			"   --help                            print this usage message and exit \n" +
			"   --logfile <logfile>               file for logging output" + "\n" +
			"   --num-agents  <numagent>          number of agents to create (of type <agentclass>)" + "\n" +
			"   --outfile <outfile>               file for program output" + "\n" +
			"   --program-args <pargs>            arguments string to pass to agent class (optional)" + "\n" +
			"   --plan-selection-policy <policy>  policy for selecting from plan instances (FIRST, RANDOM, or LAST (default is '"+GlobalConstant.PLAN_SELECTION_POLICY+"')\n" +
			"   --plan-instances-limit <number>   maximum number of applicable plan instances to consider (default is '"+GlobalConstant.PLAN_INSTANCES_LIMIT+"')\n" +
			"   --seed <randseed>                 seed to use for random number generator (optional)" + "\n" +
			"   --threads <numthreads>            number of threads used by execution engine (defaults to number of available cores)" + "\n" +
			"   --wait-on-startup                 wait for Enter/Return key press (default is "+doPauseForUserInput+")" + "\n"
			;
	}
	
	public static void parse(String[] args) {
		for (int i = 0; i < args.length; i++) {
			switch(args[i]) {
			case "--agent-class":
				if (i+1 < args.length) {
					i++;
					agentClass = args[i];
				}
				break;
			case "--debug-level":
				if (i+1 < args.length) {
					i++;
					try {
						logLevel = Level.toLevel(args[i]);
					} catch(Exception e) {
						abort("Unknown log level '"+args[i]+"'");
					}
				}
				break;
			case "--exit-on-idle":
				if (i+1 < args.length) {
					i++;
					try {
						GlobalConstant.EXIT_ON_IDLE = Boolean.parseBoolean(args[i]);
					} catch (Exception e) {
						abort("Option value '"+args[i]+"' is not a boolean");
					}
				}
				
			case "--help":
				abort(null);
				break;
			case "--logfile":
				if (i+1 < args.length) {
					i++;
					logFile = args[i];
				}
				break;
			case "--num-agents":
				if (i+1 < args.length) {
					i++;
					try {
						numAgents = Integer.parseInt(args[i]);
					} catch (Exception e) {
						abort("Option value '"+args[i]+"' is not a number");
					}
				}
				break;
			case "--outfile":
				if (i+1 < args.length) {
					i++;
					pout = args[i];
				}
				break;
			case "--program-args":
				if (i+1 < args.length) {
					i++;
					pargs = args[i];
				}
				break;
			case "--plan-selection-policy":
				if (i+1 < args.length) {
					i++;
					try {
						GlobalConstant.PLAN_SELECTION_POLICY = GlobalConstant.PlanSelectionPolicy.valueOf(args[i]);
					} catch (Exception e) {
						abort("Unknown plan selection policy '"+args[i]+"'");
					}
				}
				break;
			case "--plan-instances-limit":
				if (i+1 < args.length) {
					i++;
					try {
						GlobalConstant.PLAN_INSTANCES_LIMIT = Integer.parseInt(args[i]);
					} catch (Exception e) {
						abort("Option value '"+args[i]+"' is not a number");
					}
				}
				break;
			case "--seed":
				if (i+1 < args.length) {
					i++;
					try {
						randomSeed = Long.parseLong(args[i]);
					} catch (Exception e) {
						abort("Option value '"+args[i]+"' is not a number");
					}
				}
				break;
			case "--threads":
				if (i+1 < args.length) {
					i++;
					try {
						numThreads = Integer.parseInt(args[i]);
					} catch (Exception e) {
						abort("Option value '"+args[i]+"' is not a number");
					}
				}
				break;
			case "--wait-on-startup":
				doPauseForUserInput = true;
				break;
			}	
		}
		// Abort if required args were not given
		if (args.length == 0) {
			abort(null);
		} else if (agentClass == null) {
			abort("Some required options were not given");
		}
	}

	public static int getNumThreads() {
		return numThreads;
	}

	public static String getLogFile() {
		return logFile;
	}

	public static Level getLogLevel() {
		return logLevel;
	}

	public static String getAgentClass() {
		return agentClass;
	}

	public static int getNumAgents() {
		return numAgents;
	}
	
	private static void abort(String err) {
		if (err != null) {
			System.err.println("\nERROR: " + err + "\n");
		}
		System.out.println(usage());
		System.exit(0);
	}

	public static String[] getProgramArguments() {
		return pargs.split(" ") ;
	}

	public static String getProgramOutputFile() {
		return pout ;
	}

	public static long getRandomSeed() {
		return randomSeed;
	}

	public static boolean doPauseForUserInput() {
		return doPauseForUserInput;
	}
}
