package SimpleAgent;

import mocabdi.lang.Goal;
import mocabdi.lang.GoalInfo;

@GoalInfo(hasPlans={"SimpleAgent.PlanC"})
public class GoalC extends Goal {
	public GoalC(String name) {
		super(name);
	}
}