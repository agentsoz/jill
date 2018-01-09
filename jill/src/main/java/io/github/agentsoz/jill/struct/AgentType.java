package io.github.agentsoz.jill.struct;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2018 by its authors. See AUTHORS file.
 * %%
 * This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public License along with this program.
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

public class AgentType extends AObject {

  private Class<?> agentClass;

  private byte[] goals; // This agent's goal-plan tree

  public AgentType(String name) {
    super(name);
    goals = null;
  }

  public Class<?> getAgentClass() {
    return agentClass;
  }

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

  public void addGoal(byte goal) {
    goals = GoalPlanType.grow(goals, 1);
    goals[goals.length - 1] = goal;
  }
}

