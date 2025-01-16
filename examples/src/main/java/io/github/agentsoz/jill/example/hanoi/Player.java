package io.github.agentsoz.jill.example.hanoi;

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
 * <p>Player class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
@AgentInfo(hasGoals = {"io.github.agentsoz.jill.example.hanoi.Solve"})
public class Player extends Agent {

  /** Constant <code>out</code>. */
  public static PrintStream out;

  // Defaults
  private static int ndiscs = 5;
  private Board board;

  /**
   * <p>Constructor for Player.</p>
   *
   * @param name a {@link java.lang.String} object.
   */
  public Player(String name) {
    super(name);
  }

  /**
   * <p>Getter for the field <code>board</code>.</p>
   *
   * @return a {@link io.github.agentsoz.jill.example.hanoi.Board} object.
   */
  public Board getBoard() {
    return board;
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public void start(PrintStream writer, String[] params) {
    out = writer;

    // Parse the arguments
    parse(params);

    // Create the board
    board = new Board(ndiscs);
    out.println("Initialised hanoi board with " + ndiscs + " discs:");
    out.println(board.toString());

    // Solve the board
    post(new Solve("s", ndiscs, 0, 2, 1));
  }

  /**
   * Parses the command line arguments.
   *
   * @param args the command line arguments
   */
  public static void parse(String[] args) {
    for (int i = 0; i < args.length; i++) {
      if ("-discs".equals(args[i]) && (i + 1 < args.length)) {
        i++;
        try {
          ndiscs = Integer.parseInt(args[i]);
        } catch (NumberFormatException e) {
          Log.warn("Number od discs value '" + args[i] + "' is not a number");
        }
      }
    }
  }

}
