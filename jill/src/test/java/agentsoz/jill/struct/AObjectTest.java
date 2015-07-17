package agentsoz.jill.struct;

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

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import agentsoz.jill.config.GlobalConstant;
import agentsoz.jill.struct.AObject;

public class AObjectTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDefaultsGettersSetters() {
		AObject o = new AObject(null);
		assertEquals(null, o.getName());
		assertEquals(GlobalConstant.NULLID, o.getId());
		o.setId(54321);
		assertEquals(54321, o.getId());
		o.setName("object1");
		assertEquals("object1", o.getName());
	}

	@Test
	public void testIsNameEqual() {
		assertFalse(AObject.isNameEqual(new AObject(null), new AObject(null)));
		assertFalse(AObject.isNameEqual(new AObject("object1"), new AObject(null)));
		assertFalse(AObject.isNameEqual(new AObject(null), new AObject("object2")));
		assertFalse(AObject.isNameEqual(new AObject("object1"), new AObject("object2")));
		assertFalse(AObject.isNameEqual(new AObject("object"), new AObject("object2")));
		assertTrue(AObject.isNameEqual(new AObject("object"), new AObject("object")));
	}
}