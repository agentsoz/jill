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
	public void testTestAgent() {
		final String output = "7888877777787887788787788778778887787887788778788877778777777878778777778887777887887887887878888887877878887777777888887888777888878787878888877788888888887877787878788887788778777887777777877777788788788888788887888778787777878778787788788877788787788887777778788778878778877877888778788778877878887777877777787877877777888777788788788788787888888787787888777777788888788877788887878787888887778888888888787778787878888778877877788777777787777778878878888878888788877878777787877878778878887778878778888777777878877887877887787788877878877887787888777787777778787787777788877778878878878878788888878778788877777778888878887778888787878788888777888888888878777878787888877887787778877777778777777887887888887888878887787877778787787877887888777887877888877777787887788787788778778887787887788778788877778777777878778777778887777887887887887878888887877878887777777888887888777888878787878888877788888888887877787878788887788778777887777777877777788788788888788887888778787777878778787788788877788787";
		String[] args = {
			"--agent-class",
			"agentsoz.jill.testprogram.TestAgent",
			"--program-args",
			"-d",
			"--seed",
			"12345",
			"--num-agents",
			"1000",
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
