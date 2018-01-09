package io.github.agentsoz.jill.struct;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2018 by its authors. See AUTHORS file.
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

public class PlanType extends GoalPlanType {
  private Class<?> planClass;
  private Method context;
  private Method body;

  public PlanType(String name) {
    super(name);
  }

  public Method getContext() {
    return context;
  }

  public void setContext(Method context) {
    this.context = context;
  }

  public Method getBody() {
    return body;
  }

  public void setBody(Method body) {
    this.body = body;
  }

  public Class<?> getPlanClass() {
    return planClass;
  }

  public void setPlanClass(Class<?> planClass) {
    this.planClass = planClass;
  }
}
