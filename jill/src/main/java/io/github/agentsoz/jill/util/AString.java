package io.github.agentsoz.jill.util;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2024 by its authors. See AUTHORS file.
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */

import java.io.UnsupportedEncodingException;


/**
 * AString provides utility functions to convert a String object to a byte array for compressed
 * in-memory storage. Storing String objects as a byte array gives very significant memory savings,
 * since String objects have a large memory overhead (an empty String object still takes 128 bytes,
 * but takes no space in byte array format). This comes at the cost of CPU cycles required to
 * convert back to a String object before use, however this processing overhead is very low.
 *
 * @author dsingh
 * @version $Id: $Id
 */
public final class AString {

  /** The java.nio.charset to use for converting to/from byte array */
  private static final String CHARSET = "UTF-8";

  /**
   * This class cannot be instantiated.
   */
  private AString() {
    
  }
  
  /**
   * Encodes the String str into a sequence of bytes using the character set specified in CHARSET,
   * storing the result into a new byte array.
   *
   * @param str the String to convert from
   * @return the new byte array, or null if conversion was unsuccessful
   * @see String#getBytes(String)
   */
  public static byte[] toBytes(String str) {
    if (str == null) {
      return new byte[0];
    }
    byte[] val = null;
    try {
      val = str.getBytes(CHARSET);
    } catch (UnsupportedEncodingException e) { // NOPMD - ignore empty catch
      // Can never occur since CHARSET is correct and final
    }
    return val;
  }

  /**
   * Decodes the byte array bytes into a String using the character set specified in CHARSET,
   * storing the result into a new String.
   *
   * @param bytes the byte array to decode
   * @return the new decoded String, or null if conversion was unsuccessful
   */
  public static String toString(byte[] bytes) {
    if (bytes == null) {
      return null;
    }
    String str = null;
    try {
      str = new String(bytes, CHARSET);
    } catch (UnsupportedEncodingException e) { // NOPMD - ignore empty catch
      // Can never occur since CHARSET is correct and final
    }
    return str;
  }

}
