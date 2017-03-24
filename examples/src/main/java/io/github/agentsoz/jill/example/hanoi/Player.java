package io.github.agentsoz.jill.example.hanoi;

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
import java.util.Random;

@AgentInfo(hasGoals={"io.github.agentsoz.jill.example.hanoi.Solve"})
public class Player extends Agent {

	public static PrintStream out;
	
	// Defaults
	private static Random rand = new Random();
	private static int ndiscs = 5;
	private Board board;

	public Player(String name) {
		super(name);
	}
	
	public Board getBoard() {
		return board;
	}
	@Override
	public void start(PrintStream writer, String[] params) {
		out = writer;
		
		// Parse the arguments
		parse(params);
		
		// Create the board
		board = new Board(rand, ndiscs);
		out.println("Initialised hanoi board with "+ndiscs+" discs:");
		out.println(board.toString());

		// Solve the board
		post(new Solve("s", ndiscs, 0, 2, 1));
	}

    public static void parse(String[] args) {
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
                case "-discs":
                	if (i + 1 < args.length) {
                		i++;
                      	try {
                       		ndiscs = Integer.parseInt(args[i]);
                       	} catch (Exception e) {
                       		Log.warn("Number od discs value '" + args[i] + "' is not a number");
                       	}
                	}
                	break;
                }
        }
    }

}
