package io.github.agentsoz.jill.core;

import io.github.agentsoz.jill.Main;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2018 by its authors. See AUTHORS file.
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

import io.github.agentsoz.jill.core.GlobalState;
import io.github.agentsoz.jill.lang.Agent;
import io.github.agentsoz.jill.lang.AgentInfo;
import io.github.agentsoz.jill.lang.Goal;
import io.github.agentsoz.jill.lang.GoalInfo;
import io.github.agentsoz.jill.lang.JillExtension;
import io.github.agentsoz.jill.lang.Plan;
import io.github.agentsoz.jill.lang.PlanInfo;
import io.github.agentsoz.jill.struct.AgentType;
import io.github.agentsoz.jill.struct.GoalType;
import io.github.agentsoz.jill.struct.PlanType;
import io.github.agentsoz.jill.util.AObjectCatalog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;



public final class ProgramLoader {

  private static final Logger logger = LoggerFactory.getLogger(Main.LOGGER_NAME);

  private static final String knowsNothing =
      "annotation. Without it, the BDI execution engine does not know anything ";


  /**
   * This class cannot be instantiated.
   */
  private ProgramLoader() {

  }

  /**
   * Creates a given number of agents of a given Class, and adds the newly created agents to the
   * given store.
   * 
   * @param className the fully qualified Java classname for the agents begin created
   * @param num the number of agents (class instances) to create
   * @param agents the store to which these agents should be added
   * @return true if agents were successfully created and added, false otherwise
   */
  public static boolean loadAgent(String className, int num, AObjectCatalog agents) {

    // Load the Agent class
    Class<?> aclass = loadClass(className, Agent.class);
    if (aclass == null) {
      return false;
    }

    // Save this agent type to the catalog of known agent types
    AgentType atype = new AgentType(className);
    atype.setAgentClass(aclass);
    GlobalState.agentTypes.push(atype);

    // Find the goals that this agent has
    String[] goals = getGoalsFromAgentInfoAnnotation(aclass);
    if (goals.length == 0) {
      return false;
    }

    // First pass: get the goals and their plans (flat goal-plan list)
    loadGoalPlanNodes(atype, goals);

    // Second pass: complete the goal-plan hierarchy
    completeGoalPlanHierarchy();

    // Now create the specified number of instances of this agent type
    createAgentsInCatalog(agents, atype, aclass, num);

    // return success
    return true;
  }

  private static boolean loadGoalPlanNodes(AgentType atype, String[] goals) {
    for (int i = 0; i < goals.length; i++) {
      // Load the Goal class
      Class<?> gclass = loadClass(goals[i], Goal.class);
      if (gclass == null) {
        return false;
      }
      // Found the goal class, so add this goal to the catalog of known goal types
      GoalType gtype = new GoalType(gclass.getName());
      gtype.setGoalClass(gclass);
      GlobalState.goalTypes.push(gtype);
      atype.addGoal((byte) gtype.getId());
      // Find the plans that this goal has
      String[] plans = getPlansFromGoalsInfoAnnotation(gclass);
      if (plans.length == 0) {
        return false;
      }
      // Process the plans
      if (!processPlansForGoal(gtype, plans)) {
        return false;
      }
    }
    return true;
  }

  /**
   * Loads the given plan classes and sets up parent-child links with the given goal type.
   * 
   * @param gtype the goal for which the list of plans is provided
   * @param plans list of plans to be loaded
   * @return true if successful, false otherwise
   */
  private static boolean processPlansForGoal(GoalType gtype, String[] plans) {
    for (int j = 0; j < plans.length; j++) {
      // Load the Plan class
      Class<?> pclass = loadClass(plans[j], Plan.class);
      if (pclass == null) {
        return false;
      }
      // Found the plan class, so add this plan to the catalog of known plan types
      logger.info("Found Plan " + pclass.getName() + " that handles Goal " + gtype.getName());
      PlanType ptype = new PlanType(pclass.getName());
      ptype.setPlanClass(pclass);
      GlobalState.planTypes.push(ptype);
      // Set up the parent/child links between them (makings of a goal-plan tree)
      ptype.addParent((byte) gtype.getId());
      gtype.addChild((byte) ptype.getId());
    }
    return true;
  }

  /**
   * Completes the Goal-Plan hierarchy linkages between all {@link GlobalState#goalTypes} and
   * {@link GlobalState#planTypes}.
   * 
   * @return true if successful, false otherwise
   */
  private static boolean completeGoalPlanHierarchy() {
    for (int i = 0; i < GlobalState.planTypes.size(); i++) {
      PlanType ptype = (PlanType) GlobalState.planTypes.get(i);
      String[] postsGoals = getGoalsFromPlanInfoAnnotation(ptype.getPlanClass());
      // A @PlanInfo is optional, and only present if this plan posts goals
      if (postsGoals == null) {
        continue;
      }
      // But if @PlanInfo was given then it cannot be incomplete
      if (postsGoals.length == 0) {
        return false;
      }
      // All good, so find the goals that this plan posts and set up the Goal-Plan tree links
      for (String goalname : postsGoals) {
        GoalType gtype = (GoalType) GlobalState.goalTypes.find(goalname);
        if (gtype == null) {
          logger.error("Plan " + ptype.getName() + " posts goal " + goalname
              + "which is not a known goal type.");
          return false;
        }
        // Found a goal posted by the plan, so setup the parent-child links
        ptype.addChild((byte) gtype.getId());
        gtype.addParent((byte) ptype.getId());
      }
    }
    return true;
  }

  /**
   * Creates the specified number of agent instances of the given type and adds them to the catalog.
   * 
   * @param agents the catalog to add agents to
   * @param atype the type of agents to create
   * @param aclass the class of that agent type
   * @param num the number of instances of that agent (class) to create
   */
  private static void createAgentsInCatalog(AObjectCatalog agents, AgentType atype, Class<?> aclass,
      int num) {
    int added = 0;
    try {
      for (int i = 0; i < num; i++) {
        // Create a new instance (name prefix 'a' for agents)
        Agent agent =
            (Agent) (aclass.getConstructor(String.class).newInstance("a" + Integer.toString(i)));
        // Assign the static goal plan tree hierarchy to this instance
        agent.setGoals(atype.getGoals());
        // Add this instance to the catalog of agent instances
        agents.push(agent);
        added++;
      }
      logger.info("Finished loading {} agents", added);

    } catch (NoSuchMethodException | SecurityException | InstantiationException
        | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
      logger.error("Could not create instance of class " + aclass.getName());
    }

  }

  /**
   * Gets the list of goals specified in the @AgentInfo annotation of the given agent class.
   * 
   * @param aclass the agent class containing the @AgentInfo annotation
   * @return list of goals specified in the @AgentInfo annotation, or an empty array if unsuccessful
   */
  private static String[] getGoalsFromAgentInfoAnnotation(Class<?> aclass) {
    // Find the goals that this agent has
    Annotation annotation = aclass.getAnnotation(AgentInfo.class);
    if (annotation == null) {
      logger.error("Agent " + aclass.getName() + " is missing the "
          + "@AgentInfo(hasGoals={\"package.GoalClass1, package.GoalClass2, ...\"}) " + knowsNothing
          + "about this agent's goals and plans.");
      return new String[0];
    }
    AgentInfo ainfo = (AgentInfo) annotation;
    String[] goals = ainfo.hasGoals();
    if (goals.length == 0) {
      logger.error("Agent " + aclass.getName()
          + " does not have any goals defined. Was expecting something like "
          + "@AgentInfo(hasGoals={\"package.GoalClass1, package.GoalClass2, ...\"}) " + knowsNothing
          + "about this agent's goals and plans.");
    }
    return goals;
  }

  /**
   * Gets the list of plans specified in the @GoalInfo annotation of the given goal class.
   * 
   * @param gclass the goal class containing the @GoalInfo annotation
   * @return list of plans specified in the @GoalInfo annotation, or an empty array if unsuccessful
   */
  private static String[] getPlansFromGoalsInfoAnnotation(Class<?> gclass) {
    // Find the plans that this goal has
    Annotation annotation = gclass.getAnnotation(GoalInfo.class);
    if (annotation == null) {
      logger.error("Goal " + gclass.getName() + " is missing the "
          + "@GoalInfo(hasPlans={\"package.PlanClass1, package.PlanClass2, ...\"}) " + knowsNothing
          + "about which plans can handle this goal.");
      return new String[0];
    }
    GoalInfo ginfo = (GoalInfo) annotation;
    String[] plans = ginfo.hasPlans();
    if (plans.length == 0) {
      logger.error("Goal " + gclass.getName()
          + " does not have any plans defined. Was expecting something like "
          + "@GoalInfo(hasPlans={\"package.PlanClass1, package.PlanClass2, ...\"}) " + knowsNothing
          + "about which plans can handle this goal.");
    }
    return plans;
  }

  /**
   * Gets the list of goals specified in the @PlanInfo annotation of the given plan class.
   * 
   * @param pclass the plan class containing the @PlanInfo annotation
   * @return list of goals specified in the @PlanInfo annotation; or null if the annotioan was not
   *         present; or an empty array if the annotation has errors
   */
  private static String[] getGoalsFromPlanInfoAnnotation(Class<?> pclass) {
    Annotation annotation = pclass.getAnnotation(PlanInfo.class);
    PlanInfo pinfo = (PlanInfo) annotation;
    // A @PlanInfo is optional, and only present if this plan posts goals
    if (pinfo == null) {
      return null;
    }
    String[] postsGoals = pinfo.postsGoals();
    if (postsGoals.length == 0) {
      logger.error("Plan " + pclass.getName() + " has incomplete "
          + "@PlanInfo(postsGoals={\"package.GoalClass1\", \"package.GoalClass2\", ...})) "
          + "annotation");
    } else {
      logger.info("Plan " + pclass.getName() + " posts " + postsGoals.length + " goals");
    }
    return postsGoals;
  }

  /**
   * Loads the class of given name and type.
   * 
   * @param className the fully qualified class name
   * @param classType the class type to check against
   * @return the loaded class, or null if unsuccessful
   */
  private static Class<?> loadClass(String className, Class<?> classType) {
    Class<?> aclass = null;
    try {
      aclass = Class.forName(className);
    } catch (ClassNotFoundException e) {
      logger.error("Class not found: " + className, e);
      return null;
    }
    if (!classType.isAssignableFrom(aclass)) {
      logger.error("Class '" + className + "' is not of type " + classType.getName());
      return null;
    }
    logger.info("Found class " + className + " of type " + classType.getName());
    return aclass;
  }

  /**
   * Loads a Jill extension.
   * 
   * @param className the fully qalified Java classname of the extension
   * @return an instance of the Jill extension class
   */
  public static JillExtension loadExtension(String className) {
    JillExtension extension = null;
    Class<?> eclass;
    try {
      // Check that we have the extension class, else abort
      eclass = Class.forName(className);
      if (!JillExtension.class.isAssignableFrom(eclass)) {
        logger
            .error("Class '" + className + "' does not implement " + JillExtension.class.getName());
        return null;
      }
      logger.info("Loading extension " + className);
      extension = (JillExtension) (eclass.newInstance());
    } catch (ClassNotFoundException | SecurityException | InstantiationException
        | IllegalAccessException | IllegalArgumentException e) {
      logger.error("Could not load extension " + className, e);
    }
    return extension;
  }
}
