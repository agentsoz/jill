package io.github.agentsoz.jill;

/*
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

import ch.qos.logback.classic.Level;
import io.github.agentsoz.jill.core.GlobalState;
import io.github.agentsoz.jill.util.ArgumentsLoader;
import io.github.agentsoz.jill.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class MainTest {

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
  public void testTestAgentFirstSelection() {
    final String output =
        "7777777777777777777777777777777777777777777777777777777777777777777777777777777777"
            + "7777777777777777777777777777777777777777777777777777777777777777777777777777777"
            + "77777777777777777777777777777777777777777777777777777777777777777777777777777777"
            + "777777777777777777777777777777777777777777777777777777777777777777777777777777777"
            + "77777777777777777777777777777777777777777777777777777777777777777777777777777777"
            + "77777777777777777777777777777777777777777777777777777777777777777777777777777777"
            + "77777777777777777777777777777777777777777777777777777777777777777777777777777777"
            + "77777777777777777777777777777777777777777777777777777777777777777777777777777777"
            + "77777777777777777777777777777777777777777777777777777777777777777777777777777777"
            + "77777777777777777777777777777777777777777777777777777777777777777777777777777777"
            + "77777777777777777777777777777777777777777777777777777777777777777777777777777777"
            + "77777777777777777777777777777777777777777777777777777777777777777777777777777777"
            + "77777777777777777777777777777777777777";
    final String[] args = {"--plan-selection-policy", "FIRST", "--config",
        "{" + "\n" + "\"randomSeed\":\"12345\"," + "\n" + "\"agents\":["
            + "{\"classname\":\"io.github.agentsoz.jill.testprogram.TestAgent\","
            + " \"args\":[\"-d\"], \"count\":\"1000\"}" + "]" + "}"};
    Main.main(args);
    assertEquals(out.toString(), output);
  }

  @Test
  public void testTestAgentLastSelection() {
    final String output =
        "88888888888888888888888888888888888888888888888888888888888888888888888888888888888888888"
            + "88888888888888888888888888888888888888888888888888888888888888888888888888888888888"
            + "88888888888888888888888888888888888888888888888888888888888888888888888888888888888"
            + "88888888888888888888888888888888888888888888888888888888888888888888888888888888888"
            + "88888888888888888888888888888888888888888888888888888888888888888888888888888888888"
            + "88888888888888888888888888888888888888888888888888888888888888888888888888888888888"
            + "88888888888888888888888888888888888888888888888888888888888888888888888888888888888"
            + "88888888888888888888888888888888888888888888888888888888888888888888888888888888888"
            + "88888888888888888888888888888888888888888888888888888888888888888888888888888888888"
            + "88888888888888888888888888888888888888888888888888888888888888888888888888888888888"
            + "88888888888888888888888888888888888888888888888888888888888888888888888888888888888"
            + "888888888888888888888888888888888888888888888888888888888888888888888888888888888";
    final String[] args = {"--plan-selection-policy", "LAST", "--config",
        "{" + "\n" + "\"randomSeed\":\"12345\"," + "\n" + "\"agents\":["
            + "{\"classname\":\"io.github.agentsoz.jill.testprogram.TestAgent\","
            + " \"args\":[\"-d\"], \"count\":\"1000\"}" + "]" + "}"};
    Main.main(args);
    assertEquals(out.toString(), output);
  }

  @Test
  public void testPingPong() {
    final String output = "ping!pong!";
    String[] args = {"--config",
        "{\"agents\":["
            + "{\"classname\":\"io.github.agentsoz.jill.sendreceive.Talker\", \"args\":[],"
            + " \"count\":\"2\"}" + "]}"};
    Main.main(args);
    assertEquals(out.toString(), output);
  }


  @Test
  public void testMultiTask() {
    final String output = ""
        + "do-p-1\n" + "do-q-1\n" + "do-r-1\n"
        + "do-p-2\n" + "do-q-2\n" + "do-r-2\n"
        + "do-p-3\n" + "do-q-3\n" + "do-r-3\n"
        + "do-p-4\n" + "do-q-4\n" + "do-r-4\n"
        + "do-p-5\n" + "do-q-5\n" + "do-r-5\n";
    String[] args = {"--config", "{"
        + "randomSeed:123456,"
        + "numThreads:1,"
        + "agents:["
        + "{classname:io.github.agentsoz.jill.multitask.MultiTasker,"
        + "args:[], count:1}" + "]}"};
    Main.main(args);
    assertEquals(output, out.toString());
  }

  @Test
  public void testMultiTaskRequest() {
    final String output = ""
        + "ask-p-1\n" + "ask-q-1\n" + "ask-r-1\n"
        + "ask-p-2\n" + "ask-q-2\n" + "ask-r-2\n"
        + "ask-p-3\n" + "ask-q-3\n" + "ask-r-3\n"
        + "ask-p-4\n" + "ask-q-4\n" + "ask-r-4\n"
        + "ask-p-5\n" + "ask-q-5\n" + "ask-r-5\n";
    String[] args = {"--config", "{"
        + "randomSeed:123456,"
        + "numThreads:1,"
        + "agents:["
        + "{classname:io.github.agentsoz.jill.multitask.MultiTaskRequester, args:[], count:1},"
        + "{classname:io.github.agentsoz.jill.multitask.MultiTasker, args:[], count:1}"
        + "]}"};
    Main.main(args);
    assertEquals(output, out.toString());
  }


  @Test
  public void testBeliefBindingsInMetaPlan() {
    final String output = "PlanGreetNeighbour" + ",0:Alex K. Jones:male" + ",0:Daniel I. Smith:male"
        + ",0:John P. Wilson:male" + ",0:Lionel U. Smith:male\n" + "PlanGreetNeighbour"
        + ",0:Alex K. Jones:male" + ",0:Daniel I. Smith:male" + ",0:John P. Wilson:male"
        + ",0:Lionel U. Smith:male\n" + "PlanGreetNeighbour" + ",0:Alex K. Jones:male"
        + ",0:Daniel I. Smith:male" + ",0:John P. Wilson:male" + ",0:Lionel U. Smith:male\n";
    final String[] args = {"--config",
        "{" + "\n" + "\"randomSeed\":\"12345\"," + "\n" + "\"agents\":["
            + "{\"classname\":\"io.github.agentsoz.jill.testgreeter.TestGreeterAgent\","
            + " \"args\":[\"-seed\",\"12345\",\"-neighbourhoodSize\",\"5\", \"-verboseMetaPlan\"],"
            + " \"count\":\"3\"}" + "]}"};
    Main.main(args);
    assertEquals(output, out.toString());
  }

  @Test
  public void testContextVariablesBindingsInPlan() {
    final String output =
        "Hello Alex K. Jones\n" + "Hello Alex K. Jones\n" + "Hello Alex K. Jones\n";
    final String[] args = {"--plan-selection-policy", "FIRST", "--config",
        "{" + "\n" + "\"randomSeed\":\"12345\"," + "\n" + "\"agents\":["
            + "{\"classname\":\"io.github.agentsoz.jill.testgreeter.TestGreeterAgent\","
            + " \"args\":[\"-seed\",\"12345\",\"-neighbourhoodSize\",\"5\", \"-verbosePlans\"],"
            + " \"count\":\"3\"}" + "]}"};
    Main.main(args);
    assertEquals(output, out.toString());
  }
  
  @Test
  public void testMultiagentReproducableLogging() {
    final String output = "a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 " 
            + "a10 a11 a12 a13 a14 a15 a16 a17 a18 a19 "
            + "a20 a21 a22 a23 a24 a25 a26 a27 a28 a29 "
            + "a30 a31 a32 a33 a34 a35 a36 a37 a38 a39 "
            + "a40 a41 a42 a43 a44 a45 a46 a47 a48 a49 "
            ;
    final String[] args = {"--plan-selection-policy", "FIRST", 
        "--config", "{" 
            + "randomSeed:123456," 
            + "numThreads:1," 
            + "agents:["
            + "{classname:io.github.agentsoz.jill.testprogram.LogAgent,"
            + " args:[\"-d\"], count:50}" + "]" 
            + "}"};
    Main.main(args);
    assertEquals(output, out.toString());
  }

  @Test
  public void testInitialisingMultipleAgentTypes() {
    final String output = "a0 a1 a2 a3 a4 a5 a6 a7 a8 a9 "
        + "a10 a11 a12 a13 a14 a15 a16 a17 a18 a19 "
        + "a20 a21 a22 a23 a24 a25 a26 a27 a28 a29 "
        + "a30 a31 a32 a33 a34 a35 a36 a37 a38 a39 "
        + "a40 a41 a42 a43 a44 a45 a46 a47 a48 a49 "
        + "a0 a1 a2 a3 a4 "
        + "77777777777777777777777777777777777";
    final String[] args = {"--plan-selection-policy", "FIRST",
        "--config", "{"
        + "randomSeed:123456,"
        + "numThreads:1,"
        + "agents:["
        + "{classname:io.github.agentsoz.jill.testprogram.LogAgent, args:[\"-d\"], count:50},"
        + "{classname:io.github.agentsoz.jill.testprogram.TestAgent,args:[\"-d\"], count:30},"
        + "{classname:io.github.agentsoz.jill.testprogram.LogAgent,args:[\"-d\"], count:5},"
        + "{classname:io.github.agentsoz.jill.testprogram.TestAgent,args:[\"-d\"], count:5}"
        + "]"
        + "}"};
    Main.main(args);
    assertEquals(output, out.toString());
  }
}
