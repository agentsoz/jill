package io.github.agentsoz.jill.core;

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

import java.util.HashSet;

import io.github.agentsoz.jill.core.beliefbase.abs.ABeliefStore;
import io.github.agentsoz.jill.lang.JillExtension;
import io.github.agentsoz.jill.util.AObjectCatalog;

/**
 * A catalog of all known agent, goal and plan types
 * 
 * @author dsingh
 *
 */
public class GlobalState {

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
   * The central belief base to store all beliefs of all agents
   */
  public static ABeliefStore beliefbase;

  /**
   * The list of registered external event handlers (jill extensions)
   */
  public static HashSet<JillExtension> eventHandlers = new HashSet<JillExtension>();

  /**
   * Resets the global state
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
