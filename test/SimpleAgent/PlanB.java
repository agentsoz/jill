package SimpleAgent;

import mobee.lang.Agent;
import mobee.lang.Plan;
import mobee.lang.PlanInfo;
import mobee.lang.PlanStep;

@PlanInfo(handlesGoal="SimpleAgent.GoalB")
public class PlanB extends Plan {
	
	public PlanB(Agent agent, String name) {
		super(agent, name);
		body = steps;
	}
	
	public String context() {
		return "someContext(M)";
	}
	
	PlanStep[] steps = {
			new PlanStep() {
				public void step() {
					((TestAgent)getAgent()).setI(((TestAgent)getAgent()).getI() | 0x0002);
				}
			},
	};
}