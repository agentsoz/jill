package io.github.agentsoz.jill.struct;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2019 by its authors. See AUTHORS file.
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
