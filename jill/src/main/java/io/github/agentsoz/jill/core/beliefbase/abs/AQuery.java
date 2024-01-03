package io.github.agentsoz.jill.core.beliefbase.abs;

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

import com.google.gson.Gson;
import io.github.agentsoz.jill.core.beliefbase.abs.ABeliefStore.Operator;

/**
 * <p>AQuery class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
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
   *
   * @return a {@link java.lang.String} object.
   */
  @Override
  public String toString() {
    return new Gson().toJson(this);
  }

}
