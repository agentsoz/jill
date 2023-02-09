package io.github.agentsoz.jill.struct;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2023 by its authors. See AUTHORS file.
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
 * <p>AgentType class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
public class AgentType extends AObject {

  private Class<?> agentClass;

  private byte[] goals; // This agent's goal-plan tree

  /**
   * <p>Constructor for AgentType.</p>
   *
   * @param name a {@link java.lang.String} object.
   */
  public AgentType(String name) {
    super(name);
    goals = null;
  }

  /**
   * <p>Getter for the field <code>agentClass</code>.</p>
   *
   * @return a {@link java.lang.Class} object.
   */
  public Class<?> getAgentClass() {
    return agentClass;
  }

  /**
   * <p>Setter for the field <code>agentClass</code>.</p>
   *
   * @param agentClass a {@link java.lang.Class} object.
   */
  public void setAgentClass(Class<?> agentClass) {
    this.agentClass = agentClass;
  }

  /**
   * Gets the list of goals for this agent.
   *
   * @return array of goal IDs
   */
  public byte[] getGoals() {
    if (goals == null) {
      return null;
    }
    byte[] arr = new byte[goals.length];
    System.arraycopy(goals, 0, arr, 0, arr.length);
    return arr;
  }

  /**
   * Sets the list of goals for this agent.
   *
   * @param arr array of goal IDs
   */
  public void setGoals(byte[] arr) {
    if (arr == null) {
      goals = null;
      return;
    }
    goals = new byte[arr.length];
    System.arraycopy(arr, 0, goals, 0, goals.length);
  }

  /**
   * <p>addGoal.</p>
   *
   * @param goal a byte.
   */
  public void addGoal(byte goal) {
    goals = GoalPlanType.grow(goals, 1);
    goals[goals.length - 1] = goal;
  }
}

