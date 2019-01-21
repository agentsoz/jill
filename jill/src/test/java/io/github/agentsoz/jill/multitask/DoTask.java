package io.github.agentsoz.jill.multitask;

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

public class DoTask extends Plan {

  Task msg;

  /**
   * Handles a message goal.
   * 
   * @param agent the agent to which this plan belongs
   * @param goal the goal that this plan handles
   * @param name a name for this plan
   */
  public DoTask(Agent agent, Goal goal, String name) {
    super(agent, goal, name);
    msg = (Task) goal;
    body = steps;
  }

  @Override
  public boolean context() {
    return true;
  }

  PlanStep[] steps = {
      () -> {
        System.out.println((String)msg.getContent() + "-1");
      },
      () -> {
        System.out.println((String)msg.getContent() + "-2");
      },
      () -> {
        System.out.println((String)msg.getContent() + "-3");
      },
      () -> {
        System.out.println((String)msg.getContent() + "-4");
      },
      () -> {
        System.out.println((String)msg.getContent() + "-5");
      },
  };

  @Override
  public void setPlanVariables(Map<String, Object> vars) {
    // TODO Auto-generated method stub

  }

}
