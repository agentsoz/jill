package io.github.agentsoz.jill.example.greeter;

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

import io.github.agentsoz.jill.lang.Agent;
import io.github.agentsoz.jill.lang.Goal;
import io.github.agentsoz.jill.lang.Plan;
import io.github.agentsoz.jill.lang.PlanStep;
import io.github.agentsoz.jill.util.Log;
import java.util.Map;

/**
 * <p>GreetNobody class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
public class GreetNobody extends Plan {

  String neighbour;

  /**
   * A fallback plan if we have no neighbour to greet.
   *
   * @param agent the agent to which this plan belongs
   * @param goal the goal for which this is a plan
   * @param name NOT USED
   */
  public GreetNobody(Agent agent, Goal goal, String name) {
    super(agent, goal, name);
    body = steps;
    neighbour = "Unknown";
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public boolean context() {
    return true;
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public void setPlanVariables(Map<String, Object> vars) {
    // TODO Auto-generated method stub
  }

  PlanStep[] steps = {new PlanStep() {
    @Override
    public void step() {
      Log.debug(getAgent().getName() + " says, \"hello, is there any body out there?\"");
    }
  }, };

}
