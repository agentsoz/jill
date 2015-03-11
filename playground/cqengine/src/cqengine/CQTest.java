package cqengine;
import java.util.Random;

import com.googlecode.cqengine.CQEngine;
import com.googlecode.cqengine.IndexedCollection;
import com.googlecode.cqengine.index.navigable.NavigableIndex;
import com.googlecode.cqengine.index.radix.RadixTreeIndex;
import com.googlecode.cqengine.index.suffix.SuffixTreeIndex;
import com.googlecode.cqengine.query.Query;
import com.googlecode.cqengine.query.option.DeduplicationStrategy;
import com.googlecode.cqengine.query.option.QueryOption;
import com.googlecode.cqengine.resultset.ResultSet;

import static com.googlecode.cqengine.query.QueryFactory.*;

public class CQTest {

	// Defaults
	static int numAgents = 10000;
	static int numResultsToshow = 10;

	private static final String[] NAMES = {
		"Alice", "Amber", "Anita",
		"Fabio", "Felix", "Fiona", 
		"James", "John", "Julia",
		"Laura", "Lin", "Lionel",
		"Nancy", "Nick",
		"Pam", "Paul", "Paula", "Peter",
		"Rod", "Rima", "Roger",
	};
	
	/**
	 * The playground tests are in here
	 * @param args
	 */
	public static void main(String[] args) {
		
		// parse the command line arguments
		parse(args);

		// create the indexed collection of residents
        IndexedCollection<Resident> residents = CQEngine.newInstance();

        // Add some indexes...
        residents.addIndex(NavigableIndex.onAttribute(Resident.AGE));
        residents.addIndex(SuffixTreeIndex.onAttribute(Resident.NAME));
        residents.addIndex(RadixTreeIndex.onAttribute(Resident.GENDER));
        residents.addIndex(RadixTreeIndex.onAttribute(Resident.MARITAL_STATUS));
		
        // Initialise the agent population
        Random rand = new Random();
        long t0, t1;
        t0 = System.currentTimeMillis();
        for (int i = 0; i < numAgents; i++) {
        	residents.add(new Resident(
        			rand.nextInt(100), 
        			NAMES[rand.nextInt(NAMES.length)], 
        			(rand.nextInt(2) < 1) ? "Male" : "Female",
        			(rand.nextInt(2) < 1) ? "Married" : "Single"));
        }
        
        t1 = System.currentTimeMillis();
		System.out.println("\n0: Average time to initialise "+numAgents+" agents was "+(t1-t0)+" ms");

		Query<Resident> q;
		QueryOption<Resident> qo;
		ResultSet<Resident> r;
		
		// Query
		System.out.print("\n1: Find all male or unmarried residents: ");
		q = or(equal(Resident.GENDER, "Male"), not(equal(Resident.MARITAL_STATUS, "Married")));
		qo = deduplicate(DeduplicationStrategy.LOGICAL_ELIMINATION);
        t0 = System.currentTimeMillis();
		r = residents.retrieve(q, queryOptions(qo));
        t1 = System.currentTimeMillis();
		System.out.println(r.size() + " matches found in "+(t1-t0)+" ms");
		show(r, numResultsToshow);

		// Query
		System.out.print("\n2: Find all residents called 'Anita' aged less than 20 years: ");
		q = and(equal(Resident.NAME, "Anita"), lessThan(Resident.AGE, 20));
        t0 = System.currentTimeMillis();
		r = residents.retrieve(q);
        t1 = System.currentTimeMillis();
		System.out.println(r.size() + " matches found in "+(t1-t0)+" ms");
		show(r, numResultsToshow);

		// Query
		System.out.print("\n3: Find all residents who have names starting with 'Li' and are not married: ");
		q = and(startsWith(Resident.NAME, "Li"), not(equal(Resident.MARITAL_STATUS, "Married")));
        t0 = System.currentTimeMillis();
		r = residents.retrieve(q);
        t1 = System.currentTimeMillis();
		System.out.println(r.size() + " matches found in "+(t1-t0)+" ms");
		show(r, numResultsToshow);

		// Query
		System.out.print("\n4: Find all Female residents called Pam who are either Single or older than 65 years: ");
		q = and(
				and(
					equal(Resident.GENDER, "Female"),
					equal(Resident.NAME, "Pam")
				), 
				or(
					greaterThan(Resident.AGE, 65),
					equal(Resident.MARITAL_STATUS, "Single")
				)
			);
		qo = deduplicate(DeduplicationStrategy.LOGICAL_ELIMINATION);
        t0 = System.currentTimeMillis();
		r = residents.retrieve(q, queryOptions(qo));
        t1 = System.currentTimeMillis();
		System.out.println(r.size() + " matches found in "+(t1-t0)+" ms");
		show(r, numResultsToshow);	
	}
	
	/**
	 * Shows the first n results from the ResultSet r,
	 * or shows all if the size of the result set is less than n
	 * @param r
	 * @param n
	 */
	private static void show(ResultSet<Resident> r, int n) {
		int size = (r.size() > n) ? n : r.size();
		if (size > 0) {
			System.out.println("Showing "+size+" results:");
			for (Resident resident : r) {
				System.out.println(" " + resident);
				if (--size <= 0) break;
			}
		}
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
                        numAgents = Integer.parseInt(args[i]);
                    } catch (Exception e) {
                        abort("Option value '" + args[i] + "' is not a number");
                    }
    			}
    			break;
    		case "-s":
    			if (i + 1 < args.length) {
    				i++;
                    try {
                        numResultsToshow = Integer.parseInt(args[i]);
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
                        + CQTest.class.getName() + "\n"
                        + "  -h          show this help message and exit\n"
                        + "  -n agents   number of agents (default is "+numAgents+")\n"
                        + "  -s show     number of query results to show (default is "+numResultsToshow+")\n"
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
