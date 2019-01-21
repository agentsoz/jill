package io.github.agentsoz.jill.util;

/*-
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2019 by its authors. See AUTHORS file.
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

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@SuppressWarnings("unused")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AObjectCatalogRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test001");
        io.github.agentsoz.jill.struct.AObject aObject0 = null;
        io.github.agentsoz.jill.struct.AObject aObject1 = null;
        try {
            boolean b2 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject0, aObject1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test002");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("", (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test003");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        try {
            io.github.agentsoz.jill.struct.AObject aObject4 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test004");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        try {
            io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test005");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        try {
            io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test006");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.find("hi!");
        try {
            int i6 = aObject5.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test007");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test008");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        try {
            io.github.agentsoz.jill.struct.AObject aObject15 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test009");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        try {
            io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test010");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.toString();
        try {
            io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test011");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        try {
            io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test012");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.find("hi!");
        io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.find("hi!:-1");
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertNull(aObject7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test013");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.struct.AObject aObject15 = aObjectCatalog3.find(":-1");
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject15);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test014");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("");
        try {
            java.lang.String str9 = aObject8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test015");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!:0");
        aObjectCatalog3.setName("hi!:-1");
        int i12 = aObjectCatalog3.getId();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test016");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.find("hi!");
        try {
            aObject5.setName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test017");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        int i16 = aObjectCatalog7.size();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(i16 == 1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test018");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        int i6 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("hi!:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str17 = aObjectCatalog16.getName();
        aObjectCatalog12.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog22.setName("hi!");
        java.lang.String str25 = aObjectCatalog22.getName();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        try {
            boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test019");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.find("hi!");
        io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.get((int) (short) 0);
        try {
            aObject7.setName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertNull(aObject7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test020");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        try {
            io.github.agentsoz.jill.struct.AObject aObject16 = aObjectCatalog13.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test021");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.get((int) ' ');
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test022");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get(100);
        java.lang.String str6 = aObjectCatalog3.toString();
        try {
            io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test023");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i14 = aObjectCatalog9.size();
        try {
            io.github.agentsoz.jill.struct.AObject aObject15 = aObjectCatalog9.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test024");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test025");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog9.setName("hi!");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i13 = aObjectCatalog9.getId();
        aObjectCatalog9.setId((int) (short) 0);
        io.github.agentsoz.jill.struct.AObject aObject16 = null;
        try {
            boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, aObject16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test026");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        java.lang.String str15 = aObjectCatalog3.getName();
        try {
            io.github.agentsoz.jill.struct.AObject aObject16 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test027");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        io.github.agentsoz.jill.struct.AObject aObject15 = null;
        try {
            boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, aObject15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test028");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test029");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog10.pop();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        java.lang.String str19 = aObjectCatalog3.toString();
        int i20 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject21 = null;
        try {
            boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, aObject21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i20 == (-1));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test030");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) ' ');
        aObjectCatalog3.setId((int) '4');
        io.github.agentsoz.jill.struct.AObject aObject12 = aObjectCatalog3.find(":-1");
        try {
            java.lang.String str13 = aObject12.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject12);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test031");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        java.lang.String str15 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog3.get((int) (short) 100);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!:-1" + "'", str15.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject17);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test032");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog(":-1", (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test033");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.struct.AObject aObject6 = null;
        aObjectCatalog3.push(aObject6);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (byte) -1);
        try {
            boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject6, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test034");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("");
        try {
            aObject8.setId((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test035");
        io.github.agentsoz.jill.struct.AObject aObject0 = null;
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog4 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog8 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str9 = aObjectCatalog8.getName();
        aObjectCatalog4.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog8);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog14.setName("hi!");
        java.lang.String str17 = aObjectCatalog14.getName();
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog4, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog4, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        int i24 = aObjectCatalog4.size();
        aObjectCatalog4.setId((int) (short) 1);
        try {
            boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject0, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(i24 == 1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test036");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        aObjectCatalog3.setId((int) (byte) -1);
        try {
            io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test037");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((int) (byte) 100);
        try {
            java.lang.String str6 = aObject5.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test038");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        aObjectCatalog3.setName("hi!:-1");
        try {
            io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test039");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((int) (byte) 10);
        try {
            io.github.agentsoz.jill.struct.AObject aObject15 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test040");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.find("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        try {
            io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test041");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog3.setId((int) '#');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog9.find("");
        aObjectCatalog3.push(aObject11);
        try {
            java.lang.String str13 = aObject11.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject11);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test042");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (byte) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str12 = aObjectCatalog11.getName();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog17.setName("hi!");
        java.lang.String str20 = aObjectCatalog17.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        aObjectCatalog17.setId((int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject26 = aObjectCatalog17.find("hi!:-1");
        try {
            io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog17.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(aObject26);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test043");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog3.setId((int) '#');
        aObjectCatalog3.setName("hi!:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog11.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog17.setName("hi!");
        java.lang.String str20 = aObjectCatalog17.toString();
        aObjectCatalog11.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        int i22 = aObjectCatalog17.getId();
        io.github.agentsoz.jill.struct.AObject aObject24 = aObjectCatalog17.find("hi!");
        try {
            boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, aObject24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!:-1" + "'", str20.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNull(aObject24);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test044");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog11.get((-1));
        java.lang.String str14 = aObjectCatalog11.getName();
        aObjectCatalog11.setId((int) ' ');
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        try {
            io.github.agentsoz.jill.struct.AObject aObject18 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test045");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setName("hi!:0");
        try {
            io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test046");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("", (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test047");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog9.setName("hi!");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i13 = aObjectCatalog9.getId();
        try {
            io.github.agentsoz.jill.struct.AObject aObject14 = aObjectCatalog9.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test048");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        int i15 = aObjectCatalog3.size();
        java.lang.String str16 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        int i21 = aObjectCatalog20.getId();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        try {
            io.github.agentsoz.jill.struct.AObject aObject23 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!:-1" + "'", str16.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test049");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        int i8 = aObjectCatalog3.size();
        try {
            io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test050");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        io.github.agentsoz.jill.struct.AObject aObject16 = aObjectCatalog3.find("hi!:-1:-1");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject16);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test051");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.get(0);
        int i9 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.get((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNull(aObject11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test052");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.get(0);
        int i9 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        int i14 = aObjectCatalog13.getId();
        io.github.agentsoz.jill.struct.AObject aObject16 = aObjectCatalog13.get(1);
        try {
            boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, aObject16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertNull(aObject16);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test053");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        java.lang.String str5 = aObjectCatalog3.getName();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test054");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.toString();
        int i7 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog3.get((int) (byte) 10);
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(aObject9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test055");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.toString();
        try {
            io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test056");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) ' ');
        aObjectCatalog3.setId((int) '4');
        int i11 = aObjectCatalog3.getId();
        int i12 = aObjectCatalog3.getId();
        int i13 = aObjectCatalog3.size();
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 52);
        org.junit.Assert.assertTrue(i12 == 52);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test057");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        java.lang.String str15 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog3.get((int) '#');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str22 = aObjectCatalog21.getName();
        int i23 = aObjectCatalog21.getId();
        io.github.agentsoz.jill.struct.AObject aObject25 = aObjectCatalog21.find("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog21.get((int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject29 = aObjectCatalog21.find("hi!:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog33 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (short) 10, (int) (byte) -1);
        aObjectCatalog21.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog33);
        try {
            boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject17, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNull(aObject17);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertNull(aObject25);
        org.junit.Assert.assertNull(aObject27);
        org.junit.Assert.assertNull(aObject29);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test058");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, (int) (byte) 10);
        aObjectCatalog3.setName("hi!:-1:-1");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test059");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        int i4 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.get(1);
        try {
            io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(aObject6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test060");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setId((int) (short) 0);
        java.lang.String str8 = aObjectCatalog3.toString();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setId((int) (short) 100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:0" + "'", str8.equals("hi!:0"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test061");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        int i4 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.find("hi!:-1");
        try {
            aObject6.setName("hi!:-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(aObject6);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test062");
        io.github.agentsoz.jill.struct.AObject aObject0 = null;
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog4 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog4.get((int) (byte) 100);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog10.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog16.setName("hi!");
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        aObjectCatalog4.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        try {
            boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject0, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test063");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog3.setName("hi!");
        int i6 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject12 = aObjectCatalog10.find("hi!");
        aObjectCatalog10.setId(0);
        int i15 = aObjectCatalog10.getId();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        try {
            io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(aObject12);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test064");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        int i4 = aObjectCatalog3.getId();
        try {
            io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i4 == (-1));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test065");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0", 52, 100);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test066");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        aObjectCatalog3.setName("hi!:0");
        aObjectCatalog3.setName("hi!:97");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test067");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.get((int) (byte) 10);
        aObjectCatalog3.setName("");
        io.github.agentsoz.jill.struct.AObject aObject14 = aObjectCatalog3.find("");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog18.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog24 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog24.setName("hi!");
        java.lang.String str27 = aObjectCatalog24.toString();
        aObjectCatalog18.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog24);
        int i29 = aObjectCatalog24.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog33 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog37 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str38 = aObjectCatalog37.getName();
        aObjectCatalog33.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog37);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog43 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog43.setName("hi!");
        java.lang.String str46 = aObjectCatalog43.getName();
        boolean b47 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog33, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog43);
        java.lang.String str48 = aObjectCatalog33.getName();
        aObjectCatalog33.setName("");
        int i51 = aObjectCatalog33.getId();
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog24, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog33);
        try {
            boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject10);
        org.junit.Assert.assertNull(aObject14);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1" + "'", str27.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        org.junit.Assert.assertTrue(i51 == (-1));
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test068");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (byte) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str12 = aObjectCatalog11.getName();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog17.setName("hi!");
        java.lang.String str20 = aObjectCatalog17.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        aObjectCatalog3.setId((int) 'a');
        int i25 = aObjectCatalog3.size();
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog3.get(0);
        aObject27.setName("hi!:0:0");
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertNotNull(aObject27);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test069");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:97", (int) (byte) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test070");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0", (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test071");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        java.lang.String str15 = aObjectCatalog3.toString();
        aObjectCatalog3.setId(100);
        java.lang.String str18 = aObjectCatalog3.toString();
        java.lang.String str19 = aObjectCatalog3.toString();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!:-1" + "'", str15.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!:100" + "'", str18.equals("hi!:100"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:100" + "'", str19.equals("hi!:100"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test072");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1:-1", (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test073");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100", 32, 10);
        int i4 = aObjectCatalog3.getId();
        aObjectCatalog3.setId((-1));
        org.junit.Assert.assertTrue(i4 == (-1));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test074");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.find("hi!");
        aObjectCatalog3.setId(0);
        try {
            io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test075");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 10, (int) (byte) 0);
        aObjectCatalog3.setId(1);
        java.lang.String str6 = aObjectCatalog3.toString();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1:1" + "'", str6.equals("hi!:-1:1"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test076");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        java.lang.String str5 = aObjectCatalog3.toString();
        aObjectCatalog3.setId((-1));
        try {
            io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test077");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (byte) 1, (int) (byte) 1);
        java.lang.String str4 = aObjectCatalog3.toString();
        int i5 = aObjectCatalog3.size();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test078");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.find("hi!:-1:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog10.pop();
        aObjectCatalog10.setId((int) '4');
        aObjectCatalog10.setId((-1));
        int i22 = aObjectCatalog10.size();
        aObjectCatalog10.setId((int) (short) 10);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog29 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog29.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog35 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog35.setName("hi!");
        java.lang.String str38 = aObjectCatalog35.toString();
        aObjectCatalog29.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog35);
        int i40 = aObjectCatalog35.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog44 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog48 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str49 = aObjectCatalog48.getName();
        aObjectCatalog44.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog48);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog54 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog54.setName("hi!");
        java.lang.String str57 = aObjectCatalog54.getName();
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog44, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog54);
        java.lang.String str59 = aObjectCatalog44.getName();
        aObjectCatalog44.setName("");
        int i62 = aObjectCatalog44.getId();
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog35, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog44);
        io.github.agentsoz.jill.struct.AObject aObject65 = aObjectCatalog44.find("hi!:0:-1");
        try {
            boolean b66 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, aObject65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(aObject6);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!:-1" + "'", str38.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        org.junit.Assert.assertTrue(i62 == (-1));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(aObject65);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test079");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.struct.AObject aObject12 = aObjectCatalog3.find("hi!:0");
        java.lang.String str13 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str18 = aObjectCatalog17.getName();
        int i19 = aObjectCatalog17.getId();
        aObjectCatalog17.setName("hi!");
        aObjectCatalog17.setName("hi!:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog27 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str32 = aObjectCatalog31.getName();
        aObjectCatalog27.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog37 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog37.setName("hi!");
        java.lang.String str40 = aObjectCatalog37.getName();
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog27, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog37);
        aObjectCatalog17.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog27);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        aObjectCatalog17.setName("hi!");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!:-1" + "'", str13.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertTrue(b41 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test080");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        int i4 = aObjectCatalog3.getId();
        try {
            io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i4 == (-1));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test081");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str18 = aObjectCatalog17.getName();
        aObjectCatalog13.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog23.setName("hi!");
        java.lang.String str26 = aObjectCatalog23.getName();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        aObjectCatalog3.setName("hi!:100");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test082");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (byte) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str12 = aObjectCatalog11.getName();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog17.setName("hi!");
        java.lang.String str20 = aObjectCatalog17.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        aObjectCatalog3.setId((int) 'a');
        int i25 = aObjectCatalog3.size();
        java.lang.String str26 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog3.find("hi!:0:-1");
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:97" + "'", str26.equals("hi!:97"));
        org.junit.Assert.assertNull(aObject28);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test083");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        int i10 = aObjectCatalog3.getId();
        java.lang.String str11 = aObjectCatalog3.getName();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test084");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        int i4 = aObjectCatalog3.size();
        int i5 = aObjectCatalog3.size();
        io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.get((int) (byte) 1);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(aObject7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test085");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        java.lang.String str10 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog3.find("");
        try {
            java.lang.String str14 = aObject13.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject11);
        org.junit.Assert.assertNull(aObject13);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test086");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog3.setId((int) '#');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.struct.AObject aObject16 = aObjectCatalog9.pop();
        aObjectCatalog9.setId((int) '4');
        aObjectCatalog9.setId((-1));
        java.lang.String str21 = aObjectCatalog9.toString();
        aObjectCatalog9.setId(100);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.struct.AObject aObject26 = aObjectCatalog9.get((int) '#');
        try {
            io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog9.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject16);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!:-1" + "'", str21.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject26);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test087");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("hi!:-1:-1");
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.get((int) (short) 1);
        io.github.agentsoz.jill.struct.AObject aObject12 = aObjectCatalog3.get((int) (short) 100);
        try {
            aObject12.setId((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertNull(aObject10);
        org.junit.Assert.assertNull(aObject12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test088");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) ' ');
        java.lang.String str9 = aObjectCatalog3.getName();
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test089");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog13.setName("hi!");
        java.lang.String str16 = aObjectCatalog13.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog21);
        java.lang.String str23 = aObjectCatalog21.toString();
        io.github.agentsoz.jill.struct.AObject aObject25 = aObjectCatalog21.get((int) (short) 1);
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog21.find("hi!:97");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:-1" + "'", str23.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject25);
        org.junit.Assert.assertNull(aObject27);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test090");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get(100);
        java.lang.String str6 = aObjectCatalog3.toString();
        int i7 = aObjectCatalog3.size();
        try {
            io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test091");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        try {
            io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test092");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.find("hi!:-1:-1");
        try {
            aObject6.setName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(aObject6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test093");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("");
        try {
            io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test094");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!:0");
        java.lang.String str10 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog14.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog20.setName("hi!");
        java.lang.String str23 = aObjectCatalog20.toString();
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        int i25 = aObjectCatalog20.size();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        try {
            io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:0" + "'", str10.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:-1" + "'", str23.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i25 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test095");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.struct.AObject aObject12 = aObjectCatalog3.find("hi!:0");
        aObjectCatalog3.setId((int) (byte) -1);
        try {
            io.github.agentsoz.jill.struct.AObject aObject15 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject12);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test096");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        io.github.agentsoz.jill.struct.AObject aObject16 = aObjectCatalog3.find("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog24 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str25 = aObjectCatalog24.getName();
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog24);
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog20.pop();
        aObjectCatalog20.setId((int) '4');
        aObjectCatalog20.setId((-1));
        int i32 = aObjectCatalog20.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog36 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog40 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str41 = aObjectCatalog40.getName();
        aObjectCatalog36.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog40);
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog40);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog47 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog51 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str52 = aObjectCatalog51.getName();
        aObjectCatalog47.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog51);
        java.lang.String str54 = aObjectCatalog47.toString();
        io.github.agentsoz.jill.struct.AObject aObject55 = aObjectCatalog47.pop();
        boolean b56 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20, aObject55);
        aObjectCatalog3.push(aObject55);
        aObject55.setName("hi!:0:-1");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject16);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject27);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!" + "'", str52.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!:-1" + "'", str54.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject55);
        org.junit.Assert.assertTrue(b56 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test097");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog7.get((-1));
        java.lang.String str10 = aObjectCatalog7.getName();
        aObjectCatalog7.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject14 = aObjectCatalog7.get((int) (byte) 10);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog3.find("hi!");
        io.github.agentsoz.jill.struct.AObject aObject18 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog3.get((int) '#');
        try {
            java.lang.String str21 = aObject20.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNull(aObject14);
        org.junit.Assert.assertNull(aObject17);
        org.junit.Assert.assertNotNull(aObject18);
        org.junit.Assert.assertNull(aObject20);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test098");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        int i4 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.find("hi!:-1");
        try {
            io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(aObject6);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test099");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("hi!:-1:-1");
        try {
            io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject8);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test100");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (byte) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str12 = aObjectCatalog11.getName();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog17.setName("hi!");
        java.lang.String str20 = aObjectCatalog17.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        aObjectCatalog3.setId((int) 'a');
        int i25 = aObjectCatalog3.size();
        aObjectCatalog3.setName("hi!:0:-1");
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i25 == 1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test101");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog3.setName("hi!");
        int i6 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject12 = aObjectCatalog10.find("hi!");
        aObjectCatalog10.setId(0);
        int i15 = aObjectCatalog10.getId();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        int i17 = aObjectCatalog10.getId();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(aObject12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test102");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        int i4 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.find("hi!:-1");
        try {
            java.lang.String str7 = aObject6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(aObject6);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test103");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog8 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog8.get((-1));
        java.lang.String str11 = aObjectCatalog8.getName();
        aObjectCatalog8.setName("hi!:0");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog8);
        io.github.agentsoz.jill.struct.AObject aObject15 = aObjectCatalog3.pop();
        try {
            io.github.agentsoz.jill.struct.AObject aObject16 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(aObject10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject15);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test104");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        java.lang.String str15 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) (short) 1);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test105");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        java.lang.String str4 = aObjectCatalog3.toString();
        aObjectCatalog3.setId((int) (short) -1);
        try {
            io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test106");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, (int) (byte) 10);
        try {
            io.github.agentsoz.jill.struct.AObject aObject4 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test107");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100", 32, 10);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.find("");
        try {
            java.lang.String str6 = aObject5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test108");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (byte) 0, 0);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog7.get((int) (byte) 100);
        java.lang.String str10 = aObjectCatalog7.toString();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        java.lang.String str12 = aObjectCatalog3.toString();
        java.lang.String str13 = aObjectCatalog3.toString();
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1:-1" + "'", str10.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!:-1" + "'", str13.equals("hi!:-1"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test109");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog9.setName("hi!");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject18 = aObjectCatalog16.get((-1));
        java.lang.String str19 = aObjectCatalog16.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog27 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str28 = aObjectCatalog27.getName();
        aObjectCatalog23.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog27);
        io.github.agentsoz.jill.struct.AObject aObject30 = aObjectCatalog23.pop();
        aObjectCatalog16.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        java.lang.String str32 = aObjectCatalog16.toString();
        int i33 = aObjectCatalog16.getId();
        int i34 = aObjectCatalog16.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog38 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog38.setName("hi!");
        int i41 = aObjectCatalog38.size();
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog38);
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog38);
        aObjectCatalog38.setName("hi!:0");
        java.lang.String str46 = aObjectCatalog38.toString();
        java.lang.String str47 = aObjectCatalog38.toString();
        org.junit.Assert.assertNull(aObject18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject30);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!:-1" + "'", str32.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i33 == (-1));
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!:0:0" + "'", str46.equals("hi!:0:0"));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!:0:0" + "'", str47.equals("hi!:0:0"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test110");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:97", 0, (int) (byte) -1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test111");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        io.github.agentsoz.jill.struct.AObject aObject16 = aObjectCatalog3.find("hi!");
        try {
            aObject16.setId((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject16);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test112");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog11.get((-1));
        java.lang.String str14 = aObjectCatalog11.getName();
        aObjectCatalog11.setId((int) ' ');
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        java.lang.String str18 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) (short) 1);
        io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog3.find("hi!:-1:-1:-1");
        io.github.agentsoz.jill.struct.AObject aObject24 = aObjectCatalog3.get((int) 'a');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog28 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (byte) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog32 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog36 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str37 = aObjectCatalog36.getName();
        aObjectCatalog32.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog36);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog42 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog42.setName("hi!");
        java.lang.String str45 = aObjectCatalog42.getName();
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog32, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog42);
        aObjectCatalog28.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog42);
        aObjectCatalog28.setId((int) 'a');
        int i50 = aObjectCatalog28.size();
        java.lang.String str51 = aObjectCatalog28.getName();
        try {
            boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject24, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNull(aObject22);
        org.junit.Assert.assertNull(aObject24);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(i50 == 1);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test113");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0", (int) 'a', (int) 'a');
        try {
            io.github.agentsoz.jill.struct.AObject aObject4 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test114");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        int i15 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str24 = aObjectCatalog23.getName();
        aObjectCatalog19.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        int i27 = aObjectCatalog3.size();
        aObjectCatalog3.setId(52);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test115");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (byte) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str12 = aObjectCatalog11.getName();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog17.setName("hi!");
        java.lang.String str20 = aObjectCatalog17.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        aObjectCatalog17.setId((int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject26 = aObjectCatalog17.find("hi!:-1");
        int i27 = aObjectCatalog17.getId();
        try {
            io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog17.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(aObject26);
        org.junit.Assert.assertTrue(i27 == 32);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test116");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test117");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        int i6 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("hi!:-1");
        int i9 = aObjectCatalog3.size();
        int i10 = aObjectCatalog3.getId();
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == (-1));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test118");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        aObjectCatalog3.setId((int) (byte) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog24 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject26 = aObjectCatalog24.get((-1));
        java.lang.String str27 = aObjectCatalog24.getName();
        aObjectCatalog24.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject31 = aObjectCatalog24.get((int) (byte) 10);
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog24);
        io.github.agentsoz.jill.struct.AObject aObject34 = aObjectCatalog20.find("hi!");
        io.github.agentsoz.jill.struct.AObject aObject35 = aObjectCatalog20.pop();
        io.github.agentsoz.jill.struct.AObject aObject37 = aObjectCatalog20.get((int) '#');
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        int i39 = aObjectCatalog3.getId();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNull(aObject31);
        org.junit.Assert.assertNull(aObject34);
        org.junit.Assert.assertNotNull(aObject35);
        org.junit.Assert.assertNull(aObject37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i39 == (-1));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test119");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog7.get((-1));
        java.lang.String str10 = aObjectCatalog7.getName();
        aObjectCatalog7.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject14 = aObjectCatalog7.get((int) (byte) 10);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog3.find("hi!");
        io.github.agentsoz.jill.struct.AObject aObject18 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog3.get((int) '#');
        try {
            aObject20.setName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNull(aObject14);
        org.junit.Assert.assertNull(aObject17);
        org.junit.Assert.assertNotNull(aObject18);
        org.junit.Assert.assertNull(aObject20);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test120");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog10.pop();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        java.lang.String str19 = aObjectCatalog3.toString();
        int i20 = aObjectCatalog3.getId();
        int i21 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog25 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog25.setName("hi!");
        int i28 = aObjectCatalog25.size();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog25);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog33 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str34 = aObjectCatalog33.getName();
        int i35 = aObjectCatalog33.getId();
        aObjectCatalog33.setName("hi!");
        aObjectCatalog33.setName("hi!:0");
        java.lang.String str40 = aObjectCatalog33.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog44 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog44.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog50 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog50.setName("hi!");
        java.lang.String str53 = aObjectCatalog50.toString();
        aObjectCatalog44.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog50);
        int i55 = aObjectCatalog50.size();
        aObjectCatalog33.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog50);
        java.lang.String str57 = aObjectCatalog50.toString();
        aObjectCatalog25.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog50);
        try {
            io.github.agentsoz.jill.struct.AObject aObject59 = aObjectCatalog25.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue(i35 == (-1));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!:0" + "'", str40.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!:-1" + "'", str53.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!:0" + "'", str57.equals("hi!:0"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test121");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog3.setId((int) '#');
        java.lang.String str6 = aObjectCatalog3.getName();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:0" + "'", str6.equals("hi!:0"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test122");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.find("hi!:-1:-1");
        java.lang.String str12 = aObjectCatalog3.toString();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(aObject11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test123");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog19.setName("hi!");
        java.lang.String str22 = aObjectCatalog19.getName();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        java.lang.String str24 = aObjectCatalog9.toString();
        io.github.agentsoz.jill.struct.AObject aObject25 = aObjectCatalog9.pop();
        aObjectCatalog3.push(aObject25);
        io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog3.find("hi!:0:-1");
        io.github.agentsoz.jill.struct.AObject aObject30 = aObjectCatalog3.get((int) (short) 1);
        io.github.agentsoz.jill.struct.AObject aObject32 = aObjectCatalog3.find("hi!:100");
        java.lang.String str33 = aObjectCatalog3.getName();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!:-1" + "'", str24.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject25);
        org.junit.Assert.assertNull(aObject28);
        org.junit.Assert.assertNull(aObject30);
        org.junit.Assert.assertNull(aObject32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test124");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.get(52);
        try {
            io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertNull(aObject7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test125");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog10.pop();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        io.github.agentsoz.jill.struct.AObject aObject19 = aObjectCatalog3.pop();
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertNotNull(aObject19);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test126");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        java.lang.String str10 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog15.get((-1));
        java.lang.String str18 = aObjectCatalog15.getName();
        aObjectCatalog15.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog15.get((int) (byte) 10);
        aObjectCatalog15.setName("");
        io.github.agentsoz.jill.struct.AObject aObject26 = aObjectCatalog15.find("");
        io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog15.find("");
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        int i30 = aObjectCatalog3.size();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject11);
        org.junit.Assert.assertNull(aObject17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNull(aObject22);
        org.junit.Assert.assertNull(aObject26);
        org.junit.Assert.assertNull(aObject28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test127");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog14.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog20.setName("hi!");
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        int i24 = aObjectCatalog20.getId();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        aObjectCatalog20.setName("hi!:-1:1");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test128");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i14 = aObjectCatalog9.size();
        int i15 = aObjectCatalog9.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog19.setId((int) '#');
        aObjectCatalog19.setName("hi!:-1");
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        try {
            io.github.agentsoz.jill.struct.AObject aObject25 = aObjectCatalog9.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test129");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:97", 10, (int) ' ');
        aObjectCatalog3.setName("hi!:-1");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test130");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0", 1, (int) (short) 0);
        int i4 = aObjectCatalog3.getId();
        org.junit.Assert.assertTrue(i4 == (-1));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test131");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setName("hi!:0");
        java.lang.String str9 = aObjectCatalog3.toString();
        java.lang.String str10 = aObjectCatalog3.toString();
        try {
            io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:0:-1" + "'", str9.equals("hi!:0:-1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:0:-1" + "'", str10.equals("hi!:0:-1"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test132");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog14.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog20.setName("hi!");
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        int i24 = aObjectCatalog20.getId();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog29 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog29);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog34 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog38 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str39 = aObjectCatalog38.getName();
        aObjectCatalog34.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog38);
        io.github.agentsoz.jill.struct.AObject aObject41 = aObjectCatalog34.pop();
        aObjectCatalog34.setId((int) '4');
        aObjectCatalog34.setId((-1));
        aObjectCatalog34.setId((int) (byte) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog51 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog55 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject57 = aObjectCatalog55.get((-1));
        java.lang.String str58 = aObjectCatalog55.getName();
        aObjectCatalog55.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject62 = aObjectCatalog55.get((int) (byte) 10);
        aObjectCatalog51.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog55);
        io.github.agentsoz.jill.struct.AObject aObject65 = aObjectCatalog51.find("hi!");
        io.github.agentsoz.jill.struct.AObject aObject66 = aObjectCatalog51.pop();
        io.github.agentsoz.jill.struct.AObject aObject68 = aObjectCatalog51.get((int) '#');
        boolean b69 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog34, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog51);
        boolean b70 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog34);
        try {
            io.github.agentsoz.jill.struct.AObject aObject71 = aObjectCatalog34.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject41);
        org.junit.Assert.assertNull(aObject57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!" + "'", str58.equals("hi!"));
        org.junit.Assert.assertNull(aObject62);
        org.junit.Assert.assertNull(aObject65);
        org.junit.Assert.assertNotNull(aObject66);
        org.junit.Assert.assertNull(aObject68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test133");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        aObjectCatalog3.setName("hi!:-1");
        aObjectCatalog3.setId(0);
        int i8 = aObjectCatalog3.getId();
        try {
            io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test134");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100", (int) (short) 1, (int) '4');
        java.lang.String str4 = aObjectCatalog3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:100:-1" + "'", str4.equals("hi!:100:-1"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test135");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (byte) 1, (int) (byte) 1);
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog9.get((-1));
        java.lang.String str12 = aObjectCatalog9.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str21 = aObjectCatalog20.getName();
        aObjectCatalog16.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        io.github.agentsoz.jill.struct.AObject aObject23 = aObjectCatalog16.pop();
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        java.lang.String str25 = aObjectCatalog9.toString();
        int i26 = aObjectCatalog9.getId();
        aObjectCatalog9.setId((int) (byte) -1);
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.struct.AObject aObject31 = aObjectCatalog9.find("hi!:97");
        int i32 = aObjectCatalog9.size();
        org.junit.Assert.assertNull(aObject11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject23);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:-1" + "'", str25.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(aObject31);
        org.junit.Assert.assertTrue(i32 == 1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test136");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        aObjectCatalog3.setName("hi!:-1");
        aObjectCatalog3.setId(0);
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog3.get(10);
        try {
            int i10 = aObject9.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject9);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test137");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (byte) 1, (int) (byte) 1);
        aObjectCatalog3.setName("hi!:-1:-1:-1");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test138");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("hi!:-1:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str17 = aObjectCatalog16.getName();
        aObjectCatalog12.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog22.setName("hi!");
        java.lang.String str25 = aObjectCatalog22.getName();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        java.lang.String str27 = aObjectCatalog12.toString();
        java.lang.String str28 = aObjectCatalog12.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12);
        int i30 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog34 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog38 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str39 = aObjectCatalog38.getName();
        aObjectCatalog34.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog38);
        io.github.agentsoz.jill.struct.AObject aObject41 = aObjectCatalog34.pop();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog45 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog45.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog51 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog51.setName("hi!");
        aObjectCatalog45.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog51);
        int i55 = aObjectCatalog51.getId();
        aObjectCatalog34.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog51);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog60 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog51.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog60);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog51);
        aObjectCatalog3.setName("hi!:-1:-1");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1" + "'", str27.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!:-1" + "'", str28.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i30 == (-1));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject41);
        org.junit.Assert.assertTrue(i55 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test139");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog11.get((-1));
        java.lang.String str14 = aObjectCatalog11.getName();
        aObjectCatalog11.setId((int) ' ');
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog21.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog27 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog27.setName("hi!");
        java.lang.String str30 = aObjectCatalog27.toString();
        aObjectCatalog21.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog27);
        int i32 = aObjectCatalog27.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog36 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog40 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str41 = aObjectCatalog40.getName();
        aObjectCatalog36.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog40);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog46 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog46.setName("hi!");
        java.lang.String str49 = aObjectCatalog46.getName();
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog36, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog46);
        java.lang.String str51 = aObjectCatalog36.getName();
        aObjectCatalog36.setName("");
        int i54 = aObjectCatalog36.getId();
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog27, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog36);
        java.lang.String str56 = aObjectCatalog36.toString();
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog36);
        io.github.agentsoz.jill.struct.AObject aObject59 = aObjectCatalog36.find("hi!:97");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1" + "'", str30.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        org.junit.Assert.assertTrue(i54 == (-1));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + ":-1" + "'", str56.equals(":-1"));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(aObject59);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test140");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        int i4 = aObjectCatalog3.getId();
        int i5 = aObjectCatalog3.size();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test141");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog3.get((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject9);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test142");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str18 = aObjectCatalog17.getName();
        aObjectCatalog13.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog23.setName("hi!");
        java.lang.String str26 = aObjectCatalog23.getName();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.struct.AObject aObject29 = aObjectCatalog3.pop();
        try {
            io.github.agentsoz.jill.struct.AObject aObject30 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(aObject29);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test143");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) ' ');
        aObjectCatalog3.setId((int) '4');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog14.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog24 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str25 = aObjectCatalog24.getName();
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog24);
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog20.pop();
        aObjectCatalog20.setId((int) '4');
        aObjectCatalog20.setId((-1));
        int i32 = aObjectCatalog20.size();
        java.lang.String str33 = aObjectCatalog20.toString();
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        try {
            io.github.agentsoz.jill.struct.AObject aObject36 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject27);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!:-1" + "'", str33.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test144");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.find("hi!:-1:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog10.pop();
        aObjectCatalog10.setId((int) '4');
        aObjectCatalog10.setId((-1));
        int i22 = aObjectCatalog10.size();
        aObjectCatalog10.setId((int) (short) 10);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        try {
            io.github.agentsoz.jill.struct.AObject aObject26 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(aObject6);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test145");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.struct.AObject aObject15 = aObjectCatalog9.find("");
        try {
            aObject15.setName("hi!:97");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject15);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test146");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 0, (int) (short) 0);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.find("hi!:100");
        try {
            io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject5);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test147");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) ' ', 97);
        int i4 = aObjectCatalog3.getId();
        org.junit.Assert.assertTrue(i4 == (-1));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test148");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog13.setName("hi!");
        java.lang.String str16 = aObjectCatalog13.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        aObjectCatalog13.setId((int) ' ');
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test149");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog13.setName("hi!");
        java.lang.String str16 = aObjectCatalog13.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog25 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str26 = aObjectCatalog25.getName();
        aObjectCatalog21.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog25);
        aObjectCatalog13.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog25);
        java.lang.String str29 = aObjectCatalog25.toString();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!:0" + "'", str29.equals("hi!:0"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test150");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("hi!:-1:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str17 = aObjectCatalog16.getName();
        aObjectCatalog12.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog22.setName("hi!");
        java.lang.String str25 = aObjectCatalog22.getName();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        java.lang.String str27 = aObjectCatalog12.toString();
        java.lang.String str28 = aObjectCatalog12.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12);
        io.github.agentsoz.jill.struct.AObject aObject31 = aObjectCatalog12.find("hi!:-1");
        io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog12.find("hi!:0");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1" + "'", str27.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!:-1" + "'", str28.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject31);
        org.junit.Assert.assertNull(aObject33);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test151");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        java.lang.String str15 = aObjectCatalog3.toString();
        int i16 = aObjectCatalog3.getId();
        try {
            io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!:-1" + "'", str15.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i16 == (-1));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test152");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (byte) 0, 0);
        aObjectCatalog3.setId(97);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test153");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog9.setName("hi!");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog16.setId((int) '#');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str27 = aObjectCatalog26.getName();
        aObjectCatalog22.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        io.github.agentsoz.jill.struct.AObject aObject29 = aObjectCatalog22.pop();
        aObjectCatalog22.setId((int) '4');
        aObjectCatalog22.setId((-1));
        java.lang.String str34 = aObjectCatalog22.toString();
        aObjectCatalog22.setId(100);
        aObjectCatalog16.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        int i38 = aObjectCatalog22.size();
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        io.github.agentsoz.jill.struct.AObject aObject40 = null;
        try {
            boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, aObject40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject29);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!:-1" + "'", str34.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test154");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1:1", (int) (short) 10, 1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        java.lang.String str8 = aObjectCatalog7.toString();
        aObjectCatalog7.setId((int) (short) -1);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        try {
            io.github.agentsoz.jill.struct.AObject aObject12 = aObjectCatalog7.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ":-1" + "'", str8.equals(":-1"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test155");
        io.github.agentsoz.jill.struct.AObject aObject0 = null;
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog4 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog4.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject12 = aObjectCatalog10.get((-1));
        java.lang.String str13 = aObjectCatalog10.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str22 = aObjectCatalog21.getName();
        aObjectCatalog17.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog21);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog27 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str28 = aObjectCatalog27.getName();
        aObjectCatalog21.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog27);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog33 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog37 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str38 = aObjectCatalog37.getName();
        aObjectCatalog33.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog37);
        io.github.agentsoz.jill.struct.AObject aObject40 = aObjectCatalog33.pop();
        java.lang.String str41 = aObjectCatalog33.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog45 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog49 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str50 = aObjectCatalog49.getName();
        aObjectCatalog45.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog49);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog55 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog55.setName("hi!");
        java.lang.String str58 = aObjectCatalog55.getName();
        boolean b59 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog45, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog55);
        java.lang.String str60 = aObjectCatalog45.getName();
        aObjectCatalog33.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog45);
        boolean b62 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog21, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog33);
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog21);
        aObjectCatalog4.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog68 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject70 = aObjectCatalog68.get(100);
        java.lang.String str71 = aObjectCatalog68.toString();
        aObjectCatalog68.setId(1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog77 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog81 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str82 = aObjectCatalog81.getName();
        aObjectCatalog77.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog81);
        java.lang.String str84 = aObjectCatalog77.toString();
        io.github.agentsoz.jill.struct.AObject aObject85 = aObjectCatalog77.pop();
        aObjectCatalog68.push(aObject85);
        boolean b87 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog68);
        try {
            boolean b88 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject0, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!" + "'", str58.equals("hi!"));
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!" + "'", str60.equals("hi!"));
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNull(aObject70);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + ":-1" + "'", str71.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "hi!" + "'", str82.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "hi!:-1" + "'", str84.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject85);
        org.junit.Assert.assertTrue(b87 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test156");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1:1", (int) (short) 10, 1);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((int) (short) 10);
        org.junit.Assert.assertNull(aObject5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test157");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        int i4 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog8 = new io.github.agentsoz.jill.util.AObjectCatalog(":-1", (int) 'a', (-1));
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog8);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1:-1", (int) (byte) 1, 1);
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0", 52, (int) '4');
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        io.github.agentsoz.jill.struct.AObject aObject21 = aObjectCatalog3.find("hi!:0:0:-1");
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(aObject21);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test158");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog(":-1", (int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test159");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog11.get((-1));
        java.lang.String str14 = aObjectCatalog11.getName();
        aObjectCatalog11.setId((int) ' ');
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        java.lang.String str18 = aObjectCatalog3.getName();
        java.lang.String str19 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog23.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog29 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog33 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str34 = aObjectCatalog33.getName();
        aObjectCatalog29.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog33);
        io.github.agentsoz.jill.struct.AObject aObject36 = aObjectCatalog29.pop();
        io.github.agentsoz.jill.struct.AObject aObject38 = aObjectCatalog29.find("hi!:0");
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog23, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog29);
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog29);
        io.github.agentsoz.jill.struct.AObject aObject42 = aObjectCatalog29.find("hi!:0:35");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject36);
        org.junit.Assert.assertNull(aObject38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(aObject42);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test160");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        aObjectCatalog3.setId((int) (byte) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog24 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject26 = aObjectCatalog24.get((-1));
        java.lang.String str27 = aObjectCatalog24.getName();
        aObjectCatalog24.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject31 = aObjectCatalog24.get((int) (byte) 10);
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog24);
        io.github.agentsoz.jill.struct.AObject aObject34 = aObjectCatalog20.find("hi!");
        io.github.agentsoz.jill.struct.AObject aObject35 = aObjectCatalog20.pop();
        io.github.agentsoz.jill.struct.AObject aObject37 = aObjectCatalog20.get((int) '#');
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        aObjectCatalog20.setId(0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNull(aObject31);
        org.junit.Assert.assertNull(aObject34);
        org.junit.Assert.assertNotNull(aObject35);
        org.junit.Assert.assertNull(aObject37);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test161");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test162");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.struct.AObject aObject15 = aObjectCatalog9.find("");
        aObjectCatalog9.setName("");
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject15);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test163");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog(":-1", 100, (int) ' ');
        int i4 = aObjectCatalog3.size();
        try {
            io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test164");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.struct.AObject aObject15 = aObjectCatalog9.find("hi!:-1:-1");
        try {
            int i16 = aObject15.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject15);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test165");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get(100);
        java.lang.String str6 = aObjectCatalog3.toString();
        aObjectCatalog3.setId(1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str17 = aObjectCatalog16.getName();
        aObjectCatalog12.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        java.lang.String str19 = aObjectCatalog12.toString();
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog12.pop();
        aObjectCatalog3.push(aObject20);
        io.github.agentsoz.jill.struct.AObject aObject23 = aObjectCatalog3.get((int) (short) 1);
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject20);
        org.junit.Assert.assertNull(aObject23);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test166");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.find("hi!");
        io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.get((int) (short) 0);
        try {
            aObject7.setName("hi!:100:-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertNull(aObject7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test167");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i14 = aObjectCatalog9.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str23 = aObjectCatalog22.getName();
        aObjectCatalog18.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog28 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog28.setName("hi!");
        java.lang.String str31 = aObjectCatalog28.getName();
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog18, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog28);
        java.lang.String str33 = aObjectCatalog18.getName();
        aObjectCatalog18.setName("");
        int i36 = aObjectCatalog18.getId();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        io.github.agentsoz.jill.struct.AObject aObject39 = aObjectCatalog18.find("hi!:0:-1");
        io.github.agentsoz.jill.struct.AObject aObject41 = aObjectCatalog18.get(10);
        try {
            int i42 = aObject41.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(aObject39);
        org.junit.Assert.assertNull(aObject41);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test168");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog11.get((-1));
        java.lang.String str14 = aObjectCatalog11.getName();
        aObjectCatalog11.setId((int) ' ');
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        java.lang.String str18 = aObjectCatalog11.getName();
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog11.get((int) (byte) 10);
        int i21 = aObjectCatalog11.size();
        int i22 = aObjectCatalog11.size();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNull(aObject20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test169");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str24 = aObjectCatalog23.getName();
        aObjectCatalog19.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        io.github.agentsoz.jill.struct.AObject aObject26 = aObjectCatalog19.pop();
        java.lang.String str27 = aObjectCatalog19.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog35 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str36 = aObjectCatalog35.getName();
        aObjectCatalog31.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog35);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog41 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog41.setName("hi!");
        java.lang.String str44 = aObjectCatalog41.getName();
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        java.lang.String str46 = aObjectCatalog31.getName();
        aObjectCatalog19.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        aObjectCatalog19.setName(":-1:-1");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        org.junit.Assert.assertTrue(b48 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test170");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) '4', 0);
        java.lang.String str4 = aObjectCatalog3.getName();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test171");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("hi!:0");
        try {
            aObject8.setName(":-1:-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject8);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test172");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog11.get((-1));
        java.lang.String str14 = aObjectCatalog11.getName();
        aObjectCatalog11.setId((int) ' ');
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        java.lang.String str18 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) (short) 1);
        io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog3.get((int) (byte) -1);
        try {
            java.lang.String str23 = aObject22.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNull(aObject22);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test173");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:97", (int) (short) 10, (int) 'a');
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test174");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("hi!:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str17 = aObjectCatalog16.getName();
        aObjectCatalog12.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog22.setName("hi!");
        java.lang.String str25 = aObjectCatalog22.getName();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        java.lang.String str27 = aObjectCatalog12.toString();
        io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog12.pop();
        aObject28.setId((int) 'a');
        aObjectCatalog3.push(aObject28);
        java.lang.String str32 = aObjectCatalog3.getName();
        try {
            io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1" + "'", str27.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject28);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test175");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", 10, 10);
        try {
            io.github.agentsoz.jill.struct.AObject aObject4 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test176");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str24 = aObjectCatalog23.getName();
        aObjectCatalog19.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        io.github.agentsoz.jill.struct.AObject aObject26 = aObjectCatalog19.pop();
        java.lang.String str27 = aObjectCatalog19.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog35 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str36 = aObjectCatalog35.getName();
        aObjectCatalog31.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog35);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog41 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog41.setName("hi!");
        java.lang.String str44 = aObjectCatalog41.getName();
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        java.lang.String str46 = aObjectCatalog31.getName();
        aObjectCatalog19.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog52 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str53 = aObjectCatalog52.getName();
        int i54 = aObjectCatalog52.getId();
        aObjectCatalog52.setName("hi!");
        aObjectCatalog52.setName("hi!:0");
        java.lang.String str59 = aObjectCatalog52.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog63 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog63.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog69 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog69.setName("hi!");
        java.lang.String str72 = aObjectCatalog69.toString();
        aObjectCatalog63.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog69);
        int i74 = aObjectCatalog69.size();
        aObjectCatalog52.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog69);
        java.lang.String str76 = aObjectCatalog69.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog80 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) '4', 0);
        boolean b81 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog69, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog80);
        io.github.agentsoz.jill.struct.AObject aObject83 = aObjectCatalog69.get(32);
        try {
            boolean b84 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7, aObject83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        org.junit.Assert.assertTrue(i54 == (-1));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!:0" + "'", str59.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!:-1" + "'", str72.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i74 == 0);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "hi!:0" + "'", str76.equals("hi!:0"));
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNull(aObject83);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test177");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        int i15 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str24 = aObjectCatalog23.getName();
        aObjectCatalog19.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog30 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog34 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str35 = aObjectCatalog34.getName();
        aObjectCatalog30.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog34);
        java.lang.String str37 = aObjectCatalog30.toString();
        io.github.agentsoz.jill.struct.AObject aObject38 = aObjectCatalog30.pop();
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, aObject38);
        aObject38.setName(":-1");
        aObject38.setName("hi!:0:-1");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!:-1" + "'", str37.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject38);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test178");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) ' ');
        aObjectCatalog3.setId((int) '4');
        int i11 = aObjectCatalog3.getId();
        try {
            io.github.agentsoz.jill.struct.AObject aObject12 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 52);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test179");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("hi!:-1:-1");
        int i9 = aObjectCatalog3.size();
        java.lang.String str10 = aObjectCatalog3.getName();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test180");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.toString();
        int i7 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog3.get((int) (short) 10);
        try {
            io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(aObject9);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test181");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0", 1, (int) (short) 0);
        java.lang.String str4 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.find(":52");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:0:0:-1" + "'", str4.equals("hi!:0:0:-1"));
        org.junit.Assert.assertNull(aObject6);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test182");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", (int) (byte) 1, (int) (short) 100);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog7.get((int) (byte) 100);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog13.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog19.setName("hi!");
        aObjectCatalog13.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog28 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog28.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog34 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog34.setName("hi!");
        java.lang.String str37 = aObjectCatalog34.toString();
        aObjectCatalog28.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog34);
        aObjectCatalog34.setName("hi!:-1:-1");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog34);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog45 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100", 32, 10);
        int i46 = aObjectCatalog45.getId();
        int i47 = aObjectCatalog45.getId();
        aObjectCatalog34.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog45);
        io.github.agentsoz.jill.struct.AObject aObject50 = aObjectCatalog34.find("hi!:-1:-1:-1");
        try {
            java.lang.String str51 = aObject50.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!:-1" + "'", str37.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i46 == (-1));
        org.junit.Assert.assertTrue(i47 == (-1));
        org.junit.Assert.assertNull(aObject50);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test183");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1:-1", (int) (byte) 100, 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test184");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str22 = aObjectCatalog21.getName();
        aObjectCatalog17.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog21);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog27 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog27.setName("hi!");
        java.lang.String str30 = aObjectCatalog27.getName();
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog27);
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog27);
        aObjectCatalog9.setId((int) (short) 10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertTrue(b31 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test185");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog8 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog8.get((-1));
        java.lang.String str11 = aObjectCatalog8.getName();
        aObjectCatalog8.setName("hi!:0");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog8);
        io.github.agentsoz.jill.struct.AObject aObject16 = aObjectCatalog3.find("hi!:0:35");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(aObject10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNull(aObject16);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test186");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        java.lang.String str15 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject21 = aObjectCatalog19.get((-1));
        java.lang.String str22 = aObjectCatalog19.getName();
        aObjectCatalog19.setName("hi!:0");
        java.lang.String str25 = aObjectCatalog19.toString();
        aObjectCatalog19.setId((int) (short) 1);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        aObjectCatalog3.setId(0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!:-1" + "'", str15.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:0:-1" + "'", str25.equals("hi!:0:-1"));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test187");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:97", 10, (int) ' ');
        try {
            io.github.agentsoz.jill.struct.AObject aObject4 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test188");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str22 = aObjectCatalog21.getName();
        aObjectCatalog17.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog21);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog27 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog27.setName("hi!");
        java.lang.String str30 = aObjectCatalog27.getName();
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog27);
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog27);
        io.github.agentsoz.jill.struct.AObject aObject34 = aObjectCatalog9.get((-1));
        io.github.agentsoz.jill.struct.AObject aObject36 = aObjectCatalog9.get((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(aObject34);
        org.junit.Assert.assertNull(aObject36);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test189");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0", (int) ' ', (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.find("hi!:0:0");
        try {
            aObject5.setId(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject5);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test190");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.get(0);
        int i9 = aObjectCatalog3.size();
        try {
            io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test191");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog(":52", (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test192");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.get((int) (byte) 10);
        aObjectCatalog3.setName("");
        io.github.agentsoz.jill.struct.AObject aObject14 = aObjectCatalog3.find("");
        try {
            aObject14.setName("hi!:0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject10);
        org.junit.Assert.assertNull(aObject14);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test193");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog11.get((-1));
        java.lang.String str14 = aObjectCatalog11.getName();
        aObjectCatalog11.setId((int) ' ');
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        int i18 = aObjectCatalog11.getId();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i18 == 32);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test194");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("hi!:0");
        try {
            java.lang.String str9 = aObject8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject8);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test195");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog13.setName("hi!");
        java.lang.String str16 = aObjectCatalog13.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog21);
        java.lang.String str23 = aObjectCatalog21.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog27 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject29 = aObjectCatalog27.find("hi!");
        io.github.agentsoz.jill.struct.AObject aObject31 = aObjectCatalog27.get((int) (short) 0);
        int i32 = aObjectCatalog27.size();
        aObjectCatalog21.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog27);
        io.github.agentsoz.jill.struct.AObject aObject34 = null;
        try {
            boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog21, aObject34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:-1" + "'", str23.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject29);
        org.junit.Assert.assertNull(aObject31);
        org.junit.Assert.assertTrue(i32 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test196");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        aObjectCatalog9.setId(1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str24 = aObjectCatalog23.getName();
        aObjectCatalog19.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        io.github.agentsoz.jill.struct.AObject aObject26 = aObjectCatalog19.pop();
        aObjectCatalog19.setId((int) '4');
        aObjectCatalog19.setId((-1));
        int i31 = aObjectCatalog19.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog35 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog39 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str40 = aObjectCatalog39.getName();
        aObjectCatalog35.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog39);
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog39);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog46 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog50 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str51 = aObjectCatalog50.getName();
        aObjectCatalog46.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog50);
        java.lang.String str53 = aObjectCatalog46.toString();
        io.github.agentsoz.jill.struct.AObject aObject54 = aObjectCatalog46.pop();
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19, aObject54);
        boolean b56 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        try {
            io.github.agentsoz.jill.struct.AObject aObject57 = aObjectCatalog9.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject26);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!:-1" + "'", str53.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b56 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test197");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        aObjectCatalog3.setName("hi!:-1");
        aObjectCatalog3.setId((int) (short) 1);
        aObjectCatalog3.setName("hi!:100");
        java.lang.String str10 = aObjectCatalog3.toString();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:100:1" + "'", str10.equals("hi!:100:1"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test198");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        aObjectCatalog7.setId((int) (short) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str20 = aObjectCatalog19.getName();
        aObjectCatalog15.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog15.pop();
        aObjectCatalog15.setId((int) '4');
        aObjectCatalog15.setId((-1));
        int i27 = aObjectCatalog15.size();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog32 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", 10, 32);
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog15, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog32);
        try {
            io.github.agentsoz.jill.struct.AObject aObject34 = aObjectCatalog32.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject22);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test199");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        int i4 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.get(1);
        java.lang.String str7 = aObjectCatalog3.getName();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(aObject6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test200");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str22 = aObjectCatalog21.getName();
        aObjectCatalog17.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog21);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog27 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog27.setName("hi!");
        java.lang.String str30 = aObjectCatalog27.getName();
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog27);
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog27);
        try {
            io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog27.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertTrue(b31 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test201");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog11.setName("hi!");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        try {
            io.github.agentsoz.jill.struct.AObject aObject15 = aObjectCatalog11.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test202");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1:1", 52, (int) (byte) -1);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test203");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str18 = aObjectCatalog17.getName();
        aObjectCatalog13.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog23.setName("hi!");
        java.lang.String str26 = aObjectCatalog23.getName();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.struct.AObject aObject29 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.struct.AObject aObject31 = aObjectCatalog3.get((int) (byte) 0);
        aObjectCatalog3.setName("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(aObject29);
        org.junit.Assert.assertNull(aObject31);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test204");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog9.get((-1));
        java.lang.String str12 = aObjectCatalog9.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str21 = aObjectCatalog20.getName();
        aObjectCatalog16.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str27 = aObjectCatalog26.getName();
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog32 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog36 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str37 = aObjectCatalog36.getName();
        aObjectCatalog32.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog36);
        io.github.agentsoz.jill.struct.AObject aObject39 = aObjectCatalog32.pop();
        java.lang.String str40 = aObjectCatalog32.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog44 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog48 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str49 = aObjectCatalog48.getName();
        aObjectCatalog44.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog48);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog54 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog54.setName("hi!");
        java.lang.String str57 = aObjectCatalog54.getName();
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog44, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog54);
        java.lang.String str59 = aObjectCatalog44.getName();
        aObjectCatalog32.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog44);
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog32);
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i64 = aObjectCatalog3.getId();
        aObjectCatalog3.setId((int) (byte) 1);
        org.junit.Assert.assertNull(aObject11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(i64 == (-1));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test205");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        int i6 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("hi!:-1");
        int i9 = aObjectCatalog3.size();
        aObjectCatalog3.setId((int) (byte) 10);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog15.get((-1));
        java.lang.String str18 = aObjectCatalog15.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str27 = aObjectCatalog26.getName();
        aObjectCatalog22.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        io.github.agentsoz.jill.struct.AObject aObject29 = aObjectCatalog22.pop();
        aObjectCatalog15.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        java.lang.String str31 = aObjectCatalog15.toString();
        int i32 = aObjectCatalog15.getId();
        int i33 = aObjectCatalog15.getId();
        io.github.agentsoz.jill.struct.AObject aObject35 = aObjectCatalog15.get((int) (byte) 0);
        aObjectCatalog15.setName("hi!:100");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        java.lang.String str39 = aObjectCatalog15.toString();
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(aObject17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject29);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!:-1" + "'", str31.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertTrue(i33 == (-1));
        org.junit.Assert.assertNotNull(aObject35);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!:100:0" + "'", str39.equals("hi!:100:0"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test206");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1:1", (int) (byte) 1, (int) (byte) 0);
        aObjectCatalog3.setId(0);
        try {
            io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test207");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog11.get((-1));
        java.lang.String str14 = aObjectCatalog11.getName();
        aObjectCatalog11.setId((int) ' ');
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        java.lang.String str18 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) (short) 1);
        io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog3.find("hi!:-1:-1:-1");
        io.github.agentsoz.jill.struct.AObject aObject24 = aObjectCatalog3.get((int) 'a');
        try {
            aObject24.setName("hi!:100:-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNull(aObject22);
        org.junit.Assert.assertNull(aObject24);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test208");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.find("hi!:-1:1");
        int i7 = aObjectCatalog3.size();
        try {
            io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(aObject6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test209");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", (int) (byte) 1, (int) (short) 100);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog7.get((int) (byte) 100);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog13.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog19.setName("hi!");
        aObjectCatalog13.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        aObjectCatalog3.setId((int) (short) 1);
        aObjectCatalog3.setId((int) (byte) 0);
        int i29 = aObjectCatalog3.size();
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i29 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test210");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName(":-1:-1");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test211");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog(":-1:-1", (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test212");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.get((int) (byte) -1);
        try {
            java.lang.String str11 = aObject10.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject10);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test213");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (byte) 1, (int) (byte) 1);
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog9.get((-1));
        java.lang.String str12 = aObjectCatalog9.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str21 = aObjectCatalog20.getName();
        aObjectCatalog16.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        io.github.agentsoz.jill.struct.AObject aObject23 = aObjectCatalog16.pop();
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        java.lang.String str25 = aObjectCatalog9.toString();
        int i26 = aObjectCatalog9.getId();
        aObjectCatalog9.setId((int) (byte) -1);
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.struct.AObject aObject31 = aObjectCatalog9.get(10);
        org.junit.Assert.assertNull(aObject11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject23);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:-1" + "'", str25.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(aObject31);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test214");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!");
        try {
            io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test215");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        int i16 = aObjectCatalog13.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog20.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog26.setName("hi!");
        java.lang.String str29 = aObjectCatalog26.toString();
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        int i31 = aObjectCatalog26.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog35 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog39 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str40 = aObjectCatalog39.getName();
        aObjectCatalog35.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog39);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog45 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog45.setName("hi!");
        java.lang.String str48 = aObjectCatalog45.getName();
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog35, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog45);
        java.lang.String str50 = aObjectCatalog35.getName();
        aObjectCatalog35.setName("");
        int i53 = aObjectCatalog35.getId();
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog26, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog35);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog58 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog58.setName("hi!");
        aObjectCatalog58.setName("hi!");
        aObjectCatalog58.setId((-1));
        aObjectCatalog26.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog58);
        int i66 = aObjectCatalog58.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog70 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        int i71 = aObjectCatalog70.getId();
        java.lang.String str72 = aObjectCatalog70.toString();
        boolean b73 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog58, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog70);
        aObjectCatalog13.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog70);
        try {
            io.github.agentsoz.jill.struct.AObject aObject75 = aObjectCatalog70.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!:-1" + "'", str29.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
        org.junit.Assert.assertTrue(i53 == (-1));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertTrue(i71 == (-1));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!:-1" + "'", str72.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b73 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test216");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", 0, (int) (short) 10);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test217");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str18 = aObjectCatalog17.getName();
        aObjectCatalog13.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog23.setName("hi!");
        java.lang.String str26 = aObjectCatalog23.getName();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.struct.AObject aObject29 = aObjectCatalog3.pop();
        aObjectCatalog3.setName("hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(aObject29);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test218");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog13.setName("hi!");
        java.lang.String str16 = aObjectCatalog13.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog21);
        aObjectCatalog21.setName("hi!:0");
        java.lang.String str25 = aObjectCatalog21.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog29 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog29.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog35 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog35.setName("hi!");
        java.lang.String str38 = aObjectCatalog35.toString();
        aObjectCatalog29.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog35);
        int i40 = aObjectCatalog35.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog44 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog48 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str49 = aObjectCatalog48.getName();
        aObjectCatalog44.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog48);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog54 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog54.setName("hi!");
        java.lang.String str57 = aObjectCatalog54.getName();
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog44, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog54);
        java.lang.String str59 = aObjectCatalog44.getName();
        aObjectCatalog44.setName("");
        int i62 = aObjectCatalog44.getId();
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog35, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog44);
        io.github.agentsoz.jill.struct.AObject aObject65 = aObjectCatalog44.find("hi!:0:-1");
        io.github.agentsoz.jill.struct.AObject aObject67 = aObjectCatalog44.get(10);
        boolean b68 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog21, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog44);
        io.github.agentsoz.jill.struct.AObject aObject70 = aObjectCatalog44.get((int) '#');
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:0:-1" + "'", str25.equals("hi!:0:-1"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!:-1" + "'", str38.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        org.junit.Assert.assertTrue(i62 == (-1));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(aObject65);
        org.junit.Assert.assertNull(aObject67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(aObject70);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test219");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        io.github.agentsoz.jill.struct.AObject aObject16 = aObjectCatalog3.find("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog24 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str25 = aObjectCatalog24.getName();
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog24);
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog20.pop();
        aObjectCatalog20.setId((int) '4');
        aObjectCatalog20.setId((-1));
        int i32 = aObjectCatalog20.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog36 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog40 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str41 = aObjectCatalog40.getName();
        aObjectCatalog36.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog40);
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog40);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog47 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog51 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str52 = aObjectCatalog51.getName();
        aObjectCatalog47.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog51);
        java.lang.String str54 = aObjectCatalog47.toString();
        io.github.agentsoz.jill.struct.AObject aObject55 = aObjectCatalog47.pop();
        boolean b56 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20, aObject55);
        aObjectCatalog3.push(aObject55);
        aObject55.setName("hi!");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject16);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject27);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!" + "'", str52.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!:-1" + "'", str54.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject55);
        org.junit.Assert.assertTrue(b56 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test220");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!:0");
        java.lang.String str10 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog14.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog20.setName("hi!");
        java.lang.String str23 = aObjectCatalog20.toString();
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        int i25 = aObjectCatalog20.size();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        java.lang.String str27 = aObjectCatalog20.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) '4', 0);
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        int i33 = aObjectCatalog31.size();
        try {
            io.github.agentsoz.jill.struct.AObject aObject34 = aObjectCatalog31.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:0" + "'", str10.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:-1" + "'", str23.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:0" + "'", str27.equals("hi!:0"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test221");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog8 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog8.setName("hi!");
        io.github.agentsoz.jill.struct.AObject aObject11 = null;
        aObjectCatalog8.push(aObject11);
        int i13 = aObjectCatalog8.size();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog8);
        int i15 = aObjectCatalog8.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 97, (int) (byte) 1);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog8, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        int i21 = aObjectCatalog8.getId();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test222");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setId((-1));
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.get((int) (byte) -1);
        org.junit.Assert.assertNull(aObject11);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test223");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str21 = aObjectCatalog20.getName();
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog30 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str31 = aObjectCatalog30.getName();
        aObjectCatalog26.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog30);
        io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog26.pop();
        java.lang.String str34 = aObjectCatalog26.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog38 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog42 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str43 = aObjectCatalog42.getName();
        aObjectCatalog38.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog42);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog48 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog48.setName("hi!");
        java.lang.String str51 = aObjectCatalog48.getName();
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog38, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog48);
        java.lang.String str53 = aObjectCatalog38.getName();
        aObjectCatalog26.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog38);
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        int i57 = aObjectCatalog14.getId();
        io.github.agentsoz.jill.struct.AObject aObject58 = aObjectCatalog14.pop();
        int i59 = aObject58.getId();
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(aObject58);
        org.junit.Assert.assertTrue(i59 == 0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test224");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog9.get((-1));
        java.lang.String str12 = aObjectCatalog9.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str21 = aObjectCatalog20.getName();
        aObjectCatalog16.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        io.github.agentsoz.jill.struct.AObject aObject23 = aObjectCatalog16.pop();
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        int i25 = aObjectCatalog16.getId();
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog16.get(10);
        try {
            boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, aObject27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject23);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(aObject27);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test225");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("hi!:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str17 = aObjectCatalog16.getName();
        aObjectCatalog12.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog22.setName("hi!");
        java.lang.String str25 = aObjectCatalog22.getName();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        java.lang.String str27 = aObjectCatalog12.toString();
        io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog12.pop();
        aObject28.setId((int) 'a');
        aObjectCatalog3.push(aObject28);
        int i32 = aObjectCatalog3.getId();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1" + "'", str27.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject28);
        org.junit.Assert.assertTrue(i32 == (-1));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test226");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0", 52, (int) ' ');
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test227");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("hi!:-1:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str17 = aObjectCatalog16.getName();
        aObjectCatalog12.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog22.setName("hi!");
        java.lang.String str25 = aObjectCatalog22.getName();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        java.lang.String str27 = aObjectCatalog12.toString();
        java.lang.String str28 = aObjectCatalog12.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12);
        int i30 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog34 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog38 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str39 = aObjectCatalog38.getName();
        aObjectCatalog34.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog38);
        io.github.agentsoz.jill.struct.AObject aObject41 = aObjectCatalog34.pop();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog45 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog45.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog51 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog51.setName("hi!");
        aObjectCatalog45.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog51);
        int i55 = aObjectCatalog51.getId();
        aObjectCatalog34.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog51);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog60 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog51.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog60);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog51);
        io.github.agentsoz.jill.struct.AObject aObject64 = aObjectCatalog51.get(2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1" + "'", str27.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!:-1" + "'", str28.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i30 == (-1));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject41);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertNull(aObject64);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test228");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.find("hi!:-1:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog10.pop();
        aObjectCatalog10.setId((int) '4');
        aObjectCatalog10.setId((-1));
        int i22 = aObjectCatalog10.size();
        aObjectCatalog10.setId((int) (short) 10);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog29 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str30 = aObjectCatalog29.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog34 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog34.setName("hi!");
        io.github.agentsoz.jill.struct.AObject aObject37 = null;
        aObjectCatalog34.push(aObject37);
        int i39 = aObjectCatalog34.size();
        aObjectCatalog29.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog34);
        int i41 = aObjectCatalog34.size();
        io.github.agentsoz.jill.struct.AObject aObject43 = aObjectCatalog34.get(52);
        try {
            boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, aObject43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(aObject6);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNull(aObject43);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test229");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get(100);
        java.lang.String str6 = aObjectCatalog3.toString();
        aObjectCatalog3.setId(1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str17 = aObjectCatalog16.getName();
        aObjectCatalog12.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        java.lang.String str19 = aObjectCatalog12.toString();
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog12.pop();
        aObjectCatalog3.push(aObject20);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog25 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog25.get((-1));
        java.lang.String str28 = aObjectCatalog25.getName();
        aObjectCatalog25.setName("hi!:0");
        java.lang.String str31 = aObjectCatalog25.toString();
        java.lang.String str32 = aObjectCatalog25.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog25);
        try {
            io.github.agentsoz.jill.struct.AObject aObject34 = aObjectCatalog25.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject20);
        org.junit.Assert.assertNull(aObject27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!:0:-1" + "'", str31.equals("hi!:0:-1"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!:0:-1" + "'", str32.equals("hi!:0:-1"));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test230");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog19.setName("hi!");
        java.lang.String str22 = aObjectCatalog19.getName();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        java.lang.String str24 = aObjectCatalog9.toString();
        io.github.agentsoz.jill.struct.AObject aObject25 = aObjectCatalog9.pop();
        aObjectCatalog3.push(aObject25);
        aObject25.setId(32);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!:-1" + "'", str24.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject25);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test231");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setId((int) (short) 0);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str16 = aObjectCatalog15.getName();
        aObjectCatalog11.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        io.github.agentsoz.jill.struct.AObject aObject18 = aObjectCatalog11.pop();
        aObjectCatalog11.setId((int) '4');
        aObjectCatalog11.setId((int) (byte) 10);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (byte) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog30 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog34 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str35 = aObjectCatalog34.getName();
        aObjectCatalog30.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog34);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog40 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog40.setName("hi!");
        java.lang.String str43 = aObjectCatalog40.getName();
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog30, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog40);
        aObjectCatalog26.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog40);
        aObjectCatalog40.setId((int) ' ');
        java.lang.String str48 = aObjectCatalog40.getName();
        aObjectCatalog11.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog40);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog40);
        java.lang.String str51 = aObjectCatalog40.getName();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject18);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test232");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 1, (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.find("hi!:100:0");
        try {
            int i6 = aObject5.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject5);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test233");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog3.find("hi!:0:-1");
        try {
            io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(aObject9);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test234");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setName("");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog18.get((-1));
        java.lang.String str21 = aObjectCatalog18.getName();
        aObjectCatalog18.setId((int) ' ');
        aObjectCatalog18.setId((int) '4');
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog18.find(":-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog31.get((-1));
        java.lang.String str34 = aObjectCatalog31.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog38 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog42 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str43 = aObjectCatalog42.getName();
        aObjectCatalog38.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog42);
        io.github.agentsoz.jill.struct.AObject aObject45 = aObjectCatalog38.pop();
        aObjectCatalog31.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog38);
        java.lang.String str47 = aObjectCatalog31.toString();
        aObjectCatalog18.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        int i50 = aObjectCatalog31.getId();
        aObjectCatalog31.setId(100);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog56 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog60 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str61 = aObjectCatalog60.getName();
        aObjectCatalog56.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog60);
        io.github.agentsoz.jill.struct.AObject aObject63 = aObjectCatalog56.pop();
        aObjectCatalog56.setId((int) '4');
        aObjectCatalog56.setId((-1));
        int i68 = aObjectCatalog56.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog72 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog76 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str77 = aObjectCatalog76.getName();
        aObjectCatalog72.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog76);
        boolean b79 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog56, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog76);
        aObjectCatalog31.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog56);
        int i81 = aObjectCatalog31.size();
        int i82 = aObjectCatalog31.size();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNull(aObject27);
        org.junit.Assert.assertNull(aObject33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject45);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!:-1" + "'", str47.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject63);
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "hi!" + "'", str77.equals("hi!"));
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertTrue(i81 == 2);
        org.junit.Assert.assertTrue(i82 == 2);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test235");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        aObjectCatalog3.setName("hi!:-1");
        aObjectCatalog3.setId(0);
        int i8 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.find(":-1");
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(aObject10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test236");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.struct.AObject aObject15 = aObjectCatalog9.find("");
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog9.get((int) (short) 1);
        int i18 = aObjectCatalog9.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject24 = aObjectCatalog22.get((-1));
        java.lang.String str25 = aObjectCatalog22.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog29 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog33 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str34 = aObjectCatalog33.getName();
        aObjectCatalog29.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog33);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog39 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str40 = aObjectCatalog39.getName();
        aObjectCatalog33.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog39);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog45 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog49 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str50 = aObjectCatalog49.getName();
        aObjectCatalog45.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog49);
        io.github.agentsoz.jill.struct.AObject aObject52 = aObjectCatalog45.pop();
        java.lang.String str53 = aObjectCatalog45.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog57 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog61 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str62 = aObjectCatalog61.getName();
        aObjectCatalog57.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog61);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog67 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog67.setName("hi!");
        java.lang.String str70 = aObjectCatalog67.getName();
        boolean b71 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog57, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog67);
        java.lang.String str72 = aObjectCatalog57.getName();
        aObjectCatalog45.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog57);
        boolean b74 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog33, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog45);
        aObjectCatalog22.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog33);
        int i76 = aObjectCatalog33.getId();
        io.github.agentsoz.jill.struct.AObject aObject77 = aObjectCatalog33.pop();
        boolean b78 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog33);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject15);
        org.junit.Assert.assertNull(aObject17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(aObject24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "hi!" + "'", str62.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "hi!" + "'", str70.equals("hi!"));
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!" + "'", str72.equals("hi!"));
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertNotNull(aObject77);
        org.junit.Assert.assertTrue(b78 == true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test237");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog11.get((-1));
        java.lang.String str14 = aObjectCatalog11.getName();
        aObjectCatalog11.setId((int) ' ');
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        java.lang.String str18 = aObjectCatalog3.getName();
        try {
            io.github.agentsoz.jill.struct.AObject aObject19 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test238");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog14.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog20.setName("hi!");
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        int i24 = aObjectCatalog20.getId();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog29 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog29);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog34 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog38 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str39 = aObjectCatalog38.getName();
        aObjectCatalog34.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog38);
        io.github.agentsoz.jill.struct.AObject aObject41 = aObjectCatalog34.pop();
        aObjectCatalog34.setId((int) '4');
        aObjectCatalog34.setId((-1));
        aObjectCatalog34.setId((int) (byte) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog51 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog55 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject57 = aObjectCatalog55.get((-1));
        java.lang.String str58 = aObjectCatalog55.getName();
        aObjectCatalog55.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject62 = aObjectCatalog55.get((int) (byte) 10);
        aObjectCatalog51.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog55);
        io.github.agentsoz.jill.struct.AObject aObject65 = aObjectCatalog51.find("hi!");
        io.github.agentsoz.jill.struct.AObject aObject66 = aObjectCatalog51.pop();
        io.github.agentsoz.jill.struct.AObject aObject68 = aObjectCatalog51.get((int) '#');
        boolean b69 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog34, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog51);
        boolean b70 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog34);
        java.lang.String str71 = aObjectCatalog34.getName();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject41);
        org.junit.Assert.assertNull(aObject57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!" + "'", str58.equals("hi!"));
        org.junit.Assert.assertNull(aObject62);
        org.junit.Assert.assertNull(aObject65);
        org.junit.Assert.assertNotNull(aObject66);
        org.junit.Assert.assertNull(aObject68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "hi!" + "'", str71.equals("hi!"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test239");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog8 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog8.setName("hi!");
        io.github.agentsoz.jill.struct.AObject aObject11 = null;
        aObjectCatalog8.push(aObject11);
        int i13 = aObjectCatalog8.size();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog8);
        int i15 = aObjectCatalog8.getId();
        java.lang.String str16 = aObjectCatalog8.getName();
        try {
            io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog8.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test240");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog10.pop();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        java.lang.String str19 = aObjectCatalog3.toString();
        int i20 = aObjectCatalog3.getId();
        int i21 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog25 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog25.setName("hi!");
        int i28 = aObjectCatalog25.size();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog25);
        io.github.agentsoz.jill.struct.AObject aObject30 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog34 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog34.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog40 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog40.setName("hi!");
        java.lang.String str43 = aObjectCatalog40.toString();
        aObjectCatalog34.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog40);
        aObjectCatalog40.setName("hi!:-1:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog50 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog50.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog56 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog56.setName("hi!");
        aObjectCatalog50.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog56);
        boolean b60 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog40, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog50);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog40);
        int i62 = aObjectCatalog40.size();
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(aObject30);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!:-1" + "'", str43.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(i62 == 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test241");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:-1", 1, (int) (byte) 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test242");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str18 = aObjectCatalog17.getName();
        aObjectCatalog13.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog23.setName("hi!");
        java.lang.String str26 = aObjectCatalog23.getName();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        aObjectCatalog3.setName("hi!:10");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test243");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog13.setName("hi!");
        java.lang.String str16 = aObjectCatalog13.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog21);
        aObjectCatalog21.setName("hi!:0");
        java.lang.String str25 = aObjectCatalog21.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog29 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog29.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog35 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog35.setName("hi!");
        java.lang.String str38 = aObjectCatalog35.toString();
        aObjectCatalog29.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog35);
        int i40 = aObjectCatalog35.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog44 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog48 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str49 = aObjectCatalog48.getName();
        aObjectCatalog44.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog48);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog54 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog54.setName("hi!");
        java.lang.String str57 = aObjectCatalog54.getName();
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog44, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog54);
        java.lang.String str59 = aObjectCatalog44.getName();
        aObjectCatalog44.setName("");
        int i62 = aObjectCatalog44.getId();
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog35, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog44);
        io.github.agentsoz.jill.struct.AObject aObject65 = aObjectCatalog44.find("hi!:0:-1");
        io.github.agentsoz.jill.struct.AObject aObject67 = aObjectCatalog44.get(10);
        boolean b68 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog21, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog44);
        io.github.agentsoz.jill.struct.AObject aObject70 = aObjectCatalog21.find(":-1:-1");
        java.lang.String str71 = aObjectCatalog21.toString();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:0:-1" + "'", str25.equals("hi!:0:-1"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!:-1" + "'", str38.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        org.junit.Assert.assertTrue(i62 == (-1));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(aObject65);
        org.junit.Assert.assertNull(aObject67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(aObject70);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "hi!:0:-1" + "'", str71.equals("hi!:0:-1"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test244");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:10", 32, 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test245");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", (int) (byte) 1, (int) (short) 100);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog7.get((int) (byte) 100);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog13.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog19.setName("hi!");
        aObjectCatalog13.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        try {
            io.github.agentsoz.jill.struct.AObject aObject25 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test246");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1:1", (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test247");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        java.lang.String str10 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog15.get((-1));
        java.lang.String str18 = aObjectCatalog15.getName();
        aObjectCatalog15.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog15.get((int) (byte) 10);
        aObjectCatalog15.setName("");
        io.github.agentsoz.jill.struct.AObject aObject26 = aObjectCatalog15.find("");
        io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog15.find("");
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog33 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog37 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str38 = aObjectCatalog37.getName();
        aObjectCatalog33.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog37);
        io.github.agentsoz.jill.struct.AObject aObject40 = aObjectCatalog33.pop();
        aObjectCatalog33.setId((int) '4');
        aObjectCatalog33.setId((-1));
        int i45 = aObjectCatalog33.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog49 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog53 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str54 = aObjectCatalog53.getName();
        aObjectCatalog49.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog53);
        boolean b56 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog33, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog53);
        aObjectCatalog15.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog33);
        io.github.agentsoz.jill.struct.AObject aObject59 = aObjectCatalog33.find("hi!:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog63 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject65 = aObjectCatalog63.get((-1));
        java.lang.String str66 = aObjectCatalog63.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog70 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog74 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str75 = aObjectCatalog74.getName();
        aObjectCatalog70.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog74);
        io.github.agentsoz.jill.struct.AObject aObject77 = aObjectCatalog70.pop();
        aObjectCatalog63.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog70);
        java.lang.String str79 = aObjectCatalog63.toString();
        int i80 = aObjectCatalog63.getId();
        int i81 = aObjectCatalog63.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog85 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog85.setName("hi!");
        int i88 = aObjectCatalog85.size();
        boolean b89 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog63, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog85);
        java.lang.String str90 = aObjectCatalog63.getName();
        aObjectCatalog33.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog63);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject11);
        org.junit.Assert.assertNull(aObject17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNull(aObject22);
        org.junit.Assert.assertNull(aObject26);
        org.junit.Assert.assertNull(aObject28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject40);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!" + "'", str54.equals("hi!"));
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNull(aObject59);
        org.junit.Assert.assertNull(aObject65);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!" + "'", str66.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "hi!" + "'", str75.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject77);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "hi!:-1" + "'", str79.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i80 == (-1));
        org.junit.Assert.assertTrue(i81 == (-1));
        org.junit.Assert.assertTrue(i88 == 0);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "hi!" + "'", str90.equals("hi!"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test248");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog10.pop();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        java.lang.String str19 = aObjectCatalog3.toString();
        int i20 = aObjectCatalog3.getId();
        int i21 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog25 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog25.setName("hi!");
        int i28 = aObjectCatalog25.size();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog25);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog33 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str34 = aObjectCatalog33.getName();
        int i35 = aObjectCatalog33.getId();
        aObjectCatalog33.setName("hi!");
        aObjectCatalog33.setName("hi!:0");
        java.lang.String str40 = aObjectCatalog33.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog44 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog44.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog50 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog50.setName("hi!");
        java.lang.String str53 = aObjectCatalog50.toString();
        aObjectCatalog44.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog50);
        int i55 = aObjectCatalog50.size();
        aObjectCatalog33.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog50);
        java.lang.String str57 = aObjectCatalog50.toString();
        aObjectCatalog25.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog50);
        aObjectCatalog50.setId((int) '#');
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue(i35 == (-1));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!:0" + "'", str40.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!:-1" + "'", str53.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!:0" + "'", str57.equals("hi!:0"));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test249");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        java.lang.String str11 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str20 = aObjectCatalog19.getName();
        aObjectCatalog15.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog25 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog25.setName("hi!");
        java.lang.String str28 = aObjectCatalog25.getName();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog15, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog25);
        java.lang.String str30 = aObjectCatalog15.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog3.find("hi!:0:0:97");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertNull(aObject33);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test250");
        io.github.agentsoz.jill.struct.AObject aObject0 = null;
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog4 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1:-1", (int) ' ', 100);
        try {
            boolean b5 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject0, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test251");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:32", (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test252");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog13.setName("hi!");
        java.lang.String str16 = aObjectCatalog13.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        java.lang.String str18 = aObjectCatalog3.getName();
        aObjectCatalog3.setName("");
        int i21 = aObjectCatalog3.getId();
        int i22 = aObjectCatalog3.size();
        aObjectCatalog3.setName("");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(i22 == 1);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test253");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:32", 32, (int) '#');
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test254");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setName("hi!:0:0:97");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test255");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1:-1", 1, (int) (short) 1);
        int i4 = aObjectCatalog3.size();
        java.lang.String str5 = aObjectCatalog3.toString();
        aObjectCatalog3.setId(32);
        try {
            io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1:-1:-1" + "'", str5.equals("hi!:-1:-1:-1"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test256");
        io.github.agentsoz.jill.struct.AObject aObject0 = null;
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog4 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (byte) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog8 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str13 = aObjectCatalog12.getName();
        aObjectCatalog8.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog18.setName("hi!");
        java.lang.String str21 = aObjectCatalog18.getName();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog8, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        aObjectCatalog4.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        aObjectCatalog18.setId((int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog18.find("hi!:-1");
        try {
            boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject0, aObject27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(aObject27);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test257");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog11.get((-1));
        java.lang.String str14 = aObjectCatalog11.getName();
        aObjectCatalog11.setId((int) ' ');
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        java.lang.String str18 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) (short) 1);
        io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog3.find("hi!:-1:-1:-1");
        io.github.agentsoz.jill.struct.AObject aObject24 = aObjectCatalog3.get((int) 'a');
        try {
            aObject24.setName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNull(aObject22);
        org.junit.Assert.assertNull(aObject24);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test258");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (byte) 0, 0);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog7.get((int) (byte) 100);
        java.lang.String str10 = aObjectCatalog7.toString();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        aObjectCatalog7.setName(":-1:-1");
        io.github.agentsoz.jill.struct.AObject aObject15 = aObjectCatalog7.find("hi!:-1");
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1:-1" + "'", str10.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(aObject15);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test259");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) ' ', 97);
        java.lang.String str4 = aObjectCatalog3.getName();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test260");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        int i15 = aObjectCatalog3.size();
        java.lang.String str16 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        int i21 = aObjectCatalog20.getId();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        int i23 = aObjectCatalog20.getId();
        try {
            io.github.agentsoz.jill.struct.AObject aObject24 = aObjectCatalog20.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!:-1" + "'", str16.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == (-1));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test261");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        java.lang.String str10 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog15.get((-1));
        java.lang.String str18 = aObjectCatalog15.getName();
        aObjectCatalog15.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog15.get((int) (byte) 10);
        aObjectCatalog15.setName("");
        io.github.agentsoz.jill.struct.AObject aObject26 = aObjectCatalog15.find("");
        io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog15.find("");
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog33 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog37 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str38 = aObjectCatalog37.getName();
        aObjectCatalog33.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog37);
        io.github.agentsoz.jill.struct.AObject aObject40 = aObjectCatalog33.pop();
        aObjectCatalog33.setId((int) '4');
        aObjectCatalog33.setId((-1));
        int i45 = aObjectCatalog33.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog49 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog53 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str54 = aObjectCatalog53.getName();
        aObjectCatalog49.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog53);
        boolean b56 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog33, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog53);
        aObjectCatalog15.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog33);
        io.github.agentsoz.jill.struct.AObject aObject59 = aObjectCatalog33.get((int) (short) 1);
        try {
            java.lang.String str60 = aObject59.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject11);
        org.junit.Assert.assertNull(aObject17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNull(aObject22);
        org.junit.Assert.assertNull(aObject26);
        org.junit.Assert.assertNull(aObject28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject40);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!" + "'", str54.equals("hi!"));
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNull(aObject59);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test262");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog13.setName("hi!");
        java.lang.String str16 = aObjectCatalog13.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog21);
        aObjectCatalog21.setName("hi!:0");
        java.lang.String str25 = aObjectCatalog21.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog29 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog29.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog35 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog35.setName("hi!");
        java.lang.String str38 = aObjectCatalog35.toString();
        aObjectCatalog29.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog35);
        int i40 = aObjectCatalog35.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog44 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog48 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str49 = aObjectCatalog48.getName();
        aObjectCatalog44.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog48);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog54 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog54.setName("hi!");
        java.lang.String str57 = aObjectCatalog54.getName();
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog44, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog54);
        java.lang.String str59 = aObjectCatalog44.getName();
        aObjectCatalog44.setName("");
        int i62 = aObjectCatalog44.getId();
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog35, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog44);
        io.github.agentsoz.jill.struct.AObject aObject65 = aObjectCatalog44.find("hi!:0:-1");
        io.github.agentsoz.jill.struct.AObject aObject67 = aObjectCatalog44.get(10);
        boolean b68 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog21, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog44);
        io.github.agentsoz.jill.struct.AObject aObject70 = aObjectCatalog21.find(":-1:-1");
        try {
            aObject70.setId((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:0:-1" + "'", str25.equals("hi!:0:-1"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!:-1" + "'", str38.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        org.junit.Assert.assertTrue(i62 == (-1));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(aObject65);
        org.junit.Assert.assertNull(aObject67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(aObject70);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test263");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog11.get((-1));
        java.lang.String str14 = aObjectCatalog11.getName();
        aObjectCatalog11.setId((int) ' ');
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        java.lang.String str18 = aObjectCatalog3.getName();
        java.lang.String str19 = aObjectCatalog3.toString();
        int i20 = aObjectCatalog3.getId();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i20 == (-1));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test264");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObject10.setId((int) (byte) -1);
        int i13 = aObject10.getId();
        java.lang.String str14 = aObject10.toString();
        int i15 = aObject10.getId();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:-1" + "'", str14.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i15 == (-1));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test265");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((int) (byte) 100);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog15.setName("hi!");
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        aObjectCatalog3.setName("hi!:97");
        io.github.agentsoz.jill.struct.AObject aObject23 = aObjectCatalog3.find("");
        try {
            io.github.agentsoz.jill.struct.AObject aObject24 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertNull(aObject23);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test266");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog(":-1", 0, 32);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test267");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", (int) (byte) 0, (int) (short) -1);
        aObjectCatalog3.setName("hi!:-1");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test268");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i14 = aObjectCatalog9.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str23 = aObjectCatalog22.getName();
        aObjectCatalog18.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog28 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog28.setName("hi!");
        java.lang.String str31 = aObjectCatalog28.getName();
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog18, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog28);
        java.lang.String str33 = aObjectCatalog18.getName();
        aObjectCatalog18.setName("");
        int i36 = aObjectCatalog18.getId();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog41 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog41.setName("hi!");
        aObjectCatalog41.setName("hi!");
        aObjectCatalog41.setId((-1));
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        int i49 = aObjectCatalog41.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog53 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        int i54 = aObjectCatalog53.getId();
        java.lang.String str55 = aObjectCatalog53.toString();
        boolean b56 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog41, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog53);
        io.github.agentsoz.jill.struct.AObject aObject58 = aObjectCatalog41.get(97);
        io.github.agentsoz.jill.struct.AObject aObject60 = aObjectCatalog41.find("hi!:10");
        io.github.agentsoz.jill.struct.AObject aObject62 = aObjectCatalog41.get((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue(i54 == (-1));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!:-1" + "'", str55.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNull(aObject58);
        org.junit.Assert.assertNull(aObject60);
        org.junit.Assert.assertNull(aObject62);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test269");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        int i10 = aObjectCatalog3.getId();
        aObjectCatalog3.setId(32);
        io.github.agentsoz.jill.struct.AObject aObject14 = aObjectCatalog3.find("hi!:10");
        int i15 = aObjectCatalog3.size();
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog3.get((int) (short) -1);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(aObject14);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNull(aObject17);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test270");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog(":-1", 0, (int) (byte) 100);
        aObjectCatalog3.setId((int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.find("hi!:32");
        org.junit.Assert.assertNull(aObject7);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test271");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog9.setName("hi!");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i13 = aObjectCatalog9.getId();
        aObjectCatalog9.setId((int) (short) 0);
        aObjectCatalog9.setName("");
        aObjectCatalog9.setId(97);
        aObjectCatalog9.setName("hi!:100:0");
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test272");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get(100);
        java.lang.String str6 = aObjectCatalog3.toString();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str12 = aObjectCatalog11.getName();
        int i13 = aObjectCatalog11.getId();
        aObjectCatalog11.setName("hi!");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog24 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str25 = aObjectCatalog24.getName();
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog24);
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog20.pop();
        io.github.agentsoz.jill.struct.AObject aObject29 = aObjectCatalog20.find("hi!:0");
        java.lang.String str30 = aObjectCatalog20.toString();
        aObjectCatalog11.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog20.get(0);
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject27);
        org.junit.Assert.assertNull(aObject29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1" + "'", str30.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject33);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test273");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) ' ');
        aObjectCatalog3.setId((int) '4');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog14.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog24 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str25 = aObjectCatalog24.getName();
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog24);
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog20.pop();
        aObjectCatalog20.setId((int) '4');
        aObjectCatalog20.setId((-1));
        int i32 = aObjectCatalog20.size();
        java.lang.String str33 = aObjectCatalog20.toString();
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        int i36 = aObjectCatalog14.getId();
        java.lang.String str37 = aObjectCatalog14.getName();
        int i38 = aObjectCatalog14.getId();
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject27);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!:-1" + "'", str33.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        org.junit.Assert.assertTrue(i38 == (-1));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test274");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setName("hi!:0:0");
        aObjectCatalog3.setName("hi!:-1");
        int i11 = aObjectCatalog3.getId();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == (-1));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test275");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setName("");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog18.get((-1));
        java.lang.String str21 = aObjectCatalog18.getName();
        aObjectCatalog18.setId((int) ' ');
        aObjectCatalog18.setId((int) '4');
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog18.find(":-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog31.get((-1));
        java.lang.String str34 = aObjectCatalog31.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog38 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog42 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str43 = aObjectCatalog42.getName();
        aObjectCatalog38.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog42);
        io.github.agentsoz.jill.struct.AObject aObject45 = aObjectCatalog38.pop();
        aObjectCatalog31.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog38);
        java.lang.String str47 = aObjectCatalog31.toString();
        aObjectCatalog18.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        int i50 = aObjectCatalog31.getId();
        java.lang.String str51 = aObjectCatalog31.getName();
        io.github.agentsoz.jill.struct.AObject aObject52 = aObjectCatalog31.pop();
        try {
            io.github.agentsoz.jill.struct.AObject aObject53 = aObjectCatalog31.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNull(aObject27);
        org.junit.Assert.assertNull(aObject33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject45);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!:-1" + "'", str47.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject52);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test276");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (byte) -1);
        try {
            io.github.agentsoz.jill.struct.AObject aObject4 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test277");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        aObjectCatalog3.setName("hi!:-1");
        aObjectCatalog3.setId(0);
        int i8 = aObjectCatalog3.getId();
        aObjectCatalog3.setName(":-1:-1");
        int i11 = aObjectCatalog3.size();
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test278");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i14 = aObjectCatalog9.getId();
        io.github.agentsoz.jill.struct.AObject aObject16 = aObjectCatalog9.find("");
        aObjectCatalog9.setName("hi!:-1");
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog9.get(32);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(aObject16);
        org.junit.Assert.assertNull(aObject20);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test279");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog19.setName("hi!");
        java.lang.String str22 = aObjectCatalog19.getName();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        java.lang.String str24 = aObjectCatalog9.toString();
        io.github.agentsoz.jill.struct.AObject aObject25 = aObjectCatalog9.pop();
        aObjectCatalog3.push(aObject25);
        io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog3.find("hi!:0:-1");
        try {
            int i29 = aObject28.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!:-1" + "'", str24.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject25);
        org.junit.Assert.assertNull(aObject28);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test280");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        java.lang.String str11 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str20 = aObjectCatalog19.getName();
        aObjectCatalog15.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog25 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog25.setName("hi!");
        java.lang.String str28 = aObjectCatalog25.getName();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog15, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog25);
        java.lang.String str30 = aObjectCatalog15.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog3.get(100);
        java.lang.String str34 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject36 = aObjectCatalog3.find("hi!:-1:1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog40 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject42 = aObjectCatalog40.find("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog46 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog50 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str51 = aObjectCatalog50.getName();
        aObjectCatalog46.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog50);
        io.github.agentsoz.jill.struct.AObject aObject53 = aObjectCatalog46.pop();
        aObjectCatalog40.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog46);
        try {
            boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject36, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertNull(aObject33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertNull(aObject36);
        org.junit.Assert.assertNull(aObject42);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject53);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test281");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("hi!:-1:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str17 = aObjectCatalog16.getName();
        aObjectCatalog12.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog22.setName("hi!");
        java.lang.String str25 = aObjectCatalog22.getName();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        java.lang.String str27 = aObjectCatalog12.toString();
        java.lang.String str28 = aObjectCatalog12.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12);
        io.github.agentsoz.jill.struct.AObject aObject31 = aObjectCatalog12.get((int) (byte) 1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog35 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog39 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str40 = aObjectCatalog39.getName();
        aObjectCatalog35.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog39);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog45 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str46 = aObjectCatalog45.getName();
        aObjectCatalog39.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog45);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog51 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog55 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str56 = aObjectCatalog55.getName();
        aObjectCatalog51.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog55);
        io.github.agentsoz.jill.struct.AObject aObject58 = aObjectCatalog51.pop();
        java.lang.String str59 = aObjectCatalog51.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog63 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog67 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str68 = aObjectCatalog67.getName();
        aObjectCatalog63.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog67);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog73 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog73.setName("hi!");
        java.lang.String str76 = aObjectCatalog73.getName();
        boolean b77 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog63, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog73);
        java.lang.String str78 = aObjectCatalog63.getName();
        aObjectCatalog51.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog63);
        boolean b80 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog39, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog51);
        boolean b81 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog39);
        int i82 = aObjectCatalog39.size();
        int i83 = aObjectCatalog39.size();
        int i84 = aObjectCatalog39.getId();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1" + "'", str27.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!:-1" + "'", str28.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject31);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!" + "'", str56.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject58);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "hi!" + "'", str68.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "hi!" + "'", str76.equals("hi!"));
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "hi!" + "'", str78.equals("hi!"));
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue(i82 == 1);
        org.junit.Assert.assertTrue(i83 == 1);
        org.junit.Assert.assertTrue(i84 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test282");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", 10, 32);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get(1);
        try {
            aObject5.setName(":52");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject5);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test283");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str18 = aObjectCatalog17.getName();
        aObjectCatalog13.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog23.setName("hi!");
        java.lang.String str26 = aObjectCatalog23.getName();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        aObjectCatalog3.setId((int) (byte) 100);
        io.github.agentsoz.jill.struct.AObject aObject32 = aObjectCatalog3.get((int) 'a');
        io.github.agentsoz.jill.struct.AObject aObject34 = aObjectCatalog3.get((-1));
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog38 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str39 = aObjectCatalog38.getName();
        int i40 = aObjectCatalog38.getId();
        aObjectCatalog38.setName("hi!");
        aObjectCatalog38.setName("hi!:0");
        java.lang.String str45 = aObjectCatalog38.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog49 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog49.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog55 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog55.setName("hi!");
        java.lang.String str58 = aObjectCatalog55.toString();
        aObjectCatalog49.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog55);
        int i60 = aObjectCatalog55.size();
        aObjectCatalog38.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog55);
        java.lang.String str62 = aObjectCatalog55.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog66 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) '4', 0);
        boolean b67 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog55, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog66);
        try {
            boolean b68 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(aObject32);
        org.junit.Assert.assertNull(aObject34);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        org.junit.Assert.assertTrue(i40 == (-1));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!:0" + "'", str45.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!:-1" + "'", str58.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "hi!:0" + "'", str62.equals("hi!:0"));
        org.junit.Assert.assertTrue(b67 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test284");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog10.pop();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        java.lang.String str19 = aObjectCatalog3.toString();
        int i20 = aObjectCatalog3.getId();
        int i21 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog25 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog25.setName("hi!");
        int i28 = aObjectCatalog25.size();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog25);
        java.lang.String str30 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog34 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", (int) (byte) 1, (int) (short) 100);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog38 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        io.github.agentsoz.jill.struct.AObject aObject40 = aObjectCatalog38.get((int) (byte) 100);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog44 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog44.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog50 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog50.setName("hi!");
        aObjectCatalog44.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog50);
        aObjectCatalog38.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog50);
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog34, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog50);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog59 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog59.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog65 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog65.setName("hi!");
        java.lang.String str68 = aObjectCatalog65.toString();
        aObjectCatalog59.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog65);
        aObjectCatalog65.setName("hi!:-1:-1");
        aObjectCatalog34.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog65);
        boolean b73 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog65);
        int i74 = aObjectCatalog65.size();
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertNull(aObject40);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "hi!:-1" + "'", str68.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(i74 == 0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test285");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100", (int) (short) 1, (int) (byte) 1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        int i9 = aObjectCatalog7.getId();
        aObjectCatalog7.setId((int) (short) 0);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str20 = aObjectCatalog19.getName();
        aObjectCatalog15.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog15.pop();
        aObject22.setId((int) (byte) -1);
        aObjectCatalog7.push(aObject22);
        int i26 = aObjectCatalog7.getId();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        try {
            io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject22);
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test286");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0:-1", 97, (int) (byte) 10);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test287");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog11.get((-1));
        java.lang.String str14 = aObjectCatalog11.getName();
        aObjectCatalog11.setId((int) ' ');
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        java.lang.String str18 = aObjectCatalog3.getName();
        java.lang.String str19 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject21 = aObjectCatalog3.get((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject21);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test288");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (byte) 0, 0);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog7.get((int) (byte) 100);
        java.lang.String str10 = aObjectCatalog7.toString();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        aObjectCatalog7.setName(":-1:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject23 = aObjectCatalog21.get((-1));
        java.lang.String str24 = aObjectCatalog21.getName();
        aObjectCatalog21.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog21.get((int) (byte) 10);
        aObjectCatalog17.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog21);
        io.github.agentsoz.jill.struct.AObject aObject31 = aObjectCatalog17.find("hi!");
        io.github.agentsoz.jill.struct.AObject aObject32 = aObjectCatalog17.pop();
        io.github.agentsoz.jill.struct.AObject aObject34 = aObjectCatalog17.get((int) '#');
        try {
            boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7, aObject34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1:-1" + "'", str10.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(aObject23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNull(aObject28);
        org.junit.Assert.assertNull(aObject31);
        org.junit.Assert.assertNotNull(aObject32);
        org.junit.Assert.assertNull(aObject34);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test289");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (byte) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str12 = aObjectCatalog11.getName();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog17.setName("hi!");
        java.lang.String str20 = aObjectCatalog17.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        aObjectCatalog3.setId((int) 'a');
        java.lang.String str25 = aObjectCatalog3.toString();
        aObjectCatalog3.setName("hi!:-1:-1:-1");
        io.github.agentsoz.jill.struct.AObject aObject29 = aObjectCatalog3.find("hi!:-1");
        io.github.agentsoz.jill.struct.AObject aObject31 = aObjectCatalog3.get((int) (short) 0);
        java.lang.String str32 = aObject31.toString();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:97" + "'", str25.equals("hi!:97"));
        org.junit.Assert.assertNull(aObject29);
        org.junit.Assert.assertNotNull(aObject31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!:0" + "'", str32.equals("hi!:0"));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test290");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        int i8 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str13 = aObjectCatalog12.getName();
        int i14 = aObjectCatalog12.getId();
        aObjectCatalog12.setName("hi!");
        aObjectCatalog12.setName("hi!:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str27 = aObjectCatalog26.getName();
        aObjectCatalog22.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog32 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog32.setName("hi!");
        java.lang.String str35 = aObjectCatalog32.getName();
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog32);
        aObjectCatalog12.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        io.github.agentsoz.jill.struct.AObject aObject39 = null;
        aObjectCatalog3.push(aObject39);
        java.lang.String str41 = aObjectCatalog3.toString();
        java.lang.String str42 = aObjectCatalog3.getName();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!:-1" + "'", str41.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test291");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog7.get((-1));
        java.lang.String str10 = aObjectCatalog7.getName();
        aObjectCatalog7.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject14 = aObjectCatalog7.get((int) (byte) 10);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog3.find("hi!");
        io.github.agentsoz.jill.struct.AObject aObject18 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100", 32, 10);
        int i23 = aObjectCatalog22.getId();
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject18, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        aObjectCatalog22.setName("");
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNull(aObject14);
        org.junit.Assert.assertNull(aObject17);
        org.junit.Assert.assertNotNull(aObject18);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test292");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.find("hi!:-1:-1");
        try {
            java.lang.String str12 = aObject11.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(aObject11);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test293");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        aObjectCatalog7.setId((int) (short) -1);
        java.lang.String str12 = aObjectCatalog7.toString();
        int i13 = aObjectCatalog7.getId();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i13 == (-1));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test294");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog11.get((-1));
        java.lang.String str14 = aObjectCatalog11.getName();
        aObjectCatalog11.setId((int) ' ');
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        java.lang.String str18 = aObjectCatalog3.getName();
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog24 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject26 = aObjectCatalog24.get(100);
        java.lang.String str27 = aObjectCatalog24.toString();
        int i28 = aObjectCatalog24.size();
        java.lang.String str29 = aObjectCatalog24.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog33 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog33.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog39 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog39.setName("hi!");
        java.lang.String str42 = aObjectCatalog39.toString();
        aObjectCatalog33.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog39);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog47 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog51 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str52 = aObjectCatalog51.getName();
        aObjectCatalog47.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog51);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog57 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog57.setName("hi!");
        java.lang.String str60 = aObjectCatalog57.getName();
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog47, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog57);
        aObjectCatalog39.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog57);
        aObjectCatalog24.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog39);
        aObjectCatalog24.setId((int) (byte) 10);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog24);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNull(aObject26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + ":-1" + "'", str29.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!:-1" + "'", str42.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!" + "'", str52.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!" + "'", str60.equals("hi!"));
        org.junit.Assert.assertTrue(b61 == true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test295");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str18 = aObjectCatalog17.getName();
        aObjectCatalog13.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog23.setName("hi!");
        java.lang.String str26 = aObjectCatalog23.getName();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.struct.AObject aObject29 = aObjectCatalog13.pop();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog33 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog33.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog39 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject41 = aObjectCatalog39.get((-1));
        java.lang.String str42 = aObjectCatalog39.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog46 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog50 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str51 = aObjectCatalog50.getName();
        aObjectCatalog46.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog50);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog56 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str57 = aObjectCatalog56.getName();
        aObjectCatalog50.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog56);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog62 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog66 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str67 = aObjectCatalog66.getName();
        aObjectCatalog62.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog66);
        io.github.agentsoz.jill.struct.AObject aObject69 = aObjectCatalog62.pop();
        java.lang.String str70 = aObjectCatalog62.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog74 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog78 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str79 = aObjectCatalog78.getName();
        aObjectCatalog74.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog78);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog84 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog84.setName("hi!");
        java.lang.String str87 = aObjectCatalog84.getName();
        boolean b88 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog74, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog84);
        java.lang.String str89 = aObjectCatalog74.getName();
        aObjectCatalog62.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog74);
        boolean b91 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog50, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog62);
        aObjectCatalog39.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog50);
        aObjectCatalog33.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog39);
        aObjectCatalog13.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog39);
        java.lang.String str95 = aObjectCatalog39.getName();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(aObject29);
        org.junit.Assert.assertNull(aObject41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "hi!" + "'", str67.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject69);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "hi!" + "'", str70.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "hi!" + "'", str79.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "hi!" + "'", str87.equals("hi!"));
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "hi!" + "'", str89.equals("hi!"));
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + "hi!" + "'", str95.equals("hi!"));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test296");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100", (int) (short) 1, (int) (byte) 1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        int i9 = aObjectCatalog7.getId();
        aObjectCatalog7.setId((int) (short) 0);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str20 = aObjectCatalog19.getName();
        aObjectCatalog15.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog15.pop();
        aObject22.setId((int) (byte) -1);
        aObjectCatalog7.push(aObject22);
        int i26 = aObjectCatalog7.getId();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        int i28 = aObjectCatalog7.getId();
        java.lang.String str29 = aObjectCatalog7.getName();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject22);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test297");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setName("hi!:0:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog12.setName("hi!");
        int i15 = aObjectCatalog12.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject21 = aObjectCatalog19.find("hi!");
        aObjectCatalog19.setId(0);
        int i24 = aObjectCatalog19.getId();
        aObjectCatalog12.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12);
        int i27 = aObjectCatalog12.size();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(aObject21);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test298");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog9.setName("hi!");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject18 = aObjectCatalog16.get((-1));
        java.lang.String str19 = aObjectCatalog16.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog27 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str28 = aObjectCatalog27.getName();
        aObjectCatalog23.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog27);
        io.github.agentsoz.jill.struct.AObject aObject30 = aObjectCatalog23.pop();
        aObjectCatalog16.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        java.lang.String str32 = aObjectCatalog16.toString();
        int i33 = aObjectCatalog16.getId();
        int i34 = aObjectCatalog16.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog38 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog38.setName("hi!");
        int i41 = aObjectCatalog38.size();
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog38);
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog38);
        aObjectCatalog38.setName("hi!:0");
        try {
            io.github.agentsoz.jill.struct.AObject aObject46 = aObjectCatalog38.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject30);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!:-1" + "'", str32.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i33 == (-1));
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(b42 == true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test299");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setName("");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog18.get((-1));
        java.lang.String str21 = aObjectCatalog18.getName();
        aObjectCatalog18.setId((int) ' ');
        aObjectCatalog18.setId((int) '4');
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog18.find(":-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog31.get((-1));
        java.lang.String str34 = aObjectCatalog31.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog38 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog42 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str43 = aObjectCatalog42.getName();
        aObjectCatalog38.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog42);
        io.github.agentsoz.jill.struct.AObject aObject45 = aObjectCatalog38.pop();
        aObjectCatalog31.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog38);
        java.lang.String str47 = aObjectCatalog31.toString();
        aObjectCatalog18.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        aObjectCatalog31.setName("hi!:0");
        int i52 = aObjectCatalog31.getId();
        java.lang.String str53 = aObjectCatalog31.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog57 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject59 = aObjectCatalog57.get((-1));
        java.lang.String str60 = aObjectCatalog57.getName();
        aObjectCatalog57.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject64 = aObjectCatalog57.get((int) (byte) 10);
        aObjectCatalog57.setName("");
        aObjectCatalog57.setId((int) '4');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog72 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str73 = aObjectCatalog72.getName();
        int i74 = aObjectCatalog72.getId();
        aObjectCatalog72.setId((int) (short) 0);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog80 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog84 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str85 = aObjectCatalog84.getName();
        aObjectCatalog80.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog84);
        io.github.agentsoz.jill.struct.AObject aObject87 = aObjectCatalog80.pop();
        aObject87.setId((int) (byte) -1);
        aObjectCatalog72.push(aObject87);
        aObjectCatalog57.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog72);
        java.lang.String str92 = aObjectCatalog57.toString();
        boolean b93 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog57);
        java.lang.String str94 = aObjectCatalog57.getName();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNull(aObject27);
        org.junit.Assert.assertNull(aObject33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject45);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!:-1" + "'", str47.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!:0:0" + "'", str53.equals("hi!:0:0"));
        org.junit.Assert.assertNull(aObject59);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!" + "'", str60.equals("hi!"));
        org.junit.Assert.assertNull(aObject64);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "hi!" + "'", str73.equals("hi!"));
        org.junit.Assert.assertTrue(i74 == (-1));
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "hi!" + "'", str85.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject87);
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + ":52" + "'", str92.equals(":52"));
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "" + "'", str94.equals(""));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test300");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog9.setName("hi!");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i13 = aObjectCatalog9.getId();
        aObjectCatalog9.setId((int) (short) 0);
        aObjectCatalog9.setName("");
        aObjectCatalog9.setId(97);
        java.lang.String str20 = aObjectCatalog9.getName();
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test301");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str22 = aObjectCatalog21.getName();
        aObjectCatalog17.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog21);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog27 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog27.setName("hi!");
        java.lang.String str30 = aObjectCatalog27.getName();
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog27);
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog27);
        io.github.agentsoz.jill.struct.AObject aObject34 = aObjectCatalog9.get((-1));
        io.github.agentsoz.jill.struct.AObject aObject35 = aObjectCatalog9.pop();
        io.github.agentsoz.jill.struct.AObject aObject37 = aObjectCatalog9.get((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(aObject34);
        org.junit.Assert.assertNotNull(aObject35);
        org.junit.Assert.assertNull(aObject37);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test302");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setId((int) (short) 0);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str16 = aObjectCatalog15.getName();
        aObjectCatalog11.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        io.github.agentsoz.jill.struct.AObject aObject18 = aObjectCatalog11.pop();
        aObject18.setId((int) (byte) -1);
        aObjectCatalog3.push(aObject18);
        aObject18.setName("hi!");
        java.lang.String str24 = aObject18.getName();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject18);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test303");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        int i8 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str13 = aObjectCatalog12.getName();
        int i14 = aObjectCatalog12.getId();
        aObjectCatalog12.setName("hi!");
        aObjectCatalog12.setName("hi!:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str27 = aObjectCatalog26.getName();
        aObjectCatalog22.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog32 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog32.setName("hi!");
        java.lang.String str35 = aObjectCatalog32.getName();
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog32);
        aObjectCatalog12.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        io.github.agentsoz.jill.struct.AObject aObject39 = null;
        aObjectCatalog3.push(aObject39);
        try {
            io.github.agentsoz.jill.struct.AObject aObject41 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test304");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.toString();
        int i7 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog3.get((int) (short) 10);
        try {
            aObject9.setId((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(aObject9);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test305");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        int i15 = aObjectCatalog3.size();
        java.lang.String str16 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject18 = aObjectCatalog3.find("hi!:0:0:97");
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog3.find("hi!:0:0");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!:-1" + "'", str16.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject18);
        org.junit.Assert.assertNull(aObject20);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test306");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog(":-1:-1", (int) ' ', (int) (short) 1);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test307");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        aObjectCatalog3.setName("hi!:-1");
        aObjectCatalog3.setId((int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog3.find("hi!:100");
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.get(0);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog15.get(100);
        java.lang.String str18 = aObjectCatalog15.toString();
        try {
            boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject11, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertNull(aObject11);
        org.junit.Assert.assertNull(aObject17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test308");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (byte) 1, (int) (byte) 1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog7.get((-1));
        java.lang.String str10 = aObjectCatalog7.getName();
        aObjectCatalog7.setId((int) ' ');
        aObjectCatalog7.setId((int) '4');
        io.github.agentsoz.jill.struct.AObject aObject16 = aObjectCatalog7.find(":-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog20.get((-1));
        java.lang.String str23 = aObjectCatalog20.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog27 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str32 = aObjectCatalog31.getName();
        aObjectCatalog27.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        io.github.agentsoz.jill.struct.AObject aObject34 = aObjectCatalog27.pop();
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog27);
        java.lang.String str36 = aObjectCatalog20.toString();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        java.lang.String str38 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        java.lang.String str40 = aObjectCatalog7.getName();
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNull(aObject16);
        org.junit.Assert.assertNull(aObject22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject34);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!:-1" + "'", str36.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test309");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0:97", (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test310");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.find("hi!:-1:1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog10.pop();
        aObjectCatalog10.setId((int) '4');
        aObjectCatalog10.setId((-1));
        int i22 = aObjectCatalog10.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog30 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str31 = aObjectCatalog30.getName();
        aObjectCatalog26.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog30);
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog30);
        aObjectCatalog10.setName("hi!:0:0");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        aObjectCatalog3.setName("hi!:-1:-1:-1");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(aObject6);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue(b33 == true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test311");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog11.get((-1));
        java.lang.String str14 = aObjectCatalog11.getName();
        aObjectCatalog11.setId((int) ' ');
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        java.lang.String str18 = aObjectCatalog11.getName();
        java.lang.String str19 = aObjectCatalog11.getName();
        try {
            io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog11.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test312");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", (int) (byte) 1, (int) (short) 100);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog7.get((int) (byte) 100);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog13.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog19.setName("hi!");
        aObjectCatalog13.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        aObjectCatalog3.setId((int) (short) 1);
        try {
            io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test313");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog10.pop();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        java.lang.String str19 = aObjectCatalog3.toString();
        int i20 = aObjectCatalog3.getId();
        int i21 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject23 = aObjectCatalog3.get((int) (byte) 0);
        int i24 = aObjectCatalog3.size();
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertNotNull(aObject23);
        org.junit.Assert.assertTrue(i24 == 1);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test314");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog9.get((-1));
        java.lang.String str12 = aObjectCatalog9.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str21 = aObjectCatalog20.getName();
        aObjectCatalog16.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str27 = aObjectCatalog26.getName();
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog32 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog36 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str37 = aObjectCatalog36.getName();
        aObjectCatalog32.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog36);
        io.github.agentsoz.jill.struct.AObject aObject39 = aObjectCatalog32.pop();
        java.lang.String str40 = aObjectCatalog32.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog44 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog48 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str49 = aObjectCatalog48.getName();
        aObjectCatalog44.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog48);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog54 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog54.setName("hi!");
        java.lang.String str57 = aObjectCatalog54.getName();
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog44, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog54);
        java.lang.String str59 = aObjectCatalog44.getName();
        aObjectCatalog32.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog44);
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog32);
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.struct.AObject aObject65 = aObjectCatalog3.find("hi!:-1:1");
        org.junit.Assert.assertNull(aObject11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNull(aObject65);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test315");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        int i4 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog8 = new io.github.agentsoz.jill.util.AObjectCatalog(":-1", (int) 'a', (-1));
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog8);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1:-1", (int) (byte) 1, 1);
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.struct.AObject aObject16 = aObjectCatalog3.get((int) (short) 0);
        java.lang.String str17 = aObject16.getName();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(aObject16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test316");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0", (int) 'a', 1);
        try {
            io.github.agentsoz.jill.struct.AObject aObject4 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test317");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.find("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setName("hi!:-1");
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.find(":-1:-1");
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject10);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test318");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (byte) 1, (int) (byte) 1);
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog9.get((-1));
        java.lang.String str12 = aObjectCatalog9.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str21 = aObjectCatalog20.getName();
        aObjectCatalog16.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        io.github.agentsoz.jill.struct.AObject aObject23 = aObjectCatalog16.pop();
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        java.lang.String str25 = aObjectCatalog9.toString();
        int i26 = aObjectCatalog9.getId();
        aObjectCatalog9.setId((int) (byte) -1);
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.struct.AObject aObject31 = aObjectCatalog9.find("hi!:0:0:97");
        org.junit.Assert.assertNull(aObject11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject23);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:-1" + "'", str25.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(aObject31);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test319");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        int i10 = aObjectCatalog3.size();
        aObjectCatalog3.setId((int) '4');
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test320");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog7.get((-1));
        java.lang.String str10 = aObjectCatalog7.getName();
        aObjectCatalog7.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject14 = aObjectCatalog7.get((int) (byte) 10);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog3.find("hi!");
        io.github.agentsoz.jill.struct.AObject aObject18 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100", 32, 10);
        int i23 = aObjectCatalog22.getId();
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject18, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        java.lang.String str25 = aObjectCatalog22.getName();
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNull(aObject14);
        org.junit.Assert.assertNull(aObject17);
        org.junit.Assert.assertNotNull(aObject18);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:100" + "'", str25.equals("hi!:100"));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test321");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog3.find("hi!:0:-1");
        try {
            java.lang.String str10 = aObject9.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(aObject9);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test322");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.struct.AObject aObject15 = aObjectCatalog9.find("");
        int i16 = aObjectCatalog9.getId();
        io.github.agentsoz.jill.struct.AObject aObject18 = aObjectCatalog9.get((int) '#');
        int i19 = aObjectCatalog9.getId();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNull(aObject18);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test323");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setName("");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog18.get((-1));
        java.lang.String str21 = aObjectCatalog18.getName();
        aObjectCatalog18.setId((int) ' ');
        aObjectCatalog18.setId((int) '4');
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog18.find(":-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog31.get((-1));
        java.lang.String str34 = aObjectCatalog31.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog38 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog42 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str43 = aObjectCatalog42.getName();
        aObjectCatalog38.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog42);
        io.github.agentsoz.jill.struct.AObject aObject45 = aObjectCatalog38.pop();
        aObjectCatalog31.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog38);
        java.lang.String str47 = aObjectCatalog31.toString();
        aObjectCatalog18.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        aObjectCatalog31.setName("hi!:0");
        int i52 = aObjectCatalog31.getId();
        java.lang.String str53 = aObjectCatalog31.toString();
        int i54 = aObjectCatalog31.size();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNull(aObject27);
        org.junit.Assert.assertNull(aObject33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject45);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!:-1" + "'", str47.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!:0:0" + "'", str53.equals("hi!:0:0"));
        org.junit.Assert.assertTrue(i54 == 1);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test324");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:10", 10, (int) ' ');
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test325");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i14 = aObjectCatalog9.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str23 = aObjectCatalog22.getName();
        aObjectCatalog18.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog28 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog28.setName("hi!");
        java.lang.String str31 = aObjectCatalog28.getName();
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog18, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog28);
        java.lang.String str33 = aObjectCatalog18.getName();
        aObjectCatalog18.setName("");
        int i36 = aObjectCatalog18.getId();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        aObjectCatalog9.setName("hi!:97");
        java.lang.String str40 = aObjectCatalog9.getName();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!:97" + "'", str40.equals("hi!:97"));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test326");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (short) 10);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog7.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog13.setName("hi!");
        java.lang.String str16 = aObjectCatalog13.toString();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.struct.AObject aObject19 = aObjectCatalog13.find("");
        int i20 = aObjectCatalog13.getId();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        aObjectCatalog13.setId((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!:-1" + "'", str16.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test327");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog19.setName("hi!");
        java.lang.String str22 = aObjectCatalog19.getName();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        java.lang.String str24 = aObjectCatalog9.toString();
        io.github.agentsoz.jill.struct.AObject aObject25 = aObjectCatalog9.pop();
        aObjectCatalog3.push(aObject25);
        io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog3.find("hi!:0:-1");
        io.github.agentsoz.jill.struct.AObject aObject30 = aObjectCatalog3.get((int) (short) 1);
        int i31 = aObjectCatalog3.size();
        java.lang.String str32 = aObjectCatalog3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!:-1" + "'", str24.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject25);
        org.junit.Assert.assertNull(aObject28);
        org.junit.Assert.assertNull(aObject30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!:-1" + "'", str32.equals("hi!:-1"));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test328");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.get((int) (byte) 10);
        aObjectCatalog3.setName("");
        aObjectCatalog3.setId((int) '4');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str19 = aObjectCatalog18.getName();
        int i20 = aObjectCatalog18.getId();
        aObjectCatalog18.setId((int) (short) 0);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog30 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str31 = aObjectCatalog30.getName();
        aObjectCatalog26.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog30);
        io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog26.pop();
        aObject33.setId((int) (byte) -1);
        aObjectCatalog18.push(aObject33);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog41 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject43 = aObjectCatalog41.get((-1));
        java.lang.String str44 = aObjectCatalog41.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog48 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog52 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str53 = aObjectCatalog52.getName();
        aObjectCatalog48.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog52);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog58 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str59 = aObjectCatalog58.getName();
        aObjectCatalog52.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog58);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog64 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog68 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str69 = aObjectCatalog68.getName();
        aObjectCatalog64.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog68);
        io.github.agentsoz.jill.struct.AObject aObject71 = aObjectCatalog64.pop();
        java.lang.String str72 = aObjectCatalog64.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog76 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog80 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str81 = aObjectCatalog80.getName();
        aObjectCatalog76.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog80);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog86 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog86.setName("hi!");
        java.lang.String str89 = aObjectCatalog86.getName();
        boolean b90 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog76, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog86);
        java.lang.String str91 = aObjectCatalog76.getName();
        aObjectCatalog64.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog76);
        boolean b93 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog52, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog64);
        aObjectCatalog41.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog52);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject10);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject33);
        org.junit.Assert.assertNull(aObject43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "hi!" + "'", str69.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject71);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!" + "'", str72.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "hi!" + "'", str81.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "hi!" + "'", str89.equals("hi!"));
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "hi!" + "'", str91.equals("hi!"));
        org.junit.Assert.assertTrue(b93 == true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test329");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("", 100, 0);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test330");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100:1", (int) (short) 0, 1);
        try {
            io.github.agentsoz.jill.struct.AObject aObject4 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test331");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.struct.AObject aObject12 = aObjectCatalog3.find("hi!:0");
        aObjectCatalog3.setId((int) (byte) 1);
        try {
            io.github.agentsoz.jill.struct.AObject aObject15 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject12);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test332");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog19.setName("hi!");
        java.lang.String str22 = aObjectCatalog19.getName();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        java.lang.String str24 = aObjectCatalog9.toString();
        io.github.agentsoz.jill.struct.AObject aObject25 = aObjectCatalog9.pop();
        aObjectCatalog3.push(aObject25);
        io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog3.find("hi!:0:-1");
        io.github.agentsoz.jill.struct.AObject aObject30 = aObjectCatalog3.get((int) (short) 1);
        io.github.agentsoz.jill.struct.AObject aObject32 = aObjectCatalog3.find(":52");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog36 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject38 = aObjectCatalog36.get(100);
        java.lang.String str39 = aObjectCatalog36.toString();
        aObjectCatalog36.setId(1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog45 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog49 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str50 = aObjectCatalog49.getName();
        aObjectCatalog45.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog49);
        java.lang.String str52 = aObjectCatalog45.toString();
        io.github.agentsoz.jill.struct.AObject aObject53 = aObjectCatalog45.pop();
        aObjectCatalog36.push(aObject53);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog58 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject60 = aObjectCatalog58.get((-1));
        java.lang.String str61 = aObjectCatalog58.getName();
        aObjectCatalog58.setName("hi!:0");
        java.lang.String str64 = aObjectCatalog58.toString();
        java.lang.String str65 = aObjectCatalog58.toString();
        aObjectCatalog36.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog58);
        try {
            boolean b67 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject32, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!:-1" + "'", str24.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject25);
        org.junit.Assert.assertNull(aObject28);
        org.junit.Assert.assertNull(aObject30);
        org.junit.Assert.assertNull(aObject32);
        org.junit.Assert.assertNull(aObject38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + ":-1" + "'", str39.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!:-1" + "'", str52.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject53);
        org.junit.Assert.assertNull(aObject60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!:0:-1" + "'", str64.equals("hi!:0:-1"));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "hi!:0:-1" + "'", str65.equals("hi!:0:-1"));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test333");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100:1", 0, 10);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test334");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog3.setId((int) '#');
        io.github.agentsoz.jill.struct.AObject aObject6 = null;
        try {
            boolean b7 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, aObject6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test335");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("hi!:-1:-1");
        try {
            java.lang.String str9 = aObject8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject8);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test336");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("hi!:-1:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str17 = aObjectCatalog16.getName();
        aObjectCatalog12.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog22.setName("hi!");
        java.lang.String str25 = aObjectCatalog22.getName();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        java.lang.String str27 = aObjectCatalog12.toString();
        java.lang.String str28 = aObjectCatalog12.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12);
        aObjectCatalog3.setName("");
        java.lang.String str32 = aObjectCatalog3.toString();
        int i33 = aObjectCatalog3.size();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1" + "'", str27.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!:-1" + "'", str28.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + ":-1" + "'", str32.equals(":-1"));
        org.junit.Assert.assertTrue(i33 == 1);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test337");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 0, (int) (short) 0);
        java.lang.String str4 = aObjectCatalog3.getName();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:0" + "'", str4.equals("hi!:0"));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test338");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) ' ');
        aObjectCatalog3.setId((int) '4');
        io.github.agentsoz.jill.struct.AObject aObject12 = aObjectCatalog3.find(":-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject18 = aObjectCatalog16.get((-1));
        java.lang.String str19 = aObjectCatalog16.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog27 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str28 = aObjectCatalog27.getName();
        aObjectCatalog23.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog27);
        io.github.agentsoz.jill.struct.AObject aObject30 = aObjectCatalog23.pop();
        aObjectCatalog16.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        java.lang.String str32 = aObjectCatalog16.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        java.lang.String str34 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject36 = aObjectCatalog3.find("hi!:-1:-1:-1");
        aObjectCatalog3.setId(1);
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject12);
        org.junit.Assert.assertNull(aObject18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject30);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!:-1" + "'", str32.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertNull(aObject36);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test339");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        int i15 = aObjectCatalog3.size();
        java.lang.String str16 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        int i21 = aObjectCatalog20.getId();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog26.setId((int) '#');
        java.lang.String str29 = aObjectCatalog26.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        java.lang.String str31 = aObjectCatalog26.getName();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!:-1" + "'", str16.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!:0:35" + "'", str29.equals("hi!:0:35"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!:0" + "'", str31.equals("hi!:0"));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test340");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        int i4 = aObjectCatalog3.getId();
        java.lang.String str5 = aObjectCatalog3.toString();
        aObjectCatalog3.setName("hi!:-1:1");
        aObjectCatalog3.setId((int) (short) 0);
        aObjectCatalog3.setId(0);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test341");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        java.lang.String str10 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog15.get((-1));
        java.lang.String str18 = aObjectCatalog15.getName();
        aObjectCatalog15.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog15.get((int) (byte) 10);
        aObjectCatalog15.setName("");
        io.github.agentsoz.jill.struct.AObject aObject26 = aObjectCatalog15.find("");
        io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog15.find("");
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog33 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog37 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str38 = aObjectCatalog37.getName();
        aObjectCatalog33.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog37);
        io.github.agentsoz.jill.struct.AObject aObject40 = aObjectCatalog33.pop();
        aObjectCatalog33.setId((int) '4');
        aObjectCatalog33.setId((-1));
        int i45 = aObjectCatalog33.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog49 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog53 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str54 = aObjectCatalog53.getName();
        aObjectCatalog49.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog53);
        boolean b56 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog33, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog53);
        aObjectCatalog15.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog33);
        io.github.agentsoz.jill.struct.AObject aObject59 = aObjectCatalog15.get((int) '#');
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject11);
        org.junit.Assert.assertNull(aObject17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNull(aObject22);
        org.junit.Assert.assertNull(aObject26);
        org.junit.Assert.assertNull(aObject28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject40);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!" + "'", str54.equals("hi!"));
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNull(aObject59);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test342");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", (int) '4', (int) (short) 1);
        aObjectCatalog3.setName("hi!:-1:-1");
        int i6 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.get((int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str17 = aObjectCatalog16.getName();
        aObjectCatalog12.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        io.github.agentsoz.jill.struct.AObject aObject19 = aObjectCatalog12.pop();
        java.lang.String str20 = aObjectCatalog12.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog24 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog28 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str29 = aObjectCatalog28.getName();
        aObjectCatalog24.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog28);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog34 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog34.setName("hi!");
        java.lang.String str37 = aObjectCatalog34.getName();
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog24, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog34);
        java.lang.String str39 = aObjectCatalog24.getName();
        aObjectCatalog12.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog24);
        io.github.agentsoz.jill.struct.AObject aObject42 = aObjectCatalog12.get(100);
        java.lang.String str43 = aObjectCatalog12.getName();
        io.github.agentsoz.jill.struct.AObject aObject45 = aObjectCatalog12.find("hi!:-1:1");
        aObjectCatalog3.push(aObject45);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        org.junit.Assert.assertNull(aObject42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertNull(aObject45);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test343");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog(":0", (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test344");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        java.lang.String str10 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.pop();
        int i12 = aObject11.getId();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject11);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test345");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", (int) (byte) 1, (int) (short) 100);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog7.get((int) (byte) 100);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog13.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog19.setName("hi!");
        aObjectCatalog13.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        aObjectCatalog3.setId((int) (short) 1);
        io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog3.find(":-1");
        java.lang.String str29 = aObjectCatalog3.toString();
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(aObject28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!:0:1" + "'", str29.equals("hi!:0:1"));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test346");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog19.setName("hi!");
        java.lang.String str22 = aObjectCatalog19.getName();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        java.lang.String str24 = aObjectCatalog9.toString();
        io.github.agentsoz.jill.struct.AObject aObject25 = aObjectCatalog9.pop();
        aObjectCatalog3.push(aObject25);
        io.github.agentsoz.jill.struct.AObject aObject27 = null;
        try {
            boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject25, aObject27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!:-1" + "'", str24.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject25);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test347");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setName("");
        aObjectCatalog3.setName("");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test348");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog9.setName("hi!");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i13 = aObjectCatalog9.getId();
        int i14 = aObjectCatalog9.size();
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test349");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog3.find(":-1");
        java.lang.String str10 = aObjectCatalog3.getName();
        aObjectCatalog3.setName(":52");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test350");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog3.setId((int) '#');
        java.lang.String str6 = aObjectCatalog3.toString();
        int i7 = aObjectCatalog3.getId();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:0:35" + "'", str6.equals("hi!:0:35"));
        org.junit.Assert.assertTrue(i7 == 35);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test351");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0", (int) ' ', (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.find("");
        io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.find(":52");
        try {
            io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertNull(aObject7);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test352");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        java.lang.String str10 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog15.get((-1));
        java.lang.String str18 = aObjectCatalog15.getName();
        aObjectCatalog15.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog15.get((int) (byte) 10);
        aObjectCatalog15.setName("");
        io.github.agentsoz.jill.struct.AObject aObject26 = aObjectCatalog15.find("");
        io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog15.find("");
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        io.github.agentsoz.jill.struct.AObject aObject31 = aObjectCatalog15.find("");
        try {
            aObject31.setId((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject11);
        org.junit.Assert.assertNull(aObject17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNull(aObject22);
        org.junit.Assert.assertNull(aObject26);
        org.junit.Assert.assertNull(aObject28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(aObject31);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test353");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        int i15 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str24 = aObjectCatalog23.getName();
        aObjectCatalog19.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog30 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog34 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str35 = aObjectCatalog34.getName();
        aObjectCatalog30.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog34);
        java.lang.String str37 = aObjectCatalog30.toString();
        io.github.agentsoz.jill.struct.AObject aObject38 = aObjectCatalog30.pop();
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, aObject38);
        java.lang.String str40 = aObjectCatalog3.getName();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!:-1" + "'", str37.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test354");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("");
        try {
            aObject8.setName(":-1:-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject8);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test355");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        aObjectCatalog9.setName("hi!:-1:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog19.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog25 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog25.setName("hi!");
        aObjectCatalog19.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog25);
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        io.github.agentsoz.jill.struct.AObject aObject30 = aObjectCatalog19.pop();
        aObject30.setId((-1));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(aObject30);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test356");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0:-1", 97, (int) (short) -1);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test357");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        int i16 = aObjectCatalog13.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog20.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog26.setName("hi!");
        java.lang.String str29 = aObjectCatalog26.toString();
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        int i31 = aObjectCatalog26.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog35 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog39 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str40 = aObjectCatalog39.getName();
        aObjectCatalog35.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog39);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog45 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog45.setName("hi!");
        java.lang.String str48 = aObjectCatalog45.getName();
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog35, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog45);
        java.lang.String str50 = aObjectCatalog35.getName();
        aObjectCatalog35.setName("");
        int i53 = aObjectCatalog35.getId();
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog26, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog35);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog58 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog58.setName("hi!");
        aObjectCatalog58.setName("hi!");
        aObjectCatalog58.setId((-1));
        aObjectCatalog26.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog58);
        int i66 = aObjectCatalog58.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog70 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        int i71 = aObjectCatalog70.getId();
        java.lang.String str72 = aObjectCatalog70.toString();
        boolean b73 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog58, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog70);
        aObjectCatalog13.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog70);
        io.github.agentsoz.jill.struct.AObject aObject76 = aObjectCatalog70.get((int) '#');
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!:-1" + "'", str29.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
        org.junit.Assert.assertTrue(i53 == (-1));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertTrue(i71 == (-1));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!:-1" + "'", str72.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNull(aObject76);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test358");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0:-1", (int) (byte) 0, (int) (byte) -1);
        try {
            io.github.agentsoz.jill.struct.AObject aObject4 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test359");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i14 = aObjectCatalog9.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str23 = aObjectCatalog22.getName();
        aObjectCatalog18.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog28 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog28.setName("hi!");
        java.lang.String str31 = aObjectCatalog28.getName();
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog18, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog28);
        java.lang.String str33 = aObjectCatalog18.getName();
        aObjectCatalog18.setName("");
        int i36 = aObjectCatalog18.getId();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog41 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog41.setName("hi!");
        aObjectCatalog41.setName("hi!");
        aObjectCatalog41.setId((-1));
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        int i49 = aObjectCatalog41.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog53 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        int i54 = aObjectCatalog53.getId();
        java.lang.String str55 = aObjectCatalog53.toString();
        boolean b56 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog41, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog53);
        java.lang.String str57 = aObjectCatalog53.getName();
        try {
            io.github.agentsoz.jill.struct.AObject aObject58 = aObjectCatalog53.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue(i54 == (-1));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!:-1" + "'", str55.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test360");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog(":-1", 100, (int) ' ');
        int i4 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog8 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0", (int) ' ', (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog8.find("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog8);
        aObjectCatalog8.setName("hi!:0:35");
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(aObject10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test361");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        int i4 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog8 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog8.get(100);
        java.lang.String str11 = aObjectCatalog8.toString();
        int i12 = aObjectCatalog8.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog8);
        io.github.agentsoz.jill.struct.AObject aObject15 = aObjectCatalog8.get((-1));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(aObject10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1" + "'", str11.equals(":-1"));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(aObject15);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test362");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.find("hi!:-1:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog10.pop();
        aObjectCatalog10.setId((int) '4');
        aObjectCatalog10.setId((-1));
        int i22 = aObjectCatalog10.size();
        aObjectCatalog10.setId((int) (short) 10);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        int i26 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog3.get((int) (short) 10);
        try {
            java.lang.String str29 = aObject28.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(aObject6);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertNull(aObject28);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test363");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0", (int) ' ', (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.find("");
        io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.find("");
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertNull(aObject7);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test364");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i14 = aObjectCatalog9.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str23 = aObjectCatalog22.getName();
        aObjectCatalog18.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog28 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog28.setName("hi!");
        java.lang.String str31 = aObjectCatalog28.getName();
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog18, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog28);
        java.lang.String str33 = aObjectCatalog18.getName();
        aObjectCatalog18.setName("");
        int i36 = aObjectCatalog18.getId();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog41 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog41.setName("hi!");
        aObjectCatalog41.setName("hi!");
        aObjectCatalog41.setId((-1));
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        io.github.agentsoz.jill.struct.AObject aObject50 = aObjectCatalog41.get((int) '#');
        try {
            java.lang.String str51 = aObject50.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(aObject50);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test365");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        int i6 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("hi!:-1");
        int i9 = aObjectCatalog3.size();
        aObjectCatalog3.setId((int) (byte) 10);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog15.get((-1));
        java.lang.String str18 = aObjectCatalog15.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str27 = aObjectCatalog26.getName();
        aObjectCatalog22.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        io.github.agentsoz.jill.struct.AObject aObject29 = aObjectCatalog22.pop();
        aObjectCatalog15.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        java.lang.String str31 = aObjectCatalog15.toString();
        int i32 = aObjectCatalog15.getId();
        int i33 = aObjectCatalog15.getId();
        io.github.agentsoz.jill.struct.AObject aObject35 = aObjectCatalog15.get((int) (byte) 0);
        aObjectCatalog15.setName("hi!:100");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        int i39 = aObjectCatalog15.size();
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(aObject17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject29);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!:-1" + "'", str31.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertTrue(i33 == (-1));
        org.junit.Assert.assertNotNull(aObject35);
        org.junit.Assert.assertTrue(i39 == 1);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test366");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog13.setName("hi!");
        java.lang.String str16 = aObjectCatalog13.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog21);
        aObjectCatalog21.setId((int) (short) 1);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b22 == true);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test367");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog9.setName("hi!");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i13 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("", 0, (int) (byte) 100);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        aObjectCatalog17.setId((int) ' ');
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test368");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:1", (int) (byte) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test369");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog11.get((-1));
        java.lang.String str14 = aObjectCatalog11.getName();
        aObjectCatalog11.setId((int) ' ');
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        java.lang.String str18 = aObjectCatalog3.getName();
        java.lang.String str19 = aObjectCatalog3.toString();
        java.lang.String str20 = aObjectCatalog3.toString();
        try {
            io.github.agentsoz.jill.struct.AObject aObject21 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!:-1" + "'", str20.equals("hi!:-1"));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test370");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        int i6 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("hi!:-1");
        int i9 = aObjectCatalog3.size();
        aObjectCatalog3.setId((int) (byte) 10);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog15.get((-1));
        java.lang.String str18 = aObjectCatalog15.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str27 = aObjectCatalog26.getName();
        aObjectCatalog22.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        io.github.agentsoz.jill.struct.AObject aObject29 = aObjectCatalog22.pop();
        aObjectCatalog15.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        java.lang.String str31 = aObjectCatalog15.toString();
        int i32 = aObjectCatalog15.getId();
        int i33 = aObjectCatalog15.getId();
        io.github.agentsoz.jill.struct.AObject aObject35 = aObjectCatalog15.get((int) (byte) 0);
        aObjectCatalog15.setName("hi!:100");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        java.lang.String str39 = aObjectCatalog15.getName();
        java.lang.String str40 = aObjectCatalog15.getName();
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(aObject17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject29);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!:-1" + "'", str31.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertTrue(i33 == (-1));
        org.junit.Assert.assertNotNull(aObject35);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!:100" + "'", str39.equals("hi!:100"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!:100" + "'", str40.equals("hi!:100"));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test371");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!:0");
        java.lang.String str10 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog14.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog20.setName("hi!");
        java.lang.String str23 = aObjectCatalog20.toString();
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        int i25 = aObjectCatalog20.size();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        aObjectCatalog20.setId((int) (short) 100);
        int i29 = aObjectCatalog20.getId();
        int i30 = aObjectCatalog20.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog34 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        aObjectCatalog34.setName("hi!:-1");
        aObjectCatalog34.setId((int) ' ');
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog34);
        io.github.agentsoz.jill.struct.AObject aObject41 = aObjectCatalog20.find("hi!:32");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:0" + "'", str10.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:-1" + "'", str23.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i29 == 100);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNull(aObject41);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test372");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test373");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog(":-1", 0, (int) (byte) 100);
        aObjectCatalog3.setId((int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.get((int) (short) 100);
        org.junit.Assert.assertNull(aObject7);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test374");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (byte) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str12 = aObjectCatalog11.getName();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog17.setName("hi!");
        java.lang.String str20 = aObjectCatalog17.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        try {
            io.github.agentsoz.jill.struct.AObject aObject23 = aObjectCatalog17.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test375");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i14 = aObjectCatalog9.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str23 = aObjectCatalog22.getName();
        aObjectCatalog18.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog28 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog28.setName("hi!");
        java.lang.String str31 = aObjectCatalog28.getName();
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog18, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog28);
        java.lang.String str33 = aObjectCatalog18.getName();
        aObjectCatalog18.setName("");
        int i36 = aObjectCatalog18.getId();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog41 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject43 = aObjectCatalog41.get((-1));
        java.lang.String str44 = aObjectCatalog41.getName();
        aObjectCatalog41.setId((int) ' ');
        aObjectCatalog41.setId((int) '4');
        io.github.agentsoz.jill.struct.AObject aObject50 = aObjectCatalog41.find(":-1");
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        java.lang.String str52 = aObjectCatalog9.toString();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(aObject43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        org.junit.Assert.assertNull(aObject50);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!:0" + "'", str52.equals("hi!:0"));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test376");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, (int) (byte) 10);
        java.lang.String str4 = aObjectCatalog3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:0:-1" + "'", str4.equals("hi!:0:-1"));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test377");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog7.get((-1));
        java.lang.String str10 = aObjectCatalog7.getName();
        aObjectCatalog7.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject14 = aObjectCatalog7.get((int) (byte) 10);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog3.find("hi!");
        io.github.agentsoz.jill.struct.AObject aObject18 = aObjectCatalog3.pop();
        aObject18.setId((int) (byte) 100);
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNull(aObject14);
        org.junit.Assert.assertNull(aObject17);
        org.junit.Assert.assertNotNull(aObject18);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test378");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!:0");
        java.lang.String str10 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog14.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog20.setName("hi!");
        java.lang.String str23 = aObjectCatalog20.toString();
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        int i25 = aObjectCatalog20.size();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        java.lang.String str27 = aObjectCatalog20.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) '4', 0);
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        int i33 = aObjectCatalog31.size();
        aObjectCatalog31.setName("hi!:-1:1:-1");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:0" + "'", str10.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:-1" + "'", str23.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:0" + "'", str27.equals("hi!:0"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test379");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.find("hi!:-1:-1:-1");
        try {
            java.lang.String str12 = aObject11.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(aObject11);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test380");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId(1);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test381");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog7.get((-1));
        java.lang.String str10 = aObjectCatalog7.getName();
        aObjectCatalog7.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject14 = aObjectCatalog7.get((int) (byte) 10);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        aObjectCatalog7.setName("hi!:0:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (byte) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog25 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog29 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str30 = aObjectCatalog29.getName();
        aObjectCatalog25.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog29);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog35 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog35.setName("hi!");
        java.lang.String str38 = aObjectCatalog35.getName();
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog25, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog35);
        aObjectCatalog21.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog35);
        aObjectCatalog21.setId((int) 'a');
        int i43 = aObjectCatalog21.size();
        io.github.agentsoz.jill.struct.AObject aObject45 = aObjectCatalog21.get(0);
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog21);
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNull(aObject14);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i43 == 1);
        org.junit.Assert.assertNotNull(aObject45);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test382");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        java.lang.String str15 = aObjectCatalog3.toString();
        int i16 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject18 = aObjectCatalog3.get(100);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!:-1" + "'", str15.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertNull(aObject18);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test383");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i14 = aObjectCatalog9.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str23 = aObjectCatalog22.getName();
        aObjectCatalog18.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog28 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog28.setName("hi!");
        java.lang.String str31 = aObjectCatalog28.getName();
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog18, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog28);
        java.lang.String str33 = aObjectCatalog18.getName();
        aObjectCatalog18.setName("");
        int i36 = aObjectCatalog18.getId();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog41 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog41.setName("hi!");
        aObjectCatalog41.setName("hi!");
        aObjectCatalog41.setId((-1));
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        int i49 = aObjectCatalog41.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog53 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        int i54 = aObjectCatalog53.getId();
        java.lang.String str55 = aObjectCatalog53.toString();
        boolean b56 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog41, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog53);
        io.github.agentsoz.jill.struct.AObject aObject58 = aObjectCatalog41.get(97);
        try {
            aObject58.setName("hi!:-1:-1:-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue(i54 == (-1));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!:-1" + "'", str55.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNull(aObject58);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test384");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0", (int) ' ', (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.find("");
        io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.find("hi!:-1:1:-1");
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertNull(aObject7);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test385");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", (int) (byte) 0, (int) (byte) -1);
        java.lang.String str4 = aObjectCatalog3.getName();
        aObjectCatalog3.setName("hi!:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str11 = aObjectCatalog10.getName();
        int i12 = aObjectCatalog10.getId();
        aObjectCatalog10.setId((int) (short) 0);
        java.lang.String str15 = aObjectCatalog10.toString();
        aObjectCatalog10.setId((int) (short) 0);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        int i19 = aObjectCatalog3.size();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:0" + "'", str4.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!:0" + "'", str15.equals("hi!:0"));
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test386");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str24 = aObjectCatalog23.getName();
        aObjectCatalog19.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        io.github.agentsoz.jill.struct.AObject aObject26 = aObjectCatalog19.pop();
        java.lang.String str27 = aObjectCatalog19.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog35 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str36 = aObjectCatalog35.getName();
        aObjectCatalog31.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog35);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog41 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog41.setName("hi!");
        java.lang.String str44 = aObjectCatalog41.getName();
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        java.lang.String str46 = aObjectCatalog31.getName();
        aObjectCatalog19.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        io.github.agentsoz.jill.struct.AObject aObject50 = aObjectCatalog7.get((int) (byte) -1);
        aObjectCatalog7.setName("hi!:100");
        aObjectCatalog7.setId(0);
        io.github.agentsoz.jill.struct.AObject aObject56 = aObjectCatalog7.get(0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(aObject50);
        org.junit.Assert.assertNotNull(aObject56);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test387");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) (byte) 100);
        aObjectCatalog3.setName("hi!:0:-1");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test388");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100", (int) (short) 1, (int) '4');
        java.lang.String str4 = aObjectCatalog3.getName();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:100" + "'", str4.equals("hi!:100"));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test389");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) ' ');
        aObjectCatalog3.setId((int) '4');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog14.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog24 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str25 = aObjectCatalog24.getName();
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog24);
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog20.pop();
        aObjectCatalog20.setId((int) '4');
        aObjectCatalog20.setId((-1));
        int i32 = aObjectCatalog20.size();
        java.lang.String str33 = aObjectCatalog20.toString();
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        int i36 = aObjectCatalog14.getId();
        java.lang.String str37 = aObjectCatalog14.getName();
        io.github.agentsoz.jill.struct.AObject aObject39 = aObjectCatalog14.find("hi!:32");
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject27);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!:-1" + "'", str33.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        org.junit.Assert.assertNull(aObject39);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test390");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.find("hi!:-1:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog10.pop();
        aObjectCatalog10.setId((int) '4');
        aObjectCatalog10.setId((-1));
        int i22 = aObjectCatalog10.size();
        aObjectCatalog10.setId((int) (short) 10);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        aObjectCatalog10.setId((int) (byte) 100);
        io.github.agentsoz.jill.struct.AObject aObject29 = aObjectCatalog10.find("");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog33 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject35 = aObjectCatalog33.get((-1));
        java.lang.String str36 = aObjectCatalog33.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog40 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog44 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str45 = aObjectCatalog44.getName();
        aObjectCatalog40.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog44);
        io.github.agentsoz.jill.struct.AObject aObject47 = aObjectCatalog40.pop();
        aObjectCatalog33.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog40);
        java.lang.String str49 = aObjectCatalog33.toString();
        io.github.agentsoz.jill.struct.AObject aObject50 = aObjectCatalog33.pop();
        aObjectCatalog33.setName("hi!:-1:-1");
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog33);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(aObject6);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNull(aObject29);
        org.junit.Assert.assertNull(aObject35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject47);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!:-1" + "'", str49.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject50);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test391");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        int i15 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str24 = aObjectCatalog23.getName();
        aObjectCatalog19.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog3.find(":-1:-1");
        java.lang.String str29 = aObjectCatalog3.toString();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(aObject28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!:-1" + "'", str29.equals("hi!:-1"));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test392");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setName("");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog18.get((-1));
        java.lang.String str21 = aObjectCatalog18.getName();
        aObjectCatalog18.setId((int) ' ');
        aObjectCatalog18.setId((int) '4');
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog18.find(":-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog31.get((-1));
        java.lang.String str34 = aObjectCatalog31.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog38 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog42 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str43 = aObjectCatalog42.getName();
        aObjectCatalog38.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog42);
        io.github.agentsoz.jill.struct.AObject aObject45 = aObjectCatalog38.pop();
        aObjectCatalog31.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog38);
        java.lang.String str47 = aObjectCatalog31.toString();
        aObjectCatalog18.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        java.lang.String str50 = aObjectCatalog31.getName();
        aObjectCatalog31.setId((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNull(aObject27);
        org.junit.Assert.assertNull(aObject33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject45);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!:-1" + "'", str47.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test393");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog7.get((-1));
        java.lang.String str10 = aObjectCatalog7.getName();
        aObjectCatalog7.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject14 = aObjectCatalog7.get((int) (byte) 10);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        aObjectCatalog7.setName("hi!:0:0");
        java.lang.String str18 = aObjectCatalog7.getName();
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNull(aObject14);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!:0:0" + "'", str18.equals("hi!:0:0"));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test394");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        int i9 = aObjectCatalog7.getId();
        aObjectCatalog7.setName("hi!");
        aObjectCatalog7.setName("hi!:0");
        java.lang.String str14 = aObjectCatalog7.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog18.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog24 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog24.setName("hi!");
        java.lang.String str27 = aObjectCatalog24.toString();
        aObjectCatalog18.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog24);
        int i29 = aObjectCatalog24.size();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog24);
        java.lang.String str31 = aObjectCatalog24.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog35 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) '4', 0);
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog24, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog35);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog35);
        aObjectCatalog3.setId(0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:0" + "'", str14.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1" + "'", str27.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!:0" + "'", str31.equals("hi!:0"));
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test395");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((int) (byte) 100);
        io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.find(":-1:-1");
        try {
            aObject7.setId((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertNull(aObject7);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test396");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (short) 10, (int) '#');
        try {
            io.github.agentsoz.jill.struct.AObject aObject4 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test397");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((int) (byte) 100);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog15.setName("hi!");
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog23.setId((int) '#');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog29 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog33 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str34 = aObjectCatalog33.getName();
        aObjectCatalog29.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog33);
        io.github.agentsoz.jill.struct.AObject aObject36 = aObjectCatalog29.pop();
        aObjectCatalog29.setId((int) '4');
        aObjectCatalog29.setId((-1));
        java.lang.String str41 = aObjectCatalog29.toString();
        aObjectCatalog29.setId(100);
        aObjectCatalog23.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog29);
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog15, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        try {
            io.github.agentsoz.jill.struct.AObject aObject46 = aObjectCatalog23.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject36);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!:-1" + "'", str41.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test398");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i14 = aObjectCatalog9.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str23 = aObjectCatalog22.getName();
        aObjectCatalog18.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog28 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog28.setName("hi!");
        java.lang.String str31 = aObjectCatalog28.getName();
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog18, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog28);
        java.lang.String str33 = aObjectCatalog18.getName();
        aObjectCatalog18.setName("");
        int i36 = aObjectCatalog18.getId();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog41 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog41.setName("hi!");
        aObjectCatalog41.setName("hi!");
        aObjectCatalog41.setId((-1));
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        java.lang.String str49 = aObjectCatalog41.getName();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test399");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) ' ');
        aObjectCatalog3.setId((int) '4');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog14.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog24 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str25 = aObjectCatalog24.getName();
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog24);
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog20.pop();
        aObjectCatalog20.setId((int) '4');
        aObjectCatalog20.setId((-1));
        int i32 = aObjectCatalog20.size();
        java.lang.String str33 = aObjectCatalog20.toString();
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        int i36 = aObjectCatalog14.getId();
        java.lang.String str37 = aObjectCatalog14.getName();
        try {
            io.github.agentsoz.jill.struct.AObject aObject38 = aObjectCatalog14.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject27);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!:-1" + "'", str33.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test400");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog9.setName("hi!");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i13 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("", 0, (int) (byte) 100);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog17.get(100);
        try {
            io.github.agentsoz.jill.struct.AObject aObject21 = aObjectCatalog17.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNull(aObject20);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test401");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog13.setName("hi!");
        java.lang.String str16 = aObjectCatalog13.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        java.lang.String str18 = aObjectCatalog3.toString();
        java.lang.String str19 = aObjectCatalog3.toString();
        java.lang.String str20 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject21 = aObjectCatalog3.pop();
        java.lang.String str22 = aObject21.toString();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!:-1" + "'", str18.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!:0" + "'", str22.equals("hi!:0"));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test402");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog19.setName("hi!");
        java.lang.String str22 = aObjectCatalog19.getName();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        java.lang.String str24 = aObjectCatalog9.toString();
        io.github.agentsoz.jill.struct.AObject aObject25 = aObjectCatalog9.pop();
        aObjectCatalog3.push(aObject25);
        io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog3.get(0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!:-1" + "'", str24.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject25);
        org.junit.Assert.assertNull(aObject28);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test403");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1:1", (int) ' ', (int) '#');
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test404");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("", (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test405");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (byte) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str12 = aObjectCatalog11.getName();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog17.setName("hi!");
        java.lang.String str20 = aObjectCatalog17.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        aObjectCatalog3.setId((int) 'a');
        int i25 = aObjectCatalog3.size();
        int i26 = aObjectCatalog3.getId();
        java.lang.String str27 = aObjectCatalog3.toString();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertTrue(i26 == 97);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:97" + "'", str27.equals("hi!:97"));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test406");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog11.get((-1));
        java.lang.String str14 = aObjectCatalog11.getName();
        aObjectCatalog11.setId((int) ' ');
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        java.lang.String str18 = aObjectCatalog3.getName();
        java.lang.String str19 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog23.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog29 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog33 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str34 = aObjectCatalog33.getName();
        aObjectCatalog29.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog33);
        io.github.agentsoz.jill.struct.AObject aObject36 = aObjectCatalog29.pop();
        io.github.agentsoz.jill.struct.AObject aObject38 = aObjectCatalog29.find("hi!:0");
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog23, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog29);
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog29);
        java.lang.String str41 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog45 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        int i46 = aObjectCatalog45.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog50 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject52 = aObjectCatalog50.get(100);
        java.lang.String str53 = aObjectCatalog50.toString();
        int i54 = aObjectCatalog50.getId();
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog45, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog50);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog45);
        java.lang.String str57 = aObjectCatalog45.toString();
        aObjectCatalog45.setName("hi!:-1:1:-1");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject36);
        org.junit.Assert.assertNull(aObject38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNull(aObject52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + ":-1" + "'", str53.equals(":-1"));
        org.junit.Assert.assertTrue(i54 == (-1));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + ":0" + "'", str57.equals(":0"));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test407");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        int i16 = aObjectCatalog13.size();
        io.github.agentsoz.jill.struct.AObject aObject18 = aObjectCatalog13.find("hi!:-1:-1");
        try {
            java.lang.String str19 = aObject18.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNull(aObject18);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test408");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i14 = aObjectCatalog9.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str23 = aObjectCatalog22.getName();
        aObjectCatalog18.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog28 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog28.setName("hi!");
        java.lang.String str31 = aObjectCatalog28.getName();
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog18, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog28);
        java.lang.String str33 = aObjectCatalog18.getName();
        aObjectCatalog18.setName("");
        int i36 = aObjectCatalog18.getId();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog41 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject43 = aObjectCatalog41.get((-1));
        java.lang.String str44 = aObjectCatalog41.getName();
        aObjectCatalog41.setId((int) ' ');
        aObjectCatalog41.setId((int) '4');
        io.github.agentsoz.jill.struct.AObject aObject50 = aObjectCatalog41.find(":-1");
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        try {
            io.github.agentsoz.jill.struct.AObject aObject52 = aObjectCatalog9.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(aObject43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        org.junit.Assert.assertNull(aObject50);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test409");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 100, (int) (short) 10);
        java.lang.String str4 = aObjectCatalog3.toString();
        int i5 = aObjectCatalog3.size();
        io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.find("");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:0:-1" + "'", str4.equals("hi!:0:-1"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(aObject7);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test410");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (short) 10);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.find("hi!:-1:-1:-1");
        int i6 = aObjectCatalog3.size();
        aObjectCatalog3.setId(10);
        try {
            io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test411");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        int i15 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str24 = aObjectCatalog23.getName();
        aObjectCatalog19.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        int i27 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog31.setName("hi!");
        java.lang.String str34 = aObjectCatalog31.toString();
        io.github.agentsoz.jill.struct.AObject aObject36 = aObjectCatalog31.find("hi!:-1:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog40 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog44 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str45 = aObjectCatalog44.getName();
        aObjectCatalog40.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog44);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog50 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog50.setName("hi!");
        java.lang.String str53 = aObjectCatalog50.getName();
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog40, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog50);
        java.lang.String str55 = aObjectCatalog40.toString();
        java.lang.String str56 = aObjectCatalog40.toString();
        aObjectCatalog31.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog40);
        io.github.agentsoz.jill.struct.AObject aObject59 = aObjectCatalog40.find("hi!:-1");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog40);
        int i61 = aObjectCatalog40.size();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!:-1" + "'", str34.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject36);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!:-1" + "'", str55.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!:-1" + "'", str56.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject59);
        org.junit.Assert.assertTrue(i61 == 1);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test412");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        int i4 = aObjectCatalog3.size();
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.find(":-1:-1");
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(aObject6);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test413");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i14 = aObjectCatalog9.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str23 = aObjectCatalog22.getName();
        aObjectCatalog18.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog28 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog28.setName("hi!");
        java.lang.String str31 = aObjectCatalog28.getName();
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog18, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog28);
        java.lang.String str33 = aObjectCatalog18.getName();
        aObjectCatalog18.setName("");
        int i36 = aObjectCatalog18.getId();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog41 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog41.setName("hi!");
        aObjectCatalog41.setName("hi!");
        aObjectCatalog41.setId((-1));
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        io.github.agentsoz.jill.struct.AObject aObject50 = aObjectCatalog41.get((int) '#');
        try {
            io.github.agentsoz.jill.struct.AObject aObject51 = aObjectCatalog41.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(aObject50);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test414");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) ' ');
        aObjectCatalog3.setId((int) '4');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog14.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog24 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str25 = aObjectCatalog24.getName();
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog24);
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog20.pop();
        aObjectCatalog20.setId((int) '4');
        aObjectCatalog20.setId((-1));
        int i32 = aObjectCatalog20.size();
        java.lang.String str33 = aObjectCatalog20.toString();
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        int i36 = aObjectCatalog14.getId();
        java.lang.String str37 = aObjectCatalog14.getName();
        aObjectCatalog14.setName("hi!:100");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog43 = new io.github.agentsoz.jill.util.AObjectCatalog(":-1", (int) (short) 0, 10);
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog43);
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject27);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!:-1" + "'", str33.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test415");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i14 = aObjectCatalog9.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str23 = aObjectCatalog22.getName();
        aObjectCatalog18.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog28 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog28.setName("hi!");
        java.lang.String str31 = aObjectCatalog28.getName();
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog18, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog28);
        java.lang.String str33 = aObjectCatalog18.getName();
        aObjectCatalog18.setName("");
        int i36 = aObjectCatalog18.getId();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        io.github.agentsoz.jill.struct.AObject aObject39 = aObjectCatalog18.find("hi!:0:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog43 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str44 = aObjectCatalog43.getName();
        int i45 = aObjectCatalog43.getId();
        io.github.agentsoz.jill.struct.AObject aObject47 = aObjectCatalog43.find("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject49 = aObjectCatalog43.get((int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject51 = aObjectCatalog43.find("hi!:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog55 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (short) 10, (int) (byte) -1);
        aObjectCatalog43.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog55);
        io.github.agentsoz.jill.struct.AObject aObject58 = aObjectCatalog43.find("hi!:-1:1");
        try {
            boolean b59 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog18, aObject58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(aObject39);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        org.junit.Assert.assertTrue(i45 == (-1));
        org.junit.Assert.assertNull(aObject47);
        org.junit.Assert.assertNull(aObject49);
        org.junit.Assert.assertNull(aObject51);
        org.junit.Assert.assertNull(aObject58);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test416");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.struct.AObject aObject16 = aObjectCatalog9.pop();
        aObjectCatalog9.setId((int) '4');
        aObjectCatalog9.setId((-1));
        int i21 = aObjectCatalog9.size();
        java.lang.String str22 = aObjectCatalog9.toString();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog27 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str32 = aObjectCatalog31.getName();
        aObjectCatalog27.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        io.github.agentsoz.jill.struct.AObject aObject34 = aObjectCatalog27.pop();
        aObject34.setId((int) (byte) -1);
        aObjectCatalog3.push(aObject34);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject16);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!:-1" + "'", str22.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject34);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test417");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        int i4 = aObjectCatalog3.getId();
        int i5 = aObjectCatalog3.getId();
        try {
            io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(i5 == (-1));
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test418");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog3.setName("hi!");
        int i6 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject12 = aObjectCatalog10.find("hi!");
        aObjectCatalog10.setId(0);
        int i15 = aObjectCatalog10.getId();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        int i17 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject19 = aObjectCatalog3.get((int) (short) 0);
        try {
            int i20 = aObject19.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(aObject12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNull(aObject19);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test419");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get(100);
        java.lang.String str6 = aObjectCatalog3.toString();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str12 = aObjectCatalog11.getName();
        int i13 = aObjectCatalog11.getId();
        aObjectCatalog11.setName("hi!");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog24 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str25 = aObjectCatalog24.getName();
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog24);
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog20.pop();
        io.github.agentsoz.jill.struct.AObject aObject29 = aObjectCatalog20.find("hi!:0");
        java.lang.String str30 = aObjectCatalog20.toString();
        aObjectCatalog11.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog20.find(":0");
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject27);
        org.junit.Assert.assertNull(aObject29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1" + "'", str30.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject33);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test420");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog10.pop();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        java.lang.String str19 = aObjectCatalog3.toString();
        int i20 = aObjectCatalog3.getId();
        int i21 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog25 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog25.setName("hi!");
        int i28 = aObjectCatalog25.size();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog25);
        java.lang.String str30 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog34 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject36 = aObjectCatalog34.find("hi!");
        io.github.agentsoz.jill.struct.AObject aObject38 = aObjectCatalog34.get((int) (short) 0);
        int i39 = aObjectCatalog34.size();
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog34);
        java.lang.String str41 = aObjectCatalog3.toString();
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertNull(aObject36);
        org.junit.Assert.assertNull(aObject38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!:-1" + "'", str41.equals("hi!:-1"));
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test421");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("hi!:-1:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str17 = aObjectCatalog16.getName();
        aObjectCatalog12.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog22.setName("hi!");
        java.lang.String str25 = aObjectCatalog22.getName();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        java.lang.String str27 = aObjectCatalog12.toString();
        java.lang.String str28 = aObjectCatalog12.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12);
        io.github.agentsoz.jill.struct.AObject aObject31 = aObjectCatalog12.get((int) (byte) 1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog35 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog39 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str40 = aObjectCatalog39.getName();
        aObjectCatalog35.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog39);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog45 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str46 = aObjectCatalog45.getName();
        aObjectCatalog39.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog45);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog51 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog55 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str56 = aObjectCatalog55.getName();
        aObjectCatalog51.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog55);
        io.github.agentsoz.jill.struct.AObject aObject58 = aObjectCatalog51.pop();
        java.lang.String str59 = aObjectCatalog51.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog63 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog67 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str68 = aObjectCatalog67.getName();
        aObjectCatalog63.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog67);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog73 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog73.setName("hi!");
        java.lang.String str76 = aObjectCatalog73.getName();
        boolean b77 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog63, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog73);
        java.lang.String str78 = aObjectCatalog63.getName();
        aObjectCatalog51.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog63);
        boolean b80 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog39, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog51);
        boolean b81 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog39);
        io.github.agentsoz.jill.struct.AObject aObject83 = aObjectCatalog39.get(100);
        io.github.agentsoz.jill.struct.AObject aObject85 = aObjectCatalog39.get(1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1" + "'", str27.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!:-1" + "'", str28.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject31);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!" + "'", str56.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject58);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "hi!" + "'", str68.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "hi!" + "'", str76.equals("hi!"));
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "hi!" + "'", str78.equals("hi!"));
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertNull(aObject83);
        org.junit.Assert.assertNull(aObject85);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test422");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.get((int) (byte) 10);
        aObjectCatalog3.setName("");
        aObjectCatalog3.setId((int) '4');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str19 = aObjectCatalog18.getName();
        int i20 = aObjectCatalog18.getId();
        aObjectCatalog18.setId((int) (short) 0);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog30 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str31 = aObjectCatalog30.getName();
        aObjectCatalog26.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog30);
        io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog26.pop();
        aObject33.setId((int) (byte) -1);
        aObjectCatalog18.push(aObject33);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        java.lang.String str38 = aObjectCatalog3.toString();
        try {
            io.github.agentsoz.jill.struct.AObject aObject39 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject10);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject33);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + ":52" + "'", str38.equals(":52"));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test423");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog10.pop();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog22.setName("hi!");
        int i25 = aObjectCatalog22.getId();
        aObjectCatalog22.setId(100);
        int i28 = aObjectCatalog22.size();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        java.lang.String str30 = aObjectCatalog10.getName();
        java.lang.String str31 = aObjectCatalog10.getName();
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test424");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setName("");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog18.get((-1));
        java.lang.String str21 = aObjectCatalog18.getName();
        aObjectCatalog18.setId((int) ' ');
        aObjectCatalog18.setId((int) '4');
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog18.find(":-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog31.get((-1));
        java.lang.String str34 = aObjectCatalog31.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog38 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog42 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str43 = aObjectCatalog42.getName();
        aObjectCatalog38.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog42);
        io.github.agentsoz.jill.struct.AObject aObject45 = aObjectCatalog38.pop();
        aObjectCatalog31.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog38);
        java.lang.String str47 = aObjectCatalog31.toString();
        aObjectCatalog18.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        int i50 = aObjectCatalog31.getId();
        java.lang.String str51 = aObjectCatalog31.getName();
        io.github.agentsoz.jill.struct.AObject aObject52 = aObjectCatalog31.pop();
        java.lang.String str53 = aObjectCatalog31.toString();
        int i54 = aObjectCatalog31.size();
        io.github.agentsoz.jill.struct.AObject aObject56 = aObjectCatalog31.find("hi!:-1");
        io.github.agentsoz.jill.struct.AObject aObject58 = aObjectCatalog31.find("hi!:-1:-1");
        io.github.agentsoz.jill.struct.AObject aObject60 = aObjectCatalog31.get((int) '4');
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNull(aObject27);
        org.junit.Assert.assertNull(aObject33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject45);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!:-1" + "'", str47.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!:0" + "'", str53.equals("hi!:0"));
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNull(aObject56);
        org.junit.Assert.assertNull(aObject58);
        org.junit.Assert.assertNull(aObject60);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test425");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog3.setName("hi!");
        int i6 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject12 = aObjectCatalog10.find("hi!");
        aObjectCatalog10.setId(0);
        int i15 = aObjectCatalog10.getId();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        int i17 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject19 = aObjectCatalog3.get((int) (short) 0);
        io.github.agentsoz.jill.struct.AObject aObject21 = aObjectCatalog3.find("hi!:-1:-1:-1");
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(aObject12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNull(aObject19);
        org.junit.Assert.assertNull(aObject21);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test426");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.find("hi!:-1:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog10.pop();
        aObjectCatalog10.setId((int) '4');
        aObjectCatalog10.setId((-1));
        int i22 = aObjectCatalog10.size();
        aObjectCatalog10.setId((int) (short) 10);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog10.get((int) (byte) 10);
        try {
            io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog10.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(aObject6);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNull(aObject27);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test427");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        java.lang.String str16 = aObjectCatalog7.getName();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test428");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) ' ');
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setName("hi!:-1:-1");
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test429");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog(":-1", 100, (int) ' ');
        int i4 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog8 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str13 = aObjectCatalog12.getName();
        aObjectCatalog8.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog18.get((-1));
        java.lang.String str21 = aObjectCatalog18.getName();
        aObjectCatalog18.setId((int) ' ');
        aObjectCatalog18.setId((int) '4');
        int i26 = aObjectCatalog18.getId();
        int i27 = aObjectCatalog18.getId();
        aObjectCatalog8.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog32 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog32.setName("hi!");
        java.lang.String str35 = aObjectCatalog32.getName();
        aObjectCatalog32.setName("hi!:0:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog41 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog41.setName("hi!");
        int i44 = aObjectCatalog41.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog48 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject50 = aObjectCatalog48.find("hi!");
        aObjectCatalog48.setId(0);
        int i53 = aObjectCatalog48.getId();
        aObjectCatalog41.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog48);
        aObjectCatalog32.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        boolean b56 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog18, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        try {
            io.github.agentsoz.jill.struct.AObject aObject58 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNull(aObject20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue(i26 == 52);
        org.junit.Assert.assertTrue(i27 == 52);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNull(aObject50);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(b56 == true);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test430");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setName("");
        io.github.agentsoz.jill.struct.AObject aObject16 = aObjectCatalog3.find("hi!");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject16);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test431");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog3.find(":-1");
        java.lang.String str10 = aObjectCatalog3.getName();
        try {
            io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test432");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog9.setName("hi!");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i13 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("", 0, (int) (byte) 100);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog17.get(100);
        aObjectCatalog17.setName("hi!:-1:-1:-1");
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNull(aObject20);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test433");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog13.setName("hi!");
        java.lang.String str16 = aObjectCatalog13.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        java.lang.String str18 = aObjectCatalog3.toString();
        java.lang.String str19 = aObjectCatalog3.toString();
        aObjectCatalog3.setName("hi!:100:0");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!:-1" + "'", str18.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test434");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (byte) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str12 = aObjectCatalog11.getName();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog17.setName("hi!");
        java.lang.String str20 = aObjectCatalog17.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        aObjectCatalog3.setId((int) 'a');
        int i25 = aObjectCatalog3.size();
        java.lang.String str26 = aObjectCatalog3.toString();
        int i27 = aObjectCatalog3.size();
        io.github.agentsoz.jill.struct.AObject aObject29 = aObjectCatalog3.find("");
        java.lang.String str30 = aObjectCatalog3.toString();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:97" + "'", str26.equals("hi!:97"));
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertNull(aObject29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:97" + "'", str30.equals("hi!:97"));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test435");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setName("");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog18.get((-1));
        java.lang.String str21 = aObjectCatalog18.getName();
        aObjectCatalog18.setId((int) ' ');
        aObjectCatalog18.setId((int) '4');
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog18.find(":-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog31.get((-1));
        java.lang.String str34 = aObjectCatalog31.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog38 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog42 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str43 = aObjectCatalog42.getName();
        aObjectCatalog38.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog42);
        io.github.agentsoz.jill.struct.AObject aObject45 = aObjectCatalog38.pop();
        aObjectCatalog31.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog38);
        java.lang.String str47 = aObjectCatalog31.toString();
        aObjectCatalog18.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        int i50 = aObjectCatalog31.getId();
        aObjectCatalog31.setId(100);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog56 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog60 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str61 = aObjectCatalog60.getName();
        aObjectCatalog56.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog60);
        io.github.agentsoz.jill.struct.AObject aObject63 = aObjectCatalog56.pop();
        aObjectCatalog56.setId((int) '4');
        aObjectCatalog56.setId((-1));
        int i68 = aObjectCatalog56.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog72 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog76 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str77 = aObjectCatalog76.getName();
        aObjectCatalog72.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog76);
        boolean b79 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog56, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog76);
        aObjectCatalog31.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog56);
        aObjectCatalog31.setId((-1));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNull(aObject27);
        org.junit.Assert.assertNull(aObject33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject45);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!:-1" + "'", str47.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject63);
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "hi!" + "'", str77.equals("hi!"));
        org.junit.Assert.assertTrue(b79 == true);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test436");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog11.setName("hi!");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", 10, 10);
        java.lang.String str19 = aObjectCatalog18.getName();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test437");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:10", 1, (int) '4');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((int) (byte) -1);
        try {
            int i6 = aObject5.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject5);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test438");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!:0");
        java.lang.String str10 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog14.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog20.setName("hi!");
        java.lang.String str23 = aObjectCatalog20.toString();
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        int i25 = aObjectCatalog20.size();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        java.lang.String str27 = aObjectCatalog20.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) '4', 0);
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        io.github.agentsoz.jill.struct.AObject aObject34 = aObjectCatalog31.find(":52");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:0" + "'", str10.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:-1" + "'", str23.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:0" + "'", str27.equals("hi!:0"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(aObject34);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test439");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (byte) 0, 0);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog7.get((int) (byte) 100);
        java.lang.String str10 = aObjectCatalog7.toString();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str20 = aObjectCatalog19.getName();
        aObjectCatalog15.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog15.pop();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog26.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog32 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog32.setName("hi!");
        aObjectCatalog26.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog32);
        int i36 = aObjectCatalog32.getId();
        aObjectCatalog15.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog32);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog41 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog32.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        aObjectCatalog41.setId((-1));
        try {
            io.github.agentsoz.jill.struct.AObject aObject46 = aObjectCatalog41.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1:-1" + "'", str10.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject22);
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test440");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        int i15 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str24 = aObjectCatalog23.getName();
        aObjectCatalog19.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog30 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject32 = aObjectCatalog30.get((-1));
        java.lang.String str33 = aObjectCatalog30.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog37 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog41 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str42 = aObjectCatalog41.getName();
        aObjectCatalog37.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog47 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str48 = aObjectCatalog47.getName();
        aObjectCatalog41.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog47);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog53 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog57 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str58 = aObjectCatalog57.getName();
        aObjectCatalog53.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog57);
        io.github.agentsoz.jill.struct.AObject aObject60 = aObjectCatalog53.pop();
        java.lang.String str61 = aObjectCatalog53.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog65 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog69 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str70 = aObjectCatalog69.getName();
        aObjectCatalog65.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog69);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog75 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog75.setName("hi!");
        java.lang.String str78 = aObjectCatalog75.getName();
        boolean b79 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog65, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog75);
        java.lang.String str80 = aObjectCatalog65.getName();
        aObjectCatalog53.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog65);
        boolean b82 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog41, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog53);
        aObjectCatalog30.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        int i84 = aObjectCatalog41.getId();
        boolean b85 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(aObject32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!" + "'", str58.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "hi!" + "'", str70.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "hi!" + "'", str78.equals("hi!"));
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "hi!" + "'", str80.equals("hi!"));
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(i84 == 0);
        org.junit.Assert.assertTrue(b85 == true);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test441");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog3.setName("hi!");
        int i6 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject12 = aObjectCatalog10.find("hi!");
        aObjectCatalog10.setId(0);
        int i15 = aObjectCatalog10.getId();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        io.github.agentsoz.jill.struct.AObject aObject18 = aObjectCatalog10.get(97);
        int i19 = aObjectCatalog10.getId();
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(aObject12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(aObject18);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test442");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.find("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog3.get((int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.find("hi!:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (short) 10, (int) (byte) -1);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str21 = aObjectCatalog20.getName();
        int i22 = aObjectCatalog20.getId();
        aObjectCatalog20.setId((int) (short) 0);
        java.lang.String str25 = aObjectCatalog20.toString();
        aObjectCatalog20.setId((int) (short) 0);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        io.github.agentsoz.jill.struct.AObject aObject30 = aObjectCatalog3.find("hi!:0:35");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(aObject7);
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertNull(aObject11);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:0" + "'", str25.equals("hi!:0"));
        org.junit.Assert.assertNull(aObject30);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test443");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        aObjectCatalog3.setName("hi!:-1");
        aObjectCatalog3.setId((int) (short) 1);
        java.lang.String str8 = aObjectCatalog3.getName();
        int i9 = aObjectCatalog3.size();
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.get(1);
        try {
            aObject11.setName("hi!:0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:-1" + "'", str8.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(aObject11);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test444");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1:-1:-1:-1", (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test445");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog9.setName("hi!");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0", (int) 'a', (int) 'a');
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        java.lang.String str18 = aObjectCatalog3.getName();
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test446");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!:0");
        java.lang.String str10 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog14.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog20.setName("hi!");
        java.lang.String str23 = aObjectCatalog20.toString();
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        int i25 = aObjectCatalog20.size();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        java.lang.String str27 = aObjectCatalog20.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) '4', 0);
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        io.github.agentsoz.jill.struct.AObject aObject34 = aObjectCatalog20.get(32);
        int i35 = aObjectCatalog20.getId();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:0" + "'", str10.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:-1" + "'", str23.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:0" + "'", str27.equals("hi!:0"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(aObject34);
        org.junit.Assert.assertTrue(i35 == 0);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test447");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog(":52", (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test448");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog9.setName("hi!");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog16.setId((int) '#');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str27 = aObjectCatalog26.getName();
        aObjectCatalog22.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        io.github.agentsoz.jill.struct.AObject aObject29 = aObjectCatalog22.pop();
        aObjectCatalog22.setId((int) '4');
        aObjectCatalog22.setId((-1));
        java.lang.String str34 = aObjectCatalog22.toString();
        aObjectCatalog22.setId(100);
        aObjectCatalog16.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        int i38 = aObjectCatalog22.size();
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        try {
            io.github.agentsoz.jill.struct.AObject aObject40 = aObjectCatalog9.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject29);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!:-1" + "'", str34.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test449");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.find("hi!:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog11.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog17.setName("hi!");
        java.lang.String str20 = aObjectCatalog17.toString();
        aObjectCatalog11.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        int i22 = aObjectCatalog17.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog30 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str31 = aObjectCatalog30.getName();
        aObjectCatalog26.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog30);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog36 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog36.setName("hi!");
        java.lang.String str39 = aObjectCatalog36.getName();
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog26, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog36);
        java.lang.String str41 = aObjectCatalog26.getName();
        aObjectCatalog26.setName("");
        int i44 = aObjectCatalog26.getId();
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog49 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog49.setName("hi!");
        aObjectCatalog49.setName("hi!");
        aObjectCatalog49.setId((-1));
        aObjectCatalog17.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog49);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        java.lang.String str58 = aObjectCatalog17.toString();
        io.github.agentsoz.jill.struct.AObject aObject59 = aObjectCatalog17.pop();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog63 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog67 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str68 = aObjectCatalog67.getName();
        aObjectCatalog63.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog67);
        io.github.agentsoz.jill.struct.AObject aObject70 = aObjectCatalog63.pop();
        aObjectCatalog63.setId((int) '4');
        aObjectCatalog63.setName("");
        aObjectCatalog63.setId((int) (byte) 1);
        aObjectCatalog17.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog63);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(aObject7);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!:-1" + "'", str20.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        org.junit.Assert.assertTrue(i44 == (-1));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!:0" + "'", str58.equals("hi!:0"));
        org.junit.Assert.assertNotNull(aObject59);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "hi!" + "'", str68.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject70);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test450");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i14 = aObjectCatalog9.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str23 = aObjectCatalog22.getName();
        aObjectCatalog18.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog28 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog28.setName("hi!");
        java.lang.String str31 = aObjectCatalog28.getName();
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog18, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog28);
        java.lang.String str33 = aObjectCatalog18.getName();
        aObjectCatalog18.setName("");
        int i36 = aObjectCatalog18.getId();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        io.github.agentsoz.jill.struct.AObject aObject39 = aObjectCatalog18.find("hi!:0:-1");
        io.github.agentsoz.jill.struct.AObject aObject41 = aObjectCatalog18.get((int) (short) 1);
        io.github.agentsoz.jill.struct.AObject aObject42 = aObjectCatalog18.pop();
        io.github.agentsoz.jill.struct.AObject aObject44 = aObjectCatalog18.find("hi!:0:0");
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(aObject39);
        org.junit.Assert.assertNull(aObject41);
        org.junit.Assert.assertNotNull(aObject42);
        org.junit.Assert.assertNull(aObject44);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test451");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.find("");
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.get((int) (byte) 0);
        try {
            aObject10.setName("hi!:0:0:0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertNull(aObject10);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test452");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setId((int) (short) 0);
        int i8 = aObjectCatalog3.size();
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.get(32);
        int i11 = aObjectCatalog3.size();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(aObject10);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test453");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:-1", 52, (int) (short) 10);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test454");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog13.setName("hi!");
        java.lang.String str16 = aObjectCatalog13.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog25 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str26 = aObjectCatalog25.getName();
        aObjectCatalog21.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog25);
        aObjectCatalog13.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog25);
        aObjectCatalog13.setId((int) (short) 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test455");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str24 = aObjectCatalog23.getName();
        aObjectCatalog19.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        io.github.agentsoz.jill.struct.AObject aObject26 = aObjectCatalog19.pop();
        java.lang.String str27 = aObjectCatalog19.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog35 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str36 = aObjectCatalog35.getName();
        aObjectCatalog31.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog35);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog41 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog41.setName("hi!");
        java.lang.String str44 = aObjectCatalog41.getName();
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        java.lang.String str46 = aObjectCatalog31.getName();
        aObjectCatalog19.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        java.lang.String str49 = aObjectCatalog7.toString();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!:0" + "'", str49.equals("hi!:0"));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test456");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1:1", 1, (int) (byte) 10);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test457");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        int i8 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str13 = aObjectCatalog12.getName();
        int i14 = aObjectCatalog12.getId();
        aObjectCatalog12.setName("hi!");
        aObjectCatalog12.setName("hi!:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str27 = aObjectCatalog26.getName();
        aObjectCatalog22.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog32 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog32.setName("hi!");
        java.lang.String str35 = aObjectCatalog32.getName();
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog32);
        aObjectCatalog12.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog42 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog42.setName("hi!");
        java.lang.String str45 = aObjectCatalog42.getName();
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog42);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        org.junit.Assert.assertTrue(b46 == true);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test458");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog(":-1", (int) 'a', 0);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.find("hi!:0:0:97");
        io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.get(1);
        try {
            aObject7.setId((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertNull(aObject7);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test459");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!:0");
        java.lang.String str10 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) (short) -1);
        try {
            io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:0" + "'", str10.equals("hi!:0"));
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test460");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        int i4 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog8 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog8.get(100);
        java.lang.String str11 = aObjectCatalog8.toString();
        int i12 = aObjectCatalog8.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog8);
        java.lang.String str14 = aObjectCatalog3.getName();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(aObject10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1" + "'", str11.equals(":-1"));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test461");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        java.lang.String str5 = aObjectCatalog3.toString();
        aObjectCatalog3.setName("hi!");
        int i8 = aObjectCatalog3.getId();
        aObjectCatalog3.setId(0);
        java.lang.String str11 = aObjectCatalog3.toString();
        java.lang.String str12 = aObjectCatalog3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:0" + "'", str11.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:0" + "'", str12.equals("hi!:0"));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test462");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str21 = aObjectCatalog20.getName();
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog30 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str31 = aObjectCatalog30.getName();
        aObjectCatalog26.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog30);
        io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog26.pop();
        java.lang.String str34 = aObjectCatalog26.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog38 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog42 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str43 = aObjectCatalog42.getName();
        aObjectCatalog38.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog42);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog48 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog48.setName("hi!");
        java.lang.String str51 = aObjectCatalog48.getName();
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog38, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog48);
        java.lang.String str53 = aObjectCatalog38.getName();
        aObjectCatalog26.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog38);
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog60 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog60.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog66 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog66.setName("hi!");
        java.lang.String str69 = aObjectCatalog66.toString();
        aObjectCatalog60.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog66);
        int i71 = aObjectCatalog66.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog75 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog79 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str80 = aObjectCatalog79.getName();
        aObjectCatalog75.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog79);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog85 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog85.setName("hi!");
        java.lang.String str88 = aObjectCatalog85.getName();
        boolean b89 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog75, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog85);
        java.lang.String str90 = aObjectCatalog75.getName();
        aObjectCatalog75.setName("");
        int i93 = aObjectCatalog75.getId();
        boolean b94 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog66, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog75);
        java.lang.String str95 = aObjectCatalog75.toString();
        int i96 = aObjectCatalog75.size();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog75);
        java.lang.String str98 = aObjectCatalog3.toString();
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "hi!:-1" + "'", str69.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "hi!" + "'", str80.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str88 + "' != '" + "hi!" + "'", str88.equals("hi!"));
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "hi!" + "'", str90.equals("hi!"));
        org.junit.Assert.assertTrue(i93 == (-1));
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + ":-1" + "'", str95.equals(":-1"));
        org.junit.Assert.assertTrue(i96 == 1);
        org.junit.Assert.assertTrue("'" + str98 + "' != '" + "hi!:-1" + "'", str98.equals("hi!:-1"));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test463");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.struct.AObject aObject16 = aObjectCatalog9.pop();
        io.github.agentsoz.jill.struct.AObject aObject18 = aObjectCatalog9.find("hi!:0");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str24 = aObjectCatalog23.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog28 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog28.setName("hi!");
        io.github.agentsoz.jill.struct.AObject aObject31 = null;
        aObjectCatalog28.push(aObject31);
        int i33 = aObjectCatalog28.size();
        aObjectCatalog23.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog28);
        int i35 = aObjectCatalog28.getId();
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog28);
        try {
            io.github.agentsoz.jill.struct.AObject aObject37 = aObjectCatalog9.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject16);
        org.junit.Assert.assertNull(aObject18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(i35 == 0);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test464");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        int i15 = aObjectCatalog3.size();
        aObjectCatalog3.setId(35);
        io.github.agentsoz.jill.struct.AObject aObject19 = aObjectCatalog3.get((int) '4');
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(aObject19);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test465");
        io.github.agentsoz.jill.struct.AObject aObject0 = null;
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog4 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog8 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str9 = aObjectCatalog8.getName();
        aObjectCatalog4.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog8);
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog4.pop();
        aObjectCatalog4.setId((int) '4');
        aObjectCatalog4.setId((-1));
        int i16 = aObjectCatalog4.size();
        java.lang.String str17 = aObjectCatalog4.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        int i22 = aObjectCatalog21.getId();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog4, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog21);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog27 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog27.setId((int) '#');
        java.lang.String str30 = aObjectCatalog27.toString();
        aObjectCatalog4.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog27);
        try {
            boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject0, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject11);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!:-1" + "'", str17.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:0:35" + "'", str30.equals("hi!:0:35"));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test466");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.find("hi!:1");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(aObject11);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test467");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        int i8 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str13 = aObjectCatalog12.getName();
        int i14 = aObjectCatalog12.getId();
        aObjectCatalog12.setName("hi!");
        aObjectCatalog12.setName("hi!:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str27 = aObjectCatalog26.getName();
        aObjectCatalog22.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog32 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog32.setName("hi!");
        java.lang.String str35 = aObjectCatalog32.getName();
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog32);
        aObjectCatalog12.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        int i39 = aObjectCatalog22.getId();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(i39 == 0);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test468");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog14.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog20.setName("hi!");
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        int i24 = aObjectCatalog20.getId();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        java.lang.String str26 = aObjectCatalog20.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog30 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        int i31 = aObjectCatalog30.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog35 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject37 = aObjectCatalog35.get(100);
        java.lang.String str38 = aObjectCatalog35.toString();
        int i39 = aObjectCatalog35.getId();
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog30, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog35);
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog35);
        java.lang.String str42 = aObjectCatalog35.toString();
        java.lang.String str43 = aObjectCatalog35.toString();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNull(aObject37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + ":-1" + "'", str38.equals(":-1"));
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + ":0" + "'", str42.equals(":0"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + ":0" + "'", str43.equals(":0"));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test469");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog8 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog8.setName("hi!");
        io.github.agentsoz.jill.struct.AObject aObject11 = null;
        aObjectCatalog8.push(aObject11);
        int i13 = aObjectCatalog8.size();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog8);
        int i15 = aObjectCatalog8.getId();
        java.lang.String str16 = aObjectCatalog8.getName();
        int i17 = aObjectCatalog8.size();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test470");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get(100);
        java.lang.String str6 = aObjectCatalog3.toString();
        int i7 = aObjectCatalog3.size();
        java.lang.String str8 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100", (int) (short) 1, (int) (byte) 1);
        java.lang.String str13 = aObjectCatalog12.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100", (int) (short) 1, (int) (byte) 1);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12);
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog3.pop();
        java.lang.String str21 = aObject20.getName();
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!:100:-1" + "'", str13.equals("hi!:100:-1"));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(aObject20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!:100" + "'", str21.equals("hi!:100"));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test471");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        aObjectCatalog9.setName("hi!:-1:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog19.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog25 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog25.setName("hi!");
        aObjectCatalog19.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog25);
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        io.github.agentsoz.jill.struct.AObject aObject30 = aObjectCatalog19.pop();
        io.github.agentsoz.jill.struct.AObject aObject32 = aObjectCatalog19.get((-1));
        try {
            aObject32.setName("hi!:-1:1:-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(aObject30);
        org.junit.Assert.assertNull(aObject32);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test472");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!:0");
        java.lang.String str10 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog14.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog20.setName("hi!");
        java.lang.String str23 = aObjectCatalog20.toString();
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        int i25 = aObjectCatalog20.size();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        aObjectCatalog20.setId((int) (short) 100);
        int i29 = aObjectCatalog20.getId();
        int i30 = aObjectCatalog20.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog34 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        aObjectCatalog34.setName("hi!:-1");
        aObjectCatalog34.setId((int) ' ');
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog34);
        aObjectCatalog20.setId(100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:0" + "'", str10.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:-1" + "'", str23.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i29 == 100);
        org.junit.Assert.assertTrue(i30 == 0);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test473");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!:0");
        int i10 = aObjectCatalog3.getId();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i10 == (-1));
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test474");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        int i4 = aObjectCatalog3.getId();
        aObjectCatalog3.setId((int) 'a');
        org.junit.Assert.assertTrue(i4 == (-1));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test475");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog10.pop();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        java.lang.String str19 = aObjectCatalog3.toString();
        int i20 = aObjectCatalog3.getId();
        int i21 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog25 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog25.setName("hi!");
        int i28 = aObjectCatalog25.size();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog25);
        io.github.agentsoz.jill.struct.AObject aObject30 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog34 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog34.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog40 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog40.setName("hi!");
        java.lang.String str43 = aObjectCatalog40.toString();
        aObjectCatalog34.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog40);
        aObjectCatalog40.setName("hi!:-1:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog50 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog50.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog56 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog56.setName("hi!");
        aObjectCatalog50.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog56);
        boolean b60 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog40, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog50);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog40);
        io.github.agentsoz.jill.struct.AObject aObject63 = aObjectCatalog3.get((int) (short) 1);
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(aObject30);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!:-1" + "'", str43.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(aObject63);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test476");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        int i15 = aObjectCatalog3.size();
        java.lang.String str16 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject18 = aObjectCatalog3.get((int) '#');
        int i19 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject21 = aObjectCatalog3.get((int) (short) 100);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!:-1" + "'", str16.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject18);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertNull(aObject21);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test477");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.struct.AObject aObject12 = aObjectCatalog3.find("hi!:0");
        java.lang.String str13 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str18 = aObjectCatalog17.getName();
        int i19 = aObjectCatalog17.getId();
        aObjectCatalog17.setName("hi!");
        aObjectCatalog17.setName("hi!:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog27 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str32 = aObjectCatalog31.getName();
        aObjectCatalog27.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog37 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog37.setName("hi!");
        java.lang.String str40 = aObjectCatalog37.getName();
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog27, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog37);
        aObjectCatalog17.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog27);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        java.lang.String str44 = aObjectCatalog3.toString();
        java.lang.String str45 = aObjectCatalog3.getName();
        java.lang.String str46 = aObjectCatalog3.getName();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!:-1" + "'", str13.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!:-1" + "'", str44.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test478");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog13.setName("hi!");
        java.lang.String str16 = aObjectCatalog13.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str22 = aObjectCatalog21.getName();
        int i23 = aObjectCatalog21.getId();
        io.github.agentsoz.jill.struct.AObject aObject25 = aObjectCatalog21.find("hi!:0");
        aObjectCatalog3.push(aObject25);
        int i27 = aObjectCatalog3.size();
        java.lang.String str28 = aObjectCatalog3.toString();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertNull(aObject25);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!:-1" + "'", str28.equals("hi!:-1"));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test479");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        java.lang.String str15 = aObjectCatalog3.toString();
        int i16 = aObjectCatalog3.getId();
        int i17 = aObjectCatalog3.size();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!:-1" + "'", str15.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test480");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!:0");
        java.lang.String str10 = aObjectCatalog3.getName();
        try {
            io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:0" + "'", str10.equals("hi!:0"));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test481");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.find("hi!:-1:1");
        io.github.agentsoz.jill.struct.AObject aObject8 = aObjectCatalog3.get((int) (short) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str17 = aObjectCatalog16.getName();
        aObjectCatalog12.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog22.setName("hi!");
        java.lang.String str25 = aObjectCatalog22.getName();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog30 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog30);
        int i32 = aObjectCatalog12.size();
        aObjectCatalog12.setId((int) (short) 1);
        int i35 = aObjectCatalog12.size();
        try {
            boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(aObject6);
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertTrue(i35 == 1);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test482");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        int i15 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str24 = aObjectCatalog23.getName();
        aObjectCatalog19.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog30 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog34 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str35 = aObjectCatalog34.getName();
        aObjectCatalog30.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog34);
        java.lang.String str37 = aObjectCatalog30.toString();
        io.github.agentsoz.jill.struct.AObject aObject38 = aObjectCatalog30.pop();
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, aObject38);
        try {
            io.github.agentsoz.jill.struct.AObject aObject40 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!:-1" + "'", str37.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject38);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test483");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str18 = aObjectCatalog17.getName();
        aObjectCatalog13.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog23.setName("hi!");
        java.lang.String str26 = aObjectCatalog23.getName();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        java.lang.String str29 = aObjectCatalog3.getName();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!:0" + "'", str29.equals("hi!:0"));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test484");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100", (int) (short) 1, (int) (byte) 1);
        java.lang.String str4 = aObjectCatalog3.toString();
        aObjectCatalog3.setId((int) (byte) 0);
        java.lang.String str7 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (byte) 0, 0);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog15.get((int) (byte) 100);
        java.lang.String str18 = aObjectCatalog15.toString();
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog11, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        java.lang.String str20 = aObjectCatalog11.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        aObjectCatalog3.setId(2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:100:-1" + "'", str4.equals("hi!:100:-1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:100:0" + "'", str7.equals("hi!:100:0"));
        org.junit.Assert.assertNull(aObject17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!:-1:-1" + "'", str18.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!:-1" + "'", str20.equals("hi!:-1"));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test485");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, 0);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test486");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog(":-1:32", 0, 10);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test487");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", (int) (byte) 1, (int) (short) 100);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str12 = aObjectCatalog11.getName();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        io.github.agentsoz.jill.struct.AObject aObject14 = aObjectCatalog7.pop();
        java.lang.String str15 = aObjectCatalog7.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str24 = aObjectCatalog23.getName();
        aObjectCatalog19.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog29 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog29.setName("hi!");
        java.lang.String str32 = aObjectCatalog29.getName();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog29);
        java.lang.String str34 = aObjectCatalog19.getName();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        io.github.agentsoz.jill.struct.AObject aObject37 = aObjectCatalog7.get(100);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        java.lang.String str39 = aObjectCatalog3.toString();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertNull(aObject37);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!:0:-1" + "'", str39.equals("hi!:0:-1"));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test488");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str21 = aObjectCatalog20.getName();
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog30 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str31 = aObjectCatalog30.getName();
        aObjectCatalog26.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog30);
        io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog26.pop();
        java.lang.String str34 = aObjectCatalog26.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog38 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog42 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str43 = aObjectCatalog42.getName();
        aObjectCatalog38.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog42);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog48 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog48.setName("hi!");
        java.lang.String str51 = aObjectCatalog48.getName();
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog38, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog48);
        java.lang.String str53 = aObjectCatalog38.getName();
        aObjectCatalog26.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog38);
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        int i57 = aObjectCatalog14.getId();
        java.lang.String str58 = aObjectCatalog14.getName();
        java.lang.String str59 = aObjectCatalog14.getName();
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!" + "'", str58.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test489");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog13.setName("hi!");
        java.lang.String str16 = aObjectCatalog13.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog21);
        java.lang.String str23 = aObjectCatalog21.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog27 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog27.setName("hi!");
        java.lang.String str30 = aObjectCatalog27.getName();
        int i31 = aObjectCatalog27.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog35 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject37 = aObjectCatalog35.get((-1));
        java.lang.String str38 = aObjectCatalog35.getName();
        aObjectCatalog35.setId((int) ' ');
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog27, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog35);
        java.lang.String str42 = aObjectCatalog27.getName();
        io.github.agentsoz.jill.struct.AObject aObject44 = aObjectCatalog27.find("");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog48 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog48.setName("hi!");
        java.lang.String str51 = aObjectCatalog48.getName();
        io.github.agentsoz.jill.struct.AObject aObject53 = aObjectCatalog48.find("hi!:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog57 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog61 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str62 = aObjectCatalog61.getName();
        aObjectCatalog57.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog61);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog67 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog67.setName("hi!");
        java.lang.String str70 = aObjectCatalog67.getName();
        boolean b71 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog57, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog67);
        java.lang.String str72 = aObjectCatalog57.toString();
        io.github.agentsoz.jill.struct.AObject aObject73 = aObjectCatalog57.pop();
        aObject73.setId((int) 'a');
        aObjectCatalog48.push(aObject73);
        java.lang.String str77 = aObjectCatalog48.getName();
        io.github.agentsoz.jill.struct.AObject aObject79 = aObjectCatalog48.get((int) (byte) -1);
        aObjectCatalog27.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog48);
        aObjectCatalog21.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog48);
        aObjectCatalog48.setId((int) 'a');
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:-1" + "'", str23.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNull(aObject37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        org.junit.Assert.assertNull(aObject44);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        org.junit.Assert.assertNull(aObject53);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "hi!" + "'", str62.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "hi!" + "'", str70.equals("hi!"));
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!:-1" + "'", str72.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject73);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "hi!" + "'", str77.equals("hi!"));
        org.junit.Assert.assertNull(aObject79);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test490");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", (int) (byte) 0, (int) (byte) -1);
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog8 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog8.setName("hi!");
        java.lang.String str11 = aObjectCatalog8.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog8.get(0);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog17.setName("hi!");
        java.lang.String str20 = aObjectCatalog17.toString();
        io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog17.find("hi!:-1:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog30 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str31 = aObjectCatalog30.getName();
        aObjectCatalog26.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog30);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog36 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog36.setName("hi!");
        java.lang.String str39 = aObjectCatalog36.getName();
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog26, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog36);
        java.lang.String str41 = aObjectCatalog26.toString();
        java.lang.String str42 = aObjectCatalog26.toString();
        aObjectCatalog17.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        io.github.agentsoz.jill.struct.AObject aObject45 = aObjectCatalog26.get((int) (byte) 1);
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog8, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog51 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog51.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog57 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog57.setName("hi!");
        java.lang.String str60 = aObjectCatalog57.toString();
        aObjectCatalog51.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog57);
        int i62 = aObjectCatalog57.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog66 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog70 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str71 = aObjectCatalog70.getName();
        aObjectCatalog66.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog70);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog76 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog76.setName("hi!");
        java.lang.String str79 = aObjectCatalog76.getName();
        boolean b80 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog66, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog76);
        java.lang.String str81 = aObjectCatalog66.getName();
        aObjectCatalog66.setName("");
        int i84 = aObjectCatalog66.getId();
        boolean b85 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog57, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog66);
        io.github.agentsoz.jill.struct.AObject aObject87 = aObjectCatalog66.find("hi!:0:-1");
        io.github.agentsoz.jill.struct.AObject aObject89 = aObjectCatalog66.get((int) (short) 1);
        io.github.agentsoz.jill.struct.AObject aObject90 = aObjectCatalog66.pop();
        boolean b91 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, aObject90);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:0" + "'", str4.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!:-1" + "'", str20.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject22);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!:-1" + "'", str41.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!:-1" + "'", str42.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!:-1" + "'", str60.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "hi!" + "'", str71.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "hi!" + "'", str79.equals("hi!"));
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "hi!" + "'", str81.equals("hi!"));
        org.junit.Assert.assertTrue(i84 == (-1));
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNull(aObject87);
        org.junit.Assert.assertNull(aObject89);
        org.junit.Assert.assertNotNull(aObject90);
        org.junit.Assert.assertTrue(b91 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test491");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setId((int) (short) 0);
        java.lang.String str8 = aObjectCatalog3.toString();
        java.lang.String str9 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.get(1);
        try {
            java.lang.String str12 = aObject11.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:0" + "'", str8.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:0" + "'", str9.equals("hi!:0"));
        org.junit.Assert.assertNull(aObject11);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test492");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.find("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog3.get((int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.find("hi!:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (short) 10, (int) (byte) -1);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        io.github.agentsoz.jill.struct.AObject aObject17 = null;
        aObjectCatalog3.push(aObject17);
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog3.get((int) 'a');
        io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog3.get(35);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(aObject7);
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertNull(aObject11);
        org.junit.Assert.assertNull(aObject20);
        org.junit.Assert.assertNull(aObject22);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test493");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!");
        aObjectCatalog3.setName("hi!:0");
        java.lang.String str10 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog14.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog20.setName("hi!");
        java.lang.String str23 = aObjectCatalog20.toString();
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        int i25 = aObjectCatalog20.size();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog30 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog30.setId((int) '#');
        aObjectCatalog30.setName("hi!:-1");
        io.github.agentsoz.jill.struct.AObject aObject36 = aObjectCatalog30.find("");
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog30);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog41 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100:-1", 100, (int) (byte) 100);
        aObjectCatalog30.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:0" + "'", str10.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:-1" + "'", str23.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(aObject36);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test494");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.find("hi!:-1:1");
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog3.get(10);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(aObject6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject9);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test495");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        int i15 = aObjectCatalog3.size();
        java.lang.String str16 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        int i21 = aObjectCatalog20.getId();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        try {
            io.github.agentsoz.jill.struct.AObject aObject23 = aObjectCatalog20.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!:-1" + "'", str16.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test496");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str21 = aObjectCatalog20.getName();
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog30 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str31 = aObjectCatalog30.getName();
        aObjectCatalog26.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog30);
        io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog26.pop();
        java.lang.String str34 = aObjectCatalog26.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog38 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog42 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str43 = aObjectCatalog42.getName();
        aObjectCatalog38.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog42);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog48 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog48.setName("hi!");
        java.lang.String str51 = aObjectCatalog48.getName();
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog38, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog48);
        java.lang.String str53 = aObjectCatalog38.getName();
        aObjectCatalog26.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog38);
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog60 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject62 = aObjectCatalog60.get((-1));
        java.lang.String str63 = aObjectCatalog60.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog60);
        aObjectCatalog60.setName("hi!:0:0:-1");
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNull(aObject62);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "hi!" + "'", str63.equals("hi!"));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test497");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog11.get((-1));
        java.lang.String str14 = aObjectCatalog11.getName();
        aObjectCatalog11.setId((int) ' ');
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        java.lang.String str18 = aObjectCatalog11.getName();
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog11.get((int) (byte) 10);
        int i21 = aObjectCatalog11.size();
        try {
            io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog11.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNull(aObject20);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test498");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1:-1", (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test499");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog3.setId((int) '#');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        io.github.agentsoz.jill.struct.AObject aObject16 = aObjectCatalog9.pop();
        aObjectCatalog9.setId((int) '4');
        aObjectCatalog9.setId((-1));
        java.lang.String str21 = aObjectCatalog9.toString();
        aObjectCatalog9.setId(100);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        java.lang.String str25 = aObjectCatalog9.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog29 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog33 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str34 = aObjectCatalog33.getName();
        int i35 = aObjectCatalog33.getId();
        aObjectCatalog33.setName("hi!");
        aObjectCatalog33.setName("hi!:0");
        java.lang.String str40 = aObjectCatalog33.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog44 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog44.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog50 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog50.setName("hi!");
        java.lang.String str53 = aObjectCatalog50.toString();
        aObjectCatalog44.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog50);
        int i55 = aObjectCatalog50.size();
        aObjectCatalog33.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog50);
        java.lang.String str57 = aObjectCatalog50.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog61 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) '4', 0);
        boolean b62 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog50, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog61);
        aObjectCatalog29.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog61);
        int i64 = aObjectCatalog29.size();
        boolean b65 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog29);
        java.lang.String str66 = aObjectCatalog29.getName();
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject16);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!:-1" + "'", str21.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue(i35 == (-1));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!:0" + "'", str40.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!:-1" + "'", str53.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!:0" + "'", str57.equals("hi!:0"));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i64 == 1);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!" + "'", str66.equals("hi!"));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest0.test500");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) ' ');
        aObjectCatalog3.setId((int) '4');
        io.github.agentsoz.jill.struct.AObject aObject12 = aObjectCatalog3.find(":-1");
        try {
            io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject12);
    }
}

