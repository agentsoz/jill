package agentsoz.jill.core.testprogram;

import java.util.HashMap;

import agentsoz.jill.lang.Agent;
import agentsoz.jill.lang.Goal;
import agentsoz.jill.lang.Plan;
import agentsoz.jill.lang.PlanInfo;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2015 by its authors. See AUTHORS file.
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

@PlanInfo(postsGoals={}) 
public class Plan10 extends Plan {

	public Plan10(Agent agent, Goal goal, String name) {
		super(agent, goal, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean context() {
		return true;
	}

	@Override
	public void setPlanVariables(HashMap<String, Object> vars) {
		// TODO Auto-generated method stub
		
	} 
}
