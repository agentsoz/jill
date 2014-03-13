package SimpleAgent;

import mocabdi.lang.Goal;
import mocabdi.lang.GoalInfo;

@GoalInfo(hasPlans={"SimpleAgent.PlanA", "SimpleAgent.PlanD"})
public class GoalA extends Goal {
	public GoalA(String name) {
		super(name);
	}
}