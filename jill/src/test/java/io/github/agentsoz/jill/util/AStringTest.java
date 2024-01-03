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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class AStringTest {

  @Test
  public void testToBytesNullString() {
    byte[] result = AString.toBytes(null);
    byte[] expected = {};
    assertNotNull(result);
    assertArrayEquals(expected, result);
  }

  @Test
  public void testToBytesEmptyString() {
    byte[] result = AString.toBytes("");
    byte[] expected = {};
    assertNotNull(result);
    assertArrayEquals(expected, result);
  }

  @Test
  public void testToBytesStrgin() {
    byte[] result = AString.toBytes("ABC");
    byte[] expected = {0x41, 0x42, 0x43};
    assertNotNull(result);
    assertArrayEquals(expected, result);
  }

  @Test
  public void testToStringByteArrayNull() {
    assertNull(AString.toString(null));
  }

  @Test
  public void testToStringByteArrayEmpty() {
    byte[] bytes = {};
    String result = AString.toString(bytes);
    String expected = "";
    assertNotNull(result);
    assertEquals(expected, result);
  }

  @Test
  public void testToStringByteArray() {
    byte[] bytes = {0x41, 0x42, 0x43};
    String result = AString.toString(bytes);
    String expected = "ABC";
    assertNotNull(result);
    assertEquals(expected, result);
  }
}
