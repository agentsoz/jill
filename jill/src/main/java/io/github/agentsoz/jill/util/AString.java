package io.github.agentsoz.jill.util;

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

import java.io.UnsupportedEncodingException;

/**
 * AString provides utility functions to convert a String object to a
 * byte array for compressed in-memory storage. Storing String objects as 
 * a byte array gives very significant memory savings, since String 
 * objects have a large memory overhead (an empty String object still takes 
 * 128 bytes, but takes no space in byte array format). This comes at the cost of 
 * CPU cycles required to convert back to a String object before use, however 
 * this processing overhead is very low.
 *   
 * @author dsingh
 *
 */
public class AString {
	
	/** The java.nio.charset to use for converting to/from byte array*/
	private static final String CHARSET = "UTF-8";
	
	/**
	 * Encodes the String str into a sequence of bytes using the character set
	 * specified in CHARSET, storing the result into a new byte array.
	 * 
	 * @param str the String to convert from
	 * @return the new byte array, or null if conversion was unsuccessful 
	 * @see String#getBytes(String)
	 */
	public static byte[] toBytes(String str) {
		if (str == null) {
			return null;
		}
		try {
			return str.getBytes(CHARSET);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Decodes the byte array bytes into a String using the character set
	 * specified in CHARSET, storing the result into a new String.
	 * 
	 * @param bytes the byte array to decode
	 * @return the new decoded String, or null if conversion was unsuccessful
	 */
	public static String toString(byte[] bytes) {
		if (bytes == null) {
			return null;
		}
		try {
			return new String(bytes, CHARSET);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}

}
