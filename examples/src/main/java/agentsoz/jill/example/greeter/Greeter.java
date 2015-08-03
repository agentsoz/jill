package agentsoz.jill.example.greeter;

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

import java.io.PrintStream;
import java.util.Random;

import agentsoz.jill.lang.Agent;
import agentsoz.jill.lang.AgentInfo;
import agentsoz.jill.lang.BeliefSet;
import agentsoz.jill.util.Log;

@AgentInfo(hasGoals={"agentsoz.jill.example.greeter.BeFriendly"})
public class Greeter extends Agent {

	// Defaults
	private static Random rand = new Random();
	private static int numNeighbours = 1;
	
	public Greeter(String name) {
		super(name);
	}
	
	@Override
	public void start(PrintStream writer, String[] params) {
		// Parse the arguments
		parse(params);
		
		// Create a new belief set about neighbours
		BeliefSet neighbours = new BeliefSet(getId(), "neighbours");
		neighbours.buildAttribute("name", String.class, false);
		neighbours.buildAttribute("gender", String.class, false);
		neighbours.buildAttribute("housenumber", Integer.class, true);
		neighbours.create();

		// Attach this belief set to this agent
		this.setBeliefSet(neighbours);
		
		// Add beliefs about neighbours
		registerNeighbours(rand, numNeighbours);
		Log.debug("Agent " + getName() + " is initialising with " + numNeighbours + " neighbours");

		// Post the goal to be friendly
		post(new BeFriendly("BeFriendly"));
	}

	/**
	 * Helper function to add beliefs about neighbours
	 * @param rand random number generator to use
	 * @param count number of beliefs to add
	 */
	private void registerNeighbours(Random rand, int count) {
		final String[] MALES = {
				"Alex", "Daniel", "John",
				"Lionel", "Nick", "Oscar", "Paul",
				"Rod", "Sam", "Tom"
		};
		final String[] FEMALES = {
				"Alice", "Elisa", "Fiona", 
				"Julia", "Kate", "Laura", "Margaret", 
				"Nancy", "Pam", "Rachael"
		};
		final String[] MIDDLE = {
				"A.", "B.", "C.", "D.", "E.", "F.", "G.", "H.", "I.", "J.", 
				"K.", "L.", "M.", "N.", "O.", "P.", "Q.", "R.", "S.", "T.", 
				"U.", "V.", "W.", "X.", "Y.", "Z." 
		};
		final String[] SURNAMES = {
				"Anderson", "Brown", "Jones", "Martin", "Morton", 
				"Smith", "Taylor", "White", "Williams", "Wilson",
		};
		BeliefSet neighbours = getBeliefSet();
		int size = (count < 0) ? 0 : count;
		for (int i = 0; i < size; i++) {
			boolean male = (rand.nextDouble() < 0.5) ? true : false;
			String name = male ? MALES[rand.nextInt(MALES.length)] : FEMALES[rand.nextInt(FEMALES.length)];
			name += " " + MIDDLE[rand.nextInt(MIDDLE.length)] + " ";
			name += SURNAMES[rand.nextInt(SURNAMES.length)]; 
			String gender = male ? "male" : "female";
			int hnumber = i+1;
			neighbours.addBelief(name, gender, hnumber);
		}
	}
	
    public static void parse(String[] args) {
        for (int i = 0; i < args.length; i++) {
                switch (args[i]) {
                case "-seed":
                	if (i + 1 < args.length) {
                		i++;
                		int seed = 0;
                		try {
                			seed = Integer.parseInt(args[i]);
                    		rand = new Random(seed);
                		} catch (Exception e) {
                			Log.warn("Seed value '" + args[i] + "' is not a number");
                		}
                	}
                	break;
                case "-neighbourhoodSize":
                	if (i + 1 < args.length) {
                		i++;
                      	try {
                       		numNeighbours = Integer.parseInt(args[i]);
                       	} catch (Exception e) {
                       		Log.warn("Neighbourhood size value '" + args[i] + "' is not a number");
                       	}
                	}
                	break;
                }
        }
    }
}
