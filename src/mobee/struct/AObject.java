package mobee.struct;

import mobee.config.GlobalConstant;
import mobee.util.AString;

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
