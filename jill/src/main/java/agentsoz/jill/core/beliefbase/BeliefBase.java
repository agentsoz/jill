package agentsoz.jill.core.beliefbase;

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

import java.util.HashSet;

import ch.qos.logback.classic.Level;
import agentsoz.jill.core.beliefbase.abs.ABeliefStore;
import agentsoz.jill.util.Log;

public abstract class BeliefBase {

	public abstract boolean createBeliefSet(int agentid, String name, BeliefSetField[] fields) throws BeliefBaseException;
	public abstract boolean addBelief(int agentid, String beliefsetName, Object... tuple) throws BeliefBaseException;
	public abstract boolean eval(int agentid, String query) throws BeliefBaseException;
	public abstract HashSet<Belief> query(int agentid, String key) throws BeliefBaseException;
	
	public static void main(String[] args) throws BeliefBaseException {
		// Configure logging
        Log.createLogger("", Level.INFO, "BeliefBase.log");
        //BeliefBase bb = new H2BeliefBase("jdbc:h2:mem:agents;CACHE_SIZE=1048576");
		
		String bs1 = "neighbour";
		String bs2 = "hascar";

		long t0, t1, t2, t3;
		
		int nAGENTS = 10000;
		int nNEIGHBOURS = 1000;
		BeliefBase bb = new ABeliefStore(nAGENTS, 4);
		Log.info("Initialising "+nAGENTS+" agents with "+nNEIGHBOURS+" beliefs each");
		BeliefSetField[] fields1 = {
				new BeliefSetField("name", String.class, true),
				new BeliefSetField("gender", String.class, false),
		};
		BeliefSetField[] fields2 = {
				new BeliefSetField("name", String.class, true),
				new BeliefSetField("car", Boolean.class, false),
		};

		t2 = System.currentTimeMillis();
		for (int i = 0; i < nAGENTS; i++) {
			t0 = System.currentTimeMillis();
			bb.createBeliefSet(i, bs1, fields1);
			t1 = System.currentTimeMillis();
			Log.debug("Created belief set '"+bs1+"' ("+(t1-t0)+" ms)");
			t0 = System.currentTimeMillis();
			for (int j = 0; j < nNEIGHBOURS; j++) {
				bb.addBelief(i, bs1, "agent"+j, ((j%2)==0)?"male":"female");
			}
			t1 = System.currentTimeMillis();
			Log.debug("Agent "+i+" added "+nNEIGHBOURS+" beliefs to belief set '"+bs1+"' ("+(t1-t0)+" ms)");
		}
		t3 = System.currentTimeMillis();
		Log.info("Finished initialising "+nAGENTS+" agents with "+nNEIGHBOURS+" beliefs each for belief set '"+bs1+"' ("+(t3-t2)+" ms)");

		t2 = System.currentTimeMillis();
		for (int i = 0; i < nAGENTS; i++) {
			t0 = System.currentTimeMillis();
			bb.createBeliefSet(i, bs2, fields2);
			t1 = System.currentTimeMillis();
			Log.debug("Created belief set '"+bs2+"' ("+(t1-t0)+" ms)");
			t0 = System.currentTimeMillis();
			for (int j = 0; j < nNEIGHBOURS; j++) {
				bb.addBelief(i, bs2, "agent"+j, ((j%2)==0)?new Boolean(true): new Boolean(false));
			}
			t1 = System.currentTimeMillis();
			Log.debug("Agent "+i+" added "+nNEIGHBOURS+" beliefs to belief set '"+bs2+"' ("+(t1-t0)+" ms)");
		}
		t3 = System.currentTimeMillis();
		Log.info("Finished initialising "+nAGENTS+" agents with "+nNEIGHBOURS+" beliefs each for belief set '"+bs2+"' ("+(t3-t2)+" ms)");

		
		int a; int n; String ns;
		
		a=0; n=0;
		ns="agent"+n;
		t0 = System.currentTimeMillis();
		//bb.eval(a, "eq", bs1, "name", ns);
		bb.eval(a, bs1+".name="+ns);
		t1 = System.currentTimeMillis();
		Log.info("Agent "+a+" searched for "+bs1+".name="+ns+" ("+(t1-t0)+" ms)");

		a=0; n=nNEIGHBOURS-1;
		ns="agent"+n;
		t0 = System.currentTimeMillis();
		//bb.eval(a, "eq", bs1, "name", ns);
		bb.eval(a, bs1+".name="+ns);
		t1 = System.currentTimeMillis();
		Log.info("Agent "+a+" searched for "+bs1+".name="+ns+" ("+(t1-t0)+" ms)");

		a=nAGENTS-1; n=nNEIGHBOURS-1;
		ns="agent"+n;
		t0 = System.currentTimeMillis();
		//bb.eval(a, "eq", bs1, "name", ns);
		bb.eval(a, bs1+".name="+ns);
		t1 = System.currentTimeMillis();
		Log.info("Agent "+a+" searched for "+bs1+".name="+ns+" ("+(t1-t0)+" ms)");

		a=0; n=0;
		ns="agent"+n;
		t0 = System.currentTimeMillis();
		//bb.eval(a, "eq", bs1, "name", ns);
		bb.eval(a, bs1+".name="+ns);
		t1 = System.currentTimeMillis();
		Log.info("Agent "+a+" searched for "+bs1+".name="+ns+" ("+(t1-t0)+" ms)");

		a=0; n=nNEIGHBOURS-1;
		ns="agent"+n;
		t0 = System.currentTimeMillis();
		//bb.eval(a, "eq", bs1, "name", ns);
		bb.eval(a, bs1+".name="+ns);
		t1 = System.currentTimeMillis();
		Log.info("Agent "+a+" searched for "+bs1+".name="+ns+" ("+(t1-t0)+" ms)");

		a=nAGENTS-1; n=nNEIGHBOURS-1;
		ns="agent"+n;
		t0 = System.currentTimeMillis();
		//bb.eval(a, "eq", bs1, "name", ns);
		bb.eval(a, bs1+".name="+ns);
		t1 = System.currentTimeMillis();
		Log.info("Agent "+a+" searched for "+bs1+".name="+ns+" ("+(t1-t0)+" ms)");
	}
}
