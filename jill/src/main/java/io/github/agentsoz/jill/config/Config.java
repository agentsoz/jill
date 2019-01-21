package io.github.agentsoz.jill.config;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2019 by its authors. See AUTHORS file.
 * %%
 * This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public License along with this program.
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

import com.google.gson.Gson;

import ch.qos.logback.classic.Level;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Config class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
@SuppressWarnings({"PMD.ImmutableField","PMD.RedundantFieldInitializer"})
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
  public String toString() {
    return new Gson().toJson(this);
  }

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

