package io.github.agentsoz.jill.example.hanoi;

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
