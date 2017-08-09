package io.github.agentsoz.jill.core;

/*
 * #%L Jill Cognitive Agents Platform %% Copyright (C) 2014 - 2017 by its authors. See AUTHORS file.
 * %% This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public License along with this program.
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>. #L%
 */

import ch.qos.logback.classic.Level;

import io.github.agentsoz.jill.Main;
import io.github.agentsoz.jill.core.GlobalState;
import io.github.agentsoz.jill.core.ProgramLoader;
import io.github.agentsoz.jill.lang.JillExtension;
import io.github.agentsoz.jill.util.Log;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class ProgramLoaderTest {

  private ByteArrayOutputStream out;
  private ByteArrayOutputStream err;

  @Before
  public void setUp() throws Exception {
    out = new ByteArrayOutputStream();
    err = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
    System.setErr(new PrintStream(err));
    // Configure logging
    Log.createLogger(Main.LOGGER_NAME, Level.INFO,
        ProgramLoaderTest.class.getSimpleName() + ".log");
    GlobalState.reset();
  }

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
    assertTrue(out.toString().contains(
        "is missing the @AgentInfo(hasGoals={\"package.GoalClass1, package.GoalClass2, ...\"}) annotation"));
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
    assertTrue(out.toString().contains(
        "is missing the @GoalInfo(hasPlans={\"package.PlanClass1, package.PlanClass2, ...\"}) annotation"));
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
    assertTrue(out.toString().contains(
        "has incomplete @PlanInfo(postsGoals={\"package.GoalClass1\", \"package.GoalClass2\", ...})) annotation"));
  }

  @Test
  public void testPostsGoalsNotFound() {
    ProgramLoader.loadAgent("io.github.agentsoz.jill.core.testprogram.Agent11", 0, null);
    assertTrue(out.toString().contains("is not a known goal type"));
  }

  @Test
  public void testPostsGoals() {
    ProgramLoader.loadAgent("io.github.agentsoz.jill.core.testprogram.Agent12", 0, null);
    assertTrue(out.toString()
        .contains("Found class " + "io.github.agentsoz.jill.core.testprogram.Goal12 "
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
