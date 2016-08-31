package io.github.agentsoz.jill.lang;

import java.util.HashMap;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2016 by its authors. See AUTHORS file.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import io.github.agentsoz.jill.config.GlobalConstant;
import io.github.agentsoz.jill.config.GlobalConstant.PlanSelectionPolicy;
import io.github.agentsoz.jill.core.beliefbase.Belief;
import io.github.agentsoz.jill.core.beliefbase.BeliefBaseException;
import io.github.agentsoz.jill.core.beliefbase.abs.ABeliefStore;
import io.github.agentsoz.jill.util.Log;

/**
 * Stores the set of bindings for a given plan type, 
 * and used for meta level reasoning. 
 * @author dsingh
 *
 */
public class PlanBindings {

	private LinkedHashMap<Plan, LinkedHashSet<Belief>> bindings;
	int cachedsize;
	private Random rand;
	

	public PlanBindings(Random rand) {
		this.rand = rand;
		bindings = new LinkedHashMap<Plan, LinkedHashSet<Belief>>();
		cachedsize = 0;
	}
	
	/** 
	 * Add the set of bindings for a given plan to this store.
	 * @param plan
	 * @param planBindings
	 */
	public void add(Plan plan, LinkedHashSet<Belief> planBindings) {
		this.bindings.put(plan, planBindings);
		if (planBindings == null || planBindings.isEmpty()) {
			cachedsize++;
		} else {
			cachedsize += planBindings.size();
		}
	}
	
	/**
	 * Returns a set of plan types that have bindings.
	 * For each plan type there may be various bindings which can be retrieved
	 * using {@link #getBindings(Plan)}
	 * @return
	 */
	public Set<Plan> getPlans() {
		return bindings.keySet();
	}
	
	/** 
	 * Returns the set of bindings available for the given plan type.
	 * An empty set is representative of plans whose context conditions 
	 * do not bind any variables. A {@code null} set indicates that no 
	 * variable bindings exist for the given plan, as is the case when
	 * the context condition of the plan simply returns true.
	 * @param plan
	 * @return
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
	 * Returns the total number of bindings in this store. 
	 * This is the sum of all plan bindings. Note that plans with no bindings
	 * are counted as 1.
	 * @return
	 */
	public int size() {
		return cachedsize;
	}

	/**
	 * Gets the plan binding at the given index, where 0 <= index < size 
	 * returned by {@link #size()}. The returned plan contains the variable 
	 * bindings.
	 * @param index
	 * @return
	 */
	public Plan get(int index) {
		int i = 0;
		for (Plan plan : bindings.keySet()) {
			HashSet<Belief> vars = bindings.get(plan);
			boolean bindingsExist = (vars != null && !vars.isEmpty());
			i += bindingsExist ? vars.size() : 1;
			if (i <= index) {
				continue;
			}
			if (bindingsExist) {
				setPlanVariables(plan.getAgent(), plan, vars, index-(i-vars.size()));
			}
			return plan;
		}
		return null;
	}
	
	public Plan get(PlanSelectionPolicy policy) {
		Plan plan = null;
		HashSet<Belief> vars = null;
		boolean bindingsExist = false;
		int index = 0;
		switch(policy) {
		case FIRST: case LAST:
			Plan[] plans = bindings.keySet().toArray(new Plan[0]);
			plan = (policy == PlanSelectionPolicy.FIRST) ? plans[0] : plans[plans.length-1];
			index = (policy == PlanSelectionPolicy.FIRST) ? 0 : plans.length - 1;
			vars = bindings.get(plan);
			bindingsExist = (vars != null && !vars.isEmpty());
			
			break;
		case RANDOM:
			index = selectIndex(size(), GlobalConstant.PLAN_SELECTION_POLICY);
			int i = 0;
			for (Plan p : bindings.keySet()) {
				vars = bindings.get(p);
				bindingsExist = (vars != null && !vars.isEmpty());
				i += bindingsExist ? vars.size() : 1;
				if (i <= index) {
					continue;
				}
				plan = p;
				if (bindingsExist) {
					index = index-(i-vars.size());
				}
				break;
			}
			break;
		}
		if (bindingsExist) {
			setPlanVariables(plan.getAgent(), plan, vars, index);
		}

		return plan;
	}
	
	
	/**
	 * Selects an index in the range 0 .. size-1, based on the plan selection 
	 * policy {@link GlobalConstant#PLAN_SELECTION_POLICY}
	 * 
	 * @param size
	 * @param policy
	 * @return
	 */
	private final int selectIndex(int size, PlanSelectionPolicy policy) {
		assert(size>=0);
		int choice = 0;
		switch (policy) {
		case FIRST:
			choice = 0;
			break;
		case RANDOM:
			choice = rand.nextInt(size);
			break;
		case LAST:
			choice = (size>0) ? size-1 : 0;
			break;
		};
		return choice;
	}

	
	private final void setPlanVariables(Agent agent, Plan planInstance, HashSet<Belief> results, int choice ) {
		assert(agent != null && planInstance != null & results != null);
		assert (choice >= 0 && choice < results.size());
		HashMap<String, Object> vars= new HashMap<String, Object>();
		Belief belief = null;
		int index = 0;
		for (Belief b : results) {
			if (index == choice) {
				belief = b;
				break;
			}
			index++;
		}
		Object[] tuple = belief.getTuple();
		assert(tuple != null);
		index = 0;
		for (Object o : belief.getTuple()) {
			try {
				String fieldname = ABeliefStore.getFieldName(agent.getId(), belief.getBeliefset(), index);
				vars.put(fieldname, o);
			} catch (BeliefBaseException e) {
				Log.error("Agent "+agent.getId()+" could not retrive belief set field: " + e.getMessage());
			}
			index++;
		}
		planInstance.setPlanVariables(vars);
	}

	
}
