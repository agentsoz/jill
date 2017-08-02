package io.github.agentsoz.jill.testgreeter;

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

import io.github.agentsoz.jill.core.beliefbase.BeliefBaseException;
import io.github.agentsoz.jill.lang.Agent;
import io.github.agentsoz.jill.lang.Goal;
import io.github.agentsoz.jill.lang.Plan;
import io.github.agentsoz.jill.lang.PlanStep;
import io.github.agentsoz.jill.util.Log;

import java.util.HashMap;

public class PlanGreetNeighbour extends Plan {

  String neighbour;

  public PlanGreetNeighbour(Agent agent, Goal goal, String name) {
    super(agent, goal, name);
    body = steps;
    neighbour = "Unknown";
  }

  @Override
  public boolean context() {
    try {
      return getAgent().eval("neighbour.gender = male");
    } catch (BeliefBaseException e) {
      Log.error(e.getMessage());
    }
    return false;
  }

  @Override
  public void setPlanVariables(HashMap<String, Object> vars) {
    for (String attribute : vars.keySet()) {
      switch (attribute) {
        case "name":
          neighbour = (String) (vars.get(attribute));
          break;
        default:
          break;
      }
    }
  }

  PlanStep[] steps = {new PlanStep() {
    public void step() {
      TestGreeterAgent agent = (TestGreeterAgent) getAgent();
      if (agent.verbosePlans) {
        agent.writer.println("Hello " + neighbour);
      }
    }
  },};

}
