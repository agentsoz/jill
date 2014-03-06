package mobee.struct;

public class GoalType extends GPType {
	private Class<?> cGoal;
	public GoalType(String name) {
		super(name);
	}

	public Class<?> getGoalClass() {
		return cGoal;
	}

	public void setGoalClass(Class<?> cGoal) {
		this.cGoal = cGoal;
	}
}
