package io.github.agentsoz.jill.testgreeter;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2024 by its authors. See AUTHORS file.
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

import io.github.agentsoz.jill.core.beliefbase.Belief;
import io.github.agentsoz.jill.core.beliefbase.BeliefBaseException;
import io.github.agentsoz.jill.core.beliefbase.BeliefSetField;
import io.github.agentsoz.jill.lang.Agent;
import io.github.agentsoz.jill.lang.AgentInfo;
import io.github.agentsoz.jill.lang.MetaPlan;
import io.github.agentsoz.jill.lang.Plan;
import io.github.agentsoz.jill.lang.PlanBindings;
import io.github.agentsoz.jill.util.Log;
import java.io.PrintStream;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

@SuppressWarnings("PMD")
@AgentInfo(hasGoals = {"io.github.agentsoz.jill.testgreeter.GoalBeFriendly"})
public class TestGreeterAgent extends Agent {

  protected PrintStream writer;

  // Defaults
  private static Random rand = new Random();
  private static int numNeighbours = 1;

  protected boolean verbosePlans;
  private boolean verboseMetaPlan;

  private static final String beliefset = "neighbour";

  public TestGreeterAgent(String name) {
    super(name);
  }

  @Override
  public void start(PrintStream writer, String[] params) {
    this.writer = writer;

    // Parse the arguments
    parse(params, this);

    // Create a new belief set about neighbours
    BeliefSetField[] fields = {new BeliefSetField("name", String.class, true),
        new BeliefSetField("gender", String.class, false), };

    try {
      // Attach this belief set to this agent
      this.createBeliefSet(beliefset, fields);

      // Add beliefs about neighbours
      registerNeighbours(rand, numNeighbours);
      Log.debug("Agent " + getName() + " is initialising with " + numNeighbours + " neighbours");

      // Register a meta plan
      registerMetaPlan(new TestMetaPlan(verboseMetaPlan ? writer : null));

      // Post the goal to be friendly
      post(new GoalBeFriendly("GoalBeFriendly"));
    } catch (BeliefBaseException e) {
      Log.error(e.getMessage());
    }
  }

  /**
   * Helper function to add beliefs about neighbours.
   *
   * @param rand random number generator to use
   * @param count number of beliefs to add
   * @throws BeliefBaseException thrown if something went wrong
   */
  private void registerNeighbours(Random rand, int count) throws BeliefBaseException {
    final String[] males = {"Alex", "Daniel", "John", "Lionel", "Nick", "Oscar", "Paul",
        "Rod", "Sam", "Tom"};
    final String[] females = {"Alice", "Elisa", "Fiona", "Julia", "Kate", "Laura", "Margaret",
        "Nancy", "Pam", "Rachael"};
    final String[] middle = {"A.", "B.", "C.", "D.", "E.", "F.", "G.", "H.", "I.", "J.", "K.", "L.",
        "M.", "N.", "O.", "P.", "Q.", "R.", "S.", "T.", "U.", "V.", "W.", "X.", "Y.", "Z."};
    final String[] surnames = {"Anderson", "Brown", "Jones", "Martin", "Morton", "Smith", "Taylor",
        "White", "Williams", "Wilson", };
    int size = (count < 0) ? 0 : count;
    StringBuilder name = new StringBuilder();
    for (int i = 0; i < size; i++) {
      boolean male = (rand.nextDouble() < 0.5) ? true : false;
      name.setLength(0);
      name.append(male ? males[rand.nextInt(males.length)] : females[rand.nextInt(females.length)]);
      name.append(' ');
      name.append(middle[rand.nextInt(middle.length)]);
      name.append(' ');
      name.append(surnames[rand.nextInt(surnames.length)]);
      this.addBelief(beliefset, name.toString(), male ? "male" : "female");
    }
  }

  /**
   * Parses command line arguments. 
   *
   * @param args the command line arguments
   * @param agent the agent to which the arguments apply
   */
  public static void parse(String[] args, TestGreeterAgent agent) {
    for (int i = 0; i < args.length; i++) {
      switch (args[i]) {
        case "-seed":
          if (i + 1 < args.length) {
            i++;
            int seed = 0;
            try {
              seed = Integer.parseInt(args[i]);
              rand = new Random(seed);
            } catch (NumberFormatException e) {
              Log.warn("Seed value '" + args[i] + "' is not a number");
            }
          }
          break;
        case "-neighbourhoodSize":
          if (i + 1 < args.length) {
            i++;
            try {
              numNeighbours = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
              Log.warn("Neighbourhood size value '" + args[i] + "' is not a number");
            }
          }
          break;
        case "-verbosePlans":
          agent.verbosePlans = true;
          break;
        case "-verboseMetaPlan":
          agent.verboseMetaPlan = true;
          break;
        default:
          break;
      }
    }
  }

  private class TestMetaPlan implements MetaPlan {

    private final PrintStream writer;

    /*package*/ TestMetaPlan(PrintStream writer) {
      this.writer = writer;
    }

    @Override
    public void consider(PlanBindings bindings) {

      if (bindings != null && bindings.size() > 0) {
        Comparator<Belief> comparator = new Comparator<Belief>() {
          @Override
          public int compare(Belief b1, Belief b2) {
            StringBuilder s1 = new StringBuilder(String.valueOf(b1.getBeliefset()));
            for (Object field : b1.getTuple()) {
              s1.append(':');
              s1.append(field);
            }
            StringBuilder s2 = new StringBuilder(String.valueOf(b2.getBeliefset()));
            for (Object field : b2.getTuple()) {
              s2.append(':');
              s2.append(field);
            }
            return s1.toString().compareTo(s2.toString());
          }
        };

        StringBuilder str = new StringBuilder();
        for (Plan plan : bindings.getPlans()) {
          // Sort the bindings
          TreeSet<Belief> beliefs = new TreeSet<Belief>(comparator);
          beliefs.addAll(bindings.getBindings(plan));
          // Save back the bindings in sorted order
          bindings.add(plan, new LinkedHashSet<Belief>(beliefs));
          //str.append(plan.getAgent().getName());
          //str.append(':');
          str.append(plan.getClass().getSimpleName());
          for (Belief belief : bindings.getBindings(plan)) {
            str.append(',');
            str.append(belief.getBeliefset());
            for (Object field : belief.getTuple()) {
              str.append(':');
              str.append(field);
            }
          }
        }
        if (writer != null) {
          writer.println(str.toString());
        }
      }
    }

  }
}
