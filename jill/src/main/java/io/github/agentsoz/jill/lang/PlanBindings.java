package io.github.agentsoz.jill.lang;


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

import io.github.agentsoz.jill.config.GlobalConstant.PlanSelectionPolicy;
import io.github.agentsoz.jill.core.beliefbase.Belief;
import io.github.agentsoz.jill.core.beliefbase.BeliefBaseException;
import io.github.agentsoz.jill.core.beliefbase.abs.ABeliefStore;
import io.github.agentsoz.jill.util.Log;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;


/**
 * Stores the set of bindings for a given plan type, and used for meta level reasoning.
 * 
 * @author dsingh
 *
 */
public class PlanBindings {

  private final Map<Plan, Set<Belief>> bindings;
  private int cachedsize;
  private final Random rand;


  /**
   * Creates a new plan binding.
   * 
   * @param rand the random number generator to use for when selecting plan instances with
   *        {@link PlanSelectionPolicy#RANDOM} policy
   */
  public PlanBindings(Random rand) {
    this.rand = (rand == null) ? new Random() : rand;
    bindings = new LinkedHashMap<Plan, Set<Belief>>();
    cachedsize = 0;
  }

  /**
   * Add the set of bindings for a given plan to this store. Any previously stored bindings for this
   * plan will be replaced.
   * 
   * @param plan the plan type
   * @param planBindings the available bindings
   */
  public void add(Plan plan, Set<Belief> planBindings) {
    if (plan == null) {
      return;
    }
    // remove any old bindings, making sure to decrement the cached size
    if (this.bindings.containsKey(plan)) {
      Set<Belief> oldBindings = this.bindings.remove(plan);
      if (oldBindings == null || oldBindings.isEmpty()) {
        cachedsize--;
      } else {
        cachedsize -= oldBindings.size();
      }
    }
    // add this binding and update the cached size
    this.bindings.put(plan, planBindings);
    if (planBindings == null || planBindings.isEmpty()) {
      cachedsize++;
    } else {
      cachedsize += planBindings.size();
    }
  }

  /**
   * Returns a set of plan types that have bindings. For each plan type there may be various
   * bindings which can be retrieved using {@link #getBindings(Plan)}
   * 
   * @return set of plan types
   */
  public Set<Plan> getPlans() {
    return bindings.keySet();
  }

  /**
   * Returns the set of bindings available for the given plan type. An empty set is representative
   * of plans whose context conditions do not bind any variables. A {@code null} set indicates that
   * no variable bindings exist for the given plan, as is the case when the context condition of the
   * plan simply returns true.
   * 
   * @param plan the plan type
   * @return set of available bindings for this plan type
   */
  public Set<Belief> getBindings(Plan plan) {
    return bindings.get(plan);
  }

  /**
   * Clears all plan bindings from this store.
   */
  public void clear() {
    bindings.clear();
    cachedsize = 0;
  }

  /**
   * Returns the total number of bindings in this store. This is the sum of all plan bindings. Note
   * that plans with no bindings are counted as 1.
   * 
   * @return the number of bindings in this store
   */
  public int size() {
    return cachedsize;
  }

  /*
   * Gets the plan binding at the given index, where 0 &lt;= index &lt; size returned by {@link
   * #size()}. The returned plan contains the variable bindings.
   * 
   * @param index the index of the bound plan instance to retrieve
   * 
   * @return the plan instance at this index
   */
  /*
   * public Plan get(int index) { int i = 0; for (Plan plan : bindings.keySet()) { HashSet<Belief>
   * vars = bindings.get(plan); boolean bindingsExist = (vars != null && !vars.isEmpty()); i +=
   * bindingsExist ? vars.size() : 1; if (i <= index) { continue; } if (bindingsExist) {
   * setPlanVariables(plan.getAgent(), plan, vars, index-(i-vars.size())); } return plan; } return
   * null; }
   */

  /**
   * Selects a plan instance from the set of plan bindings, using the given policy.
   * 
   * @param policy the policy to use for plan selection
   * @return the selected plan, or {@code null} if something went wrong
   */
  public Plan selectPlan(PlanSelectionPolicy policy) {
    Plan plan = null;
    int index = 0;
    switch (policy) {
      case FIRST:
      case LAST:
        Plan[] plans = bindings.keySet().toArray(new Plan[0]);
        plan = (policy == PlanSelectionPolicy.FIRST) ? plans[0] : plans[plans.length - 1];
        index = (policy == PlanSelectionPolicy.FIRST) ? 0 : plans.length - 1;
        setPlanVariables(plan.getAgent(), plan, bindings.get(plan), index);
        break;
      case RANDOM:
        plan = selectPlanAtRandom();
        break;
      default:
        // TODO: ignore remaining polic
        break;
    }
    return plan;
  }

  /**
   * Selects a plan instance at random from the set of plan bindings.
   * 
   * @return a randomly selected plan instance, or null if ther are no bindings to choose from
   */
  private Plan selectPlanAtRandom() {
    Plan plan = null;
    Set<Belief> vars = null;
    int index = rand.nextInt(size());
    int idx = 0;
    boolean bindingsExist = false;
    for (Plan p : bindings.keySet()) {
      vars = bindings.get(p);
      bindingsExist = (vars != null && !vars.isEmpty());
      idx += bindingsExist ? vars.size() : 1;
      if (idx > index) {
        plan = p;
        if (bindingsExist) {
          index = index - (idx - vars.size());
          setPlanVariables(plan.getAgent(), plan, vars, index);
        }
        break;
      }
    }
    return plan;
  }

  /**
   * Sets the plan instance variables using the given results set.
   * 
   * @param agent the agent for which this operation applies
   * @param planInstance the plan instance that is to be populated
   * @param results the beliefs set representing all plan bindings
   * @param choice index of the belief that is to be used to populate the plan instance variables
   */
  private final void setPlanVariables(Agent agent, Plan planInstance, Set<Belief> results,
      int choice) {
    if (agent == null || planInstance == null) {
      return;
    }
    Belief belief = getResultAtIndex(results, choice);
    if (belief == null) {
      return;
    }
    Object[] tuple = belief.getTuple();
    if (tuple == null) {
      return;
    }
    int index = 0;
    HashMap<String, Object> vars = new HashMap<String, Object>();
    for (Object o : belief.getTuple()) {
      try {
        String fieldname = ABeliefStore.getFieldName(agent.getId(), belief.getBeliefset(), index);
        vars.put(fieldname, o);
      } catch (BeliefBaseException e) {
        Log.error(
            "Agent " + agent.getId() + " could not retrive belief set field: " + e.getMessage());
      }
      index++;
    }
    planInstance.setPlanVariables(vars);
  }

  /**
   * Gets the result at the given index from the results set.
   * 
   * @param results results set (implementation must support predictable iteration order)
   * @param index the index within the set {@code (0 < index < results.size())} to retrieve
   * @return the result at the given index, or null if there was an error
   */
  private Belief getResultAtIndex(Set<Belief> results, int index) {
    Belief belief = null;
    if (!(results == null || index < 0 || index >= results.size())) {
      int idx = 0;
      for (Belief b : results) {
        if (idx == index) {
          belief = b;
          break;
        }
        idx++;
      }
    }
    return belief;
  }

}
