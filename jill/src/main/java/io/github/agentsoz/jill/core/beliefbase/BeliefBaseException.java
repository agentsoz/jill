package io.github.agentsoz.jill.core.beliefbase;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2021 by its authors. See AUTHORS file.
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

/**
 * <p>BeliefBaseException class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
public class BeliefBaseException extends Exception {
  private static final long serialVersionUID = -2198448974372743421L;

  /**
   * <p>Constructor for BeliefBaseException.</p>
   *
   * @param msg a {@link java.lang.String} object.
   */
  public BeliefBaseException(String msg) {
    super(msg);
  }
  
  /**
   * <p>Constructor for BeliefBaseException.</p>
   *
   * @param msg a {@link java.lang.String} object.
   * @param exception a {@link java.lang.Exception} object.
   * @since 0.3.4
   */
  public BeliefBaseException(String msg, Exception exception) {
    super(msg,exception);
  }

}
