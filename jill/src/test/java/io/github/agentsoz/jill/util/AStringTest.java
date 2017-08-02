package io.github.agentsoz.jill.util;

/*
 * #%L Jill Cognitive Agents Platform %% Copyright (C) 2014 - 2017 by its authors. See AUTHORS file.
 * %% This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public License along with this program.
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>. #L%
 */

import static org.junit.Assert.*;
import io.github.agentsoz.jill.util.AString;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AStringTest {

  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}

  @Test
  public void testToBytesNullString() {
    assertNull(AString.toBytes(null));
  }

  @Test
  public void testToBytesEmptyString() {
    byte[] result = AString.toBytes("");
    byte[] expected = {};
    assertNotNull(result);
    assertArrayEquals(expected, result);
  }

  @Test
  public void testToBytesABC() {
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
  public void testToStringByteArrayABC() {
    byte[] bytes = {0x41, 0x42, 0x43};
    String result = AString.toString(bytes);
    String expected = "ABC";
    assertNotNull(result);
    assertEquals(expected, result);
  }
}
