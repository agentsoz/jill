package jill.lang;

/*
 * #%L
 * MOBSS, Masses of BDI-agents for Social Simulation
 * %%
 * Copyright (C) 2014 - 2015 by its authors. See AUTHORS file.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

import java.io.PrintWriter;

import jill.struct.AObject;
import jill.util.Stack255;


public class Agent extends AObject {

	private byte[] goals; // This agent's goal-plan tree

	private Stack255 executionStack; // This agent's goal-plan execution stack
	
	public Agent(String str) {
		super(str);
		executionStack = new Stack255((byte)1,(byte)1); // suffix 'es' for execution stack
	}

	public Stack255 getExecutionStack() {
		return executionStack;
	}


	public void post(Goal goal) {
		executionStack.push(goal);
	}

	public void start(PrintWriter writer, String params) {
	}
	
	public void finish() {
		
	}

	public byte[] getGoals() {
		byte[] arr = new byte[goals.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = goals[i];
		}
		return arr;
	}

	public void setGoals(byte[] bs) {
		goals = new byte[bs.length];
		for (int i = 0; i < bs.length; i++) {
			goals[i] = (byte)(bs[i] & 0x000f);
		}
	}

	
}
