package agentsoz.jill.core.beliefbase.h2;

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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import agentsoz.jill.core.beliefbase.BeliefBase;
import agentsoz.jill.core.beliefbase.BeliefBase.BeliefBaseException;
import agentsoz.jill.util.Log;

public class H2BeliefBase extends BeliefBase {

	Connection connection;
	Statement statement;
	private ResultSet rs;
	HashMap<String, PreparedStatement> prepareInserts;
	HashMap<String, PreparedStatement> prepareEQs;
	
	HashMap<String,BeliefSetField[]> beliefsets;

	public H2BeliefBase(String dbname) {
		try {
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection(dbname);
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			beliefsets = new HashMap<String,BeliefSetField[]>();
			prepareInserts = new HashMap<String, PreparedStatement>();
			prepareEQs = new HashMap<String, PreparedStatement>();
		} catch (ClassNotFoundException | SQLException e) {
			Log.error(e.getMessage());
		}
	}
	
	@Override
	public boolean createBeliefSet(int agentid, String name, BeliefSetField[] fields) throws BeliefBaseException{
		// Add this to our list of belief sets
		beliefsets.put(name, fields);
		// Separate the primary keys
		ArrayList<BeliefSetField> primaries = new ArrayList<BeliefSetField>();
		ArrayList<BeliefSetField> others = new ArrayList<BeliefSetField>();
		// Agent id is always one of the primary keys
		BeliefSetField agentField = new BeliefSetField("agent", Integer.class, true);
		//primaries.add(agentField);
		others.add(agentField);
		for (BeliefSetField field : fields) {
			if (field.isPrimary()) {
				primaries.add(field);
			}
			others.add(field);
		}
		String sPrimary = "";
		for (BeliefSetField field : primaries) {
			sPrimary += "," + field.getName();
		}
		String sCreate = null;
		String iCreate = null;
		String iCreate2 = null;
		for (BeliefSetField field : others) {
			String stype = getSQLType(agentid, field.getType());
			if (sCreate == null) {
				sCreate = "";
			} else {
				sCreate += ", ";
			}
			sCreate += field.getName() + " " + stype;
			if (iCreate == null) {
				iCreate = "";
				iCreate2 = "";
			} else {
				iCreate += ", ";
				iCreate2 += ", ";
			}
			iCreate += field.getName();
			iCreate2 += "?";
		}
		// Build the SQL statement
		String sql = "CREATE TEMPORARY TABLE IF NOT EXISTS " + name + "(" + sCreate + ");";
		if (execute(sql, false)) {
			// Also create an index on the agent id
			sql = "CREATE INDEX IF NOT EXISTS INDEX_"+name+" ON "+name+"(agent"+sPrimary+");";
			if (execute(sql, false)) {
				try {
					// Prepare an insert statement for this beliefset
					sql = "INSERT INTO "+name+"("+iCreate+") VALUES("+iCreate2+");";
					prepareInserts.put(name, connection.prepareStatement(sql));
					// Prepare an equal statement for this beliefset
					sql = "SELECT * FROM "+name+" where agent=? AND ?=?";
					prepareEQs.put(name, connection.prepareStatement(sql));
					return true;
				} catch (SQLException e) {
					throw new BeliefBaseException("could not prepare belief set '"+name+"' for inserts: " + e.getMessage());
				}
			}
		}
		return false;
	}

	private String getSQLType(int agentid, Class<?> type) throws BeliefBaseException {
		String stype = null;
		if      (type ==  Boolean.class) { stype = "BOOLEAN"; }
		else if (type ==  Double.class) { stype = "DOUBLE"; }
		else if (type ==  Integer.class) { stype = "INT"; }
		else if (type ==  String.class) { stype = "VARCHAR(255)"; }
		if (stype == null) {
			throw new BeliefBaseException(logsuffix(agentid) + "unknown type "+type.getName()+" for belief field; was excepting one of Boolean, Double, Integer, or String");
		}
		return stype;
	}

	
	private boolean execute(String sql, boolean isQuery) {
		try {
			Log.trace("Executing: " + sql);
			long t0 = System.currentTimeMillis();
			if (!isQuery) {
				rs = (statement.execute(sql)) ? statement.getResultSet() : null;
			} else {
				rs = statement.executeQuery(sql);
			}
			long t1 = System.currentTimeMillis();
			if (rs != null) {
				Log.debug("Found "+getResultSetSize()+" results ("+(t1-t0)+" ms)");
			}
		} catch (SQLException e) {
			Log.error("Could not execute '"+sql+"': " + e.getMessage());
			return false;
		}
		return true;
	}
	
	private int getResultSetSize() {
		int size = 0;
		if (rs != null) {
			try {
				rs.last();
				size = rs.getRow();
				rs.beforeFirst();
			} catch (SQLException e) {
				Log.error("Could not get result set size: " + e.getMessage());
			}
		}
		return size;
	}

	@Override
	public boolean addBelief(int agentid, String beliefsetName, Object...args) throws BeliefBaseException {
		// Get the prepared statement for this belief set
		PreparedStatement p = prepareInserts.get(beliefsetName);
		if (p == null) {
			Log.error("Could not find prepared insert for '"+beliefsetName+"'");
			return false;
		}
		try {
			int index = 1;
			// Agent id is the fist parameter
			p.setInt(index++, agentid);
			// Add the remaining arguments
			for (int i = 0; i < args.length; i++) {
				if (args[i] == null) {
					// TODO: Add support for null values
					Log.error("arg[" + i + "] is null; not supported");
					return false;
				}
				String stype = getSQLType(agentid, args[i].getClass());
				switch (stype) {
				case "BOOLEAN":
					p.setBoolean(index++, ((Boolean) args[i]).booleanValue());
					break;
				case "INT":
					p.setInt(index++, ((Integer) args[i]).intValue());
					break;
				case "VARCHAR(255)":
					p.setString(index++, (String) args[i]);
					break;
				default:
					Log.error("Unknown type for arg[" + i + "]: "
							+ args[i].getClass().getName());
					return false;
				}
			}
			return p.execute();
		} catch (SQLException e) {
			Log.error("Agent " + agentid
					+ " could not add belief to belief set '"
					+ beliefsetName + "': " + e.getMessage());
		}
		return false;
	}
	
	private boolean analyze() {
		String sql = "ANALYZE";
		return execute(sql, false);
	}
	
	private boolean eq(PreparedStatement p, int agentid, String beliefsetName, String attribute, Object value) throws BeliefBaseException {
		try {
			int index = 1;
			// Agent is the first parameter
			p.setInt(index++, agentid);
			// Set the LHS of the equate
			p.setString(index++, attribute);
			// Set the RHS of the equate
			if (value instanceof Boolean) {
				p.setBoolean(index++, ((Boolean)value).booleanValue());
			} else if (value instanceof Double) {
				p.setDouble(index++, (Double)value);
			} else if (value instanceof Integer) {
				p.setInt(index++, ((Integer)value).intValue());
			} else if (value instanceof String) {
				p.setString(index++, (String)value);
			}
			return p.execute();
		} catch (SQLException e) {
			throw new BeliefBaseException(logsuffix(agentid) + "could not perform belief set '"+beliefsetName+"' operation 'eq': " + e.getMessage());
		}
	}
	
	public boolean eval(int agentid, String op, Object...args) throws BeliefBaseException {
		if (op == null) {
			throw new BeliefBaseException(logsuffix(agentid) + "belief operation was 'null'");
		}
		switch(op) {
		case "eq":
			return evalEQ(agentid, args);
		default:
			throw new BeliefBaseException(logsuffix(agentid) + "unknown belief operation '"+op+"'");
		}
	}

	public boolean evalEQ(int agentid, Object[] args) throws BeliefBaseException{
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
		String beliefSetName = (String)args[0], attribute = (String)args[1];
		PreparedStatement p = prepareEQs.get(beliefSetName);
		if (p == null) {
			throw new BeliefBaseException(logsuffix(agentid) + "could not find prepared statement for '"+beliefSetName+"' operation 'eq'");
		}
		getSQLType(agentid, args[1].getClass()); // check that the type is valid
		return eq(p, agentid, beliefSetName, attribute, args[1]);
	}
	
	private String logsuffix(int agentid) {
		return getClass().getSimpleName() + ": agent "+agentid+": ";
	}
}
