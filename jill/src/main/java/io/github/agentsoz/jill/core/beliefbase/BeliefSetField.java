package io.github.agentsoz.jill.core.beliefbase;

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

/**
 * Specifies a belief set field (akin to a column in a belief set).
 * 
 * @author dsingh
 *
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
   * @param type specifies the {@link Class} of this field. For beliefs that are eventually added to
   *        the belief set that contains this field, the corresponding field value must be of this
   *        type.
   * @param isPrimary specifies whether this field is part of the primary key for beliefs of this
   *        type. Several fields can be marked as primary, in which case the primary key becomes a
   *        composite key. A primary key (simple or composite) uniquely identifies a belief. It is
   *        used also in queries across belief sets, to select a belief in the first belief set and
   *        then find matches for its primary key in the second (see {@link Query}).
   * 
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
   * Gets the {@link Class} type of this belief set field.
   * 
   * @return the class
   */
  public Class<?> getType() {
    return type;
  }

  /**
   * Sets the {@link Class} type of this belief set field.
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
