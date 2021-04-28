package io.github.agentsoz.jill.struct;

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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import io.github.agentsoz.jill.struct.AObject;

import org.junit.Test;

public class AgentTypeTest {

  @Test
  public void testDefaultsGettersSetters() {
    AgentType obj = new AgentType("o");
    obj.setAgentClass(String.class);
    assertEquals(String.class, obj.getAgentClass());
    obj.setAgentClass(AObject.class);
    assertNotEquals(String.class, obj.getAgentClass());
    assertEquals(AObject.class, obj.getAgentClass());
    obj.setAgentClass(null);
    assertEquals(null, obj.getAgentClass());
  }

  @Test
  public void testGoals() {
    AgentType obj = new AgentType("o");
    obj.setGoals(null);
    assertEquals(null, obj.getGoals());
    obj.addGoal((byte) 23);
    assertNotEquals(null, obj.getGoals());
    assertEquals(1, obj.getGoals().length);
    obj.addGoal((byte) 22);
    obj.addGoal((byte) 21);
    assertEquals(3, obj.getGoals().length);
    assertEquals((byte) 23, obj.getGoals()[0]);
    assertEquals((byte) 22, obj.getGoals()[1]);
    assertEquals((byte) 21, obj.getGoals()[2]);
    byte[] aobj = {(byte) 33, (byte) 255};
    obj.setGoals(aobj);
    assertEquals(2, obj.getGoals().length);
    assertEquals((byte) 33, obj.getGoals()[0]);
    assertEquals((byte) 255, obj.getGoals()[1]);
    obj.setGoals(null);
    assertEquals(null, obj.getGoals());
    byte[] bobj = new byte[0];
    obj.setGoals(bobj);
    assertNotEquals(null, obj.getGoals());
    assertEquals(0, obj.getGoals().length);
  }
}
