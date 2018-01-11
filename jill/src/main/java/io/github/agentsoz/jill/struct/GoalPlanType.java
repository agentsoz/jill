package io.github.agentsoz.jill.struct;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2018 by its authors. See AUTHORS file.
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
