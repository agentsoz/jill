package io.github.agentsoz.jill.util;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2021 by its authors. See AUTHORS file.
 * %%
 * This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public License along with this program.
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Stack255Test {

  @Test
  public void testStack() {
    Stack255 stack = new Stack255((byte) 0, (byte) 0);
    assertEquals(0, stack.size());
    assertEquals(0, stack.capacity());
    assertTrue(stack.isEmpty());
    assertFalse(stack.isFull());

    stack = new Stack255((byte) 0, (byte) 255);
    assertEquals(0, stack.size());
    assertEquals(0, stack.capacity());
    assertTrue(stack.isEmpty());
    assertFalse(stack.isFull());

    stack = new Stack255((byte) 255, (byte) 0);
    assertEquals(0, stack.size());
    assertEquals(255, stack.capacity());
    assertTrue(stack.isEmpty());
    assertFalse(stack.isFull());

    stack = new Stack255((byte) 255, (byte) 255);
    assertEquals(0, stack.size());
    assertEquals(255, stack.capacity());
    assertTrue(stack.isEmpty());
    assertFalse(stack.isFull());
  }

  @Test
  public void testIsEmpty() {
    Stack255 stack = new Stack255((byte) 255, (byte) 0);
    assertTrue(stack.isEmpty());
    stack.push(new Object());
    assertEquals(1, stack.size());
    assertFalse(stack.isEmpty());
    stack.push(new Object());
    assertFalse(stack.isEmpty());
    stack.pop();
    assertFalse(stack.isEmpty());
    stack.pop();
    assertTrue(stack.isEmpty());
    stack.pop();
    assertTrue(stack.isEmpty());
  }

  @Test
  public void testIsFull() {
    Stack255 stack = new Stack255((byte) 255, (byte) 0);
    for (int i = 0; i < 254; i++) {
      stack.push(new Object());
      assertFalse(stack.isFull());
    }
    stack.push(new Object());
    assertTrue(stack.isFull());
  }

  @Test
  public void testSize() {
    Stack255 stack = new Stack255((byte) 255, (byte) 0);
    stack.pop();
    assertEquals(0, stack.size());
    stack.pop();
    assertEquals(0, stack.size());
    for (int i = 0; i < 255; i++) {
      stack.push(new Object());
      assertEquals(i + 1, stack.size());
    }
    stack.push(new Object());
    assertEquals(255, stack.size());
    stack.push(new Object());
    assertEquals(255, stack.size());
  }

  @Test
  public void testPushPopGet() {
    Stack255 stack = new Stack255((byte) 255, (byte) 0);
    // popping an empty stack should return null
    assertEquals(null, stack.pop());

    Object[] objects = new Object[255];
    // pushing up to the maximum capacity should succeed
    for (int i = 0; i < 255; i++) {
      objects[i] = new Object();
      assertTrue(stack.push(objects[i]));
    }
    // pushing past maximum capacity should fail
    assertFalse(stack.push(objects[0]));
    assertFalse(stack.push(objects[0]));

    // getting using an invalid index should result in a null object
    assertEquals(null, stack.get(-1));
    assertEquals(null, stack.get(255));

    // popped objects should match the pushed ones
    for (int i = 254; i >= 0; i--) {
      assertEquals(objects[i], stack.get(i));
      assertEquals(objects[i], stack.pop());
    }

    // getting from an empty stack should result in a null value
    assertEquals(null, stack.get(0));
  }

  @Test
  public void testGrow() {
    Stack255 stack = new Stack255((byte) 10, (byte) 10);
    for (int i = 0; i < 255; i++) {
      assertTrue(stack.push(new Object()));
    }
    assertFalse(stack.push(new Object()));
  }
}
