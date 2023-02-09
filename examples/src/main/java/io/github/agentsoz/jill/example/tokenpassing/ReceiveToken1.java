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
import io.github.agentsoz.jill.lang.Agent;
import io.github.agentsoz.jill.lang.Goal;
import io.github.agentsoz.jill.lang.Plan;
import io.github.agentsoz.jill.lang.PlanStep;
import io.github.agentsoz.jill.util.Log;
import java.util.Map;

/**
 * <p>ReceiveToken1 class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
public class ReceiveToken1 extends Plan {

  /**
   * <p>Constructor for ReceiveToken1.</p>
   *
   * @param agent a {@link io.github.agentsoz.jill.lang.Agent} object.
   * @param goal a {@link io.github.agentsoz.jill.lang.Goal} object.
   * @param name a {@link java.lang.String} object.
   */
  public ReceiveToken1(Agent agent, Goal goal, String name) {
    super(agent, goal, name);
    body = steps;
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
    // No plan bindings to worry about
  }

  PlanStep[] steps = {new PlanStep() {
    @Override
    public void step() {
      Token1 msg = (Token1) getGoal();
      int myid = getAgent().getId();
      // Agent0 is the book keeper
      if (myid == 0) {
        // Check if we are done with the rounds
        if (TokenAgent1.rounds != msg.getRound()) {
          // Not done, so start the next round
          int newRound = msg.getRound() + 1;
          msg.setRound(newRound);
          Log.debug("round " + newRound);
        } else {
          // All done, so return
          Log.debug("rounds complete");
          return;
        }
      }
      // Send the token to the next agent
      int nextAgent = (myid + 1) % GlobalState.agents.size();
      msg.setAgent(nextAgent);
      getAgent().send(nextAgent, msg);
    }
  }, };
}
