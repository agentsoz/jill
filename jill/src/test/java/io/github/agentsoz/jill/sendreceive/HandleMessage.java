package io.github.agentsoz.jill.sendreceive;

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

import io.github.agentsoz.jill.lang.Agent;
import io.github.agentsoz.jill.lang.Goal;
import io.github.agentsoz.jill.lang.Plan;
import io.github.agentsoz.jill.lang.PlanStep;

import java.util.HashMap;

public class HandleMessage extends Plan {

  MessageEvent msg;

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
      int sender = msg.getSenderID();
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
  },};

  @Override
  public void setPlanVariables(HashMap<String, Object> vars) {
    // TODO Auto-generated method stub

  }

}
