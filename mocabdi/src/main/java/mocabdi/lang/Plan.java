package mocabdi.lang;

import mocabdi.struct.AObject;

public abstract class Plan extends AObject {

	private final Agent agent;
	private byte index = 0;

	public Plan(Agent agent, String name) {
		super(name);
		this.agent = agent;
	}

	public abstract String context();

	public PlanStep[] body;
	
	public Agent getAgent() {
		return agent;
	}
	
	public void post(Goal goal) {
		getAgent().post(goal);
	}
	
	public void step() {
		if (body == null || body.length == 0 || index < 0 || index >= body.length ) {
			return;
		}
		body[index++].step();
	}

	public boolean hasfinished() {
		if (body == null || body.length == 0 || index < 0 || index >= body.length ) {
			return true;
		}
		return false;
	}

}
