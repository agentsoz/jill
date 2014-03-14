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
