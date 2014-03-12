package mobee.core;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;

import mobee.lang.Agent;
import mobee.lang.Goal;
import mobee.lang.Plan;
import mobee.struct.AObject;
import mobee.struct.GoalType;
import mobee.struct.PlanType;
import mobee.util.Catalog;

public class IntentionSelector implements Runnable {

	//private final static Logger logger = Logger.getLogger("");

	private boolean done = false;
	private int start;
	private int size;
	

	public IntentionSelector(int start, int size) {
		this.start = start;
		this.size = size;
	}


	public void run() {
		done = true;
		ArrayList<Plan> options = new ArrayList<Plan>();
		for (int i = start; i < start+size; i++) {
			Catalog agentExecutionStack = (Catalog)GlobalState.agentsIntentions.get(i);
			int esSize = agentExecutionStack.size();
			if (agentExecutionStack == null || esSize == 0) {
				// Nothing to do for this agent
				continue;
			}
			
			// Get the item at the top of the stack
			AObject node = (AObject)agentExecutionStack.get(esSize-1);
			
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
				int[] ptypes = gtype.getChildren();
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
				int choice = GlobalState.rand.nextInt(options.size());
				agentExecutionStack.push(options.get(choice));
				options.clear();
				done = false;
			}
		}
		//logger.fine("Processed "+GlobalState.agentsIntentions.size()+" agents, added "+cNewPlansAdded+" plans to stack, executed "+cPlansExecuted+" plans.");
		//return !done;
	}
}
