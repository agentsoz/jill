package io.github.agentsoz.jill.core.beliefbase;

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

import ch.qos.logback.classic.Level;

import io.github.agentsoz.jill.core.beliefbase.abs.ABeliefStore;
import io.github.agentsoz.jill.util.Log;

import java.util.Set;


public abstract class BeliefBase {

  public abstract boolean createBeliefSet(int agentid, String name, BeliefSetField[] fields)
      throws BeliefBaseException;

  public abstract boolean addBelief(int agentid, String beliefsetName, Object... tuple)
      throws BeliefBaseException;

  public abstract boolean eval(int agentid, String query) throws BeliefBaseException;

  public abstract Set<Belief> query(int agentid, String key) throws BeliefBaseException;

  /**
   * Sample program to test belief base evaluation speeds.
   * 
   * @param args command line arguments
   * @throws BeliefBaseException thrown on belief base update or evalaution errors
   */
  public static void main(String[] args) throws BeliefBaseException {
    // Configure logging
    Log.createLogger("", Level.INFO, "BeliefBase.log");
    // BeliefBase bb = new H2BeliefBase("jdbc:h2:mem:agents;CACHE_SIZE=1048576");

    String bs1 = "neighbour";
    String bs2 = "hascar";

    long t0;
    long t1;

    int numAgents = 10000;
    int numNeighbours = 1000;
    BeliefBase bb = new ABeliefStore(numAgents, 4);
    Log.info("Initialising " + numAgents + " agents with " + numNeighbours + " beliefs each");
    BeliefSetField[] fields1 = {new BeliefSetField("name", String.class, true),
        new BeliefSetField("gender", String.class, false),};
    BeliefSetField[] fields2 = {new BeliefSetField("name", String.class, true),
        new BeliefSetField("car", Boolean.class, false),};

    long t2 = System.currentTimeMillis();
    for (int i = 0; i < numAgents; i++) {
      t0 = System.currentTimeMillis();
      bb.createBeliefSet(i, bs1, fields1);
      t1 = System.currentTimeMillis();
      Log.debug("Created belief set '" + bs1 + "' " + Log.formattedDuration(t0, t1));
      t0 = System.currentTimeMillis();
      for (int j = 0; j < numNeighbours; j++) {
        bb.addBelief(i, bs1, "agent" + j, ((j % 2) == 0) ? "male" : "female");
      }
      t1 = System.currentTimeMillis();
      Log.debug("Agent " + i + " added " + numNeighbours + " beliefs to belief set '" + bs1 + "' ("
          + (t1 - t0) + " ms)");
    }
    long t3 = System.currentTimeMillis();
    Log.info("Finished initialising " + numAgents + " agents with " + numNeighbours
        + " beliefs each for belief set '" + bs1 + "' " + Log.formattedDuration(t2, t3));

    t2 = System.currentTimeMillis();
    for (int i = 0; i < numAgents; i++) {
      t0 = System.currentTimeMillis();
      bb.createBeliefSet(i, bs2, fields2);
      t1 = System.currentTimeMillis();
      Log.debug("Created belief set '" + bs2 + "' " + Log.formattedDuration(t0, t1));
      t0 = System.currentTimeMillis();
      for (int j = 0; j < numNeighbours; j++) {
        bb.addBelief(i, bs2, "agent" + j, ((j % 2) == 0) ? true : false);
      }
      t1 = System.currentTimeMillis();
      Log.debug("Agent " + i + " added " + numNeighbours + " beliefs to belief set '" + bs2 + "' ("
          + (t1 - t0) + " ms)");
    }
    t3 = System.currentTimeMillis();
    Log.info("Finished initialising " + numAgents + " agents with " + numNeighbours
        + " beliefs each for belief set '" + bs2 + "' " + Log.formattedDuration(t2, t3));


    final String opstr = ".name=agent";
    int agentId = 0;
    int neighbourId = 0;
    doEval(bb, agentId, bs1 + opstr + neighbourId);

    agentId = 0;
    neighbourId = numNeighbours - 1;
    doEval(bb, agentId, bs1 + opstr + neighbourId);

    agentId = numAgents - 1;
    neighbourId = numNeighbours - 1;
    doEval(bb, agentId, bs1 + opstr + neighbourId);

    agentId = 0;
    neighbourId = 0;
    doEval(bb, agentId, bs1 + opstr + neighbourId);

    agentId = 0;
    neighbourId = numNeighbours - 1;
    doEval(bb, agentId, bs1 + opstr + neighbourId);

    agentId = numAgents - 1;
    neighbourId = numNeighbours - 1;
    doEval(bb, agentId, bs1 + opstr + neighbourId);
  }

  /**
   * Evaluates the given query on the given belief base for the agent.
   * 
   * @param bb the belief base to query
   * @param agentId the agent for which the query applies
   * @param query the belief query
   * @throws BeliefBaseException thorwn if there is a query evaluation error
   */
  public static void doEval(BeliefBase bb, int agentId, String query) throws BeliefBaseException {
    final long t0 = System.currentTimeMillis();
    bb.eval(agentId, query);
    final long t1 = System.currentTimeMillis();
    Log.info("Agent " + agentId + " searched for '" + query + "' " + Log.formattedDuration(t0, t1));
  }

}
