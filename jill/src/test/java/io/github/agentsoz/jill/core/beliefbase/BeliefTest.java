package io.github.agentsoz.jill.core.beliefbase;

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
