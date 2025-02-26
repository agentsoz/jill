package io.github.agentsoz.jill.lang;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2025 by its authors. See AUTHORS file.
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */

import io.github.agentsoz.jill.Main;
import io.github.agentsoz.jill.core.GlobalState;
import io.github.agentsoz.jill.core.beliefbase.Belief;
import io.github.agentsoz.jill.core.beliefbase.BeliefBase;
import io.github.agentsoz.jill.core.beliefbase.BeliefBaseException;
import io.github.agentsoz.jill.core.beliefbase.BeliefSetField;
import io.github.agentsoz.jill.struct.AObject;
import io.github.agentsoz.jill.util.AObjectCatalog;
import io.github.agentsoz.jill.util.Log;
import io.github.agentsoz.jill.util.Stack255;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Base class for all BDI-like agents in the system.
 *
 * @author dsingh
 * @version $Id: $Id
 */
public class Agent extends AObject {

  private final Logger logger = LoggerFactory.getLogger(Main.LOGGER_NAME);

  // FIXME: some Agent method are just by Jill only and should be final

  /**
   * References to this agent's top level goals.
   * 
   * <p>For space efficiency, instead of storing references to {@link Goal} objects, we store
   * catalog IDs for goals in the {@link io.github.agentsoz.jill.core.GlobalState#goalTypes}
   * catalog. Since these references are of size byte, a maximum of 255 goal types are supported in
   * the system (globally, not per agent type). These 1-byte references give very significant
   * savings in space over Java object references, which on a 64-bit machine take 8-bytes each.
   * 
   * <p>NOTE: If a limit of 255 goal types in the system turns out to be insufficient, then an agent
   * type reference could be added here (at the cost of another byte) and that would then allow 255
   * goal types per agent type.
   * 
   */
  private byte[] goals; // This agent's goal-plan tree

  /**
   * This agent's intention stacks.
   * 
   * <p>NOTE: This stack is of type {@link io.github.agentsoz.jill.util.Stack255} which supports a
   * maximum of 255 objects. This means that the active goal-plan execution trace cannot be longer
   * that 255. This should be more than enough for even the most complex goal-plan trees, but can be
   * an issue for recursive behaviours where a plan posts an instance of the same goal type that it
   * handles.
   */
  private final IntentionStacks stacks;

  /**
   * A handle to any registered meta-planning function.
   */
  private MetaPlan metaplan;

  private static BeliefBase beliefbase; // NOPMD - must not make this final
  private static AObjectCatalog agents; // NOPMD - must not make this final
  private Set<Belief> lastresult;

  /**
   * Creates a new agent with the given name.
   *
   * @param name the name of this agent; consider using concise names when dealing with very large
   *        numbers of agents
   */
  public Agent(String name) {
    super(name);
    beliefbase = GlobalState.beliefbase; //NOPMD - possible unsafe assignment
    agents = GlobalState.agents; //NOPMD - possible unsafe assignment
    lastresult = null;
    metaplan = null;
    // initialise the intention stacks
    stacks = new IntentionStacks();

  }


  /**
   * Gets the active intention stack of this agent.
   *
   * @return this agent's execution stack
   */
  public Stack255 getExecutionStack() {
    return stacks.getActiveStack();
  }

  /**
   * Selects and returns the next active intention stack of this agent.
   *
   * @return the intention stack that was activated
   */
  public Stack255 nextActiveStack() {
    return stacks.nextActiveStack();
  }

  /**
   * Removes any empty intention stacks and resets the active stack to the first one.
   *
   * @return the size of the intentions stacks after cleanup
   */
  public int cleanupStacks() {
    return stacks.cleanup();
  }

  /**
   * Creates and returns a new intention stack for this agent.
   *
   * @return the new execution stack
   */
  private Stack255 getNewExecutionStack() {
    return stacks.getEmptyIntentionStack();
  }

  /**
   * Posts the given goal. This will trigger the BDI execution engine to generate applicable plan
   * instances to handle this goal. One instance, from the available options, will be selected and
   * executed.
   *
   * @param goal the goal that this agent should try to achieve
   */
  public void post(Goal goal) {
    post(getNewExecutionStack(), goal);
  }

  /**
   * Push the given goal to the given stack.
   *
   * @param stack the stack to push to new goal to
   * @param goal the goal to push
   */
  private void post(Stack255 stack, Goal goal) {
    if (goal == null) {
      return;
    }
    synchronized (stack) {
      logger.debug("{} posting goal {}", Log.logPrefix(getId()), goal.getClass().getSimpleName());
      stack.push(goal);
      Main.setAgentIdle(getId(), false);
    }
    Main.flagMessageTo(Main.poolid(getId()));
  }

  /**
   * Posts the given goal as a subgoal in the current execution stack.
   * This will trigger the BDI execution engine to generate applicable plan
   * instances to handle this goal. One instance, from the available options, will be selected and
   * executed.
   *
   * @param goal the goal that this agent should try to achieve
   */
  public void subgoal(Goal goal) {
    post(getExecutionStack(), goal);
  }

  /**
   * Send a message to an agent.
   *
   * @param id the agent to send the message to
   * @param msg the message to send
   * @return true if the message was sent successfully, false otherwise
   */
  public boolean send(int id, Goal msg) {
    AObject obj = agents.get(id);
    if (obj == null) {
      logger.warn("{} attempted to send a message to unknown agent id '{}'", Log.logPrefix(getId()),
          id);
      return false;
    }
    logger.debug("{} is sending message of type {} to agent {}", Log.logPrefix(getId()),
        msg.getClass().getSimpleName(), id);
    ((Agent) obj).post(msg);
    return true;
  }

  /**
   * Send a message to this agent.
   *
   * @param name the agent to send the message to
   * @param msg the message to send
   * @return true if the message was sent successfully, false otherwise
   */
  public boolean send(String name, Goal msg) {
    AObject obj = agents.find(name);
    if (obj == null) {
      logger.warn("{} attempted to send a message to unknown agent '{}'", Log.logPrefix(getId()),
          name);
      return false;
    }
    ((Agent) obj).post(msg);
    return true;
  }

  /**
   * <p>start.</p>
   *
   * @param writer a {@link java.io.PrintStream} object.
   * @param params an array of {@link java.lang.String} objects.
   */
  public void start(PrintStream writer, String[] params) {
    logger.debug("{} is starting", Log.logPrefix(getId()));
  }

  /**
   * <p>finish.</p>
   */
  public void finish() {
    logger.debug("{} is finishing", Log.logPrefix(getId()));
  }

  /**
   * Returns this agent's top level goals.
   *
   * @return {@link io.github.agentsoz.jill.lang.Agent#goals}
   */
  public byte[] getGoals() {
    byte[] arr = new byte[goals.length];
    System.arraycopy(goals, 0, arr, 0, arr.length);
    return arr;
  }

  /**
   * Set's this agent's top level goals, i.e., {@link #goals}.
   *
   * @param bs an array of goal IDs (must exist in the
   *        {@link io.github.agentsoz.jill.core.GlobalState#goalTypes} catalog.
   */
  public void setGoals(byte[] bs) {
    goals = new byte[bs.length];
    System.arraycopy(bs, 0, goals, 0, goals.length);
  }

  /**
   * Creates a new belief set with the given fields.
   *
   * <p>Example usage:
   *
   * <pre>
   * BeliefSetField[] fields = {new BeliefSetField("name", String.class, true),
   *     new BeliefSetField("gender", String.class, false),};
   * createBeliefSet("neighbour", fields);
   * </pre>
   *
   * @param name a name for this new belief set
   * @param fields an array of belief set fields (see
   *        {@link io.github.agentsoz.jill.core.beliefbase.BeliefSetField})
   * @throws io.github.agentsoz.jill.core.beliefbase.BeliefBaseException exception
   *        (see {@link io.github.agentsoz.jill.core.beliefbase.BeliefSetField})
   */
  public void createBeliefSet(String name, BeliefSetField[] fields) throws BeliefBaseException {
    beliefbase.createBeliefSet(getId(), name, fields);
  }

  /**
   * Adds a new belief to the specified belief set.
   *
   * @param beliefsetName the belief set to add the belief to; must have been created previously
   *        using {@link #createBeliefSet(String, BeliefSetField[])}
   * @param tuple parameter list of field values; types must match the specification in
   *        {@link #createBeliefSet(String, BeliefSetField[])}
   * @throws io.github.agentsoz.jill.core.beliefbase.BeliefBaseException exception
   *        (see {@link io.github.agentsoz.jill.core.beliefbase.BeliefBaseException})
   */
  public void addBelief(String beliefsetName, Object... tuple) throws BeliefBaseException {
    beliefbase.addBelief(getId(), beliefsetName, tuple);
  }

  /**
   * Removes the given belief of the agent.
   *
   * @param belief the belief to remove (see {@link #getLastResults()}
   * @return true if removed, false otherwise
   * @throws io.github.agentsoz.jill.core.beliefbase.BeliefBaseException exception
   *        (see {@link io.github.agentsoz.jill.core.beliefbase.BeliefBaseException})
   */
  public boolean removeBelief(Belief belief) throws BeliefBaseException {
    return beliefbase.removeBelief(getId(), belief);
  }

  /**
   * Evaluates the given query against this agent's belief base.
   *
   * @param query the query to evaluate
   * @return true if the query returned results, false otherwise
   * @throws BeliefBaseException if something went wrong
   */
  public boolean eval(String query) throws BeliefBaseException {
    boolean result = beliefbase.eval(getId(), query);
    lastresult = (result) ? beliefbase.query(getId(), query) : new HashSet<Belief>();
    return result;
  }

  /**
   * Gets the results of the last query run (see {@link #eval(String)}).
   *
   * @return the set of beliefs that matches the last query
   */
  public Set<Belief> getLastResults() {
    return lastresult;
  }

  /**
   * Clears the results of the last query run (see {@link #eval(String)}).
   */
  public void clearLastResults() {
    if (lastresult != null) {
      lastresult.clear();
    }
    lastresult = null;
  }

  /**
   * Forces this agent to enter an idle state irrespective of whether it has any active intentions
   * or not. The agent will continue to remain in the suspected state until some event forces it to
   * become active again, at which point it will resume operation.
   *
   * @param val the new idle state of this agent
   */
  public void suspend(boolean val) {
    Main.setAgentIdle(getId(), val);
    Main.flagMessageTo(Main.poolid(getId()));
  }

  /**
   * Registers a meta-planning function for this agent. The registered function will be called by
   * the Jill engine with the available plan bindings, prior to any plan selection, giving the agent
   * the opportunity to do meta-level reasoning.
   *
   * @param metaplan the metaplan instance to register
   */
  public void registerMetaPlan(MetaPlan metaplan) {
    this.metaplan = metaplan;
  }

  /**
   * Called by the Jill engine with available plan bindings, to Allow this agent to perform
   * meta-level reasoning.
   *
   * @param bindings the available plan bindings
   */
  public final void notifyAgentPrePlanSelection(PlanBindings bindings) {
    if (metaplan == null) {
      return;
    }
    metaplan.consider(bindings);
  }

}
