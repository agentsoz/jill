package io.github.agentsoz.jill.core.beliefbase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeliefBaseTest {

  @Test
  public void test() {
    String[] args = {};
    try {
      BeliefBase.main(args);
    } catch (Exception e) {
      fail("Exception was: " + e.getMessage());
    }
  }

}
