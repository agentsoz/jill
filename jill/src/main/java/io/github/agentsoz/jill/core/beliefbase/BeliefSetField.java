package io.github.agentsoz.jill.core.beliefbase;

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

/**
 * Specifies a belief set field (akin to a column in a belief set).
 *
 * @author dsingh
 * @version $Id: $Id
 */
public class BeliefSetField {
  private String name;
  private Class<?> type;
  private boolean isPrimary;

  /**
   * Creates a new belief set field with the given properties.
   *
   * @param name the name of this field; this is used in queries on the belief set that will contain
   *        beliefs with this field
   * @param type specifies the {@link java.lang.Class} of this field. For beliefs that are
   *        eventually added to the belief set that contains this field, the corresponding field
   *        value must be of this type.
   * @param isPrimary specifies whether this field is part of the primary key for beliefs of this
   *        type. Several fields can be marked as primary, in which case the primary key becomes a
   *        composite key. A primary key (simple or composite) uniquely identifies a belief. It is
   *        used also in queries across belief sets, to select a belief in the first belief set and
   *        then find matches for its primary key in the second
   *        (see {@link io.github.agentsoz.jill.core.beliefbase.Query}).
   */
  public BeliefSetField(String name, Class<?> type, boolean isPrimary) {
    super();
    this.name = name;
    this.type = type;
    this.isPrimary = isPrimary;
  }

  /**
   * Gets the name of this belief set field.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the name of this belief set field.
   *
   * @param name the name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets the {@link java.lang.Class} type of this belief set field.
   *
   * @return the class
   */
  public Class<?> getType() {
    return type;
  }

  /**
   * Sets the {@link java.lang.Class} type of this belief set field.
   *
   * @param type the type
   */
  public void setType(Class<?> type) {
    this.type = type;
  }

  /**
   * Checks if this field is part of the primary key for the enclosing belief set.
   *
   * @return {@code true} if key is primary, {@code false} otherwise
   */
  public boolean isPrimary() {
    return isPrimary;
  }

  /**
   * Marks this field as part of the primary key for the enclosing belief set.
   *
   * @param isPrimary whether to include this field in primary key or not
   */
  public void setPrimary(boolean isPrimary) {
    this.isPrimary = isPrimary;
  }

}
