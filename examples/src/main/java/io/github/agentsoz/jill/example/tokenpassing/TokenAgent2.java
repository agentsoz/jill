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

import io.github.agentsoz.jill.lang.Agent;
import io.github.agentsoz.jill.lang.AgentInfo;
import io.github.agentsoz.jill.util.Log;

import java.io.PrintStream;

@AgentInfo(hasGoals={"io.github.agentsoz.jill.example.tokenpassing.Token2"})
public class TokenAgent2 extends Agent {

	// Defaults 
	public static int rounds = 1;
	public static PrintStream out;
	
	public TokenAgent2(String str) {
		super(str);
	}

	@Override
	public void start(PrintStream writer, String[] params) {
		parse(params);
		out = writer;
		if (getId() == 0) {
			Log.info("round 1");
			send(1, new Token2(1,1));
		}
	}

    public static void parse(String[] args) {
        for (int i = 0; i < args.length; i++) {
        	switch (args[i]) {
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
