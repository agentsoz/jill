package io.github.agentsoz.jill.lang;

import java.util.Map;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2019 by its authors. See AUTHORS file.
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

/**
 * <p>Abstract Plan class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
public abstract class Plan {

  private final Agent agent;
  private final Goal goal;
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
   * <p>Posts a top-level goal in a new intention stack</p>
   *
   * @param goal a {@link io.github.agentsoz.jill.lang.Goal} object.
   */
  public void post(Goal goal) {
    getAgent().post(goal);
  }

  /**
   * <p>Adds a new (sub) goal to the active intention stack</p>
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
   * Checks if this plan has finished executing.
   *
   * @return true if this plan has finished executing, false otherwise
   */
  public boolean hasfinished() {
    return (body == null || body.length == 0 || index < 0 || index >= body.length);
  }

}
