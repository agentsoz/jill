package io.github.agentsoz.jill.example.hanoi;

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
    public void step() {
      if (solve.disc == 1) {
        log();
      }
    }
  }, new PlanStep() {
    public void step() {
      if (solve.disc != 1) {
        post(new Solve("", solve.disc - 1, solve.src, solve.spare, solve.dest));
      }
    }
  }, new PlanStep() {
    public void step() {
      if (solve.disc != 1) {
        log();
      }
    }
  }, new PlanStep() {
    public void step() {
      if (solve.disc != 1) {
        post(new Solve("", solve.disc - 1, solve.spare, solve.dest, solve.src));
      }
    }
  },};
}
