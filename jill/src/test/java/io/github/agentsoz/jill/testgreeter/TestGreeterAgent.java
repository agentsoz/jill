package io.github.agentsoz.jill.testgreeter;

import io.github.agentsoz.jill.core.beliefbase.Belief;

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

@AgentInfo(hasGoals = {"io.github.agentsoz.jill.testgreeter.GoalBeFriendly"})
public class TestGreeterAgent extends Agent {

  protected PrintStream writer = null;

  // Defaults
  private static Random rand = new Random();
  private static int numNeighbours = 1;

  protected boolean verbosePlans = false;
  private boolean verboseMetaPlan = false;

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
        new BeliefSetField("gender", String.class, false),};

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
   * Helper function to add beliefs about neighbours
   * 
   * @param rand random number generator to use
   * @param count number of beliefs to add
   * @throws BeliefBaseException
   */
  private void registerNeighbours(Random rand, int count) throws BeliefBaseException {
    final String[] MALES =
        {"Alex", "Daniel", "John", "Lionel", "Nick", "Oscar", "Paul", "Rod", "Sam", "Tom"};
    final String[] FEMALES = {"Alice", "Elisa", "Fiona", "Julia", "Kate", "Laura", "Margaret",
        "Nancy", "Pam", "Rachael"};
    final String[] MIDDLE = {"A.", "B.", "C.", "D.", "E.", "F.", "G.", "H.", "I.", "J.", "K.", "L.",
        "M.", "N.", "O.", "P.", "Q.", "R.", "S.", "T.", "U.", "V.", "W.", "X.", "Y.", "Z."};
    final String[] SURNAMES = {"Anderson", "Brown", "Jones", "Martin", "Morton", "Smith", "Taylor",
        "White", "Williams", "Wilson",};
    int size = (count < 0) ? 0 : count;
    for (int i = 0; i < size; i++) {
      boolean male = (rand.nextDouble() < 0.5) ? true : false;
      String name =
          male ? MALES[rand.nextInt(MALES.length)] : FEMALES[rand.nextInt(FEMALES.length)];
      name += " " + MIDDLE[rand.nextInt(MIDDLE.length)] + " ";
      name += SURNAMES[rand.nextInt(SURNAMES.length)];
      String gender = male ? "male" : "female";
      this.addBelief(beliefset, name, gender);
    }
  }

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
            } catch (Exception e) {
              Log.warn("Seed value '" + args[i] + "' is not a number");
            }
          }
          break;
        case "-neighbourhoodSize":
          if (i + 1 < args.length) {
            i++;
            try {
              numNeighbours = Integer.parseInt(args[i]);
            } catch (Exception e) {
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
      }
    }
  }

  private class TestMetaPlan implements MetaPlan {

    private PrintStream writer = null;

    private TestMetaPlan(PrintStream writer) {
      this.writer = writer;
    }

    @Override
    public void consider(PlanBindings bindings) {

      if (bindings != null && bindings.size() > 0) {
        Comparator<Belief> comparator = new Comparator<Belief>() {
          @Override
          public int compare(Belief b1, Belief b2) {
            String s1 = String.valueOf(b1.getBeliefset());
            for (Object field : b1.getTuple()) {
              s1 += ":" + field;
            }
            String s2 = String.valueOf(b2.getBeliefset());
            for (Object field : b2.getTuple()) {
              s2 += ":" + field;
            }
            return s1.compareTo(s2);
          }
        };

        String s = "";
        for (Plan plan : bindings.getPlans()) {
          // Sort the bindings
          TreeSet<Belief> beliefs = new TreeSet<Belief>(comparator);
          beliefs.addAll(bindings.getBindings(plan));
          // Save back the bindings in sorted order
          bindings.add(plan, new LinkedHashSet<Belief>(beliefs));
          s += plan.getAgent().getName() + ":";
          s += plan.getClass().getSimpleName();
          for (Belief belief : bindings.getBindings(plan)) {
            s += "," + belief.getBeliefset();
            for (Object field : belief.getTuple()) {
              s += ":" + field;
            }
          }
        }
        if (writer != null) {
          writer.println(s);
        }
      }
    }

  }
}
