package agentsoz.jill.util;

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

public class BitVector {

	private int initsize;
	private int growSizeInInts;
	private int[] bits; // Java ints are 32-bits
	
	public BitVector() {
		this(1024, 256); 
	}
	
	public BitVector(int initialSizeInBits, int growSizeinBits) {
		initsize = (initialSizeInBits < 0) ? 0 : initialSizeInBits;
		int sizeInInts = (initsize/32)+1;
		bits = new int[sizeInInts];
		this.growSizeInInts = (growSizeinBits/32)+1;
	}

	public void setBit(int bit, boolean val) {
		int arrIndex = bit/32;
		if (bits.length <= arrIndex) {
			grow((arrIndex+1)-bits.length);
		}
		int bitIndex = bit%32;
		int mask = ~(1 << bitIndex) & 0xffffffff;
		int state = ((val) ? 1 : 0) << bitIndex;
			bits[arrIndex] &= mask; // clear the bit
			bits[arrIndex] |= state; // set the bit
	}
	
	public boolean isSet(int bit) {
		int arrIndex = bit/32;
		if (bits.length <= arrIndex) {
			return false;
		}
		int bitIndex = bit%32;
		int mask = 1 << bitIndex;
		int state = (bits[arrIndex] & mask) >> bitIndex;
		return (state == 1);
	}

	
	/**
	 * Grow to given size
	 */
	private void grow(int byInts) {
		// Grow by at least growSizeInInts
		int sizeInInts = bits.length+ ((byInts > growSizeInInts) ? byInts : growSizeInInts);
 		int[] temp = new int[sizeInInts];
		System.arraycopy(bits, 0, temp, 0, bits.length);
		bits = temp;
	}
	
	public String toString() {
		String s = "";
		for (int i = 0; i < bits.length; i++) {
			s += Integer.toHexString(bits[i]);
		}
		return s;
	}
}
