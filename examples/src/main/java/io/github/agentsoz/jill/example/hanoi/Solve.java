package io.github.agentsoz.jill.example.hanoi;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2017 by its authors. See AUTHORS file.
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

import io.github.agentsoz.jill.lang.Goal;
import io.github.agentsoz.jill.lang.GoalInfo;

@GoalInfo(hasPlans={"io.github.agentsoz.jill.example.hanoi.MoveTower"})
public class Solve extends Goal {

	public int disc;
	public int src;
	public int dest;
	public int spare;
	
	public Solve(String str) {
		super(str);
	}
	
	public Solve(String str, int disc, int src, int dest, int spare) {
		this(str);
		this.disc = disc;
		this.src = src;
		this.dest = dest;
		this.spare = spare;
	}

	public String toString() {
		return "solve(disc="+disc+", src="+src+", dest="+dest+", spare="+spare+")";
	}
	
}
