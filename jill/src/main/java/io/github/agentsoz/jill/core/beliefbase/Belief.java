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

import io.github.agentsoz.jill.struct.AObject;

import java.util.Arrays;

public class Belief extends AObject {

  private int beliefset;
  private Object[] tuple;

  public Belief(int id, int beliefset, Object[] tuple) {
    super(null);
    setId(id);
    this.beliefset = beliefset;
    this.tuple = tuple;
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
   * @return the tuple
   */
  public Object[] getTuple() {
    return tuple;
  }

  /**
   * @param tuple the tuple to set
   */
  public void setTuple(Object[] tuple) {
    this.tuple = tuple;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + beliefset;
    result = prime * result + Arrays.hashCode(tuple);
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#equals(java.lang.Object)
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
    if (!Arrays.equals(tuple, other.tuple)) {
      return false;
    }
    return true;
  }


}
