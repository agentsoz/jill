package io.github.agentsoz.jill.example.hanoi;

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

import io.github.agentsoz.jill.util.Log;

import java.util.ArrayList;
import java.util.Random;

public class Board {

  @SuppressWarnings("unchecked")
  ArrayList<Integer>[] pins = (ArrayList<Integer>[]) (new ArrayList[3]);

  public Board(Random rand, int ndiscs) {
    for (int i = 0; i < pins.length; i++) {
      pins[i] = new ArrayList<Integer>();
    }
    for (int i = ndiscs; i > 0; i--) {
      pins[0].add(i);
    }

  }

  /**
   * Move a disc from pin a to pin b
   * 
   * @return true if the move was made, false otherwise
   */
  public boolean move(int a, int b) {
    // Nothing to do if the pin number is invalid
    if (a < 0 || a >= pins.length || b < 0 || b >= pins.length) {
      Log.warn("Invalid board pin specified " + a + ". Should be between 0.." + (pins.length - 1)
          + " (inclusive).");
      return false;
    } else if (pins[a].isEmpty()) {
      Log.warn("No disc on pin" + a);
      return false;
    } else if (a == b) {
      Log.info("Moving disc from pin" + a + " on to itself (means the board will not change)");
      return true;
    }
    int discOnA = pins[a].get(pins[a].size() - 1);
    int discOnB = (pins[b].isEmpty()) ? Integer.MAX_VALUE : pins[b].get(pins[b].size() - 1);
    if (discOnB < discOnA) {
      Log.warn("Cannot move disc" + discOnA + " (pin" + a + ") on to smaller disc" + discOnB
          + " (pin" + b + ")");
      return false;
    }
    pins[b].add(pins[a].remove(pins[a].size() - 1));
    return true;
  }

  public String toString() {
    String s = "";
    if (pins.length == 0) {
      return s;
    }
    for (int i = 0; i < pins.length; i++) {
      if (pins[i].isEmpty()) {
        s += "|";
      }
      for (Integer j : pins[i]) {
        s += "|" + j;
      }
      s += "\n";
    }
    return s.substring(0, s.length() - 1);
  }

}
