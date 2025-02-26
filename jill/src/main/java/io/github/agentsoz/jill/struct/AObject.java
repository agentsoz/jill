package io.github.agentsoz.jill.struct;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2025 by its authors. See AUTHORS file.
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
import io.github.agentsoz.jill.util.AString;

/**
 * AObject is meant to serve as a base class for all objects that require a unique identifier and a
 * name. It stores this information in a compact form which is useful for in-memory storage.
 *
 * @author dsingh
 * @version $Id: $Id
 */
public class AObject {

  /**
   * The unique identifier for this object. Upto 2^31 unique ids are supported
   */
  private int id = GlobalConstant.NULLID;

  /** The String name of this object, stored as a compacted byte array. */
  private byte[] name;

  /**
   * Constructs an AObject with the given str name and id of NULLID.
   *
   * @param str the name of this object
   * @see GlobalConstant#NULLID
   */
  public AObject(String str) {
    this.name = AString.toBytes(str);
  }

  /**
   * Gets the id of this object.
   *
   * @return the object id
   */
  public int getId() {
    return id;
  }

  /**
   * Sets the id of this object.
   *
   * @param id the new id
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Gets the name of this object.
   *
   * @return the object name
   */
  public String getName() {
    return AString.toString(name);
  }

  /**
   * Sets the name of this object.
   *
   * @param str the new name
   */
  public void setName(String str) {
    this.name = AString.toBytes(str);
  }

  /**
   * Returns a String representation of this object.
   *
   * @return a {@link java.lang.String} object.
   */
  @Override
  public String toString() {
    return AString.toString(name) + ":" + id;
  }

  /**
   * Checks if two objects have the same name. The check is case sensitive.
   *
   * @param obj1 the first object
   * @param obj2 the second object
   * @return true if the objects have the same non-null non-empty name, and false otherwise
   */
  public static boolean isNameEqual(AObject obj1, AObject obj2) {
    // Not equal if the names are null, or empty, or not the same size
    if (obj1.name == null || obj2.name == null || obj1.name.length != obj2.name.length
        || obj1.name.length == 0) {
      return false;
    }
    // Not equal if any name character is different
    for (int i = 0; i < obj1.name.length; i++) {
      if (obj1.name[i] != obj2.name[i]) {
        return false;
      }
    }
    // Else equal
    return true;
  }

}
