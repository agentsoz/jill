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
