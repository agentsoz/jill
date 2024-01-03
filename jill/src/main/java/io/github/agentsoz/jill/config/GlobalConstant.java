package io.github.agentsoz.jill.config;

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

/**
 * <p>GlobalConstant class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
public class GlobalConstant {
  /** Constant <code>NULLID=-1</code>. */
  public static final int NULLID = -1;
  /** Constant <code>APP_HEADER="Jill Cognitive Agents Platform\n(C) 201"{trunked}</code>. */
  public static final String APP_HEADER =
      "Jill Cognitive Agents Platform" + "\n" + "(C) 2014 - 2018 by its authors. See AUTHORS file."
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
  }

  /**
   * The default plan selection policy.
   */
  public static PlanSelectionPolicy PLAN_SELECTION_POLICY = PlanSelectionPolicy.RANDOM;

  /**
   * When multiple plan instances are applicable, and selection policy is RANDOM, then this number
   * controls the maximum number of instances to draw from. For instance, say this limit is set to
   * 10. Now if, in some situation, a plan has 100 possible plan instances that apply, then random
   * selection will draw an index between 0-9 only, i.e., a random instance will be drawn from the
   * first 10 instances, and never from the remaining 90 instances.
   * 
   * <p>This limit can be changed at runtime using the --plan-instances-limit option. Increasing
   * this limit, however, may have a significant performance hit, so should be done only if
   * necessary.
   */
  public static int PLAN_INSTANCES_LIMIT = 10;

  /**
   * If set to true (default), causes the system to exit when it goes into the idle state, i.e.,
   * when the intention stack becomes empty. Setting this to false will force the system to run
   * forever.
   */
  public static boolean EXIT_ON_IDLE = true;

  /**
   * NOT USED: Agents beliefset (H2 database) connection string.
   */
  public static final String H2_CONNECT = "jdbc:h2:mem:agents;CACHE_SIZE=1048576";
}
