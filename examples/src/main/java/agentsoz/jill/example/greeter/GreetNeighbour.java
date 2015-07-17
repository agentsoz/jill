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

import com.googlecode.cqengine.query.Query;

import agentsoz.jill.lang.Agent;
import agentsoz.jill.lang.Goal;
import agentsoz.jill.lang.Plan;
import agentsoz.jill.lang.PlanStep;
import static com.googlecode.cqengine.query.QueryFactory.*;

public class GreetNeighbour extends Plan {

	Neighbour neighbour;
	
	public GreetNeighbour(Agent agent, Goal goal, String name) {
		super(agent, goal, name);
		body = steps;
	}

	@Override
	public Query<Neighbour> context() {
		return all(Neighbour.class);
	}
	
	@Override
	public void setPlanVariables(Object var) {
		neighbour = (Neighbour)var;
	}

	PlanStep[] steps = {
			new PlanStep() {
				public void step() {
					System.out.println(getAgent().getName() + " says hello " + neighbour.getName());
				}
			},
	};

}