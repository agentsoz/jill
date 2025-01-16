package io.github.agentsoz.jill.sendreceive;

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
import java.util.Map;

public class HandleMessage extends Plan {

  MessageEvent msg;

  /**
   * Handles a message goal.
   *
   * @param agent the agent to which this plan belongs
   * @param goal the goal that this plan handles
   * @param name a name for this plan
   */
  public HandleMessage(Agent agent, Goal goal, String name) {
    super(agent, goal, name);
    msg = (MessageEvent) goal;
    body = steps;
  }

  @Override
  public boolean context() {
    return true;
  }

  PlanStep[] steps = {new PlanStep() {
    public void step() {
      int sender = msg.getSenderId();
      if (sender == 0) {
        // Received a message from agent 0
        System.out.print(msg.getContent());
        // Reply to agent 0
        getAgent().send(sender, new MessageEvent(getAgent().getId(), "pong!"));
      } else if (sender == 1) {
        // Received a message from agent 1
        System.out.print(msg.getContent());
      }
    }
  }, };

  @Override
  public void setPlanVariables(Map<String, Object> vars) {
    // TODO Auto-generated method stub

  }

}
