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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import ch.qos.logback.classic.Level;
import io.github.agentsoz.jill.Main;
import io.github.agentsoz.jill.core.GlobalState;
import io.github.agentsoz.jill.core.beliefbase.abs.ABeliefStore;
import io.github.agentsoz.jill.util.ArgumentsLoader;
import io.github.agentsoz.jill.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
        new BeliefSetField("value", Boolean.class, false), };
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
        new BeliefSetField("value", Boolean.class, false), };
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
