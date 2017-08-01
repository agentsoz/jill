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

import io.github.agentsoz.jill.config.GlobalConstant;
import io.github.agentsoz.jill.util.AString;

/**
 * AObject is meant to serve as a base class for all objects that require a unique identifier and a
 * name. It stores this information in a compact form which is useful for in-memory storage.
 * 
 * @author dsingh
 */
public class AObject {

  /**
   * The unique identifier for this object. Upto 2^31 unique ids are supported
   */
  private int id = GlobalConstant.NULLID;

  /** The String name of this object, stored as a compacted byte array */
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
   * Gets the id of this object
   * 
   * @return the object id
   */
  public int getId() {
    return id;
  }

  /**
   * Sets the id of this object
   * 
   * @param id the new id
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Gets the name of this object
   * 
   * @return the object name
   */
  public String getName() {
    return AString.toString(name);
  }

  /**
   * Sets the name of this object
   * 
   * @param str the new name
   */
  public void setName(String str) {
    this.name = AString.toBytes(str);
  }

  /**
   * Returns a String representation of this object
   */
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
