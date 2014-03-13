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
