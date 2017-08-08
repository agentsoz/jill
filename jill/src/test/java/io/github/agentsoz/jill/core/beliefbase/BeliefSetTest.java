package io.github.agentsoz.jill.core.beliefbase;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;

public class BeliefSetTest {

  @Test
  public void test() {
    BeliefSet bs1 = new BeliefSet(0, null, null);
    BeliefSet bs2 = new BeliefSet(0, null, null);
    BeliefSet bs3 = new BeliefSet(1, null, null);
    BeliefSet bs4 = new BeliefSet(1, "", null);
    BeliefSetField[] bsfa = new BeliefSetField[0];
    BeliefSet bs5 = new BeliefSet(1, null, bsfa);
    BeliefSet bs6 = new BeliefSet(1, "", bsfa);
    BeliefSet bs7 = new BeliefSet(2, "", bsfa);
    BeliefSet bs8 = new BeliefSet(2, "bs8", bsfa);

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
