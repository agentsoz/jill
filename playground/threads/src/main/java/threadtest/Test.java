package threadtest;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {

	// Defaults
	static int numThreads = 1000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// parse the command line arguments
		parse(args);
		
		// create the threadpol
		int size = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(size);
        System.out.println("Created thread pool of size "+size);

        // time the executions
        long t0 = System.currentTimeMillis();
		for (int i = 0; i < numThreads; i++) {
			executor.submit(new ThreadWorker());
		}
		executor.shutdown();
		try {
			executor.awaitTermination(30, TimeUnit.SECONDS);
		} catch (InterruptedException e) {}

        long t1 = System.currentTimeMillis();
		System.out.println("Finished executing "+numThreads+" threads ("+(t1-t0)+" ms)");
	}

	/**
	 * Parses the command line arguments in args
	 * @param args
	 */
    private static void parse(String[] args) {
    	for (int i = 0; i < args.length; i++) {
    		switch (args[i]) {
    		case "-h":
    			abort(null);
    			break;
    		case "-n":
    			if (i + 1 < args.length) {
    				i++;
                    try {
                        numThreads = Integer.parseInt(args[i]);
                    } catch (Exception e) {
                        abort("Option value '" + args[i] + "' is not a number");
                    }
    			}
    			break;
    		}
        }
    }


    /**
     * Returns a usage string for this program
     * @return
     */
    public static String usage() {
        return "usage: "
                        + Test.class.getName() + "\n"
                        + "  -h          show this help message and exit\n"
                        + "  -n threads  number of threads to create (default is "+numThreads+")\n"
                        ;
    }
    
    /**
     * Terminates the program with an error message (if not null),
     * and the program usage string
     * @param err
     */
    private static void abort(String err) {
    	if (err != null) {
    		System.err.println("\nERROR: " + err + "\n");
    	}
        System.out.println(usage());
        System.exit(0);
    }
 

}
