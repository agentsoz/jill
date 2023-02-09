package io.github.agentsoz.jill.config;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2023 by its authors. See AUTHORS file.
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

import ch.qos.logback.classic.Level;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Config class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
@SuppressWarnings({"PMD.ImmutableField", "PMD.RedundantFieldInitializer"})
public class Config {

  private String logFile = "Run.log";
  private String logLevel = "WARN";
  private String programOutputFile = null;
  private Integer numThreads = Runtime.getRuntime().availableProcessors();
  private Integer randomSeed = -1;
  private Boolean doPauseForUserInput = false;

  private List<AgentTypeData> agents;
  private List<ExtensionData> extensions;

  /**
   * <p>Getter for the field <code>logFile</code>.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getLogFile() {
    return logFile;
  }

  /**
   * <p>Getter for the field <code>logLevel</code>.</p>
   *
   * @return a {@link ch.qos.logback.classic.Level} object.
   */
  public Level getLogLevel() {
    return Level.toLevel(logLevel);
  }

  /**
   * <p>Getter for the field <code>programOutputFile</code>.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  public String getProgramOutputFile() {
    return programOutputFile;
  }

  /**
   * <p>Getter for the field <code>numThreads</code>.</p>
   *
   * @return a int.
   */
  public int getNumThreads() {
    return numThreads;
  }

  /**
   * <p>Getter for the field <code>randomSeed</code>.</p>
   *
   * @return a long.
   */
  public long getRandomSeed() {
    return randomSeed;
  }

  /**
   * <p>isDoPauseForUserInput.</p>
   *
   * @return a boolean.
   */
  public boolean isDoPauseForUserInput() {
    return doPauseForUserInput;
  }

  /**
   * <p>Getter for the field <code>extensions</code>.</p>
   *
   * @return a {@link java.util.List} object.
   */
  public List<ExtensionData> getExtensions() {
    return extensions;
  }

  /**
   * <p>Setter for the field <code>extensions</code>.</p>
   *
   * @param extensions a {@link java.util.List} object.
   */
  public void setExtensions(List<ExtensionData> extensions) {
    this.extensions = extensions;
  }

  /**
   * <p>Getter for the field <code>agents</code>.</p>
   *
   * @return a {@link java.util.List} object.
   */
  public List<AgentTypeData> getAgents() {
    return agents;
  }

  /**
   * <p>Setter for the field <code>agents</code>.</p>
   *
   * @param agents a {@link java.util.List} object.
   */
  public void setAgents(List<AgentTypeData> agents) {
    this.agents = agents;
  }

  /**
   * <p>toString.</p>
   *
   * @return a {@link java.lang.String} object.
   */
  @Override
  public String toString() {
    return new Gson().toJson(this);
  }

  /**
   * Configuration for Jill extensions.
   */
  public class ExtensionData {
    private String classname;
    private List<String> args = new ArrayList<String>();

    public String getClassname() {
      return classname;
    }

    public void setClassname(String classname) {
      this.classname = classname;
    }

    public List<String> getArgs() {
      return args;
    }

    public void setArgs(List<String> args) {
      this.args = args;
    }
  }

  /**
   * Configuration for agent types.
   */
  public class AgentTypeData {
    private String classname;
    private List<String> args;
    private int count;

    public AgentTypeData() {
      args = new ArrayList<String>();
    }

    public String getClassname() {
      return classname;
    }

    public void setClassname(String classname) {
      this.classname = classname;
    }

    public List<String> getArgs() {
      return args;
    }

    public void setArgs(List<String> args) {
      this.args = args;
    }

    public int getCount() {
      return count;
    }

    public void setCount(int count) {
      this.count = count;
    }
  }
}

