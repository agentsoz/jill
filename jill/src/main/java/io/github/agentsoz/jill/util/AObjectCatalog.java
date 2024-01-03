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

import io.github.agentsoz.jill.config.GlobalConstant;
import io.github.agentsoz.jill.struct.AObject;

/**
 * <p>AObjectCatalog class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
public class AObjectCatalog extends AObject {

  private int nextid = GlobalConstant.NULLID + 1;
  private final int increment;
  private AObject[] objects;

  /**
   * Constructs a object catalog.
   *
   * @param name s nsme for the catalog
   * @param size the initial size of the catalog
   * @param inc the size by which the catalog should grow when it reaches capacity
   */
  public AObjectCatalog(String name, int size, int inc) {
    super(name);
    increment = inc;
    objects = new AObject[size];
  }

  /**
   * Gets the object at the given index of the catalog.
   *
   * @param index the index of the object
   * @return the object at that index
   */
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

  /**
   * Pushes a new object to the top of the catalog.
   *
   * @param obj the object to add
   */
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

  /**
   * Pops (removes) the object at the top of the catalog.
   *
   * @return the object at the top, or null if the catalog is empty
   */
  public AObject pop() {
    if (nextid > GlobalConstant.NULLID) {
      nextid--;
      AObject obj = objects[nextid];
      objects[nextid] = null;
      return obj;
    }
    return null;
  }

  /**
   * <p>size.</p>
   *
   * @return a int.
   */
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
