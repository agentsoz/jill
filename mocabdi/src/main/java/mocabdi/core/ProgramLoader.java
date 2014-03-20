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


package mocabdi.core;

import java.lang.annotation.Annotation;
import java.util.logging.Logger;

import mocabdi.core.GlobalState;
import mocabdi.lang.Agent;
import mocabdi.lang.AgentInfo;
import mocabdi.lang.Goal;
import mocabdi.lang.GoalInfo;
import mocabdi.lang.Plan;
import mocabdi.lang.PlanInfo;
import mocabdi.struct.AgentType;
import mocabdi.struct.GoalType;
import mocabdi.struct.PlanType;
import mocabdi.util.Catalog;



public class ProgramLoader {

	private final static Logger logger = Logger.getLogger("");

	
	public static void load(String className, int num, Catalog agents) {
		Class<?> aclass;
		String msg = "";
		try {
			// Check that we have an Agent class, else abort
			aclass = Class.forName(className);
			if (aclass.getSuperclass() != Agent.class) {
				abort("Class '"+className+"' does not extend "+Agent.class.getName());
			}
			msg += "Found class "+className+" of type "+Agent.class.getName() + "\n";
			// Save this agent type to the catalog of known agent types 
			AgentType atype = new AgentType(className);
			atype.setAgentClass(aclass);
			GlobalState.agentTypes.push(atype);

			// Find the goals that this agent has
			Annotation annotation = aclass.getAnnotation(AgentInfo.class);
			AgentInfo ainfo = (AgentInfo) annotation;
			String[] goals = ainfo.hasGoals();
			if (goals.length == 0) {
				abort("Agent "+className+" does not have any goals defined.");
			}
			
			// First pass: get the goals and their plans (flat goal-plan list)
			for (int i = 0; i < goals.length; i++) {
				Class<?> gclass = Class.forName(goals[i]);
				// Abort if the specified goal is not of type Goal
				if (gclass.getSuperclass() != Goal.class) {
					abort("Agent "+className+" uses "+goals[i]+" which is not of type Goal.");
				}
				// Found the goal class, so add this goal to the catalog of known goal types
				msg += "Found class '"+gclass.getName()+"' of type "+Goal.class.getName() + "\n";
				GoalType gtype = new GoalType(gclass.getName());
				gtype.setGoalClass(gclass);
				GlobalState.goalTypes.push(gtype);
				atype.addGoal((byte)gtype.getId());

				// Find the plans that this goal has
				annotation = gclass.getAnnotation(GoalInfo.class);
				GoalInfo ginfo = (GoalInfo) annotation;
				String[] plans = ginfo.hasPlans();
				if (plans.length == 0) {
					abort("Goal "+gclass.getName()+" does not have any plans defined.");
				}

				// Process the plans
				for (int j = 0; j < plans.length; j++) {
					Class<?> pclass = Class.forName(plans[j]);
					// Abort if the specified plan is not of type Plan
					if (pclass.getSuperclass() != Plan.class) {
						abort("Goal "+gclass.getName()+" has plan "+pclass.getName()+" which is not of type Plan.");
					}
					
					// Found the plan class, so add this plan to the catalog of known plan types
					msg += "Found Plan "+pclass.getName()+" that handles Goal "+gclass.getName() + "\n";
					PlanType ptype = new PlanType(pclass.getName());
					ptype.setPlanClass(pclass);
					GlobalState.planTypes.push(ptype);
					// Set up the parent/child links between them (makings of a goal-plan tree)
					ptype.addParent((byte)gtype.getId());
					gtype.addChild((byte)ptype.getId());
				}
			}

			// Second pass: complete the goal-plan hierarchy
			for (int i = 0; i < GlobalState.planTypes.size(); i++) {
				PlanType ptype = (PlanType) GlobalState.planTypes.get(i);
				annotation = ptype.getPlanClass().getAnnotation(PlanInfo.class);
				PlanInfo pinfo = (PlanInfo) annotation;
				if (!pinfo.postsGoals().equals("")) {
					msg += "Plan "+ptype.getName()+" posts "+pinfo.postsGoals().length+" goals" + "\n";
					// Find the goal
					for (String goalname : pinfo.postsGoals()) {
						GoalType gtype = (GoalType)GlobalState.goalTypes.find(goalname);
						if (gtype == null) {
							logger.severe(goalname + "not found in known goal types. Should not happen!");
							continue;
						}
						// Found the goal posted by the plan, so setup the links
						ptype.addChild((byte)gtype.getId());
						gtype.addParent((byte)ptype.getId());
					}
				}
			}
			logger.info(msg);
			
			// Now create the specified number of instances of this agent type
			try {
				for (int i = 0; i < num; i++) {
					// Create a new instance (name prefix 'a' for agents)
					Agent agent = (Agent)(aclass.getConstructor(String.class).newInstance("a"));
					// Assign the static goal plan tree hierarchy to this instance
					agent.setGoals(atype.getGoals());
					// Add this instance to the catalog of agent instances
					agents.push(agent);
				}
				
			} catch (Exception e) {
				abort("ERROR: " + e.getMessage());
			}
			
		} catch (ClassNotFoundException e) {
			abort("Class not found: " + e.getMessage());
		}
		return;
	}

	private static void abort(String err) {
		logger.severe(err);
		System.err.println(err + ". Aborting.");
		System.exit(0);
	}
}
