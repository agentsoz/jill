package io.github.agentsoz.jill.util;

import static org.junit.Assert.assertNotNull;

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

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import ch.qos.logback.classic.Level;

import io.github.agentsoz.jill.Main;
import io.github.agentsoz.jill.config.Config;
import io.github.agentsoz.jill.core.GlobalState;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;


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
      BufferedReader reader = new BufferedReader(new FileReader(configFile));
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
