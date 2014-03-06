package mobee.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Level;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class CommandLineParser {

	public static CommandLine commandLine;
	public static final String[] OPT_HELP = {"h", "help", "print this message"};
	public static final String[] OPT_VERSION = {"v", "version", "print the version information and exit"};
	public static final String[] OPT_LOGFILE ={"l", "logfile", "file to save run log to"};
	public static final String[] OPT_LOGLEVEL ={"d", "debuglevel", "logging level (e.g., 'SEVERE', 'INFO', or 'FINE')"};

	public static final String[] OPT_NUMAGENTS ={"n", "num", "number of agents to create"};
	public static final String[] OPT_AGENTCLASS ={"c", "agentclass", "agent class to load"};
	

	/*
	 * The default parameter values
	 */
	public static final String DEFAULT_LOGFILE = "Run.log";
	public static final Level DEFAULT_LOGLEVEL = Level.WARNING;


    private static Options getHelpOptions() {
    	Options options = new Options();

    	// help message
    	OptionBuilder.withLongOpt(OPT_HELP[1]);
		OptionBuilder.withDescription(OPT_HELP[2]);
		options.addOption(OptionBuilder.create(OPT_HELP[0]));

		// version
    	OptionBuilder.withLongOpt(OPT_VERSION[1]);
		OptionBuilder.withDescription(OPT_VERSION[2]);
		options.addOption(OptionBuilder.create(OPT_VERSION[0]));
		
		return options;
    }
    
    private static Options getOptions() {
    	Options options = new Options();
    	//Option o;

		// log file
		OptionBuilder.withArgName("file");
		OptionBuilder.hasArg();
    	OptionBuilder.withLongOpt(OPT_LOGFILE[1]);
		OptionBuilder.withDescription(OPT_LOGFILE[2]);
		options.addOption(OptionBuilder.create(OPT_LOGFILE[0]));

		// log level
		OptionBuilder.withArgName("level");
		OptionBuilder.hasArg();
    	OptionBuilder.withLongOpt(OPT_LOGLEVEL[1]);
		OptionBuilder.withDescription(OPT_LOGLEVEL[2]);
		options.addOption(OptionBuilder.create(OPT_LOGLEVEL[0]));
		
		// num agents
		OptionBuilder.withArgName("numagents");
		OptionBuilder.hasArg();
		OptionBuilder.isRequired();
    	OptionBuilder.withLongOpt(OPT_NUMAGENTS[1]);
		OptionBuilder.withDescription(OPT_NUMAGENTS[2]);
		options.addOption(OptionBuilder.create(OPT_NUMAGENTS[0]));
		
		// agent class
		OptionBuilder.withArgName("agentclass");
		OptionBuilder.hasArg();
		OptionBuilder.isRequired();
    	OptionBuilder.withLongOpt(OPT_AGENTCLASS[1]);
		OptionBuilder.withDescription(OPT_AGENTCLASS[2]);
		options.addOption(OptionBuilder.create(OPT_AGENTCLASS[0]));
		
		
		return options;
    }
    
    public static String getLogfile() {
    	String file = DEFAULT_LOGFILE;
		if(commandLine.hasOption(OPT_LOGFILE[0])) {
			file = commandLine.getOptionValue(OPT_LOGFILE[0]);
		}
    	return file;
    }
    
    public static int getNumAgents() {
    	try {
    		return Integer.parseInt(commandLine.getOptionValue(OPT_NUMAGENTS[0]));
		} catch (Exception e) {
			System.err.println("ERROR: cannot parse number of agents");
		}
    	return 0;
    }

    public static String getAgentClass() {
    	return commandLine.getOptionValue(OPT_AGENTCLASS[0]);
    }

    public static Level getLogLevel() {
    	Level level = DEFAULT_LOGLEVEL;
		if(commandLine.hasOption(CommandLineParser.OPT_LOGLEVEL[0])) {
			String s = commandLine.getOptionValue(CommandLineParser.OPT_LOGLEVEL[0]);
			try {
				level = Level.parse(s);
			} catch (Exception e) {
				System.err.println("WARNING: unknown logging level '"+s+"' specified, will use "+level+" instead");
			}
		}
		return level;
   	
    }
    
    public static boolean hasHelp() {
		return commandLine.hasOption(OPT_HELP[0]);
    }

    public static boolean hasVersion() {
		return commandLine.hasOption(OPT_VERSION[0]);
    }

    public static String getUsage(String app, int width) {
        StringWriter sw = new StringWriter();
        HelpFormatter formatter = new HelpFormatter();
        formatter.setSyntaxPrefix("");
        formatter.printUsage(new PrintWriter(sw), width, app, getOptions());
        return sw.toString();
    }

    public static void printHelp(String app, int width) {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp(width, getUsage(app, width), "", getOptions(), "");
    }

    public static boolean parseHelpArgs(String[] args) {
    	boolean hasHelpArgs = false;
    	try {
    		commandLine = new GnuParser().parse(getHelpOptions(), args, true);
    		if (hasHelp() || hasVersion()) {
    			hasHelpArgs = true;
    		}
    	} catch (ParseException e) {
			System.out.println(e.getMessage());
			hasHelpArgs = true;
    	}
    	return hasHelpArgs;
	}

    public static boolean parseArgs(String[] args) {
    	boolean hasArgs = false;
    	try {
    		commandLine = new GnuParser().parse(getOptions(), args);
    		hasArgs = true;
    	} catch (ParseException e) {
			System.out.println(e.getMessage());
    	}
    	return hasArgs;
	}

    
}
