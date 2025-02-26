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

import io.github.agentsoz.jill.core.GlobalState;
import io.github.agentsoz.jill.core.beliefbase.BeliefBaseException;
import io.github.agentsoz.jill.core.beliefbase.BeliefSetField;
import io.github.agentsoz.jill.lang.Agent;
import io.github.agentsoz.jill.lang.AgentInfo;
import io.github.agentsoz.jill.util.Log;
import java.io.PrintStream;

/**
 * <p>TokenAgent3 class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
@AgentInfo(hasGoals = {"io.github.agentsoz.jill.example.tokenpassing.Token3"})
public class TokenAgent3 extends Agent {

  /** Constant <code>out</code>. */
  public static PrintStream out;
  private static final String beliefset = "neighbour";

  // Defaults
  /** Constant <code>rounds=1</code>. */
  public static int rounds = 1;
  private static int neighbourhood = 2;

  /**
   * <p>Constructor for TokenAgent3.</p>
   *
   * @param str a {@link java.lang.String} object.
   */
  public TokenAgent3(String str) {
    super(str);
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public void start(PrintStream writer, String[] params) {
    parse(params);
    out = writer;

    // Create a new belief set about neighbours
    BeliefSetField[] fields = {new BeliefSetField("name", String.class, true), };

    try {
      // Attach this belief set to this agent
      this.createBeliefSet(beliefset, fields);

      int numAgents = GlobalState.agents.size();

      // Cannot have more neighbours than agents
      if (neighbourhood >= numAgents) {
        Log.error("Agent " + getName() + " cannot add " + neighbourhood
            + " neighbours, when there are only " + numAgents + " agents all up");
        System.exit(-1);
      }
      // Add beliefs about neighbours
      for (int i = 1; i <= neighbourhood; i++) {
        int neighbour = (getId() + i) % numAgents;
        this.addBelief(beliefset, Integer.toString(neighbour));
        Log.debug("Agent " + getName() + " added neighbour " + neighbour);
      }
      Log.debug("Agent " + getName() + " is initialising with neighbourhood size of "
          + neighbourhood + " on each side (so " + (neighbourhood * 2) + " neighbours)");

      // Let Agent 0 start the token passing
      if (getId() == 0) {
        Log.debug("round 1");
        Token3 token = new Token3(1, 1);
        token.setHops(1);
        send(1, token);
      }
    } catch (BeliefBaseException e) {
      Log.error(e.getMessage());
    }
  }

  /**
   * Parses the command line arguments.
   *
   * @param args the command line arguments
   */
  public static void parse(String[] args) {
    for (int i = 0; i < args.length; i++) {
      switch (args[i]) {
        case "-neighbourhood":
          if (i + 1 < args.length) {
            i++;
            try {
              neighbourhood = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
              Log.warn("Value '" + args[i] + "' is not a number");
            }
          }
          break;
        case "-rounds":
          if (i + 1 < args.length) {
            i++;
            try {
              rounds = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
              Log.warn("Value '" + args[i] + "' is not a number");
            }
          }
          break;
        default:
          // Ignore all other arguments
          break;
      }
    }
  }
}
