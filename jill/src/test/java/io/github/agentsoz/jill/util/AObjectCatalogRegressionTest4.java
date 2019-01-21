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
public class AObjectCatalogRegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test001");
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
        java.lang.String str26 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) 'a');
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test002");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog9.setName("hi!");
        java.lang.String str12 = aObjectCatalog9.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.struct.AObject aObject15 = aObjectCatalog9.find("");
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog9.get((int) (short) 1);
        io.github.agentsoz.jill.struct.AObject aObject18 = null;
        aObjectCatalog9.push(aObject18);
        int i20 = aObjectCatalog9.size();
        io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog9.find("hi!:10:-1");
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject15);
        org.junit.Assert.assertNull(aObject17);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNull(aObject22);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test003");
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
        int i53 = aObjectCatalog31.size();
        aObjectCatalog31.setName(":-1:32");
        aObjectCatalog31.setId((int) (short) 0);
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
        org.junit.Assert.assertTrue(i53 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test004");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (byte) 0, 0);
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test005");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        aObjectCatalog3.setId((int) (byte) -1);
        io.github.agentsoz.jill.struct.AObject aObject18 = aObjectCatalog3.find("hi!:0:100");
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog3.find(":97");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject18);
        org.junit.Assert.assertNull(aObject20);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test006");
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
        int i19 = aObjectCatalog10.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (byte) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog27 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str32 = aObjectCatalog31.getName();
        aObjectCatalog27.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog37 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog37.setName("hi!");
        java.lang.String str40 = aObjectCatalog37.getName();
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog27, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog37);
        aObjectCatalog23.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog37);
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog47 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:10", (int) ' ', 1);
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog47);
        java.lang.String str49 = aObjectCatalog47.toString();
        int i50 = aObjectCatalog47.size();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:0" + "'", str4.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!:0" + "'", str15.equals("hi!:0"));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!:10:-1" + "'", str49.equals("hi!:10:-1"));
        org.junit.Assert.assertTrue(i50 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test007");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        int i4 = aObjectCatalog3.getId();
        int i5 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.find("hi!:0:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", (int) (byte) 1, (int) (short) 100);
        aObjectCatalog11.setId(0);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        aObjectCatalog11.setName("hi!:100:0");
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(aObject7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test008");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog(":0", 97, (-1));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test009");
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
        io.github.agentsoz.jill.struct.AObject aObject62 = aObjectCatalog40.get((int) (short) 100);
        int i63 = aObjectCatalog40.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog67 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog71 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str72 = aObjectCatalog71.getName();
        aObjectCatalog67.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog71);
        io.github.agentsoz.jill.struct.AObject aObject74 = aObjectCatalog67.pop();
        java.lang.String str75 = aObjectCatalog67.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog79 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog83 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str84 = aObjectCatalog83.getName();
        aObjectCatalog79.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog83);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog89 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog89.setName("hi!");
        java.lang.String str92 = aObjectCatalog89.getName();
        boolean b93 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog79, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog89);
        java.lang.String str94 = aObjectCatalog79.getName();
        aObjectCatalog67.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog79);
        java.lang.String str96 = aObjectCatalog67.getName();
        io.github.agentsoz.jill.struct.AObject aObject97 = aObjectCatalog67.pop();
        aObjectCatalog40.push(aObject97);
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
        org.junit.Assert.assertNull(aObject62);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!" + "'", str72.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject74);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "hi!" + "'", str75.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "hi!" + "'", str84.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "hi!" + "'", str92.equals("hi!"));
        org.junit.Assert.assertTrue(b93 == true);
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "hi!" + "'", str94.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str96 + "' != '" + "hi!" + "'", str96.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject97);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test010");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog7.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        aObjectCatalog13.setName("hi!:-1");
        int i18 = aObjectCatalog13.getId();
        aObjectCatalog13.setName("hi!:52");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test011");
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
        java.lang.String str44 = aObjectCatalog17.getName();
        io.github.agentsoz.jill.struct.AObject aObject46 = aObjectCatalog17.find("hi!:-1:1:-1");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!:-1" + "'", str13.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!:0" + "'", str44.equals("hi!:0"));
        org.junit.Assert.assertNull(aObject46);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test012");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:-1:-1", (int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test013");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.struct.AObject aObject12 = aObjectCatalog3.find("hi!:0");
        java.lang.String str13 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject15 = aObjectCatalog3.get((int) (short) 1);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!:-1" + "'", str13.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject15);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test014");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1:-1:-1", 0, (int) (short) 0);
        int i4 = aObjectCatalog3.getId();
        org.junit.Assert.assertTrue(i4 == (-1));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test015");
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
        java.lang.String str36 = aObjectCatalog35.getName();
        int i37 = aObjectCatalog35.getId();
        aObjectCatalog35.setId((int) (short) 0);
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog35);
        java.lang.String str41 = aObjectCatalog12.toString();
        java.lang.String str42 = aObjectCatalog12.getName();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1" + "'", str27.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!:-1" + "'", str28.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject31);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        org.junit.Assert.assertTrue(i37 == (-1));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!:0" + "'", str41.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test016");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100", (int) (short) 1, (int) (byte) 1);
        int i4 = aObjectCatalog3.size();
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test017");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100:1", (int) (short) 0, 1);
        int i4 = aObjectCatalog3.getId();
        int i5 = aObjectCatalog3.size();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test018");
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
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog62 = new io.github.agentsoz.jill.util.AObjectCatalog(":-1", 100, (int) ' ');
        int i63 = aObjectCatalog62.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog67 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0", (int) ' ', (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject69 = aObjectCatalog67.find("");
        boolean b70 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog62, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog67);
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog67);
        aObjectCatalog67.setId(35);
        int i74 = aObjectCatalog67.size();
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
        org.junit.Assert.assertTrue(i63 == (-1));
        org.junit.Assert.assertNull(aObject69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(i74 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test019");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", (int) (short) 1, (int) '4');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get(1);
        int i6 = aObjectCatalog3.size();
        aObjectCatalog3.setName("");
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test020");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (byte) -1);
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog8 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog8.setId((int) '#');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str19 = aObjectCatalog18.getName();
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        io.github.agentsoz.jill.struct.AObject aObject21 = aObjectCatalog14.pop();
        aObjectCatalog14.setId((int) '4');
        aObjectCatalog14.setId((-1));
        java.lang.String str26 = aObjectCatalog14.toString();
        aObjectCatalog14.setId(100);
        aObjectCatalog8.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject31 = aObjectCatalog14.get((int) '#');
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog36 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str37 = aObjectCatalog36.getName();
        int i38 = aObjectCatalog36.getId();
        aObjectCatalog36.setName("hi!");
        aObjectCatalog36.setName("hi!:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog46 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog50 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str51 = aObjectCatalog50.getName();
        aObjectCatalog46.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog50);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog56 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog56.setName("hi!");
        java.lang.String str59 = aObjectCatalog56.getName();
        boolean b60 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog46, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog56);
        aObjectCatalog36.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog46);
        aObjectCatalog36.setId((int) (byte) 100);
        io.github.agentsoz.jill.struct.AObject aObject65 = aObjectCatalog36.get((int) 'a');
        io.github.agentsoz.jill.struct.AObject aObject67 = aObjectCatalog36.get((int) '#');
        io.github.agentsoz.jill.struct.AObject aObject69 = aObjectCatalog36.find("hi!:100:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog73 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog77 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str78 = aObjectCatalog77.getName();
        aObjectCatalog73.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog77);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog83 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog83.setName("hi!");
        java.lang.String str86 = aObjectCatalog83.getName();
        boolean b87 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog73, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog83);
        java.lang.String str88 = aObjectCatalog73.toString();
        io.github.agentsoz.jill.struct.AObject aObject89 = aObjectCatalog73.pop();
        aObjectCatalog36.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog73);
        java.lang.String str91 = aObjectCatalog36.toString();
        boolean b92 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog36);
        io.github.agentsoz.jill.struct.AObject aObject94 = aObjectCatalog3.find("hi!:-1:-1:-1:-1");
        java.lang.String str95 = aObjectCatalog3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject21);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:-1" + "'", str26.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        org.junit.Assert.assertTrue(i38 == (-1));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNull(aObject65);
        org.junit.Assert.assertNull(aObject67);
        org.junit.Assert.assertNull(aObject69);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "hi!" + "'", str78.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "hi!" + "'", str86.equals("hi!"));
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertTrue("'" + str88 + "' != '" + "hi!:-1" + "'", str88.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject89);
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "hi!:0:100" + "'", str91.equals("hi!:0:100"));
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertNull(aObject94);
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + "hi!:-1" + "'", str95.equals("hi!:-1"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test021");
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
        aObjectCatalog9.setId((int) (short) 10);
        java.lang.String str26 = aObjectCatalog9.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog30 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog34 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject36 = aObjectCatalog34.get((-1));
        java.lang.String str37 = aObjectCatalog34.getName();
        aObjectCatalog34.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject41 = aObjectCatalog34.get((int) (byte) 10);
        aObjectCatalog30.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog34);
        java.lang.String str43 = aObjectCatalog34.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog47 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        int i48 = aObjectCatalog47.getId();
        int i49 = aObjectCatalog47.getId();
        aObjectCatalog34.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog47);
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog34);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject16);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!:-1" + "'", str22.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertNull(aObject36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        org.junit.Assert.assertNull(aObject41);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!:0:0" + "'", str43.equals("hi!:0:0"));
        org.junit.Assert.assertTrue(i48 == (-1));
        org.junit.Assert.assertTrue(i49 == (-1));
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test022");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100:-1", 0, (int) 'a');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((int) (byte) -1);
        try {
            int i6 = aObject5.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test023");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog10.pop();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        int i19 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog27 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str28 = aObjectCatalog27.getName();
        aObjectCatalog23.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog27);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog33 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str34 = aObjectCatalog33.getName();
        aObjectCatalog27.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog33);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog39 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog43 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str44 = aObjectCatalog43.getName();
        aObjectCatalog39.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog43);
        io.github.agentsoz.jill.struct.AObject aObject46 = aObjectCatalog39.pop();
        java.lang.String str47 = aObjectCatalog39.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog51 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog55 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str56 = aObjectCatalog55.getName();
        aObjectCatalog51.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog55);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog61 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog61.setName("hi!");
        java.lang.String str64 = aObjectCatalog61.getName();
        boolean b65 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog51, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog61);
        java.lang.String str66 = aObjectCatalog51.getName();
        aObjectCatalog39.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog51);
        boolean b68 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog27, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog39);
        io.github.agentsoz.jill.struct.AObject aObject70 = aObjectCatalog27.get((int) (byte) -1);
        aObjectCatalog27.setName("hi!:100");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog76 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        int i77 = aObjectCatalog76.getId();
        java.lang.String str78 = aObjectCatalog76.toString();
        java.lang.String str79 = aObjectCatalog76.getName();
        io.github.agentsoz.jill.struct.AObject aObject81 = aObjectCatalog76.get((int) (short) 10);
        aObjectCatalog27.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog76);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog86 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 1, (int) (short) 10);
        boolean b87 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog76, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog86);
        boolean b88 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog76);
        java.lang.String str89 = aObjectCatalog76.toString();
        io.github.agentsoz.jill.struct.AObject aObject91 = aObjectCatalog76.get((int) (byte) -1);
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!" + "'", str56.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!" + "'", str64.equals("hi!"));
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!" + "'", str66.equals("hi!"));
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNull(aObject70);
        org.junit.Assert.assertTrue(i77 == (-1));
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "hi!:-1" + "'", str78.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "hi!" + "'", str79.equals("hi!"));
        org.junit.Assert.assertNull(aObject81);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "hi!:1" + "'", str89.equals("hi!:1"));
        org.junit.Assert.assertNull(aObject91);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test024");
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
        aObjectCatalog19.setName("hi!:100");
        io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog19.find("hi!:100:1");
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(aObject33);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test025");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0:-1", (int) (short) 100, 100);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test026");
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
        int i50 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject52 = aObjectCatalog3.get((int) (short) 0);
        java.lang.String str53 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject55 = aObjectCatalog3.find("hi!:-1:-1:-1");
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
        org.junit.Assert.assertTrue(i50 == 52);
        org.junit.Assert.assertNull(aObject52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + ":52" + "'", str53.equals(":52"));
        org.junit.Assert.assertNull(aObject55);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test027");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setId((int) (short) 0);
        java.lang.String str8 = aObjectCatalog3.toString();
        aObjectCatalog3.setName("hi!");
        int i11 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 97, (int) (byte) 0);
        aObjectCatalog15.setId((int) (byte) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog21.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog27 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str32 = aObjectCatalog31.getName();
        aObjectCatalog27.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        io.github.agentsoz.jill.struct.AObject aObject34 = aObjectCatalog27.pop();
        aObjectCatalog27.setId((int) '4');
        aObjectCatalog27.setId((-1));
        int i39 = aObjectCatalog27.size();
        java.lang.String str40 = aObjectCatalog27.toString();
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog21, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog27);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog45 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog49 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str50 = aObjectCatalog49.getName();
        aObjectCatalog45.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog49);
        io.github.agentsoz.jill.struct.AObject aObject52 = aObjectCatalog45.pop();
        aObjectCatalog45.setId((int) '4');
        aObjectCatalog45.setName("");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog60 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject62 = aObjectCatalog60.get((-1));
        java.lang.String str63 = aObjectCatalog60.getName();
        aObjectCatalog60.setId((int) ' ');
        aObjectCatalog60.setId((int) '4');
        io.github.agentsoz.jill.struct.AObject aObject69 = aObjectCatalog60.find(":-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog73 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject75 = aObjectCatalog73.get((-1));
        java.lang.String str76 = aObjectCatalog73.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog80 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog84 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str85 = aObjectCatalog84.getName();
        aObjectCatalog80.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog84);
        io.github.agentsoz.jill.struct.AObject aObject87 = aObjectCatalog80.pop();
        aObjectCatalog73.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog80);
        java.lang.String str89 = aObjectCatalog73.toString();
        aObjectCatalog60.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog73);
        aObjectCatalog45.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog73);
        boolean b92 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog21, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog73);
        boolean b93 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog15, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog21);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        aObjectCatalog15.setId(2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:0" + "'", str8.equals("hi!:0"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject34);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!:-1" + "'", str40.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject52);
        org.junit.Assert.assertNull(aObject62);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "hi!" + "'", str63.equals("hi!"));
        org.junit.Assert.assertNull(aObject69);
        org.junit.Assert.assertNull(aObject75);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "hi!" + "'", str76.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "hi!" + "'", str85.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject87);
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "hi!:-1" + "'", str89.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertTrue(b93 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test028");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.get(52);
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog3.find("");
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertNull(aObject7);
        org.junit.Assert.assertNull(aObject9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test029");
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
        io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(aObject32);
        org.junit.Assert.assertNotNull(aObject33);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test030");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.getId();
        aObjectCatalog3.setName(":-1:32");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == (-1));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test031");
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
        int i27 = aObjectCatalog3.size();
        io.github.agentsoz.jill.struct.AObject aObject29 = aObjectCatalog3.find("hi!:0:35");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:0" + "'", str10.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:-1" + "'", str23.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNull(aObject29);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test032");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str15 = aObjectCatalog14.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog10.pop();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        int i19 = aObjectCatalog10.getId();
        io.github.agentsoz.jill.struct.AObject aObject21 = aObjectCatalog10.get(10);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog25 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", (int) (byte) 0, (int) (byte) -1);
        java.lang.String str26 = aObjectCatalog25.getName();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog25);
        io.github.agentsoz.jill.struct.AObject aObject29 = aObjectCatalog10.get(100);
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(aObject21);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:0" + "'", str26.equals("hi!:0"));
        org.junit.Assert.assertNull(aObject29);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test033");
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
        io.github.agentsoz.jill.struct.AObject aObject35 = aObjectCatalog25.find(":0:-1");
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject20);
        org.junit.Assert.assertNull(aObject27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!:0:-1" + "'", str31.equals("hi!:0:-1"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!:0:-1" + "'", str32.equals("hi!:0:-1"));
        org.junit.Assert.assertNull(aObject35);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test034");
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
        java.lang.String str36 = aObjectCatalog35.getName();
        int i37 = aObjectCatalog35.getId();
        aObjectCatalog35.setId((int) (short) 0);
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog35);
        int i41 = aObjectCatalog12.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog45 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog45.setName("hi!");
        java.lang.String str48 = aObjectCatalog45.getName();
        int i49 = aObjectCatalog45.size();
        int i50 = aObjectCatalog45.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog54 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject56 = aObjectCatalog54.get((-1));
        java.lang.String str57 = aObjectCatalog54.getName();
        aObjectCatalog54.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject61 = aObjectCatalog54.get((int) (byte) -1);
        aObjectCatalog45.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog54);
        aObjectCatalog12.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog45);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject8);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1" + "'", str27.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!:-1" + "'", str28.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject31);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        org.junit.Assert.assertTrue(i37 == (-1));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(i41 == 1);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNull(aObject56);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
        org.junit.Assert.assertNull(aObject61);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test035");
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
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog52 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog52.setName("hi!");
        java.lang.String str55 = aObjectCatalog52.getName();
        io.github.agentsoz.jill.struct.AObject aObject57 = aObjectCatalog52.find("hi!:0");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog61 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog65 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str66 = aObjectCatalog65.getName();
        aObjectCatalog61.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog65);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog71 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog71.setName("hi!");
        java.lang.String str74 = aObjectCatalog71.getName();
        boolean b75 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog61, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog71);
        java.lang.String str76 = aObjectCatalog61.toString();
        io.github.agentsoz.jill.struct.AObject aObject77 = aObjectCatalog61.pop();
        aObject77.setId((int) 'a');
        aObjectCatalog52.push(aObject77);
        boolean b81 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog34, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog52);
        aObjectCatalog52.setName("");
        int i84 = aObjectCatalog52.getId();
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!:-1" + "'", str37.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i46 == (-1));
        org.junit.Assert.assertTrue(i47 == (-1));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        org.junit.Assert.assertNull(aObject57);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!" + "'", str66.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "hi!" + "'", str74.equals("hi!"));
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "hi!:-1" + "'", str76.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject77);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(i84 == (-1));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test036");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setId((int) (short) 0);
        java.lang.String str8 = aObjectCatalog3.toString();
        java.lang.String str9 = aObjectCatalog3.toString();
        java.lang.String str10 = aObjectCatalog3.getName();
        int i11 = aObjectCatalog3.getId();
        java.lang.String str12 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) '4');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:0" + "'", str8.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:0" + "'", str9.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test037");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.find("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog3.get((int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.find("hi!:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (short) 10, (int) (byte) -1);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        java.lang.String str17 = aObjectCatalog3.getName();
        int i18 = aObjectCatalog3.getId();
        int i19 = aObjectCatalog3.getId();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(aObject7);
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertNull(aObject11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(i19 == (-1));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test038");
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
        int i37 = aObjectCatalog3.size();
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
        org.junit.Assert.assertTrue(i37 == 1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test039");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get(100);
        try {
            int i6 = aObject5.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test040");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        int i4 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog8 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str13 = aObjectCatalog12.getName();
        aObjectCatalog8.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12);
        aObjectCatalog12.setId((int) (short) -1);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12);
        aObjectCatalog3.setName("hi!:97");
        aObjectCatalog3.setId(10);
        io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog3.pop();
        java.lang.String str23 = aObject22.getName();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test041");
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
        int i27 = aObjectCatalog3.size();
        java.lang.String str28 = aObjectCatalog3.getName();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(aObject21);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!:0:0" + "'", str28.equals("hi!:0:0"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test042");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        int i4 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.find("hi!:100:-1");
        try {
            io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(aObject6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test043");
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
        java.lang.String str43 = aObjectCatalog35.getName();
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
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test044");
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
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog3.find("hi!:-1:1");
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject20);
        org.junit.Assert.assertNull(aObject22);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test045");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get(100);
        java.lang.String str6 = aObjectCatalog3.toString();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str12 = aObjectCatalog11.getName();
        int i13 = aObjectCatalog11.getId();
        aObjectCatalog11.setName("hi!");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        java.lang.String str17 = aObjectCatalog11.toString();
        java.lang.String str18 = aObjectCatalog11.toString();
        java.lang.String str19 = aObjectCatalog11.getName();
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!:0" + "'", str17.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!:0" + "'", str18.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test046");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog(":-1", (int) ' ', (int) (short) -1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test047");
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
        aObjectCatalog3.setId((int) (byte) 100);
        java.lang.String str39 = aObjectCatalog3.getName();
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
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test048");
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
        io.github.agentsoz.jill.struct.AObject aObject83 = aObjectCatalog39.pop();
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
        org.junit.Assert.assertNotNull(aObject83);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test049");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", (int) '#', 35);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test050");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:-1", 0, 2);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test051");
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
        aObjectCatalog17.setId((int) (short) 0);
        java.lang.String str46 = aObjectCatalog17.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog50 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject52 = aObjectCatalog50.get((-1));
        java.lang.String str53 = aObjectCatalog50.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog57 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog61 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str62 = aObjectCatalog61.getName();
        aObjectCatalog57.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog61);
        io.github.agentsoz.jill.struct.AObject aObject64 = aObjectCatalog57.pop();
        aObjectCatalog50.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog57);
        java.lang.String str66 = aObjectCatalog50.toString();
        int i67 = aObjectCatalog50.getId();
        int i68 = aObjectCatalog50.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog72 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog72.setName("hi!");
        int i75 = aObjectCatalog72.size();
        boolean b76 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog50, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog72);
        aObjectCatalog72.setName("hi!:-1");
        io.github.agentsoz.jill.struct.AObject aObject80 = aObjectCatalog72.find(":52");
        aObjectCatalog17.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog72);
        aObjectCatalog72.setName("hi!:0:1");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!:-1" + "'", str13.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!:0:0" + "'", str46.equals("hi!:0:0"));
        org.junit.Assert.assertNull(aObject52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "hi!" + "'", str62.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject64);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!:-1" + "'", str66.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i67 == (-1));
        org.junit.Assert.assertTrue(i68 == (-1));
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNull(aObject80);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test052");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.find("hi!:-1:-1:100");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(aObject11);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test053");
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
        java.lang.String str51 = aObjectCatalog34.getName();
        int i52 = aObjectCatalog34.getId();
        io.github.agentsoz.jill.struct.AObject aObject53 = null;
        try {
            boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog34, aObject53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!:-1" + "'", str37.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i46 == (-1));
        org.junit.Assert.assertTrue(i47 == (-1));
        org.junit.Assert.assertNull(aObject50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!:-1:-1" + "'", str51.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue(i52 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test054");
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
        aObjectCatalog3.setName("");
        io.github.agentsoz.jill.struct.AObject aObject45 = aObjectCatalog3.find("hi!:-1:1:-1");
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
        org.junit.Assert.assertNull(aObject45);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test055");
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
        aObjectCatalog27.setId((int) (short) -1);
        aObjectCatalog27.setName(":0");
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertTrue(b31 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test056");
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
        aObjectCatalog3.setId((-1));
        int i25 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog3.find(":52");
        java.lang.String str28 = aObjectCatalog3.toString();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertNull(aObject27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!:-1" + "'", str28.equals("hi!:-1"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test057");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.find("hi!:-1:-1");
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0", (int) '#', (-1));
        int i12 = aObjectCatalog11.getId();
        aObjectCatalog11.setName("hi!:100:0");
        io.github.agentsoz.jill.struct.AObject aObject16 = aObjectCatalog11.find("hi!:0:0");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog21.setName("hi!");
        int i24 = aObjectCatalog21.getId();
        io.github.agentsoz.jill.struct.AObject aObject26 = aObjectCatalog21.find("hi!:-1");
        int i27 = aObjectCatalog21.size();
        aObjectCatalog21.setId((int) (byte) 10);
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
        int i50 = aObjectCatalog33.getId();
        int i51 = aObjectCatalog33.getId();
        io.github.agentsoz.jill.struct.AObject aObject53 = aObjectCatalog33.get((int) (byte) 0);
        aObjectCatalog33.setName("hi!:100");
        aObjectCatalog21.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog33);
        java.lang.String str57 = aObjectCatalog33.getName();
        aObjectCatalog11.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog33);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(aObject6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNull(aObject16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i24 == (-1));
        org.junit.Assert.assertNull(aObject26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNull(aObject35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject47);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!:-1" + "'", str49.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i50 == (-1));
        org.junit.Assert.assertTrue(i51 == (-1));
        org.junit.Assert.assertNotNull(aObject53);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!:100" + "'", str57.equals("hi!:100"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test058");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100", (int) (short) 1, (int) (byte) 1);
        java.lang.String str4 = aObjectCatalog3.toString();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!:100:-1:-1");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:100:-1" + "'", str4.equals("hi!:100:-1"));
        org.junit.Assert.assertTrue(i5 == (-1));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test059");
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
        aObjectCatalog9.setName(":0");
        io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog9.get(35);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(aObject28);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test060");
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
        io.github.agentsoz.jill.struct.AObject aObject58 = aObjectCatalog14.get(0);
        aObjectCatalog14.setName("hi!:10");
        aObjectCatalog14.setName("hi!:1");
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
        org.junit.Assert.assertNotNull(aObject58);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test061");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.toString();
        aObjectCatalog3.setId((int) (short) 100);
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test062");
        try {
            io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1:1", (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test063");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:10", 2, 0);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog(":52", 52, (-1));
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        try {
            io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog7.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test064");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        aObjectCatalog3.setName("hi!:-1");
        aObjectCatalog3.setId((int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog3.find("hi!:100");
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.get(0);
        int i12 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!:-1:35");
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertNull(aObject11);
        org.junit.Assert.assertTrue(i12 == 32);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test065");
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
        aObjectCatalog3.setId((int) (short) 10);
        aObjectCatalog3.setId((int) (short) 1);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertTrue(i26 == 97);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test066");
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
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog3.find("");
        int i21 = aObjectCatalog3.getId();
        aObjectCatalog3.setId(10);
        java.lang.String str24 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog28 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (byte) 1, (int) (byte) 1);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog28);
        io.github.agentsoz.jill.struct.AObject aObject31 = aObjectCatalog28.get(0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNull(aObject20);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNull(aObject31);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test067");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        java.lang.String str15 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject17 = aObjectCatalog3.get((int) '#');
        try {
            java.lang.String str18 = aObject17.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNull(aObject17);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test068");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.find("hi!");
        io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.get((int) (short) 0);
        aObjectCatalog3.setName("hi!:100");
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.find("hi!:-1:-1:-1");
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertNull(aObject7);
        org.junit.Assert.assertNull(aObject11);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test069");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100:1:0", 2, (int) (byte) 0);
        int i4 = aObjectCatalog3.getId();
        java.lang.String str5 = aObjectCatalog3.getName();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:100:1:0" + "'", str5.equals("hi!:100:1:0"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test070");
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
        int i58 = aObjectCatalog3.size();
        int i59 = aObjectCatalog3.size();
        aObjectCatalog3.setId((int) '#');
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
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertTrue(i59 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test071");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str4 = aObjectCatalog3.getName();
        aObjectCatalog3.setId(1);
        java.lang.String str7 = aObjectCatalog3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:1" + "'", str7.equals("hi!:1"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test072");
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
        java.lang.String str29 = aObjectCatalog7.getName();
        io.github.agentsoz.jill.struct.AObject aObject30 = aObjectCatalog7.pop();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject22);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject30);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test073");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get(100);
        java.lang.String str6 = aObjectCatalog3.toString();
        int i7 = aObjectCatalog3.size();
        java.lang.String str8 = aObjectCatalog3.toString();
        java.lang.String str9 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.get(1);
        int i12 = aObjectCatalog3.getId();
        aObjectCatalog3.setName("hi!:0:100");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:35", 35, 0);
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog18.find("hi!:10:-1");
        try {
            boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, aObject20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ":-1" + "'", str8.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ":-1" + "'", str9.equals(":-1"));
        org.junit.Assert.assertNull(aObject11);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNull(aObject20);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test074");
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
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog25 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog25.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog31.setName("hi!");
        java.lang.String str34 = aObjectCatalog31.toString();
        aObjectCatalog25.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        int i36 = aObjectCatalog31.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog40 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog44 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str45 = aObjectCatalog44.getName();
        aObjectCatalog40.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog44);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog50 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog50.setName("hi!");
        java.lang.String str53 = aObjectCatalog50.getName();
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog40, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog50);
        java.lang.String str55 = aObjectCatalog40.getName();
        aObjectCatalog40.setName("");
        int i58 = aObjectCatalog40.getId();
        boolean b59 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog40);
        io.github.agentsoz.jill.struct.AObject aObject61 = aObjectCatalog40.find("hi!:0:-1");
        io.github.agentsoz.jill.struct.AObject aObject62 = aObjectCatalog40.pop();
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog40);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog67 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog71 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str72 = aObjectCatalog71.getName();
        aObjectCatalog67.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog71);
        io.github.agentsoz.jill.struct.AObject aObject74 = aObjectCatalog67.pop();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog78 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog78.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog84 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog84.setName("hi!");
        aObjectCatalog78.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog84);
        int i88 = aObjectCatalog84.getId();
        aObjectCatalog67.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog84);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog93 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog84.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog93);
        io.github.agentsoz.jill.struct.AObject aObject96 = aObjectCatalog93.find("hi!:0:0");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog93);
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!:-1" + "'", str34.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        org.junit.Assert.assertTrue(i58 == (-1));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(aObject61);
        org.junit.Assert.assertNotNull(aObject62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!" + "'", str72.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject74);
        org.junit.Assert.assertTrue(i88 == 0);
        org.junit.Assert.assertNull(aObject96);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test075");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:97", 0, (int) 'a');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get(0);
        org.junit.Assert.assertNull(aObject5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test076");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100", 32, 10);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.find("");
        try {
            aObject5.setId((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test077");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        int i10 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject16 = aObjectCatalog14.get(100);
        java.lang.String str17 = aObjectCatalog14.toString();
        int i18 = aObjectCatalog14.size();
        java.lang.String str19 = aObjectCatalog14.getName();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog14.find("hi!:100:-1");
        io.github.agentsoz.jill.struct.AObject aObject24 = aObjectCatalog14.find(":-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog28 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog28.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog34 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog34.setName("hi!");
        aObjectCatalog28.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog34);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog41 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog41.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog47 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog47.setName("hi!");
        java.lang.String str50 = aObjectCatalog47.toString();
        aObjectCatalog41.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog47);
        int i52 = aObjectCatalog47.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog56 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog60 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str61 = aObjectCatalog60.getName();
        aObjectCatalog56.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog60);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog66 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog66.setName("hi!");
        java.lang.String str69 = aObjectCatalog66.getName();
        boolean b70 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog56, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog66);
        java.lang.String str71 = aObjectCatalog56.getName();
        aObjectCatalog56.setName("");
        int i74 = aObjectCatalog56.getId();
        boolean b75 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog47, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog56);
        aObjectCatalog34.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog47);
        java.lang.String str77 = aObjectCatalog34.getName();
        int i78 = aObjectCatalog34.getId();
        int i79 = aObjectCatalog34.size();
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog34);
        io.github.agentsoz.jill.struct.AObject aObject82 = aObjectCatalog34.get(10);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(aObject16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(aObject22);
        org.junit.Assert.assertNull(aObject24);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!:-1" + "'", str50.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "hi!" + "'", str69.equals("hi!"));
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "hi!" + "'", str71.equals("hi!"));
        org.junit.Assert.assertTrue(i74 == (-1));
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "hi!" + "'", str77.equals("hi!"));
        org.junit.Assert.assertTrue(i78 == 0);
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertNull(aObject82);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test078");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((int) (byte) 100);
        java.lang.String str6 = aObjectCatalog3.toString();
        int i7 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1:-1", 1, (int) (short) 1);
        int i12 = aObjectCatalog11.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (byte) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog20 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog24 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str25 = aObjectCatalog24.getName();
        aObjectCatalog20.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog24);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog30 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog30.setName("hi!");
        java.lang.String str33 = aObjectCatalog30.getName();
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog30);
        aObjectCatalog16.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog30);
        aObjectCatalog16.setId((int) 'a');
        int i38 = aObjectCatalog16.size();
        io.github.agentsoz.jill.struct.AObject aObject40 = aObjectCatalog16.get(0);
        int i41 = aObjectCatalog16.size();
        aObjectCatalog16.setName("hi!:0");
        java.lang.String str44 = aObjectCatalog16.getName();
        aObjectCatalog11.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        aObjectCatalog16.setId(35);
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog16);
        aObjectCatalog3.setId((int) (byte) 1);
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1:-1" + "'", str6.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(i38 == 1);
        org.junit.Assert.assertNotNull(aObject40);
        org.junit.Assert.assertTrue(i41 == 1);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!:0" + "'", str44.equals("hi!:0"));
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test079");
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
        aObjectCatalog3.setId(97);
        io.github.agentsoz.jill.struct.AObject aObject37 = null;
        try {
            boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, aObject37);
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
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test080");
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
        aObjectCatalog3.setName("hi!:100");
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog3.get((int) 'a');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject33 = aObjectCatalog31.get((-1));
        java.lang.String str34 = aObjectCatalog31.getName();
        aObjectCatalog31.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject38 = aObjectCatalog31.get((int) (byte) 10);
        aObjectCatalog31.setName("");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        io.github.agentsoz.jill.struct.AObject aObject43 = aObjectCatalog3.find(":0:-1");
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertNotNull(aObject23);
        org.junit.Assert.assertNull(aObject27);
        org.junit.Assert.assertNull(aObject33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertNull(aObject38);
        org.junit.Assert.assertNull(aObject43);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test081");
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
        java.lang.String str33 = aObjectCatalog3.getName();
        int i34 = aObjectCatalog3.size();
        java.lang.String str35 = aObjectCatalog3.getName();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(aObject32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!:0" + "'", str33.equals("hi!:0"));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!:0" + "'", str35.equals("hi!:0"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test082");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:35", (int) '4', (int) (byte) 100);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((int) (short) -1);
        org.junit.Assert.assertNull(aObject5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test083");
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
        aObjectCatalog3.setId((int) (short) 0);
        io.github.agentsoz.jill.struct.AObject aObject25 = aObjectCatalog3.get(97);
        int i26 = aObjectCatalog3.size();
        io.github.agentsoz.jill.struct.AObject aObject27 = aObjectCatalog3.pop();
        aObject27.setName("hi!:-1:-1:-1:-1");
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertNull(aObject25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertNotNull(aObject27);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test084");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 10, (int) (byte) 0);
        aObjectCatalog3.setId(1);
        io.github.agentsoz.jill.struct.AObject aObject7 = aObjectCatalog3.find(":-1:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog15 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str16 = aObjectCatalog15.getName();
        aObjectCatalog11.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog15);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog21.setName("hi!");
        java.lang.String str24 = aObjectCatalog21.getName();
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog11, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog21);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        java.lang.String str27 = aObjectCatalog11.getName();
        io.github.agentsoz.jill.struct.AObject aObject29 = aObjectCatalog11.get(0);
        org.junit.Assert.assertNull(aObject7);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject29);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test085");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setId((int) (short) 0);
        aObjectCatalog3.setId((int) '4');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str14 = aObjectCatalog13.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        aObjectCatalog13.setName("hi!:32:0");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test086");
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
        io.github.agentsoz.jill.struct.AObject aObject34 = aObjectCatalog3.get((int) '#');
        io.github.agentsoz.jill.struct.AObject aObject36 = aObjectCatalog3.find("hi!:100:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog40 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog44 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str45 = aObjectCatalog44.getName();
        aObjectCatalog40.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog44);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog50 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog50.setName("hi!");
        java.lang.String str53 = aObjectCatalog50.getName();
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog40, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog50);
        java.lang.String str55 = aObjectCatalog40.toString();
        io.github.agentsoz.jill.struct.AObject aObject56 = aObjectCatalog40.pop();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog40);
        java.lang.String str58 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject60 = aObjectCatalog3.get(100);
        io.github.agentsoz.jill.struct.AObject aObject62 = aObjectCatalog3.find("hi!:97");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(aObject32);
        org.junit.Assert.assertNull(aObject34);
        org.junit.Assert.assertNull(aObject36);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!:-1" + "'", str55.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject56);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!:0:100" + "'", str58.equals("hi!:0:100"));
        org.junit.Assert.assertNull(aObject60);
        org.junit.Assert.assertNull(aObject62);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test087");
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
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog26 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str27 = aObjectCatalog26.getName();
        aObjectCatalog22.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog26);
        io.github.agentsoz.jill.struct.AObject aObject29 = aObjectCatalog22.pop();
        aObjectCatalog22.setId((int) '4');
        aObjectCatalog22.setId((-1));
        int i34 = aObjectCatalog22.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog38 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog42 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str43 = aObjectCatalog42.getName();
        aObjectCatalog38.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog42);
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog42);
        aObjectCatalog42.setName("hi!:32");
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog42);
        java.lang.String str49 = aObjectCatalog3.getName();
        aObjectCatalog3.setName("");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject29);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test088");
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
        aObjectCatalog3.setId(52);
        io.github.agentsoz.jill.struct.AObject aObject44 = aObjectCatalog3.find("hi!:32:0");
        io.github.agentsoz.jill.struct.AObject aObject45 = null;
        try {
            boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject44, aObject45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
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
        org.junit.Assert.assertNull(aObject44);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test089");
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
        io.github.agentsoz.jill.struct.AObject aObject47 = aObjectCatalog41.find("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject49 = aObjectCatalog41.find("hi!:100");
        try {
            java.lang.String str50 = aObject49.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1:-1" + "'", str10.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject22);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNull(aObject47);
        org.junit.Assert.assertNull(aObject49);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test090");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (byte) -1);
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog8 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog8.setId((int) '#');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str19 = aObjectCatalog18.getName();
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        io.github.agentsoz.jill.struct.AObject aObject21 = aObjectCatalog14.pop();
        aObjectCatalog14.setId((int) '4');
        aObjectCatalog14.setId((-1));
        java.lang.String str26 = aObjectCatalog14.toString();
        aObjectCatalog14.setId(100);
        aObjectCatalog8.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject31 = aObjectCatalog14.get((int) '#');
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject34 = aObjectCatalog14.find("hi!:32:0");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject21);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:-1" + "'", str26.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(aObject34);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test091");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1:1", (int) (short) 1, (int) 'a');
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test092");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        io.github.agentsoz.jill.struct.AObject aObject12 = aObjectCatalog3.find("hi!:0");
        java.lang.String str13 = aObjectCatalog3.toString();
        int i14 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 100, (int) (short) 10);
        java.lang.String str19 = aObjectCatalog18.toString();
        int i20 = aObjectCatalog18.size();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        io.github.agentsoz.jill.struct.AObject aObject23 = aObjectCatalog18.find("hi!:0:35:-1");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertNull(aObject12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!:-1" + "'", str13.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:0:-1" + "'", str19.equals("hi!:0:-1"));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(aObject23);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test093");
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
        aObjectCatalog29.setId(1);
        int i43 = aObjectCatalog29.size();
        io.github.agentsoz.jill.struct.AObject aObject45 = aObjectCatalog29.find("hi!:32");
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
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNull(aObject45);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test094");
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
        aObjectCatalog25.setId((int) (short) 1);
        try {
            io.github.agentsoz.jill.struct.AObject aObject32 = aObjectCatalog25.pop();
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
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test095");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog7.get((-1));
        java.lang.String str10 = aObjectCatalog7.getName();
        aObjectCatalog7.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject14 = aObjectCatalog7.get((int) (byte) 10);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        aObjectCatalog7.setName("hi!:0:0");
        aObjectCatalog7.setId((int) (byte) 0);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (byte) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog27 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str32 = aObjectCatalog31.getName();
        aObjectCatalog27.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog37 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog37.setName("hi!");
        java.lang.String str40 = aObjectCatalog37.getName();
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog27, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog37);
        aObjectCatalog23.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog37);
        aObjectCatalog23.setId((int) 'a');
        int i45 = aObjectCatalog23.size();
        io.github.agentsoz.jill.struct.AObject aObject47 = aObjectCatalog23.get(0);
        aObjectCatalog7.push(aObject47);
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNull(aObject14);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(i45 == 1);
        org.junit.Assert.assertNotNull(aObject47);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test096");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        int i4 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog8 = new io.github.agentsoz.jill.util.AObjectCatalog("", (int) (byte) 100, (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog8.get(100);
        java.lang.String str11 = aObjectCatalog8.toString();
        int i12 = aObjectCatalog8.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog8);
        java.lang.String str14 = aObjectCatalog8.getName();
        int i15 = aObjectCatalog8.size();
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
        int i43 = aObjectCatalog19.size();
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog8, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog19);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(aObject10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1" + "'", str11.equals(":-1"));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject26);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test097");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog(":52", 100, 35);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test098");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.find("hi!:-1:1");
        int i7 = aObjectCatalog3.size();
        java.lang.String str8 = aObjectCatalog3.getName();
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
        aObjectCatalog30.setName("hi!:0");
        java.lang.String str34 = aObjectCatalog30.toString();
        aObjectCatalog30.setId(1);
        java.lang.String str37 = aObjectCatalog30.toString();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog30);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(aObject6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!:0:-1" + "'", str34.equals("hi!:0:-1"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!:0:1" + "'", str37.equals("hi!:0:1"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test099");
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
        aObjectCatalog70.setId((int) (byte) 100);
        io.github.agentsoz.jill.struct.AObject aObject78 = aObjectCatalog70.find("hi!:100:1");
        aObjectCatalog70.setName("hi!:0:0:0");
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
        org.junit.Assert.assertNull(aObject78);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test100");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        int i4 = aObjectCatalog3.getId();
        int i5 = aObjectCatalog3.size();
        int i6 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject12 = aObjectCatalog10.get((-1));
        java.lang.String str13 = aObjectCatalog10.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog21 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str22 = aObjectCatalog21.getName();
        aObjectCatalog17.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog21);
        io.github.agentsoz.jill.struct.AObject aObject24 = aObjectCatalog17.pop();
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        java.lang.String str26 = aObjectCatalog10.toString();
        int i27 = aObjectCatalog10.getId();
        int i28 = aObjectCatalog10.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog32 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog32.setName("hi!");
        int i35 = aObjectCatalog32.size();
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog32);
        java.lang.String str37 = aObjectCatalog10.getName();
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog42 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog42.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog48 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog48.setName("hi!");
        aObjectCatalog42.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog48);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog55 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog55.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog61 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog61.setName("hi!");
        java.lang.String str64 = aObjectCatalog61.toString();
        aObjectCatalog55.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog61);
        int i66 = aObjectCatalog61.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog70 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog74 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str75 = aObjectCatalog74.getName();
        aObjectCatalog70.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog74);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog80 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog80.setName("hi!");
        java.lang.String str83 = aObjectCatalog80.getName();
        boolean b84 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog70, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog80);
        java.lang.String str85 = aObjectCatalog70.getName();
        aObjectCatalog70.setName("");
        int i88 = aObjectCatalog70.getId();
        boolean b89 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog61, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog70);
        aObjectCatalog48.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog61);
        java.lang.String str91 = aObjectCatalog48.getName();
        int i92 = aObjectCatalog48.getId();
        int i93 = aObjectCatalog48.size();
        int i94 = aObjectCatalog48.size();
        boolean b95 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog48);
        int i96 = aObjectCatalog48.size();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNull(aObject12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject24);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:-1" + "'", str26.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i27 == (-1));
        org.junit.Assert.assertTrue(i28 == (-1));
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!:-1" + "'", str64.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "hi!" + "'", str75.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "hi!" + "'", str83.equals("hi!"));
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "hi!" + "'", str85.equals("hi!"));
        org.junit.Assert.assertTrue(i88 == (-1));
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "hi!" + "'", str91.equals("hi!"));
        org.junit.Assert.assertTrue(i92 == 0);
        org.junit.Assert.assertTrue(i93 == 0);
        org.junit.Assert.assertTrue(i94 == 0);
        org.junit.Assert.assertTrue(b95 == true);
        org.junit.Assert.assertTrue(i96 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test101");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog9.setName("hi!");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog16 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog16.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog22 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog22.setName("hi!");
        java.lang.String str25 = aObjectCatalog22.toString();
        aObjectCatalog16.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        int i27 = aObjectCatalog22.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog31 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog35 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str36 = aObjectCatalog35.getName();
        aObjectCatalog31.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog35);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog41 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog41.setName("hi!");
        java.lang.String str44 = aObjectCatalog41.getName();
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog31, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog41);
        java.lang.String str46 = aObjectCatalog31.getName();
        aObjectCatalog31.setName("");
        int i49 = aObjectCatalog31.getId();
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog31);
        aObjectCatalog9.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog22);
        int i52 = aObjectCatalog22.size();
        java.lang.String str53 = aObjectCatalog22.toString();
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:-1" + "'", str25.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        org.junit.Assert.assertTrue(i49 == (-1));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!:0" + "'", str53.equals("hi!:0"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test102");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.toString();
        java.lang.String str5 = aObjectCatalog3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test103");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0", (int) '#', (int) '#');
        java.lang.String str4 = aObjectCatalog3.toString();
        java.lang.String str5 = aObjectCatalog3.getName();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:0:0:-1" + "'", str4.equals("hi!:0:0:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:0:0" + "'", str5.equals("hi!:0:0"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test104");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:1", 0, 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test105");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1:1:-1", 35, (int) (byte) 10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test106");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setName("hi!:0");
        aObjectCatalog3.setName("hi!:0:0:-1");
        aObjectCatalog3.setId(97);
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test107");
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
        io.github.agentsoz.jill.struct.AObject aObject72 = aObjectCatalog20.get(0);
        aObjectCatalog20.setId(0);
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
        org.junit.Assert.assertNotNull(aObject72);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test108");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100:1", (int) (byte) 10, (int) (byte) 0);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        int i9 = aObjectCatalog7.getId();
        aObjectCatalog7.setId((int) (short) 0);
        io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog7.get((-1));
        try {
            boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, aObject13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNull(aObject13);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test109");
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
        int i59 = aObjectCatalog25.getId();
        io.github.agentsoz.jill.struct.AObject aObject61 = aObjectCatalog25.find(":0:1");
        io.github.agentsoz.jill.struct.AObject aObject63 = aObjectCatalog25.find("hi!:0:0:-1");
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
        org.junit.Assert.assertTrue(i59 == (-1));
        org.junit.Assert.assertNull(aObject61);
        org.junit.Assert.assertNull(aObject63);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test110");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) ' ');
        java.lang.String str9 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog17 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str18 = aObjectCatalog17.getName();
        aObjectCatalog13.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog17);
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog13.pop();
        aObjectCatalog13.setId((int) '4');
        aObjectCatalog13.setId((-1));
        int i25 = aObjectCatalog13.size();
        java.lang.String str26 = aObjectCatalog13.toString();
        io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog13.find("hi!:0:0:97");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog32 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str33 = aObjectCatalog32.getName();
        java.lang.String str34 = aObjectCatalog32.toString();
        aObjectCatalog32.setName("hi!");
        int i37 = aObjectCatalog32.size();
        aObjectCatalog13.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog32);
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:32" + "'", str9.equals("hi!:32"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject20);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:-1" + "'", str26.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject28);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!:-1" + "'", str34.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test111");
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
        io.github.agentsoz.jill.struct.AObject aObject28 = aObjectCatalog9.get(100);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject16);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!:-1" + "'", str21.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject26);
        org.junit.Assert.assertNull(aObject28);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test112");
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
        int i20 = aObjectCatalog3.getId();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!:-1" + "'", str18.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i20 == (-1));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test113");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:35", 35, 0);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("", 0, (int) (byte) 100);
        int i8 = aObjectCatalog7.getId();
        aObjectCatalog7.setName("hi!:97");
        io.github.agentsoz.jill.struct.AObject aObject12 = aObjectCatalog7.get((int) (byte) 1);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject15 = aObjectCatalog7.find("hi!:1");
        try {
            io.github.agentsoz.jill.struct.AObject aObject16 = aObjectCatalog7.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(aObject12);
        org.junit.Assert.assertNull(aObject15);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test114");
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
        java.lang.String str49 = aObjectCatalog41.toString();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!:0" + "'", str49.equals("hi!:0"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test115");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        int i5 = aObjectCatalog3.getId();
        aObjectCatalog3.setId((int) (short) 0);
        aObjectCatalog3.setId((int) '4');
        io.github.agentsoz.jill.struct.AObject aObject11 = aObjectCatalog3.find("hi!:-1:-1");
        int i12 = aObjectCatalog3.size();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(aObject11);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test116");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:100:1:0", (int) ' ', (int) (short) 100);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test117");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog9 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog9.setName("hi!");
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9);
        int i13 = aObjectCatalog9.getId();
        aObjectCatalog9.setId((int) (short) 0);
        aObjectCatalog9.setName("");
        aObjectCatalog9.setId((int) (byte) 0);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 0, (int) (byte) 1);
        java.lang.String str24 = aObjectCatalog23.getName();
        io.github.agentsoz.jill.struct.AObject aObject26 = aObjectCatalog23.find("hi!:-1:-1");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog30 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog34 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str35 = aObjectCatalog34.getName();
        aObjectCatalog30.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog34);
        io.github.agentsoz.jill.struct.AObject aObject37 = aObjectCatalog30.pop();
        aObjectCatalog30.setId((int) '4');
        aObjectCatalog30.setId((-1));
        int i42 = aObjectCatalog30.size();
        aObjectCatalog30.setId((int) (short) 10);
        aObjectCatalog23.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog30);
        io.github.agentsoz.jill.struct.AObject aObject47 = aObjectCatalog30.get((int) (byte) 10);
        java.lang.String str48 = aObjectCatalog30.getName();
        io.github.agentsoz.jill.struct.AObject aObject50 = aObjectCatalog30.get((int) (short) 100);
        try {
            boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog9, aObject50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNull(aObject26);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject37);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNull(aObject47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        org.junit.Assert.assertNull(aObject50);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test118");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog(":10", 97, (int) (short) 10);
        java.lang.String str4 = aObjectCatalog3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":10:-1" + "'", str4.equals(":10:-1"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test119");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.struct.AObject aObject10 = aObjectCatalog3.pop();
        aObjectCatalog3.setId((int) '4');
        aObjectCatalog3.setId((-1));
        int i15 = aObjectCatalog3.size();
        int i16 = aObjectCatalog3.getId();
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
        int i37 = aObjectCatalog20.getId();
        int i38 = aObjectCatalog20.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog42 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog42.setName("hi!");
        int i45 = aObjectCatalog42.size();
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog42);
        java.lang.String str47 = aObjectCatalog20.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog51 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", (int) (byte) 1, (int) (short) 100);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog55 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:-1", (int) (byte) 1, 0);
        io.github.agentsoz.jill.struct.AObject aObject57 = aObjectCatalog55.get((int) (byte) 100);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog61 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog61.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog67 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) '4', (int) 'a');
        aObjectCatalog67.setName("hi!");
        aObjectCatalog61.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog67);
        aObjectCatalog55.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog67);
        boolean b72 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog51, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog67);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog76 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog76.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog82 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog82.setName("hi!");
        java.lang.String str85 = aObjectCatalog82.toString();
        aObjectCatalog76.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog82);
        aObjectCatalog82.setName("hi!:-1:-1");
        aObjectCatalog51.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog82);
        boolean b90 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog82);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog20);
        java.lang.String str92 = aObjectCatalog3.toString();
        aObjectCatalog3.setId(10);
        io.github.agentsoz.jill.struct.AObject aObject95 = aObjectCatalog3.pop();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject10);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertNull(aObject22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject34);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!:-1" + "'", str36.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i37 == (-1));
        org.junit.Assert.assertTrue(i38 == (-1));
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        org.junit.Assert.assertNull(aObject57);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "hi!:-1" + "'", str85.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "hi!:-1" + "'", str92.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject95);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test120");
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
        io.github.agentsoz.jill.struct.AObject aObject20 = aObjectCatalog3.find("hi!:0:0:0");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNull(aObject20);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test121");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str8 = aObjectCatalog7.getName();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog13 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog13.setName("hi!");
        java.lang.String str16 = aObjectCatalog13.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog13);
        java.lang.String str18 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject19 = aObjectCatalog3.pop();
        java.lang.String str20 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog3.find("hi!:1");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!:-1" + "'", str18.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(aObject19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNull(aObject22);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test122");
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
        int i57 = aObjectCatalog3.size();
        java.lang.String str58 = aObjectCatalog3.getName();
        try {
            io.github.agentsoz.jill.struct.AObject aObject59 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
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
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test123");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog(":-1", 0, (int) (byte) 100);
        aObjectCatalog3.setName("hi!:-1:-1");
        aObjectCatalog3.setId((int) (short) 0);
        java.lang.String str8 = aObjectCatalog3.toString();
        aObjectCatalog3.setId((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:-1:-1:0" + "'", str8.equals("hi!:-1:-1:0"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test124");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog7 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject9 = aObjectCatalog7.get((-1));
        java.lang.String str10 = aObjectCatalog7.getName();
        aObjectCatalog7.setName("hi!:0");
        io.github.agentsoz.jill.struct.AObject aObject14 = aObjectCatalog7.get((int) (byte) 10);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog7);
        int i16 = aObjectCatalog7.getId();
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNull(aObject14);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test125");
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
        aObjectCatalog3.setId((int) (short) 0);
        io.github.agentsoz.jill.struct.AObject aObject25 = aObjectCatalog3.get(97);
        int i26 = aObjectCatalog3.size();
        aObjectCatalog3.setName(":-1");
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertNull(aObject25);
        org.junit.Assert.assertTrue(i26 == 1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test126");
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
        aObjectCatalog3.setId((-1));
        int i25 = aObjectCatalog3.getId();
        java.lang.String str26 = aObjectCatalog3.toString();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:-1" + "'", str26.equals("hi!:-1"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test127");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (byte) -1);
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog8 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0", 10, 1);
        aObjectCatalog8.setId((int) '#');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str19 = aObjectCatalog18.getName();
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        io.github.agentsoz.jill.struct.AObject aObject21 = aObjectCatalog14.pop();
        aObjectCatalog14.setId((int) '4');
        aObjectCatalog14.setId((-1));
        java.lang.String str26 = aObjectCatalog14.toString();
        aObjectCatalog14.setId(100);
        aObjectCatalog8.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.struct.AObject aObject31 = aObjectCatalog14.get((int) '#');
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog14);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog36 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog40 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str41 = aObjectCatalog40.getName();
        aObjectCatalog36.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog40);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog46 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog46.setName("hi!");
        java.lang.String str49 = aObjectCatalog46.getName();
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog36, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog46);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog54 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog36, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog54);
        int i56 = aObjectCatalog36.size();
        java.lang.String str57 = aObjectCatalog36.toString();
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog36);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject21);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:-1" + "'", str26.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(i56 == 1);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!:-1" + "'", str57.equals("hi!:-1"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test128");
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
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog24 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str25 = aObjectCatalog24.getName();
        java.lang.String str26 = aObjectCatalog24.toString();
        aObjectCatalog24.setName("hi!");
        int i29 = aObjectCatalog24.getId();
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog24);
        aObjectCatalog3.setId((int) (short) 1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog36 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog36.setName("hi!");
        java.lang.String str39 = aObjectCatalog36.getName();
        io.github.agentsoz.jill.struct.AObject aObject41 = aObjectCatalog36.get(0);
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog36);
        try {
            io.github.agentsoz.jill.struct.AObject aObject43 = aObjectCatalog36.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:-1" + "'", str26.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        org.junit.Assert.assertNull(aObject41);
        org.junit.Assert.assertTrue(b42 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test129");
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
        int i23 = aObjectCatalog3.size();
        aObjectCatalog3.setId((int) (short) 1);
        int i26 = aObjectCatalog3.size();
        aObjectCatalog3.setName(":0");
        io.github.agentsoz.jill.struct.AObject aObject29 = null;
        aObjectCatalog3.push(aObject29);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertTrue(i26 == 1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test130");
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
        java.lang.String str38 = aObjectCatalog3.getName();
        aObjectCatalog3.setName("hi!:0:35:-1");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:0" + "'", str14.equals("hi!:0"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1" + "'", str27.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!:0" + "'", str31.equals("hi!:0"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test131");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0:-1:-1", (int) (byte) 0, 0);
        java.lang.String str4 = aObjectCatalog3.getName();
        try {
            io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:0:0:-1:-1" + "'", str4.equals("hi!:0:0:-1:-1"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test132");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((-1));
        java.lang.String str6 = aObjectCatalog3.getName();
        aObjectCatalog3.setId((int) ' ');
        aObjectCatalog3.setId((int) '4');
        io.github.agentsoz.jill.struct.AObject aObject12 = aObjectCatalog3.find("hi!:-1:1");
        int i13 = aObjectCatalog3.size();
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject12);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test133");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog8 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog8.setName("hi!");
        io.github.agentsoz.jill.struct.AObject aObject11 = null;
        aObjectCatalog8.push(aObject11);
        int i13 = aObjectCatalog8.size();
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog8);
        int i15 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog19 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog23 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str24 = aObjectCatalog23.getName();
        aObjectCatalog19.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog23);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog29 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog29.setName("hi!");
        java.lang.String str32 = aObjectCatalog29.getName();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog29);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog37 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog19, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog37);
        aObjectCatalog37.setName("hi!:0");
        java.lang.String str41 = aObjectCatalog37.toString();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog45 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog45.setName("hi!");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog51 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog51.setName("hi!");
        java.lang.String str54 = aObjectCatalog51.toString();
        aObjectCatalog45.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog51);
        int i56 = aObjectCatalog51.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog60 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog64 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str65 = aObjectCatalog64.getName();
        aObjectCatalog60.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog64);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog70 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog70.setName("hi!");
        java.lang.String str73 = aObjectCatalog70.getName();
        boolean b74 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog60, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog70);
        java.lang.String str75 = aObjectCatalog60.getName();
        aObjectCatalog60.setName("");
        int i78 = aObjectCatalog60.getId();
        boolean b79 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog51, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog60);
        io.github.agentsoz.jill.struct.AObject aObject81 = aObjectCatalog60.find("hi!:0:-1");
        io.github.agentsoz.jill.struct.AObject aObject83 = aObjectCatalog60.get(10);
        boolean b84 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog37, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog60);
        io.github.agentsoz.jill.struct.AObject aObject86 = aObjectCatalog37.find(":-1:-1");
        io.github.agentsoz.jill.struct.AObject aObject88 = aObjectCatalog37.get((int) (byte) 1);
        aObjectCatalog3.push(aObject88);
        aObjectCatalog3.setName("hi!:100:1");
        aObjectCatalog3.setName("hi!:0:0:0");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!:0:-1" + "'", str41.equals("hi!:0:-1"));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!:-1" + "'", str54.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "hi!" + "'", str65.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "hi!" + "'", str73.equals("hi!"));
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "hi!" + "'", str75.equals("hi!"));
        org.junit.Assert.assertTrue(i78 == (-1));
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNull(aObject81);
        org.junit.Assert.assertNull(aObject83);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNull(aObject86);
        org.junit.Assert.assertNull(aObject88);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test134");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog3.setName("hi!");
        java.lang.String str6 = aObjectCatalog3.getName();
        int i7 = aObjectCatalog3.size();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog11 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject13 = aObjectCatalog11.get((-1));
        java.lang.String str14 = aObjectCatalog11.getName();
        aObjectCatalog11.setId((int) ' ');
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog3, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog11);
        aObjectCatalog11.setName(":-1");
        java.lang.String str20 = aObjectCatalog11.toString();
        io.github.agentsoz.jill.struct.AObject aObject22 = aObjectCatalog11.find("hi!:-1:-1:100");
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(aObject13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + ":-1:32" + "'", str20.equals(":-1:32"));
        org.junit.Assert.assertNull(aObject22);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test135");
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
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog62 = new io.github.agentsoz.jill.util.AObjectCatalog(":-1", 100, (int) ' ');
        int i63 = aObjectCatalog62.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog67 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0", (int) ' ', (int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject69 = aObjectCatalog67.find("");
        boolean b70 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog62, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog67);
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog67);
        try {
            io.github.agentsoz.jill.struct.AObject aObject72 = aObjectCatalog67.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
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
        org.junit.Assert.assertTrue(i63 == (-1));
        org.junit.Assert.assertNull(aObject69);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test136");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (byte) 1, (int) (byte) 1);
        java.lang.String str4 = aObjectCatalog3.toString();
        io.github.agentsoz.jill.struct.AObject aObject6 = aObjectCatalog3.get((int) (byte) 10);
        aObjectCatalog3.setId((int) (byte) 0);
        aObjectCatalog3.setName("hi!:0:0:0:-1");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertNull(aObject6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test137");
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
        int i44 = aObjectCatalog3.getId();
        int i45 = aObjectCatalog3.size();
        org.junit.Assert.assertNull(aObject9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1:-1" + "'", str10.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject22);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(i44 == (-1));
        org.junit.Assert.assertTrue(i45 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test138");
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
        io.github.agentsoz.jill.struct.AObject aObject39 = aObjectCatalog3.find("hi!:0:0:0");
        aObjectCatalog3.setId(100);
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(aObject10);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject33);
        org.junit.Assert.assertNull(aObject39);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test139");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", 32, 10);
        java.lang.String str4 = aObjectCatalog3.getName();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog8 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog12 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str13 = aObjectCatalog12.getName();
        aObjectCatalog8.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog12);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog18.setName("hi!");
        java.lang.String str21 = aObjectCatalog18.getName();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog8, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        java.lang.String str23 = aObjectCatalog8.toString();
        java.lang.String str24 = aObjectCatalog8.toString();
        java.lang.String str25 = aObjectCatalog8.getName();
        io.github.agentsoz.jill.struct.AObject aObject26 = aObjectCatalog8.pop();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog30 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.struct.AObject aObject32 = aObjectCatalog30.find("hi!");
        io.github.agentsoz.jill.struct.AObject aObject34 = aObjectCatalog30.get((int) (short) 0);
        java.lang.String str35 = aObjectCatalog30.getName();
        aObjectCatalog30.setId(0);
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject26, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog30);
        java.lang.String str39 = aObject26.getName();
        aObjectCatalog3.push(aObject26);
        io.github.agentsoz.jill.struct.AObject aObject42 = aObjectCatalog3.find("hi!:-1:-1:-1");
        int i43 = aObjectCatalog3.size();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:-1" + "'", str23.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!:-1" + "'", str24.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertNotNull(aObject26);
        org.junit.Assert.assertNull(aObject32);
        org.junit.Assert.assertNull(aObject34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        org.junit.Assert.assertNull(aObject42);
        org.junit.Assert.assertTrue(i43 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectCatalogRegressionTest4.test140");
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog3 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!:0:0:-1", (int) (byte) 0, (int) (byte) -1);
        io.github.agentsoz.jill.struct.AObject aObject5 = aObjectCatalog3.get((int) '#');
        int i6 = aObjectCatalog3.getId();
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog10 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) (short) 1, (int) (byte) -1);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog14 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog18 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        java.lang.String str19 = aObjectCatalog18.getName();
        aObjectCatalog14.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog18);
        io.github.agentsoz.jill.util.AObjectCatalog aObjectCatalog24 = new io.github.agentsoz.jill.util.AObjectCatalog("hi!", (int) 'a', (int) ' ');
        aObjectCatalog24.setName("hi!");
        java.lang.String str27 = aObjectCatalog24.getName();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) aObjectCatalog14, (io.github.agentsoz.jill.struct.AObject) aObjectCatalog24);
        aObjectCatalog10.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog24);
        aObjectCatalog10.setId((int) 'a');
        int i32 = aObjectCatalog10.size();
        int i33 = aObjectCatalog10.getId();
        aObjectCatalog10.setId((int) (short) 10);
        io.github.agentsoz.jill.struct.AObject aObject37 = aObjectCatalog10.get(52);
        aObjectCatalog3.push((io.github.agentsoz.jill.struct.AObject) aObjectCatalog10);
        org.junit.Assert.assertNull(aObject5);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertTrue(i33 == 97);
        org.junit.Assert.assertNull(aObject37);
    }
}

