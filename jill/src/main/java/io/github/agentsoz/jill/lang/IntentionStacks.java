package io.github.agentsoz.jill.lang;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2021 by its authors. See AUTHORS file.
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

import io.github.agentsoz.jill.util.Stack255;

/**
 * Manages the intention stacks of the agent (maximum number of allowed stacks is 255).
 *
 * @author dsingh
 * @version $Id: $Id
 */
public final class IntentionStacks {

  /** Stack of intention stacks. **/
  private final Stack255 stacks;

  /** Index of the active stack. **/
  private int activeStack;

  /**
   * Creates an intentions stack.
   */
  IntentionStacks() {
    stacks = new Stack255((byte) 8, (byte) 2); // set of intention stacks
    getEmptyIntentionStack(); // add a single stack to start with
    activeStack = 0; // set it as the active stack
  }

  /**
   * Gets the active intentions stack.
   * @return the active stack
   */
  Stack255 getActiveStack() {
    return (Stack255) stacks.get(activeStack);
  }

  /**
   * Makes the next intentions stack active using a round robin scheme.
   * @return the newly active stack.
   */
  Stack255 nextActiveStack() {
    activeStack = (activeStack + 1) % stacks.size();
    return (Stack255) stacks.get(activeStack);
  }

  /**
   * Returns an empty intentions stack.
   * Creates a new intentions stack and adds it to the list of stacks if needed.
   * @return the newly created stack
   */
  Stack255 getEmptyIntentionStack() {
    // If the active stack is empty then return it (don't check other stacks)
    if (!stacks.isEmpty() && getActiveStack().isEmpty()) {
      return getActiveStack();
    }
    // else create an empty stack, add it to the list ot stacks, and return it
    Stack255 stack = new Stack255((byte) 8, (byte) 2);
    stacks.push(stack);
    return stack;
  }

  int cleanup() {
    if (stacks.size() <= 1) {
      // nothing to clean if we have only one stack
      return stacks.size();
    }
    int size = stacks.size();
    Stack255 newStacks = new Stack255((byte) stacks.size(), (byte) 1);
    // filter out the empty stacks; but keep the last one empyy or not
    while (!stacks.isEmpty()) {
      Stack255 stack = (Stack255) stacks.pop();
      if (stacks.isEmpty() || !stack.isEmpty()) {
        // always add the last one; else add if not empty
        newStacks.push(stack);
      }
    }
    // write back the filtered stack set
    while (!newStacks.isEmpty()) {
      Stack255 stack = (Stack255) newStacks.pop();
      stacks.push(stack);
    }
    if (stacks.size() != size) {
      activeStack = 0; // reset the active stack if stacks size has changed
    }
    return stacks.size();
  }

}
