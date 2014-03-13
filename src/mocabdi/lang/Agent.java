package mocabdi.lang;

import mocabdi.struct.AObject;
import mocabdi.util.Catalog;


public class Agent extends AObject {

	private byte[] goals; // This agent's goal-plan tree

	private Catalog executionStack; // This agent's goal-plan execution stack
	
	public Agent(String str) {
		super(str);
		executionStack = new Catalog(getName()+"es",10,10); // suffix 'es' for execution stack
	}

	public Catalog getExecutionStack() {
		return executionStack;
	}


	public void post(Goal goal) {
		executionStack.push(goal);
	}

	public void start() {
	}
	
	public void finish() {
		
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

	
}
