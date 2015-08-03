package agentsoz.jill.lang;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import agentsoz.jill.Main;
import agentsoz.jill.struct.AObject;
import agentsoz.jill.util.Log;

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

public class BeliefSet extends AObject{

	private Statement  statement;
	private String sCreate;
	private String sPrimary;
	
	private ResultSet rs;
	private HashMap<String, Class<?>> attributes;
	
	public BeliefSet(int agent, String beliefSetName) {
		super(beliefSetName);
		setId(agent);
		sCreate = null;
		sPrimary = null;
	}
	
	public boolean buildAttribute(String name, Class<?> type, boolean isPrimary) {
		String stype = getType(type);
		if (stype == null) {
			Log.error("Could not add attribute '"+name+"' to table '"+getName()+"'. Unknown type '"+type+"'");
			return false;
		}
		if (attributes == null) {
			attributes = new HashMap<String, Class<?>>();
		}
		attributes.put(name, type);
		
		if (sCreate == null) {
			sCreate = "";
		} else {
			sCreate += ", ";
		}
		sCreate += name + " " + stype;
		if (isPrimary) {
			if (sPrimary == null ) {
				sPrimary = "PRIMARY KEY(" + name;
			} else {
				sPrimary += ", " + name;
			}
		}
		return true;
	}
	
	public boolean create() {
		// Get the connection
		try {
			statement = Main.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch (SQLException e) {
			Log.error("Could not create belief set: " + e.getMessage());
			return false;
		}
		// Finalise the statement
		if (sPrimary == null ) {
			sPrimary = "";
		} else {
			sPrimary += ")";
		}
		// Execute the statement
		String sql = "CREATE TEMPORARY TABLE IF NOT EXISTS " + getName() + "(" + sCreate + ", " +sPrimary + ");";
		sCreate = null;
		sPrimary = null;
		return execute(sql, false);
	}
	
	public boolean addBelief(Object... args) {
		String sql = "INSERT INTO " + getName() + " VALUES (";
		for (int i = 0; i < args.length; i++) {
			if (args[i] == null) {
				// TODO: Add support for null values
				continue;
			}
			String stype = getType(args[i].getClass());
			if (stype == null) {
				Log.error("Could not add belief to '"+getName()+"'. Unknown type for argument "+i+": "+args[i].getClass().getName());
				return false;
			}
			String s = args[i].toString();
			if (args[i] instanceof String) {
				s = "'" + s + "'";
			}
			sql += s;
			if (i != args.length - 1) {
				sql += ", ";
			}
		}
		sql += ");";
		return execute(sql, false);
	}
	
	public boolean all() {
		String sql = "SELECT * from " + getName() + ";";
		return execute(sql, true);
	}

	public boolean eq(Object attribute, Object value) {
		String s = value.toString();
		if (value instanceof String) {
			s = "'" + s + "'";
		}
		String sql = "SELECT * from " + getName() + " WHERE "
				+ attribute.toString() + "=" + s + ";";
		return execute(sql, true);
	}
	
	public boolean lt(Object attribute, Object value) {
		String s = value.toString();
		if (value instanceof String) {
			s = "'" + s + "'";
		}
		String sql = "SELECT * from " + getName() + " WHERE "
				+ attribute.toString() + "<" + s + ";";
		return execute(sql, true);
	}

	public boolean gt(Object attribute, Object value) {
		String s = value.toString();
		if (value instanceof String) {
			s = "'" + s + "'";
		}
		String sql = "SELECT * from " + getName() + " WHERE "
				+ attribute.toString() + ">" + s + ";";
		return execute(sql, true);
	}


	private String getType(Class<?> type) {
		String stype = null;
		if      (type ==  Boolean.class) { stype = "BOOLEAN"; }
		else if (type ==  Double.class) { stype = "DOUBLE"; }
		else if (type ==  Integer.class) { stype = "INT"; }
		else if (type ==  String.class) { stype = "VARCHAR(255)"; }
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
	
	public static void main(String[] args) {
		BeliefSet bf = new BeliefSet(0, "neighbours");
		bf.buildAttribute("name", String.class, true);
		bf.buildAttribute("age", Integer.class, false);
		bf.create();
		bf.addBelief("sam", 21);
		bf.addBelief("john", 33);
		bf.addBelief("alice", 45);
		for (int i = 1; i < 10000; i++) {
			bf.addBelief("agent"+Integer.toString(i), i);
		}
		bf.eq("Name", "john");
		System.exit(0);
	}

	public int getResultSetSize() {
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
	public Object getResult(String colName, Class<?> type) {
		Object stype = getType(type);
		if (stype == null) {
			Log.error("Cannot get result. Unknown type '"+type.getName()+"' for column '"+colName+"'");
			return null;
		}
		try {
			int col = rs.findColumn(colName);
			if      (type ==  Boolean.class) { stype = rs.getBoolean(col); }
			else if (type ==  Double.class) { stype = rs.getDouble(col); }
			else if (type ==  Integer.class) { stype = rs.getInt(col); }
			else if (type ==  String.class) { stype = rs.getString(col); }
			return stype;
		} catch (SQLException e) {
			Log.error("Could not get result: " + e.getMessage());
		}
		return null;
	}

	public boolean selectResult(int choice) {
		int size = getResultSetSize();
		if (size == 0 || choice > size) {
			return false;
		}
		try {
			rs.absolute(choice);
			return true;
		} catch (SQLException e) {
			Log.error("Could not select result: " + e.getMessage());
		}
		return false;
	}

	public HashMap<String, Class<?>> getAttributes() {
		return attributes;
	}
	
}
