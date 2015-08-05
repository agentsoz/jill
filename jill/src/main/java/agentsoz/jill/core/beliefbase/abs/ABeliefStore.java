package agentsoz.jill.core.beliefbase.abs;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2015 by its authors. See AUTHORS file.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import agentsoz.jill.core.beliefbase.BeliefBase;
import agentsoz.jill.core.beliefbase.BeliefBase.BeliefBaseException;
import agentsoz.jill.util.Log;

public class ABeliefStore extends BeliefBase {

	private static final int MAX_BELIEF_SETS = 255;
	
	public enum Operator {
		EQ,
		NE,
		LT,
		GT,
	}

	private int nagents;
	private static HashMap<String, ABeliefSet> beliefsets;
	private static HashMap<ABelief, Integer> beliefs;
	private static HashMap<String, AQuery> queries;
	private static HashMap<String, HashSet<ABelief>> cachedresults;
	private static ArrayList<BitVector> beliefs2agents;
	private static BitVector[] agents2beliefs;
	
	public ABeliefStore(int nagents) {
		this.nagents = nagents;
		beliefsets = new HashMap<String, ABeliefSet>();	
		beliefs = new HashMap<ABelief, Integer>();
		queries = new HashMap<String, AQuery>();
		cachedresults = new HashMap<String, HashSet<ABelief>>();
		beliefs2agents = new ArrayList<BitVector>();
		agents2beliefs = new BitVector[nagents];
	}

	@Override
	public boolean createBeliefSet(int agentid, String name,
			BeliefSetField[] fields) throws BeliefBaseException {
		if (beliefsets.containsKey(name)) {
			return false;
		}
		// Add the beliefset to the list of beliefsets and assign it an index
		beliefsets.put(name, new ABeliefSet(beliefsets.size(), name, fields));
		return true;
	}

	@Override
	public boolean addBelief(int agentid, String beliefsetName, Object... tuple)
			throws BeliefBaseException {
		// Check that the beliefset exists
		if (!beliefsets.containsKey(beliefsetName)) {
			throw new BeliefBaseException("Belief set '"+beliefsetName+"' does not exist");
		}
		// Create a new ABelief
		ABelief belief = new ABelief(beliefsets.get(beliefsetName).getId(), tuple);
		// Add it to the list of beliefs
		int id;
		if (!beliefs.containsKey(belief)) {
			id = beliefs.size();
			beliefs.put(belief, id);
		} else {
			id = beliefs.get(belief);
		}
		// Add it to the agents beliefs
		BitVector bits = agents2beliefs[agentid];
		if (bits == null) {
			bits = new BitVector();
		}
		bits.setBit(id, true);
		agents2beliefs[agentid] = bits;
		return true;
	}

	public boolean eval(int agentid, String strop, Object...args) throws BeliefBaseException {
		if (strop == null) {
			throw new BeliefBaseException(logsuffix(agentid) + "belief operation was 'null'");
		}
		Operator op = null;
		try {
			op = Operator.valueOf(strop.toUpperCase());
		} catch (Exception e) {
			throw new BeliefBaseException(logsuffix(agentid) + "unknown belief operation '"+op+"'");
		}
		switch(op) {
		case EQ:
			return evalEQ(agentid, args);
		default:
			throw new BeliefBaseException(logsuffix(agentid) + "unknown belief operation '"+op+"'");
		}
	}

	private boolean evalEQ(int agentid, Object[] args) throws BeliefBaseException{
		if (args.length != 3) {
			throw new BeliefBaseException(logsuffix(agentid) + "belief operation 'eq' requires two arguments ("+args.length+" given)");
		}
		if (!(args[0] instanceof String)) {
			throw new BeliefBaseException(logsuffix(agentid) + "belief operation 'eq' : first argument (belief set name) should be of type String ("+args[0].getClass().getName()+" given)");
		}
		if (!(args[1] instanceof String)) {
			throw new BeliefBaseException(logsuffix(agentid) + "belief operation 'eq' : second argument (belief set attribute) should be of type String ("+args[1].getClass().getName()+" given)");
		}
		if (args[1] == null) {
			throw new BeliefBaseException(logsuffix(agentid) + "belief operation 'eq' : second argument is 'null'");
		}
		if (!beliefsets.containsKey(args[0])) {
			throw new BeliefBaseException(logsuffix(agentid) + "belief set '"+args[0]+"' does not exist");
		}
		// Get the query if it already exists
		String key = args[0] + "." + args[1] + Operator.EQ.toString() + args[2].toString();
		AQuery query = null;
		if (queries.containsKey(key)) {
			query = queries.get(key);
		} else {
			// Query does not exist so construct it
			ABeliefSet beliefset = beliefsets.get(args[0]);
			int id = beliefset.getId();
			Operator op = Operator.EQ;
			int field = -1;
			Class<?> type = null;
			BeliefSetField[] fields = beliefset.getFields(); 
			for (int i = 0; i < fields.length; i++) {
				if (args[1].equals(fields[i].getName())) {
					field = i;
					type = fields[i].getType();
					break;
				}
			}
			if (field == -1) {
				throw new BeliefBaseException(logsuffix(agentid) + "belief operation 'eq' : second argument (belief set attribute) is not known '"+args[1]+"'");
			}
			query = new AQuery(id, field, op, args[2]);
			queries.put(key, query);
			// Now perform the query and extract the beliefs that match
			HashSet<ABelief> results = new HashSet<ABelief>();
			for (ABelief belief : beliefs.keySet()) {
				if (match(belief, query)) {
					results.add(belief);
				}
			}
			// Cache the results
			cachedresults.put(key, results);
		}
		// Finally, check if this result holds true for this agent
		BitVector agentbeliefs = agents2beliefs[agentid];
		int matches = 0;
		for (ABelief belief : cachedresults.get(key)) {
			int beliefID = beliefs.get(belief);
			// check if the agent has this belief
			if (agentbeliefs.isSet(beliefID)) {
				matches++;
			}				
		}
		if (matches > 0) {
			System.out.println("Agent "+agentid+" found "+matches+" matches for the query");
			return true;
		}
		return false;
	}
	
	private boolean match(ABelief belief, AQuery query) {
		if ( belief.getBeliefset() != query.getBeliefset()) {
			return false;
		}
		switch (query.getOp()) {
		case EQ:
			Object lhs = belief.getTuple()[query.getField()];
			Object rhs = query.getValue();
			return lhs.equals(rhs);
		default:
			break;
		}
		return false;
	}
	private String logsuffix(int agentid) {
		return getClass().getSimpleName() + ": agent "+agentid+": ";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
