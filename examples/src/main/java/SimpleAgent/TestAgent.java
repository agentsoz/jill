/*
    MocaBDI, millions of cognitive (BDI) agents
    Copyright (C) 2014 Dhirendra Singh

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

    Contact: Dhirendra Singh <dhi.singh@gmail.com>
*/


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
