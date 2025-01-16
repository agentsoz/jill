package io.github.agentsoz.jill.struct;

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

import java.lang.reflect.Method;

/**
 * <p>PlanType class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
public class PlanType extends GoalPlanType {
  private Class<?> planClass;
  private Method context;
  private Method body;

  /**
   * <p>Constructor for PlanType.</p>
   *
   * @param name a {@link java.lang.String} object.
   */
  public PlanType(String name) {
    super(name);
  }

  /**
   * <p>Getter for the field <code>context</code>.</p>
   *
   * @return a {@link java.lang.reflect.Method} object.
   */
  public Method getContext() {
    return context;
  }

  /**
   * <p>Setter for the field <code>context</code>.</p>
   *
   * @param context a {@link java.lang.reflect.Method} object.
   */
  public void setContext(Method context) {
    this.context = context;
  }

  /**
   * <p>Getter for the field <code>body</code>.</p>
   *
   * @return a {@link java.lang.reflect.Method} object.
   */
  public Method getBody() {
    return body;
  }

  /**
   * <p>Setter for the field <code>body</code>.</p>
   *
   * @param body a {@link java.lang.reflect.Method} object.
   */
  public void setBody(Method body) {
    this.body = body;
  }

  /**
   * <p>Getter for the field <code>planClass</code>.</p>
   *
   * @return a {@link java.lang.Class} object.
   */
  public Class<?> getPlanClass() {
    return planClass;
  }

  /**
   * <p>Setter for the field <code>planClass</code>.</p>
   *
   * @param planClass a {@link java.lang.Class} object.
   */
  public void setPlanClass(Class<?> planClass) {
    this.planClass = planClass;
  }
}
