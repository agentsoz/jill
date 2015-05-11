package mobss.core;

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

import java.util.ArrayList;
import java.util.Random;

import mobss.lang.Agent;
import mobss.lang.Goal;
import mobss.lang.Plan;
import mobss.struct.GoalType;
import mobss.struct.PlanType;
import mobss.util.Stack255;

public class IntentionSelector implements Runnable {

	//private final static Logger logger = Logger.getLogger("");

	@SuppressWarnings("unused")
	private boolean done = false;
	
	private int start;
	private int size;
	
	private Random rand;

	public IntentionSelector(long l, int start, int size) {
		this.start = start;
		this.size = size;
		this.rand = new Random(l);
	}


	public void run() {
		done = true;
		ArrayList<Plan> options = new ArrayList<Plan>();
		for (int i = start; i < start+size; i++) {
			Stack255 agentExecutionStack = (Stack255)((Agent)GlobalState.agents.get(i)).getExecutionStack();
			int esSize = agentExecutionStack.size();
			if (agentExecutionStack == null || esSize == 0) {
				// Nothing to do for this agent
				continue;
			}
			
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
					if (agentExecutionStack.size() != 0) {
						done = false;
					}
				} else {
					((Plan) node).step();
					done = false;
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
					
					// TODO: Here check that the context() holds
					try {
						Plan planInstance = (Plan)(ptype.getPlanClass().getConstructor(Agent.class, String.class).newInstance(GlobalState.agents.get(i), "p"));
						// Add it to the options
						options.add(planInstance);
					} catch (Exception e) {
						e.printStackTrace();
					}					
				}
				if (options.isEmpty()) {
					// No plan options for this goal at this point in time, so move to the next agent
					done = false;
					continue;
				}
				// TODO: Pick a plan option using some policy (random for now)
				int choice = rand.nextInt(options.size());
				agentExecutionStack.push(options.get(choice));
				options.clear();
				done = false;
			}
		}
		//logger.fine("Processed "+GlobalState.agentsIntentions.size()+" agents, added "+cNewPlansAdded+" plans to stack, executed "+cPlansExecuted+" plans.");
		//return !done;
	}
}
