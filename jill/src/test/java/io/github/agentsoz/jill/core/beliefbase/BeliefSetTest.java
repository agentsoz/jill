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

    assertFalse(bs1.equals(null));
    assertFalse(bs1.equals(new Object()));
    assertTrue(bs1.equals(bs1));
    assertTrue(bs1.equals(bs2));
    assertTrue(bs2.equals(bs3));
    assertTrue(bs3.equals(bs4));
    assertFalse(bs4.equals(bs5));
    assertTrue(bs5.equals(bs6));
    assertTrue(bs6.equals(bs7));
    assertFalse(bs7.equals(bs8));

    HashSet<BeliefSet> hs = new HashSet<BeliefSet>();
    hs.add(bs1);
    assertTrue(hs.size() == 1);
    hs.add(bs2);
    assertTrue(hs.size() == 1);
    hs.add(bs3);
    assertTrue(hs.size() == 2);
    hs.add(bs3);
    assertTrue(hs.size() == 2);
    hs.add(bs5);
    assertTrue(hs.size() == 3);
    hs.add(bs7);
    assertTrue(hs.size() == 4);
  }

}
