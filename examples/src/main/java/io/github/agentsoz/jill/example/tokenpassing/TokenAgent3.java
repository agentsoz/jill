package io.github.agentsoz.jill.example.tokenpassing;

/*
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2017 by its authors. See AUTHORS file.
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

import io.github.agentsoz.jill.core.GlobalState;
import io.github.agentsoz.jill.core.beliefbase.BeliefBaseException;
import io.github.agentsoz.jill.core.beliefbase.BeliefSetField;
import io.github.agentsoz.jill.lang.Agent;
import io.github.agentsoz.jill.lang.AgentInfo;
import io.github.agentsoz.jill.util.Log;

import java.io.PrintStream;

@AgentInfo(hasGoals={"io.github.agentsoz.jill.example.tokenpassing.Token3"})
public class TokenAgent3 extends Agent {

	public static PrintStream out;
	private static final String beliefset = "neighbour";

	// Defaults 
	public static int rounds = 1;
	private static int neighbourhood = 2;

	public TokenAgent3(String str) {
		super(str);
	}

	@Override
	public void start(PrintStream writer, String[] params) {
		parse(params);
		out = writer;
		
		// Create a new belief set about neighbours
		BeliefSetField[] fields = {
				new BeliefSetField("name", String.class, true),
		};

		try {
			// Attach this belief set to this agent
			this.createBeliefSet(beliefset, fields);
		
			int numAgents = GlobalState.agents.size();

			// Cannot have more neighbours than agents
			if (neighbourhood >= numAgents) {
				Log.error("Agent " + getName() + " cannot add "+neighbourhood+" neighbours, when there are only "+numAgents+" agents all up");
				System.exit(-1);
			}
			// Add beliefs about neighbours
            for (int i=1; i<=neighbourhood; i++){
            	int neighbour = (getId()+i)%numAgents;
            	this.addBelief(beliefset, Integer.toString(neighbour));
                Log.debug("Agent " + getName() + " added neighbour " + neighbour);
            }
            Log.debug("Agent " + getName() + " is initialising with neighbourhood size of " + neighbourhood + " on each side (so "+(neighbourhood*2)+" neighbours)");

    		// Let Agent 0 start the token passing
    		if (getId() == 0) {
    			Log.info("round 1");
    			Token3 token = new Token3(1,1);
    			token.setHops(1);
    			send(1, token);
    		}
		} catch (BeliefBaseException e) {
			Log.error(e.getMessage());
		}
	}

    public static void parse(String[] args) {
        for (int i = 0; i < args.length; i++) {
        	switch (args[i]) {
        	case "-neighbourhood":
        		if (i + 1 < args.length) {
        			i++;
        			try {
        				neighbourhood = Integer.parseInt(args[i]);
        			} catch (Exception e) {
        				Log.warn("Value '" + args[i] + "' is not a number");
        			}
        		}
        		break;
        	case "-rounds":
        		if (i + 1 < args.length) {
        			i++;
        			try {
        				rounds = Integer.parseInt(args[i]);
        			} catch (Exception e) {
        				Log.warn("Value '" + args[i] + "' is not a number");
        			}
        		}
        		break;
        	}
        }
    }
}
