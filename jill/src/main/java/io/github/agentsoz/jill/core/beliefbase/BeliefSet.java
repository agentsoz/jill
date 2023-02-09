package io.github.agentsoz.jill.core.beliefbase;

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
  @Override
  public String toString() {
    return new Gson().toJson(this);
  }
}
