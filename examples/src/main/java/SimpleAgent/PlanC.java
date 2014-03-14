/*
    MocaBDI, millions of cognitive (BDI) agents
    Copyright (C) 2014 Dhirendra Singh

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

    Contact: Dhirendra Singh <dhi.singh@gmail.com>
*/


package SimpleAgent;

import mocabdi.lang.Agent;
import mocabdi.lang.Plan;
import mocabdi.lang.PlanInfo;
import mocabdi.lang.PlanStep;

@PlanInfo(handlesGoal="SimpleAgent.GoalC")
public class PlanC extends Plan {
	
	public PlanC(Agent agent, String name) {
		super(agent, name);
		body = steps;
	}
	
	public String context() {
		return "anotherContext(N)";
	}
	
	PlanStep[] steps = {
			new PlanStep() {
				public void step() {
					((TestAgent)getAgent()).setI(((TestAgent)getAgent()).getI() | 0x0004);
				}
			},
	};
}