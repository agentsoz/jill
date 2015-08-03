package agentsoz.jill.core;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import agentsoz.jill.Main;
import agentsoz.jill.config.GlobalConstant;
import agentsoz.jill.lang.Agent;
import agentsoz.jill.lang.BeliefSet;
import agentsoz.jill.lang.Goal;
import agentsoz.jill.lang.Plan;
import agentsoz.jill.struct.GoalType;
import agentsoz.jill.struct.PlanType;
import agentsoz.jill.util.Log;
import agentsoz.jill.util.Stack255;

public class IntentionSelector implements Runnable {

	private int start;
	private int size;
	
	private Random rand;
	private CyclicBarrier entryBarrier;
	private CyclicBarrier exitBarrier;
	
	public IntentionSelector(long l, int start, int size, CyclicBarrier entryBarrier, CyclicBarrier exitBarrier) {
		this.start = start;
		this.size = size;
		this.rand = new Random(l);
		this.entryBarrier = entryBarrier;
		this.exitBarrier = exitBarrier;
	}

	public synchronized void run() {
		do {
	        try {
	        	entryBarrier.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				Log.error(e.getMessage());
			}
		boolean idle = true;
		ArrayList<Plan> options = new ArrayList<Plan>();
		for (int i = start; i < start+size; i++) {
			// Nothing to do if this agent is idle
			if (Main.isAgentIdle(i)) {
				continue;
			}
			
			Agent agent = (Agent)GlobalState.agents.get(i);
			Stack255 agentExecutionStack = (Stack255)(agent).getExecutionStack();
			int esSize = agentExecutionStack.size();
			Log.trace("Agent " + agent.getName() + "'s execution stack is "+esSize+"/255 full");
			if (agentExecutionStack == null || esSize == 0) {
				// Mark this agent as idle
				Main.setAgentIdle(i, true);
				continue;
			}
			if (esSize >= 255) {
				Log.error("Agent " + agent.getName() + "'s execution stack has reached the maximum size of 255. Cannot continue.");
				continue;
			}
			
			// At least one agent is active
			idle = false;
			
			// Get the item at the top of the stack
			Object node = (Object)agentExecutionStack.get((byte)(esSize-1));
			
			// If it is a plan then execute it
			if (node instanceof Plan) {
				// If done then pop this plan/goal
				if (((Plan) node).hasfinished()) {
					// Pop the plan off the stack
					agentExecutionStack.pop();
					// Pop the goal off the stack
					agentExecutionStack.pop();
				} else {
					((Plan) node).step();
				}

				continue;
			}
			
			// If it is a goal then find a plan for it and put it on the stack
			if (node instanceof Goal) {
				options.clear();
				// Get the goal type for this goal
				GoalType gtype = (GoalType)GlobalState.goalTypes.find(node.getClass().getName());
				byte[] ptypes = gtype.getChildren();
				assert(ptypes != null);
				for(int p = 0; p < ptypes.length; p++) {
					PlanType ptype = (PlanType)GlobalState.planTypes.get(ptypes[p]);
					
					try {
						// Create an object on this Plan type, so we can
						// access its context condition
						Plan planInstance = (Plan)(ptype.getPlanClass().getConstructor(Agent.class, Goal.class, String.class).newInstance(GlobalState.agents.get(i), node, "p"));
						// Evaluate the context condition
						boolean context = planInstance.context();
						if (context == true) {
							// Select a binding
							selectPlanBinding(agent, planInstance.getClass().getSimpleName());
							planInstance.setPlanVariables(getPlanVariables(agent));
						}
						// Add it to the options
						options.add(planInstance);
					} catch (Exception e) {
						e.printStackTrace();
					}					
				}
				if (options.isEmpty()) {
					// No plan options for this goal at this point in time, so move to the next agent
					continue;
				}
				// TODO: Pick a plan option using some policy (random for now)
				int choice = rand.nextInt(options.size());
				// Now push the plan on to the intention stack
				agentExecutionStack.push(options.get(choice));
				options.clear();
				
			}
		}
		Main.addPoolIdleState(idle);
        try {
        	exitBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			Log.error(e.getMessage());
		}
		} while (GlobalConstant.EXIT_ON_IDLE && !Main.arePoolsIdle());
	}

	/**
	 * Selects a plan instance form the list, based on the global plan selection 
	 * policy {@link GlobalConstant#PLAN_SELECTION_POLICY}
	 * @param matches
	 * @return
	 */
	private void selectPlanBinding(Agent agent, String planType) {
		BeliefSet bs = agent.getBeliefSet();
		if (bs == null) {
			return;
		}
		int size = bs.getResultSetSize();
		//Log.trace(show(matches, 5));
		// Select a binding
		int choice = 0;
		switch (GlobalConstant.PLAN_SELECTION_POLICY) {
		case FIRST:
			choice = 0;
			break;
		case RANDOM:
			choice = rand.nextInt(size);
			break;
		case LAST:
			choice = size - 1;
			break;
		};
		Log.debug("Agent "+agent.getName()+" plan "+planType+" has "+size+" applicable instances; choosing instance "+choice);
		bs.selectResult(choice);
	}
	
	public HashMap<String, Object> getPlanVariables(Agent agent) {
		HashMap<String, Object> vars= new HashMap<String, Object>();
		BeliefSet bs = agent.getBeliefSet();
		if (bs != null) {
			HashMap<String, Class<?>> attributes = bs.getAttributes();
			for (String attribute : attributes.keySet()) {
				vars.put(attribute, bs.getResult(attribute, attributes.get(attribute)));
			}
		}
		return vars;
	}
     /**
     * Shows the first n results from the ResultSet r,
     * or shows all if the size of the result set is less than n
     * @param r
     * @param n
     */
	/*
    private static String show(ResultSet r, int n) {
    	String s = "";
    	int size = (r.size() > n) ? n : r.size();
    	if (size > 0) {
    		s += "Showing "+size+" results: ";
    		for (Object o : r) {
    			s += "|" + o.toString() + "|";
    			if (--size <= 0) break;
    		}
    	}
    	return s;
    }
	*/
}
