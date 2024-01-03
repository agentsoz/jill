package io.github.agentsoz.jill.util;

/*-
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.security.Permission;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArgumentsLoaderParseTest {

  private ByteArrayOutputStream out;
  private ByteArrayOutputStream err;

  private static final String exitStatus = "Exit status";

  protected static class ExitException extends SecurityException {
    private static final long serialVersionUID = 6476530573058049502L;

    public final int status;

    public ExitException(int status) {
      super("There is no escape!");
      this.status = status;
    }
  }

  private static class NoExitSecurityManager extends SecurityManager {
    @Override
    public void checkPermission(Permission perm) {
      // allow anything.
    }

    @Override
    public void checkPermission(Permission perm, Object context) {
      // allow anything.
    }

    @Override
    public void checkExit(int status) {
      super.checkExit(status);
      throw new ExitException(status);
    }
  }

  /**
   * Common setup for all tests. Saves stderr and stdout to an output stream.
   *
   * @throws Exception if something went wrong
   */
  @Before
  public void setUp() throws Exception {
    System.setSecurityManager(new NoExitSecurityManager());
    out = new ByteArrayOutputStream();
    err = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
    System.setErr(new PrintStream(err));
  }

  /**
   * Common setup for all tests. Closes stderr and stdout streams.
   *
   * @throws Exception if something went wrong
   */
  @After
  public void tearDown() throws Exception {
    System.setSecurityManager(null); // or save and restore original
    System.setOut(null);
    System.setErr(null);
    out.close();
    err.close();
  }

  @Test
  public void testParse() throws Exception {
    try {
      String[] args = null;
      ArgumentsLoader.parse(args);
    } catch (ExitException e) {
      assertEquals(exitStatus, 1, e.status);
    }
    try {
      String[] args = {};
      ArgumentsLoader.parse(args);
    } catch (ExitException e) {
      assertEquals(exitStatus, 1, e.status);
    }
    try {
      String[] args = {""};
      ArgumentsLoader.parse(args);
    } catch (ExitException e) {
      assertEquals(exitStatus, 1, e.status);
    }
    try {
      String[] args = {"--help"};
      ArgumentsLoader.parse(args);
    } catch (ExitException e) {
      assertEquals(exitStatus, 0, e.status);
    }
    try {
      String[] args = {"--config",
          "{programOutputFile:\"./test1.log\","
              + "agents:[{classname:io.github.agentsoz.jill.example.hanoi.Player, "
              + "args:[-discs, 9], " + "count: 1}]" + "}"};
      ArgumentsLoader.parse(args);
    } catch (ExitException e) {
      fail("Command line args could not be parsed: " + e.getMessage());
    }
    try {
      String configFile = getClass().getResource("config-example.txt").getFile();
      String[] args = {"--configfile", configFile};
      ArgumentsLoader.parse(args);
    } catch (ExitException e) {
      fail("Command line args could not be parsed: " + e.getMessage());
    }
    try {
      String configFile = getClass().getResource("config-example.txt").getFile();
      String[] args = {"--configfile", configFile, "--exit-on-idle", "true", "--exit-on-idle",
          "false", "--plan-selection-policy", "FIRST", "--plan-selection-policy", "RANDOM",
          "--plan-selection-policy", "LAST", "--plan-instances-limit", "10"};
      ArgumentsLoader.parse(args);
    } catch (ExitException e) {
      fail("Command line args could not be parsed: " + e.getMessage());
    }
  }

}
