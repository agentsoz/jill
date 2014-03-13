package SimpleAgent;

import mocabdi.lang.Goal;
import mocabdi.lang.GoalInfo;

@GoalInfo(hasPlans={"SimpleAgent.PlanB"})
public class GoalB extends Goal {
	public GoalB(String name) {
		super(name);
	}
}