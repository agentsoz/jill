package io.github.agentsoz.jill.util;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2018 by its authors. See AUTHORS file.
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

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.FileAppender;

import org.slf4j.LoggerFactory;


/**
 * <p>Log class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
public final class Log {

  private static Logger logger;

  /**
   * This class cannot be instantiated.
   */
  private Log() {
    
  }

  /**
   * <p>info.</p>
   *
   * @param msg a {@link java.lang.String} object.
   */
  public static void info(String msg) {
    logger.info(msg);
  }

  /**
   * <p>trace.</p>
   *
   * @param msg a {@link java.lang.String} object.
   */
  public static void trace(String msg) {
    logger.trace(msg);
  }

  /**
   * <p>warn.</p>
   *
   * @param msg a {@link java.lang.String} object.
   */
  public static void warn(String msg) {
    logger.warn(msg);
  }

  /**
   * <p>debug.</p>
   *
   * @param msg a {@link java.lang.String} object.
   */
  public static void debug(String msg) {
    logger.debug(msg);
  }

  /**
   * <p>error.</p>
   *
   * @param msg a {@link java.lang.String} object.
   */
  public static void error(String msg) {
    logger.error(msg);
  }


  /**
   * Creates a new logger.
   *
   * @param name a name for the logger
   * @param level the logging level for the logger
   * @param file the file to output all logging to
   * @return the created logger
   */
  public static Logger createLogger(String name, Level level, String file) {
    LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
    PatternLayoutEncoder ple = new PatternLayoutEncoder();
    ple.setPattern("%date %level [%thread] %logger{10} [%file:%line]%n%msg%n%n");
    ple.setContext(lc);
    ple.start();
    FileAppender<ILoggingEvent> fileAppender = new FileAppender<ILoggingEvent>();
    fileAppender.setFile(file);
    fileAppender.setEncoder(ple);
    fileAppender.setAppend(false);
    fileAppender.setContext(lc);
    fileAppender.start();
    logger = (Logger) LoggerFactory.getLogger(name);
    logger.detachAndStopAllAppenders(); // detach console (doesn't seem to work)
    logger.addAppender(fileAppender); // attach file appender
    logger.setLevel(level);
    logger.setAdditive(true); // set to true if root should log too

    return logger;
  }

  /**
   * Returns a agent name string to use for logging.
   *
   * @param idx ID of the agent
   * @return string to use for logging
   * @since 0.3.4
   */
  public static String logPrefix(int idx) {
    return "Agent " + idx + ":";
  }
  
  /**
   * Returns a formatted string for logging the duration between two timestamps.
   *
   * @param start start time in ms
   * @param end end time in ms
   * @return formatted duration string
   * @since 0.3.4
   */
  public static String formattedDuration(long start, long end) {
    return "(" + (end - start) + " ms)";
  }



}
