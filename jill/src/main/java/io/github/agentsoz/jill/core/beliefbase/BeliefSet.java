package io.github.agentsoz.jill.core.beliefbase;

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

import com.google.gson.Gson;

import io.github.agentsoz.jill.struct.AObject;

import java.util.Arrays;

/**
 * <p>BeliefSet class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
public class BeliefSet extends AObject {

  private final BeliefSetField[] fields;

  /**
   * Constructs a new belief set.
   *
   * @param id the unique ID of this belief set (must follow sequence 0,1,2,3,...)
   * @param name a name for this belief set
   * @param fields the fields (columns) of this belief set
   */
  public BeliefSet(int id, String name, BeliefSetField[] fields) {
    super(name);
    setId(id);
    this.fields = fields;
  }

  /**
   * Gets the fields of this belief set.
   *
   * @return the fields
   */
  public BeliefSetField[] getFields() {
    return fields;
  }

  /**
   * Gets the field of this belief set that has the given name.
   *
   * @param name the name of the field to retrieve
   * @return the belief set field matching that name, or null if not found
   * @since 0.3.4
   */
  public BeliefSetField getFieldByName(String name) {
    BeliefSetField field = null;
    for (int i = 0; i < fields.length; i++) {
      if (name.equals(fields[i].getName())) {
        field = fields[i];
        break;
      }
    }
    return field;
  }

  /**
   * Gets the index (column) of the given field in this belief set.
   *
   * @param field the field for which the index is required
   * @return the index of that field, or -1 if not found
   * @since 0.3.4
   */
  public int getIndex(BeliefSetField field) {
    int index = -1;
    for (int i = 0; i < fields.length; i++) {
      if (field.equals(fields[i])) {
        index = i;
      }
    }
    return index;
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Arrays.hashCode(fields);
    String name = getName();
    result = prime * result + ((name == null) ? 1 : name.hashCode());
    result = prime * result + Integer.hashCode(getId());
    return result;
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof BeliefSet)) {
      return false;
    }
    BeliefSet other = (BeliefSet) obj;
    if (!Arrays.equals(fields, other.fields)) {
      return false;
    }
    String name = getName();
    String oname = other.getName();
    if (name == null) {
      return (oname == null) ? true : false;
    }
    // No check for IDs, therefore if only IDs are different then objects are equal
    return name.equals(oname);
  }


  /**
   * <p>toString.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String toString() {
    return new Gson().toJson(this);
  }
}
