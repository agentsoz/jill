package io.github.agentsoz.jill.testprogram;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2023 by its authors. See AUTHORS file.
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
import java.io.PrintStream;

@AgentInfo(hasGoals = {"io.github.agentsoz.jill.testprogram.GoalA",
    "io.github.agentsoz.jill.testprogram.GoalB", "io.github.agentsoz.jill.testprogram.GoalC"})
public class TestAgent extends Agent {

  private int status;
  private PrintStream writer;
  private boolean verbose;

  public TestAgent(String str) {
    super(str);
  }

  @Override
  public void start(PrintStream writer, String[] params) {
    if (params != null && params[0].equals("-d")) {
      verbose = true;
      this.writer = writer;
    }
    post(new GoalA("gA"));
  }

  @Override
  public void finish() {
    /*
     * Check that some plan changed status. Should print: hex '8' if plan PlanD ran, hex '7' if
     * plans PlanA then PlanB then PlanC ran.
     */
    if (verbose) {
      if (writer == null) {
        System.out.printf("%h", status);
      } else {
        writer.printf("%h", status);
      }
    }
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

}
