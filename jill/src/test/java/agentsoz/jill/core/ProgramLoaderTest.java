package agentsoz.jill.core;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2015 by its authors. See AUTHORS file.
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

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ch.qos.logback.classic.Level;
import agentsoz.jill.util.Log;

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
        Log.createLogger("", Level.INFO, ProgramLoaderTest.class.getSimpleName() + ".log");
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
		ProgramLoader.load("agentsoz.jill.core.testprogram.Agent0", 0, null);
		assertTrue(err.toString().contains("does not extend agentsoz.jill.lang.Agent"));
	}

	@Test
	public void testAgentInfo() {
		ProgramLoader.load("agentsoz.jill.core.testprogram.Agent1", 0, null);
		assertTrue(err.toString().contains("is missing the @AgentInfo(hasGoals={\"package.GoalClass1, package.GoalClass2, ...\"}) annotation"));
	}

	@Test
	public void testHasGoals() { 
		ProgramLoader.load("agentsoz.jill.core.testprogram.Agent2", 0, null);
		assertTrue(err.toString().contains("does not have any goals defined"));
	}

	@Test
	public void testGoalNotFound() {
		ProgramLoader.load("agentsoz.jill.core.testprogram.Agent3", 0, null);
		assertTrue(err.toString().contains("Class not found"));
	}

	@Test
	public void testGoalType() {
		ProgramLoader.load("agentsoz.jill.core.testprogram.Agent4", 0, null);
		assertTrue(err.toString().contains("is not of type Goal"));
	}

	@Test
	public void testGoalInfo() {
		ProgramLoader.load("agentsoz.jill.core.testprogram.Agent5", 0, null);
		assertTrue(err.toString().contains("is missing the @GoalInfo(hasPlans={\"package.PlanClass1, package.PlanClass2, ...\"}) annotation"));
	}

	@Test
	public void testHasPlans() {
		ProgramLoader.load("agentsoz.jill.core.testprogram.Agent6", 0, null);
		assertTrue(err.toString().contains("does not have any plans defined"));
	}

	@Test
	public void testPlanNotFound() {
		ProgramLoader.load("agentsoz.jill.core.testprogram.Agent7", 0, null);
		assertTrue(err.toString().contains("Class not found"));
	}

	@Test
	public void testPlanType() {
		ProgramLoader.load("agentsoz.jill.core.testprogram.Agent8", 0, null);
		assertTrue(err.toString().contains("is not of type Plan"));
	}

	@Test
	public void testNoError() {
		ProgramLoader.load("agentsoz.jill.core.testprogram.Agent9", 0, null);
		assertTrue(err.toString().equals(""));
	}
	
	@Test
	public void testPostsGoalsEmpty() {
		ProgramLoader.load("agentsoz.jill.core.testprogram.Agent10", 0, null);
		assertTrue(err.toString().contains("has incomplete @PlanInfo(postsGoals={\"package.GoalClass1\", \"package.GoalClass2\", ...})) annotation"));
	}

	@Test
	public void testPostsGoalsNotFound() {
		ProgramLoader.load("agentsoz.jill.core.testprogram.Agent11", 0, null);
		assertTrue(err.toString().contains("is not a known goal type"));
	}
	
	@Test
	public void testPostsGoals() {
		ProgramLoader.load("agentsoz.jill.core.testprogram.Agent12", 0, null);
		assertTrue(err.toString().equals(""));
	}
}
