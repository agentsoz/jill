package io.github.agentsoz.jill.core.beliefbase.abs;

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

import com.google.gson.Gson;

import io.github.agentsoz.jill.core.beliefbase.abs.ABeliefStore.Operator;

public class AQuery {

  private int beliefset;
  private int field;
  private Operator op;
  private Object value;

  /**
   * Construct a new belief based query.
   * 
   * @param beliefset the belief set to query
   * @param field the field (within the belief set) to query
   * @param op the query comparison operator
   * @param value the value to compare to
   */
  public AQuery(int beliefset, int field, Operator op, Object value) {
    super();
    this.beliefset = beliefset;
    this.field = field;
    this.op = op;
    this.value = value;
  }

  /**
   * Gets the belief set for this query.
   * 
   * @return the beliefset
   */
  public int getBeliefset() {
    return beliefset;
  }

  /**
   * Sets the belief set for this query.
   * 
   * @param beliefset the beliefset to set
   */
  public void setBeliefset(int beliefset) {
    this.beliefset = beliefset;
  }

  /**
   * Gets the field (within the belief set) being queried.
   * 
   * @return the field
   */
  public int getField() {
    return field;
  }

  /**
   * Sets the field (within the belief set) being queried.
   * 
   * @param field the field to set
   */
  public void setField(int field) {
    this.field = field;
  }

  /**
   * Gets the query comparison operator.
   * 
   * @return the op
   */
  public Operator getOp() {
    return op;
  }

  /**
   * Sets the query comparison operator.
   * 
   * @param op the op to set
   */
  public void setOp(Operator op) {
    this.op = op;
  }

  /**
   * Gets the value being compared to.
   * 
   * @return the value
   */
  public Object getValue() {
    return value;
  }

  /**
   * Sets the value being compared to.
   * 
   * @param value the value to set
   */
  public void setValue(Object value) {
    this.value = value;
  }

  /**
   * String representation of this query.
   */
  public String toString() {
    return new Gson().toJson(this);
  }

}
