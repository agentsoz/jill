package io.github.agentsoz.jill.testgreeter;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2024 by its authors. See AUTHORS file.
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

import io.github.agentsoz.jill.core.beliefbase.BeliefBaseException;
import io.github.agentsoz.jill.lang.Agent;
import io.github.agentsoz.jill.lang.Goal;
import io.github.agentsoz.jill.lang.Plan;
import io.github.agentsoz.jill.lang.PlanStep;
import io.github.agentsoz.jill.util.Log;
import java.util.Map;

public class PlanGreetNeighbour extends Plan {

  String neighbour;

  /**
   * Creates a plan to greet a neighbour.
   *
   * @param agent the agent to whom this plan belongs
   * @param goal the goal that this plan handles
   * @param name a name for this plan
   */
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
  public void setPlanVariables(Map<String, Object> vars) {
    for (String attribute : vars.keySet()) {
      if ("name".equals(attribute)) {
        neighbour = (String) (vars.get(attribute));
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
  }, };

}
