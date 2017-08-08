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
import io.github.agentsoz.jill.util.Stack255;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Stack255Test {

  @Test
  public void testStack() {
    Stack255 s = new Stack255((byte) 0, (byte) 0);
    assertEquals(0, s.size());
    assertEquals(0, s.capacity());
    assertTrue(s.isEmpty());
    assertFalse(s.isFull());

    s = new Stack255((byte) 0, (byte) 255);
    assertEquals(0, s.size());
    assertEquals(0, s.capacity());
    assertTrue(s.isEmpty());
    assertFalse(s.isFull());

    s = new Stack255((byte) 255, (byte) 0);
    assertEquals(0, s.size());
    assertEquals(255, s.capacity());
    assertTrue(s.isEmpty());
    assertFalse(s.isFull());

    s = new Stack255((byte) 255, (byte) 255);
    assertEquals(0, s.size());
    assertEquals(255, s.capacity());
    assertTrue(s.isEmpty());
    assertFalse(s.isFull());
  }

  @Test
  public void testIsEmpty() {
    Stack255 s = new Stack255((byte) 255, (byte) 0);
    assertTrue(s.isEmpty());
    s.push(new Object());
    assertEquals(1, s.size());
    assertFalse(s.isEmpty());
    s.push(new Object());
    assertFalse(s.isEmpty());
    s.pop();
    assertFalse(s.isEmpty());
    s.pop();
    assertTrue(s.isEmpty());
    s.pop();
    assertTrue(s.isEmpty());
  }

  @Test
  public void testIsFull() {
    Stack255 s = new Stack255((byte) 255, (byte) 0);
    for (int i = 0; i < 254; i++) {
      s.push(new Object());
      assertFalse(s.isFull());
    }
    s.push(new Object());
    assertTrue(s.isFull());
  }

  @Test
  public void testSize() {
    Stack255 s = new Stack255((byte) 255, (byte) 0);
    s.pop();
    assertEquals(0, s.size());
    s.pop();
    assertEquals(0, s.size());
    for (int i = 0; i < 255; i++) {
      s.push(new Object());
      assertEquals(i + 1, s.size());
    }
    s.push(new Object());
    assertEquals(255, s.size());
    s.push(new Object());
    assertEquals(255, s.size());
  }

  @Test
  public void testPushPopGet() {
    Stack255 s = new Stack255((byte) 255, (byte) 0);
    // popping an empty stack should return null
    assertEquals(null, s.pop());

    Object[] objects = new Object[255];
    // pushing up to the maximum capacity should succeed
    for (int i = 0; i < 255; i++) {
      objects[i] = new Object();
      assertTrue(s.push(objects[i]));
    }
    // pushing past maximum capacity should fail
    assertFalse(s.push(objects[0]));
    assertFalse(s.push(objects[0]));

    // getting using an invalid index should result in a null object
    assertEquals(null, s.get(-1));
    assertEquals(null, s.get(255));

    // popped objects should match the pushed ones
    for (int i = 254; i >= 0; i--) {
      assertEquals(objects[i], s.get(i));
      assertEquals(objects[i], s.pop());
    }

    // getting from an empty stack should result in a null value
    assertEquals(null, s.get(0));
  }

  @Test
  public void testGrow() {
    Stack255 s = new Stack255((byte) 10, (byte) 10);
    for (int i = 0; i < 255; i++) {
      assertTrue(s.push(new Object()));
    }
    assertFalse(s.push(new Object()));
  }
}
