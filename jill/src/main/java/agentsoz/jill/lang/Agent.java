package agentsoz.jill.lang;

/*
 * #%L
 * Jill Cognitive Agents Platform
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

import java.io.PrintStream;

import com.googlecode.cqengine.query.Query;
import com.googlecode.cqengine.resultset.ResultSet;

import agentsoz.jill.Main;
import agentsoz.jill.core.GlobalState;
import agentsoz.jill.struct.AObject;
import agentsoz.jill.util.Log;
import agentsoz.jill.util.Stack255;

/**
 * Base class for all BDI-like agents in the system. 
 * @author dsingh
 *
 */
public class Agent extends AObject {

	/**
	 * References to this agent's top level goals. 
	 * <p>
	 * For space efficiency, instead of storing
	 * references to {@link Goal} objects, we store catalog IDs for goals in 
	 * the {@link agentsoz.jill.core.GlobalState#goalTypes} catalog.
	 * Since these references are of size byte, a maximum of 255 goal
	 * types are supported in the system (globally, not per agent type). 
	 * These 1-byte references give very significant savings in space over 
	 * Java object references, which on a 64-bit machine take 8-bytes each.
	 * <p>
	 * NOTE: If a limit of 255 goal types in the system turns out to be 
	 * insufficient, then an agent type reference could be added here (at the 
	 * cost of another byte) and that would then allow 255 goal types 
	 * per agent type.
	 * 
	 */
	private byte[] goals; // This agent's goal-plan tree

	/**
	 * This agent's intention stack.
	 * <p>
	 * TODO: Currently, only a single intention stack is supported, which means
	 * that an agent can only really have one top level goal instance. This is
	 * to be extended to allow one stack per top level goal instance.
	 * <p>
	 * NOTE: This stack is of type {@link agentsoz.jill.util.Stack255} 
	 * which supports a maximum of 255 objects. This means that the active 
	 * goal-plan execution trace cannot be longer that 255. This should be more
	 * than enough for even the most complex goal-plan trees, but can be an 
	 * issue for recursive behaviours where a plan posts an instance of the 
	 * same goal type that it handles.
	 */
	private Stack255 executionStack; 

	
	private BeliefSet<?> beliefSet;

	
	/** 
	 * Creates a new agent with the given name.
	 * @param name the name of this agent; consider using concise names when
	 * dealing with very large numbers of agents
	 */
	public Agent(String name) {
		super(name);
		executionStack = new Stack255((byte)1,(byte)1);
	}

	/**
	 * Gets the {@link #executionStack} of this agent. 
	 * @return this agent's execution stack
	 */
	public Stack255 getExecutionStack() {
		return executionStack;
	}

	/**
	 * Posts the given goal. This will trigger the BDI execution engine to 
	 * generate applicable plan instances to handle this goal. One instance,
	 * from the available options, will be selected and executed.
	 * @param goal the goal that this agent should try to achieve
	 */
	public void post(Goal goal) {
		Log.debug("Agent "+getName()+" posting goal " + goal);
		executionStack.push(goal);
		Main.setAgentIdle(getId(), false);
	}
	
	public boolean send(int id, Goal msg) {
		AObject obj = GlobalState.agents.get(id);
		if (obj == null) {
			Log.warn("Agent " + getName() + " attempted to send a message to unknown agent id '"+id+"'");
			return false;
		}
		((Agent)obj).post(msg);
		return true;
	}
	
	public boolean send(String name, Goal msg) {
		AObject obj = GlobalState.agents.find(name);
		if (obj == null) {
			Log.warn("Agent " + getName() + " attempted to send a message to unknown agent '"+name+"'");
			return false;
		}
		((Agent)obj).post(msg);
		return true;
	}
	
	public void setBeliefSet(BeliefSet<?> beliefSet) {
		this.beliefSet = beliefSet;
	}
	
	public BeliefSet<?> getBeliefSet() {
		return beliefSet;
	}

	public ResultSet<?> queryBeliefSet(Query<?> q) {
		return (beliefSet == null) ? null : beliefSet.query(q);
	}
	
	public void start(PrintStream writer, String[] params) {
		Log.debug("Agent "+getName()+" is starting");
	}
	
	public void finish() {
		Log.debug("Agent "+getName()+" is finishing");
	}

	/** 
	 * Returns this agent's top level goals.
	 * @return {@link Agent#goals}
	 */
	public byte[] getGoals() {
		byte[] arr = new byte[goals.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = goals[i];
		}
		return arr;
	}

	/**
	 * Set's this agent's top level goals, i.e., {@link #goals}.
	 * @param bs an array of goal IDs (must exist in the 
	 * {@link agentsoz.jill.core.GlobalState#goalTypes} catalog.
	 */
	public void setGoals(byte[] bs) {
		goals = new byte[bs.length];
		for (int i = 0; i < bs.length; i++) {
			goals[i] = (byte)(bs[i] & 0x000f);
		}
	}

	
}
