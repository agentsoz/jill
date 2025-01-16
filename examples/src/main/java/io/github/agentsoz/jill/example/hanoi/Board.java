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

import io.github.agentsoz.jill.util.Log;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Board class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
public class Board {

  @SuppressWarnings("unchecked")
  List<Integer>[] pins = (ArrayList<Integer>[]) (new ArrayList[3]);

  /**
   * Creates a new game board.
   *
   * @param ndiscs number of discs in the game
   */
  public Board(int ndiscs) {
    for (int i = 0; i < pins.length; i++) {
      pins[i] = new ArrayList<Integer>();
    }
    for (int i = ndiscs; i > 0; i--) {
      pins[0].add(i);
    }

  }

  /**
   * Move a disc from pin A to pin B.
   *
   * @param pinA the ID of the source pin
   * @param pinB the ID of the destination pin
   * @return true if the move was made, false otherwise
   */
  public boolean move(int pinA, int pinB) {
    // Nothing to do if the pin number is invalid
    if (pinA < 0 || pinA >= pins.length || pinB < 0 || pinB >= pins.length) {
      Log.warn("Invalid board pin specified " + pinA + ". Should be between 0.." + (pins.length - 1)
          + " (inclusive).");
      return false;
    } else if (pins[pinA].isEmpty()) {
      Log.warn("No disc on pin" + pinA);
      return false;
    } else if (pinA == pinB) {
      Log.info("Moving disc from pin" + pinA + " on to itself (means the board will not change)");
      return true;
    }
    int discOnA = pins[pinA].get(pins[pinA].size() - 1);
    int discOnB =
        (pins[pinB].isEmpty()) ? Integer.MAX_VALUE : pins[pinB].get(pins[pinB].size() - 1);
    if (discOnB < discOnA) {
      Log.warn("Cannot move disc" + discOnA + " (pin" + pinA + ") on to smaller disc" + discOnB
          + " (pin" + pinB + ")");
      return false;
    }
    pins[pinB].add(pins[pinA].remove(pins[pinA].size() - 1));
    return true;
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public String toString() {
    StringBuilder str = new StringBuilder();
    if (pins.length == 0) {
      return str.toString();
    }
    for (int i = 0; i < pins.length; i++) {
      if (pins[i].isEmpty()) {
        str.append('|');
      }
      for (Integer j : pins[i]) {
        str.append('|');
        str.append(j);
      }
      str.append('\n');
    }
    return str.substring(0, str.length() - 1);
  }

}
