package io.github.agentsoz.jill.example.hanoi;

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

import io.github.agentsoz.jill.lang.Goal;
import io.github.agentsoz.jill.lang.GoalInfo;

/**
 * <p>Solve class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
@GoalInfo(hasPlans = {"io.github.agentsoz.jill.example.hanoi.MoveTower"})
public class Solve extends Goal {

  public int disc;
  public int src;
  public int dest;
  public int spare;

  /**
   * <p>Constructor for Solve.</p>
   *
   * @param str a {@link java.lang.String} object.
   */
  public Solve(String str) {
    super(str);
  }

  /**
   * Creates a Solve goal.
   *
   * @param name a name for this goal
   * @param disc the the disc that is to be moved
   * @param src the source pin ID, on which this disc currently sits
   * @param dest the destination pin ID, to which this disc is to be moved
   * @param spare the spare disc ID
   */
  public Solve(String name, int disc, int src, int dest, int spare) {
    this(name);
    this.disc = disc;
    this.src = src;
    this.dest = dest;
    this.spare = spare;
  }

  /**
   * <p>toString.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  @Override
  public String toString() {
    return "solve(disc=" + disc + ", src=" + src + ", dest=" + dest + ", spare=" + spare + ")";
  }

}
