package io.github.agentsoz.jill.example.tokenpassing;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2017 by its authors. See AUTHORS file.
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

import io.github.agentsoz.jill.core.GlobalState;
import io.github.agentsoz.jill.core.beliefbase.BeliefBaseException;
import io.github.agentsoz.jill.lang.Agent;
import io.github.agentsoz.jill.lang.Goal;
import io.github.agentsoz.jill.lang.Plan;
import io.github.agentsoz.jill.lang.PlanStep;
import io.github.agentsoz.jill.util.Log;

import java.util.HashMap;

public class ReceiveToken3 extends Plan {

	private String neighbour;
	
	public ReceiveToken3(Agent agent, Goal goal, String name) {
		super(agent, goal, name);
		body = steps;		
	}

	@Override
	public boolean context() {
		Agent agent = getAgent();
		int myid = agent.getId();
		int goalid = ((Token3)getGoal()).getAgent();
		try {
			return (myid == goalid) && agent.eval("neighbour.name = *");
		} catch (BeliefBaseException e) {
			Log.error(e.getMessage());
		}
		return false;
	}

	@Override
	public void setPlanVariables(HashMap<String, Object> vars) {
		for (String attribute: vars.keySet()) {
			switch (attribute) {
			case "name":
				neighbour = (String)(vars.get(attribute));
				break;
			default:
				break;
			}
		}
	}

	PlanStep[] steps = {
			new PlanStep() {
				public void step() {
					Token3 msg = (Token3)getGoal();
					//int myid = getAgent().getId();
					// Agent performaing the last hop is the book keeper
					if (msg.getHops() == GlobalState.agents.size()) {
						// Check if we are done with the rounds
						if (TokenAgent3.rounds != msg.getRound()) {
							// Not done, so start the next round
							int newRound = msg.getRound()+1; 
							msg.setRound(newRound);
							msg.setHops(1);
							Log.info("round " + newRound);
						} else {
							// All done, so return
							Log.info("rounds complete");
							return;
						}
					}
					// Send the token to the next agent
					//int nextAgent = (myid+1)%GlobalState.agents.size();
					int nextAgent = Integer.parseInt(neighbour);
					msg.setAgent(nextAgent);
					msg.setHops(msg.getHops()+1);
					getAgent().send(nextAgent, msg);
				}
			},
	};
}
