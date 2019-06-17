package io.github.agentsoz.jill.core.beliefbase;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2019 by its authors. See AUTHORS file.
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


/**
 * <p>Abstract BeliefBase class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
public abstract class BeliefBase {

  /**
   * <p>createBeliefSet.</p>
   *
   * @param agentid a int.
   * @param name a {@link java.lang.String} object.
   * @param fields an array of {@link io.github.agentsoz.jill.core.beliefbase.BeliefSetField}
   *        objects.
   * @return a boolean.
   * @throws io.github.agentsoz.jill.core.beliefbase.BeliefBaseException if any.
   */
  public abstract boolean createBeliefSet(int agentid, String name, BeliefSetField[] fields)
      throws BeliefBaseException;

  /**
   * <p>addBelief.</p>
   *
   * @param agentid a int.
   * @param beliefsetName a {@link java.lang.String} object.
   * @param tuple a {@link java.lang.Object} object.
   * @return a boolean.
   * @throws io.github.agentsoz.jill.core.beliefbase.BeliefBaseException if any.
   */
  public abstract boolean addBelief(int agentid, String beliefsetName, Object... tuple)
      throws BeliefBaseException;


  /**
   * <p>removeBelief.</p>
   *
   * @param agentid a int.
   * @param belief the belief to remove.
   * @return true if the belief was removed, false otherwise
   * @throws io.github.agentsoz.jill.core.beliefbase.BeliefBaseException if any.
   */
  public abstract boolean removeBelief(int agentid, Belief belief) throws BeliefBaseException;

  /**
   * <p>eval.</p>
   *
   * @param agentid a int.
   * @param query a {@link java.lang.String} object.
   * @return a boolean.
   * @throws io.github.agentsoz.jill.core.beliefbase.BeliefBaseException if any.
   */
  public abstract boolean eval(int agentid, String query) throws BeliefBaseException;

  /**
   * <p>query.</p>
   *
   * @param agentid a int.
   * @param key a {@link java.lang.String} object.
   * @return a {@link java.util.Set} object.
   * @throws io.github.agentsoz.jill.core.beliefbase.BeliefBaseException if any.
   */
  public abstract Set<Belief> query(int agentid, String key) throws BeliefBaseException;

  /**
   * Sample program to test belief base evaluation speeds.
   *
   * @param args command line arguments
   * @throws BeliefBaseException on belief base update or evaluation errors
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
   * @throws BeliefBaseException on query evaluation error
   * @since 0.3.4
   */
  public static void doEval(BeliefBase bb, int agentId, String query) throws BeliefBaseException {
    final long t0 = System.currentTimeMillis();
    bb.eval(agentId, query);
    final long t1 = System.currentTimeMillis();
    Log.info("Agent " + agentId + " searched for '" + query + "' " + Log.formattedDuration(t0, t1));
  }

}
