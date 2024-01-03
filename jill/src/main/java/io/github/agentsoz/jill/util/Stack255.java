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

/**
 * Implements a stack of objects, with maximum capacity of 255.
 *
 * @author dsingh
 * @version $Id: $Id
 */
public class Stack255 {

  /** Maximum capacity of the stack (byte size). */
  private static final int MAXIMUM_CAPACITY = 255;

  /** Current size of the stack. */
  private int size;

  /**
   * Specifies the increment by which the capacity should be extended, once the stack reaches full
   * capacity.
   */
  private final int increment;

  /**
   * Objects in this stack.
   */
  private Object[] objects;

  /**
   * Creates a stack with the given initial capacity, to be extended by the given incrementSize as
   * needed upon reaching full capacity. Typically it should suffice to initialise the stack with
   * the full capacity, if it is known upfront, since increasing capacity at runtime is expensive
   * (it requires an array copy using {@link java.lang.System#arraycopy(Object,int,Object,int,int)
   * System.arraycopy(...)}).
   *
   * <p>The maximum capacity of the stack is 255 (the size of one byte). There is no provision to
   * shrink the stack at the moment.
   *
   * @param initialCapacity the initial capacity of the stack
   * @param incrementSize capacity is increased by this amount when the stack becomes full; if
   *        incrementSize &lt;= 0, then the default value of 1 is used
   */
  public Stack255(byte initialCapacity, byte incrementSize) {
    size = 0;
    increment = (0xff & incrementSize) | 1;
    objects = new Object[initialCapacity & 0xff];
  }

  /**
   * Gets the object at the given index in the catalog.
   *
   * @param idx the position of the Object
   * @return the Object, or null if the index is invalid
   */
  public Object get(int idx) {
    int index = idx & 0xff;
    if (isEmpty()) {
      // System.err.println("index "+index+" is invalid as stack is empty");
      return null;
    } else if (index < 0 || index >= size) {
      // System.err.println("index "+index+" is outside of range [0,"+(size-1)+"]");
      return null;
    }
    return objects[index];
  }

  /**
   * Pushes an object on to the top of the stack.
   *
   * @param obj the Object to place on the stack
   * @return true if successfully added, false if the stack was full
   */
  public boolean push(Object obj) {
    // Cannot add beyond maximum capacity
    if (isFull()) {
      return false;
    }
    // Grow if we are at capacity
    if (size == objects.length) {
      grow();
    }
    objects[size++] = obj;
    return true;
  }

  /**
   * Pops the Object at the top of the stack.
   *
   * @return the Object, or null if the stack is empty
   */
  public Object pop() {
    if (isEmpty()) {
      return null;
    }
    size--;
    Object obj = objects[size];
    objects[size] = null;
    return obj;
  }

  /**
   * Gets the current size of the stack.
   *
   * @return the size of the stack
   */
  public int size() {
    return size & 0xff;
  }

  /**
   * Checks if the stack is empty.
   *
   * @return true if the stack is empty, false otherwise
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * Checks if the stack is full.
   *
   * @return true if the stack is full, false otherwise
   */
  public boolean isFull() {
    return size == MAXIMUM_CAPACITY;
  }

  /**
   * Gets the current capacity of the stack.
   *
   * @return the capacity of the stack
   */
  public int capacity() {
    return objects.length;
  }

  /**
   * Grows the stack capacity by {@link #increment} up to the maximum capacity of 255 (byte size).
   *
   * @return true if the stack was successfully increased, false otherwise
   */
  private boolean grow() {
    if (objects.length == MAXIMUM_CAPACITY) {
      // Cannot grow beyond the maximum capacity
      return false;
    }
    int newsize = objects.length + increment;
    if (newsize > MAXIMUM_CAPACITY) {
      newsize = MAXIMUM_CAPACITY;
    }
    Object[] temp = new Object[newsize];
    System.arraycopy(objects, 0, temp, 0, objects.length);
    objects = temp;
    return true;
  }
}
