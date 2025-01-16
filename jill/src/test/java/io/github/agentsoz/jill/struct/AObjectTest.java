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
