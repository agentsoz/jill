package agentsoz.jill.core.beliefbase.abs;

public class BitVector {

	private int[] bits; // Java ints are 32-bits
	
	public BitVector() {
		bits = new int[0];
	}

	public void setBit(int bit, boolean val) {
		int arrIndex = bit/32;
		if (bits.length <= arrIndex) {
			grow(arrIndex+1);
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
	private void grow(int size) {
 		int[] temp = new int[size];
		System.arraycopy(bits, 0, temp, 0, bits.length);
		bits = temp;
	}
}
