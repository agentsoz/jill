/*
    MocaBDI, millions of cognitive (BDI) agents
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

public class GPType extends AObject{

	private byte[] parents;
	private byte[] children;
	
	public GPType(String str) {
		super(str);
	}

	public int[] getParents() {
		int[] ints = new int[parents.length];
		for (int i = 0; i < ints.length; i++) {
			ints[i] = (int)(parents[i]);
		}
		return ints;
	}

	public void addParent(int parent) {
		parents = grow(parents,1);
		parents[parents.length-1] = (byte)(parent & 0x000f);
	}

	
	public int[] getChildren() {
		int[] ints = new int[children.length];
		for (int i = 0; i < ints.length; i++) {
			ints[i] = (int)(children[i]);
		}
		return ints;
	}

	public void addChild(int child) {
		children = grow(children,1);
		children[children.length-1] = (byte)(child & 0x000f);
	}


	public static byte[] grow(byte[] bytes, int increment) {
		if (bytes == null) {
			return new byte[1];
		}
 		byte[] temp = new byte[bytes.length+increment];
		System.arraycopy(bytes, 0, temp, 0, bytes.length);
		return temp;
	}


}
