package io.github.agentsoz.jill.util;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.security.Permission;

import junit.framework.TestCase;

public class ArgumentsLoaderParseTest extends TestCase {

  private ByteArrayOutputStream out;
  private ByteArrayOutputStream err;

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

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    System.setSecurityManager(new NoExitSecurityManager());
    out = new ByteArrayOutputStream();
    err = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
    System.setErr(new PrintStream(err));
  }

  @Override
  protected void tearDown() throws Exception {
    System.setSecurityManager(null); // or save and restore original
    super.tearDown();
    System.setOut(null);
    System.setErr(null);
    out.close();
    err.close();
  }

  public void testParse() throws Exception {
    try {
      String[] args = null;
      ArgumentsLoader.parse(args);
    } catch (Exception e) {
    }
    try {
      String[] args = {};
      ArgumentsLoader.parse(args);
    } catch (ExitException e) {
      assertEquals("Exit status", 1, e.status);
    }
    try {
      String[] args = {""};
      ArgumentsLoader.parse(args);
    } catch (ExitException e) {
      assertEquals("Exit status", 1, e.status);
    }
    try {
      String[] args = {"--help"};
      ArgumentsLoader.parse(args);
    } catch (ExitException e) {
      assertEquals("Exit status", 0, e.status);
    }
    try {
      String[] args = {"--config",
          "{programOutputFile:\"./test1.log\","
              + "agents:[{classname:io.github.agentsoz.jill.example.hanoi.Player, "
              + "args:[-discs, 9], " + "count: 1}]" + "}"};
      ArgumentsLoader.parse(args);
    } catch (Exception e) {
      fail("Command line args could not be parsed: " + e.getMessage());
    }
    try {
      String configFile = getClass().getResource("config-example.txt").getFile();
      String[] args = {"--configfile", configFile};
      ArgumentsLoader.parse(args);
    } catch (Exception e) {
      fail("Command line args could not be parsed: " + e.getMessage());
    }
    try {
      String configFile = getClass().getResource("config-example.txt").getFile();
      String[] args = {"--configfile", configFile, "--exit-on-idle", "true", "--exit-on-idle",
          "false", "--plan-selection-policy", "FIRST", "--plan-selection-policy", "RANDOM",
          "--plan-selection-policy", "LAST", "--plan-instances-limit", "10"};
      ArgumentsLoader.parse(args);
    } catch (Exception e) {
      fail("Command line args could not be parsed: " + e.getMessage());
    }
  }

}
