package io.github.agentsoz.jill.struct;

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

public class GPType extends AObject {

  private byte[] parents;
  private byte[] children;

  public GPType(String str) {
    super(str);
    parents = null;
    children = null;
  }

  public byte[] getParents() {
    if (parents == null) {
      return null;
    }
    byte[] arr = new byte[parents.length];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = parents[i];
    }
    return arr;
  }

  public void addParent(byte parent) {
    parents = grow(parents, 1);
    parents[parents.length - 1] = parent;
  }


  public byte[] getChildren() {
    if (children == null) {
      return null;
    }
    byte[] arr = new byte[children.length];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = children[i];
    }
    return arr;
  }

  public void addChild(byte child) {
    children = grow(children, 1);
    children[children.length - 1] = child;
  }


  public static byte[] grow(byte[] bytes, int increment) {
    if (bytes == null) {
      return new byte[1];
    }
    byte[] temp = new byte[bytes.length + increment];
    System.arraycopy(bytes, 0, temp, 0, bytes.length);
    return temp;
  }


}
