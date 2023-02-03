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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.github.agentsoz.jill.config.GlobalConstant;
import io.github.agentsoz.jill.struct.AObject;
import org.junit.Test;

public class AObjectTest {

  @Test
  public void testDefaultsGettersSetters() {
    AObject obj = new AObject(null);
    assertEquals("", obj.getName());
    assertEquals(GlobalConstant.NULLID, obj.getId());
    obj.setId(54321);
    assertEquals(54321, obj.getId());
    obj.setName("object1");
    assertEquals("object1", obj.getName());
  }

  @Test
  public void testIsNameEqual() {
    final String object = "object";
    final String object1 = "object1";
    final String object2 = "object2";
    assertFalse(AObject.isNameEqual(new AObject(null), new AObject(null)));
    assertFalse(AObject.isNameEqual(new AObject(object1), new AObject(null)));
    assertFalse(AObject.isNameEqual(new AObject(null), new AObject(object2)));
    assertFalse(AObject.isNameEqual(new AObject(object1), new AObject(object2)));
    assertFalse(AObject.isNameEqual(new AObject(object), new AObject(object2)));
    assertTrue(AObject.isNameEqual(new AObject(object), new AObject(object)));
  }
}
