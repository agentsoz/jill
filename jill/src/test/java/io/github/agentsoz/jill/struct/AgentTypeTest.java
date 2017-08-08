package io.github.agentsoz.jill.struct;

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

import static org.junit.Assert.*;
import io.github.agentsoz.jill.struct.AObject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AgentTypeTest {

  @Test
  public void testDefaultsGettersSetters() {
    AgentType o = new AgentType("o");
    o.setAgentClass(String.class);
    assertEquals(String.class, o.getAgentClass());
    o.setAgentClass(AObject.class);
    assertNotEquals(String.class, o.getAgentClass());
    assertEquals(AObject.class, o.getAgentClass());
    o.setAgentClass(null);
    assertEquals(null, o.getAgentClass());
  }

  @Test
  public void testGoals() {
    AgentType o = new AgentType("o");
    o.setGoals(null);
    assertEquals(null, o.getGoals());
    o.addGoal((byte) 23);
    assertNotEquals(null, o.getGoals());
    assertEquals(1, o.getGoals().length);
    o.addGoal((byte) 22);
    o.addGoal((byte) 21);
    assertEquals(3, o.getGoals().length);
    assertEquals((byte) 23, o.getGoals()[0]);
    assertEquals((byte) 22, o.getGoals()[1]);
    assertEquals((byte) 21, o.getGoals()[2]);
    byte[] a = {(byte) 33, (byte) 255};
    o.setGoals(a);
    assertEquals(2, o.getGoals().length);
    assertEquals((byte) 33, o.getGoals()[0]);
    assertEquals((byte) 255, o.getGoals()[1]);
    o.setGoals(null);
    assertEquals(null, o.getGoals());
    byte[] b = new byte[0];
    o.setGoals(b);
    assertNotEquals(null, o.getGoals());
    assertEquals(0, o.getGoals().length);
  }
}
