package io.github.agentsoz.jill.core.beliefbase;

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

import io.github.agentsoz.jill.struct.AObject;

import java.util.Arrays;

import com.google.gson.Gson;

public class BeliefSet extends AObject {

	private BeliefSetField[] fields;
	
	public BeliefSet(int id, String name, BeliefSetField[] fields) {
		super(name);
		setId(id);
		this.fields = fields;
	}

	
	/**
	 * @return the fields
	 */
	public BeliefSetField[] getFields() {
		return fields;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(fields);
		result = prime * result + getName().hashCode();
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof BeliefSet)) {
			return false;
		}
		BeliefSet other = (BeliefSet) obj;
		if (!Arrays.equals(fields, other.fields)) {
			return false;
		}
		if (!getName().equals(other.getName())) {
			return false;
		}
		return true;
	}

	public String toString() {
		return new Gson().toJson(this);
	}
}
