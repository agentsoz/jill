package agentsoz.jill;

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

import agentsoz.jill.core.GlobalState;
import agentsoz.jill.core.ProgramLoaderTest;
import agentsoz.jill.util.Log;
import ch.qos.logback.classic.Level;

public class MainTest {

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
	public void testTestAgentFirstSelection() {
		final String output = "7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777";
		String[] args = {
			"--agent-class",
			"agentsoz.jill.testprogram.TestAgent",
			"--program-args",
			"-d",
			"--seed",
			"12345",
			"--num-agents",
			"1000",
			"--plan-selection-policy",
			"FIRST",
		};
		Main.main(args);
		assertTrue(out.toString().equals(output));
	}

	@Test
	public void testTestAgentLastSelection() {
		final String output = "8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888";
		String[] args = {
			"--agent-class",
			"agentsoz.jill.testprogram.TestAgent",
			"--program-args",
			"-d",
			"--seed",
			"12345",
			"--num-agents",
			"1000",
			"--plan-selection-policy",
			"LAST",
		};
		Main.main(args);
		assertTrue(out.toString().equals(output));
	}

	@Test
	public void testPingPong() {
		final String output = "ping!pong!";
		String[] args = {
			"--agent-class",
			"agentsoz.jill.sendreceive.Talker",
			"--num-agents",
			"2",
		};
		Main.main(args);
		assertTrue(out.toString().equals(output));
	}

}
