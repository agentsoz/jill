package io.github.agentsoz.jill.core.beliefbase;

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

import io.github.agentsoz.jill.struct.AObject;
import java.util.Arrays;

/**
 * <p>Belief class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
public class Belief extends AObject {

  private int beliefset;
  private Object[] tuple;

  /**
   * Constructs a new belief.
   *
   * @param id unique ID of this belief (must folllow sequence 0,1,2,3...)
   * @param beliefset the beliefset to which this belief belongs
   * @param tuple the belief values
   */
  public Belief(int id, int beliefset, Object[] tuple) {
    super(null);
    setId(id);
    this.beliefset = beliefset;
    this.tuple = tuple;
  }

  /**
   * Gets the beliefset to which this belief belongs.
   *
   * @return the beliefset
   */
  public int getBeliefset() {
    return beliefset;
  }

  /**
   * Sets the beliefset to which this belief belongs.
   *
   * @param beliefset the beliefset to set
   */
  public void setBeliefset(int beliefset) {
    this.beliefset = beliefset;
  }

  /**
   * Gets the values of this belief.
   *
   * @return the tuple
   */
  public Object[] getTuple() {
    return tuple;
  }

  /**
   * Sets the values of this belief.
   *
   * @param tuple the tuple to set
   */
  public void setTuple(Object[] tuple) {
    this.tuple = tuple;
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + beliefset;
    result = prime * result + Arrays.hashCode(tuple);
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
    if (!(obj instanceof Belief)) {
      return false;
    }
    Belief other = (Belief) obj;
    if (beliefset != other.beliefset) {
      return false;
    }
    return Arrays.equals(tuple, other.tuple);
  }


}
