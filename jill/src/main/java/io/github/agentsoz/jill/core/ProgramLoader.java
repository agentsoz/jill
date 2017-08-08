package io.github.agentsoz.jill.core;

import io.github.agentsoz.jill.Main;

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
    Class<?> aclass;
    try {
      // Check that we have an Agent class, else abort
      aclass = Class.forName(className);
      if (!Agent.class.isAssignableFrom(aclass)) {
        logger.error("Class '" + className + "' does not extend " + Agent.class.getName());
        return false;
      }
      logger.info("Found class " + className + " of type " + Agent.class.getName());
      // Save this agent type to the catalog of known agent types
      AgentType atype = new AgentType(className);
      atype.setAgentClass(aclass);
      GlobalState.agentTypes.push(atype);

      // Find the goals that this agent has
      Annotation annotation = aclass.getAnnotation(AgentInfo.class);
      if (annotation == null) {
        logger.error("Agent " + className + " is missing the "
            + "@AgentInfo(hasGoals={\"package.GoalClass1, package.GoalClass2, ...\"}) "
            + knowsNothing + "about this agent's goals and plans.");
        return false;
      }
      AgentInfo ainfo = (AgentInfo) annotation;
      String[] goals = ainfo.hasGoals();
      if (goals.length == 0) {
        logger.error(
            "Agent " + className + " does not have any goals defined. Was expecting something like "
                + "@AgentInfo(hasGoals={\"package.GoalClass1, package.GoalClass2, ...\"}) "
                + knowsNothing + "about this agent's goals and plans.");
        return false;
      }

      // First pass: get the goals and their plans (flat goal-plan list)
      for (int i = 0; i < goals.length; i++) {
        Class<?> gclass = Class.forName(goals[i]);
        // Abort if the specified goal is not of type Goal
        if (!Goal.class.isAssignableFrom(gclass)) {
          logger.error("Agent " + className + " uses " + goals[i] + " which is not of type Goal.");
          return false;
        }
        // Found the goal class, so add this goal to the catalog of known goal types
        logger.info("Found class '" + gclass.getName() + "' of type " + Goal.class.getName());
        GoalType gtype = new GoalType(gclass.getName());
        gtype.setGoalClass(gclass);
        GlobalState.goalTypes.push(gtype);
        atype.addGoal((byte) gtype.getId());

        // Find the plans that this goal has
        annotation = gclass.getAnnotation(GoalInfo.class);
        if (annotation == null) {
          logger.error("Goal " + gclass.getName() + " is missing the "
              + "@GoalInfo(hasPlans={\"package.PlanClass1, package.PlanClass2, ...\"}) "
              + knowsNothing + "about which plans can handle this goal.");
          return false;
        }
        GoalInfo ginfo = (GoalInfo) annotation;
        String[] plans = ginfo.hasPlans();
        if (plans.length == 0) {
          logger.error("Goal " + gclass.getName()
              + " does not have any plans defined. Was expecting something like "
              + "@GoalInfo(hasPlans={\"package.PlanClass1, package.PlanClass2, ...\"}) "
              + knowsNothing + "about which plans can handle this goal.");

          return false;
        }

        // Process the plans
        for (int j = 0; j < plans.length; j++) {
          Class<?> pclass = Class.forName(plans[j]);
          // Abort if the specified plan is not of type Plan
          if (!Plan.class.isAssignableFrom(pclass)) {
            logger.error("Goal " + gclass.getName() + " has plan " + pclass.getName()
                + " which is not of type Plan.");
            return false;
          }

          // Found the plan class, so add this plan to the catalog of known plan types
          logger.info("Found Plan " + pclass.getName() + " that handles Goal " + gclass.getName());
          PlanType ptype = new PlanType(pclass.getName());
          ptype.setPlanClass(pclass);
          GlobalState.planTypes.push(ptype);
          // Set up the parent/child links between them (makings of a goal-plan tree)
          ptype.addParent((byte) gtype.getId());
          gtype.addChild((byte) ptype.getId());
        }
      }

      // Second pass: complete the goal-plan hierarchy
      for (int i = 0; i < GlobalState.planTypes.size(); i++) {
        PlanType ptype = (PlanType) GlobalState.planTypes.get(i);
        annotation = ptype.getPlanClass().getAnnotation(PlanInfo.class);
        PlanInfo pinfo = (PlanInfo) annotation;
        // A @PlanInfo is optional, and only present if this plan posts goals
        if (pinfo != null) {
          if (pinfo.postsGoals().length == 0) {
            logger.error("Plan " + ptype.getName() + " has incomplete "
                + "@PlanInfo(postsGoals={\"package.GoalClass1\", \"package.GoalClass2\", ...})) "
                + "annotation");
            return false;
          }

          logger.info("Plan " + ptype.getName() + " posts " + pinfo.postsGoals().length + " goals");
          // Find the goal
          for (String goalname : pinfo.postsGoals()) {
            GoalType gtype = (GoalType) GlobalState.goalTypes.find(goalname);
            if (gtype == null) {
              logger.error("Plan " + ptype.getName() + " posts goal " + goalname
                  + "which is not a known goal type.");
              return false;
            }
            // Found the goal posted by the plan, so setup the links
            ptype.addChild((byte) gtype.getId());
            gtype.addParent((byte) ptype.getId());
          }
        }
      }

      // Now create the specified number of instances of this agent type
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

    } catch (ClassNotFoundException e) {
      logger.error("Class not found: " + className, e);
    }
    
    return true;
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
