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
public class PlanTypeRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test001");
        byte[] byte_array5 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        byte[] byte_array7 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, 100);
        try {
            byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array7);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test002");
        byte[] byte_array5 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        byte[] byte_array7 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, 100);
        try {
            byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array7);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test003");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        byte[] byte_array13 = planType1.getParents();
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (short) 10);
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, 1);
        try {
            byte[] byte_array19 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array17, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array17);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test004");
        byte[] byte_array3 = new byte[] { (byte) 10, (byte) 0, (byte) 0 };
        try {
            byte[] byte_array5 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byte_array3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test005");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType17.setContext(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        java.lang.String str23 = planType17.getName();
        planType17.addChild((byte) 10);
        java.lang.reflect.Method method26 = planType17.getContext();
        java.lang.reflect.Method method27 = null;
        planType17.setContext(method27);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNull(method26);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test006");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        java.lang.String str12 = planType1.toString();
        planType1.addChild((byte) -1);
        java.lang.String str15 = planType1.getName();
        byte[] byte_array16 = planType1.getChildren();
        planType1.setName("");
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test007");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.setName("hi!:-1");
        int i10 = planType1.getId();
        int i11 = planType1.getId();
        java.lang.reflect.Method method12 = null;
        planType1.setBody(method12);
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        java.lang.reflect.Method method18 = null;
        planType15.setContext(method18);
        planType15.setName("hi!");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType15);
        planType15.setName("hi!:1");
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test008");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        java.lang.reflect.Method method12 = null;
        planType9.setContext(method12);
        planType9.setName("hi!");
        java.lang.reflect.Method method16 = null;
        planType9.setContext(method16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        int i19 = planType1.getId();
        planType1.addChild((byte) 1);
        planType1.setName("");
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test009");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        int i9 = planType1.getId();
        int i10 = planType1.getId();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test010");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.reflect.Method method4 = null;
        planType1.setBody(method4);
        int i6 = planType1.getId();
        byte[] byte_array7 = planType1.getChildren();
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNull(byte_array7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test011");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        byte[] byte_array13 = planType1.getParents();
        planType1.addParent((byte) 0);
        java.lang.reflect.Method method16 = planType1.getBody();
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test012");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.String str9 = planType1.toString();
        java.lang.reflect.Method method10 = planType1.getBody();
        java.lang.reflect.Method method11 = planType1.getBody();
        java.lang.reflect.Method method12 = null;
        planType1.setBody(method12);
        planType1.setName(":-1");
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:-1" + "'", str9.equals("hi!:-1"));
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test013");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.setName("hi!:-1");
        int i10 = planType1.getId();
        byte[] byte_array11 = planType1.getParents();
        int i12 = planType1.getId();
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test014");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        io.github.agentsoz.jill.struct.PlanType planType11 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType11.addChild((byte) 1);
        planType11.addParent((byte) 10);
        planType11.setId(1);
        planType11.addChild((byte) 1);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType11);
        java.lang.reflect.Method method21 = planType1.getBody();
        byte[] byte_array22 = planType1.getChildren();
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(byte_array22);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test015");
        io.github.agentsoz.jill.struct.AObject aObject0 = null;
        io.github.agentsoz.jill.struct.PlanType planType2 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType2.addChild((byte) 1);
        java.lang.reflect.Method method5 = null;
        planType2.setContext(method5);
        java.lang.String str7 = planType2.toString();
        try {
            boolean b8 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject0, (io.github.agentsoz.jill.struct.AObject) planType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:-1" + "'", str7.equals("hi!:-1"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test016");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("");
        byte[] byte_array9 = planType1.getChildren();
        java.lang.Class<?> cls10 = planType1.getPlanClass();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNull(cls10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test017");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        byte[] byte_array10 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array8, (int) (short) 0);
        try {
            byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test018");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        planType1.setName("");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 100);
        planType1.addParent((byte) 0);
        planType1.setName(":-1");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test019");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 1);
        java.lang.String str4 = planType1.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test020");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = null;
        planType1.setContext(method5);
        int i7 = planType1.getId();
        java.lang.String str8 = planType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test021");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        byte[] byte_array8 = planType1.getParents();
        int i9 = planType1.getId();
        planType1.addChild((byte) -1);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertTrue(i9 == (-1));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test022");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType17.setContext(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        java.lang.String str23 = planType17.getName();
        planType17.addChild((byte) 10);
        io.github.agentsoz.jill.struct.AObject aObject26 = null;
        try {
            boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType17, aObject26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test023");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.reflect.Method method4 = null;
        planType1.setBody(method4);
        int i6 = planType1.getId();
        java.lang.reflect.Method method7 = null;
        planType1.setBody(method7);
        org.junit.Assert.assertTrue(i6 == (-1));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test024");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.String str9 = planType1.toString();
        planType1.setId((int) '4');
        planType1.setId((int) (byte) 1);
        planType1.setId((-1));
        java.lang.reflect.Method method16 = null;
        planType1.setContext(method16);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test025");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        java.lang.reflect.Method method17 = null;
        planType1.setBody(method17);
        planType1.setName("");
        byte[] byte_array21 = planType1.getChildren();
        try {
            byte[] byte_array23 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array21, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(byte_array21);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test026");
        byte[] byte_array0 = null;
        byte[] byte_array2 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array0, (int) '#');
        org.junit.Assert.assertNotNull(byte_array2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test027");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.String str4 = planType1.toString();
        java.lang.String str5 = planType1.toString();
        planType1.addChild((byte) 10);
        int i8 = planType1.getId();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        planType10.addParent((byte) 1);
        byte[] byte_array17 = planType10.getParents();
        java.lang.String str18 = planType10.toString();
        byte[] byte_array19 = planType10.getParents();
        java.lang.Class<?> cls20 = planType10.getPlanClass();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        java.lang.reflect.Method method22 = planType1.getBody();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!:-1" + "'", str18.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertNull(cls20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test028");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = null;
        planType1.setContext(method5);
        int i7 = planType1.getId();
        int i8 = planType1.getId();
        byte[] byte_array9 = planType1.getParents();
        java.lang.reflect.Method method10 = planType1.getBody();
        planType1.setId((int) (byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test029");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        java.lang.reflect.Method method10 = planType1.getContext();
        planType1.setName("");
        byte[] byte_array13 = planType1.getParents();
        planType1.setName("hi!:1");
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test030");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.setName("hi!:-1");
        int i10 = planType1.getId();
        int i11 = planType1.getId();
        java.lang.reflect.Method method12 = null;
        planType1.setBody(method12);
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        java.lang.reflect.Method method18 = null;
        planType15.setContext(method18);
        planType15.setName("hi!");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType15);
        io.github.agentsoz.jill.struct.PlanType planType24 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType24.addParent((byte) 1);
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType15, (io.github.agentsoz.jill.struct.AObject) planType24);
        byte[] byte_array28 = planType24.getParents();
        byte[] byte_array30 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array28, (int) (short) 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(byte_array28);
        org.junit.Assert.assertNotNull(byte_array30);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test031");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        int i4 = planType1.getId();
        io.github.agentsoz.jill.struct.PlanType planType6 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType6.addChild((byte) 1);
        planType6.addParent((byte) 10);
        planType6.setId(1);
        java.lang.reflect.Method method13 = planType6.getBody();
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        planType15.addParent((byte) 10);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType6, (io.github.agentsoz.jill.struct.AObject) planType15);
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType6);
        java.lang.reflect.Method method22 = null;
        planType1.setContext(method22);
        java.lang.reflect.Method method24 = null;
        planType1.setBody(method24);
        planType1.addChild((byte) 0);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test032");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        try {
            byte[] byte_array10 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byte_array8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test033");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        io.github.agentsoz.jill.struct.AObject aObject10 = null;
        try {
            boolean b11 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, aObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test034");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.String str9 = planType1.toString();
        java.lang.reflect.Method method10 = planType1.getBody();
        java.lang.reflect.Method method11 = planType1.getBody();
        java.lang.reflect.Method method12 = planType1.getContext();
        java.lang.reflect.Method method13 = null;
        planType1.setContext(method13);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:-1" + "'", str9.equals("hi!:-1"));
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test035");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!:1");
        java.lang.reflect.Method method2 = null;
        planType1.setContext(method2);
        java.lang.reflect.Method method4 = planType1.getContext();
        planType1.addParent((byte) -1);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test036");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        byte[] byte_array10 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array8, (int) ' ');
        byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test037");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        io.github.agentsoz.jill.struct.PlanType planType22 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType22.addChild((byte) 1);
        planType22.addParent((byte) 10);
        planType22.addParent((byte) 1);
        byte[] byte_array29 = planType22.getParents();
        java.lang.String str30 = planType22.toString();
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType18, (io.github.agentsoz.jill.struct.AObject) planType22);
        byte[] byte_array32 = planType22.getParents();
        planType22.addChild((byte) 100);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(byte_array29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1" + "'", str30.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(byte_array32);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test038");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        java.lang.reflect.Method method14 = null;
        planType1.setContext(method14);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test039");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        java.lang.reflect.Method method6 = planType1.getBody();
        int i7 = planType1.getId();
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue(i7 == (-1));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test040");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.String str4 = planType1.toString();
        java.lang.String str5 = planType1.toString();
        planType1.addChild((byte) 10);
        planType1.addChild((byte) 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test041");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.String str4 = planType1.toString();
        java.lang.reflect.Method method5 = null;
        planType1.setContext(method5);
        planType1.setName(":1");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test042");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        byte[] byte_array4 = planType1.getChildren();
        byte[] byte_array6 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array4, (int) (short) 0);
        org.junit.Assert.assertNotNull(byte_array4);
        org.junit.Assert.assertNotNull(byte_array6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test043");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        planType1.setName("hi!:-1");
        io.github.agentsoz.jill.struct.PlanType planType6 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType6.addChild((byte) 1);
        java.lang.reflect.Method method9 = null;
        planType6.setContext(method9);
        planType6.addParent((byte) 0);
        java.lang.Class<?> cls13 = planType6.getPlanClass();
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType6);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(cls13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test044");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        byte[] byte_array4 = planType1.getParents();
        java.lang.reflect.Method method5 = null;
        planType1.setBody(method5);
        io.github.agentsoz.jill.struct.PlanType planType8 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType8.addParent((byte) 10);
        java.lang.String str11 = planType8.toString();
        java.lang.String str12 = planType8.getName();
        java.lang.Class<?> cls13 = planType8.getPlanClass();
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType8);
        byte[] byte_array15 = planType1.getParents();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:-1" + "'", str11.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNull(cls13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(byte_array15);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test045");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        int i9 = planType1.getId();
        java.lang.String str10 = planType1.toString();
        planType1.addParent((byte) 1);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:1" + "'", str10.equals("hi!:1"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test046");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        planType1.setName("");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 100);
        java.lang.reflect.Method method18 = planType1.getContext();
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test047");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.String str9 = planType1.toString();
        java.lang.String str10 = planType1.toString();
        java.lang.reflect.Method method11 = null;
        planType1.setContext(method11);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:1" + "'", str10.equals("hi!:1"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test048");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 1);
        java.lang.reflect.Method method4 = planType1.getContext();
        java.lang.reflect.Method method5 = null;
        planType1.setContext(method5);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test049");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        io.github.agentsoz.jill.struct.PlanType planType11 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType11.addChild((byte) 1);
        planType11.addParent((byte) 10);
        planType11.setId(1);
        planType11.addChild((byte) 1);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType11);
        java.lang.reflect.Method method21 = planType11.getContext();
        planType11.addParent((byte) 1);
        planType11.setId((int) (short) 10);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test050");
        byte[] byte_array5 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        byte[] byte_array7 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, 100);
        byte[] byte_array9 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array5, 0);
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test051");
        byte[] byte_array0 = null;
        byte[] byte_array2 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array0, (-1));
        org.junit.Assert.assertNotNull(byte_array2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test052");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        planType1.addChild((byte) 100);
        java.lang.String str12 = planType1.toString();
        planType1.setId((int) 'a');
        io.github.agentsoz.jill.struct.PlanType planType16 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType16.addChild((byte) 1);
        java.lang.reflect.Method method19 = null;
        planType16.setContext(method19);
        planType16.setName("hi!");
        java.lang.reflect.Method method23 = null;
        planType16.setContext(method23);
        io.github.agentsoz.jill.struct.PlanType planType26 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType26.addChild((byte) 1);
        planType26.addParent((byte) 10);
        planType26.setId(1);
        planType26.addChild((byte) 1);
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType16, (io.github.agentsoz.jill.struct.AObject) planType26);
        java.lang.reflect.Method method36 = planType26.getContext();
        planType26.addParent((byte) 1);
        byte[] byte_array39 = planType26.getChildren();
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType26);
        byte[] byte_array41 = planType1.getParents();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNotNull(byte_array39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(byte_array41);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test053");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.String str4 = planType1.toString();
        java.lang.String str5 = planType1.getName();
        java.lang.reflect.Method method6 = null;
        planType1.setContext(method6);
        byte[] byte_array8 = planType1.getChildren();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(byte_array8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test054");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.String str4 = planType1.toString();
        java.lang.String str5 = planType1.toString();
        planType1.addChild((byte) 10);
        java.lang.reflect.Method method8 = planType1.getContext();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test055");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = null;
        planType1.setContext(method5);
        int i7 = planType1.getId();
        int i8 = planType1.getId();
        byte[] byte_array9 = planType1.getParents();
        java.lang.reflect.Method method10 = planType1.getBody();
        planType1.setId((int) '#');
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test056");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!:-1");
        java.lang.reflect.Method method2 = planType1.getBody();
        java.lang.String str3 = planType1.toString();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!:-1:-1" + "'", str3.equals("hi!:-1:-1"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test057");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        byte[] byte_array6 = planType1.getChildren();
        java.lang.reflect.Method method7 = planType1.getBody();
        planType1.addParent((byte) 0);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test058");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.reflect.Method method9 = planType1.getContext();
        io.github.agentsoz.jill.struct.PlanType planType11 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType11.addChild((byte) 1);
        planType11.addParent((byte) 10);
        planType11.setId(1);
        java.lang.reflect.Method method18 = planType11.getBody();
        io.github.agentsoz.jill.struct.PlanType planType20 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType20.addChild((byte) 1);
        planType20.addParent((byte) 10);
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType11, (io.github.agentsoz.jill.struct.AObject) planType20);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType20);
        byte[] byte_array27 = planType1.getParents();
        planType1.setId((int) (short) 100);
        java.lang.reflect.Method method30 = null;
        planType1.setContext(method30);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(byte_array27);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test059");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.setName("hi!:-1");
        java.lang.String str10 = planType1.toString();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1:1" + "'", str10.equals("hi!:-1:1"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test060");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.String str9 = planType1.toString();
        java.lang.reflect.Method method10 = planType1.getBody();
        byte[] byte_array11 = planType1.getParents();
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, (int) '4');
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (byte) 10);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test061");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("");
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        java.lang.reflect.Method method15 = planType10.getBody();
        planType10.setId((int) '4');
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType20 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array21 = planType20.getChildren();
        java.lang.reflect.Method method22 = null;
        planType20.setContext(method22);
        java.lang.reflect.Method method24 = planType20.getContext();
        java.lang.Class<?> cls25 = planType20.getPlanClass();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType20);
        java.lang.reflect.Method method27 = planType1.getBody();
        java.lang.reflect.Method method28 = null;
        planType1.setBody(method28);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(cls25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(method27);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test062");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        byte[] byte_array13 = planType1.getParents();
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (short) 10);
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, 1);
        byte[] byte_array19 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (byte) 100);
        byte[] byte_array21 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array19, 100);
        try {
            byte[] byte_array23 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array19, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertNotNull(byte_array21);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test063");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        planType1.addChild((byte) 100);
        java.lang.String str12 = planType1.toString();
        planType1.setId((int) 'a');
        io.github.agentsoz.jill.struct.PlanType planType16 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType16.addChild((byte) 1);
        java.lang.reflect.Method method19 = null;
        planType16.setContext(method19);
        planType16.setName("hi!");
        java.lang.reflect.Method method23 = null;
        planType16.setContext(method23);
        io.github.agentsoz.jill.struct.PlanType planType26 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType26.addChild((byte) 1);
        planType26.addParent((byte) 10);
        planType26.setId(1);
        planType26.addChild((byte) 1);
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType16, (io.github.agentsoz.jill.struct.AObject) planType26);
        java.lang.reflect.Method method36 = planType26.getContext();
        planType26.addParent((byte) 1);
        byte[] byte_array39 = planType26.getChildren();
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType26);
        planType1.addParent((byte) 1);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNotNull(byte_array39);
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test064");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = planType1.getContext();
        java.lang.Class<?> cls6 = planType1.getPlanClass();
        byte[] byte_array7 = planType1.getParents();
        java.lang.reflect.Method method8 = null;
        planType1.setBody(method8);
        java.lang.String str10 = planType1.toString();
        byte[] byte_array11 = planType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(cls6);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertNull(byte_array11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test065");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        byte[] byte_array6 = planType1.getChildren();
        byte[] byte_array7 = planType1.getParents();
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNull(byte_array7);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test066");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.setName("hi!:-1");
        int i10 = planType1.getId();
        java.lang.Class<?> cls11 = planType1.getPlanClass();
        byte[] byte_array12 = planType1.getChildren();
        java.lang.Class<?> cls13 = planType1.getPlanClass();
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(cls11);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNull(cls13);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test067");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        java.lang.Class<?> cls21 = planType18.getPlanClass();
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(cls21);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test068");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("hi!:-1");
        java.lang.reflect.Method method9 = null;
        planType1.setContext(method9);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test069");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        planType1.addChild((byte) 100);
        java.lang.String str12 = planType1.toString();
        planType1.setId((int) 'a');
        io.github.agentsoz.jill.struct.PlanType planType16 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType16.addChild((byte) 1);
        java.lang.reflect.Method method19 = null;
        planType16.setContext(method19);
        planType16.setName("hi!");
        java.lang.reflect.Method method23 = null;
        planType16.setContext(method23);
        io.github.agentsoz.jill.struct.PlanType planType26 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType26.addChild((byte) 1);
        planType26.addParent((byte) 10);
        planType26.setId(1);
        planType26.addChild((byte) 1);
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType16, (io.github.agentsoz.jill.struct.AObject) planType26);
        java.lang.reflect.Method method36 = planType26.getContext();
        planType26.addParent((byte) 1);
        byte[] byte_array39 = planType26.getChildren();
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType26);
        java.lang.reflect.Method method41 = null;
        planType26.setContext(method41);
        byte[] byte_array43 = planType26.getChildren();
        java.lang.reflect.Method method44 = planType26.getContext();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNotNull(byte_array39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(byte_array43);
        org.junit.Assert.assertNull(method44);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test070");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        io.github.agentsoz.jill.struct.PlanType planType3 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType3.addChild((byte) 1);
        planType3.addParent((byte) 10);
        planType3.addParent((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType3.setBody(method10);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType3);
        byte[] byte_array13 = planType3.getChildren();
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (short) 10);
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array15, 1);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array17);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test071");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        io.github.agentsoz.jill.struct.PlanType planType11 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType11.addChild((byte) 1);
        planType11.addParent((byte) 10);
        planType11.setId(1);
        planType11.addChild((byte) 1);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType11);
        java.lang.Class<?> cls21 = planType1.getPlanClass();
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(cls21);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test072");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        java.lang.reflect.Method method16 = planType10.getContext();
        java.lang.Class<?> cls17 = planType10.getPlanClass();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(cls17);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test073");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        org.junit.Assert.assertNull(byte_array2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test074");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.setName("hi!:-1");
        int i10 = planType1.getId();
        int i11 = planType1.getId();
        java.lang.reflect.Method method12 = null;
        planType1.setBody(method12);
        byte[] byte_array14 = planType1.getChildren();
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(byte_array14);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test075");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        byte[] byte_array12 = planType1.getParents();
        byte[] byte_array13 = planType1.getParents();
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test076");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.String str4 = planType1.toString();
        java.lang.String str5 = planType1.toString();
        planType1.addChild((byte) 10);
        int i8 = planType1.getId();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        planType10.addParent((byte) 1);
        byte[] byte_array17 = planType10.getParents();
        java.lang.String str18 = planType10.toString();
        byte[] byte_array19 = planType10.getParents();
        java.lang.Class<?> cls20 = planType10.getPlanClass();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        byte[] byte_array22 = planType1.getParents();
        try {
            byte[] byte_array24 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array22, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!:-1" + "'", str18.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertNull(cls20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(byte_array22);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test077");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = planType1.getContext();
        byte[] byte_array11 = planType1.getChildren();
        java.lang.Class<?> cls12 = planType1.getPlanClass();
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNull(cls12);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test078");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        byte[] byte_array9 = planType1.getChildren();
        planType1.addChild((byte) -1);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(byte_array9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test079");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType17.setContext(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        java.lang.String str23 = planType17.getName();
        planType17.addChild((byte) 10);
        planType17.setName("hi!");
        int i28 = planType17.getId();
        java.lang.String str29 = planType17.toString();
        java.lang.reflect.Method method30 = planType17.getContext();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue(i28 == (-1));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!:-1" + "'", str29.equals("hi!:-1"));
        org.junit.Assert.assertNull(method30);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test080");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        java.lang.String str2 = planType1.getName();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = planType1.getContext();
        java.lang.reflect.Method method6 = planType1.getContext();
        planType1.setName("hi!:52");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test081");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        java.lang.String str12 = planType1.toString();
        java.lang.String str13 = planType1.getName();
        java.lang.reflect.Method method14 = null;
        planType1.setBody(method14);
        planType1.addParent((byte) 10);
        planType1.addChild((byte) 100);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test082");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        byte[] byte_array10 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array8, (int) (byte) 10);
        byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array8, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test083");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        io.github.agentsoz.jill.struct.PlanType planType3 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType3.addChild((byte) 1);
        planType3.addParent((byte) 10);
        planType3.addParent((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType3.setBody(method10);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType3);
        byte[] byte_array13 = planType3.getChildren();
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        planType15.addParent((byte) 10);
        planType15.setId(1);
        byte[] byte_array22 = planType15.getParents();
        java.lang.reflect.Method method23 = planType15.getContext();
        io.github.agentsoz.jill.struct.PlanType planType25 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType25.addChild((byte) 1);
        planType25.addParent((byte) 10);
        planType25.setId(1);
        java.lang.reflect.Method method32 = planType25.getBody();
        io.github.agentsoz.jill.struct.PlanType planType34 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType34.addChild((byte) 1);
        planType34.addParent((byte) 10);
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType25, (io.github.agentsoz.jill.struct.AObject) planType34);
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType15, (io.github.agentsoz.jill.struct.AObject) planType34);
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType3, (io.github.agentsoz.jill.struct.AObject) planType34);
        java.lang.String str42 = planType3.toString();
        java.lang.Class<?> cls43 = planType3.getPlanClass();
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(method32);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!:-1" + "'", str42.equals("hi!:-1"));
        org.junit.Assert.assertNull(cls43);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test084");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = planType1.getContext();
        planType1.setName(":1");
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test085");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.reflect.Method method9 = planType1.getBody();
        planType1.setId((int) 'a');
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test086");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        java.lang.reflect.Method method12 = null;
        planType9.setContext(method12);
        planType9.setName("hi!");
        java.lang.reflect.Method method16 = null;
        planType9.setContext(method16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        int i19 = planType1.getId();
        java.lang.reflect.Method method20 = null;
        planType1.setBody(method20);
        java.lang.String str22 = planType1.toString();
        planType1.addChild((byte) 100);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!:1" + "'", str22.equals("hi!:1"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test087");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.String str4 = planType1.toString();
        java.lang.String str5 = planType1.toString();
        planType1.addChild((byte) 10);
        int i8 = planType1.getId();
        java.lang.reflect.Method method9 = planType1.getBody();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test088");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.setName("hi!:-1");
        int i10 = planType1.getId();
        byte[] byte_array11 = planType1.getParents();
        java.lang.reflect.Method method12 = planType1.getContext();
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test089");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        int i9 = planType1.getId();
        java.lang.String str10 = planType1.toString();
        java.lang.reflect.Method method11 = null;
        planType1.setContext(method11);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:1" + "'", str10.equals("hi!:1"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test090");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        byte[] byte_array4 = planType1.getParents();
        java.lang.reflect.Method method5 = null;
        planType1.setContext(method5);
        java.lang.String str7 = planType1.toString();
        int i8 = planType1.getId();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:-1" + "'", str7.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test091");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType17.setContext(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        java.lang.String str23 = planType17.getName();
        planType17.addChild((byte) 10);
        planType17.setName("hi!");
        int i28 = planType17.getId();
        java.lang.reflect.Method method29 = null;
        planType17.setBody(method29);
        planType17.setName("hi!:1");
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue(i28 == (-1));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test092");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.setName("hi!:-1");
        int i10 = planType1.getId();
        int i11 = planType1.getId();
        java.lang.reflect.Method method12 = null;
        planType1.setBody(method12);
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        java.lang.reflect.Method method18 = null;
        planType15.setContext(method18);
        planType15.setName("hi!");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType15);
        io.github.agentsoz.jill.struct.PlanType planType24 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType24.addParent((byte) 1);
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType15, (io.github.agentsoz.jill.struct.AObject) planType24);
        byte[] byte_array28 = planType24.getParents();
        java.lang.Class<?> cls29 = planType24.getPlanClass();
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(byte_array28);
        org.junit.Assert.assertNull(cls29);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test093");
        byte[] byte_array0 = null;
        byte[] byte_array2 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array0, (int) (short) 10);
        org.junit.Assert.assertNotNull(byte_array2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test094");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        io.github.agentsoz.jill.struct.PlanType planType11 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType11.addChild((byte) 1);
        planType11.addParent((byte) 10);
        planType11.setId(1);
        planType11.addChild((byte) 1);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType11);
        java.lang.reflect.Method method21 = planType11.getContext();
        java.lang.Class<?> cls22 = planType11.getPlanClass();
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(cls22);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test095");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addChild((byte) 0);
        java.lang.reflect.Method method12 = planType1.getContext();
        java.lang.reflect.Method method13 = planType1.getContext();
        java.lang.reflect.Method method14 = null;
        planType1.setContext(method14);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test096");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.String str9 = planType1.toString();
        java.lang.reflect.Method method10 = planType1.getBody();
        java.lang.reflect.Method method11 = planType1.getBody();
        java.lang.reflect.Method method12 = planType1.getContext();
        java.lang.reflect.Method method13 = planType1.getBody();
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:-1" + "'", str9.equals("hi!:-1"));
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test097");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType17.setContext(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        java.lang.String str23 = planType17.getName();
        planType17.addChild((byte) 10);
        planType17.setName("hi!");
        byte[] byte_array28 = planType17.getParents();
        planType17.addChild((byte) 0);
        java.lang.Class<?> cls31 = planType17.getPlanClass();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertNull(cls31);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test098");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        java.lang.reflect.Method method16 = null;
        planType1.setBody(method16);
        java.lang.reflect.Method method18 = null;
        planType1.setContext(method18);
        int i20 = planType1.getId();
        java.lang.String str21 = planType1.toString();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!:1" + "'", str21.equals("hi!:1"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test099");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        byte[] byte_array4 = planType1.getParents();
        java.lang.reflect.Method method5 = null;
        planType1.setContext(method5);
        java.lang.String str7 = planType1.toString();
        planType1.addParent((byte) 0);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:-1" + "'", str7.equals("hi!:-1"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test100");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        io.github.agentsoz.jill.struct.PlanType planType11 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType11.addChild((byte) 1);
        planType11.addParent((byte) 10);
        planType11.setId(1);
        planType11.addChild((byte) 1);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType11);
        java.lang.reflect.Method method21 = planType1.getBody();
        byte[] byte_array22 = planType1.getParents();
        planType1.setId(1);
        java.lang.String str25 = planType1.toString();
        int i26 = planType1.getId();
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(byte_array22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:1" + "'", str25.equals("hi!:1"));
        org.junit.Assert.assertTrue(i26 == 1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test101");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        planType1.addChild((byte) 100);
        java.lang.String str12 = planType1.toString();
        java.lang.Class<?> cls13 = planType1.getPlanClass();
        java.lang.reflect.Method method14 = planType1.getBody();
        java.lang.reflect.Method method15 = null;
        planType1.setBody(method15);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertNull(cls13);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test102");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        planType18.setName(":1");
        java.lang.reflect.Method method23 = planType18.getBody();
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test103");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType17.setContext(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        java.lang.String str23 = planType17.getName();
        planType17.addChild((byte) 10);
        java.lang.Class<?> cls26 = planType17.getPlanClass();
        java.lang.String str27 = planType17.getName();
        java.lang.reflect.Method method28 = planType17.getBody();
        java.lang.reflect.Method method29 = planType17.getBody();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNull(cls26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNull(method29);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test104");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        planType1.addChild((byte) 100);
        java.lang.String str12 = planType1.toString();
        java.lang.Class<?> cls13 = planType1.getPlanClass();
        planType1.addParent((byte) 10);
        byte[] byte_array16 = planType1.getChildren();
        byte[] byte_array18 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array16, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertNull(cls13);
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertNotNull(byte_array18);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test105");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        io.github.agentsoz.jill.struct.PlanType planType22 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType22.addChild((byte) 1);
        planType22.addParent((byte) 10);
        planType22.addParent((byte) 1);
        byte[] byte_array29 = planType22.getParents();
        java.lang.String str30 = planType22.toString();
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType18, (io.github.agentsoz.jill.struct.AObject) planType22);
        byte[] byte_array32 = planType22.getParents();
        try {
            byte[] byte_array34 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(byte_array29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1" + "'", str30.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(byte_array32);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test106");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = planType1.getContext();
        java.lang.Class<?> cls6 = planType1.getPlanClass();
        byte[] byte_array7 = planType1.getParents();
        java.lang.reflect.Method method8 = planType1.getBody();
        byte[] byte_array9 = planType1.getChildren();
        planType1.addParent((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(cls6);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(byte_array9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test107");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = null;
        planType1.setContext(method5);
        int i7 = planType1.getId();
        int i8 = planType1.getId();
        byte[] byte_array9 = planType1.getParents();
        planType1.setName(":1");
        byte[] byte_array12 = planType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertNull(byte_array12);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test108");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        planType1.addChild((byte) 100);
        java.lang.String str12 = planType1.toString();
        planType1.setId((int) (byte) 0);
        byte[] byte_array15 = planType1.getChildren();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test109");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.reflect.Method method9 = planType1.getContext();
        java.lang.String str10 = planType1.getName();
        byte[] byte_array11 = planType1.getParents();
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test110");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        planType18.addParent((byte) 1);
        java.lang.reflect.Method method23 = null;
        planType18.setBody(method23);
        planType18.setId((-1));
        planType18.setId(1);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test111");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        byte[] byte_array6 = planType1.getChildren();
        java.lang.String str7 = planType1.toString();
        int i8 = planType1.getId();
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:-1" + "'", str7.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test112");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = planType1.getContext();
        java.lang.Class<?> cls6 = planType1.getPlanClass();
        planType1.addChild((byte) 0);
        java.lang.String str9 = planType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(cls6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test113");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        int i9 = planType1.getId();
        java.lang.reflect.Method method10 = planType1.getContext();
        java.lang.reflect.Method method11 = null;
        planType1.setBody(method11);
        planType1.setId((int) '#');
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test114");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        int i8 = planType1.getId();
        java.lang.reflect.Method method9 = null;
        planType1.setContext(method9);
        byte[] byte_array11 = planType1.getChildren();
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test115");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.setName("hi!:-1");
        int i10 = planType1.getId();
        java.lang.Class<?> cls11 = planType1.getPlanClass();
        byte[] byte_array12 = planType1.getChildren();
        try {
            byte[] byte_array14 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array12, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(cls11);
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test116");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        java.lang.reflect.Method method3 = planType1.getContext();
        java.lang.String str4 = planType1.getName();
        io.github.agentsoz.jill.struct.PlanType planType6 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array7 = planType6.getChildren();
        java.lang.reflect.Method method8 = null;
        planType6.setContext(method8);
        java.lang.reflect.Method method10 = null;
        planType6.setContext(method10);
        int i12 = planType6.getId();
        int i13 = planType6.getId();
        byte[] byte_array14 = planType6.getParents();
        io.github.agentsoz.jill.struct.PlanType planType16 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType16.addChild((byte) 1);
        byte[] byte_array19 = planType16.getParents();
        java.lang.reflect.Method method20 = null;
        planType16.setBody(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType6, (io.github.agentsoz.jill.struct.AObject) planType16);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType16);
        java.lang.String str24 = planType1.getName();
        io.github.agentsoz.jill.struct.PlanType planType26 = new io.github.agentsoz.jill.struct.PlanType("hi!:1");
        java.lang.reflect.Method method27 = null;
        planType26.setContext(method27);
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType26);
        planType26.setName("");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test117");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        java.lang.reflect.Method method8 = planType1.getContext();
        planType1.setId((int) (byte) -1);
        planType1.addChild((byte) 0);
        java.lang.String str13 = planType1.toString();
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        planType15.addParent((byte) 10);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType15);
        planType1.addChild((byte) 100);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!:-1" + "'", str13.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test118");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        planType18.addParent((byte) 1);
        int i23 = planType18.getId();
        io.github.agentsoz.jill.struct.PlanType planType25 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType25.addChild((byte) 1);
        planType25.addParent((byte) 10);
        planType25.setId(1);
        java.lang.reflect.Method method32 = planType25.getBody();
        io.github.agentsoz.jill.struct.PlanType planType34 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType34.addChild((byte) 1);
        planType34.addParent((byte) 10);
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType25, (io.github.agentsoz.jill.struct.AObject) planType34);
        java.lang.reflect.Method method40 = null;
        planType25.setBody(method40);
        java.lang.String str42 = planType25.toString();
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType18, (io.github.agentsoz.jill.struct.AObject) planType25);
        planType25.setId(10);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertNull(method32);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!:1" + "'", str42.equals("hi!:1"));
        org.junit.Assert.assertTrue(b43 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test119");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        java.lang.String str12 = planType1.toString();
        planType1.addChild((byte) -1);
        java.lang.String str15 = planType1.getName();
        java.lang.reflect.Method method16 = null;
        planType1.setContext(method16);
        java.lang.Class<?> cls18 = planType1.getPlanClass();
        planType1.addChild((byte) 10);
        java.lang.reflect.Method method21 = null;
        planType1.setBody(method21);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNull(cls18);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test120");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.String str4 = planType1.toString();
        planType1.setName("hi!:-1");
        planType1.addChild((byte) 0);
        int i9 = planType1.getId();
        int i10 = planType1.getId();
        java.lang.reflect.Method method11 = null;
        planType1.setContext(method11);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue(i10 == (-1));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test121");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.String str9 = planType1.toString();
        java.lang.reflect.Method method10 = planType1.getBody();
        planType1.addChild((byte) -1);
        planType1.addParent((byte) -1);
        java.lang.Class<?> cls15 = planType1.getPlanClass();
        planType1.setName("hi!:-1");
        byte[] byte_array18 = planType1.getChildren();
        try {
            byte[] byte_array20 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array18, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(cls15);
        org.junit.Assert.assertNotNull(byte_array18);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test122");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.String str4 = planType1.toString();
        java.lang.String str5 = planType1.toString();
        byte[] byte_array6 = planType1.getParents();
        try {
            byte[] byte_array8 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test123");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        java.lang.reflect.Method method17 = null;
        planType1.setBody(method17);
        java.lang.String str19 = planType1.getName();
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test124");
        byte[] byte_array0 = null;
        byte[] byte_array2 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(byte_array2);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test125");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.reflect.Method method9 = null;
        planType1.setContext(method9);
        planType1.setName("hi!");
        int i13 = planType1.getId();
        planType1.setId(1);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test126");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.String str9 = planType1.toString();
        byte[] byte_array10 = planType1.getParents();
        byte[] byte_array11 = planType1.getParents();
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, 0);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:-1" + "'", str9.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test127");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = planType1.getContext();
        planType1.setName("");
        planType1.addChild((byte) 100);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test128");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId((int) (byte) 100);
        planType1.addParent((byte) -1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test129");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        planType1.setId((int) (short) 1);
        byte[] byte_array23 = planType1.getChildren();
        java.lang.String str24 = planType1.toString();
        java.lang.reflect.Method method25 = planType1.getBody();
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(byte_array23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!:1" + "'", str24.equals("hi!:1"));
        org.junit.Assert.assertNull(method25);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test130");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.String str4 = planType1.toString();
        java.lang.String str5 = planType1.toString();
        planType1.addChild((byte) 10);
        int i8 = planType1.getId();
        planType1.addChild((byte) 100);
        java.lang.Class<?> cls11 = planType1.getPlanClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(cls11);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test131");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        byte[] byte_array4 = planType1.getParents();
        java.lang.reflect.Method method5 = null;
        planType1.setBody(method5);
        planType1.setId((int) (short) 1);
        planType1.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test132");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.String str9 = planType1.toString();
        java.lang.reflect.Method method10 = planType1.getBody();
        planType1.addChild((byte) -1);
        planType1.addParent((byte) 1);
        java.lang.reflect.Method method15 = null;
        planType1.setBody(method15);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType18.addChild((byte) 1);
        java.lang.reflect.Method method21 = null;
        planType18.setContext(method21);
        byte[] byte_array23 = planType18.getChildren();
        java.lang.reflect.Method method24 = planType18.getBody();
        java.lang.reflect.Method method25 = planType18.getContext();
        java.lang.String str26 = planType18.getName();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(byte_array23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test133");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        java.lang.reflect.Method method17 = null;
        planType1.setBody(method17);
        planType1.setName("");
        java.lang.String str21 = planType1.toString();
        java.lang.reflect.Method method22 = planType1.getBody();
        java.lang.String str23 = planType1.getName();
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test134");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        byte[] byte_array13 = planType1.getParents();
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) ' ');
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) 'a');
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array17);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test135");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("");
        planType1.addParent((byte) 10);
        java.lang.reflect.Method method11 = null;
        planType1.setBody(method11);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test136");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addChild((byte) 0);
        java.lang.reflect.Method method12 = planType1.getContext();
        io.github.agentsoz.jill.struct.PlanType planType14 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType14.addChild((byte) 1);
        planType14.addParent((byte) 10);
        planType14.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType22 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType22.addChild((byte) 1);
        planType22.addParent((byte) 10);
        java.lang.reflect.Method method27 = planType22.getBody();
        java.lang.reflect.Method method28 = planType22.getBody();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType14, (io.github.agentsoz.jill.struct.AObject) planType22);
        io.github.agentsoz.jill.struct.PlanType planType31 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array32 = planType31.getParents();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType14, (io.github.agentsoz.jill.struct.AObject) planType31);
        planType31.addParent((byte) 1);
        java.lang.reflect.Method method36 = null;
        planType31.setBody(method36);
        java.lang.reflect.Method method38 = planType31.getBody();
        planType31.addParent((byte) 1);
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType31);
        byte[] byte_array42 = planType1.getChildren();
        byte[] byte_array44 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array42, (int) ' ');
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(byte_array32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(byte_array42);
        org.junit.Assert.assertNotNull(byte_array44);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test137");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        int i4 = planType1.getId();
        java.lang.reflect.Method method5 = null;
        planType1.setContext(method5);
        java.lang.Class<?> cls7 = planType1.getPlanClass();
        planType1.addChild((byte) 100);
        byte[] byte_array10 = planType1.getChildren();
        int i11 = planType1.getId();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(cls7);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertTrue(i11 == (-1));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test138");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId((int) (byte) 100);
        byte[] byte_array8 = planType1.getParents();
        byte[] byte_array10 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array8, 1);
        try {
            byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test139");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        io.github.agentsoz.jill.struct.PlanType planType22 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType22.addChild((byte) 1);
        planType22.addParent((byte) 10);
        planType22.addParent((byte) 1);
        byte[] byte_array29 = planType22.getParents();
        java.lang.String str30 = planType22.toString();
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType18, (io.github.agentsoz.jill.struct.AObject) planType22);
        byte[] byte_array32 = planType22.getParents();
        java.lang.String str33 = planType22.getName();
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(byte_array29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1" + "'", str30.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test140");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("");
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        java.lang.reflect.Method method15 = planType10.getBody();
        planType10.setId((int) '4');
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        java.lang.reflect.Method method19 = null;
        planType1.setBody(method19);
        io.github.agentsoz.jill.struct.PlanType planType22 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType22.addChild((byte) 1);
        java.lang.reflect.Method method25 = null;
        planType22.setContext(method25);
        planType22.setName("hi!");
        java.lang.reflect.Method method29 = null;
        planType22.setContext(method29);
        planType22.addChild((byte) 100);
        java.lang.String str33 = planType22.toString();
        java.lang.Class<?> cls34 = planType22.getPlanClass();
        byte[] byte_array35 = planType22.getParents();
        java.lang.reflect.Method method36 = planType22.getContext();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType22);
        planType1.addChild((byte) 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!:-1" + "'", str33.equals("hi!:-1"));
        org.junit.Assert.assertNull(cls34);
        org.junit.Assert.assertNull(byte_array35);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test141");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!:52");
        java.lang.String str2 = planType1.toString();
        java.lang.reflect.Method method3 = null;
        planType1.setBody(method3);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!:52:-1" + "'", str2.equals("hi!:52:-1"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test142");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType17.setContext(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        java.lang.String str23 = planType17.getName();
        planType17.addChild((byte) 10);
        planType17.setName("hi!");
        int i28 = planType17.getId();
        planType17.addChild((byte) 1);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue(i28 == (-1));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test143");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addChild((byte) 0);
        planType1.setName("hi!");
        planType1.setName("");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test144");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = planType1.getContext();
        java.lang.reflect.Method method11 = null;
        planType1.setContext(method11);
        java.lang.Class<?> cls13 = planType1.getPlanClass();
        planType1.setId((int) (short) 10);
        planType1.setId((int) (short) 100);
        java.lang.reflect.Method method18 = null;
        planType1.setBody(method18);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(cls13);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test145");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("");
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        java.lang.reflect.Method method15 = planType10.getBody();
        planType10.setId((int) '4');
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType20 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array21 = planType20.getChildren();
        java.lang.reflect.Method method22 = null;
        planType20.setContext(method22);
        java.lang.reflect.Method method24 = planType20.getContext();
        java.lang.Class<?> cls25 = planType20.getPlanClass();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType20);
        planType20.addChild((byte) 100);
        java.lang.reflect.Method method29 = null;
        planType20.setContext(method29);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(cls25);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test146");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        planType1.addChild((byte) 100);
        java.lang.String str12 = planType1.toString();
        java.lang.Class<?> cls13 = planType1.getPlanClass();
        planType1.setId(1);
        java.lang.String str16 = planType1.toString();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertNull(cls13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!:1" + "'", str16.equals("hi!:1"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test147");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = planType1.getContext();
        java.lang.Class<?> cls6 = planType1.getPlanClass();
        planType1.addChild((byte) 0);
        java.lang.reflect.Method method9 = null;
        planType1.setBody(method9);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(cls6);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test148");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        planType18.addParent((byte) 1);
        java.lang.reflect.Method method23 = null;
        planType18.setBody(method23);
        byte[] byte_array25 = planType18.getParents();
        int i26 = planType18.getId();
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(byte_array25);
        org.junit.Assert.assertTrue(i26 == (-1));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test149");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.String str9 = planType1.toString();
        java.lang.reflect.Method method10 = planType1.getBody();
        planType1.addChild((byte) -1);
        planType1.addParent((byte) -1);
        java.lang.Class<?> cls15 = planType1.getPlanClass();
        planType1.setName("hi!:-1");
        byte[] byte_array18 = planType1.getChildren();
        java.lang.String str19 = planType1.getName();
        byte[] byte_array20 = planType1.getParents();
        int i21 = planType1.getId();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(cls15);
        org.junit.Assert.assertNotNull(byte_array18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array20);
        org.junit.Assert.assertTrue(i21 == 1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test150");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        java.lang.String str14 = planType1.getName();
        byte[] byte_array15 = planType1.getParents();
        try {
            byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array15, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test151");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        java.lang.reflect.Method method3 = planType1.getBody();
        int i4 = planType1.getId();
        java.lang.reflect.Method method5 = planType1.getContext();
        planType1.addParent((byte) -1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(method5);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test152");
        byte[] byte_array0 = null;
        byte[] byte_array2 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byte_array2);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test153");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        java.lang.String str14 = planType1.toString();
        planType1.setName("hi!");
        java.lang.reflect.Method method17 = planType1.getContext();
        java.lang.String str18 = planType1.toString();
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:1" + "'", str14.equals("hi!:1"));
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!:1" + "'", str18.equals("hi!:1"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test154");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        planType18.addParent((byte) 1);
        java.lang.reflect.Method method23 = null;
        planType18.setBody(method23);
        planType18.setId((-1));
        java.lang.reflect.Method method27 = planType18.getBody();
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(method27);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test155");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.reflect.Method method9 = planType1.getContext();
        java.lang.String str10 = planType1.getName();
        java.lang.String str11 = planType1.toString();
        io.github.agentsoz.jill.struct.PlanType planType13 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType13.addChild((byte) 1);
        planType13.addParent((byte) 10);
        planType13.setId(1);
        byte[] byte_array20 = planType13.getParents();
        java.lang.reflect.Method method21 = planType13.getBody();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType13);
        byte[] byte_array23 = planType1.getParents();
        byte[] byte_array25 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array23, (int) 'a');
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:1" + "'", str11.equals("hi!:1"));
        org.junit.Assert.assertNotNull(byte_array20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(byte_array23);
        org.junit.Assert.assertNotNull(byte_array25);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test156");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        java.lang.reflect.Method method3 = planType1.getContext();
        byte[] byte_array4 = planType1.getChildren();
        java.lang.reflect.Method method5 = planType1.getContext();
        java.lang.reflect.Method method6 = null;
        planType1.setContext(method6);
        planType1.setId((int) (byte) -1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(method5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test157");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        planType1.setId((int) (short) 1);
        planType1.addChild((byte) -1);
        java.lang.reflect.Method method25 = null;
        planType1.setBody(method25);
        java.lang.Class<?> cls27 = planType1.getPlanClass();
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(cls27);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test158");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.setName("hi!:-1");
        int i10 = planType1.getId();
        io.github.agentsoz.jill.struct.PlanType planType12 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array13 = planType12.getChildren();
        java.lang.reflect.Method method14 = null;
        planType12.setContext(method14);
        java.lang.reflect.Method method16 = planType12.getContext();
        java.lang.reflect.Method method17 = null;
        planType12.setBody(method17);
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType12);
        io.github.agentsoz.jill.struct.PlanType planType21 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType21.addChild((byte) 1);
        java.lang.reflect.Method method24 = null;
        planType21.setContext(method24);
        planType21.setName("hi!");
        java.lang.reflect.Method method28 = null;
        planType21.setContext(method28);
        java.lang.String str30 = planType21.toString();
        planType21.setName("");
        java.lang.Class<?> cls33 = planType21.getPlanClass();
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType12, (io.github.agentsoz.jill.struct.AObject) planType21);
        int i35 = planType12.getId();
        java.lang.reflect.Method method36 = planType12.getBody();
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1" + "'", str30.equals("hi!:-1"));
        org.junit.Assert.assertNull(cls33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i35 == (-1));
        org.junit.Assert.assertNull(method36);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test159");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = planType1.getContext();
        java.lang.Class<?> cls6 = planType1.getPlanClass();
        java.lang.reflect.Method method7 = null;
        planType1.setBody(method7);
        java.lang.String str9 = planType1.getName();
        planType1.addChild((byte) 10);
        java.lang.String str12 = planType1.toString();
        java.lang.Class<?> cls13 = planType1.getPlanClass();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(cls6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertNull(cls13);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test160");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.String str4 = planType1.toString();
        int i5 = planType1.getId();
        int i6 = planType1.getId();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i6 == (-1));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test161");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.String str9 = planType1.toString();
        java.lang.reflect.Method method10 = planType1.getBody();
        planType1.addChild((byte) -1);
        planType1.addParent((byte) -1);
        java.lang.reflect.Method method15 = null;
        planType1.setContext(method15);
        java.lang.String str17 = planType1.toString();
        java.lang.reflect.Method method18 = null;
        planType1.setBody(method18);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!:1" + "'", str17.equals("hi!:1"));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test162");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.String str9 = planType1.toString();
        java.lang.reflect.Method method10 = planType1.getBody();
        java.lang.reflect.Method method11 = null;
        planType1.setContext(method11);
        planType1.setName("");
        planType1.addParent((byte) 1);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test163");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        java.lang.reflect.Method method6 = null;
        planType1.setContext(method6);
        java.lang.Class<?> cls8 = planType1.getPlanClass();
        byte[] byte_array9 = planType1.getChildren();
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) '4');
        org.junit.Assert.assertNull(cls8);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test164");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("");
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        java.lang.reflect.Method method15 = planType10.getBody();
        planType10.setId((int) '4');
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        java.lang.reflect.Method method19 = null;
        planType1.setBody(method19);
        io.github.agentsoz.jill.struct.PlanType planType22 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType22.addChild((byte) 1);
        java.lang.reflect.Method method25 = null;
        planType22.setContext(method25);
        planType22.setName("hi!");
        java.lang.reflect.Method method29 = null;
        planType22.setContext(method29);
        planType22.addChild((byte) 100);
        java.lang.String str33 = planType22.toString();
        java.lang.Class<?> cls34 = planType22.getPlanClass();
        byte[] byte_array35 = planType22.getParents();
        java.lang.reflect.Method method36 = planType22.getContext();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType22);
        java.lang.reflect.Method method38 = null;
        planType22.setBody(method38);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!:-1" + "'", str33.equals("hi!:-1"));
        org.junit.Assert.assertNull(cls34);
        org.junit.Assert.assertNull(byte_array35);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test165");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        io.github.agentsoz.jill.struct.PlanType planType11 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType11.addChild((byte) 1);
        planType11.addParent((byte) 10);
        planType11.setId(1);
        planType11.addChild((byte) 1);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType11);
        java.lang.reflect.Method method21 = planType1.getBody();
        byte[] byte_array22 = planType1.getParents();
        planType1.setId(1);
        java.lang.String str25 = planType1.toString();
        java.lang.String str26 = planType1.toString();
        byte[] byte_array27 = planType1.getParents();
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(byte_array22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:1" + "'", str25.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:1" + "'", str26.equals("hi!:1"));
        org.junit.Assert.assertNull(byte_array27);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test166");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        int i16 = planType10.getId();
        java.lang.reflect.Method method17 = planType10.getBody();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test167");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        planType1.addParent((byte) 100);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType13 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType13.addChild((byte) 1);
        planType13.addParent((byte) 10);
        planType13.setId(1);
        java.lang.reflect.Method method20 = planType13.getBody();
        io.github.agentsoz.jill.struct.PlanType planType22 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType22.addChild((byte) 1);
        planType22.addParent((byte) 10);
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType13, (io.github.agentsoz.jill.struct.AObject) planType22);
        java.lang.reflect.Method method28 = planType13.getContext();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType13);
        java.lang.reflect.Method method30 = null;
        planType1.setContext(method30);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test168");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.String str9 = planType1.toString();
        io.github.agentsoz.jill.struct.PlanType planType11 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType11.addChild((byte) 1);
        planType11.addParent((byte) 10);
        planType11.setId(1);
        planType11.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType11.setContext(method20);
        java.lang.String str22 = planType11.toString();
        planType11.addChild((byte) -1);
        java.lang.String str25 = planType11.getName();
        byte[] byte_array26 = planType11.getChildren();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType11);
        int i28 = planType1.getId();
        java.lang.reflect.Method method29 = planType1.getContext();
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:-1" + "'", str9.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!:1" + "'", str22.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(i28 == (-1));
        org.junit.Assert.assertNull(method29);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test169");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType17.setContext(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        planType17.setName("hi!:-1");
        java.lang.reflect.Method method25 = planType17.getBody();
        planType17.addChild((byte) 0);
        planType17.setName("hi!:1");
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(method25);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test170");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        int i4 = planType1.getId();
        java.lang.reflect.Method method5 = null;
        planType1.setContext(method5);
        byte[] byte_array7 = planType1.getParents();
        planType1.addParent((byte) -1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        byte[] byte_array12 = planType1.getChildren();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNull(byte_array12);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test171");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        int i8 = planType1.getId();
        java.lang.reflect.Method method9 = planType1.getBody();
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test172");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.setName("hi!");
        java.lang.reflect.Method method6 = null;
        planType1.setContext(method6);
        java.lang.String str8 = planType1.toString();
        planType1.addParent((byte) 100);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:-1" + "'", str8.equals("hi!:-1"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test173");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        java.lang.reflect.Method method13 = planType1.getContext();
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType15);
        java.lang.reflect.Method method17 = null;
        planType1.setBody(method17);
        java.lang.reflect.Method method19 = null;
        planType1.setContext(method19);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test174");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        int i4 = planType1.getId();
        io.github.agentsoz.jill.struct.PlanType planType6 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType6.addChild((byte) 1);
        planType6.addParent((byte) 10);
        planType6.setId(1);
        java.lang.reflect.Method method13 = planType6.getBody();
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        planType15.addParent((byte) 10);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType6, (io.github.agentsoz.jill.struct.AObject) planType15);
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType6);
        planType1.addParent((byte) 0);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test175");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = planType1.getContext();
        java.lang.reflect.Method method6 = null;
        planType1.setBody(method6);
        java.lang.String str8 = planType1.toString();
        int i9 = planType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:-1" + "'", str8.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i9 == (-1));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test176");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addChild((byte) 0);
        java.lang.Class<?> cls12 = planType1.getPlanClass();
        planType1.addChild((byte) 10);
        int i15 = planType1.getId();
        java.lang.reflect.Method method16 = planType1.getContext();
        org.junit.Assert.assertNull(cls12);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test177");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("");
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        java.lang.reflect.Method method15 = planType10.getBody();
        planType10.setId((int) '4');
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType20 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType20.addChild((byte) 1);
        planType20.addParent((byte) 10);
        planType20.setId(1);
        java.lang.reflect.Method method27 = planType20.getBody();
        io.github.agentsoz.jill.struct.PlanType planType29 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType29.addChild((byte) 1);
        planType29.addParent((byte) 10);
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType20, (io.github.agentsoz.jill.struct.AObject) planType29);
        io.github.agentsoz.jill.struct.PlanType planType36 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType36.addChild((byte) 1);
        java.lang.reflect.Method method39 = null;
        planType36.setContext(method39);
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType20, (io.github.agentsoz.jill.struct.AObject) planType36);
        java.lang.String str42 = planType36.getName();
        planType36.addChild((byte) 10);
        java.lang.reflect.Method method45 = planType36.getContext();
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType10, (io.github.agentsoz.jill.struct.AObject) planType36);
        java.lang.String str47 = planType36.getName();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        org.junit.Assert.assertNull(method45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test178");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        byte[] byte_array10 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array8, (int) ' ');
        try {
            byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array10);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test179");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId((int) (byte) 100);
        byte[] byte_array8 = planType1.getParents();
        byte[] byte_array10 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array8, (int) 'a');
        byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array8, (int) '4');
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test180");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.String str9 = planType1.toString();
        java.lang.reflect.Method method10 = planType1.getBody();
        planType1.addChild((byte) -1);
        planType1.addParent((byte) -1);
        java.lang.Class<?> cls15 = planType1.getPlanClass();
        java.lang.reflect.Method method16 = planType1.getContext();
        java.lang.reflect.Method method17 = null;
        planType1.setContext(method17);
        java.lang.reflect.Method method19 = null;
        planType1.setBody(method19);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(cls15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test181");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.reflect.Method method9 = planType1.getContext();
        java.lang.String str10 = planType1.getName();
        java.lang.String str11 = planType1.toString();
        java.lang.reflect.Method method12 = null;
        planType1.setBody(method12);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:1" + "'", str11.equals("hi!:1"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test182");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        byte[] byte_array12 = planType1.getParents();
        byte[] byte_array14 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array12, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array14);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test183");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = planType1.getContext();
        java.lang.Class<?> cls6 = planType1.getPlanClass();
        java.lang.reflect.Method method7 = null;
        planType1.setContext(method7);
        byte[] byte_array9 = planType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(cls6);
        org.junit.Assert.assertNull(byte_array9);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test184");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        java.lang.String str13 = planType1.toString();
        planType1.addChild((byte) 100);
        java.lang.String str16 = planType1.getName();
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!:1" + "'", str13.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test185");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType17.setContext(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        planType17.setName("hi!:-1");
        java.lang.reflect.Method method25 = planType17.getBody();
        java.lang.reflect.Method method26 = planType17.getBody();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(method26);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test186");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("hi!:-1");
        byte[] byte_array9 = planType1.getChildren();
        java.lang.reflect.Method method10 = null;
        planType1.setBody(method10);
        java.lang.Class<?> cls12 = planType1.getPlanClass();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNull(cls12);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test187");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        java.lang.String str14 = planType1.getName();
        byte[] byte_array15 = planType1.getParents();
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array15, (int) ' ');
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array17);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test188");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        java.lang.reflect.Method method8 = planType1.getContext();
        planType1.setId((int) (byte) -1);
        java.lang.reflect.Method method11 = null;
        planType1.setBody(method11);
        java.lang.reflect.Method method13 = planType1.getBody();
        planType1.setId((int) (byte) 100);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test189");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        byte[] byte_array8 = planType1.getParents();
        byte[] byte_array10 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array8, 0);
        byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test190");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        byte[] byte_array8 = planType1.getParents();
        int i9 = planType1.getId();
        int i10 = planType1.getId();
        int i11 = planType1.getId();
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue(i11 == (-1));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test191");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        byte[] byte_array13 = planType1.getParents();
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, 10);
        try {
            byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array15, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test192");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        java.lang.reflect.Method method21 = null;
        planType1.setContext(method21);
        planType1.setId((int) (short) -1);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test193");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        int i4 = planType1.getId();
        java.lang.reflect.Method method5 = null;
        planType1.setContext(method5);
        java.lang.Class<?> cls7 = planType1.getPlanClass();
        planType1.addChild((byte) 100);
        byte[] byte_array10 = planType1.getChildren();
        byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (int) ' ');
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(cls7);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test194");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 1);
        planType1.addParent((byte) 10);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test195");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        byte[] byte_array4 = planType1.getParents();
        java.lang.reflect.Method method5 = null;
        planType1.setBody(method5);
        io.github.agentsoz.jill.struct.PlanType planType8 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType8.addParent((byte) 10);
        java.lang.String str11 = planType8.toString();
        java.lang.String str12 = planType8.getName();
        java.lang.Class<?> cls13 = planType8.getPlanClass();
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType8);
        java.lang.reflect.Method method15 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        planType17.addParent((byte) 10);
        planType17.setId(1);
        java.lang.reflect.Method method24 = planType17.getBody();
        io.github.agentsoz.jill.struct.PlanType planType26 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType26.addChild((byte) 1);
        planType26.addParent((byte) 10);
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType17, (io.github.agentsoz.jill.struct.AObject) planType26);
        io.github.agentsoz.jill.struct.PlanType planType33 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType33.addChild((byte) 1);
        java.lang.reflect.Method method36 = null;
        planType33.setContext(method36);
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType17, (io.github.agentsoz.jill.struct.AObject) planType33);
        java.lang.reflect.Method method39 = planType33.getContext();
        java.lang.String str40 = planType33.getName();
        boolean b41 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType33);
        planType33.addParent((byte) 0);
        byte[] byte_array44 = planType33.getChildren();
        planType33.setId((int) (byte) 1);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:-1" + "'", str11.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNull(cls13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNull(method39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(byte_array44);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test196");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        int i16 = planType10.getId();
        planType10.setId((int) '#');
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == (-1));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test197");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("");
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        java.lang.reflect.Method method15 = planType10.getBody();
        planType10.setId((int) '4');
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        java.lang.String str19 = planType10.toString();
        planType10.addParent((byte) 100);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:52" + "'", str19.equals("hi!:52"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test198");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        int i4 = planType1.getId();
        io.github.agentsoz.jill.struct.PlanType planType6 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType6.addChild((byte) 1);
        planType6.addParent((byte) 10);
        planType6.setId(1);
        java.lang.reflect.Method method13 = planType6.getBody();
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        planType15.addParent((byte) 10);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType6, (io.github.agentsoz.jill.struct.AObject) planType15);
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType6);
        java.lang.reflect.Method method22 = null;
        planType1.setContext(method22);
        java.lang.reflect.Method method24 = null;
        planType1.setBody(method24);
        java.lang.String str26 = planType1.getName();
        java.lang.Class<?> cls27 = planType1.getPlanClass();
        java.lang.String str28 = planType1.getName();
        planType1.setId((int) ' ');
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertNull(cls27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test199");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        java.lang.reflect.Method method3 = planType1.getContext();
        byte[] byte_array4 = planType1.getChildren();
        java.lang.reflect.Method method5 = planType1.getContext();
        planType1.setName("hi!:1:-1");
        int i8 = planType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test200");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        io.github.agentsoz.jill.struct.PlanType planType3 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType3.addChild((byte) 1);
        planType3.addParent((byte) 10);
        planType3.addParent((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType3.setBody(method10);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType3);
        byte[] byte_array13 = planType3.getParents();
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test201");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        byte[] byte_array4 = planType1.getParents();
        java.lang.reflect.Method method5 = null;
        planType1.setBody(method5);
        io.github.agentsoz.jill.struct.PlanType planType8 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType8.addParent((byte) 10);
        java.lang.String str11 = planType8.toString();
        java.lang.String str12 = planType8.getName();
        java.lang.Class<?> cls13 = planType8.getPlanClass();
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType8);
        planType8.setId((int) (byte) -1);
        planType8.setId((int) (short) -1);
        byte[] byte_array19 = planType8.getParents();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:-1" + "'", str11.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNull(cls13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(byte_array19);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test202");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        byte[] byte_array14 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array12, (int) (byte) 10);
        byte[] byte_array16 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array12, (int) '#');
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test203");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.reflect.Method method9 = null;
        planType1.setContext(method9);
        io.github.agentsoz.jill.struct.PlanType planType12 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType12.addChild((byte) 1);
        planType12.addParent((byte) 10);
        planType12.setId(1);
        planType12.addParent((byte) 10);
        planType12.addParent((byte) 10);
        planType12.addParent((byte) 10);
        java.lang.String str25 = planType12.toString();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType12);
        planType1.setName("hi!:-1:1");
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!:1" + "'", str25.equals("hi!:1"));
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test204");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = planType1.getContext();
        java.lang.reflect.Method method11 = null;
        planType1.setContext(method11);
        planType1.setName(":1");
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test205");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = null;
        planType1.setContext(method5);
        int i7 = planType1.getId();
        int i8 = planType1.getId();
        java.lang.Class<?> cls9 = planType1.getPlanClass();
        planType1.addParent((byte) 0);
        java.lang.String str12 = planType1.getName();
        planType1.setName("hi!");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test206");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = planType1.getContext();
        java.lang.reflect.Method method11 = null;
        planType1.setContext(method11);
        java.lang.String str13 = planType1.toString();
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!:1" + "'", str13.equals("hi!:1"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test207");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        java.lang.reflect.Method method12 = null;
        planType9.setContext(method12);
        planType9.setName("hi!");
        java.lang.reflect.Method method16 = null;
        planType9.setContext(method16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        int i19 = planType1.getId();
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method22 = null;
        planType1.setContext(method22);
        java.lang.String str24 = planType1.getName();
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test208");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.String str9 = planType1.toString();
        java.lang.String str10 = planType1.toString();
        byte[] byte_array11 = planType1.getChildren();
        java.lang.String str12 = planType1.toString();
        java.lang.Class<?> cls13 = planType1.getPlanClass();
        java.lang.reflect.Method method14 = planType1.getContext();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:1" + "'", str10.equals("hi!:1"));
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
        org.junit.Assert.assertNull(cls13);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test209");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.reflect.Method method9 = planType1.getContext();
        java.lang.String str10 = planType1.getName();
        planType1.addParent((byte) 10);
        planType1.addParent((byte) -1);
        int i15 = planType1.getId();
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test210");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.reflect.Method method4 = null;
        planType1.setBody(method4);
        int i6 = planType1.getId();
        planType1.addChild((byte) -1);
        java.lang.reflect.Method method9 = planType1.getBody();
        java.lang.Class<?> cls10 = planType1.getPlanClass();
        planType1.addChild((byte) -1);
        java.lang.reflect.Method method13 = null;
        planType1.setContext(method13);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(cls10);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test211");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        java.lang.String str12 = planType1.toString();
        io.github.agentsoz.jill.struct.PlanType planType14 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType14.addChild((byte) 1);
        planType14.addParent((byte) 10);
        planType14.setId(1);
        planType14.addParent((byte) 10);
        planType14.addParent((byte) 10);
        planType14.addParent((byte) 10);
        java.lang.String str27 = planType14.toString();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType14);
        io.github.agentsoz.jill.struct.PlanType planType30 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array31 = planType30.getChildren();
        java.lang.reflect.Method method32 = null;
        planType30.setContext(method32);
        planType30.setId(100);
        planType30.setName("hi!:-1");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType14, (io.github.agentsoz.jill.struct.AObject) planType30);
        byte[] byte_array39 = planType14.getChildren();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:1" + "'", str27.equals("hi!:1"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(byte_array39);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test212");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        io.github.agentsoz.jill.struct.PlanType planType7 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType7.addChild((byte) 1);
        planType7.addParent((byte) 10);
        planType7.setId(1);
        planType7.addChild((byte) 1);
        java.lang.reflect.Method method16 = null;
        planType7.setContext(method16);
        java.lang.String str18 = planType7.toString();
        io.github.agentsoz.jill.struct.PlanType planType20 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType20.addChild((byte) 1);
        planType20.addParent((byte) 10);
        planType20.setId(1);
        planType20.addParent((byte) 10);
        planType20.addParent((byte) 10);
        planType20.addParent((byte) 10);
        java.lang.String str33 = planType20.toString();
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType7, (io.github.agentsoz.jill.struct.AObject) planType20);
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType20);
        java.lang.reflect.Method method36 = null;
        planType20.setContext(method36);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!:1" + "'", str18.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!:1" + "'", str33.equals("hi!:1"));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test213");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        byte[] byte_array6 = planType1.getChildren();
        planType1.addParent((byte) 10);
        java.lang.String str9 = planType1.getName();
        int i10 = planType1.getId();
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue(i10 == (-1));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test214");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.reflect.Method method4 = null;
        planType1.setBody(method4);
        int i6 = planType1.getId();
        planType1.addParent((byte) 10);
        org.junit.Assert.assertTrue(i6 == (-1));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test215");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = null;
        planType1.setContext(method5);
        java.lang.reflect.Method method7 = null;
        planType1.setContext(method7);
        planType1.setId((int) (short) 0);
        java.lang.reflect.Method method11 = planType1.getBody();
        planType1.setId(10);
        java.lang.Class<?> cls14 = planType1.getPlanClass();
        byte[] byte_array15 = planType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(cls14);
        org.junit.Assert.assertNull(byte_array15);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test216");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType17.setContext(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        planType17.setName("hi!:-1");
        java.lang.reflect.Method method25 = planType17.getBody();
        io.github.agentsoz.jill.struct.PlanType planType27 = new io.github.agentsoz.jill.struct.PlanType("hi!:1");
        java.lang.reflect.Method method28 = null;
        planType27.setContext(method28);
        java.lang.reflect.Method method30 = null;
        planType27.setBody(method30);
        java.lang.reflect.Method method32 = null;
        planType27.setContext(method32);
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType17, (io.github.agentsoz.jill.struct.AObject) planType27);
        byte[] byte_array35 = planType27.getChildren();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(byte_array35);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test217");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.setName("hi!:-1");
        int i10 = planType1.getId();
        io.github.agentsoz.jill.struct.PlanType planType12 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array13 = planType12.getChildren();
        java.lang.reflect.Method method14 = null;
        planType12.setContext(method14);
        java.lang.reflect.Method method16 = planType12.getContext();
        java.lang.reflect.Method method17 = null;
        planType12.setBody(method17);
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType12);
        io.github.agentsoz.jill.struct.PlanType planType21 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType21.addChild((byte) 1);
        java.lang.reflect.Method method24 = null;
        planType21.setContext(method24);
        planType21.setName("hi!");
        java.lang.reflect.Method method28 = null;
        planType21.setContext(method28);
        java.lang.String str30 = planType21.toString();
        planType21.setName("");
        java.lang.Class<?> cls33 = planType21.getPlanClass();
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType12, (io.github.agentsoz.jill.struct.AObject) planType21);
        planType12.addParent((byte) -1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1" + "'", str30.equals("hi!:-1"));
        org.junit.Assert.assertNull(cls33);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test218");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        java.lang.reflect.Method method3 = planType1.getContext();
        java.lang.String str4 = planType1.getName();
        io.github.agentsoz.jill.struct.PlanType planType6 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array7 = planType6.getChildren();
        java.lang.reflect.Method method8 = null;
        planType6.setContext(method8);
        java.lang.reflect.Method method10 = null;
        planType6.setContext(method10);
        int i12 = planType6.getId();
        int i13 = planType6.getId();
        byte[] byte_array14 = planType6.getParents();
        io.github.agentsoz.jill.struct.PlanType planType16 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType16.addChild((byte) 1);
        byte[] byte_array19 = planType16.getParents();
        java.lang.reflect.Method method20 = null;
        planType16.setBody(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType6, (io.github.agentsoz.jill.struct.AObject) planType16);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType16);
        planType16.setName("hi!:-1");
        java.lang.String str26 = planType16.toString();
        java.lang.reflect.Method method27 = planType16.getBody();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:-1:-1" + "'", str26.equals("hi!:-1:-1"));
        org.junit.Assert.assertNull(method27);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test219");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        byte[] byte_array6 = planType1.getChildren();
        java.lang.reflect.Method method7 = null;
        planType1.setBody(method7);
        org.junit.Assert.assertNotNull(byte_array6);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test220");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        planType1.addChild((byte) 100);
        java.lang.String str12 = planType1.toString();
        java.lang.Class<?> cls13 = planType1.getPlanClass();
        planType1.addParent((byte) 10);
        byte[] byte_array16 = planType1.getChildren();
        byte[] byte_array18 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array16, (int) (short) 100);
        byte[] byte_array20 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array16, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertNull(cls13);
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertNotNull(byte_array18);
        org.junit.Assert.assertNotNull(byte_array20);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test221");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        java.lang.reflect.Method method3 = planType1.getContext();
        byte[] byte_array4 = planType1.getChildren();
        java.lang.reflect.Method method5 = planType1.getContext();
        planType1.setName("hi!:1");
        byte[] byte_array8 = planType1.getChildren();
        byte[] byte_array9 = planType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertNull(byte_array9);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test222");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        io.github.agentsoz.jill.struct.PlanType planType11 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType11.addChild((byte) 1);
        planType11.addParent((byte) 10);
        planType11.setId(1);
        planType11.addChild((byte) 1);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType11);
        java.lang.reflect.Method method21 = planType1.getBody();
        byte[] byte_array22 = planType1.getParents();
        planType1.setId(1);
        java.lang.reflect.Method method25 = planType1.getContext();
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(byte_array22);
        org.junit.Assert.assertNull(method25);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test223");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        byte[] byte_array13 = planType1.getParents();
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (short) 10);
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, 1);
        byte[] byte_array19 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (byte) 100);
        byte[] byte_array21 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array19, 100);
        byte[] byte_array23 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array19, (int) (short) 1);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertNotNull(byte_array21);
        org.junit.Assert.assertNotNull(byte_array23);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test224");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType17.setContext(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        java.lang.String str23 = planType17.getName();
        planType17.addChild((byte) 10);
        planType17.setName("hi!");
        int i28 = planType17.getId();
        byte[] byte_array29 = planType17.getChildren();
        java.lang.Class<?> cls30 = planType17.getPlanClass();
        io.github.agentsoz.jill.struct.PlanType planType32 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType32.addParent((byte) 10);
        java.lang.String str35 = planType32.toString();
        java.lang.String str36 = planType32.getName();
        java.lang.reflect.Method method37 = planType32.getBody();
        java.lang.reflect.Method method38 = null;
        planType32.setBody(method38);
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType17, (io.github.agentsoz.jill.struct.AObject) planType32);
        java.lang.String str41 = planType17.getName();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue(i28 == (-1));
        org.junit.Assert.assertNotNull(byte_array29);
        org.junit.Assert.assertNull(cls30);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!:-1" + "'", str35.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        org.junit.Assert.assertNull(method37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test225");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        planType18.addParent((byte) 1);
        int i23 = planType18.getId();
        int i24 = planType18.getId();
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertTrue(i24 == (-1));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test226");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        byte[] byte_array13 = planType1.getParents();
        int i14 = planType1.getId();
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test227");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.String str4 = planType1.toString();
        java.lang.String str5 = planType1.getName();
        java.lang.reflect.Method method6 = null;
        planType1.setContext(method6);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        java.lang.reflect.Method method12 = null;
        planType9.setContext(method12);
        java.lang.String str14 = planType9.toString();
        planType9.setName("");
        byte[] byte_array17 = planType9.getChildren();
        planType9.setId((int) (byte) 100);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType22 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType22.addChild((byte) 1);
        java.lang.reflect.Method method25 = null;
        planType22.setContext(method25);
        planType22.setName("hi!");
        java.lang.reflect.Method method29 = planType22.getContext();
        java.lang.reflect.Method method30 = planType22.getBody();
        java.lang.reflect.Method method31 = null;
        planType22.setContext(method31);
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType22);
        byte[] byte_array34 = planType1.getChildren();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:-1" + "'", str14.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(byte_array34);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test228");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        io.github.agentsoz.jill.struct.PlanType planType22 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType22.addChild((byte) 1);
        planType22.addParent((byte) 10);
        planType22.addParent((byte) 1);
        byte[] byte_array29 = planType22.getParents();
        java.lang.String str30 = planType22.toString();
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType18, (io.github.agentsoz.jill.struct.AObject) planType22);
        java.lang.String str32 = planType18.toString();
        java.lang.reflect.Method method33 = null;
        planType18.setContext(method33);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(byte_array29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1" + "'", str30.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!:-1" + "'", str32.equals("hi!:-1"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test229");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.String str9 = planType1.toString();
        planType1.setId((int) '4');
        planType1.setId((int) (byte) 1);
        planType1.setId((-1));
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array18 = planType17.getChildren();
        java.lang.reflect.Method method19 = null;
        planType17.setContext(method19);
        java.lang.reflect.Method method21 = null;
        planType17.setContext(method21);
        int i23 = planType17.getId();
        int i24 = planType17.getId();
        java.lang.reflect.Method method25 = null;
        planType17.setBody(method25);
        io.github.agentsoz.jill.struct.PlanType planType28 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType28.addChild((byte) 1);
        planType28.addParent((byte) 10);
        planType28.setId(1);
        io.github.agentsoz.jill.struct.PlanType planType36 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType36.addChild((byte) 1);
        java.lang.reflect.Method method39 = null;
        planType36.setContext(method39);
        planType36.setName("hi!");
        java.lang.reflect.Method method43 = null;
        planType36.setContext(method43);
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType28, (io.github.agentsoz.jill.struct.AObject) planType36);
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType17, (io.github.agentsoz.jill.struct.AObject) planType28);
        boolean b47 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertTrue(i24 == (-1));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test230");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        planType1.addChild((byte) 100);
        java.lang.String str14 = planType1.toString();
        java.lang.Class<?> cls15 = planType1.getPlanClass();
        java.lang.reflect.Method method16 = planType1.getBody();
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:1" + "'", str14.equals("hi!:1"));
        org.junit.Assert.assertNull(cls15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test231");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        java.lang.reflect.Method method12 = null;
        planType9.setContext(method12);
        planType9.setName("hi!");
        java.lang.reflect.Method method16 = null;
        planType9.setContext(method16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        byte[] byte_array19 = planType9.getChildren();
        byte[] byte_array21 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array19, 1);
        try {
            byte[] byte_array23 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array21, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertNotNull(byte_array21);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test232");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.String str9 = planType1.toString();
        java.lang.reflect.Method method10 = planType1.getBody();
        java.lang.reflect.Method method11 = planType1.getContext();
        int i12 = planType1.getId();
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:-1" + "'", str9.equals("hi!:-1"));
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test233");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        java.lang.reflect.Method method6 = planType1.getBody();
        planType1.addChild((byte) 10);
        java.lang.reflect.Method method9 = planType1.getContext();
        byte[] byte_array10 = planType1.getChildren();
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(byte_array10);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test234");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        java.lang.reflect.Method method8 = planType1.getContext();
        planType1.setId((int) (byte) -1);
        planType1.addChild((byte) 0);
        java.lang.String str13 = planType1.toString();
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        planType15.addParent((byte) 10);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType15);
        java.lang.reflect.Method method21 = null;
        planType15.setBody(method21);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!:-1" + "'", str13.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test235");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("");
        planType1.setName("hi!:1");
        byte[] byte_array4 = planType1.getParents();
        java.lang.Class<?> cls5 = planType1.getPlanClass();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(cls5);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test236");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        byte[] byte_array3 = planType1.getParents();
        byte[] byte_array4 = planType1.getParents();
        java.lang.String str5 = planType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test237");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.String str9 = planType1.toString();
        java.lang.reflect.Method method10 = planType1.getBody();
        planType1.addChild((byte) -1);
        planType1.addParent((byte) -1);
        java.lang.Class<?> cls15 = planType1.getPlanClass();
        java.lang.reflect.Method method16 = planType1.getContext();
        java.lang.reflect.Method method17 = null;
        planType1.setContext(method17);
        java.lang.String str19 = planType1.getName();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(cls15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test238");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        byte[] byte_array13 = planType1.getParents();
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, 10);
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (byte) 1);
        byte[] byte_array19 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array17, (int) '#');
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertNotNull(byte_array19);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test239");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        byte[] byte_array4 = planType1.getChildren();
        planType1.addChild((byte) 10);
        int i7 = planType1.getId();
        org.junit.Assert.assertNotNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test240");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("hi!:-1");
        planType1.addParent((byte) 0);
        java.lang.reflect.Method method11 = planType1.getContext();
        java.lang.Class<?> cls12 = planType1.getPlanClass();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(cls12);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test241");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        java.lang.reflect.Method method3 = planType1.getContext();
        java.lang.String str4 = planType1.getName();
        io.github.agentsoz.jill.struct.PlanType planType6 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array7 = planType6.getChildren();
        java.lang.reflect.Method method8 = null;
        planType6.setContext(method8);
        java.lang.reflect.Method method10 = null;
        planType6.setContext(method10);
        int i12 = planType6.getId();
        int i13 = planType6.getId();
        byte[] byte_array14 = planType6.getParents();
        io.github.agentsoz.jill.struct.PlanType planType16 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType16.addChild((byte) 1);
        byte[] byte_array19 = planType16.getParents();
        java.lang.reflect.Method method20 = null;
        planType16.setBody(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType6, (io.github.agentsoz.jill.struct.AObject) planType16);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType16);
        java.lang.String str24 = planType1.getName();
        io.github.agentsoz.jill.struct.PlanType planType26 = new io.github.agentsoz.jill.struct.PlanType("hi!:1");
        java.lang.reflect.Method method27 = null;
        planType26.setContext(method27);
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType26);
        byte[] byte_array30 = planType26.getChildren();
        byte[] byte_array31 = planType26.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(byte_array30);
        org.junit.Assert.assertNull(byte_array31);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test242");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        int i4 = planType1.getId();
        io.github.agentsoz.jill.struct.PlanType planType6 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType6.addChild((byte) 1);
        planType6.addParent((byte) 10);
        planType6.setId(1);
        java.lang.reflect.Method method13 = planType6.getBody();
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        planType15.addParent((byte) 10);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType6, (io.github.agentsoz.jill.struct.AObject) planType15);
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType6);
        byte[] byte_array22 = planType6.getChildren();
        byte[] byte_array24 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array22, 0);
        byte[] byte_array26 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array24, (int) '4');
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertNotNull(byte_array24);
        org.junit.Assert.assertNotNull(byte_array26);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test243");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        planType1.setId((int) (short) 1);
        planType1.addChild((byte) -1);
        planType1.setId((int) ' ');
        java.lang.reflect.Method method27 = planType1.getBody();
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(method27);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test244");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        io.github.agentsoz.jill.struct.PlanType planType11 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType11.addChild((byte) 1);
        planType11.addParent((byte) 10);
        planType11.setId(1);
        planType11.addChild((byte) 1);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType11);
        java.lang.reflect.Method method21 = planType11.getContext();
        planType11.addParent((byte) 1);
        byte[] byte_array24 = planType11.getChildren();
        planType11.setName("hi!:-1:1");
        planType11.setName("hi!:-1");
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(byte_array24);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test245");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        planType1.addChild((byte) 100);
        java.lang.String str12 = planType1.toString();
        planType1.setId((int) 'a');
        io.github.agentsoz.jill.struct.PlanType planType16 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType16.addChild((byte) 1);
        java.lang.reflect.Method method19 = null;
        planType16.setContext(method19);
        planType16.setName("hi!");
        java.lang.reflect.Method method23 = null;
        planType16.setContext(method23);
        io.github.agentsoz.jill.struct.PlanType planType26 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType26.addChild((byte) 1);
        planType26.addParent((byte) 10);
        planType26.setId(1);
        planType26.addChild((byte) 1);
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType16, (io.github.agentsoz.jill.struct.AObject) planType26);
        java.lang.reflect.Method method36 = planType26.getContext();
        planType26.addParent((byte) 1);
        byte[] byte_array39 = planType26.getChildren();
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType26);
        java.lang.reflect.Method method41 = null;
        planType26.setContext(method41);
        io.github.agentsoz.jill.struct.PlanType planType44 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        java.lang.reflect.Method method45 = planType44.getContext();
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType26, (io.github.agentsoz.jill.struct.AObject) planType44);
        java.lang.reflect.Method method47 = planType44.getBody();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNotNull(byte_array39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(method45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNull(method47);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test246");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = planType1.getContext();
        java.lang.reflect.Method method6 = null;
        planType1.setContext(method6);
        java.lang.String str8 = planType1.getName();
        java.lang.Class<?> cls9 = planType1.getPlanClass();
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(cls9);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test247");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.setName("hi!:-1");
        int i10 = planType1.getId();
        java.lang.Class<?> cls11 = planType1.getPlanClass();
        planType1.setName("hi!:1");
        planType1.setId((int) (byte) 100);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(cls11);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test248");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.String str9 = planType1.toString();
        byte[] byte_array10 = planType1.getParents();
        byte[] byte_array11 = planType1.getParents();
        planType1.setName("hi!:-1");
        planType1.setId((int) 'a');
        byte[] byte_array16 = planType1.getChildren();
        try {
            byte[] byte_array18 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array16, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:-1" + "'", str9.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test249");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        planType1.setId(100);
        planType1.setName("hi!:-1");
        byte[] byte_array9 = planType1.getParents();
        planType1.addParent((byte) 0);
        java.lang.reflect.Method method12 = null;
        planType1.setBody(method12);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test250");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        java.lang.Class<?> cls16 = planType1.getPlanClass();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(cls16);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test251");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.String str3 = planType1.toString();
        planType1.setName("hi!:-1");
        planType1.setId((int) (short) 100);
        java.lang.reflect.Method method8 = null;
        planType1.setBody(method8);
        java.lang.String str10 = planType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!:-1" + "'", str3.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1:100" + "'", str10.equals("hi!:-1:100"));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test252");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        byte[] byte_array13 = planType1.getParents();
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (byte) 0);
        try {
            byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test253");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("");
        planType1.setName("hi!:1");
        byte[] byte_array4 = planType1.getParents();
        java.lang.String str5 = planType1.toString();
        planType1.setId((int) (byte) -1);
        byte[] byte_array8 = planType1.getChildren();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:1:-1" + "'", str5.equals("hi!:1:-1"));
        org.junit.Assert.assertNull(byte_array8);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test254");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = null;
        planType1.setContext(method5);
        java.lang.reflect.Method method7 = null;
        planType1.setContext(method7);
        java.lang.String str9 = planType1.getName();
        planType1.setId(100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test255");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        java.lang.reflect.Method method8 = planType1.getContext();
        planType1.setId((int) (short) 100);
        planType1.setId((int) ' ');
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test256");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        int i4 = planType1.getId();
        io.github.agentsoz.jill.struct.PlanType planType6 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType6.addChild((byte) 1);
        planType6.addParent((byte) 10);
        planType6.setId(1);
        java.lang.reflect.Method method13 = planType6.getBody();
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        planType15.addParent((byte) 10);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType6, (io.github.agentsoz.jill.struct.AObject) planType15);
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType6);
        java.lang.reflect.Method method22 = null;
        planType1.setContext(method22);
        byte[] byte_array24 = planType1.getParents();
        byte[] byte_array26 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array24, 10);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(byte_array24);
        org.junit.Assert.assertNotNull(byte_array26);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test257");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.reflect.Method method9 = planType1.getContext();
        io.github.agentsoz.jill.struct.PlanType planType11 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType11.addChild((byte) 1);
        planType11.addParent((byte) 10);
        planType11.setId(1);
        java.lang.reflect.Method method18 = planType11.getBody();
        io.github.agentsoz.jill.struct.PlanType planType20 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType20.addChild((byte) 1);
        planType20.addParent((byte) 10);
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType11, (io.github.agentsoz.jill.struct.AObject) planType20);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType20);
        java.lang.String str27 = planType1.getName();
        java.lang.reflect.Method method28 = null;
        planType1.setContext(method28);
        java.lang.Class<?> cls30 = planType1.getPlanClass();
        planType1.setName("hi!:52:-1");
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNull(cls30);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test258");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId((int) (byte) 100);
        java.lang.String str8 = planType1.getName();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test259");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        java.lang.String str12 = planType1.toString();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test260");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        planType1.addParent((byte) -1);
        java.lang.String str10 = planType1.toString();
        io.github.agentsoz.jill.struct.PlanType planType12 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType12.addChild((byte) 1);
        planType12.addParent((byte) 10);
        planType12.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType20 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType20.addChild((byte) 1);
        planType20.addParent((byte) 10);
        java.lang.reflect.Method method25 = planType20.getBody();
        java.lang.reflect.Method method26 = planType20.getBody();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType12, (io.github.agentsoz.jill.struct.AObject) planType20);
        java.lang.reflect.Method method28 = null;
        planType12.setBody(method28);
        planType12.setName("");
        byte[] byte_array32 = planType12.getChildren();
        java.lang.reflect.Method method33 = planType12.getContext();
        java.lang.reflect.Method method34 = planType12.getContext();
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType12);
        int i36 = planType1.getId();
        java.lang.reflect.Method method37 = planType1.getContext();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertNull(method37);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test261");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        java.lang.String str14 = planType1.toString();
        planType1.setName("hi!");
        planType1.addChild((byte) 10);
        io.github.agentsoz.jill.struct.PlanType planType20 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType20.addChild((byte) 1);
        planType20.addParent((byte) 10);
        planType20.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType28 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType28.addChild((byte) 1);
        planType28.addParent((byte) 10);
        java.lang.reflect.Method method33 = planType28.getBody();
        java.lang.reflect.Method method34 = planType28.getBody();
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType20, (io.github.agentsoz.jill.struct.AObject) planType28);
        java.lang.reflect.Method method36 = null;
        planType20.setBody(method36);
        planType20.setName("");
        java.lang.String str40 = planType20.toString();
        java.lang.reflect.Method method41 = planType20.getBody();
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType20);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:1" + "'", str14.equals("hi!:1"));
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + ":-1" + "'", str40.equals(":-1"));
        org.junit.Assert.assertNull(method41);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test262");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        int i4 = planType1.getId();
        java.lang.reflect.Method method5 = null;
        planType1.setContext(method5);
        java.lang.Class<?> cls7 = planType1.getPlanClass();
        planType1.addChild((byte) 100);
        java.lang.Class<?> cls10 = planType1.getPlanClass();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(cls7);
        org.junit.Assert.assertNull(cls10);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test263");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        planType1.addParent((byte) -1);
        java.lang.String str10 = planType1.toString();
        planType1.setName("hi!:-1");
        int i13 = planType1.getId();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i13 == (-1));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test264");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("");
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        java.lang.reflect.Method method15 = planType10.getBody();
        planType10.setId((int) '4');
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType20 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array21 = planType20.getChildren();
        java.lang.reflect.Method method22 = null;
        planType20.setContext(method22);
        java.lang.reflect.Method method24 = planType20.getContext();
        java.lang.Class<?> cls25 = planType20.getPlanClass();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType20);
        java.lang.reflect.Method method27 = null;
        planType20.setContext(method27);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(cls25);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test265");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.setName("hi!:-1");
        int i10 = planType1.getId();
        int i11 = planType1.getId();
        planType1.addParent((byte) 10);
        java.lang.reflect.Method method14 = null;
        planType1.setBody(method14);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test266");
        byte[] byte_array0 = null;
        byte[] byte_array2 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array0, 0);
        byte[] byte_array4 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, (int) '4');
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array4);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test267");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        java.lang.String str21 = planType1.getName();
        java.lang.reflect.Method method22 = planType1.getContext();
        byte[] byte_array23 = planType1.getParents();
        byte[] byte_array25 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array23, (int) '#');
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(byte_array23);
        org.junit.Assert.assertNotNull(byte_array25);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test268");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        planType1.setId(100);
        planType1.setName("hi!:-1");
        planType1.addChild((byte) 10);
        java.lang.Class<?> cls11 = planType1.getPlanClass();
        planType1.addParent((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(cls11);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test269");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.reflect.Method method9 = planType1.getContext();
        java.lang.String str10 = planType1.getName();
        planType1.addChild((byte) 100);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test270");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        java.lang.reflect.Method method13 = null;
        planType1.setContext(method13);
        byte[] byte_array15 = planType1.getParents();
        java.lang.reflect.Method method16 = null;
        planType1.setBody(method16);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test271");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.reflect.Method method9 = planType1.getContext();
        java.lang.String str10 = planType1.getName();
        java.lang.Class<?> cls11 = planType1.getPlanClass();
        planType1.addChild((byte) -1);
        java.lang.reflect.Method method14 = planType1.getContext();
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNull(cls11);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test272");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = planType1.getContext();
        planType1.setId((int) (short) 10);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test273");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.reflect.Method method9 = planType1.getContext();
        io.github.agentsoz.jill.struct.PlanType planType11 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType11.addChild((byte) 1);
        planType11.addParent((byte) 10);
        planType11.setId(1);
        java.lang.reflect.Method method18 = planType11.getBody();
        io.github.agentsoz.jill.struct.PlanType planType20 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType20.addChild((byte) 1);
        planType20.addParent((byte) 10);
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType11, (io.github.agentsoz.jill.struct.AObject) planType20);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType20);
        int i27 = planType20.getId();
        java.lang.reflect.Method method28 = null;
        planType20.setContext(method28);
        planType20.addChild((byte) 10);
        planType20.setName("hi!:1");
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i27 == (-1));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test274");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        java.lang.reflect.Method method3 = planType1.getContext();
        byte[] byte_array4 = planType1.getChildren();
        java.lang.reflect.Method method5 = planType1.getContext();
        byte[] byte_array6 = planType1.getParents();
        byte[] byte_array7 = planType1.getParents();
        planType1.setName("hi!:10");
        byte[] byte_array10 = planType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertNull(byte_array10);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test275");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        planType1.addChild((byte) 0);
        java.lang.String str10 = planType1.toString();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test276");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        java.lang.String str21 = planType1.getName();
        java.lang.reflect.Method method22 = planType1.getContext();
        byte[] byte_array23 = planType1.getParents();
        java.lang.String str24 = planType1.toString();
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(byte_array23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!:-1" + "'", str24.equals("hi!:-1"));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test277");
        byte[] byte_array0 = null;
        byte[] byte_array2 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array0, 97);
        org.junit.Assert.assertNotNull(byte_array2);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test278");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        io.github.agentsoz.jill.struct.PlanType planType3 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType3.addChild((byte) 1);
        planType3.addParent((byte) 10);
        planType3.addParent((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType3.setBody(method10);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType3);
        byte[] byte_array13 = planType3.getChildren();
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (short) 10);
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, 97);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array17);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test279");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("");
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        java.lang.reflect.Method method15 = planType10.getBody();
        planType10.setId((int) '4');
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        java.lang.reflect.Method method19 = null;
        planType1.setBody(method19);
        io.github.agentsoz.jill.struct.PlanType planType22 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType22.addChild((byte) 1);
        java.lang.reflect.Method method25 = null;
        planType22.setContext(method25);
        planType22.setName("hi!");
        java.lang.reflect.Method method29 = null;
        planType22.setContext(method29);
        planType22.addChild((byte) 100);
        java.lang.String str33 = planType22.toString();
        java.lang.Class<?> cls34 = planType22.getPlanClass();
        byte[] byte_array35 = planType22.getParents();
        java.lang.reflect.Method method36 = planType22.getContext();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType22);
        int i38 = planType22.getId();
        java.lang.reflect.Method method39 = null;
        planType22.setContext(method39);
        java.lang.Class<?> cls41 = planType22.getPlanClass();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!:-1" + "'", str33.equals("hi!:-1"));
        org.junit.Assert.assertNull(cls34);
        org.junit.Assert.assertNull(byte_array35);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == (-1));
        org.junit.Assert.assertNull(cls41);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test280");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        java.lang.String str12 = planType1.toString();
        java.lang.String str13 = planType1.getName();
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addParent((byte) 10);
        int i18 = planType15.getId();
        io.github.agentsoz.jill.struct.PlanType planType20 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType20.addChild((byte) 1);
        planType20.addParent((byte) 10);
        planType20.setId(1);
        java.lang.reflect.Method method27 = planType20.getBody();
        io.github.agentsoz.jill.struct.PlanType planType29 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType29.addChild((byte) 1);
        planType29.addParent((byte) 10);
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType20, (io.github.agentsoz.jill.struct.AObject) planType29);
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType15, (io.github.agentsoz.jill.struct.AObject) planType20);
        byte[] byte_array36 = planType20.getChildren();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType20);
        java.lang.reflect.Method method38 = null;
        planType1.setContext(method38);
        java.lang.reflect.Method method40 = null;
        planType1.setBody(method40);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(byte_array36);
        org.junit.Assert.assertTrue(b37 == true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test281");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.setName("hi!:-1");
        int i10 = planType1.getId();
        io.github.agentsoz.jill.struct.PlanType planType12 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array13 = planType12.getChildren();
        java.lang.reflect.Method method14 = null;
        planType12.setContext(method14);
        java.lang.reflect.Method method16 = planType12.getContext();
        java.lang.reflect.Method method17 = null;
        planType12.setBody(method17);
        boolean b19 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType12);
        io.github.agentsoz.jill.struct.PlanType planType21 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType21.addChild((byte) 1);
        java.lang.reflect.Method method24 = null;
        planType21.setContext(method24);
        planType21.setName("hi!");
        java.lang.reflect.Method method28 = null;
        planType21.setContext(method28);
        java.lang.String str30 = planType21.toString();
        planType21.setName("");
        java.lang.Class<?> cls33 = planType21.getPlanClass();
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType12, (io.github.agentsoz.jill.struct.AObject) planType21);
        planType21.addParent((byte) -1);
        byte[] byte_array37 = planType21.getParents();
        planType21.setName("hi!:1");
        byte[] byte_array40 = planType21.getParents();
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1" + "'", str30.equals("hi!:-1"));
        org.junit.Assert.assertNull(cls33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(byte_array37);
        org.junit.Assert.assertNotNull(byte_array40);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test282");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.reflect.Method method9 = planType1.getContext();
        io.github.agentsoz.jill.struct.PlanType planType11 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType11.addChild((byte) 1);
        planType11.addParent((byte) 10);
        planType11.setId(1);
        java.lang.reflect.Method method18 = planType11.getBody();
        io.github.agentsoz.jill.struct.PlanType planType20 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType20.addChild((byte) 1);
        planType20.addParent((byte) 10);
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType11, (io.github.agentsoz.jill.struct.AObject) planType20);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType20);
        java.lang.reflect.Method method27 = null;
        planType20.setBody(method27);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test283");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        byte[] byte_array8 = planType1.getParents();
        byte[] byte_array10 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array8, 0);
        byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (int) (short) 1);
        byte[] byte_array14 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array12, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array14);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test284");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.String str4 = planType1.toString();
        java.lang.String str5 = planType1.getName();
        java.lang.Class<?> cls6 = planType1.getPlanClass();
        int i7 = planType1.getId();
        java.lang.reflect.Method method8 = null;
        planType1.setBody(method8);
        java.lang.String str10 = planType1.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(cls6);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test285");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        java.lang.reflect.Method method8 = planType1.getContext();
        planType1.setId((int) (byte) -1);
        planType1.addChild((byte) 0);
        java.lang.reflect.Method method13 = null;
        planType1.setContext(method13);
        java.lang.reflect.Method method15 = planType1.getBody();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test286");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.String str4 = planType1.toString();
        java.lang.String str5 = planType1.getName();
        java.lang.reflect.Method method6 = null;
        planType1.setContext(method6);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        java.lang.reflect.Method method12 = null;
        planType9.setContext(method12);
        java.lang.String str14 = planType9.toString();
        planType9.setName("");
        byte[] byte_array17 = planType9.getChildren();
        planType9.setId((int) (byte) 100);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        byte[] byte_array21 = planType1.getParents();
        java.lang.Class<?> cls22 = planType1.getPlanClass();
        planType1.addChild((byte) 100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:-1" + "'", str14.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(byte_array21);
        org.junit.Assert.assertNull(cls22);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test287");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        planType18.addParent((byte) 1);
        java.lang.reflect.Method method23 = null;
        planType18.setBody(method23);
        java.lang.reflect.Method method25 = planType18.getBody();
        java.lang.Class<?> cls26 = planType18.getPlanClass();
        planType18.setName("hi!:1");
        planType18.addChild((byte) 0);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(cls26);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test288");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = planType1.getContext();
        java.lang.Class<?> cls6 = planType1.getPlanClass();
        byte[] byte_array7 = planType1.getParents();
        java.lang.reflect.Method method8 = planType1.getBody();
        byte[] byte_array9 = planType1.getChildren();
        planType1.setName("hi!:-1:1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(cls6);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(byte_array9);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test289");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        java.lang.reflect.Method method13 = null;
        planType1.setContext(method13);
        planType1.addChild((byte) 0);
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test290");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        planType1.setId((int) (short) 1);
        planType1.addChild((byte) -1);
        planType1.setId(1);
        byte[] byte_array27 = planType1.getChildren();
        byte[] byte_array29 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array27, (int) (byte) 0);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(byte_array27);
        org.junit.Assert.assertNotNull(byte_array29);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test291");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        java.lang.reflect.Method method3 = planType1.getBody();
        java.lang.String str4 = planType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test292");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.reflect.Method method9 = null;
        planType1.setContext(method9);
        planType1.setName("hi!");
        byte[] byte_array13 = planType1.getChildren();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test293");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        planType1.setId((int) (short) 1);
        planType1.addChild((byte) -1);
        planType1.setId(1);
        byte[] byte_array27 = planType1.getChildren();
        byte[] byte_array28 = planType1.getChildren();
        int i29 = planType1.getId();
        planType1.addParent((byte) 0);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(byte_array27);
        org.junit.Assert.assertNotNull(byte_array28);
        org.junit.Assert.assertTrue(i29 == 1);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test294");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        int i4 = planType1.getId();
        io.github.agentsoz.jill.struct.PlanType planType6 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType6.addChild((byte) 1);
        planType6.addParent((byte) 10);
        planType6.setId(1);
        java.lang.reflect.Method method13 = planType6.getBody();
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        planType15.addParent((byte) 10);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType6, (io.github.agentsoz.jill.struct.AObject) planType15);
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType6);
        java.lang.Class<?> cls22 = planType6.getPlanClass();
        java.lang.reflect.Method method23 = planType6.getContext();
        planType6.setName("hi!:1");
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(cls22);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test295");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        int i4 = planType1.getId();
        io.github.agentsoz.jill.struct.PlanType planType6 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType6.addChild((byte) 1);
        planType6.addParent((byte) 10);
        planType6.setId(1);
        java.lang.reflect.Method method13 = planType6.getBody();
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        planType15.addParent((byte) 10);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType6, (io.github.agentsoz.jill.struct.AObject) planType15);
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType6);
        java.lang.reflect.Method method22 = null;
        planType1.setContext(method22);
        java.lang.reflect.Method method24 = null;
        planType1.setBody(method24);
        java.lang.String str26 = planType1.getName();
        java.lang.Class<?> cls27 = planType1.getPlanClass();
        java.lang.String str28 = planType1.getName();
        java.lang.String str29 = planType1.toString();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertNull(cls27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!:-1" + "'", str29.equals("hi!:-1"));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test296");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        java.lang.String str12 = planType1.toString();
        io.github.agentsoz.jill.struct.PlanType planType14 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType14.addChild((byte) 1);
        planType14.addParent((byte) 10);
        planType14.setId(1);
        planType14.addParent((byte) 10);
        planType14.addParent((byte) 10);
        planType14.addParent((byte) 10);
        java.lang.String str27 = planType14.toString();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType14);
        io.github.agentsoz.jill.struct.PlanType planType30 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array31 = planType30.getChildren();
        java.lang.reflect.Method method32 = null;
        planType30.setContext(method32);
        planType30.setId(100);
        planType30.setName("hi!:-1");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType14, (io.github.agentsoz.jill.struct.AObject) planType30);
        byte[] byte_array39 = planType14.getParents();
        java.lang.Class<?> cls40 = planType14.getPlanClass();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:1" + "'", str27.equals("hi!:1"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(byte_array39);
        org.junit.Assert.assertNull(cls40);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test297");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.String str4 = planType1.toString();
        planType1.setName("hi!:-1");
        planType1.addChild((byte) 0);
        int i9 = planType1.getId();
        int i10 = planType1.getId();
        java.lang.String str11 = planType1.getName();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:-1" + "'", str11.equals("hi!:-1"));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test298");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        byte[] byte_array6 = planType1.getChildren();
        java.lang.reflect.Method method7 = planType1.getBody();
        java.lang.reflect.Method method8 = planType1.getContext();
        java.lang.String str9 = planType1.getName();
        planType1.addChild((byte) 10);
        java.lang.String str12 = planType1.toString();
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test299");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        byte[] byte_array13 = planType1.getParents();
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, 0);
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, 1);
        byte[] byte_array19 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (short) 0);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertNotNull(byte_array19);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test300");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        java.lang.reflect.Method method8 = planType1.getContext();
        planType1.setId((int) (byte) -1);
        planType1.addChild((byte) 0);
        int i13 = planType1.getId();
        java.lang.Class<?> cls14 = planType1.getPlanClass();
        int i15 = planType1.getId();
        int i16 = planType1.getId();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertNull(cls14);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == (-1));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test301");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        java.lang.String str14 = planType1.toString();
        planType1.setName("hi!");
        byte[] byte_array17 = planType1.getChildren();
        java.lang.Class<?> cls18 = planType1.getPlanClass();
        java.lang.Class<?> cls19 = planType1.getPlanClass();
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:1" + "'", str14.equals("hi!:1"));
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertNull(cls18);
        org.junit.Assert.assertNull(cls19);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test302");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        byte[] byte_array13 = planType1.getParents();
        planType1.addParent((byte) 0);
        byte[] byte_array16 = planType1.getParents();
        java.lang.String str17 = planType1.toString();
        java.lang.Class<?> cls18 = planType1.getPlanClass();
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!:1" + "'", str17.equals("hi!:1"));
        org.junit.Assert.assertNull(cls18);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test303");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.reflect.Method method9 = null;
        planType1.setContext(method9);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method13 = planType1.getBody();
        planType1.addParent((byte) 10);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test304");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.reflect.Method method9 = planType1.getContext();
        io.github.agentsoz.jill.struct.PlanType planType11 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType11.addChild((byte) 1);
        planType11.addParent((byte) 10);
        planType11.setId(1);
        java.lang.reflect.Method method18 = planType11.getBody();
        io.github.agentsoz.jill.struct.PlanType planType20 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType20.addChild((byte) 1);
        planType20.addParent((byte) 10);
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType11, (io.github.agentsoz.jill.struct.AObject) planType20);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType20);
        java.lang.String str27 = planType1.getName();
        java.lang.Class<?> cls28 = planType1.getPlanClass();
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNull(cls28);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test305");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        planType10.setName("hi!:1");
        planType10.setId((int) 'a');
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test306");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = planType1.getContext();
        java.lang.reflect.Method method6 = null;
        planType1.setContext(method6);
        java.lang.String str8 = planType1.getName();
        java.lang.Class<?> cls9 = planType1.getPlanClass();
        planType1.addParent((byte) 10);
        planType1.setName("hi!:1:-1");
        java.lang.reflect.Method method14 = null;
        planType1.setBody(method14);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(cls9);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test307");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.setName("hi!:-1");
        int i10 = planType1.getId();
        int i11 = planType1.getId();
        java.lang.reflect.Method method12 = null;
        planType1.setBody(method12);
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        java.lang.reflect.Method method18 = null;
        planType15.setContext(method18);
        planType15.setName("hi!");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType15);
        io.github.agentsoz.jill.struct.PlanType planType24 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType24.addParent((byte) 1);
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType15, (io.github.agentsoz.jill.struct.AObject) planType24);
        java.lang.String str28 = planType24.toString();
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!:-1" + "'", str28.equals("hi!:-1"));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test308");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.String str4 = planType1.toString();
        java.lang.String str5 = planType1.toString();
        planType1.addChild((byte) 10);
        planType1.setId(1);
        java.lang.String str10 = planType1.toString();
        java.lang.String str11 = planType1.getName();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:1" + "'", str10.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test309");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        int i8 = planType1.getId();
        planType1.addParent((byte) 10);
        java.lang.reflect.Method method11 = null;
        planType1.setBody(method11);
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test310");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        planType1.setName("");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method16 = null;
        planType1.setBody(method16);
        java.lang.reflect.Method method18 = null;
        planType1.setBody(method18);
        java.lang.String str20 = planType1.getName();
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test311");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        java.lang.reflect.Method method16 = null;
        planType1.setBody(method16);
        java.lang.reflect.Method method18 = null;
        planType1.setContext(method18);
        int i20 = planType1.getId();
        java.lang.reflect.Method method21 = null;
        planType1.setContext(method21);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i20 == 1);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test312");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!:1:-1");
        java.lang.reflect.Method method2 = null;
        planType1.setBody(method2);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test313");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        java.lang.String str10 = planType1.toString();
        planType1.setName("");
        java.lang.reflect.Method method13 = null;
        planType1.setContext(method13);
        java.lang.reflect.Method method15 = planType1.getBody();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test314");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        io.github.agentsoz.jill.struct.PlanType planType11 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType11.addChild((byte) 1);
        planType11.addParent((byte) 10);
        planType11.setId(1);
        planType11.addChild((byte) 1);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType11);
        java.lang.reflect.Method method21 = planType11.getContext();
        planType11.addParent((byte) 1);
        byte[] byte_array24 = planType11.getChildren();
        byte[] byte_array26 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array24, (int) (short) 100);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(byte_array24);
        org.junit.Assert.assertNotNull(byte_array26);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test315");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        java.lang.reflect.Method method3 = planType1.getContext();
        java.lang.reflect.Method method4 = planType1.getContext();
        java.lang.reflect.Method method5 = planType1.getContext();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test316");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType17.setContext(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        java.lang.reflect.Method method23 = planType17.getContext();
        java.lang.reflect.Method method24 = planType17.getBody();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test317");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        io.github.agentsoz.jill.struct.PlanType planType11 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType11.addChild((byte) 1);
        planType11.addParent((byte) 10);
        planType11.setId(1);
        planType11.addChild((byte) 1);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType11);
        java.lang.reflect.Method method21 = planType11.getContext();
        planType11.addParent((byte) 1);
        byte[] byte_array24 = planType11.getChildren();
        io.github.agentsoz.jill.struct.PlanType planType26 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType26.addChild((byte) 1);
        planType26.addParent((byte) 10);
        planType26.setId(1);
        java.lang.reflect.Method method33 = planType26.getBody();
        io.github.agentsoz.jill.struct.PlanType planType35 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType35.addChild((byte) 1);
        planType35.addParent((byte) 10);
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType26, (io.github.agentsoz.jill.struct.AObject) planType35);
        io.github.agentsoz.jill.struct.PlanType planType42 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType42.addChild((byte) 1);
        java.lang.reflect.Method method45 = null;
        planType42.setContext(method45);
        boolean b47 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType26, (io.github.agentsoz.jill.struct.AObject) planType42);
        java.lang.String str48 = planType42.getName();
        planType42.addChild((byte) 10);
        int i51 = planType42.getId();
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType11, (io.github.agentsoz.jill.struct.AObject) planType42);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(byte_array24);
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        org.junit.Assert.assertTrue(i51 == (-1));
        org.junit.Assert.assertTrue(b52 == true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test318");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        byte[] byte_array13 = planType1.getParents();
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (byte) 0);
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, 10);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array17);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test319");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.setName("hi!");
        java.lang.String str6 = planType1.getName();
        java.lang.String str7 = planType1.toString();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:-1" + "'", str7.equals("hi!:-1"));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test320");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.String str9 = planType1.toString();
        io.github.agentsoz.jill.struct.PlanType planType11 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType11.addChild((byte) 1);
        planType11.addParent((byte) 10);
        planType11.setId(1);
        planType11.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType11.setContext(method20);
        java.lang.String str22 = planType11.toString();
        planType11.addChild((byte) -1);
        java.lang.String str25 = planType11.getName();
        byte[] byte_array26 = planType11.getChildren();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType11);
        java.lang.String str28 = planType11.getName();
        java.lang.reflect.Method method29 = planType11.getContext();
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:-1" + "'", str9.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!:1" + "'", str22.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertNull(method29);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test321");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.reflect.Method method9 = planType1.getContext();
        java.lang.reflect.Method method10 = null;
        planType1.setBody(method10);
        java.lang.reflect.Method method12 = null;
        planType1.setBody(method12);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test322");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        int i4 = planType1.getId();
        java.lang.reflect.Method method5 = null;
        planType1.setContext(method5);
        java.lang.String str7 = planType1.toString();
        java.lang.reflect.Method method8 = planType1.getContext();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:-1" + "'", str7.equals("hi!:-1"));
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test323");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        planType1.addChild((byte) 100);
        java.lang.String str12 = planType1.toString();
        planType1.setId((int) 'a');
        io.github.agentsoz.jill.struct.PlanType planType16 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType16.addChild((byte) 1);
        java.lang.reflect.Method method19 = null;
        planType16.setContext(method19);
        planType16.setName("hi!");
        java.lang.reflect.Method method23 = null;
        planType16.setContext(method23);
        io.github.agentsoz.jill.struct.PlanType planType26 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType26.addChild((byte) 1);
        planType26.addParent((byte) 10);
        planType26.setId(1);
        planType26.addChild((byte) 1);
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType16, (io.github.agentsoz.jill.struct.AObject) planType26);
        java.lang.reflect.Method method36 = planType26.getContext();
        planType26.addParent((byte) 1);
        byte[] byte_array39 = planType26.getChildren();
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType26);
        java.lang.reflect.Method method41 = null;
        planType26.setContext(method41);
        io.github.agentsoz.jill.struct.PlanType planType44 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        java.lang.reflect.Method method45 = planType44.getContext();
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType26, (io.github.agentsoz.jill.struct.AObject) planType44);
        io.github.agentsoz.jill.struct.PlanType planType48 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        java.lang.reflect.Method method49 = planType48.getContext();
        byte[] byte_array50 = planType48.getParents();
        int i51 = planType48.getId();
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType26, (io.github.agentsoz.jill.struct.AObject) planType48);
        planType48.setName("hi!:1");
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNotNull(byte_array39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(method45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNull(method49);
        org.junit.Assert.assertNull(byte_array50);
        org.junit.Assert.assertTrue(i51 == (-1));
        org.junit.Assert.assertTrue(b52 == true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test324");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        java.lang.reflect.Method method10 = planType1.getContext();
        planType1.setName("");
        byte[] byte_array13 = planType1.getParents();
        java.lang.Class<?> cls14 = planType1.getPlanClass();
        byte[] byte_array15 = planType1.getChildren();
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNull(cls14);
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test325");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.reflect.Method method9 = planType1.getContext();
        java.lang.String str10 = planType1.getName();
        byte[] byte_array11 = planType1.getChildren();
        byte[] byte_array12 = planType1.getChildren();
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test326");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        byte[] byte_array13 = planType1.getParents();
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (short) 10);
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, 1);
        byte[] byte_array19 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array17, (int) (short) 1);
        byte[] byte_array21 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array19, 0);
        byte[] byte_array23 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array21, (int) '4');
        byte[] byte_array25 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array23, (int) (short) 1);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertNotNull(byte_array21);
        org.junit.Assert.assertNotNull(byte_array23);
        org.junit.Assert.assertNotNull(byte_array25);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test327");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType17.setContext(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        planType1.setName("hi!:1");
        planType1.setName("hi!:52");
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test328");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        java.lang.reflect.Method method12 = null;
        planType9.setContext(method12);
        planType9.setName("hi!");
        java.lang.reflect.Method method16 = null;
        planType9.setContext(method16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        planType9.setName("hi!:-1");
        byte[] byte_array21 = planType9.getParents();
        java.lang.reflect.Method method22 = null;
        planType9.setContext(method22);
        java.lang.reflect.Method method24 = null;
        planType9.setContext(method24);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(byte_array21);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test329");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        java.lang.String str14 = planType1.toString();
        planType1.setName("hi!");
        byte[] byte_array17 = planType1.getChildren();
        java.lang.String str18 = planType1.toString();
        java.lang.reflect.Method method19 = planType1.getContext();
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:1" + "'", str14.equals("hi!:1"));
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!:1" + "'", str18.equals("hi!:1"));
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test330");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.setName("hi!:-1");
        int i10 = planType1.getId();
        int i11 = planType1.getId();
        java.lang.reflect.Method method12 = null;
        planType1.setBody(method12);
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        java.lang.reflect.Method method18 = null;
        planType15.setContext(method18);
        planType15.setName("hi!");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType15);
        io.github.agentsoz.jill.struct.PlanType planType24 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType24.addParent((byte) 1);
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType15, (io.github.agentsoz.jill.struct.AObject) planType24);
        io.github.agentsoz.jill.struct.PlanType planType29 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType29.addChild((byte) 1);
        planType29.addParent((byte) 10);
        planType29.setId(1);
        planType29.addChild((byte) 1);
        java.lang.reflect.Method method38 = null;
        planType29.setContext(method38);
        java.lang.String str40 = planType29.toString();
        java.lang.String str41 = planType29.getName();
        java.lang.reflect.Method method42 = null;
        planType29.setBody(method42);
        planType29.addParent((byte) 10);
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType15, (io.github.agentsoz.jill.struct.AObject) planType29);
        planType29.addChild((byte) -1);
        byte[] byte_array49 = planType29.getParents();
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!:1" + "'", str40.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(byte_array49);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test331");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        io.github.agentsoz.jill.struct.PlanType planType3 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType3.addChild((byte) 1);
        planType3.addParent((byte) 10);
        planType3.addParent((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType3.setBody(method10);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType3);
        io.github.agentsoz.jill.struct.PlanType planType14 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType14.addChild((byte) 1);
        planType14.addParent((byte) 10);
        planType14.addParent((byte) 1);
        int i21 = planType14.getId();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType14);
        int i23 = planType14.getId();
        planType14.addChild((byte) -1);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(i23 == (-1));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test332");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        planType1.addParent((byte) -1);
        java.lang.String str10 = planType1.toString();
        planType1.setName("hi!:-1");
        byte[] byte_array13 = planType1.getParents();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test333");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType17.setContext(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        java.lang.String str23 = planType17.getName();
        planType17.addChild((byte) 10);
        planType17.setName("hi!");
        int i28 = planType17.getId();
        byte[] byte_array29 = planType17.getChildren();
        java.lang.Class<?> cls30 = planType17.getPlanClass();
        io.github.agentsoz.jill.struct.PlanType planType32 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType32.addParent((byte) 10);
        java.lang.String str35 = planType32.toString();
        java.lang.String str36 = planType32.getName();
        java.lang.reflect.Method method37 = planType32.getBody();
        java.lang.reflect.Method method38 = null;
        planType32.setBody(method38);
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType17, (io.github.agentsoz.jill.struct.AObject) planType32);
        java.lang.String str41 = planType32.getName();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue(i28 == (-1));
        org.junit.Assert.assertNotNull(byte_array29);
        org.junit.Assert.assertNull(cls30);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!:-1" + "'", str35.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        org.junit.Assert.assertNull(method37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test334");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!:52");
        java.lang.String str2 = planType1.toString();
        planType1.setName("hi!:-1:-1");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!:52:-1" + "'", str2.equals("hi!:52:-1"));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test335");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("");
        byte[] byte_array9 = planType1.getChildren();
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, 10);
        try {
            byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test336");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        int i8 = planType1.getId();
        planType1.addParent((byte) 10);
        planType1.setName("");
        java.lang.reflect.Method method13 = null;
        planType1.setContext(method13);
        java.lang.reflect.Method method15 = planType1.getContext();
        java.lang.String str16 = planType1.getName();
        planType1.addParent((byte) 100);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test337");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.setName("hi!:-1");
        int i10 = planType1.getId();
        int i11 = planType1.getId();
        java.lang.reflect.Method method12 = null;
        planType1.setBody(method12);
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        java.lang.reflect.Method method18 = null;
        planType15.setContext(method18);
        planType15.setName("hi!");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType15);
        io.github.agentsoz.jill.struct.PlanType planType24 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType24.addParent((byte) 1);
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType15, (io.github.agentsoz.jill.struct.AObject) planType24);
        byte[] byte_array28 = planType24.getParents();
        java.lang.reflect.Method method29 = planType24.getContext();
        java.lang.String str30 = planType24.getName();
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(byte_array28);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test338");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        java.lang.Class<?> cls14 = planType1.getPlanClass();
        org.junit.Assert.assertNull(cls14);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test339");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        byte[] byte_array4 = planType1.getParents();
        java.lang.reflect.Method method5 = null;
        planType1.setBody(method5);
        java.lang.String str7 = planType1.toString();
        int i8 = planType1.getId();
        planType1.setId((int) '#');
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:-1" + "'", str7.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test340");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = planType1.getContext();
        byte[] byte_array11 = planType1.getChildren();
        planType1.addParent((byte) 1);
        java.lang.Class<?> cls14 = planType1.getPlanClass();
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNull(cls14);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test341");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("");
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        java.lang.reflect.Method method15 = planType10.getBody();
        planType10.setId((int) '4');
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType20 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array21 = planType20.getChildren();
        java.lang.reflect.Method method22 = null;
        planType20.setContext(method22);
        java.lang.reflect.Method method24 = planType20.getContext();
        java.lang.Class<?> cls25 = planType20.getPlanClass();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType20);
        int i27 = planType1.getId();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(cls25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == (-1));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test342");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        io.github.agentsoz.jill.struct.PlanType planType3 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType3.addChild((byte) 1);
        planType3.addParent((byte) 10);
        planType3.addParent((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType3.setBody(method10);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType3);
        java.lang.reflect.Method method13 = null;
        planType1.setContext(method13);
        java.lang.reflect.Method method15 = planType1.getContext();
        byte[] byte_array16 = planType1.getParents();
        planType1.addParent((byte) 100);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(byte_array16);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test343");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        planType1.setName("hi!");
        int i11 = planType1.getId();
        java.lang.reflect.Method method12 = planType1.getBody();
        java.lang.reflect.Method method13 = null;
        planType1.setBody(method13);
        java.lang.reflect.Method method15 = null;
        planType1.setBody(method15);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test344");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("hi!:-1");
        java.lang.Class<?> cls9 = planType1.getPlanClass();
        java.lang.reflect.Method method10 = planType1.getBody();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test345");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        java.lang.reflect.Method method17 = null;
        planType1.setBody(method17);
        planType1.setName("");
        java.lang.String str21 = planType1.toString();
        byte[] byte_array22 = planType1.getParents();
        planType1.addParent((byte) 10);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ":-1" + "'", str21.equals(":-1"));
        org.junit.Assert.assertNotNull(byte_array22);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test346");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        java.lang.String str12 = planType1.toString();
        planType1.addChild((byte) -1);
        java.lang.String str15 = planType1.getName();
        byte[] byte_array16 = planType1.getChildren();
        java.lang.Class<?> cls17 = planType1.getPlanClass();
        planType1.addParent((byte) 0);
        java.lang.reflect.Method method20 = planType1.getBody();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertNull(cls17);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test347");
        byte[] byte_array0 = null;
        byte[] byte_array2 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array0, (int) (byte) 1);
        byte[] byte_array4 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array4);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test348");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        java.lang.String str12 = planType1.toString();
        java.lang.String str13 = planType1.getName();
        java.lang.reflect.Method method14 = null;
        planType1.setBody(method14);
        byte[] byte_array16 = planType1.getChildren();
        byte[] byte_array18 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array16, (int) ' ');
        byte[] byte_array20 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array18, (int) 'a');
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertNotNull(byte_array18);
        org.junit.Assert.assertNotNull(byte_array20);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test349");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("");
        java.lang.Class<?> cls9 = planType1.getPlanClass();
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(cls9);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test350");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("hi!:-1");
        java.lang.reflect.Method method9 = planType1.getBody();
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test351");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        planType1.setName("hi!");
        int i11 = planType1.getId();
        java.lang.reflect.Method method12 = planType1.getBody();
        java.lang.reflect.Method method13 = null;
        planType1.setBody(method13);
        java.lang.reflect.Method method15 = planType1.getBody();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test352");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        java.lang.String str10 = planType1.toString();
        planType1.setName("");
        java.lang.String str13 = planType1.getName();
        planType1.setName("hi!:-1");
        java.lang.reflect.Method method16 = planType1.getBody();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test353");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        planType1.addParent((byte) 100);
        java.lang.String str10 = planType1.toString();
        planType1.setName("hi!:-1:100");
        java.lang.reflect.Method method13 = planType1.getContext();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test354");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        planType1.setName("hi!");
        java.lang.Class<?> cls11 = planType1.getPlanClass();
        planType1.addChild((byte) -1);
        int i14 = planType1.getId();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(cls11);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test355");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("");
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        java.lang.reflect.Method method15 = planType10.getBody();
        planType10.setId((int) '4');
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        java.lang.reflect.Method method19 = null;
        planType1.setBody(method19);
        planType1.addParent((byte) 100);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test356");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        java.lang.reflect.Method method12 = null;
        planType9.setContext(method12);
        planType9.setName("hi!");
        java.lang.reflect.Method method16 = null;
        planType9.setContext(method16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        int i19 = planType1.getId();
        java.lang.reflect.Method method20 = null;
        planType1.setBody(method20);
        java.lang.String str22 = planType1.toString();
        byte[] byte_array23 = planType1.getParents();
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!:1" + "'", str22.equals("hi!:1"));
        org.junit.Assert.assertNotNull(byte_array23);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test357");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = null;
        planType1.setContext(method5);
        java.lang.reflect.Method method7 = null;
        planType1.setContext(method7);
        java.lang.String str9 = planType1.getName();
        planType1.setName("hi!:-1:100");
        planType1.addChild((byte) -1);
        planType1.addParent((byte) -1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test358");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.String str9 = planType1.toString();
        java.lang.reflect.Method method10 = planType1.getBody();
        planType1.addChild((byte) -1);
        planType1.addParent((byte) 1);
        java.lang.String str15 = planType1.toString();
        java.lang.reflect.Method method16 = planType1.getContext();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!:1" + "'", str15.equals("hi!:1"));
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test359");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.String str4 = planType1.toString();
        java.lang.String str5 = planType1.toString();
        planType1.addChild((byte) 10);
        int i8 = planType1.getId();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        planType10.addParent((byte) 1);
        byte[] byte_array17 = planType10.getParents();
        java.lang.String str18 = planType10.toString();
        byte[] byte_array19 = planType10.getParents();
        java.lang.Class<?> cls20 = planType10.getPlanClass();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        byte[] byte_array22 = planType1.getChildren();
        java.lang.String str23 = planType1.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!:-1" + "'", str18.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertNull(cls20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:-1" + "'", str23.equals("hi!:-1"));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test360");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = planType1.getContext();
        java.lang.Class<?> cls6 = planType1.getPlanClass();
        java.lang.reflect.Method method7 = null;
        planType1.setBody(method7);
        java.lang.reflect.Method method9 = null;
        planType1.setContext(method9);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(cls6);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test361");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.setName("hi!:-1");
        int i10 = planType1.getId();
        int i11 = planType1.getId();
        java.lang.reflect.Method method12 = null;
        planType1.setBody(method12);
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        java.lang.reflect.Method method18 = null;
        planType15.setContext(method18);
        planType15.setName("hi!");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType15);
        io.github.agentsoz.jill.struct.PlanType planType24 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType24.addParent((byte) 1);
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType15, (io.github.agentsoz.jill.struct.AObject) planType24);
        byte[] byte_array28 = planType24.getChildren();
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(byte_array28);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test362");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        java.lang.reflect.Method method6 = planType1.getBody();
        java.lang.reflect.Method method7 = planType1.getContext();
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 0);
        int i12 = planType1.getId();
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test363");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.setName("hi!:-1");
        int i10 = planType1.getId();
        int i11 = planType1.getId();
        java.lang.reflect.Method method12 = null;
        planType1.setBody(method12);
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        java.lang.reflect.Method method18 = null;
        planType15.setContext(method18);
        planType15.setName("hi!");
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType15);
        java.lang.String str23 = planType15.toString();
        planType15.addParent((byte) 1);
        byte[] byte_array26 = planType15.getParents();
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:-1" + "'", str23.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array26);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test364");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addChild((byte) 0);
        java.lang.reflect.Method method12 = planType1.getContext();
        java.lang.reflect.Method method13 = planType1.getContext();
        byte[] byte_array14 = planType1.getChildren();
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(byte_array14);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test365");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        planType1.setName("");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 100);
        planType1.addParent((byte) 0);
        java.lang.Class<?> cls20 = planType1.getPlanClass();
        org.junit.Assert.assertNull(cls20);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test366");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        java.lang.reflect.Method method8 = planType1.getContext();
        planType1.setId((int) (byte) -1);
        planType1.addChild((byte) 0);
        int i13 = planType1.getId();
        java.lang.String str14 = planType1.getName();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test367");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = planType1.getContext();
        java.lang.Class<?> cls6 = planType1.getPlanClass();
        byte[] byte_array7 = planType1.getParents();
        java.lang.reflect.Method method8 = null;
        planType1.setBody(method8);
        java.lang.String str10 = planType1.toString();
        java.lang.reflect.Method method11 = planType1.getContext();
        byte[] byte_array12 = planType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(cls6);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(byte_array12);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test368");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("");
        byte[] byte_array9 = planType1.getChildren();
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, 10);
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) (short) 1);
        try {
            byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test369");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        java.lang.reflect.Method method3 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType5 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array6 = planType5.getChildren();
        java.lang.reflect.Method method7 = null;
        planType5.setContext(method7);
        java.lang.reflect.Method method9 = planType5.getContext();
        java.lang.Class<?> cls10 = planType5.getPlanClass();
        java.lang.reflect.Method method11 = null;
        planType5.setBody(method11);
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType5);
        java.lang.reflect.Method method14 = planType1.getContext();
        planType1.setId(1);
        java.lang.reflect.Method method17 = null;
        planType1.setContext(method17);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(cls10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test370");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        java.lang.reflect.Method method8 = null;
        planType1.setBody(method8);
        java.lang.reflect.Method method10 = planType1.getBody();
        java.lang.reflect.Method method11 = planType1.getBody();
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test371");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.reflect.Method method9 = planType1.getContext();
        java.lang.String str10 = planType1.getName();
        int i11 = planType1.getId();
        byte[] byte_array12 = planType1.getChildren();
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test372");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.String str4 = planType1.toString();
        java.lang.String str5 = planType1.getName();
        java.lang.Class<?> cls6 = planType1.getPlanClass();
        int i7 = planType1.getId();
        java.lang.reflect.Method method8 = null;
        planType1.setBody(method8);
        byte[] byte_array10 = planType1.getChildren();
        java.lang.reflect.Method method11 = planType1.getBody();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(cls6);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test373");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        byte[] byte_array13 = planType1.getParents();
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (short) 10);
        byte[] byte_array17 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, 1);
        byte[] byte_array19 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) (byte) 100);
        byte[] byte_array21 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array19, 100);
        byte[] byte_array23 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array19, (int) (short) 100);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertNotNull(byte_array21);
        org.junit.Assert.assertNotNull(byte_array23);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test374");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        byte[] byte_array6 = planType1.getChildren();
        java.lang.reflect.Method method7 = planType1.getBody();
        java.lang.reflect.Method method8 = planType1.getContext();
        int i9 = planType1.getId();
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(i9 == (-1));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test375");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        java.lang.Class<?> cls12 = planType1.getPlanClass();
        org.junit.Assert.assertNull(cls12);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test376");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("");
        byte[] byte_array9 = planType1.getChildren();
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, 100);
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test377");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.reflect.Method method9 = planType1.getContext();
        java.lang.String str10 = planType1.getName();
        byte[] byte_array11 = planType1.getChildren();
        java.lang.reflect.Method method12 = planType1.getBody();
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test378");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        java.lang.reflect.Method method8 = null;
        planType1.setBody(method8);
        java.lang.String str10 = planType1.toString();
        io.github.agentsoz.jill.struct.PlanType planType12 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType12.addChild((byte) 1);
        planType12.addParent((byte) 10);
        planType12.setId(1);
        java.lang.reflect.Method method19 = planType12.getBody();
        planType12.setName("hi!");
        int i22 = planType12.getId();
        java.lang.reflect.Method method23 = planType12.getBody();
        planType12.setName("hi!:-1:1");
        planType12.setId(10);
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType12);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test379");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = planType1.getContext();
        java.lang.reflect.Method method11 = null;
        planType1.setContext(method11);
        java.lang.Class<?> cls13 = planType1.getPlanClass();
        planType1.setId((int) (short) 10);
        planType1.setId((int) (short) 100);
        planType1.setName(":-1:-1");
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(cls13);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test380");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        byte[] byte_array6 = planType1.getChildren();
        java.lang.reflect.Method method7 = planType1.getBody();
        java.lang.reflect.Method method8 = planType1.getContext();
        java.lang.reflect.Method method9 = planType1.getBody();
        java.lang.String str10 = planType1.toString();
        byte[] byte_array11 = planType1.getChildren();
        java.lang.reflect.Method method12 = null;
        planType1.setContext(method12);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test381");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        byte[] byte_array6 = planType1.getChildren();
        java.lang.reflect.Method method7 = planType1.getBody();
        java.lang.reflect.Method method8 = planType1.getContext();
        java.lang.reflect.Method method9 = planType1.getBody();
        java.lang.String str10 = planType1.toString();
        byte[] byte_array11 = planType1.getChildren();
        try {
            byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test382");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addChild((byte) 0);
        java.lang.reflect.Method method12 = planType1.getContext();
        java.lang.reflect.Method method13 = null;
        planType1.setBody(method13);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test383");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.String str4 = planType1.toString();
        java.lang.String str5 = planType1.getName();
        java.lang.reflect.Method method6 = null;
        planType1.setContext(method6);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        java.lang.reflect.Method method12 = null;
        planType9.setContext(method12);
        java.lang.String str14 = planType9.toString();
        planType9.setName("");
        byte[] byte_array17 = planType9.getChildren();
        planType9.setId((int) (byte) 100);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        planType9.setId((int) (byte) -1);
        java.lang.reflect.Method method23 = null;
        planType9.setBody(method23);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:-1" + "'", str14.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test384");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.String str4 = planType1.toString();
        java.lang.String str5 = planType1.getName();
        java.lang.reflect.Method method6 = null;
        planType1.setContext(method6);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        java.lang.reflect.Method method12 = null;
        planType9.setContext(method12);
        java.lang.String str14 = planType9.toString();
        planType9.setName("");
        byte[] byte_array17 = planType9.getChildren();
        planType9.setId((int) (byte) 100);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        byte[] byte_array21 = planType1.getParents();
        java.lang.Class<?> cls22 = planType1.getPlanClass();
        byte[] byte_array23 = planType1.getChildren();
        planType1.addParent((byte) 10);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:-1" + "'", str14.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(byte_array21);
        org.junit.Assert.assertNull(cls22);
        org.junit.Assert.assertNull(byte_array23);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test385");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.String str9 = planType1.toString();
        java.lang.String str10 = planType1.toString();
        byte[] byte_array11 = planType1.getChildren();
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, (int) 'a');
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:1" + "'", str10.equals("hi!:1"));
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test386");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        planType1.setName("");
        byte[] byte_array11 = planType1.getParents();
        planType1.setName("hi!:-1:-1");
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test387");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        java.lang.reflect.Method method17 = null;
        planType1.setBody(method17);
        planType1.setName("");
        byte[] byte_array21 = planType1.getChildren();
        java.lang.reflect.Method method22 = planType1.getContext();
        byte[] byte_array23 = planType1.getParents();
        java.lang.String str24 = planType1.getName();
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(byte_array21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(byte_array23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test388");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        planType1.setName("hi!");
        byte[] byte_array11 = planType1.getChildren();
        java.lang.reflect.Method method12 = null;
        planType1.setContext(method12);
        java.lang.reflect.Method method14 = planType1.getBody();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test389");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.String str9 = planType1.toString();
        java.lang.String str10 = planType1.toString();
        byte[] byte_array11 = planType1.getChildren();
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, (int) (short) 100);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:1" + "'", str10.equals("hi!:1"));
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test390");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("");
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        java.lang.reflect.Method method15 = planType10.getBody();
        planType10.setId((int) '4');
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType20 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array21 = planType20.getChildren();
        java.lang.reflect.Method method22 = null;
        planType20.setContext(method22);
        java.lang.reflect.Method method24 = planType20.getContext();
        java.lang.Class<?> cls25 = planType20.getPlanClass();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType20);
        int i27 = planType20.getId();
        java.lang.reflect.Method method28 = null;
        planType20.setBody(method28);
        java.lang.reflect.Method method30 = planType20.getContext();
        java.lang.reflect.Method method31 = planType20.getContext();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(cls25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == (-1));
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNull(method31);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test391");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        int i4 = planType1.getId();
        io.github.agentsoz.jill.struct.PlanType planType6 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType6.addChild((byte) 1);
        planType6.addParent((byte) 10);
        planType6.setId(1);
        java.lang.reflect.Method method13 = planType6.getBody();
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        planType15.addParent((byte) 10);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType6, (io.github.agentsoz.jill.struct.AObject) planType15);
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType6);
        java.lang.reflect.Method method22 = null;
        planType1.setContext(method22);
        java.lang.reflect.Method method24 = null;
        planType1.setBody(method24);
        java.lang.String str26 = planType1.getName();
        java.lang.Class<?> cls27 = planType1.getPlanClass();
        java.lang.String str28 = planType1.getName();
        java.lang.reflect.Method method29 = null;
        planType1.setContext(method29);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertNull(cls27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test392");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        planType1.setName("hi!");
        byte[] byte_array11 = planType1.getChildren();
        java.lang.reflect.Method method12 = null;
        planType1.setContext(method12);
        planType1.setId((int) ' ');
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test393");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType17.setContext(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        java.lang.String str23 = planType17.getName();
        planType17.addChild((byte) 10);
        planType17.setName("hi!");
        int i28 = planType17.getId();
        byte[] byte_array29 = planType17.getChildren();
        java.lang.String str30 = planType17.toString();
        java.lang.reflect.Method method31 = null;
        planType17.setBody(method31);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue(i28 == (-1));
        org.junit.Assert.assertNotNull(byte_array29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1" + "'", str30.equals("hi!:-1"));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test394");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.String str9 = planType1.toString();
        java.lang.reflect.Method method10 = planType1.getBody();
        byte[] byte_array11 = planType1.getParents();
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, (int) (byte) 1);
        try {
            byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test395");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType17.setContext(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        java.lang.String str23 = planType17.getName();
        planType17.addChild((byte) 10);
        planType17.setName("hi!");
        byte[] byte_array28 = planType17.getParents();
        java.lang.String str29 = planType17.toString();
        java.lang.reflect.Method method30 = planType17.getBody();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!:-1" + "'", str29.equals("hi!:-1"));
        org.junit.Assert.assertNull(method30);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test396");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        planType1.setId(100);
        planType1.setName("hi!:-1");
        byte[] byte_array9 = planType1.getParents();
        java.lang.String str10 = planType1.toString();
        planType1.setId((int) (short) 10);
        int i13 = planType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1:100" + "'", str10.equals("hi!:-1:100"));
        org.junit.Assert.assertTrue(i13 == 10);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test397");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        planType1.setName("hi!");
        planType1.addChild((byte) 10);
        planType1.setId((int) (byte) 10);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test398");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        java.lang.Class<?> cls17 = planType1.getPlanClass();
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(cls17);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test399");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        java.lang.reflect.Method method3 = planType1.getContext();
        java.lang.String str4 = planType1.getName();
        io.github.agentsoz.jill.struct.PlanType planType6 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array7 = planType6.getChildren();
        java.lang.reflect.Method method8 = null;
        planType6.setContext(method8);
        java.lang.reflect.Method method10 = null;
        planType6.setContext(method10);
        int i12 = planType6.getId();
        int i13 = planType6.getId();
        byte[] byte_array14 = planType6.getParents();
        io.github.agentsoz.jill.struct.PlanType planType16 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType16.addChild((byte) 1);
        byte[] byte_array19 = planType16.getParents();
        java.lang.reflect.Method method20 = null;
        planType16.setBody(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType6, (io.github.agentsoz.jill.struct.AObject) planType16);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType16);
        planType16.setName("hi!:-1");
        java.lang.String str26 = planType16.toString();
        java.lang.String str27 = planType16.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:-1:-1" + "'", str26.equals("hi!:-1:-1"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:-1:-1" + "'", str27.equals("hi!:-1:-1"));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test400");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        int i4 = planType1.getId();
        io.github.agentsoz.jill.struct.PlanType planType6 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType6.addChild((byte) 1);
        planType6.addParent((byte) 10);
        planType6.setId(1);
        java.lang.reflect.Method method13 = planType6.getBody();
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        planType15.addParent((byte) 10);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType6, (io.github.agentsoz.jill.struct.AObject) planType15);
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType6);
        java.lang.Class<?> cls22 = planType6.getPlanClass();
        byte[] byte_array23 = planType6.getParents();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(cls22);
        org.junit.Assert.assertNotNull(byte_array23);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test401");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.reflect.Method method9 = planType1.getContext();
        io.github.agentsoz.jill.struct.PlanType planType11 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType11.addChild((byte) 1);
        planType11.addParent((byte) 10);
        planType11.setId(1);
        java.lang.reflect.Method method18 = planType11.getBody();
        io.github.agentsoz.jill.struct.PlanType planType20 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType20.addChild((byte) 1);
        planType20.addParent((byte) 10);
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType11, (io.github.agentsoz.jill.struct.AObject) planType20);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType20);
        planType20.addParent((byte) -1);
        java.lang.String str29 = planType20.getName();
        planType20.setName("hi!:10");
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test402");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("");
        java.lang.String str2 = planType1.getName();
        planType1.addParent((byte) 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test403");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        java.lang.reflect.Method method12 = null;
        planType9.setContext(method12);
        planType9.setName("hi!");
        java.lang.reflect.Method method16 = null;
        planType9.setContext(method16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        int i19 = planType1.getId();
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method22 = null;
        planType1.setContext(method22);
        planType1.addParent((byte) -1);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 1);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test404");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        byte[] byte_array4 = planType1.getParents();
        java.lang.reflect.Method method5 = null;
        planType1.setBody(method5);
        io.github.agentsoz.jill.struct.PlanType planType8 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType8.addParent((byte) 10);
        java.lang.String str11 = planType8.toString();
        java.lang.String str12 = planType8.getName();
        java.lang.Class<?> cls13 = planType8.getPlanClass();
        boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType8);
        java.lang.String str15 = planType8.toString();
        planType8.setName("hi!:-1:100");
        byte[] byte_array18 = planType8.getChildren();
        planType8.addChild((byte) 0);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:-1" + "'", str11.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNull(cls13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!:-1" + "'", str15.equals("hi!:-1"));
        org.junit.Assert.assertNull(byte_array18);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test405");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        io.github.agentsoz.jill.struct.PlanType planType3 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType3.addChild((byte) 1);
        planType3.addParent((byte) 10);
        planType3.addParent((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType3.setBody(method10);
        boolean b12 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType3);
        io.github.agentsoz.jill.struct.PlanType planType14 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType14.addChild((byte) 1);
        planType14.addParent((byte) 10);
        planType14.addParent((byte) 1);
        int i21 = planType14.getId();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType14);
        int i23 = planType14.getId();
        planType14.addChild((byte) 10);
        java.lang.String str26 = planType14.getName();
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test406");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        byte[] byte_array6 = planType1.getChildren();
        planType1.addParent((byte) 10);
        planType1.setId((int) (byte) 10);
        byte[] byte_array11 = planType1.getChildren();
        java.lang.Class<?> cls12 = planType1.getPlanClass();
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNull(cls12);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test407");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        java.lang.reflect.Method method13 = planType1.getContext();
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        planType15.addParent((byte) 10);
        planType15.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType23 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType23.addChild((byte) 1);
        planType23.addParent((byte) 10);
        java.lang.reflect.Method method28 = planType23.getBody();
        java.lang.reflect.Method method29 = planType23.getBody();
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType15, (io.github.agentsoz.jill.struct.AObject) planType23);
        io.github.agentsoz.jill.struct.PlanType planType32 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array33 = planType32.getParents();
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType15, (io.github.agentsoz.jill.struct.AObject) planType32);
        planType32.setName(":1");
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType32);
        java.lang.Class<?> cls38 = planType1.getPlanClass();
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(byte_array33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(cls38);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test408");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        int i8 = planType1.getId();
        planType1.addParent((byte) 10);
        java.lang.Class<?> cls11 = planType1.getPlanClass();
        java.lang.reflect.Method method12 = null;
        planType1.setContext(method12);
        java.lang.String str14 = planType1.toString();
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(cls11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:-1" + "'", str14.equals("hi!:-1"));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test409");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = planType1.getContext();
        java.lang.reflect.Method method6 = null;
        planType1.setContext(method6);
        java.lang.String str8 = planType1.getName();
        planType1.setName("hi!:-1:100");
        java.lang.String str11 = planType1.getName();
        java.lang.reflect.Method method12 = planType1.getContext();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:-1:100" + "'", str11.equals("hi!:-1:100"));
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test410");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setBody(method3);
        java.lang.reflect.Method method5 = planType1.getBody();
        java.lang.String str6 = planType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test411");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("hi!:-1");
        byte[] byte_array9 = planType1.getChildren();
        java.lang.reflect.Method method10 = null;
        planType1.setBody(method10);
        java.lang.String str12 = planType1.getName();
        java.lang.reflect.Method method13 = null;
        planType1.setContext(method13);
        planType1.addChild((byte) -1);
        byte[] byte_array17 = planType1.getParents();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertNull(byte_array17);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test412");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.String str4 = planType1.toString();
        java.lang.String str5 = planType1.getName();
        java.lang.reflect.Method method6 = null;
        planType1.setContext(method6);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        java.lang.reflect.Method method12 = null;
        planType9.setContext(method12);
        java.lang.String str14 = planType9.toString();
        planType9.setName("");
        byte[] byte_array17 = planType9.getChildren();
        planType9.setId((int) (byte) 100);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        byte[] byte_array21 = planType1.getParents();
        java.lang.Class<?> cls22 = planType1.getPlanClass();
        byte[] byte_array23 = planType1.getChildren();
        byte[] byte_array24 = planType1.getParents();
        byte[] byte_array26 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array24, (int) '#');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:-1" + "'", str14.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(byte_array21);
        org.junit.Assert.assertNull(cls22);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertNotNull(byte_array24);
        org.junit.Assert.assertNotNull(byte_array26);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test413");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        java.lang.reflect.Method method21 = null;
        planType1.setContext(method21);
        java.lang.reflect.Method method23 = null;
        planType1.setBody(method23);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test414");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("");
        byte[] byte_array9 = planType1.getChildren();
        planType1.setId((int) (byte) 100);
        planType1.addChild((byte) 0);
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        planType15.addParent((byte) 10);
        planType15.setId(1);
        planType15.addParent((byte) 10);
        planType15.addParent((byte) 10);
        byte[] byte_array26 = planType15.getChildren();
        byte[] byte_array27 = planType15.getParents();
        planType15.addParent((byte) 0);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType15);
        planType1.addParent((byte) 1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array26);
        org.junit.Assert.assertNotNull(byte_array27);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test415");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.String str9 = planType1.toString();
        planType1.setId((int) '4');
        planType1.setId((int) (byte) 1);
        planType1.setId((-1));
        java.lang.String str16 = planType1.toString();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!:-1" + "'", str16.equals("hi!:-1"));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test416");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        java.lang.reflect.Method method17 = planType1.getContext();
        byte[] byte_array18 = planType1.getParents();
        java.lang.String str19 = planType1.getName();
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(byte_array18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test417");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        planType1.setName("hi!");
        java.lang.Class<?> cls11 = planType1.getPlanClass();
        planType1.addChild((byte) -1);
        java.lang.Class<?> cls14 = planType1.getPlanClass();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(cls11);
        org.junit.Assert.assertNull(cls14);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test418");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = planType1.getContext();
        java.lang.reflect.Method method9 = planType1.getBody();
        planType1.setId((int) ' ');
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test419");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.String str9 = planType1.toString();
        java.lang.reflect.Method method10 = planType1.getBody();
        java.lang.reflect.Method method11 = planType1.getBody();
        java.lang.String str12 = planType1.toString();
        java.lang.reflect.Method method13 = planType1.getContext();
        planType1.setId((int) (short) 100);
        planType1.setName("hi!:1");
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:-1" + "'", str9.equals("hi!:-1"));
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test420");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        java.lang.reflect.Method method3 = planType1.getContext();
        byte[] byte_array4 = planType1.getChildren();
        java.lang.reflect.Method method5 = planType1.getContext();
        byte[] byte_array6 = planType1.getParents();
        byte[] byte_array7 = planType1.getParents();
        java.lang.reflect.Method method8 = planType1.getBody();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test421");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("");
        planType1.setName("hi!:1");
        byte[] byte_array4 = planType1.getParents();
        java.lang.String str5 = planType1.toString();
        java.lang.reflect.Method method6 = planType1.getContext();
        java.lang.reflect.Method method7 = null;
        planType1.setContext(method7);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:1:-1" + "'", str5.equals("hi!:1:-1"));
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test422");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.addParent((byte) 0);
        java.lang.Class<?> cls8 = planType1.getPlanClass();
        java.lang.String str9 = planType1.toString();
        int i10 = planType1.getId();
        java.lang.reflect.Method method11 = null;
        planType1.setBody(method11);
        org.junit.Assert.assertNull(cls8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:-1" + "'", str9.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i10 == (-1));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test423");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType17.setContext(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        planType17.setName("hi!:-1");
        int i25 = planType17.getId();
        byte[] byte_array26 = planType17.getParents();
        java.lang.reflect.Method method27 = null;
        planType17.setContext(method27);
        java.lang.reflect.Method method29 = null;
        planType17.setBody(method29);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertNull(byte_array26);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test424");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.String str9 = planType1.toString();
        java.lang.reflect.Method method10 = planType1.getBody();
        planType1.addChild((byte) -1);
        planType1.addParent((byte) -1);
        java.lang.Class<?> cls15 = planType1.getPlanClass();
        planType1.setName("hi!:-1");
        byte[] byte_array18 = planType1.getChildren();
        java.lang.String str19 = planType1.getName();
        byte[] byte_array20 = planType1.getParents();
        byte[] byte_array22 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array20, (int) (short) 1);
        byte[] byte_array24 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array20, 0);
        byte[] byte_array26 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array24, 10);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(cls15);
        org.junit.Assert.assertNotNull(byte_array18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array20);
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertNotNull(byte_array24);
        org.junit.Assert.assertNotNull(byte_array26);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test425");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setName("hi!:-1");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test426");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        byte[] byte_array13 = planType1.getParents();
        planType1.addChild((byte) 0);
        java.lang.Class<?> cls16 = planType1.getPlanClass();
        java.lang.String str17 = planType1.toString();
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNull(cls16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!:1" + "'", str17.equals("hi!:1"));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test427");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = planType1.getContext();
        java.lang.reflect.Method method6 = null;
        planType1.setContext(method6);
        java.lang.String str8 = planType1.getName();
        java.lang.Class<?> cls9 = planType1.getPlanClass();
        planType1.addParent((byte) 10);
        planType1.setName("hi!:-1:1");
        java.lang.reflect.Method method14 = null;
        planType1.setBody(method14);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(cls9);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test428");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.String str9 = planType1.toString();
        java.lang.reflect.Method method10 = planType1.getBody();
        planType1.addChild((byte) -1);
        planType1.addParent((byte) 1);
        planType1.addParent((byte) 1);
        java.lang.reflect.Method method17 = planType1.getContext();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test429");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        int i4 = planType1.getId();
        io.github.agentsoz.jill.struct.PlanType planType6 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType6.addChild((byte) 1);
        planType6.addParent((byte) 10);
        planType6.setId(1);
        java.lang.reflect.Method method13 = planType6.getBody();
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        planType15.addParent((byte) 10);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType6, (io.github.agentsoz.jill.struct.AObject) planType15);
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType6);
        java.lang.reflect.Method method22 = null;
        planType1.setContext(method22);
        java.lang.reflect.Method method24 = null;
        planType1.setBody(method24);
        java.lang.reflect.Method method26 = null;
        planType1.setContext(method26);
        planType1.addChild((byte) -1);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test430");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        java.lang.String str12 = planType1.toString();
        java.lang.String str13 = planType1.getName();
        java.lang.String str14 = planType1.toString();
        java.lang.String str15 = planType1.toString();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:1" + "'", str14.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!:1" + "'", str15.equals("hi!:1"));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test431");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = planType1.getContext();
        java.lang.Class<?> cls6 = planType1.getPlanClass();
        planType1.setId((-1));
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(cls6);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test432");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("");
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        java.lang.reflect.Method method15 = planType10.getBody();
        planType10.setId((int) '4');
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType20 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array21 = planType20.getChildren();
        java.lang.reflect.Method method22 = null;
        planType20.setContext(method22);
        java.lang.reflect.Method method24 = planType20.getContext();
        java.lang.Class<?> cls25 = planType20.getPlanClass();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType20);
        byte[] byte_array27 = planType20.getParents();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(cls25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(byte_array27);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test433");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        java.lang.reflect.Method method3 = planType1.getContext();
        java.lang.String str4 = planType1.getName();
        java.lang.String str5 = planType1.toString();
        byte[] byte_array6 = planType1.getChildren();
        int i7 = planType1.getId();
        planType1.setName(":-1:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue(i7 == (-1));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test434");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        planType1.addParent((byte) -1);
        java.lang.String str10 = planType1.toString();
        io.github.agentsoz.jill.struct.PlanType planType12 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType12.addChild((byte) 1);
        planType12.addParent((byte) 10);
        planType12.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType20 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType20.addChild((byte) 1);
        planType20.addParent((byte) 10);
        java.lang.reflect.Method method25 = planType20.getBody();
        java.lang.reflect.Method method26 = planType20.getBody();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType12, (io.github.agentsoz.jill.struct.AObject) planType20);
        java.lang.reflect.Method method28 = null;
        planType12.setBody(method28);
        planType12.setName("");
        byte[] byte_array32 = planType12.getChildren();
        java.lang.reflect.Method method33 = planType12.getContext();
        java.lang.reflect.Method method34 = planType12.getContext();
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType12);
        int i36 = planType1.getId();
        java.lang.reflect.Method method37 = null;
        planType1.setContext(method37);
        java.lang.reflect.Method method39 = null;
        planType1.setContext(method39);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == (-1));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test435");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.setName("hi!:-1");
        int i10 = planType1.getId();
        int i11 = planType1.getId();
        planType1.addParent((byte) 10);
        planType1.setId((int) (byte) 100);
        int i16 = planType1.getId();
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i16 == 100);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test436");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        java.lang.reflect.Method method3 = planType1.getContext();
        java.lang.String str4 = planType1.getName();
        io.github.agentsoz.jill.struct.PlanType planType6 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array7 = planType6.getChildren();
        java.lang.reflect.Method method8 = null;
        planType6.setContext(method8);
        java.lang.reflect.Method method10 = null;
        planType6.setContext(method10);
        int i12 = planType6.getId();
        int i13 = planType6.getId();
        byte[] byte_array14 = planType6.getParents();
        io.github.agentsoz.jill.struct.PlanType planType16 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType16.addChild((byte) 1);
        byte[] byte_array19 = planType16.getParents();
        java.lang.reflect.Method method20 = null;
        planType16.setBody(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType6, (io.github.agentsoz.jill.struct.AObject) planType16);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType16);
        io.github.agentsoz.jill.struct.PlanType planType25 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType25.addChild((byte) 1);
        planType25.addParent((byte) 10);
        planType25.addParent((byte) 1);
        byte[] byte_array32 = planType25.getParents();
        java.lang.String str33 = planType25.toString();
        java.lang.reflect.Method method34 = planType25.getBody();
        java.lang.reflect.Method method35 = planType25.getBody();
        java.lang.reflect.Method method36 = planType25.getContext();
        int i37 = planType25.getId();
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType16, (io.github.agentsoz.jill.struct.AObject) planType25);
        java.lang.reflect.Method method39 = null;
        planType16.setContext(method39);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!:-1" + "'", str33.equals("hi!:-1"));
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNull(method35);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertTrue(i37 == (-1));
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test437");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        java.lang.reflect.Method method10 = planType1.getContext();
        planType1.setName("");
        byte[] byte_array13 = planType1.getParents();
        java.lang.Class<?> cls14 = planType1.getPlanClass();
        java.lang.String str15 = planType1.toString();
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNull(cls14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ":1" + "'", str15.equals(":1"));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test438");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = null;
        planType1.setContext(method5);
        java.lang.reflect.Method method7 = null;
        planType1.setContext(method7);
        java.lang.String str9 = planType1.getName();
        planType1.setName("hi!:-1:100");
        planType1.addChild((byte) -1);
        planType1.addChild((byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test439");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        io.github.agentsoz.jill.struct.PlanType planType7 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType7.addChild((byte) 1);
        planType7.addParent((byte) 10);
        planType7.setId(1);
        planType7.addChild((byte) 1);
        java.lang.reflect.Method method16 = null;
        planType7.setContext(method16);
        java.lang.String str18 = planType7.toString();
        io.github.agentsoz.jill.struct.PlanType planType20 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType20.addChild((byte) 1);
        planType20.addParent((byte) 10);
        planType20.setId(1);
        planType20.addParent((byte) 10);
        planType20.addParent((byte) 10);
        planType20.addParent((byte) 10);
        java.lang.String str33 = planType20.toString();
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType7, (io.github.agentsoz.jill.struct.AObject) planType20);
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType20);
        java.lang.String str36 = planType20.getName();
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!:1" + "'", str18.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!:1" + "'", str33.equals("hi!:1"));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test440");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        java.lang.reflect.Method method8 = planType1.getContext();
        planType1.setId((int) (byte) -1);
        planType1.addChild((byte) 0);
        planType1.addChild((byte) 0);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test441");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.reflect.Method method4 = null;
        planType1.setBody(method4);
        int i6 = planType1.getId();
        planType1.addChild((byte) -1);
        java.lang.reflect.Method method9 = planType1.getBody();
        java.lang.Class<?> cls10 = planType1.getPlanClass();
        java.lang.String str11 = planType1.getName();
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(cls10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test442");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        byte[] byte_array3 = planType1.getParents();
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.reflect.Method method6 = planType1.getContext();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test443");
        io.github.agentsoz.jill.struct.AObject aObject0 = null;
        io.github.agentsoz.jill.struct.PlanType planType2 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType2.addChild((byte) 1);
        planType2.addParent((byte) 10);
        planType2.setId(1);
        java.lang.reflect.Method method9 = planType2.getBody();
        int i10 = planType2.getId();
        java.lang.String str11 = planType2.toString();
        java.lang.Class<?> cls12 = planType2.getPlanClass();
        byte[] byte_array13 = planType2.getParents();
        try {
            boolean b14 = io.github.agentsoz.jill.struct.AObject.isNameEqual(aObject0, (io.github.agentsoz.jill.struct.AObject) planType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:1" + "'", str11.equals("hi!:1"));
        org.junit.Assert.assertNull(cls12);
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test444");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        java.lang.reflect.Method method13 = planType1.getContext();
        planType1.setId(100);
        planType1.addParent((byte) 0);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test445");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        java.lang.String str12 = planType1.toString();
        io.github.agentsoz.jill.struct.PlanType planType14 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType14.addChild((byte) 1);
        planType14.addParent((byte) 10);
        planType14.setId(1);
        planType14.addParent((byte) 10);
        planType14.addParent((byte) 10);
        planType14.addParent((byte) 10);
        java.lang.String str27 = planType14.toString();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType14);
        io.github.agentsoz.jill.struct.PlanType planType30 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array31 = planType30.getChildren();
        java.lang.reflect.Method method32 = null;
        planType30.setContext(method32);
        planType30.setId(100);
        planType30.setName("hi!:-1");
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType14, (io.github.agentsoz.jill.struct.AObject) planType30);
        java.lang.String str39 = planType30.toString();
        planType30.addParent((byte) 10);
        java.lang.reflect.Method method42 = null;
        planType30.setBody(method42);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:1" + "'", str27.equals("hi!:1"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!:-1:100" + "'", str39.equals("hi!:-1:100"));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test446");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        java.lang.String str14 = planType1.toString();
        planType1.setName("hi!");
        byte[] byte_array17 = planType1.getChildren();
        java.lang.String str18 = planType1.toString();
        java.lang.String str19 = planType1.getName();
        java.lang.reflect.Method method20 = null;
        planType1.setContext(method20);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:1" + "'", str14.equals("hi!:1"));
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!:1" + "'", str18.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test447");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        java.lang.String str12 = planType1.toString();
        java.lang.String str13 = planType1.getName();
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addParent((byte) 10);
        int i18 = planType15.getId();
        io.github.agentsoz.jill.struct.PlanType planType20 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType20.addChild((byte) 1);
        planType20.addParent((byte) 10);
        planType20.setId(1);
        java.lang.reflect.Method method27 = planType20.getBody();
        io.github.agentsoz.jill.struct.PlanType planType29 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType29.addChild((byte) 1);
        planType29.addParent((byte) 10);
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType20, (io.github.agentsoz.jill.struct.AObject) planType29);
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType15, (io.github.agentsoz.jill.struct.AObject) planType20);
        byte[] byte_array36 = planType20.getChildren();
        boolean b37 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType20);
        io.github.agentsoz.jill.struct.PlanType planType39 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType39.addChild((byte) 1);
        planType39.addParent((byte) 10);
        planType39.setId(1);
        byte[] byte_array46 = planType39.getParents();
        java.lang.reflect.Method method47 = planType39.getContext();
        io.github.agentsoz.jill.struct.PlanType planType49 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType49.addParent((byte) 10);
        int i52 = planType49.getId();
        io.github.agentsoz.jill.struct.PlanType planType54 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType54.addChild((byte) 1);
        planType54.addParent((byte) 10);
        planType54.setId(1);
        java.lang.reflect.Method method61 = planType54.getBody();
        io.github.agentsoz.jill.struct.PlanType planType63 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType63.addChild((byte) 1);
        planType63.addParent((byte) 10);
        boolean b68 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType54, (io.github.agentsoz.jill.struct.AObject) planType63);
        boolean b69 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType49, (io.github.agentsoz.jill.struct.AObject) planType54);
        java.lang.reflect.Method method70 = planType49.getBody();
        boolean b71 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType39, (io.github.agentsoz.jill.struct.AObject) planType49);
        io.github.agentsoz.jill.struct.PlanType planType73 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array74 = planType73.getChildren();
        java.lang.reflect.Method method75 = null;
        planType73.setContext(method75);
        java.lang.reflect.Method method77 = null;
        planType73.setContext(method77);
        int i79 = planType73.getId();
        int i80 = planType73.getId();
        java.lang.reflect.Method method81 = null;
        planType73.setBody(method81);
        boolean b83 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType49, (io.github.agentsoz.jill.struct.AObject) planType73);
        boolean b84 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType20, (io.github.agentsoz.jill.struct.AObject) planType73);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(byte_array36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(byte_array46);
        org.junit.Assert.assertNull(method47);
        org.junit.Assert.assertTrue(i52 == (-1));
        org.junit.Assert.assertNull(method61);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNull(method70);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNull(byte_array74);
        org.junit.Assert.assertTrue(i79 == (-1));
        org.junit.Assert.assertTrue(i80 == (-1));
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(b84 == true);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test448");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType17.setContext(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        java.lang.String str23 = planType17.getName();
        planType17.addChild((byte) 10);
        planType17.setName("hi!");
        java.lang.reflect.Method method28 = planType17.getBody();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNull(method28);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test449");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        planType1.addChild((byte) 100);
        java.lang.String str12 = planType1.toString();
        java.lang.Class<?> cls13 = planType1.getPlanClass();
        planType1.addParent((byte) 10);
        planType1.setName("hi!:100");
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertNull(cls13);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test450");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        io.github.agentsoz.jill.struct.PlanType planType11 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType11.addChild((byte) 1);
        planType11.addParent((byte) 10);
        planType11.setId(1);
        planType11.addChild((byte) 1);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType11);
        byte[] byte_array21 = planType11.getParents();
        planType11.addChild((byte) 1);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(byte_array21);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test451");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.String str9 = planType1.toString();
        java.lang.reflect.Method method10 = planType1.getBody();
        planType1.addParent((byte) 1);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test452");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        java.lang.reflect.Method method3 = planType1.getContext();
        java.lang.String str4 = planType1.getName();
        io.github.agentsoz.jill.struct.PlanType planType6 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array7 = planType6.getChildren();
        java.lang.reflect.Method method8 = null;
        planType6.setContext(method8);
        java.lang.reflect.Method method10 = null;
        planType6.setContext(method10);
        int i12 = planType6.getId();
        int i13 = planType6.getId();
        byte[] byte_array14 = planType6.getParents();
        io.github.agentsoz.jill.struct.PlanType planType16 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType16.addChild((byte) 1);
        byte[] byte_array19 = planType16.getParents();
        java.lang.reflect.Method method20 = null;
        planType16.setBody(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType6, (io.github.agentsoz.jill.struct.AObject) planType16);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType16);
        java.lang.reflect.Method method24 = planType16.getContext();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test453");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        java.lang.String str12 = planType1.toString();
        planType1.addChild((byte) -1);
        java.lang.String str15 = planType1.getName();
        java.lang.reflect.Method method16 = null;
        planType1.setContext(method16);
        java.lang.Class<?> cls18 = planType1.getPlanClass();
        java.lang.reflect.Method method19 = planType1.getBody();
        java.lang.String str20 = planType1.getName();
        planType1.setName(":-1:-1");
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNull(cls18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test454");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        planType18.addParent((byte) 1);
        int i23 = planType18.getId();
        planType18.addChild((byte) 100);
        io.github.agentsoz.jill.struct.PlanType planType27 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array28 = planType27.getChildren();
        java.lang.reflect.Method method29 = null;
        planType27.setContext(method29);
        java.lang.reflect.Method method31 = null;
        planType27.setContext(method31);
        int i33 = planType27.getId();
        int i34 = planType27.getId();
        java.lang.Class<?> cls35 = planType27.getPlanClass();
        boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType18, (io.github.agentsoz.jill.struct.AObject) planType27);
        java.lang.Class<?> cls37 = planType18.getPlanClass();
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(i33 == (-1));
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertNull(cls35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(cls37);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test455");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        int i4 = planType1.getId();
        java.lang.reflect.Method method5 = null;
        planType1.setContext(method5);
        java.lang.Class<?> cls7 = planType1.getPlanClass();
        planType1.setId((int) (short) 0);
        io.github.agentsoz.jill.struct.PlanType planType11 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType11.addChild((byte) 1);
        planType11.addParent((byte) 10);
        planType11.setId(1);
        io.github.agentsoz.jill.struct.PlanType planType19 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType19.addChild((byte) 1);
        java.lang.reflect.Method method22 = null;
        planType19.setContext(method22);
        planType19.setName("hi!");
        java.lang.reflect.Method method26 = null;
        planType19.setContext(method26);
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType11, (io.github.agentsoz.jill.struct.AObject) planType19);
        int i29 = planType11.getId();
        java.lang.reflect.Method method30 = null;
        planType11.setBody(method30);
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType11);
        io.github.agentsoz.jill.struct.PlanType planType34 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType34.addChild((byte) 1);
        byte[] byte_array37 = planType34.getParents();
        java.lang.reflect.Method method38 = null;
        planType34.setContext(method38);
        java.lang.String str40 = planType34.toString();
        java.lang.String str41 = planType34.toString();
        boolean b42 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType11, (io.github.agentsoz.jill.struct.AObject) planType34);
        byte[] byte_array43 = planType34.getChildren();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(cls7);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(byte_array37);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!:-1" + "'", str40.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!:-1" + "'", str41.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(byte_array43);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test456");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        planType1.setId((int) (short) 1);
        planType1.addChild((byte) -1);
        byte[] byte_array25 = planType1.getChildren();
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(byte_array25);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test457");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        java.lang.reflect.Method method12 = null;
        planType9.setContext(method12);
        planType9.setName("hi!");
        java.lang.reflect.Method method16 = null;
        planType9.setContext(method16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        planType9.setName("hi!:-1");
        byte[] byte_array21 = planType9.getParents();
        java.lang.reflect.Method method22 = null;
        planType9.setContext(method22);
        planType9.setName("hi!:1");
        byte[] byte_array26 = planType9.getParents();
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(byte_array21);
        org.junit.Assert.assertNull(byte_array26);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test458");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType17.setContext(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        java.lang.String str23 = planType17.getName();
        java.lang.reflect.Method method24 = planType17.getContext();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test459");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        java.lang.reflect.Method method3 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType5 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array6 = planType5.getChildren();
        java.lang.reflect.Method method7 = null;
        planType5.setContext(method7);
        java.lang.reflect.Method method9 = planType5.getContext();
        java.lang.Class<?> cls10 = planType5.getPlanClass();
        java.lang.reflect.Method method11 = null;
        planType5.setBody(method11);
        boolean b13 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType5);
        java.lang.reflect.Method method14 = planType5.getContext();
        java.lang.reflect.Method method15 = null;
        planType5.setContext(method15);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(cls10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test460");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        java.lang.String str12 = planType1.toString();
        java.lang.String str13 = planType1.getName();
        java.lang.reflect.Method method14 = null;
        planType1.setBody(method14);
        byte[] byte_array16 = planType1.getChildren();
        byte[] byte_array17 = planType1.getParents();
        io.github.agentsoz.jill.struct.PlanType planType19 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType19.addParent((byte) 10);
        int i22 = planType19.getId();
        io.github.agentsoz.jill.struct.PlanType planType24 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType24.addChild((byte) 1);
        planType24.addParent((byte) 10);
        planType24.setId(1);
        java.lang.reflect.Method method31 = planType24.getBody();
        io.github.agentsoz.jill.struct.PlanType planType33 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType33.addChild((byte) 1);
        planType33.addParent((byte) 10);
        boolean b38 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType24, (io.github.agentsoz.jill.struct.AObject) planType33);
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType19, (io.github.agentsoz.jill.struct.AObject) planType24);
        java.lang.reflect.Method method40 = null;
        planType19.setContext(method40);
        java.lang.reflect.Method method42 = null;
        planType19.setBody(method42);
        java.lang.String str44 = planType19.getName();
        java.lang.reflect.Method method45 = null;
        planType19.setBody(method45);
        boolean b47 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType19);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        org.junit.Assert.assertTrue(b47 == true);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test461");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        planType9.setId(1);
        planType9.setName("hi!:-1");
        int i18 = planType9.getId();
        int i19 = planType9.getId();
        java.lang.reflect.Method method20 = null;
        planType9.setBody(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        int i23 = planType1.getId();
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 1);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test462");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        int i8 = planType1.getId();
        java.lang.String str9 = planType1.getName();
        planType1.addParent((byte) 0);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test463");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        planType1.addChild((byte) 100);
        java.lang.String str14 = planType1.toString();
        java.lang.reflect.Method method15 = null;
        planType1.setBody(method15);
        java.lang.reflect.Method method17 = planType1.getBody();
        planType1.setId((int) (short) 1);
        int i20 = planType1.getId();
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:1" + "'", str14.equals("hi!:1"));
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue(i20 == 1);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test464");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        java.lang.reflect.Method method3 = planType1.getContext();
        java.lang.String str4 = planType1.getName();
        io.github.agentsoz.jill.struct.PlanType planType6 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array7 = planType6.getChildren();
        java.lang.reflect.Method method8 = null;
        planType6.setContext(method8);
        java.lang.reflect.Method method10 = null;
        planType6.setContext(method10);
        int i12 = planType6.getId();
        int i13 = planType6.getId();
        byte[] byte_array14 = planType6.getParents();
        io.github.agentsoz.jill.struct.PlanType planType16 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType16.addChild((byte) 1);
        byte[] byte_array19 = planType16.getParents();
        java.lang.reflect.Method method20 = null;
        planType16.setBody(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType6, (io.github.agentsoz.jill.struct.AObject) planType16);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType16);
        java.lang.String str24 = planType1.getName();
        io.github.agentsoz.jill.struct.PlanType planType26 = new io.github.agentsoz.jill.struct.PlanType("hi!:1");
        java.lang.reflect.Method method27 = null;
        planType26.setContext(method27);
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType26);
        byte[] byte_array30 = planType26.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(byte_array30);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test465");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        planType1.addParent((byte) -1);
        java.lang.String str10 = planType1.toString();
        io.github.agentsoz.jill.struct.PlanType planType12 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType12.addChild((byte) 1);
        planType12.addParent((byte) 10);
        planType12.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType20 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType20.addChild((byte) 1);
        planType20.addParent((byte) 10);
        java.lang.reflect.Method method25 = planType20.getBody();
        java.lang.reflect.Method method26 = planType20.getBody();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType12, (io.github.agentsoz.jill.struct.AObject) planType20);
        java.lang.reflect.Method method28 = null;
        planType12.setBody(method28);
        planType12.setName("");
        byte[] byte_array32 = planType12.getChildren();
        java.lang.reflect.Method method33 = planType12.getContext();
        java.lang.reflect.Method method34 = planType12.getContext();
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType12);
        byte[] byte_array36 = planType1.getParents();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(byte_array36);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test466");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.addParent((byte) 1);
        java.lang.String str9 = planType1.getName();
        java.lang.reflect.Method method10 = planType1.getContext();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test467");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        planType1.addChild((byte) 100);
        java.lang.String str12 = planType1.toString();
        planType1.setId((int) 'a');
        planType1.addParent((byte) 100);
        planType1.addChild((byte) 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test468");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.reflect.Method method4 = null;
        planType1.setBody(method4);
        java.lang.reflect.Method method6 = null;
        planType1.setContext(method6);
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        java.lang.String str10 = planType1.toString();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test469");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        planType1.addChild((byte) 100);
        java.lang.String str12 = planType1.toString();
        java.lang.Class<?> cls13 = planType1.getPlanClass();
        planType1.addParent((byte) 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertNull(cls13);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test470");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.String str9 = planType1.toString();
        planType1.setId((int) '4');
        planType1.setId((int) (byte) 1);
        planType1.setId((-1));
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addParent((byte) 10);
        int i20 = planType17.getId();
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        java.lang.Class<?> cls22 = planType17.getPlanClass();
        byte[] byte_array23 = planType17.getChildren();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(cls22);
        org.junit.Assert.assertNull(byte_array23);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test471");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        java.lang.String str12 = planType1.toString();
        planType1.addChild((byte) -1);
        java.lang.String str15 = planType1.getName();
        java.lang.reflect.Method method16 = null;
        planType1.setContext(method16);
        java.lang.Class<?> cls18 = planType1.getPlanClass();
        java.lang.String str19 = planType1.getName();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNull(cls18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test472");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.reflect.Method method9 = planType1.getContext();
        java.lang.reflect.Method method10 = planType1.getBody();
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test473");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.String str9 = planType1.toString();
        java.lang.reflect.Method method10 = planType1.getBody();
        java.lang.reflect.Method method11 = planType1.getContext();
        planType1.setName("hi!:-1");
        java.lang.reflect.Method method14 = null;
        planType1.setContext(method14);
        byte[] byte_array16 = planType1.getParents();
        planType1.setId((int) (byte) 100);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:-1" + "'", str9.equals("hi!:-1"));
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test474");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        planType1.setName("");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method16 = planType1.getContext();
        java.lang.String str17 = planType1.toString();
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":1" + "'", str17.equals(":1"));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test475");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        planType1.addParent((byte) 100);
        java.lang.String str10 = planType1.toString();
        java.lang.String str11 = planType1.toString();
        java.lang.reflect.Method method12 = null;
        planType1.setBody(method12);
        byte[] byte_array14 = planType1.getParents();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:-1" + "'", str11.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array14);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test476");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addChild((byte) 0);
        planType1.setName("hi!");
        java.lang.reflect.Method method14 = null;
        planType1.setBody(method14);
        java.lang.reflect.Method method16 = null;
        planType1.setContext(method16);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test477");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        planType18.addParent((byte) 1);
        java.lang.reflect.Method method23 = null;
        planType18.setContext(method23);
        byte[] byte_array25 = planType18.getParents();
        planType18.addParent((byte) -1);
        byte[] byte_array28 = planType18.getParents();
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(byte_array25);
        org.junit.Assert.assertNotNull(byte_array28);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test478");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.reflect.Method method9 = planType1.getContext();
        java.lang.String str10 = planType1.getName();
        java.lang.String str11 = planType1.toString();
        io.github.agentsoz.jill.struct.PlanType planType13 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType13.addChild((byte) 1);
        planType13.addParent((byte) 10);
        planType13.setId(1);
        byte[] byte_array20 = planType13.getParents();
        java.lang.reflect.Method method21 = planType13.getBody();
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType13);
        int i23 = planType1.getId();
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:1" + "'", str11.equals("hi!:1"));
        org.junit.Assert.assertNotNull(byte_array20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(i23 == 1);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test479");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName(":-1");
        java.lang.Class<?> cls9 = planType1.getPlanClass();
        java.lang.String str10 = planType1.toString();
        java.lang.reflect.Method method11 = null;
        planType1.setContext(method11);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ":-1:-1" + "'", str10.equals(":-1:-1"));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test480");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName(":-1");
        int i9 = planType1.getId();
        io.github.agentsoz.jill.struct.PlanType planType11 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array12 = planType11.getParents();
        java.lang.reflect.Method method13 = planType11.getContext();
        byte[] byte_array14 = planType11.getChildren();
        java.lang.reflect.Method method15 = planType11.getContext();
        planType11.setName("hi!:-1:100");
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType11);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test481");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addChild((byte) 0);
        io.github.agentsoz.jill.struct.PlanType planType13 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType13.addChild((byte) 1);
        planType13.addParent((byte) 10);
        planType13.addParent((byte) 1);
        byte[] byte_array20 = planType13.getParents();
        java.lang.String str21 = planType13.toString();
        java.lang.reflect.Method method22 = planType13.getBody();
        java.lang.reflect.Method method23 = planType13.getBody();
        java.lang.String str24 = planType13.toString();
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType13);
        planType1.setName("hi!:-1:-1");
        org.junit.Assert.assertNotNull(byte_array20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!:-1" + "'", str21.equals("hi!:-1"));
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!:-1" + "'", str24.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test482");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.String str3 = planType1.toString();
        planType1.setName("hi!:-1");
        planType1.setId((int) (short) 100);
        java.lang.String str8 = planType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!:-1" + "'", str3.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!:-1:100" + "'", str8.equals("hi!:-1:100"));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test483");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        io.github.agentsoz.jill.struct.PlanType planType11 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType11.addChild((byte) 1);
        planType11.addParent((byte) 10);
        planType11.setId(1);
        planType11.addChild((byte) 1);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType11);
        java.lang.reflect.Method method21 = planType11.getContext();
        planType11.addParent((byte) 1);
        java.lang.reflect.Method method24 = null;
        planType11.setContext(method24);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test484");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        io.github.agentsoz.jill.struct.PlanType planType22 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType22.addChild((byte) 1);
        planType22.addParent((byte) 10);
        planType22.addParent((byte) 1);
        byte[] byte_array29 = planType22.getParents();
        java.lang.String str30 = planType22.toString();
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType18, (io.github.agentsoz.jill.struct.AObject) planType22);
        java.lang.reflect.Method method32 = planType22.getBody();
        java.lang.reflect.Method method33 = planType22.getBody();
        planType22.setId(100);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(byte_array29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1" + "'", str30.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(method32);
        org.junit.Assert.assertNull(method33);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test485");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.setName("hi!");
        java.lang.String str6 = planType1.getName();
        java.lang.Class<?> cls7 = planType1.getPlanClass();
        planType1.setName("hi!:-1:-1");
        java.lang.reflect.Method method10 = planType1.getBody();
        int i11 = planType1.getId();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(cls7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue(i11 == (-1));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test486");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        int i4 = planType1.getId();
        io.github.agentsoz.jill.struct.PlanType planType6 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType6.addChild((byte) 1);
        planType6.addParent((byte) 10);
        planType6.setId(1);
        java.lang.reflect.Method method13 = planType6.getBody();
        io.github.agentsoz.jill.struct.PlanType planType15 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType15.addChild((byte) 1);
        planType15.addParent((byte) 10);
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType6, (io.github.agentsoz.jill.struct.AObject) planType15);
        boolean b21 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType6);
        byte[] byte_array22 = planType6.getChildren();
        java.lang.reflect.Method method23 = planType6.getContext();
        io.github.agentsoz.jill.struct.PlanType planType25 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType25.addChild((byte) 1);
        planType25.addParent((byte) 10);
        planType25.addParent((byte) 1);
        byte[] byte_array32 = planType25.getParents();
        java.lang.String str33 = planType25.toString();
        io.github.agentsoz.jill.struct.PlanType planType35 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType35.addChild((byte) 1);
        planType35.addParent((byte) 10);
        planType35.setId(1);
        planType35.addChild((byte) 1);
        java.lang.reflect.Method method44 = null;
        planType35.setContext(method44);
        java.lang.String str46 = planType35.toString();
        planType35.addChild((byte) -1);
        java.lang.String str49 = planType35.getName();
        byte[] byte_array50 = planType35.getChildren();
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType25, (io.github.agentsoz.jill.struct.AObject) planType35);
        int i52 = planType25.getId();
        java.lang.String str53 = planType25.getName();
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType6, (io.github.agentsoz.jill.struct.AObject) planType25);
        byte[] byte_array55 = planType6.getParents();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!:-1" + "'", str33.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!:1" + "'", str46.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(i52 == (-1));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(byte_array55);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test487");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.reflect.Method method9 = planType1.getContext();
        java.lang.String str10 = planType1.getName();
        byte[] byte_array11 = planType1.getChildren();
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array11, 1);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test488");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        byte[] byte_array9 = planType1.getChildren();
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, 1);
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, 10);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test489");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType17.setContext(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        java.lang.reflect.Method method23 = planType17.getContext();
        java.lang.String str24 = planType17.getName();
        byte[] byte_array25 = planType17.getParents();
        java.lang.String str26 = planType17.toString();
        java.lang.reflect.Method method27 = planType17.getContext();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:-1" + "'", str26.equals("hi!:-1"));
        org.junit.Assert.assertNull(method27);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test490");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        byte[] byte_array8 = planType1.getParents();
        byte[] byte_array10 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array8, 0);
        byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (int) (short) 1);
        try {
            byte[] byte_array14 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test491");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType17.setContext(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        java.lang.String str23 = planType17.getName();
        java.lang.reflect.Method method24 = planType17.getBody();
        java.lang.reflect.Method method25 = null;
        planType17.setContext(method25);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test492");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = null;
        planType1.setContext(method5);
        int i7 = planType1.getId();
        int i8 = planType1.getId();
        java.lang.reflect.Method method9 = null;
        planType1.setBody(method9);
        io.github.agentsoz.jill.struct.PlanType planType12 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType12.addChild((byte) 1);
        planType12.addParent((byte) 10);
        planType12.setId(1);
        io.github.agentsoz.jill.struct.PlanType planType20 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType20.addChild((byte) 1);
        java.lang.reflect.Method method23 = null;
        planType20.setContext(method23);
        planType20.setName("hi!");
        java.lang.reflect.Method method27 = null;
        planType20.setContext(method27);
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType12, (io.github.agentsoz.jill.struct.AObject) planType20);
        boolean b30 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType12);
        java.lang.reflect.Method method31 = null;
        planType1.setContext(method31);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test493");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        planType1.addParent((byte) 100);
        java.lang.String str10 = planType1.toString();
        java.lang.String str11 = planType1.toString();
        java.lang.reflect.Method method12 = planType1.getBody();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:-1" + "'", str11.equals("hi!:-1"));
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test494");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        java.lang.String str10 = planType1.toString();
        java.lang.reflect.Method method11 = null;
        planType1.setContext(method11);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test495");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        java.lang.reflect.Method method12 = null;
        planType9.setContext(method12);
        planType9.setName("hi!");
        java.lang.reflect.Method method16 = null;
        planType9.setContext(method16);
        boolean b18 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        planType9.setName("hi!:-1");
        java.lang.reflect.Method method21 = null;
        planType9.setContext(method21);
        io.github.agentsoz.jill.struct.PlanType planType24 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType24.addChild((byte) 1);
        planType24.addParent((byte) 10);
        planType24.setId(1);
        byte[] byte_array31 = planType24.getParents();
        java.lang.reflect.Method method32 = planType24.getContext();
        java.lang.String str33 = planType24.getName();
        java.lang.String str34 = planType24.toString();
        io.github.agentsoz.jill.struct.PlanType planType36 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType36.addChild((byte) 1);
        planType36.addParent((byte) 10);
        planType36.setId(1);
        byte[] byte_array43 = planType36.getParents();
        java.lang.reflect.Method method44 = planType36.getBody();
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType24, (io.github.agentsoz.jill.struct.AObject) planType36);
        boolean b46 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType9, (io.github.agentsoz.jill.struct.AObject) planType36);
        java.lang.Class<?> cls47 = planType9.getPlanClass();
        planType9.setName("hi!:-1:100");
        java.lang.reflect.Method method50 = null;
        planType9.setBody(method50);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(byte_array31);
        org.junit.Assert.assertNull(method32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!:1" + "'", str34.equals("hi!:1"));
        org.junit.Assert.assertNotNull(byte_array43);
        org.junit.Assert.assertNull(method44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(cls47);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test496");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.reflect.Method method9 = planType1.getContext();
        java.lang.String str10 = planType1.getName();
        byte[] byte_array11 = planType1.getChildren();
        byte[] byte_array12 = planType1.getParents();
        java.lang.String str13 = planType1.toString();
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!:1" + "'", str13.equals("hi!:1"));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test497");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        boolean b15 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType10);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addChild((byte) 1);
        java.lang.reflect.Method method20 = null;
        planType17.setContext(method20);
        boolean b22 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType17);
        java.lang.String str23 = planType17.getName();
        byte[] byte_array24 = planType17.getParents();
        planType17.addParent((byte) 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNull(byte_array24);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test498");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        io.github.agentsoz.jill.struct.PlanType planType9 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType9.addChild((byte) 1);
        planType9.addParent((byte) 10);
        java.lang.reflect.Method method14 = planType9.getBody();
        java.lang.reflect.Method method15 = planType9.getBody();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType9);
        io.github.agentsoz.jill.struct.PlanType planType18 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array19 = planType18.getParents();
        boolean b20 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType18);
        java.lang.String str21 = planType1.getName();
        java.lang.reflect.Method method22 = planType1.getContext();
        byte[] byte_array23 = planType1.getParents();
        java.lang.reflect.Method method24 = null;
        planType1.setBody(method24);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(byte_array23);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test499");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        java.lang.String str12 = planType1.toString();
        io.github.agentsoz.jill.struct.PlanType planType14 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType14.addChild((byte) 1);
        planType14.addParent((byte) 10);
        planType14.setId(1);
        planType14.addParent((byte) 10);
        planType14.addParent((byte) 10);
        planType14.addParent((byte) 10);
        java.lang.String str27 = planType14.toString();
        boolean b28 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType14);
        planType1.setName("hi!:1:-1");
        planType1.setId((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!:1" + "'", str27.equals("hi!:1"));
        org.junit.Assert.assertTrue(b28 == true);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest0.test500");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        java.lang.reflect.Method method6 = planType1.getBody();
        planType1.addChild((byte) 10);
        java.lang.String str9 = planType1.getName();
        planType1.addChild((byte) -1);
        planType1.setName("");
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }
}

