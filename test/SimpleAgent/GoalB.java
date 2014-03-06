package SimpleAgent;

import mobee.lang.Goal;
import mobee.lang.GoalInfo;

@GoalInfo(hasPlans={"SimpleAgent.PlanB"})
public class GoalB extends Goal {
	public GoalB(String name) {
		super(name);
	}
}