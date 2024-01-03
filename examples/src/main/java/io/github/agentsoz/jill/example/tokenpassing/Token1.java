package io.github.agentsoz.jill.example.tokenpassing;

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

import io.github.agentsoz.jill.lang.Goal;
import io.github.agentsoz.jill.lang.GoalInfo;

/**
 * <p>Token1 class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
@GoalInfo(hasPlans = {"io.github.agentsoz.jill.example.tokenpassing.ReceiveToken1"})
public class Token1 extends Goal {

  private int round;
  private int agent;

  /**
   * <p>Constructor for Token1.</p>
   *
   * @param str a {@link java.lang.String} object.
   */
  public Token1(String str) {
    super(str);
  }

  /**
   * Creates a new Token1 goal.
   *
   * @param round the current token passing round
   * @param agent the recipient agent
   */
  public Token1(int round, int agent) {
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
