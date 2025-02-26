package io.github.agentsoz.jill.util;

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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import ch.qos.logback.classic.Level;
import io.github.agentsoz.jill.Main;
import io.github.agentsoz.jill.config.Config;
import io.github.agentsoz.jill.core.GlobalState;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.LoggerFactory;

public class ArgumentsLoaderTest {

  private ByteArrayOutputStream out;
  private ByteArrayOutputStream err;

  String configString = "{" + "\"agents\":" + "["
      + "{\"classname\":\"package.AgentType1\",\"args\":[\"at1a\"],\"count\":100}" + "],"
      + "\"extensions\":" + "["
      + "{\"classname\":\"package.TestExtension1\",\"args\":[\"te1a\",\"te1b\"]}" + "]" + "}";
  String configFile = getClass().getResource("config-example.txt").getFile();


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
  public void testLoadNullConfig() {
    // Config is null if no file has been specified
    Config config = ArgumentsLoader.loadConfigFromString(null);
    assertNull(config);
  }

  @Test
  public void testLoadEmptyConfig() {
    Config config = ArgumentsLoader.loadConfigFromString("");
    assertNull(config);
  }

  @Test
  public void testLoadDefaultConfig() {
    Config config = ArgumentsLoader.loadConfigFromString("{}");
    assertNotNull(config);
  }

  @Test
  public void testLoadConfigFromString() {
    // Load the config object from the specified string
    Config config = ArgumentsLoader.loadConfigFromString(configString);
    assertNotNull(config);
    // Check that the config string (minus the enclosing brackets), exists in the returned config
    assertTrue(config.toString().contains(configString.substring(1, configString.length() - 1)));
  }


  @Test
  public void testLoadConfigFromFile() {
    // Load a sample config file
    Config config = ArgumentsLoader.loadConfigFromFile(configFile);
    assertNotNull(config);

    // Compare what was loaded to what was in the file
    String filecontents = "";
    String configcontents = config.toString().replaceAll("\\s+", "");
    StringBuilder str = new StringBuilder();
    try {
      BufferedReader reader = new BufferedReader(//NOPMD - ensure resources are closed after use
          new FileReader(configFile));
      String line = reader.readLine();
      while (line != null) {
        line = line.replaceAll("(?://.*)", "");
        str.append(line);
        line = reader.readLine();
      }
      reader.close();
      filecontents = str.toString();
      // remove spaces from the read file
      filecontents = filecontents.replaceAll("\\s+", "");
      // remove java commments from the read file
      filecontents = filecontents.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)", "");
    } catch (IOException e) {
      LoggerFactory.getLogger(Main.LOGGER_NAME).error("Error in reading config file " + configFile,
          e);
    }
    // Check that the config string (minus the enclosing brackets), exists in the returned config
    assertTrue(configcontents.contains(filecontents.substring(1, filecontents.length() - 1)));
  }

}
