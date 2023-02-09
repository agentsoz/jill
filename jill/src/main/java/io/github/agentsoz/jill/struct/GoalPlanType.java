package io.github.agentsoz.jill.struct;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2023 by its authors. See AUTHORS file.
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
 * <p>GoalPlanType class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 * @since 0.3.4
 */
public class GoalPlanType extends AObject {

  private byte[] parents;
  private byte[] children;

  /**
   * Creates a new Goal-Plan type object.
   *
   * @param str a name for this object
   */
  public GoalPlanType(String str) {
    super(str);
    parents = null;
    children = null;
  }

  /**
   * Gets the parents of this object in the Goal-Plan tree.
   *
   * @return array of parent IDs, or null if this object has no parents
   */
  public byte[] getParents() {
    if (parents == null) {
      return null;
    }
    byte[] arr = new byte[parents.length];
    System.arraycopy(parents, 0, arr, 0, arr.length);
    return arr;
  }

  /**
   * Adds a parent for this object.
   *
   * @param parent ID of the parent
   */
  public void addParent(byte parent) {
    parents = grow(parents, 1);
    parents[parents.length - 1] = parent;
  }


  /**
   * Gets all the children of this object in the Goal-Plan tree.
   *
   * @return array of children IDs, or null if this object has no children
   */
  public byte[] getChildren() {
    if (children == null) {
      return null;
    }
    byte[] arr = new byte[children.length];
    System.arraycopy(children, 0, arr, 0, arr.length);
    return arr;
  }

  /**
   * Adds a new child for this object.
   *
   * @param child ID of the child
   */
  public void addChild(byte child) {
    children = grow(children, 1);
    children[children.length - 1] = child;
  }


  /**
   * Grows the given array by the given size.
   *
   * @param bytes the array to grow
   * @param increment the size by which to grow it
   * @return the new extended array with all the contents of the old array copied over
   */
  public static byte[] grow(byte[] bytes, int increment) {
    if (bytes == null) {
      return new byte[1];
    }
    byte[] temp = new byte[bytes.length + increment];
    System.arraycopy(bytes, 0, temp, 0, bytes.length);
    return temp;
  }


}
