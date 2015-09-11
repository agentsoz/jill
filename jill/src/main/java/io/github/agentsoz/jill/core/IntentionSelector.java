package io.github.agentsoz.jill.core;

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

import io.github.agentsoz.jill.Main;
import io.github.agentsoz.jill.config.GlobalConstant;
import io.github.agentsoz.jill.config.GlobalConstant.PlanSelectionPolicy;
import io.github.agentsoz.jill.core.beliefbase.Belief;
import io.github.agentsoz.jill.core.beliefbase.BeliefBaseException;
import io.github.agentsoz.jill.core.beliefbase.abs.ABeliefStore;
import io.github.agentsoz.jill.lang.Agent;
import io.github.agentsoz.jill.lang.Goal;
import io.github.agentsoz.jill.lang.Plan;
import io.github.agentsoz.jill.struct.GoalType;
import io.github.agentsoz.jill.struct.PlanType;
import io.github.agentsoz.jill.util.Log;
import io.github.agentsoz.jill.util.Stack255;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class IntentionSelector implements Runnable {

	private int poolid;
	private HashSet<Integer> activeAgents;
	HashSet<Integer> extToRemove;
	HashSet<Integer> extToAdd;
	private Random rand;
	
	private Object lock; 
	private boolean hasMessage;
	private boolean isIdle;
	private boolean shutdown;
	
	public IntentionSelector(int poolid, long l, int start, int size) {
		this.rand = new Random(l);
		this.poolid = poolid;
		this.lock = new Object();
		this.hasMessage = false;
		this.isIdle = false;
		this.shutdown = false;
		activeAgents = new HashSet<Integer> ();
		extToRemove = new HashSet<Integer>();
		extToAdd = new HashSet<Integer>();
	}

	public void run() {
		HashSet<Integer> toRemove = new HashSet<Integer>();
		do {
		boolean idle = true;
		ArrayList<Plan> options = new ArrayList<Plan>();
		synchronized(extToRemove) {
			if (!extToRemove.isEmpty()) {
				for (int i : extToRemove) {
					activeAgents.remove(i);
				}
				extToRemove.clear();
			}
		}
		synchronized(extToAdd) {
			if (!extToAdd.isEmpty()) {
				for (int i : extToAdd) {
					activeAgents.add(i);
				}
				extToAdd.clear();
			}
		}
		for (Integer i : activeAgents) {
		//for (int i = start; i < start+size; i++) {
			// Nothing to do if this agent is idle
			//if (Main.isAgentIdle(i)) {
			//	continue;
			//}
			
			Agent agent = (Agent)GlobalState.agents.get(i);
			Stack255 agentExecutionStack = (Stack255)(agent).getExecutionStack();
			int esSize = agentExecutionStack.size();
			Log.trace("Agent " + agent.getId() + "'s execution stack is "+esSize+"/255 full");
			if (agentExecutionStack == null || esSize == 0) {
				// Mark this agent as idle
				//Main.setAgentIdle(i, true);
				toRemove.add(i);
				continue;
			}
			if (esSize >= 255) {
				Log.error("Agent " + agent.getId() + "'s execution stack has reached the maximum size of 255. Cannot continue.");
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
					Log.debug("Agent " + agent.getId() + " finished executing plan "+node.getClass().getSimpleName());
					synchronized(agentExecutionStack) {
					// Pop the plan off the stack
					agentExecutionStack.pop();
					// Pop the goal off the stack
					agentExecutionStack.pop();
					if (agentExecutionStack.isEmpty()) {
						// Mark this agent as idle
						//Main.setAgentIdle(i, true);
						toRemove.add(i);
					}
					}
				} else {
					Log.debug("Agent " + agent.getId() + " is executing a step of plan "+node.getClass().getSimpleName());
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
						// Clear previously buffered context results if any
						agent.clearLastResults();
						// Evaluate the context condition
						boolean context = planInstance.context();
						if (context == true) {
							// Get the results of context query just performed
							HashSet<Belief> results = agent.getLastResults();
							if (results != null && !results.isEmpty()) {
								// Select a result based on the plan selection policy
								int choice = selectIndex(results.size(), GlobalConstant.PLAN_SELECTION_POLICY);
								Log.debug("Agent "+agent.getId()+" plan "+ptype+" has "+results.size()+" applicable instances; choosing instance "+choice);
								// Set the plan variables
								setPlanVariables(agent, planInstance, results, choice);
							}
							// Add it to the options
							options.add(planInstance);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}					
				}
				if (options.isEmpty()) {
					// No plan options for this goal at this point in time, so move to the next agent
					Log.debug("Agent "+agent.getId()+" has no applicable plans for goal "+gtype+" and will continue to wait indefinitely");
					continue;
				}
				// TODO: Pick a plan option using specified policy
				int choice = selectIndex(options.size(), GlobalConstant.PLAN_SELECTION_POLICY);
				// Now push the plan on to the intention stack
				synchronized(agentExecutionStack) {
					Log.debug("Agent "+agent.getId()+" choose an instance of plan "+options.get(choice).getClass().getSimpleName()+" to handle goal "+gtype.getClass().getSimpleName());
					agentExecutionStack.push(options.get(choice));
				}
				options.clear();
				
			}
		}

		if (!toRemove.isEmpty()) {
			for (int i : toRemove) {
				activeAgents.remove(i);
			}
			toRemove.clear();
		}

		if (idle) {
		synchronized(lock) {
			while (idle && !hasMessage) {
				try {
					Log.debug("Intention selector "+poolid+" is idle; will wait on external message");
					//Main.incrementPoolsIdle();
					isIdle = true;
					Main.flagPoolIdle();
					lock.wait();
					isIdle = false;
					//Main.decrementPoolsIdle();
					Log.debug("Intention selector "+poolid+" just woke up on external message");
				} catch (InterruptedException e) {
					Log.error("Intention selector "+poolid+" failed to wait on external message: " + e.getMessage());
				}
			}
			hasMessage = false;
		}
		if (shutdown) {
			break;
		}
		}
		} while(true);
		Log.debug("Intention selector "+poolid+" is exiting");
	}

	/**
	 * Selects an index in the range 0 .. size-1, based on the plan selection 
	 * policy {@link GlobalConstant#PLAN_SELECTION_POLICY}
	 * 
	 * @param size
	 * @param policy
	 * @return
	 */
	private int selectIndex(int size, PlanSelectionPolicy policy) {
		assert(size>=0);
		int choice = 0;
		switch (policy) {
		case FIRST:
			choice = 0;
			break;
		case RANDOM:
			choice = rand.nextInt(size);
			break;
		case LAST:
			choice = (size>0) ? size-1 : 0;
			break;
		};
		return choice;
	}

	
	private void setPlanVariables(Agent agent, Plan planInstance, HashSet<Belief> results, int choice ) {
		assert(agent != null && planInstance != null & results != null);
		assert (choice >= 0 && choice < results.size());
		HashMap<String, Object> vars= new HashMap<String, Object>();
		Belief belief = null;
		int index = 0;
		for (Belief b : results) {
			if (index == choice) {
				belief = b;
				break;
			}
			index++;
		}
		Object[] tuple = belief.getTuple();
		assert(tuple != null);
		index = 0;
		for (Object o : belief.getTuple()) {
			try {
				String fieldname = ABeliefStore.getFieldName(agent.getId(), belief.getBeliefset(), index);
				vars.put(fieldname, o);
			} catch (BeliefBaseException e) {
				Log.error("Agent "+agent.getId()+" could not retrive belief set field: " + e.getMessage());
			}
			index++;
		}
		planInstance.setPlanVariables(vars);
	}
	
	public void flagMessage() {
		synchronized(lock) {
			Log.debug("Intention selector " + poolid+ " received a new message");
			hasMessage = true;
			lock.notify();
		}
	}
	
	public boolean isIdle() {
		return isIdle && !hasMessage;
	}
	
	public void shutdown() {
		synchronized(lock) {
			Log.debug("Intention selector " + poolid+ " received shutdown message");
			shutdown = true;
			hasMessage = true;
			lock.notify();
		}
	}

	//FIXME: Threading issue when external threads changes activeagents
	// and this thread is still iterating over activeagents
	public void setAgentIdle(int agentId, boolean idle) {
		// If agent is becoming active, and not already active
		if (!idle /*&& !activeAgents.contains(agentId)*/) {
			synchronized(extToAdd) {
				extToAdd.add(agentId);
			}
		}
		// If agent is becoming idle, and not already idle
		if (idle /*&& activeAgents.contains(agentId)*/) {
			synchronized(extToRemove) {
				extToRemove.add(agentId);
			}
		}
	}
}
