package io.github.agentsoz.jill.core.beliefbase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("unused")
public class BeliefTest {

  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}

  @Test
  public void test() {
    Belief b1 = new Belief(0, 0, null);
    Belief b2 = new Belief(0, 1, null);
    Belief b3 = new Belief(1, 0, null);
    Belief b4 = new Belief(1, 1, null);
    Object[] a1 = new Object[0];
    Object[] a2 = {new Object(), new Object()};
    Belief b5 = new Belief(1, 1, a1);
    Belief b6 = new Belief(1, 1, a1);
    Belief b7 = new Belief(1, 1, a2);
    Belief b8 = new Belief(1, 0, a2);

    assertFalse(b1.equals(null));
    assertFalse(b1.equals(new Object()));
    assertFalse(b1.equals(b2));
    assertTrue(b1.equals(b1));
    assertTrue(b5.equals(b6));
    assertFalse(b4.equals(b8));
    assertFalse(b7.equals(b6));

    b7.setBeliefset(b8.getBeliefset());
    b7.setTuple(b8.getTuple());
    assertTrue(b7.equals(b8));



  }

}
