package io.github.agentsoz.jill.core;

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

import io.github.agentsoz.jill.core.beliefbase.abs.ABeliefStore;
import io.github.agentsoz.jill.lang.JillExtension;
import io.github.agentsoz.jill.util.AObjectCatalog;
import java.util.HashSet;
import java.util.Set;


/**
 * A catalog of all known agent, goal and plan types.
 *
 * @author dsingh
 * @version $Id: $Id
 */
public final class GlobalState {

  /**
   * Catalog of all agent types in the system, loaded at runtime. Each entry in the catalog is
   * assigned an automatically created ID.
   */
  public static AObjectCatalog agentTypes;

  /**
   * Catalog of all goal types in the system, loaded at runtime. Each entry in the catalog is
   * assigned an automatically created ID.
   */
  public static AObjectCatalog goalTypes;

  /**
   * Catalog of all plan types in the system, loaded at runtime. Each entry in the catalog is
   * assigned an automatically created ID.
   */
  public static AObjectCatalog planTypes;

  /**
   * Catalog of all initialised agents in the system. Each entry in the catalog is assigned an
   * automatically created ID.
   */
  public static AObjectCatalog agents;

  /**
   * The central belief base to store all beliefs of all agents.
   */
  public static ABeliefStore beliefbase;

  /**
   * The list of registered external event handlers (jill extensions).
   */
  public static Set<JillExtension> eventHandlers = new HashSet<JillExtension>();

  /**
   * This class cannot be instantiated.
   */
  private GlobalState() {

  }

  /**
   * Resets the global state.
   */
  public static void reset() {
    agentTypes = new AObjectCatalog("agentTypes", 5, 5);
    goalTypes = new AObjectCatalog("goalTypes", 10, 5);
    planTypes = new AObjectCatalog("planTypes", 20, 5);
    agents = null;
    beliefbase = null;
    eventHandlers = new HashSet<JillExtension>();
  }
}
