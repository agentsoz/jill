package io.github.agentsoz.jill.core.beliefbase;

/*-
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2023 by its authors. See AUTHORS file.
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

@SuppressWarnings("unused")
public class BeliefTest {

  @Test
  public void test() {
    final Belief b1 = new Belief(0, 0, null);
    final Belief b2 = new Belief(0, 1, null);
    final Belief b3 = new Belief(1, 0, null);
    final Belief b4 = new Belief(1, 1, null);
    final Object[] a1 = new Object[0];
    final Object[] a2 = {new Object(), new Object()};
    final Belief b5 = new Belief(1, 1, a1);
    final Belief b6 = new Belief(1, 1, a1);
    final Belief b7 = new Belief(1, 1, a2);
    final Belief b8 = new Belief(1, 0, a2);

    assertNotEquals(null, b1);
    assertNotEquals(new Object(), b1);
    assertNotEquals(b1, b2);
    assertEquals(b1, b1);
    assertEquals(b5, b6);
    assertNotEquals(b4, b8);
    assertNotEquals(b7, b6);

    b7.setBeliefset(b8.getBeliefset());
    b7.setTuple(b8.getTuple());
    assertEquals(b7, b8);



  }

}
