package agentsoz.jill.example.greeter;

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

import com.googlecode.cqengine.attribute.Attribute;
import com.googlecode.cqengine.attribute.SimpleAttribute;
import com.googlecode.cqengine.query.option.QueryOptions;

public class Neighbour {

	private String name;
	public enum Gender {Male, Female};
	private Gender gender;
	private int houseNumber;

	public Neighbour(String name, Gender gender, int houseNumber) {
		this.name = name;
		this.gender = gender;
		this.houseNumber = houseNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public static final Attribute<Neighbour, String> NAME = new SimpleAttribute<Neighbour, String>("neighbour_name") {
        public String getValue(Neighbour n, QueryOptions queryOptions) { return n.getName(); }
    };
	public static final Attribute<Neighbour, Gender> GENDER = new SimpleAttribute<Neighbour, Gender>("neighbour_gender") {
        public Gender getValue(Neighbour n, QueryOptions queryOptions) { return n.getGender(); }
    };
	public static final Attribute<Neighbour, Integer> HOUSENUMBER = new SimpleAttribute<Neighbour, Integer>("neighbour_housenumber") {
        public Integer getValue(Neighbour n, QueryOptions queryOptions) { return n.getHouseNumber(); }
    };
}

