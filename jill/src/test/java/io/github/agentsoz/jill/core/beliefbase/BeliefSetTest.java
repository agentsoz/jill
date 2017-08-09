package io.github.agentsoz.jill.core.beliefbase;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import java.util.HashSet;


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
