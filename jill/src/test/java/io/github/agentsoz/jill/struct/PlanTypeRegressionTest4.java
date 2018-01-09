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
public class PlanTypeRegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test001");
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
        java.lang.String str15 = planType1.toString();
        byte[] byte_array16 = planType1.getChildren();
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!:-1" + "'", str15.equals("hi!:-1"));
        org.junit.Assert.assertNull(byte_array16);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test002");
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
        int i38 = planType1.getId();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!:-1" + "'", str33.equals("hi!:-1"));
        org.junit.Assert.assertNull(cls34);
        org.junit.Assert.assertNull(byte_array35);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == (-1));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test003");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        byte[] byte_array6 = planType1.getChildren();
        planType1.addParent((byte) 10);
        planType1.setName(":1:-1");
        org.junit.Assert.assertNotNull(byte_array6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test004");
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
        java.lang.String str24 = planType1.getName();
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(byte_array23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test005");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        java.lang.reflect.Method method6 = planType1.getBody();
        planType1.setId((int) '4');
        java.lang.reflect.Method method9 = null;
        planType1.setContext(method9);
        java.lang.reflect.Method method11 = null;
        planType1.setBody(method11);
        io.github.agentsoz.jill.struct.PlanType planType14 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType14.addChild((byte) 1);
        planType14.addParent((byte) 10);
        planType14.setId(1);
        planType14.addChild((byte) 1);
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType14);
        planType14.addParent((byte) -1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test006");
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
        java.lang.String str26 = planType13.toString();
        java.lang.Class<?> cls27 = planType13.getPlanClass();
        org.junit.Assert.assertNotNull(byte_array20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!:-1" + "'", str21.equals("hi!:-1"));
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!:-1" + "'", str24.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:-1" + "'", str26.equals("hi!:-1"));
        org.junit.Assert.assertNull(cls27);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test007");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.setName("hi!:-1");
        int i10 = planType1.getId();
        int i11 = planType1.getId();
        planType1.addParent((byte) 10);
        java.lang.String str14 = planType1.getName();
        java.lang.reflect.Method method15 = planType1.getBody();
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:-1" + "'", str14.equals("hi!:-1"));
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test008");
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
        int i23 = planType1.getId();
        java.lang.reflect.Method method24 = planType1.getContext();
        java.lang.reflect.Method method25 = planType1.getBody();
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(method25);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test009");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        planType1.addChild((byte) 0);
        planType1.setName("hi!:52:-1");
        java.lang.String str9 = planType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:52:-1" + "'", str9.equals("hi!:52:-1"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test010");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        java.lang.reflect.Method method13 = null;
        planType1.setContext(method13);
        int i15 = planType1.getId();
        java.lang.reflect.Method method16 = null;
        planType1.setContext(method16);
        byte[] byte_array18 = planType1.getParents();
        java.lang.reflect.Method method19 = null;
        planType1.setBody(method19);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(byte_array18);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test011");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        planType1.setName("hi!");
        io.github.agentsoz.jill.struct.PlanType planType12 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType12.addChild((byte) 1);
        planType12.addParent((byte) 10);
        planType12.setId(1);
        planType12.addChild((byte) 1);
        java.lang.reflect.Method method21 = null;
        planType12.setContext(method21);
        java.lang.String str23 = planType12.toString();
        planType12.addChild((byte) -1);
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType12);
        planType12.setName("hi!:-1:1");
        byte[] byte_array29 = planType12.getChildren();
        java.lang.reflect.Method method30 = null;
        planType12.setContext(method30);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!:1" + "'", str23.equals("hi!:1"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(byte_array29);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test012");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = planType1.getContext();
        byte[] byte_array11 = planType1.getChildren();
        byte[] byte_array12 = planType1.getParents();
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test013");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.String str9 = planType1.toString();
        java.lang.reflect.Method method10 = planType1.getBody();
        java.lang.reflect.Method method11 = planType1.getBody();
        int i12 = planType1.getId();
        io.github.agentsoz.jill.struct.PlanType planType14 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType14.addChild((byte) 1);
        java.lang.reflect.Method method17 = null;
        planType14.setContext(method17);
        java.lang.String str19 = planType14.toString();
        planType14.setName("");
        int i22 = planType14.getId();
        java.lang.String str23 = planType14.toString();
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType14);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:-1" + "'", str9.equals("hi!:-1"));
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:-1" + "'", str19.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ":-1" + "'", str23.equals(":-1"));
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test014");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        byte[] byte_array6 = planType1.getChildren();
        java.lang.reflect.Method method7 = planType1.getBody();
        java.lang.reflect.Method method8 = planType1.getContext();
        java.lang.String str9 = planType1.getName();
        planType1.addChild((byte) 10);
        java.lang.reflect.Method method12 = planType1.getContext();
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test015");
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
        planType1.addChild((byte) 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(cls15);
        org.junit.Assert.assertNotNull(byte_array18);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test016");
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
        planType1.addParent((byte) 100);
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test017");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        java.lang.reflect.Method method2 = planType1.getContext();
        byte[] byte_array3 = planType1.getParents();
        int i4 = planType1.getId();
        byte[] byte_array5 = planType1.getChildren();
        planType1.addChild((byte) -1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(byte_array5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test018");
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
        io.github.agentsoz.jill.struct.PlanType planType41 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType41.addChild((byte) 1);
        planType41.addParent((byte) 10);
        planType41.setId(1);
        planType41.addChild((byte) 1);
        java.lang.reflect.Method method50 = null;
        planType41.setContext(method50);
        java.lang.String str52 = planType41.toString();
        planType41.addChild((byte) -1);
        java.lang.String str55 = planType41.getName();
        byte[] byte_array56 = planType41.getChildren();
        java.lang.Class<?> cls57 = planType41.getPlanClass();
        java.lang.reflect.Method method58 = null;
        planType41.setBody(method58);
        java.lang.reflect.Method method60 = planType41.getContext();
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType41);
        planType41.addParent((byte) 10);
        java.lang.reflect.Method method64 = null;
        planType41.setBody(method64);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(byte_array36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!:1" + "'", str52.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array56);
        org.junit.Assert.assertNull(cls57);
        org.junit.Assert.assertNull(method60);
        org.junit.Assert.assertTrue(b61 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test019");
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
        io.github.agentsoz.jill.struct.PlanType planType41 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType41.addChild((byte) 1);
        planType41.addParent((byte) 10);
        planType41.setId(1);
        planType41.addChild((byte) 1);
        java.lang.reflect.Method method50 = null;
        planType41.setContext(method50);
        java.lang.String str52 = planType41.toString();
        planType41.addChild((byte) -1);
        java.lang.String str55 = planType41.getName();
        byte[] byte_array56 = planType41.getChildren();
        java.lang.Class<?> cls57 = planType41.getPlanClass();
        java.lang.reflect.Method method58 = null;
        planType41.setBody(method58);
        java.lang.reflect.Method method60 = planType41.getContext();
        boolean b61 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType41);
        planType1.addChild((byte) 1);
        planType1.setName(":-1");
        byte[] byte_array66 = planType1.getChildren();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(byte_array36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!:1" + "'", str52.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array56);
        org.junit.Assert.assertNull(cls57);
        org.junit.Assert.assertNull(method60);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(byte_array66);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test020");
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
        byte[] byte_array31 = planType17.getChildren();
        planType17.addChild((byte) 100);
        java.lang.reflect.Method method34 = planType17.getContext();
        java.lang.reflect.Method method35 = planType17.getContext();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertNotNull(byte_array31);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNull(method35);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test021");
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
        planType1.addChild((byte) -1);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNull(cls30);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test022");
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
        java.lang.reflect.Method method23 = planType1.getBody();
        planType1.addParent((byte) -1);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test023");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        byte[] byte_array13 = planType1.getParents();
        planType1.addChild((byte) 0);
        java.lang.String str16 = planType1.toString();
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!:1" + "'", str16.equals("hi!:1"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test024");
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
        byte[] byte_array19 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array17, (int) (short) 10);
        byte[] byte_array21 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array17, 10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertNotNull(byte_array21);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test025");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        java.lang.String str12 = planType1.toString();
        planType1.addChild((byte) -1);
        byte[] byte_array15 = planType1.getChildren();
        byte[] byte_array16 = planType1.getChildren();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test026");
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
        planType10.addChild((byte) 10);
        planType10.addChild((byte) 0);
        java.lang.reflect.Method method22 = planType10.getContext();
        java.lang.reflect.Method method23 = planType10.getBody();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test027");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        planType1.addParent((byte) -1);
        java.lang.String str10 = planType1.toString();
        planType1.setName("hi!:-1");
        java.lang.reflect.Method method13 = planType1.getContext();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test028");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.String str3 = planType1.toString();
        planType1.setName("hi!:-1");
        planType1.setId((int) (short) 100);
        byte[] byte_array8 = planType1.getParents();
        byte[] byte_array9 = planType1.getChildren();
        java.lang.reflect.Method method10 = null;
        planType1.setBody(method10);
        java.lang.String str12 = planType1.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!:-1" + "'", str3.equals("hi!:-1"));
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test029");
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
        int i25 = planType1.getId();
        int i26 = planType1.getId();
        byte[] byte_array27 = planType1.getChildren();
        java.lang.Class<?> cls28 = planType1.getPlanClass();
        byte[] byte_array29 = planType1.getChildren();
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
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertNull(byte_array27);
        org.junit.Assert.assertNull(cls28);
        org.junit.Assert.assertNull(byte_array29);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test030");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        java.lang.String str10 = planType1.getName();
        byte[] byte_array11 = planType1.getParents();
        planType1.setId((int) 'a');
        planType1.addParent((byte) 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test031");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        java.lang.reflect.Method method3 = planType1.getContext();
        byte[] byte_array4 = planType1.getChildren();
        java.lang.reflect.Method method5 = planType1.getContext();
        planType1.setName("hi!:1:-1");
        planType1.addChild((byte) 10);
        java.lang.reflect.Method method10 = planType1.getBody();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test032");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        planType1.setName("hi!");
        java.lang.String str11 = planType1.getName();
        java.lang.String str12 = planType1.toString();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test033");
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
        planType18.setId(35);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(byte_array29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1" + "'", str30.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b31 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test034");
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
        java.lang.reflect.Method method26 = planType1.getContext();
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(method26);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test035");
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
        java.lang.reflect.Method method28 = planType24.getBody();
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(method28);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test036");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        java.lang.reflect.Method method13 = null;
        planType1.setContext(method13);
        java.lang.String str15 = planType1.getName();
        java.lang.reflect.Method method16 = planType1.getContext();
        java.lang.reflect.Method method17 = planType1.getBody();
        java.lang.reflect.Method method18 = null;
        planType1.setBody(method18);
        byte[] byte_array20 = planType1.getParents();
        planType1.addChild((byte) 0);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(byte_array20);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test037");
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
        java.lang.reflect.Method method41 = planType26.getBody();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNotNull(byte_array39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(method41);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test038");
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
        byte[] byte_array31 = planType17.getChildren();
        int i32 = planType17.getId();
        planType17.setId(100);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertNotNull(byte_array31);
        org.junit.Assert.assertTrue(i32 == (-1));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test039");
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
        planType12.addParent((byte) 10);
        planType12.setId((int) '#');
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1" + "'", str30.equals("hi!:-1"));
        org.junit.Assert.assertNull(cls33);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test040");
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
        java.lang.reflect.Method method24 = planType6.getContext();
        planType6.addParent((byte) -1);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(cls22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test041");
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
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 100);
        java.lang.reflect.Method method22 = planType1.getContext();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test042");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        java.lang.reflect.Method method3 = planType1.getContext();
        java.lang.String str4 = planType1.getName();
        java.lang.String str5 = planType1.toString();
        byte[] byte_array6 = planType1.getChildren();
        byte[] byte_array7 = planType1.getParents();
        planType1.addParent((byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test043");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        planType1.addChild((byte) 100);
        java.lang.String str12 = planType1.toString();
        int i13 = planType1.getId();
        planType1.addChild((byte) 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:-1" + "'", str12.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i13 == (-1));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test044");
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
        planType1.addChild((byte) 100);
        byte[] byte_array24 = planType1.getChildren();
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array24);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test045");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        byte[] byte_array6 = planType1.getChildren();
        java.lang.reflect.Method method7 = planType1.getBody();
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        java.lang.reflect.Method method10 = planType1.getContext();
        planType1.setId((int) (byte) 10);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test046");
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
        java.lang.reflect.Method method18 = null;
        planType1.setBody(method18);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test047");
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
        planType1.setId((int) (byte) 100);
        io.github.agentsoz.jill.struct.PlanType planType26 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType26.addChild((byte) 1);
        java.lang.reflect.Method method29 = null;
        planType26.setContext(method29);
        planType26.setName("hi!");
        java.lang.reflect.Method method33 = null;
        planType26.setContext(method33);
        planType26.addChild((byte) 100);
        java.lang.String str37 = planType26.toString();
        planType26.setId((int) 'a');
        io.github.agentsoz.jill.struct.PlanType planType41 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType41.addChild((byte) 1);
        java.lang.reflect.Method method44 = null;
        planType41.setContext(method44);
        planType41.setName("hi!");
        java.lang.reflect.Method method48 = null;
        planType41.setContext(method48);
        io.github.agentsoz.jill.struct.PlanType planType51 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType51.addChild((byte) 1);
        planType51.addParent((byte) 10);
        planType51.setId(1);
        planType51.addChild((byte) 1);
        boolean b60 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType41, (io.github.agentsoz.jill.struct.AObject) planType51);
        java.lang.reflect.Method method61 = planType51.getContext();
        planType51.addParent((byte) 1);
        byte[] byte_array64 = planType51.getChildren();
        boolean b65 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType26, (io.github.agentsoz.jill.struct.AObject) planType51);
        java.lang.reflect.Method method66 = null;
        planType51.setContext(method66);
        io.github.agentsoz.jill.struct.PlanType planType69 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        java.lang.reflect.Method method70 = planType69.getContext();
        boolean b71 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType51, (io.github.agentsoz.jill.struct.AObject) planType69);
        boolean b72 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType69);
        planType1.setId((int) (short) 1);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!:-1" + "'", str37.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNull(method61);
        org.junit.Assert.assertNotNull(byte_array64);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNull(method70);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test048");
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
        io.github.agentsoz.jill.struct.PlanType planType24 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType24.addChild((byte) 1);
        byte[] byte_array27 = planType24.getParents();
        java.lang.reflect.Method method28 = null;
        planType24.setBody(method28);
        java.lang.String str30 = planType24.toString();
        planType24.addParent((byte) 1);
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType24);
        byte[] byte_array34 = planType24.getParents();
        planType24.addParent((byte) 0);
        byte[] byte_array37 = planType24.getChildren();
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(byte_array27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1" + "'", str30.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(byte_array34);
        org.junit.Assert.assertNotNull(byte_array37);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test049");
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
        java.lang.reflect.Method method27 = null;
        planType1.setContext(method27);
        planType1.setId((int) (short) -1);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test050");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = null;
        planType1.setContext(method10);
        java.lang.String str12 = planType1.toString();
        planType1.addChild((byte) -1);
        planType1.setName("hi!:-1:100");
        planType1.setId((int) '#');
        planType1.addChild((byte) 100);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!:1" + "'", str12.equals("hi!:1"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test051");
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
        java.lang.reflect.Method method11 = planType1.getContext();
        planType1.addParent((byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test052");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("");
        byte[] byte_array9 = planType1.getChildren();
        byte[] byte_array11 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, 10);
        byte[] byte_array13 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array9, (int) (short) 1);
        byte[] byte_array15 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array13, (int) '#');
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test053");
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
        planType1.addChild((byte) 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:1" + "'", str14.equals("hi!:1"));
        org.junit.Assert.assertNull(cls15);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test054");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        planType1.addParent((byte) 100);
        java.lang.String str10 = planType1.toString();
        int i11 = planType1.getId();
        int i12 = planType1.getId();
        java.lang.reflect.Method method13 = planType1.getBody();
        java.lang.String str14 = planType1.toString();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:-1" + "'", str14.equals("hi!:-1"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test055");
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
        byte[] byte_array31 = planType17.getChildren();
        planType17.addChild((byte) 100);
        java.lang.String str34 = planType17.getName();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertNotNull(byte_array31);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test056");
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
        planType17.setName("hi!:1:-1");
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNull(cls26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test057");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        planType1.setName("hi!");
        byte[] byte_array11 = planType1.getChildren();
        byte[] byte_array12 = planType1.getChildren();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test058");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        java.lang.reflect.Method method10 = planType1.getContext();
        planType1.setName("");
        java.lang.reflect.Method method13 = null;
        planType1.setContext(method13);
        planType1.addChild((byte) 100);
        int i17 = planType1.getId();
        java.lang.reflect.Method method18 = planType1.getContext();
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test059");
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
        java.lang.String str20 = planType1.toString();
        java.lang.reflect.Method method21 = null;
        planType1.setBody(method21);
        java.lang.reflect.Method method23 = null;
        planType1.setContext(method23);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + ":1" + "'", str20.equals(":1"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test060");
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
        planType6.setName("hi!:1");
        planType6.addChild((byte) 0);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test061");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        planType1.setName("hi!:-1");
        planType1.setId((int) (short) 1);
        planType1.setName("hi!:100:-1");
        org.junit.Assert.assertNull(byte_array2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test062");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.setName("hi!:-1");
        int i10 = planType1.getId();
        int i11 = planType1.getId();
        planType1.addParent((byte) 10);
        java.lang.String str14 = planType1.getName();
        planType1.addParent((byte) 100);
        java.lang.reflect.Method method17 = planType1.getContext();
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!:-1" + "'", str14.equals("hi!:-1"));
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test063");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!:1");
        planType1.setId((int) 'a');
        planType1.setName(":1");
        planType1.addParent((byte) 100);
        planType1.setId((int) (short) -1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test064");
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
        io.github.agentsoz.jill.struct.PlanType planType23 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array24 = planType23.getChildren();
        java.lang.reflect.Method method25 = null;
        planType23.setContext(method25);
        planType23.setId(100);
        planType23.setName("hi!:-1");
        planType23.setId((int) (byte) 100);
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType23);
        java.lang.String str34 = planType1.getName();
        planType1.addChild((byte) 100);
        io.github.agentsoz.jill.struct.PlanType planType38 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType38.addChild((byte) 1);
        java.lang.reflect.Method method41 = null;
        planType38.setContext(method41);
        planType38.setName("hi!");
        java.lang.reflect.Method method45 = null;
        planType38.setContext(method45);
        planType38.addChild((byte) 100);
        java.lang.String str49 = planType38.toString();
        planType38.setId((int) 'a');
        io.github.agentsoz.jill.struct.PlanType planType53 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType53.addChild((byte) 1);
        java.lang.reflect.Method method56 = null;
        planType53.setContext(method56);
        planType53.setName("hi!");
        java.lang.reflect.Method method60 = null;
        planType53.setContext(method60);
        io.github.agentsoz.jill.struct.PlanType planType63 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType63.addChild((byte) 1);
        planType63.addParent((byte) 10);
        planType63.setId(1);
        planType63.addChild((byte) 1);
        boolean b72 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType53, (io.github.agentsoz.jill.struct.AObject) planType63);
        java.lang.reflect.Method method73 = planType63.getContext();
        planType63.addParent((byte) 1);
        byte[] byte_array76 = planType63.getChildren();
        boolean b77 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType38, (io.github.agentsoz.jill.struct.AObject) planType63);
        boolean b78 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType63);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!:-1" + "'", str49.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNull(method73);
        org.junit.Assert.assertNotNull(byte_array76);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b78 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test065");
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
        int i20 = planType10.getId();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!:52" + "'", str19.equals("hi!:52"));
        org.junit.Assert.assertTrue(i20 == 52);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test066");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        java.lang.reflect.Method method8 = planType1.getContext();
        planType1.setId((int) (byte) -1);
        planType1.addChild((byte) 0);
        java.lang.String str13 = planType1.getName();
        java.lang.Class<?> cls14 = planType1.getPlanClass();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNull(cls14);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test067");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.reflect.Method method9 = null;
        planType1.setContext(method9);
        planType1.setName("hi!");
        int i13 = planType1.getId();
        int i14 = planType1.getId();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test068");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.String str9 = planType1.toString();
        java.lang.reflect.Method method10 = planType1.getBody();
        java.lang.reflect.Method method11 = planType1.getBody();
        java.lang.reflect.Method method12 = planType1.getContext();
        int i13 = planType1.getId();
        java.lang.reflect.Method method14 = null;
        planType1.setBody(method14);
        int i16 = planType1.getId();
        planType1.setName("");
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:-1" + "'", str9.equals("hi!:-1"));
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i16 == (-1));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test069");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        java.lang.reflect.Method method8 = planType1.getBody();
        java.lang.String str9 = planType1.toString();
        planType1.addParent((byte) 0);
        java.lang.Class<?> cls12 = planType1.getPlanClass();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!:1" + "'", str9.equals("hi!:1"));
        org.junit.Assert.assertNull(cls12);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test070");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.reflect.Method method4 = null;
        planType1.setBody(method4);
        java.lang.reflect.Method method6 = null;
        planType1.setContext(method6);
        int i8 = planType1.getId();
        java.lang.reflect.Method method9 = null;
        planType1.setContext(method9);
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test071");
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
        java.lang.reflect.Method method23 = null;
        planType1.setContext(method23);
        byte[] byte_array25 = planType1.getParents();
        planType1.addChild((byte) 100);
        byte[] byte_array28 = planType1.getChildren();
        int i29 = planType1.getId();
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertNotNull(byte_array28);
        org.junit.Assert.assertTrue(i29 == (-1));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test072");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        byte[] byte_array4 = planType1.getParents();
        java.lang.reflect.Method method5 = planType1.getBody();
        org.junit.Assert.assertNotNull(byte_array4);
        org.junit.Assert.assertNull(method5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test073");
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
        java.lang.String str32 = planType20.toString();
        java.lang.reflect.Method method33 = null;
        planType20.setContext(method33);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i27 == (-1));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!:-1" + "'", str32.equals("hi!:-1"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test074");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addParent((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        java.lang.reflect.Method method13 = null;
        planType1.setContext(method13);
        java.lang.String str15 = planType1.getName();
        java.lang.reflect.Method method16 = planType1.getContext();
        java.lang.reflect.Method method17 = planType1.getBody();
        planType1.setName("hi!:52:-1");
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test075");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.reflect.Method method3 = null;
        planType1.setContext(method3);
        java.lang.reflect.Method method5 = planType1.getContext();
        java.lang.Class<?> cls6 = planType1.getPlanClass();
        java.lang.reflect.Method method7 = planType1.getContext();
        java.lang.reflect.Method method8 = null;
        planType1.setBody(method8);
        planType1.addParent((byte) -1);
        byte[] byte_array12 = planType1.getChildren();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(cls6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(byte_array12);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test076");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.setName("hi!");
        java.lang.String str6 = planType1.getName();
        java.lang.Class<?> cls7 = planType1.getPlanClass();
        java.lang.Class<?> cls8 = planType1.getPlanClass();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        planType10.addParent((byte) 10);
        planType10.setId(1);
        java.lang.reflect.Method method17 = planType10.getBody();
        io.github.agentsoz.jill.struct.PlanType planType19 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType19.addChild((byte) 1);
        planType19.addParent((byte) 10);
        boolean b24 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType10, (io.github.agentsoz.jill.struct.AObject) planType19);
        io.github.agentsoz.jill.struct.PlanType planType26 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType26.addChild((byte) 1);
        java.lang.reflect.Method method29 = null;
        planType26.setContext(method29);
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType10, (io.github.agentsoz.jill.struct.AObject) planType26);
        planType26.setName("hi!:-1");
        java.lang.reflect.Method method34 = planType26.getBody();
        boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType26);
        byte[] byte_array36 = planType26.getParents();
        java.lang.String str37 = planType26.toString();
        byte[] byte_array38 = planType26.getChildren();
        java.lang.reflect.Method method39 = planType26.getContext();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(cls7);
        org.junit.Assert.assertNull(cls8);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(byte_array36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!:-1:-1" + "'", str37.equals("hi!:-1:-1"));
        org.junit.Assert.assertNotNull(byte_array38);
        org.junit.Assert.assertNull(method39);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test077");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        java.lang.String str6 = planType1.toString();
        planType1.setName("");
        planType1.addParent((byte) 10);
        planType1.setId((int) (byte) 100);
        java.lang.String str13 = planType1.getName();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!:-1" + "'", str6.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test078");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        java.lang.String str4 = planType1.toString();
        java.lang.String str5 = planType1.toString();
        planType1.addChild((byte) 10);
        int i8 = planType1.getId();
        java.lang.Class<?> cls9 = planType1.getPlanClass();
        planType1.setName("hi!:-1:1");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(cls9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test079");
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
        int i26 = planType17.getId();
        io.github.agentsoz.jill.struct.PlanType planType28 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType28.addChild((byte) 1);
        planType28.addParent((byte) 10);
        planType28.addParent((byte) 1);
        byte[] byte_array35 = planType28.getParents();
        java.lang.String str36 = planType28.toString();
        io.github.agentsoz.jill.struct.PlanType planType38 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType38.addChild((byte) 1);
        planType38.addParent((byte) 10);
        planType38.setId(1);
        planType38.addChild((byte) 1);
        java.lang.reflect.Method method47 = null;
        planType38.setContext(method47);
        java.lang.String str49 = planType38.toString();
        planType38.addChild((byte) -1);
        java.lang.String str52 = planType38.getName();
        byte[] byte_array53 = planType38.getChildren();
        boolean b54 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType28, (io.github.agentsoz.jill.struct.AObject) planType38);
        int i55 = planType28.getId();
        java.lang.String str56 = planType28.getName();
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType17, (io.github.agentsoz.jill.struct.AObject) planType28);
        int i58 = planType28.getId();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertNotNull(byte_array35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!:-1" + "'", str36.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!:1" + "'", str49.equals("hi!:1"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!" + "'", str52.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(i55 == (-1));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!" + "'", str56.equals("hi!"));
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(i58 == (-1));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test080");
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
        io.github.agentsoz.jill.struct.PlanType planType24 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType24.addChild((byte) 1);
        planType24.addParent((byte) 10);
        planType24.setId((int) (byte) 100);
        boolean b31 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType24);
        java.lang.Class<?> cls32 = planType1.getPlanClass();
        planType1.addParent((byte) -1);
        io.github.agentsoz.jill.struct.AObject aObject35 = null;
        try {
            boolean b36 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, aObject35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(cls32);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test081");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = null;
        planType1.setContext(method8);
        java.lang.String str10 = planType1.toString();
        planType1.setName("");
        java.lang.Class<?> cls13 = planType1.getPlanClass();
        byte[] byte_array14 = planType1.getChildren();
        int i15 = planType1.getId();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!:-1" + "'", str10.equals("hi!:-1"));
        org.junit.Assert.assertNull(cls13);
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertTrue(i15 == (-1));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test082");
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
        byte[] byte_array20 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array18, (int) (short) 100);
        try {
            byte[] byte_array22 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array20, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(byte_array18);
        org.junit.Assert.assertNotNull(byte_array20);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test083");
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
        java.lang.String str15 = planType1.getName();
        java.lang.reflect.Method method16 = null;
        planType1.setContext(method16);
        planType1.setId((int) (short) 1);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test084");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addParent((byte) 10);
        planType1.addChild((byte) 0);
        java.lang.String str12 = planType1.getName();
        planType1.setName("hi!:1");
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test085");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method10 = planType1.getContext();
        java.lang.reflect.Method method11 = null;
        planType1.setContext(method11);
        java.lang.Class<?> cls13 = planType1.getPlanClass();
        java.lang.reflect.Method method14 = planType1.getContext();
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(cls13);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test086");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        planType1.setName("hi!");
        java.lang.reflect.Method method8 = planType1.getContext();
        planType1.setName("");
        java.lang.Class<?> cls11 = planType1.getPlanClass();
        io.github.agentsoz.jill.struct.PlanType planType13 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType13.addParent((byte) 10);
        java.lang.String str16 = planType13.toString();
        java.lang.String str17 = planType13.getName();
        java.lang.reflect.Method method18 = null;
        planType13.setContext(method18);
        io.github.agentsoz.jill.struct.PlanType planType21 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType21.addChild((byte) 1);
        java.lang.reflect.Method method24 = null;
        planType21.setContext(method24);
        java.lang.String str26 = planType21.toString();
        planType21.setName("");
        byte[] byte_array29 = planType21.getChildren();
        planType21.setId((int) (byte) 100);
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType13, (io.github.agentsoz.jill.struct.AObject) planType21);
        planType13.addChild((byte) 100);
        java.lang.reflect.Method method35 = null;
        planType13.setBody(method35);
        planType13.setName(":-1");
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType13);
        java.lang.Class<?> cls40 = planType13.getPlanClass();
        planType13.addChild((byte) 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(cls11);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!:-1" + "'", str16.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:-1" + "'", str26.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array29);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(cls40);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test087");
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
        byte[] byte_array23 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array21, 0);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertNotNull(byte_array21);
        org.junit.Assert.assertNotNull(byte_array23);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test088");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getParents();
        planType1.setName("hi!:32");
        org.junit.Assert.assertNull(byte_array2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test089");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        byte[] byte_array6 = planType1.getChildren();
        java.lang.reflect.Method method7 = planType1.getBody();
        int i8 = planType1.getId();
        io.github.agentsoz.jill.struct.PlanType planType10 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType10.addChild((byte) 1);
        byte[] byte_array13 = planType10.getParents();
        java.lang.reflect.Method method14 = null;
        planType10.setBody(method14);
        io.github.agentsoz.jill.struct.PlanType planType17 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType17.addParent((byte) 10);
        java.lang.String str20 = planType17.toString();
        java.lang.String str21 = planType17.getName();
        java.lang.Class<?> cls22 = planType17.getPlanClass();
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType10, (io.github.agentsoz.jill.struct.AObject) planType17);
        java.lang.reflect.Method method24 = planType10.getBody();
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
        java.lang.reflect.Method method48 = planType42.getContext();
        java.lang.String str49 = planType42.getName();
        boolean b50 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType10, (io.github.agentsoz.jill.struct.AObject) planType42);
        planType42.addParent((byte) 0);
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType42);
        planType42.setName("hi!:52:-1");
        java.lang.reflect.Method method56 = null;
        planType42.setBody(method56);
        byte[] byte_array58 = planType42.getParents();
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!:-1" + "'", str20.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNull(cls22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNull(method48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(byte_array58);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test090");
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
        planType21.addParent((byte) 100);
        java.lang.reflect.Method method39 = null;
        planType21.setContext(method39);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!:-1" + "'", str30.equals("hi!:-1"));
        org.junit.Assert.assertNull(cls33);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test091");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addParent((byte) 10);
        int i4 = planType1.getId();
        byte[] byte_array5 = planType1.getChildren();
        planType1.setName(":1:-1");
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(byte_array5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test092");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!:1");
        java.lang.reflect.Method method2 = null;
        planType1.setContext(method2);
        java.lang.reflect.Method method4 = null;
        planType1.setBody(method4);
        int i6 = planType1.getId();
        byte[] byte_array7 = planType1.getChildren();
        planType1.setId((int) (short) 0);
        java.lang.reflect.Method method10 = null;
        planType1.setBody(method10);
        planType1.setId((int) (byte) -1);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNull(byte_array7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test093");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        int i8 = planType1.getId();
        byte[] byte_array9 = planType1.getParents();
        java.lang.String str10 = planType1.getName();
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test094");
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
        io.github.agentsoz.jill.struct.PlanType planType23 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType23.addChild((byte) 1);
        java.lang.reflect.Method method26 = null;
        planType23.setContext(method26);
        byte[] byte_array28 = planType23.getChildren();
        java.lang.reflect.Method method29 = planType23.getBody();
        int i30 = planType23.getId();
        io.github.agentsoz.jill.struct.PlanType planType32 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType32.addChild((byte) 1);
        byte[] byte_array35 = planType32.getParents();
        java.lang.reflect.Method method36 = null;
        planType32.setBody(method36);
        io.github.agentsoz.jill.struct.PlanType planType39 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType39.addParent((byte) 10);
        java.lang.String str42 = planType39.toString();
        java.lang.String str43 = planType39.getName();
        java.lang.Class<?> cls44 = planType39.getPlanClass();
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType32, (io.github.agentsoz.jill.struct.AObject) planType39);
        java.lang.reflect.Method method46 = planType32.getBody();
        io.github.agentsoz.jill.struct.PlanType planType48 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType48.addChild((byte) 1);
        planType48.addParent((byte) 10);
        planType48.setId(1);
        java.lang.reflect.Method method55 = planType48.getBody();
        io.github.agentsoz.jill.struct.PlanType planType57 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType57.addChild((byte) 1);
        planType57.addParent((byte) 10);
        boolean b62 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType48, (io.github.agentsoz.jill.struct.AObject) planType57);
        io.github.agentsoz.jill.struct.PlanType planType64 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType64.addChild((byte) 1);
        java.lang.reflect.Method method67 = null;
        planType64.setContext(method67);
        boolean b69 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType48, (io.github.agentsoz.jill.struct.AObject) planType64);
        java.lang.reflect.Method method70 = planType64.getContext();
        java.lang.String str71 = planType64.getName();
        boolean b72 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType32, (io.github.agentsoz.jill.struct.AObject) planType64);
        planType64.addParent((byte) 0);
        boolean b75 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType23, (io.github.agentsoz.jill.struct.AObject) planType64);
        planType64.setName("hi!:52:-1");
        boolean b78 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType64);
        byte[] byte_array79 = planType1.getParents();
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array28);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertTrue(i30 == (-1));
        org.junit.Assert.assertNull(byte_array35);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!:-1" + "'", str42.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        org.junit.Assert.assertNull(cls44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNull(method46);
        org.junit.Assert.assertNull(method55);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNull(method70);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "hi!" + "'", str71.equals("hi!"));
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(byte_array79);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test095");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        byte[] byte_array2 = planType1.getChildren();
        java.lang.String str3 = planType1.toString();
        planType1.setId(0);
        io.github.agentsoz.jill.struct.PlanType planType7 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType7.addChild((byte) 1);
        planType7.addParent((byte) 10);
        planType7.setId(1);
        planType7.addParent((byte) 10);
        planType7.addParent((byte) 10);
        byte[] byte_array18 = planType7.getChildren();
        java.lang.reflect.Method method19 = null;
        planType7.setContext(method19);
        java.lang.String str21 = planType7.getName();
        java.lang.reflect.Method method22 = planType7.getContext();
        java.lang.reflect.Method method23 = planType7.getBody();
        java.lang.Class<?> cls24 = planType7.getPlanClass();
        boolean b25 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) planType1, (io.github.agentsoz.jill.struct.AObject) planType7);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!:-1" + "'", str3.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(cls24);
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test096");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        planType1.addParent((byte) 10);
        planType1.setId(1);
        byte[] byte_array8 = planType1.getParents();
        java.lang.reflect.Method method9 = planType1.getContext();
        java.lang.String str10 = planType1.getName();
        java.lang.Class<?> cls11 = planType1.getPlanClass();
        int i12 = planType1.getId();
        planType1.addParent((byte) -1);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNull(cls11);
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test097");
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
        java.lang.reflect.Method method23 = planType1.getBody();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!:-1" + "'", str5.equals("hi!:-1"));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNotNull(byte_array17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!:-1" + "'", str18.equals("hi!:-1"));
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertNull(cls20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test098");
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
        planType9.setBody(method17);
        planType9.addParent((byte) 1);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test099");
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
        java.lang.String str26 = planType13.toString();
        planType13.setName(":1:-1");
        org.junit.Assert.assertNotNull(byte_array20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!:-1" + "'", str21.equals("hi!:-1"));
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!:-1" + "'", str24.equals("hi!:-1"));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!:-1" + "'", str26.equals("hi!:-1"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PlanTypeRegressionTest4.test100");
        io.github.agentsoz.jill.struct.PlanType planType1 = new io.github.agentsoz.jill.struct.PlanType("hi!");
        planType1.addChild((byte) 1);
        java.lang.reflect.Method method4 = null;
        planType1.setContext(method4);
        byte[] byte_array6 = planType1.getChildren();
        java.lang.reflect.Method method7 = planType1.getBody();
        java.lang.reflect.Method method8 = planType1.getContext();
        java.lang.String str9 = planType1.getName();
        planType1.addChild((byte) 10);
        byte[] byte_array12 = planType1.getChildren();
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(byte_array12);
    }
}

