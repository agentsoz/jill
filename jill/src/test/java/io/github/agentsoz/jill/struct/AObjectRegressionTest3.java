package io.github.agentsoz.jill.struct;

/*
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
public class AObjectRegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test001");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.toString();
        java.lang.String str20 = aObject13.getName();
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject24 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject24);
        int i26 = aObject22.getId();
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject30 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject28, aObject30);
        java.lang.String str32 = aObject28.getName();
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject28, aObject34);
        io.github.agentsoz.jill.struct.AObject aObject37 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, aObject37);
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject34);
        int i40 = aObject22.getId();
        java.lang.String str41 = aObject22.getName();
        io.github.agentsoz.jill.struct.AObject aObject43 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject43.setId((int) '#');
        java.lang.String str46 = aObject43.toString();
        io.github.agentsoz.jill.struct.AObject aObject48 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject50 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject50);
        int i52 = aObject48.getId();
        io.github.agentsoz.jill.struct.AObject aObject54 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject56 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject54, aObject56);
        java.lang.String str58 = aObject54.getName();
        io.github.agentsoz.jill.struct.AObject aObject60 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject54, aObject60);
        io.github.agentsoz.jill.struct.AObject aObject63 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b64 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject60, aObject63);
        boolean b65 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject60);
        java.lang.String str66 = aObject60.toString();
        aObject60.setName("hi!:-1");
        java.lang.String str69 = aObject60.getName();
        boolean b70 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject43, aObject60);
        boolean b71 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject43);
        java.lang.String str72 = aObject43.toString();
        io.github.agentsoz.jill.struct.AObject aObject74 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject76 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b77 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject74, aObject76);
        java.lang.String str78 = aObject74.getName();
        io.github.agentsoz.jill.struct.AObject aObject80 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b81 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject74, aObject80);
        io.github.agentsoz.jill.struct.AObject aObject83 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b84 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject80, aObject83);
        aObject80.setId((int) (short) 1);
        boolean b87 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject43, aObject80);
        boolean b88 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject80);
        aObject13.setName(":-1:100:0");
        java.lang.String str91 = aObject13.getName();
        aObject13.setName("hi!");
        java.lang.String str94 = aObject13.getName();
        java.lang.String str95 = aObject13.toString();
        java.lang.String str96 = aObject13.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == (-1));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!:-1:35" + "'", str46.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i52 == (-1));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + ":-1" + "'", str66.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "hi!:-1" + "'", str69.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!:-1:35" + "'", str72.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "" + "'", str78.equals(""));
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + ":-1:100:0" + "'", str91.equals(":-1:100:0"));
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "hi!" + "'", str94.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + "hi!:-1" + "'", str95.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str96 + "' != '" + "hi!" + "'", str96.equals("hi!"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test002");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        int i12 = aObject7.getId();
        aObject7.setId((int) (byte) 100);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject16, aObject18);
        java.lang.String str20 = aObject16.getName();
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject16, aObject22);
        java.lang.String str24 = aObject16.getName();
        aObject16.setName("hi!");
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject28.setId((int) '#');
        java.lang.String str31 = aObject28.toString();
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject16, aObject28);
        aObject16.setName("");
        aObject16.setName(":-1:100");
        io.github.agentsoz.jill.struct.AObject aObject38 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject38.setName("hi!:-1:-1");
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject16, aObject38);
        aObject38.setId((int) (short) 10);
        aObject38.setName(":1:-1");
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject38);
        aObject7.setName("hi!:-1:-1:10");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!:-1:35" + "'", str31.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test003");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!");
        java.lang.String str2 = aObject1.toString();
        int i3 = aObject1.getId();
        java.lang.String str4 = aObject1.toString();
        java.lang.String str5 = aObject1.toString();
        int i6 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject8 = new io.github.agentsoz.jill.struct.AObject("");
        java.lang.String str9 = aObject8.getName();
        int i10 = aObject8.getId();
        java.lang.String str11 = aObject8.toString();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject15);
        java.lang.String str17 = aObject13.getName();
        aObject13.setId((int) (byte) -1);
        aObject13.setName(":1");
        java.lang.String str22 = aObject13.getName();
        aObject13.setName(":10");
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject13);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!:-1" + "'", str2.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1" + "'", str11.equals(":-1"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + ":1" + "'", str22.equals(":1"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test004");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        java.lang.String str21 = aObject15.toString();
        aObject15.setName("hi!:-1");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        aObject15.setName(":-1");
        aObject15.setId(100);
        aObject15.setId(35);
        io.github.agentsoz.jill.struct.AObject aObject32 = new io.github.agentsoz.jill.struct.AObject("hi!");
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject32);
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject37 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject35, aObject37);
        java.lang.String str39 = aObject35.getName();
        io.github.agentsoz.jill.struct.AObject aObject41 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject35, aObject41);
        io.github.agentsoz.jill.struct.AObject aObject44 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject41, aObject44);
        java.lang.String str46 = aObject44.getName();
        aObject44.setName("hi!:52");
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject44);
        io.github.agentsoz.jill.struct.AObject aObject51 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject53 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject51, aObject53);
        java.lang.String str55 = aObject51.getName();
        io.github.agentsoz.jill.struct.AObject aObject57 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject51, aObject57);
        io.github.agentsoz.jill.struct.AObject aObject60 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject57, aObject60);
        io.github.agentsoz.jill.struct.AObject aObject63 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject63.setName("");
        boolean b66 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject60, aObject63);
        aObject60.setId((int) (short) 10);
        java.lang.String str69 = aObject60.getName();
        aObject60.setName(":100:-1");
        io.github.agentsoz.jill.struct.AObject aObject73 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject75 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b76 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject73, aObject75);
        int i77 = aObject73.getId();
        io.github.agentsoz.jill.struct.AObject aObject79 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject81 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b82 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject79, aObject81);
        java.lang.String str83 = aObject79.getName();
        io.github.agentsoz.jill.struct.AObject aObject85 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b86 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject79, aObject85);
        io.github.agentsoz.jill.struct.AObject aObject88 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b89 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject85, aObject88);
        boolean b90 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject73, aObject85);
        java.lang.String str91 = aObject85.toString();
        aObject85.setName("hi!:-1");
        aObject85.setId((int) ' ');
        boolean b96 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject60, aObject85);
        boolean b97 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject85);
        java.lang.String str98 = aObject15.getName();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "" + "'", str69.equals(""));
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(i77 == (-1));
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "" + "'", str83.equals(""));
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + ":-1" + "'", str91.equals(":-1"));
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertTrue(b97 == false);
        org.junit.Assert.assertTrue("'" + str98 + "' != '" + ":-1" + "'", str98.equals(":-1"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test005");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        java.lang.String str12 = aObject7.toString();
        aObject7.setId((-1));
        aObject7.setName(":0");
        java.lang.String str17 = aObject7.toString();
        io.github.agentsoz.jill.struct.AObject aObject19 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject19, aObject21);
        int i23 = aObject19.getId();
        io.github.agentsoz.jill.struct.AObject aObject25 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject25, aObject27);
        java.lang.String str29 = aObject25.getName();
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject25, aObject31);
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject34);
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject19, aObject31);
        java.lang.String str37 = aObject31.toString();
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject41 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject41);
        java.lang.String str43 = aObject39.getName();
        io.github.agentsoz.jill.struct.AObject aObject45 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject45);
        java.lang.String str47 = aObject39.getName();
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject39);
        java.lang.String str49 = aObject31.toString();
        int i50 = aObject31.getId();
        int i51 = aObject31.getId();
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject31);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1" + "'", str12.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":0:-1" + "'", str17.equals(":0:-1"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + ":-1" + "'", str37.equals(":-1"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + ":-1" + "'", str49.equals(":-1"));
        org.junit.Assert.assertTrue(i50 == (-1));
        org.junit.Assert.assertTrue(i51 == (-1));
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test006");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1:-1");
        aObject1.setName("hi!:-1");
        aObject1.setName("hi!:-1:-1");
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        java.lang.String str12 = aObject7.toString();
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject16);
        java.lang.String str18 = aObject14.getName();
        io.github.agentsoz.jill.struct.AObject aObject20 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject20);
        java.lang.String str22 = aObject20.getName();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject20);
        aObject20.setName("hi!");
        java.lang.String str26 = aObject20.getName();
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject30 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject28, aObject30);
        int i32 = aObject28.getId();
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, aObject36);
        java.lang.String str38 = aObject34.getName();
        io.github.agentsoz.jill.struct.AObject aObject40 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, aObject40);
        io.github.agentsoz.jill.struct.AObject aObject43 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject40, aObject43);
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject28, aObject40);
        java.lang.String str46 = aObject40.toString();
        io.github.agentsoz.jill.struct.AObject aObject48 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject50 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject50);
        java.lang.String str52 = aObject48.getName();
        io.github.agentsoz.jill.struct.AObject aObject54 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject54);
        java.lang.String str56 = aObject48.getName();
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject40, aObject48);
        io.github.agentsoz.jill.struct.AObject aObject59 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject61 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject63 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b64 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject61, aObject63);
        int i65 = aObject61.getId();
        io.github.agentsoz.jill.struct.AObject aObject67 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject69 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b70 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject67, aObject69);
        java.lang.String str71 = aObject67.getName();
        io.github.agentsoz.jill.struct.AObject aObject73 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b74 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject67, aObject73);
        io.github.agentsoz.jill.struct.AObject aObject76 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b77 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject73, aObject76);
        boolean b78 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject61, aObject73);
        java.lang.String str79 = aObject73.toString();
        aObject73.setName("hi!:-1");
        boolean b82 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject59, aObject73);
        aObject73.setName(":-1");
        aObject73.setId(100);
        boolean b87 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject73);
        boolean b88 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject20, aObject73);
        aObject73.setName(":-1");
        aObject73.setName("hi!:-1:1");
        io.github.agentsoz.jill.struct.AObject aObject94 = new io.github.agentsoz.jill.struct.AObject(":-1:100");
        java.lang.String str95 = aObject94.getName();
        boolean b96 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject73, aObject94);
        boolean b97 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject73);
        java.lang.String str98 = aObject1.toString();
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1" + "'", str12.equals(":-1"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + ":-1" + "'", str46.equals(":-1"));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i65 == (-1));
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + ":-1" + "'", str79.equals(":-1"));
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + ":-1:100" + "'", str95.equals(":-1:100"));
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertTrue(b97 == false);
        org.junit.Assert.assertTrue("'" + str98 + "' != '" + "hi!:-1:-1:-1" + "'", str98.equals("hi!:-1:-1:-1"));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test007");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.getName();
        int i20 = aObject13.getId();
        java.lang.String str21 = aObject13.toString();
        aObject13.setName(":-1:32");
        io.github.agentsoz.jill.struct.AObject aObject25 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject25, aObject27);
        int i29 = aObject25.getId();
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject33);
        java.lang.String str35 = aObject31.getName();
        io.github.agentsoz.jill.struct.AObject aObject37 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject37);
        io.github.agentsoz.jill.struct.AObject aObject40 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject37, aObject40);
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject25, aObject37);
        java.lang.String str43 = aObject37.getName();
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject37);
        java.lang.String str45 = aObject13.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + ":-1:32" + "'", str45.equals(":-1:32"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test008");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        java.lang.String str21 = aObject15.toString();
        aObject15.setName("hi!:-1");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        aObject15.setName(":-1");
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject28);
        aObject28.setName("hi!");
        aObject28.setName("hi!:52");
        java.lang.String str34 = aObject28.getName();
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject38 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject36, aObject38);
        java.lang.String str40 = aObject36.getName();
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject36, aObject42);
        io.github.agentsoz.jill.struct.AObject aObject45 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject42, aObject45);
        io.github.agentsoz.jill.struct.AObject aObject48 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject48.setName("");
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject45, aObject48);
        aObject45.setId((int) (short) 10);
        int i54 = aObject45.getId();
        int i55 = aObject45.getId();
        java.lang.String str56 = aObject45.getName();
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject28, aObject45);
        aObject28.setName("hi!:1");
        int i60 = aObject28.getId();
        java.lang.String str61 = aObject28.getName();
        java.lang.String str62 = aObject28.getName();
        int i63 = aObject28.getId();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!:52" + "'", str34.equals("hi!:52"));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i54 == 10);
        org.junit.Assert.assertTrue(i55 == 10);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(i60 == (-1));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!:1" + "'", str61.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "hi!:1" + "'", str62.equals("hi!:1"));
        org.junit.Assert.assertTrue(i63 == (-1));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test009");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        java.lang.String str7 = aObject3.getName();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject9);
        io.github.agentsoz.jill.struct.AObject aObject12 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject12);
        int i14 = aObject9.getId();
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject9);
        java.lang.String str16 = aObject9.getName();
        java.lang.String str17 = aObject9.toString();
        java.lang.String str18 = aObject9.toString();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test010");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        java.lang.String str21 = aObject15.toString();
        aObject15.setName("hi!:-1");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        aObject15.setName(":-1");
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject28);
        aObject28.setName("hi!");
        aObject28.setName("hi!:52");
        java.lang.String str34 = aObject28.getName();
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject38 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject36, aObject38);
        int i40 = aObject36.getId();
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject44 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject42, aObject44);
        java.lang.String str46 = aObject42.getName();
        io.github.agentsoz.jill.struct.AObject aObject48 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject42, aObject48);
        io.github.agentsoz.jill.struct.AObject aObject51 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject51);
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject36, aObject48);
        aObject48.setName("");
        aObject48.setId((int) (short) 0);
        int i58 = aObject48.getId();
        java.lang.String str59 = aObject48.getName();
        java.lang.String str60 = aObject48.toString();
        aObject48.setId((int) (short) 100);
        java.lang.String str63 = aObject48.toString();
        java.lang.String str64 = aObject48.toString();
        java.lang.String str65 = aObject48.getName();
        int i66 = aObject48.getId();
        int i67 = aObject48.getId();
        boolean b68 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject28, aObject48);
        java.lang.String str69 = aObject48.getName();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!:52" + "'", str34.equals("hi!:52"));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == (-1));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + ":0" + "'", str60.equals(":0"));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + ":100" + "'", str63.equals(":100"));
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + ":100" + "'", str64.equals(":100"));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        org.junit.Assert.assertTrue(i66 == 100);
        org.junit.Assert.assertTrue(i67 == 100);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "" + "'", str69.equals(""));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test011");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1:35:-1:-1:-1");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test012");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.toString();
        aObject13.setId(0);
        java.lang.String str22 = aObject13.toString();
        aObject13.setId((int) (short) 1);
        aObject13.setId((int) (short) 100);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + ":0" + "'", str22.equals(":0"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test013");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        java.lang.String str7 = aObject3.getName();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject9);
        io.github.agentsoz.jill.struct.AObject aObject12 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject12);
        int i14 = aObject9.getId();
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject9);
        java.lang.String str16 = aObject1.toString();
        java.lang.String str17 = aObject1.toString();
        aObject1.setName("hi!:-1:-1");
        aObject1.setName(":-1:52:-1:-1");
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject25 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject23, aObject25);
        java.lang.String str27 = aObject23.getName();
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject23, aObject29);
        io.github.agentsoz.jill.struct.AObject aObject32 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject29, aObject32);
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject35.setName("");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject32, aObject35);
        aObject32.setId((int) (short) 10);
        int i41 = aObject32.getId();
        int i42 = aObject32.getId();
        java.lang.String str43 = aObject32.getName();
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject32);
        java.lang.String str45 = aObject32.getName();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":-1" + "'", str16.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i41 == 10);
        org.junit.Assert.assertTrue(i42 == 10);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test014");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        aObject1.setId((int) (byte) -1);
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        int i13 = aObject9.getId();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject17 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject17);
        java.lang.String str19 = aObject15.getName();
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject21);
        io.github.agentsoz.jill.struct.AObject aObject24 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject24);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject21);
        java.lang.String str27 = aObject21.toString();
        aObject21.setName("hi!:-1");
        java.lang.String str30 = aObject21.getName();
        aObject21.setId((int) ' ');
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject21);
        int i34 = aObject1.getId();
        java.lang.String str35 = aObject1.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1" + "'", str30.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test015");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        java.lang.String str2 = aObject1.toString();
        java.lang.String str3 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject5, aObject7);
        java.lang.String str9 = aObject5.getName();
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject5, aObject11);
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject11, aObject14);
        java.lang.String str16 = aObject14.getName();
        java.lang.String str17 = aObject14.getName();
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject14);
        aObject14.setName("hi!:-1:35:97:1");
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject22.setId((int) '#');
        java.lang.String str25 = aObject22.toString();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject29);
        int i31 = aObject27.getId();
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject35);
        java.lang.String str37 = aObject33.getName();
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject39);
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject42);
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject39);
        java.lang.String str45 = aObject39.toString();
        aObject39.setName("hi!:-1");
        java.lang.String str48 = aObject39.getName();
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject39);
        java.lang.String str50 = aObject39.toString();
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject39);
        aObject14.setName(":32");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ":-1" + "'", str2.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:-1:35" + "'", str25.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + ":-1" + "'", str45.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!:-1" + "'", str48.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!:-1:-1" + "'", str50.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test016");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        int i2 = aObject1.getId();
        aObject1.setName(":-1:52:-1");
        java.lang.String str5 = aObject1.getName();
        aObject1.setName(":97");
        aObject1.setName(":32");
        java.lang.String str10 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject12 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject12, aObject14);
        int i16 = aObject14.getId();
        java.lang.String str17 = aObject14.getName();
        aObject14.setName(":-1:100:-1");
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject14);
        java.lang.String str21 = aObject14.getName();
        org.junit.Assert.assertTrue(i2 == (-1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ":-1:52:-1" + "'", str5.equals(":-1:52:-1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ":32:-1" + "'", str10.equals(":32:-1"));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1:100:-1" + "'", str21.equals(":-1:100:-1"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test017");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.toString();
        aObject13.setName("hi!:-1");
        aObject13.setName("");
        aObject13.setName("hi!:-1:35");
        aObject13.setId((int) 'a');
        java.lang.String str28 = aObject13.getName();
        io.github.agentsoz.jill.struct.AObject aObject30 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject32 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject30, aObject32);
        java.lang.String str34 = aObject30.getName();
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject30, aObject36);
        java.lang.String str38 = aObject30.getName();
        aObject30.setName("hi!");
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject42.setId((int) '#');
        java.lang.String str45 = aObject42.toString();
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject30, aObject42);
        boolean b47 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject42);
        io.github.agentsoz.jill.struct.AObject aObject49 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject51 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject49, aObject51);
        int i53 = aObject49.getId();
        io.github.agentsoz.jill.struct.AObject aObject55 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject57 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject55, aObject57);
        java.lang.String str59 = aObject55.getName();
        io.github.agentsoz.jill.struct.AObject aObject61 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b62 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject55, aObject61);
        io.github.agentsoz.jill.struct.AObject aObject64 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b65 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject61, aObject64);
        boolean b66 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject49, aObject61);
        int i67 = aObject49.getId();
        java.lang.String str68 = aObject49.getName();
        boolean b69 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject49);
        aObject49.setId((int) (byte) 1);
        java.lang.String str72 = aObject49.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!:-1:35" + "'", str28.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!:-1:35" + "'", str45.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i53 == (-1));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(i67 == (-1));
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "" + "'", str68.equals(""));
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test018");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.toString();
        aObject13.setName("hi!:-1");
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject25 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject25, aObject27);
        int i29 = aObject25.getId();
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject33);
        java.lang.String str35 = aObject31.getName();
        io.github.agentsoz.jill.struct.AObject aObject37 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject37);
        io.github.agentsoz.jill.struct.AObject aObject40 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject37, aObject40);
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject25, aObject37);
        java.lang.String str43 = aObject37.toString();
        aObject37.setName("hi!:-1");
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject23, aObject37);
        io.github.agentsoz.jill.struct.AObject aObject48 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject48.setId((int) '#');
        java.lang.String str51 = aObject48.toString();
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject23, aObject48);
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject48);
        aObject13.setId((int) ' ');
        java.lang.String str56 = aObject13.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + ":-1" + "'", str43.equals(":-1"));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!:-1:35" + "'", str51.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!:-1" + "'", str56.equals("hi!:-1"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test019");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        aObject13.setName("");
        aObject13.setId((int) (short) 0);
        int i23 = aObject13.getId();
        aObject13.setId((int) 'a');
        int i26 = aObject13.getId();
        java.lang.String str27 = aObject13.getName();
        java.lang.String str28 = aObject13.getName();
        int i29 = aObject13.getId();
        int i30 = aObject13.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i26 == 97);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue(i29 == 97);
        org.junit.Assert.assertTrue(i30 == 97);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test020");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.toString();
        aObject13.setName("hi!:-1");
        aObject13.setName("");
        aObject13.setName("hi!:-1:35");
        aObject13.setId((int) 'a');
        java.lang.String str28 = aObject13.getName();
        io.github.agentsoz.jill.struct.AObject aObject30 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject32 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject30, aObject32);
        java.lang.String str34 = aObject30.getName();
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject30, aObject36);
        aObject30.setName("hi!");
        java.lang.String str40 = aObject30.getName();
        aObject30.setId((int) (short) 1);
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject30);
        int i44 = aObject30.getId();
        java.lang.String str45 = aObject30.getName();
        aObject30.setId((int) (byte) 1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!:-1:35" + "'", str28.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 1);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test021");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        java.lang.String str12 = aObject10.getName();
        java.lang.String str13 = aObject10.getName();
        aObject10.setName("hi!:1:-1:-1");
        aObject10.setName(":-1:52:10");
        java.lang.String str18 = aObject10.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1:52:10:-1" + "'", str18.equals(":-1:52:10:-1"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test022");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        java.lang.String str21 = aObject15.toString();
        aObject15.setName("hi!:-1");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        aObject15.setName(":-1");
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject28);
        aObject15.setId((int) 'a');
        java.lang.String str32 = aObject15.getName();
        java.lang.String str33 = aObject15.toString();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + ":-1" + "'", str32.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + ":-1:97" + "'", str33.equals(":-1:97"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test023");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        int i12 = aObject7.getId();
        aObject7.setId((int) (byte) 1);
        aObject7.setName("hi!:-1:-1");
        aObject7.setName("hi!:-1:-1");
        int i19 = aObject7.getId();
        int i20 = aObject7.getId();
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject24 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject24);
        java.lang.String str26 = aObject22.getName();
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject28);
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject28, aObject31);
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject34.setName("");
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject34);
        aObject31.setId((int) (short) 10);
        aObject31.setId((int) (byte) -1);
        java.lang.String str42 = aObject31.getName();
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject31);
        java.lang.String str44 = aObject31.getName();
        aObject31.setId((int) 'a');
        java.lang.String str47 = aObject31.toString();
        int i48 = aObject31.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + ":97" + "'", str47.equals(":97"));
        org.junit.Assert.assertTrue(i48 == 97);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test024");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        java.lang.String str6 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject8 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject10);
        java.lang.String str12 = aObject8.getName();
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject14);
        java.lang.String str16 = aObject14.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject14);
        aObject14.setName("hi!");
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject23);
        java.lang.String str25 = aObject21.getName();
        java.lang.String str26 = aObject21.toString();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject21);
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject29.setId((int) '#');
        int i32 = aObject29.getId();
        java.lang.String str33 = aObject29.toString();
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject35.setName(":1");
        aObject35.setId(10);
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject29, aObject35);
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("hi!");
        java.lang.String str43 = aObject42.toString();
        io.github.agentsoz.jill.struct.AObject aObject45 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject45.setId((int) ' ');
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject42, aObject45);
        java.lang.String str49 = aObject45.getName();
        aObject45.setId((int) (byte) -1);
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject29, aObject45);
        int i53 = aObject45.getId();
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject45);
        java.lang.String str55 = aObject45.toString();
        aObject45.setName(":0");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + ":-1" + "'", str26.equals(":-1"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i32 == 35);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!:-1:35" + "'", str33.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!:-1" + "'", str43.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + ":0" + "'", str49.equals(":0"));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i53 == (-1));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + ":0:-1" + "'", str55.equals(":0:-1"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test025");
        io.github.agentsoz.jill.struct.AObject aObject0 = null;
        io.github.agentsoz.jill.struct.AObject aObject2 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject4 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b5 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject2, aObject4);
        int i6 = aObject2.getId();
        io.github.agentsoz.jill.struct.AObject aObject8 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject10);
        java.lang.String str12 = aObject8.getName();
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject14);
        io.github.agentsoz.jill.struct.AObject aObject17 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject17);
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject2, aObject14);
        java.lang.String str20 = aObject14.toString();
        aObject14.setName("hi!:-1");
        aObject14.setName("");
        aObject14.setName("hi!:-1:35");
        aObject14.setId((int) 'a');
        int i29 = aObject14.getId();
        java.lang.String str30 = aObject14.toString();
        try {
            boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject0, aObject14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + ":-1" + "'", str20.equals(":-1"));
        org.junit.Assert.assertTrue(i29 == 97);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1:35:97" + "'", str30.equals("hi!:-1:35:97"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test026");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        aObject13.setName("");
        aObject13.setId((int) (short) 0);
        int i23 = aObject13.getId();
        aObject13.setId((int) 'a');
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("hi!");
        java.lang.String str28 = aObject27.toString();
        io.github.agentsoz.jill.struct.AObject aObject30 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject30.setId((int) ' ');
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject30);
        int i34 = aObject27.getId();
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject27);
        java.lang.String str36 = aObject27.toString();
        int i37 = aObject27.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!:-1" + "'", str28.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!:-1" + "'", str36.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i37 == (-1));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test027");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":52");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        int i6 = aObject1.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ":52" + "'", str5.equals(":52"));
        org.junit.Assert.assertTrue(i6 == (-1));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test028");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!");
        java.lang.String str2 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject4 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject4.setId((int) ' ');
        boolean b7 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject4);
        java.lang.String str8 = aObject4.getName();
        aObject4.setId((int) (byte) -1);
        aObject4.setName(":-1:1");
        int i13 = aObject4.getId();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!:-1" + "'", str2.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ":0" + "'", str8.equals(":0"));
        org.junit.Assert.assertTrue(i13 == (-1));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test029");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.toString();
        java.lang.String str20 = aObject13.getName();
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject24 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject24);
        int i26 = aObject22.getId();
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject30 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject28, aObject30);
        java.lang.String str32 = aObject28.getName();
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject28, aObject34);
        io.github.agentsoz.jill.struct.AObject aObject37 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, aObject37);
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject34);
        int i40 = aObject22.getId();
        java.lang.String str41 = aObject22.getName();
        io.github.agentsoz.jill.struct.AObject aObject43 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject43.setId((int) '#');
        java.lang.String str46 = aObject43.toString();
        io.github.agentsoz.jill.struct.AObject aObject48 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject50 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject50);
        int i52 = aObject48.getId();
        io.github.agentsoz.jill.struct.AObject aObject54 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject56 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject54, aObject56);
        java.lang.String str58 = aObject54.getName();
        io.github.agentsoz.jill.struct.AObject aObject60 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject54, aObject60);
        io.github.agentsoz.jill.struct.AObject aObject63 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b64 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject60, aObject63);
        boolean b65 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject60);
        java.lang.String str66 = aObject60.toString();
        aObject60.setName("hi!:-1");
        java.lang.String str69 = aObject60.getName();
        boolean b70 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject43, aObject60);
        boolean b71 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject43);
        java.lang.String str72 = aObject43.toString();
        io.github.agentsoz.jill.struct.AObject aObject74 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject76 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b77 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject74, aObject76);
        java.lang.String str78 = aObject74.getName();
        io.github.agentsoz.jill.struct.AObject aObject80 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b81 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject74, aObject80);
        io.github.agentsoz.jill.struct.AObject aObject83 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b84 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject80, aObject83);
        aObject80.setId((int) (short) 1);
        boolean b87 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject43, aObject80);
        boolean b88 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject80);
        aObject13.setName(":-1:100:0");
        java.lang.String str91 = aObject13.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == (-1));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!:-1:35" + "'", str46.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i52 == (-1));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + ":-1" + "'", str66.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "hi!:-1" + "'", str69.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!:-1:35" + "'", str72.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "" + "'", str78.equals(""));
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + ":-1:100:0:-1" + "'", str91.equals(":-1:100:0:-1"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test030");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:52");
        aObject1.setId((int) ' ');
        aObject1.setName(":0:32:32");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test031");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        java.lang.String str9 = aObject1.getName();
        aObject1.setName("hi!");
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject13.setId((int) '#');
        java.lang.String str16 = aObject13.toString();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        aObject13.setId((int) (byte) 1);
        aObject13.setId((int) (byte) 10);
        int i22 = aObject13.getId();
        aObject13.setName("hi!:-1:35:97");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!:-1:35" + "'", str16.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i22 == 10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test032");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        java.lang.String str7 = aObject3.getName();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject9);
        io.github.agentsoz.jill.struct.AObject aObject12 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject12);
        int i14 = aObject9.getId();
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject9);
        java.lang.String str16 = aObject1.toString();
        java.lang.String str17 = aObject1.toString();
        aObject1.setName("hi!:-1:-1");
        aObject1.setName("hi!:52");
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject25 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject25, aObject27);
        int i29 = aObject25.getId();
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject33);
        java.lang.String str35 = aObject31.getName();
        io.github.agentsoz.jill.struct.AObject aObject37 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject37);
        io.github.agentsoz.jill.struct.AObject aObject40 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject37, aObject40);
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject25, aObject37);
        java.lang.String str43 = aObject37.toString();
        aObject37.setName("hi!:-1");
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject23, aObject37);
        aObject37.setName(":-1");
        int i49 = aObject37.getId();
        io.github.agentsoz.jill.struct.AObject aObject51 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject53 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject51, aObject53);
        java.lang.String str55 = aObject51.getName();
        io.github.agentsoz.jill.struct.AObject aObject57 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject51, aObject57);
        io.github.agentsoz.jill.struct.AObject aObject60 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject57, aObject60);
        io.github.agentsoz.jill.struct.AObject aObject63 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject63.setName("");
        boolean b66 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject60, aObject63);
        aObject60.setId((int) (short) 10);
        io.github.agentsoz.jill.struct.AObject aObject70 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject70.setName(":1");
        io.github.agentsoz.jill.struct.AObject aObject74 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject76 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b77 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject74, aObject76);
        java.lang.String str78 = aObject74.getName();
        io.github.agentsoz.jill.struct.AObject aObject80 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b81 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject74, aObject80);
        io.github.agentsoz.jill.struct.AObject aObject83 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b84 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject80, aObject83);
        io.github.agentsoz.jill.struct.AObject aObject86 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject86.setName("");
        boolean b89 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject83, aObject86);
        aObject86.setId((int) (short) 1);
        boolean b92 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject70, aObject86);
        boolean b93 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject60, aObject86);
        java.lang.String str94 = aObject60.getName();
        boolean b95 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject37, aObject60);
        boolean b96 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject60);
        io.github.agentsoz.jill.struct.AObject aObject97 = null;
        try {
            boolean b98 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject60, aObject97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":-1" + "'", str16.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + ":-1" + "'", str43.equals(":-1"));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i49 == (-1));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "" + "'", str78.equals(""));
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "" + "'", str94.equals(""));
        org.junit.Assert.assertTrue(b95 == false);
        org.junit.Assert.assertTrue(b96 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test033");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.toString();
        aObject13.setName("hi!:-1");
        java.lang.String str22 = aObject13.getName();
        aObject13.setId((int) ' ');
        java.lang.String str25 = aObject13.toString();
        java.lang.String str26 = aObject13.toString();
        aObject13.setName(":-1:100:-1");
        int i29 = aObject13.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!:-1" + "'", str22.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:-1:32" + "'", str25.equals("hi!:-1:32"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:-1:32" + "'", str26.equals("hi!:-1:32"));
        org.junit.Assert.assertTrue(i29 == 32);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test034");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        aObject13.setName("");
        aObject13.setName(":-1:-1");
        java.lang.String str23 = aObject13.toString();
        aObject13.setId(35);
        aObject13.setId((int) (short) 1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ":-1:-1:-1" + "'", str23.equals(":-1:-1:-1"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test035");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        int i19 = aObject1.getId();
        java.lang.String str20 = aObject1.toString();
        aObject1.setName("");
        aObject1.setName("hi!:52");
        int i25 = aObject1.getId();
        aObject1.setId(0);
        aObject1.setName(":97");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + ":-1" + "'", str20.equals(":-1"));
        org.junit.Assert.assertTrue(i25 == (-1));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test036");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.toString();
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject23);
        java.lang.String str25 = aObject21.getName();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject27);
        java.lang.String str29 = aObject21.getName();
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject21);
        aObject13.setName("");
        java.lang.String str33 = aObject13.getName();
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("hi!");
        java.lang.String str36 = aObject35.toString();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject35);
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject39.setId((int) '#');
        int i42 = aObject39.getId();
        java.lang.String str43 = aObject39.toString();
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject39);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!:-1" + "'", str36.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i42 == 35);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!:-1:35" + "'", str43.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test037");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.toString();
        aObject13.setName("hi!:-1");
        aObject13.setName("");
        aObject13.setName("");
        java.lang.String str26 = aObject13.getName();
        java.lang.String str27 = aObject13.toString();
        aObject13.setId(1);
        aObject13.setId((int) (byte) -1);
        aObject13.setName("hi!:-1:35:1:1");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test038");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        int i19 = aObject1.getId();
        java.lang.String str20 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject22.setId((int) '#');
        java.lang.String str25 = aObject22.toString();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject29);
        int i31 = aObject27.getId();
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject35);
        java.lang.String str37 = aObject33.getName();
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject39);
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject42);
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject39);
        java.lang.String str45 = aObject39.toString();
        aObject39.setName("hi!:-1");
        java.lang.String str48 = aObject39.getName();
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject39);
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject22);
        java.lang.String str51 = aObject22.toString();
        aObject22.setId((int) (short) 1);
        int i54 = aObject22.getId();
        java.lang.String str55 = aObject22.toString();
        java.lang.String str56 = aObject22.toString();
        aObject22.setName(":-1:100:0");
        aObject22.setName("hi!:1:100");
        int i61 = aObject22.getId();
        int i62 = aObject22.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:-1:35" + "'", str25.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + ":-1" + "'", str45.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!:-1" + "'", str48.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!:-1:35" + "'", str51.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(i54 == 1);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!:-1:1" + "'", str55.equals("hi!:-1:1"));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!:-1:1" + "'", str56.equals("hi!:-1:1"));
        org.junit.Assert.assertTrue(i61 == 1);
        org.junit.Assert.assertTrue(i62 == 1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test039");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        int i12 = aObject7.getId();
        aObject7.setId((int) (byte) 1);
        java.lang.String str15 = aObject7.toString();
        java.lang.String str16 = aObject7.toString();
        java.lang.String str17 = aObject7.getName();
        int i18 = aObject7.getId();
        aObject7.setId(32);
        aObject7.setId(10);
        java.lang.String str23 = aObject7.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ":1" + "'", str15.equals(":1"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":1" + "'", str16.equals(":1"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test040");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":-1:32");
        int i2 = aObject1.getId();
        org.junit.Assert.assertTrue(i2 == (-1));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test041");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        java.lang.String str21 = aObject15.toString();
        aObject15.setName("hi!:-1");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        aObject15.setName(":-1");
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject28);
        aObject28.setName("hi!");
        aObject28.setName("hi!:52");
        java.lang.String str34 = aObject28.getName();
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject38 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject36, aObject38);
        java.lang.String str40 = aObject36.getName();
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject36, aObject42);
        io.github.agentsoz.jill.struct.AObject aObject45 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject42, aObject45);
        io.github.agentsoz.jill.struct.AObject aObject48 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject48.setName("");
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject45, aObject48);
        aObject45.setId((int) (short) 10);
        int i54 = aObject45.getId();
        int i55 = aObject45.getId();
        java.lang.String str56 = aObject45.getName();
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject28, aObject45);
        java.lang.String str58 = aObject45.toString();
        java.lang.String str59 = aObject45.toString();
        java.lang.String str60 = aObject45.getName();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!:52" + "'", str34.equals("hi!:52"));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i54 == 10);
        org.junit.Assert.assertTrue(i55 == 10);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + ":10" + "'", str58.equals(":10"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + ":10" + "'", str59.equals(":10"));
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "" + "'", str60.equals(""));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test042");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        aObject1.setId((int) (byte) -1);
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        int i13 = aObject9.getId();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject17 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject17);
        java.lang.String str19 = aObject15.getName();
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject21);
        io.github.agentsoz.jill.struct.AObject aObject24 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject24);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject21);
        java.lang.String str27 = aObject21.toString();
        aObject21.setName("hi!:-1");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject21);
        java.lang.String str31 = aObject1.toString();
        aObject1.setName("hi!:-1:35:-1");
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        java.lang.String str36 = aObject35.toString();
        java.lang.String str37 = aObject35.toString();
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject41 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject41);
        java.lang.String str43 = aObject39.getName();
        io.github.agentsoz.jill.struct.AObject aObject45 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject45);
        io.github.agentsoz.jill.struct.AObject aObject48 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject45, aObject48);
        io.github.agentsoz.jill.struct.AObject aObject51 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject51.setName("");
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject51);
        java.lang.String str55 = aObject48.getName();
        int i56 = aObject48.getId();
        aObject48.setName("hi!:-1:-1");
        boolean b59 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject35, aObject48);
        int i60 = aObject35.getId();
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject35);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + ":-1" + "'", str31.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + ":-1" + "'", str36.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + ":-1" + "'", str37.equals(":-1"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        org.junit.Assert.assertTrue(i56 == (-1));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i60 == (-1));
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test043");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        aObject1.setId((int) (byte) -1);
        int i8 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject12 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject12);
        java.lang.String str14 = aObject10.getName();
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject16);
        io.github.agentsoz.jill.struct.AObject aObject19 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject16, aObject19);
        int i21 = aObject16.getId();
        aObject16.setId((int) (byte) 100);
        aObject16.setId((int) (byte) 10);
        int i26 = aObject16.getId();
        java.lang.String str27 = aObject16.toString();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject16);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(i26 == 10);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":10" + "'", str27.equals(":10"));
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test044");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject1.setId((int) '#');
        java.lang.String str4 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject6 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject8 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject6, aObject8);
        int i10 = aObject6.getId();
        io.github.agentsoz.jill.struct.AObject aObject12 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject12, aObject14);
        java.lang.String str16 = aObject12.getName();
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject12, aObject18);
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject18, aObject21);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject6, aObject18);
        java.lang.String str24 = aObject18.toString();
        aObject18.setName("hi!:-1");
        java.lang.String str27 = aObject18.getName();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject18);
        aObject1.setId((int) '4');
        aObject1.setId((int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, aObject36);
        int i38 = aObject34.getId();
        io.github.agentsoz.jill.struct.AObject aObject40 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject40, aObject42);
        java.lang.String str44 = aObject40.getName();
        io.github.agentsoz.jill.struct.AObject aObject46 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b47 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject40, aObject46);
        io.github.agentsoz.jill.struct.AObject aObject49 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject46, aObject49);
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, aObject46);
        int i52 = aObject34.getId();
        java.lang.String str53 = aObject34.toString();
        aObject34.setName("");
        aObject34.setName("hi!:52");
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject34);
        aObject1.setId((-1));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1:35" + "'", str4.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + ":-1" + "'", str24.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1" + "'", str27.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == (-1));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i52 == (-1));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + ":-1" + "'", str53.equals(":-1"));
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test045");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        aObject1.setName("hi!");
        io.github.agentsoz.jill.struct.AObject aObject12 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject12, aObject14);
        java.lang.String str16 = aObject12.getName();
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject12, aObject18);
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject18, aObject21);
        io.github.agentsoz.jill.struct.AObject aObject24 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject24.setName("");
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject24);
        aObject21.setId((int) (short) 10);
        int i30 = aObject21.getId();
        aObject21.setId(0);
        java.lang.String str33 = aObject21.toString();
        aObject21.setId((int) '4');
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject21);
        java.lang.String str37 = aObject21.toString();
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject41 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject43 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject41, aObject43);
        java.lang.String str45 = aObject41.getName();
        io.github.agentsoz.jill.struct.AObject aObject47 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject41, aObject47);
        io.github.agentsoz.jill.struct.AObject aObject50 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject47, aObject50);
        int i52 = aObject47.getId();
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject47);
        java.lang.String str54 = aObject39.toString();
        java.lang.String str55 = aObject39.toString();
        aObject39.setName("hi!:-1:-1");
        java.lang.String str58 = aObject39.getName();
        java.lang.String str59 = aObject39.toString();
        aObject39.setName(":1:10");
        boolean b62 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject39);
        aObject39.setId(100);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i30 == 10);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + ":0" + "'", str33.equals(":0"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + ":52" + "'", str37.equals(":52"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i52 == (-1));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + ":-1" + "'", str54.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + ":-1" + "'", str55.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!:-1:-1" + "'", str58.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!:-1:-1:-1" + "'", str59.equals("hi!:-1:-1:-1"));
        org.junit.Assert.assertTrue(b62 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test046");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        java.lang.String str21 = aObject15.toString();
        aObject15.setName("hi!:-1");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject26 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject26.setId((int) '#');
        java.lang.String str29 = aObject26.toString();
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject26);
        aObject1.setId((int) (byte) 1);
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, aObject36);
        java.lang.String str38 = aObject34.getName();
        io.github.agentsoz.jill.struct.AObject aObject40 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, aObject40);
        io.github.agentsoz.jill.struct.AObject aObject43 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject40, aObject43);
        java.lang.String str45 = aObject43.toString();
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject43);
        io.github.agentsoz.jill.struct.AObject aObject48 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject50 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject50);
        java.lang.String str52 = aObject48.getName();
        io.github.agentsoz.jill.struct.AObject aObject54 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject54);
        io.github.agentsoz.jill.struct.AObject aObject57 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject54, aObject57);
        java.lang.String str59 = aObject54.getName();
        boolean b60 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject54);
        int i61 = aObject1.getId();
        java.lang.String str62 = aObject1.toString();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!:-1:35" + "'", str29.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + ":-1" + "'", str45.equals(":-1"));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(i61 == 1);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + ":1" + "'", str62.equals(":1"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test047");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":52");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject3.getId();
        java.lang.String str6 = aObject3.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test048");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject1.setName(":1");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject5, aObject7);
        java.lang.String str9 = aObject5.getName();
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject5, aObject11);
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject11, aObject14);
        io.github.agentsoz.jill.struct.AObject aObject17 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject17.setName("");
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject17);
        aObject17.setId((int) (short) 1);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject17);
        aObject17.setName(":-1:-1");
        java.lang.String str26 = aObject17.getName();
        aObject17.setId((int) (byte) 0);
        java.lang.String str29 = aObject17.toString();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + ":-1:-1" + "'", str26.equals(":-1:-1"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + ":-1:-1:0" + "'", str29.equals(":-1:-1:0"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test049");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        aObject13.setName("");
        aObject13.setId((int) (short) 0);
        int i23 = aObject13.getId();
        io.github.agentsoz.jill.struct.AObject aObject25 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject25, aObject27);
        int i29 = aObject25.getId();
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject33);
        java.lang.String str35 = aObject31.getName();
        io.github.agentsoz.jill.struct.AObject aObject37 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject37);
        io.github.agentsoz.jill.struct.AObject aObject40 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject37, aObject40);
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject25, aObject37);
        aObject25.setName("");
        java.lang.String str45 = aObject25.toString();
        int i46 = aObject25.getId();
        boolean b47 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject25);
        aObject13.setName(":1:-1");
        io.github.agentsoz.jill.struct.AObject aObject51 = new io.github.agentsoz.jill.struct.AObject(":-1:100:97:-1");
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject51);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + ":-1" + "'", str45.equals(":-1"));
        org.junit.Assert.assertTrue(i46 == (-1));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test050");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:10");
        int i2 = aObject1.getId();
        org.junit.Assert.assertTrue(i2 == (-1));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test051");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        java.lang.String str21 = aObject15.toString();
        aObject15.setName("hi!:-1");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        java.lang.String str25 = aObject15.toString();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject29);
        int i31 = aObject27.getId();
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject35);
        java.lang.String str37 = aObject33.getName();
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject39);
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject42);
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject39);
        java.lang.String str45 = aObject39.toString();
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject39);
        io.github.agentsoz.jill.struct.AObject aObject48 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject50 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject52 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject50, aObject52);
        int i54 = aObject50.getId();
        io.github.agentsoz.jill.struct.AObject aObject56 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject58 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b59 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject56, aObject58);
        java.lang.String str60 = aObject56.getName();
        io.github.agentsoz.jill.struct.AObject aObject62 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject56, aObject62);
        io.github.agentsoz.jill.struct.AObject aObject65 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b66 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject62, aObject65);
        boolean b67 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject50, aObject62);
        java.lang.String str68 = aObject62.toString();
        aObject62.setName("hi!:-1");
        boolean b71 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject62);
        aObject62.setId((int) '#');
        boolean b74 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject62);
        aObject39.setId(0);
        java.lang.String str77 = aObject39.toString();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:-1:-1" + "'", str25.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + ":-1" + "'", str45.equals(":-1"));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == (-1));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "" + "'", str60.equals(""));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + ":-1" + "'", str68.equals(":-1"));
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + ":0" + "'", str77.equals(":0"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test052");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject13.setName("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject18.setId((int) '#');
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject18);
        aObject18.setId((int) (short) 10);
        java.lang.String str24 = aObject18.toString();
        io.github.agentsoz.jill.struct.AObject aObject26 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject26, aObject28);
        int i30 = aObject26.getId();
        io.github.agentsoz.jill.struct.AObject aObject32 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject32, aObject34);
        java.lang.String str36 = aObject32.getName();
        io.github.agentsoz.jill.struct.AObject aObject38 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject32, aObject38);
        io.github.agentsoz.jill.struct.AObject aObject41 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject38, aObject41);
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject26, aObject38);
        java.lang.String str44 = aObject38.toString();
        io.github.agentsoz.jill.struct.AObject aObject46 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject48 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject46, aObject48);
        java.lang.String str50 = aObject46.getName();
        io.github.agentsoz.jill.struct.AObject aObject52 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject46, aObject52);
        java.lang.String str54 = aObject46.getName();
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject38, aObject46);
        aObject38.setName("");
        java.lang.String str58 = aObject38.getName();
        io.github.agentsoz.jill.struct.AObject aObject60 = new io.github.agentsoz.jill.struct.AObject("hi!");
        java.lang.String str61 = aObject60.toString();
        boolean b62 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject38, aObject60);
        aObject38.setName(":100");
        java.lang.String str65 = aObject38.getName();
        aObject38.setName("hi!:52:-1");
        boolean b68 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject18, aObject38);
        java.lang.String str69 = aObject38.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!:-1:10" + "'", str24.equals("hi!:-1:10"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == (-1));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + ":-1" + "'", str44.equals(":-1"));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!:-1" + "'", str61.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + ":100" + "'", str65.equals(":100"));
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "hi!:52:-1" + "'", str69.equals("hi!:52:-1"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test053");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:1:-1");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject(":-1:100");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject5, aObject7);
        int i9 = aObject5.getId();
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject11, aObject13);
        java.lang.String str15 = aObject11.getName();
        io.github.agentsoz.jill.struct.AObject aObject17 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject11, aObject17);
        io.github.agentsoz.jill.struct.AObject aObject20 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject17, aObject20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject5, aObject17);
        java.lang.String str23 = aObject17.toString();
        aObject17.setName("hi!:-1");
        aObject17.setName("");
        aObject17.setName("");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject17);
        io.github.agentsoz.jill.struct.AObject aObject32 = new io.github.agentsoz.jill.struct.AObject("hi!");
        java.lang.String str33 = aObject32.toString();
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject35.setId((int) ' ');
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject32, aObject35);
        java.lang.String str39 = aObject35.getName();
        aObject35.setId((int) (byte) -1);
        aObject35.setName(":-1:1");
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject17, aObject35);
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject35);
        java.lang.String str46 = aObject1.toString();
        int i47 = aObject1.getId();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ":-1" + "'", str23.equals(":-1"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!:-1" + "'", str33.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + ":0" + "'", str39.equals(":0"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!:1:-1:-1" + "'", str46.equals("hi!:1:-1:-1"));
        org.junit.Assert.assertTrue(i47 == (-1));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test054");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1:1");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        java.lang.String str7 = aObject3.getName();
        aObject3.setId((int) (byte) -1);
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject11, aObject13);
        int i15 = aObject11.getId();
        io.github.agentsoz.jill.struct.AObject aObject17 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject19 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject17, aObject19);
        java.lang.String str21 = aObject17.getName();
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject17, aObject23);
        io.github.agentsoz.jill.struct.AObject aObject26 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject23, aObject26);
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject11, aObject23);
        java.lang.String str29 = aObject23.toString();
        aObject23.setName("hi!:-1");
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject23);
        java.lang.String str33 = aObject3.toString();
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str35 = aObject3.toString();
        int i36 = aObject3.getId();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + ":-1" + "'", str29.equals(":-1"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + ":-1" + "'", str33.equals(":-1"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + ":-1" + "'", str35.equals(":-1"));
        org.junit.Assert.assertTrue(i36 == (-1));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test055");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1:100");
        int i2 = aObject1.getId();
        org.junit.Assert.assertTrue(i2 == (-1));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test056");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        java.lang.String str6 = aObject1.toString();
        java.lang.String str7 = aObject1.getName();
        aObject1.setName(":1:-1");
        aObject1.setName("");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test057");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject13.setName("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject13);
        java.lang.String str17 = aObject10.getName();
        int i18 = aObject10.getId();
        java.lang.String str19 = aObject10.toString();
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject23);
        int i25 = aObject21.getId();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject29);
        java.lang.String str31 = aObject27.getName();
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject33);
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject36);
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject33);
        aObject33.setName("");
        aObject33.setId((int) (short) 0);
        int i43 = aObject33.getId();
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject33);
        java.lang.String str45 = aObject33.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test058");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        aObject13.setName("");
        aObject13.setId((int) (short) 0);
        int i23 = aObject13.getId();
        aObject13.setId((int) 'a');
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("hi!");
        java.lang.String str28 = aObject27.toString();
        io.github.agentsoz.jill.struct.AObject aObject30 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject30.setId((int) ' ');
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject30);
        int i34 = aObject27.getId();
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject27);
        aObject13.setName(":10");
        aObject13.setId((int) (short) 100);
        io.github.agentsoz.jill.struct.AObject aObject41 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject43 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject41, aObject43);
        java.lang.String str45 = aObject41.getName();
        io.github.agentsoz.jill.struct.AObject aObject47 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject41, aObject47);
        io.github.agentsoz.jill.struct.AObject aObject50 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject47, aObject50);
        io.github.agentsoz.jill.struct.AObject aObject53 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject53.setName("");
        boolean b56 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject50, aObject53);
        aObject50.setId((int) (short) 10);
        aObject50.setId((int) (byte) -1);
        java.lang.String str61 = aObject50.getName();
        aObject50.setId((int) (short) -1);
        boolean b64 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject50);
        aObject50.setName(":35");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!:-1" + "'", str28.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test059");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:1:-1:-1");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test060");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        java.lang.String str12 = aObject10.toString();
        aObject10.setName("");
        java.lang.String str15 = aObject10.getName();
        aObject10.setName("hi!:-1:35:1:-1");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1" + "'", str12.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test061");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        aObject1.setId((int) (byte) -1);
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        int i13 = aObject9.getId();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject17 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject17);
        java.lang.String str19 = aObject15.getName();
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject21);
        io.github.agentsoz.jill.struct.AObject aObject24 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject24);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject21);
        java.lang.String str27 = aObject21.toString();
        aObject21.setName("hi!:-1");
        java.lang.String str30 = aObject21.getName();
        aObject21.setId((int) ' ');
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject21);
        aObject21.setName("");
        aObject21.setName("hi!:-1:35:1");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1" + "'", str30.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test062");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        int i12 = aObject7.getId();
        aObject7.setId((int) (byte) 1);
        aObject7.setName("hi!:-1:-1");
        aObject7.setName("hi!:-1:-1");
        int i19 = aObject7.getId();
        int i20 = aObject7.getId();
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject24 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject24);
        java.lang.String str26 = aObject22.getName();
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject28);
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject28, aObject31);
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject34.setName("");
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject34);
        aObject31.setId((int) (short) 10);
        aObject31.setId((int) (byte) -1);
        java.lang.String str42 = aObject31.getName();
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject31);
        io.github.agentsoz.jill.struct.AObject aObject45 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject47 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject45, aObject47);
        java.lang.String str49 = aObject45.getName();
        aObject45.setId((int) (byte) -1);
        aObject45.setName(":1");
        java.lang.String str54 = aObject45.getName();
        int i55 = aObject45.getId();
        int i56 = aObject45.getId();
        java.lang.String str57 = aObject45.toString();
        int i58 = aObject45.getId();
        java.lang.String str59 = aObject45.getName();
        boolean b60 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject45);
        java.lang.String str61 = aObject31.getName();
        int i62 = aObject31.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + ":1" + "'", str54.equals(":1"));
        org.junit.Assert.assertTrue(i55 == (-1));
        org.junit.Assert.assertTrue(i56 == (-1));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + ":1:-1" + "'", str57.equals(":1:-1"));
        org.junit.Assert.assertTrue(i58 == (-1));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + ":1" + "'", str59.equals(":1"));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
        org.junit.Assert.assertTrue(i62 == (-1));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test063");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        aObject1.setId((int) (byte) -1);
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        int i13 = aObject9.getId();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject17 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject17);
        java.lang.String str19 = aObject15.getName();
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject21);
        io.github.agentsoz.jill.struct.AObject aObject24 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject24);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject21);
        java.lang.String str27 = aObject21.toString();
        aObject21.setName("hi!:-1");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject21);
        aObject1.setName("hi!:-1");
        java.lang.String str33 = aObject1.getName();
        aObject1.setName(":97:10:-1");
        java.lang.String str36 = aObject1.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!:-1" + "'", str33.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + ":97:10:-1" + "'", str36.equals(":97:10:-1"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test064");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        java.lang.String str7 = aObject3.getName();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject9);
        io.github.agentsoz.jill.struct.AObject aObject12 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject12);
        int i14 = aObject9.getId();
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject9);
        java.lang.String str16 = aObject1.toString();
        java.lang.String str17 = aObject1.toString();
        int i18 = aObject1.getId();
        java.lang.String str19 = aObject1.toString();
        aObject1.setName("hi!:-1:35:1:35");
        aObject1.setId((int) (byte) 100);
        io.github.agentsoz.jill.struct.AObject aObject25 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject25, aObject27);
        java.lang.String str29 = aObject25.getName();
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject25, aObject31);
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject34);
        int i36 = aObject31.getId();
        aObject31.setId((int) (byte) 100);
        java.lang.String str39 = aObject31.getName();
        aObject31.setId((int) 'a');
        java.lang.String str42 = aObject31.toString();
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject31);
        aObject1.setName("hi!:-1:35:1:-1");
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":-1" + "'", str16.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + ":97" + "'", str42.equals(":97"));
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test065");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":-1:100:0:-1:-1");
        java.lang.String str2 = aObject1.toString();
        java.lang.String str3 = aObject1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ":-1:100:0:-1:-1:-1" + "'", str2.equals(":-1:100:0:-1:-1:-1"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1:100:0:-1:-1:-1" + "'", str3.equals(":-1:100:0:-1:-1:-1"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test066");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.toString();
        aObject13.setName("hi!:-1");
        aObject13.setName("");
        aObject13.setName("");
        aObject13.setId(97);
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject33);
        int i35 = aObject31.getId();
        io.github.agentsoz.jill.struct.AObject aObject37 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject37, aObject39);
        java.lang.String str41 = aObject37.getName();
        io.github.agentsoz.jill.struct.AObject aObject43 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject37, aObject43);
        io.github.agentsoz.jill.struct.AObject aObject46 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b47 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject43, aObject46);
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject43);
        java.lang.String str49 = aObject43.toString();
        aObject43.setName("hi!:-1");
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject29, aObject43);
        aObject43.setName(":-1");
        aObject43.setId(100);
        aObject43.setId(35);
        boolean b59 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject43);
        int i60 = aObject13.getId();
        aObject13.setName(":-1:52:10");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i35 == (-1));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + ":-1" + "'", str49.equals(":-1"));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i60 == 97);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test067");
        io.github.agentsoz.jill.struct.AObject aObject0 = null;
        io.github.agentsoz.jill.struct.AObject aObject2 = new io.github.agentsoz.jill.struct.AObject("hi!:-1:-1");
        aObject2.setName("");
        io.github.agentsoz.jill.struct.AObject aObject6 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject6.setId((int) '#');
        java.lang.String str9 = aObject6.toString();
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject11, aObject13);
        int i15 = aObject11.getId();
        io.github.agentsoz.jill.struct.AObject aObject17 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject19 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject17, aObject19);
        java.lang.String str21 = aObject17.getName();
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject17, aObject23);
        io.github.agentsoz.jill.struct.AObject aObject26 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject23, aObject26);
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject11, aObject23);
        java.lang.String str29 = aObject23.toString();
        aObject23.setName("hi!:-1");
        java.lang.String str32 = aObject23.getName();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject6, aObject23);
        aObject6.setId((int) '4');
        aObject6.setName("hi!");
        int i38 = aObject6.getId();
        io.github.agentsoz.jill.struct.AObject aObject40 = new io.github.agentsoz.jill.struct.AObject("");
        java.lang.String str41 = aObject40.toString();
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject6, aObject40);
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject2, aObject6);
        io.github.agentsoz.jill.struct.AObject aObject45 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject47 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject45, aObject47);
        int i49 = aObject45.getId();
        io.github.agentsoz.jill.struct.AObject aObject51 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject53 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject51, aObject53);
        java.lang.String str55 = aObject51.getName();
        io.github.agentsoz.jill.struct.AObject aObject57 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject51, aObject57);
        io.github.agentsoz.jill.struct.AObject aObject60 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject57, aObject60);
        boolean b62 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject45, aObject57);
        int i63 = aObject45.getId();
        java.lang.String str64 = aObject45.getName();
        aObject45.setName(":-1:52");
        aObject45.setName("hi!:-1:-1:1");
        boolean b69 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject2, aObject45);
        java.lang.String str70 = aObject2.toString();
        try {
            boolean b71 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject0, aObject2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:-1:35" + "'", str9.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + ":-1" + "'", str29.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!:-1" + "'", str32.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(i38 == 52);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + ":-1" + "'", str41.equals(":-1"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i49 == (-1));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i63 == (-1));
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + ":-1" + "'", str70.equals(":-1"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test068");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject13.setName("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject18.setId((int) '#');
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject18);
        aObject18.setName("hi!");
        java.lang.String str24 = aObject18.getName();
        java.lang.String str25 = aObject18.getName();
        aObject18.setName("hi!:-1:35:-1:-1:-1");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test069");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        aObject13.setName("");
        aObject13.setId((int) (short) 0);
        int i23 = aObject13.getId();
        java.lang.String str24 = aObject13.getName();
        java.lang.String str25 = aObject13.toString();
        aObject13.setName(":-1");
        aObject13.setId(35);
        java.lang.String str30 = aObject13.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + ":0" + "'", str25.equals(":0"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + ":-1" + "'", str30.equals(":-1"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test070");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        java.lang.String str6 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject8 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject10);
        java.lang.String str12 = aObject8.getName();
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject14);
        java.lang.String str16 = aObject14.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject14);
        int i18 = aObject1.getId();
        aObject1.setName("hi!");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == (-1));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test071");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        java.lang.String str21 = aObject15.toString();
        aObject15.setName("hi!:-1");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        aObject15.setName(":-1");
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject28);
        aObject28.setId(0);
        aObject28.setName(":-1:52:100");
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test072");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        int i12 = aObject7.getId();
        aObject7.setId((int) (byte) 1);
        java.lang.String str15 = aObject7.toString();
        java.lang.String str16 = aObject7.toString();
        java.lang.String str17 = aObject7.getName();
        aObject7.setName(":0");
        aObject7.setId((int) (short) 1);
        java.lang.String str22 = aObject7.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ":1" + "'", str15.equals(":1"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":1" + "'", str16.equals(":1"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + ":0:1" + "'", str22.equals(":0:1"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test073");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject13.setName("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject13);
        java.lang.String str17 = aObject10.getName();
        int i18 = aObject10.getId();
        java.lang.String str19 = aObject10.toString();
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject23);
        int i25 = aObject21.getId();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject29);
        java.lang.String str31 = aObject27.getName();
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject33);
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject36);
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject33);
        aObject33.setName("");
        aObject33.setId((int) (short) 0);
        int i43 = aObject33.getId();
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject33);
        int i45 = aObject10.getId();
        int i46 = aObject10.getId();
        aObject10.setName("hi!:1:-1:-1");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i45 == (-1));
        org.junit.Assert.assertTrue(i46 == (-1));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test074");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.toString();
        aObject13.setName("hi!:-1");
        aObject13.setName("");
        aObject13.setName("hi!:-1:35");
        aObject13.setId((int) 'a');
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject29, aObject31);
        java.lang.String str33 = aObject29.getName();
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject29, aObject35);
        io.github.agentsoz.jill.struct.AObject aObject38 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject35, aObject38);
        io.github.agentsoz.jill.struct.AObject aObject41 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject41.setName("");
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject38, aObject41);
        java.lang.String str45 = aObject38.getName();
        int i46 = aObject38.getId();
        java.lang.String str47 = aObject38.toString();
        io.github.agentsoz.jill.struct.AObject aObject49 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject51 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject49, aObject51);
        int i53 = aObject49.getId();
        io.github.agentsoz.jill.struct.AObject aObject55 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject57 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject55, aObject57);
        java.lang.String str59 = aObject55.getName();
        io.github.agentsoz.jill.struct.AObject aObject61 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b62 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject55, aObject61);
        io.github.agentsoz.jill.struct.AObject aObject64 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b65 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject61, aObject64);
        boolean b66 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject49, aObject61);
        aObject61.setName("");
        aObject61.setId((int) (short) 0);
        int i71 = aObject61.getId();
        boolean b72 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject38, aObject61);
        boolean b73 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject38);
        aObject38.setId((-1));
        aObject38.setName(":-1:100");
        int i78 = aObject38.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertTrue(i46 == (-1));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + ":-1" + "'", str47.equals(":-1"));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i53 == (-1));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(i78 == (-1));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test075");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        java.lang.String str21 = aObject15.toString();
        aObject15.setName("hi!:-1");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        aObject15.setName(":-1");
        aObject15.setId(100);
        aObject15.setId(35);
        io.github.agentsoz.jill.struct.AObject aObject32 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, aObject36);
        int i38 = aObject34.getId();
        io.github.agentsoz.jill.struct.AObject aObject40 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject40, aObject42);
        java.lang.String str44 = aObject40.getName();
        io.github.agentsoz.jill.struct.AObject aObject46 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b47 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject40, aObject46);
        io.github.agentsoz.jill.struct.AObject aObject49 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject46, aObject49);
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, aObject46);
        java.lang.String str52 = aObject46.toString();
        aObject46.setName("hi!:-1");
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject32, aObject46);
        aObject46.setName(":-1");
        io.github.agentsoz.jill.struct.AObject aObject59 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        boolean b60 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject46, aObject59);
        int i61 = aObject46.getId();
        boolean b62 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject46);
        aObject46.setName(":0:32:-1");
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == (-1));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + ":-1" + "'", str52.equals(":-1"));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(i61 == (-1));
        org.junit.Assert.assertTrue(b62 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test076");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        aObject1.setName("hi!");
        java.lang.String str11 = aObject1.getName();
        aObject1.setId((int) (short) 1);
        java.lang.String str14 = aObject1.toString();
        aObject1.setName(":-1:52:-1");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:1" + "'", str14.equals("hi!:1"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test077");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject13.setName("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject13);
        aObject10.setId((int) (short) 10);
        io.github.agentsoz.jill.struct.AObject aObject20 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject24 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject24);
        int i26 = aObject22.getId();
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject30 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject28, aObject30);
        java.lang.String str32 = aObject28.getName();
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject28, aObject34);
        io.github.agentsoz.jill.struct.AObject aObject37 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, aObject37);
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject34);
        java.lang.String str40 = aObject34.toString();
        aObject34.setName("hi!:-1");
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject20, aObject34);
        aObject34.setName(":-1");
        io.github.agentsoz.jill.struct.AObject aObject47 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, aObject47);
        aObject47.setName("hi!");
        aObject47.setId((int) (short) -1);
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject47);
        int i54 = aObject10.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + ":-1" + "'", str40.equals(":-1"));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == 10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test078");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        aObject13.setName("");
        aObject13.setId((int) (byte) -1);
        java.lang.String str23 = aObject13.getName();
        aObject13.setId((int) (byte) 10);
        int i26 = aObject13.getId();
        aObject13.setName(":1:-1");
        aObject13.setId(52);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(i26 == 10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test079");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        java.lang.String str21 = aObject15.toString();
        aObject15.setName("hi!:-1");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject26 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject26.setId((int) '#');
        java.lang.String str29 = aObject26.toString();
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject26);
        aObject1.setId((int) (byte) 1);
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, aObject36);
        java.lang.String str38 = aObject34.getName();
        io.github.agentsoz.jill.struct.AObject aObject40 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, aObject40);
        io.github.agentsoz.jill.struct.AObject aObject43 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject40, aObject43);
        java.lang.String str45 = aObject43.toString();
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject43);
        java.lang.String str47 = aObject43.getName();
        java.lang.String str48 = aObject43.toString();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!:-1:35" + "'", str29.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + ":-1" + "'", str45.equals(":-1"));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + ":-1" + "'", str48.equals(":-1"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test080");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        java.lang.String str6 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject8 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject10);
        java.lang.String str12 = aObject8.getName();
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject14);
        java.lang.String str16 = aObject14.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject14);
        io.github.agentsoz.jill.struct.AObject aObject19 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject23);
        java.lang.String str25 = aObject21.getName();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject27);
        io.github.agentsoz.jill.struct.AObject aObject30 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject30);
        int i32 = aObject27.getId();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject19, aObject27);
        java.lang.String str34 = aObject19.toString();
        aObject19.setId((int) (byte) 1);
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject19);
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject41 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject41);
        java.lang.String str43 = aObject39.getName();
        io.github.agentsoz.jill.struct.AObject aObject45 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject45);
        aObject39.setName("hi!");
        java.lang.String str49 = aObject39.getName();
        int i50 = aObject39.getId();
        aObject39.setId((int) (byte) -1);
        aObject39.setName(":-1:52");
        java.lang.String str55 = aObject39.getName();
        java.lang.String str56 = aObject39.getName();
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject39);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + ":-1" + "'", str34.equals(":-1"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        org.junit.Assert.assertTrue(i50 == (-1));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + ":-1:52" + "'", str55.equals(":-1:52"));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + ":-1:52" + "'", str56.equals(":-1:52"));
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test081");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":-1");
        java.lang.String str2 = aObject1.toString();
        aObject1.setName("hi!:-1");
        java.lang.String str5 = aObject1.getName();
        aObject1.setId((int) (short) 10);
        java.lang.String str8 = aObject1.getName();
        java.lang.String str9 = aObject1.getName();
        java.lang.String str10 = aObject1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ":-1:-1" + "'", str2.equals(":-1:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:-1" + "'", str8.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:-1" + "'", str9.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1:10" + "'", str10.equals("hi!:-1:10"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test082");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        int i19 = aObject1.getId();
        java.lang.String str20 = aObject1.toString();
        aObject1.setName("");
        aObject1.setId((int) (byte) 1);
        aObject1.setId(52);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + ":-1" + "'", str20.equals(":-1"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test083");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1:-1");
        aObject1.setName("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject5.setId((int) '#');
        java.lang.String str8 = aObject5.toString();
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject12 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject12);
        int i14 = aObject10.getId();
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject16, aObject18);
        java.lang.String str20 = aObject16.getName();
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject16, aObject22);
        io.github.agentsoz.jill.struct.AObject aObject25 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject25);
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject22);
        java.lang.String str28 = aObject22.toString();
        aObject22.setName("hi!:-1");
        java.lang.String str31 = aObject22.getName();
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject5, aObject22);
        aObject5.setId((int) '4');
        aObject5.setName("hi!");
        int i37 = aObject5.getId();
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        java.lang.String str40 = aObject39.toString();
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject5, aObject39);
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject5);
        aObject5.setName("hi!:1:-1");
        int i45 = aObject5.getId();
        aObject5.setId(0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:-1:35" + "'", str8.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!:-1" + "'", str31.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(i37 == 52);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + ":-1" + "'", str40.equals(":-1"));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i45 == 52);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test084");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject1.setId((int) '#');
        int i4 = aObject1.getId();
        java.lang.String str5 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject7.setName(":1");
        aObject7.setId(10);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        aObject1.setId((int) '4');
        aObject1.setId((int) '4');
        aObject1.setName(":-1:52:-1:1");
        org.junit.Assert.assertTrue(i4 == 35);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1:35" + "'", str5.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test085");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.toString();
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject23);
        java.lang.String str25 = aObject21.getName();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject27);
        java.lang.String str29 = aObject21.getName();
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject21);
        io.github.agentsoz.jill.struct.AObject aObject32 = new io.github.agentsoz.jill.struct.AObject("");
        java.lang.String str33 = aObject32.toString();
        java.lang.String str34 = aObject32.toString();
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject38 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject36, aObject38);
        java.lang.String str40 = aObject36.getName();
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject36, aObject42);
        io.github.agentsoz.jill.struct.AObject aObject45 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject42, aObject45);
        java.lang.String str47 = aObject45.getName();
        java.lang.String str48 = aObject45.getName();
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject32, aObject45);
        aObject32.setId((int) (short) 0);
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject32);
        java.lang.String str53 = aObject21.getName();
        int i54 = aObject21.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + ":-1" + "'", str33.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + ":-1" + "'", str34.equals(":-1"));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        org.junit.Assert.assertTrue(i54 == (-1));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test086");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        aObject1.setName("hi!");
        io.github.agentsoz.jill.struct.AObject aObject12 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject16);
        int i18 = aObject14.getId();
        io.github.agentsoz.jill.struct.AObject aObject20 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject20, aObject22);
        java.lang.String str24 = aObject20.getName();
        io.github.agentsoz.jill.struct.AObject aObject26 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject20, aObject26);
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject26, aObject29);
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject26);
        java.lang.String str32 = aObject26.toString();
        aObject26.setName("hi!:-1");
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject12, aObject26);
        java.lang.String str36 = aObject26.toString();
        io.github.agentsoz.jill.struct.AObject aObject38 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject40 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject38, aObject40);
        int i42 = aObject38.getId();
        io.github.agentsoz.jill.struct.AObject aObject44 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject46 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b47 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject44, aObject46);
        java.lang.String str48 = aObject44.getName();
        io.github.agentsoz.jill.struct.AObject aObject50 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject44, aObject50);
        io.github.agentsoz.jill.struct.AObject aObject53 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject50, aObject53);
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject38, aObject50);
        java.lang.String str56 = aObject50.toString();
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject26, aObject50);
        int i58 = aObject26.getId();
        boolean b59 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject26);
        aObject26.setName("hi!:-1:35:97");
        aObject26.setName(":0:32:-1:1:100");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + ":-1" + "'", str32.equals(":-1"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!:-1:-1" + "'", str36.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == (-1));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + ":-1" + "'", str56.equals(":-1"));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(i58 == (-1));
        org.junit.Assert.assertTrue(b59 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test087");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":-1:100");
        java.lang.String str2 = aObject1.getName();
        java.lang.String str3 = aObject1.toString();
        aObject1.setName("hi!:52");
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject(":-1:100");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        int i13 = aObject9.getId();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject17 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject17);
        java.lang.String str19 = aObject15.getName();
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject21);
        io.github.agentsoz.jill.struct.AObject aObject24 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject24);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject21);
        java.lang.String str27 = aObject21.toString();
        aObject21.setName("hi!:-1");
        aObject21.setName("");
        aObject21.setName("");
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject21);
        java.lang.String str35 = aObject21.getName();
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject21);
        java.lang.String str37 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject41 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject41);
        int i43 = aObject39.getId();
        io.github.agentsoz.jill.struct.AObject aObject45 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject47 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject45, aObject47);
        java.lang.String str49 = aObject45.getName();
        io.github.agentsoz.jill.struct.AObject aObject51 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject45, aObject51);
        io.github.agentsoz.jill.struct.AObject aObject54 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject51, aObject54);
        boolean b56 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject51);
        java.lang.String str57 = aObject51.toString();
        io.github.agentsoz.jill.struct.AObject aObject59 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject61 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b62 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject59, aObject61);
        java.lang.String str63 = aObject59.getName();
        io.github.agentsoz.jill.struct.AObject aObject65 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b66 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject59, aObject65);
        java.lang.String str67 = aObject59.getName();
        boolean b68 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject51, aObject59);
        aObject51.setName("");
        java.lang.String str71 = aObject51.getName();
        int i72 = aObject51.getId();
        boolean b73 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject51);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ":-1:100" + "'", str2.equals(":-1:100"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1:100:-1" + "'", str3.equals(":-1:100:-1"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!:52" + "'", str37.equals("hi!:52"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == (-1));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + ":-1" + "'", str57.equals(":-1"));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "" + "'", str67.equals(""));
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        org.junit.Assert.assertTrue(i72 == (-1));
        org.junit.Assert.assertTrue(b73 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test088");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        java.lang.String str21 = aObject15.toString();
        aObject15.setName("hi!:-1");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        aObject15.setName(":-1");
        aObject15.setId(100);
        aObject15.setId(35);
        io.github.agentsoz.jill.struct.AObject aObject32 = new io.github.agentsoz.jill.struct.AObject("hi!");
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject32);
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject37 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject35, aObject37);
        java.lang.String str39 = aObject35.getName();
        io.github.agentsoz.jill.struct.AObject aObject41 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject35, aObject41);
        io.github.agentsoz.jill.struct.AObject aObject44 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject41, aObject44);
        java.lang.String str46 = aObject44.getName();
        aObject44.setName("hi!:52");
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject44);
        java.lang.String str50 = aObject15.getName();
        java.lang.String str51 = aObject15.getName();
        java.lang.String str52 = aObject15.getName();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + ":-1" + "'", str50.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + ":-1" + "'", str51.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + ":-1" + "'", str52.equals(":-1"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test089");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        java.lang.String str21 = aObject15.toString();
        aObject15.setName("hi!:-1");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject26 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject26.setId((int) '#');
        java.lang.String str29 = aObject26.toString();
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject26);
        io.github.agentsoz.jill.struct.AObject aObject32 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject32, aObject34);
        java.lang.String str36 = aObject32.getName();
        aObject32.setId((int) (byte) -1);
        io.github.agentsoz.jill.struct.AObject aObject40 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject40, aObject42);
        int i44 = aObject40.getId();
        io.github.agentsoz.jill.struct.AObject aObject46 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject48 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject46, aObject48);
        java.lang.String str50 = aObject46.getName();
        io.github.agentsoz.jill.struct.AObject aObject52 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject46, aObject52);
        io.github.agentsoz.jill.struct.AObject aObject55 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b56 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject52, aObject55);
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject40, aObject52);
        java.lang.String str58 = aObject52.toString();
        aObject52.setName("hi!:-1");
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject32, aObject52);
        boolean b62 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject26, aObject32);
        java.lang.String str63 = aObject32.toString();
        java.lang.String str64 = aObject32.toString();
        java.lang.String str65 = aObject32.getName();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!:-1:35" + "'", str29.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == (-1));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + ":-1" + "'", str58.equals(":-1"));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + ":-1" + "'", str63.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + ":-1" + "'", str64.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test090");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        java.lang.String str6 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject8 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject10);
        java.lang.String str12 = aObject8.getName();
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject14);
        java.lang.String str16 = aObject14.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject14);
        aObject14.setName(":100:-1");
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject23);
        java.lang.String str25 = aObject21.getName();
        aObject21.setId((int) (byte) -1);
        aObject21.setName(":1");
        java.lang.String str30 = aObject21.getName();
        int i31 = aObject21.getId();
        int i32 = aObject21.getId();
        java.lang.String str33 = aObject21.toString();
        int i34 = aObject21.getId();
        int i35 = aObject21.getId();
        io.github.agentsoz.jill.struct.AObject aObject37 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject37, aObject39);
        java.lang.String str41 = aObject37.getName();
        io.github.agentsoz.jill.struct.AObject aObject43 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject37, aObject43);
        java.lang.String str45 = aObject37.getName();
        aObject37.setName("hi!");
        aObject37.setId(35);
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject37);
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject21);
        java.lang.String str52 = aObject21.toString();
        int i53 = aObject21.getId();
        int i54 = aObject21.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + ":1" + "'", str30.equals(":1"));
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + ":1:-1" + "'", str33.equals(":1:-1"));
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertTrue(i35 == (-1));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + ":1:-1" + "'", str52.equals(":1:-1"));
        org.junit.Assert.assertTrue(i53 == (-1));
        org.junit.Assert.assertTrue(i54 == (-1));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test091");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        java.lang.String str2 = aObject1.getName();
        int i3 = aObject1.getId();
        java.lang.String str4 = aObject1.toString();
        java.lang.String str5 = aObject1.toString();
        int i6 = aObject1.getId();
        java.lang.String str7 = aObject1.getName();
        java.lang.String str8 = aObject1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ":-1" + "'", str5.equals(":-1"));
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ":-1" + "'", str8.equals(":-1"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test092");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!");
        java.lang.String str2 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject4 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject4.setId((int) ' ');
        boolean b7 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject4);
        int i8 = aObject1.getId();
        aObject1.setName(":-1:97");
        java.lang.String str11 = aObject1.getName();
        aObject1.setName(":32:-1");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!:-1" + "'", str2.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1:97" + "'", str11.equals(":-1:97"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test093");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        java.lang.String str2 = aObject1.toString();
        java.lang.String str3 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject5, aObject7);
        java.lang.String str9 = aObject5.getName();
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject5, aObject11);
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject11, aObject14);
        java.lang.String str16 = aObject14.getName();
        java.lang.String str17 = aObject14.getName();
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject14);
        aObject1.setId((int) (short) 0);
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject22.setId((int) '#');
        java.lang.String str25 = aObject22.toString();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject29);
        int i31 = aObject27.getId();
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject35);
        java.lang.String str37 = aObject33.getName();
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject39);
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject42);
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject39);
        java.lang.String str45 = aObject39.toString();
        aObject39.setName("hi!:-1");
        java.lang.String str48 = aObject39.getName();
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject39);
        aObject22.setId((int) '4');
        aObject22.setName("hi!");
        int i54 = aObject22.getId();
        io.github.agentsoz.jill.struct.AObject aObject56 = new io.github.agentsoz.jill.struct.AObject("");
        java.lang.String str57 = aObject56.toString();
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject56);
        boolean b59 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject56);
        aObject56.setId((int) 'a');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ":-1" + "'", str2.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:-1:35" + "'", str25.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + ":-1" + "'", str45.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!:-1" + "'", str48.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(i54 == 52);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + ":-1" + "'", str57.equals(":-1"));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test094");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject1.setName(":1");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject5, aObject7);
        java.lang.String str9 = aObject5.getName();
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject5, aObject11);
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject11, aObject14);
        io.github.agentsoz.jill.struct.AObject aObject17 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject17.setName("");
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject17);
        aObject17.setId((int) (short) 1);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject17);
        aObject17.setName(":-1:-1");
        java.lang.String str26 = aObject17.getName();
        aObject17.setId((int) (byte) 0);
        io.github.agentsoz.jill.struct.AObject aObject30 = new io.github.agentsoz.jill.struct.AObject("hi!");
        java.lang.String str31 = aObject30.toString();
        int i32 = aObject30.getId();
        java.lang.String str33 = aObject30.toString();
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject37 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject37, aObject39);
        int i41 = aObject37.getId();
        io.github.agentsoz.jill.struct.AObject aObject43 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject45 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject43, aObject45);
        java.lang.String str47 = aObject43.getName();
        io.github.agentsoz.jill.struct.AObject aObject49 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject43, aObject49);
        io.github.agentsoz.jill.struct.AObject aObject52 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject49, aObject52);
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject37, aObject49);
        java.lang.String str55 = aObject49.toString();
        aObject49.setName("hi!:-1");
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject35, aObject49);
        aObject49.setName(":-1");
        aObject49.setId(100);
        aObject49.setId(35);
        aObject49.setId((int) (short) 1);
        java.lang.String str67 = aObject49.toString();
        boolean b68 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject30, aObject49);
        boolean b69 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject17, aObject30);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + ":-1:-1" + "'", str26.equals(":-1:-1"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!:-1" + "'", str31.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!:-1" + "'", str33.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == (-1));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + ":-1" + "'", str55.equals(":-1"));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + ":-1:1" + "'", str67.equals(":-1:1"));
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test095");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        aObject1.setName(":97:10:-1");
        aObject1.setName("hi!:-1:35:97:0");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test096");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject13.setName("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject18.setId((int) '#');
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject18);
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject25 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject23, aObject25);
        int i27 = aObject23.getId();
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject29, aObject31);
        java.lang.String str33 = aObject29.getName();
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject29, aObject35);
        io.github.agentsoz.jill.struct.AObject aObject38 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject35, aObject38);
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject23, aObject35);
        java.lang.String str41 = aObject35.toString();
        io.github.agentsoz.jill.struct.AObject aObject43 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject45 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject43, aObject45);
        java.lang.String str47 = aObject43.getName();
        io.github.agentsoz.jill.struct.AObject aObject49 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject43, aObject49);
        java.lang.String str51 = aObject43.getName();
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject35, aObject43);
        io.github.agentsoz.jill.struct.AObject aObject54 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject56 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject58 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b59 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject56, aObject58);
        int i60 = aObject56.getId();
        io.github.agentsoz.jill.struct.AObject aObject62 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject64 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b65 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject62, aObject64);
        java.lang.String str66 = aObject62.getName();
        io.github.agentsoz.jill.struct.AObject aObject68 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b69 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject62, aObject68);
        io.github.agentsoz.jill.struct.AObject aObject71 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b72 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject68, aObject71);
        boolean b73 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject56, aObject68);
        java.lang.String str74 = aObject68.toString();
        aObject68.setName("hi!:-1");
        boolean b77 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject54, aObject68);
        aObject68.setName(":-1");
        aObject68.setId(100);
        boolean b82 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject43, aObject68);
        boolean b83 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject68);
        aObject68.setName("");
        aObject68.setId((int) (short) -1);
        java.lang.String str88 = aObject68.getName();
        java.lang.String str89 = aObject68.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == (-1));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + ":-1" + "'", str41.equals(":-1"));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i60 == (-1));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + ":-1" + "'", str74.equals(":-1"));
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue("'" + str88 + "' != '" + "" + "'", str88.equals(""));
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + ":-1" + "'", str89.equals(":-1"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test097");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        aObject1.setId((int) (short) -1);
        java.lang.String str15 = aObject1.toString();
        aObject1.setName(":10");
        aObject1.setName("hi!:-1:1");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ":-1" + "'", str15.equals(":-1"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test098");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        java.lang.String str21 = aObject15.toString();
        aObject15.setName("hi!:-1");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        java.lang.String str25 = aObject15.toString();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject29);
        int i31 = aObject27.getId();
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject35);
        java.lang.String str37 = aObject33.getName();
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject39);
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject42);
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject39);
        java.lang.String str45 = aObject39.toString();
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject39);
        io.github.agentsoz.jill.struct.AObject aObject48 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject50 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject52 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject50, aObject52);
        int i54 = aObject50.getId();
        io.github.agentsoz.jill.struct.AObject aObject56 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject58 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b59 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject56, aObject58);
        java.lang.String str60 = aObject56.getName();
        io.github.agentsoz.jill.struct.AObject aObject62 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject56, aObject62);
        io.github.agentsoz.jill.struct.AObject aObject65 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b66 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject62, aObject65);
        boolean b67 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject50, aObject62);
        java.lang.String str68 = aObject62.toString();
        aObject62.setName("hi!:-1");
        boolean b71 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject62);
        aObject62.setId((int) '#');
        boolean b74 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject62);
        java.lang.String str75 = aObject39.getName();
        int i76 = aObject39.getId();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:-1:-1" + "'", str25.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + ":-1" + "'", str45.equals(":-1"));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == (-1));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "" + "'", str60.equals(""));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + ":-1" + "'", str68.equals(":-1"));
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "" + "'", str75.equals(""));
        org.junit.Assert.assertTrue(i76 == (-1));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test099");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!");
        java.lang.String str2 = aObject1.toString();
        java.lang.String str3 = aObject1.getName();
        java.lang.String str4 = aObject1.toString();
        java.lang.String str5 = aObject1.getName();
        int i6 = aObject1.getId();
        java.lang.String str7 = aObject1.toString();
        aObject1.setName(":1");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!:-1" + "'", str2.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:-1" + "'", str7.equals("hi!:-1"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test100");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        java.lang.String str6 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject8 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject10);
        java.lang.String str12 = aObject8.getName();
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject14);
        java.lang.String str16 = aObject14.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject14);
        aObject14.setName("hi!");
        java.lang.String str20 = aObject14.getName();
        aObject14.setId((int) (short) 10);
        io.github.agentsoz.jill.struct.AObject aObject24 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject26 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject24, aObject26);
        java.lang.String str28 = aObject24.getName();
        io.github.agentsoz.jill.struct.AObject aObject30 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject24, aObject30);
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject30, aObject33);
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject36.setName("");
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject36);
        aObject33.setId((int) (short) 10);
        io.github.agentsoz.jill.struct.AObject aObject43 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject43.setName(":1");
        io.github.agentsoz.jill.struct.AObject aObject47 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject49 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject47, aObject49);
        java.lang.String str51 = aObject47.getName();
        io.github.agentsoz.jill.struct.AObject aObject53 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject47, aObject53);
        io.github.agentsoz.jill.struct.AObject aObject56 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject53, aObject56);
        io.github.agentsoz.jill.struct.AObject aObject59 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject59.setName("");
        boolean b62 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject56, aObject59);
        aObject59.setId((int) (short) 1);
        boolean b65 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject43, aObject59);
        boolean b66 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject59);
        java.lang.String str67 = aObject33.getName();
        boolean b68 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject33);
        java.lang.String str69 = aObject33.toString();
        java.lang.String str70 = aObject33.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "" + "'", str67.equals(""));
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + ":10" + "'", str69.equals(":10"));
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "" + "'", str70.equals(""));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test101");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        aObject13.setName("");
        aObject13.setId((int) (short) 0);
        int i23 = aObject13.getId();
        aObject13.setId((int) 'a');
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("hi!");
        java.lang.String str28 = aObject27.toString();
        io.github.agentsoz.jill.struct.AObject aObject30 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject30.setId((int) ' ');
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject30);
        int i34 = aObject27.getId();
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject27);
        aObject27.setId((-1));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!:-1" + "'", str28.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test102");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        int i13 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject17 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject17);
        java.lang.String str19 = aObject15.getName();
        java.lang.String str20 = aObject15.toString();
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject24 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject24);
        java.lang.String str26 = aObject22.getName();
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject28);
        java.lang.String str30 = aObject28.getName();
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject28);
        java.lang.String str32 = aObject15.toString();
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject38 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject36, aObject38);
        int i40 = aObject36.getId();
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject44 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject42, aObject44);
        java.lang.String str46 = aObject42.getName();
        io.github.agentsoz.jill.struct.AObject aObject48 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject42, aObject48);
        io.github.agentsoz.jill.struct.AObject aObject51 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject51);
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject36, aObject48);
        java.lang.String str54 = aObject48.toString();
        aObject48.setName("hi!:-1");
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, aObject48);
        aObject48.setName(":-1");
        io.github.agentsoz.jill.struct.AObject aObject61 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        boolean b62 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject61);
        aObject48.setId((int) 'a');
        boolean b65 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject48);
        boolean b66 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject68 = new io.github.agentsoz.jill.struct.AObject(":1");
        boolean b69 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject68);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + ":-1" + "'", str20.equals(":-1"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + ":-1" + "'", str32.equals(":-1"));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == (-1));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + ":-1" + "'", str54.equals(":-1"));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test103");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject1.setName(":1");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject5, aObject7);
        java.lang.String str9 = aObject5.getName();
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject5, aObject11);
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject11, aObject14);
        io.github.agentsoz.jill.struct.AObject aObject17 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject17.setName("");
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject17);
        aObject17.setId((int) (short) 1);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject17);
        java.lang.String str24 = aObject1.toString();
        java.lang.String str25 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject27.setId((int) '#');
        int i30 = aObject27.getId();
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject27);
        aObject27.setId((int) 'a');
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + ":1:-1" + "'", str24.equals(":1:-1"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + ":1:-1" + "'", str25.equals(":1:-1"));
        org.junit.Assert.assertTrue(i30 == 35);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test104");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        java.lang.String str6 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject8 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject10);
        java.lang.String str12 = aObject8.getName();
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject14);
        java.lang.String str16 = aObject14.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject14);
        int i18 = aObject1.getId();
        java.lang.String str19 = aObject1.toString();
        java.lang.String str20 = aObject1.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test105");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        aObject1.setName("hi!");
        java.lang.String str11 = aObject1.getName();
        int i12 = aObject1.getId();
        java.lang.String str13 = aObject1.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test106");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        java.lang.String str21 = aObject15.toString();
        aObject15.setName("hi!:-1");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        aObject15.setName(":-1");
        java.lang.String str27 = aObject15.toString();
        aObject15.setName("hi!");
        int i30 = aObject15.getId();
        io.github.agentsoz.jill.struct.AObject aObject32 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject32, aObject34);
        int i36 = aObject32.getId();
        io.github.agentsoz.jill.struct.AObject aObject38 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject40 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject38, aObject40);
        java.lang.String str42 = aObject38.getName();
        io.github.agentsoz.jill.struct.AObject aObject44 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject38, aObject44);
        io.github.agentsoz.jill.struct.AObject aObject47 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject44, aObject47);
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject32, aObject44);
        java.lang.String str50 = aObject44.toString();
        aObject44.setName("hi!:-1");
        aObject44.setName("");
        aObject44.setName("hi!:-1:35");
        aObject44.setId((int) 'a');
        java.lang.String str59 = aObject44.getName();
        io.github.agentsoz.jill.struct.AObject aObject61 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject63 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b64 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject61, aObject63);
        java.lang.String str65 = aObject61.getName();
        io.github.agentsoz.jill.struct.AObject aObject67 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b68 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject61, aObject67);
        aObject61.setName("hi!");
        java.lang.String str71 = aObject61.getName();
        aObject61.setId((int) (short) 1);
        boolean b74 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject44, aObject61);
        int i75 = aObject61.getId();
        java.lang.String str76 = aObject61.toString();
        java.lang.String str77 = aObject61.getName();
        boolean b78 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject61);
        io.github.agentsoz.jill.struct.AObject aObject80 = new io.github.agentsoz.jill.struct.AObject(":52");
        aObject80.setId((int) (short) 1);
        boolean b83 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject61, aObject80);
        aObject80.setName(":1:10");
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1:-1" + "'", str27.equals(":-1:-1"));
        org.junit.Assert.assertTrue(i30 == (-1));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + ":-1" + "'", str50.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!:-1:35" + "'", str59.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "hi!" + "'", str71.equals("hi!"));
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(i75 == 1);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "hi!:1" + "'", str76.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "hi!" + "'", str77.equals("hi!"));
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(b83 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test107");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":0");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        java.lang.String str7 = aObject3.getName();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject9);
        java.lang.String str11 = aObject3.getName();
        aObject3.setName("hi!");
        aObject3.setId(35);
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str17 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject19 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject19, aObject21);
        java.lang.String str23 = aObject19.getName();
        io.github.agentsoz.jill.struct.AObject aObject25 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject19, aObject25);
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject25, aObject28);
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject31.setName("");
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject28, aObject31);
        aObject31.setId((int) (short) 1);
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject31);
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("hi!");
        java.lang.String str40 = aObject39.toString();
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject42.setId((int) ' ');
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject42);
        java.lang.String str46 = aObject42.getName();
        aObject42.setId((int) (byte) -1);
        aObject42.setName(":-1:1");
        aObject42.setId((int) (byte) 1);
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject42);
        aObject42.setId(1);
        aObject42.setId(100);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":0" + "'", str17.equals(":0"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!:-1" + "'", str40.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + ":0" + "'", str46.equals(":0"));
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test108");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        aObject7.setId((int) (short) 1);
        aObject7.setName("hi!:-1:35");
        int i16 = aObject7.getId();
        int i17 = aObject7.getId();
        io.github.agentsoz.jill.struct.AObject aObject19 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject19, aObject21);
        int i23 = aObject19.getId();
        io.github.agentsoz.jill.struct.AObject aObject25 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject25, aObject27);
        java.lang.String str29 = aObject25.getName();
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject25, aObject31);
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject34);
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject19, aObject31);
        java.lang.String str37 = aObject31.toString();
        aObject31.setName("hi!:-1");
        aObject31.setName("");
        aObject31.setName("hi!:-1:35");
        aObject31.setId((int) 'a');
        int i46 = aObject31.getId();
        java.lang.String str47 = aObject31.toString();
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject31);
        java.lang.String str49 = aObject31.getName();
        java.lang.String str50 = aObject31.toString();
        aObject31.setId((int) 'a');
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + ":-1" + "'", str37.equals(":-1"));
        org.junit.Assert.assertTrue(i46 == 97);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!:-1:35:97" + "'", str47.equals("hi!:-1:35:97"));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!:-1:35" + "'", str49.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!:-1:35:97" + "'", str50.equals("hi!:-1:35:97"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test109");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        java.lang.String str9 = aObject1.getName();
        aObject1.setName("hi!");
        aObject1.setId((int) (byte) 10);
        java.lang.String str14 = aObject1.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:10" + "'", str14.equals("hi!:10"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test110");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        java.lang.String str21 = aObject15.toString();
        aObject15.setName("hi!:-1");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        aObject15.setName(":-1");
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject28);
        int i30 = aObject28.getId();
        int i31 = aObject28.getId();
        aObject28.setName("hi!:1:-1");
        java.lang.String str34 = aObject28.toString();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == (-1));
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!:1:-1:-1" + "'", str34.equals("hi!:1:-1:-1"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test111");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":0:32:-1:1:100");
        java.lang.String str2 = aObject1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ":0:32:-1:1:100:-1" + "'", str2.equals(":0:32:-1:1:100:-1"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test112");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject1.setId((int) '#');
        java.lang.String str4 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject6 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject8 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject6, aObject8);
        int i10 = aObject6.getId();
        io.github.agentsoz.jill.struct.AObject aObject12 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject12, aObject14);
        java.lang.String str16 = aObject12.getName();
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject12, aObject18);
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject18, aObject21);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject6, aObject18);
        java.lang.String str24 = aObject18.toString();
        aObject18.setName("hi!:-1");
        java.lang.String str27 = aObject18.getName();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject18);
        aObject1.setId((int) '4');
        aObject1.setName("hi!");
        int i33 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        java.lang.String str36 = aObject35.toString();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject35);
        aObject1.setId((int) (short) 10);
        aObject1.setName("hi!:-1");
        aObject1.setName(":1:-1");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1:35" + "'", str4.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + ":-1" + "'", str24.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1" + "'", str27.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i33 == 52);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + ":-1" + "'", str36.equals(":-1"));
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test113");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.toString();
        aObject13.setName("hi!:-1");
        aObject13.setName("");
        aObject13.setName("hi!:-1:35");
        aObject13.setId((int) 'a');
        java.lang.String str28 = aObject13.getName();
        io.github.agentsoz.jill.struct.AObject aObject30 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject32 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject30, aObject32);
        java.lang.String str34 = aObject30.getName();
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject30, aObject36);
        aObject30.setName("hi!");
        java.lang.String str40 = aObject30.getName();
        aObject30.setId((int) (short) 1);
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject30);
        aObject13.setName(":-1:-1");
        io.github.agentsoz.jill.struct.AObject aObject47 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject49 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject47, aObject49);
        int i51 = aObject47.getId();
        io.github.agentsoz.jill.struct.AObject aObject53 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject55 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b56 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject53, aObject55);
        java.lang.String str57 = aObject53.getName();
        io.github.agentsoz.jill.struct.AObject aObject59 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b60 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject53, aObject59);
        io.github.agentsoz.jill.struct.AObject aObject62 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject59, aObject62);
        boolean b64 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject47, aObject59);
        java.lang.String str65 = aObject59.toString();
        io.github.agentsoz.jill.struct.AObject aObject67 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject69 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b70 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject67, aObject69);
        java.lang.String str71 = aObject67.getName();
        io.github.agentsoz.jill.struct.AObject aObject73 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b74 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject67, aObject73);
        java.lang.String str75 = aObject67.getName();
        boolean b76 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject59, aObject67);
        aObject67.setId((int) '4');
        boolean b79 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject67);
        java.lang.String str80 = aObject13.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!:-1:35" + "'", str28.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(i51 == (-1));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + ":-1" + "'", str65.equals(":-1"));
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "" + "'", str75.equals(""));
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + ":-1:-1" + "'", str80.equals(":-1:-1"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test114");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        aObject1.setId((int) (short) -1);
        java.lang.String str15 = aObject1.toString();
        aObject1.setName(":10");
        io.github.agentsoz.jill.struct.AObject aObject19 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject19, aObject21);
        java.lang.String str23 = aObject19.getName();
        io.github.agentsoz.jill.struct.AObject aObject25 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject19, aObject25);
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject25, aObject28);
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject31.setName("");
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject28, aObject31);
        java.lang.String str35 = aObject28.getName();
        int i36 = aObject28.getId();
        java.lang.String str37 = aObject28.toString();
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject41 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject41);
        int i43 = aObject39.getId();
        io.github.agentsoz.jill.struct.AObject aObject45 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject47 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject45, aObject47);
        java.lang.String str49 = aObject45.getName();
        io.github.agentsoz.jill.struct.AObject aObject51 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject45, aObject51);
        io.github.agentsoz.jill.struct.AObject aObject54 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject51, aObject54);
        boolean b56 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject51);
        aObject51.setName("");
        aObject51.setId((int) (short) 0);
        int i61 = aObject51.getId();
        boolean b62 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject28, aObject51);
        aObject51.setName(":-1:100");
        java.lang.String str65 = aObject51.toString();
        boolean b66 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject51);
        int i67 = aObject1.getId();
        java.lang.String str68 = aObject1.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ":-1" + "'", str15.equals(":-1"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + ":-1" + "'", str37.equals(":-1"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == (-1));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + ":-1:100:0" + "'", str65.equals(":-1:100:0"));
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(i67 == (-1));
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + ":10:-1" + "'", str68.equals(":10:-1"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test115");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        aObject13.setName("");
        aObject13.setId((int) (short) 0);
        int i23 = aObject13.getId();
        aObject13.setId((int) 'a');
        java.lang.String str26 = aObject13.getName();
        java.lang.String str27 = aObject13.getName();
        aObject13.setId((int) (short) 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test116");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        aObject1.setId((int) (short) -1);
        java.lang.String str15 = aObject1.toString();
        aObject1.setName(":10");
        aObject1.setId(10);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ":-1" + "'", str15.equals(":-1"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test117");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!");
        java.lang.String str2 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject4 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject4.setId((int) ' ');
        boolean b7 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject4);
        int i8 = aObject1.getId();
        java.lang.String str9 = aObject1.toString();
        aObject1.setId((int) (byte) 0);
        java.lang.String str12 = aObject1.getName();
        int i13 = aObject1.getId();
        aObject1.setId(35);
        java.lang.String str16 = aObject1.getName();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!:-1" + "'", str2.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:-1" + "'", str9.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test118");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject5, aObject7);
        int i9 = aObject5.getId();
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject11, aObject13);
        java.lang.String str15 = aObject11.getName();
        io.github.agentsoz.jill.struct.AObject aObject17 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject11, aObject17);
        io.github.agentsoz.jill.struct.AObject aObject20 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject17, aObject20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject5, aObject17);
        java.lang.String str23 = aObject17.toString();
        aObject17.setName("hi!:-1");
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject17);
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject28.setId((int) '#');
        java.lang.String str31 = aObject28.toString();
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject28);
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, aObject36);
        java.lang.String str38 = aObject34.getName();
        aObject34.setId((int) (byte) -1);
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject44 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject42, aObject44);
        int i46 = aObject42.getId();
        io.github.agentsoz.jill.struct.AObject aObject48 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject50 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject50);
        java.lang.String str52 = aObject48.getName();
        io.github.agentsoz.jill.struct.AObject aObject54 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject54);
        io.github.agentsoz.jill.struct.AObject aObject57 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject54, aObject57);
        boolean b59 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject42, aObject54);
        java.lang.String str60 = aObject54.toString();
        aObject54.setName("hi!:-1");
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, aObject54);
        boolean b64 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject28, aObject34);
        int i65 = aObject34.getId();
        java.lang.String str66 = aObject34.getName();
        boolean b67 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject34);
        aObject1.setName(":1:-1:-1");
        aObject1.setId(1);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ":-1" + "'", str23.equals(":-1"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!:-1:35" + "'", str31.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i46 == (-1));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + ":-1" + "'", str60.equals(":-1"));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i65 == (-1));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        org.junit.Assert.assertTrue(b67 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test119");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        int i19 = aObject1.getId();
        java.lang.String str20 = aObject1.toString();
        aObject1.setName("");
        aObject1.setId(0);
        java.lang.String str25 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject29);
        java.lang.String str31 = aObject27.getName();
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject27);
        java.lang.String str33 = aObject1.getName();
        int i34 = aObject1.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + ":-1" + "'", str20.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue(i34 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test120");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1:35:97:0");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        java.lang.String str7 = aObject3.getName();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject9);
        io.github.agentsoz.jill.struct.AObject aObject12 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject12);
        int i14 = aObject9.getId();
        aObject9.setId((int) (byte) 100);
        aObject9.setId((int) (byte) 10);
        aObject9.setName(":-1:32");
        java.lang.String str21 = aObject9.getName();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject9);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1:32" + "'", str21.equals(":-1:32"));
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test121");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1:-1");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        int i21 = aObject3.getId();
        java.lang.String str22 = aObject3.getName();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        aObject1.setName("hi!:-1:35");
        java.lang.String str26 = aObject1.toString();
        aObject1.setName(":0:32:-1");
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:-1:35:-1" + "'", str26.equals("hi!:-1:35:-1"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test122");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        java.lang.String str6 = aObject1.toString();
        aObject1.setName(":-1:-1");
        aObject1.setName("hi!:-1:35:1");
        int i11 = aObject1.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(i11 == (-1));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test123");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        java.lang.String str6 = aObject1.toString();
        aObject1.setName(":-1:-1");
        aObject1.setName("hi!:-1:35:1");
        java.lang.String str11 = aObject1.toString();
        aObject1.setId(35);
        aObject1.setName(":32:-1");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:-1:35:1:-1" + "'", str11.equals("hi!:-1:35:1:-1"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test124");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        java.lang.String str7 = aObject3.getName();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject9);
        io.github.agentsoz.jill.struct.AObject aObject12 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject12);
        int i14 = aObject9.getId();
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject9);
        java.lang.String str16 = aObject1.toString();
        java.lang.String str17 = aObject1.toString();
        aObject1.setName("hi!:-1:-1");
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject23);
        java.lang.String str25 = aObject21.getName();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject27);
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject27);
        java.lang.String str30 = aObject27.toString();
        io.github.agentsoz.jill.struct.AObject aObject32 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, aObject36);
        java.lang.String str38 = aObject34.getName();
        io.github.agentsoz.jill.struct.AObject aObject40 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, aObject40);
        io.github.agentsoz.jill.struct.AObject aObject43 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject40, aObject43);
        int i45 = aObject40.getId();
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject32, aObject40);
        java.lang.String str47 = aObject32.toString();
        java.lang.String str48 = aObject32.toString();
        aObject32.setName("hi!:-1:-1");
        aObject32.setName(":10");
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject32);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":-1" + "'", str16.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + ":-1" + "'", str30.equals(":-1"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i45 == (-1));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + ":-1" + "'", str47.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + ":-1" + "'", str48.equals(":-1"));
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test125");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject1.setName(":1");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject5, aObject7);
        java.lang.String str9 = aObject5.getName();
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject5, aObject11);
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject11, aObject14);
        io.github.agentsoz.jill.struct.AObject aObject17 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject17.setName("");
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject17);
        aObject17.setId((int) (short) 1);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject17);
        aObject17.setName(":-1:-1");
        aObject17.setId((int) ' ');
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test126");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":-1:100:0:10");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test127");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        int i19 = aObject1.getId();
        java.lang.String str20 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject22.setId((int) '#');
        java.lang.String str25 = aObject22.toString();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject29);
        int i31 = aObject27.getId();
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject35);
        java.lang.String str37 = aObject33.getName();
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject39);
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject42);
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject39);
        java.lang.String str45 = aObject39.toString();
        aObject39.setName("hi!:-1");
        java.lang.String str48 = aObject39.getName();
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject39);
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject22);
        java.lang.String str51 = aObject22.toString();
        aObject22.setId((int) (short) 1);
        int i54 = aObject22.getId();
        java.lang.String str55 = aObject22.toString();
        java.lang.String str56 = aObject22.toString();
        aObject22.setName(":-1:-1");
        java.lang.String str59 = aObject22.getName();
        java.lang.String str60 = aObject22.getName();
        java.lang.String str61 = aObject22.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:-1:35" + "'", str25.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + ":-1" + "'", str45.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!:-1" + "'", str48.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!:-1:35" + "'", str51.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(i54 == 1);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!:-1:1" + "'", str55.equals("hi!:-1:1"));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!:-1:1" + "'", str56.equals("hi!:-1:1"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + ":-1:-1" + "'", str59.equals(":-1:-1"));
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + ":-1:-1" + "'", str60.equals(":-1:-1"));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + ":-1:-1" + "'", str61.equals(":-1:-1"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test128");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        java.lang.String str6 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject8 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject10);
        java.lang.String str12 = aObject8.getName();
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject14);
        java.lang.String str16 = aObject14.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject14);
        aObject14.setName("hi!");
        aObject14.setName("hi!:-1");
        java.lang.String str22 = aObject14.toString();
        int i23 = aObject14.getId();
        io.github.agentsoz.jill.struct.AObject aObject25 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject25, aObject27);
        java.lang.String str29 = aObject25.getName();
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject25, aObject31);
        java.lang.String str33 = aObject25.getName();
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject35.setName(":1");
        aObject35.setId(10);
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject25, aObject35);
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject25);
        java.lang.String str42 = aObject14.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!:-1:-1" + "'", str22.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!:-1" + "'", str42.equals("hi!:-1"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test129");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        java.lang.String str21 = aObject15.toString();
        aObject15.setName("hi!:-1");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        java.lang.String str25 = aObject15.toString();
        int i26 = aObject15.getId();
        int i27 = aObject15.getId();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:-1:-1" + "'", str25.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue(i27 == (-1));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test130");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.toString();
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject23);
        java.lang.String str25 = aObject21.getName();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject27);
        io.github.agentsoz.jill.struct.AObject aObject30 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject30);
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject33.setName("");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject30, aObject33);
        aObject30.setId((int) (short) 10);
        aObject30.setName(":-1");
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject30);
        java.lang.String str42 = aObject13.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + ":-1" + "'", str42.equals(":-1"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test131");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1:35:-1:-1");
        int i2 = aObject1.getId();
        int i3 = aObject1.getId();
        org.junit.Assert.assertTrue(i2 == (-1));
        org.junit.Assert.assertTrue(i3 == (-1));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test132");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject1.setId((int) '#');
        java.lang.String str4 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject6 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject8 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject6, aObject8);
        int i10 = aObject6.getId();
        io.github.agentsoz.jill.struct.AObject aObject12 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject12, aObject14);
        java.lang.String str16 = aObject12.getName();
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject12, aObject18);
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject18, aObject21);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject6, aObject18);
        java.lang.String str24 = aObject18.toString();
        aObject18.setName("hi!:-1");
        java.lang.String str27 = aObject18.getName();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject18);
        aObject1.setId((int) '4');
        aObject1.setName("hi!");
        int i33 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        java.lang.String str36 = aObject35.toString();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject35);
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject41 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject41);
        java.lang.String str43 = aObject39.getName();
        io.github.agentsoz.jill.struct.AObject aObject45 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject45);
        io.github.agentsoz.jill.struct.AObject aObject48 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject45, aObject48);
        io.github.agentsoz.jill.struct.AObject aObject51 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject51.setName("");
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject51);
        aObject48.setId((int) (short) 10);
        int i57 = aObject48.getId();
        int i58 = aObject48.getId();
        java.lang.String str59 = aObject48.getName();
        io.github.agentsoz.jill.struct.AObject aObject61 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject63 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b64 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject61, aObject63);
        int i65 = aObject61.getId();
        io.github.agentsoz.jill.struct.AObject aObject67 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject69 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b70 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject67, aObject69);
        java.lang.String str71 = aObject67.getName();
        io.github.agentsoz.jill.struct.AObject aObject73 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b74 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject67, aObject73);
        io.github.agentsoz.jill.struct.AObject aObject76 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b77 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject73, aObject76);
        boolean b78 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject61, aObject73);
        java.lang.String str79 = aObject61.toString();
        boolean b80 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject61);
        java.lang.String str81 = aObject61.getName();
        boolean b82 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject35, aObject61);
        aObject35.setId(0);
        int i85 = aObject35.getId();
        aObject35.setName("hi!:-1:1:-1:-1");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1:35" + "'", str4.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + ":-1" + "'", str24.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1" + "'", str27.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i33 == 52);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + ":-1" + "'", str36.equals(":-1"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i57 == 10);
        org.junit.Assert.assertTrue(i58 == 10);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i65 == (-1));
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + ":-1" + "'", str79.equals(":-1"));
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "" + "'", str81.equals(""));
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(i85 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test133");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        java.lang.String str6 = aObject1.toString();
        int i7 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject21.setName("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject18, aObject21);
        io.github.agentsoz.jill.struct.AObject aObject26 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject26.setId((int) '#');
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject18, aObject26);
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject33);
        int i35 = aObject31.getId();
        io.github.agentsoz.jill.struct.AObject aObject37 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject37, aObject39);
        java.lang.String str41 = aObject37.getName();
        io.github.agentsoz.jill.struct.AObject aObject43 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject37, aObject43);
        io.github.agentsoz.jill.struct.AObject aObject46 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b47 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject43, aObject46);
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject43);
        java.lang.String str49 = aObject43.toString();
        io.github.agentsoz.jill.struct.AObject aObject51 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject53 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject51, aObject53);
        java.lang.String str55 = aObject51.getName();
        io.github.agentsoz.jill.struct.AObject aObject57 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject51, aObject57);
        java.lang.String str59 = aObject51.getName();
        boolean b60 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject43, aObject51);
        io.github.agentsoz.jill.struct.AObject aObject62 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject64 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject66 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b67 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject64, aObject66);
        int i68 = aObject64.getId();
        io.github.agentsoz.jill.struct.AObject aObject70 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject72 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b73 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject70, aObject72);
        java.lang.String str74 = aObject70.getName();
        io.github.agentsoz.jill.struct.AObject aObject76 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b77 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject70, aObject76);
        io.github.agentsoz.jill.struct.AObject aObject79 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b80 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject76, aObject79);
        boolean b81 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject64, aObject76);
        java.lang.String str82 = aObject76.toString();
        aObject76.setName("hi!:-1");
        boolean b85 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject62, aObject76);
        aObject76.setName(":-1");
        aObject76.setId(100);
        boolean b90 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject51, aObject76);
        boolean b91 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject18, aObject76);
        aObject76.setName("");
        aObject76.setId((int) (short) -1);
        java.lang.String str96 = aObject76.getName();
        boolean b97 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject76);
        java.lang.String str98 = aObject1.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i35 == (-1));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + ":-1" + "'", str49.equals(":-1"));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(i68 == (-1));
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "" + "'", str74.equals(""));
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + ":-1" + "'", str82.equals(":-1"));
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertTrue("'" + str96 + "' != '" + "" + "'", str96.equals(""));
        org.junit.Assert.assertTrue(b97 == false);
        org.junit.Assert.assertTrue("'" + str98 + "' != '" + "" + "'", str98.equals(""));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test134");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject3.getId();
        aObject3.setId(32);
        java.lang.String str8 = aObject3.toString();
        int i9 = aObject3.getId();
        int i10 = aObject3.getId();
        aObject3.setName(":-1:10:0");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ":32" + "'", str8.equals(":32"));
        org.junit.Assert.assertTrue(i9 == 32);
        org.junit.Assert.assertTrue(i10 == 32);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test135");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.getName();
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject25 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject23, aObject25);
        int i27 = aObject23.getId();
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject29, aObject31);
        java.lang.String str33 = aObject29.getName();
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject29, aObject35);
        io.github.agentsoz.jill.struct.AObject aObject38 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject35, aObject38);
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject23, aObject35);
        java.lang.String str41 = aObject35.toString();
        aObject35.setName("hi!:-1");
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject35);
        io.github.agentsoz.jill.struct.AObject aObject46 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject46.setId((int) '#');
        java.lang.String str49 = aObject46.toString();
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject46);
        io.github.agentsoz.jill.struct.AObject aObject52 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject54 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject52, aObject54);
        java.lang.String str56 = aObject52.getName();
        aObject52.setId((int) (byte) -1);
        io.github.agentsoz.jill.struct.AObject aObject60 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject62 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject60, aObject62);
        int i64 = aObject60.getId();
        io.github.agentsoz.jill.struct.AObject aObject66 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject68 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b69 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject66, aObject68);
        java.lang.String str70 = aObject66.getName();
        io.github.agentsoz.jill.struct.AObject aObject72 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b73 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject66, aObject72);
        io.github.agentsoz.jill.struct.AObject aObject75 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b76 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject72, aObject75);
        boolean b77 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject60, aObject72);
        java.lang.String str78 = aObject72.toString();
        aObject72.setName("hi!:-1");
        boolean b81 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject52, aObject72);
        boolean b82 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject46, aObject52);
        boolean b83 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject52);
        java.lang.String str84 = aObject52.getName();
        aObject52.setId((int) (byte) 1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == (-1));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + ":-1" + "'", str41.equals(":-1"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!:-1:35" + "'", str49.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i64 == (-1));
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "" + "'", str70.equals(""));
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + ":-1" + "'", str78.equals(":-1"));
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "" + "'", str84.equals(""));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test136");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        aObject13.setName("");
        aObject13.setId((int) (short) 0);
        int i23 = aObject13.getId();
        java.lang.String str24 = aObject13.getName();
        java.lang.String str25 = aObject13.toString();
        aObject13.setId((int) (short) 100);
        java.lang.String str28 = aObject13.toString();
        java.lang.String str29 = aObject13.toString();
        java.lang.String str30 = aObject13.getName();
        java.lang.String str31 = aObject13.getName();
        java.lang.String str32 = aObject13.toString();
        java.lang.String str33 = aObject13.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + ":0" + "'", str25.equals(":0"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":100" + "'", str28.equals(":100"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + ":100" + "'", str29.equals(":100"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + ":100" + "'", str32.equals(":100"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + ":100" + "'", str33.equals(":100"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test137");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":-1");
        java.lang.String str2 = aObject1.toString();
        aObject1.setName("hi!:-1");
        java.lang.String str5 = aObject1.getName();
        aObject1.setId((int) (short) 10);
        aObject1.setId(1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ":-1:-1" + "'", str2.equals(":-1:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test138");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject1.setName(":1");
        aObject1.setId(10);
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        int i11 = aObject7.getId();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject15);
        java.lang.String str17 = aObject13.getName();
        io.github.agentsoz.jill.struct.AObject aObject19 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject19);
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject19, aObject22);
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject19);
        aObject19.setName("");
        aObject19.setId((int) (short) 0);
        int i29 = aObject19.getId();
        java.lang.String str30 = aObject19.toString();
        aObject19.setName("hi!:-1:32");
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject19);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + ":0" + "'", str30.equals(":0"));
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test139");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        int i12 = aObject7.getId();
        aObject7.setId((int) (byte) 1);
        aObject7.setName("hi!:-1:-1");
        aObject7.setName("hi!:-1:-1");
        io.github.agentsoz.jill.struct.AObject aObject20 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject20, aObject22);
        int i24 = aObject20.getId();
        io.github.agentsoz.jill.struct.AObject aObject26 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject26, aObject28);
        java.lang.String str30 = aObject26.getName();
        io.github.agentsoz.jill.struct.AObject aObject32 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject26, aObject32);
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject32, aObject35);
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject20, aObject32);
        int i38 = aObject20.getId();
        java.lang.String str39 = aObject20.getName();
        io.github.agentsoz.jill.struct.AObject aObject41 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject41.setId((int) '#');
        java.lang.String str44 = aObject41.toString();
        io.github.agentsoz.jill.struct.AObject aObject46 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject48 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject46, aObject48);
        int i50 = aObject46.getId();
        io.github.agentsoz.jill.struct.AObject aObject52 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject54 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject52, aObject54);
        java.lang.String str56 = aObject52.getName();
        io.github.agentsoz.jill.struct.AObject aObject58 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b59 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject52, aObject58);
        io.github.agentsoz.jill.struct.AObject aObject61 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b62 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject58, aObject61);
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject46, aObject58);
        java.lang.String str64 = aObject58.toString();
        aObject58.setName("hi!:-1");
        java.lang.String str67 = aObject58.getName();
        boolean b68 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject41, aObject58);
        boolean b69 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject20, aObject41);
        boolean b70 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject41);
        aObject41.setName("hi!:-1:35:1");
        aObject41.setId((int) (short) 1);
        java.lang.String str75 = aObject41.toString();
        int i76 = aObject41.getId();
        java.lang.String str77 = aObject41.getName();
        aObject41.setId((-1));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == (-1));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == (-1));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!:-1:35" + "'", str44.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i50 == (-1));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + ":-1" + "'", str64.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "hi!:-1" + "'", str67.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "hi!:-1:35:1:1" + "'", str75.equals("hi!:-1:35:1:1"));
        org.junit.Assert.assertTrue(i76 == 1);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "hi!:-1:35:1" + "'", str77.equals("hi!:-1:35:1"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test140");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        int i2 = aObject1.getId();
        aObject1.setName(":-1:52:-1");
        aObject1.setName(":35:-1");
        int i7 = aObject1.getId();
        org.junit.Assert.assertTrue(i2 == (-1));
        org.junit.Assert.assertTrue(i7 == (-1));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test141");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":-1:100");
        aObject1.setName("hi!:52");
        int i4 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject6 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject8 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject6, aObject8);
        java.lang.String str10 = aObject6.getName();
        io.github.agentsoz.jill.struct.AObject aObject12 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject6, aObject12);
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject12, aObject15);
        java.lang.String str17 = aObject12.toString();
        aObject12.setId((-1));
        int i20 = aObject12.getId();
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("hi!:-1:1");
        int i23 = aObject22.getId();
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject12, aObject22);
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject22);
        java.lang.String str26 = aObject22.toString();
        java.lang.String str27 = aObject22.getName();
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject33);
        int i35 = aObject31.getId();
        io.github.agentsoz.jill.struct.AObject aObject37 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject37, aObject39);
        java.lang.String str41 = aObject37.getName();
        io.github.agentsoz.jill.struct.AObject aObject43 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject37, aObject43);
        io.github.agentsoz.jill.struct.AObject aObject46 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b47 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject43, aObject46);
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject43);
        java.lang.String str49 = aObject43.toString();
        aObject43.setName("hi!:-1");
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject29, aObject43);
        aObject43.setName(":-1");
        io.github.agentsoz.jill.struct.AObject aObject56 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject43, aObject56);
        int i58 = aObject56.getId();
        int i59 = aObject56.getId();
        java.lang.String str60 = aObject56.getName();
        aObject56.setId((int) (short) -1);
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject56);
        int i64 = aObject56.getId();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:-1:1:-1" + "'", str26.equals("hi!:-1:1:-1"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1:1" + "'", str27.equals("hi!:-1:1"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i35 == (-1));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + ":-1" + "'", str49.equals(":-1"));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(i58 == (-1));
        org.junit.Assert.assertTrue(i59 == (-1));
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!:-1" + "'", str60.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i64 == (-1));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test142");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":97");
        aObject1.setName(":-1:-1:-1");
        aObject1.setName(":-1:0");
        aObject1.setName(":97:10:-1");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test143");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":-1:100:0:-1:-1");
        java.lang.String str2 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject4 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject6 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject8 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject6, aObject8);
        java.lang.String str10 = aObject6.getName();
        io.github.agentsoz.jill.struct.AObject aObject12 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject6, aObject12);
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject12, aObject15);
        int i17 = aObject12.getId();
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject4, aObject12);
        java.lang.String str19 = aObject4.toString();
        aObject4.setId((int) (byte) -1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject4);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ":-1:100:0:-1:-1:-1" + "'", str2.equals(":-1:100:0:-1:-1:-1"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test144");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject1.setName("");
        int i4 = aObject1.getId();
        int i5 = aObject1.getId();
        int i6 = aObject1.getId();
        int i7 = aObject1.getId();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertTrue(i7 == (-1));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test145");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject13.setName("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject13);
        aObject10.setId((int) (short) 10);
        int i19 = aObject10.getId();
        int i20 = aObject10.getId();
        java.lang.String str21 = aObject10.getName();
        java.lang.String str22 = aObject10.getName();
        io.github.agentsoz.jill.struct.AObject aObject24 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject26 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject24, aObject26);
        java.lang.String str28 = aObject24.getName();
        io.github.agentsoz.jill.struct.AObject aObject30 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject24, aObject30);
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject30, aObject33);
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject36.setName("");
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject36);
        aObject33.setId((int) (short) 10);
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject33);
        int i43 = aObject33.getId();
        aObject33.setName(":10:97");
        aObject33.setName(":-1:100:0:-1");
        int i48 = aObject33.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 10);
        org.junit.Assert.assertTrue(i20 == 10);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == 10);
        org.junit.Assert.assertTrue(i48 == 10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test146");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.toString();
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject23);
        java.lang.String str25 = aObject21.getName();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject27);
        java.lang.String str29 = aObject21.getName();
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject21);
        aObject13.setName("");
        java.lang.String str33 = aObject13.getName();
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("hi!");
        java.lang.String str36 = aObject35.toString();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject35);
        java.lang.String str38 = aObject13.toString();
        aObject13.setId(35);
        aObject13.setName("hi!:-1:32:97:-1");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!:-1" + "'", str36.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + ":-1" + "'", str38.equals(":-1"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test147");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        java.lang.String str21 = aObject15.toString();
        aObject15.setName("hi!:-1");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        aObject15.setName(":-1");
        aObject15.setId(100);
        aObject15.setId(35);
        io.github.agentsoz.jill.struct.AObject aObject32 = new io.github.agentsoz.jill.struct.AObject("hi!");
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject32);
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject37 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject35, aObject37);
        java.lang.String str39 = aObject35.getName();
        io.github.agentsoz.jill.struct.AObject aObject41 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject35, aObject41);
        io.github.agentsoz.jill.struct.AObject aObject44 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject41, aObject44);
        java.lang.String str46 = aObject44.getName();
        aObject44.setName("hi!:52");
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject44);
        io.github.agentsoz.jill.struct.AObject aObject51 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject53 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject51, aObject53);
        java.lang.String str55 = aObject51.getName();
        io.github.agentsoz.jill.struct.AObject aObject57 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject51, aObject57);
        io.github.agentsoz.jill.struct.AObject aObject60 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject57, aObject60);
        io.github.agentsoz.jill.struct.AObject aObject63 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject63.setName("");
        boolean b66 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject60, aObject63);
        aObject60.setId((int) (short) 10);
        java.lang.String str69 = aObject60.getName();
        aObject60.setName(":100:-1");
        io.github.agentsoz.jill.struct.AObject aObject73 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject75 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b76 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject73, aObject75);
        int i77 = aObject73.getId();
        io.github.agentsoz.jill.struct.AObject aObject79 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject81 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b82 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject79, aObject81);
        java.lang.String str83 = aObject79.getName();
        io.github.agentsoz.jill.struct.AObject aObject85 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b86 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject79, aObject85);
        io.github.agentsoz.jill.struct.AObject aObject88 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b89 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject85, aObject88);
        boolean b90 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject73, aObject85);
        java.lang.String str91 = aObject85.toString();
        aObject85.setName("hi!:-1");
        aObject85.setId((int) ' ');
        boolean b96 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject60, aObject85);
        boolean b97 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject85);
        java.lang.String str98 = aObject85.getName();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "" + "'", str69.equals(""));
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(i77 == (-1));
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "" + "'", str83.equals(""));
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + ":-1" + "'", str91.equals(":-1"));
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertTrue(b97 == false);
        org.junit.Assert.assertTrue("'" + str98 + "' != '" + "hi!:-1" + "'", str98.equals("hi!:-1"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test148");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject1.setId((int) '#');
        java.lang.String str4 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject6 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject8 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject6, aObject8);
        int i10 = aObject6.getId();
        io.github.agentsoz.jill.struct.AObject aObject12 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject12, aObject14);
        java.lang.String str16 = aObject12.getName();
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject12, aObject18);
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject18, aObject21);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject6, aObject18);
        java.lang.String str24 = aObject18.toString();
        aObject18.setName("hi!:-1");
        java.lang.String str27 = aObject18.getName();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject18);
        aObject1.setId((int) '4');
        aObject1.setName("hi!");
        java.lang.String str33 = aObject1.getName();
        java.lang.String str34 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject(":-1:-1:-1");
        java.lang.String str37 = aObject36.getName();
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject36);
        aObject1.setId(97);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1:35" + "'", str4.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + ":-1" + "'", str24.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1" + "'", str27.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!:52" + "'", str34.equals("hi!:52"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + ":-1:-1:-1" + "'", str37.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test149");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.toString();
        aObject13.setName("hi!:-1");
        aObject13.setName("");
        java.lang.String str24 = aObject13.getName();
        aObject13.setName("hi!:-1:1");
        java.lang.String str27 = aObject13.toString();
        aObject13.setName(":-1:52:0");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1:1:-1" + "'", str27.equals("hi!:-1:1:-1"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test150");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject13.setName("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject13);
        aObject13.setId((int) (short) 1);
        aObject13.setName(":100");
        java.lang.String str21 = aObject13.getName();
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject25 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject23, aObject25);
        int i27 = aObject23.getId();
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject29, aObject31);
        java.lang.String str33 = aObject29.getName();
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject29, aObject35);
        io.github.agentsoz.jill.struct.AObject aObject38 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject35, aObject38);
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject23, aObject35);
        java.lang.String str41 = aObject35.getName();
        int i42 = aObject35.getId();
        java.lang.String str43 = aObject35.toString();
        aObject35.setName(":-1:32");
        io.github.agentsoz.jill.struct.AObject aObject47 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject49 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject47, aObject49);
        int i51 = aObject47.getId();
        io.github.agentsoz.jill.struct.AObject aObject53 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject55 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b56 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject53, aObject55);
        java.lang.String str57 = aObject53.getName();
        io.github.agentsoz.jill.struct.AObject aObject59 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b60 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject53, aObject59);
        io.github.agentsoz.jill.struct.AObject aObject62 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject59, aObject62);
        boolean b64 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject47, aObject59);
        java.lang.String str65 = aObject59.getName();
        boolean b66 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject35, aObject59);
        int i67 = aObject59.getId();
        boolean b68 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject59);
        java.lang.String str69 = aObject59.getName();
        java.lang.String str70 = aObject59.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":100" + "'", str21.equals(":100"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == (-1));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        org.junit.Assert.assertTrue(i42 == (-1));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + ":-1" + "'", str43.equals(":-1"));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(i51 == (-1));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(i67 == (-1));
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "" + "'", str69.equals(""));
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + ":-1" + "'", str70.equals(":-1"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test151");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":100:-1:1");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test152");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.toString();
        aObject13.setName("hi!:-1");
        aObject13.setName("");
        aObject13.setName("hi!:-1:35");
        aObject13.setId((int) 'a');
        int i28 = aObject13.getId();
        int i29 = aObject13.getId();
        java.lang.String str30 = aObject13.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue(i28 == 97);
        org.junit.Assert.assertTrue(i29 == 97);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1:35:97" + "'", str30.equals("hi!:-1:35:97"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test153");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        int i12 = aObject7.getId();
        aObject7.setId((int) (byte) 1);
        aObject7.setName("hi!:-1:-1");
        aObject7.setName("hi!:-1:-1");
        int i19 = aObject7.getId();
        int i20 = aObject7.getId();
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject24 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject24);
        java.lang.String str26 = aObject22.getName();
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject28);
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject28, aObject31);
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject34.setName("");
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject34);
        aObject31.setId((int) (short) 10);
        aObject31.setId((int) (byte) -1);
        java.lang.String str42 = aObject31.getName();
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject31);
        aObject7.setName(":-1:-1:35");
        int i46 = aObject7.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i46 == 1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test154");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":100");
        java.lang.String str2 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject4 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject6 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b7 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject4, aObject6);
        int i8 = aObject4.getId();
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject12 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject12);
        java.lang.String str14 = aObject10.getName();
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject16);
        io.github.agentsoz.jill.struct.AObject aObject19 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject16, aObject19);
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject4, aObject16);
        java.lang.String str22 = aObject16.toString();
        io.github.agentsoz.jill.struct.AObject aObject24 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject26 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject24, aObject26);
        java.lang.String str28 = aObject24.getName();
        io.github.agentsoz.jill.struct.AObject aObject30 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject24, aObject30);
        java.lang.String str32 = aObject24.getName();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject16, aObject24);
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject37 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject37, aObject39);
        int i41 = aObject37.getId();
        io.github.agentsoz.jill.struct.AObject aObject43 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject45 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject43, aObject45);
        java.lang.String str47 = aObject43.getName();
        io.github.agentsoz.jill.struct.AObject aObject49 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject43, aObject49);
        io.github.agentsoz.jill.struct.AObject aObject52 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject49, aObject52);
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject37, aObject49);
        java.lang.String str55 = aObject49.toString();
        aObject49.setName("hi!:-1");
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject35, aObject49);
        aObject49.setName(":-1");
        aObject49.setId(100);
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject24, aObject49);
        java.lang.String str64 = aObject49.toString();
        java.lang.String str65 = aObject49.getName();
        boolean b66 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject49);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ":100:-1" + "'", str2.equals(":100:-1"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + ":-1" + "'", str22.equals(":-1"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == (-1));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + ":-1" + "'", str55.equals(":-1"));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + ":-1:100" + "'", str64.equals(":-1:100"));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + ":-1" + "'", str65.equals(":-1"));
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test155");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        int i2 = aObject1.getId();
        aObject1.setName(":-1:52:-1");
        java.lang.String str5 = aObject1.getName();
        aObject1.setId((int) (byte) 10);
        java.lang.String str8 = aObject1.getName();
        org.junit.Assert.assertTrue(i2 == (-1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ":-1:52:-1" + "'", str5.equals(":-1:52:-1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ":-1:52:-1" + "'", str8.equals(":-1:52:-1"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test156");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        aObject13.setName("");
        aObject13.setId((int) (short) 0);
        int i23 = aObject13.getId();
        aObject13.setId((int) 'a');
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("hi!");
        java.lang.String str28 = aObject27.toString();
        io.github.agentsoz.jill.struct.AObject aObject30 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject30.setId((int) ' ');
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject30);
        int i34 = aObject27.getId();
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject27);
        int i36 = aObject27.getId();
        aObject27.setId(0);
        java.lang.String str39 = aObject27.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!:-1" + "'", str28.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test157");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        int i13 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject17 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject17);
        java.lang.String str19 = aObject15.getName();
        java.lang.String str20 = aObject15.toString();
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject24 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject24);
        java.lang.String str26 = aObject22.getName();
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject28);
        java.lang.String str30 = aObject28.getName();
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject28);
        java.lang.String str32 = aObject15.toString();
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject38 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject36, aObject38);
        int i40 = aObject36.getId();
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject44 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject42, aObject44);
        java.lang.String str46 = aObject42.getName();
        io.github.agentsoz.jill.struct.AObject aObject48 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject42, aObject48);
        io.github.agentsoz.jill.struct.AObject aObject51 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject51);
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject36, aObject48);
        java.lang.String str54 = aObject48.toString();
        aObject48.setName("hi!:-1");
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, aObject48);
        aObject48.setName(":-1");
        io.github.agentsoz.jill.struct.AObject aObject61 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        boolean b62 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject61);
        aObject48.setId((int) 'a');
        boolean b65 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject48);
        boolean b66 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        aObject1.setName("hi!:-1:32:0");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + ":-1" + "'", str20.equals(":-1"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + ":-1" + "'", str32.equals(":-1"));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == (-1));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + ":-1" + "'", str54.equals(":-1"));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test158");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        int i19 = aObject1.getId();
        java.lang.String str20 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject22.setId((int) '#');
        java.lang.String str25 = aObject22.toString();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject29);
        int i31 = aObject27.getId();
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject35);
        java.lang.String str37 = aObject33.getName();
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject39);
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject42);
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject39);
        java.lang.String str45 = aObject39.toString();
        aObject39.setName("hi!:-1");
        java.lang.String str48 = aObject39.getName();
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject39);
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject22);
        java.lang.String str51 = aObject22.toString();
        aObject22.setName(":1:-1");
        aObject22.setName(":-1:100");
        io.github.agentsoz.jill.struct.AObject aObject57 = new io.github.agentsoz.jill.struct.AObject("hi!");
        java.lang.String str58 = aObject57.toString();
        io.github.agentsoz.jill.struct.AObject aObject60 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject60.setId((int) ' ');
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject57, aObject60);
        int i64 = aObject57.getId();
        boolean b65 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject57);
        aObject57.setName("hi!:1:100");
        java.lang.String str68 = aObject57.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:-1:35" + "'", str25.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + ":-1" + "'", str45.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!:-1" + "'", str48.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!:-1:35" + "'", str51.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!:-1" + "'", str58.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i64 == (-1));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "hi!:1:100" + "'", str68.equals("hi!:1:100"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test159");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        aObject1.setId((int) (byte) -1);
        aObject1.setName("hi!:-1:35");
        java.lang.String str10 = aObject1.getName();
        java.lang.String str11 = aObject1.getName();
        java.lang.String str12 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject16);
        java.lang.String str18 = aObject14.getName();
        io.github.agentsoz.jill.struct.AObject aObject20 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject20);
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject20, aObject23);
        int i25 = aObject20.getId();
        aObject20.setId((int) (byte) 100);
        java.lang.String str28 = aObject20.getName();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject20);
        java.lang.String str30 = aObject1.toString();
        aObject1.setName(":-1");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1:35" + "'", str10.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:-1:35" + "'", str11.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1:35" + "'", str12.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1:35:-1" + "'", str30.equals("hi!:-1:35:-1"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test160");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject13.setName("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject13);
        aObject10.setId((int) (short) 10);
        int i19 = aObject10.getId();
        int i20 = aObject10.getId();
        java.lang.String str21 = aObject10.getName();
        java.lang.String str22 = aObject10.getName();
        io.github.agentsoz.jill.struct.AObject aObject24 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject26 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject24, aObject26);
        java.lang.String str28 = aObject24.getName();
        io.github.agentsoz.jill.struct.AObject aObject30 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject24, aObject30);
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject30, aObject33);
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject36.setName("");
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject36);
        aObject33.setId((int) (short) 10);
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject33);
        int i43 = aObject33.getId();
        aObject33.setName(":10:97");
        java.lang.String str46 = aObject33.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 10);
        org.junit.Assert.assertTrue(i20 == 10);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == 10);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + ":10:97:10" + "'", str46.equals(":10:97:10"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test161");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        int i12 = aObject7.getId();
        aObject7.setId((int) (byte) 1);
        aObject7.setName("hi!:-1:-1");
        aObject7.setName("hi!:-1:-1");
        int i19 = aObject7.getId();
        int i20 = aObject7.getId();
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject24 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject24);
        java.lang.String str26 = aObject22.getName();
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject28);
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject28, aObject31);
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject34.setName("");
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject34);
        aObject31.setId((int) (short) 10);
        aObject31.setId((int) (byte) -1);
        java.lang.String str42 = aObject31.getName();
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject31);
        io.github.agentsoz.jill.struct.AObject aObject45 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject47 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject45, aObject47);
        java.lang.String str49 = aObject45.getName();
        aObject45.setId((int) (byte) -1);
        aObject45.setName(":1");
        java.lang.String str54 = aObject45.getName();
        int i55 = aObject45.getId();
        int i56 = aObject45.getId();
        java.lang.String str57 = aObject45.toString();
        int i58 = aObject45.getId();
        java.lang.String str59 = aObject45.getName();
        boolean b60 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject45);
        aObject31.setName(":100");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + ":1" + "'", str54.equals(":1"));
        org.junit.Assert.assertTrue(i55 == (-1));
        org.junit.Assert.assertTrue(i56 == (-1));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + ":1:-1" + "'", str57.equals(":1:-1"));
        org.junit.Assert.assertTrue(i58 == (-1));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + ":1" + "'", str59.equals(":1"));
        org.junit.Assert.assertTrue(b60 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test162");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.toString();
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject23);
        java.lang.String str25 = aObject21.getName();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject27);
        java.lang.String str29 = aObject21.getName();
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject21);
        int i31 = aObject13.getId();
        java.lang.String str32 = aObject13.toString();
        aObject13.setId((int) (short) 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + ":-1" + "'", str32.equals(":-1"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test163");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject1.setId((int) '#');
        java.lang.String str4 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject6 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject8 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject6, aObject8);
        int i10 = aObject6.getId();
        io.github.agentsoz.jill.struct.AObject aObject12 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject12, aObject14);
        java.lang.String str16 = aObject12.getName();
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject12, aObject18);
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject18, aObject21);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject6, aObject18);
        java.lang.String str24 = aObject18.toString();
        aObject18.setName("hi!:-1");
        java.lang.String str27 = aObject18.getName();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject18);
        aObject1.setId((int) '4');
        aObject1.setName("hi!");
        int i33 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        java.lang.String str36 = aObject35.toString();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject35);
        int i38 = aObject1.getId();
        aObject1.setName(":1:-1:100");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1:35" + "'", str4.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + ":-1" + "'", str24.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1" + "'", str27.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i33 == 52);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + ":-1" + "'", str36.equals(":-1"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 52);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test164");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":-1:10");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject5.getId();
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test165");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        java.lang.String str21 = aObject15.toString();
        aObject15.setName("hi!:-1");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        int i25 = aObject15.getId();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject29);
        int i31 = aObject27.getId();
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject35);
        java.lang.String str37 = aObject33.getName();
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject39);
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject42);
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject39);
        aObject39.setName("");
        aObject39.setId((int) (byte) -1);
        java.lang.String str49 = aObject39.getName();
        aObject39.setId((int) (byte) 10);
        aObject39.setName(":-1");
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject39);
        int i55 = aObject15.getId();
        io.github.agentsoz.jill.struct.AObject aObject57 = new io.github.agentsoz.jill.struct.AObject(":52");
        io.github.agentsoz.jill.struct.AObject aObject59 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b60 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject57, aObject59);
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject59);
        java.lang.String str62 = aObject59.getName();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i55 == (-1));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test166");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1:-1");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        int i21 = aObject3.getId();
        java.lang.String str22 = aObject3.getName();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str24 = aObject1.toString();
        aObject1.setName(":-1:97:1");
        aObject1.setId(10);
        aObject1.setId(10);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!:-1:-1:-1" + "'", str24.equals("hi!:-1:-1:-1"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test167");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        int i19 = aObject1.getId();
        java.lang.String str20 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject22.setId((int) '#');
        java.lang.String str25 = aObject22.toString();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject29);
        int i31 = aObject27.getId();
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject35);
        java.lang.String str37 = aObject33.getName();
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject39);
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject42);
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject39);
        java.lang.String str45 = aObject39.toString();
        aObject39.setName("hi!:-1");
        java.lang.String str48 = aObject39.getName();
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject39);
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject22);
        java.lang.String str51 = aObject22.toString();
        aObject22.setId((int) (short) 1);
        int i54 = aObject22.getId();
        java.lang.String str55 = aObject22.toString();
        java.lang.String str56 = aObject22.toString();
        aObject22.setName(":-1:-1");
        int i59 = aObject22.getId();
        int i60 = aObject22.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:-1:35" + "'", str25.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + ":-1" + "'", str45.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!:-1" + "'", str48.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!:-1:35" + "'", str51.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(i54 == 1);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!:-1:1" + "'", str55.equals("hi!:-1:1"));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!:-1:1" + "'", str56.equals("hi!:-1:1"));
        org.junit.Assert.assertTrue(i59 == 1);
        org.junit.Assert.assertTrue(i60 == 1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test168");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":-1:100");
        aObject1.setName("hi!:52");
        int i4 = aObject1.getId();
        java.lang.String str5 = aObject1.toString();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:52:-1" + "'", str5.equals("hi!:52:-1"));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test169");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        int i12 = aObject7.getId();
        aObject7.setId((int) (byte) 1);
        aObject7.setName("hi!:-1:-1");
        aObject7.setName("hi!:-1:-1");
        int i19 = aObject7.getId();
        int i20 = aObject7.getId();
        aObject7.setName(":-1:97");
        java.lang.String str23 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject25 = new io.github.agentsoz.jill.struct.AObject("hi!");
        java.lang.String str26 = aObject25.toString();
        int i27 = aObject25.getId();
        java.lang.String str28 = aObject25.getName();
        aObject25.setId(0);
        aObject25.setName("hi!:52");
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject25);
        aObject25.setId((int) (short) 10);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ":-1:97" + "'", str23.equals(":-1:97"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:-1" + "'", str26.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i27 == (-1));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test170");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        aObject13.setName("");
        aObject13.setId((int) (byte) -1);
        aObject13.setId((int) (short) 10);
        java.lang.String str25 = aObject13.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + ":10" + "'", str25.equals(":10"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test171");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        int i19 = aObject1.getId();
        java.lang.String str20 = aObject1.getName();
        java.lang.String str21 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject25 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject25, aObject27);
        int i29 = aObject25.getId();
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject33);
        java.lang.String str35 = aObject31.getName();
        io.github.agentsoz.jill.struct.AObject aObject37 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject31, aObject37);
        io.github.agentsoz.jill.struct.AObject aObject40 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject37, aObject40);
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject25, aObject37);
        java.lang.String str43 = aObject37.toString();
        aObject37.setName("hi!:-1");
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject23, aObject37);
        aObject37.setName(":-1");
        aObject37.setId(100);
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject37);
        java.lang.String str52 = aObject1.toString();
        java.lang.String str53 = aObject1.getName();
        aObject1.setId((int) (short) 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + ":-1" + "'", str43.equals(":-1"));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + ":-1" + "'", str52.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test172");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject13.setName("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject13);
        java.lang.String str17 = aObject10.getName();
        java.lang.String str18 = aObject10.toString();
        java.lang.String str19 = aObject10.toString();
        aObject10.setName(":0:32:32");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test173");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject13.setName("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject13);
        aObject10.setId((int) (short) 10);
        int i19 = aObject10.getId();
        aObject10.setId(0);
        java.lang.String str22 = aObject10.toString();
        aObject10.setId((int) '4');
        int i25 = aObject10.getId();
        aObject10.setId((int) (short) 0);
        aObject10.setId((int) (short) 1);
        int i30 = aObject10.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 10);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + ":0" + "'", str22.equals(":0"));
        org.junit.Assert.assertTrue(i25 == 52);
        org.junit.Assert.assertTrue(i30 == 1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test174");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        java.lang.String str6 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject8 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject10);
        java.lang.String str12 = aObject8.getName();
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject14);
        java.lang.String str16 = aObject14.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject14);
        aObject14.setName("hi!");
        java.lang.String str20 = aObject14.getName();
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject24 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject24);
        int i26 = aObject22.getId();
        io.github.agentsoz.jill.struct.AObject aObject28 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject30 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject28, aObject30);
        java.lang.String str32 = aObject28.getName();
        io.github.agentsoz.jill.struct.AObject aObject34 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject28, aObject34);
        io.github.agentsoz.jill.struct.AObject aObject37 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, aObject37);
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject34);
        java.lang.String str40 = aObject34.toString();
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject44 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject42, aObject44);
        java.lang.String str46 = aObject42.getName();
        io.github.agentsoz.jill.struct.AObject aObject48 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject42, aObject48);
        java.lang.String str50 = aObject42.getName();
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject34, aObject42);
        io.github.agentsoz.jill.struct.AObject aObject53 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject55 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject57 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject55, aObject57);
        int i59 = aObject55.getId();
        io.github.agentsoz.jill.struct.AObject aObject61 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject63 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b64 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject61, aObject63);
        java.lang.String str65 = aObject61.getName();
        io.github.agentsoz.jill.struct.AObject aObject67 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b68 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject61, aObject67);
        io.github.agentsoz.jill.struct.AObject aObject70 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b71 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject67, aObject70);
        boolean b72 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject55, aObject67);
        java.lang.String str73 = aObject67.toString();
        aObject67.setName("hi!:-1");
        boolean b76 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject53, aObject67);
        aObject67.setName(":-1");
        aObject67.setId(100);
        boolean b81 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject42, aObject67);
        boolean b82 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject67);
        aObject67.setName(":-1");
        aObject67.setName("hi!:-1:35");
        aObject67.setName("hi!:1:-1");
        int i89 = aObject67.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + ":-1" + "'", str40.equals(":-1"));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i59 == (-1));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + ":-1" + "'", str73.equals(":-1"));
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(i89 == 100);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test175");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.toString();
        aObject13.setId(0);
        aObject13.setId((-1));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test176");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!");
        java.lang.String str2 = aObject1.toString();
        int i3 = aObject1.getId();
        java.lang.String str4 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject6 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject8 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject10);
        int i12 = aObject8.getId();
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject16);
        java.lang.String str18 = aObject14.getName();
        io.github.agentsoz.jill.struct.AObject aObject20 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject20);
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject20, aObject23);
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject20);
        java.lang.String str26 = aObject20.toString();
        aObject20.setName("hi!:-1");
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject6, aObject20);
        aObject20.setName(":-1");
        aObject20.setId(100);
        aObject20.setId(35);
        aObject20.setId((int) (short) 1);
        java.lang.String str38 = aObject20.toString();
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject20);
        aObject1.setName(":0");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!:-1" + "'", str2.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + ":-1" + "'", str26.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + ":-1:1" + "'", str38.equals(":-1:1"));
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test177");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        java.lang.String str2 = aObject1.toString();
        java.lang.String str3 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject5, aObject7);
        java.lang.String str9 = aObject5.getName();
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject5, aObject11);
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject11, aObject14);
        io.github.agentsoz.jill.struct.AObject aObject17 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject17.setName("");
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject14, aObject17);
        java.lang.String str21 = aObject14.getName();
        int i22 = aObject14.getId();
        aObject14.setName("hi!:-1:-1");
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject14);
        aObject1.setName("hi!:-1");
        aObject1.setName(":-1:-1:-1:-1");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ":-1" + "'", str2.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test178");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        java.lang.String str9 = aObject1.getName();
        aObject1.setName("hi!");
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject13.setId((int) '#');
        java.lang.String str16 = aObject13.toString();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        aObject1.setName("");
        aObject1.setName(":-1:100");
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject23.setName("hi!:-1:-1");
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject23);
        java.lang.String str27 = aObject1.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!:-1:35" + "'", str16.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1:100" + "'", str27.equals(":-1:100"));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test179");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject1.setId((int) '#');
        java.lang.String str4 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject6 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject8 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject6, aObject8);
        int i10 = aObject6.getId();
        io.github.agentsoz.jill.struct.AObject aObject12 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject12, aObject14);
        java.lang.String str16 = aObject12.getName();
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject12, aObject18);
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject18, aObject21);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject6, aObject18);
        java.lang.String str24 = aObject18.toString();
        aObject18.setName("hi!:-1");
        java.lang.String str27 = aObject18.getName();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject18);
        aObject1.setId((int) '4');
        aObject1.setName("hi!");
        java.lang.String str33 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject(":0");
        aObject35.setId((int) ' ');
        java.lang.String str38 = aObject35.getName();
        java.lang.String str39 = aObject35.getName();
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject35);
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject44 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject42, aObject44);
        int i46 = aObject42.getId();
        io.github.agentsoz.jill.struct.AObject aObject48 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject50 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject50);
        java.lang.String str52 = aObject48.getName();
        io.github.agentsoz.jill.struct.AObject aObject54 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject54);
        io.github.agentsoz.jill.struct.AObject aObject57 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject54, aObject57);
        boolean b59 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject42, aObject54);
        java.lang.String str60 = aObject54.toString();
        aObject54.setName("hi!:-1");
        aObject54.setName("");
        java.lang.String str65 = aObject54.getName();
        java.lang.String str66 = aObject54.toString();
        int i67 = aObject54.getId();
        aObject54.setName(":-1:52:-1:10");
        boolean b70 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject54);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1:35" + "'", str4.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + ":-1" + "'", str24.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1" + "'", str27.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!:52" + "'", str33.equals("hi!:52"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + ":0" + "'", str38.equals(":0"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + ":0" + "'", str39.equals(":0"));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i46 == (-1));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + ":-1" + "'", str60.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + ":-1" + "'", str66.equals(":-1"));
        org.junit.Assert.assertTrue(i67 == (-1));
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test180");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        java.lang.String str21 = aObject15.toString();
        aObject15.setName("hi!:-1");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        java.lang.String str25 = aObject15.toString();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject29);
        int i31 = aObject27.getId();
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject35);
        java.lang.String str37 = aObject33.getName();
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject39);
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject42);
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject39);
        java.lang.String str45 = aObject39.toString();
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject39);
        io.github.agentsoz.jill.struct.AObject aObject48 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject50 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject50);
        int i52 = aObject48.getId();
        io.github.agentsoz.jill.struct.AObject aObject54 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject56 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject54, aObject56);
        java.lang.String str58 = aObject54.getName();
        io.github.agentsoz.jill.struct.AObject aObject60 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject54, aObject60);
        io.github.agentsoz.jill.struct.AObject aObject63 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b64 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject60, aObject63);
        boolean b65 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject48, aObject60);
        aObject60.setName("");
        aObject60.setId((int) (byte) -1);
        boolean b70 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject60);
        java.lang.String str71 = aObject60.toString();
        int i72 = aObject60.getId();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:-1:-1" + "'", str25.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + ":-1" + "'", str45.equals(":-1"));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i52 == (-1));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + ":-1" + "'", str71.equals(":-1"));
        org.junit.Assert.assertTrue(i72 == (-1));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test181");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        java.lang.String str21 = aObject15.toString();
        aObject15.setName("hi!:-1");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        aObject15.setName(":-1");
        aObject15.setId(100);
        aObject15.setId(35);
        io.github.agentsoz.jill.struct.AObject aObject32 = new io.github.agentsoz.jill.struct.AObject("hi!");
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject32);
        int i34 = aObject32.getId();
        java.lang.String str35 = aObject32.getName();
        io.github.agentsoz.jill.struct.AObject aObject37 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject37, aObject39);
        int i41 = aObject37.getId();
        io.github.agentsoz.jill.struct.AObject aObject43 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject45 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject43, aObject45);
        java.lang.String str47 = aObject43.getName();
        io.github.agentsoz.jill.struct.AObject aObject49 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject43, aObject49);
        io.github.agentsoz.jill.struct.AObject aObject52 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject49, aObject52);
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject37, aObject49);
        java.lang.String str55 = aObject49.toString();
        io.github.agentsoz.jill.struct.AObject aObject57 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject59 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b60 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject57, aObject59);
        java.lang.String str61 = aObject57.getName();
        io.github.agentsoz.jill.struct.AObject aObject63 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b64 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject57, aObject63);
        java.lang.String str65 = aObject57.getName();
        boolean b66 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject49, aObject57);
        aObject49.setName("");
        java.lang.String str69 = aObject49.getName();
        io.github.agentsoz.jill.struct.AObject aObject71 = new io.github.agentsoz.jill.struct.AObject("hi!");
        java.lang.String str72 = aObject71.toString();
        boolean b73 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject49, aObject71);
        boolean b74 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject32, aObject71);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == (-1));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + ":-1" + "'", str55.equals(":-1"));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "" + "'", str69.equals(""));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!:-1" + "'", str72.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test182");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":-1:100");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        java.lang.String str21 = aObject15.toString();
        aObject15.setName("hi!:-1");
        aObject15.setName("");
        aObject15.setName("");
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject15);
        int i29 = aObject1.getId();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == (-1));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test183");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject1.setId((int) '#');
        java.lang.String str4 = aObject1.toString();
        io.github.agentsoz.jill.struct.AObject aObject6 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject8 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject6, aObject8);
        int i10 = aObject6.getId();
        io.github.agentsoz.jill.struct.AObject aObject12 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject12, aObject14);
        java.lang.String str16 = aObject12.getName();
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject12, aObject18);
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject18, aObject21);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject6, aObject18);
        java.lang.String str24 = aObject18.toString();
        aObject18.setName("hi!:-1");
        java.lang.String str27 = aObject18.getName();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject18);
        java.lang.String str29 = aObject18.getName();
        int i30 = aObject18.getId();
        java.lang.String str31 = aObject18.toString();
        java.lang.String str32 = aObject18.getName();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1:35" + "'", str4.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + ":-1" + "'", str24.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1" + "'", str27.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!:-1" + "'", str29.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i30 == (-1));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!:-1:-1" + "'", str31.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!:-1" + "'", str32.equals("hi!:-1"));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test184");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.toString();
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject23);
        java.lang.String str25 = aObject21.getName();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject27);
        java.lang.String str29 = aObject21.getName();
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject21);
        java.lang.String str31 = aObject13.getName();
        java.lang.String str32 = aObject13.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test185");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":-1:52");
        int i2 = aObject1.getId();
        aObject1.setName(":-1:-1:97:-1");
        int i5 = aObject1.getId();
        java.lang.String str6 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject8 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject10);
        java.lang.String str12 = aObject8.getName();
        io.github.agentsoz.jill.struct.AObject aObject14 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject8, aObject14);
        aObject8.setName("hi!");
        java.lang.String str18 = aObject8.getName();
        aObject8.setName(":-1:100");
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject8);
        aObject8.setName("hi!:-1:-1:10");
        org.junit.Assert.assertTrue(i2 == (-1));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1:-1:97:-1" + "'", str6.equals(":-1:-1:97:-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test186");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!");
        aObject1.setName(":1:-1");
        aObject1.setName(":-1:100");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test187");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.toString();
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject23);
        java.lang.String str25 = aObject21.getName();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject27);
        java.lang.String str29 = aObject21.getName();
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject21);
        aObject13.setName("");
        java.lang.String str33 = aObject13.getName();
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("hi!");
        java.lang.String str36 = aObject35.toString();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject35);
        java.lang.String str38 = aObject13.getName();
        aObject13.setName("hi!:-1:-1:-1");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!:-1" + "'", str36.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test188");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject7);
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject10);
        int i12 = aObject7.getId();
        aObject7.setId((int) (byte) 1);
        aObject7.setName("hi!:-1:-1");
        aObject7.setName("hi!:-1:-1");
        int i19 = aObject7.getId();
        io.github.agentsoz.jill.struct.AObject aObject21 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject23 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject25 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject23, aObject25);
        int i27 = aObject23.getId();
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject31 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject29, aObject31);
        java.lang.String str33 = aObject29.getName();
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject29, aObject35);
        io.github.agentsoz.jill.struct.AObject aObject38 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject35, aObject38);
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject23, aObject35);
        java.lang.String str41 = aObject35.toString();
        aObject35.setName("hi!:-1");
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject21, aObject35);
        java.lang.String str45 = aObject35.toString();
        io.github.agentsoz.jill.struct.AObject aObject47 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject49 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject47, aObject49);
        int i51 = aObject47.getId();
        io.github.agentsoz.jill.struct.AObject aObject53 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject55 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b56 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject53, aObject55);
        java.lang.String str57 = aObject53.getName();
        io.github.agentsoz.jill.struct.AObject aObject59 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b60 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject53, aObject59);
        io.github.agentsoz.jill.struct.AObject aObject62 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject59, aObject62);
        boolean b64 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject47, aObject59);
        java.lang.String str65 = aObject59.toString();
        boolean b66 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject35, aObject59);
        io.github.agentsoz.jill.struct.AObject aObject68 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject70 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b71 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject68, aObject70);
        int i72 = aObject68.getId();
        io.github.agentsoz.jill.struct.AObject aObject74 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject76 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b77 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject74, aObject76);
        java.lang.String str78 = aObject74.getName();
        io.github.agentsoz.jill.struct.AObject aObject80 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b81 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject74, aObject80);
        io.github.agentsoz.jill.struct.AObject aObject83 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b84 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject80, aObject83);
        boolean b85 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject68, aObject80);
        aObject80.setName("");
        aObject80.setId((int) (byte) -1);
        boolean b90 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject59, aObject80);
        aObject59.setName("hi!:-1");
        boolean b93 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject59);
        aObject7.setId((int) '4');
        aObject7.setId(97);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == (-1));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + ":-1" + "'", str41.equals(":-1"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!:-1:-1" + "'", str45.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(i51 == (-1));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + ":-1" + "'", str65.equals(":-1"));
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(i72 == (-1));
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "" + "'", str78.equals(""));
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue(b93 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test189");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1:-1");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        int i21 = aObject3.getId();
        java.lang.String str22 = aObject3.getName();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        aObject3.setId((int) (short) 0);
        java.lang.String str26 = aObject3.toString();
        java.lang.String str27 = aObject3.getName();
        aObject3.setId((int) (short) 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + ":0" + "'", str26.equals(":0"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test190");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        int i19 = aObject1.getId();
        java.lang.String str20 = aObject1.getName();
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject22.setId((int) '#');
        java.lang.String str25 = aObject22.toString();
        io.github.agentsoz.jill.struct.AObject aObject27 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject29 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject29);
        int i31 = aObject27.getId();
        io.github.agentsoz.jill.struct.AObject aObject33 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject35 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject35);
        java.lang.String str37 = aObject33.getName();
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject33, aObject39);
        io.github.agentsoz.jill.struct.AObject aObject42 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject39, aObject42);
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject27, aObject39);
        java.lang.String str45 = aObject39.toString();
        aObject39.setName("hi!:-1");
        java.lang.String str48 = aObject39.getName();
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject39);
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject22);
        java.lang.String str51 = aObject22.toString();
        aObject22.setName(":1:-1");
        aObject22.setName(":-1:100");
        java.lang.String str56 = aObject22.getName();
        aObject22.setName(":-1");
        java.lang.String str59 = aObject22.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:-1:35" + "'", str25.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + ":-1" + "'", str45.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!:-1" + "'", str48.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!:-1:35" + "'", str51.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + ":-1:100" + "'", str56.equals(":-1:100"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + ":-1:35" + "'", str59.equals(":-1:35"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test191");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        int i5 = aObject1.getId();
        io.github.agentsoz.jill.struct.AObject aObject7 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject9);
        java.lang.String str11 = aObject7.getName();
        io.github.agentsoz.jill.struct.AObject aObject13 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject7, aObject13);
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject13);
        java.lang.String str19 = aObject13.toString();
        aObject13.setName("hi!:-1");
        aObject13.setName("");
        aObject13.setName("hi!:-1:35");
        aObject13.setId((int) 'a');
        java.lang.String str28 = aObject13.getName();
        io.github.agentsoz.jill.struct.AObject aObject30 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject32 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject30, aObject32);
        java.lang.String str34 = aObject30.getName();
        io.github.agentsoz.jill.struct.AObject aObject36 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject30, aObject36);
        aObject30.setName("hi!");
        java.lang.String str40 = aObject30.getName();
        aObject30.setId((int) (short) 1);
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject13, aObject30);
        int i44 = aObject30.getId();
        java.lang.String str45 = aObject30.getName();
        java.lang.String str46 = aObject30.toString();
        java.lang.String str47 = aObject30.getName();
        aObject30.setName("hi!:-1:35:97:1");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!:-1:35" + "'", str28.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 1);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!:1" + "'", str46.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test192");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        java.lang.String str5 = aObject1.getName();
        aObject1.setId((int) (byte) -1);
        aObject1.setName(":1");
        java.lang.String str10 = aObject1.getName();
        int i11 = aObject1.getId();
        int i12 = aObject1.getId();
        java.lang.String str13 = aObject1.toString();
        int i14 = aObject1.getId();
        int i15 = aObject1.getId();
        int i16 = aObject1.getId();
        aObject1.setName(":97");
        java.lang.String str19 = aObject1.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ":1" + "'", str10.equals(":1"));
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ":1:-1" + "'", str13.equals(":1:-1"));
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":97:-1" + "'", str19.equals(":97:-1"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test193");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1:-1");
        io.github.agentsoz.jill.struct.AObject aObject3 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject5);
        int i7 = aObject3.getId();
        io.github.agentsoz.jill.struct.AObject aObject9 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject11 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject11);
        java.lang.String str13 = aObject9.getName();
        io.github.agentsoz.jill.struct.AObject aObject15 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject9, aObject15);
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject15, aObject18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject3, aObject15);
        int i21 = aObject3.getId();
        java.lang.String str22 = aObject3.getName();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject3);
        aObject3.setId((int) '4');
        aObject3.setId((int) (short) 100);
        java.lang.String str28 = aObject3.toString();
        int i29 = aObject3.getId();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":100" + "'", str28.equals(":100"));
        org.junit.Assert.assertTrue(i29 == 100);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test194");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject("hi!:-1:-1");
        aObject1.setName("");
        io.github.agentsoz.jill.struct.AObject aObject5 = new io.github.agentsoz.jill.struct.AObject("hi!:-1");
        aObject5.setId((int) '#');
        java.lang.String str8 = aObject5.toString();
        io.github.agentsoz.jill.struct.AObject aObject10 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject12 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject12);
        int i14 = aObject10.getId();
        io.github.agentsoz.jill.struct.AObject aObject16 = new io.github.agentsoz.jill.struct.AObject("");
        io.github.agentsoz.jill.struct.AObject aObject18 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject16, aObject18);
        java.lang.String str20 = aObject16.getName();
        io.github.agentsoz.jill.struct.AObject aObject22 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject16, aObject22);
        io.github.agentsoz.jill.struct.AObject aObject25 = new io.github.agentsoz.jill.struct.AObject("");
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject22, aObject25);
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject10, aObject22);
        java.lang.String str28 = aObject22.toString();
        aObject22.setName("hi!:-1");
        java.lang.String str31 = aObject22.getName();
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject5, aObject22);
        aObject5.setId((int) '4');
        aObject5.setName("hi!");
        int i37 = aObject5.getId();
        io.github.agentsoz.jill.struct.AObject aObject39 = new io.github.agentsoz.jill.struct.AObject("");
        java.lang.String str40 = aObject39.toString();
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject5, aObject39);
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject1, aObject5);
        int i43 = aObject1.getId();
        aObject1.setName("hi!:0");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:-1:35" + "'", str8.equals("hi!:-1:35"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!:-1" + "'", str31.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(i37 == 52);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + ":-1" + "'", str40.equals(":-1"));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == (-1));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "AObjectRegressionTest3.test195");
        io.github.agentsoz.jill.struct.AObject aObject1 = new io.github.agentsoz.jill.struct.AObject(":-1:52:10:-1");
    }
}

