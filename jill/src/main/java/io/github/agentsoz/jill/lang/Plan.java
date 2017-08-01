package io.github.agentsoz.jill.lang;

import java.util.HashMap;

/*
 * #%L Jill Cognitive Agents Platform %% Copyright (C) 2014 - 2017 by its authors. See AUTHORS file.
 * %% This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public License along with this program.
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>. #L%
 */

public abstract class Plan {

  private final Agent agent;
  private final Goal goal;
  private byte index = 0;

  public Plan(Agent agent, Goal goal, String name) {
    this.agent = agent;
    this.goal = goal;
  }

  public abstract boolean context();

  public abstract void setPlanVariables(HashMap<String, Object> vars);

  public PlanStep[] body;

  public Agent getAgent() {
    return agent;
  }

  public Goal getGoal() {
    return goal;
  }

  public void post(Goal goal) {
    getAgent().post(goal);
  }

  public void step() {
    if (body == null || body.length == 0 || index < 0 || index >= body.length) {
      return;
    }
    body[index++].step();
  }

  public boolean hasfinished() {
    if (body == null || body.length == 0 || index < 0 || index >= body.length) {
      return true;
    }
    return false;
  }

}
