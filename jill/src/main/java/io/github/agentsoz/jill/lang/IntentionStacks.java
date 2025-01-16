package io.github.agentsoz.jill.lang;

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
   *
   * @return the active stack
   */
  Stack255 getActiveStack() {
    return (Stack255) stacks.get(activeStack);
  }

  /**
   * Makes the next intentions stack active using a round robin scheme.
   *
   * @return the newly active stack.
   */
  Stack255 nextActiveStack() {
    activeStack = (activeStack + 1) % stacks.size();
    return (Stack255) stacks.get(activeStack);
  }

  /**
   * Returns an empty intentions stack.
   * Creates a new intentions stack and adds it to the list of stacks if needed.
   *
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
