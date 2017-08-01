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

import io.github.agentsoz.jill.core.beliefbase.abs.ABeliefStore.Operator;

import com.google.gson.Gson;

public class AQuery {

  private int beliefset;
  private int field;
  private Operator op;
  private Object value;

  public AQuery(int beliefset, int field, Operator op, Object value) {
    super();
    this.beliefset = beliefset;
    this.field = field;
    this.op = op;
    this.value = value;
  }

  /**
   * @return the beliefset
   */
  public int getBeliefset() {
    return beliefset;
  }

  /**
   * @param beliefset the beliefset to set
   */
  public void setBeliefset(int beliefset) {
    this.beliefset = beliefset;
  }

  /**
   * @return the field
   */
  public int getField() {
    return field;
  }

  /**
   * @param field the field to set
   */
  public void setField(int field) {
    this.field = field;
  }

  /**
   * @return the op
   */
  public Operator getOp() {
    return op;
  }

  /**
   * @param op the op to set
   */
  public void setOp(Operator op) {
    this.op = op;
  }

  /**
   * @return the value
   */
  public Object getValue() {
    return value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(Object value) {
    this.value = value;
  }

  /**
   * String representation of this query
   */
  public String toString() {
    return new Gson().toJson(this);
  }

}
