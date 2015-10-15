package io.github.agentsoz.jill;

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
import io.github.agentsoz.jill.Main;
import io.github.agentsoz.jill.core.GlobalState;
import io.github.agentsoz.jill.core.ProgramLoaderTest;
import io.github.agentsoz.jill.util.ArgumentsLoader;
import io.github.agentsoz.jill.util.Log;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
        ArgumentsLoader.reset();
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
			"--plan-selection-policy",
			"FIRST",
			"--config",
			"{" + "\n" +
			"\"randomSeed\":\"12345\"," + "\n" +
			"\"agents\":[" +
			"{\"classname\":\"io.github.agentsoz.jill.testprogram.TestAgent\", \"args\":[\"-d\"], \"count\":\"1000\"}" +		
			"]"+
			"}"
		};
		try {
			Main.main(args);
		} catch (Exception e) {}
		assertTrue(out.toString().equals(output));
	}

	@Test
	public void testTestAgentLastSelection() {
		final String output = "8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888";
		String[] args = {
				"--plan-selection-policy",
				"LAST",
				"--config",
				"{" + "\n" +
				"\"randomSeed\":\"12345\"," + "\n" +
				"\"agents\":[" +
				"{\"classname\":\"io.github.agentsoz.jill.testprogram.TestAgent\", \"args\":[\"-d\"], \"count\":\"1000\"}" +		
				"]"+
				"}"
			};
		try {
			Main.main(args);
		} catch (Exception e) {}
		assertTrue(out.toString().equals(output));
	}

	@Test
	public void testPingPong() {
		final String output = "ping!pong!";
		String[] args = {
				"--config",
				"{\"agents\":[" +
				"{\"classname\":\"io.github.agentsoz.jill.sendreceive.Talker\", \"args\":[], \"count\":\"2\"}" +		
				"]}"
			};
		try {
			Main.main(args);
		} catch (Exception e) {}
		assertTrue(out.toString().equals(output));
	}

}
