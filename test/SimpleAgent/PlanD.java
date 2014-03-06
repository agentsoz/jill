package SimpleAgent;

import mobee.lang.Agent;
import mobee.lang.Plan;
import mobee.lang.PlanInfo;
import mobee.lang.PlanStep;

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