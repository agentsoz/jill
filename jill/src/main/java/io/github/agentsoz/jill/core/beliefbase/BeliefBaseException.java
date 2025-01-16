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
    super(msg, exception);
  }

}
