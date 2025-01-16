package io.github.agentsoz.jill.core.beliefbase;

/*-
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
import static org.junit.Assert.assertNotEquals;

import java.util.HashSet;
import org.junit.Test;


public class BeliefSetTest {

  @Test
  public void test() {
    final BeliefSet bs1 = new BeliefSet(0, null, null);
    final BeliefSet bs2 = new BeliefSet(0, null, null);
    final BeliefSet bs3 = new BeliefSet(1, null, null);
    final BeliefSet bs4 = new BeliefSet(1, "", null);
    final BeliefSetField[] bsfa = new BeliefSetField[0];
    final BeliefSet bs5 = new BeliefSet(1, null, bsfa);
    final BeliefSet bs6 = new BeliefSet(1, "", bsfa);
    final BeliefSet bs7 = new BeliefSet(2, "", bsfa);
    final BeliefSet bs8 = new BeliefSet(2, "bs8", bsfa);

    assertNotEquals(bs1, null);
    assertNotEquals(bs1, new Object());
    assertEquals(bs1, bs1);
    assertEquals(bs1, bs2);
    assertEquals(bs2, bs3);
    assertEquals(bs3, bs4);
    assertNotEquals(bs4, bs5);
    assertEquals(bs5, bs6);
    assertEquals(bs6, bs7);
    assertNotEquals(bs7, bs8);

    HashSet<BeliefSet> hs = new HashSet<BeliefSet>();
    hs.add(bs1);
    assertEquals(hs.size(), 1);
    hs.add(bs2);
    assertEquals(hs.size(), 1);
    hs.add(bs3);
    assertEquals(hs.size(), 2);
    hs.add(bs3);
    assertEquals(hs.size(), 2);
    hs.add(bs5);
    assertEquals(hs.size(), 3);
    hs.add(bs7);
    assertEquals(hs.size(), 4);
  }

}
