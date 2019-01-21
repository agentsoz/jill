package io.github.agentsoz.jill.core.beliefbase;

/*-
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2019 by its authors. See AUTHORS file.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
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
