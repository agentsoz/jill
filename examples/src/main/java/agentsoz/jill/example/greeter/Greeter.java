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

import java.io.PrintWriter;

import agentsoz.jill.lang.Agent;
import agentsoz.jill.lang.AgentInfo;
import agentsoz.jill.lang.BeliefSet;

@AgentInfo(hasGoals={"agentsoz.jill.example.greeter.BeFriendly"})
public class Greeter extends Agent {

	public Greeter(String name) {
		super(name);
	}
	
	@Override
	public void start(PrintWriter writer, String[] params) {
		// Create a new belief set about neighbours
		BeliefSet<Neighbour> neighbours = new BeliefSet<Neighbour>();

		// Attach this belief set to this agent
		this.setBeliefSet(neighbours);
		
		// Add beliefs about neighbours
		neighbours.add(new Neighbour("Alex", Neighbour.Gender.Male, 17));
		
		// Post the goal to be friendly
		post(new BeFriendly("BeFriendly"));
	}


}
