package io.github.agentsoz.jill.sendreceive;

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
import io.github.agentsoz.jill.lang.AgentInfo;

import java.io.PrintStream;

@AgentInfo(hasGoals = {"io.github.agentsoz.jill.sendreceive.MessageEvent"})
public class Talker extends Agent {

  public Talker(String name) {
    super(name);
  }

  @Override
  public void start(PrintStream writer, String[] params) {
    // The agent with id=0 sends the ping
    if (getId() == 0) {
      send(1, new MessageEvent(getId(), "ping!"));
    }
  }

}
