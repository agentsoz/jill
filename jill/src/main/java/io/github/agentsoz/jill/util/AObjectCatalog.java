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

import io.github.agentsoz.jill.config.GlobalConstant;
import io.github.agentsoz.jill.struct.AObject;

public class AObjectCatalog extends AObject {

  private int nextid = GlobalConstant.NULLID + 1;
  private int increment;
  private AObject[] objects;

  public AObjectCatalog(String name, int size, int inc) {
    super(name);
    increment = inc;
    objects = new AObject[size];
  }

  public AObject get(int index) {
    if (index >= 0 && index < objects.length) {
      return objects[index];
    }
    return null;
  }

  /**
   * Find an object by name. Can be very expensive for large catalogs, since a name comparison is
   * performed in sequence on the objects in the catalog, until a match is found. Search is case
   * sensitive.
   * 
   * @param name the name to find
   * @return an AObject with a matching name, or null if not found
   */
  public AObject find(String name) {
    for (int i = 0; i < nextid; i++) {
      if (objects[i].getName().equals(name)) {
        return objects[i];
      }
    }
    return null;
  }

  public void push(AObject obj) {
    if (obj == null || obj.getId() != GlobalConstant.NULLID) {
      return;
    }
    // Grow if we are at capacity
    if (nextid == objects.length) {
      grow();
    }
    obj.setId(nextid);
    objects[nextid++] = obj;
  }

  public AObject pop() {
    if (nextid > GlobalConstant.NULLID) {
      nextid--;
      AObject obj = objects[nextid];
      objects[nextid] = null;
      return obj;
    }
    return null;
  }

  public int size() {
    return nextid;
  }

  /**
   * Grows the Catalog by a factor of {@link #increment}.
   */
  private void grow() {
    AObject[] temp = new AObject[objects.length + increment];
    System.arraycopy(objects, 0, temp, 0, objects.length);
    objects = temp;
  }
}
