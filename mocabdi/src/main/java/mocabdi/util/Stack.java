/*
    MOBSS, Masses of BDI Agents for Social Simulation
    Copyright (C) 2014 Dhirendra Singh

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

    Contact: Dhirendra Singh <dhi.singh@gmail.com>
*/


package mocabdi.util;

import mocabdi.config.GlobalConstant;
import mocabdi.struct.AStackObject;

public class Stack{

	private byte nextid = GlobalConstant.NULLID+1;
	private byte increment;
	private Object[] objects;
	
	public Stack(byte size, byte inc) {
		increment = inc;
		objects = new Object[size];
	}
	
	public Object get(int index) {
		assert(index >= 0 && index < objects.length);
		return objects[index];
	}
			
	public void push(AStackObject obj) {
		assert(obj != null && obj.getId() == GlobalConstant.NULLID);
		// Grow if we are at capacity
		if (nextid == objects.length) {
			grow();
		}
		obj.setId(nextid);
		objects[nextid++] = obj;
	}
	
	public Object pop() {
		if (nextid > GlobalConstant.NULLID) {
			nextid--;
			Object obj = objects[nextid];
			objects[nextid] = null;
			return obj;
		}
		return null;
	}
	
	public int size() {
		return nextid;
	}
	
	/**
	 * Grows the Catalog by a factor of {@link Catalog#DEFAULT_INCREMENT}.
	 */
	private void grow() {
 		Object[] temp = new Object[objects.length+increment];
		System.arraycopy(objects, 0, temp, 0, objects.length);
		objects = temp;
	}
}
