package io.github.agentsoz.jill.lang;

import io.github.agentsoz.jill.util.AString;
import java.util.Map;

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

/**
 * <p>Abstract Plan class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
public abstract class Plan {

  private final Agent agent;
  private final Goal goal;
  private byte[] name;

  private byte index;

  public PlanStep[] body;

  /**
   * Creates a new plan for the gven goal for the given agent.
   *
   * @param agent the agent to which this plan applies
   * @param goal the goal that this plan handles
   * @param name a name for this plan
   */
  public Plan(Agent agent, Goal goal, String name) { // NOPMD - ignore unused param 'name'
    this.agent = agent;
    this.goal = goal;
    this.name = AString.toBytes(name);
  }

  /**
   * <p>context.</p>
   *
   * @return a boolean.
   */
  public abstract boolean context();

  /**
   * <p>setPlanVariables.</p>
   *
   * @param vars a {@link java.util.Map} object.
   */
  public abstract void setPlanVariables(Map<String, Object> vars);

  /**
   * <p>Getter for the field <code>agent</code>.</p>
   *
   * @return a {@link io.github.agentsoz.jill.lang.Agent} object.
   */
  public Agent getAgent() {
    return agent;
  }

  /**
   * <p>Getter for the field <code>goal</code>.</p>
   *
   * @return a {@link io.github.agentsoz.jill.lang.Goal} object.
   */
  public Goal getGoal() {
    return goal;
  }

  /**
   * <p>toString.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  @Override
  public String toString() {
    return AString.toString(name);
  }

  /**
   * <p>Gets the full name composed of the goal and plan names.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getFullName() {
    return getGoal().toString() + "~>" + AString.toString(name);
  }

  public void setName(String name) {
    this.name = AString.toBytes(name);
  }

  /**
   * <p>Posts a top-level goal in a new intention stack.</p>
   *
   * @param goal a {@link io.github.agentsoz.jill.lang.Goal} object.
   */
  public void post(Goal goal) {
    getAgent().post(goal);
  }

  /**
   * <p>Adds a new (sub) goal to the active intention stack.</p>
   *
   * @param goal a {@link io.github.agentsoz.jill.lang.Goal} object.
   */
  public void subgoal(Goal goal) {
    getAgent().subgoal(goal);
  }

  /**
   * Performs a single step of this plan, i.e., progresses this intention.
   */
  public void step() {
    if (body == null || body.length == 0 || index < 0 || index >= body.length) {
      return;
    }
    body[index++].step();
  }

  /**
   * Resets execution to the start of this plan.
   */
  public void reset() {
    index = 0;
  }

  /**
   * Drops the remainder of this plan.
   */
  public void drop() {
    index = Byte.MAX_VALUE;
  }

  /**
   * Checks if this plan has finished executing.
   *
   * @return true if this plan has finished executing, false otherwise
   */
  public boolean hasfinished() {
    return (body == null || body.length == 0 || index < 0 || index >= body.length);
  }

}
