package mobss.struct;

/*
 * #%L
 * MOBSS, Masses of BDI-agents for Social Simulation
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

import mobss.config.GlobalConstant;
import mobss.util.AString;

public class AObject {
	

	private int id = GlobalConstant.NULLID;
	private byte[] name;

	public AObject(String str) {
		this.name = AString.toBytes(str);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return AString.toString(name);
	}

	public void setName(String str) {
		this.name = AString.toBytes(str);
	}

	public String toString() {
		return AString.toString(name) + ":" + id;
	}
	
	public static boolean isNameEqual(AObject obj1, AObject obj2) {
		// Not equal if the names are null, or empty, or not the same size
		if (obj1.name == null || 
				obj2.name == null || 
				obj1.name.length != obj2.name.length ||
				obj1.name.length == 0) {  
			return false;
		}
		// Not equal if any name character is different
		for (int i = 0; i < obj1.name.length; i++) {
			if (obj1.name[i] != obj2.name[i]) {
				return false;
			}
		}
		// Else equal
		return true;
	}

}
