package io.github.agentsoz.jill.struct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@SuppressWarnings("unused")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GPTypeRegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test01");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        byte[] byte_array10 = gPType4.getChildren();
        byte[] byte_array12 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (int) (byte) 0);
        byte[] byte_array14 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (int) (short) 10);
        byte[] byte_array16 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, (int) (short) 1);
        byte[] byte_array18 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array10, 52);
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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test02");
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
        int i35 = gPType16.getId();
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
        org.junit.Assert.assertTrue(i35 == (-1));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test03");
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
        gPType1.addParent((byte) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array17);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test04");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!:1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType1.getChildren();
        int i6 = gPType1.getId();
        gPType1.setId((int) (byte) 10);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue(i6 == (-1));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test05");
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
        gPType1.addChild((byte) -1);
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
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test06");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setId((int) (byte) 1);
        java.lang.String str7 = gPType1.toString();
        int i8 = gPType1.getId();
        int i9 = gPType1.getId();
        gPType1.setId((int) 'a');
        gPType1.addParent((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!:1" + "'", str7.equals("hi!:1"));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test07");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        byte[] byte_array3 = gPType1.getParents();
        java.lang.String str4 = gPType1.getName();
        gPType1.setName(":100:10");
        gPType1.addChild((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test08");
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
        int i29 = gPType6.getId();
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNotNull(byte_array19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ":52:-1" + "'", str27.equals(":52:-1"));
        org.junit.Assert.assertTrue(i28 == 35);
        org.junit.Assert.assertTrue(i29 == 35);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test09");
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
        gPType12.addParent((byte) 1);
        gPType12.addParent((byte) 1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test10");
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
        int i17 = gPType1.getId();
        gPType1.setName(":-1:-1:0");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i17 == (-1));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test11");
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
        byte[] byte_array15 = gPType1.getChildren();
        byte[] byte_array16 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType18 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array19 = gPType18.getParents();
        gPType18.setName("hi!");
        gPType18.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array26 = gPType25.getParents();
        int i27 = gPType25.getId();
        byte[] byte_array28 = gPType25.getChildren();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType18, (io.github.agentsoz.jill.struct.AObject) gPType25);
        gPType25.setName("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType33 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array34 = gPType33.getChildren();
        gPType33.addChild((byte) 1);
        int i37 = gPType33.getId();
        java.lang.String str38 = gPType33.toString();
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType25, (io.github.agentsoz.jill.struct.AObject) gPType33);
        io.github.agentsoz.jill.struct.GoalPlanType gPType41 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        int i42 = gPType41.getId();
        boolean b43 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType33, (io.github.agentsoz.jill.struct.AObject) gPType41);
        io.github.agentsoz.jill.struct.GoalPlanType gPType45 = new io.github.agentsoz.jill.struct.GoalPlanType(":-1:-1");
        gPType45.addParent((byte) 1);
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType33, (io.github.agentsoz.jill.struct.AObject) gPType45);
        gPType33.setName("hi!:100");
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType33);
        int i52 = gPType1.getId();
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
        org.junit.Assert.assertNull(byte_array19);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertTrue(i27 == (-1));
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(byte_array34);
        org.junit.Assert.assertTrue(i37 == (-1));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + ":-1" + "'", str38.equals(":-1"));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i42 == (-1));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i52 == (-1));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test12");
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
        gPType3.setName("hi!:1:1:-1");
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(byte_array14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test13");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        gPType1.setName("");
        gPType1.addChild((byte) 10);
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 100);
        gPType1.addChild((byte) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test14");
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
        gPType1.setName("");
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
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test15");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array12 = gPType11.getParents();
        int i13 = gPType11.getId();
        gPType11.setName("");
        gPType11.addChild((byte) 10);
        java.lang.String str18 = gPType11.getName();
        io.github.agentsoz.jill.struct.GoalPlanType gPType20 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b23 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType20, (io.github.agentsoz.jill.struct.AObject) gPType22);
        java.lang.String str24 = gPType22.getName();
        byte[] byte_array25 = gPType22.getParents();
        boolean b26 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType11, (io.github.agentsoz.jill.struct.AObject) gPType22);
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType22);
        gPType22.addParent((byte) 10);
        java.lang.String str30 = gPType22.getName();
        gPType22.addParent((byte) 0);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test16");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        byte[] byte_array6 = gPType1.getParents();
        java.lang.String str7 = gPType1.getName();
        java.lang.String str8 = gPType1.getName();
        gPType1.setName(":-1:10");
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array13 = gPType12.getChildren();
        gPType12.addChild((byte) 1);
        java.lang.String str16 = gPType12.getName();
        java.lang.String str17 = gPType12.getName();
        int i18 = gPType12.getId();
        gPType12.setName(":-1:-1");
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        io.github.agentsoz.jill.struct.GoalPlanType gPType24 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array25 = gPType24.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType27 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array28 = gPType27.getChildren();
        gPType27.addChild((byte) 1);
        java.lang.String str31 = gPType27.getName();
        boolean b32 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType24, (io.github.agentsoz.jill.struct.AObject) gPType27);
        int i33 = gPType27.getId();
        boolean b34 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType22, (io.github.agentsoz.jill.struct.AObject) gPType27);
        gPType22.setId((int) (byte) -1);
        byte[] byte_array37 = gPType22.getParents();
        java.lang.String str38 = gPType22.toString();
        byte[] byte_array39 = gPType22.getChildren();
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, (io.github.agentsoz.jill.struct.AObject) gPType22);
        gPType12.addChild((byte) -1);
        java.lang.String str43 = gPType12.getName();
        gPType12.addParent((byte) -1);
        io.github.agentsoz.jill.struct.GoalPlanType gPType47 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array48 = gPType47.getParents();
        byte[] byte_array49 = gPType47.getParents();
        gPType47.setId((int) (short) 100);
        java.lang.String str52 = gPType47.toString();
        boolean b53 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, (io.github.agentsoz.jill.struct.AObject) gPType47);
        java.lang.String str54 = gPType47.getName();
        gPType47.addChild((byte) -1);
        boolean b57 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType47);
        java.lang.String str58 = gPType47.getName();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertNull(byte_array25);
        org.junit.Assert.assertNull(byte_array28);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == (-1));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(byte_array37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + ":-1" + "'", str38.equals(":-1"));
        org.junit.Assert.assertNull(byte_array39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + ":-1:-1" + "'", str43.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array48);
        org.junit.Assert.assertNull(byte_array49);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + ":100" + "'", str52.equals(":100"));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test17");
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
        gPType1.addChild((byte) 10);
        gPType1.addParent((byte) 1);
        gPType1.setId((int) 'a');
        gPType1.addChild((byte) -1);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test18");
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
        io.github.agentsoz.jill.struct.GoalPlanType gPType22 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array23 = gPType22.getChildren();
        byte[] byte_array24 = gPType22.getParents();
        int i25 = gPType22.getId();
        gPType22.setId((int) (byte) 10);
        java.lang.String str28 = gPType22.toString();
        boolean b29 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType22);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertNull(byte_array7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ":-1" + "'", str17.equals(":-1"));
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertNull(byte_array24);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + ":10" + "'", str28.equals(":10"));
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test19");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        byte[] byte_array11 = gPType1.getChildren();
        gPType1.addChild((byte) 10);
        int i14 = gPType1.getId();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertTrue(i14 == (-1));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test20");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        int i2 = gPType1.getId();
        java.lang.String str3 = gPType1.getName();
        java.lang.String str4 = gPType1.toString();
        byte[] byte_array5 = gPType1.getChildren();
        byte[] byte_array6 = gPType1.getParents();
        gPType1.setName(":-1");
        org.junit.Assert.assertTrue(i2 == (-1));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!:-1" + "'", str4.equals("hi!:-1"));
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array6);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test21");
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
        byte[] byte_array33 = gPType12.getChildren();
        io.github.agentsoz.jill.struct.AObject aObject34 = null;
        try {
            boolean b35 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType12, aObject34);
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
        org.junit.Assert.assertNull(byte_array30);
        org.junit.Assert.assertNull(byte_array31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!:-1:-1:-1" + "'", str32.equals("hi!:-1:-1:-1"));
        org.junit.Assert.assertNull(byte_array33);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test22");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        gPType1.setId((int) (byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType5 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array6 = gPType5.getParents();
        gPType5.setName("hi!");
        gPType5.addParent((byte) 100);
        io.github.agentsoz.jill.struct.GoalPlanType gPType12 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array13 = gPType12.getParents();
        int i14 = gPType12.getId();
        byte[] byte_array15 = gPType12.getChildren();
        boolean b16 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType12);
        gPType5.addParent((byte) 100);
        gPType5.addChild((byte) 10);
        byte[] byte_array21 = gPType5.getChildren();
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
        io.github.agentsoz.jill.struct.GoalPlanType gPType37 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType39 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType37, (io.github.agentsoz.jill.struct.AObject) gPType39);
        java.lang.String str41 = gPType39.getName();
        gPType39.addParent((byte) 1);
        gPType39.addParent((byte) 1);
        gPType39.setId((-1));
        boolean b48 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType23, (io.github.agentsoz.jill.struct.AObject) gPType39);
        gPType23.setId((int) (byte) -1);
        boolean b51 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType5, (io.github.agentsoz.jill.struct.AObject) gPType23);
        boolean b52 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType5);
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array13);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(byte_array21);
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b52 == true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test23");
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
        gPType1.addChild((byte) 100);
        gPType1.setId(0);
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
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test24");
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
        gPType13.setName(":-1:-1:-1:-1");
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
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test25");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        gPType1.addParent((byte) 10);
        gPType1.setName("");
        gPType1.setName(":-1:-1:-1:-1:10");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test26");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        byte[] byte_array6 = gPType1.getParents();
        java.lang.String str7 = gPType1.getName();
        java.lang.String str8 = gPType1.getName();
        gPType1.setName(":-1:10");
        gPType1.setId((int) (short) 1);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test27");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setName(":-1:-1");
        gPType1.addChild((byte) -1);
        gPType1.addParent((byte) 1);
        gPType1.addParent((byte) 1);
        gPType1.setId((int) (short) 0);
        byte[] byte_array15 = gPType1.getChildren();
        gPType1.setId((int) '4');
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test28");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        byte[] byte_array8 = gPType3.getChildren();
        gPType3.setName(":-1:-1:-1");
        gPType3.setName(":-1:-1:1");
        java.lang.String str13 = gPType3.getName();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertNull(byte_array8);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ":-1:-1:1" + "'", str13.equals(":-1:-1:1"));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test29");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        gPType1.setId((int) (byte) -1);
        java.lang.String str4 = gPType1.toString();
        gPType1.setName(":-1:-1");
        byte[] byte_array7 = gPType1.getChildren();
        gPType1.addChild((byte) 10);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ":-1" + "'", str4.equals(":-1"));
        org.junit.Assert.assertNull(byte_array7);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test30");
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
        gPType1.setName(":-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test31");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        io.github.agentsoz.jill.struct.GoalPlanType gPType3 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        boolean b4 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType3);
        byte[] byte_array5 = gPType3.getParents();
        gPType3.setName("hi!:-1");
        int i8 = gPType3.getId();
        byte[] byte_array9 = gPType3.getChildren();
        int i10 = gPType3.getId();
        java.lang.String str11 = gPType3.getName();
        gPType3.setName(":-1:-1:-1:-1");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!:-1" + "'", str11.equals("hi!:-1"));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test32");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        gPType1.addChild((byte) 100);
        byte[] byte_array7 = gPType1.getParents();
        gPType1.setId(10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array7);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test33");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        int i5 = gPType1.getId();
        gPType1.addChild((byte) 0);
        gPType1.addParent((byte) 1);
        byte[] byte_array10 = gPType1.getChildren();
        byte[] byte_array11 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test34");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        gPType1.setName("");
        gPType1.addChild((byte) 10);
        gPType1.addChild((byte) 0);
        io.github.agentsoz.jill.struct.GoalPlanType gPType11 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array12 = gPType11.getParents();
        gPType11.setName("hi!");
        gPType11.setId((int) (byte) 1);
        java.lang.String str17 = gPType11.getName();
        gPType11.setId((int) (byte) 100);
        gPType11.addChild((byte) 100);
        gPType11.setId((int) (byte) 10);
        gPType11.addChild((byte) 1);
        java.lang.String str26 = gPType11.getName();
        boolean b27 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType11);
        gPType1.setName(":-1:1:-1");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertNull(byte_array12);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test35");
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
        java.lang.String str35 = gPType16.toString();
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
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + ":-1" + "'", str35.equals(":-1"));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test36");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getParents();
        int i3 = gPType1.getId();
        gPType1.setName("");
        gPType1.addChild((byte) 10);
        gPType1.addChild((byte) 0);
        byte[] byte_array10 = gPType1.getParents();
        java.lang.String str11 = gPType1.toString();
        gPType1.setId((int) (byte) 10);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertNull(byte_array10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ":-1" + "'", str11.equals(":-1"));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test37");
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
        gPType1.addChild((byte) 0);
        gPType1.addChild((byte) -1);
        org.junit.Assert.assertNull(byte_array4);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ":-1" + "'", str18.equals(":-1"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == (-1));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test38");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        gPType1.addChild((byte) 1);
        java.lang.String str5 = gPType1.getName();
        java.lang.String str6 = gPType1.getName();
        int i7 = gPType1.getId();
        gPType1.addParent((byte) 100);
        int i10 = gPType1.getId();
        gPType1.setName(":-1");
        gPType1.setId((int) (short) 10);
        gPType1.setName("hi!");
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertTrue(i10 == (-1));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test39");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array2 = gPType1.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType4 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array5 = gPType4.getChildren();
        gPType4.addChild((byte) 1);
        java.lang.String str8 = gPType4.getName();
        boolean b9 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType4);
        byte[] byte_array10 = gPType4.getChildren();
        byte[] byte_array11 = gPType4.getParents();
        gPType4.addParent((byte) 0);
        gPType4.addParent((byte) 100);
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
        gPType22.setName(":52:-1");
        java.lang.String str43 = gPType22.getName();
        byte[] byte_array44 = gPType22.getParents();
        boolean b45 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType4, (io.github.agentsoz.jill.struct.AObject) gPType22);
        gPType4.setId((int) (short) -1);
        gPType4.setId(35);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertNull(byte_array20);
        org.junit.Assert.assertNull(byte_array23);
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertNotNull(byte_array35);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + ":52:-1" + "'", str43.equals(":52:-1"));
        org.junit.Assert.assertNotNull(byte_array44);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test40");
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
        java.lang.String str29 = gPType17.getName();
        gPType17.setName("hi!:1:0");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(byte_array5);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ":-1:-1" + "'", str15.equals(":-1:-1"));
        org.junit.Assert.assertNull(byte_array18);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + ":-1:-1" + "'", str29.equals(":-1:-1"));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test41");
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
        byte[] byte_array27 = gPType1.getChildren();
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
        org.junit.Assert.assertNull(byte_array27);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test42");
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
        byte[] byte_array25 = gPType1.getParents();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array23);
        org.junit.Assert.assertNotNull(byte_array24);
        org.junit.Assert.assertNotNull(byte_array25);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test43");
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
        gPType14.addChild((byte) 1);
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
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test44");
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
        java.lang.String str40 = gPType1.toString();
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
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + ":-1" + "'", str40.equals(":-1"));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test45");
        io.github.agentsoz.jill.struct.GoalPlanType gPType1 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array2 = gPType1.getParents();
        gPType1.setName("hi!");
        gPType1.setId((int) (byte) 100);
        int i7 = gPType1.getId();
        gPType1.addParent((byte) 0);
        int i10 = gPType1.getId();
        byte[] byte_array11 = gPType1.getChildren();
        byte[] byte_array12 = gPType1.getParents();
        io.github.agentsoz.jill.struct.GoalPlanType gPType14 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array15 = gPType14.getChildren();
        gPType14.addChild((byte) 1);
        int i18 = gPType14.getId();
        gPType14.addChild((byte) 0);
        gPType14.addParent((byte) 100);
        int i23 = gPType14.getId();
        io.github.agentsoz.jill.struct.GoalPlanType gPType25 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array26 = gPType25.getChildren();
        io.github.agentsoz.jill.struct.GoalPlanType gPType28 = new io.github.agentsoz.jill.struct.GoalPlanType("");
        byte[] byte_array29 = gPType28.getChildren();
        gPType28.addChild((byte) 1);
        java.lang.String str32 = gPType28.getName();
        boolean b33 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType25, (io.github.agentsoz.jill.struct.AObject) gPType28);
        io.github.agentsoz.jill.struct.GoalPlanType gPType35 = new io.github.agentsoz.jill.struct.GoalPlanType("hi!");
        byte[] byte_array36 = gPType35.getParents();
        gPType35.setId((int) (short) 10);
        boolean b39 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType25, (io.github.agentsoz.jill.struct.AObject) gPType35);
        boolean b40 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType14, (io.github.agentsoz.jill.struct.AObject) gPType25);
        gPType25.setName("hi!:-1:-1");
        byte[] byte_array43 = gPType25.getParents();
        byte[] byte_array44 = gPType25.getChildren();
        java.lang.String str45 = gPType25.toString();
        byte[] byte_array46 = gPType25.getChildren();
        gPType25.setName("hi!:-1");
        boolean b49 = io.github.agentsoz.jill.struct.AObject.isNameEqual((io.github.agentsoz.jill.struct.AObject) gPType1, (io.github.agentsoz.jill.struct.AObject) gPType25);
        java.lang.String str50 = gPType1.toString();
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue(i7 == 100);
        org.junit.Assert.assertTrue(i10 == 100);
        org.junit.Assert.assertNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNull(byte_array15);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertNull(byte_array26);
        org.junit.Assert.assertNull(byte_array29);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(byte_array36);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(byte_array43);
        org.junit.Assert.assertNull(byte_array44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!:-1:-1:-1" + "'", str45.equals("hi!:-1:-1:-1"));
        org.junit.Assert.assertNull(byte_array46);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!:100" + "'", str50.equals("hi!:100"));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test46");
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
        byte[] byte_array18 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array16, (int) (short) 10);
        byte[] byte_array20 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array16, (int) (short) 10);
        byte[] byte_array22 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array20, 35);
        byte[] byte_array24 = io.github.agentsoz.jill.struct.GoalPlanType.grow(byte_array22, (int) (short) 100);
        org.junit.Assert.assertNull(byte_array2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(byte_array6);
        org.junit.Assert.assertNull(byte_array9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertNotNull(byte_array18);
        org.junit.Assert.assertNotNull(byte_array20);
        org.junit.Assert.assertNotNull(byte_array22);
        org.junit.Assert.assertNotNull(byte_array24);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "GPTypeRegressionTest4.test47");
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
        java.lang.String str36 = gPType28.toString();
        gPType28.setName(":10:-1");
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
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!:-1" + "'", str36.equals("hi!:-1"));
    }
}

