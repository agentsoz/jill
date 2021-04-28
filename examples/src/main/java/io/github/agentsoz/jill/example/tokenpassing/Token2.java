package io.github.agentsoz.jill.example.tokenpassing;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2021 by its authors. See AUTHORS file.
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

import io.github.agentsoz.jill.lang.Goal;
import io.github.agentsoz.jill.lang.GoalInfo;

/**
 * <p>Token2 class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
@GoalInfo(hasPlans = {"io.github.agentsoz.jill.example.tokenpassing.ReceiveToken2"})
public class Token2 extends Goal {

  private int round;
  private int agent;

  /**
   * <p>Constructor for Token2.</p>
   *
   * @param str a {@link java.lang.String} object.
   */
  public Token2(String str) {
    super(str);
  }

  
  /**
   * Creates a new Token2 goal.
   *
   * @param round the current token passing round
   * @param agent the recipient agent
   */
  public Token2(int round, int agent) {
    this(null);
    this.agent = agent;
    this.round = round;
  }

  /**
   * <p>Getter for the field <code>agent</code>.</p>
   *
   * @return a int.
   */
  public int getAgent() {
    return agent;
  }

  /**
   * <p>Setter for the field <code>agent</code>.</p>
   *
   * @param agent a int.
   */
  public void setAgent(int agent) {
    this.agent = agent;
  }

  /**
   * <p>Getter for the field <code>round</code>.</p>
   *
   * @return a int.
   */
  public int getRound() {
    return round;
  }

  /**
   * <p>Setter for the field <code>round</code>.</p>
   *
   * @param round a int.
   */
  public void setRound(int round) {
    this.round = round;
  }
}
