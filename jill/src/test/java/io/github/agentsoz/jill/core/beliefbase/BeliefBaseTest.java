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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import ch.qos.logback.classic.Level;
import io.github.agentsoz.jill.Main;
import io.github.agentsoz.jill.core.GlobalState;
import io.github.agentsoz.jill.core.beliefbase.abs.ABeliefStore;
import io.github.agentsoz.jill.util.ArgumentsLoader;
import io.github.agentsoz.jill.util.Log;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Set;

public class BeliefBaseTest {

  private ByteArrayOutputStream out;
  private ByteArrayOutputStream err;

  /**
   * Common setup for all tests. Saves stderr and stdout to an output stream.
   *
   * @throws Exception if something went wrong
   */
  @Before
  public void setUp() throws Exception {
    out = new ByteArrayOutputStream();
    err = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
    System.setErr(new PrintStream(err));
    // Configure logging
    Log.createLogger(Main.LOGGER_NAME, Level.INFO, "test.log");
    GlobalState.reset();
    ArgumentsLoader.reset();
  }

  /**
   * Common setup for all tests. Closes stderr and stdout streams.
   *
   * @throws Exception if something went wrong
   */
  @After
  public void tearDown() throws Exception {
    System.setOut(null);
    System.setErr(null);
    out.close();
    err.close();
  }

  @Test
  public void test() {
    String[] args = {};
    try {
      BeliefBase.main(args);
    } catch (BeliefBaseException e) {
      fail("Exception was: " + e.getMessage());
    }
  }

  @Test
  public void testBeliefs() throws BeliefBaseException {
    int numAgents = 10;
    int numBeliefs = 5;
    BeliefBase bb = new ABeliefStore(numAgents, 4);
    String bs1 = "mem";
    final String key = "key";
    BeliefSetField[] fields1 = {new BeliefSetField(key, String.class, true),
        new BeliefSetField("value", Boolean.class, false),};
    for (int i = 0; i < numAgents; i++) {
      bb.createBeliefSet(i, bs1, fields1);
      for (int j = 0; j < numBeliefs; j++) {
        bb.addBelief(i, bs1, key + j, ((j % 2) == 0) ? true : false);
      }
    }

    // check that the beliefs exist and match expected values
    for (int i = 0; i < numAgents; i++) {
      for (int j = 0; j < numBeliefs; j++) {
        String query = bs1 + ".key=key" + j;
        boolean ok = bb.eval(i, query);
        assertTrue(ok);
        Set<Belief> matchingBeliefs = bb.query(i, query);
        assertNotNull(matchingBeliefs);
        assertEquals(1, matchingBeliefs.size());
        assertEquals(((j % 2) == 0) ? true : false,
            matchingBeliefs.toArray(new Belief[0])[0].getTuple()[1]);
      }
    }
  }

  @Test
  public void testRemoveBeliefs() throws BeliefBaseException {
    int numAgents = 10;
    int numBeliefs = 5;
    BeliefBase bb = new ABeliefStore(numAgents, 4);
    String bs1 = "mem";
    final String key = "key";
    BeliefSetField[] fields1 = {new BeliefSetField(key, String.class, true),
        new BeliefSetField("value", Boolean.class, false),};
    for (int i = 0; i < numAgents; i++) {
      bb.createBeliefSet(i, bs1, fields1);
      for (int j = 0; j < numBeliefs; j++) {
        bb.addBelief(i, bs1, key + j, ((j % 2) == 0) ? true : false);
      }
    }

    // delete some beliefs and test that they are gone
    Integer[] nagents = {0, 4, 9};
    String[] queries = {"mem.key=key0", "mem.key=key1", "mem.key=key4"};
    for (int i = 0; i < nagents.length; i++) {
      for (int j = 0; j < queries.length; j++) {
        int agent = nagents[i];
        String query = queries[j];
        Set<Belief> matchingBeliefs = bb.query(agent, query);
        assertNotNull(matchingBeliefs);
        assertEquals(1, matchingBeliefs.size());
        boolean ok = bb.removeBelief(agent, matchingBeliefs.toArray(new Belief[0])[0]);
        assertTrue(ok);
        matchingBeliefs = bb.query(agent, query);
        assertNotNull(matchingBeliefs);
        assertEquals(0, matchingBeliefs.size());
      }
    }

    // test that the rest of them were untouched
    for (int i = 0; i < numAgents; i++) {
      for (int j = 0; j < numBeliefs; j++) {
        String query = bs1 + ".key=key" + j;
        if (!(contains(nagents, i) && contains(queries, query))) {
          boolean ok = bb.eval(i, query);
          assertTrue(ok);
          Set<Belief> matchingBeliefs = bb.query(i, query);
          assertNotNull(matchingBeliefs);
          assertEquals(1, matchingBeliefs.size());
          assertEquals(((j % 2) == 0) ? true : false,
              matchingBeliefs.toArray(new Belief[0])[0].getTuple()[1]);
        }
      }
    }
  }

  /**
   * Checks if a value exists in a list.
   *
   * @param list the list to check against
   * @param val the value to find
   * @return true if found, false otherwise
   */
  private static boolean contains(Object[] list, final Object val) {
    if (val != null && list != null) {
      for (Object element : list) {
        if (val.equals(element)) {
          return true;
        }
      }
    }
    return false;
  }
}
