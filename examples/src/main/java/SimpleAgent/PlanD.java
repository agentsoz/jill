package SimpleAgent;

/*
 * #%L
 * MOBSS, Masses of BDI-agents for Social Simulation
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

import mobss.lang.Agent;
import mobss.lang.Plan;
import mobss.lang.PlanInfo;
import mobss.lang.PlanStep;

@PlanInfo(handlesGoal="SimpleAgent.GoalA")
public class PlanD extends Plan {
	
	public PlanD(Agent agent, String name) {
		super(agent, name);
		body = steps;
	}
	
	public String context() {
		return "neighbour(X) && hasCar(X)";
	}
	
	PlanStep[] steps = {
			new PlanStep() {
				public void step() {
					((TestAgent)getAgent()).setI(((TestAgent)getAgent()).getI() | 0x0008);
				}
			},
	};
}
