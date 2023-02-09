package io.github.agentsoz.jill.example.tokenpassing;

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

import io.github.agentsoz.jill.core.GlobalState;
import io.github.agentsoz.jill.core.beliefbase.BeliefBaseException;
import io.github.agentsoz.jill.lang.Agent;
import io.github.agentsoz.jill.lang.Goal;
import io.github.agentsoz.jill.lang.Plan;
import io.github.agentsoz.jill.lang.PlanStep;
import io.github.agentsoz.jill.util.Log;
import java.util.Map;

/**
 * <p>ReceiveToken3 class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
public class ReceiveToken3 extends Plan {

  /*package*/ String neighbour;

  /**
   * <p>Constructor for ReceiveToken3.</p>
   *
   * @param agent a {@link io.github.agentsoz.jill.lang.Agent} object.
   * @param goal a {@link io.github.agentsoz.jill.lang.Goal} object.
   * @param name a {@link java.lang.String} object.
   */
  public ReceiveToken3(Agent agent, Goal goal, String name) {
    super(agent, goal, name);
    body = steps;
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public boolean context() {
    Agent agent = getAgent();
    int myid = agent.getId();
    int goalid = ((Token3) getGoal()).getAgent();
    try {
      return (myid == goalid) && agent.eval("neighbour.name = *");
    } catch (BeliefBaseException e) {
      Log.error(e.getMessage());
    }
    return false;
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public void setPlanVariables(Map<String, Object> vars) {
    for (String attribute : vars.keySet()) {
      if ("name".equals(attribute)) {
        neighbour = (String) (vars.get(attribute));
      }
    }
  }

  PlanStep[] steps = {new PlanStep() {
    @Override
    public void step() {
      Token3 msg = (Token3) getGoal();
      // int myid = getAgent().getId();
      // Agent performaing the last hop is the book keeper
      if (msg.getHops() == GlobalState.agents.size()) {
        // Check if we are done with the rounds
        if (TokenAgent3.rounds != msg.getRound()) {
          // Not done, so start the next round
          int newRound = msg.getRound() + 1;
          msg.setRound(newRound);
          msg.setHops(1);
          Log.debug("round " + newRound);
        } else {
          // All done, so return
          Log.debug("rounds complete");
          return;
        }
      }
      // Send the token to the next agent
      // int nextAgent = (myid+1)%GlobalState.agents.size();
      int nextAgent = Integer.parseInt(neighbour);
      msg.setAgent(nextAgent);
      msg.setHops(msg.getHops() + 1);
      getAgent().send(nextAgent, msg);
    }
  }, };
}
