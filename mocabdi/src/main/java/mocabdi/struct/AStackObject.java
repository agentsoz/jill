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


package mocabdi.struct;

import mocabdi.config.GlobalConstant;

public class AStackObject {
	

	private byte id = GlobalConstant.NULLID;

	public AStackObject() {
	}
	
	public int getId() {
		return id;
	}

	public void setId(byte id) {
		this.id = id;
	}
}
