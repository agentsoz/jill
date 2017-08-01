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

/**
 * Implements a stack of objects, with maximum capacity of 255.
 * 
 * @author dsingh
 *
 */
public class Stack255 {

  /** Maximum capacity of the stack (byte size) */
  private static final int MAXIMUM_CAPACITY = 255;

  /** Current size of the stack */
  private int size;

  /**
   * Specifies the increment by which the capacity should be extended, once the stack reaches full
   * capacity
   */
  private int increment;

  /**
   * Objects in this stack
   */
  private Object[] objects;

  /**
   * Creates a stack with the given initial capacity, to be extended by the given incrementSize as
   * needed upon reaching full capacity. Typically it should suffice to initialise the stack with
   * the full capacity, if it is known upfront, since increasing capacity at runtime is expensive
   * (it requires an array copy using {@link System#arraycopy(Object,int,Object,int,int)
   * System.arraycopy(...)}).
   * 
   * The maximum capacity of the stack is 255 (the size of one byte). There is no provision to
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
   * Gets the object at the given index in the catalog
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
   * Pushes an object on to the top of the stack
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
   * Pops the Object at the top of the stack
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
   * Gets the current size of the stack
   * 
   * @return the size of the stack
   */
  public int size() {
    return size & 0xff;
  }

  /**
   * Checks if the stack is empty
   * 
   * @return true if the stack is empty, false otherwise
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * Checks if the stack is full
   * 
   * @return true if the stack is full, false otherwise
   */
  public boolean isFull() {
    return size == MAXIMUM_CAPACITY;
  }

  /**
   * Gets the current capacity of the stack
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
