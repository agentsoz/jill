package io.github.agentsoz.jill.struct;

/*-
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2018 by its authors. See AUTHORS file.
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
public class GPTypeRegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test001");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        gPType24.addChild((byte) 1);
        java.lang.String str28 = gPType24.toString();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType24);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType24);
        int i31 = gPType1.getId();
        byte[] byte_array32 = gPType1.getChildren();
        gPType1.addChild((byte) -1);
        byte[] byte_array35 = gPType1.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType37 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array38 = gPType37.getChildren();
        gPType37.addChild((byte) 1);
        int i41 = gPType37.getId();
        gPType37.addChild((byte) 0);
        gPType37.addParent((byte) 1);
        java.lang.String str46 = gPType37.getName();
        java.lang.String str47 = gPType37.getName();
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType37);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertNotNull(byte_array35);
        org.junit.Assert.assertNull(byte_array38);
        org.junit.Assert.assertTrue(i41 == (-1));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test002");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        gPType1.setId((int) '#');
        byte[] byte_array14 = gPType1.getChildren();
        gPType1.addChild((byte) 100);
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        gPType1.addParent((byte) 1);
        gPType1.setName(":100:-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType26 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType28 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array29 = gPType28.getChildren();
        gPType28.addChild((byte) 1);
        int i32 = gPType28.getId();
        gPType28.addChild((byte) 0);
        gPType28.addParent((byte) 1);
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType26, (io.github.agentsoz.jill.struct.AObject) gPType28);
        byte[] byte_array38 = gPType26.getChildren();
        int i39 = gPType26.getId();
        gPType26.setName("hi!:-1");
        int i42 = gPType26.getId();
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType26);
        io.github.agentsoz.jill.struct.GoalPlanType gPType45 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array46 = gPType45.getParents();
        gPType45.setId((int) (short) 10);
        java.lang.String str49 = gPType45.getName();
        byte[] byte_array50 = gPType45.getParents();
        gPType45.setId(100);
        gPType45.addParent((byte) 10);
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType26, (io.github.agentsoz.jill.struct.AObject) gPType45);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(byte_array38);
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue(i42 == (-1));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(byte_array46);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        org.junit.Assert.assertNull(byte_array50);
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test003");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        gPType1.setName("");
        gPType1.addChild((byte) 10);
        java.lang.String str8 = gPType1.getName();
        java.lang.String str9 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        java.lang.String str23 = gPType11.toString();
        byte[] byte_array24 = gPType11.getParents();
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        byte[] byte_array26 = gPType1.getParents();
        gPType1.setName(":52:-1:35");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ":-1:-1" + "'", str23.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(byte_array26);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test004");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.setId((-1));
        int i13 = gPType4.getId();
        gPType4.setName(":100");
        java.lang.String str16 = gPType4.toString();
        java.lang.String str17 = gPType4.toString();
        gPType4.setId(100);
        int i20 = gPType4.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":100:-1" + "'", str16.equals(":100:-1"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":100:-1" + "'", str17.equals(":100:-1"));
        org.junit.Assert.assertTrue(i20 == 100);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test005");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        gPType24.addChild((byte) 1);
        java.lang.String str28 = gPType24.toString();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType24);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType24);
        gPType24.setName(":-1:-1:-1");
        java.lang.String str33 = gPType24.getName();
        byte[] byte_array34 = gPType24.getChildren();
        byte[] byte_array35 = gPType24.getChildren();
        byte[] byte_array37 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array35, 100);
        byte[] byte_array39 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array35, (int) (short) 10);
        byte[] byte_array41 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array35, (int) (byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + ":-1:-1:-1" + "'", str33.equals(":-1:-1:-1"));
        org.junit.Assert.assertNotNull(byte_array34);
        org.junit.Assert.assertNotNull(byte_array35);
        org.junit.Assert.assertNotNull(byte_array37);
        org.junit.Assert.assertNotNull(byte_array39);
        org.junit.Assert.assertNotNull(byte_array41);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test006");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":52");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        gPType6.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType6, (io.github.agentsoz.jill.struct.AObject) gPType16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        gPType6.addChild((byte) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array23 = gPType22.getChildren();
        gPType22.addChild((byte) 1);
        java.lang.String str26 = gPType22.getName();
        java.lang.String str27 = gPType22.getName();
        java.lang.String str28 = gPType22.getName();
        gPType22.addParent((byte) -1);
        byte[] byte_array31 = gPType22.getParents();
        int i32 = gPType22.getId();
        java.lang.String str33 = gPType22.toString();
        gPType22.addParent((byte) 100);
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType6, (io.github.agentsoz.jill.struct.AObject) gPType22);
        gPType22.addParent((byte) 0);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertNotNull(byte_array31);
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + ":-1" + "'", str33.equals(":-1"));
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test007");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        gPType1.addParent((byte) -1);
        byte[] byte_array10 = gPType1.getParents();
        gPType1.addChild((byte) -1);
        gPType1.addChild((byte) -1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(byte_array10);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test008");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array6 = gPType5.getParents();
        java.lang.String str7 = gPType5.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array10 = gPType9.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array13 = gPType12.getChildren();
        gPType12.addChild((byte) 1);
        java.lang.String str16 = gPType12.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType9, (io.github.agentsoz.jill.struct.AObject) gPType12);
        int i18 = gPType12.getId();
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType12);
        byte[] byte_array20 = gPType12.getChildren();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType12);
        java.lang.String str22 = gPType12.toString();
        gPType12.addParent((byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(byte_array20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + ":-1" + "'", str22.equals(":-1"));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test009");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":100");
        gPType1.setName(":-1:10");
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType7);
        byte[] byte_array9 = gPType7.getParents();
        gPType7.setName("hi!:-1");
        java.lang.String str12 = gPType7.getName();
        gPType7.addParent((byte) -1);
        java.lang.String str15 = gPType7.getName();
        int i16 = gPType7.getId();
        byte[] byte_array17 = gPType7.getChildren();
        gPType7.addParent((byte) -1);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!:-1" + "'", str15.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test010");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        gPType1.addParent((byte) -1);
        java.lang.String str10 = gPType1.toString();
        byte[] byte_array11 = gPType1.getParents();
        gPType1.addParent((byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ":-1" + "'", str10.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test011");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType4, (io.github.agentsoz.jill.struct.AObject) gPType14);
        gPType14.addChild((byte) 0);
        gPType14.setId((int) (byte) 1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType21 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        int i22 = gPType21.getId();
        java.lang.String str23 = gPType21.toString();
        gPType21.setName(":-1");
        byte[] byte_array26 = gPType21.getChildren();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType14, (io.github.agentsoz.jill.struct.AObject) gPType21);
        gPType21.setId((-1));
        gPType21.setId((int) '#');
        gPType21.addParent((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:-1" + "'", str23.equals("hi!:-1"));
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test012");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.setName("");
        gPType4.addParent((byte) 100);
        byte[] byte_array15 = gPType4.getChildren();
        gPType4.setId((int) (short) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test013");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        byte[] byte_array10 = gPType1.getParents();
        java.lang.String str11 = gPType1.toString();
        gPType1.addParent((byte) 100);
        gPType1.setId((int) (byte) 100);
        int i16 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1:-1:-1" + "'", str11.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue(i16 == 100);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test014");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) -1);
        byte[] byte_array6 = gPType1.getParents();
        byte[] byte_array7 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType9.setId((int) (byte) -1);
        java.lang.String str12 = gPType9.toString();
        gPType9.setName(":-1:-1");
        gPType9.setName(":-1:-1:-1");
        java.lang.String str17 = gPType9.getName();
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType9);
        gPType1.setId((int) '#');
        gPType1.addParent((byte) 100);
        byte[] byte_array23 = gPType1.getParents();
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1" + "'", str12.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1:-1:-1" + "'", str17.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(byte_array23);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test015");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        gPType1.setId((int) 'a');
        gPType1.addParent((byte) 0);
        gPType1.setId((int) (byte) 10);
        gPType1.addChild((byte) 100);
        byte[] byte_array12 = gPType1.getChildren();
        int i13 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertTrue(i13 == 10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test016");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1:-1:-1");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.setName("hi!:-1");
        java.lang.String str5 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1:-1" + "'", str5.equals("hi!:-1:-1"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test017");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        byte[] byte_array6 = gPType3.getParents();
        gPType3.addChild((byte) 10);
        gPType3.addChild((byte) 1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test018");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        java.lang.String str3 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array6 = gPType5.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getChildren();
        gPType8.addChild((byte) 1);
        java.lang.String str12 = gPType8.getName();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType8);
        int i14 = gPType8.getId();
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        byte[] byte_array16 = gPType8.getChildren();
        try {
            byte[] byte_array18 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array16, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test019");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType8.setName("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        int i20 = gPType16.getId();
        java.lang.String str21 = gPType16.toString();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType16);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        int i25 = gPType24.getId();
        java.lang.String str26 = gPType24.toString();
        java.lang.String str27 = gPType24.toString();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType24);
        int i29 = gPType8.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:-1" + "'", str26.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1" + "'", str27.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i29 == (-1));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test020");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        byte[] byte_array8 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test021");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        java.lang.String str4 = gPType1.toString();
        gPType1.setName(":-1:-1");
        java.lang.String str7 = gPType1.getName();
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) 1);
        gPType1.addParent((byte) -1);
        gPType1.addParent((byte) 10);
        gPType1.addParent((byte) 100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ":-1:-1" + "'", str7.equals(":-1:-1"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test022");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":52");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        gPType6.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType6, (io.github.agentsoz.jill.struct.AObject) gPType16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        java.lang.String str19 = gPType6.getName();
        byte[] byte_array20 = gPType6.getParents();
        gPType6.addParent((byte) 100);
        gPType6.addParent((byte) 100);
        byte[] byte_array25 = gPType6.getParents();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertNotNull(byte_array25);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test023");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        java.lang.String str20 = gPType16.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, (io.github.agentsoz.jill.struct.AObject) gPType16);
        int i22 = gPType16.getId();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType16);
        gPType11.setId((int) (byte) -1);
        byte[] byte_array26 = gPType11.getParents();
        java.lang.String str27 = gPType11.toString();
        byte[] byte_array28 = gPType11.getChildren();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        io.github.agentsoz.jill.struct.GoalPlanType gPType31 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType33 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType31, (io.github.agentsoz.jill.struct.AObject) gPType33);
        java.lang.String str35 = gPType33.getName();
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType33);
        byte[] byte_array37 = gPType33.getChildren();
        byte[] byte_array38 = gPType33.getParents();
        gPType33.setId(10);
        java.lang.String str41 = gPType33.getName();
        gPType33.addParent((byte) 1);
        int i44 = gPType33.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(byte_array37);
        org.junit.Assert.assertNull(byte_array38);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        org.junit.Assert.assertTrue(i44 == 10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test024");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.setId((-1));
        gPType4.setId((int) (byte) 0);
        int i15 = gPType4.getId();
        gPType4.addParent((byte) 0);
        io.github.agentsoz.jill.struct.GoalPlanType gPType19 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array20 = gPType19.getChildren();
        gPType19.addChild((byte) 1);
        int i23 = gPType19.getId();
        java.lang.String str24 = gPType19.toString();
        gPType19.addChild((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType28 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array29 = gPType28.getParents();
        java.lang.String str30 = gPType28.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType32 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array33 = gPType32.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType35 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array36 = gPType35.getChildren();
        gPType35.addChild((byte) 1);
        java.lang.String str39 = gPType35.getName();
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType32, (io.github.agentsoz.jill.struct.AObject) gPType35);
        int i41 = gPType35.getId();
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType28, (io.github.agentsoz.jill.struct.AObject) gPType35);
        gPType35.setId(1);
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType19, (io.github.agentsoz.jill.struct.AObject) gPType35);
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType4, (io.github.agentsoz.jill.struct.AObject) gPType19);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + ":-1" + "'", str24.equals(":-1"));
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertNull(byte_array33);
        org.junit.Assert.assertNull(byte_array36);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == (-1));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test025");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":52:-1");
        java.lang.String str2 = gPType1.toString();
        gPType1.addParent((byte) 1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ":52:-1:-1" + "'", str2.equals(":52:-1:-1"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test026");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        java.lang.String str3 = gPType1.toString();
        java.lang.String str4 = gPType1.toString();
        gPType1.addParent((byte) 10);
        gPType1.setId((int) (byte) 1);
        java.lang.String str9 = gPType1.toString();
        byte[] byte_array10 = gPType1.getParents();
        int i11 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ":1" + "'", str9.equals(":1"));
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test027");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        byte[] byte_array6 = gPType3.getParents();
        gPType3.addParent((byte) 10);
        gPType3.addChild((byte) 100);
        gPType3.addParent((byte) 10);
        byte[] byte_array13 = gPType3.getChildren();
        java.lang.String str14 = gPType3.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test028");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType14, (io.github.agentsoz.jill.struct.AObject) gPType16);
        byte[] byte_array18 = gPType16.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType20 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array21 = gPType20.getChildren();
        gPType20.addChild((byte) 1);
        int i24 = gPType20.getId();
        gPType20.addChild((byte) 0);
        gPType20.addParent((byte) 100);
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType20);
        java.lang.String str30 = gPType20.toString();
        gPType20.setName("hi!:-1:-1");
        gPType20.addChild((byte) 1);
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType20);
        int i36 = gPType3.getId();
        byte[] byte_array37 = gPType3.getParents();
        byte[] byte_array39 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array37, (int) '#');
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertTrue(i24 == (-1));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + ":-1" + "'", str30.equals(":-1"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertNotNull(byte_array37);
        org.junit.Assert.assertNotNull(byte_array39);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test029");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        gPType24.addChild((byte) 1);
        java.lang.String str28 = gPType24.toString();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType24);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType24);
        int i31 = gPType1.getId();
        byte[] byte_array32 = gPType1.getParents();
        byte[] byte_array34 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array32, 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertNotNull(byte_array34);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test030");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getParents();
        int i16 = gPType14.getId();
        byte[] byte_array17 = gPType14.getChildren();
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType14);
        gPType14.addParent((byte) 0);
        java.lang.String str21 = gPType14.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array24 = gPType23.getChildren();
        java.lang.String str25 = gPType23.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType27 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType29 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType27, (io.github.agentsoz.jill.struct.AObject) gPType29);
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType23, (io.github.agentsoz.jill.struct.AObject) gPType29);
        byte[] byte_array32 = gPType23.getParents();
        java.lang.String str33 = gPType23.toString();
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType14, (io.github.agentsoz.jill.struct.AObject) gPType23);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + ":-1" + "'", str25.equals(":-1"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(byte_array32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + ":-1" + "'", str33.equals(":-1"));
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test031");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setId((int) (byte) 1);
        java.lang.String str7 = gPType1.getName();
        gPType1.setId((int) (byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        byte[] byte_array15 = gPType13.getParents();
        gPType13.setName("hi!:-1");
        java.lang.String str18 = gPType13.getName();
        gPType13.addParent((byte) -1);
        java.lang.String str21 = gPType13.getName();
        int i22 = gPType13.getId();
        java.lang.String str23 = gPType13.toString();
        int i24 = gPType13.getId();
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType13);
        int i26 = gPType13.getId();
        int i27 = gPType13.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!:-1" + "'", str18.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!:-1" + "'", str21.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:-1:-1" + "'", str23.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue(i24 == (-1));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue(i27 == (-1));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test032");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        gPType1.addParent((byte) -1);
        java.lang.String str10 = gPType1.toString();
        byte[] byte_array11 = gPType1.getChildren();
        gPType1.setName(":97");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ":-1" + "'", str10.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test033");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        byte[] byte_array6 = gPType3.getParents();
        gPType3.addChild((byte) 10);
        int i9 = gPType3.getId();
        gPType3.addParent((byte) 100);
        gPType3.setName(":10");
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array16 = gPType15.getChildren();
        gPType15.addChild((byte) 1);
        int i19 = gPType15.getId();
        gPType15.addChild((byte) 0);
        gPType15.addParent((byte) 1);
        java.lang.String str24 = gPType15.getName();
        java.lang.String str25 = gPType15.getName();
        java.lang.String str26 = gPType15.toString();
        gPType15.setId((int) (short) 100);
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType15);
        java.lang.String str30 = gPType15.getName();
        gPType15.setName("hi!:10");
        java.lang.String str33 = gPType15.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + ":-1" + "'", str26.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!:10" + "'", str33.equals("hi!:10"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test034");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.setId((-1));
        int i13 = gPType4.getId();
        gPType4.setName(":100");
        java.lang.String str16 = gPType4.toString();
        java.lang.String str17 = gPType4.toString();
        int i18 = gPType4.getId();
        gPType4.setId((-1));
        java.lang.String str21 = gPType4.toString();
        byte[] byte_array22 = gPType4.getParents();
        gPType4.addChild((byte) 100);
        java.lang.String str25 = gPType4.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":100:-1" + "'", str16.equals(":100:-1"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":100:-1" + "'", str17.equals(":100:-1"));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":100:-1" + "'", str21.equals(":100:-1"));
        org.junit.Assert.assertNull(byte_array22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + ":100:-1" + "'", str25.equals(":100:-1"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test035");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        gPType1.setName("");
        gPType1.addChild((byte) 10);
        java.lang.String str8 = gPType1.getName();
        java.lang.String str9 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        java.lang.String str23 = gPType11.toString();
        byte[] byte_array24 = gPType11.getParents();
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        gPType11.addChild((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ":-1:-1" + "'", str23.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test036");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        java.lang.String str3 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array6 = gPType5.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getChildren();
        gPType8.addChild((byte) 1);
        java.lang.String str12 = gPType8.getName();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType8);
        int i14 = gPType8.getId();
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType8.setId(1);
        gPType8.setId((int) (short) 100);
        java.lang.String str20 = gPType8.toString();
        java.lang.String str21 = gPType8.toString();
        gPType8.setId(0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + ":100" + "'", str20.equals(":100"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":100" + "'", str21.equals(":100"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test037");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        gPType1.addParent((byte) -1);
        gPType1.addChild((byte) 100);
        byte[] byte_array6 = gPType1.getParents();
        byte[] byte_array7 = gPType1.getParents();
        java.lang.String str8 = gPType1.getName();
        gPType1.setName(":-1:-1:-1:-1:10");
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:-1" + "'", str8.equals("hi!:-1"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test038");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.addChild((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array6 = gPType5.getParents();
        java.lang.String str7 = gPType5.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array10 = gPType9.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array13 = gPType12.getChildren();
        gPType12.addChild((byte) 1);
        java.lang.String str16 = gPType12.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType9, (io.github.agentsoz.jill.struct.AObject) gPType12);
        int i18 = gPType12.getId();
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType12);
        gPType5.setName("hi!:1");
        byte[] byte_array22 = gPType5.getParents();
        gPType5.addChild((byte) 1);
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType5);
        io.github.agentsoz.jill.struct.GoalPlanType gPType27 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array28 = gPType27.getChildren();
        gPType27.addChild((byte) 1);
        java.lang.String str31 = gPType27.getName();
        java.lang.String str32 = gPType27.getName();
        java.lang.String str33 = gPType27.getName();
        int i34 = gPType27.getId();
        byte[] byte_array35 = gPType27.getChildren();
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType27);
        java.lang.String str37 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType39 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array40 = gPType39.getParents();
        gPType39.setName("hi!");
        gPType39.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType46 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array47 = gPType46.getParents();
        int i48 = gPType46.getId();
        byte[] byte_array49 = gPType46.getChildren();
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType39, (io.github.agentsoz.jill.struct.AObject) gPType46);
        io.github.agentsoz.jill.struct.GoalPlanType gPType52 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array53 = gPType52.getParents();
        int i54 = gPType52.getId();
        byte[] byte_array55 = gPType52.getChildren();
        boolean b56 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType46, (io.github.agentsoz.jill.struct.AObject) gPType52);
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType52);
        java.lang.String str58 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(byte_array22);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertNotNull(byte_array35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!:1:-1" + "'", str37.equals("hi!:1:-1"));
        org.junit.Assert.assertNull(byte_array40);
        org.junit.Assert.assertNull(byte_array47);
        org.junit.Assert.assertTrue(i48 == (-1));
        org.junit.Assert.assertNull(byte_array49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(byte_array53);
        org.junit.Assert.assertTrue(i54 == (-1));
        org.junit.Assert.assertNull(byte_array55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!:1" + "'", str58.equals("hi!:1"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test039");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array16 = gPType15.getParents();
        gPType15.setName("hi!");
        java.lang.String str19 = gPType15.toString();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType15);
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array23 = gPType22.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array26 = gPType25.getChildren();
        gPType25.addChild((byte) 1);
        java.lang.String str29 = gPType25.getName();
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType22, (io.github.agentsoz.jill.struct.AObject) gPType25);
        int i31 = gPType25.getId();
        gPType25.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType35 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType25, (io.github.agentsoz.jill.struct.AObject) gPType35);
        gPType35.setName("hi!:-1");
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType35);
        int i40 = gPType15.getId();
        gPType15.setId((int) (byte) 1);
        gPType15.addParent((byte) 0);
        io.github.agentsoz.jill.struct.GoalPlanType gPType46 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array47 = gPType46.getParents();
        gPType46.setName("hi!");
        gPType46.setId((int) (byte) 1);
        java.lang.String str52 = gPType46.getName();
        gPType46.setId((int) (byte) 100);
        gPType46.addChild((byte) 100);
        gPType46.setId((int) (byte) 10);
        gPType46.addChild((byte) 1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType62 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array63 = gPType62.getChildren();
        gPType62.addChild((byte) 1);
        java.lang.String str66 = gPType62.getName();
        java.lang.String str67 = gPType62.getName();
        java.lang.String str68 = gPType62.getName();
        int i69 = gPType62.getId();
        gPType62.addChild((byte) 0);
        gPType62.addChild((byte) 1);
        gPType62.setName(":-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType77 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1:-1");
        gPType77.setId((-1));
        gPType77.addChild((byte) 1);
        java.lang.String str82 = gPType77.getName();
        boolean b83 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType62, (io.github.agentsoz.jill.struct.AObject) gPType77);
        gPType77.setName(":100");
        boolean b86 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType46, (io.github.agentsoz.jill.struct.AObject) gPType77);
        boolean b87 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType77);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == (-1));
        org.junit.Assert.assertNull(byte_array47);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!" + "'", str52.equals("hi!"));
        org.junit.Assert.assertNull(byte_array63);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "" + "'", str67.equals(""));
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "" + "'", str68.equals(""));
        org.junit.Assert.assertTrue(i69 == (-1));
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + ":-1:-1" + "'", str82.equals(":-1:-1"));
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue(b87 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test040");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        java.lang.String str8 = gPType3.getName();
        byte[] byte_array9 = gPType3.getChildren();
        int i10 = gPType3.getId();
        gPType3.addChild((byte) 100);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:-1" + "'", str8.equals("hi!:-1"));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test041");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType1.getChildren();
        int i6 = gPType1.getId();
        java.lang.String str7 = gPType1.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:1" + "'", str7.equals("hi!:1"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test042");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        gPType1.addParent((byte) -1);
        byte[] byte_array10 = gPType1.getParents();
        int i11 = gPType1.getId();
        java.lang.String str12 = gPType1.toString();
        byte[] byte_array13 = gPType1.getParents();
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1" + "'", str12.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test043");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array16 = gPType15.getParents();
        gPType15.setName("hi!");
        java.lang.String str19 = gPType15.toString();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType15);
        java.lang.String str21 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array26 = gPType25.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType28 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array29 = gPType28.getChildren();
        gPType28.addChild((byte) 1);
        java.lang.String str32 = gPType28.getName();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType25, (io.github.agentsoz.jill.struct.AObject) gPType28);
        int i34 = gPType28.getId();
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType23, (io.github.agentsoz.jill.struct.AObject) gPType28);
        gPType23.setId((int) (byte) -1);
        byte[] byte_array38 = gPType23.getParents();
        gPType23.addChild((byte) -1);
        gPType23.addParent((byte) 0);
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType23);
        gPType23.addParent((byte) 1);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(byte_array38);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test044");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        int i8 = gPType3.getId();
        byte[] byte_array9 = gPType3.getChildren();
        java.lang.String str10 = gPType3.getName();
        java.lang.String str11 = gPType3.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:-1" + "'", str11.equals("hi!:-1"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test045");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        java.lang.String str12 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType14, (io.github.agentsoz.jill.struct.AObject) gPType16);
        java.lang.String str18 = gPType16.getName();
        gPType16.addParent((byte) 1);
        java.lang.String str21 = gPType16.toString();
        byte[] byte_array22 = gPType16.getParents();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType16);
        byte[] byte_array24 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(byte_array24);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test046");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        int i2 = gPType1.getId();
        java.lang.String str3 = gPType1.toString();
        gPType1.setName(":-1");
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        org.junit.Assert.assertTrue(i2 == (-1));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!:-1" + "'", str3.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ":-1" + "'", str7.equals(":-1"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test047");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        java.lang.String str3 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType7);
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType7);
        gPType7.setName("");
        gPType7.addChild((byte) -1);
        gPType7.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test048");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array12 = gPType11.getParents();
        gPType11.setId((int) (short) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        gPType11.setName("");
        int i18 = gPType11.getId();
        gPType11.setId((int) (short) 10);
        byte[] byte_array21 = gPType11.getParents();
        int i22 = gPType11.getId();
        gPType11.setName("");
        java.lang.String str25 = gPType11.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 10);
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertTrue(i22 == 10);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test049");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        gPType1.addParent((byte) -1);
        java.lang.String str10 = gPType1.toString();
        gPType1.setName("hi!:-1");
        gPType1.setName("hi!:-1");
        int i15 = gPType1.getId();
        byte[] byte_array16 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ":-1" + "'", str10.equals(":-1"));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test050");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        java.lang.String str4 = gPType1.getName();
        java.lang.String str5 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ":-1" + "'", str5.equals(":-1"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test051");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        int i10 = gPType1.getId();
        byte[] byte_array11 = gPType1.getParents();
        gPType1.addParent((byte) -1);
        gPType1.addParent((byte) -1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test052");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str13 = gPType3.toString();
        gPType3.addParent((byte) 100);
        java.lang.String str16 = gPType3.toString();
        gPType3.addParent((byte) 1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType20 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array21 = gPType20.getChildren();
        byte[] byte_array22 = gPType20.getParents();
        byte[] byte_array23 = gPType20.getChildren();
        byte[] byte_array24 = gPType20.getParents();
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType20);
        gPType20.addParent((byte) 1);
        gPType20.setName(":-1:-1:-1:-1:10");
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ":-1" + "'", str13.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":-1" + "'", str16.equals(":-1"));
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertNull(byte_array22);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test053");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        java.lang.String str3 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array6 = gPType5.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getChildren();
        gPType8.addChild((byte) 1);
        java.lang.String str12 = gPType8.getName();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType8);
        int i14 = gPType8.getId();
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType8.setId(1);
        gPType8.setId((int) (short) 100);
        gPType8.addParent((byte) 1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array24 = gPType23.getChildren();
        byte[] byte_array25 = gPType23.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType27 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array28 = gPType27.getParents();
        java.lang.String str29 = gPType27.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType31 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array32 = gPType31.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType34 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array35 = gPType34.getChildren();
        gPType34.addChild((byte) 1);
        java.lang.String str38 = gPType34.getName();
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType31, (io.github.agentsoz.jill.struct.AObject) gPType34);
        int i40 = gPType34.getId();
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType27, (io.github.agentsoz.jill.struct.AObject) gPType34);
        byte[] byte_array42 = gPType34.getChildren();
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType23, (io.github.agentsoz.jill.struct.AObject) gPType34);
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType23);
        gPType23.addParent((byte) 0);
        java.lang.String str47 = gPType23.getName();
        gPType23.setName("");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        org.junit.Assert.assertNull(byte_array32);
        org.junit.Assert.assertNull(byte_array35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == (-1));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(byte_array42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test054");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setId((int) (short) 10);
        int i5 = gPType1.getId();
        java.lang.String str6 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:10" + "'", str6.equals("hi!:10"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test055");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        java.lang.String str4 = gPType1.getName();
        gPType1.setName(":100:10");
        java.lang.String str7 = gPType1.toString();
        java.lang.String str8 = gPType1.toString();
        gPType1.addParent((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ":100:10:-1" + "'", str7.equals(":100:10:-1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ":100:10:-1" + "'", str8.equals(":100:10:-1"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test056");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array14 = gPType13.getParents();
        gPType13.setId((int) (short) 10);
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType13);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        io.github.agentsoz.jill.struct.GoalPlanType gPType20 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType20, (io.github.agentsoz.jill.struct.AObject) gPType22);
        byte[] byte_array24 = gPType22.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType26 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array27 = gPType26.getChildren();
        gPType26.addChild((byte) 1);
        int i30 = gPType26.getId();
        gPType26.addChild((byte) 0);
        gPType26.addParent((byte) 100);
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType22, (io.github.agentsoz.jill.struct.AObject) gPType26);
        java.lang.String str36 = gPType26.toString();
        gPType26.setId((int) (short) -1);
        java.lang.String str39 = gPType26.getName();
        int i40 = gPType26.getId();
        byte[] byte_array41 = gPType26.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType43 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array44 = gPType43.getChildren();
        gPType43.addChild((byte) 1);
        int i47 = gPType43.getId();
        gPType43.addChild((byte) 0);
        gPType43.setId((int) (short) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType53 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array54 = gPType53.getParents();
        gPType53.setName("hi!");
        gPType53.setId((int) (byte) 1);
        java.lang.String str59 = gPType53.toString();
        boolean b60 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType43, (io.github.agentsoz.jill.struct.AObject) gPType53);
        int i61 = gPType53.getId();
        gPType53.addParent((byte) 1);
        gPType53.setId(0);
        boolean b66 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType26, (io.github.agentsoz.jill.struct.AObject) gPType53);
        io.github.agentsoz.jill.struct.GoalPlanType gPType68 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array69 = gPType68.getParents();
        gPType68.setName("hi!");
        gPType68.setName(":-1:-1");
        gPType68.addChild((byte) -1);
        gPType68.addParent((byte) 1);
        byte[] byte_array78 = gPType68.getChildren();
        int i79 = gPType68.getId();
        gPType68.setId((int) (byte) 0);
        gPType68.addParent((byte) 100);
        boolean b84 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType53, (io.github.agentsoz.jill.struct.AObject) gPType68);
        boolean b85 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType53);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertNull(byte_array27);
        org.junit.Assert.assertTrue(i30 == (-1));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + ":-1" + "'", str36.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertTrue(i40 == (-1));
        org.junit.Assert.assertNotNull(byte_array41);
        org.junit.Assert.assertNull(byte_array44);
        org.junit.Assert.assertTrue(i47 == (-1));
        org.junit.Assert.assertNull(byte_array54);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!:1" + "'", str59.equals("hi!:1"));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(i61 == 1);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(byte_array69);
        org.junit.Assert.assertNotNull(byte_array78);
        org.junit.Assert.assertTrue(i79 == (-1));
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b85 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test057");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        gPType1.setId((int) (byte) -1);
        gPType1.setName("hi!:-1");
        gPType1.addParent((byte) 100);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test058");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":97");
        gPType1.setId(0);
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array6 = gPType5.getChildren();
        gPType5.addChild((byte) 1);
        int i9 = gPType5.getId();
        gPType5.addChild((byte) 0);
        gPType5.setId((int) (short) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array16 = gPType15.getParents();
        gPType15.setName("hi!");
        gPType15.setId((int) (byte) 1);
        java.lang.String str21 = gPType15.toString();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType15);
        int i23 = gPType5.getId();
        gPType5.setName(":-1");
        byte[] byte_array26 = gPType5.getParents();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType5);
        byte[] byte_array28 = gPType5.getChildren();
        try {
            byte[] byte_array30 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array28, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!:1" + "'", str21.equals("hi!:1"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(byte_array28);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test059");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        gPType1.addChild((byte) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType9);
        java.lang.String str11 = gPType7.toString();
        gPType7.addChild((byte) -1);
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType7);
        gPType7.addParent((byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:1:-1" + "'", str11.equals("hi!:1:-1"));
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test060");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        gPType1.setId((int) (byte) 0);
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        java.lang.String str18 = gPType13.toString();
        gPType13.addChild((byte) 100);
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType13);
        java.lang.String str22 = gPType1.getName();
        int i23 = gPType1.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType25.setId((int) (byte) -1);
        gPType25.addParent((byte) -1);
        gPType25.setName("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType33 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array34 = gPType33.getChildren();
        gPType33.addChild((byte) 1);
        int i37 = gPType33.getId();
        gPType33.addChild((byte) 0);
        gPType33.addParent((byte) 1);
        gPType33.setName("hi!");
        gPType33.setId((int) '#');
        byte[] byte_array46 = gPType33.getChildren();
        gPType33.addChild((byte) 100);
        gPType33.addChild((byte) -1);
        gPType33.addParent((byte) 1);
        gPType33.addParent((byte) 1);
        gPType33.addParent((byte) -1);
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType25, (io.github.agentsoz.jill.struct.AObject) gPType33);
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType25);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(byte_array34);
        org.junit.Assert.assertTrue(i37 == (-1));
        org.junit.Assert.assertNotNull(byte_array46);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test061");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        java.lang.String str8 = gPType1.toString();
        byte[] byte_array9 = gPType1.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType11.setId((int) (byte) -1);
        gPType11.addParent((byte) -1);
        gPType11.setName("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType19 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array20 = gPType19.getChildren();
        gPType19.addChild((byte) 1);
        int i23 = gPType19.getId();
        gPType19.addChild((byte) 0);
        gPType19.addParent((byte) 1);
        gPType19.setName("hi!");
        gPType19.setId((int) '#');
        byte[] byte_array32 = gPType19.getChildren();
        gPType19.addChild((byte) 100);
        gPType19.addChild((byte) -1);
        gPType19.addParent((byte) 1);
        gPType19.addParent((byte) 1);
        gPType19.addParent((byte) -1);
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType19);
        gPType11.setName("");
        gPType11.addParent((byte) 0);
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ":-1" + "'", str8.equals(":-1"));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test062");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        int i2 = gPType1.getId();
        java.lang.String str3 = gPType1.toString();
        gPType1.setName(":-1");
        java.lang.String str6 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType8.setId((int) (byte) -1);
        gPType8.addParent((byte) 10);
        int i13 = gPType8.getId();
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType8.setName(":-1:-1:1:-1");
        org.junit.Assert.assertTrue(i2 == (-1));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!:-1" + "'", str3.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test063");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getChildren();
        gPType14.addChild((byte) 1);
        java.lang.String str18 = gPType14.toString();
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType14);
        int i20 = gPType1.getId();
        gPType1.setName(":100");
        java.lang.String str23 = gPType1.getName();
        int i24 = gPType1.getId();
        byte[] byte_array25 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType27 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array28 = gPType27.getChildren();
        gPType27.addChild((byte) 1);
        int i31 = gPType27.getId();
        gPType27.addChild((byte) 0);
        gPType27.addParent((byte) 1);
        int i36 = gPType27.getId();
        byte[] byte_array37 = gPType27.getParents();
        gPType27.addChild((byte) 1);
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType27);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ":100" + "'", str23.equals(":100"));
        org.junit.Assert.assertTrue(i24 == (-1));
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertNotNull(byte_array37);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test064");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType4, (io.github.agentsoz.jill.struct.AObject) gPType14);
        gPType14.addChild((byte) 0);
        gPType14.setId((int) (byte) 1);
        byte[] byte_array20 = gPType14.getChildren();
        java.lang.String str21 = gPType14.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(byte_array20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test065");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.addChild((byte) -1);
        java.lang.String str13 = gPType4.toString();
        java.lang.String str14 = gPType4.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ":-1" + "'", str13.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test066");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        gPType1.addParent((byte) -1);
        gPType1.addChild((byte) 100);
        byte[] byte_array6 = gPType1.getParents();
        java.lang.String str7 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array10 = gPType9.getParents();
        gPType9.setName("hi!");
        java.lang.String str13 = gPType9.toString();
        int i14 = gPType9.getId();
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType9);
        gPType9.setName(":-1:-1:1");
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:-1" + "'", str7.equals("hi!:-1"));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!:-1" + "'", str13.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test067");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.setId((int) (short) -1);
        byte[] byte_array10 = gPType1.getChildren();
        gPType1.addParent((byte) 100);
        java.lang.String str13 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test068");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setId((int) (byte) 1);
        java.lang.String str7 = gPType1.toString();
        int i8 = gPType1.getId();
        int i9 = gPType1.getId();
        gPType1.setId((int) 'a');
        java.lang.String str12 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:1" + "'", str7.equals("hi!:1"));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:97" + "'", str12.equals("hi!:97"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test069");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setId((int) (short) 10);
        gPType1.setId((int) (short) -1);
        java.lang.String str7 = gPType1.toString();
        int i8 = gPType1.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType10 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array11 = gPType10.getParents();
        gPType10.setName("hi!");
        gPType10.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array18 = gPType17.getParents();
        int i19 = gPType17.getId();
        byte[] byte_array20 = gPType17.getChildren();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType10, (io.github.agentsoz.jill.struct.AObject) gPType17);
        byte[] byte_array22 = gPType17.getChildren();
        byte[] byte_array23 = gPType17.getParents();
        java.lang.String str24 = gPType17.getName();
        gPType17.addChild((byte) 0);
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType17);
        gPType17.setName(":-1:-1:-1:-1");
        byte[] byte_array30 = gPType17.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:-1" + "'", str7.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(byte_array22);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(byte_array30);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test070");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        gPType1.addParent((byte) -1);
        gPType1.setName(":-1:-1:1");
        gPType1.addChild((byte) -1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test071");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        byte[] byte_array13 = gPType8.getChildren();
        byte[] byte_array14 = gPType8.getParents();
        java.lang.String str15 = gPType8.getName();
        java.lang.String str16 = gPType8.toString();
        byte[] byte_array17 = gPType8.getChildren();
        byte[] byte_array18 = gPType8.getChildren();
        byte[] byte_array19 = gPType8.getParents();
        java.lang.String str20 = gPType8.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        int i23 = gPType22.getId();
        java.lang.String str24 = gPType22.toString();
        java.lang.String str25 = gPType22.toString();
        java.lang.String str26 = gPType22.toString();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType22);
        java.lang.String str28 = gPType22.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":-1" + "'", str16.equals(":-1"));
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + ":-1" + "'", str20.equals(":-1"));
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!:-1" + "'", str24.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:-1" + "'", str25.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:-1" + "'", str26.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test072");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        gPType1.addParent((byte) -1);
        gPType1.addChild((byte) 100);
        byte[] byte_array6 = gPType1.getParents();
        byte[] byte_array7 = gPType1.getParents();
        gPType1.addParent((byte) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array12 = gPType11.getChildren();
        gPType11.addChild((byte) 1);
        int i15 = gPType11.getId();
        java.lang.String str16 = gPType11.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType18 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType20 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType18, (io.github.agentsoz.jill.struct.AObject) gPType20);
        byte[] byte_array22 = gPType20.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        gPType24.addChild((byte) 1);
        int i28 = gPType24.getId();
        gPType24.addChild((byte) 0);
        gPType24.addParent((byte) 100);
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType20, (io.github.agentsoz.jill.struct.AObject) gPType24);
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType20);
        byte[] byte_array35 = gPType20.getParents();
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType20);
        gPType1.setId((-1));
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":-1" + "'", str16.equals(":-1"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(byte_array22);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue(i28 == (-1));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(byte_array35);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test073");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType8.setName("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        int i20 = gPType16.getId();
        java.lang.String str21 = gPType16.toString();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType16);
        java.lang.String str23 = gPType16.getName();
        java.lang.String str24 = gPType16.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + ":-1" + "'", str24.equals(":-1"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test074");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array16 = gPType15.getParents();
        gPType15.setName("hi!");
        java.lang.String str19 = gPType15.toString();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType15);
        byte[] byte_array21 = gPType1.getChildren();
        gPType1.setName("hi!:-1:-1:-1:-1");
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(byte_array21);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test075");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array12 = gPType11.getParents();
        gPType11.setId((int) (short) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        gPType11.setName("");
        java.lang.String str18 = gPType11.toString();
        gPType11.setName(":52:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array23 = gPType22.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array26 = gPType25.getChildren();
        gPType25.addChild((byte) 1);
        java.lang.String str29 = gPType25.getName();
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType22, (io.github.agentsoz.jill.struct.AObject) gPType25);
        io.github.agentsoz.jill.struct.GoalPlanType gPType32 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array33 = gPType32.getParents();
        gPType32.setId((int) (short) 10);
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType22, (io.github.agentsoz.jill.struct.AObject) gPType32);
        gPType32.setName("");
        int i39 = gPType32.getId();
        gPType32.setId((int) (short) 10);
        byte[] byte_array42 = gPType32.getParents();
        gPType32.addChild((byte) 0);
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType32);
        io.github.agentsoz.jill.struct.GoalPlanType gPType47 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array48 = gPType47.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType50 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array51 = gPType50.getChildren();
        gPType50.addChild((byte) 1);
        java.lang.String str54 = gPType50.getName();
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType47, (io.github.agentsoz.jill.struct.AObject) gPType50);
        int i56 = gPType50.getId();
        gPType50.setId((-1));
        int i59 = gPType50.getId();
        gPType50.setName(":100");
        java.lang.String str62 = gPType50.toString();
        gPType50.setName(":100:-1");
        java.lang.String str65 = gPType50.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType67 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array68 = gPType67.getParents();
        gPType67.setId((int) (short) 10);
        java.lang.String str71 = gPType67.getName();
        gPType67.setName("hi!:1");
        java.lang.String str74 = gPType67.getName();
        boolean b75 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType50, (io.github.agentsoz.jill.struct.AObject) gPType67);
        boolean b76 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType50);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":10" + "'", str18.equals(":10"));
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(byte_array33);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i39 == 10);
        org.junit.Assert.assertNull(byte_array42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(byte_array48);
        org.junit.Assert.assertNull(byte_array51);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i56 == (-1));
        org.junit.Assert.assertTrue(i59 == (-1));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + ":100:-1" + "'", str62.equals(":100:-1"));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + ":100:-1:-1" + "'", str65.equals(":100:-1:-1"));
        org.junit.Assert.assertNull(byte_array68);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "hi!:1" + "'", str74.equals("hi!:1"));
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b76 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test076");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        gPType1.addParent((byte) 100);
        gPType1.addParent((byte) 10);
        byte[] byte_array11 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        int i14 = gPType13.getId();
        int i15 = gPType13.getId();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType13);
        int i17 = gPType1.getId();
        java.lang.String str18 = gPType1.toString();
        byte[] byte_array19 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array19);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test077");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        byte[] byte_array11 = gPType1.getParents();
        gPType1.addParent((byte) 1);
        byte[] byte_array14 = gPType1.getParents();
        byte[] byte_array16 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array14, 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test078");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        gPType1.setId((int) (byte) -1);
        gPType1.setName("hi!:-1");
        byte[] byte_array18 = gPType1.getChildren();
        java.lang.String str19 = gPType1.toString();
        java.lang.String str20 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1:-1" + "'", str19.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!:-1:-1" + "'", str20.equals("hi!:-1:-1"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test079");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        gPType24.addChild((byte) 1);
        java.lang.String str28 = gPType24.toString();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType24);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType24);
        int i31 = gPType1.getId();
        byte[] byte_array32 = gPType1.getChildren();
        byte[] byte_array33 = gPType1.getChildren();
        gPType1.setId(10);
        gPType1.addChild((byte) 100);
        gPType1.setId((int) (short) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertNotNull(byte_array33);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test080");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        byte[] byte_array11 = gPType1.getParents();
        gPType1.addParent((byte) 1);
        gPType1.addChild((byte) 100);
        byte[] byte_array16 = gPType1.getChildren();
        gPType1.setName(":52");
        java.lang.String str19 = gPType1.getName();
        io.github.agentsoz.jill.struct.AObject aObject20 = null;
        try {
            boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, aObject20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":52" + "'", str19.equals(":52"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test081");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        java.lang.String str4 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType6.setId((int) (byte) -1);
        java.lang.String str9 = gPType6.toString();
        gPType6.setId((int) (byte) 0);
        gPType6.setId((int) (byte) 10);
        gPType6.addParent((byte) 0);
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        byte[] byte_array17 = gPType6.getParents();
        gPType6.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1:-1" + "'", str9.equals("hi!:1:-1"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(byte_array17);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test082");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType1.addParent((byte) 100);
        gPType1.addParent((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test083");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        java.lang.String str20 = gPType16.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, (io.github.agentsoz.jill.struct.AObject) gPType16);
        int i22 = gPType16.getId();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType16);
        gPType11.setId((int) (byte) -1);
        byte[] byte_array26 = gPType11.getParents();
        java.lang.String str27 = gPType11.toString();
        byte[] byte_array28 = gPType11.getChildren();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        gPType11.addParent((byte) 1);
        byte[] byte_array32 = gPType11.getParents();
        gPType11.setName("hi!:0");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(byte_array32);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test084");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        java.lang.String str9 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        java.lang.String str20 = gPType16.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, (io.github.agentsoz.jill.struct.AObject) gPType16);
        int i22 = gPType16.getId();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType16);
        gPType11.setId((int) (byte) -1);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        gPType11.addParent((byte) -1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ":-1:-1" + "'", str9.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test085");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        java.lang.String str6 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType10 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType10);
        byte[] byte_array12 = gPType10.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getChildren();
        gPType14.addChild((byte) 1);
        int i18 = gPType14.getId();
        gPType14.addChild((byte) 0);
        gPType14.addParent((byte) 100);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType10, (io.github.agentsoz.jill.struct.AObject) gPType14);
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType10);
        int i25 = gPType10.getId();
        java.lang.String str26 = gPType10.toString();
        gPType10.setName(":97");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + ":-1" + "'", str26.equals(":-1"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test086");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        byte[] byte_array6 = gPType3.getParents();
        gPType3.addChild((byte) 10);
        int i9 = gPType3.getId();
        gPType3.addParent((byte) 1);
        byte[] byte_array12 = gPType3.getParents();
        gPType3.addChild((byte) 10);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test087");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getChildren();
        gPType14.addChild((byte) 1);
        java.lang.String str18 = gPType14.toString();
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType14);
        int i20 = gPType1.getId();
        gPType1.setName(":100");
        java.lang.String str23 = gPType1.getName();
        int i24 = gPType1.getId();
        byte[] byte_array25 = gPType1.getChildren();
        gPType1.setName(":52");
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ":100" + "'", str23.equals(":100"));
        org.junit.Assert.assertTrue(i24 == (-1));
        org.junit.Assert.assertNull(byte_array25);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test088");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setName("hi!");
        int i4 = gPType1.getId();
        gPType1.addChild((byte) -1);
        org.junit.Assert.assertTrue(i4 == (-1));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test089");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setId((int) (byte) 1);
        java.lang.String str7 = gPType1.getName();
        gPType1.setId((int) (byte) 100);
        gPType1.addChild((byte) 10);
        io.github.agentsoz.jill.struct.AObject aObject12 = null;
        try {
            boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, aObject12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test090");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        java.lang.String str3 = gPType1.toString();
        java.lang.String str4 = gPType1.toString();
        gPType1.setName(":52");
        java.lang.String str7 = gPType1.getName();
        gPType1.setName(":-1:-1:1");
        java.lang.String str10 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ":52" + "'", str7.equals(":52"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ":-1:-1:1:-1" + "'", str10.equals(":-1:-1:1:-1"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test091");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        gPType24.addChild((byte) 1);
        java.lang.String str28 = gPType24.toString();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType24);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType24);
        byte[] byte_array31 = gPType1.getChildren();
        java.lang.String str32 = gPType1.toString();
        gPType1.addChild((byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(byte_array31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + ":-1" + "'", str32.equals(":-1"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test092");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType5);
        java.lang.String str7 = gPType5.getName();
        java.lang.String str8 = gPType5.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType5);
        gPType5.addParent((byte) 0);
        gPType5.setName("");
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test093");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        java.lang.String str3 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType7);
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType7);
        byte[] byte_array10 = gPType1.getParents();
        gPType1.setId(10);
        byte[] byte_array13 = gPType1.getChildren();
        gPType1.addChild((byte) 10);
        gPType1.addParent((byte) 0);
        java.lang.String str18 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":10" + "'", str18.equals(":10"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test094");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        gPType7.addChild((byte) 0);
        gPType7.addParent((byte) 100);
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType7);
        java.lang.String str17 = gPType7.toString();
        gPType7.setId((int) (short) -1);
        java.lang.String str20 = gPType7.getName();
        int i21 = gPType7.getId();
        gPType7.setId(1);
        gPType7.addChild((byte) -1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(i21 == (-1));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test095");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        gPType24.addChild((byte) 1);
        java.lang.String str28 = gPType24.toString();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType24);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType24);
        int i31 = gPType1.getId();
        byte[] byte_array32 = gPType1.getChildren();
        gPType1.addChild((byte) -1);
        byte[] byte_array35 = gPType1.getChildren();
        byte[] byte_array36 = gPType1.getParents();
        gPType1.setName("hi!:35");
        gPType1.setName(":100");
        gPType1.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertNotNull(byte_array35);
        org.junit.Assert.assertNotNull(byte_array36);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test096");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        java.lang.String str9 = gPType4.getName();
        int i10 = gPType4.getId();
        gPType4.setName(":-1:-1");
        byte[] byte_array13 = gPType4.getParents();
        java.lang.String str14 = gPType4.toString();
        gPType4.addParent((byte) -1);
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        java.lang.String str18 = gPType4.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType20 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array21 = gPType20.getParents();
        gPType20.setName("hi!");
        java.lang.String str24 = gPType20.toString();
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType4, (io.github.agentsoz.jill.struct.AObject) gPType20);
        byte[] byte_array26 = gPType20.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ":-1:-1:-1" + "'", str14.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1:-1:-1" + "'", str18.equals(":-1:-1:-1"));
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!:-1" + "'", str24.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(byte_array26);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test097");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        int i13 = gPType8.getId();
        java.lang.String str14 = gPType8.toString();
        byte[] byte_array15 = gPType8.getChildren();
        byte[] byte_array16 = gPType8.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ":-1" + "'", str14.equals(":-1"));
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertNull(byte_array16);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test098");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) 1);
        byte[] byte_array6 = gPType1.getChildren();
        gPType1.addParent((byte) 0);
        org.junit.Assert.assertNull(byte_array6);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test099");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b6 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType5);
        java.lang.String str7 = gPType5.getName();
        java.lang.String str8 = gPType5.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType5);
        byte[] byte_array10 = gPType1.getParents();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test100");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        java.lang.String str8 = gPType3.getName();
        gPType3.addParent((byte) -1);
        java.lang.String str11 = gPType3.getName();
        int i12 = gPType3.getId();
        gPType3.setId((int) (short) 0);
        int i15 = gPType3.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:-1" + "'", str8.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:-1" + "'", str11.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test101");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        byte[] byte_array13 = gPType8.getChildren();
        byte[] byte_array14 = gPType8.getParents();
        java.lang.String str15 = gPType8.getName();
        gPType8.addChild((byte) 0);
        io.github.agentsoz.jill.struct.GoalPlanType gPType19 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType21 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType19, (io.github.agentsoz.jill.struct.AObject) gPType21);
        byte[] byte_array23 = gPType21.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array26 = gPType25.getChildren();
        gPType25.addChild((byte) 1);
        int i29 = gPType25.getId();
        gPType25.addChild((byte) 0);
        gPType25.addParent((byte) 100);
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType21, (io.github.agentsoz.jill.struct.AObject) gPType25);
        java.lang.String str35 = gPType25.toString();
        gPType25.setName("hi!:-1:-1");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType25);
        gPType25.addParent((byte) 0);
        byte[] byte_array41 = gPType25.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + ":-1" + "'", str35.equals(":-1"));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(byte_array41);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test102");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        gPType1.addParent((byte) -1);
        java.lang.String str10 = gPType1.toString();
        gPType1.setName("hi!:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getParents();
        int i16 = gPType14.getId();
        java.lang.String str17 = gPType14.toString();
        int i18 = gPType14.getId();
        java.lang.String str19 = gPType14.getName();
        java.lang.String str20 = gPType14.toString();
        gPType14.setName(":52");
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType14);
        byte[] byte_array24 = gPType14.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ":-1" + "'", str10.equals(":-1"));
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + ":-1" + "'", str20.equals(":-1"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(byte_array24);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test103");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        java.lang.String str2 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        int i8 = gPType4.getId();
        gPType4.addChild((byte) 0);
        gPType4.addParent((byte) 1);
        gPType4.setName("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        gPType4.setName(":52:-1:-1");
        gPType4.addChild((byte) 1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ":-1" + "'", str2.equals(":-1"));
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test104");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        byte[] byte_array8 = gPType1.getChildren();
        gPType1.addParent((byte) 0);
        int i11 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test105");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        gPType1.setId((int) (byte) 0);
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        java.lang.String str18 = gPType13.toString();
        gPType13.addChild((byte) 100);
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType13);
        byte[] byte_array22 = gPType13.getChildren();
        gPType13.setName("hi!:-1:-1");
        byte[] byte_array25 = gPType13.getParents();
        gPType13.addParent((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertNull(byte_array25);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test106");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str13 = gPType3.toString();
        gPType3.addParent((byte) 0);
        gPType3.addChild((byte) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType19 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array20 = gPType19.getChildren();
        gPType19.addChild((byte) 1);
        int i23 = gPType19.getId();
        gPType19.addChild((byte) 0);
        gPType19.addParent((byte) 1);
        gPType19.setName("");
        gPType19.setId((int) (short) 1);
        java.lang.String str32 = gPType19.toString();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType19);
        byte[] byte_array34 = gPType19.getChildren();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ":-1" + "'", str13.equals(":-1"));
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + ":1" + "'", str32.equals(":1"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(byte_array34);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test107");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array16 = gPType15.getParents();
        gPType15.setName("hi!");
        java.lang.String str19 = gPType15.toString();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType15);
        byte[] byte_array21 = gPType15.getChildren();
        gPType15.setId(0);
        byte[] byte_array24 = gPType15.getChildren();
        java.lang.String str25 = gPType15.toString();
        byte[] byte_array26 = gPType15.getParents();
        gPType15.addParent((byte) -1);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:0" + "'", str25.equals("hi!:0"));
        org.junit.Assert.assertNull(byte_array26);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test108");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        int i8 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addChild((byte) 1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1:-1");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType14);
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType19 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType17, (io.github.agentsoz.jill.struct.AObject) gPType19);
        gPType17.addParent((byte) -1);
        java.lang.String str23 = gPType17.getName();
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType17);
        gPType17.setId(97);
        byte[] byte_array27 = gPType17.getParents();
        gPType17.setName(":100:10:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:1" + "'", str23.equals("hi!:1"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(byte_array27);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test109");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        gPType1.setId((int) '#');
        byte[] byte_array14 = gPType1.getChildren();
        gPType1.addChild((byte) 100);
        gPType1.setId((-1));
        gPType1.setName("hi!:100");
        gPType1.addParent((byte) 0);
        byte[] byte_array23 = gPType1.getParents();
        try {
            byte[] byte_array25 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array23, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array23);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test110");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        java.lang.String str20 = gPType16.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, (io.github.agentsoz.jill.struct.AObject) gPType16);
        int i22 = gPType16.getId();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType16);
        gPType11.setId((int) (byte) -1);
        byte[] byte_array26 = gPType11.getParents();
        java.lang.String str27 = gPType11.toString();
        byte[] byte_array28 = gPType11.getChildren();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        gPType11.setId((int) (short) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test111");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        gPType1.setId((int) '#');
        byte[] byte_array14 = gPType1.getChildren();
        gPType1.addChild((byte) 100);
        gPType1.setId((-1));
        gPType1.setName("hi!:100");
        gPType1.addParent((byte) 0);
        gPType1.setName(":97");
        gPType1.addParent((byte) -1);
        gPType1.setId(0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test112");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.setId(1);
        gPType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array8 = gPType7.getParents();
        gPType7.setName("hi!");
        gPType7.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getParents();
        int i16 = gPType14.getId();
        byte[] byte_array17 = gPType14.getChildren();
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType14);
        gPType14.setName("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array23 = gPType22.getChildren();
        gPType22.addChild((byte) 1);
        int i26 = gPType22.getId();
        java.lang.String str27 = gPType22.toString();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType14, (io.github.agentsoz.jill.struct.AObject) gPType22);
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType14);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test113");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType1.addParent((byte) 100);
        gPType1.addChild((byte) 10);
        gPType1.setId((-1));
        gPType1.addChild((byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test114");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        gPType1.addParent((byte) -1);
        java.lang.String str10 = gPType1.getName();
        gPType1.setName("hi!:1");
        byte[] byte_array13 = gPType1.getParents();
        byte[] byte_array14 = gPType1.getChildren();
        java.lang.String str15 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array18 = gPType17.getParents();
        int i19 = gPType17.getId();
        gPType17.setName("");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType17);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!:1" + "'", str15.equals("hi!:1"));
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test115");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType1.addChild((byte) 100);
        java.lang.String str7 = gPType1.toString();
        java.lang.String str8 = gPType1.getName();
        byte[] byte_array9 = gPType1.getParents();
        java.lang.String str10 = gPType1.getName();
        gPType1.addParent((byte) -1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:-1" + "'", str7.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test116");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array16 = gPType15.getParents();
        gPType15.setName("hi!");
        java.lang.String str19 = gPType15.toString();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType15);
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array23 = gPType22.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array26 = gPType25.getChildren();
        gPType25.addChild((byte) 1);
        java.lang.String str29 = gPType25.getName();
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType22, (io.github.agentsoz.jill.struct.AObject) gPType25);
        int i31 = gPType25.getId();
        gPType25.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType35 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType25, (io.github.agentsoz.jill.struct.AObject) gPType35);
        gPType35.setName("hi!:-1");
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType35);
        int i40 = gPType15.getId();
        gPType15.addParent((byte) 100);
        int i43 = gPType15.getId();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == (-1));
        org.junit.Assert.assertTrue(i43 == (-1));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test117");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        gPType1.setName("");
        gPType1.addChild((byte) 10);
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        byte[] byte_array12 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test118");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType3.setName("hi!:1");
        byte[] byte_array15 = gPType3.getParents();
        byte[] byte_array16 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        gPType3.addParent((byte) 100);
        java.lang.String str21 = gPType3.toString();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!:1:-1" + "'", str21.equals("hi!:1:-1"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test119");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.addParent((byte) 100);
        byte[] byte_array10 = gPType1.getParents();
        byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (int) (byte) 100);
        byte[] byte_array14 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (int) (short) 0);
        byte[] byte_array16 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (int) '4');
        try {
            byte[] byte_array18 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test120");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        byte[] byte_array10 = gPType1.getParents();
        java.lang.String str11 = gPType1.toString();
        gPType1.addParent((byte) 100);
        gPType1.addParent((byte) 0);
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array18 = gPType17.getParents();
        gPType17.setName("hi!");
        gPType17.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getParents();
        int i26 = gPType24.getId();
        byte[] byte_array27 = gPType24.getChildren();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType17, (io.github.agentsoz.jill.struct.AObject) gPType24);
        io.github.agentsoz.jill.struct.GoalPlanType gPType30 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array31 = gPType30.getParents();
        int i32 = gPType30.getId();
        byte[] byte_array33 = gPType30.getChildren();
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType24, (io.github.agentsoz.jill.struct.AObject) gPType30);
        gPType30.addParent((byte) 0);
        gPType30.setName("hi!:-1:-1:-1");
        int i39 = gPType30.getId();
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType30);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1:-1:-1" + "'", str11.equals(":-1:-1:-1"));
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertNull(byte_array27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertNull(byte_array33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test121");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        java.lang.String str14 = gPType6.toString();
        java.lang.String str15 = gPType6.toString();
        byte[] byte_array16 = gPType6.getParents();
        java.lang.String str17 = gPType6.toString();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ":-1" + "'", str14.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ":-1" + "'", str15.equals(":-1"));
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test122");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        byte[] byte_array8 = gPType1.getChildren();
        byte[] byte_array9 = gPType1.getChildren();
        byte[] byte_array10 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test123");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        java.lang.String str10 = gPType1.getName();
        gPType1.addParent((byte) 100);
        byte[] byte_array13 = gPType1.getChildren();
        try {
            byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test124");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType17);
        java.lang.String str19 = gPType17.getName();
        gPType17.addParent((byte) 1);
        gPType17.addParent((byte) 1);
        gPType17.setId((-1));
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType17);
        java.lang.String str27 = gPType1.toString();
        java.lang.String str28 = gPType1.toString();
        byte[] byte_array29 = gPType1.getChildren();
        gPType1.setId((-1));
        byte[] byte_array32 = gPType1.getChildren();
        gPType1.setId((int) (short) 10);
        gPType1.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertNull(byte_array32);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test125");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        gPType3.addChild((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        byte[] byte_array15 = gPType13.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array18 = gPType17.getChildren();
        gPType17.addChild((byte) 1);
        int i21 = gPType17.getId();
        gPType17.addChild((byte) 0);
        gPType17.addParent((byte) 100);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, (io.github.agentsoz.jill.struct.AObject) gPType17);
        java.lang.String str27 = gPType17.toString();
        gPType17.setName("hi!:-1:-1");
        gPType17.addParent((byte) 0);
        byte[] byte_array32 = gPType17.getChildren();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType17);
        gPType17.addChild((byte) 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test126");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        gPType1.setId((int) (byte) -1);
        byte[] byte_array16 = gPType1.getParents();
        java.lang.String str17 = gPType1.toString();
        byte[] byte_array18 = gPType1.getChildren();
        gPType1.addParent((byte) 100);
        byte[] byte_array21 = gPType1.getParents();
        gPType1.addChild((byte) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array26 = gPType25.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType28 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array29 = gPType28.getChildren();
        gPType28.addChild((byte) 1);
        java.lang.String str32 = gPType28.getName();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType25, (io.github.agentsoz.jill.struct.AObject) gPType28);
        int i34 = gPType28.getId();
        gPType28.addChild((byte) -1);
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType28);
        java.lang.String str38 = gPType28.getName();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNotNull(byte_array21);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test127");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        gPType1.setId((int) '#');
        byte[] byte_array14 = gPType1.getChildren();
        gPType1.addChild((byte) 100);
        byte[] byte_array17 = gPType1.getChildren();
        gPType1.setId(35);
        io.github.agentsoz.jill.struct.GoalPlanType gPType21 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType21, (io.github.agentsoz.jill.struct.AObject) gPType23);
        byte[] byte_array25 = gPType23.getParents();
        gPType23.setName("hi!:-1");
        byte[] byte_array28 = gPType23.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType30 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType32 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType30, (io.github.agentsoz.jill.struct.AObject) gPType32);
        java.lang.String str34 = gPType32.getName();
        gPType32.addParent((byte) 1);
        java.lang.String str37 = gPType32.toString();
        gPType32.addChild((byte) -1);
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType23, (io.github.agentsoz.jill.struct.AObject) gPType32);
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType23);
        gPType23.setName(":-1:-1:-1:-1");
        java.lang.String str44 = gPType23.getName();
        gPType23.addParent((byte) -1);
        gPType23.setId((int) 'a');
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + ":-1" + "'", str37.equals(":-1"));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + ":-1:-1:-1:-1" + "'", str44.equals(":-1:-1:-1:-1"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test128");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        gPType7.addChild((byte) 0);
        gPType7.addParent((byte) 100);
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType7);
        java.lang.String str17 = gPType7.toString();
        gPType7.setName("hi!:-1:-1");
        gPType7.addChild((byte) 1);
        java.lang.String str22 = gPType7.getName();
        gPType7.addParent((byte) 10);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!:-1:-1" + "'", str22.equals("hi!:-1:-1"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test129");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":52");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        gPType6.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType6, (io.github.agentsoz.jill.struct.AObject) gPType16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        java.lang.String str19 = gPType6.toString();
        int i20 = gPType6.getId();
        byte[] byte_array21 = gPType6.getParents();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertNull(byte_array21);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test130");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        byte[] byte_array9 = gPType1.getParents();
        byte[] byte_array10 = gPType1.getParents();
        gPType1.setName("hi!:35:-1:-1");
        java.lang.String str13 = gPType1.toString();
        gPType1.setName("hi!:1:1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!:35:-1:-1:-1" + "'", str13.equals("hi!:35:-1:-1:-1"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test131");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        java.lang.String str20 = gPType16.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, (io.github.agentsoz.jill.struct.AObject) gPType16);
        int i22 = gPType16.getId();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType16);
        gPType11.setId((int) (byte) -1);
        byte[] byte_array26 = gPType11.getParents();
        java.lang.String str27 = gPType11.toString();
        byte[] byte_array28 = gPType11.getChildren();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        io.github.agentsoz.jill.struct.GoalPlanType gPType31 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType33 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType31, (io.github.agentsoz.jill.struct.AObject) gPType33);
        java.lang.String str35 = gPType33.getName();
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType33);
        byte[] byte_array37 = gPType33.getChildren();
        byte[] byte_array38 = gPType33.getParents();
        java.lang.String str39 = gPType33.getName();
        gPType33.addChild((byte) 100);
        byte[] byte_array42 = gPType33.getChildren();
        gPType33.setName("hi!:1:-1:1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(byte_array37);
        org.junit.Assert.assertNull(byte_array38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertNotNull(byte_array42);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test132");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType8.setId(1);
        byte[] byte_array15 = gPType8.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test133");
        byte[] byte_array3 = new byte[] { (byte) 1, (byte) 0, (byte) 10 };
        byte[] byte_array5 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array3, 0);
        byte[] byte_array7 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, 10);
        byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, (int) ' ');
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) 'a');
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) '#');
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (short) 0);
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array15, 52);
        org.junit.Assert.assertNotNull(byte_array3);
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array17);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test134");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        java.lang.String str3 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array6 = gPType5.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getChildren();
        gPType8.addChild((byte) 1);
        java.lang.String str12 = gPType8.getName();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType8);
        int i14 = gPType8.getId();
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType8.setId(1);
        gPType8.setName(":100");
        byte[] byte_array20 = gPType8.getChildren();
        gPType8.addParent((byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(byte_array20);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test135");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        java.lang.String str4 = gPType1.toString();
        gPType1.setName(":-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType10 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array11 = gPType10.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        java.lang.String str17 = gPType13.getName();
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType10, (io.github.agentsoz.jill.struct.AObject) gPType13);
        int i19 = gPType13.getId();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType13);
        gPType8.setId((int) (byte) -1);
        byte[] byte_array23 = gPType8.getParents();
        gPType8.setId(10);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType8.setId((int) (short) 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test136");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        byte[] byte_array4 = gPType1.getChildren();
        gPType1.setName("hi!:1:1");
        java.lang.String str7 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:1:1:-1" + "'", str7.equals("hi!:1:1:-1"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test137");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setId((int) (byte) 1);
        java.lang.String str7 = gPType1.toString();
        gPType1.setName(":-1");
        byte[] byte_array10 = gPType1.getParents();
        java.lang.String str11 = gPType1.getName();
        java.lang.String str12 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:1" + "'", str7.equals("hi!:1"));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1" + "'", str11.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1" + "'", str12.equals(":-1"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test138");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType4, (io.github.agentsoz.jill.struct.AObject) gPType14);
        java.lang.String str16 = gPType4.getName();
        gPType4.addParent((byte) -1);
        int i19 = gPType4.getId();
        java.lang.String str20 = gPType4.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test139");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.setId((int) (byte) -1);
        java.lang.String str4 = gPType1.toString();
        gPType1.setId((-1));
        gPType1.addParent((byte) 100);
        java.lang.String str9 = gPType1.getName();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:1:-1" + "'", str4.equals("hi!:1:-1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test140");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":52");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        gPType6.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType6, (io.github.agentsoz.jill.struct.AObject) gPType16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        byte[] byte_array19 = gPType6.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType21 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType21, (io.github.agentsoz.jill.struct.AObject) gPType23);
        gPType23.addChild((byte) 0);
        int i27 = gPType23.getId();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType6, (io.github.agentsoz.jill.struct.AObject) gPType23);
        io.github.agentsoz.jill.struct.GoalPlanType gPType30 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType32 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType30, (io.github.agentsoz.jill.struct.AObject) gPType32);
        java.lang.String str34 = gPType32.getName();
        byte[] byte_array35 = gPType32.getParents();
        gPType32.addParent((byte) 10);
        gPType32.addChild((byte) 100);
        int i40 = gPType32.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType42 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array43 = gPType42.getParents();
        gPType42.setName("hi!");
        gPType42.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType49 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array50 = gPType49.getParents();
        int i51 = gPType49.getId();
        byte[] byte_array52 = gPType49.getChildren();
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType42, (io.github.agentsoz.jill.struct.AObject) gPType49);
        int i54 = gPType49.getId();
        gPType49.setName("hi!:35:-1");
        java.lang.String str57 = gPType49.toString();
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType32, (io.github.agentsoz.jill.struct.AObject) gPType49);
        java.lang.String str59 = gPType49.toString();
        boolean b60 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType6, (io.github.agentsoz.jill.struct.AObject) gPType49);
        byte[] byte_array61 = gPType49.getParents();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i27 == (-1));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertNull(byte_array35);
        org.junit.Assert.assertTrue(i40 == (-1));
        org.junit.Assert.assertNull(byte_array43);
        org.junit.Assert.assertNull(byte_array50);
        org.junit.Assert.assertTrue(i51 == (-1));
        org.junit.Assert.assertNull(byte_array52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == (-1));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!:35:-1:-1" + "'", str57.equals("hi!:35:-1:-1"));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!:35:-1:-1" + "'", str59.equals("hi!:35:-1:-1"));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(byte_array61);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test141");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array14 = gPType13.getParents();
        gPType13.setId((int) (short) 10);
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType13);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType3.setName(":-1:-1:-1");
        gPType3.addChild((byte) 100);
        byte[] byte_array23 = gPType3.getChildren();
        gPType3.setName(":0");
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(byte_array23);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test142");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        byte[] byte_array10 = gPType1.getParents();
        gPType1.addChild((byte) 1);
        int i13 = gPType1.getId();
        gPType1.setId((int) (short) -1);
        int i16 = gPType1.getId();
        java.lang.String str17 = gPType1.getName();
        java.lang.String str18 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType20 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array21 = gPType20.getChildren();
        gPType20.addChild((byte) 1);
        int i24 = gPType20.getId();
        gPType20.addChild((byte) 0);
        gPType20.addParent((byte) 100);
        int i29 = gPType20.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType31 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array32 = gPType31.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType34 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array35 = gPType34.getChildren();
        gPType34.addChild((byte) 1);
        java.lang.String str38 = gPType34.getName();
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType31, (io.github.agentsoz.jill.struct.AObject) gPType34);
        io.github.agentsoz.jill.struct.GoalPlanType gPType41 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array42 = gPType41.getParents();
        gPType41.setId((int) (short) 10);
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType31, (io.github.agentsoz.jill.struct.AObject) gPType41);
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType20, (io.github.agentsoz.jill.struct.AObject) gPType31);
        java.lang.String str47 = gPType20.toString();
        byte[] byte_array48 = gPType20.getChildren();
        java.lang.String str49 = gPType20.toString();
        gPType20.setName("hi!:-1:-1:-1");
        java.lang.String str52 = gPType20.getName();
        gPType20.addChild((byte) 10);
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType20);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1:-1" + "'", str17.equals(":-1:-1"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1:-1" + "'", str18.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertTrue(i24 == (-1));
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertNull(byte_array32);
        org.junit.Assert.assertNull(byte_array35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(byte_array42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + ":-1" + "'", str47.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + ":-1" + "'", str49.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!:-1:-1:-1" + "'", str52.equals("hi!:-1:-1:-1"));
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test143");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        gPType1.setId((int) (byte) -1);
        gPType1.setName(":97");
        gPType1.addParent((byte) 1);
        byte[] byte_array20 = gPType1.getParents();
        gPType1.setId((int) (byte) -1);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(byte_array20);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test144");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        gPType1.addParent((byte) -1);
        gPType1.addChild((byte) 100);
        byte[] byte_array6 = gPType1.getParents();
        byte[] byte_array7 = gPType1.getParents();
        java.lang.String str8 = gPType1.getName();
        gPType1.setName(":100");
        gPType1.addChild((byte) 0);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:-1" + "'", str8.equals("hi!:-1"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test145");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        gPType7.addChild((byte) 0);
        gPType7.addParent((byte) 100);
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType7);
        java.lang.String str17 = gPType7.toString();
        gPType7.setId((int) (short) -1);
        java.lang.String str20 = gPType7.getName();
        int i21 = gPType7.getId();
        gPType7.setName("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType25.addParent((byte) 1);
        byte[] byte_array28 = gPType25.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType30 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array31 = gPType30.getChildren();
        gPType30.addChild((byte) 1);
        int i34 = gPType30.getId();
        gPType30.addChild((byte) 0);
        gPType30.addParent((byte) 1);
        gPType30.setName("hi!");
        gPType30.setId((int) '#');
        byte[] byte_array43 = gPType30.getChildren();
        gPType30.addChild((byte) 100);
        gPType30.addChild((byte) -1);
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType25, (io.github.agentsoz.jill.struct.AObject) gPType30);
        int i49 = gPType25.getId();
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType25);
        java.lang.String str51 = gPType25.toString();
        gPType25.addParent((byte) 100);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertNotNull(byte_array43);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i49 == (-1));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + ":-1" + "'", str51.equals(":-1"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test146");
        byte[] byte_array3 = new byte[] { (byte) 1, (byte) 0, (byte) 10 };
        byte[] byte_array5 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array3, 0);
        byte[] byte_array7 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array3, (int) ' ');
        byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array7, (int) (short) 1);
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, 1);
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, (int) (byte) 1);
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, 32);
        org.junit.Assert.assertNotNull(byte_array3);
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test147");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        byte[] byte_array11 = gPType1.getChildren();
        java.lang.String str12 = gPType1.toString();
        gPType1.setName("hi!:35:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType18 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType18);
        byte[] byte_array20 = gPType18.getParents();
        gPType18.setName("hi!:-1");
        gPType18.addParent((byte) 10);
        gPType18.setName("hi!:100");
        gPType18.setName(":52");
        java.lang.String str29 = gPType18.toString();
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType18);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1:-1:-1" + "'", str12.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + ":52:-1" + "'", str29.equals(":52:-1"));
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test148");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getChildren();
        gPType14.addChild((byte) 1);
        java.lang.String str18 = gPType14.toString();
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType14);
        java.lang.String str20 = gPType1.getName();
        gPType1.setName("hi!:1:1:-1");
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + ":-1" + "'", str20.equals(":-1"));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test149");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        gPType7.addChild((byte) 0);
        gPType7.addParent((byte) 100);
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType7);
        java.lang.String str17 = gPType7.toString();
        gPType7.setName("hi!:-1:-1");
        java.lang.String str20 = gPType7.getName();
        gPType7.addChild((byte) 100);
        byte[] byte_array23 = gPType7.getParents();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!:-1:-1" + "'", str20.equals("hi!:-1:-1"));
        org.junit.Assert.assertNotNull(byte_array23);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test150");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType3.setName("hi!:1");
        gPType3.addParent((byte) 0);
        byte[] byte_array17 = gPType3.getChildren();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(byte_array17);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test151");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.setId((int) (byte) -1);
        java.lang.String str4 = gPType1.toString();
        gPType1.setId((int) (byte) 0);
        gPType1.setId((int) (byte) 10);
        gPType1.addParent((byte) 0);
        gPType1.addParent((byte) 100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:1:-1" + "'", str4.equals("hi!:1:-1"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test152");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        java.lang.String str6 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType10 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType10);
        byte[] byte_array12 = gPType10.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getChildren();
        gPType14.addChild((byte) 1);
        int i18 = gPType14.getId();
        gPType14.addChild((byte) 0);
        gPType14.addParent((byte) 100);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType10, (io.github.agentsoz.jill.struct.AObject) gPType14);
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType10);
        int i25 = gPType1.getId();
        gPType1.addParent((byte) 1);
        java.lang.String str28 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test153");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        byte[] byte_array11 = gPType1.getParents();
        gPType1.addParent((byte) 1);
        byte[] byte_array14 = gPType1.getParents();
        java.lang.String str15 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ":-1:-1:-1" + "'", str15.equals(":-1:-1:-1"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test154");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType17);
        java.lang.String str19 = gPType17.getName();
        gPType17.addParent((byte) 1);
        gPType17.addParent((byte) 1);
        gPType17.setId((-1));
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType17);
        java.lang.String str27 = gPType1.toString();
        java.lang.String str28 = gPType1.toString();
        byte[] byte_array29 = gPType1.getChildren();
        gPType1.setId((-1));
        byte[] byte_array32 = gPType1.getChildren();
        gPType1.setId((int) (short) 10);
        byte[] byte_array35 = gPType1.getChildren();
        byte[] byte_array36 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertNull(byte_array32);
        org.junit.Assert.assertNull(byte_array35);
        org.junit.Assert.assertNull(byte_array36);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test155");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        byte[] byte_array11 = gPType1.getChildren();
        java.lang.String str12 = gPType1.toString();
        gPType1.setName("hi!:35:-1");
        gPType1.setId((int) '#');
        byte[] byte_array17 = gPType1.getParents();
        gPType1.addChild((byte) 100);
        byte[] byte_array20 = gPType1.getChildren();
        byte[] byte_array22 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array20, (int) ' ');
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1:-1:-1" + "'", str12.equals(":-1:-1:-1"));
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertNotNull(byte_array20);
        org.junit.Assert.assertNotNull(byte_array22);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test156");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        gPType1.setId((int) '#');
        byte[] byte_array14 = gPType1.getChildren();
        gPType1.addChild((byte) 100);
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        java.lang.String str21 = gPType1.toString();
        byte[] byte_array22 = gPType1.getParents();
        byte[] byte_array23 = gPType1.getParents();
        java.lang.String str24 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!:35" + "'", str21.equals("hi!:35"));
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertNotNull(byte_array23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!:35" + "'", str24.equals("hi!:35"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test157");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        int i2 = gPType1.getId();
        int i3 = gPType1.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType7);
        java.lang.String str9 = gPType7.getName();
        byte[] byte_array10 = gPType7.getParents();
        byte[] byte_array11 = gPType7.getParents();
        int i12 = gPType7.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType7);
        java.lang.String str14 = gPType1.toString();
        byte[] byte_array15 = gPType1.getParents();
        byte[] byte_array16 = gPType1.getParents();
        gPType1.addChild((byte) 100);
        org.junit.Assert.assertTrue(i2 == (-1));
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:-1" + "'", str14.equals("hi!:-1"));
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertNull(byte_array16);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test158");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array12 = gPType11.getParents();
        gPType11.setId((int) (short) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        gPType11.setId((int) (short) 0);
        byte[] byte_array18 = gPType11.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(byte_array18);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test159");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        java.lang.String str3 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType7);
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType7);
        byte[] byte_array10 = gPType7.getChildren();
        java.lang.String str11 = gPType7.toString();
        gPType7.addParent((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1" + "'", str11.equals(":-1"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test160");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1:-1");
        gPType1.setId((-1));
        gPType1.addChild((byte) 1);
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        java.lang.String str8 = gPType1.toString();
        java.lang.String str9 = gPType1.toString();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1:-1" + "'", str6.equals(":-1:-1"));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ":-1:-1:-1" + "'", str8.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ":-1:-1:-1" + "'", str9.equals(":-1:-1:-1"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test161");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        gPType1.setId((int) 'a');
        gPType1.addParent((byte) 0);
        gPType1.addParent((byte) -1);
        int i10 = gPType1.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        int i13 = gPType12.getId();
        java.lang.String str14 = gPType12.getName();
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType12);
        int i16 = gPType12.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == (-1));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test162");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        byte[] byte_array11 = gPType1.getChildren();
        java.lang.String str12 = gPType1.toString();
        gPType1.setName("hi!:35:-1");
        gPType1.setId((int) '#');
        byte[] byte_array17 = gPType1.getParents();
        gPType1.addChild((byte) 100);
        byte[] byte_array20 = gPType1.getChildren();
        gPType1.addChild((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1:-1:-1" + "'", str12.equals(":-1:-1:-1"));
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertNotNull(byte_array20);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test163");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        gPType1.setId((int) '#');
        byte[] byte_array14 = gPType1.getChildren();
        gPType1.addChild((byte) 100);
        gPType1.setId((-1));
        gPType1.setName("hi!:100");
        gPType1.addParent((byte) 0);
        gPType1.addParent((byte) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType26 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType28 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array29 = gPType28.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType31 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array32 = gPType31.getChildren();
        gPType31.addChild((byte) 1);
        java.lang.String str35 = gPType31.getName();
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType28, (io.github.agentsoz.jill.struct.AObject) gPType31);
        int i37 = gPType31.getId();
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType26, (io.github.agentsoz.jill.struct.AObject) gPType31);
        io.github.agentsoz.jill.struct.GoalPlanType gPType40 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType42 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType40, (io.github.agentsoz.jill.struct.AObject) gPType42);
        java.lang.String str44 = gPType42.getName();
        gPType42.addParent((byte) 1);
        gPType42.addParent((byte) 1);
        gPType42.setId((-1));
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType26, (io.github.agentsoz.jill.struct.AObject) gPType42);
        gPType26.setId((int) (byte) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType55 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array56 = gPType55.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType58 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array59 = gPType58.getChildren();
        gPType58.addChild((byte) 1);
        java.lang.String str62 = gPType58.getName();
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType55, (io.github.agentsoz.jill.struct.AObject) gPType58);
        int i64 = gPType58.getId();
        gPType58.addChild((byte) 0);
        boolean b67 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType26, (io.github.agentsoz.jill.struct.AObject) gPType58);
        java.lang.String str68 = gPType26.toString();
        boolean b69 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType26);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertNull(byte_array32);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i37 == (-1));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(byte_array56);
        org.junit.Assert.assertNull(byte_array59);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i64 == (-1));
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + ":-1" + "'", str68.equals(":-1"));
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test164");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1:-1");
        gPType1.setName("hi!:-1:-1");
        gPType1.setName(":52");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test165");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        gPType1.setId((int) '#');
        java.lang.String str14 = gPType1.getName();
        java.lang.String str15 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!:35" + "'", str15.equals("hi!:35"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test166");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        java.lang.String str4 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType6.setId((int) (byte) -1);
        java.lang.String str9 = gPType6.toString();
        gPType6.setId((int) (byte) 0);
        gPType6.setId((int) (byte) 10);
        gPType6.addParent((byte) 0);
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        gPType6.addChild((byte) 1);
        java.lang.String str19 = gPType6.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1:-1" + "'", str9.equals("hi!:1:-1"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:1:10" + "'", str19.equals("hi!:1:10"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test167");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        gPType7.addChild((byte) 0);
        gPType7.addParent((byte) 100);
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType7);
        java.lang.String str17 = gPType3.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test168");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        gPType1.setName("");
        gPType1.addChild((byte) 10);
        java.lang.String str8 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType10 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType10, (io.github.agentsoz.jill.struct.AObject) gPType12);
        java.lang.String str14 = gPType12.getName();
        byte[] byte_array15 = gPType12.getParents();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType12);
        gPType1.setName(":52");
        byte[] byte_array19 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(byte_array19);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test169");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType3.addParent((byte) 1);
        int i7 = gPType3.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array12 = gPType11.getChildren();
        gPType11.addChild((byte) 1);
        int i15 = gPType11.getId();
        gPType11.addChild((byte) 0);
        gPType11.addParent((byte) 1);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType9, (io.github.agentsoz.jill.struct.AObject) gPType11);
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array23 = gPType22.getChildren();
        gPType22.addChild((byte) 1);
        java.lang.String str26 = gPType22.toString();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType9, (io.github.agentsoz.jill.struct.AObject) gPType22);
        java.lang.String str28 = gPType22.toString();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType22);
        java.lang.String str30 = gPType3.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + ":-1" + "'", str26.equals(":-1"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test170");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        gPType24.addChild((byte) 1);
        java.lang.String str28 = gPType24.toString();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType24);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType24);
        gPType24.setName(":-1");
        java.lang.String str33 = gPType24.getName();
        gPType24.setName("hi!:10");
        gPType24.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + ":-1" + "'", str33.equals(":-1"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test171");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType4, (io.github.agentsoz.jill.struct.AObject) gPType14);
        gPType14.addChild((byte) 0);
        byte[] byte_array18 = gPType14.getChildren();
        byte[] byte_array19 = gPType14.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(byte_array18);
        org.junit.Assert.assertNotNull(byte_array19);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test172");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.setId((-1));
        int i13 = gPType4.getId();
        gPType4.addParent((byte) 1);
        java.lang.String str16 = gPType4.getName();
        byte[] byte_array17 = gPType4.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(byte_array17);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test173");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        byte[] byte_array6 = gPType3.getParents();
        gPType3.addChild((byte) 10);
        int i9 = gPType3.getId();
        byte[] byte_array10 = gPType3.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array13 = gPType12.getParents();
        gPType12.setName("hi!");
        gPType12.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType19 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array20 = gPType19.getParents();
        int i21 = gPType19.getId();
        byte[] byte_array22 = gPType19.getChildren();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, (io.github.agentsoz.jill.struct.AObject) gPType19);
        gPType19.setName("hi!");
        byte[] byte_array26 = gPType19.getChildren();
        byte[] byte_array27 = gPType19.getChildren();
        byte[] byte_array28 = gPType19.getParents();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType19);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertNull(byte_array22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertNull(byte_array27);
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test174");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        java.lang.String str4 = gPType1.toString();
        gPType1.setName(":-1:-1");
        java.lang.String str7 = gPType1.toString();
        int i8 = gPType1.getId();
        gPType1.addChild((byte) 10);
        byte[] byte_array11 = gPType1.getParents();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ":-1:-1:-1" + "'", str7.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(byte_array11);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test175");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        byte[] byte_array13 = gPType8.getChildren();
        byte[] byte_array14 = gPType8.getParents();
        java.lang.String str15 = gPType8.getName();
        java.lang.String str16 = gPType8.toString();
        byte[] byte_array17 = gPType8.getChildren();
        gPType8.setName("hi!:1:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":-1" + "'", str16.equals(":-1"));
        org.junit.Assert.assertNull(byte_array17);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test176");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array16 = gPType15.getParents();
        gPType15.setName("hi!");
        java.lang.String str19 = gPType15.toString();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType15);
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array23 = gPType22.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array26 = gPType25.getChildren();
        gPType25.addChild((byte) 1);
        java.lang.String str29 = gPType25.getName();
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType22, (io.github.agentsoz.jill.struct.AObject) gPType25);
        int i31 = gPType25.getId();
        gPType25.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType35 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType25, (io.github.agentsoz.jill.struct.AObject) gPType35);
        gPType35.setName("hi!:-1");
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType35);
        gPType15.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test177");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        java.lang.String str20 = gPType16.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, (io.github.agentsoz.jill.struct.AObject) gPType16);
        int i22 = gPType16.getId();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType16);
        gPType11.setId((int) (byte) -1);
        byte[] byte_array26 = gPType11.getParents();
        java.lang.String str27 = gPType11.toString();
        byte[] byte_array28 = gPType11.getChildren();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        gPType1.addChild((byte) -1);
        java.lang.String str32 = gPType1.getName();
        gPType1.addParent((byte) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType36 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array37 = gPType36.getParents();
        byte[] byte_array38 = gPType36.getParents();
        gPType36.setId((int) (short) 100);
        java.lang.String str41 = gPType36.toString();
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType36);
        gPType36.addChild((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + ":-1:-1" + "'", str32.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array37);
        org.junit.Assert.assertNull(byte_array38);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + ":100" + "'", str41.equals(":100"));
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test178");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array13 = gPType1.getChildren();
        int i14 = gPType1.getId();
        int i15 = gPType1.getId();
        gPType1.addChild((byte) -1);
        gPType1.addChild((byte) 10);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i15 == (-1));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test179");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array14 = gPType13.getParents();
        gPType13.setId((int) (short) 10);
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType13);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType1.addChild((byte) 100);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test180");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getChildren();
        gPType14.addChild((byte) 1);
        java.lang.String str18 = gPType14.toString();
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType14);
        byte[] byte_array20 = gPType1.getParents();
        gPType1.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array25 = gPType24.getParents();
        gPType24.setName("hi!");
        gPType24.setName(":-1:-1");
        gPType24.addChild((byte) -1);
        byte[] byte_array32 = gPType24.getParents();
        byte[] byte_array33 = gPType24.getParents();
        gPType24.addParent((byte) -1);
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType24);
        int i37 = gPType24.getId();
        byte[] byte_array38 = gPType24.getParents();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertNull(byte_array32);
        org.junit.Assert.assertNull(byte_array33);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i37 == (-1));
        org.junit.Assert.assertNotNull(byte_array38);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test181");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array6 = gPType5.getParents();
        java.lang.String str7 = gPType5.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array10 = gPType9.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array13 = gPType12.getChildren();
        gPType12.addChild((byte) 1);
        java.lang.String str16 = gPType12.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType9, (io.github.agentsoz.jill.struct.AObject) gPType12);
        int i18 = gPType12.getId();
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType12);
        byte[] byte_array20 = gPType12.getChildren();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType12);
        gPType1.setId((int) ' ');
        int i24 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(byte_array20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 32);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test182");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array13 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array16 = gPType15.getParents();
        gPType15.setName("hi!");
        gPType15.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array23 = gPType22.getParents();
        int i24 = gPType22.getId();
        byte[] byte_array25 = gPType22.getChildren();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType22);
        byte[] byte_array27 = gPType22.getChildren();
        byte[] byte_array28 = gPType22.getParents();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType22);
        gPType1.addChild((byte) 10);
        java.lang.String str32 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue(i24 == (-1));
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(byte_array27);
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + ":-1" + "'", str32.equals(":-1"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test183");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        int i10 = gPType1.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array13 = gPType12.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array16 = gPType15.getChildren();
        gPType15.addChild((byte) 1);
        java.lang.String str19 = gPType15.getName();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, (io.github.agentsoz.jill.struct.AObject) gPType15);
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array23 = gPType22.getParents();
        gPType22.setId((int) (short) 10);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, (io.github.agentsoz.jill.struct.AObject) gPType22);
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType12);
        gPType12.setName("hi!:-1:-1");
        byte[] byte_array30 = gPType12.getParents();
        byte[] byte_array31 = gPType12.getChildren();
        java.lang.String str32 = gPType12.toString();
        gPType12.addChild((byte) 100);
        byte[] byte_array35 = gPType12.getParents();
        byte[] byte_array36 = gPType12.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(byte_array30);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!:-1:-1:-1" + "'", str32.equals("hi!:-1:-1:-1"));
        org.junit.Assert.assertNull(byte_array35);
        org.junit.Assert.assertNotNull(byte_array36);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test184");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setId((int) (byte) 1);
        java.lang.String str7 = gPType1.toString();
        int i8 = gPType1.getId();
        int i9 = gPType1.getId();
        int i10 = gPType1.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array13 = gPType12.getParents();
        java.lang.String str14 = gPType12.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType19 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array20 = gPType19.getChildren();
        gPType19.addChild((byte) 1);
        java.lang.String str23 = gPType19.getName();
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType19);
        int i25 = gPType19.getId();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, (io.github.agentsoz.jill.struct.AObject) gPType19);
        byte[] byte_array27 = gPType19.getChildren();
        java.lang.String str28 = gPType19.getName();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType19);
        int i30 = gPType19.getId();
        gPType19.setName("hi!:-1:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:1" + "'", str7.equals("hi!:1"));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(byte_array27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == (-1));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test185");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        gPType24.addChild((byte) 1);
        java.lang.String str28 = gPType24.toString();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType24);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType24);
        int i31 = gPType1.getId();
        byte[] byte_array32 = gPType1.getChildren();
        gPType1.addChild((byte) -1);
        byte[] byte_array35 = gPType1.getChildren();
        gPType1.addParent((byte) 10);
        gPType1.addParent((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertNotNull(byte_array35);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test186");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        gPType1.setId((int) 'a');
        gPType1.addParent((byte) 0);
        gPType1.addParent((byte) -1);
        int i10 = gPType1.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        int i13 = gPType12.getId();
        java.lang.String str14 = gPType12.getName();
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType12);
        gPType1.setId(1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test187");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType14, (io.github.agentsoz.jill.struct.AObject) gPType16);
        byte[] byte_array18 = gPType16.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType20 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array21 = gPType20.getChildren();
        gPType20.addChild((byte) 1);
        int i24 = gPType20.getId();
        gPType20.addChild((byte) 0);
        gPType20.addParent((byte) 100);
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType20);
        java.lang.String str30 = gPType20.toString();
        gPType20.setName("hi!:-1:-1");
        gPType20.addChild((byte) 1);
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType20);
        int i36 = gPType3.getId();
        java.lang.String str37 = gPType3.toString();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertTrue(i24 == (-1));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + ":-1" + "'", str30.equals(":-1"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + ":-1" + "'", str37.equals(":-1"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test188");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.setId((int) (byte) -1);
        java.lang.String str4 = gPType1.toString();
        gPType1.setId((-1));
        gPType1.addChild((byte) 100);
        gPType1.setId(1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:1:-1" + "'", str4.equals("hi!:1:-1"));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test189");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getChildren();
        byte[] byte_array6 = gPType3.getParents();
        gPType3.setName("hi!:1:0");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array6);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test190");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        gPType24.addChild((byte) 1);
        java.lang.String str28 = gPType24.toString();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType24);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType24);
        int i31 = gPType1.getId();
        byte[] byte_array32 = gPType1.getChildren();
        gPType1.addChild((byte) -1);
        byte[] byte_array35 = gPType1.getChildren();
        gPType1.addParent((byte) 1);
        gPType1.addParent((byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertNotNull(byte_array35);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test191");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        byte[] byte_array4 = gPType1.getChildren();
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) -1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array4);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test192");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        byte[] byte_array4 = gPType1.getChildren();
        java.lang.String str5 = gPType1.toString();
        byte[] byte_array6 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ":-1" + "'", str5.equals(":-1"));
        org.junit.Assert.assertNull(byte_array6);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test193");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.setId((int) (byte) -1);
        gPType1.addChild((byte) 10);
        gPType1.addParent((byte) 100);
        byte[] byte_array8 = gPType1.getChildren();
        org.junit.Assert.assertNotNull(byte_array8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test194");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        gPType7.addChild((byte) 0);
        gPType7.addParent((byte) 100);
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType7);
        java.lang.String str17 = gPType7.toString();
        gPType7.setName("hi!:-1:-1");
        java.lang.String str20 = gPType7.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType22.setId((int) (byte) -1);
        java.lang.String str25 = gPType22.toString();
        gPType22.setName(":-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType29 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType31 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array32 = gPType31.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType34 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array35 = gPType34.getChildren();
        gPType34.addChild((byte) 1);
        java.lang.String str38 = gPType34.getName();
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType31, (io.github.agentsoz.jill.struct.AObject) gPType34);
        int i40 = gPType34.getId();
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType29, (io.github.agentsoz.jill.struct.AObject) gPType34);
        gPType29.setId((int) (byte) -1);
        byte[] byte_array44 = gPType29.getParents();
        gPType29.setId(10);
        boolean b47 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType22, (io.github.agentsoz.jill.struct.AObject) gPType29);
        io.github.agentsoz.jill.struct.GoalPlanType gPType49 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array50 = gPType49.getParents();
        gPType49.setName("hi!");
        java.lang.String str53 = gPType49.toString();
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType29, (io.github.agentsoz.jill.struct.AObject) gPType49);
        gPType29.setName(":100");
        int i57 = gPType29.getId();
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType29);
        gPType7.addParent((byte) 100);
        gPType7.addParent((byte) -1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!:-1:-1:-1" + "'", str20.equals("hi!:-1:-1:-1"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + ":-1" + "'", str25.equals(":-1"));
        org.junit.Assert.assertNull(byte_array32);
        org.junit.Assert.assertNull(byte_array35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == (-1));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(byte_array44);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(byte_array50);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!:-1" + "'", str53.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i57 == 10);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test195");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        gPType1.setId((int) (byte) -1);
        byte[] byte_array16 = gPType1.getParents();
        java.lang.String str17 = gPType1.toString();
        byte[] byte_array18 = gPType1.getChildren();
        gPType1.addParent((byte) 100);
        int i21 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertTrue(i21 == (-1));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test196");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType17);
        java.lang.String str19 = gPType17.getName();
        gPType17.addParent((byte) 1);
        gPType17.addParent((byte) 1);
        gPType17.setId((-1));
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType17);
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) -1);
        byte[] byte_array31 = gPType1.getParents();
        byte[] byte_array32 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(byte_array31);
        org.junit.Assert.assertNotNull(byte_array32);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test197");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        gPType7.addChild((byte) 0);
        gPType7.addParent((byte) 100);
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType7);
        java.lang.String str17 = gPType7.toString();
        gPType7.setId((int) (short) -1);
        java.lang.String str20 = gPType7.getName();
        int i21 = gPType7.getId();
        gPType7.setId(1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array26 = gPType25.getChildren();
        gPType25.addChild((byte) 1);
        java.lang.String str29 = gPType25.getName();
        java.lang.String str30 = gPType25.getName();
        java.lang.String str31 = gPType25.getName();
        byte[] byte_array32 = gPType25.getChildren();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType25);
        gPType25.addChild((byte) 100);
        java.lang.String str36 = gPType25.getName();
        java.lang.String str37 = gPType25.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test198");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        java.lang.String str10 = gPType1.getName();
        gPType1.addParent((byte) 100);
        byte[] byte_array13 = gPType1.getChildren();
        gPType1.addParent((byte) 1);
        java.lang.String str16 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":-1" + "'", str16.equals(":-1"));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test199");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        gPType3.addChild((byte) 100);
        byte[] byte_array10 = gPType3.getChildren();
        byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (int) (byte) 1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test200");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        gPType1.setId((int) '#');
        byte[] byte_array14 = gPType1.getChildren();
        gPType1.addChild((byte) 100);
        gPType1.setId((-1));
        gPType1.addParent((byte) 10);
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array23 = gPType22.getParents();
        gPType22.setName("hi!");
        gPType22.setId((int) (byte) 1);
        java.lang.String str28 = gPType22.toString();
        int i29 = gPType22.getId();
        int i30 = gPType22.getId();
        int i31 = gPType22.getId();
        gPType22.addChild((byte) -1);
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType22);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!:1" + "'", str28.equals("hi!:1"));
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertTrue(i31 == 1);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test201");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        java.lang.String str4 = gPType1.toString();
        gPType1.setName(":-1:-1");
        byte[] byte_array7 = gPType1.getChildren();
        gPType1.setId((int) 'a');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertNull(byte_array7);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test202");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        gPType1.setId((int) '#');
        byte[] byte_array14 = gPType1.getChildren();
        gPType1.addChild((byte) 100);
        gPType1.setId((-1));
        gPType1.setName("hi!:100");
        gPType1.addParent((byte) 0);
        byte[] byte_array23 = gPType1.getParents();
        byte[] byte_array24 = gPType1.getParents();
        byte[] byte_array25 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array23);
        org.junit.Assert.assertNotNull(byte_array24);
        org.junit.Assert.assertNotNull(byte_array25);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test203");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.addParent((byte) 1);
        byte[] byte_array4 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        int i10 = gPType6.getId();
        gPType6.addChild((byte) 0);
        gPType6.addParent((byte) 1);
        gPType6.setName("hi!");
        gPType6.setId((int) '#');
        byte[] byte_array19 = gPType6.getChildren();
        gPType6.addChild((byte) 100);
        gPType6.addChild((byte) -1);
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        gPType6.setName(":52:-1");
        java.lang.String str27 = gPType6.getName();
        int i28 = gPType6.getId();
        gPType6.addChild((byte) 10);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":52:-1" + "'", str27.equals(":52:-1"));
        org.junit.Assert.assertTrue(i28 == 35);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test204");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        java.lang.String str20 = gPType16.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, (io.github.agentsoz.jill.struct.AObject) gPType16);
        int i22 = gPType16.getId();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType16);
        gPType11.setId((int) (byte) -1);
        byte[] byte_array26 = gPType11.getParents();
        java.lang.String str27 = gPType11.toString();
        byte[] byte_array28 = gPType11.getChildren();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        gPType1.addChild((byte) -1);
        java.lang.String str32 = gPType1.getName();
        java.lang.String str33 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + ":-1:-1" + "'", str32.equals(":-1:-1"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + ":-1:-1:-1" + "'", str33.equals(":-1:-1:-1"));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test205");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        int i8 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addChild((byte) 1);
        gPType1.setId(10);
        java.lang.String str15 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test206");
        byte[] byte_array3 = new byte[] { (byte) 1, (byte) 0, (byte) 10 };
        byte[] byte_array5 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array3, 0);
        byte[] byte_array7 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, 10);
        byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array7, (int) (short) 0);
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array7, 1);
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, 0);
        org.junit.Assert.assertNotNull(byte_array3);
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test207");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        java.lang.String str3 = gPType1.toString();
        gPType1.setId(0);
        gPType1.addChild((byte) 10);
        gPType1.addChild((byte) 1);
        gPType1.setName("hi!:-1:-1:-1");
        gPType1.setName("hi!:0");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test208");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        byte[] byte_array6 = gPType1.getParents();
        java.lang.String str7 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ":-1" + "'", str7.equals(":-1"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test209");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":97");
        gPType1.setId(0);
        gPType1.setId((int) (byte) 10);
        gPType1.setName("hi!:-1:100");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test210");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array13 = gPType1.getChildren();
        int i14 = gPType1.getId();
        gPType1.setName("hi!:-1");
        int i17 = gPType1.getId();
        gPType1.setId((int) (short) 1);
        int i20 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i20 == 1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test211");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        java.lang.String str6 = gPType1.toString();
        gPType1.setName("");
        gPType1.addParent((byte) -1);
        java.lang.String str11 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test212");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1:-1:-1:-1");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array5 = gPType4.getParents();
        gPType4.setName("hi!");
        gPType4.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array12 = gPType11.getParents();
        int i13 = gPType11.getId();
        byte[] byte_array14 = gPType11.getChildren();
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType4, (io.github.agentsoz.jill.struct.AObject) gPType11);
        byte[] byte_array16 = gPType11.getChildren();
        byte[] byte_array17 = gPType11.getParents();
        java.lang.String str18 = gPType11.getName();
        java.lang.String str19 = gPType11.toString();
        java.lang.String str20 = gPType11.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test213");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        java.lang.String str20 = gPType16.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, (io.github.agentsoz.jill.struct.AObject) gPType16);
        int i22 = gPType16.getId();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType16);
        gPType11.setId((int) (byte) -1);
        byte[] byte_array26 = gPType11.getParents();
        java.lang.String str27 = gPType11.toString();
        byte[] byte_array28 = gPType11.getChildren();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        gPType11.addParent((byte) 1);
        gPType11.addChild((byte) 10);
        gPType11.addChild((byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test214");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        int i10 = gPType1.getId();
        byte[] byte_array11 = gPType1.getChildren();
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test215");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        java.lang.String str6 = gPType1.toString();
        gPType1.addChild((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType10 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array11 = gPType10.getParents();
        java.lang.String str12 = gPType10.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array18 = gPType17.getChildren();
        gPType17.addChild((byte) 1);
        java.lang.String str21 = gPType17.getName();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType14, (io.github.agentsoz.jill.struct.AObject) gPType17);
        int i23 = gPType17.getId();
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType10, (io.github.agentsoz.jill.struct.AObject) gPType17);
        gPType17.setId(1);
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType17);
        gPType17.addParent((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test216");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        int i3 = gPType1.getId();
        java.lang.String str4 = gPType1.toString();
        gPType1.setId((int) '#');
        java.lang.String str7 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ":35" + "'", str7.equals(":35"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test217");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1:-1:-1");
        byte[] byte_array2 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test218");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":35");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test219");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":52");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        gPType6.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType6, (io.github.agentsoz.jill.struct.AObject) gPType16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        byte[] byte_array19 = gPType6.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType21 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType21, (io.github.agentsoz.jill.struct.AObject) gPType23);
        gPType23.addChild((byte) 0);
        int i27 = gPType23.getId();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType6, (io.github.agentsoz.jill.struct.AObject) gPType23);
        java.lang.String str29 = gPType6.toString();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i27 == (-1));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + ":-1" + "'", str29.equals(":-1"));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test220");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.addParent((byte) 1);
        byte[] byte_array4 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        int i10 = gPType6.getId();
        gPType6.addChild((byte) 0);
        gPType6.addParent((byte) 1);
        gPType6.setName("hi!");
        gPType6.setId((int) '#');
        byte[] byte_array19 = gPType6.getChildren();
        gPType6.addChild((byte) 100);
        gPType6.addChild((byte) -1);
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        gPType6.setName(":52:-1");
        java.lang.String str27 = gPType6.getName();
        byte[] byte_array28 = gPType6.getParents();
        byte[] byte_array29 = gPType6.getChildren();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":52:-1" + "'", str27.equals(":52:-1"));
        org.junit.Assert.assertNotNull(byte_array28);
        org.junit.Assert.assertNotNull(byte_array29);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test221");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        gPType1.addParent((byte) 10);
        byte[] byte_array8 = gPType1.getChildren();
        byte[] byte_array9 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array9);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test222");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setId((int) (byte) 1);
        java.lang.String str7 = gPType1.toString();
        gPType1.setName(":-1");
        byte[] byte_array10 = gPType1.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array18 = gPType17.getChildren();
        gPType17.addChild((byte) 1);
        java.lang.String str21 = gPType17.getName();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType14, (io.github.agentsoz.jill.struct.AObject) gPType17);
        int i23 = gPType17.getId();
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, (io.github.agentsoz.jill.struct.AObject) gPType17);
        io.github.agentsoz.jill.struct.GoalPlanType gPType26 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array27 = gPType26.getParents();
        gPType26.setName("hi!");
        java.lang.String str30 = gPType26.toString();
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, (io.github.agentsoz.jill.struct.AObject) gPType26);
        gPType26.addParent((byte) 1);
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType26);
        java.lang.String str35 = gPType26.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:1" + "'", str7.equals("hi!:1"));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(byte_array27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1" + "'", str30.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!:-1" + "'", str35.equals("hi!:-1"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test223");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array12 = gPType11.getParents();
        gPType11.setId((int) (short) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        gPType11.setName("");
        int i18 = gPType11.getId();
        gPType11.setId((int) (short) 10);
        byte[] byte_array21 = gPType11.getParents();
        int i22 = gPType11.getId();
        gPType11.setName("");
        java.lang.String str25 = gPType11.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 10);
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertTrue(i22 == 10);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + ":10" + "'", str25.equals(":10"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test224");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        gPType1.addParent((byte) -1);
        gPType1.addParent((byte) 100);
        gPType1.addChild((byte) 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test225");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        gPType3.addParent((byte) 1);
        java.lang.String str8 = gPType3.toString();
        gPType3.addChild((byte) -1);
        gPType3.setName(":-1:-1:-1:-1:-1");
        java.lang.String str13 = gPType3.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ":-1" + "'", str8.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ":-1:-1:-1:-1:-1" + "'", str13.equals(":-1:-1:-1:-1:-1"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test226");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) 0);
        byte[] byte_array6 = gPType1.getChildren();
        gPType1.addChild((byte) 10);
        java.lang.String str9 = gPType1.toString();
        gPType1.addParent((byte) 100);
        java.lang.String str12 = gPType1.getName();
        byte[] byte_array13 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1:-1" + "'", str9.equals("hi!:1:-1"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test227");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        byte[] byte_array4 = gPType1.getChildren();
        gPType1.setName(":-1:-1:-1:-1:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array4);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test228");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        java.lang.String str2 = gPType1.toString();
        gPType1.addParent((byte) 0);
        gPType1.setId((int) '#');
        java.lang.String str7 = gPType1.getName();
        java.lang.String str8 = gPType1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ":-1" + "'", str2.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ":35" + "'", str8.equals(":35"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test229");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.addParent((byte) 100);
        int i10 = gPType1.getId();
        gPType1.addParent((byte) 0);
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType19 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array20 = gPType19.getChildren();
        gPType19.addChild((byte) 1);
        java.lang.String str23 = gPType19.getName();
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType19);
        int i25 = gPType19.getId();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType14, (io.github.agentsoz.jill.struct.AObject) gPType19);
        gPType14.setId((int) (byte) -1);
        byte[] byte_array29 = gPType14.getParents();
        java.lang.String str30 = gPType14.toString();
        byte[] byte_array31 = gPType14.getChildren();
        gPType14.addParent((byte) 100);
        byte[] byte_array34 = gPType14.getParents();
        gPType14.addChild((byte) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType38 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array39 = gPType38.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType41 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array42 = gPType41.getChildren();
        gPType41.addChild((byte) 1);
        java.lang.String str45 = gPType41.getName();
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType38, (io.github.agentsoz.jill.struct.AObject) gPType41);
        int i47 = gPType41.getId();
        gPType41.addChild((byte) -1);
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType14, (io.github.agentsoz.jill.struct.AObject) gPType41);
        java.lang.String str51 = gPType41.toString();
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType41);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + ":-1" + "'", str30.equals(":-1"));
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertNotNull(byte_array34);
        org.junit.Assert.assertNull(byte_array39);
        org.junit.Assert.assertNull(byte_array42);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i47 == (-1));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + ":-1" + "'", str51.equals(":-1"));
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test230");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        gPType1.setId((int) '#');
        byte[] byte_array14 = gPType1.getChildren();
        gPType1.addChild((byte) 100);
        gPType1.setId((-1));
        gPType1.setName("hi!:100");
        gPType1.setId(35);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test231");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        gPType1.addParent((byte) -1);
        gPType1.addChild((byte) 100);
        byte[] byte_array6 = gPType1.getParents();
        java.lang.String str7 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType9.addParent((byte) 1);
        byte[] byte_array12 = gPType9.getChildren();
        gPType9.setName("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType19 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array20 = gPType19.getChildren();
        gPType19.addChild((byte) 1);
        java.lang.String str23 = gPType19.getName();
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType19);
        int i25 = gPType19.getId();
        gPType19.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType29 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType19, (io.github.agentsoz.jill.struct.AObject) gPType29);
        gPType29.addChild((byte) 0);
        byte[] byte_array33 = gPType29.getChildren();
        byte[] byte_array34 = gPType29.getParents();
        byte[] byte_array35 = gPType29.getChildren();
        gPType29.setId(10);
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType9, (io.github.agentsoz.jill.struct.AObject) gPType29);
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType29);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:-1" + "'", str7.equals("hi!:-1"));
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(byte_array33);
        org.junit.Assert.assertNull(byte_array34);
        org.junit.Assert.assertNotNull(byte_array35);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test232");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) -1);
        byte[] byte_array6 = gPType1.getChildren();
        gPType1.setId((int) (byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType10 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType10.addParent((byte) 1);
        byte[] byte_array13 = gPType10.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array16 = gPType15.getChildren();
        gPType15.addChild((byte) 1);
        int i19 = gPType15.getId();
        gPType15.addChild((byte) 0);
        gPType15.addParent((byte) 1);
        gPType15.setName("hi!");
        gPType15.setId((int) '#');
        byte[] byte_array28 = gPType15.getChildren();
        gPType15.addChild((byte) 100);
        gPType15.addChild((byte) -1);
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType10, (io.github.agentsoz.jill.struct.AObject) gPType15);
        int i34 = gPType10.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType36 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array37 = gPType36.getParents();
        gPType36.setName("hi!");
        gPType36.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType43 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array44 = gPType43.getParents();
        int i45 = gPType43.getId();
        byte[] byte_array46 = gPType43.getChildren();
        boolean b47 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType36, (io.github.agentsoz.jill.struct.AObject) gPType43);
        byte[] byte_array48 = gPType43.getChildren();
        byte[] byte_array49 = gPType43.getParents();
        java.lang.String str50 = gPType43.getName();
        int i51 = gPType43.getId();
        byte[] byte_array52 = gPType43.getChildren();
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType10, (io.github.agentsoz.jill.struct.AObject) gPType43);
        gPType43.setName("hi!:-1:-1:-1");
        boolean b56 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType43);
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertNotNull(byte_array28);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertNull(byte_array37);
        org.junit.Assert.assertNull(byte_array44);
        org.junit.Assert.assertTrue(i45 == (-1));
        org.junit.Assert.assertNull(byte_array46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(byte_array48);
        org.junit.Assert.assertNull(byte_array49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        org.junit.Assert.assertTrue(i51 == (-1));
        org.junit.Assert.assertNull(byte_array52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test233");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        byte[] byte_array12 = gPType1.getParents();
        byte[] byte_array14 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array12, (int) (short) 10);
        byte[] byte_array16 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array14, (int) (short) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test234");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType1.addChild((byte) -1);
        int i15 = gPType1.getId();
        gPType1.addParent((byte) 100);
        gPType1.addParent((byte) 100);
        gPType1.addChild((byte) 10);
        gPType1.setName(":100:10");
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i15 == (-1));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test235");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType1.setName(":100:-1");
        gPType1.addParent((byte) 1);
        gPType1.addChild((byte) 1);
        int i11 = gPType1.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i11 == (-1));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test236");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType3.setName("hi!:1");
        byte[] byte_array15 = gPType3.getParents();
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array15, 1);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array17);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test237");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType4, (io.github.agentsoz.jill.struct.AObject) gPType14);
        java.lang.String str16 = gPType4.getName();
        gPType4.addParent((byte) -1);
        int i19 = gPType4.getId();
        gPType4.addChild((byte) 0);
        gPType4.setId(0);
        gPType4.addParent((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(i19 == (-1));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test238");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.setName("");
        gPType4.addParent((byte) 100);
        gPType4.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test239");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        java.lang.String str8 = gPType3.getName();
        int i9 = gPType3.getId();
        gPType3.setName("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array26 = gPType25.getChildren();
        gPType25.addChild((byte) 1);
        int i29 = gPType25.getId();
        gPType25.addChild((byte) 0);
        gPType25.addParent((byte) 1);
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType23, (io.github.agentsoz.jill.struct.AObject) gPType25);
        io.github.agentsoz.jill.struct.GoalPlanType gPType36 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array37 = gPType36.getChildren();
        gPType36.addChild((byte) 1);
        java.lang.String str40 = gPType36.toString();
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType23, (io.github.agentsoz.jill.struct.AObject) gPType36);
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, (io.github.agentsoz.jill.struct.AObject) gPType36);
        int i43 = gPType13.getId();
        byte[] byte_array44 = gPType13.getChildren();
        gPType13.addChild((byte) -1);
        byte[] byte_array47 = gPType13.getChildren();
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType13);
        gPType3.addParent((byte) 0);
        gPType3.setName(":97");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:-1" + "'", str8.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(byte_array37);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + ":-1" + "'", str40.equals(":-1"));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == (-1));
        org.junit.Assert.assertNotNull(byte_array44);
        org.junit.Assert.assertNotNull(byte_array47);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test240");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType4, (io.github.agentsoz.jill.struct.AObject) gPType14);
        gPType14.addChild((byte) 0);
        gPType14.setId((int) (byte) 1);
        byte[] byte_array20 = gPType14.getChildren();
        byte[] byte_array22 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array20, 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(byte_array20);
        org.junit.Assert.assertNotNull(byte_array22);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test241");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        gPType1.setId((int) (byte) -1);
        gPType1.setName("hi!:-1");
        byte[] byte_array18 = gPType1.getChildren();
        gPType1.setName(":-1:-1:-1:-1:10");
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array23 = gPType22.getParents();
        java.lang.String str24 = gPType22.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType26 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array27 = gPType26.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType29 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array30 = gPType29.getChildren();
        gPType29.addChild((byte) 1);
        java.lang.String str33 = gPType29.getName();
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType26, (io.github.agentsoz.jill.struct.AObject) gPType29);
        int i35 = gPType29.getId();
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType22, (io.github.agentsoz.jill.struct.AObject) gPType29);
        java.lang.String str37 = gPType29.toString();
        gPType29.addParent((byte) 1);
        gPType29.setId((int) (byte) -1);
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType29);
        byte[] byte_array43 = gPType1.getParents();
        byte[] byte_array44 = gPType1.getChildren();
        gPType1.setId(10);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNull(byte_array27);
        org.junit.Assert.assertNull(byte_array30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i35 == (-1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + ":-1" + "'", str37.equals(":-1"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(byte_array43);
        org.junit.Assert.assertNull(byte_array44);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test242");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        gPType24.addChild((byte) 1);
        java.lang.String str28 = gPType24.toString();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType24);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType24);
        int i31 = gPType1.getId();
        byte[] byte_array32 = gPType1.getChildren();
        byte[] byte_array33 = gPType1.getChildren();
        gPType1.setId(10);
        gPType1.addChild((byte) 100);
        java.lang.String str38 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertNotNull(byte_array33);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test243");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array6 = gPType5.getParents();
        java.lang.String str7 = gPType5.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array10 = gPType9.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array13 = gPType12.getChildren();
        gPType12.addChild((byte) 1);
        java.lang.String str16 = gPType12.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType9, (io.github.agentsoz.jill.struct.AObject) gPType12);
        int i18 = gPType12.getId();
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType12);
        byte[] byte_array20 = gPType12.getChildren();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType12);
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array24 = gPType23.getChildren();
        byte[] byte_array25 = gPType23.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType27 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array28 = gPType27.getParents();
        java.lang.String str29 = gPType27.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType31 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array32 = gPType31.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType34 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array35 = gPType34.getChildren();
        gPType34.addChild((byte) 1);
        java.lang.String str38 = gPType34.getName();
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType31, (io.github.agentsoz.jill.struct.AObject) gPType34);
        int i40 = gPType34.getId();
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType27, (io.github.agentsoz.jill.struct.AObject) gPType34);
        byte[] byte_array42 = gPType34.getChildren();
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType23, (io.github.agentsoz.jill.struct.AObject) gPType34);
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, (io.github.agentsoz.jill.struct.AObject) gPType23);
        java.lang.String str45 = gPType23.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType47 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array48 = gPType47.getParents();
        gPType47.setName("hi!");
        gPType47.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType54 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array55 = gPType54.getParents();
        int i56 = gPType54.getId();
        byte[] byte_array57 = gPType54.getChildren();
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType47, (io.github.agentsoz.jill.struct.AObject) gPType54);
        int i59 = gPType54.getId();
        int i60 = gPType54.getId();
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType23, (io.github.agentsoz.jill.struct.AObject) gPType54);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(byte_array20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        org.junit.Assert.assertNull(byte_array32);
        org.junit.Assert.assertNull(byte_array35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == (-1));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(byte_array42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertNull(byte_array48);
        org.junit.Assert.assertNull(byte_array55);
        org.junit.Assert.assertTrue(i56 == (-1));
        org.junit.Assert.assertNull(byte_array57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i59 == (-1));
        org.junit.Assert.assertTrue(i60 == (-1));
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test244");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        gPType1.setId((int) (short) 0);
        gPType1.addParent((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test245");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        gPType1.addParent((byte) -1);
        java.lang.String str10 = gPType1.toString();
        byte[] byte_array11 = gPType1.getParents();
        byte[] byte_array12 = gPType1.getParents();
        gPType1.setName(":0");
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType18 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType18);
        byte[] byte_array20 = gPType18.getParents();
        gPType18.setName("hi!:-1");
        int i23 = gPType18.getId();
        byte[] byte_array24 = gPType18.getChildren();
        int i25 = gPType18.getId();
        gPType18.setName(":-1:-1:-1:-1");
        java.lang.String str28 = gPType18.getName();
        gPType18.setId((int) (short) 10);
        java.lang.String str31 = gPType18.toString();
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType18);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ":-1" + "'", str10.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1:-1:-1:-1" + "'", str28.equals(":-1:-1:-1:-1"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + ":-1:-1:-1:-1:10" + "'", str31.equals(":-1:-1:-1:-1:10"));
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test246");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        gPType1.setName("");
        gPType1.addChild((byte) 10);
        java.lang.String str8 = gPType1.getName();
        java.lang.String str9 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        java.lang.String str23 = gPType11.toString();
        byte[] byte_array24 = gPType11.getParents();
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        byte[] byte_array26 = gPType1.getChildren();
        byte[] byte_array28 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array26, (int) (byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ":-1:-1" + "'", str23.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(byte_array26);
        org.junit.Assert.assertNotNull(byte_array28);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test247");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        byte[] byte_array11 = gPType1.getChildren();
        int i12 = gPType1.getId();
        java.lang.String str13 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ":-1:-1:-1" + "'", str13.equals(":-1:-1:-1"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test248");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType1.addChild((byte) 100);
        java.lang.String str7 = gPType1.toString();
        java.lang.String str8 = gPType1.getName();
        byte[] byte_array9 = gPType1.getParents();
        int i10 = gPType1.getId();
        gPType1.setName(":-1:-1:-1:-1:-1");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:-1" + "'", str7.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test249");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        byte[] byte_array10 = gPType1.getParents();
        java.lang.String str11 = gPType1.toString();
        gPType1.addParent((byte) 100);
        gPType1.addParent((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1:-1:-1" + "'", str11.equals(":-1:-1:-1"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test250");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        java.lang.String str3 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array6 = gPType5.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getChildren();
        gPType8.addChild((byte) 1);
        java.lang.String str12 = gPType8.getName();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType8);
        int i14 = gPType8.getId();
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType8.setId(1);
        gPType8.setId((int) (short) 100);
        java.lang.String str20 = gPType8.toString();
        java.lang.String str21 = gPType8.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array24 = gPType23.getParents();
        int i25 = gPType23.getId();
        gPType23.setName("");
        gPType23.addChild((byte) 10);
        java.lang.String str30 = gPType23.getName();
        java.lang.String str31 = gPType23.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType33 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType35 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array36 = gPType35.getChildren();
        gPType35.addChild((byte) 1);
        int i39 = gPType35.getId();
        gPType35.addChild((byte) 0);
        gPType35.addParent((byte) 1);
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType33, (io.github.agentsoz.jill.struct.AObject) gPType35);
        java.lang.String str45 = gPType33.toString();
        byte[] byte_array46 = gPType33.getParents();
        boolean b47 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType23, (io.github.agentsoz.jill.struct.AObject) gPType33);
        byte[] byte_array48 = gPType23.getParents();
        gPType23.addChild((byte) 0);
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType23);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + ":100" + "'", str20.equals(":100"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertNull(byte_array36);
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + ":-1:-1" + "'", str45.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(byte_array48);
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test251");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        int i10 = gPType1.getId();
        byte[] byte_array11 = gPType1.getParents();
        java.lang.String str12 = gPType1.toString();
        gPType1.setName(":-1:1");
        byte[] byte_array15 = gPType1.getParents();
        java.lang.String str16 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1" + "'", str12.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":-1:1" + "'", str16.equals(":-1:1"));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test252");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        gPType7.addChild((byte) 0);
        gPType7.addParent((byte) 100);
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType7);
        java.lang.String str17 = gPType7.toString();
        gPType7.setName("hi!:-1:-1");
        java.lang.String str20 = gPType7.getName();
        java.lang.String str21 = gPType7.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType23, (io.github.agentsoz.jill.struct.AObject) gPType25);
        byte[] byte_array27 = gPType23.getChildren();
        byte[] byte_array28 = gPType23.getChildren();
        gPType23.setId((int) (short) 1);
        java.lang.String str31 = gPType23.getName();
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType23);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!:-1:-1" + "'", str20.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!:-1:-1" + "'", str21.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(byte_array27);
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test253");
        byte[] byte_array2 = new byte[] { (byte) 100, (byte) 0 };
        byte[] byte_array4 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, 1);
        byte[] byte_array6 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array4, (int) ' ');
        byte[] byte_array8 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array4, 0);
        byte[] byte_array10 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array8, (int) 'a');
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array4);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array10);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test254");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        java.lang.String str3 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType7);
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType7);
        byte[] byte_array10 = gPType1.getParents();
        gPType1.setId(10);
        byte[] byte_array13 = gPType1.getChildren();
        gPType1.addChild((byte) 10);
        int i16 = gPType1.getId();
        int i17 = gPType1.getId();
        gPType1.addChild((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue(i16 == 10);
        org.junit.Assert.assertTrue(i17 == 10);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test255");
        byte[] byte_array3 = new byte[] { (byte) 1, (byte) 0, (byte) 10 };
        byte[] byte_array5 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array3, 0);
        byte[] byte_array7 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array3, (int) ' ');
        byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array7, (int) (short) 1);
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, 1);
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, (int) (short) 1);
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, 10);
        org.junit.Assert.assertNotNull(byte_array3);
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test256");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        byte[] byte_array10 = gPType4.getChildren();
        gPType4.setId((int) '#');
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType19 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array20 = gPType19.getChildren();
        gPType19.addChild((byte) 1);
        java.lang.String str23 = gPType19.getName();
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType19);
        io.github.agentsoz.jill.struct.GoalPlanType gPType26 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array27 = gPType26.getParents();
        gPType26.setId((int) (short) 10);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType26);
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType14, (io.github.agentsoz.jill.struct.AObject) gPType16);
        gPType14.addParent((byte) 10);
        gPType14.addParent((byte) 1);
        int i36 = gPType14.getId();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType4, (io.github.agentsoz.jill.struct.AObject) gPType14);
        java.lang.String str38 = gPType14.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType40 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array41 = gPType40.getParents();
        gPType40.setName("hi!");
        gPType40.setName(":-1:-1");
        gPType40.addChild((byte) -1);
        gPType40.addParent((byte) 1);
        byte[] byte_array50 = gPType40.getParents();
        gPType40.addParent((byte) 1);
        gPType40.addChild((byte) 100);
        byte[] byte_array55 = gPType40.getChildren();
        gPType40.setName(":52");
        java.lang.String str58 = gPType40.getName();
        boolean b59 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType14, (io.github.agentsoz.jill.struct.AObject) gPType40);
        int i60 = gPType40.getId();
        byte[] byte_array61 = gPType40.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(byte_array27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!:-1:-1" + "'", str38.equals("hi!:-1:-1"));
        org.junit.Assert.assertNull(byte_array41);
        org.junit.Assert.assertNotNull(byte_array50);
        org.junit.Assert.assertNotNull(byte_array55);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + ":52" + "'", str58.equals(":52"));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i60 == (-1));
        org.junit.Assert.assertNotNull(byte_array61);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test257");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1:-1");
        gPType1.setId((-1));
        byte[] byte_array4 = gPType1.getChildren();
        gPType1.addParent((byte) -1);
        gPType1.addParent((byte) 100);
        org.junit.Assert.assertNull(byte_array4);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test258");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        int i4 = gPType1.getId();
        java.lang.String str5 = gPType1.getName();
        byte[] byte_array6 = gPType1.getChildren();
        byte[] byte_array7 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array7);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test259");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":52");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        gPType6.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType6, (io.github.agentsoz.jill.struct.AObject) gPType16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        byte[] byte_array19 = gPType6.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType21 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType21, (io.github.agentsoz.jill.struct.AObject) gPType23);
        gPType23.addChild((byte) 0);
        int i27 = gPType23.getId();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType6, (io.github.agentsoz.jill.struct.AObject) gPType23);
        gPType6.setName(":-1:-1:-1:-1:10");
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i27 == (-1));
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test260");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        java.lang.String str5 = gPType1.toString();
        java.lang.String str6 = gPType1.toString();
        gPType1.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test261");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getChildren();
        gPType14.addChild((byte) 1);
        java.lang.String str18 = gPType14.toString();
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType14);
        java.lang.String str20 = gPType1.getName();
        gPType1.setName(":52");
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + ":-1" + "'", str20.equals(":-1"));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test262");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        java.lang.String str5 = gPType1.toString();
        byte[] byte_array6 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
        org.junit.Assert.assertNull(byte_array6);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test263");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        byte[] byte_array13 = gPType8.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array16 = gPType15.getParents();
        java.lang.String str17 = gPType15.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType19 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array20 = gPType19.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array23 = gPType22.getChildren();
        gPType22.addChild((byte) 1);
        java.lang.String str26 = gPType22.getName();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType19, (io.github.agentsoz.jill.struct.AObject) gPType22);
        int i28 = gPType22.getId();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType22);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType15);
        byte[] byte_array31 = gPType8.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == (-1));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(byte_array31);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test264");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getChildren();
        gPType14.addChild((byte) 1);
        java.lang.String str18 = gPType14.toString();
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType14);
        gPType1.setName("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array24 = gPType23.getParents();
        int i25 = gPType23.getId();
        gPType23.addChild((byte) -1);
        gPType23.setName(":52:-1");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType23);
        io.github.agentsoz.jill.struct.GoalPlanType gPType32 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType32.setId((int) (byte) -1);
        gPType32.addParent((byte) 10);
        int i37 = gPType32.getId();
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType32);
        byte[] byte_array39 = gPType32.getParents();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i37 == (-1));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(byte_array39);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test265");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        java.lang.String str4 = gPType1.toString();
        gPType1.setName(":-1:-1");
        gPType1.setName(":-1:-1:-1");
        gPType1.addChild((byte) 100);
        gPType1.setName(":-1:-1:-1:-1:10");
        java.lang.String str13 = gPType1.getName();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ":-1:-1:-1:-1:10" + "'", str13.equals(":-1:-1:-1:-1:10"));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test266");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getParents();
        int i16 = gPType14.getId();
        byte[] byte_array17 = gPType14.getChildren();
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType14);
        java.lang.String str19 = gPType8.toString();
        gPType8.setId((int) (short) 100);
        gPType8.setId((int) (byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test267");
        io.github.agentsoz.jill.struct.AObject aObject0 = null;
        io.github.agentsoz.jill.struct.GoalPlanType gPType2 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array3 = gPType2.getChildren();
        gPType2.addChild((byte) 1);
        int i6 = gPType2.getId();
        gPType2.addChild((byte) 0);
        gPType2.setId((int) (short) -1);
        byte[] byte_array11 = gPType2.getChildren();
        try {
            boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject0, (io.github.agentsoz.jill.struct.AObject) gPType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test268");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        int i8 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addChild((byte) 1);
        gPType1.setName(":-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array17 = gPType16.getParents();
        gPType16.setName("hi!");
        gPType16.setName(":-1:-1");
        gPType16.addChild((byte) -1);
        byte[] byte_array24 = gPType16.getParents();
        gPType16.addParent((byte) -1);
        byte[] byte_array27 = gPType16.getParents();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType16);
        byte[] byte_array29 = gPType16.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertNotNull(byte_array27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(byte_array29);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test269");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        java.lang.String str4 = gPType1.toString();
        gPType1.setName(":-1:-1");
        java.lang.String str7 = gPType1.toString();
        int i8 = gPType1.getId();
        gPType1.addChild((byte) 10);
        java.lang.String str11 = gPType1.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ":-1:-1:-1" + "'", str7.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1:-1:-1" + "'", str11.equals(":-1:-1:-1"));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test270");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        int i8 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addChild((byte) 1);
        gPType1.setName(":-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        java.lang.String str20 = gPType16.getName();
        java.lang.String str21 = gPType16.getName();
        int i22 = gPType16.getId();
        gPType16.setName(":-1:-1");
        byte[] byte_array25 = gPType16.getParents();
        gPType16.addChild((byte) 1);
        gPType16.addParent((byte) 10);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType16);
        gPType16.setName(":100:-1");
        int i33 = gPType16.getId();
        java.lang.String str34 = gPType16.getName();
        gPType16.addChild((byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(i33 == (-1));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + ":100:-1" + "'", str34.equals(":100:-1"));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test271");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        java.lang.String str4 = gPType1.toString();
        int i5 = gPType1.getId();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.toString();
        gPType1.addChild((byte) 0);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        byte[] byte_array23 = gPType11.getChildren();
        int i24 = gPType11.getId();
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        int i26 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ":-1" + "'", str7.equals(":-1"));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue(i24 == (-1));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == (-1));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test272");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str13 = gPType3.toString();
        gPType3.addParent((byte) 100);
        java.lang.String str16 = gPType3.getName();
        byte[] byte_array17 = gPType3.getChildren();
        gPType3.setId((int) (byte) 1);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ":-1" + "'", str13.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(byte_array17);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test273");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        java.lang.String str4 = gPType1.toString();
        gPType1.setName(":-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType10 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array11 = gPType10.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        java.lang.String str17 = gPType13.getName();
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType10, (io.github.agentsoz.jill.struct.AObject) gPType13);
        int i19 = gPType13.getId();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType13);
        gPType8.setId((int) (byte) -1);
        byte[] byte_array23 = gPType8.getParents();
        gPType8.setId(10);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        io.github.agentsoz.jill.struct.GoalPlanType gPType28 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array29 = gPType28.getParents();
        gPType28.setName("hi!");
        java.lang.String str32 = gPType28.toString();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType28);
        gPType8.setId(97);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!:-1" + "'", str32.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test274");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.addChild((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array6 = gPType5.getParents();
        java.lang.String str7 = gPType5.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array10 = gPType9.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array13 = gPType12.getChildren();
        gPType12.addChild((byte) 1);
        java.lang.String str16 = gPType12.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType9, (io.github.agentsoz.jill.struct.AObject) gPType12);
        int i18 = gPType12.getId();
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType12);
        gPType5.setName("hi!:1");
        byte[] byte_array22 = gPType5.getParents();
        gPType5.addChild((byte) 1);
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType5);
        io.github.agentsoz.jill.struct.GoalPlanType gPType27 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array28 = gPType27.getChildren();
        gPType27.addChild((byte) 1);
        java.lang.String str31 = gPType27.getName();
        java.lang.String str32 = gPType27.getName();
        java.lang.String str33 = gPType27.getName();
        int i34 = gPType27.getId();
        byte[] byte_array35 = gPType27.getChildren();
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType27);
        java.lang.String str37 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType39 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array40 = gPType39.getParents();
        gPType39.setName("hi!");
        gPType39.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType46 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array47 = gPType46.getParents();
        int i48 = gPType46.getId();
        byte[] byte_array49 = gPType46.getChildren();
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType39, (io.github.agentsoz.jill.struct.AObject) gPType46);
        io.github.agentsoz.jill.struct.GoalPlanType gPType52 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array53 = gPType52.getParents();
        int i54 = gPType52.getId();
        byte[] byte_array55 = gPType52.getChildren();
        boolean b56 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType46, (io.github.agentsoz.jill.struct.AObject) gPType52);
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType52);
        java.lang.String str58 = gPType52.getName();
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(byte_array22);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertNotNull(byte_array35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!:1:-1" + "'", str37.equals("hi!:1:-1"));
        org.junit.Assert.assertNull(byte_array40);
        org.junit.Assert.assertNull(byte_array47);
        org.junit.Assert.assertTrue(i48 == (-1));
        org.junit.Assert.assertNull(byte_array49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(byte_array53);
        org.junit.Assert.assertTrue(i54 == (-1));
        org.junit.Assert.assertNull(byte_array55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test275");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.setId((-1));
        byte[] byte_array13 = gPType4.getChildren();
        gPType4.addChild((byte) 10);
        byte[] byte_array16 = gPType4.getChildren();
        byte[] byte_array17 = gPType4.getParents();
        gPType4.addParent((byte) 1);
        java.lang.String str20 = gPType4.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + ":-1" + "'", str20.equals(":-1"));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test276");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array13 = gPType1.getChildren();
        int i14 = gPType1.getId();
        gPType1.setName("hi!:-1");
        int i17 = gPType1.getId();
        java.lang.String str18 = gPType1.getName();
        byte[] byte_array19 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!:-1" + "'", str18.equals("hi!:-1"));
        org.junit.Assert.assertNull(byte_array19);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test277");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        byte[] byte_array11 = gPType1.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType13.addParent((byte) 1);
        byte[] byte_array16 = gPType13.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType18 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array19 = gPType18.getChildren();
        gPType18.addChild((byte) 1);
        int i22 = gPType18.getId();
        gPType18.addChild((byte) 0);
        gPType18.addParent((byte) 1);
        gPType18.setName("hi!");
        gPType18.setId((int) '#');
        byte[] byte_array31 = gPType18.getChildren();
        gPType18.addChild((byte) 100);
        gPType18.addChild((byte) -1);
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, (io.github.agentsoz.jill.struct.AObject) gPType18);
        gPType18.setName(":52:-1");
        java.lang.String str39 = gPType18.getName();
        int i40 = gPType18.getId();
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType18);
        java.lang.String str42 = gPType1.getName();
        gPType1.addParent((byte) 10);
        io.github.agentsoz.jill.struct.GoalPlanType gPType46 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array47 = gPType46.getParents();
        gPType46.setName("hi!");
        gPType46.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType53 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array54 = gPType53.getParents();
        int i55 = gPType53.getId();
        byte[] byte_array56 = gPType53.getChildren();
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType46, (io.github.agentsoz.jill.struct.AObject) gPType53);
        io.github.agentsoz.jill.struct.GoalPlanType gPType59 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array60 = gPType59.getParents();
        int i61 = gPType59.getId();
        byte[] byte_array62 = gPType59.getChildren();
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType53, (io.github.agentsoz.jill.struct.AObject) gPType59);
        java.lang.String str64 = gPType53.toString();
        gPType53.setName(":100:-1:-1");
        boolean b67 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType53);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertNotNull(byte_array31);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + ":52:-1" + "'", str39.equals(":52:-1"));
        org.junit.Assert.assertTrue(i40 == 35);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + ":-1:-1" + "'", str42.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array47);
        org.junit.Assert.assertNull(byte_array54);
        org.junit.Assert.assertTrue(i55 == (-1));
        org.junit.Assert.assertNull(byte_array56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(byte_array60);
        org.junit.Assert.assertTrue(i61 == (-1));
        org.junit.Assert.assertNull(byte_array62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + ":-1" + "'", str64.equals(":-1"));
        org.junit.Assert.assertTrue(b67 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test278");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        java.lang.String str3 = gPType1.toString();
        java.lang.String str4 = gPType1.toString();
        gPType1.setName(":52");
        gPType1.setName(":-1");
        gPType1.addParent((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test279");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        gPType24.addChild((byte) 1);
        java.lang.String str28 = gPType24.toString();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType24);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType24);
        gPType24.setName(":-1:-1:-1");
        java.lang.String str33 = gPType24.getName();
        byte[] byte_array34 = gPType24.getChildren();
        byte[] byte_array35 = gPType24.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType37 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType39 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType37, (io.github.agentsoz.jill.struct.AObject) gPType39);
        byte[] byte_array41 = gPType39.getParents();
        gPType39.setName("hi!:-1");
        java.lang.String str44 = gPType39.getName();
        gPType39.addParent((byte) -1);
        java.lang.String str47 = gPType39.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType49 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType51 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array52 = gPType51.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType54 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array55 = gPType54.getChildren();
        gPType54.addChild((byte) 1);
        java.lang.String str58 = gPType54.getName();
        boolean b59 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType51, (io.github.agentsoz.jill.struct.AObject) gPType54);
        int i60 = gPType54.getId();
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType49, (io.github.agentsoz.jill.struct.AObject) gPType54);
        gPType49.setId((int) (byte) -1);
        java.lang.String str64 = gPType49.getName();
        boolean b65 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType39, (io.github.agentsoz.jill.struct.AObject) gPType49);
        boolean b66 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType24, (io.github.agentsoz.jill.struct.AObject) gPType39);
        java.lang.String str67 = gPType39.getName();
        java.lang.String str68 = gPType39.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + ":-1:-1:-1" + "'", str33.equals(":-1:-1:-1"));
        org.junit.Assert.assertNotNull(byte_array34);
        org.junit.Assert.assertNotNull(byte_array35);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(byte_array41);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!:-1" + "'", str44.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!:-1" + "'", str47.equals("hi!:-1"));
        org.junit.Assert.assertNull(byte_array52);
        org.junit.Assert.assertNull(byte_array55);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i60 == (-1));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "hi!:-1" + "'", str67.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "hi!:-1" + "'", str68.equals("hi!:-1"));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test280");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        int i8 = gPType3.getId();
        byte[] byte_array9 = gPType3.getChildren();
        java.lang.String str10 = gPType3.getName();
        gPType3.addParent((byte) 10);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test281");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        int i13 = gPType8.getId();
        java.lang.String str14 = gPType8.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test282");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        gPType24.addChild((byte) 1);
        java.lang.String str28 = gPType24.toString();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType24);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType24);
        int i31 = gPType1.getId();
        byte[] byte_array32 = gPType1.getChildren();
        byte[] byte_array33 = gPType1.getChildren();
        gPType1.setId(10);
        gPType1.addChild((byte) 100);
        gPType1.setName("hi!:35:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertNotNull(byte_array33);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test283");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array16 = gPType15.getParents();
        gPType15.setName("hi!");
        java.lang.String str19 = gPType15.toString();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType15);
        gPType1.addParent((byte) 1);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test284");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        gPType1.setId((int) 'a');
        gPType1.addParent((byte) 0);
        gPType1.setId((int) (byte) 10);
        gPType1.addChild((byte) 100);
        byte[] byte_array12 = gPType1.getChildren();
        byte[] byte_array13 = gPType1.getParents();
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, 52);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test285");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        byte[] byte_array7 = gPType1.getChildren();
        int i8 = gPType1.getId();
        byte[] byte_array9 = gPType1.getChildren();
        byte[] byte_array10 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array10);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test286");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        gPType3.addChild((byte) 100);
        byte[] byte_array10 = gPType3.getChildren();
        byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, 35);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test287");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.addParent((byte) 1);
        byte[] byte_array4 = gPType1.getChildren();
        gPType1.setName(":-1:1");
        org.junit.Assert.assertNull(byte_array4);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test288");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getParents();
        int i16 = gPType14.getId();
        byte[] byte_array17 = gPType14.getChildren();
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType14);
        gPType14.addParent((byte) 0);
        byte[] byte_array21 = gPType14.getChildren();
        gPType14.setId(0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(byte_array21);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test289");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        gPType24.addChild((byte) 1);
        java.lang.String str28 = gPType24.toString();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType24);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType24);
        byte[] byte_array31 = gPType1.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType33 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        gPType33.addParent((byte) -1);
        byte[] byte_array36 = gPType33.getParents();
        byte[] byte_array37 = gPType33.getParents();
        byte[] byte_array38 = gPType33.getParents();
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType33);
        byte[] byte_array40 = gPType33.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(byte_array31);
        org.junit.Assert.assertNotNull(byte_array36);
        org.junit.Assert.assertNotNull(byte_array37);
        org.junit.Assert.assertNotNull(byte_array38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(byte_array40);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test290");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        java.lang.String str4 = gPType1.toString();
        gPType1.setName(":-1:-1");
        gPType1.setName(":-1:-1:-1");
        java.lang.String str9 = gPType1.getName();
        byte[] byte_array10 = gPType1.getParents();
        gPType1.setId(0);
        gPType1.addChild((byte) -1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ":-1:-1:-1" + "'", str9.equals(":-1:-1:-1"));
        org.junit.Assert.assertNull(byte_array10);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test291");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        gPType24.addChild((byte) 1);
        java.lang.String str28 = gPType24.toString();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType24);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType24);
        gPType24.setName(":-1:-1:-1");
        gPType24.setName("");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test292");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        gPType1.setId((int) '#');
        byte[] byte_array14 = gPType1.getChildren();
        gPType1.addChild((byte) 100);
        gPType1.setId((-1));
        gPType1.addParent((byte) 10);
        gPType1.addChild((byte) 100);
        byte[] byte_array23 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array23);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test293");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1:-1:-1:-1:10");
        byte[] byte_array2 = gPType1.getParents();
        java.lang.String str3 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1:-1:-1:-1:10:-1" + "'", str3.equals(":-1:-1:-1:-1:10:-1"));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test294");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        java.lang.String str6 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType10 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType10);
        byte[] byte_array12 = gPType10.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getChildren();
        gPType14.addChild((byte) 1);
        int i18 = gPType14.getId();
        gPType14.addChild((byte) 0);
        gPType14.addParent((byte) 100);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType10, (io.github.agentsoz.jill.struct.AObject) gPType14);
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType10);
        byte[] byte_array25 = gPType1.getParents();
        int i26 = gPType1.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType28 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array29 = gPType28.getChildren();
        gPType28.addChild((byte) 1);
        java.lang.String str32 = gPType28.getName();
        java.lang.String str33 = gPType28.getName();
        int i34 = gPType28.getId();
        gPType28.setName(":-1:-1");
        byte[] byte_array37 = gPType28.getParents();
        java.lang.String str38 = gPType28.toString();
        int i39 = gPType28.getId();
        gPType28.addChild((byte) 10);
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType28);
        byte[] byte_array43 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertNull(byte_array37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + ":-1:-1:-1" + "'", str38.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(byte_array43);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test295");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        gPType1.addParent((byte) -1);
        java.lang.String str10 = gPType1.toString();
        byte[] byte_array11 = gPType1.getParents();
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, (int) '#');
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) 'a');
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array15, 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ":-1" + "'", str10.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array17);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test296");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) -1);
        byte[] byte_array6 = gPType1.getParents();
        byte[] byte_array7 = gPType1.getChildren();
        gPType1.setId((int) (short) -1);
        gPType1.addChild((byte) 10);
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        java.lang.String str15 = gPType13.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType19 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType17, (io.github.agentsoz.jill.struct.AObject) gPType19);
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, (io.github.agentsoz.jill.struct.AObject) gPType19);
        byte[] byte_array22 = gPType13.getParents();
        gPType13.setId(10);
        byte[] byte_array25 = gPType13.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType27 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array28 = gPType27.getChildren();
        gPType27.addChild((byte) 1);
        java.lang.String str31 = gPType27.getName();
        java.lang.String str32 = gPType27.getName();
        java.lang.String str33 = gPType27.getName();
        gPType27.addParent((byte) -1);
        java.lang.String str36 = gPType27.toString();
        gPType27.setName("hi!:-1");
        gPType27.setName("hi!:-1");
        int i41 = gPType27.getId();
        gPType27.setId((int) (byte) 0);
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, (io.github.agentsoz.jill.struct.AObject) gPType27);
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType27);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ":-1" + "'", str15.equals(":-1"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(byte_array22);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + ":-1" + "'", str36.equals(":-1"));
        org.junit.Assert.assertTrue(i41 == (-1));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test297");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        gPType24.addChild((byte) 1);
        java.lang.String str28 = gPType24.toString();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType24);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType24);
        int i31 = gPType1.getId();
        byte[] byte_array32 = gPType1.getChildren();
        gPType1.addChild((byte) -1);
        byte[] byte_array35 = gPType1.getChildren();
        byte[] byte_array36 = gPType1.getParents();
        gPType1.setName("hi!:35");
        gPType1.setName(":100");
        gPType1.addParent((byte) 0);
        java.lang.String str43 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertNotNull(byte_array35);
        org.junit.Assert.assertNotNull(byte_array36);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + ":100" + "'", str43.equals(":100"));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test298");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType17);
        java.lang.String str19 = gPType17.getName();
        gPType17.addParent((byte) 1);
        gPType17.addParent((byte) 1);
        gPType17.setId((-1));
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType17);
        gPType1.setId((int) (byte) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType30 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array31 = gPType30.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType33 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array34 = gPType33.getChildren();
        gPType33.addChild((byte) 1);
        java.lang.String str37 = gPType33.getName();
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType30, (io.github.agentsoz.jill.struct.AObject) gPType33);
        int i39 = gPType33.getId();
        gPType33.addChild((byte) 0);
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType33);
        gPType1.addParent((byte) 0);
        gPType1.addChild((byte) 1);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertNull(byte_array34);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test299");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        gPType1.setId((int) '#');
        byte[] byte_array14 = gPType1.getChildren();
        gPType1.addChild((byte) 100);
        byte[] byte_array17 = gPType1.getChildren();
        gPType1.setId(35);
        io.github.agentsoz.jill.struct.GoalPlanType gPType21 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType21, (io.github.agentsoz.jill.struct.AObject) gPType23);
        byte[] byte_array25 = gPType23.getParents();
        gPType23.setName("hi!:-1");
        byte[] byte_array28 = gPType23.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType30 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType32 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType30, (io.github.agentsoz.jill.struct.AObject) gPType32);
        java.lang.String str34 = gPType32.getName();
        gPType32.addParent((byte) 1);
        java.lang.String str37 = gPType32.toString();
        gPType32.addChild((byte) -1);
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType23, (io.github.agentsoz.jill.struct.AObject) gPType32);
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType23);
        gPType23.setName(":-1:-1:-1:-1");
        java.lang.String str44 = gPType23.getName();
        java.lang.String str45 = gPType23.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + ":-1" + "'", str37.equals(":-1"));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + ":-1:-1:-1:-1" + "'", str44.equals(":-1:-1:-1:-1"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + ":-1:-1:-1:-1" + "'", str45.equals(":-1:-1:-1:-1"));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test300");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        byte[] byte_array9 = gPType1.getParents();
        byte[] byte_array10 = gPType1.getParents();
        gPType1.setName("hi!:35:-1:-1");
        java.lang.String str13 = gPType1.toString();
        int i14 = gPType1.getId();
        gPType1.setName(":52");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!:35:-1:-1:-1" + "'", str13.equals("hi!:35:-1:-1:-1"));
        org.junit.Assert.assertTrue(i14 == (-1));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test301");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        byte[] byte_array6 = gPType1.getParents();
        java.lang.String str7 = gPType1.getName();
        java.lang.String str8 = gPType1.getName();
        java.lang.String str9 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test302");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType8.setName("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        int i20 = gPType16.getId();
        java.lang.String str21 = gPType16.toString();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType16);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        int i25 = gPType24.getId();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType24);
        gPType16.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType30 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array31 = gPType30.getChildren();
        gPType30.addChild((byte) 1);
        int i34 = gPType30.getId();
        java.lang.String str35 = gPType30.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType37 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType39 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType37, (io.github.agentsoz.jill.struct.AObject) gPType39);
        byte[] byte_array41 = gPType39.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType43 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array44 = gPType43.getChildren();
        gPType43.addChild((byte) 1);
        int i47 = gPType43.getId();
        gPType43.addChild((byte) 0);
        gPType43.addParent((byte) 100);
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType39, (io.github.agentsoz.jill.struct.AObject) gPType43);
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType30, (io.github.agentsoz.jill.struct.AObject) gPType39);
        int i54 = gPType39.getId();
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType39);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + ":-1" + "'", str35.equals(":-1"));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(byte_array41);
        org.junit.Assert.assertNull(byte_array44);
        org.junit.Assert.assertTrue(i47 == (-1));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == (-1));
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test303");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType1.addParent((byte) 100);
        gPType1.addChild((byte) 10);
        gPType1.addChild((byte) 1);
        byte[] byte_array19 = gPType1.getParents();
        gPType1.addParent((byte) -1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(byte_array19);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test304");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        gPType1.setId((int) 'a');
        org.junit.Assert.assertNull(byte_array2);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test305");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        int i8 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addChild((byte) 1);
        gPType1.setName(":-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1:-1");
        gPType16.setId((-1));
        gPType16.addChild((byte) 1);
        java.lang.String str21 = gPType16.getName();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType16);
        gPType16.setName(":100");
        int i25 = gPType16.getId();
        byte[] byte_array26 = gPType16.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1:-1" + "'", str21.equals(":-1:-1"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertNotNull(byte_array26);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test306");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        java.lang.String str9 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        java.lang.String str20 = gPType16.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, (io.github.agentsoz.jill.struct.AObject) gPType16);
        int i22 = gPType16.getId();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType16);
        gPType11.setId((int) (byte) -1);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        gPType1.setId(1);
        java.lang.String str29 = gPType1.toString();
        gPType1.setName(":100:10");
        gPType1.setName(":52:-1:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ":-1:-1" + "'", str9.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + ":-1:-1:1" + "'", str29.equals(":-1:-1:1"));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test307");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        gPType1.addParent((byte) -1);
        byte[] byte_array10 = gPType1.getParents();
        int i11 = gPType1.getId();
        java.lang.String str12 = gPType1.toString();
        gPType1.addParent((byte) 100);
        int i15 = gPType1.getId();
        gPType1.setName(":-1:-1:-1:-1:10:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1" + "'", str12.equals(":-1"));
        org.junit.Assert.assertTrue(i15 == (-1));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test308");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        byte[] byte_array6 = gPType3.getParents();
        gPType3.addChild((byte) 10);
        gPType3.setName("hi!:1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array13 = gPType12.getChildren();
        gPType12.addChild((byte) 1);
        java.lang.String str16 = gPType12.getName();
        java.lang.String str17 = gPType12.getName();
        gPType12.addParent((byte) 100);
        gPType12.addParent((byte) 10);
        byte[] byte_array22 = gPType12.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        int i25 = gPType24.getId();
        int i26 = gPType24.getId();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, (io.github.agentsoz.jill.struct.AObject) gPType24);
        java.lang.String str28 = gPType24.getName();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType24);
        io.github.agentsoz.jill.struct.GoalPlanType gPType31 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array32 = gPType31.getChildren();
        byte[] byte_array33 = gPType31.getParents();
        byte[] byte_array34 = gPType31.getChildren();
        gPType31.setId((int) (byte) 1);
        byte[] byte_array37 = gPType31.getChildren();
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType31);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(byte_array32);
        org.junit.Assert.assertNull(byte_array33);
        org.junit.Assert.assertNull(byte_array34);
        org.junit.Assert.assertNull(byte_array37);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test309");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType1.getChildren();
        gPType1.addChild((byte) 0);
        byte[] byte_array8 = gPType1.getParents();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test310");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        gPType3.addParent((byte) 1);
        java.lang.String str8 = gPType3.toString();
        gPType3.addChild((byte) 100);
        gPType3.addParent((byte) -1);
        java.lang.String str13 = gPType3.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ":-1" + "'", str8.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test311");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType4, (io.github.agentsoz.jill.struct.AObject) gPType14);
        java.lang.String str16 = gPType4.getName();
        gPType4.addParent((byte) -1);
        int i19 = gPType4.getId();
        gPType4.addChild((byte) 0);
        gPType4.setId(0);
        gPType4.setName("hi!:-1:-1:-1:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(i19 == (-1));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test312");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        gPType3.addParent((byte) 1);
        java.lang.String str8 = gPType3.toString();
        gPType3.addChild((byte) -1);
        gPType3.addParent((byte) 0);
        java.lang.String str13 = gPType3.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ":-1" + "'", str8.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ":-1" + "'", str13.equals(":-1"));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test313");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        byte[] byte_array4 = gPType1.getChildren();
        gPType1.setId((int) (byte) 1);
        gPType1.setName(":-1:-1:-1:-1");
        gPType1.setName("hi!:35:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array4);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test314");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        gPType24.addChild((byte) 1);
        java.lang.String str28 = gPType24.toString();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType24);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType24);
        int i31 = gPType1.getId();
        int i32 = gPType1.getId();
        gPType1.setName("");
        byte[] byte_array35 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType37 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array38 = gPType37.getChildren();
        java.lang.String str39 = gPType37.toString();
        java.lang.String str40 = gPType37.toString();
        gPType37.setName(":52");
        io.github.agentsoz.jill.struct.GoalPlanType gPType44 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array45 = gPType44.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType47 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array48 = gPType47.getChildren();
        gPType47.addChild((byte) 1);
        java.lang.String str51 = gPType47.getName();
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType44, (io.github.agentsoz.jill.struct.AObject) gPType47);
        int i53 = gPType47.getId();
        gPType47.setId((-1));
        int i56 = gPType47.getId();
        gPType47.setName(":100");
        java.lang.String str59 = gPType47.toString();
        java.lang.String str60 = gPType47.toString();
        int i61 = gPType47.getId();
        gPType47.setId((-1));
        java.lang.String str64 = gPType47.toString();
        byte[] byte_array65 = gPType47.getParents();
        gPType47.addChild((byte) 100);
        boolean b68 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType37, (io.github.agentsoz.jill.struct.AObject) gPType47);
        boolean b69 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType37);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertNotNull(byte_array35);
        org.junit.Assert.assertNull(byte_array38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + ":-1" + "'", str39.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + ":-1" + "'", str40.equals(":-1"));
        org.junit.Assert.assertNull(byte_array45);
        org.junit.Assert.assertNull(byte_array48);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i53 == (-1));
        org.junit.Assert.assertTrue(i56 == (-1));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + ":100:-1" + "'", str59.equals(":100:-1"));
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + ":100:-1" + "'", str60.equals(":100:-1"));
        org.junit.Assert.assertTrue(i61 == (-1));
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + ":100:-1" + "'", str64.equals(":100:-1"));
        org.junit.Assert.assertNull(byte_array65);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test315");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        gPType3.addParent((byte) 1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array10 = gPType9.getChildren();
        gPType9.addChild((byte) 1);
        java.lang.String str13 = gPType9.getName();
        java.lang.String str14 = gPType9.toString();
        gPType9.addChild((byte) -1);
        java.lang.String str17 = gPType9.getName();
        gPType9.addChild((byte) 1);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType9);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ":-1" + "'", str14.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test316");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) 10);
        byte[] byte_array6 = gPType1.getParents();
        byte[] byte_array8 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array6, (int) '#');
        byte[] byte_array10 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array6, (int) (short) 100);
        byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array6, (int) (short) 10);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test317");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        gPType7.addChild((byte) 0);
        gPType7.addParent((byte) 100);
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType7);
        java.lang.String str17 = gPType7.toString();
        gPType7.setName("hi!:-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType21 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array22 = gPType21.getChildren();
        gPType21.addChild((byte) 1);
        int i25 = gPType21.getId();
        gPType21.addChild((byte) 0);
        gPType21.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType31 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType33 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array34 = gPType33.getChildren();
        gPType33.addChild((byte) 1);
        int i37 = gPType33.getId();
        gPType33.addChild((byte) 0);
        gPType33.addParent((byte) 1);
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType31, (io.github.agentsoz.jill.struct.AObject) gPType33);
        io.github.agentsoz.jill.struct.GoalPlanType gPType44 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array45 = gPType44.getChildren();
        gPType44.addChild((byte) 1);
        java.lang.String str48 = gPType44.toString();
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType31, (io.github.agentsoz.jill.struct.AObject) gPType44);
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType21, (io.github.agentsoz.jill.struct.AObject) gPType44);
        gPType44.addParent((byte) -1);
        java.lang.String str53 = gPType44.toString();
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType44);
        gPType7.addParent((byte) 100);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertNull(byte_array22);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertNull(byte_array34);
        org.junit.Assert.assertTrue(i37 == (-1));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(byte_array45);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + ":-1" + "'", str48.equals(":-1"));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + ":-1" + "'", str53.equals(":-1"));
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test318");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        int i2 = gPType1.getId();
        java.lang.String str3 = gPType1.getName();
        int i4 = gPType1.getId();
        int i5 = gPType1.getId();
        int i6 = gPType1.getId();
        org.junit.Assert.assertTrue(i2 == (-1));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i6 == (-1));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test319");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        int i8 = gPType1.getId();
        byte[] byte_array9 = gPType1.getChildren();
        gPType1.addChild((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNotNull(byte_array9);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test320");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        java.lang.String str2 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        int i8 = gPType4.getId();
        gPType4.addChild((byte) 0);
        gPType4.addParent((byte) 1);
        gPType4.setName("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        gPType4.setName(":52:-1:-1");
        byte[] byte_array18 = gPType4.getParents();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ":-1" + "'", str2.equals(":-1"));
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(byte_array18);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test321");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType1.setName("hi!");
        byte[] byte_array15 = gPType1.getChildren();
        byte[] byte_array16 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test322");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) -1);
        gPType1.setName("hi!:-1:-1");
        gPType1.addParent((byte) -1);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test323");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        java.lang.String str9 = gPType1.getName();
        java.lang.String str10 = gPType1.toString();
        byte[] byte_array11 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ":-1:-1" + "'", str9.equals(":-1:-1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ":-1:-1:-1" + "'", str10.equals(":-1:-1:-1"));
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test324");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        gPType1.setName("");
        gPType1.addChild((byte) 10);
        java.lang.String str8 = gPType1.getName();
        java.lang.String str9 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        java.lang.String str23 = gPType11.toString();
        byte[] byte_array24 = gPType11.getParents();
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        java.lang.String str26 = gPType11.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ":-1:-1" + "'", str23.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + ":-1" + "'", str26.equals(":-1"));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test325");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        int i8 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addChild((byte) 1);
        gPType1.setName(":-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        java.lang.String str20 = gPType16.getName();
        java.lang.String str21 = gPType16.getName();
        int i22 = gPType16.getId();
        gPType16.setName(":-1:-1");
        byte[] byte_array25 = gPType16.getParents();
        gPType16.addChild((byte) 1);
        gPType16.addParent((byte) 10);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType16);
        gPType16.setName(":100:-1");
        java.lang.String str33 = gPType16.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + ":100:-1" + "'", str33.equals(":100:-1"));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test326");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        java.lang.String str6 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType10 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType10);
        byte[] byte_array12 = gPType10.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getChildren();
        gPType14.addChild((byte) 1);
        int i18 = gPType14.getId();
        gPType14.addChild((byte) 0);
        gPType14.addParent((byte) 100);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType10, (io.github.agentsoz.jill.struct.AObject) gPType14);
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType10);
        byte[] byte_array25 = gPType1.getParents();
        int i26 = gPType1.getId();
        java.lang.String str27 = gPType1.getName();
        gPType1.addChild((byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test327");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        gPType1.setId((int) '#');
        byte[] byte_array14 = gPType1.getChildren();
        gPType1.addChild((byte) 100);
        byte[] byte_array17 = gPType1.getChildren();
        gPType1.setId(35);
        io.github.agentsoz.jill.struct.GoalPlanType gPType21 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType21, (io.github.agentsoz.jill.struct.AObject) gPType23);
        byte[] byte_array25 = gPType23.getParents();
        gPType23.setName("hi!:-1");
        byte[] byte_array28 = gPType23.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType30 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType32 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType30, (io.github.agentsoz.jill.struct.AObject) gPType32);
        java.lang.String str34 = gPType32.getName();
        gPType32.addParent((byte) 1);
        java.lang.String str37 = gPType32.toString();
        gPType32.addChild((byte) -1);
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType23, (io.github.agentsoz.jill.struct.AObject) gPType32);
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType23);
        gPType23.setName(":-1:-1:-1:-1");
        java.lang.String str44 = gPType23.getName();
        java.lang.String str45 = gPType23.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + ":-1" + "'", str37.equals(":-1"));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + ":-1:-1:-1:-1" + "'", str44.equals(":-1:-1:-1:-1"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + ":-1:-1:-1:-1:-1" + "'", str45.equals(":-1:-1:-1:-1:-1"));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test328");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        gPType7.addChild((byte) 0);
        gPType7.addParent((byte) 100);
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType7);
        java.lang.String str17 = gPType7.toString();
        gPType7.setId((int) (short) -1);
        java.lang.String str20 = gPType7.getName();
        int i21 = gPType7.getId();
        gPType7.setId(1);
        gPType7.setId(0);
        io.github.agentsoz.jill.struct.GoalPlanType gPType27 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType29 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType27, (io.github.agentsoz.jill.struct.AObject) gPType29);
        byte[] byte_array31 = gPType29.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType33 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array34 = gPType33.getChildren();
        gPType33.addChild((byte) 1);
        int i37 = gPType33.getId();
        gPType33.addChild((byte) 0);
        gPType33.addParent((byte) 100);
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType29, (io.github.agentsoz.jill.struct.AObject) gPType33);
        java.lang.String str43 = gPType33.toString();
        int i44 = gPType33.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType46 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array47 = gPType46.getParents();
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType33, (io.github.agentsoz.jill.struct.AObject) gPType46);
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType46);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertNull(byte_array34);
        org.junit.Assert.assertTrue(i37 == (-1));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + ":-1" + "'", str43.equals(":-1"));
        org.junit.Assert.assertTrue(i44 == (-1));
        org.junit.Assert.assertNull(byte_array47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test329");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        byte[] byte_array10 = gPType1.getParents();
        java.lang.String str11 = gPType1.toString();
        gPType1.addParent((byte) -1);
        byte[] byte_array14 = gPType1.getParents();
        byte[] byte_array16 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array14, (int) 'a');
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1:-1:-1" + "'", str11.equals(":-1:-1:-1"));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test330");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array14 = gPType13.getParents();
        gPType13.setId((int) (short) 10);
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType13);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType3.setName(":-1:-1:-1");
        java.lang.String str21 = gPType3.toString();
        java.lang.String str22 = gPType3.getName();
        gPType3.setName(":52");
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1:-1:-1:-1" + "'", str21.equals(":-1:-1:-1:-1"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + ":-1:-1:-1" + "'", str22.equals(":-1:-1:-1"));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test331");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        byte[] byte_array6 = gPType1.getParents();
        java.lang.String str7 = gPType1.getName();
        byte[] byte_array8 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(byte_array8);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test332");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        byte[] byte_array6 = gPType1.getChildren();
        byte[] byte_array7 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNull(byte_array7);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test333");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        int i10 = gPType1.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array13 = gPType12.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array16 = gPType15.getChildren();
        gPType15.addChild((byte) 1);
        java.lang.String str19 = gPType15.getName();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, (io.github.agentsoz.jill.struct.AObject) gPType15);
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array23 = gPType22.getParents();
        gPType22.setId((int) (short) 10);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, (io.github.agentsoz.jill.struct.AObject) gPType22);
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType12);
        java.lang.String str28 = gPType1.toString();
        byte[] byte_array29 = gPType1.getChildren();
        byte[] byte_array30 = gPType1.getParents();
        gPType1.setId((int) (byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array29);
        org.junit.Assert.assertNotNull(byte_array30);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test334");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        byte[] byte_array10 = gPType1.getParents();
        java.lang.String str11 = gPType1.toString();
        gPType1.addParent((byte) 100);
        gPType1.addParent((byte) -1);
        byte[] byte_array16 = gPType1.getParents();
        java.lang.String str17 = gPType1.toString();
        java.lang.String str18 = gPType1.toString();
        gPType1.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1:-1:-1" + "'", str11.equals(":-1:-1:-1"));
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1:-1:-1" + "'", str17.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1:-1:-1" + "'", str18.equals(":-1:-1:-1"));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test335");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.addChild((byte) -1);
        java.lang.String str13 = gPType4.toString();
        gPType4.setId((int) (byte) -1);
        byte[] byte_array16 = gPType4.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ":-1" + "'", str13.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test336");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        gPType7.addChild((byte) 0);
        gPType7.addParent((byte) 100);
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType7);
        java.lang.String str17 = gPType7.toString();
        gPType7.setId((int) (short) -1);
        java.lang.String str20 = gPType7.getName();
        int i21 = gPType7.getId();
        gPType7.setName("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType25.addParent((byte) 1);
        byte[] byte_array28 = gPType25.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType30 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array31 = gPType30.getChildren();
        gPType30.addChild((byte) 1);
        int i34 = gPType30.getId();
        gPType30.addChild((byte) 0);
        gPType30.addParent((byte) 1);
        gPType30.setName("hi!");
        gPType30.setId((int) '#');
        byte[] byte_array43 = gPType30.getChildren();
        gPType30.addChild((byte) 100);
        gPType30.addChild((byte) -1);
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType25, (io.github.agentsoz.jill.struct.AObject) gPType30);
        int i49 = gPType25.getId();
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType25);
        gPType25.addChild((byte) 100);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertNotNull(byte_array43);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i49 == (-1));
        org.junit.Assert.assertTrue(b50 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test337");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        gPType1.addParent((byte) -1);
        gPType1.addChild((byte) 100);
        byte[] byte_array6 = gPType1.getParents();
        java.lang.String str7 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array10 = gPType9.getParents();
        gPType9.setName("hi!");
        java.lang.String str13 = gPType9.toString();
        int i14 = gPType9.getId();
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType9);
        io.github.agentsoz.jill.struct.AObject aObject16 = null;
        try {
            boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType9, aObject16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:-1" + "'", str7.equals("hi!:-1"));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!:-1" + "'", str13.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test338");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        java.lang.String str9 = gPType4.getName();
        int i10 = gPType4.getId();
        gPType4.setName(":-1:-1");
        byte[] byte_array13 = gPType4.getParents();
        java.lang.String str14 = gPType4.toString();
        gPType4.addParent((byte) -1);
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        byte[] byte_array18 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ":-1:-1:-1" + "'", str14.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(byte_array18);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test339");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType3.addChild((byte) 1);
        java.lang.String str15 = gPType3.toString();
        java.lang.String str16 = gPType3.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType18 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType20 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType18, (io.github.agentsoz.jill.struct.AObject) gPType20);
        byte[] byte_array22 = gPType20.getParents();
        gPType20.setName("hi!:-1");
        java.lang.String str25 = gPType20.getName();
        int i26 = gPType20.getId();
        gPType20.setName("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType30 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array31 = gPType30.getChildren();
        gPType30.addChild((byte) 1);
        int i34 = gPType30.getId();
        gPType30.addChild((byte) 0);
        gPType30.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType40 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType42 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array43 = gPType42.getChildren();
        gPType42.addChild((byte) 1);
        int i46 = gPType42.getId();
        gPType42.addChild((byte) 0);
        gPType42.addParent((byte) 1);
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType40, (io.github.agentsoz.jill.struct.AObject) gPType42);
        io.github.agentsoz.jill.struct.GoalPlanType gPType53 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array54 = gPType53.getChildren();
        gPType53.addChild((byte) 1);
        java.lang.String str57 = gPType53.toString();
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType40, (io.github.agentsoz.jill.struct.AObject) gPType53);
        boolean b59 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType30, (io.github.agentsoz.jill.struct.AObject) gPType53);
        int i60 = gPType30.getId();
        byte[] byte_array61 = gPType30.getChildren();
        gPType30.addChild((byte) -1);
        byte[] byte_array64 = gPType30.getChildren();
        boolean b65 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType20, (io.github.agentsoz.jill.struct.AObject) gPType30);
        boolean b66 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType30);
        java.lang.String str67 = gPType30.toString();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ":-1" + "'", str15.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":-1" + "'", str16.equals(":-1"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(byte_array22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:-1" + "'", str25.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertNull(byte_array43);
        org.junit.Assert.assertTrue(i46 == (-1));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(byte_array54);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + ":-1" + "'", str57.equals(":-1"));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i60 == (-1));
        org.junit.Assert.assertNotNull(byte_array61);
        org.junit.Assert.assertNotNull(byte_array64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + ":-1" + "'", str67.equals(":-1"));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test340");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        gPType1.addParent((byte) 1);
        gPType1.setId((int) (short) 0);
        byte[] byte_array15 = gPType1.getChildren();
        gPType1.setName(":100:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test341");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.setId((int) (byte) -1);
        java.lang.String str4 = gPType1.toString();
        gPType1.setId((int) (short) -1);
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType10 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType10.setId((int) (byte) -1);
        gPType10.addChild((byte) 10);
        gPType10.setName(":-1:-1:-1:-1:10");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType10);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:1:-1" + "'", str4.equals("hi!:1:-1"));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test342");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        java.lang.String str3 = gPType1.toString();
        gPType1.setId(0);
        gPType1.addChild((byte) 10);
        int i8 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test343");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        byte[] byte_array11 = gPType1.getChildren();
        int i12 = gPType1.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType14.setId((int) (byte) -1);
        gPType14.addParent((byte) -1);
        byte[] byte_array19 = gPType14.getParents();
        byte[] byte_array20 = gPType14.getChildren();
        gPType14.setId((int) (short) -1);
        gPType14.setId((int) (short) 100);
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType14);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test344");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        byte[] byte_array11 = gPType1.getChildren();
        java.lang.String str12 = gPType1.toString();
        gPType1.setName("hi!:35:-1");
        java.lang.String str15 = gPType1.getName();
        gPType1.addChild((byte) 10);
        gPType1.setId((int) (byte) -1);
        gPType1.setName(":-1:-1:1:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1:-1:-1" + "'", str12.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!:35:-1" + "'", str15.equals("hi!:35:-1"));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test345");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        gPType1.setId((int) (byte) 100);
        int i4 = gPType1.getId();
        byte[] byte_array5 = gPType1.getParents();
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertNull(byte_array5);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test346");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        gPType1.setName("");
        gPType1.addChild((byte) 10);
        java.lang.String str8 = gPType1.getName();
        java.lang.String str9 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        java.lang.String str23 = gPType11.toString();
        byte[] byte_array24 = gPType11.getParents();
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        gPType11.addParent((byte) 0);
        io.github.agentsoz.jill.struct.GoalPlanType gPType29 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array30 = gPType29.getChildren();
        gPType29.addChild((byte) 1);
        java.lang.String str33 = gPType29.getName();
        java.lang.String str34 = gPType29.getName();
        int i35 = gPType29.getId();
        gPType29.setName(":-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType39 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType41 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array42 = gPType41.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType44 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array45 = gPType44.getChildren();
        gPType44.addChild((byte) 1);
        java.lang.String str48 = gPType44.getName();
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType41, (io.github.agentsoz.jill.struct.AObject) gPType44);
        int i50 = gPType44.getId();
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType39, (io.github.agentsoz.jill.struct.AObject) gPType44);
        gPType39.setId((int) (byte) -1);
        byte[] byte_array54 = gPType39.getParents();
        java.lang.String str55 = gPType39.toString();
        byte[] byte_array56 = gPType39.getChildren();
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType29, (io.github.agentsoz.jill.struct.AObject) gPType39);
        gPType29.addChild((byte) -1);
        java.lang.String str60 = gPType29.getName();
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType29);
        gPType11.addParent((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ":-1:-1" + "'", str23.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(byte_array30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertTrue(i35 == (-1));
        org.junit.Assert.assertNull(byte_array42);
        org.junit.Assert.assertNull(byte_array45);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i50 == (-1));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(byte_array54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + ":-1" + "'", str55.equals(":-1"));
        org.junit.Assert.assertNull(byte_array56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + ":-1:-1" + "'", str60.equals(":-1:-1"));
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test347");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getChildren();
        gPType14.addChild((byte) 1);
        java.lang.String str18 = gPType14.toString();
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType14);
        int i20 = gPType1.getId();
        byte[] byte_array21 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array26 = gPType25.getChildren();
        gPType25.addChild((byte) 1);
        int i29 = gPType25.getId();
        gPType25.addChild((byte) 0);
        gPType25.addParent((byte) 1);
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType23, (io.github.agentsoz.jill.struct.AObject) gPType25);
        java.lang.String str35 = gPType23.toString();
        byte[] byte_array36 = gPType23.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType38 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array39 = gPType38.getChildren();
        java.lang.String str40 = gPType38.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType42 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType44 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType42, (io.github.agentsoz.jill.struct.AObject) gPType44);
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType38, (io.github.agentsoz.jill.struct.AObject) gPType44);
        boolean b47 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType23, (io.github.agentsoz.jill.struct.AObject) gPType44);
        java.lang.String str48 = gPType23.getName();
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType23);
        java.lang.String str50 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + ":-1:-1" + "'", str35.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array36);
        org.junit.Assert.assertNull(byte_array39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + ":-1" + "'", str40.equals(":-1"));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + ":-1" + "'", str48.equals(":-1"));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + ":-1:-1" + "'", str50.equals(":-1:-1"));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test348");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.addParent((byte) 100);
        int i10 = gPType1.getId();
        gPType1.setName(":-1");
        gPType1.addParent((byte) 1);
        java.lang.String str15 = gPType1.getName();
        gPType1.addParent((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ":-1" + "'", str15.equals(":-1"));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test349");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        gPType1.addParent((byte) -1);
        java.lang.String str10 = gPType1.toString();
        gPType1.setName("hi!:-1");
        java.lang.String str13 = gPType1.getName();
        byte[] byte_array14 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ":-1" + "'", str10.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!:-1" + "'", str13.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array14);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test350");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        byte[] byte_array7 = gPType1.getChildren();
        int i8 = gPType1.getId();
        byte[] byte_array9 = gPType1.getChildren();
        int i10 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test351");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        gPType1.setId((int) (byte) 10);
        byte[] byte_array12 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test352");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1:-1:-1");
        gPType1.addChild((byte) -1);
        java.lang.String str4 = gPType1.toString();
        gPType1.setId((int) '#');
        java.lang.String str7 = gPType1.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1:-1:-1:-1" + "'", str4.equals(":-1:-1:-1:-1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ":-1:-1:-1:35" + "'", str7.equals(":-1:-1:-1:35"));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test353");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        gPType1.setId((int) (byte) -1);
        byte[] byte_array16 = gPType1.getParents();
        java.lang.String str17 = gPType1.toString();
        byte[] byte_array18 = gPType1.getChildren();
        gPType1.addParent((byte) 100);
        byte[] byte_array21 = gPType1.getParents();
        gPType1.setName(":-1:-1:-1:-1:10");
        gPType1.addParent((byte) -1);
        java.lang.String str26 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType28 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array29 = gPType28.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType31 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array32 = gPType31.getChildren();
        gPType31.addChild((byte) 1);
        java.lang.String str35 = gPType31.getName();
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType28, (io.github.agentsoz.jill.struct.AObject) gPType31);
        int i37 = gPType31.getId();
        gPType31.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType41 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType31, (io.github.agentsoz.jill.struct.AObject) gPType41);
        java.lang.String str43 = gPType31.getName();
        gPType31.addParent((byte) -1);
        int i46 = gPType31.getId();
        boolean b47 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType31);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNotNull(byte_array21);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + ":-1:-1:-1:-1:10" + "'", str26.equals(":-1:-1:-1:-1:10"));
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertNull(byte_array32);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i37 == (-1));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        org.junit.Assert.assertTrue(i46 == (-1));
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test354");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType4, (io.github.agentsoz.jill.struct.AObject) gPType14);
        java.lang.String str16 = gPType4.getName();
        gPType4.addParent((byte) -1);
        int i19 = gPType4.getId();
        gPType4.addChild((byte) 0);
        gPType4.setName(":-1:-1");
        byte[] byte_array24 = gPType4.getChildren();
        byte[] byte_array25 = gPType4.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertNotNull(byte_array24);
        org.junit.Assert.assertNotNull(byte_array25);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test355");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        gPType7.addChild((byte) 0);
        gPType7.addParent((byte) 100);
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType7);
        java.lang.String str17 = gPType7.toString();
        gPType7.setId((int) (short) -1);
        java.lang.String str20 = gPType7.getName();
        int i21 = gPType7.getId();
        gPType7.setId(1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array26 = gPType25.getChildren();
        gPType25.addChild((byte) 1);
        java.lang.String str29 = gPType25.getName();
        java.lang.String str30 = gPType25.getName();
        java.lang.String str31 = gPType25.getName();
        byte[] byte_array32 = gPType25.getChildren();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType25);
        java.lang.String str34 = gPType7.getName();
        gPType7.setId((int) (short) 100);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test356");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        byte[] byte_array6 = gPType3.getParents();
        gPType3.addChild((byte) 10);
        int i9 = gPType3.getId();
        gPType3.addParent((byte) 100);
        gPType3.setName(":10");
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array16 = gPType15.getChildren();
        gPType15.addChild((byte) 1);
        int i19 = gPType15.getId();
        gPType15.addChild((byte) 0);
        gPType15.addParent((byte) 1);
        java.lang.String str24 = gPType15.getName();
        java.lang.String str25 = gPType15.getName();
        java.lang.String str26 = gPType15.toString();
        gPType15.setId((int) (short) 100);
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType15);
        int i30 = gPType15.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + ":-1" + "'", str26.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 100);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test357");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) 1);
        java.lang.String str6 = gPType1.toString();
        java.lang.String str7 = gPType1.getName();
        int i8 = gPType1.getId();
        byte[] byte_array9 = gPType1.getChildren();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:1:-1" + "'", str6.equals("hi!:1:-1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:1" + "'", str7.equals("hi!:1"));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(byte_array9);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test358");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        byte[] byte_array3 = gPType1.getParents();
        gPType1.setName(":-1:-1:-1");
        gPType1.addChild((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test359");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType17);
        java.lang.String str19 = gPType17.getName();
        gPType17.addParent((byte) 1);
        gPType17.addParent((byte) 1);
        gPType17.setId((-1));
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType17);
        java.lang.String str27 = gPType1.toString();
        java.lang.String str28 = gPType1.toString();
        byte[] byte_array29 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType31 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array32 = gPType31.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType34 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array35 = gPType34.getChildren();
        gPType34.addChild((byte) 1);
        java.lang.String str38 = gPType34.getName();
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType31, (io.github.agentsoz.jill.struct.AObject) gPType34);
        int i40 = gPType34.getId();
        gPType34.setId((-1));
        int i43 = gPType34.getId();
        gPType34.setName(":100");
        java.lang.String str46 = gPType34.toString();
        java.lang.String str47 = gPType34.toString();
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType34);
        io.github.agentsoz.jill.struct.GoalPlanType gPType50 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType52 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array53 = gPType52.getChildren();
        gPType52.addChild((byte) 1);
        int i56 = gPType52.getId();
        gPType52.addChild((byte) 0);
        gPType52.addParent((byte) 1);
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType50, (io.github.agentsoz.jill.struct.AObject) gPType52);
        gPType52.setName("hi!:1");
        byte[] byte_array64 = gPType52.getParents();
        gPType52.setName("");
        gPType52.setName("hi!:1:-1");
        byte[] byte_array69 = gPType52.getParents();
        gPType52.setId((int) (short) 0);
        byte[] byte_array72 = gPType52.getChildren();
        boolean b73 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType34, (io.github.agentsoz.jill.struct.AObject) gPType52);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertNull(byte_array32);
        org.junit.Assert.assertNull(byte_array35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == (-1));
        org.junit.Assert.assertTrue(i43 == (-1));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + ":100:-1" + "'", str46.equals(":100:-1"));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + ":100:-1" + "'", str47.equals(":100:-1"));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(byte_array53);
        org.junit.Assert.assertTrue(i56 == (-1));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(byte_array64);
        org.junit.Assert.assertNotNull(byte_array69);
        org.junit.Assert.assertNotNull(byte_array72);
        org.junit.Assert.assertTrue(b73 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test360");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setId((int) (short) 10);
        byte[] byte_array5 = gPType1.getChildren();
        byte[] byte_array6 = gPType1.getParents();
        gPType1.addChild((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array6);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test361");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getChildren();
        gPType14.addChild((byte) 1);
        java.lang.String str18 = gPType14.toString();
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType14);
        int i20 = gPType1.getId();
        byte[] byte_array21 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array26 = gPType25.getChildren();
        gPType25.addChild((byte) 1);
        int i29 = gPType25.getId();
        gPType25.addChild((byte) 0);
        gPType25.addParent((byte) 1);
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType23, (io.github.agentsoz.jill.struct.AObject) gPType25);
        java.lang.String str35 = gPType23.toString();
        byte[] byte_array36 = gPType23.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType38 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array39 = gPType38.getChildren();
        java.lang.String str40 = gPType38.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType42 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType44 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType42, (io.github.agentsoz.jill.struct.AObject) gPType44);
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType38, (io.github.agentsoz.jill.struct.AObject) gPType44);
        boolean b47 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType23, (io.github.agentsoz.jill.struct.AObject) gPType44);
        java.lang.String str48 = gPType23.getName();
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType23);
        gPType23.setId((int) (short) 10);
        byte[] byte_array52 = gPType23.getChildren();
        byte[] byte_array53 = gPType23.getChildren();
        byte[] byte_array54 = gPType23.getParents();
        java.lang.String str55 = gPType23.getName();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + ":-1:-1" + "'", str35.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array36);
        org.junit.Assert.assertNull(byte_array39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + ":-1" + "'", str40.equals(":-1"));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + ":-1" + "'", str48.equals(":-1"));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNull(byte_array52);
        org.junit.Assert.assertNull(byte_array53);
        org.junit.Assert.assertNull(byte_array54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + ":-1" + "'", str55.equals(":-1"));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test362");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        int i2 = gPType1.getId();
        java.lang.String str3 = gPType1.toString();
        gPType1.addParent((byte) 100);
        java.lang.String str6 = gPType1.toString();
        byte[] byte_array7 = gPType1.getParents();
        byte[] byte_array8 = gPType1.getChildren();
        org.junit.Assert.assertTrue(i2 == (-1));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!:-1" + "'", str3.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNull(byte_array8);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test363");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        int i10 = gPType1.getId();
        byte[] byte_array11 = gPType1.getParents();
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, 1);
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (short) 100);
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array15, (int) '4');
        byte[] byte_array19 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array15, (int) (byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertNotNull(byte_array19);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test364");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        gPType1.setId((int) (byte) -1);
        byte[] byte_array16 = gPType1.getParents();
        gPType1.addChild((byte) 0);
        java.lang.String str19 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test365");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getChildren();
        gPType14.addChild((byte) 1);
        java.lang.String str18 = gPType14.toString();
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType14);
        int i20 = gPType1.getId();
        byte[] byte_array21 = gPType1.getChildren();
        gPType1.addParent((byte) 0);
        byte[] byte_array24 = gPType1.getParents();
        byte[] byte_array26 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array24, 97);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertNotNull(byte_array24);
        org.junit.Assert.assertNotNull(byte_array26);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test366");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array14 = gPType13.getParents();
        gPType13.setId((int) (short) 10);
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType13);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType1.addParent((byte) 10);
        gPType1.addParent((byte) 1);
        byte[] byte_array23 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType27 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array28 = gPType27.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType30 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array31 = gPType30.getChildren();
        gPType30.addChild((byte) 1);
        java.lang.String str34 = gPType30.getName();
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType27, (io.github.agentsoz.jill.struct.AObject) gPType30);
        int i36 = gPType30.getId();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType25, (io.github.agentsoz.jill.struct.AObject) gPType30);
        gPType25.setId((int) (byte) -1);
        java.lang.String str40 = gPType25.toString();
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType25);
        int i42 = gPType25.getId();
        int i43 = gPType25.getId();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + ":-1" + "'", str40.equals(":-1"));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == (-1));
        org.junit.Assert.assertTrue(i43 == (-1));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test367");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        byte[] byte_array10 = gPType4.getChildren();
        byte[] byte_array11 = gPType4.getParents();
        java.lang.String str12 = gPType4.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test368");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType4, (io.github.agentsoz.jill.struct.AObject) gPType14);
        java.lang.String str16 = gPType4.getName();
        gPType4.addParent((byte) -1);
        int i19 = gPType4.getId();
        gPType4.addChild((byte) 0);
        gPType4.setName(":-1:-1");
        int i24 = gPType4.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue(i24 == (-1));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test369");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        gPType1.addParent((byte) -1);
        java.lang.String str10 = gPType1.toString();
        byte[] byte_array11 = gPType1.getParents();
        java.lang.String str12 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType14.setId((int) (byte) -1);
        gPType14.addParent((byte) 10);
        int i19 = gPType14.getId();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType14);
        byte[] byte_array21 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ":-1" + "'", str10.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(byte_array21);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test370");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setId((int) (short) 10);
        gPType1.setId((int) (short) -1);
        java.lang.String str7 = gPType1.toString();
        int i8 = gPType1.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType10 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array11 = gPType10.getParents();
        gPType10.setName("hi!");
        gPType10.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array18 = gPType17.getParents();
        int i19 = gPType17.getId();
        byte[] byte_array20 = gPType17.getChildren();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType10, (io.github.agentsoz.jill.struct.AObject) gPType17);
        byte[] byte_array22 = gPType17.getChildren();
        byte[] byte_array23 = gPType17.getParents();
        java.lang.String str24 = gPType17.getName();
        gPType17.addChild((byte) 0);
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType17);
        byte[] byte_array28 = gPType1.getParents();
        int i29 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:-1" + "'", str7.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(byte_array22);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(i29 == (-1));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test371");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array9 = gPType8.getParents();
        gPType8.setName("hi!");
        java.lang.String str12 = gPType8.toString();
        gPType8.addChild((byte) 0);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType8.setId((int) (short) 1);
        gPType8.addChild((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test372");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        java.lang.String str4 = gPType1.toString();
        int i5 = gPType1.getId();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.toString();
        gPType1.addChild((byte) 0);
        gPType1.setName("hi!:1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        gPType13.setId((int) (byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType17.addParent((byte) 1);
        byte[] byte_array20 = gPType17.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array23 = gPType22.getChildren();
        gPType22.addChild((byte) 1);
        int i26 = gPType22.getId();
        gPType22.addChild((byte) 0);
        gPType22.addParent((byte) 1);
        gPType22.setName("hi!");
        gPType22.setId((int) '#');
        byte[] byte_array35 = gPType22.getChildren();
        gPType22.addChild((byte) 100);
        gPType22.addChild((byte) -1);
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType17, (io.github.agentsoz.jill.struct.AObject) gPType22);
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, (io.github.agentsoz.jill.struct.AObject) gPType22);
        io.github.agentsoz.jill.struct.GoalPlanType gPType43 = new io.github.agentsoz.jill.struct.GoalPlanType(":52");
        io.github.agentsoz.jill.struct.GoalPlanType gPType45 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array46 = gPType45.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType48 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array49 = gPType48.getChildren();
        gPType48.addChild((byte) 1);
        java.lang.String str52 = gPType48.getName();
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType45, (io.github.agentsoz.jill.struct.AObject) gPType48);
        int i54 = gPType48.getId();
        gPType48.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType58 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b59 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType48, (io.github.agentsoz.jill.struct.AObject) gPType58);
        boolean b60 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType43, (io.github.agentsoz.jill.struct.AObject) gPType48);
        java.lang.String str61 = gPType48.toString();
        boolean b62 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, (io.github.agentsoz.jill.struct.AObject) gPType48);
        io.github.agentsoz.jill.struct.GoalPlanType gPType64 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType66 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array67 = gPType66.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType69 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array70 = gPType69.getChildren();
        gPType69.addChild((byte) 1);
        java.lang.String str73 = gPType69.getName();
        boolean b74 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType66, (io.github.agentsoz.jill.struct.AObject) gPType69);
        int i75 = gPType69.getId();
        boolean b76 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType64, (io.github.agentsoz.jill.struct.AObject) gPType69);
        io.github.agentsoz.jill.struct.GoalPlanType gPType78 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array79 = gPType78.getParents();
        gPType78.setName("hi!");
        java.lang.String str82 = gPType78.toString();
        boolean b83 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType64, (io.github.agentsoz.jill.struct.AObject) gPType78);
        boolean b84 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, (io.github.agentsoz.jill.struct.AObject) gPType78);
        boolean b85 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType78);
        gPType1.setId(0);
        byte[] byte_array88 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ":-1" + "'", str7.equals(":-1"));
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertNotNull(byte_array35);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(byte_array46);
        org.junit.Assert.assertNull(byte_array49);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == (-1));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + ":-1" + "'", str61.equals(":-1"));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(byte_array67);
        org.junit.Assert.assertNull(byte_array70);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "" + "'", str73.equals(""));
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(i75 == (-1));
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNull(byte_array79);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "hi!:-1" + "'", str82.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNull(byte_array88);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test373");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        gPType1.setName("");
        gPType1.addChild((byte) 10);
        java.lang.String str8 = gPType1.getName();
        java.lang.String str9 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        java.lang.String str23 = gPType11.toString();
        byte[] byte_array24 = gPType11.getParents();
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        gPType11.addParent((byte) 0);
        io.github.agentsoz.jill.struct.GoalPlanType gPType29 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array30 = gPType29.getChildren();
        gPType29.addChild((byte) 1);
        java.lang.String str33 = gPType29.getName();
        java.lang.String str34 = gPType29.getName();
        int i35 = gPType29.getId();
        gPType29.setName(":-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType39 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType41 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array42 = gPType41.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType44 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array45 = gPType44.getChildren();
        gPType44.addChild((byte) 1);
        java.lang.String str48 = gPType44.getName();
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType41, (io.github.agentsoz.jill.struct.AObject) gPType44);
        int i50 = gPType44.getId();
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType39, (io.github.agentsoz.jill.struct.AObject) gPType44);
        gPType39.setId((int) (byte) -1);
        byte[] byte_array54 = gPType39.getParents();
        java.lang.String str55 = gPType39.toString();
        byte[] byte_array56 = gPType39.getChildren();
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType29, (io.github.agentsoz.jill.struct.AObject) gPType39);
        gPType29.addChild((byte) -1);
        java.lang.String str60 = gPType29.getName();
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType29);
        gPType29.setName(":100:-1:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ":-1:-1" + "'", str23.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(byte_array30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertTrue(i35 == (-1));
        org.junit.Assert.assertNull(byte_array42);
        org.junit.Assert.assertNull(byte_array45);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i50 == (-1));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(byte_array54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + ":-1" + "'", str55.equals(":-1"));
        org.junit.Assert.assertNull(byte_array56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + ":-1:-1" + "'", str60.equals(":-1:-1"));
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test374");
        io.github.agentsoz.jill.struct.AObject aObject0 = null;
        io.github.agentsoz.jill.struct.GoalPlanType gPType2 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array3 = gPType2.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array6 = gPType5.getChildren();
        gPType5.addChild((byte) 1);
        java.lang.String str9 = gPType5.getName();
        boolean b10 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType2, (io.github.agentsoz.jill.struct.AObject) gPType5);
        int i11 = gPType5.getId();
        gPType5.setName("");
        gPType5.setId((int) (short) -1);
        byte[] byte_array16 = gPType5.getChildren();
        try {
            boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject0, (io.github.agentsoz.jill.struct.AObject) gPType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test375");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        byte[] byte_array10 = gPType1.getParents();
        java.lang.String str11 = gPType1.toString();
        gPType1.addParent((byte) 100);
        byte[] byte_array14 = gPType1.getParents();
        byte[] byte_array15 = gPType1.getChildren();
        byte[] byte_array16 = gPType1.getChildren();
        byte[] byte_array18 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array16, 100);
        byte[] byte_array20 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array18, (int) (byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1:-1:-1" + "'", str11.equals(":-1:-1:-1"));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertNotNull(byte_array18);
        org.junit.Assert.assertNotNull(byte_array20);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test376");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.setName("hi!:-1:-1");
        int i4 = gPType1.getId();
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        java.lang.String str8 = gPType1.getName();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1:-1" + "'", str5.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1:-1" + "'", str6.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:-1:-1" + "'", str7.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:-1:-1" + "'", str8.equals("hi!:-1:-1"));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test377");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        byte[] byte_array10 = gPType1.getParents();
        gPType1.addChild((byte) 1);
        int i13 = gPType1.getId();
        java.lang.String str14 = gPType1.getName();
        java.lang.String str15 = gPType1.getName();
        java.lang.String str16 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ":-1:-1" + "'", str14.equals(":-1:-1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ":-1:-1" + "'", str15.equals(":-1:-1"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":-1:-1" + "'", str16.equals(":-1:-1"));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test378");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:35:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType3.setId((int) (byte) -1);
        gPType3.addParent((byte) -1);
        byte[] byte_array8 = gPType3.getParents();
        byte[] byte_array9 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType11.setId((int) (byte) -1);
        java.lang.String str14 = gPType11.toString();
        gPType11.setName(":-1:-1");
        gPType11.setName(":-1:-1:-1");
        java.lang.String str19 = gPType11.getName();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType11);
        gPType11.setName(":100");
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array25 = gPType24.getParents();
        gPType24.setName("hi!");
        gPType24.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType31 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array32 = gPType31.getParents();
        int i33 = gPType31.getId();
        byte[] byte_array34 = gPType31.getChildren();
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType24, (io.github.agentsoz.jill.struct.AObject) gPType31);
        gPType31.setName("hi!");
        byte[] byte_array38 = gPType31.getChildren();
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType31);
        java.lang.String str40 = gPType11.toString();
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        java.lang.String str42 = gPType11.getName();
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ":-1" + "'", str14.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1:-1:-1" + "'", str19.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertNull(byte_array32);
        org.junit.Assert.assertTrue(i33 == (-1));
        org.junit.Assert.assertNull(byte_array34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(byte_array38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + ":100:-1" + "'", str40.equals(":100:-1"));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + ":100" + "'", str42.equals(":100"));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test379");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        gPType1.addChild((byte) -1);
        gPType1.setName(":52:-1");
        byte[] byte_array8 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertNotNull(byte_array8);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test380");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1:-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        java.lang.String str7 = gPType3.getName();
        java.lang.String str8 = gPType3.getName();
        java.lang.String str9 = gPType3.getName();
        int i10 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addChild((byte) 1);
        gPType3.setId(10);
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType1.addChild((byte) 10);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test381");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        gPType1.setId((int) '#');
        byte[] byte_array14 = gPType1.getChildren();
        gPType1.addChild((byte) 100);
        gPType1.setId((-1));
        gPType1.setName("hi!:100");
        gPType1.addParent((byte) 0);
        byte[] byte_array23 = gPType1.getParents();
        byte[] byte_array25 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array23, (int) (short) 10);
        byte[] byte_array27 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array23, 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array23);
        org.junit.Assert.assertNotNull(byte_array25);
        org.junit.Assert.assertNotNull(byte_array27);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test382");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        byte[] byte_array3 = gPType1.getParents();
        gPType1.setName(":-1:-1:-1");
        gPType1.addParent((byte) 10);
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array10 = gPType9.getChildren();
        gPType9.addChild((byte) 1);
        int i13 = gPType9.getId();
        gPType9.addChild((byte) 0);
        java.lang.String str16 = gPType9.toString();
        byte[] byte_array17 = gPType9.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType19 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array20 = gPType19.getParents();
        java.lang.String str21 = gPType19.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array24 = gPType23.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType26 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array27 = gPType26.getChildren();
        gPType26.addChild((byte) 1);
        java.lang.String str30 = gPType26.getName();
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType23, (io.github.agentsoz.jill.struct.AObject) gPType26);
        int i32 = gPType26.getId();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType19, (io.github.agentsoz.jill.struct.AObject) gPType26);
        gPType26.setId(1);
        gPType26.setId((int) (short) 100);
        gPType26.addParent((byte) 1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType41 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array42 = gPType41.getChildren();
        byte[] byte_array43 = gPType41.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType45 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array46 = gPType45.getParents();
        java.lang.String str47 = gPType45.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType49 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array50 = gPType49.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType52 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array53 = gPType52.getChildren();
        gPType52.addChild((byte) 1);
        java.lang.String str56 = gPType52.getName();
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType49, (io.github.agentsoz.jill.struct.AObject) gPType52);
        int i58 = gPType52.getId();
        boolean b59 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType45, (io.github.agentsoz.jill.struct.AObject) gPType52);
        byte[] byte_array60 = gPType52.getChildren();
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType41, (io.github.agentsoz.jill.struct.AObject) gPType52);
        boolean b62 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType26, (io.github.agentsoz.jill.struct.AObject) gPType41);
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType9, (io.github.agentsoz.jill.struct.AObject) gPType26);
        boolean b64 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType26);
        java.lang.String str65 = gPType26.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":-1" + "'", str16.equals(":-1"));
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertNull(byte_array27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(byte_array42);
        org.junit.Assert.assertNull(byte_array43);
        org.junit.Assert.assertNull(byte_array46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        org.junit.Assert.assertNull(byte_array50);
        org.junit.Assert.assertNull(byte_array53);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(i58 == (-1));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(byte_array60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + ":100" + "'", str65.equals(":100"));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test383");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        int i3 = gPType1.getId();
        java.lang.String str4 = gPType1.toString();
        gPType1.setId((int) '#');
        gPType1.setName(":0");
        gPType1.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test384");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType1.addParent((byte) 100);
        gPType1.addChild((byte) 10);
        java.lang.String str17 = gPType1.getName();
        byte[] byte_array18 = gPType1.getChildren();
        byte[] byte_array20 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array18, (int) (short) 1);
        byte[] byte_array22 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array20, (int) (byte) 0);
        byte[] byte_array24 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array20, 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array18);
        org.junit.Assert.assertNotNull(byte_array20);
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertNotNull(byte_array24);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test385");
        io.github.agentsoz.jill.struct.AObject aObject0 = null;
        io.github.agentsoz.jill.struct.GoalPlanType gPType2 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array3 = gPType2.getParents();
        gPType2.setName("hi!");
        gPType2.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array10 = gPType9.getParents();
        int i11 = gPType9.getId();
        byte[] byte_array12 = gPType9.getChildren();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType2, (io.github.agentsoz.jill.struct.AObject) gPType9);
        byte[] byte_array14 = gPType9.getChildren();
        byte[] byte_array15 = gPType9.getParents();
        java.lang.String str16 = gPType9.getName();
        java.lang.String str17 = gPType9.toString();
        byte[] byte_array18 = gPType9.getChildren();
        byte[] byte_array19 = gPType9.getChildren();
        try {
            boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject0, (io.github.agentsoz.jill.struct.AObject) gPType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNull(byte_array19);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test386");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        java.lang.String str3 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType7);
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType7);
        gPType7.setName("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array14 = gPType13.getParents();
        gPType13.setName("hi!");
        gPType13.setId((int) (byte) 1);
        java.lang.String str19 = gPType13.getName();
        gPType13.setId((int) (byte) 100);
        gPType13.addChild((byte) 100);
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType13);
        io.github.agentsoz.jill.struct.GoalPlanType gPType26 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType28 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array29 = gPType28.getChildren();
        gPType28.addChild((byte) 1);
        int i32 = gPType28.getId();
        gPType28.addChild((byte) 0);
        gPType28.addParent((byte) 1);
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType26, (io.github.agentsoz.jill.struct.AObject) gPType28);
        byte[] byte_array38 = gPType26.getChildren();
        int i39 = gPType26.getId();
        gPType26.setName("hi!:-1");
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType26);
        byte[] byte_array43 = gPType7.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(byte_array38);
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(byte_array43);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test387");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.setId((int) (short) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array12 = gPType11.getParents();
        gPType11.setName("hi!");
        gPType11.setId((int) (byte) 1);
        java.lang.String str17 = gPType11.toString();
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        int i19 = gPType1.getId();
        gPType1.setName(":-1");
        byte[] byte_array22 = gPType1.getParents();
        int i23 = gPType1.getId();
        byte[] byte_array24 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!:1" + "'", str17.equals("hi!:1"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertNull(byte_array22);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertNull(byte_array24);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test388");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        byte[] byte_array13 = gPType8.getChildren();
        byte[] byte_array14 = gPType8.getParents();
        java.lang.String str15 = gPType8.getName();
        java.lang.String str16 = gPType8.toString();
        byte[] byte_array17 = gPType8.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType19 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType21 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array22 = gPType21.getChildren();
        gPType21.addChild((byte) 1);
        int i25 = gPType21.getId();
        gPType21.addChild((byte) 0);
        gPType21.addParent((byte) 1);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType19, (io.github.agentsoz.jill.struct.AObject) gPType21);
        gPType21.setName("hi!:1");
        byte[] byte_array33 = gPType21.getParents();
        gPType21.setName("");
        gPType21.setName("hi!:1:-1");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType21);
        gPType8.addChild((byte) 1);
        gPType8.setName(":100:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":-1" + "'", str16.equals(":-1"));
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertNull(byte_array22);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(byte_array33);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test389");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType4, (io.github.agentsoz.jill.struct.AObject) gPType14);
        java.lang.String str16 = gPType4.getName();
        gPType4.addParent((byte) -1);
        int i19 = gPType4.getId();
        byte[] byte_array20 = gPType4.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertNotNull(byte_array20);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test390");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) -1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test391");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType1.addParent((byte) 100);
        gPType1.addChild((byte) 10);
        byte[] byte_array17 = gPType1.getChildren();
        java.lang.String str18 = gPType1.getName();
        java.lang.String str19 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test392");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType17);
        java.lang.String str19 = gPType17.getName();
        gPType17.addParent((byte) 1);
        gPType17.addParent((byte) 1);
        gPType17.setId((-1));
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType17);
        java.lang.String str27 = gPType1.toString();
        gPType1.addChild((byte) 10);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test393");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        gPType1.addParent((byte) 100);
        gPType1.addParent((byte) 10);
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, (io.github.agentsoz.jill.struct.AObject) gPType14);
        java.lang.String str16 = gPType14.getName();
        byte[] byte_array17 = gPType14.getParents();
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType14);
        gPType14.setName(":-1:-1");
        java.lang.String str21 = gPType14.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1:-1:-1" + "'", str21.equals(":-1:-1:-1"));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test394");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        gPType1.addParent((byte) -1);
        byte[] byte_array4 = gPType1.getParents();
        byte[] byte_array5 = gPType1.getParents();
        byte[] byte_array7 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, 1);
        byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, (int) (short) 100);
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, 0);
        org.junit.Assert.assertNotNull(byte_array4);
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test395");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        gPType7.addChild((byte) 0);
        gPType7.addParent((byte) 100);
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType7);
        java.lang.String str17 = gPType7.toString();
        int i18 = gPType7.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType20 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array21 = gPType20.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array24 = gPType23.getChildren();
        gPType23.addChild((byte) 1);
        java.lang.String str27 = gPType23.getName();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType20, (io.github.agentsoz.jill.struct.AObject) gPType23);
        byte[] byte_array29 = gPType23.getChildren();
        gPType23.setName("hi!:100");
        gPType23.setName("");
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType23);
        io.github.agentsoz.jill.struct.GoalPlanType gPType36 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array37 = gPType36.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType39 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array40 = gPType39.getChildren();
        gPType39.addChild((byte) 1);
        java.lang.String str43 = gPType39.getName();
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType36, (io.github.agentsoz.jill.struct.AObject) gPType39);
        int i45 = gPType39.getId();
        gPType39.addChild((byte) -1);
        java.lang.String str48 = gPType39.toString();
        gPType39.setId((int) '4');
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType23, (io.github.agentsoz.jill.struct.AObject) gPType39);
        gPType23.addChild((byte) -1);
        gPType23.setId((int) (short) -1);
        java.lang.String str56 = gPType23.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(byte_array29);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(byte_array37);
        org.junit.Assert.assertNull(byte_array40);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i45 == (-1));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + ":-1" + "'", str48.equals(":-1"));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + ":-1" + "'", str56.equals(":-1"));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test396");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        byte[] byte_array6 = gPType3.getParents();
        gPType3.addChild((byte) 10);
        gPType3.addChild((byte) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array13 = gPType12.getChildren();
        java.lang.String str14 = gPType12.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType18 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, (io.github.agentsoz.jill.struct.AObject) gPType18);
        gPType18.setName("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array25 = gPType24.getParents();
        gPType24.setName("hi!");
        gPType24.setId((int) (byte) 1);
        java.lang.String str30 = gPType24.getName();
        gPType24.setId((int) (byte) 100);
        gPType24.addChild((byte) 100);
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType18, (io.github.agentsoz.jill.struct.AObject) gPType24);
        io.github.agentsoz.jill.struct.GoalPlanType gPType37 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType39 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array40 = gPType39.getChildren();
        gPType39.addChild((byte) 1);
        int i43 = gPType39.getId();
        gPType39.addChild((byte) 0);
        gPType39.addParent((byte) 1);
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType37, (io.github.agentsoz.jill.struct.AObject) gPType39);
        byte[] byte_array49 = gPType37.getChildren();
        int i50 = gPType37.getId();
        gPType37.setName("hi!:-1");
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType18, (io.github.agentsoz.jill.struct.AObject) gPType37);
        gPType37.setId((int) (byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType57 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array58 = gPType57.getChildren();
        byte[] byte_array59 = gPType57.getParents();
        gPType57.setId((int) 'a');
        java.lang.String str62 = gPType57.toString();
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType37, (io.github.agentsoz.jill.struct.AObject) gPType57);
        boolean b64 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType57);
        byte[] byte_array65 = gPType57.getParents();
        java.lang.String str66 = gPType57.getName();
        byte[] byte_array67 = gPType57.getChildren();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ":-1" + "'", str14.equals(":-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(byte_array40);
        org.junit.Assert.assertTrue(i43 == (-1));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(byte_array49);
        org.junit.Assert.assertTrue(i50 == (-1));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(byte_array58);
        org.junit.Assert.assertNull(byte_array59);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + ":97" + "'", str62.equals(":97"));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNull(byte_array65);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        org.junit.Assert.assertNull(byte_array67);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test397");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        gPType7.addChild((byte) 0);
        gPType7.addParent((byte) 100);
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType7);
        java.lang.String str17 = gPType7.toString();
        gPType7.setName("hi!:-1:-1");
        gPType7.addParent((byte) 0);
        byte[] byte_array22 = gPType7.getChildren();
        byte[] byte_array24 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array22, 10);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertNotNull(byte_array24);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test398");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        int i4 = gPType1.getId();
        gPType1.setId((int) (byte) 10);
        gPType1.addParent((byte) 100);
        byte[] byte_array9 = gPType1.getParents();
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) (byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test399");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType8.setName("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        int i20 = gPType16.getId();
        java.lang.String str21 = gPType16.toString();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType16);
        gPType16.addChild((byte) 10);
        io.github.agentsoz.jill.struct.GoalPlanType gPType26 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType26.setId((int) (byte) -1);
        java.lang.String str29 = gPType26.getName();
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType26);
        java.lang.String str31 = gPType26.getName();
        byte[] byte_array32 = gPType26.getParents();
        gPType26.addChild((byte) -1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertNull(byte_array32);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test400");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":52");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        gPType6.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType6, (io.github.agentsoz.jill.struct.AObject) gPType16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        byte[] byte_array19 = gPType6.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType21 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType21, (io.github.agentsoz.jill.struct.AObject) gPType23);
        gPType23.addChild((byte) 0);
        int i27 = gPType23.getId();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType6, (io.github.agentsoz.jill.struct.AObject) gPType23);
        gPType6.setId(100);
        java.lang.String str31 = gPType6.toString();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i27 == (-1));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + ":100" + "'", str31.equals(":100"));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test401");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        int i11 = gPType4.getId();
        byte[] byte_array12 = gPType4.getChildren();
        byte[] byte_array14 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array12, (int) (byte) 0);
        byte[] byte_array16 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array14, 1);
        byte[] byte_array18 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array16, 52);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertNotNull(byte_array18);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test402");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1:-1:-1");
        java.lang.String str2 = gPType1.getName();
        gPType1.addChild((byte) 1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!:-1:-1:-1" + "'", str2.equals("hi!:-1:-1:-1"));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test403");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        byte[] byte_array13 = gPType8.getChildren();
        byte[] byte_array14 = gPType8.getParents();
        java.lang.String str15 = gPType8.getName();
        gPType8.addChild((byte) 0);
        io.github.agentsoz.jill.struct.GoalPlanType gPType19 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType21 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType19, (io.github.agentsoz.jill.struct.AObject) gPType21);
        byte[] byte_array23 = gPType21.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array26 = gPType25.getChildren();
        gPType25.addChild((byte) 1);
        int i29 = gPType25.getId();
        gPType25.addChild((byte) 0);
        gPType25.addParent((byte) 100);
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType21, (io.github.agentsoz.jill.struct.AObject) gPType25);
        java.lang.String str35 = gPType25.toString();
        gPType25.setName("hi!:-1:-1");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType25);
        gPType25.addParent((byte) 0);
        gPType25.addParent((byte) 10);
        gPType25.addParent((byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + ":-1" + "'", str35.equals(":-1"));
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test404");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        byte[] byte_array11 = gPType1.getParents();
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test405");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        byte[] byte_array10 = gPType1.getParents();
        java.lang.String str11 = gPType1.toString();
        gPType1.addParent((byte) 100);
        gPType1.addParent((byte) -1);
        gPType1.addChild((byte) 100);
        gPType1.setId((int) (byte) 0);
        gPType1.addParent((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1:-1:-1" + "'", str11.equals(":-1:-1:-1"));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test406");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        java.lang.String str6 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType10 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType10);
        byte[] byte_array12 = gPType10.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getChildren();
        gPType14.addChild((byte) 1);
        int i18 = gPType14.getId();
        gPType14.addChild((byte) 0);
        gPType14.addParent((byte) 100);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType10, (io.github.agentsoz.jill.struct.AObject) gPType14);
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType10);
        int i25 = gPType10.getId();
        java.lang.String str26 = gPType10.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType28 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array29 = gPType28.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType31 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array32 = gPType31.getChildren();
        gPType31.addChild((byte) 1);
        java.lang.String str35 = gPType31.getName();
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType28, (io.github.agentsoz.jill.struct.AObject) gPType31);
        int i37 = gPType31.getId();
        gPType31.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType41 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType31, (io.github.agentsoz.jill.struct.AObject) gPType41);
        java.lang.String str43 = gPType31.getName();
        gPType31.addParent((byte) -1);
        int i46 = gPType31.getId();
        gPType31.setName("hi!:-1:-1");
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType10, (io.github.agentsoz.jill.struct.AObject) gPType31);
        byte[] byte_array50 = gPType31.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + ":-1" + "'", str26.equals(":-1"));
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertNull(byte_array32);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i37 == (-1));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        org.junit.Assert.assertTrue(i46 == (-1));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(byte_array50);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test407");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        byte[] byte_array10 = gPType1.getParents();
        java.lang.String str11 = gPType1.toString();
        gPType1.addParent((byte) 100);
        byte[] byte_array14 = gPType1.getParents();
        gPType1.addChild((byte) 100);
        int i17 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1:-1:-1" + "'", str11.equals(":-1:-1:-1"));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test408");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType8.setName("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        int i20 = gPType16.getId();
        java.lang.String str21 = gPType16.toString();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType16);
        gPType16.addChild((byte) 10);
        io.github.agentsoz.jill.struct.GoalPlanType gPType26 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType26.setId((int) (byte) -1);
        java.lang.String str29 = gPType26.getName();
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType26);
        int i31 = gPType16.getId();
        gPType16.setName("hi!:1:-1");
        gPType16.setId(1);
        byte[] byte_array36 = gPType16.getChildren();
        gPType16.addChild((byte) 100);
        gPType16.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertNotNull(byte_array36);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test409");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getParents();
        int i16 = gPType14.getId();
        byte[] byte_array17 = gPType14.getChildren();
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType14);
        java.lang.String str19 = gPType14.toString();
        int i20 = gPType14.getId();
        java.lang.String str21 = gPType14.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test410");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType4, (io.github.agentsoz.jill.struct.AObject) gPType14);
        gPType14.addChild((byte) 0);
        byte[] byte_array18 = gPType14.getChildren();
        byte[] byte_array19 = gPType14.getParents();
        byte[] byte_array20 = gPType14.getChildren();
        int i21 = gPType14.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(byte_array18);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertNotNull(byte_array20);
        org.junit.Assert.assertTrue(i21 == (-1));
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test411");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        int i10 = gPType1.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array13 = gPType12.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array16 = gPType15.getChildren();
        gPType15.addChild((byte) 1);
        java.lang.String str19 = gPType15.getName();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, (io.github.agentsoz.jill.struct.AObject) gPType15);
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array23 = gPType22.getParents();
        gPType22.setId((int) (short) 10);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, (io.github.agentsoz.jill.struct.AObject) gPType22);
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType12);
        gPType1.addParent((byte) -1);
        byte[] byte_array30 = gPType1.getParents();
        int i31 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(byte_array30);
        org.junit.Assert.assertTrue(i31 == (-1));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test412");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("");
        gPType1.setId((int) (short) 1);
        java.lang.String str14 = gPType1.toString();
        byte[] byte_array15 = gPType1.getChildren();
        java.lang.String str16 = gPType1.toString();
        gPType1.setName(":1");
        gPType1.addChild((byte) -1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ":1" + "'", str14.equals(":1"));
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":1" + "'", str16.equals(":1"));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test413");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        java.lang.String str3 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType7);
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType7);
        byte[] byte_array10 = gPType1.getParents();
        java.lang.String str11 = gPType1.getName();
        gPType1.setId(0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test414");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getChildren();
        gPType14.addChild((byte) 1);
        java.lang.String str18 = gPType14.toString();
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType14);
        int i20 = gPType1.getId();
        byte[] byte_array21 = gPType1.getChildren();
        gPType1.addParent((byte) 0);
        gPType1.setName("hi!:-1:-1");
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertNull(byte_array21);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test415");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType8.setName("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        int i20 = gPType16.getId();
        java.lang.String str21 = gPType16.toString();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType16);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        int i25 = gPType24.getId();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType24);
        gPType16.setName(":-1:-1:-1:-1:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test416");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        int i10 = gPType1.getId();
        byte[] byte_array11 = gPType1.getParents();
        java.lang.String str12 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test417");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        gPType1.setId((int) '#');
        byte[] byte_array14 = gPType1.getChildren();
        gPType1.addChild((byte) 100);
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        gPType1.addParent((byte) 1);
        gPType1.setName(":100:-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType26 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType28 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array29 = gPType28.getChildren();
        gPType28.addChild((byte) 1);
        int i32 = gPType28.getId();
        gPType28.addChild((byte) 0);
        gPType28.addParent((byte) 1);
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType26, (io.github.agentsoz.jill.struct.AObject) gPType28);
        byte[] byte_array38 = gPType26.getChildren();
        int i39 = gPType26.getId();
        gPType26.setName("hi!:-1");
        int i42 = gPType26.getId();
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType26);
        byte[] byte_array44 = gPType26.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(byte_array38);
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue(i42 == (-1));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(byte_array44);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test418");
        io.github.agentsoz.jill.struct.AObject aObject0 = null;
        io.github.agentsoz.jill.struct.GoalPlanType gPType2 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b5 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType2, (io.github.agentsoz.jill.struct.AObject) gPType4);
        byte[] byte_array6 = gPType4.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getChildren();
        gPType8.addChild((byte) 1);
        int i12 = gPType8.getId();
        gPType8.addChild((byte) 0);
        gPType8.addParent((byte) 100);
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType4, (io.github.agentsoz.jill.struct.AObject) gPType8);
        java.lang.String str18 = gPType8.toString();
        gPType8.setId(0);
        java.lang.String str21 = gPType8.getName();
        try {
            boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject0, (io.github.agentsoz.jill.struct.AObject) gPType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test419");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        byte[] byte_array11 = gPType1.getParents();
        gPType1.addParent((byte) 1);
        gPType1.addChild((byte) 100);
        byte[] byte_array16 = gPType1.getChildren();
        gPType1.setName(":52");
        byte[] byte_array19 = gPType1.getParents();
        byte[] byte_array21 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array19, (int) 'a');
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertNotNull(byte_array21);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test420");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        byte[] byte_array6 = gPType3.getParents();
        byte[] byte_array7 = gPType3.getParents();
        java.lang.String str8 = gPType3.getName();
        gPType3.addChild((byte) 10);
        byte[] byte_array11 = gPType3.getChildren();
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, (int) '#');
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test421");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType1.addChild((byte) 100);
        java.lang.String str7 = gPType1.getName();
        gPType1.addChild((byte) 10);
        java.lang.String str10 = gPType1.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:1" + "'", str7.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:1:-1" + "'", str10.equals("hi!:1:-1"));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test422");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType4, (io.github.agentsoz.jill.struct.AObject) gPType14);
        java.lang.String str16 = gPType4.getName();
        gPType4.addParent((byte) -1);
        int i19 = gPType4.getId();
        gPType4.setName("hi!:-1:-1");
        gPType4.setId((int) (byte) 100);
        java.lang.String str24 = gPType4.getName();
        byte[] byte_array25 = gPType4.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!:-1:-1" + "'", str24.equals("hi!:-1:-1"));
        org.junit.Assert.assertNotNull(byte_array25);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test423");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        gPType7.addChild((byte) 0);
        gPType7.addParent((byte) 100);
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType7);
        int i17 = gPType3.getId();
        java.lang.String str18 = gPType3.toString();
        gPType3.setId((int) '4');
        gPType3.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType26 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType24, (io.github.agentsoz.jill.struct.AObject) gPType26);
        byte[] byte_array28 = gPType26.getParents();
        gPType26.setName("hi!:-1");
        byte[] byte_array31 = gPType26.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType33 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType35 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType33, (io.github.agentsoz.jill.struct.AObject) gPType35);
        java.lang.String str37 = gPType35.getName();
        gPType35.addParent((byte) 1);
        java.lang.String str40 = gPType35.toString();
        gPType35.addChild((byte) -1);
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType26, (io.github.agentsoz.jill.struct.AObject) gPType35);
        gPType35.addParent((byte) 1);
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType35);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + ":-1" + "'", str40.equals(":-1"));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test424");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        java.lang.String str3 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType7);
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType7);
        gPType7.setName("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array14 = gPType13.getParents();
        gPType13.setName("hi!");
        gPType13.setId((int) (byte) 1);
        java.lang.String str19 = gPType13.getName();
        gPType13.setId((int) (byte) 100);
        gPType13.addChild((byte) 100);
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType13);
        io.github.agentsoz.jill.struct.GoalPlanType gPType26 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType28 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array29 = gPType28.getChildren();
        gPType28.addChild((byte) 1);
        int i32 = gPType28.getId();
        gPType28.addChild((byte) 0);
        gPType28.addParent((byte) 1);
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType26, (io.github.agentsoz.jill.struct.AObject) gPType28);
        byte[] byte_array38 = gPType26.getChildren();
        int i39 = gPType26.getId();
        gPType26.setName("hi!:-1");
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType26);
        gPType26.addChild((byte) 10);
        gPType26.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(byte_array38);
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test425");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        java.lang.String str3 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array6 = gPType5.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getChildren();
        gPType8.addChild((byte) 1);
        java.lang.String str12 = gPType8.getName();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType8);
        int i14 = gPType8.getId();
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType19 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array20 = gPType19.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array23 = gPType22.getChildren();
        gPType22.addChild((byte) 1);
        java.lang.String str26 = gPType22.getName();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType19, (io.github.agentsoz.jill.struct.AObject) gPType22);
        int i28 = gPType22.getId();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType17, (io.github.agentsoz.jill.struct.AObject) gPType22);
        gPType17.setId((int) (byte) -1);
        gPType17.setName("hi!:-1");
        byte[] byte_array34 = gPType17.getChildren();
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType17);
        java.lang.String str36 = gPType17.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == (-1));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(byte_array34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!:-1" + "'", str36.equals("hi!:-1"));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test426");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        gPType7.addChild((byte) 0);
        gPType7.addParent((byte) 100);
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType7);
        io.github.agentsoz.jill.struct.GoalPlanType gPType18 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array19 = gPType18.getChildren();
        gPType18.addChild((byte) 1);
        java.lang.String str22 = gPType18.getName();
        java.lang.String str23 = gPType18.getName();
        int i24 = gPType18.getId();
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType18);
        byte[] byte_array26 = gPType7.getParents();
        java.lang.String str27 = gPType7.toString();
        java.lang.String str28 = gPType7.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(i24 == (-1));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(byte_array26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test427");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        byte[] byte_array3 = gPType1.getParents();
        gPType1.setId((int) (short) 100);
        java.lang.String str6 = gPType1.toString();
        java.lang.String str7 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType9, (io.github.agentsoz.jill.struct.AObject) gPType11);
        byte[] byte_array13 = gPType11.getParents();
        gPType11.setName("hi!:-1");
        java.lang.String str16 = gPType11.getName();
        gPType11.addParent((byte) -1);
        java.lang.String str19 = gPType11.getName();
        int i20 = gPType11.getId();
        java.lang.String str21 = gPType11.toString();
        int i22 = gPType11.getId();
        gPType11.setName(":52");
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":100" + "'", str6.equals(":100"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!:-1" + "'", str16.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!:-1:-1" + "'", str21.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test428");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        byte[] byte_array10 = gPType1.getParents();
        java.lang.String str11 = gPType1.toString();
        byte[] byte_array12 = gPType1.getParents();
        gPType1.addChild((byte) 100);
        gPType1.addParent((byte) 1);
        java.lang.String str17 = gPType1.getName();
        int i18 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1:-1:-1" + "'", str11.equals(":-1:-1:-1"));
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1:-1" + "'", str17.equals(":-1:-1"));
        org.junit.Assert.assertTrue(i18 == (-1));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test429");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        gPType1.setId((int) (byte) -1);
        byte[] byte_array16 = gPType1.getParents();
        java.lang.String str17 = gPType1.toString();
        byte[] byte_array18 = gPType1.getChildren();
        gPType1.addParent((byte) 100);
        byte[] byte_array21 = gPType1.getParents();
        java.lang.String str22 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNotNull(byte_array21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test430");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        gPType1.addParent((byte) -1);
        java.lang.String str10 = gPType1.toString();
        gPType1.setName("hi!:-1");
        gPType1.addChild((byte) 10);
        byte[] byte_array15 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ":-1" + "'", str10.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test431");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        gPType1.setId((int) 'a');
        gPType1.setId(1);
        gPType1.addParent((byte) 0);
        int i10 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test432");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType8.setName("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        int i20 = gPType16.getId();
        java.lang.String str21 = gPType16.toString();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType16);
        gPType16.addChild((byte) 10);
        io.github.agentsoz.jill.struct.GoalPlanType gPType26 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType26.setId((int) (byte) -1);
        java.lang.String str29 = gPType26.getName();
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType26);
        int i31 = gPType16.getId();
        gPType16.setName("hi!:1:-1");
        gPType16.setId(1);
        gPType16.addParent((byte) 100);
        java.lang.String str38 = gPType16.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!:1:-1" + "'", str38.equals("hi!:1:-1"));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test433");
        byte[] byte_array3 = new byte[] { (byte) 1, (byte) 0, (byte) 10 };
        byte[] byte_array5 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array3, 0);
        byte[] byte_array7 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, 10);
        byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, (int) ' ');
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) 'a');
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) '#');
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (short) 0);
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, 1);
        org.junit.Assert.assertNotNull(byte_array3);
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array17);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test434");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        gPType1.setId((int) (byte) -1);
        byte[] byte_array16 = gPType1.getParents();
        gPType1.addChild((byte) 10);
        io.github.agentsoz.jill.struct.GoalPlanType gPType20 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType20, (io.github.agentsoz.jill.struct.AObject) gPType22);
        byte[] byte_array24 = gPType20.getChildren();
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType20);
        io.github.agentsoz.jill.struct.GoalPlanType gPType27 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType27.setId((int) (byte) -1);
        gPType27.addParent((byte) -1);
        byte[] byte_array32 = gPType27.getParents();
        byte[] byte_array33 = gPType27.getChildren();
        gPType27.setId((int) (short) -1);
        gPType27.addChild((byte) 10);
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType27);
        gPType27.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertNull(byte_array33);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test435");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        int i8 = gPType3.getId();
        byte[] byte_array9 = gPType3.getChildren();
        int i10 = gPType3.getId();
        gPType3.setName(":-1:-1:-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        java.lang.String str15 = gPType14.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array18 = gPType17.getParents();
        gPType17.setName("hi!");
        gPType17.setName(":-1:-1");
        gPType17.addChild((byte) -1);
        gPType17.addParent((byte) 1);
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType14, (io.github.agentsoz.jill.struct.AObject) gPType17);
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType17);
        byte[] byte_array29 = gPType3.getParents();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ":-1:-1" + "'", str15.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(byte_array29);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test436");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":52");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        gPType6.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType6, (io.github.agentsoz.jill.struct.AObject) gPType16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        java.lang.String str19 = gPType6.getName();
        byte[] byte_array20 = gPType6.getParents();
        gPType6.setId(100);
        byte[] byte_array23 = gPType6.getChildren();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertNotNull(byte_array23);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test437");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        byte[] byte_array10 = gPType1.getParents();
        java.lang.String str11 = gPType1.toString();
        gPType1.addParent((byte) 100);
        byte[] byte_array14 = gPType1.getParents();
        byte[] byte_array15 = gPType1.getChildren();
        gPType1.addChild((byte) -1);
        gPType1.setName("hi!:-1:-1:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1:-1:-1" + "'", str11.equals(":-1:-1:-1"));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test438");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        byte[] byte_array11 = gPType1.getChildren();
        int i12 = gPType1.getId();
        gPType1.setId((int) (byte) 0);
        java.lang.String str15 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ":-1:-1:0" + "'", str15.equals(":-1:-1:0"));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test439");
        byte[] byte_array2 = new byte[] { (byte) 100, (byte) 0 };
        byte[] byte_array4 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, 1);
        byte[] byte_array6 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, (int) (short) 0);
        byte[] byte_array8 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, 10);
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array4);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array8);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test440");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        int i13 = gPType1.getId();
        gPType1.addChild((byte) -1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == (-1));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test441");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.setName("");
        gPType4.setId((int) (short) -1);
        byte[] byte_array15 = gPType4.getChildren();
        gPType4.addParent((byte) 10);
        byte[] byte_array18 = gPType4.getChildren();
        gPType4.addParent((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array18);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test442");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        int i4 = gPType1.getId();
        gPType1.setId((int) (byte) 10);
        java.lang.String str7 = gPType1.toString();
        gPType1.setId((int) (short) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ":10" + "'", str7.equals(":10"));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test443");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        gPType3.addParent((byte) 10);
        gPType3.setName("hi!:100");
        gPType3.setName(":52");
        java.lang.String str14 = gPType3.toString();
        java.lang.String str15 = gPType3.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ":52:-1" + "'", str14.equals(":52:-1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ":52" + "'", str15.equals(":52"));
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test444");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType8.setName("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        int i20 = gPType16.getId();
        java.lang.String str21 = gPType16.toString();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType16);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        int i25 = gPType24.getId();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType24);
        byte[] byte_array27 = gPType24.getParents();
        gPType24.setId(0);
        gPType24.addChild((byte) 10);
        byte[] byte_array32 = gPType24.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(byte_array27);
        org.junit.Assert.assertNull(byte_array32);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test445");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        java.lang.String str8 = gPType1.toString();
        gPType1.setName(":100:-1");
        gPType1.addChild((byte) 10);
        byte[] byte_array13 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ":-1" + "'", str8.equals(":-1"));
        org.junit.Assert.assertNull(byte_array13);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test446");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        byte[] byte_array3 = gPType1.getParents();
        byte[] byte_array4 = gPType1.getParents();
        gPType1.addChild((byte) -1);
        java.lang.String str7 = gPType1.getName();
        gPType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType11.setId((int) (byte) -1);
        gPType11.addParent((byte) -1);
        byte[] byte_array16 = gPType11.getParents();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test447");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType1.setName(":100:-1");
        gPType1.addParent((byte) 1);
        gPType1.addParent((byte) -1);
        java.lang.String str11 = gPType1.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":100:-1" + "'", str11.equals(":100:-1"));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test448");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        gPType24.addChild((byte) 1);
        java.lang.String str28 = gPType24.toString();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType24);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType24);
        int i31 = gPType1.getId();
        byte[] byte_array32 = gPType1.getChildren();
        gPType1.addChild((byte) -1);
        byte[] byte_array35 = gPType1.getChildren();
        byte[] byte_array36 = gPType1.getParents();
        byte[] byte_array37 = gPType1.getChildren();
        java.lang.String str38 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType40 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array41 = gPType40.getParents();
        gPType40.setName("hi!");
        gPType40.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType47 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array48 = gPType47.getParents();
        int i49 = gPType47.getId();
        byte[] byte_array50 = gPType47.getChildren();
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType40, (io.github.agentsoz.jill.struct.AObject) gPType47);
        gPType40.addParent((byte) 100);
        gPType40.addChild((byte) 10);
        gPType40.addChild((byte) 1);
        byte[] byte_array58 = gPType40.getParents();
        boolean b59 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType40);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertNotNull(byte_array35);
        org.junit.Assert.assertNotNull(byte_array36);
        org.junit.Assert.assertNotNull(byte_array37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + ":-1" + "'", str38.equals(":-1"));
        org.junit.Assert.assertNull(byte_array41);
        org.junit.Assert.assertNull(byte_array48);
        org.junit.Assert.assertTrue(i49 == (-1));
        org.junit.Assert.assertNull(byte_array50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(byte_array58);
        org.junit.Assert.assertTrue(b59 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test449");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        gPType7.addChild((byte) 0);
        gPType7.addParent((byte) 100);
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType7);
        java.lang.String str17 = gPType7.toString();
        gPType7.setId((int) (short) -1);
        java.lang.String str20 = gPType7.getName();
        int i21 = gPType7.getId();
        gPType7.setName("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType25.addParent((byte) 1);
        byte[] byte_array28 = gPType25.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType30 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array31 = gPType30.getChildren();
        gPType30.addChild((byte) 1);
        int i34 = gPType30.getId();
        gPType30.addChild((byte) 0);
        gPType30.addParent((byte) 1);
        gPType30.setName("hi!");
        gPType30.setId((int) '#');
        byte[] byte_array43 = gPType30.getChildren();
        gPType30.addChild((byte) 100);
        gPType30.addChild((byte) -1);
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType25, (io.github.agentsoz.jill.struct.AObject) gPType30);
        int i49 = gPType25.getId();
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType25);
        gPType7.setName("hi!:1:-1");
        gPType7.setId(97);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertNotNull(byte_array43);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i49 == (-1));
        org.junit.Assert.assertTrue(b50 == false);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test450");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        java.lang.String str3 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array6 = gPType5.getParents();
        byte[] byte_array7 = gPType5.getParents();
        byte[] byte_array8 = gPType5.getParents();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType5);
        int i10 = gPType5.getId();
        gPType5.setId(35);
        byte[] byte_array13 = gPType5.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array13);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test451");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        gPType24.addChild((byte) 1);
        java.lang.String str28 = gPType24.toString();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType24);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType24);
        int i31 = gPType1.getId();
        byte[] byte_array32 = gPType1.getChildren();
        gPType1.addChild((byte) -1);
        byte[] byte_array35 = gPType1.getChildren();
        gPType1.addParent((byte) 10);
        gPType1.addParent((byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertNotNull(byte_array35);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test452");
        byte[] byte_array0 = null;
        byte[] byte_array2 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array0, 97);
        org.junit.Assert.assertNotNull(byte_array2);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test453");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array10 = gPType9.getChildren();
        gPType9.addChild((byte) 1);
        int i13 = gPType9.getId();
        gPType9.addChild((byte) 0);
        gPType9.addParent((byte) 100);
        int i18 = gPType9.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType20 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array21 = gPType20.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array24 = gPType23.getChildren();
        gPType23.addChild((byte) 1);
        java.lang.String str27 = gPType23.getName();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType20, (io.github.agentsoz.jill.struct.AObject) gPType23);
        io.github.agentsoz.jill.struct.GoalPlanType gPType30 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array31 = gPType30.getParents();
        gPType30.setId((int) (short) 10);
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType20, (io.github.agentsoz.jill.struct.AObject) gPType30);
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType9, (io.github.agentsoz.jill.struct.AObject) gPType20);
        gPType20.setName("hi!:-1:-1");
        byte[] byte_array38 = gPType20.getParents();
        java.lang.String str39 = gPType20.getName();
        byte[] byte_array40 = gPType20.getChildren();
        int i41 = gPType20.getId();
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType20);
        java.lang.String str43 = gPType20.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(byte_array38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!:-1:-1" + "'", str39.equals("hi!:-1:-1"));
        org.junit.Assert.assertNull(byte_array40);
        org.junit.Assert.assertTrue(i41 == (-1));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!:-1:-1:-1" + "'", str43.equals("hi!:-1:-1:-1"));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test454");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1:-1:-1:-1:10");
        gPType1.addChild((byte) -1);
        gPType1.addChild((byte) 1);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test455");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str13 = gPType3.toString();
        java.lang.String str14 = gPType3.toString();
        gPType3.addParent((byte) -1);
        gPType3.setId(1);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ":-1" + "'", str13.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ":-1" + "'", str14.equals(":-1"));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test456");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        byte[] byte_array6 = gPType3.getParents();
        gPType3.addChild((byte) 10);
        gPType3.addChild((byte) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array13 = gPType12.getChildren();
        java.lang.String str14 = gPType12.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType18 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType18);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, (io.github.agentsoz.jill.struct.AObject) gPType18);
        gPType18.setName("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array25 = gPType24.getParents();
        gPType24.setName("hi!");
        gPType24.setId((int) (byte) 1);
        java.lang.String str30 = gPType24.getName();
        gPType24.setId((int) (byte) 100);
        gPType24.addChild((byte) 100);
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType18, (io.github.agentsoz.jill.struct.AObject) gPType24);
        io.github.agentsoz.jill.struct.GoalPlanType gPType37 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType39 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array40 = gPType39.getChildren();
        gPType39.addChild((byte) 1);
        int i43 = gPType39.getId();
        gPType39.addChild((byte) 0);
        gPType39.addParent((byte) 1);
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType37, (io.github.agentsoz.jill.struct.AObject) gPType39);
        byte[] byte_array49 = gPType37.getChildren();
        int i50 = gPType37.getId();
        gPType37.setName("hi!:-1");
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType18, (io.github.agentsoz.jill.struct.AObject) gPType37);
        gPType37.setId((int) (byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType57 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array58 = gPType57.getChildren();
        byte[] byte_array59 = gPType57.getParents();
        gPType57.setId((int) 'a');
        java.lang.String str62 = gPType57.toString();
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType37, (io.github.agentsoz.jill.struct.AObject) gPType57);
        boolean b64 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType57);
        int i65 = gPType57.getId();
        gPType57.addChild((byte) 100);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ":-1" + "'", str14.equals(":-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(byte_array40);
        org.junit.Assert.assertTrue(i43 == (-1));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(byte_array49);
        org.junit.Assert.assertTrue(i50 == (-1));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(byte_array58);
        org.junit.Assert.assertNull(byte_array59);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + ":97" + "'", str62.equals(":97"));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i65 == 97);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test457");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        gPType1.setId((int) '#');
        gPType1.setId((int) (short) 100);
        gPType1.setName(":52:-1");
        gPType1.addParent((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test458");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.setName(":-1:-1");
        gPType1.setName("hi!:35:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test459");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        gPType1.setId((int) (byte) -1);
        byte[] byte_array16 = gPType1.getParents();
        java.lang.String str17 = gPType1.toString();
        byte[] byte_array18 = gPType1.getChildren();
        gPType1.addParent((byte) 100);
        byte[] byte_array21 = gPType1.getParents();
        gPType1.addChild((byte) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array26 = gPType25.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType28 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array29 = gPType28.getChildren();
        gPType28.addChild((byte) 1);
        java.lang.String str32 = gPType28.getName();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType25, (io.github.agentsoz.jill.struct.AObject) gPType28);
        int i34 = gPType28.getId();
        gPType28.addChild((byte) -1);
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType28);
        io.github.agentsoz.jill.struct.GoalPlanType gPType39 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array40 = gPType39.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType42 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array43 = gPType42.getChildren();
        gPType42.addChild((byte) 1);
        java.lang.String str46 = gPType42.getName();
        java.lang.String str47 = gPType42.getName();
        int i48 = gPType42.getId();
        gPType42.setName(":-1:-1");
        byte[] byte_array51 = gPType42.getParents();
        java.lang.String str52 = gPType42.toString();
        gPType42.addParent((byte) -1);
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType39, (io.github.agentsoz.jill.struct.AObject) gPType42);
        java.lang.String str56 = gPType42.toString();
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType28, (io.github.agentsoz.jill.struct.AObject) gPType42);
        byte[] byte_array58 = gPType42.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType60 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType62 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array63 = gPType62.getChildren();
        gPType62.addChild((byte) 1);
        int i66 = gPType62.getId();
        gPType62.addChild((byte) 0);
        gPType62.addParent((byte) 1);
        boolean b71 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType60, (io.github.agentsoz.jill.struct.AObject) gPType62);
        io.github.agentsoz.jill.struct.GoalPlanType gPType73 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType75 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b76 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType73, (io.github.agentsoz.jill.struct.AObject) gPType75);
        byte[] byte_array77 = gPType75.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType79 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array80 = gPType79.getChildren();
        gPType79.addChild((byte) 1);
        int i83 = gPType79.getId();
        gPType79.addChild((byte) 0);
        gPType79.addParent((byte) 100);
        boolean b88 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType75, (io.github.agentsoz.jill.struct.AObject) gPType79);
        java.lang.String str89 = gPType79.toString();
        gPType79.setName("hi!:-1:-1");
        gPType79.addChild((byte) 1);
        boolean b94 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType62, (io.github.agentsoz.jill.struct.AObject) gPType79);
        gPType62.addParent((byte) 100);
        boolean b97 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType42, (io.github.agentsoz.jill.struct.AObject) gPType62);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNotNull(byte_array21);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(byte_array40);
        org.junit.Assert.assertNull(byte_array43);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue(i48 == (-1));
        org.junit.Assert.assertNull(byte_array51);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + ":-1:-1:-1" + "'", str52.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + ":-1:-1:-1" + "'", str56.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(byte_array58);
        org.junit.Assert.assertNull(byte_array63);
        org.junit.Assert.assertTrue(i66 == (-1));
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNull(byte_array77);
        org.junit.Assert.assertNull(byte_array80);
        org.junit.Assert.assertTrue(i83 == (-1));
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + ":-1" + "'", str89.equals(":-1"));
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertTrue(b97 == false);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test460");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setId((int) (byte) 1);
        java.lang.String str7 = gPType1.getName();
        gPType1.setId((int) (byte) 100);
        gPType1.addChild((byte) 100);
        gPType1.setId((int) (byte) 10);
        gPType1.addChild((byte) 1);
        gPType1.addChild((byte) 1);
        java.lang.String str18 = gPType1.toString();
        java.lang.String str19 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!:10" + "'", str18.equals("hi!:10"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test461");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.setId((int) (short) -1);
        byte[] byte_array10 = gPType1.getChildren();
        gPType1.setId(32);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array10);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test462");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        gPType1.addParent((byte) 100);
        gPType1.addChild((byte) 10);
        gPType1.addChild((byte) 1);
        byte[] byte_array19 = gPType1.getParents();
        gPType1.addParent((byte) 1);
        gPType1.addChild((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(byte_array19);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test463");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) 1);
        byte[] byte_array9 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array9);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test464");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":52:-1");
        java.lang.String str2 = gPType1.toString();
        gPType1.addParent((byte) 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ":52:-1:-1" + "'", str2.equals(":52:-1:-1"));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test465");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType1.setName(":100:-1");
        int i7 = gPType1.getId();
        gPType1.addChild((byte) 1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test466");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType19 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array20 = gPType19.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array23 = gPType22.getChildren();
        gPType22.addChild((byte) 1);
        java.lang.String str26 = gPType22.getName();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType19, (io.github.agentsoz.jill.struct.AObject) gPType22);
        gPType19.setId((int) (byte) 0);
        io.github.agentsoz.jill.struct.GoalPlanType gPType31 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array32 = gPType31.getChildren();
        gPType31.addChild((byte) 1);
        int i35 = gPType31.getId();
        java.lang.String str36 = gPType31.toString();
        gPType31.addChild((byte) 100);
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType19, (io.github.agentsoz.jill.struct.AObject) gPType31);
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType19);
        byte[] byte_array41 = gPType19.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType43 = new io.github.agentsoz.jill.struct.GoalPlanType(":10:-1");
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType19, (io.github.agentsoz.jill.struct.AObject) gPType43);
        gPType43.addParent((byte) 100);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(byte_array32);
        org.junit.Assert.assertTrue(i35 == (-1));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + ":-1" + "'", str36.equals(":-1"));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(byte_array41);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test467");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array14 = gPType13.getParents();
        gPType13.setId((int) (short) 10);
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType13);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array19 = gPType3.getChildren();
        gPType3.addChild((byte) -1);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(byte_array19);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test468");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        java.lang.String str20 = gPType16.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, (io.github.agentsoz.jill.struct.AObject) gPType16);
        int i22 = gPType16.getId();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType16);
        gPType11.setId((int) (byte) -1);
        byte[] byte_array26 = gPType11.getParents();
        java.lang.String str27 = gPType11.toString();
        byte[] byte_array28 = gPType11.getChildren();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        io.github.agentsoz.jill.struct.GoalPlanType gPType31 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType33 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType31, (io.github.agentsoz.jill.struct.AObject) gPType33);
        java.lang.String str35 = gPType33.getName();
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType33);
        byte[] byte_array37 = gPType33.getChildren();
        byte[] byte_array38 = gPType33.getParents();
        java.lang.String str39 = gPType33.getName();
        gPType33.addChild((byte) 100);
        byte[] byte_array42 = gPType33.getChildren();
        byte[] byte_array44 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array42, (int) (short) 100);
        byte[] byte_array46 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array42, 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(byte_array37);
        org.junit.Assert.assertNull(byte_array38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertNotNull(byte_array42);
        org.junit.Assert.assertNotNull(byte_array44);
        org.junit.Assert.assertNotNull(byte_array46);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test469");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        gPType24.addChild((byte) 1);
        java.lang.String str28 = gPType24.toString();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType24);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType24);
        byte[] byte_array31 = gPType1.getParents();
        gPType1.addChild((byte) 0);
        gPType1.addChild((byte) -1);
        java.lang.String str36 = gPType1.toString();
        byte[] byte_array37 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(byte_array31);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + ":-1" + "'", str36.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array37);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test470");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1:-1:-1:-1:10:-1");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test471");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        gPType7.addChild((byte) 0);
        gPType7.addParent((byte) 100);
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType7);
        java.lang.String str17 = gPType7.toString();
        gPType7.setId((int) (short) -1);
        java.lang.String str20 = gPType7.getName();
        int i21 = gPType7.getId();
        gPType7.setName("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType25.addParent((byte) 1);
        byte[] byte_array28 = gPType25.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType30 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array31 = gPType30.getChildren();
        gPType30.addChild((byte) 1);
        int i34 = gPType30.getId();
        gPType30.addChild((byte) 0);
        gPType30.addParent((byte) 1);
        gPType30.setName("hi!");
        gPType30.setId((int) '#');
        byte[] byte_array43 = gPType30.getChildren();
        gPType30.addChild((byte) 100);
        gPType30.addChild((byte) -1);
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType25, (io.github.agentsoz.jill.struct.AObject) gPType30);
        int i49 = gPType25.getId();
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType25);
        gPType7.setName("hi!:1:-1");
        java.lang.String str53 = gPType7.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertNotNull(byte_array43);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i49 == (-1));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!:1:-1" + "'", str53.equals("hi!:1:-1"));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test472");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        byte[] byte_array7 = gPType1.getParents();
        gPType1.setId((int) ' ');
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array7);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test473");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        java.lang.String str9 = gPType4.getName();
        int i10 = gPType4.getId();
        gPType4.setName(":-1:-1");
        byte[] byte_array13 = gPType4.getParents();
        java.lang.String str14 = gPType4.toString();
        gPType4.addParent((byte) -1);
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        java.lang.String str18 = gPType4.toString();
        byte[] byte_array19 = gPType4.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ":-1:-1:-1" + "'", str14.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1:-1:-1" + "'", str18.equals(":-1:-1:-1"));
        org.junit.Assert.assertNotNull(byte_array19);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test474");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        gPType1.setId((int) (byte) -1);
        gPType1.setName(":97");
        byte[] byte_array18 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array18);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test475");
        byte[] byte_array3 = new byte[] { (byte) 1, (byte) 0, (byte) 10 };
        byte[] byte_array5 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array3, 0);
        byte[] byte_array7 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, 10);
        byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, (int) ' ');
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, (int) (short) 1);
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, 0);
        org.junit.Assert.assertNotNull(byte_array3);
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test476");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) -1);
        gPType1.setName("hi!:-1:-1");
        int i8 = gPType1.getId();
        gPType1.setName("hi!:-1:-1:-1");
        java.lang.String str11 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getParents();
        byte[] byte_array15 = gPType13.getParents();
        gPType13.setId((int) (short) 100);
        java.lang.String str18 = gPType13.toString();
        java.lang.String str19 = gPType13.getName();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType13);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:-1:-1:-1:-1" + "'", str11.equals("hi!:-1:-1:-1:-1"));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":100" + "'", str18.equals(":100"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test477");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        java.lang.String str2 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array5 = gPType4.getParents();
        gPType4.setName("hi!");
        gPType4.setName(":-1:-1");
        gPType4.addChild((byte) -1);
        gPType4.addParent((byte) 1);
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i15 = gPType4.getId();
        gPType4.setId(52);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ":-1:-1" + "'", str2.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == (-1));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test478");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType17);
        java.lang.String str19 = gPType17.getName();
        gPType17.addParent((byte) 1);
        gPType17.addParent((byte) 1);
        gPType17.setId((-1));
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType17);
        gPType1.setId((int) (byte) -1);
        byte[] byte_array29 = gPType1.getParents();
        byte[] byte_array30 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertNull(byte_array30);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test479");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        gPType1.addParent((byte) -1);
        gPType1.addChild((byte) 100);
        byte[] byte_array6 = gPType1.getChildren();
        byte[] byte_array8 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array6, 32);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array8);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test480");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setId((int) (short) 10);
        gPType1.setId((int) (short) -1);
        java.lang.String str7 = gPType1.getName();
        byte[] byte_array8 = gPType1.getParents();
        gPType1.addChild((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(byte_array8);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test481");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        int i17 = gPType13.getId();
        gPType13.addChild((byte) 0);
        gPType13.addParent((byte) 1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType13);
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        gPType24.addChild((byte) 1);
        java.lang.String str28 = gPType24.toString();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType24);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType24);
        gPType24.setName(":-1:-1:-1");
        java.lang.String str33 = gPType24.getName();
        byte[] byte_array34 = gPType24.getChildren();
        java.lang.String str35 = gPType24.toString();
        java.lang.String str36 = gPType24.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + ":-1:-1:-1" + "'", str33.equals(":-1:-1:-1"));
        org.junit.Assert.assertNotNull(byte_array34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + ":-1:-1:-1:-1" + "'", str35.equals(":-1:-1:-1:-1"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + ":-1:-1:-1:-1" + "'", str36.equals(":-1:-1:-1:-1"));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test482");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        int i10 = gPType1.getId();
        java.lang.String str11 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        java.lang.String str20 = gPType16.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, (io.github.agentsoz.jill.struct.AObject) gPType16);
        int i22 = gPType16.getId();
        gPType16.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType26 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType26);
        java.lang.String str28 = gPType16.getName();
        gPType16.addParent((byte) -1);
        int i31 = gPType16.getId();
        gPType16.addChild((byte) 0);
        gPType16.setId(0);
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType16);
        byte[] byte_array37 = gPType16.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(byte_array37);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test483");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        int i8 = gPType3.getId();
        byte[] byte_array9 = gPType3.getChildren();
        int i10 = gPType3.getId();
        gPType3.setName(":-1:-1:-1:-1");
        java.lang.String str13 = gPType3.getName();
        gPType3.setId((int) (short) 10);
        java.lang.String str16 = gPType3.toString();
        gPType3.addChild((byte) 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ":-1:-1:-1:-1" + "'", str13.equals(":-1:-1:-1:-1"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":-1:-1:-1:-1:10" + "'", str16.equals(":-1:-1:-1:-1:10"));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test484");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setId((int) (byte) 1);
        java.lang.String str7 = gPType1.toString();
        int i8 = gPType1.getId();
        int i9 = gPType1.getId();
        int i10 = gPType1.getId();
        java.lang.String str11 = gPType1.getName();
        java.lang.String str12 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:1" + "'", str7.equals("hi!:1"));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test485");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array10 = gPType9.getChildren();
        gPType9.addChild((byte) 1);
        int i13 = gPType9.getId();
        gPType9.addChild((byte) 0);
        gPType9.addParent((byte) 100);
        int i18 = gPType9.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType20 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array21 = gPType20.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array24 = gPType23.getChildren();
        gPType23.addChild((byte) 1);
        java.lang.String str27 = gPType23.getName();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType20, (io.github.agentsoz.jill.struct.AObject) gPType23);
        io.github.agentsoz.jill.struct.GoalPlanType gPType30 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array31 = gPType30.getParents();
        gPType30.setId((int) (short) 10);
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType20, (io.github.agentsoz.jill.struct.AObject) gPType30);
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType9, (io.github.agentsoz.jill.struct.AObject) gPType20);
        gPType20.setName("hi!:-1:-1");
        byte[] byte_array38 = gPType20.getParents();
        java.lang.String str39 = gPType20.getName();
        byte[] byte_array40 = gPType20.getChildren();
        int i41 = gPType20.getId();
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType20);
        gPType20.addChild((byte) -1);
        gPType20.addChild((byte) -1);
        gPType20.addChild((byte) 10);
        int i49 = gPType20.getId();
        java.lang.String str50 = gPType20.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(byte_array38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!:-1:-1" + "'", str39.equals("hi!:-1:-1"));
        org.junit.Assert.assertNull(byte_array40);
        org.junit.Assert.assertTrue(i41 == (-1));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i49 == (-1));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!:-1:-1" + "'", str50.equals("hi!:-1:-1"));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test486");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        java.lang.String str3 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType7);
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType7);
        byte[] byte_array10 = gPType1.getParents();
        gPType1.setId(10);
        byte[] byte_array13 = gPType1.getChildren();
        gPType1.addParent((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertNull(byte_array13);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test487");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setId((int) (byte) 1);
        java.lang.String str7 = gPType1.getName();
        gPType1.setId((int) (byte) 100);
        gPType1.addChild((byte) 100);
        gPType1.setId((int) (byte) 10);
        byte[] byte_array14 = gPType1.getChildren();
        gPType1.setName("hi!:100");
        gPType1.addChild((byte) -1);
        byte[] byte_array19 = gPType1.getChildren();
        gPType1.setName("hi!:1:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array24 = gPType23.getParents();
        int i25 = gPType23.getId();
        gPType23.addChild((byte) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType29 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType31 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType29, (io.github.agentsoz.jill.struct.AObject) gPType31);
        java.lang.String str33 = gPType29.toString();
        gPType29.addChild((byte) -1);
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType23, (io.github.agentsoz.jill.struct.AObject) gPType29);
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType29);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!:1:-1" + "'", str33.equals("hi!:1:-1"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test488");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        java.lang.String str9 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        java.lang.String str20 = gPType16.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, (io.github.agentsoz.jill.struct.AObject) gPType16);
        int i22 = gPType16.getId();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType16);
        gPType11.setId((int) (byte) -1);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        gPType11.addParent((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ":-1:-1" + "'", str9.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test489");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1:-1:-1:-1:10");
        byte[] byte_array2 = gPType1.getParents();
        byte[] byte_array3 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test490");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType6 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array7 = gPType6.getChildren();
        gPType6.addChild((byte) 1);
        java.lang.String str10 = gPType6.getName();
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType6);
        int i12 = gPType6.getId();
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType6);
        gPType1.setId((int) (byte) -1);
        byte[] byte_array16 = gPType1.getParents();
        java.lang.String str17 = gPType1.toString();
        gPType1.setName("");
        gPType1.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test491");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.setName("");
        byte[] byte_array13 = gPType4.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test492");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        java.lang.String str3 = gPType1.toString();
        java.lang.String str4 = gPType1.toString();
        gPType1.setName(":52");
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array12 = gPType11.getChildren();
        gPType11.addChild((byte) 1);
        java.lang.String str15 = gPType11.getName();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType11);
        int i17 = gPType11.getId();
        gPType11.setId((-1));
        int i20 = gPType11.getId();
        gPType11.setName(":100");
        java.lang.String str23 = gPType11.toString();
        java.lang.String str24 = gPType11.toString();
        int i25 = gPType11.getId();
        gPType11.setId((-1));
        java.lang.String str28 = gPType11.toString();
        byte[] byte_array29 = gPType11.getParents();
        gPType11.addChild((byte) 100);
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        gPType1.addChild((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ":100:-1" + "'", str23.equals(":100:-1"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + ":100:-1" + "'", str24.equals(":100:-1"));
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":100:-1" + "'", str28.equals(":100:-1"));
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test493");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        gPType16.addChild((byte) 1);
        java.lang.String str20 = gPType16.getName();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, (io.github.agentsoz.jill.struct.AObject) gPType16);
        int i22 = gPType16.getId();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType16);
        gPType11.setId((int) (byte) -1);
        byte[] byte_array26 = gPType11.getParents();
        java.lang.String str27 = gPType11.toString();
        byte[] byte_array28 = gPType11.getChildren();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        io.github.agentsoz.jill.struct.GoalPlanType gPType31 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType33 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType31, (io.github.agentsoz.jill.struct.AObject) gPType33);
        java.lang.String str35 = gPType33.getName();
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType33);
        byte[] byte_array37 = gPType33.getChildren();
        byte[] byte_array38 = gPType33.getParents();
        gPType33.addParent((byte) 1);
        byte[] byte_array41 = gPType33.getChildren();
        java.lang.String str42 = gPType33.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(byte_array37);
        org.junit.Assert.assertNull(byte_array38);
        org.junit.Assert.assertNull(byte_array41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + ":-1" + "'", str42.equals(":-1"));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test494");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        byte[] byte_array6 = gPType3.getParents();
        gPType3.addChild((byte) 10);
        int i9 = gPType3.getId();
        gPType3.addParent((byte) 100);
        gPType3.setName(":10");
        gPType3.addParent((byte) -1);
        gPType3.addChild((byte) 100);
        gPType3.addParent((byte) 100);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue(i9 == (-1));
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test495");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array9 = gPType8.getParents();
        int i10 = gPType8.getId();
        byte[] byte_array11 = gPType8.getChildren();
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getParents();
        int i16 = gPType14.getId();
        byte[] byte_array17 = gPType14.getChildren();
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType14);
        byte[] byte_array19 = gPType14.getParents();
        int i20 = gPType14.getId();
        java.lang.String str21 = gPType14.toString();
        gPType14.setName("hi!:35");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test496");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        java.lang.String str6 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType10 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType10);
        byte[] byte_array12 = gPType10.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getChildren();
        gPType14.addChild((byte) 1);
        int i18 = gPType14.getId();
        gPType14.addChild((byte) 0);
        gPType14.addParent((byte) 100);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType10, (io.github.agentsoz.jill.struct.AObject) gPType14);
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType10);
        byte[] byte_array25 = gPType1.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType27 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array28 = gPType27.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType30 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array31 = gPType30.getChildren();
        gPType30.addChild((byte) 1);
        java.lang.String str34 = gPType30.getName();
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType27, (io.github.agentsoz.jill.struct.AObject) gPType30);
        io.github.agentsoz.jill.struct.GoalPlanType gPType37 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array38 = gPType37.getParents();
        gPType37.setId((int) (short) 10);
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType27, (io.github.agentsoz.jill.struct.AObject) gPType37);
        byte[] byte_array42 = gPType37.getParents();
        gPType37.addChild((byte) -1);
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType37);
        java.lang.String str46 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(byte_array38);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(byte_array42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + ":-1" + "'", str46.equals(":-1"));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test497");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        java.lang.String str6 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType10 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType10);
        byte[] byte_array12 = gPType10.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getChildren();
        gPType14.addChild((byte) 1);
        int i18 = gPType14.getId();
        gPType14.addChild((byte) 0);
        gPType14.addParent((byte) 100);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType10, (io.github.agentsoz.jill.struct.AObject) gPType14);
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType10);
        int i25 = gPType1.getId();
        gPType1.addParent((byte) 10);
        java.lang.String str28 = gPType1.toString();
        gPType1.addChild((byte) -1);
        int i31 = gPType1.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType33 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType35 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType33, (io.github.agentsoz.jill.struct.AObject) gPType35);
        byte[] byte_array37 = gPType35.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType39 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array40 = gPType39.getChildren();
        gPType39.addChild((byte) 1);
        int i43 = gPType39.getId();
        gPType39.addChild((byte) 0);
        gPType39.addParent((byte) 100);
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType35, (io.github.agentsoz.jill.struct.AObject) gPType39);
        java.lang.String str49 = gPType39.toString();
        gPType39.setId((int) (short) -1);
        java.lang.String str52 = gPType39.getName();
        int i53 = gPType39.getId();
        gPType39.setId(1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType57 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array58 = gPType57.getChildren();
        gPType57.addChild((byte) 1);
        java.lang.String str61 = gPType57.getName();
        java.lang.String str62 = gPType57.getName();
        java.lang.String str63 = gPType57.getName();
        byte[] byte_array64 = gPType57.getChildren();
        boolean b65 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType39, (io.github.agentsoz.jill.struct.AObject) gPType57);
        int i66 = gPType39.getId();
        byte[] byte_array67 = gPType39.getChildren();
        byte[] byte_array68 = gPType39.getChildren();
        boolean b69 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType39);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(byte_array37);
        org.junit.Assert.assertNull(byte_array40);
        org.junit.Assert.assertTrue(i43 == (-1));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + ":-1" + "'", str49.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        org.junit.Assert.assertTrue(i53 == (-1));
        org.junit.Assert.assertNull(byte_array58);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
        org.junit.Assert.assertNotNull(byte_array64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(i66 == 1);
        org.junit.Assert.assertNotNull(byte_array67);
        org.junit.Assert.assertNotNull(byte_array68);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test498");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) -1);
        byte[] byte_array6 = gPType1.getParents();
        byte[] byte_array7 = gPType1.getChildren();
        gPType1.setId((int) (short) -1);
        gPType1.addChild((byte) 10);
        java.lang.String str12 = gPType1.toString();
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1" + "'", str12.equals(":-1"));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test499");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        java.lang.String str8 = gPType3.getName();
        int i9 = gPType3.getId();
        java.lang.String str10 = gPType3.toString();
        java.lang.String str11 = gPType3.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:-1" + "'", str8.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1:-1" + "'", str10.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:-1:-1" + "'", str11.equals("hi!:-1:-1"));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest3.test500");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        java.lang.String str5 = gPType1.toString();
        java.lang.String str6 = gPType1.toString();
        gPType1.setName(":-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
    }
}

