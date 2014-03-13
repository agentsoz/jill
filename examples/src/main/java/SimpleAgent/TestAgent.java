package SimpleAgent;

import mocabdi.lang.Agent;
import mocabdi.lang.AgentInfo;

@AgentInfo(hasGoals={"SimpleAgent.GoalA","SimpleAgent.GoalB","SimpleAgent.GoalC"})
public class TestAgent extends Agent {

	private int i = 0;
	
	public TestAgent(String str) {
		super(str);
	}

	public void start() {
		post(new GoalA("gA"));
	}
	
	public void finish() {
		/*
		 * Check that some plan changed i.  Should print:
		 *   hex '8' if plan PlanD ran, 
		 *   hex '7' if plans PlanA then PlanB then PlanC ran. 
		*/
		//System.out.printf("%h", i);
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}
