package io.github.agentsoz.jill.core;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2024 by its authors. See AUTHORS file.
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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import ch.qos.logback.classic.Level;
import io.github.agentsoz.jill.Main;
import io.github.agentsoz.jill.core.GlobalState;
import io.github.agentsoz.jill.core.ProgramLoader;
import io.github.agentsoz.jill.lang.JillExtension;
import io.github.agentsoz.jill.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProgramLoaderTest {

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
  public void testAgentClass() {
    ProgramLoader.loadAgent("io.github.agentsoz.jill.core.testprogram.Agent0", 0, null);
    assertTrue(out.toString().contains("is not of type io.github.agentsoz.jill.lang.Agent"));
  }

  @Test
  public void testAgentInfo() {
    ProgramLoader.loadAgent("io.github.agentsoz.jill.core.testprogram.Agent1", 0, null);
    assertTrue(out.toString().contains("is missing the "
        + "@AgentInfo(hasGoals={\"package.GoalClass1, package.GoalClass2, ...\"}) annotation"));
  }

  @Test
  public void testHasGoals() {
    ProgramLoader.loadAgent("io.github.agentsoz.jill.core.testprogram.Agent2", 0, null);
    assertTrue(out.toString().contains("does not have any goals defined"));
  }

  @Test
  public void testGoalNotFound() {
    ProgramLoader.loadAgent("io.github.agentsoz.jill.core.testprogram.Agent3", 0, null);
    assertTrue(out.toString().contains("Class not found"));
  }

  @Test
  public void testGoalType() {
    ProgramLoader.loadAgent("io.github.agentsoz.jill.core.testprogram.Agent4", 0, null);
    assertTrue(out.toString().contains("is not of type io.github.agentsoz.jill.lang.Goal"));
  }

  @Test
  public void testGoalInfo() {
    ProgramLoader.loadAgent("io.github.agentsoz.jill.core.testprogram.Agent5", 0, null);
    assertTrue(out.toString().contains("is missing the "
        + "@GoalInfo(hasPlans={\"package.PlanClass1, package.PlanClass2, ...\"}) annotation"));
  }

  @Test
  public void testHasPlans() {
    ProgramLoader.loadAgent("io.github.agentsoz.jill.core.testprogram.Agent6", 0, null);
    assertTrue(out.toString().contains("does not have any plans defined"));
  }

  @Test
  public void testPlanNotFound() {
    ProgramLoader.loadAgent("io.github.agentsoz.jill.core.testprogram.Agent7", 0, null);
    assertTrue(out.toString().contains("Class not found"));
  }

  @Test
  public void testPlanType() {
    ProgramLoader.loadAgent("io.github.agentsoz.jill.core.testprogram.Agent8", 0, null);
    assertTrue(out.toString().contains("is not of type io.github.agentsoz.jill.lang.Plan"));
  }

  @Test
  public void testNoError() {
    ProgramLoader.loadAgent("io.github.agentsoz.jill.core.testprogram.Agent9", 0, null);
    assertTrue(out.toString().contains("Finished loading 0 agents"));
  }

  @Test
  public void testPostsGoalsEmpty() {
    ProgramLoader.loadAgent("io.github.agentsoz.jill.core.testprogram.Agent10", 0, null);
    assertTrue(out.toString()
        .contains("has incomplete "
            + "@PlanInfo(postsGoals={\"package.GoalClass1\", \"package.GoalClass2\", ...})) "
            + "annotation"));
  }

  @Test
  public void testPostsGoalsNotFound() {
    ProgramLoader.loadAgent("io.github.agentsoz.jill.core.testprogram.Agent11", 0, null);
    assertTrue(out.toString().contains("is not a known goal type"));
  }

  @Test
  public void testPostsGoals() {
    ProgramLoader.loadAgent("io.github.agentsoz.jill.core.testprogram.Agent12", 0, null);
    assertTrue(
        out.toString().contains("Found class " + "io.github.agentsoz.jill.core.testprogram.Goal12 "
            + "of type io.github.agentsoz.jill.lang.Goal"));
  }

  @Test
  public void testLoadExtension() {
    // Load the test extension
    JillExtension extension;
    extension = ProgramLoader.loadExtension("io.github.agentsoz.jill.core.extension.TestExtension");
    assertTrue(out.toString().contains("Loading extension"));
    assertNotNull(extension);

    // Call the init() function
    String[] args = {"Here", "are", "four", "args"};
    extension.init(args);
    assertTrue(out.toString().contains("TestExtension initialised with 4 args"));

    // Call the finish function
    extension.finish();
    assertTrue(out.toString().contains("TestExtension finished"));
  }
}
