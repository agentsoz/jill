package io.github.agentsoz.jill.example.tokenpassing;

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

import io.github.agentsoz.jill.lang.Agent;
import io.github.agentsoz.jill.lang.AgentInfo;
import io.github.agentsoz.jill.util.Log;
import java.io.PrintStream;

/**
 * <p>TokenAgent1 class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
@AgentInfo(hasGoals = {"io.github.agentsoz.jill.example.tokenpassing.Token1"})
public class TokenAgent1 extends Agent {

  // Defaults
  /** Constant <code>rounds=1</code>. */
  public static int rounds = 1;
  /** Constant <code>out</code>. */
  public static PrintStream out;

  /**
   * <p>Constructor for TokenAgent1.</p>
   *
   * @param str a {@link java.lang.String} object.
   */
  public TokenAgent1(String str) {
    super(str);
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public void start(PrintStream writer, String[] params) {
    parse(params);
    out = writer;
    if (getId() == 0) {
      Log.debug("round 1");
      send(1, new Token1(1, 1));
    }
  }

  /**
   * Parses the command line arguments.
   *
   * @param args the command line arguments
   */
  public static void parse(String[] args) {
    for (int i = 0; i < args.length; i++) {
      if ("-rounds".equals(args[i]) && i + 1 < args.length) {
        i++;
        try {
          rounds = Integer.parseInt(args[i]);
        } catch (NumberFormatException e) {
          Log.warn("Value '" + args[i] + "' is not a number");
        }
      }
    }
  }
}
