package io.github.agentsoz.jill.struct;

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
public class GPTypeRegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test001");
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
        java.lang.String str19 = gPType11.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":10" + "'", str18.equals(":10"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":10" + "'", str19.equals(":10"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test002");
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
        gPType1.setName(":-1:-1:-1:-1");
        gPType1.addParent((byte) 1);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertNull(byte_array18);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test003");
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
        gPType20.setName("hi!:-1");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test004");
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
        int i16 = gPType8.getId();
        gPType8.setId((-1));
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == (-1));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test005");
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
        gPType26.setId((int) (byte) 100);
        byte[] byte_array45 = gPType26.getParents();
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
        org.junit.Assert.assertNull(byte_array45);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test006");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        byte[] byte_array3 = gPType1.getParents();
        byte[] byte_array4 = gPType1.getChildren();
        java.lang.String str5 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ":-1" + "'", str5.equals(":-1"));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test007");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        gPType1.setId((int) 'a');
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        java.lang.String str12 = gPType7.toString();
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
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType16);
        byte[] byte_array31 = gPType7.getParents();
        int i32 = gPType7.getId();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType7);
        io.github.agentsoz.jill.struct.GoalPlanType gPType35 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType37 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType35, (io.github.agentsoz.jill.struct.AObject) gPType37);
        gPType35.setName(":100:-1");
        java.lang.String str41 = gPType35.toString();
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType35);
        gPType35.addChild((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1" + "'", str12.equals(":-1"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertTrue(i24 == (-1));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + ":100:-1:-1" + "'", str41.equals(":100:-1:-1"));
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test008");
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
        gPType1.addChild((byte) 10);
        int i22 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i22 == (-1));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test009");
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
        byte[] byte_array19 = gPType1.getChildren();
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1" + "'", str12.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1:-1:-1" + "'", str17.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(byte_array19);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test010");
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
        gPType1.addParent((byte) 1);
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
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test011");
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
        gPType4.addParent((byte) -1);
        gPType4.setName(":52:-1");
        gPType4.setName("hi!:-1:-1");
        byte[] byte_array22 = gPType4.getChildren();
        byte[] byte_array23 = gPType4.getChildren();
        int i24 = gPType4.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertNotNull(byte_array23);
        org.junit.Assert.assertTrue(i24 == (-1));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test012");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType3.setName("hi!:1");
        gPType3.addParent((byte) 100);
        gPType3.setId((int) (byte) -1);
        java.lang.String str19 = gPType3.toString();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:1:-1" + "'", str19.equals("hi!:1:-1"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test013");
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
        gPType1.addChild((byte) 0);
        byte[] byte_array29 = gPType1.getParents();
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
        org.junit.Assert.assertNull(byte_array29);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test014");
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
        gPType28.addParent((byte) 1);
        gPType28.addParent((byte) 0);
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
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test015");
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
        java.lang.String str20 = gPType14.toString();
        gPType14.setName("hi!:1:1");
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + ":-1" + "'", str20.equals(":-1"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test016");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setId((int) (byte) 100);
        byte[] byte_array7 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test017");
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
        gPType1.setName(":-1:-1");
        byte[] byte_array19 = gPType1.getParents();
        gPType1.addParent((byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(byte_array19);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test018");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        gPType3.addParent((byte) 10);
        gPType3.setName("hi!:100");
        gPType3.setName(":-1:-1");
        gPType3.setName("hi!");
        gPType3.addParent((byte) 1);
        gPType3.addParent((byte) 1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test019");
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
        java.lang.String str15 = gPType4.getName();
        gPType4.addChild((byte) 0);
        byte[] byte_array18 = gPType4.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(byte_array18);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test020");
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
        gPType4.addParent((byte) -1);
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
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test021");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        byte[] byte_array6 = gPType3.getParents();
        gPType3.addChild((byte) 1);
        gPType3.addChild((byte) -1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test022");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        gPType1.addParent((byte) -1);
        gPType1.addChild((byte) 100);
        byte[] byte_array6 = gPType1.getParents();
        byte[] byte_array7 = gPType1.getParents();
        gPType1.setName("hi!:35");
        gPType1.setId((int) ' ');
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test023");
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
        java.lang.String str41 = gPType1.toString();
        java.lang.String str42 = gPType1.toString();
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
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + ":-1" + "'", str41.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + ":-1" + "'", str42.equals(":-1"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test024");
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
        gPType3.setName(":1");
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
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test025");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) 10);
        int i6 = gPType1.getId();
        gPType1.setId((-1));
        org.junit.Assert.assertTrue(i6 == (-1));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test026");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        byte[] byte_array10 = gPType1.getChildren();
        java.lang.String str11 = gPType1.getName();
        gPType1.addChild((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test027");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setId((int) (short) 10);
        gPType1.setId((int) (short) -1);
        gPType1.addParent((byte) -1);
        org.junit.Assert.assertNull(byte_array2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test028");
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
        byte[] byte_array20 = gPType14.getChildren();
        gPType14.setId((int) '4');
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
        org.junit.Assert.assertNull(byte_array20);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test029");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        gPType1.addParent((byte) 100);
        gPType1.setName("");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test030");
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
        gPType1.addChild((byte) -1);
        byte[] byte_array19 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertNull(byte_array19);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test031");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
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
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array23 = gPType22.getParents();
        gPType22.setName("hi!");
        java.lang.String str26 = gPType22.toString();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType22);
        byte[] byte_array28 = gPType22.getParents();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType22);
        java.lang.String str30 = gPType22.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:-1" + "'", str26.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1" + "'", str30.equals("hi!:-1"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test032");
        byte[] byte_array3 = new byte[] { (byte) 1, (byte) 0, (byte) 10 };
        byte[] byte_array5 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array3, 0);
        byte[] byte_array7 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, 10);
        byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, (int) ' ');
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) 'a');
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) '#');
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) ' ');
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array15, (int) (short) 0);
        byte[] byte_array19 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array15, 1);
        byte[] byte_array21 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array19, (int) (short) 100);
        org.junit.Assert.assertNotNull(byte_array3);
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertNotNull(byte_array21);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test033");
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
        byte[] byte_array22 = gPType3.getChildren();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1:-1:-1:-1" + "'", str21.equals(":-1:-1:-1:-1"));
        org.junit.Assert.assertNull(byte_array22);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test034");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        int i2 = gPType1.getId();
        java.lang.String str3 = gPType1.toString();
        gPType1.setName(":-1");
        gPType1.addParent((byte) 1);
        java.lang.String str8 = gPType1.toString();
        org.junit.Assert.assertTrue(i2 == (-1));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!:-1" + "'", str3.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ":-1:-1" + "'", str8.equals(":-1:-1"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test035");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:0");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test036");
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
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType22.setName("hi!");
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType22);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + ":100" + "'", str20.equals(":100"));
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test037");
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
        java.lang.String str19 = gPType3.getName();
        gPType3.setId((int) (byte) -1);
        gPType3.addChild((byte) 10);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test038");
        byte[] byte_array3 = new byte[] { (byte) 1, (byte) 0, (byte) 10 };
        byte[] byte_array5 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array3, 0);
        byte[] byte_array7 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, 10);
        byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, (int) ' ');
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) 'a');
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) '#');
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, 10);
        org.junit.Assert.assertNotNull(byte_array3);
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test039");
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
        byte[] byte_array17 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(byte_array17);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test040");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array13 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array18 = gPType17.getChildren();
        gPType17.addChild((byte) 1);
        int i21 = gPType17.getId();
        gPType17.addChild((byte) 0);
        gPType17.addParent((byte) 1);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType17);
        io.github.agentsoz.jill.struct.GoalPlanType gPType28 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array29 = gPType28.getChildren();
        gPType28.addChild((byte) 1);
        java.lang.String str32 = gPType28.toString();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType28);
        gPType15.setId((int) (short) 1);
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType15);
        gPType15.setId(100);
        java.lang.String str39 = gPType15.getName();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + ":-1" + "'", str32.equals(":-1"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + ":-1" + "'", str39.equals(":-1"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test041");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        gPType1.setId((int) 'a');
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        java.lang.String str12 = gPType7.toString();
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
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType16);
        byte[] byte_array31 = gPType7.getParents();
        int i32 = gPType7.getId();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType7);
        io.github.agentsoz.jill.struct.GoalPlanType gPType35 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType37 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType35, (io.github.agentsoz.jill.struct.AObject) gPType37);
        gPType35.setName(":100:-1");
        java.lang.String str41 = gPType35.toString();
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType35);
        gPType35.addChild((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1" + "'", str12.equals(":-1"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertTrue(i24 == (-1));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + ":100:-1:-1" + "'", str41.equals(":100:-1:-1"));
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test042");
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
        gPType7.addChild((byte) -1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test043");
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
        int i19 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test044");
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
        java.lang.String str32 = gPType16.getName();
        gPType16.addParent((byte) -1);
        gPType16.addParent((byte) 100);
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
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test045");
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
        gPType7.addParent((byte) 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue(i18 == (-1));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test046");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        gPType1.setName("");
        gPType1.addChild((byte) 10);
        gPType1.addChild((byte) 0);
        int i10 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue(i10 == (-1));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test047");
        byte[] byte_array3 = new byte[] { (byte) 1, (byte) 0, (byte) 10 };
        byte[] byte_array5 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array3, 0);
        byte[] byte_array7 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, 10);
        byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, (int) ' ');
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) 'a');
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) '#');
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) ' ');
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, 35);
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
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test048");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType1.addChild((byte) 100);
        java.lang.String str7 = gPType1.toString();
        java.lang.String str8 = gPType1.getName();
        int i9 = gPType1.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:-1" + "'", str7.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == (-1));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test049");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        java.lang.String str10 = gPType1.getName();
        gPType1.addChild((byte) -1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test050");
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
        int i19 = gPType11.getId();
        gPType11.addParent((byte) 1);
        gPType11.setId(0);
        gPType11.setId((int) (byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!:1" + "'", str17.equals("hi!:1"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test051");
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
        gPType1.setName("hi!:35:-1");
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test052");
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
        byte[] byte_array22 = gPType14.getParents();
        gPType14.addParent((byte) 1);
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
        org.junit.Assert.assertNotNull(byte_array22);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test053");
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
        java.lang.String str16 = gPType3.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType18 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType18.addParent((byte) 1);
        byte[] byte_array21 = gPType18.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array24 = gPType23.getChildren();
        gPType23.addChild((byte) 1);
        int i27 = gPType23.getId();
        gPType23.addChild((byte) 0);
        gPType23.addParent((byte) 1);
        gPType23.setName("hi!");
        gPType23.setId((int) '#');
        byte[] byte_array36 = gPType23.getChildren();
        gPType23.addChild((byte) 100);
        gPType23.addChild((byte) -1);
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType18, (io.github.agentsoz.jill.struct.AObject) gPType23);
        int i42 = gPType18.getId();
        gPType18.setId((int) (short) 10);
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType18);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ":-1" + "'", str13.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":-1" + "'", str16.equals(":-1"));
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue(i27 == (-1));
        org.junit.Assert.assertNotNull(byte_array36);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == (-1));
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test054");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        byte[] byte_array10 = gPType4.getChildren();
        byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (int) (byte) 0);
        byte[] byte_array14 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array12, (int) ' ');
        byte[] byte_array16 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array12, (int) ' ');
        byte[] byte_array18 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array16, (int) (byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertNotNull(byte_array18);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test055");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        java.lang.String str10 = gPType1.getName();
        java.lang.String str11 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array14 = gPType13.getChildren();
        gPType13.addChild((byte) 1);
        java.lang.String str17 = gPType13.getName();
        java.lang.String str18 = gPType13.getName();
        int i19 = gPType13.getId();
        gPType13.setName(":-1:-1");
        byte[] byte_array22 = gPType13.getParents();
        gPType13.addChild((byte) 1);
        int i25 = gPType13.getId();
        gPType13.setName("hi!:-1:-1:-1");
        byte[] byte_array28 = gPType13.getParents();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType13);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertNull(byte_array22);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test056");
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
        byte[] byte_array16 = gPType3.getParents();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ":-1" + "'", str13.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test057");
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
        byte[] byte_array19 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array19);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test058");
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
        gPType1.setName("hi!");
        int i22 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertTrue(i22 == (-1));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test059");
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
        gPType1.addParent((byte) -1);
        byte[] byte_array21 = gPType1.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array24 = gPType23.getChildren();
        gPType23.addChild((byte) 1);
        int i27 = gPType23.getId();
        gPType23.addChild((byte) 0);
        gPType23.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType33 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType35 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array36 = gPType35.getChildren();
        gPType35.addChild((byte) 1);
        int i39 = gPType35.getId();
        gPType35.addChild((byte) 0);
        gPType35.addParent((byte) 1);
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType33, (io.github.agentsoz.jill.struct.AObject) gPType35);
        io.github.agentsoz.jill.struct.GoalPlanType gPType46 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array47 = gPType46.getChildren();
        gPType46.addChild((byte) 1);
        java.lang.String str50 = gPType46.toString();
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType33, (io.github.agentsoz.jill.struct.AObject) gPType46);
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType23, (io.github.agentsoz.jill.struct.AObject) gPType46);
        int i53 = gPType23.getId();
        byte[] byte_array54 = gPType23.getChildren();
        gPType23.addChild((byte) -1);
        byte[] byte_array57 = gPType23.getChildren();
        byte[] byte_array58 = gPType23.getParents();
        boolean b59 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType23);
        gPType23.setId((int) (short) -1);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(byte_array21);
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue(i27 == (-1));
        org.junit.Assert.assertNull(byte_array36);
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(byte_array47);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + ":-1" + "'", str50.equals(":-1"));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i53 == (-1));
        org.junit.Assert.assertNotNull(byte_array54);
        org.junit.Assert.assertNotNull(byte_array57);
        org.junit.Assert.assertNotNull(byte_array58);
        org.junit.Assert.assertTrue(b59 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test060");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        java.lang.String str4 = gPType1.toString();
        int i5 = gPType1.getId();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.toString();
        gPType1.addChild((byte) 0);
        java.lang.String str10 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ":-1" + "'", str7.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ":-1" + "'", str10.equals(":-1"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test061");
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
        byte[] byte_array19 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType21 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType23 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array24 = gPType23.getChildren();
        gPType23.addChild((byte) 1);
        int i27 = gPType23.getId();
        gPType23.addChild((byte) 0);
        gPType23.addParent((byte) 1);
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType21, (io.github.agentsoz.jill.struct.AObject) gPType23);
        gPType23.addChild((byte) 1);
        java.lang.String str35 = gPType23.toString();
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType23);
        io.github.agentsoz.jill.struct.GoalPlanType gPType38 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array39 = gPType38.getParents();
        gPType38.setName("hi!");
        gPType38.setId((int) (byte) 1);
        java.lang.String str44 = gPType38.getName();
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType23, (io.github.agentsoz.jill.struct.AObject) gPType38);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue(i27 == (-1));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + ":-1" + "'", str35.equals(":-1"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(byte_array39);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test062");
        byte[] byte_array3 = new byte[] { (byte) 1, (byte) 0, (byte) 10 };
        byte[] byte_array5 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array3, 0);
        byte[] byte_array7 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, 10);
        byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, (int) ' ');
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) 'a');
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, (int) (byte) 100);
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, 35);
        org.junit.Assert.assertNotNull(byte_array3);
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test063");
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
        int i16 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1:-1:-1" + "'", str11.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue(i16 == (-1));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test064");
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
        int i19 = gPType14.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test065");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        gPType1.addParent((byte) -1);
        byte[] byte_array4 = gPType1.getParents();
        byte[] byte_array5 = gPType1.getParents();
        byte[] byte_array6 = gPType1.getParents();
        java.lang.String str7 = gPType1.getName();
        org.junit.Assert.assertNotNull(byte_array4);
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:-1" + "'", str7.equals("hi!:-1"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test066");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        byte[] byte_array3 = gPType1.getParents();
        byte[] byte_array4 = gPType1.getParents();
        gPType1.addChild((byte) -1);
        java.lang.String str7 = gPType1.getName();
        gPType1.setId((int) (short) 10);
        java.lang.String str10 = gPType1.toString();
        gPType1.addParent((byte) -1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ":10" + "'", str10.equals(":10"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test067");
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
        byte[] byte_array60 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array58, 52);
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
        org.junit.Assert.assertNotNull(byte_array60);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test068");
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
        io.github.agentsoz.jill.struct.AObject aObject30 = null;
        try {
            boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, aObject30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
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
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test069");
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
        io.github.agentsoz.jill.struct.GoalPlanType gPType60 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType62 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array63 = gPType62.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType65 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array66 = gPType65.getChildren();
        gPType65.addChild((byte) 1);
        java.lang.String str69 = gPType65.getName();
        boolean b70 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType62, (io.github.agentsoz.jill.struct.AObject) gPType65);
        io.github.agentsoz.jill.struct.GoalPlanType gPType72 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array73 = gPType72.getParents();
        gPType72.setId((int) (short) 10);
        boolean b76 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType62, (io.github.agentsoz.jill.struct.AObject) gPType72);
        boolean b77 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType60, (io.github.agentsoz.jill.struct.AObject) gPType62);
        gPType60.addParent((byte) 10);
        gPType60.addParent((byte) 1);
        int i82 = gPType60.getId();
        java.lang.String str83 = gPType60.toString();
        java.lang.String str84 = gPType60.getName();
        boolean b85 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType42, (io.github.agentsoz.jill.struct.AObject) gPType60);
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
        org.junit.Assert.assertNull(byte_array66);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "" + "'", str69.equals(""));
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(byte_array73);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(i82 == (-1));
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "hi!:-1:-1" + "'", str83.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "hi!:-1" + "'", str84.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b85 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test070");
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
        gPType14.setId(10);
        java.lang.String str23 = gPType14.getName();
        java.lang.String str24 = gPType14.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(byte_array18);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertNotNull(byte_array20);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ":-1" + "'", str23.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + ":-1:10" + "'", str24.equals(":-1:10"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test071");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) -1);
        gPType1.setName("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array10 = gPType9.getChildren();
        gPType9.addChild((byte) 1);
        int i13 = gPType9.getId();
        gPType9.addChild((byte) 0);
        gPType9.addParent((byte) 1);
        gPType9.setName("hi!");
        gPType9.setId((int) '#');
        byte[] byte_array22 = gPType9.getChildren();
        gPType9.addChild((byte) 100);
        gPType9.addChild((byte) -1);
        gPType9.addParent((byte) 1);
        gPType9.addParent((byte) 1);
        gPType9.addParent((byte) -1);
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType9);
        gPType1.addChild((byte) -1);
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test072");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        java.lang.String str4 = gPType1.toString();
        gPType1.setName(":-1:-1");
        java.lang.String str7 = gPType1.getName();
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) 1);
        java.lang.String str12 = gPType1.getName();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ":-1:-1" + "'", str7.equals(":-1:-1"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1:-1" + "'", str12.equals(":-1:-1"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test073");
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
        int i19 = gPType11.getId();
        gPType11.addParent((byte) 1);
        byte[] byte_array22 = gPType11.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!:1" + "'", str17.equals("hi!:1"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNotNull(byte_array22);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test074");
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
        gPType1.setId((int) (byte) 10);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test075");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        gPType1.addParent((byte) -1);
        gPType1.addChild((byte) 100);
        byte[] byte_array6 = gPType1.getParents();
        byte[] byte_array7 = gPType1.getParents();
        java.lang.String str8 = gPType1.getName();
        gPType1.setName(":100");
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array13 = gPType12.getChildren();
        gPType12.addChild((byte) 1);
        int i16 = gPType12.getId();
        gPType12.addChild((byte) 0);
        java.lang.String str19 = gPType12.toString();
        byte[] byte_array20 = gPType12.getChildren();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType12);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:-1" + "'", str8.equals("hi!:-1"));
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test076");
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
        gPType16.setId(1);
        gPType16.setName("hi!:35:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test077");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        byte[] byte_array8 = gPType1.getChildren();
        gPType1.addParent((byte) 0);
        java.lang.String str11 = gPType1.toString();
        java.lang.String str12 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1" + "'", str11.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1" + "'", str12.equals(":-1"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test078");
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
        gPType8.setId((int) (byte) 10);
        gPType8.setId(0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(byte_array14);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test079");
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
        gPType7.setId(1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array22);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test080");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        java.lang.String str2 = gPType1.toString();
        gPType1.addParent((byte) 0);
        gPType1.addChild((byte) 10);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ":-1" + "'", str2.equals(":-1"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test081");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        java.lang.String str4 = gPType1.toString();
        int i5 = gPType1.getId();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.toString();
        gPType1.addChild((byte) 0);
        gPType1.setId((int) ' ');
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ":-1" + "'", str7.equals(":-1"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test082");
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
        java.lang.String str23 = gPType7.getName();
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
        gPType25.setName(":52");
        byte[] byte_array42 = gPType25.getParents();
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType25);
        gPType7.addChild((byte) 10);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!:-1:-1" + "'", str22.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:-1:-1" + "'", str23.equals("hi!:-1:-1"));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(byte_array42);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test083");
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
        byte[] byte_array20 = gPType14.getChildren();
        int i21 = gPType14.getId();
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
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertTrue(i21 == (-1));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test084");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        int i8 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test085");
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
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array26 = gPType25.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType28 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array29 = gPType28.getChildren();
        gPType28.addChild((byte) 1);
        java.lang.String str32 = gPType28.getName();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType25, (io.github.agentsoz.jill.struct.AObject) gPType28);
        int i34 = gPType28.getId();
        gPType28.setId((-1));
        int i37 = gPType28.getId();
        gPType28.setName(":100");
        java.lang.String str40 = gPType28.toString();
        java.lang.String str41 = gPType28.toString();
        int i42 = gPType28.getId();
        gPType28.addParent((byte) -1);
        gPType28.addParent((byte) 10);
        byte[] byte_array47 = gPType28.getChildren();
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType28);
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
        org.junit.Assert.assertTrue(i37 == (-1));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + ":100:-1" + "'", str40.equals(":100:-1"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + ":100:-1" + "'", str41.equals(":100:-1"));
        org.junit.Assert.assertTrue(i42 == (-1));
        org.junit.Assert.assertNotNull(byte_array47);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test086");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) 1);
        byte[] byte_array6 = gPType1.getParents();
        byte[] byte_array7 = gPType1.getParents();
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test087");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        gPType1.setName(":52:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test088");
        byte[] byte_array3 = new byte[] { (byte) 1, (byte) 0, (byte) 10 };
        byte[] byte_array5 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array3, 0);
        byte[] byte_array7 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, 10);
        byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, (int) ' ');
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) 'a');
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) '#');
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (byte) 0);
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array15, (int) (byte) 1);
        byte[] byte_array19 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array15, 35);
        org.junit.Assert.assertNotNull(byte_array3);
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertNotNull(byte_array19);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test089");
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
        java.lang.String str19 = gPType4.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1" + "'", str19.equals(":-1"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test090");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.setName("");
        gPType1.addParent((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test091");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        byte[] byte_array6 = gPType3.getParents();
        gPType3.addParent((byte) 10);
        gPType3.setId(10);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test092");
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
        java.lang.String str24 = gPType15.toString();
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
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!:0" + "'", str24.equals("hi!:0"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test093");
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
        gPType1.addParent((byte) 100);
        gPType1.addParent((byte) 100);
        gPType1.setId(35);
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
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test094");
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
        gPType1.setName("hi!");
        gPType1.addChild((byte) 100);
        int i31 = gPType1.getId();
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
        org.junit.Assert.assertTrue(i31 == (-1));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test095");
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
        gPType1.addParent((byte) -1);
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
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test096");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        java.lang.String str8 = gPType3.getName();
        gPType3.addParent((byte) -1);
        java.lang.String str11 = gPType3.getName();
        java.lang.String str12 = gPType3.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:-1" + "'", str8.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:-1" + "'", str11.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1:-1" + "'", str12.equals("hi!:-1:-1"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test097");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        byte[] byte_array9 = gPType1.getParents();
        byte[] byte_array10 = gPType1.getParents();
        gPType1.addParent((byte) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array18 = gPType17.getChildren();
        gPType17.addChild((byte) 1);
        java.lang.String str21 = gPType17.getName();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType14, (io.github.agentsoz.jill.struct.AObject) gPType17);
        int i23 = gPType17.getId();
        gPType17.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType27 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType17, (io.github.agentsoz.jill.struct.AObject) gPType27);
        gPType27.addChild((byte) 0);
        byte[] byte_array31 = gPType27.getChildren();
        byte[] byte_array32 = gPType27.getParents();
        byte[] byte_array33 = gPType27.getChildren();
        gPType27.setId(10);
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType27);
        gPType27.addChild((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(byte_array31);
        org.junit.Assert.assertNull(byte_array32);
        org.junit.Assert.assertNotNull(byte_array33);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test098");
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
        int i19 = gPType11.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 10);
        org.junit.Assert.assertTrue(i19 == 10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test099");
        byte[] byte_array5 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 10 };
        byte[] byte_array7 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, (int) '4');
        byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, (int) '#');
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, (int) 'a');
        try {
            byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test100");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        gPType1.setName("");
        gPType1.addChild((byte) 10);
        gPType1.addChild((byte) 0);
        byte[] byte_array10 = gPType1.getParents();
        java.lang.String str11 = gPType1.getName();
        byte[] byte_array12 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test101");
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
        java.lang.String str23 = gPType7.getName();
        gPType7.setId((int) (byte) 0);
        gPType7.addChild((byte) -1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!:-1:-1" + "'", str22.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:-1:-1" + "'", str23.equals("hi!:-1:-1"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test102");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        byte[] byte_array8 = gPType1.getChildren();
        java.lang.String str9 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ":-1" + "'", str9.equals(":-1"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test103");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        int i6 = gPType3.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue(i6 == (-1));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test104");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        gPType1.setName("");
        gPType1.addChild((byte) 10);
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test105");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.addParent((byte) 10);
        gPType4.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test106");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        byte[] byte_array6 = gPType3.getParents();
        gPType3.addChild((byte) 10);
        int i9 = gPType3.getId();
        gPType3.addParent((byte) 1);
        gPType3.setName(":52");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue(i9 == (-1));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test107");
        byte[] byte_array3 = new byte[] { (byte) 1, (byte) 0, (byte) 10 };
        byte[] byte_array5 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array3, 0);
        byte[] byte_array7 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, 10);
        byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, (int) ' ');
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) 'a');
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, (int) (byte) 100);
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, 0);
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array15, 1);
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
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test108");
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
        gPType1.setId((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":100" + "'", str28.equals(":100"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test109");
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
        gPType1.addParent((byte) 100);
        byte[] byte_array21 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(byte_array21);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test110");
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
        gPType7.addParent((byte) 100);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test111");
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
        gPType3.addParent((byte) 0);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test112");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType3.setName("hi!:1");
        gPType3.addParent((byte) 100);
        gPType3.setId((int) (byte) -1);
        byte[] byte_array19 = gPType3.getChildren();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(byte_array19);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test113");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        gPType3.addParent((byte) 1);
        java.lang.String str8 = gPType3.toString();
        gPType3.addChild((byte) -1);
        int i11 = gPType3.getId();
        byte[] byte_array12 = gPType3.getParents();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ":-1" + "'", str8.equals(":-1"));
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test114");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":10");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test115");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        int i2 = gPType1.getId();
        java.lang.String str3 = gPType1.toString();
        gPType1.setName(":-1");
        gPType1.addParent((byte) 10);
        java.lang.String str8 = gPType1.getName();
        byte[] byte_array9 = gPType1.getChildren();
        org.junit.Assert.assertTrue(i2 == (-1));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!:-1" + "'", str3.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ":-1" + "'", str8.equals(":-1"));
        org.junit.Assert.assertNull(byte_array9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test116");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setId((int) (short) 10);
        gPType1.setId((int) (short) -1);
        java.lang.String str7 = gPType1.getName();
        gPType1.addChild((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test117");
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
        gPType14.setName(":-1:-1:-1");
        gPType14.addParent((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(byte_array18);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertNotNull(byte_array20);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test118");
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
        gPType1.setName(":-1:-1:-1:-1");
        byte[] byte_array21 = gPType1.getChildren();
        byte[] byte_array22 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertNull(byte_array22);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test119");
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
        java.lang.String str25 = gPType15.getName();
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
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test120");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1:-1:-1");
        gPType1.addChild((byte) -1);
        gPType1.addChild((byte) 1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test121");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        gPType4.addChild((byte) 0);
        gPType4.setId((int) '#');
        java.lang.String str15 = gPType4.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test122");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.addParent((byte) 1);
        byte[] byte_array4 = gPType1.getChildren();
        gPType1.setName("hi!");
        gPType1.setId((int) (short) 100);
        gPType1.addParent((byte) -1);
        java.lang.String str11 = gPType1.getName();
        gPType1.addChild((byte) -1);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test123");
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
        byte[] byte_array65 = gPType3.getParents();
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
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test124");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) -1);
        gPType1.addParent((byte) 100);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test125");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":100:10");
        gPType1.addParent((byte) 1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test126");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        byte[] byte_array4 = gPType1.getChildren();
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        byte[] byte_array9 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNotNull(byte_array9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test127");
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
        byte[] byte_array66 = gPType57.getChildren();
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
        org.junit.Assert.assertNull(byte_array66);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test128");
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
        gPType1.setName("hi!:100");
        java.lang.String str25 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:100" + "'", str25.equals("hi!:100"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test129");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        int i12 = gPType1.getId();
        gPType1.setId(0);
        gPType1.setName("");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test130");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":52:-1");
        gPType1.addParent((byte) 100);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test131");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setId((int) (short) 10);
        java.lang.String str5 = gPType1.getName();
        byte[] byte_array6 = gPType1.getParents();
        gPType1.addChild((byte) 1);
        gPType1.addParent((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test132");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:35");
        java.lang.String str2 = gPType1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!:35:-1" + "'", str2.equals("hi!:35:-1"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test133");
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
        java.lang.String str30 = gPType1.toString();
        gPType1.setName("hi!:-1:-1:-1");
        java.lang.String str33 = gPType1.getName();
        byte[] byte_array34 = gPType1.getParents();
        byte[] byte_array36 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array34, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + ":-1" + "'", str30.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!:-1:-1:-1" + "'", str33.equals("hi!:-1:-1:-1"));
        org.junit.Assert.assertNotNull(byte_array34);
        org.junit.Assert.assertNotNull(byte_array36);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test134");
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
        byte[] byte_array40 = gPType15.getParents();
        gPType15.addParent((byte) 1);
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
        org.junit.Assert.assertNull(byte_array40);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test135");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str13 = gPType1.toString();
        byte[] byte_array14 = gPType1.getParents();
        int i15 = gPType1.getId();
        byte[] byte_array16 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ":-1:-1" + "'", str13.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertNull(byte_array16);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test136");
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
        byte[] byte_array43 = gPType33.getChildren();
        try {
            byte[] byte_array45 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array43, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
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
        org.junit.Assert.assertNotNull(byte_array43);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test137");
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
        byte[] byte_array22 = gPType7.getChildren();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertNotNull(byte_array22);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test138");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        java.lang.String str2 = gPType1.getName();
        java.lang.String str3 = gPType1.getName();
        int i4 = gPType1.getId();
        gPType1.addChild((byte) 1);
        byte[] byte_array7 = gPType1.getChildren();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!:-1" + "'", str2.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!:-1" + "'", str3.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNotNull(byte_array7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test139");
        byte[] byte_array2 = new byte[] { (byte) 100, (byte) 0 };
        byte[] byte_array4 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, 1);
        byte[] byte_array6 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, (int) (short) 0);
        byte[] byte_array8 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, (int) (byte) 1);
        byte[] byte_array10 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array8, (int) (byte) 100);
        byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (int) '4');
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array4);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test140");
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
        int i25 = gPType13.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 100);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test141");
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
        gPType3.setId((int) (short) 1);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test142");
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
        java.lang.String str38 = gPType33.toString();
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
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + ":-1" + "'", str38.equals(":-1"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test143");
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
        gPType8.setName(":100");
        java.lang.String str36 = gPType8.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType38 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType38.setId((int) (byte) -1);
        java.lang.String str41 = gPType38.toString();
        gPType38.setId((int) (byte) 0);
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType38);
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
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + ":100:10" + "'", str36.equals(":100:10"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!:1:-1" + "'", str41.equals("hi!:1:-1"));
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test144");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType1.addChild((byte) 100);
        java.lang.String str7 = gPType1.toString();
        java.lang.String str8 = gPType1.getName();
        byte[] byte_array9 = gPType1.getParents();
        int i10 = gPType1.getId();
        gPType1.setName(":-1:-1:-1");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:-1" + "'", str7.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test145");
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
        gPType14.addParent((byte) -1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test146");
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
        int i36 = gPType28.getId();
        int i37 = gPType28.getId();
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType28);
        gPType1.setName("");
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(i37 == (-1));
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test147");
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
        int i16 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(i16 == (-1));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test148");
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
        java.lang.String str19 = gPType14.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(byte_array18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ":-1:-1" + "'", str19.equals(":-1:-1"));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test149");
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
        gPType3.addParent((byte) -1);
        java.lang.String str18 = gPType3.toString();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!:1:-1" + "'", str18.equals("hi!:1:-1"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test150");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        byte[] byte_array4 = gPType1.getChildren();
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 10);
        gPType1.setId((int) (short) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array4);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test151");
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
        gPType1.setName(":-1:1");
        gPType1.addChild((byte) -1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test152");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        int i8 = gPType1.getId();
        gPType1.addChild((byte) 0);
        byte[] byte_array11 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test153");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        gPType1.setId((int) (short) 0);
        gPType1.addChild((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType10 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array13 = gPType12.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array16 = gPType15.getChildren();
        gPType15.addChild((byte) 1);
        java.lang.String str19 = gPType15.getName();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, (io.github.agentsoz.jill.struct.AObject) gPType15);
        int i21 = gPType15.getId();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType10, (io.github.agentsoz.jill.struct.AObject) gPType15);
        gPType10.setId((int) (byte) -1);
        byte[] byte_array25 = gPType10.getParents();
        gPType10.addChild((byte) -1);
        gPType10.addParent((byte) 0);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType10);
        byte[] byte_array31 = gPType10.getChildren();
        gPType10.setId((int) (byte) 0);
        java.lang.String str34 = gPType10.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(byte_array31);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test154");
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
        byte[] byte_array31 = gPType24.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1" + "'", str28.equals(":-1"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(byte_array31);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test155");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        byte[] byte_array9 = gPType1.getParents();
        gPType1.addParent((byte) -1);
        gPType1.setName("hi!:100");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test156");
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
        gPType1.addParent((byte) 100);
        gPType1.setId((int) '4');
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
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test157");
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
        gPType57.setId((int) '4');
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
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test158");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setId((int) (byte) 1);
        java.lang.String str7 = gPType1.getName();
        gPType1.setId((int) (byte) 100);
        gPType1.addChild((byte) 10);
        java.lang.String str12 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test159");
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
        java.lang.String str31 = gPType8.toString();
        java.lang.String str32 = gPType8.getName();
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
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + ":-1" + "'", str31.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test160");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.setId((int) (short) -1);
        byte[] byte_array10 = gPType1.getChildren();
        byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (int) (short) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test161");
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
        gPType14.setName(":-1:-1:-1:-1");
        gPType14.addParent((byte) 0);
        java.lang.String str24 = gPType14.toString();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + ":-1:-1:-1:-1:-1" + "'", str24.equals(":-1:-1:-1:-1:-1"));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test162");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType1.getChildren();
        gPType1.addParent((byte) -1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test163");
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
        gPType1.addParent((byte) 1);
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
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test164");
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
        java.lang.String str14 = gPType3.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ":-1:-1:-1:-1" + "'", str13.equals(":-1:-1:-1:-1"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ":-1:-1:-1:-1" + "'", str14.equals(":-1:-1:-1:-1"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test165");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        byte[] byte_array12 = gPType1.getParents();
        byte[] byte_array14 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array12, (int) (byte) 0);
        byte[] byte_array16 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array12, (int) (byte) 0);
        byte[] byte_array18 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array16, (int) (short) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertNotNull(byte_array18);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test166");
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
        gPType4.addChild((byte) -1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertNotNull(byte_array24);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test167");
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
        gPType1.addChild((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue(i13 == (-1));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test168");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        byte[] byte_array3 = gPType1.getParents();
        byte[] byte_array4 = gPType1.getParents();
        gPType1.addChild((byte) -1);
        java.lang.String str7 = gPType1.getName();
        gPType1.setId((int) (short) 10);
        java.lang.String str10 = gPType1.toString();
        gPType1.setName(":100");
        gPType1.setName(":-1:10");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ":10" + "'", str10.equals(":10"));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test169");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        int i11 = gPType4.getId();
        gPType4.setId((int) '4');
        gPType4.addChild((byte) 1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array18 = gPType17.getChildren();
        byte[] byte_array19 = gPType17.getParents();
        gPType17.setId((int) 'a');
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType4, (io.github.agentsoz.jill.struct.AObject) gPType17);
        java.lang.String str23 = gPType17.getName();
        gPType17.addParent((byte) 0);
        gPType17.addParent((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test170");
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
        gPType1.setId(10);
        gPType1.addChild((byte) 100);
        java.lang.String str21 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":10" + "'", str21.equals(":10"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test171");
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
        gPType1.setName("hi!");
        java.lang.String str29 = gPType1.getName();
        java.lang.String str30 = gPType1.toString();
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
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1" + "'", str30.equals("hi!:-1"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test172");
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
        java.lang.String str23 = gPType7.getName();
        gPType7.addChild((byte) 0);
        byte[] byte_array26 = gPType7.getParents();
        gPType7.setId((int) (short) 10);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!:-1:-1" + "'", str22.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:-1:-1" + "'", str23.equals("hi!:-1:-1"));
        org.junit.Assert.assertNotNull(byte_array26);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test173");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array13 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array18 = gPType17.getChildren();
        gPType17.addChild((byte) 1);
        int i21 = gPType17.getId();
        gPType17.addChild((byte) 0);
        gPType17.addParent((byte) 1);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType17);
        io.github.agentsoz.jill.struct.GoalPlanType gPType28 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array29 = gPType28.getChildren();
        gPType28.addChild((byte) 1);
        java.lang.String str32 = gPType28.toString();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType28);
        gPType15.setId((int) (short) 1);
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType15);
        int i37 = gPType15.getId();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + ":-1" + "'", str32.equals(":-1"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(i37 == 1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test174");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType1.toString();
        byte[] byte_array6 = gPType1.getParents();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:1:-1" + "'", str5.equals("hi!:1:-1"));
        org.junit.Assert.assertNull(byte_array6);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test175");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        byte[] byte_array10 = gPType1.getChildren();
        gPType1.setName("hi!:10");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array10);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test176");
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
        byte[] byte_array22 = gPType14.getParents();
        byte[] byte_array24 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array22, (int) (short) 100);
        byte[] byte_array26 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array22, (int) (byte) 0);
        byte[] byte_array28 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array22, (int) (short) 0);
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
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertNotNull(byte_array24);
        org.junit.Assert.assertNotNull(byte_array26);
        org.junit.Assert.assertNotNull(byte_array28);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test177");
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
        gPType1.setName("hi!:1:1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test178");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        gPType1.addParent((byte) -1);
        byte[] byte_array4 = gPType1.getParents();
        byte[] byte_array5 = gPType1.getParents();
        byte[] byte_array7 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, (int) 'a');
        byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, 1);
        org.junit.Assert.assertNotNull(byte_array4);
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array9);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test179");
        byte[] byte_array0 = null;
        byte[] byte_array2 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array0, (int) (byte) 0);
        byte[] byte_array4 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array4);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test180");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        gPType1.setName("");
        gPType1.addChild((byte) 10);
        java.lang.String str8 = gPType1.getName();
        java.lang.String str9 = gPType1.getName();
        java.lang.String str10 = gPType1.toString();
        gPType1.setName("hi!:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ":-1" + "'", str10.equals(":-1"));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test181");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        byte[] byte_array6 = gPType1.getChildren();
        java.lang.String str7 = gPType1.getName();
        byte[] byte_array8 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(byte_array8);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test182");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) -1);
        byte[] byte_array6 = gPType1.getChildren();
        gPType1.setId((int) (byte) 100);
        byte[] byte_array9 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array9);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test183");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.setId((int) (short) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        gPType11.addParent((byte) -1);
        gPType11.addChild((byte) 100);
        byte[] byte_array16 = gPType11.getParents();
        byte[] byte_array17 = gPType11.getParents();
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        int i19 = gPType11.getId();
        gPType11.addParent((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test184");
        io.github.agentsoz.jill.struct.AObject aObject0 = null;
        io.github.agentsoz.jill.struct.GoalPlanType gPType2 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b5 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType2, (io.github.agentsoz.jill.struct.AObject) gPType4);
        gPType2.addChild((byte) 100);
        try {
            boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject0, (io.github.agentsoz.jill.struct.AObject) gPType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test185");
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
        gPType1.addChild((byte) 1);
        gPType1.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test186");
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
        java.lang.String str31 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test187");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array13 = gPType1.getChildren();
        gPType1.setId((int) (byte) 1);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array13);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test188");
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
        byte[] byte_array44 = gPType1.getChildren();
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
        org.junit.Assert.assertNotNull(byte_array44);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test189");
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
        gPType3.addParent((byte) 100);
        gPType3.setName(":52:-1");
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
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test190");
        byte[] byte_array0 = null;
        byte[] byte_array2 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array0, (int) (short) 0);
        org.junit.Assert.assertNotNull(byte_array2);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test191");
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
        byte[] byte_array23 = gPType7.getParents();
        byte[] byte_array24 = gPType7.getParents();
        gPType7.addChild((byte) 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertNotNull(byte_array23);
        org.junit.Assert.assertNotNull(byte_array24);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test192");
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
        gPType3.setName("hi!:-1:-1:-1:-1");
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test193");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setId((int) (byte) 1);
        java.lang.String str7 = gPType1.getName();
        gPType1.setId((int) (byte) 100);
        gPType1.addChild((byte) 100);
        gPType1.setId((int) (byte) 10);
        gPType1.setName("hi!:1");
        int i16 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue(i16 == 10);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test194");
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
        gPType4.setId(0);
        gPType4.setName(":-1");
        gPType4.setName("hi!:-1");
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
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test195");
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
        java.lang.String str30 = gPType1.toString();
        byte[] byte_array31 = gPType1.getChildren();
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
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + ":-1" + "'", str30.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array31);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test196");
        byte[] byte_array3 = new byte[] { (byte) 1, (byte) 0, (byte) 10 };
        byte[] byte_array5 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array3, 0);
        byte[] byte_array7 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, 10);
        byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, (int) ' ');
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) 'a');
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) '#');
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (short) 100);
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, 0);
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
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test197");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.setId(1);
        gPType1.addChild((byte) 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test198");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setId((int) (byte) 100);
        int i7 = gPType1.getId();
        gPType1.addParent((byte) 0);
        java.lang.String str10 = gPType1.toString();
        gPType1.addChild((byte) 10);
        int i13 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i7 == 100);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:100" + "'", str10.equals("hi!:100"));
        org.junit.Assert.assertTrue(i13 == 100);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test199");
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
        byte[] byte_array16 = gPType11.getParents();
        gPType11.addChild((byte) -1);
        int i19 = gPType11.getId();
        java.lang.String str20 = gPType11.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue(i19 == 10);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test200");
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
        gPType1.addChild((byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1:-1" + "'", str21.equals(":-1:-1"));
        org.junit.Assert.assertTrue(b22 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test201");
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
        gPType14.addParent((byte) -1);
        gPType14.setId((int) (byte) 1);
        java.lang.String str25 = gPType14.toString();
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
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + ":1" + "'", str25.equals(":1"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test202");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        java.lang.String str3 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType7);
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType7);
        gPType7.setName("");
        java.lang.String str12 = gPType7.toString();
        gPType7.setId(0);
        java.lang.String str15 = gPType7.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1" + "'", str12.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ":0" + "'", str15.equals(":0"));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test203");
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
        gPType15.addChild((byte) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType46 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array47 = gPType46.getParents();
        gPType46.setName("hi!");
        gPType46.setName(":-1:-1");
        gPType46.addChild((byte) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType55 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType57 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array58 = gPType57.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType60 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array61 = gPType60.getChildren();
        gPType60.addChild((byte) 1);
        java.lang.String str64 = gPType60.getName();
        boolean b65 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType57, (io.github.agentsoz.jill.struct.AObject) gPType60);
        int i66 = gPType60.getId();
        boolean b67 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType55, (io.github.agentsoz.jill.struct.AObject) gPType60);
        gPType55.setId((int) (byte) -1);
        byte[] byte_array70 = gPType55.getParents();
        boolean b71 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType46, (io.github.agentsoz.jill.struct.AObject) gPType55);
        java.lang.String str72 = gPType55.getName();
        boolean b73 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType55);
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
        org.junit.Assert.assertNull(byte_array58);
        org.junit.Assert.assertNull(byte_array61);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(i66 == (-1));
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNull(byte_array70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
        org.junit.Assert.assertTrue(b73 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test204");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType1.toString();
        gPType1.addChild((byte) 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:1:-1" + "'", str5.equals("hi!:1:-1"));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test205");
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
        gPType11.addChild((byte) 10);
        java.lang.String str18 = gPType11.getName();
        java.lang.String str19 = gPType11.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:10" + "'", str19.equals("hi!:10"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test206");
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
        gPType1.setId(100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array18);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test207");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType1.addChild((byte) 10);
        java.lang.String str7 = gPType1.toString();
        gPType1.addChild((byte) 1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:1:-1" + "'", str7.equals("hi!:1:-1"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test208");
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
        gPType3.setName("hi!:-1:-1:-1");
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ":-1" + "'", str13.equals(":-1"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test209");
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
        gPType1.addChild((byte) -1);
        byte[] byte_array29 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ":-1:-1" + "'", str9.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(byte_array29);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test210");
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
        byte[] byte_array17 = gPType3.getParents();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(byte_array17);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test211");
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
        gPType1.setName(":-1:-1:-1:-1");
        byte[] byte_array21 = gPType1.getParents();
        byte[] byte_array22 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertNull(byte_array22);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test212");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        gPType1.setId((int) 'a');
        gPType1.addParent((byte) 0);
        gPType1.addParent((byte) -1);
        byte[] byte_array10 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNotNull(byte_array10);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test213");
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
        java.lang.String str23 = gPType6.toString();
        gPType6.setId((int) (short) -1);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ":100" + "'", str23.equals(":100"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test214");
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
        gPType1.setName(":-1:-1:-1:-1");
        gPType1.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertNull(byte_array18);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test215");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getChildren();
        java.lang.String str6 = gPType3.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test216");
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
        java.lang.String str19 = gPType8.getName();
        int i20 = gPType8.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(i20 == (-1));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test217");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType1.addChild((byte) 100);
        java.lang.String str7 = gPType1.toString();
        java.lang.String str8 = gPType1.getName();
        byte[] byte_array9 = gPType1.getParents();
        gPType1.setId(0);
        byte[] byte_array12 = gPType1.getParents();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:-1" + "'", str7.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertNull(byte_array12);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test218");
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
        gPType3.addParent((byte) 10);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ":-1:-1:-1:-1" + "'", str13.equals(":-1:-1:-1:-1"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":-1:-1:-1:-1:10" + "'", str16.equals(":-1:-1:-1:-1:10"));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test219");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        byte[] byte_array10 = gPType1.getParents();
        gPType1.addChild((byte) 1);
        gPType1.addChild((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array10);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test220");
        byte[] byte_array2 = new byte[] { (byte) 100, (byte) 0 };
        byte[] byte_array4 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, 1);
        byte[] byte_array6 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, (int) '4');
        byte[] byte_array8 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, 1);
        byte[] byte_array10 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array8, (int) 'a');
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array4);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test221");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setId((int) (byte) 1);
        java.lang.String str7 = gPType1.getName();
        gPType1.setId((int) (byte) 100);
        gPType1.addChild((byte) 100);
        gPType1.setId((int) (byte) 10);
        byte[] byte_array14 = gPType1.getChildren();
        gPType1.addParent((byte) -1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array14);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test222");
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
        gPType17.setId(10);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test223");
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
        int i32 = gPType1.getId();
        byte[] byte_array33 = gPType1.getChildren();
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
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertNull(byte_array33);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test224");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        gPType1.addChild((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test225");
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
        gPType1.addParent((byte) -1);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i15 == (-1));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test226");
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
        byte[] byte_array23 = gPType1.getParents();
        byte[] byte_array24 = gPType1.getParents();
        java.lang.String str25 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array23);
        org.junit.Assert.assertNotNull(byte_array24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test227");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1:-1");
        gPType1.setName("hi!:-1:-1");
        byte[] byte_array4 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array4);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test228");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType1.addParent((byte) 100);
        java.lang.String str15 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ":-1:-1" + "'", str15.equals(":-1:-1"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test229");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1:10");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test230");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:10");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test231");
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
        int i15 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i15 == (-1));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test232");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        byte[] byte_array6 = gPType3.getParents();
        gPType3.addChild((byte) 1);
        gPType3.addChild((byte) 10);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array6);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test233");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        gPType1.setId((int) 'a');
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        java.lang.String str12 = gPType7.toString();
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
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType16);
        byte[] byte_array31 = gPType7.getParents();
        int i32 = gPType7.getId();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType7);
        java.lang.String str34 = gPType7.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1" + "'", str12.equals(":-1"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertTrue(i24 == (-1));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + ":-1" + "'", str34.equals(":-1"));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test234");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        byte[] byte_array10 = gPType1.getChildren();
        byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, 100);
        byte[] byte_array14 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array12, 10);
        byte[] byte_array16 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array12, (int) (byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test235");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1:-1:-1:-1");
        java.lang.String str2 = gPType1.getName();
        gPType1.setId((int) ' ');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!:-1:-1:-1:-1" + "'", str2.equals("hi!:-1:-1:-1:-1"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test236");
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
        byte[] byte_array38 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array36, 35);
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
        org.junit.Assert.assertNotNull(byte_array38);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test237");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
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
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array23 = gPType22.getParents();
        gPType22.setName("hi!");
        java.lang.String str26 = gPType22.toString();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType22);
        byte[] byte_array28 = gPType22.getParents();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType22);
        gPType22.addParent((byte) -1);
        java.lang.String str32 = gPType22.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:-1" + "'", str26.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test238");
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
        byte[] byte_array41 = gPType33.getParents();
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
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test239");
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
        gPType1.addChild((byte) 1);
        java.lang.String str21 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test240");
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
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array15, (int) (byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1:-1:-1" + "'", str11.equals(":-1:-1:-1"));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array17);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test241");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.setId((int) (byte) -1);
        java.lang.String str4 = gPType1.toString();
        gPType1.setId((int) (byte) 0);
        java.lang.String str7 = gPType1.getName();
        gPType1.setName(":52:-1");
        gPType1.addChild((byte) 1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:1:-1" + "'", str4.equals("hi!:1:-1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:1" + "'", str7.equals("hi!:1"));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test242");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        int i11 = gPType4.getId();
        gPType4.setId((int) '4');
        gPType4.addChild((byte) 1);
        gPType4.setName("hi!:100");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(i11 == (-1));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test243");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setId((int) (short) 10);
        java.lang.String str5 = gPType1.getName();
        byte[] byte_array6 = gPType1.getParents();
        gPType1.setId(100);
        int i9 = gPType1.getId();
        int i10 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue(i9 == 100);
        org.junit.Assert.assertTrue(i10 == 100);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test244");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        int i11 = gPType4.getId();
        gPType4.setId((int) '4');
        gPType4.addChild((byte) 1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array18 = gPType17.getChildren();
        byte[] byte_array19 = gPType17.getParents();
        gPType17.setId((int) 'a');
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType4, (io.github.agentsoz.jill.struct.AObject) gPType17);
        java.lang.String str23 = gPType17.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array26 = gPType25.getParents();
        java.lang.String str27 = gPType25.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType29 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array30 = gPType29.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType32 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array33 = gPType32.getChildren();
        gPType32.addChild((byte) 1);
        java.lang.String str36 = gPType32.getName();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType29, (io.github.agentsoz.jill.struct.AObject) gPType32);
        int i38 = gPType32.getId();
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType25, (io.github.agentsoz.jill.struct.AObject) gPType32);
        gPType32.setId(1);
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType17, (io.github.agentsoz.jill.struct.AObject) gPType32);
        java.lang.String str43 = gPType32.getName();
        java.lang.String str44 = gPType32.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNull(byte_array30);
        org.junit.Assert.assertNull(byte_array33);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == (-1));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test245");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        gPType3.addChild((byte) -1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test246");
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
        gPType4.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test247");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) -1);
        byte[] byte_array6 = gPType1.getParents();
        java.lang.String str7 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array10 = gPType9.getChildren();
        gPType9.addChild((byte) 1);
        int i13 = gPType9.getId();
        gPType9.addChild((byte) 0);
        gPType9.addParent((byte) 1);
        gPType9.setName("hi!");
        gPType9.setId((int) '#');
        byte[] byte_array22 = gPType9.getChildren();
        gPType9.addChild((byte) 100);
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType9);
        gPType1.addParent((byte) 10);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test248");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        java.lang.String str4 = gPType1.toString();
        gPType1.setName(":-1:-1");
        gPType1.setName(":-1:-1:-1");
        gPType1.addChild((byte) 100);
        java.lang.String str11 = gPType1.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1:-1:-1:-1" + "'", str11.equals(":-1:-1:-1:-1"));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test249");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setId((int) (byte) 1);
        java.lang.String str7 = gPType1.getName();
        gPType1.setId((int) (byte) 100);
        gPType1.setName("hi!:35:-1:-1:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test250");
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
        gPType14.addParent((byte) 0);
        java.lang.String str22 = gPType14.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType26 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType24, (io.github.agentsoz.jill.struct.AObject) gPType26);
        byte[] byte_array28 = gPType26.getChildren();
        byte[] byte_array29 = gPType26.getParents();
        gPType26.setName("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType33 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array34 = gPType33.getChildren();
        gPType33.addChild((byte) 1);
        int i37 = gPType33.getId();
        java.lang.String str38 = gPType33.toString();
        gPType33.setName("");
        java.lang.String str41 = gPType33.getName();
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType26, (io.github.agentsoz.jill.struct.AObject) gPType33);
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType14, (io.github.agentsoz.jill.struct.AObject) gPType26);
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
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertNull(byte_array34);
        org.junit.Assert.assertTrue(i37 == (-1));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + ":-1" + "'", str38.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test251");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        byte[] byte_array9 = gPType1.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":52");
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
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType16);
        gPType11.addChild((byte) 0);
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        byte[] byte_array32 = gPType1.getChildren();
        gPType1.setId((int) '4');
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(byte_array32);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test252");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        byte[] byte_array6 = gPType1.getChildren();
        gPType1.addParent((byte) 1);
        gPType1.setName(":1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array6);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test253");
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
        gPType8.setId((-1));
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
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test254");
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
        byte[] byte_array22 = gPType14.getParents();
        java.lang.String str23 = gPType14.toString();
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
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ":-1" + "'", str23.equals(":-1"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test255");
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
        byte[] byte_array14 = gPType1.getChildren();
        java.lang.String str15 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1:-1:-1" + "'", str11.equals(":-1:-1:-1"));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ":-1:-1:-1" + "'", str15.equals(":-1:-1:-1"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test256");
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
        java.lang.String str21 = gPType8.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(byte_array20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":100" + "'", str21.equals(":100"));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test257");
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
        gPType6.addParent((byte) 100);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNull(byte_array20);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test258");
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
        gPType27.setId(35);
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
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test259");
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
        io.github.agentsoz.jill.struct.GoalPlanType gPType35 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType37 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType35, (io.github.agentsoz.jill.struct.AObject) gPType37);
        byte[] byte_array39 = gPType37.getChildren();
        byte[] byte_array40 = gPType37.getParents();
        java.lang.String str41 = gPType37.toString();
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType37);
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
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(byte_array39);
        org.junit.Assert.assertNull(byte_array40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + ":-1" + "'", str41.equals(":-1"));
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test260");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.setName("");
        gPType1.addChild((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test261");
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
        gPType1.setId((int) '4');
        gPType1.setName(":-1:-1:-1:-1");
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
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test262");
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
        java.lang.String str17 = gPType6.getName();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ":-1" + "'", str14.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ":-1" + "'", str15.equals(":-1"));
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test263");
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
        java.lang.String str20 = gPType6.getName();
        gPType6.addChild((byte) 0);
        gPType6.addChild((byte) 0);
        gPType6.setId((int) (short) 100);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test264");
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
        gPType1.setId((int) (byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ":1" + "'", str14.equals(":1"));
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test265");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        int i11 = gPType4.getId();
        gPType4.setId((int) '4');
        java.lang.String str14 = gPType4.toString();
        byte[] byte_array15 = gPType4.getChildren();
        byte[] byte_array16 = gPType4.getParents();
        gPType4.addParent((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ":52" + "'", str14.equals(":52"));
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNull(byte_array16);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test266");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str13 = gPType1.toString();
        byte[] byte_array14 = gPType1.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType16 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array17 = gPType16.getChildren();
        java.lang.String str18 = gPType16.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType20 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType20, (io.github.agentsoz.jill.struct.AObject) gPType22);
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType22);
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType22);
        java.lang.String str26 = gPType1.getName();
        java.lang.String str27 = gPType1.getName();
        java.lang.String str28 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ":-1:-1" + "'", str13.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + ":-1" + "'", str26.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1" + "'", str27.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":-1:-1" + "'", str28.equals(":-1:-1"));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test267");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        byte[] byte_array10 = gPType4.getChildren();
        byte[] byte_array11 = gPType4.getParents();
        gPType4.setId((int) (short) 0);
        java.lang.String str14 = gPType4.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ":0" + "'", str14.equals(":0"));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test268");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        gPType1.setId((int) '#');
        byte[] byte_array14 = gPType1.getChildren();
        byte[] byte_array15 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test269");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        byte[] byte_array6 = gPType1.getChildren();
        try {
            byte[] byte_array8 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(byte_array6);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test270");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        java.lang.String str3 = gPType1.toString();
        java.lang.String str4 = gPType1.toString();
        gPType1.setName(":52");
        gPType1.setName(":-1");
        byte[] byte_array9 = gPType1.getChildren();
        java.lang.String str10 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, (io.github.agentsoz.jill.struct.AObject) gPType14);
        byte[] byte_array16 = gPType14.getParents();
        gPType14.setName("hi!:-1");
        byte[] byte_array19 = gPType14.getChildren();
        gPType14.addParent((byte) -1);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType14);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ":-1:-1" + "'", str10.equals(":-1:-1"));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test271");
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
        gPType1.setName(":-1:-1:-1");
        java.lang.String str27 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":-1:-1:-1:-1" + "'", str27.equals(":-1:-1:-1:-1"));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test272");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setId((int) (byte) 1);
        java.lang.String str7 = gPType1.getName();
        gPType1.setId((int) (byte) 100);
        gPType1.addChild((byte) 100);
        gPType1.setId((int) (byte) 10);
        gPType1.addChild((byte) 1);
        gPType1.setName(":52");
        byte[] byte_array18 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array18);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test273");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setId((int) (short) 10);
        byte[] byte_array5 = gPType1.getChildren();
        byte[] byte_array6 = gPType1.getParents();
        gPType1.setId((int) '#');
        int i9 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue(i9 == 35);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test274");
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
        byte[] byte_array22 = gPType13.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(byte_array22);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test275");
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
        int i27 = gPType8.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType29 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array30 = gPType29.getParents();
        java.lang.String str31 = gPType29.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType33 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array34 = gPType33.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType36 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array37 = gPType36.getChildren();
        gPType36.addChild((byte) 1);
        java.lang.String str40 = gPType36.getName();
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType33, (io.github.agentsoz.jill.struct.AObject) gPType36);
        int i42 = gPType36.getId();
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType29, (io.github.agentsoz.jill.struct.AObject) gPType36);
        gPType36.setId(1);
        gPType36.setName(":100");
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType36);
        int i49 = gPType36.getId();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 10);
        org.junit.Assert.assertNull(byte_array30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertNull(byte_array34);
        org.junit.Assert.assertNull(byte_array37);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == (-1));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i49 == 1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test276");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        byte[] byte_array10 = gPType1.getChildren();
        byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, 100);
        byte[] byte_array14 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array12, 10);
        byte[] byte_array16 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array12, (int) 'a');
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test277");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.setId((int) (byte) -1);
        java.lang.String str4 = gPType1.toString();
        byte[] byte_array5 = gPType1.getChildren();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:1:-1" + "'", str4.equals("hi!:1:-1"));
        org.junit.Assert.assertNull(byte_array5);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test278");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        byte[] byte_array8 = gPType3.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType10 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType10, (io.github.agentsoz.jill.struct.AObject) gPType12);
        java.lang.String str14 = gPType12.getName();
        gPType12.addParent((byte) 1);
        java.lang.String str17 = gPType12.toString();
        gPType12.addChild((byte) -1);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType12);
        byte[] byte_array21 = gPType12.getChildren();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(byte_array21);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test279");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        gPType1.addParent((byte) -1);
        byte[] byte_array4 = gPType1.getParents();
        byte[] byte_array5 = gPType1.getParents();
        byte[] byte_array6 = gPType1.getChildren();
        byte[] byte_array7 = gPType1.getParents();
        byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array7, 35);
        org.junit.Assert.assertNotNull(byte_array4);
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array9);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test280");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.setName(":-1:-1");
        byte[] byte_array10 = gPType1.getParents();
        java.lang.String str11 = gPType1.toString();
        int i12 = gPType1.getId();
        int i13 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1:-1:-1" + "'", str11.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test281");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        int i2 = gPType1.getId();
        java.lang.String str3 = gPType1.getName();
        gPType1.setId(0);
        org.junit.Assert.assertTrue(i2 == (-1));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test282");
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
        gPType14.addParent((byte) -1);
        gPType14.setId((int) (byte) 1);
        java.lang.String str25 = gPType14.toString();
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
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + ":1" + "'", str25.equals(":1"));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test283");
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
        java.lang.String str27 = gPType6.toString();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":52:-1:35" + "'", str27.equals(":52:-1:35"));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test284");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        int i2 = gPType1.getId();
        java.lang.String str3 = gPType1.toString();
        java.lang.String str4 = gPType1.toString();
        java.lang.String str5 = gPType1.getName();
        org.junit.Assert.assertTrue(i2 == (-1));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!:-1" + "'", str3.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test285");
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
        gPType1.setName(":-1:-1");
        gPType1.setName("hi!:1:1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test286");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        byte[] byte_array9 = gPType1.getParents();
        byte[] byte_array10 = gPType1.getParents();
        gPType1.setName("hi!:35:-1:-1");
        byte[] byte_array13 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertNull(byte_array13);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test287");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        byte[] byte_array10 = gPType4.getChildren();
        byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (int) (byte) 0);
        byte[] byte_array14 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array12, (int) '4');
        byte[] byte_array16 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array12, 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test288");
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
        byte[] byte_array18 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array16, (int) (short) 1);
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
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test289");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        java.lang.String str10 = gPType1.getName();
        java.lang.String str11 = gPType1.getName();
        byte[] byte_array12 = gPType1.getParents();
        gPType1.setName("hi!:1:1");
        gPType1.setName("hi!:1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test290");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1:-1");
        gPType1.addParent((byte) 1);
        java.lang.String str4 = gPType1.toString();
        int i5 = gPType1.getId();
        gPType1.setId(100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1:-1:-1" + "'", str4.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue(i5 == (-1));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test291");
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
        gPType7.addParent((byte) 1);
        int i29 = gPType7.getId();
        gPType7.setId((int) (short) 100);
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
        org.junit.Assert.assertTrue(i29 == (-1));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test292");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getChildren();
        byte[] byte_array6 = gPType3.getParents();
        gPType3.setName("hi!:1");
        gPType3.setName("hi!:-1:-1");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array6);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test293");
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
        gPType28.addParent((byte) -1);
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
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test294");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        java.lang.String str4 = gPType1.toString();
        gPType1.addParent((byte) 0);
        byte[] byte_array7 = gPType1.getChildren();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertNull(byte_array7);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test295");
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
        byte[] byte_array14 = gPType1.getChildren();
        byte[] byte_array16 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array14, (int) (byte) 10);
        byte[] byte_array18 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array16, (int) (short) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1:-1:-1" + "'", str11.equals(":-1:-1:-1"));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertNotNull(byte_array18);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test296");
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
        io.github.agentsoz.jill.struct.GoalPlanType gPType28 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType30 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array31 = gPType30.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType33 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array34 = gPType33.getChildren();
        gPType33.addChild((byte) 1);
        java.lang.String str37 = gPType33.getName();
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType30, (io.github.agentsoz.jill.struct.AObject) gPType33);
        int i39 = gPType33.getId();
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType28, (io.github.agentsoz.jill.struct.AObject) gPType33);
        io.github.agentsoz.jill.struct.GoalPlanType gPType42 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType44 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType42, (io.github.agentsoz.jill.struct.AObject) gPType44);
        java.lang.String str46 = gPType44.getName();
        gPType44.addParent((byte) 1);
        gPType44.addParent((byte) 1);
        gPType44.setId((-1));
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType28, (io.github.agentsoz.jill.struct.AObject) gPType44);
        java.lang.String str54 = gPType28.toString();
        java.lang.String str55 = gPType28.toString();
        byte[] byte_array56 = gPType28.getChildren();
        gPType28.setName("hi!:1:-1");
        boolean b59 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType28);
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
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertNull(byte_array34);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + ":-1" + "'", str54.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + ":-1" + "'", str55.equals(":-1"));
        org.junit.Assert.assertNull(byte_array56);
        org.junit.Assert.assertTrue(b59 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test297");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        int i12 = gPType1.getId();
        gPType1.setId(0);
        byte[] byte_array15 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test298");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        java.lang.String str8 = gPType3.getName();
        int i9 = gPType3.getId();
        java.lang.String str10 = gPType3.toString();
        int i11 = gPType3.getId();
        gPType3.setId(10);
        gPType3.setId((int) (byte) -1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:-1" + "'", str8.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1:-1" + "'", str10.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue(i11 == (-1));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test299");
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
        gPType7.setId(0);
        java.lang.String str20 = gPType7.getName();
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
        gPType29.setId(1);
        gPType29.setId((int) (short) 100);
        gPType29.addParent((byte) 1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType44 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array45 = gPType44.getChildren();
        byte[] byte_array46 = gPType44.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType48 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array49 = gPType48.getParents();
        java.lang.String str50 = gPType48.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType52 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array53 = gPType52.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType55 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array56 = gPType55.getChildren();
        gPType55.addChild((byte) 1);
        java.lang.String str59 = gPType55.getName();
        boolean b60 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType52, (io.github.agentsoz.jill.struct.AObject) gPType55);
        int i61 = gPType55.getId();
        boolean b62 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType48, (io.github.agentsoz.jill.struct.AObject) gPType55);
        byte[] byte_array63 = gPType55.getChildren();
        boolean b64 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType44, (io.github.agentsoz.jill.struct.AObject) gPType55);
        boolean b65 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType29, (io.github.agentsoz.jill.struct.AObject) gPType44);
        boolean b66 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType29);
        byte[] byte_array67 = gPType7.getChildren();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNull(byte_array27);
        org.junit.Assert.assertNull(byte_array30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i35 == (-1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(byte_array45);
        org.junit.Assert.assertNull(byte_array46);
        org.junit.Assert.assertNull(byte_array49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
        org.junit.Assert.assertNull(byte_array53);
        org.junit.Assert.assertNull(byte_array56);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(i61 == (-1));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(byte_array63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(byte_array67);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test300");
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
        byte[] byte_array23 = gPType1.getChildren();
        gPType1.setName("hi!:1");
        byte[] byte_array26 = gPType1.getChildren();
        byte[] byte_array28 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array26, 35);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array23);
        org.junit.Assert.assertNotNull(byte_array26);
        org.junit.Assert.assertNotNull(byte_array28);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test301");
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
        gPType3.setName("hi!:35");
        gPType3.setId((int) (short) 100);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test302");
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
        byte[] byte_array21 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertNull(byte_array21);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test303");
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
        io.github.agentsoz.jill.struct.AObject aObject17 = null;
        try {
            boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, aObject17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test304");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        gPType3.addParent((byte) -1);
        gPType3.setId(52);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test305");
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
        gPType1.addParent((byte) 1);
        gPType1.setName(":-1:-1:-1:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test306");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1:-1:-1:-1:-1");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test307");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.setId((int) (short) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        gPType11.addParent((byte) -1);
        gPType11.addChild((byte) 100);
        byte[] byte_array16 = gPType11.getParents();
        byte[] byte_array17 = gPType11.getParents();
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        int i19 = gPType11.getId();
        gPType11.setName("");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test308");
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
        gPType14.setId(10);
        gPType14.setId((int) (byte) 10);
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
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test309");
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
        gPType1.addParent((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array19);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test310");
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
        java.lang.String str22 = gPType8.toString();
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
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + ":100" + "'", str22.equals(":100"));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test311");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType1.addChild((byte) 100);
        java.lang.String str7 = gPType1.toString();
        java.lang.String str8 = gPType1.getName();
        byte[] byte_array9 = gPType1.getParents();
        int i10 = gPType1.getId();
        byte[] byte_array11 = gPType1.getParents();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:-1" + "'", str7.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test312");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        byte[] byte_array9 = gPType1.getParents();
        gPType1.addParent((byte) -1);
        java.lang.String str12 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1:-1:-1" + "'", str12.equals(":-1:-1:-1"));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test313");
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
        java.lang.String str20 = gPType14.toString();
        byte[] byte_array21 = gPType14.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(byte_array18);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + ":-1:-1" + "'", str20.equals(":-1:-1"));
        org.junit.Assert.assertNotNull(byte_array21);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test314");
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
        java.lang.String str17 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1:-1:-1" + "'", str11.equals(":-1:-1:-1"));
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1:-1" + "'", str17.equals(":-1:-1"));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test315");
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
        byte[] byte_array23 = gPType1.getChildren();
        int i24 = gPType1.getId();
        java.lang.String str25 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array23);
        org.junit.Assert.assertTrue(i24 == 35);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:35" + "'", str25.equals("hi!:35"));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test316");
        byte[] byte_array3 = new byte[] { (byte) 1, (byte) 0, (byte) 10 };
        byte[] byte_array5 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array3, 0);
        byte[] byte_array7 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array3, (int) ' ');
        byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array7, (int) (short) 1);
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, 1);
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, (int) 'a');
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, 100);
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array15, (int) '#');
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
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test317");
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
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array16 = gPType15.getParents();
        int i17 = gPType15.getId();
        byte[] byte_array18 = gPType15.getChildren();
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType9, (io.github.agentsoz.jill.struct.AObject) gPType15);
        try {
            boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject0, (io.github.agentsoz.jill.struct.AObject) gPType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test318");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":100:-1:-1");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.addChild((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test319");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        java.lang.String str3 = gPType1.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType7);
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType7);
        gPType7.addParent((byte) 100);
        byte[] byte_array12 = gPType7.getParents();
        gPType7.setName("hi!:100");
        int i15 = gPType7.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertTrue(i15 == (-1));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test320");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setId((int) (byte) 100);
        int i7 = gPType1.getId();
        gPType1.addParent((byte) 0);
        int i10 = gPType1.getId();
        gPType1.setId((int) (short) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i7 == 100);
        org.junit.Assert.assertTrue(i10 == 100);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test321");
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
        int i25 = gPType7.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType27 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array28 = gPType27.getChildren();
        gPType27.addChild((byte) 1);
        java.lang.String str31 = gPType27.getName();
        java.lang.String str32 = gPType27.getName();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType27);
        gPType7.setName("hi!:1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test322");
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
        gPType6.addChild((byte) 10);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test323");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        gPType1.addParent((byte) -1);
        byte[] byte_array4 = gPType1.getParents();
        gPType1.addChild((byte) 0);
        org.junit.Assert.assertNotNull(byte_array4);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test324");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        byte[] byte_array12 = gPType1.getParents();
        byte[] byte_array14 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array12, (int) (byte) 0);
        byte[] byte_array16 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array14, (int) (byte) 100);
        byte[] byte_array18 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array14, 52);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertNotNull(byte_array18);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test325");
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
        byte[] byte_array22 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array20, (int) 'a');
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array18);
        org.junit.Assert.assertNotNull(byte_array20);
        org.junit.Assert.assertNotNull(byte_array22);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test326");
        byte[] byte_array0 = null;
        byte[] byte_array2 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array0, (int) (byte) 100);
        byte[] byte_array4 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, (int) '#');
        byte[] byte_array6 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, 10);
        byte[] byte_array8 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, (int) (short) 100);
        byte[] byte_array10 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, 0);
        byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, 0);
        byte[] byte_array14 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (int) (short) 0);
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array4);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array14);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test327");
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
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array23 = gPType22.getParents();
        gPType22.setName("hi!");
        gPType22.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType29 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array30 = gPType29.getParents();
        int i31 = gPType29.getId();
        byte[] byte_array32 = gPType29.getChildren();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType22, (io.github.agentsoz.jill.struct.AObject) gPType29);
        byte[] byte_array34 = gPType29.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType36 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array37 = gPType36.getParents();
        java.lang.String str38 = gPType36.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType40 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array41 = gPType40.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType43 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array44 = gPType43.getChildren();
        gPType43.addChild((byte) 1);
        java.lang.String str47 = gPType43.getName();
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType40, (io.github.agentsoz.jill.struct.AObject) gPType43);
        int i49 = gPType43.getId();
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType36, (io.github.agentsoz.jill.struct.AObject) gPType43);
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType29, (io.github.agentsoz.jill.struct.AObject) gPType36);
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType29);
        io.github.agentsoz.jill.struct.GoalPlanType gPType54 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        gPType54.setId((int) (byte) 100);
        byte[] byte_array57 = gPType54.getChildren();
        byte[] byte_array58 = gPType54.getParents();
        boolean b59 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType54);
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
        org.junit.Assert.assertNull(byte_array30);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertNull(byte_array32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(byte_array34);
        org.junit.Assert.assertNull(byte_array37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertNull(byte_array41);
        org.junit.Assert.assertNull(byte_array44);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i49 == (-1));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(byte_array57);
        org.junit.Assert.assertNull(byte_array58);
        org.junit.Assert.assertTrue(b59 == true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test328");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":0");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test329");
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
        gPType7.setId(0);
        java.lang.String str20 = gPType7.getName();
        gPType7.setName(":52:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array25 = gPType24.getParents();
        gPType24.setName("hi!");
        gPType24.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType31 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array32 = gPType31.getParents();
        int i33 = gPType31.getId();
        byte[] byte_array34 = gPType31.getChildren();
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType24, (io.github.agentsoz.jill.struct.AObject) gPType31);
        byte[] byte_array36 = gPType31.getChildren();
        byte[] byte_array37 = gPType31.getParents();
        java.lang.String str38 = gPType31.getName();
        java.lang.String str39 = gPType31.toString();
        java.lang.String str40 = gPType31.getName();
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType31);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertNull(byte_array32);
        org.junit.Assert.assertTrue(i33 == (-1));
        org.junit.Assert.assertNull(byte_array34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(byte_array36);
        org.junit.Assert.assertNull(byte_array37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + ":-1" + "'", str39.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test330");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        byte[] byte_array7 = gPType1.getChildren();
        int i8 = gPType1.getId();
        byte[] byte_array9 = gPType1.getChildren();
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) '4');
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) (short) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test331");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        gPType1.setName("");
        gPType1.addChild((byte) 10);
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array10 = gPType9.getChildren();
        gPType9.addChild((byte) 1);
        java.lang.String str13 = gPType9.getName();
        java.lang.String str14 = gPType9.getName();
        java.lang.String str15 = gPType9.getName();
        gPType9.addParent((byte) -1);
        java.lang.String str18 = gPType9.getName();
        gPType9.setName("hi!:1");
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType9);
        byte[] byte_array22 = gPType9.getChildren();
        java.lang.String str23 = gPType9.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:1:-1" + "'", str23.equals("hi!:1:-1"));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test332");
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
        gPType1.setName(":52");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ":-1" + "'", str3.equals(":-1"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertNull(byte_array13);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test333");
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
        java.lang.String str15 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1" + "'", str12.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ":-1:1:-1" + "'", str15.equals(":-1:1:-1"));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test334");
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
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array23 = gPType22.getParents();
        gPType22.setName("hi!");
        gPType22.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType29 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array30 = gPType29.getParents();
        int i31 = gPType29.getId();
        byte[] byte_array32 = gPType29.getChildren();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType22, (io.github.agentsoz.jill.struct.AObject) gPType29);
        byte[] byte_array34 = gPType29.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType36 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array37 = gPType36.getParents();
        java.lang.String str38 = gPType36.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType40 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array41 = gPType40.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType43 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array44 = gPType43.getChildren();
        gPType43.addChild((byte) 1);
        java.lang.String str47 = gPType43.getName();
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType40, (io.github.agentsoz.jill.struct.AObject) gPType43);
        int i49 = gPType43.getId();
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType36, (io.github.agentsoz.jill.struct.AObject) gPType43);
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType29, (io.github.agentsoz.jill.struct.AObject) gPType36);
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType29);
        gPType15.setName(":-1:-1:-1:-1");
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
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertNull(byte_array30);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertNull(byte_array32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(byte_array34);
        org.junit.Assert.assertNull(byte_array37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertNull(byte_array41);
        org.junit.Assert.assertNull(byte_array44);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i49 == (-1));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test335");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setId((int) (short) 10);
        byte[] byte_array5 = gPType1.getChildren();
        gPType1.addChild((byte) 0);
        byte[] byte_array8 = gPType1.getChildren();
        gPType1.addChild((byte) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType12.setId((int) (byte) -1);
        gPType12.addParent((byte) 10);
        byte[] byte_array17 = gPType12.getParents();
        byte[] byte_array18 = gPType12.getChildren();
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType12);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test336");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:35:-1:-1:-1");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test337");
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
        java.lang.String str26 = gPType1.toString();
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
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + ":100:-1" + "'", str26.equals(":100:-1"));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test338");
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
        byte[] byte_array18 = gPType11.getParents();
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
        gPType26.setId(1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType44 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array45 = gPType44.getChildren();
        gPType44.addChild((byte) 1);
        java.lang.String str48 = gPType44.getName();
        java.lang.String str49 = gPType44.getName();
        java.lang.String str50 = gPType44.getName();
        byte[] byte_array51 = gPType44.getChildren();
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType26, (io.github.agentsoz.jill.struct.AObject) gPType44);
        int i53 = gPType26.getId();
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType26);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertNull(byte_array27);
        org.junit.Assert.assertTrue(i30 == (-1));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + ":-1" + "'", str36.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertTrue(i40 == (-1));
        org.junit.Assert.assertNull(byte_array45);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        org.junit.Assert.assertNotNull(byte_array51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i53 == 1);
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test339");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array10 = gPType9.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array13 = gPType12.getChildren();
        gPType12.addChild((byte) 1);
        java.lang.String str16 = gPType12.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType9, (io.github.agentsoz.jill.struct.AObject) gPType12);
        int i18 = gPType12.getId();
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType12);
        byte[] byte_array20 = gPType7.getChildren();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType7);
        java.lang.String str22 = gPType1.toString();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!:-1" + "'", str22.equals("hi!:-1"));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test340");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        gPType1.addParent((byte) -1);
        byte[] byte_array4 = gPType1.getParents();
        byte[] byte_array5 = gPType1.getParents();
        byte[] byte_array7 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, 0);
        byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, 1);
        org.junit.Assert.assertNotNull(byte_array4);
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array9);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test341");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        gPType3.addParent((byte) 1);
        java.lang.String str8 = gPType3.toString();
        gPType3.addChild((byte) 100);
        gPType3.addParent((byte) -1);
        gPType3.addChild((byte) 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ":-1" + "'", str8.equals(":-1"));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test342");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        int i11 = gPType4.getId();
        byte[] byte_array12 = gPType4.getParents();
        java.lang.String str13 = gPType4.getName();
        gPType4.setId(0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test343");
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
        gPType1.addParent((byte) -1);
        gPType1.setId((int) '#');
        io.github.agentsoz.jill.struct.GoalPlanType gPType33 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType35 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array36 = gPType35.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType38 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array39 = gPType38.getChildren();
        gPType38.addChild((byte) 1);
        java.lang.String str42 = gPType38.getName();
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType35, (io.github.agentsoz.jill.struct.AObject) gPType38);
        int i44 = gPType38.getId();
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType33, (io.github.agentsoz.jill.struct.AObject) gPType38);
        gPType33.setId((int) (byte) -1);
        byte[] byte_array48 = gPType33.getParents();
        java.lang.String str49 = gPType33.toString();
        byte[] byte_array50 = gPType33.getChildren();
        gPType33.setName(":-1:-1:-1:-1");
        byte[] byte_array53 = gPType33.getParents();
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType33);
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
        org.junit.Assert.assertNull(byte_array36);
        org.junit.Assert.assertNull(byte_array39);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == (-1));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(byte_array48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + ":-1" + "'", str49.equals(":-1"));
        org.junit.Assert.assertNull(byte_array50);
        org.junit.Assert.assertNull(byte_array53);
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test344");
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
        byte[] byte_array16 = gPType11.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType18 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType18.setId((int) (byte) -1);
        gPType18.addParent((byte) 10);
        byte[] byte_array23 = gPType18.getParents();
        byte[] byte_array24 = gPType18.getChildren();
        gPType18.setId((int) (byte) -1);
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType18);
        gPType18.setId((int) (byte) -1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertNotNull(byte_array23);
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test345");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.setId((int) (byte) -1);
        java.lang.String str4 = gPType1.toString();
        gPType1.setId((int) (byte) 0);
        java.lang.String str7 = gPType1.getName();
        gPType1.addParent((byte) 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:1:-1" + "'", str4.equals("hi!:1:-1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:1" + "'", str7.equals("hi!:1"));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test346");
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
        gPType7.setName("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType46 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array47 = gPType46.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType49 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array50 = gPType49.getChildren();
        gPType49.addChild((byte) 1);
        java.lang.String str53 = gPType49.getName();
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType46, (io.github.agentsoz.jill.struct.AObject) gPType49);
        int i55 = gPType49.getId();
        gPType49.setId((-1));
        io.github.agentsoz.jill.struct.GoalPlanType gPType59 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        boolean b60 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType49, (io.github.agentsoz.jill.struct.AObject) gPType59);
        java.lang.String str61 = gPType49.getName();
        gPType49.addParent((byte) -1);
        int i64 = gPType49.getId();
        gPType49.setName("hi!:-1:-1");
        gPType49.setId((int) (byte) 100);
        boolean b69 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType49);
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
        org.junit.Assert.assertNull(byte_array47);
        org.junit.Assert.assertNull(byte_array50);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i55 == (-1));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
        org.junit.Assert.assertTrue(i64 == (-1));
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test347");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        byte[] byte_array9 = gPType1.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType(":52");
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
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType16);
        gPType11.addChild((byte) 0);
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        gPType11.setId((int) (byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test348");
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
        byte[] byte_array23 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array21, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(byte_array23);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test349");
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
        gPType24.addChild((byte) 10);
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
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test350");
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
        io.github.agentsoz.jill.struct.GoalPlanType gPType20 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array21 = gPType20.getChildren();
        gPType20.addChild((byte) 1);
        java.lang.String str24 = gPType20.getName();
        java.lang.String str25 = gPType20.getName();
        int i26 = gPType20.getId();
        gPType20.setName(":-1:-1");
        byte[] byte_array29 = gPType20.getParents();
        java.lang.String str30 = gPType20.toString();
        gPType20.addParent((byte) 100);
        gPType20.addParent((byte) -1);
        gPType20.addChild((byte) 100);
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType20);
        gPType20.addParent((byte) -1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!:1" + "'", str17.equals("hi!:1"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + ":-1:-1:-1" + "'", str30.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test351");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":52");
        gPType1.addChild((byte) 100);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test352");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        java.lang.String str4 = gPType1.toString();
        gPType1.addParent((byte) 0);
        gPType1.addChild((byte) 100);
        gPType1.addParent((byte) 10);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test353");
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
        gPType1.addChild((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:1:-1" + "'", str11.equals("hi!:1:-1"));
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test354");
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
        java.lang.String str20 = gPType6.getName();
        gPType6.addChild((byte) 0);
        java.lang.String str23 = gPType6.getName();
        gPType6.addChild((byte) -1);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test355");
        byte[] byte_array0 = null;
        byte[] byte_array2 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array0, (-1));
        org.junit.Assert.assertNotNull(byte_array2);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test356");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        byte[] byte_array2 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test357");
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
        gPType1.addChild((byte) 1);
        byte[] byte_array21 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(byte_array21);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test358");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setId((int) (byte) 100);
        int i7 = gPType1.getId();
        gPType1.addParent((byte) 0);
        gPType1.addChild((byte) 0);
        int i12 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i7 == 100);
        org.junit.Assert.assertTrue(i12 == 100);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test359");
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
        java.lang.String str22 = gPType8.getName();
        gPType8.addChild((byte) -1);
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
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test360");
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
        gPType1.setName(":-1:-1");
        byte[] byte_array19 = gPType1.getParents();
        byte[] byte_array21 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array19, 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertNotNull(byte_array21);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test361");
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
        gPType14.setId((int) '4');
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
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test362");
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
        io.github.agentsoz.jill.struct.GoalPlanType gPType42 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array43 = gPType42.getChildren();
        gPType42.addChild((byte) 1);
        int i46 = gPType42.getId();
        gPType42.addChild((byte) 0);
        gPType42.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType52 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType54 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array55 = gPType54.getChildren();
        gPType54.addChild((byte) 1);
        int i58 = gPType54.getId();
        gPType54.addChild((byte) 0);
        gPType54.addParent((byte) 1);
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType52, (io.github.agentsoz.jill.struct.AObject) gPType54);
        io.github.agentsoz.jill.struct.GoalPlanType gPType65 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array66 = gPType65.getChildren();
        gPType65.addChild((byte) 1);
        java.lang.String str69 = gPType65.toString();
        boolean b70 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType52, (io.github.agentsoz.jill.struct.AObject) gPType65);
        boolean b71 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType42, (io.github.agentsoz.jill.struct.AObject) gPType65);
        int i72 = gPType42.getId();
        byte[] byte_array73 = gPType42.getChildren();
        byte[] byte_array74 = gPType42.getChildren();
        int i75 = gPType42.getId();
        boolean b76 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType42);
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
        org.junit.Assert.assertNull(byte_array43);
        org.junit.Assert.assertTrue(i46 == (-1));
        org.junit.Assert.assertNull(byte_array55);
        org.junit.Assert.assertTrue(i58 == (-1));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(byte_array66);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + ":-1" + "'", str69.equals(":-1"));
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(i72 == (-1));
        org.junit.Assert.assertNotNull(byte_array73);
        org.junit.Assert.assertNotNull(byte_array74);
        org.junit.Assert.assertTrue(i75 == (-1));
        org.junit.Assert.assertTrue(b76 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test363");
        io.github.agentsoz.jill.struct.AObject aObject0 = null;
        io.github.agentsoz.jill.struct.GoalPlanType gPType2 = new io.github.agentsoz.jill.struct.GoalPlanType(":10:-1");
        try {
            boolean b3 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject0, (io.github.agentsoz.jill.struct.AObject) gPType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test364");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1:1:-1");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test365");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        byte[] byte_array6 = gPType3.getParents();
        gPType3.addChild((byte) 1);
        int i9 = gPType3.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue(i9 == (-1));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test366");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        java.lang.String str4 = gPType1.toString();
        gPType1.setName(":-1:-1");
        java.lang.String str7 = gPType1.getName();
        gPType1.setId((int) (byte) -1);
        gPType1.setId((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ":-1:-1" + "'", str7.equals(":-1:-1"));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test367");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType3.addChild((byte) 0);
        byte[] byte_array15 = gPType3.getChildren();
        gPType3.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test368");
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
        java.lang.String str20 = gPType6.getName();
        gPType6.addChild((byte) 0);
        gPType6.addChild((byte) 0);
        gPType6.addParent((byte) -1);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test369");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.setName("hi!:-1:-1");
        int i4 = gPType1.getId();
        java.lang.String str5 = gPType1.toString();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1:-1:-1" + "'", str5.equals("hi!:-1:-1:-1"));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test370");
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
        gPType1.setName(":-1:-1");
        int i19 = gPType1.getId();
        gPType1.setName(":100:-1");
        gPType1.setName("hi!");
        byte[] byte_array24 = gPType1.getParents();
        java.lang.String str25 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertTrue(i19 == 35);
        org.junit.Assert.assertNotNull(byte_array24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:35" + "'", str25.equals("hi!:35"));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test371");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        byte[] byte_array6 = gPType3.getParents();
        gPType3.addChild((byte) 1);
        byte[] byte_array9 = gPType3.getChildren();
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, 52);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test372");
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
        java.lang.String str22 = gPType4.getName();
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
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + ":100" + "'", str22.equals(":100"));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test373");
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
        int i45 = gPType23.getId();
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
        org.junit.Assert.assertTrue(i45 == (-1));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test374");
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
        gPType4.setId(35);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ":-1:-1:-1" + "'", str14.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test375");
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
        int i39 = gPType8.getId();
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
        org.junit.Assert.assertTrue(i39 == (-1));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test376");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.addParent((byte) 100);
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
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array23 = gPType22.getParents();
        gPType22.setName("hi!");
        java.lang.String str26 = gPType22.toString();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType8, (io.github.agentsoz.jill.struct.AObject) gPType22);
        byte[] byte_array28 = gPType22.getParents();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType22);
        java.lang.String str30 = gPType22.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType32 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array33 = gPType32.getChildren();
        gPType32.addChild((byte) 1);
        int i36 = gPType32.getId();
        gPType32.addChild((byte) 0);
        gPType32.addParent((byte) 100);
        int i41 = gPType32.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType43 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array44 = gPType43.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType46 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array47 = gPType46.getChildren();
        gPType46.addChild((byte) 1);
        java.lang.String str50 = gPType46.getName();
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType43, (io.github.agentsoz.jill.struct.AObject) gPType46);
        io.github.agentsoz.jill.struct.GoalPlanType gPType53 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array54 = gPType53.getParents();
        gPType53.setId((int) (short) 10);
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType43, (io.github.agentsoz.jill.struct.AObject) gPType53);
        boolean b58 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType32, (io.github.agentsoz.jill.struct.AObject) gPType43);
        gPType43.setId(0);
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType22, (io.github.agentsoz.jill.struct.AObject) gPType43);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:-1" + "'", str26.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertNull(byte_array33);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(i41 == (-1));
        org.junit.Assert.assertNull(byte_array44);
        org.junit.Assert.assertNull(byte_array47);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(byte_array54);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test377");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        byte[] byte_array11 = gPType1.getChildren();
        int i12 = gPType1.getId();
        byte[] byte_array13 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test378");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        byte[] byte_array6 = gPType3.getParents();
        gPType3.addParent((byte) 10);
        gPType3.addChild((byte) 100);
        gPType3.addParent((byte) 10);
        int i13 = gPType3.getId();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue(i13 == (-1));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test379");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) 1);
        java.lang.String str6 = gPType1.getName();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:1" + "'", str6.equals("hi!:1"));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test380");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.setName("hi!:-1:-1");
        int i4 = gPType1.getId();
        java.lang.String str5 = gPType1.getName();
        gPType1.addParent((byte) -1);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1:-1" + "'", str5.equals("hi!:-1:-1"));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test381");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        gPType1.setId((int) (byte) 10);
        int i12 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i12 == 10);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test382");
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
        byte[] byte_array14 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array12, (int) (short) 1);
        byte[] byte_array16 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array12, 35);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test383");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.addParent((byte) 100);
        int i10 = gPType1.getId();
        gPType1.addParent((byte) 0);
        gPType1.addParent((byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(i10 == (-1));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test384");
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
        gPType8.addParent((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test385");
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
        byte[] byte_array22 = gPType14.getParents();
        byte[] byte_array24 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array22, 35);
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
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertNotNull(byte_array24);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test386");
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
        gPType17.setName(":-1:-1:-1");
        java.lang.String str30 = gPType17.getName();
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
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + ":-1:-1:-1" + "'", str30.equals(":-1:-1:-1"));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test387");
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
        java.lang.String str21 = gPType1.toString();
        gPType1.addChild((byte) 10);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1:-1" + "'", str21.equals(":-1:-1"));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test388");
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
        try {
            byte[] byte_array16 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array14, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array14);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test389");
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
        io.github.agentsoz.jill.struct.GoalPlanType gPType44 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array45 = gPType44.getParents();
        gPType44.setName("hi!");
        gPType44.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType51 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array52 = gPType51.getParents();
        int i53 = gPType51.getId();
        byte[] byte_array54 = gPType51.getChildren();
        boolean b55 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType44, (io.github.agentsoz.jill.struct.AObject) gPType51);
        byte[] byte_array56 = gPType51.getChildren();
        byte[] byte_array57 = gPType51.getParents();
        java.lang.String str58 = gPType51.getName();
        java.lang.String str59 = gPType51.toString();
        byte[] byte_array60 = gPType51.getChildren();
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType51);
        gPType51.addParent((byte) 1);
        gPType51.setName("hi!:100");
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
        org.junit.Assert.assertNull(byte_array45);
        org.junit.Assert.assertNull(byte_array52);
        org.junit.Assert.assertTrue(i53 == (-1));
        org.junit.Assert.assertNull(byte_array54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(byte_array56);
        org.junit.Assert.assertNull(byte_array57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + ":-1" + "'", str59.equals(":-1"));
        org.junit.Assert.assertNull(byte_array60);
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test390");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType1.addChild((byte) -1);
        byte[] byte_array7 = gPType1.getChildren();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(byte_array7);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test391");
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
        byte[] byte_array18 = gPType1.getChildren();
        gPType1.setName("hi!:100");
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array23 = gPType22.getChildren();
        gPType22.addChild((byte) 1);
        int i26 = gPType22.getId();
        gPType22.addChild((byte) 0);
        gPType22.addParent((byte) 1);
        java.lang.String str31 = gPType22.getName();
        java.lang.String str32 = gPType22.getName();
        java.lang.String str33 = gPType22.toString();
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType22);
        gPType1.setId(1);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + ":-1" + "'", str33.equals(":-1"));
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test392");
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
        gPType3.addParent((byte) 100);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ":-1:-1" + "'", str15.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test393");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        byte[] byte_array9 = gPType1.getParents();
        java.lang.String str10 = gPType1.toString();
        gPType1.setId(52);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ":-1:-1:-1" + "'", str10.equals(":-1:-1:-1"));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test394");
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
        byte[] byte_array16 = gPType1.getParents();
        gPType1.addParent((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test395");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        java.lang.String str10 = gPType1.getName();
        java.lang.String str11 = gPType1.getName();
        java.lang.String str12 = gPType1.toString();
        gPType1.addChild((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1" + "'", str12.equals(":-1"));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test396");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.toString();
        byte[] byte_array7 = gPType1.getChildren();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(byte_array7);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test397");
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
        java.lang.String str15 = gPType8.toString();
        gPType8.addChild((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!:-1" + "'", str15.equals("hi!:-1"));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test398");
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
        gPType1.addParent((byte) 1);
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
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test399");
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
        gPType8.addChild((byte) 0);
        gPType8.setId((int) ' ');
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
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test400");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        int i10 = gPType4.getId();
        int i11 = gPType4.getId();
        gPType4.setId((int) '4');
        byte[] byte_array14 = gPType4.getChildren();
        try {
            byte[] byte_array16 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array14, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test401");
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
        java.lang.String str23 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test402");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        byte[] byte_array3 = gPType1.getParents();
        byte[] byte_array4 = gPType1.getParents();
        gPType1.addChild((byte) -1);
        java.lang.String str7 = gPType1.getName();
        gPType1.setId((int) (short) 10);
        java.lang.String str10 = gPType1.toString();
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
        gPType12.setId((int) (byte) -1);
        gPType12.addParent((byte) 100);
        gPType12.addChild((byte) 10);
        gPType12.addParent((byte) 1);
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType12);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ":10" + "'", str10.equals(":10"));
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test403");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array4 = gPType3.getChildren();
        gPType3.addChild((byte) 1);
        int i7 = gPType3.getId();
        gPType3.addChild((byte) 0);
        gPType3.addParent((byte) 1);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array13 = gPType3.getParents();
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) '4');
        try {
            byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array15, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test404");
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
        gPType8.setName(":100:-1:-1");
        gPType8.setName("hi!:-1");
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
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test405");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setId((int) (short) 10);
        byte[] byte_array5 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test406");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        byte[] byte_array11 = gPType1.getParents();
        gPType1.addParent((byte) 1);
        gPType1.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test407");
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
        byte[] byte_array23 = gPType7.getParents();
        byte[] byte_array24 = gPType7.getParents();
        byte[] byte_array25 = gPType7.getChildren();
        gPType7.setName("hi!:35:-1:-1:-1");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertNotNull(byte_array23);
        org.junit.Assert.assertNotNull(byte_array24);
        org.junit.Assert.assertNotNull(byte_array25);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test408");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setId((int) (byte) 1);
        java.lang.String str7 = gPType1.getName();
        gPType1.setId((int) (byte) 100);
        gPType1.addChild((byte) 10);
        byte[] byte_array12 = gPType1.getParents();
        java.lang.String str13 = gPType1.toString();
        byte[] byte_array14 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!:100" + "'", str13.equals("hi!:100"));
        org.junit.Assert.assertNotNull(byte_array14);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test409");
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
        gPType1.addParent((byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1:-1:-1" + "'", str11.equals(":-1:-1:-1"));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test410");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        gPType1.addParent((byte) -1);
        java.lang.String str10 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array13 = gPType12.getChildren();
        gPType12.addChild((byte) 1);
        int i16 = gPType12.getId();
        gPType12.addChild((byte) 0);
        gPType12.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        gPType24.addChild((byte) 1);
        int i28 = gPType24.getId();
        gPType24.addChild((byte) 0);
        gPType24.addParent((byte) 1);
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType22, (io.github.agentsoz.jill.struct.AObject) gPType24);
        io.github.agentsoz.jill.struct.GoalPlanType gPType35 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array36 = gPType35.getChildren();
        gPType35.addChild((byte) 1);
        java.lang.String str39 = gPType35.toString();
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType22, (io.github.agentsoz.jill.struct.AObject) gPType35);
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, (io.github.agentsoz.jill.struct.AObject) gPType35);
        int i42 = gPType12.getId();
        int i43 = gPType12.getId();
        gPType12.setName("");
        byte[] byte_array46 = gPType12.getChildren();
        boolean b47 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType12);
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
        byte[] byte_array64 = gPType49.getParents();
        gPType49.addChild((byte) -1);
        gPType49.addParent((byte) 0);
        boolean b69 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, (io.github.agentsoz.jill.struct.AObject) gPType49);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue(i28 == (-1));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(byte_array36);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + ":-1" + "'", str39.equals(":-1"));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == (-1));
        org.junit.Assert.assertTrue(i43 == (-1));
        org.junit.Assert.assertNotNull(byte_array46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(byte_array52);
        org.junit.Assert.assertNull(byte_array55);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i60 == (-1));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(byte_array64);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test411");
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
        gPType1.setName(":100:-1");
        byte[] byte_array23 = gPType1.getChildren();
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1" + "'", str12.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1:-1:-1" + "'", str17.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(byte_array23);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test412");
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
        java.lang.String str30 = gPType24.toString();
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
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:0" + "'", str30.equals("hi!:0"));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test413");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        java.lang.String str4 = gPType1.toString();
        gPType1.setName(":-1:-1");
        gPType1.setName(":-1:-1:-1");
        java.lang.String str9 = gPType1.getName();
        byte[] byte_array10 = gPType1.getParents();
        gPType1.addParent((byte) 100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ":-1:-1:-1" + "'", str9.equals(":-1:-1:-1"));
        org.junit.Assert.assertNull(byte_array10);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test414");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        java.lang.String str8 = gPType3.getName();
        gPType3.addParent((byte) -1);
        java.lang.String str11 = gPType3.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType13 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array16 = gPType15.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType18 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array19 = gPType18.getChildren();
        gPType18.addChild((byte) 1);
        java.lang.String str22 = gPType18.getName();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType18);
        int i24 = gPType18.getId();
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType13, (io.github.agentsoz.jill.struct.AObject) gPType18);
        gPType13.setId((int) (byte) -1);
        java.lang.String str28 = gPType13.getName();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType3, (io.github.agentsoz.jill.struct.AObject) gPType13);
        gPType13.setName(":-1");
        gPType13.setName(":0");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:-1" + "'", str8.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:-1" + "'", str11.equals("hi!:-1"));
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == (-1));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test415");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        byte[] byte_array11 = gPType1.getChildren();
        gPType1.addChild((byte) 10);
        gPType1.setId((int) (byte) 1);
        gPType1.addChild((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test416");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        byte[] byte_array6 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType8 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array9 = gPType8.getParents();
        gPType8.setName("hi!");
        gPType8.setName(":-1:-1");
        gPType8.addChild((byte) -1);
        byte[] byte_array16 = gPType8.getParents();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType8);
        java.lang.String str18 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test417");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        gPType1.setId((int) '#');
        byte[] byte_array14 = gPType1.getChildren();
        gPType1.addChild((byte) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType18 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType20 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array21 = gPType20.getChildren();
        gPType20.addChild((byte) 1);
        int i24 = gPType20.getId();
        gPType20.addChild((byte) 0);
        gPType20.addParent((byte) 1);
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType18, (io.github.agentsoz.jill.struct.AObject) gPType20);
        gPType20.addChild((byte) 1);
        java.lang.String str32 = gPType20.toString();
        java.lang.String str33 = gPType20.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType35 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType37 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType35, (io.github.agentsoz.jill.struct.AObject) gPType37);
        byte[] byte_array39 = gPType37.getParents();
        gPType37.setName("hi!:-1");
        java.lang.String str42 = gPType37.getName();
        int i43 = gPType37.getId();
        gPType37.setName("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType47 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array48 = gPType47.getChildren();
        gPType47.addChild((byte) 1);
        int i51 = gPType47.getId();
        gPType47.addChild((byte) 0);
        gPType47.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType57 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType59 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array60 = gPType59.getChildren();
        gPType59.addChild((byte) 1);
        int i63 = gPType59.getId();
        gPType59.addChild((byte) 0);
        gPType59.addParent((byte) 1);
        boolean b68 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType57, (io.github.agentsoz.jill.struct.AObject) gPType59);
        io.github.agentsoz.jill.struct.GoalPlanType gPType70 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array71 = gPType70.getChildren();
        gPType70.addChild((byte) 1);
        java.lang.String str74 = gPType70.toString();
        boolean b75 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType57, (io.github.agentsoz.jill.struct.AObject) gPType70);
        boolean b76 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType47, (io.github.agentsoz.jill.struct.AObject) gPType70);
        int i77 = gPType47.getId();
        byte[] byte_array78 = gPType47.getChildren();
        gPType47.addChild((byte) -1);
        byte[] byte_array81 = gPType47.getChildren();
        boolean b82 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType37, (io.github.agentsoz.jill.struct.AObject) gPType47);
        boolean b83 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType20, (io.github.agentsoz.jill.struct.AObject) gPType47);
        boolean b84 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType47);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertTrue(i24 == (-1));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + ":-1" + "'", str32.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + ":-1" + "'", str33.equals(":-1"));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(byte_array39);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!:-1" + "'", str42.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i43 == (-1));
        org.junit.Assert.assertNull(byte_array48);
        org.junit.Assert.assertTrue(i51 == (-1));
        org.junit.Assert.assertNull(byte_array60);
        org.junit.Assert.assertTrue(i63 == (-1));
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(byte_array71);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + ":-1" + "'", str74.equals(":-1"));
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(i77 == (-1));
        org.junit.Assert.assertNotNull(byte_array78);
        org.junit.Assert.assertNotNull(byte_array81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(b84 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test418");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        gPType1.setId((int) 'a');
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        java.lang.String str12 = gPType7.toString();
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
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType16);
        byte[] byte_array31 = gPType7.getParents();
        int i32 = gPType7.getId();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType7);
        java.lang.String str34 = gPType7.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1" + "'", str12.equals(":-1"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertTrue(i24 == (-1));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test419");
        byte[] byte_array0 = null;
        byte[] byte_array2 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array0, (int) (byte) 100);
        byte[] byte_array4 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, (int) '#');
        byte[] byte_array6 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, 10);
        byte[] byte_array8 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, (int) '#');
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array4);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array8);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test420");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType10 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array13 = gPType12.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType15 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array16 = gPType15.getChildren();
        gPType15.addChild((byte) 1);
        java.lang.String str19 = gPType15.getName();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, (io.github.agentsoz.jill.struct.AObject) gPType15);
        int i21 = gPType15.getId();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType10, (io.github.agentsoz.jill.struct.AObject) gPType15);
        int i23 = gPType15.getId();
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType15);
        java.lang.String str25 = gPType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test421");
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
        int i29 = gPType1.getId();
        gPType1.setName("hi!:10");
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i29 == (-1));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test422");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.setId((int) (short) -1);
        byte[] byte_array10 = gPType1.getChildren();
        gPType1.addParent((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array10);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test423");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        gPType3.addParent((byte) 10);
        gPType3.setName("hi!:100");
        gPType3.setName(":-1:-1");
        gPType3.setName("hi!");
        gPType3.addChild((byte) 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test424");
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
        gPType11.addChild((byte) 10);
        gPType11.setId((int) (byte) -1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test425");
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
        byte[] byte_array24 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array22, (int) (byte) 10);
        byte[] byte_array26 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array22, (int) (short) 100);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertNotNull(byte_array24);
        org.junit.Assert.assertNotNull(byte_array26);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test426");
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
        java.lang.String str39 = gPType16.getName();
        java.lang.String str40 = gPType16.toString();
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
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!:1:-1" + "'", str39.equals("hi!:1:-1"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!:1:-1:1" + "'", str40.equals("hi!:1:-1:1"));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test427");
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
        gPType23.setName(":-1:1:-1");
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
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test428");
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
        int i31 = gPType1.getId();
        byte[] byte_array32 = gPType1.getChildren();
        byte[] byte_array34 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array32, 97);
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
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertNotNull(byte_array34);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test429");
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
        gPType13.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(byte_array22);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test430");
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
        int i17 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertTrue(i17 == (-1));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test431");
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
        gPType4.addChild((byte) 1);
        gPType4.addChild((byte) 10);
        java.lang.String str17 = gPType4.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test432");
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
        byte[] byte_array28 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array26, (int) '#');
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
        org.junit.Assert.assertNotNull(byte_array28);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test433");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getChildren();
        byte[] byte_array6 = gPType3.getParents();
        gPType3.setName("hi!:1");
        gPType3.setId(1);
        gPType3.setId(97);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array6);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test434");
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
        gPType1.setId(0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ":1" + "'", str14.equals(":1"));
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test435");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        byte[] byte_array6 = gPType3.getParents();
        gPType3.addChild((byte) 10);
        int i9 = gPType3.getId();
        gPType3.addParent((byte) 100);
        gPType3.setName(":10");
        java.lang.String str14 = gPType3.toString();
        gPType3.setName(":100:-1:-1");
        gPType3.addChild((byte) 100);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ":10:-1" + "'", str14.equals(":10:-1"));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test436");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        gPType1.setId((int) 'a');
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array8 = gPType7.getChildren();
        gPType7.addChild((byte) 1);
        int i11 = gPType7.getId();
        java.lang.String str12 = gPType7.toString();
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
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType16);
        byte[] byte_array31 = gPType7.getParents();
        int i32 = gPType7.getId();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType7);
        int i34 = gPType7.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ":-1" + "'", str12.equals(":-1"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertTrue(i24 == (-1));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == (-1));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test437");
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
        byte[] byte_array23 = gPType1.getParents();
        byte[] byte_array25 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array23, (int) (short) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array23);
        org.junit.Assert.assertNotNull(byte_array25);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test438");
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
        int i22 = gPType4.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue(i22 == (-1));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test439");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        int i4 = gPType1.getId();
        gPType1.addParent((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertTrue(i4 == (-1));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test440");
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
        gPType1.setName("hi!");
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == (-1));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test441");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1:-1:-1");
        gPType1.addChild((byte) 100);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test442");
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
        io.github.agentsoz.jill.struct.GoalPlanType gPType37 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array38 = gPType37.getParents();
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType37);
        gPType16.setName(":-1:-1:-1:-1:10");
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
        org.junit.Assert.assertNull(byte_array38);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test443");
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
        gPType1.addParent((byte) 100);
        gPType1.setName("hi!:-1:-1:-1:-1");
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
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test444");
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
        gPType28.addParent((byte) 100);
        byte[] byte_array36 = gPType28.getChildren();
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
        org.junit.Assert.assertNull(byte_array36);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test445");
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
        gPType1.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test446");
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
        gPType19.addChild((byte) 0);
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
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test447");
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
        gPType1.setName(":-1:-1");
        int i19 = gPType1.getId();
        gPType1.setName(":100:-1");
        gPType1.setName("hi!");
        gPType1.addParent((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertTrue(i19 == 35);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test448");
        byte[] byte_array2 = new byte[] { (byte) 100, (byte) 0 };
        byte[] byte_array4 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, 1);
        byte[] byte_array6 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array4, (int) (byte) 10);
        byte[] byte_array8 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array6, (int) '4');
        try {
            byte[] byte_array10 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array4);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array8);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test449");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        int i2 = gPType1.getId();
        byte[] byte_array3 = gPType1.getParents();
        org.junit.Assert.assertTrue(i2 == (-1));
        org.junit.Assert.assertNull(byte_array3);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test450");
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
        java.lang.String str18 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!:35" + "'", str18.equals("hi!:35"));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test451");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        int i8 = gPType3.getId();
        gPType3.setName(":100:-1");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test452");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        java.lang.String str5 = gPType3.getName();
        byte[] byte_array6 = gPType3.getParents();
        gPType3.addParent((byte) 10);
        gPType3.addChild((byte) 100);
        byte[] byte_array11 = gPType3.getChildren();
        gPType3.addParent((byte) 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test453");
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
        gPType17.addChild((byte) 100);
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
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test454");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        java.lang.String str8 = gPType1.toString();
        gPType1.setName(":100:-1");
        byte[] byte_array11 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ":-1" + "'", str8.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test455");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) 1);
        java.lang.String str6 = gPType1.toString();
        java.lang.String str7 = gPType1.getName();
        gPType1.addChild((byte) 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:1:-1" + "'", str6.equals("hi!:1:-1"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:1" + "'", str7.equals("hi!:1"));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test456");
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
        java.lang.String str17 = gPType8.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ":-1" + "'", str16.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test457");
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
        byte[] byte_array21 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array19, (int) (byte) 10);
        byte[] byte_array23 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array19, (int) (byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertNotNull(byte_array21);
        org.junit.Assert.assertNotNull(byte_array23);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test458");
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
        gPType4.addParent((byte) 100);
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
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test459");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) -1);
        byte[] byte_array6 = gPType1.getParents();
        java.lang.String str7 = gPType1.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array10 = gPType9.getChildren();
        gPType9.addChild((byte) 1);
        int i13 = gPType9.getId();
        gPType9.addChild((byte) 0);
        gPType9.addParent((byte) 1);
        gPType9.setName("hi!");
        gPType9.setId((int) '#');
        byte[] byte_array22 = gPType9.getChildren();
        gPType9.addChild((byte) 100);
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType9);
        byte[] byte_array26 = gPType9.getParents();
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(byte_array26);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test460");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        gPType1.setId((int) 'a');
        gPType1.addParent((byte) 0);
        gPType1.setId((int) (byte) 10);
        gPType1.setName(":100");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test461");
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
        io.github.agentsoz.jill.struct.GoalPlanType gPType21 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array22 = gPType21.getChildren();
        gPType21.addChild((byte) 1);
        int i25 = gPType21.getId();
        java.lang.String str26 = gPType21.toString();
        io.github.agentsoz.jill.struct.GoalPlanType gPType28 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType30 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType28, (io.github.agentsoz.jill.struct.AObject) gPType30);
        byte[] byte_array32 = gPType30.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType34 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array35 = gPType34.getChildren();
        gPType34.addChild((byte) 1);
        int i38 = gPType34.getId();
        gPType34.addChild((byte) 0);
        gPType34.addParent((byte) 100);
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType30, (io.github.agentsoz.jill.struct.AObject) gPType34);
        boolean b44 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType21, (io.github.agentsoz.jill.struct.AObject) gPType30);
        byte[] byte_array45 = gPType21.getParents();
        int i46 = gPType21.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType48 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array49 = gPType48.getChildren();
        gPType48.addChild((byte) 1);
        java.lang.String str52 = gPType48.getName();
        java.lang.String str53 = gPType48.getName();
        int i54 = gPType48.getId();
        gPType48.setName(":-1:-1");
        byte[] byte_array57 = gPType48.getParents();
        java.lang.String str58 = gPType48.toString();
        int i59 = gPType48.getId();
        gPType48.addChild((byte) 10);
        boolean b62 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType21, (io.github.agentsoz.jill.struct.AObject) gPType48);
        boolean b63 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType48);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertNull(byte_array22);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + ":-1" + "'", str26.equals(":-1"));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(byte_array32);
        org.junit.Assert.assertNull(byte_array35);
        org.junit.Assert.assertTrue(i38 == (-1));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(byte_array45);
        org.junit.Assert.assertTrue(i46 == (-1));
        org.junit.Assert.assertNull(byte_array49);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        org.junit.Assert.assertTrue(i54 == (-1));
        org.junit.Assert.assertNull(byte_array57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + ":-1:-1:-1" + "'", str58.equals(":-1:-1:-1"));
        org.junit.Assert.assertTrue(i59 == (-1));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test462");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        gPType1.addParent((byte) -1);
        java.lang.String str10 = gPType1.toString();
        byte[] byte_array11 = gPType1.getParents();
        int i12 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ":-1" + "'", str10.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test463");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        int i2 = gPType1.getId();
        java.lang.String str3 = gPType1.toString();
        gPType1.setName(":-1");
        byte[] byte_array6 = gPType1.getChildren();
        byte[] byte_array7 = gPType1.getChildren();
        org.junit.Assert.assertTrue(i2 == (-1));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!:-1" + "'", str3.equals("hi!:-1"));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array7);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test464");
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
        java.lang.String str23 = gPType7.getName();
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
        gPType25.setName(":52");
        byte[] byte_array42 = gPType25.getParents();
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType25);
        gPType7.addChild((byte) 100);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!:-1:-1" + "'", str22.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:-1:-1" + "'", str23.equals("hi!:-1:-1"));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(byte_array42);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test465");
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
        gPType6.addParent((byte) -1);
        int i19 = gPType6.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1:-1" + "'", str9.equals("hi!:1:-1"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 10);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test466");
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
        gPType1.setName("hi!:35:-1");
        gPType1.setId((int) (byte) 100);
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
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test467");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        gPType1.setId((int) 'a');
        int i6 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertTrue(i6 == 97);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test468");
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
        byte[] byte_array23 = gPType12.getParents();
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
        org.junit.Assert.assertNull(byte_array23);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test469");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType1.addChild((byte) 0);
        byte[] byte_array7 = gPType1.getParents();
        java.lang.String str8 = gPType1.toString();
        java.lang.String str9 = gPType1.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:1:-1" + "'", str8.equals("hi!:1:-1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test470");
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
        io.github.agentsoz.jill.struct.GoalPlanType gPType37 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array38 = gPType37.getParents();
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType16, (io.github.agentsoz.jill.struct.AObject) gPType37);
        int i40 = gPType37.getId();
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
        org.junit.Assert.assertNull(byte_array38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == (-1));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test471");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        int i10 = gPType1.getId();
        byte[] byte_array11 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test472");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:-1");
        gPType1.addParent((byte) -1);
        byte[] byte_array4 = gPType1.getParents();
        byte[] byte_array5 = gPType1.getParents();
        byte[] byte_array7 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, 0);
        byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, (int) (byte) 0);
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) ' ');
        org.junit.Assert.assertNotNull(byte_array4);
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test473");
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
        gPType24.addParent((byte) -1);
        java.lang.String str33 = gPType24.toString();
        java.lang.String str34 = gPType24.getName();
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
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test474");
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
        byte[] byte_array22 = gPType14.getParents();
        byte[] byte_array24 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array22, (int) (short) 100);
        byte[] byte_array26 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array24, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertNotNull(byte_array24);
        org.junit.Assert.assertNotNull(byte_array26);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test475");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        gPType1.setName(":100:-1");
        gPType1.addParent((byte) 1);
        gPType1.setName("hi!");
        byte[] byte_array11 = gPType1.getParents();
        gPType1.setName(":-1:-1:1");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test476");
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
        gPType4.addParent((byte) -1);
        gPType4.setName(":52:-1");
        gPType4.setName("hi!:-1:-1");
        int i22 = gPType4.getId();
        int i23 = gPType4.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(i23 == (-1));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test477");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        byte[] byte_array4 = gPType1.getChildren();
        byte[] byte_array5 = gPType1.getParents();
        byte[] byte_array6 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array6);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test478");
        byte[] byte_array0 = null;
        byte[] byte_array2 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array0, (int) (byte) 100);
        byte[] byte_array4 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, (int) '#');
        byte[] byte_array6 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, 10);
        byte[] byte_array8 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, (int) 'a');
        byte[] byte_array10 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, 35);
        byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (int) (short) 100);
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array4);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test479");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        gPType1.setId((int) (byte) 100);
        gPType1.addChild((byte) 1);
        gPType1.setName(":-1:-1");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test480");
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
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array23 = gPType22.getParents();
        gPType22.setName("hi!");
        gPType22.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType29 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array30 = gPType29.getParents();
        int i31 = gPType29.getId();
        byte[] byte_array32 = gPType29.getChildren();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType22, (io.github.agentsoz.jill.struct.AObject) gPType29);
        byte[] byte_array34 = gPType29.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType36 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array37 = gPType36.getParents();
        java.lang.String str38 = gPType36.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType40 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array41 = gPType40.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType43 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array44 = gPType43.getChildren();
        gPType43.addChild((byte) 1);
        java.lang.String str47 = gPType43.getName();
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType40, (io.github.agentsoz.jill.struct.AObject) gPType43);
        int i49 = gPType43.getId();
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType36, (io.github.agentsoz.jill.struct.AObject) gPType43);
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType29, (io.github.agentsoz.jill.struct.AObject) gPType36);
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType15, (io.github.agentsoz.jill.struct.AObject) gPType29);
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
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertNull(byte_array30);
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertNull(byte_array32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(byte_array34);
        org.junit.Assert.assertNull(byte_array37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertNull(byte_array41);
        org.junit.Assert.assertNull(byte_array44);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i49 == (-1));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test481");
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
        byte[] byte_array31 = gPType23.getChildren();
        byte[] byte_array32 = gPType23.getChildren();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(byte_array31);
        org.junit.Assert.assertNotNull(byte_array32);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test482");
        byte[] byte_array2 = new byte[] { (byte) 100, (byte) 0 };
        byte[] byte_array4 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, 1);
        byte[] byte_array6 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, (int) '4');
        try {
            byte[] byte_array8 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array4);
        org.junit.Assert.assertNotNull(byte_array6);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test483");
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
        java.lang.String str32 = gPType16.getName();
        gPType16.addChild((byte) 1);
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
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test484");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        int i5 = gPType1.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType7 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType9 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array10 = gPType9.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array13 = gPType12.getChildren();
        gPType12.addChild((byte) 1);
        java.lang.String str16 = gPType12.getName();
        boolean b17 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType9, (io.github.agentsoz.jill.struct.AObject) gPType12);
        int i18 = gPType12.getId();
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType7, (io.github.agentsoz.jill.struct.AObject) gPType12);
        gPType7.setId((int) (byte) -1);
        byte[] byte_array22 = gPType7.getParents();
        java.lang.String str23 = gPType7.toString();
        byte[] byte_array24 = gPType7.getChildren();
        gPType7.addParent((byte) 100);
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType7);
        gPType7.addChild((byte) 10);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(byte_array22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ":-1" + "'", str23.equals(":-1"));
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test485");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":52:-1");
        java.lang.String str2 = gPType1.toString();
        byte[] byte_array3 = gPType1.getParents();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ":52:-1:-1" + "'", str2.equals(":52:-1:-1"));
        org.junit.Assert.assertNull(byte_array3);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test486");
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
        java.lang.String str18 = gPType3.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test487");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.addParent((byte) 100);
        gPType1.addParent((byte) 1);
        byte[] byte_array12 = gPType1.getChildren();
        java.lang.String str13 = gPType1.getName();
        byte[] byte_array14 = gPType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(byte_array14);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test488");
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
        gPType3.addChild((byte) 1);
        java.lang.String str22 = gPType3.toString();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + ":-1" + "'", str22.equals(":-1"));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test489");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType(":52:-1:-1");
        gPType1.setId((int) (byte) 10);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test490");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        java.lang.String str8 = gPType3.getName();
        int i9 = gPType3.getId();
        java.lang.String str10 = gPType3.toString();
        gPType3.setId(52);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:-1" + "'", str8.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1:-1" + "'", str10.equals("hi!:-1:-1"));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test491");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        byte[] byte_array10 = gPType4.getChildren();
        byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (int) (byte) 0);
        byte[] byte_array14 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array12, (int) '4');
        try {
            byte[] byte_array16 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array12, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array14);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test492");
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
        byte[] byte_array16 = gPType8.getChildren();
        java.lang.String str17 = gPType8.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ":-1" + "'", str6.equals(":-1"));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test493");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        java.lang.String str4 = gPType1.getName();
        gPType1.setName(":97");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test494");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setId((int) (byte) 1);
        java.lang.String str5 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ":1" + "'", str5.equals(":1"));
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test495");
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
        java.lang.String str39 = gPType16.getName();
        gPType16.setName("hi!:-1:-1:-1");
        gPType16.addChild((byte) -1);
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
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!:1:-1" + "'", str39.equals("hi!:1:-1"));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test496");
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
        gPType33.addChild((byte) 1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType46 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array47 = gPType46.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType49 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array50 = gPType49.getChildren();
        gPType49.addChild((byte) 1);
        java.lang.String str53 = gPType49.getName();
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType46, (io.github.agentsoz.jill.struct.AObject) gPType49);
        io.github.agentsoz.jill.struct.GoalPlanType gPType56 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array57 = gPType56.getParents();
        gPType56.setId((int) (short) 10);
        boolean b60 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType46, (io.github.agentsoz.jill.struct.AObject) gPType56);
        byte[] byte_array61 = gPType56.getParents();
        gPType56.addChild((byte) -1);
        gPType56.setId(0);
        boolean b66 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType33, (io.github.agentsoz.jill.struct.AObject) gPType56);
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
        org.junit.Assert.assertNull(byte_array47);
        org.junit.Assert.assertNull(byte_array50);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(byte_array57);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(byte_array61);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test497");
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
        io.github.agentsoz.jill.struct.GoalPlanType gPType17 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array18 = gPType17.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType20 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array21 = gPType20.getChildren();
        gPType20.addChild((byte) 1);
        java.lang.String str24 = gPType20.getName();
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType17, (io.github.agentsoz.jill.struct.AObject) gPType20);
        io.github.agentsoz.jill.struct.GoalPlanType gPType27 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array28 = gPType27.getParents();
        gPType27.setId((int) (short) 10);
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType17, (io.github.agentsoz.jill.struct.AObject) gPType27);
        gPType27.setName("");
        byte[] byte_array34 = gPType27.getParents();
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType27);
        int i36 = gPType27.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(byte_array34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == 10);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test498");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        java.lang.String str7 = gPType1.getName();
        int i8 = gPType1.getId();
        byte[] byte_array9 = gPType1.getChildren();
        byte[] byte_array10 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNull(byte_array10);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test499");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) -1);
        gPType1.setName("hi!:-1:-1");
        int i8 = gPType1.getId();
        gPType1.setName("hi!:-1:-1:-1");
        java.lang.String str11 = gPType1.toString();
        java.lang.String str12 = gPType1.toString();
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:-1:-1:-1:-1" + "'", str11.equals("hi!:-1:-1:-1:-1"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1:-1:-1:-1" + "'", str12.equals("hi!:-1:-1:-1:-1"));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest1.test500");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        gPType1.setId((int) (byte) -1);
        gPType1.addParent((byte) 10);
        java.lang.String str6 = gPType1.toString();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:1:-1" + "'", str6.equals("hi!:1:-1"));
    }
}

