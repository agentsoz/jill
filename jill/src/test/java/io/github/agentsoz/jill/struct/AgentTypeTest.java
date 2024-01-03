package io.github.agentsoz.jill.struct;

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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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
