package mobee.util;

import java.util.logging.Level;

import mobee.Main;

public class ArgumentsLoader {

	private static String logFile = "Run.log";
	private static Level logLevel = Level.WARNING;
	private static String agentClass = null;
	private static int numAgents = 0;
	private static int numCycles = -1;
	private static int numThreads = Runtime.getRuntime().availableProcessors();
	
	public static String usage() {
		return 
			"usage:" + Main.class.getName() + 
			" [-l <logfile>] [-d <debuglevel>] -c <agentclass> -n <numagents>" + "\n" +
			" -c <agentclass>   agent class to load" +
			" -d <debuglevel>   debug level (e.g., 'SEVERE', 'INFO', or 'FINE')" +
			" -i <cycles>       number of cycles to perform before existing (runs forever if unspecified)" +
			" -l <logfile>      file for logging output" +
			" -n <numagent>     number of agents to create (of type <agentclass>" +
			" -t <numthreads>   number of threads used by execution engine (defaults to number of available cores)"
			;
	}
	
	public static void parse(String[] args) {
		for (int i = 0; i < args.length; i++) {
			switch(args[i]) {
			case "-c":
				if (i+1 < args.length) {
					i++;
					agentClass = args[i];
				}
				break;
			case "-d":
				if (i+1 < args.length) {
					i++;
					try {
						logLevel = Level.parse(args[i]);
					} catch(Exception e) {
						abort("Unknown log level '"+args[i]+"'");
					}
				}
				break;
			case "-l":
				if (i+1 < args.length) {
					i++;
					logFile = args[i];
				}
				break;
			case "-n":
				if (i+1 < args.length) {
					i++;
					try {
						numAgents = Integer.parseInt(args[i]);
					} catch (Exception e) {
						abort("Option value '"+args[i]+"' is not a number");
					}
				}
				break;
			case "-i":
				if (i+1 < args.length) {
					i++;
					try {
						numCycles = Integer.parseInt(args[i]);
					} catch (Exception e) {
						abort("Option value '"+args[i]+"' is not a number");
					}
				}
				break;
			case "-t":
				if (i+1 < args.length) {
					i++;
					try {
						numThreads = Integer.parseInt(args[i]);
					} catch (Exception e) {
						abort("Option value '"+args[i]+"' is not a number");
					}
				}
				break;
			}	
		}
		// Abort if required args were not given
		if (agentClass == null) {
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
	
	public static int getNumCycles() {
		return numCycles;
	}

	private static void abort(String err) {
		System.err.println(err);
		usage();
		System.exit(0);
	}
}
