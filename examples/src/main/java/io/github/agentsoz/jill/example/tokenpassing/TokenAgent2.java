package io.github.agentsoz.jill.example.tokenpassing;

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

import io.github.agentsoz.jill.lang.Agent;
import io.github.agentsoz.jill.lang.AgentInfo;
import io.github.agentsoz.jill.util.Log;

import java.io.PrintStream;

/**
 * <p>TokenAgent2 class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
@AgentInfo(hasGoals = {"io.github.agentsoz.jill.example.tokenpassing.Token2"})
public class TokenAgent2 extends Agent {

  // Defaults
  /** Constant <code>rounds=1</code>. */
  public static int rounds = 1;
  /** Constant <code>out</code>. */
  public static PrintStream out;

  /**
   * <p>Constructor for TokenAgent2.</p>
   *
   * @param str a {@link java.lang.String} object.
   */
  public TokenAgent2(String str) {
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
      send(1, new Token2(1, 1));
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
