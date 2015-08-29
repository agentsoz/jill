package agentsoz.jill.example.tokenpassing;

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

import java.util.HashMap;

import agentsoz.jill.core.GlobalState;
import agentsoz.jill.lang.Agent;
import agentsoz.jill.lang.Goal;
import agentsoz.jill.lang.Plan;
import agentsoz.jill.lang.PlanStep;
import agentsoz.jill.util.Log;

public class ReceiveToken1 extends Plan {

	public ReceiveToken1(Agent agent, Goal goal, String name) {
		super(agent, goal, name);
		body = steps;		
	}

	@Override
	public boolean context() {
		return true;
	}

	@Override
	public void setPlanVariables(HashMap<String, Object> vars) {
	}

	PlanStep[] steps = {
			new PlanStep() {
				public void step() {
					Token1 msg = (Token1)getGoal();
					int myid = getAgent().getId();
					// Agent0 is the book keeper
					if (myid == 0) {
						// Check if we are done with the rounds
						if (TokenAgent1.rounds != msg.getRound()) {
							// Not done, so start the next round
							int newRound = msg.getRound()+1; 
							msg.setRound(newRound);
							Log.info("round " + newRound);
						} else {
							// All done, so return
							Log.info("rounds complete");
							return;
						}
					}
					// Send the token to the next agent
					int nextAgent = (myid+1)%GlobalState.agents.size();
					msg.setAgent(nextAgent);
					getAgent().send(nextAgent, msg);
				}
			},
	};
}
