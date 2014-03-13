package mocabdi.util;

import java.io.UnsupportedEncodingException;

public class AString {
	
	public static byte[] toBytes(String str) {
		if (str != null) {
			try {
				return str.getBytes("UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public static String toString(byte[] bytes) {
		try {
			return new String(bytes, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}

}
