package SimpleAgent;

import mobee.lang.Goal;
import mobee.lang.GoalInfo;

@GoalInfo(hasPlans={"SimpleAgent.PlanC"})
public class GoalC extends Goal {
	public GoalC(String name) {
		super(name);
	}
}