package SimpleAgent;

import mobee.lang.Goal; 
import mobee.lang.GoalInfo;

@GoalInfo(hasPlans={"SimpleAgent.PlanA", "SimpleAgent.PlanD"})
public class GoalA extends Goal {
	public GoalA(String name) {
		super(name);
	}
}