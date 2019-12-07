package io.github.agentsoz.jill.core.beliefbase.abs;

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

import io.github.agentsoz.jill.core.beliefbase.Belief;
import io.github.agentsoz.jill.core.beliefbase.BeliefBase;
import io.github.agentsoz.jill.core.beliefbase.BeliefBaseException;
import io.github.agentsoz.jill.core.beliefbase.BeliefSet;
import io.github.agentsoz.jill.core.beliefbase.BeliefSetField;
import io.github.agentsoz.jill.util.Log;
import org.roaringbitmap.RoaringBitmap;

import java.io.Console;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>ABeliefStore class.</p>
 *
 * @author dsingh
 * @version $Id: $Id
 */
@SuppressWarnings("PMD.GodClass")
public class ABeliefStore extends BeliefBase {

  private static final float loadfactor = 0.9f;

  public enum Operator {
    EQ, NE, LT, GT,
  }

  private static ConcurrentHashMap<String, BeliefSet> beliefsets; // NOPMD - canot be final
  private static ConcurrentHashMap<Integer, BeliefSet> beliefsetsByID; // NOPMD - canot be final
  private static ConcurrentHashMap<Belief, RoaringBitmap> beliefs; // NOPMD - canot be final
  private static ConcurrentHashMap<String, AQuery> queries; // NOPMD - canot be final
  private static ConcurrentHashMap<String, Set<Belief>> cachedresults; // NOPMD - canot be final
  private static int nAgents;
  /**
   * Constructs a new belief store.
   *
   * @param nagents the store will manage beliefs for this number of agents
   * @param nthreads the number of threads that may concurrently query/update this belief set
   */
  public ABeliefStore(int nagents, int nthreads) {
    nAgents = nagents;
    beliefsets = new ConcurrentHashMap<String, BeliefSet>(1, loadfactor, nthreads);
    beliefsetsByID =
        new ConcurrentHashMap<Integer, BeliefSet>(beliefsets.size(), loadfactor, nthreads);
    beliefs = new ConcurrentHashMap<Belief, RoaringBitmap>(Math.max(64,nagents),
        loadfactor, nthreads);
    queries = new ConcurrentHashMap<String, AQuery>(64, loadfactor, nthreads);
    cachedresults =
        new ConcurrentHashMap<String, Set<Belief>>(queries.size(), loadfactor, nthreads);
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public boolean createBeliefSet(int agentid, String name, BeliefSetField[] fields)
      throws BeliefBaseException {
    if (beliefsets.containsKey(name)) {
      return false;
    }
    // Add the beliefset to the list of beliefsets
    BeliefSet bs = new BeliefSet(beliefsets.size(), name, fields);
    beliefsets.put(name, bs);
    beliefsetsByID.put(bs.getId(), bs);
    return true;
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public boolean addBelief(int agentid, String beliefsetName, Object... tuple)
      throws BeliefBaseException {
    // Check that the beliefset exists
    if (!beliefsets.containsKey(beliefsetName)) {
      throw new BeliefBaseException("Belief set '" + beliefsetName + "' does not exist");
    }
    // Create a new Belief
    Belief belief = new Belief(beliefs.size(), beliefsets.get(beliefsetName).getId(), tuple);
    // Add it to the list of beliefs
    if (!beliefs.containsKey(belief)) {
      beliefs.put(belief, new RoaringBitmap());
    }
    // Add it to the agents beliefs
    RoaringBitmap bits = beliefs.get(belief);
    bits.add(agentid);
    beliefs.put(belief,bits);
    // Update the cached results
    for (String query : cachedresults.keySet()) {
      Set<Belief> results = cachedresults.get(query);
      if (match(belief, queries.get(query))) {
        results.add(belief);
      }
    }
    return true;
  }

  @Override
  public boolean removeBelief(int agentid, Belief belief) throws BeliefBaseException {
    if (!beliefs.containsKey(belief)) {
      return false;
    }
    // Remove it from the agents beliefs
    RoaringBitmap bits = beliefs.get(belief);
    bits.remove(agentid);
    beliefs.put(belief,bits);
    return true;
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public boolean eval(int agentid, String key) throws BeliefBaseException {
    return !query(agentid, key).isEmpty();
  }

  /**
   * {@inheritDoc}.
   */
  @Override
  public Set<Belief> query(int agentid, String key) throws BeliefBaseException {
    // Get the cached query if we have seen it before, else parse it
    AQuery query = null;
    if (queries.containsKey(key)) {
      query = queries.get(key);
    } else {
      // Valid queries have the following syntax
      // beliefset.field OP value
      // where OP is one of =, !=, <, or >
      if (key == null) {
        throw new BeliefBaseException(logsuffix(agentid) + "'null' query");
      }
      Pattern pattern = Pattern.compile("(\\w+)\\.(\\w+)\\s*([=<>(!=)])\\s*(.+)");
      Matcher matcher = pattern.matcher(key);
      if (!matcher.matches()) {
        throw new BeliefBaseException(logsuffix(agentid) + "invalid query '" + key
            + "' : syntax not of the form beliefset.field <op> value");
      }
      String strBeliefset = matcher.group(1);
      String strField = matcher.group(2);
      String strOp = matcher.group(3);
      String strVal = matcher.group(4);
      try {
        query = parseQuery(agentid, strBeliefset, strField, strOp, strVal);
        queries.put(key, query);
      } catch (BeliefBaseException e) {
        throw new BeliefBaseException(logsuffix(agentid) + "could not parse query: " + key, e);
      }
    }
    // Get the cached results if they exist,
    // else perform the query and cache the results
    Set<Belief> results = null;
    if (cachedresults.containsKey(key)) {
      results = cachedresults.get(key);
    } else {
      results = performQuery(query, beliefs);
      cachedresults.put(key, results);
    }

    // Finally, filter the results for this agent
    Set<Belief> matches = filterResultsForAgent(agentid, results);
    Log.debug("Agent " + agentid + " found " + matches.size() + " matches for the query");

    return matches;
  }

  private AQuery parseQuery(int agentid, String strBeliefset, String strField, String strOp,
      String strVal) throws BeliefBaseException {
    if (!beliefsets.containsKey(strBeliefset)) {
      throw new BeliefBaseException(
          logsuffix(agentid) + "belief set '" + strBeliefset + "' does not exist");
    }
    BeliefSet beliefset = beliefsets.get(strBeliefset);
    BeliefSetField field = beliefset.getFieldByName(strField);
    int fieldIndex = beliefset.getIndex(field);
    if (field == null || fieldIndex == -1) {
      throw new BeliefBaseException(logsuffix(agentid) + "could not retrieve belief set field '"
          + strField + "' from belief set " + strBeliefset);
    }
    Object val = null;
    try {
      val = string2type(field.getType(), strVal);
    } catch (BeliefBaseException e) {
      throw new BeliefBaseException(logsuffix(agentid) + e.getMessage(), e);
    }
    int id = beliefset.getId();
    Operator op = "=".equals(strOp) ? Operator.EQ
        : "<".equals(strOp) ? Operator.LT : ">".equals(strOp) ? Operator.GT : Operator.NE;
    return new AQuery(id, fieldIndex, op, val);
  }

  private static Set<Belief> performQuery(AQuery query,
      ConcurrentHashMap<Belief, RoaringBitmap> beliefs2) {
    assert (query != null);
    assert (beliefs2 != null);
    Set<Belief> results = Collections.newSetFromMap(new ConcurrentHashMap<Belief, Boolean>());
    for (Belief belief : beliefs2.keySet()) {
      if (match(belief, query)) {
        results.add(belief);
      }
    }
    return results;
  }

  private static Set<Belief> filterResultsForAgent(int agentid, Set<Belief> results)
      throws BeliefBaseException {
    assert (results != null);
    // Finally, check if this result holds true for this agent
    HashSet<Belief> matches = new HashSet<Belief>();

    for (Belief belief : results) {
      if (!beliefs.containsKey(belief)) {
        throw new BeliefBaseException("belief '" + belief + "' doees not exist");
      }
      RoaringBitmap bits = beliefs.get(belief);
      if (bits != null && bits.contains(agentid)) {
        matches.add(belief);
      }
    }
    return matches;
  }

  private Object string2type(Class<?> type, String str) throws BeliefBaseException {
    Object val = null;
    String stype = type.getName();
    try {
      switch (stype) {
        case "java.lang.String":
          val = str;
          break;
        case "java.lang.Integer":
          val = Integer.valueOf(str);
          break;
        case "java.lang.Double":
          val = Double.valueOf(str);
          break;
        case "java.lang.Boolean":
          val = Boolean.valueOf(str);
          break;
        default:
          // FIXME: Ignoring other types for now (while we are still developing new types)
          break;
      }
    } catch (NumberFormatException e) {
      throw new BeliefBaseException("value '" + str + "' is not of type " + stype, e);
    }
    return val;
  }

  /**
   * Gets the type of the given object.
   *
   * @param obj the object whose type is being queried
   * @return the type of the object, or null if unknown
   */
  public static String getType(Object obj) {
    if (obj == null) {
      return null;
    }
    String type = null;
    if (obj instanceof String || obj instanceof Integer || obj instanceof Double
        || obj instanceof Boolean) {
      type = obj.getClass().getName();
    }
    return type;
  }

  /**
   * Checks if the given query run on the given belief returns a match.
   * 
   * @param belief the belief being queried
   * @param query the query being performed on the belief
   * @return true if there is a match, false otherwise
   */
  private static boolean match(Belief belief, AQuery query) {
    assert (belief != null);
    assert (query != null);
    if (belief.getBeliefset() != query.getBeliefset()) {
      return false;
    }
    switch (query.getOp()) {
      case EQ:
        Object lhs = belief.getTuple()[query.getField()];
        Object rhs = query.getValue();
        // Match wildcard or exact string
        return "*".equals(rhs) || lhs.equals(rhs);
      case GT:
        // TODO: Handle Operator.GT
      case LT:
        // TODO: Handle Operator.LT
      default:
        break;
    }
    return false;
  }

  /**
   * Convinience function to return a logging prefix for this agent.
   * 
   * @param agentid the ID of this agnet
   * @return the prefix to use for loggin purposes
   */
  private String logsuffix(int agentid) {
    return getClass().getSimpleName() + ": agent " + agentid + ": ";
  }

  /**
   * Sample program to test pattern matching.
   *
   * @param args command line arguments
   * @throws BeliefBaseException thrown if something went wrong
   */
  public static void main(String[] args) throws BeliefBaseException {
    BeliefBase bb = new ABeliefStore(100, 4);
    bb.eval(0, "neighbour.age < 31");

    Console console = System.console();
    if (console == null) {
      System.err.println("No console.");
      System.exit(1);
    }
    while (true) {

      Pattern pattern = Pattern.compile(console.readLine("%nEnter your regex: "));

      Matcher matcher = pattern.matcher(console.readLine("Enter input string to search: "));

      boolean found = false;
      while (matcher.find()) {
        console.format(
            "I found the text" + " \"%s\" starting at " + "index %d and ending at index %d.%n",
            matcher.group(), matcher.start(), matcher.end());
        found = true;
      }
      if (!found) {
        console.format("No match found.%n");
      }
    }
  }

  /**
   * Gets the belief set field name (see
   * {@link io.github.agentsoz.jill.core.beliefbase.BeliefSetField}) for the given belief set
   * for the given agent.
   *
   * @param agentid the agent in question
   * @param beliefset the beliefset of that agent
   * @param index the index of the belief set field in that belief set
   * @return the name of the belief set field
   * @throws BeliefBaseException if something went wrong
   */
  public static String getFieldName(int agentid, int beliefset, int index)
      throws BeliefBaseException {
    if (beliefset < 0 || beliefset > beliefsets.size()) {
      throw new BeliefBaseException("belief set id " + beliefset + " is invalid");
    }
    BeliefSetField[] bsf = beliefsetsByID.get(beliefset).getFields();
    if (index < 0 || index >= bsf.length) {
      throw new BeliefBaseException("belief set field id " + index + " is invalid");
    }
    return bsf[index].getName();
  }

  /**
   * Returns the theoretical upper bound on the hash of RoaringBitmaps currently stored
   */
  public long memoryUpperBoundInBytes() {
    long size = beliefs.size(); // number of bitmaps in use
    size *= RoaringBitmap.maximumSerializedSize(nAgents, nAgents); // times max size per bitmap
    return size;
  }
}
