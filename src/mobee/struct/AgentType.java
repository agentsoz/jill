package mobee.struct;

public class AgentType extends AObject{
	
	private Class<?> cAgent;
	
	private byte[] goals; // This agent's goal-plan tree

	public AgentType(String name) {
		super(name);
	}

	public Class<?> getAgentClass() {
		return cAgent;
	}

	public void setAgentClass(Class<?> cAgent) {
		this.cAgent = cAgent;
	}
	
	public int[] getGoals() {
		int[] ints = new int[goals.length];
		for (int i = 0; i < ints.length; i++) {
			ints[i] = (int)(goals[i]);
		}
		return ints;
	}

	public void setGoals(int[] ints) {
		goals = new byte[ints.length];
		for (int i = 0; i < ints.length; i++) {
			goals[i] = (byte)(ints[i] & 0x000f);
		}
	}

	public void addGoal(int goal) {
		goals = GPType.grow(goals,1);
		goals[goals.length-1] = (byte)(goal & 0x000f);
	}
}

