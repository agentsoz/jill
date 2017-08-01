package io.github.agentsoz.jill.config;

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

public class GlobalConstant {
  public static final int NULLID = -1;
  public static final String APP_HEADER =
      "Jill Cognitive Agents Platform" + "\n" + "(C) 2014 - 2015 by its authors. See AUTHORS file."
          + "\n\n" + "This program comes with ABSOLUTELY NO WARRANTY." + "\n"
          + "This is free software, and you are welcome to redistribute it" + "\n"
          + "under certain conditions; for details see LICENSE file provided.";

  /**
   * Available policies for selecting between plan instances. FIRST: selects the first plan instance
   * from the list of applicable instances RANDOM: selects randomly from the list of applicable
   * instances LAST: selects the last plan instance from the list of applicable instances (for test
   * purposes only)
   * 
   * @author dsingh
   *
   */
  public enum PlanSelectionPolicy {
    FIRST, RANDOM, LAST
  };

  /**
   * The default plan selection policy
   */
  public static PlanSelectionPolicy PLAN_SELECTION_POLICY = PlanSelectionPolicy.RANDOM;

  /**
   * When multiple plan instances are applicable, and selection policy is RANDOM, then this number
   * controls the maximum number of instances to draw from. For instance, say this limit is set to
   * 10. Now if, in some situation, a plan has 100 possible plan instances that apply, then random
   * selection will draw an index between 0-9 only, i.e., a random instance will be drawn from the
   * first 10 instances, and never from the remaining 90 instances.
   * 
   * This limit can be changed at runtime using the --plan-instances-limit option. Increasing this
   * limit, however, may have a significant performance hit, so should be done only if necessary.
   */
  public static int PLAN_INSTANCES_LIMIT = 10;

  /**
   * If set to true (default), causes the system to exit when it goes into the idle state, i.e.,
   * when the intention stack becomes empty. Setting this to false will force the system to run
   * forever.
   */
  public static boolean EXIT_ON_IDLE = true;

  /**
   * Agents beliefset (H2 database) connection string
   */
  public static final String H2_CONNECT = "jdbc:h2:mem:agents;CACHE_SIZE=1048576";
}
