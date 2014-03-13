package mocabdi.core;

import java.util.Random;

import mocabdi.util.Catalog;

/**
 * A catalog of all known agent, goal and plan types
 * @author dsingh
 *
 */
public class GlobalState {

	public static Catalog agentTypes = new Catalog("agentTypes", 5,5);
	public static Catalog goalTypes = new Catalog("goalTypes", 10,5);
	public static Catalog planTypes = new Catalog("planTypes", 20,5);
	
	public static Catalog agents;
	public static Catalog agentsIntentions;

	public static Random rand = new Random();

}
