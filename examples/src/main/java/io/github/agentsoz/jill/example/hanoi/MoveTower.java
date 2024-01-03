package io.github.agentsoz.jill.example.hanoi;

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

import io.github.agentsoz.jill.lang.Agent;
import io.github.agentsoz.jill.lang.Goal;
import io.github.agentsoz.jill.lang.Plan;
import io.github.agentsoz.jill.lang.PlanStep;
import java.util.Map;

/**
 * <p>MoveTower class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
public class MoveTower extends Plan {

  Solve solve;

  /**
   * Creates a MoveTower plan.
   *
   * @param agent the agent that has this plan
   * @param goal the goal that this plan handles
   * @param name a name for this plan
   */
  public MoveTower(Agent agent, Goal goal, String name) {
    super(agent, goal, name);
    solve = (Solve) goal;
    body = steps;
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public boolean context() {
    return true; // null indicates true
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public void setPlanVariables(Map<String, Object> var) {
    // TODO Auto-generated method stub
  }

  /*package*/ void log() {
    Board board = ((Player) getAgent()).getBoard();
    Player.out
        .println("Moving disc " + solve.disc + " from pin " + solve.src + " to " + solve.dest);
    board.move(solve.src, solve.dest);
    Player.out.println(board.toString());
  }
  
  PlanStep[] steps = {new PlanStep() {
    @Override
    public void step() {
      if (solve.disc == 1) {
        log();
      }
    }
  }, new PlanStep() {
    @Override
    public void step() {
      if (solve.disc != 1) {
        subgoal(new Solve("", solve.disc - 1, solve.src, solve.spare, solve.dest));
      }
    }
  }, new PlanStep() {
    @Override
    public void step() {
      if (solve.disc != 1) {
        log();
      }
    }
  }, new PlanStep() {
    @Override
    public void step() {
      if (solve.disc != 1) {
        subgoal(new Solve("", solve.disc - 1, solve.spare, solve.dest, solve.src));
      }
    }
  }, };
}
