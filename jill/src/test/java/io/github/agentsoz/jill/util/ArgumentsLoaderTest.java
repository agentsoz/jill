package io.github.agentsoz.jill.util;

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

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

import io.github.agentsoz.jill.config.Config;
import io.github.agentsoz.jill.core.GlobalState;
import io.github.agentsoz.jill.core.ProgramLoaderTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ch.qos.logback.classic.Level;

public class ArgumentsLoaderTest {

  private ByteArrayOutputStream out;
  private ByteArrayOutputStream err;

  String configString = "{" + "\"agents\":" + "["
      + "{\"classname\":\"package.AgentType1\",\"args\":[\"at1a\"],\"count\":100}" + "],"
      + "\"extensions\":" + "["
      + "{\"classname\":\"package.TestExtension1\",\"args\":[\"te1a\",\"te1b\"]}" + "]" + "}";
  String configFile = getClass().getResource("config-example.txt").getFile();


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
  public void testLoadNullConfig() {
    // Config is null if no file has been specified
    Config c = ArgumentsLoader.loadConfigFromString(null);
    assertNull(c);
  }

  @Test
  public void testLoadEmptyConfig() {
    Config c = ArgumentsLoader.loadConfigFromString("");
    assertNull(c);
  }

  @Test
  public void testLoadDefaultConfig() {
    Config c = ArgumentsLoader.loadConfigFromString("{}");
    assertNotNull(c);
  }

  @Test
  public void testLoadConfigFromString() {
    // Load the config object from the specified string
    Config c = ArgumentsLoader.loadConfigFromString(configString);
    assertNotNull(c);
    // Check that the config string (minus the enclosing brackets), exists in the returned config
    assertTrue(c.toString().contains(configString.substring(1, configString.length() - 1)));
  }


  @Test
  public void testLoadConfigFromFile() {
    // Load a sample config file
    Config c = ArgumentsLoader.loadConfigFromFile(configFile);
    assertNotNull(c);

    // Compare what was loaded to what was in the file
    String filecontents = "";
    String configcontents = c.toString().replaceAll("\\s+", "");
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
      e.printStackTrace();
    }
    // Check that the config string (minus the enclosing brackets), exists in the returned config
    assertTrue(configcontents.contains(filecontents.substring(1, filecontents.length() - 1)));
  }

}
