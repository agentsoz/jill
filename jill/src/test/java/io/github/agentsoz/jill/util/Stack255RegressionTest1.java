package io.github.agentsoz.jill.util;

/*-
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2017 by its authors. See AUTHORS file.
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
public class Stack255RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test001");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        int i6 = stack255_2.size();
        java.lang.Object obj8 = stack255_2.get((int) (short) 100);
        int i9 = stack255_2.capacity();
        java.lang.Object obj11 = stack255_2.get(0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test002");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        boolean b4 = stack255_2.isEmpty();
        int i5 = stack255_2.size();
        int i6 = stack255_2.size();
        java.lang.Object obj8 = stack255_2.get((int) (short) 1);
        java.lang.Object obj10 = stack255_2.get(0);
        boolean b11 = stack255_2.isEmpty();
        boolean b12 = stack255_2.isFull();
        java.lang.Object obj14 = stack255_2.get((int) (byte) 100);
        boolean b15 = stack255_2.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test003");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        int i3 = stack255_2.size();
        boolean b4 = stack255_2.isEmpty();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test004");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isFull();
        int i11 = stack255_2.size();
        int i12 = stack255_2.capacity();
        int i13 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test005");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        java.lang.Object obj11 = stack255_2.get((int) (short) -1);
        int i12 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i16 = stack255_15.capacity();
        int i17 = stack255_15.capacity();
        java.lang.Object obj18 = stack255_15.pop();
        java.lang.Object obj19 = stack255_15.pop();
        java.lang.Object obj20 = stack255_15.pop();
        int i21 = stack255_15.capacity();
        java.lang.Object obj23 = stack255_15.get((int) (short) 100);
        boolean b24 = stack255_2.push((java.lang.Object) stack255_15);
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 10);
        boolean b28 = stack255_2.push((java.lang.Object) (byte) 10);
        int i29 = stack255_2.capacity();
        int i30 = stack255_2.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i29 == 11);
        org.junit.Assert.assertTrue(i30 == 2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test006");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        int i11 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i15 = stack255_14.capacity();
        int i16 = stack255_14.capacity();
        java.lang.Object obj18 = stack255_14.get((int) 'a');
        java.lang.Object obj20 = stack255_14.get(100);
        java.lang.Object obj22 = stack255_14.get((int) (short) 10);
        java.lang.Object obj24 = stack255_14.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj28 = stack255_27.pop();
        boolean b29 = stack255_27.isFull();
        boolean b30 = stack255_14.push((java.lang.Object) stack255_27);
        boolean b31 = stack255_2.push((java.lang.Object) stack255_14);
        java.lang.Object obj33 = stack255_2.get((int) (byte) 100);
        boolean b34 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_37 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj39 = stack255_37.get((int) (short) 0);
        java.lang.Object obj41 = stack255_37.get((int) (byte) 10);
        boolean b42 = stack255_37.isEmpty();
        boolean b43 = stack255_2.push((java.lang.Object) b42);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test007");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        int i6 = stack255_2.capacity();
        java.lang.Object obj7 = stack255_2.pop();
        boolean b8 = stack255_2.isFull();
        int i9 = stack255_2.size();
        int i10 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test008");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isFull();
        int i11 = stack255_2.capacity();
        boolean b12 = stack255_2.isFull();
        boolean b13 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_16 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_19 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i20 = stack255_19.capacity();
        int i21 = stack255_19.capacity();
        java.lang.Object obj22 = stack255_19.pop();
        boolean b23 = stack255_19.isEmpty();
        boolean b25 = stack255_19.push((java.lang.Object) "");
        boolean b26 = stack255_16.push((java.lang.Object) "");
        boolean b27 = stack255_16.isEmpty();
        boolean b28 = stack255_16.isEmpty();
        boolean b29 = stack255_2.push((java.lang.Object) b28);
        java.lang.Object obj31 = stack255_2.get(10);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test009");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj8 = stack255_2.pop();
        int i9 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i16 = stack255_15.capacity();
        int i17 = stack255_15.capacity();
        java.lang.Object obj18 = stack255_15.pop();
        boolean b19 = stack255_15.isEmpty();
        boolean b21 = stack255_15.push((java.lang.Object) "");
        boolean b22 = stack255_12.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_25 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        java.lang.Object obj26 = null;
        boolean b27 = stack255_25.push(obj26);
        boolean b28 = stack255_12.push(obj26);
        io.github.agentsoz.jill.util.Stack255 stack255_31 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i32 = stack255_31.capacity();
        int i33 = stack255_31.capacity();
        boolean b34 = stack255_31.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_37 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj39 = stack255_37.get((int) (short) 0);
        boolean b40 = stack255_37.isFull();
        java.lang.Object obj42 = stack255_37.get((int) (short) 0);
        java.lang.Object obj44 = stack255_37.get((int) ' ');
        java.lang.Object obj46 = stack255_37.get((int) (short) -1);
        boolean b47 = stack255_31.push((java.lang.Object) (short) -1);
        boolean b48 = stack255_31.isFull();
        boolean b49 = stack255_12.push((java.lang.Object) b48);
        boolean b50 = stack255_2.push((java.lang.Object) b49);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertTrue(i33 == 1);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test010");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj3 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.get((int) (byte) -1);
        boolean b6 = stack255_2.isEmpty();
        int i7 = stack255_2.capacity();
        boolean b8 = stack255_2.isEmpty();
        java.lang.Object obj10 = stack255_2.get(0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test011");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.get((int) (byte) 1);
        boolean b6 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i10 = stack255_9.capacity();
        int i11 = stack255_9.capacity();
        java.lang.Object obj13 = stack255_9.get((int) 'a');
        java.lang.Object obj15 = stack255_9.get(100);
        int i16 = stack255_9.capacity();
        java.lang.Object obj18 = stack255_9.get((int) (short) 100);
        boolean b19 = stack255_2.push((java.lang.Object) stack255_9);
        int i20 = stack255_9.size();
        int i21 = stack255_9.size();
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test012");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_6 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) -1);
        boolean b7 = stack255_2.push((java.lang.Object) (byte) 0);
        boolean b8 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i12 = stack255_11.capacity();
        int i13 = stack255_11.capacity();
        boolean b14 = stack255_11.isFull();
        int i15 = stack255_11.capacity();
        boolean b16 = stack255_11.isFull();
        java.lang.Object obj17 = null;
        boolean b18 = stack255_11.push(obj17);
        boolean b19 = stack255_2.push((java.lang.Object) stack255_11);
        int i20 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(i20 == 255);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test013");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b3 = stack255_2.isFull();
        java.lang.Object obj5 = stack255_2.get(2);
        int i6 = stack255_2.capacity();
        java.lang.Object obj7 = stack255_2.pop();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test014");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isEmpty();
        boolean b8 = stack255_2.isFull();
        boolean b9 = stack255_2.isFull();
        boolean b10 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i14 = stack255_13.size();
        java.lang.Object obj16 = stack255_13.get((int) (short) 1);
        boolean b17 = stack255_13.isFull();
        java.lang.Object obj19 = stack255_13.get(255);
        boolean b20 = stack255_2.push((java.lang.Object) 255);
        io.github.agentsoz.jill.util.Stack255 stack255_23 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i24 = stack255_23.capacity();
        int i25 = stack255_23.capacity();
        java.lang.Object obj26 = stack255_23.pop();
        java.lang.Object obj27 = stack255_23.pop();
        java.lang.Object obj28 = stack255_23.pop();
        java.lang.Object obj30 = stack255_23.get((int) (short) 10);
        int i31 = stack255_23.size();
        int i32 = stack255_23.capacity();
        boolean b33 = stack255_2.push((java.lang.Object) i32);
        io.github.agentsoz.jill.util.Stack255 stack255_36 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i37 = stack255_36.capacity();
        int i38 = stack255_36.capacity();
        boolean b39 = stack255_36.isFull();
        int i40 = stack255_36.size();
        io.github.agentsoz.jill.util.Stack255 stack255_43 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj45 = stack255_43.get((int) (short) 0);
        boolean b46 = stack255_43.isFull();
        int i47 = stack255_43.capacity();
        boolean b48 = stack255_36.push((java.lang.Object) stack255_43);
        java.lang.Object obj49 = stack255_36.pop();
        boolean b50 = stack255_2.push((java.lang.Object) stack255_36);
        boolean b51 = stack255_36.isEmpty();
        java.lang.Object obj53 = stack255_36.get((int) (byte) 100);
        int i54 = stack255_36.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i24 == 1);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(i37 == 1);
        org.junit.Assert.assertTrue(i38 == 1);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(i54 == 1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test015");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isFull();
        int i11 = stack255_2.capacity();
        boolean b12 = stack255_2.isFull();
        boolean b13 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_16 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_19 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i20 = stack255_19.capacity();
        int i21 = stack255_19.capacity();
        java.lang.Object obj22 = stack255_19.pop();
        boolean b23 = stack255_19.isEmpty();
        boolean b25 = stack255_19.push((java.lang.Object) "");
        boolean b26 = stack255_16.push((java.lang.Object) "");
        boolean b27 = stack255_16.isEmpty();
        boolean b28 = stack255_16.isEmpty();
        boolean b29 = stack255_2.push((java.lang.Object) b28);
        boolean b30 = stack255_2.isEmpty();
        int i31 = stack255_2.size();
        int i32 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 1);
        org.junit.Assert.assertTrue(i32 == 1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test016");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        boolean b10 = stack255_2.isFull();
        boolean b11 = stack255_2.isEmpty();
        int i12 = stack255_2.capacity();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test017");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        java.lang.Object obj11 = stack255_2.get((int) (short) -1);
        boolean b12 = stack255_2.isEmpty();
        int i13 = stack255_2.capacity();
        int i14 = stack255_2.capacity();
        java.lang.Object obj15 = stack255_2.pop();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test018");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 1);
        int i3 = stack255_2.capacity();
        java.lang.Object obj4 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.get(10);
        java.lang.Object obj8 = stack255_2.get((int) 'a');
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test019");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        boolean b8 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj13 = stack255_11.get((int) (short) 0);
        boolean b14 = stack255_11.isFull();
        java.lang.Object obj16 = stack255_11.get((int) (short) 0);
        boolean b17 = stack255_11.isFull();
        java.lang.Object obj19 = stack255_11.get((int) (byte) 100);
        io.github.agentsoz.jill.util.Stack255 stack255_22 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        int i23 = stack255_22.size();
        boolean b24 = stack255_11.push((java.lang.Object) stack255_22);
        boolean b25 = stack255_2.push((java.lang.Object) b24);
        int i26 = stack255_2.capacity();
        boolean b27 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_30 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_33 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i34 = stack255_33.capacity();
        int i35 = stack255_33.capacity();
        java.lang.Object obj37 = stack255_33.get((int) 'a');
        boolean b38 = stack255_30.push((java.lang.Object) stack255_33);
        boolean b39 = stack255_33.isFull();
        boolean b40 = stack255_33.isFull();
        boolean b41 = stack255_2.push((java.lang.Object) stack255_33);
        boolean b42 = stack255_33.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test020");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        boolean b4 = stack255_2.isFull();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.get(1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test021");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isFull();
        int i11 = stack255_2.capacity();
        boolean b13 = stack255_2.push((java.lang.Object) ' ');
        int i14 = stack255_2.size();
        boolean b15 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i19 = stack255_18.capacity();
        int i20 = stack255_18.capacity();
        java.lang.Object obj21 = stack255_18.pop();
        java.lang.Object obj22 = stack255_18.pop();
        boolean b23 = stack255_18.isEmpty();
        boolean b24 = stack255_2.push((java.lang.Object) b23);
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 10);
        int i28 = stack255_27.size();
        int i29 = stack255_27.capacity();
        boolean b30 = stack255_27.isEmpty();
        int i31 = stack255_27.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_34 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 1);
        int i35 = stack255_34.capacity();
        boolean b36 = stack255_34.isEmpty();
        boolean b37 = stack255_34.isEmpty();
        boolean b38 = stack255_34.isFull();
        boolean b39 = stack255_34.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_42 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i43 = stack255_42.size();
        java.lang.Object obj45 = stack255_42.get((int) (short) 1);
        java.lang.Object obj47 = stack255_42.get((int) (byte) 1);
        int i48 = stack255_42.size();
        java.lang.Object obj50 = stack255_42.get(0);
        boolean b51 = stack255_42.isEmpty();
        boolean b52 = stack255_42.isFull();
        java.lang.Object obj54 = stack255_42.get((int) (short) 0);
        boolean b55 = stack255_34.push((java.lang.Object) (short) 0);
        int i56 = stack255_34.capacity();
        boolean b57 = stack255_34.isEmpty();
        boolean b58 = stack255_27.push((java.lang.Object) stack255_34);
        boolean b59 = stack255_2.push((java.lang.Object) stack255_34);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(i29 == 10);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(i31 == 10);
        org.junit.Assert.assertTrue(i35 == 255);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(i56 == 255);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test022");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        boolean b7 = stack255_2.push((java.lang.Object) (short) 100);
        java.lang.Object obj9 = stack255_2.get((-1));
        boolean b10 = stack255_2.isEmpty();
        java.lang.Object obj11 = stack255_2.pop();
        int i12 = stack255_2.capacity();
        java.lang.Object obj14 = stack255_2.get(0);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test023");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) -1);
        boolean b3 = stack255_2.isEmpty();
        boolean b4 = stack255_2.isEmpty();
        boolean b5 = stack255_2.isEmpty();
        java.lang.Object obj6 = null;
        boolean b7 = stack255_2.push(obj6);
        int i8 = stack255_2.size();
        boolean b9 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test024");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        java.lang.Object obj12 = stack255_2.get((int) '4');
        int i13 = stack255_2.capacity();
        boolean b14 = stack255_2.isEmpty();
        java.lang.Object obj15 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test025");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        boolean b3 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_6 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i7 = stack255_6.capacity();
        int i8 = stack255_6.capacity();
        java.lang.Object obj9 = stack255_6.pop();
        java.lang.Object obj10 = stack255_6.pop();
        java.lang.Object obj11 = stack255_6.pop();
        int i12 = stack255_6.capacity();
        boolean b13 = stack255_2.push((java.lang.Object) stack255_6);
        int i14 = stack255_6.capacity();
        java.lang.Object obj15 = stack255_6.pop();
        boolean b16 = stack255_6.isFull();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test026");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) -1);
        int i3 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_6 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i7 = stack255_6.capacity();
        int i8 = stack255_6.capacity();
        java.lang.Object obj9 = stack255_6.pop();
        java.lang.Object obj10 = stack255_6.pop();
        java.lang.Object obj11 = stack255_6.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj15 = stack255_14.pop();
        boolean b16 = stack255_14.isEmpty();
        boolean b17 = stack255_6.push((java.lang.Object) stack255_14);
        boolean b18 = stack255_6.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_21 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        java.lang.Object obj22 = stack255_21.pop();
        java.lang.Object obj24 = stack255_21.get((int) 'a');
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i28 = stack255_27.size();
        java.lang.Object obj30 = stack255_27.get((int) (short) 1);
        int i31 = stack255_27.size();
        java.lang.Object obj33 = stack255_27.get((int) (short) 100);
        int i34 = stack255_27.capacity();
        boolean b35 = stack255_21.push((java.lang.Object) stack255_27);
        boolean b36 = stack255_6.push((java.lang.Object) b35);
        int i37 = stack255_6.size();
        boolean b38 = stack255_2.push((java.lang.Object) stack255_6);
        io.github.agentsoz.jill.util.Stack255 stack255_41 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i42 = stack255_41.capacity();
        int i43 = stack255_41.capacity();
        java.lang.Object obj45 = stack255_41.get((int) 'a');
        java.lang.Object obj47 = stack255_41.get(100);
        java.lang.Object obj48 = stack255_41.pop();
        int i49 = stack255_41.capacity();
        boolean b50 = stack255_41.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_53 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b54 = stack255_53.isFull();
        boolean b56 = stack255_53.push((java.lang.Object) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_59 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b60 = stack255_53.push((java.lang.Object) stack255_59);
        boolean b61 = stack255_59.isEmpty();
        boolean b62 = stack255_41.push((java.lang.Object) stack255_59);
        boolean b63 = stack255_41.isFull();
        boolean b64 = stack255_41.isEmpty();
        boolean b65 = stack255_2.push((java.lang.Object) b64);
        io.github.agentsoz.jill.util.Stack255 stack255_68 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        boolean b69 = stack255_68.isEmpty();
        boolean b70 = stack255_2.push((java.lang.Object) b69);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(i37 == 2);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(i42 == 1);
        org.junit.Assert.assertTrue(i43 == 1);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(i49 == 1);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test027");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        java.lang.Object obj3 = null;
        boolean b4 = stack255_2.push(obj3);
        boolean b6 = stack255_2.push((java.lang.Object) 100.0f);
        boolean b7 = stack255_2.isFull();
        int i8 = stack255_2.capacity();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test028");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) -1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_8 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i9 = stack255_8.capacity();
        int i10 = stack255_8.capacity();
        java.lang.Object obj12 = stack255_8.get((int) 'a');
        boolean b13 = stack255_5.push((java.lang.Object) stack255_8);
        boolean b14 = stack255_2.push((java.lang.Object) stack255_5);
        boolean b16 = stack255_2.push((java.lang.Object) 10L);
        java.lang.Object obj18 = stack255_2.get(10);
        java.lang.Object obj19 = stack255_2.pop();
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 10L + "'", obj19.equals(10L));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test029");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i14 = stack255_13.size();
        java.lang.Object obj16 = stack255_13.get((int) (short) 1);
        java.lang.Object obj18 = stack255_13.get((int) (byte) 1);
        boolean b19 = stack255_13.isFull();
        boolean b20 = stack255_2.push((java.lang.Object) b19);
        java.lang.Object obj21 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + false + "'", obj21.equals(false));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test030");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        boolean b10 = stack255_2.isEmpty();
        boolean b11 = stack255_2.isEmpty();
        java.lang.Object obj13 = stack255_2.get(0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test031");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.size();
        int i11 = stack255_2.capacity();
        boolean b12 = stack255_2.isFull();
        boolean b13 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_16 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj17 = stack255_16.pop();
        boolean b18 = stack255_16.isEmpty();
        boolean b19 = stack255_16.isFull();
        int i20 = stack255_16.capacity();
        boolean b21 = stack255_2.push((java.lang.Object) stack255_16);
        boolean b22 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 255);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test032");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 1);
        int i3 = stack255_2.capacity();
        boolean b4 = stack255_2.isEmpty();
        boolean b5 = stack255_2.isEmpty();
        int i6 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 255);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test033");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        int i11 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i15 = stack255_14.capacity();
        int i16 = stack255_14.capacity();
        java.lang.Object obj18 = stack255_14.get((int) 'a');
        java.lang.Object obj20 = stack255_14.get(100);
        java.lang.Object obj22 = stack255_14.get((int) (short) 10);
        java.lang.Object obj24 = stack255_14.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj28 = stack255_27.pop();
        boolean b29 = stack255_27.isFull();
        boolean b30 = stack255_14.push((java.lang.Object) stack255_27);
        boolean b31 = stack255_2.push((java.lang.Object) stack255_14);
        java.lang.Object obj33 = stack255_2.get((int) (byte) 100);
        int i34 = stack255_2.size();
        int i35 = stack255_2.size();
        boolean b36 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test034");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_6 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) -1);
        boolean b7 = stack255_2.push((java.lang.Object) (byte) 0);
        boolean b8 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i12 = stack255_11.capacity();
        int i13 = stack255_11.capacity();
        boolean b14 = stack255_11.isFull();
        int i15 = stack255_11.capacity();
        boolean b16 = stack255_11.isFull();
        java.lang.Object obj17 = null;
        boolean b18 = stack255_11.push(obj17);
        boolean b19 = stack255_2.push((java.lang.Object) stack255_11);
        boolean b20 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test035");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        int i6 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b10 = stack255_9.isFull();
        boolean b12 = stack255_9.push((java.lang.Object) 1);
        int i13 = stack255_9.capacity();
        boolean b14 = stack255_9.isFull();
        boolean b15 = stack255_2.push((java.lang.Object) stack255_9);
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b19 = stack255_18.isFull();
        boolean b20 = stack255_9.push((java.lang.Object) b19);
        boolean b21 = stack255_9.isFull();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test036");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isEmpty();
        int i11 = stack255_2.capacity();
        int i12 = stack255_2.size();
        java.lang.Object obj13 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test037");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj9 = stack255_2.pop();
        int i10 = stack255_2.capacity();
        boolean b11 = stack255_2.isFull();
        java.lang.Object obj12 = stack255_2.pop();
        int i13 = stack255_2.capacity();
        int i14 = stack255_2.capacity();
        boolean b15 = stack255_2.isEmpty();
        int i16 = stack255_2.size();
        int i17 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test038");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        java.lang.Object obj11 = stack255_2.get((int) (short) -1);
        boolean b12 = stack255_2.isEmpty();
        int i13 = stack255_2.capacity();
        int i14 = stack255_2.capacity();
        boolean b15 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i19 = stack255_18.capacity();
        int i20 = stack255_18.capacity();
        boolean b21 = stack255_18.isFull();
        int i22 = stack255_18.capacity();
        java.lang.Object obj23 = stack255_18.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_26 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i27 = stack255_26.capacity();
        int i28 = stack255_26.capacity();
        java.lang.Object obj29 = stack255_26.pop();
        java.lang.Object obj30 = stack255_26.pop();
        java.lang.Object obj31 = stack255_26.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_34 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj35 = stack255_34.pop();
        boolean b36 = stack255_34.isEmpty();
        boolean b37 = stack255_26.push((java.lang.Object) stack255_34);
        boolean b38 = stack255_18.push((java.lang.Object) stack255_26);
        boolean b39 = stack255_2.push((java.lang.Object) b38);
        io.github.agentsoz.jill.util.Stack255 stack255_42 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i43 = stack255_42.capacity();
        int i44 = stack255_42.size();
        java.lang.Object obj46 = stack255_42.get((int) '#');
        boolean b47 = stack255_42.isFull();
        int i48 = stack255_42.capacity();
        boolean b49 = stack255_2.push((java.lang.Object) stack255_42);
        java.lang.Object obj51 = stack255_42.get((int) (short) 10);
        int i52 = stack255_42.capacity();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i43 == 255);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i48 == 255);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(i52 == 255);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test039");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        java.lang.Object obj4 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj8 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i12 = stack255_11.capacity();
        int i13 = stack255_11.capacity();
        java.lang.Object obj14 = stack255_11.pop();
        java.lang.Object obj15 = stack255_11.pop();
        boolean b16 = stack255_11.isFull();
        java.lang.Object obj17 = stack255_11.pop();
        boolean b18 = stack255_11.isEmpty();
        int i19 = stack255_11.capacity();
        boolean b20 = stack255_2.push((java.lang.Object) i19);
        int i21 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i21 == 1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test040");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) -1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_8 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i9 = stack255_8.capacity();
        int i10 = stack255_8.capacity();
        java.lang.Object obj12 = stack255_8.get((int) 'a');
        boolean b13 = stack255_5.push((java.lang.Object) stack255_8);
        boolean b14 = stack255_2.push((java.lang.Object) stack255_5);
        boolean b16 = stack255_2.push((java.lang.Object) 10L);
        java.lang.Object obj17 = stack255_2.pop();
        int i18 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 10L + "'", obj17.equals(10L));
        org.junit.Assert.assertTrue(i18 == 255);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test041");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        java.lang.Object obj3 = null;
        boolean b4 = stack255_2.push(obj3);
        boolean b6 = stack255_2.push((java.lang.Object) 100.0f);
        java.lang.Object obj7 = stack255_2.pop();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100.0f + "'", obj7.equals(100.0f));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test042");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        boolean b6 = stack255_2.isFull();
        int i7 = stack255_2.capacity();
        int i8 = stack255_2.capacity();
        java.lang.Object obj9 = stack255_2.pop();
        boolean b10 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test043");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.size();
        java.lang.Object obj9 = stack255_5.get((int) (short) 0);
        boolean b10 = stack255_2.push((java.lang.Object) (short) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i14 = stack255_13.capacity();
        int i15 = stack255_13.capacity();
        boolean b16 = stack255_13.isFull();
        int i17 = stack255_13.size();
        io.github.agentsoz.jill.util.Stack255 stack255_20 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj22 = stack255_20.get((int) (short) 0);
        boolean b23 = stack255_20.isFull();
        int i24 = stack255_20.capacity();
        boolean b25 = stack255_13.push((java.lang.Object) stack255_20);
        java.lang.Object obj26 = stack255_13.pop();
        boolean b27 = stack255_2.push((java.lang.Object) stack255_13);
        java.lang.Object obj29 = stack255_13.get((int) '4');
        java.lang.Object obj31 = stack255_13.get(0);
        org.junit.Assert.assertTrue(i6 == 255);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test044");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        int i4 = stack255_2.size();
        int i5 = stack255_2.capacity();
        int i6 = stack255_2.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 255);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test045");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.size();
        int i11 = stack255_2.capacity();
        boolean b12 = stack255_2.isFull();
        java.lang.Object obj13 = stack255_2.pop();
        int i14 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test046");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj8 = stack255_2.get(2);
        boolean b9 = stack255_2.isFull();
        boolean b10 = stack255_2.isEmpty();
        java.lang.Object obj11 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test047");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        int i6 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj11 = stack255_9.get((int) (short) 0);
        boolean b12 = stack255_9.isFull();
        int i13 = stack255_9.capacity();
        boolean b14 = stack255_2.push((java.lang.Object) stack255_9);
        boolean b15 = stack255_9.isFull();
        int i16 = stack255_9.capacity();
        boolean b17 = stack255_9.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test048");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isFull();
        boolean b8 = stack255_2.isFull();
        boolean b9 = stack255_2.isFull();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test049");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        int i6 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj11 = stack255_9.get((int) (short) 0);
        boolean b12 = stack255_9.isFull();
        int i13 = stack255_9.capacity();
        boolean b14 = stack255_2.push((java.lang.Object) stack255_9);
        boolean b15 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test050");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 0);
        boolean b6 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test051");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 100);
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        int i7 = stack255_2.capacity();
        int i8 = stack255_2.size();
        java.lang.Object obj10 = stack255_2.get((int) ' ');
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj14 = stack255_13.pop();
        boolean b15 = stack255_13.isEmpty();
        boolean b16 = stack255_13.isFull();
        boolean b17 = stack255_13.isEmpty();
        boolean b18 = stack255_13.isEmpty();
        boolean b19 = stack255_13.isEmpty();
        int i20 = stack255_13.size();
        java.lang.Object obj22 = stack255_13.get((int) 'a');
        boolean b23 = stack255_2.push(obj22);
        boolean b24 = stack255_2.isFull();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test052");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        int i11 = stack255_2.capacity();
        java.lang.Object obj12 = stack255_2.pop();
        boolean b14 = stack255_2.push((java.lang.Object) 1);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test053");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.get((int) (byte) 1);
        java.lang.Object obj7 = stack255_2.get((int) (short) 10);
        java.lang.Object obj9 = stack255_2.get((int) (byte) 10);
        int i10 = stack255_2.capacity();
        java.lang.Object obj12 = stack255_2.get(11);
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 255);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test054");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) -1);
        boolean b3 = stack255_2.isEmpty();
        boolean b4 = stack255_2.isEmpty();
        boolean b5 = stack255_2.isEmpty();
        java.lang.Object obj6 = null;
        boolean b7 = stack255_2.push(obj6);
        int i8 = stack255_2.capacity();
        boolean b9 = stack255_2.isEmpty();
        int i10 = stack255_2.size();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test055");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) -1);
        boolean b3 = stack255_2.isFull();
        java.lang.Object obj4 = stack255_2.pop();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test056");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        boolean b9 = stack255_5.isEmpty();
        boolean b11 = stack255_5.push((java.lang.Object) "");
        boolean b12 = stack255_2.push((java.lang.Object) "");
        boolean b13 = stack255_2.isEmpty();
        boolean b14 = stack255_2.isEmpty();
        int i15 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 100);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test057");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isFull();
        boolean b9 = stack255_2.push((java.lang.Object) 100.0d);
        int i10 = stack255_2.size();
        boolean b11 = stack255_2.isFull();
        int i12 = stack255_2.capacity();
        int i13 = stack255_2.size();
        boolean b14 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test058");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        java.lang.Object obj4 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i10 = stack255_9.capacity();
        int i11 = stack255_9.capacity();
        boolean b12 = stack255_9.isFull();
        java.lang.Object obj13 = stack255_9.pop();
        boolean b14 = stack255_2.push((java.lang.Object) stack255_9);
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i18 = stack255_17.capacity();
        int i19 = stack255_17.capacity();
        java.lang.Object obj21 = stack255_17.get((int) 'a');
        int i22 = stack255_17.capacity();
        boolean b23 = stack255_17.isFull();
        boolean b24 = stack255_17.isEmpty();
        java.lang.Object obj25 = stack255_17.pop();
        int i26 = stack255_17.size();
        boolean b27 = stack255_9.push((java.lang.Object) stack255_17);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test059");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        boolean b9 = stack255_5.isEmpty();
        boolean b11 = stack255_5.push((java.lang.Object) "");
        boolean b12 = stack255_2.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b16 = stack255_2.push((java.lang.Object) stack255_15);
        java.lang.Object obj17 = stack255_2.pop();
        int i18 = stack255_2.size();
        boolean b19 = stack255_2.isEmpty();
        int i20 = stack255_2.capacity();
        int i21 = stack255_2.size();
        int i22 = stack255_2.capacity();
        int i23 = stack255_2.size();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 100);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertTrue(i22 == 100);
        org.junit.Assert.assertTrue(i23 == 1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test060");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        int i7 = stack255_2.size();
        int i8 = stack255_2.capacity();
        int i9 = stack255_2.capacity();
        int i10 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test061");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.size();
        boolean b8 = stack255_2.isFull();
        java.lang.Object obj9 = stack255_2.pop();
        int i10 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test062");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.size();
        java.lang.Object obj8 = stack255_2.pop();
        int i9 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test063");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        int i6 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b10 = stack255_9.isFull();
        boolean b12 = stack255_9.push((java.lang.Object) 1);
        int i13 = stack255_9.capacity();
        boolean b14 = stack255_9.isFull();
        boolean b15 = stack255_2.push((java.lang.Object) stack255_9);
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b19 = stack255_18.isFull();
        boolean b20 = stack255_9.push((java.lang.Object) b19);
        int i21 = stack255_9.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_24 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i28 = stack255_27.capacity();
        int i29 = stack255_27.capacity();
        java.lang.Object obj30 = stack255_27.pop();
        boolean b31 = stack255_27.isEmpty();
        boolean b33 = stack255_27.push((java.lang.Object) "");
        boolean b34 = stack255_24.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_37 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b38 = stack255_24.push((java.lang.Object) stack255_37);
        int i39 = stack255_24.size();
        boolean b40 = stack255_9.push((java.lang.Object) i39);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i21 == 10);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(i39 == 2);
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test064");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isEmpty();
        java.lang.Object obj6 = stack255_2.pop();
        int i7 = stack255_2.size();
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test065");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        int i6 = stack255_2.capacity();
        int i7 = stack255_2.capacity();
        boolean b8 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i12 = stack255_11.capacity();
        int i13 = stack255_11.capacity();
        java.lang.Object obj14 = stack255_11.pop();
        java.lang.Object obj15 = stack255_11.pop();
        java.lang.Object obj16 = stack255_11.pop();
        boolean b17 = stack255_11.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_20 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj22 = stack255_20.get((int) (short) 0);
        boolean b23 = stack255_20.isFull();
        java.lang.Object obj25 = stack255_20.get((int) (short) 0);
        boolean b26 = stack255_20.isFull();
        java.lang.Object obj28 = stack255_20.get((int) (byte) 100);
        io.github.agentsoz.jill.util.Stack255 stack255_31 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        int i32 = stack255_31.size();
        boolean b33 = stack255_20.push((java.lang.Object) stack255_31);
        boolean b34 = stack255_11.push((java.lang.Object) b33);
        boolean b35 = stack255_2.push((java.lang.Object) b33);
        int i36 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(i36 == 1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test066");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        boolean b6 = stack255_2.isEmpty();
        int i7 = stack255_2.size();
        boolean b8 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 10);
        java.lang.Object obj12 = stack255_11.pop();
        int i13 = stack255_11.capacity();
        boolean b14 = stack255_2.push((java.lang.Object) stack255_11);
        int i15 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 100);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test067");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 100);
        io.github.agentsoz.jill.util.Stack255 stack255_7 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj9 = stack255_7.get((int) (short) 0);
        boolean b10 = stack255_7.isFull();
        java.lang.Object obj12 = stack255_7.get((int) ' ');
        int i13 = stack255_7.size();
        boolean b14 = stack255_2.push((java.lang.Object) stack255_7);
        int i15 = stack255_7.capacity();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test068");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        boolean b7 = stack255_2.push((java.lang.Object) (short) 100);
        java.lang.Object obj9 = stack255_2.get((-1));
        boolean b10 = stack255_2.isEmpty();
        java.lang.Object obj11 = stack255_2.pop();
        int i12 = stack255_2.capacity();
        boolean b13 = stack255_2.isFull();
        int i14 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test069");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i10 = stack255_9.capacity();
        int i11 = stack255_9.capacity();
        boolean b12 = stack255_9.isFull();
        int i13 = stack255_9.size();
        boolean b14 = stack255_9.isEmpty();
        boolean b15 = stack255_2.push((java.lang.Object) stack255_9);
        int i16 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test070");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.size();
        boolean b9 = stack255_2.push((java.lang.Object) (byte) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 1);
        int i13 = stack255_12.capacity();
        boolean b14 = stack255_12.isEmpty();
        boolean b15 = stack255_12.isEmpty();
        boolean b16 = stack255_12.isFull();
        boolean b17 = stack255_2.push((java.lang.Object) b16);
        java.lang.Object obj18 = stack255_2.pop();
        boolean b19 = stack255_2.isEmpty();
        int i20 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i13 == 255);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 255);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test071");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 100);
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        int i7 = stack255_2.size();
        java.lang.Object obj9 = stack255_2.get((int) (short) -1);
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i13 = stack255_12.capacity();
        int i14 = stack255_12.capacity();
        boolean b15 = stack255_12.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj19 = stack255_18.pop();
        int i20 = stack255_18.size();
        int i21 = stack255_18.capacity();
        boolean b22 = stack255_18.isEmpty();
        boolean b23 = stack255_12.push((java.lang.Object) stack255_18);
        boolean b24 = stack255_2.push((java.lang.Object) stack255_12);
        int i25 = stack255_12.size();
        boolean b26 = stack255_12.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 255);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test072");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.capacity();
        java.lang.Object obj8 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test073");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        boolean b9 = stack255_5.isEmpty();
        boolean b11 = stack255_5.push((java.lang.Object) "");
        boolean b12 = stack255_2.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b16 = stack255_2.push((java.lang.Object) stack255_15);
        io.github.agentsoz.jill.util.Stack255 stack255_19 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i20 = stack255_19.capacity();
        int i21 = stack255_19.capacity();
        java.lang.Object obj23 = stack255_19.get((int) 'a');
        java.lang.Object obj25 = stack255_19.get(100);
        int i26 = stack255_19.capacity();
        boolean b27 = stack255_2.push((java.lang.Object) stack255_19);
        java.lang.Object obj29 = stack255_2.get((int) '#');
        io.github.agentsoz.jill.util.Stack255 stack255_32 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i33 = stack255_32.capacity();
        int i34 = stack255_32.capacity();
        java.lang.Object obj36 = stack255_32.get((int) 'a');
        boolean b37 = stack255_2.push(obj36);
        io.github.agentsoz.jill.util.Stack255 stack255_40 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i41 = stack255_40.size();
        java.lang.Object obj43 = stack255_40.get((int) (short) 1);
        java.lang.Object obj45 = stack255_40.get((int) (byte) 1);
        int i46 = stack255_40.size();
        java.lang.Object obj48 = stack255_40.get(0);
        boolean b49 = stack255_40.isEmpty();
        boolean b50 = stack255_40.isFull();
        java.lang.Object obj52 = stack255_40.get((int) (short) 0);
        boolean b53 = stack255_2.push((java.lang.Object) stack255_40);
        java.lang.Object obj54 = stack255_2.pop();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i33 == 1);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(obj54);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test074");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.capacity();
        boolean b11 = stack255_2.isEmpty();
        int i12 = stack255_2.size();
        int i13 = stack255_2.size();
        int i14 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test075");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        boolean b7 = stack255_2.push((java.lang.Object) (short) 100);
        int i8 = stack255_2.capacity();
        int i9 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        boolean b13 = stack255_2.push((java.lang.Object) stack255_12);
        int i14 = stack255_12.size();
        java.lang.Object obj15 = stack255_12.pop();
        int i16 = stack255_12.size();
        int i17 = stack255_12.capacity();
        int i18 = stack255_12.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test076");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        int i6 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b10 = stack255_9.isFull();
        boolean b12 = stack255_9.push((java.lang.Object) 1);
        int i13 = stack255_9.capacity();
        boolean b14 = stack255_9.isFull();
        boolean b15 = stack255_2.push((java.lang.Object) stack255_9);
        int i16 = stack255_9.size();
        boolean b17 = stack255_9.isEmpty();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test077");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) -1);
        boolean b3 = stack255_2.isFull();
        int i4 = stack255_2.capacity();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test078");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i14 = stack255_13.capacity();
        int i15 = stack255_13.capacity();
        boolean b16 = stack255_13.isFull();
        boolean b18 = stack255_13.push((java.lang.Object) (short) 100);
        int i19 = stack255_13.capacity();
        boolean b20 = stack255_2.push((java.lang.Object) stack255_13);
        int i21 = stack255_13.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i21 == 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test079");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_6 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i7 = stack255_6.capacity();
        java.lang.Object obj9 = stack255_6.get((int) (byte) 1);
        boolean b10 = stack255_2.push(obj9);
        java.lang.Object obj11 = stack255_2.pop();
        boolean b12 = stack255_2.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i7 == 255);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test080");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.capacity();
        boolean b8 = stack255_2.isFull();
        boolean b9 = stack255_2.isEmpty();
        java.lang.Object obj10 = stack255_2.pop();
        java.lang.Object obj12 = stack255_2.get((int) (short) 1);
        boolean b13 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test081");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b3 = stack255_2.isFull();
        boolean b4 = stack255_2.isEmpty();
        java.lang.Object obj6 = stack255_2.get((int) (byte) -1);
        java.lang.Object obj7 = stack255_2.pop();
        int i8 = stack255_2.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test082");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        int i9 = stack255_2.capacity();
        java.lang.Object obj11 = stack255_2.get((int) (short) 100);
        int i12 = stack255_2.size();
        int i13 = stack255_2.capacity();
        int i14 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test083");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        int i6 = stack255_2.size();
        java.lang.Object obj8 = stack255_2.get((int) (short) 100);
        int i9 = stack255_2.capacity();
        boolean b10 = stack255_2.isEmpty();
        boolean b11 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test084");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.capacity();
        boolean b8 = stack255_2.isFull();
        boolean b10 = stack255_2.push((java.lang.Object) 0L);
        java.lang.Object obj11 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) -1);
        boolean b15 = stack255_14.isFull();
        boolean b16 = stack255_2.push((java.lang.Object) stack255_14);
        java.lang.Object obj17 = stack255_14.pop();
        boolean b18 = stack255_14.isEmpty();
        boolean b19 = stack255_14.isFull();
        int i20 = stack255_14.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 255);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test085");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        int i5 = stack255_2.capacity();
        boolean b6 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i10 = stack255_9.capacity();
        int i11 = stack255_9.capacity();
        java.lang.Object obj12 = stack255_9.pop();
        java.lang.Object obj13 = stack255_9.pop();
        java.lang.Object obj14 = stack255_9.pop();
        java.lang.Object obj16 = stack255_9.get((int) (short) 10);
        boolean b17 = stack255_9.isFull();
        int i18 = stack255_9.capacity();
        int i19 = stack255_9.size();
        java.lang.Object obj20 = stack255_9.pop();
        int i21 = stack255_9.capacity();
        boolean b22 = stack255_9.isFull();
        boolean b23 = stack255_9.isEmpty();
        boolean b24 = stack255_2.push((java.lang.Object) stack255_9);
        int i25 = stack255_2.capacity();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i25 == 11);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test086");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isFull();
        int i11 = stack255_2.capacity();
        boolean b12 = stack255_2.isFull();
        boolean b13 = stack255_2.isFull();
        java.lang.Object obj15 = stack255_2.get((-1));
        java.lang.Object obj16 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_19 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i20 = stack255_19.capacity();
        int i21 = stack255_19.capacity();
        java.lang.Object obj23 = stack255_19.get((int) 'a');
        int i24 = stack255_19.capacity();
        boolean b25 = stack255_19.isFull();
        boolean b27 = stack255_19.push((java.lang.Object) 0L);
        java.lang.Object obj28 = stack255_19.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_31 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) -1);
        boolean b32 = stack255_31.isFull();
        boolean b33 = stack255_19.push((java.lang.Object) stack255_31);
        boolean b34 = stack255_2.push((java.lang.Object) stack255_19);
        int i35 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i24 == 1);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(i35 == 1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test087");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b3 = stack255_2.isFull();
        java.lang.Object obj5 = stack255_2.get(2);
        int i6 = stack255_2.capacity();
        int i7 = stack255_2.capacity();
        boolean b8 = stack255_2.isEmpty();
        java.lang.Object obj9 = stack255_2.pop();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test088");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) -1);
        boolean b3 = stack255_2.isEmpty();
        boolean b5 = stack255_2.push((java.lang.Object) 10L);
        io.github.agentsoz.jill.util.Stack255 stack255_8 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i9 = stack255_8.capacity();
        int i10 = stack255_8.capacity();
        boolean b11 = stack255_8.isFull();
        int i12 = stack255_8.capacity();
        java.lang.Object obj13 = stack255_8.pop();
        boolean b14 = stack255_8.isFull();
        boolean b15 = stack255_8.isEmpty();
        int i16 = stack255_8.size();
        boolean b17 = stack255_2.push((java.lang.Object) i16);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test089");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        java.lang.Object obj12 = stack255_2.get((int) '4');
        int i13 = stack255_2.capacity();
        boolean b14 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i18 = stack255_17.capacity();
        int i19 = stack255_17.capacity();
        java.lang.Object obj21 = stack255_17.get((int) 'a');
        int i22 = stack255_17.capacity();
        boolean b23 = stack255_17.isFull();
        boolean b24 = stack255_17.isEmpty();
        boolean b26 = stack255_17.push((java.lang.Object) false);
        java.lang.Object obj28 = stack255_17.get((int) (byte) 10);
        boolean b29 = stack255_17.isFull();
        boolean b30 = stack255_2.push((java.lang.Object) b29);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test090");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj3 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.get((int) (byte) -1);
        boolean b6 = stack255_2.isEmpty();
        int i7 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i11 = stack255_10.size();
        java.lang.Object obj13 = stack255_10.get((int) (short) 1);
        int i14 = stack255_10.size();
        java.lang.Object obj16 = stack255_10.get((int) (short) 100);
        int i17 = stack255_10.capacity();
        boolean b18 = stack255_2.push((java.lang.Object) stack255_10);
        io.github.agentsoz.jill.util.Stack255 stack255_21 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_24 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i25 = stack255_24.capacity();
        java.lang.Object obj26 = stack255_24.pop();
        java.lang.Object obj27 = null;
        boolean b28 = stack255_24.push(obj27);
        boolean b29 = stack255_21.push((java.lang.Object) b28);
        boolean b30 = stack255_10.push((java.lang.Object) b29);
        boolean b31 = stack255_10.isEmpty();
        java.lang.Object obj33 = stack255_10.get((int) (byte) 100);
        java.lang.Object obj35 = stack255_10.get((int) (short) 1);
        java.lang.Object obj36 = stack255_10.pop();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i25 == 255);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + true + "'", obj36.equals(true));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test091");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isFull();
        java.lang.Object obj9 = stack255_2.get((int) (short) 0);
        boolean b10 = stack255_2.isFull();
        java.lang.Object obj11 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test092");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) -1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_8 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i9 = stack255_8.capacity();
        int i10 = stack255_8.capacity();
        java.lang.Object obj12 = stack255_8.get((int) 'a');
        boolean b13 = stack255_5.push((java.lang.Object) stack255_8);
        boolean b14 = stack255_2.push((java.lang.Object) stack255_5);
        boolean b16 = stack255_2.push((java.lang.Object) 10L);
        java.lang.Object obj17 = stack255_2.pop();
        java.lang.Object obj19 = stack255_2.get((int) '4');
        boolean b20 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 10L + "'", obj17.equals(10L));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test093");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        int i3 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_6 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj8 = stack255_6.get((int) (short) 0);
        boolean b9 = stack255_6.isFull();
        java.lang.Object obj11 = stack255_6.get((int) (short) 0);
        java.lang.Object obj12 = stack255_6.pop();
        boolean b13 = stack255_6.isEmpty();
        boolean b14 = stack255_2.push((java.lang.Object) stack255_6);
        int i15 = stack255_6.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i19 = stack255_18.capacity();
        int i20 = stack255_18.size();
        java.lang.Object obj22 = stack255_18.get((int) (short) 0);
        int i23 = stack255_18.capacity();
        boolean b24 = stack255_18.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i28 = stack255_27.capacity();
        int i29 = stack255_27.capacity();
        boolean b30 = stack255_27.isFull();
        int i31 = stack255_27.capacity();
        int i32 = stack255_27.capacity();
        boolean b33 = stack255_18.push((java.lang.Object) stack255_27);
        java.lang.Object obj34 = stack255_18.pop();
        int i35 = stack255_18.size();
        boolean b36 = stack255_18.isFull();
        java.lang.Object obj37 = stack255_18.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_40 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj42 = stack255_40.get((int) (short) 0);
        boolean b43 = stack255_40.isFull();
        java.lang.Object obj45 = stack255_40.get((int) ' ');
        int i46 = stack255_40.size();
        boolean b47 = stack255_40.isEmpty();
        boolean b48 = stack255_18.push((java.lang.Object) stack255_40);
        boolean b49 = stack255_40.isFull();
        boolean b50 = stack255_6.push((java.lang.Object) b49);
        java.lang.Object obj51 = stack255_6.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_54 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        java.lang.Object obj56 = stack255_54.get((int) (byte) -1);
        boolean b58 = stack255_54.push((java.lang.Object) (-1.0d));
        boolean b59 = stack255_54.isFull();
        int i60 = stack255_54.capacity();
        boolean b61 = stack255_54.isFull();
        boolean b62 = stack255_6.push((java.lang.Object) stack255_54);
        boolean b63 = stack255_6.isEmpty();
        boolean b64 = stack255_6.isFull();
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i19 == 255);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i23 == 255);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 1);
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + false + "'", obj51.equals(false));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i60 == 100);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test094");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i11 = stack255_10.size();
        java.lang.Object obj13 = stack255_10.get((int) (short) 1);
        java.lang.Object obj15 = stack255_10.get((int) (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj20 = stack255_18.get((int) (short) 100);
        java.lang.Object obj21 = stack255_18.pop();
        java.lang.Object obj22 = stack255_18.pop();
        int i23 = stack255_18.size();
        int i24 = stack255_18.size();
        boolean b25 = stack255_10.push((java.lang.Object) stack255_18);
        boolean b26 = stack255_2.push((java.lang.Object) stack255_18);
        io.github.agentsoz.jill.util.Stack255 stack255_29 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i30 = stack255_29.capacity();
        int i31 = stack255_29.capacity();
        boolean b32 = stack255_29.isEmpty();
        boolean b33 = stack255_29.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_36 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i37 = stack255_36.capacity();
        int i38 = stack255_36.size();
        java.lang.Object obj40 = stack255_36.get((int) (short) 0);
        int i41 = stack255_36.capacity();
        boolean b42 = stack255_36.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_45 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i46 = stack255_45.capacity();
        int i47 = stack255_45.capacity();
        boolean b48 = stack255_45.isFull();
        int i49 = stack255_45.capacity();
        int i50 = stack255_45.capacity();
        boolean b51 = stack255_36.push((java.lang.Object) stack255_45);
        boolean b52 = stack255_29.push((java.lang.Object) stack255_45);
        int i53 = stack255_29.capacity();
        java.lang.Object obj54 = stack255_29.pop();
        boolean b55 = stack255_2.push(obj54);
        int i56 = stack255_2.capacity();
        int i57 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertTrue(i31 == 1);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i37 == 255);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(i41 == 255);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i46 == 1);
        org.junit.Assert.assertTrue(i47 == 1);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i49 == 1);
        org.junit.Assert.assertTrue(i50 == 1);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(i53 == 1);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(i56 == 255);
        org.junit.Assert.assertTrue(i57 == 2);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test095");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj9 = stack255_2.pop();
        int i10 = stack255_2.capacity();
        boolean b11 = stack255_2.isFull();
        java.lang.Object obj12 = stack255_2.pop();
        java.lang.Object obj13 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_16 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i17 = stack255_16.capacity();
        int i18 = stack255_16.capacity();
        java.lang.Object obj19 = stack255_16.pop();
        java.lang.Object obj20 = stack255_16.pop();
        boolean b21 = stack255_16.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_24 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i25 = stack255_24.capacity();
        int i26 = stack255_24.capacity();
        java.lang.Object obj28 = stack255_24.get((int) 'a');
        java.lang.Object obj30 = stack255_24.get(100);
        int i31 = stack255_24.capacity();
        java.lang.Object obj33 = stack255_24.get((int) (short) 100);
        boolean b34 = stack255_16.push((java.lang.Object) stack255_24);
        boolean b35 = stack255_2.push((java.lang.Object) stack255_16);
        int i36 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 1);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(i36 == 1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test096");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        java.lang.Object obj6 = stack255_2.get((int) (byte) 10);
        boolean b8 = stack255_2.push((java.lang.Object) 10);
        int i9 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) -1);
        boolean b13 = stack255_12.isEmpty();
        boolean b14 = stack255_12.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i18 = stack255_17.capacity();
        int i19 = stack255_17.capacity();
        boolean b20 = stack255_17.isFull();
        int i21 = stack255_17.size();
        io.github.agentsoz.jill.util.Stack255 stack255_24 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj26 = stack255_24.get((int) (short) 0);
        boolean b27 = stack255_24.isFull();
        int i28 = stack255_24.capacity();
        boolean b29 = stack255_17.push((java.lang.Object) stack255_24);
        java.lang.Object obj30 = stack255_17.pop();
        boolean b31 = stack255_12.push((java.lang.Object) stack255_17);
        boolean b32 = stack255_12.isEmpty();
        int i33 = stack255_12.capacity();
        boolean b34 = stack255_2.push((java.lang.Object) stack255_12);
        int i35 = stack255_2.size();
        java.lang.Object obj36 = stack255_2.pop();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 10);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test097");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.size();
        int i11 = stack255_2.capacity();
        boolean b12 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i19 = stack255_18.capacity();
        int i20 = stack255_18.capacity();
        java.lang.Object obj21 = stack255_18.pop();
        java.lang.Object obj22 = stack255_18.pop();
        java.lang.Object obj23 = stack255_18.pop();
        java.lang.Object obj25 = stack255_18.get((int) (short) 10);
        int i26 = stack255_18.size();
        boolean b27 = stack255_15.push((java.lang.Object) stack255_18);
        boolean b28 = stack255_2.push((java.lang.Object) stack255_18);
        int i29 = stack255_18.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i29 == 1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test098");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        int i6 = stack255_5.capacity();
        java.lang.Object obj7 = stack255_5.pop();
        java.lang.Object obj9 = stack255_5.get(0);
        int i10 = stack255_5.capacity();
        java.lang.Object obj11 = stack255_5.pop();
        boolean b12 = stack255_2.push((java.lang.Object) stack255_5);
        boolean b13 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test099");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.capacity();
        boolean b8 = stack255_2.isFull();
        boolean b9 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i13 = stack255_12.capacity();
        int i14 = stack255_12.capacity();
        java.lang.Object obj16 = stack255_12.get((int) 'a');
        java.lang.Object obj18 = stack255_12.get(100);
        int i19 = stack255_12.capacity();
        java.lang.Object obj21 = stack255_12.get((int) (short) 100);
        boolean b22 = stack255_2.push(obj21);
        io.github.agentsoz.jill.util.Stack255 stack255_25 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i26 = stack255_25.capacity();
        int i27 = stack255_25.capacity();
        java.lang.Object obj28 = stack255_25.pop();
        java.lang.Object obj29 = stack255_25.pop();
        boolean b30 = stack255_25.isEmpty();
        boolean b31 = stack255_25.isFull();
        boolean b32 = stack255_25.isFull();
        boolean b33 = stack255_25.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_36 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i37 = stack255_36.size();
        java.lang.Object obj39 = stack255_36.get((int) (short) 1);
        boolean b40 = stack255_36.isFull();
        java.lang.Object obj42 = stack255_36.get(255);
        boolean b43 = stack255_25.push((java.lang.Object) 255);
        io.github.agentsoz.jill.util.Stack255 stack255_46 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i47 = stack255_46.capacity();
        int i48 = stack255_46.capacity();
        java.lang.Object obj49 = stack255_46.pop();
        java.lang.Object obj50 = stack255_46.pop();
        java.lang.Object obj51 = stack255_46.pop();
        java.lang.Object obj53 = stack255_46.get((int) (short) 10);
        int i54 = stack255_46.size();
        int i55 = stack255_46.capacity();
        boolean b56 = stack255_25.push((java.lang.Object) i55);
        boolean b57 = stack255_2.push((java.lang.Object) i55);
        boolean b58 = stack255_2.isFull();
        java.lang.Object obj59 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(i47 == 1);
        org.junit.Assert.assertTrue(i48 == 1);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue(i55 == 1);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 1 + "'", obj59.equals(1));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test100");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        boolean b9 = stack255_5.isEmpty();
        boolean b11 = stack255_5.push((java.lang.Object) "");
        boolean b12 = stack255_2.push((java.lang.Object) "");
        boolean b13 = stack255_2.isEmpty();
        int i14 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 100);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test101");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.size();
        int i11 = stack255_2.capacity();
        java.lang.Object obj13 = stack255_2.get((int) (short) 100);
        int i14 = stack255_2.size();
        java.lang.Object obj15 = stack255_2.pop();
        java.lang.Object obj17 = stack255_2.get(0);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test102");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b3 = stack255_2.isFull();
        boolean b5 = stack255_2.push((java.lang.Object) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_8 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj10 = stack255_8.get((int) (short) 0);
        boolean b11 = stack255_8.isEmpty();
        java.lang.Object obj13 = stack255_8.get(0);
        boolean b14 = stack255_2.push((java.lang.Object) stack255_8);
        boolean b15 = stack255_8.isFull();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test103");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        java.lang.Object obj4 = stack255_2.get((int) (byte) -1);
        boolean b6 = stack255_2.push((java.lang.Object) (-1.0d));
        boolean b8 = stack255_2.push((java.lang.Object) 1);
        int i9 = stack255_2.size();
        boolean b10 = stack255_2.isFull();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test104");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        boolean b4 = stack255_2.isEmpty();
        boolean b5 = stack255_2.isFull();
        boolean b6 = stack255_2.isEmpty();
        int i7 = stack255_2.capacity();
        java.lang.Object obj8 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i15 = stack255_14.capacity();
        int i16 = stack255_14.capacity();
        java.lang.Object obj17 = stack255_14.pop();
        boolean b18 = stack255_14.isEmpty();
        boolean b20 = stack255_14.push((java.lang.Object) "");
        boolean b21 = stack255_11.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_24 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b25 = stack255_11.push((java.lang.Object) stack255_24);
        io.github.agentsoz.jill.util.Stack255 stack255_28 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i29 = stack255_28.capacity();
        int i30 = stack255_28.capacity();
        java.lang.Object obj32 = stack255_28.get((int) 'a');
        java.lang.Object obj34 = stack255_28.get(100);
        int i35 = stack255_28.capacity();
        boolean b36 = stack255_11.push((java.lang.Object) stack255_28);
        java.lang.Object obj37 = stack255_11.pop();
        boolean b38 = stack255_2.push(obj37);
        int i39 = stack255_2.capacity();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 255);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(i39 == 255);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test105");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 100);
        java.lang.Object obj5 = stack255_2.pop();
        int i6 = stack255_2.capacity();
        java.lang.Object obj7 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i11 = stack255_10.capacity();
        int i12 = stack255_10.capacity();
        boolean b13 = stack255_10.isFull();
        boolean b15 = stack255_10.push((java.lang.Object) (short) 100);
        boolean b16 = stack255_2.push((java.lang.Object) (short) 100);
        java.lang.Object obj18 = stack255_2.get((int) '4');
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test106");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        boolean b9 = stack255_5.isEmpty();
        boolean b11 = stack255_5.push((java.lang.Object) "");
        boolean b12 = stack255_2.push((java.lang.Object) "");
        boolean b13 = stack255_2.isEmpty();
        boolean b14 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i18 = stack255_17.capacity();
        int i19 = stack255_17.capacity();
        java.lang.Object obj21 = stack255_17.get((int) 'a');
        java.lang.Object obj23 = stack255_17.get(100);
        boolean b24 = stack255_2.push(obj23);
        int i25 = stack255_2.capacity();
        java.lang.Object obj27 = stack255_2.get(0);
        boolean b28 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i25 == 100);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "" + "'", obj27.equals(""));
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test107");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        java.lang.Object obj4 = stack255_2.pop();
        java.lang.Object obj5 = null;
        boolean b6 = stack255_2.push(obj5);
        java.lang.Object obj8 = stack255_2.get((int) 'a');
        int i9 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 255);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test108");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        boolean b4 = stack255_2.isEmpty();
        int i5 = stack255_2.size();
        int i6 = stack255_2.capacity();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 255);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test109");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isFull();
        boolean b9 = stack255_2.push((java.lang.Object) 100.0d);
        java.lang.Object obj11 = stack255_2.get(0);
        int i12 = stack255_2.capacity();
        boolean b13 = stack255_2.isEmpty();
        boolean b14 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0d + "'", obj11.equals(100.0d));
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test110");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isEmpty();
        java.lang.Object obj6 = stack255_2.pop();
        int i7 = stack255_2.size();
        java.lang.Object obj8 = stack255_2.pop();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test111");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isEmpty();
        int i6 = stack255_2.size();
        boolean b7 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i14 = stack255_13.capacity();
        int i15 = stack255_13.capacity();
        java.lang.Object obj16 = stack255_13.pop();
        boolean b17 = stack255_13.isEmpty();
        boolean b19 = stack255_13.push((java.lang.Object) "");
        boolean b20 = stack255_10.push((java.lang.Object) "");
        boolean b21 = stack255_2.push((java.lang.Object) stack255_10);
        boolean b22 = stack255_2.isEmpty();
        int i23 = stack255_2.size();
        int i24 = stack255_2.capacity();
        java.lang.Object obj26 = stack255_2.get((int) '4');
        int i27 = stack255_2.capacity();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertTrue(i24 == 11);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 11);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test112");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        java.lang.Object obj6 = stack255_2.get((int) (byte) 10);
        boolean b8 = stack255_2.push((java.lang.Object) 10);
        int i9 = stack255_2.capacity();
        boolean b10 = stack255_2.isFull();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 11);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test113");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b3 = stack255_2.isFull();
        boolean b5 = stack255_2.push((java.lang.Object) 1);
        java.lang.Object obj7 = stack255_2.get(100);
        int i8 = stack255_2.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test114");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        boolean b9 = stack255_5.isEmpty();
        boolean b11 = stack255_5.push((java.lang.Object) "");
        boolean b12 = stack255_2.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b16 = stack255_2.push((java.lang.Object) stack255_15);
        boolean b17 = stack255_2.isEmpty();
        java.lang.Object obj19 = stack255_2.get((int) (short) 100);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test115");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i11 = stack255_10.size();
        java.lang.Object obj13 = stack255_10.get((int) (short) 1);
        java.lang.Object obj15 = stack255_10.get((int) (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj20 = stack255_18.get((int) (short) 100);
        java.lang.Object obj21 = stack255_18.pop();
        java.lang.Object obj22 = stack255_18.pop();
        int i23 = stack255_18.size();
        int i24 = stack255_18.size();
        boolean b25 = stack255_10.push((java.lang.Object) stack255_18);
        boolean b26 = stack255_2.push((java.lang.Object) stack255_18);
        io.github.agentsoz.jill.util.Stack255 stack255_29 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i30 = stack255_29.capacity();
        int i31 = stack255_29.capacity();
        java.lang.Object obj32 = stack255_29.pop();
        java.lang.Object obj33 = stack255_29.pop();
        java.lang.Object obj34 = stack255_29.pop();
        java.lang.Object obj36 = stack255_29.get((int) (short) 10);
        java.lang.Object obj37 = stack255_29.pop();
        boolean b38 = stack255_2.push((java.lang.Object) stack255_29);
        boolean b39 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertTrue(i31 == 1);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test116");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        java.lang.Object obj12 = stack255_2.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj16 = stack255_15.pop();
        boolean b17 = stack255_15.isFull();
        boolean b18 = stack255_2.push((java.lang.Object) stack255_15);
        java.lang.Object obj20 = stack255_15.get((int) 'a');
        java.lang.Object obj21 = stack255_15.pop();
        java.lang.Object obj23 = stack255_15.get((int) (short) 0);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test117");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.size();
        int i11 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i15 = stack255_14.capacity();
        int i16 = stack255_14.capacity();
        boolean b17 = stack255_2.push((java.lang.Object) stack255_14);
        boolean b18 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_21 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b22 = stack255_21.isFull();
        boolean b24 = stack255_21.push((java.lang.Object) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj29 = stack255_27.get((int) (short) 0);
        boolean b30 = stack255_27.isEmpty();
        java.lang.Object obj32 = stack255_27.get(0);
        boolean b33 = stack255_21.push((java.lang.Object) stack255_27);
        io.github.agentsoz.jill.util.Stack255 stack255_36 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj37 = stack255_36.pop();
        boolean b39 = stack255_36.push((java.lang.Object) true);
        int i40 = stack255_36.size();
        java.lang.Object obj41 = stack255_36.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_44 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj45 = stack255_44.pop();
        java.lang.Object obj47 = stack255_44.get((int) (byte) -1);
        boolean b48 = stack255_44.isEmpty();
        int i49 = stack255_44.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_52 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i53 = stack255_52.size();
        java.lang.Object obj55 = stack255_52.get((int) (short) 1);
        int i56 = stack255_52.size();
        java.lang.Object obj58 = stack255_52.get((int) (short) 100);
        int i59 = stack255_52.capacity();
        boolean b60 = stack255_44.push((java.lang.Object) stack255_52);
        io.github.agentsoz.jill.util.Stack255 stack255_63 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_66 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i67 = stack255_66.capacity();
        java.lang.Object obj68 = stack255_66.pop();
        java.lang.Object obj69 = null;
        boolean b70 = stack255_66.push(obj69);
        boolean b71 = stack255_63.push((java.lang.Object) b70);
        boolean b72 = stack255_52.push((java.lang.Object) b71);
        boolean b73 = stack255_52.isEmpty();
        boolean b74 = stack255_52.isEmpty();
        boolean b75 = stack255_36.push((java.lang.Object) stack255_52);
        java.lang.Object obj76 = stack255_36.pop();
        boolean b77 = stack255_21.push((java.lang.Object) stack255_36);
        boolean b78 = stack255_2.push((java.lang.Object) stack255_36);
        io.github.agentsoz.jill.util.Stack255 stack255_81 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i82 = stack255_81.capacity();
        int i83 = stack255_81.capacity();
        boolean b84 = stack255_81.isFull();
        boolean b86 = stack255_81.push((java.lang.Object) (short) 100);
        java.lang.Object obj88 = stack255_81.get((-1));
        boolean b89 = stack255_81.isEmpty();
        java.lang.Object obj90 = stack255_81.pop();
        int i91 = stack255_81.capacity();
        java.lang.Object obj93 = stack255_81.get((int) '4');
        boolean b94 = stack255_2.push((java.lang.Object) stack255_81);
        boolean b95 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i15 == 255);
        org.junit.Assert.assertTrue(i16 == 255);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i40 == 1);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + true + "'", obj41.equals(true));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(i49 == 10);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(i59 == 1);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(i67 == 255);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(i82 == 1);
        org.junit.Assert.assertTrue(i83 == 1);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + (short) 100 + "'", obj90.equals((short) 100));
        org.junit.Assert.assertTrue(i91 == 1);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue(b94 == true);
        org.junit.Assert.assertTrue(b95 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test118");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isEmpty();
        int i6 = stack255_2.size();
        boolean b7 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test119");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        boolean b8 = stack255_2.isFull();
        java.lang.Object obj10 = stack255_2.get((int) (byte) 100);
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        int i14 = stack255_13.size();
        boolean b15 = stack255_2.push((java.lang.Object) stack255_13);
        int i16 = stack255_13.capacity();
        java.lang.Object obj17 = stack255_13.pop();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test120");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        int i6 = stack255_2.capacity();
        java.lang.Object obj8 = stack255_2.get(255);
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj12 = stack255_11.pop();
        java.lang.Object obj13 = stack255_11.pop();
        java.lang.Object obj14 = stack255_11.pop();
        boolean b15 = stack255_11.isEmpty();
        int i16 = stack255_11.capacity();
        boolean b17 = stack255_2.push((java.lang.Object) stack255_11);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 255);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test121");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.get((int) (byte) 1);
        java.lang.Object obj7 = stack255_2.get((int) (short) 10);
        int i8 = stack255_2.capacity();
        java.lang.Object obj9 = stack255_2.pop();
        boolean b10 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 255);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test122");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        boolean b7 = stack255_2.push((java.lang.Object) (short) 100);
        int i8 = stack255_2.capacity();
        int i9 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        boolean b13 = stack255_2.push((java.lang.Object) stack255_12);
        int i14 = stack255_12.size();
        java.lang.Object obj15 = stack255_12.pop();
        int i16 = stack255_12.size();
        boolean b17 = stack255_12.isEmpty();
        int i18 = stack255_12.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test123");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj8 = stack255_2.get(2);
        boolean b9 = stack255_2.isFull();
        int i10 = stack255_2.capacity();
        java.lang.Object obj12 = stack255_2.get(0);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test124");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        boolean b4 = stack255_2.isFull();
        boolean b5 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_8 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i9 = stack255_8.capacity();
        java.lang.Object obj10 = stack255_8.pop();
        java.lang.Object obj11 = stack255_8.pop();
        java.lang.Object obj12 = stack255_8.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i16 = stack255_15.capacity();
        int i17 = stack255_15.capacity();
        boolean b18 = stack255_15.isFull();
        java.lang.Object obj19 = stack255_15.pop();
        boolean b20 = stack255_8.push((java.lang.Object) stack255_15);
        int i21 = stack255_8.size();
        boolean b22 = stack255_2.push((java.lang.Object) i21);
        int i23 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(i23 == 1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test125");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        boolean b9 = stack255_5.isEmpty();
        boolean b11 = stack255_5.push((java.lang.Object) "");
        boolean b12 = stack255_2.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b16 = stack255_2.push((java.lang.Object) stack255_15);
        java.lang.Object obj17 = stack255_2.pop();
        boolean b18 = stack255_2.isFull();
        boolean b19 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test126");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 100);
        int i5 = stack255_2.size();
        java.lang.Object obj7 = stack255_2.get((int) (short) 10);
        boolean b8 = stack255_2.isEmpty();
        java.lang.Object obj10 = stack255_2.get((int) (byte) -1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test127");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.get(1);
        boolean b6 = stack255_2.isFull();
        int i7 = stack255_2.capacity();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test128");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        boolean b9 = stack255_5.isEmpty();
        boolean b11 = stack255_5.push((java.lang.Object) "");
        boolean b12 = stack255_2.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b16 = stack255_2.push((java.lang.Object) stack255_15);
        java.lang.Object obj17 = stack255_2.pop();
        int i18 = stack255_2.size();
        boolean b19 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_22 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) -1);
        io.github.agentsoz.jill.util.Stack255 stack255_25 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i26 = stack255_25.capacity();
        int i27 = stack255_25.capacity();
        java.lang.Object obj28 = stack255_25.pop();
        java.lang.Object obj29 = stack255_25.pop();
        java.lang.Object obj30 = stack255_25.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_33 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj34 = stack255_33.pop();
        boolean b35 = stack255_33.isEmpty();
        boolean b36 = stack255_25.push((java.lang.Object) stack255_33);
        boolean b37 = stack255_22.push((java.lang.Object) stack255_33);
        boolean b38 = stack255_2.push((java.lang.Object) stack255_22);
        int i39 = stack255_22.capacity();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(i39 == 10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test129");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isEmpty();
        int i6 = stack255_2.size();
        boolean b7 = stack255_2.isFull();
        int i8 = stack255_2.capacity();
        java.lang.Object obj9 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i13 = stack255_12.capacity();
        int i14 = stack255_12.capacity();
        boolean b15 = stack255_12.isFull();
        boolean b17 = stack255_12.push((java.lang.Object) (short) 100);
        int i18 = stack255_12.capacity();
        int i19 = stack255_12.size();
        boolean b20 = stack255_12.isEmpty();
        boolean b21 = stack255_12.isFull();
        boolean b22 = stack255_12.isFull();
        boolean b23 = stack255_2.push((java.lang.Object) b22);
        boolean b24 = stack255_2.isFull();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test130");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (byte) -1);
        boolean b5 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_8 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i9 = stack255_8.capacity();
        int i10 = stack255_8.capacity();
        java.lang.Object obj12 = stack255_8.get((int) 'a');
        java.lang.Object obj14 = stack255_8.get(100);
        java.lang.Object obj16 = stack255_8.get((int) (short) 10);
        java.lang.Object obj18 = stack255_8.get((int) (short) 10);
        int i19 = stack255_8.capacity();
        boolean b20 = stack255_2.push((java.lang.Object) stack255_8);
        java.lang.Object obj22 = stack255_2.get((int) (byte) -1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test131");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        int i4 = stack255_2.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test132");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i14 = stack255_13.capacity();
        int i15 = stack255_13.capacity();
        boolean b16 = stack255_13.isFull();
        boolean b18 = stack255_13.push((java.lang.Object) (short) 100);
        int i19 = stack255_13.capacity();
        boolean b20 = stack255_2.push((java.lang.Object) stack255_13);
        java.lang.Object obj21 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test133");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.size();
        boolean b9 = stack255_2.push((java.lang.Object) (byte) 10);
        boolean b10 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i14 = stack255_13.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj19 = stack255_17.get((int) (short) 0);
        boolean b20 = stack255_17.isFull();
        java.lang.Object obj22 = stack255_17.get((int) ' ');
        int i23 = stack255_17.size();
        java.lang.Object obj25 = stack255_17.get((int) (byte) 0);
        boolean b26 = stack255_13.push((java.lang.Object) stack255_17);
        java.lang.Object obj27 = stack255_13.pop();
        boolean b28 = stack255_2.push((java.lang.Object) stack255_13);
        int i29 = stack255_2.capacity();
        boolean b30 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i29 == 255);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test134");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.size();
        java.lang.Object obj6 = stack255_2.get((int) (short) 0);
        int i7 = stack255_2.capacity();
        boolean b8 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i12 = stack255_11.capacity();
        int i13 = stack255_11.capacity();
        boolean b14 = stack255_11.isFull();
        int i15 = stack255_11.capacity();
        int i16 = stack255_11.capacity();
        boolean b17 = stack255_2.push((java.lang.Object) stack255_11);
        java.lang.Object obj18 = stack255_2.pop();
        int i19 = stack255_2.size();
        boolean b20 = stack255_2.isFull();
        java.lang.Object obj21 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_24 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj26 = stack255_24.get((int) (short) 0);
        boolean b27 = stack255_24.isFull();
        java.lang.Object obj29 = stack255_24.get((int) ' ');
        int i30 = stack255_24.size();
        boolean b31 = stack255_24.isEmpty();
        boolean b32 = stack255_2.push((java.lang.Object) stack255_24);
        boolean b33 = stack255_24.isFull();
        int i34 = stack255_24.capacity();
        boolean b35 = stack255_24.isFull();
        boolean b36 = stack255_24.isFull();
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 255);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test135");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 100);
        java.lang.Object obj6 = stack255_2.get((int) '#');
        boolean b7 = stack255_2.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test136");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        java.lang.Object obj12 = stack255_2.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj16 = stack255_15.pop();
        boolean b17 = stack255_15.isFull();
        boolean b18 = stack255_2.push((java.lang.Object) stack255_15);
        java.lang.Object obj20 = stack255_15.get((int) 'a');
        boolean b21 = stack255_15.isEmpty();
        int i22 = stack255_15.capacity();
        boolean b23 = stack255_15.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i22 == 10);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test137");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        int i6 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b10 = stack255_9.isFull();
        boolean b12 = stack255_9.push((java.lang.Object) 1);
        int i13 = stack255_9.capacity();
        boolean b14 = stack255_9.isFull();
        boolean b15 = stack255_2.push((java.lang.Object) stack255_9);
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b19 = stack255_18.isFull();
        boolean b20 = stack255_9.push((java.lang.Object) b19);
        int i21 = stack255_9.size();
        java.lang.Object obj22 = stack255_9.pop();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i21 == 2);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test138");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.size();
        int i11 = stack255_2.capacity();
        boolean b12 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i19 = stack255_18.capacity();
        int i20 = stack255_18.capacity();
        java.lang.Object obj21 = stack255_18.pop();
        java.lang.Object obj22 = stack255_18.pop();
        java.lang.Object obj23 = stack255_18.pop();
        java.lang.Object obj25 = stack255_18.get((int) (short) 10);
        int i26 = stack255_18.size();
        boolean b27 = stack255_15.push((java.lang.Object) stack255_18);
        boolean b28 = stack255_2.push((java.lang.Object) stack255_18);
        int i29 = stack255_18.size();
        java.lang.Object obj31 = stack255_18.get((int) 'a');
        boolean b32 = stack255_18.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test139");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_6 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) -1);
        boolean b7 = stack255_2.push((java.lang.Object) (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i11 = stack255_10.capacity();
        int i12 = stack255_10.capacity();
        java.lang.Object obj13 = stack255_10.pop();
        boolean b14 = stack255_10.isEmpty();
        boolean b16 = stack255_10.push((java.lang.Object) "");
        boolean b17 = stack255_2.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_20 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        java.lang.Object obj21 = stack255_20.pop();
        java.lang.Object obj23 = stack255_20.get((int) 'a');
        java.lang.Object obj25 = stack255_20.get((int) (byte) 10);
        boolean b26 = stack255_2.push((java.lang.Object) stack255_20);
        int i27 = stack255_2.size();
        int i28 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i27 == 3);
        org.junit.Assert.assertTrue(i28 == 3);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test140");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        java.lang.Object obj6 = stack255_2.get((int) (byte) 10);
        boolean b7 = stack255_2.isEmpty();
        boolean b8 = stack255_2.isFull();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test141");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isEmpty();
        boolean b8 = stack255_2.isFull();
        boolean b9 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) -1);
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i19 = stack255_18.capacity();
        int i20 = stack255_18.capacity();
        java.lang.Object obj22 = stack255_18.get((int) 'a');
        boolean b23 = stack255_15.push((java.lang.Object) stack255_18);
        boolean b24 = stack255_12.push((java.lang.Object) stack255_15);
        boolean b25 = stack255_2.push((java.lang.Object) stack255_12);
        java.lang.Object obj27 = stack255_2.get((int) (short) -1);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test142");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 0);
        int i3 = stack255_2.size();
        boolean b4 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test143");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        boolean b3 = stack255_2.isFull();
        java.lang.Object obj4 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.get((int) (short) 1);
        java.lang.Object obj8 = stack255_2.get(3);
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i12 = stack255_11.capacity();
        int i13 = stack255_11.size();
        java.lang.Object obj15 = stack255_11.get((int) (short) 0);
        int i16 = stack255_11.capacity();
        boolean b17 = stack255_11.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_20 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i21 = stack255_20.capacity();
        int i22 = stack255_20.capacity();
        boolean b23 = stack255_20.isFull();
        int i24 = stack255_20.capacity();
        int i25 = stack255_20.capacity();
        boolean b26 = stack255_11.push((java.lang.Object) stack255_20);
        java.lang.Object obj27 = stack255_11.pop();
        int i28 = stack255_11.size();
        boolean b29 = stack255_11.isEmpty();
        java.lang.Object obj30 = stack255_11.pop();
        boolean b31 = stack255_2.push((java.lang.Object) stack255_11);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i12 == 255);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 255);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 1);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test144");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj4 = stack255_2.pop();
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get(10);
        int i8 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i12 = stack255_11.capacity();
        int i13 = stack255_11.capacity();
        boolean b14 = stack255_11.isFull();
        boolean b16 = stack255_11.push((java.lang.Object) (short) 100);
        java.lang.Object obj18 = stack255_11.get((-1));
        boolean b19 = stack255_11.isEmpty();
        java.lang.Object obj20 = stack255_11.pop();
        int i21 = stack255_11.capacity();
        java.lang.Object obj22 = stack255_11.pop();
        boolean b23 = stack255_2.push((java.lang.Object) stack255_11);
        boolean b24 = stack255_11.isEmpty();
        java.lang.Object obj25 = stack255_11.pop();
        int i26 = stack255_11.capacity();
        int i27 = stack255_11.size();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 100 + "'", obj20.equals((short) 100));
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test145");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.size();
        boolean b9 = stack255_2.push((java.lang.Object) (byte) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 1);
        int i13 = stack255_12.capacity();
        boolean b14 = stack255_12.isEmpty();
        boolean b15 = stack255_12.isEmpty();
        boolean b16 = stack255_12.isFull();
        boolean b17 = stack255_2.push((java.lang.Object) b16);
        boolean b18 = stack255_2.isEmpty();
        int i19 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i13 == 255);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test146");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isFull();
        int i11 = stack255_2.capacity();
        int i12 = stack255_2.size();
        java.lang.Object obj13 = stack255_2.pop();
        int i14 = stack255_2.capacity();
        boolean b15 = stack255_2.isFull();
        java.lang.Object obj16 = stack255_2.pop();
        java.lang.Object obj18 = stack255_2.get(1);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test147");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.size();
        boolean b9 = stack255_2.push((java.lang.Object) (byte) 10);
        boolean b10 = stack255_2.isFull();
        boolean b11 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test148");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 10);
        int i3 = stack255_2.size();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isEmpty();
        int i6 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i10 = stack255_9.capacity();
        int i11 = stack255_9.size();
        java.lang.Object obj13 = stack255_9.get((int) (short) 0);
        int i14 = stack255_9.capacity();
        boolean b15 = stack255_9.isFull();
        boolean b16 = stack255_9.isFull();
        boolean b17 = stack255_2.push((java.lang.Object) stack255_9);
        int i18 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i10 == 255);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 255);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i18 == 1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test149");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        boolean b6 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj10 = stack255_9.pop();
        boolean b11 = stack255_9.isEmpty();
        boolean b12 = stack255_9.isFull();
        int i13 = stack255_9.capacity();
        boolean b14 = stack255_2.push((java.lang.Object) stack255_9);
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 10);
        java.lang.Object obj18 = stack255_17.pop();
        java.lang.Object obj19 = stack255_17.pop();
        java.lang.Object obj20 = null;
        boolean b21 = stack255_17.push(obj20);
        boolean b22 = stack255_2.push((java.lang.Object) stack255_17);
        boolean b23 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 255);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test150");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj9 = stack255_2.pop();
        int i10 = stack255_2.capacity();
        boolean b11 = stack255_2.isFull();
        java.lang.Object obj12 = stack255_2.pop();
        int i13 = stack255_2.capacity();
        int i14 = stack255_2.capacity();
        java.lang.Object obj16 = stack255_2.get((int) '#');
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test151");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        java.lang.Object obj11 = stack255_2.get((int) (short) -1);
        boolean b12 = stack255_2.isEmpty();
        boolean b13 = stack255_2.isEmpty();
        boolean b15 = stack255_2.push((java.lang.Object) ' ');
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj20 = stack255_18.get((int) (short) 0);
        boolean b21 = stack255_18.isFull();
        java.lang.Object obj23 = stack255_18.get((int) (short) 0);
        java.lang.Object obj25 = stack255_18.get((int) ' ');
        java.lang.Object obj27 = stack255_18.get((int) (short) -1);
        boolean b28 = stack255_18.isEmpty();
        int i29 = stack255_18.capacity();
        int i30 = stack255_18.capacity();
        boolean b31 = stack255_18.isEmpty();
        int i32 = stack255_18.size();
        java.lang.Object obj34 = stack255_18.get((int) (byte) 10);
        boolean b35 = stack255_2.push(obj34);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test152");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        boolean b6 = stack255_2.isFull();
        java.lang.Object obj8 = stack255_2.get(255);
        int i9 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test153");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        int i11 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i15 = stack255_14.capacity();
        int i16 = stack255_14.capacity();
        java.lang.Object obj18 = stack255_14.get((int) 'a');
        java.lang.Object obj20 = stack255_14.get(100);
        java.lang.Object obj22 = stack255_14.get((int) (short) 10);
        java.lang.Object obj24 = stack255_14.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj28 = stack255_27.pop();
        boolean b29 = stack255_27.isFull();
        boolean b30 = stack255_14.push((java.lang.Object) stack255_27);
        boolean b31 = stack255_2.push((java.lang.Object) stack255_14);
        java.lang.Object obj33 = stack255_2.get((int) (byte) -1);
        int i34 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(i34 == 1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test154");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 10);
        int i3 = stack255_2.size();
        java.lang.Object obj4 = stack255_2.pop();
        int i5 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 100);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test155");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.size();
        int i11 = stack255_2.capacity();
        boolean b12 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i19 = stack255_18.capacity();
        int i20 = stack255_18.capacity();
        java.lang.Object obj21 = stack255_18.pop();
        java.lang.Object obj22 = stack255_18.pop();
        java.lang.Object obj23 = stack255_18.pop();
        java.lang.Object obj25 = stack255_18.get((int) (short) 10);
        int i26 = stack255_18.size();
        boolean b27 = stack255_15.push((java.lang.Object) stack255_18);
        int i28 = stack255_15.capacity();
        int i29 = stack255_15.capacity();
        boolean b30 = stack255_2.push((java.lang.Object) stack255_15);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test156");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj9 = stack255_5.get((int) 'a');
        boolean b10 = stack255_2.push((java.lang.Object) stack255_5);
        int i11 = stack255_5.capacity();
        java.lang.Object obj12 = stack255_5.pop();
        java.lang.Object obj14 = stack255_5.get((int) '4');
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test157");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        boolean b4 = stack255_2.isEmpty();
        boolean b5 = stack255_2.isFull();
        boolean b6 = stack255_2.isEmpty();
        boolean b7 = stack255_2.isEmpty();
        java.lang.Object obj9 = stack255_2.get(255);
        int i10 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj14 = stack255_13.pop();
        boolean b15 = stack255_13.isEmpty();
        int i16 = stack255_13.size();
        int i17 = stack255_13.size();
        boolean b18 = stack255_13.isEmpty();
        int i19 = stack255_13.size();
        boolean b20 = stack255_2.push((java.lang.Object) stack255_13);
        int i21 = stack255_13.size();
        int i22 = stack255_13.capacity();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 255);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 255);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test158");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.size();
        java.lang.Object obj9 = stack255_2.get(0);
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj14 = stack255_12.get((int) (short) 0);
        boolean b15 = stack255_12.isFull();
        java.lang.Object obj17 = stack255_12.get((int) (short) 0);
        java.lang.Object obj19 = stack255_12.get((int) ' ');
        java.lang.Object obj21 = stack255_12.get((int) (short) -1);
        boolean b22 = stack255_12.isEmpty();
        boolean b23 = stack255_12.isEmpty();
        java.lang.Object obj25 = stack255_12.get(0);
        io.github.agentsoz.jill.util.Stack255 stack255_28 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i29 = stack255_28.capacity();
        int i30 = stack255_28.capacity();
        boolean b31 = stack255_28.isFull();
        boolean b33 = stack255_28.push((java.lang.Object) (short) 100);
        java.lang.Object obj35 = stack255_28.get((-1));
        boolean b36 = stack255_28.isEmpty();
        java.lang.Object obj37 = stack255_28.pop();
        int i38 = stack255_28.capacity();
        java.lang.Object obj39 = stack255_28.pop();
        boolean b40 = stack255_12.push((java.lang.Object) stack255_28);
        boolean b41 = stack255_2.push((java.lang.Object) b40);
        java.lang.Object obj43 = stack255_2.get(255);
        int i44 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 100 + "'", obj37.equals((short) 100));
        org.junit.Assert.assertTrue(i38 == 1);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(i44 == 1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test159");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        java.lang.Object obj11 = stack255_2.get((int) (short) -1);
        int i12 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i16 = stack255_15.capacity();
        int i17 = stack255_15.capacity();
        java.lang.Object obj18 = stack255_15.pop();
        java.lang.Object obj19 = stack255_15.pop();
        java.lang.Object obj20 = stack255_15.pop();
        int i21 = stack255_15.capacity();
        java.lang.Object obj23 = stack255_15.get((int) (short) 100);
        boolean b24 = stack255_2.push((java.lang.Object) stack255_15);
        boolean b25 = stack255_2.isEmpty();
        java.lang.Object obj26 = stack255_2.pop();
        int i27 = stack255_2.capacity();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue(i27 == 11);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test160");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) -1);
        boolean b3 = stack255_2.isEmpty();
        boolean b5 = stack255_2.push((java.lang.Object) 10L);
        java.lang.Object obj6 = stack255_2.pop();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 10L + "'", obj6.equals(10L));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test161");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isFull();
        int i11 = stack255_2.capacity();
        int i12 = stack255_2.size();
        java.lang.Object obj14 = stack255_2.get((-1));
        java.lang.Object obj16 = stack255_2.get(10);
        int i17 = stack255_2.capacity();
        boolean b18 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test162");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        java.lang.Object obj3 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.get(1);
        java.lang.Object obj7 = stack255_2.get((int) (byte) -1);
        int i8 = stack255_2.capacity();
        java.lang.Object obj10 = stack255_2.get(3);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test163");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.size();
        boolean b9 = stack255_2.push((java.lang.Object) (byte) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 1);
        int i13 = stack255_12.capacity();
        boolean b14 = stack255_12.isEmpty();
        boolean b15 = stack255_12.isEmpty();
        boolean b16 = stack255_12.isFull();
        boolean b17 = stack255_2.push((java.lang.Object) b16);
        java.lang.Object obj18 = stack255_2.pop();
        boolean b19 = stack255_2.isEmpty();
        int i20 = stack255_2.size();
        boolean b21 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i13 == 255);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test164");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj9 = stack255_2.pop();
        int i10 = stack255_2.capacity();
        boolean b11 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b15 = stack255_14.isFull();
        boolean b17 = stack255_14.push((java.lang.Object) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_20 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b21 = stack255_14.push((java.lang.Object) stack255_20);
        boolean b22 = stack255_20.isEmpty();
        boolean b23 = stack255_2.push((java.lang.Object) stack255_20);
        boolean b24 = stack255_2.isFull();
        boolean b25 = stack255_2.isFull();
        java.lang.Object obj27 = stack255_2.get(0);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test165");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        boolean b7 = stack255_2.push((java.lang.Object) (short) 100);
        int i8 = stack255_2.capacity();
        int i9 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        boolean b13 = stack255_2.push((java.lang.Object) stack255_12);
        int i14 = stack255_12.size();
        java.lang.Object obj15 = stack255_12.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i19 = stack255_18.capacity();
        int i20 = stack255_18.capacity();
        java.lang.Object obj22 = stack255_18.get((int) 'a');
        java.lang.Object obj24 = stack255_18.get(100);
        java.lang.Object obj25 = stack255_18.pop();
        int i26 = stack255_18.capacity();
        boolean b27 = stack255_18.isFull();
        java.lang.Object obj28 = stack255_18.pop();
        java.lang.Object obj29 = stack255_18.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_32 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i33 = stack255_32.capacity();
        int i34 = stack255_32.capacity();
        java.lang.Object obj35 = stack255_32.pop();
        java.lang.Object obj36 = stack255_32.pop();
        boolean b37 = stack255_32.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_40 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i41 = stack255_40.capacity();
        int i42 = stack255_40.capacity();
        java.lang.Object obj44 = stack255_40.get((int) 'a');
        java.lang.Object obj46 = stack255_40.get(100);
        int i47 = stack255_40.capacity();
        java.lang.Object obj49 = stack255_40.get((int) (short) 100);
        boolean b50 = stack255_32.push((java.lang.Object) stack255_40);
        boolean b51 = stack255_18.push((java.lang.Object) stack255_32);
        boolean b52 = stack255_12.push((java.lang.Object) stack255_18);
        int i53 = stack255_12.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i33 == 1);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(i41 == 1);
        org.junit.Assert.assertTrue(i42 == 1);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(i47 == 1);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(i53 == 1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test166");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        java.lang.Object obj12 = stack255_2.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj16 = stack255_15.pop();
        boolean b17 = stack255_15.isFull();
        boolean b18 = stack255_2.push((java.lang.Object) stack255_15);
        java.lang.Object obj19 = null;
        boolean b20 = stack255_2.push(obj19);
        io.github.agentsoz.jill.util.Stack255 stack255_23 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i24 = stack255_23.capacity();
        int i25 = stack255_23.capacity();
        java.lang.Object obj26 = stack255_23.pop();
        java.lang.Object obj27 = stack255_23.pop();
        java.lang.Object obj28 = stack255_23.pop();
        java.lang.Object obj30 = stack255_23.get((int) (short) 10);
        boolean b31 = stack255_23.isEmpty();
        boolean b32 = stack255_2.push((java.lang.Object) b31);
        boolean b33 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_36 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b37 = stack255_36.isFull();
        java.lang.Object obj39 = stack255_36.get(2);
        int i40 = stack255_36.capacity();
        boolean b41 = stack255_36.isFull();
        boolean b42 = stack255_36.isEmpty();
        int i43 = stack255_36.capacity();
        boolean b44 = stack255_2.push((java.lang.Object) stack255_36);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i24 == 1);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(i40 == 1);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(i43 == 1);
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test167");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isEmpty();
        boolean b8 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj12 = stack255_11.pop();
        java.lang.Object obj14 = stack255_11.get((int) (byte) -1);
        boolean b15 = stack255_2.push((java.lang.Object) (byte) -1);
        java.lang.Object obj17 = stack255_2.get((int) ' ');
        boolean b18 = stack255_2.isFull();
        int i19 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test168");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        boolean b9 = stack255_2.push((java.lang.Object) 0L);
        java.lang.Object obj10 = stack255_2.pop();
        java.lang.Object obj11 = stack255_2.pop();
        java.lang.Object obj13 = stack255_2.get((int) (short) 100);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test169");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        int i6 = stack255_2.capacity();
        java.lang.Object obj7 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i11 = stack255_10.capacity();
        int i12 = stack255_10.capacity();
        java.lang.Object obj13 = stack255_10.pop();
        java.lang.Object obj14 = stack255_10.pop();
        java.lang.Object obj15 = stack255_10.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj19 = stack255_18.pop();
        boolean b20 = stack255_18.isEmpty();
        boolean b21 = stack255_10.push((java.lang.Object) stack255_18);
        boolean b22 = stack255_2.push((java.lang.Object) stack255_10);
        java.lang.Object obj23 = stack255_2.pop();
        boolean b24 = stack255_2.isEmpty();
        int i25 = stack255_2.capacity();
        java.lang.Object obj26 = null;
        boolean b27 = stack255_2.push(obj26);
        boolean b28 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test170");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 1);
        int i3 = stack255_2.capacity();
        boolean b4 = stack255_2.isEmpty();
        boolean b5 = stack255_2.isEmpty();
        boolean b6 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i10 = stack255_9.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) -1);
        boolean b14 = stack255_9.push((java.lang.Object) (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i18 = stack255_17.capacity();
        int i19 = stack255_17.capacity();
        java.lang.Object obj20 = stack255_17.pop();
        boolean b21 = stack255_17.isEmpty();
        boolean b23 = stack255_17.push((java.lang.Object) "");
        boolean b24 = stack255_9.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        java.lang.Object obj28 = stack255_27.pop();
        java.lang.Object obj30 = stack255_27.get((int) 'a');
        java.lang.Object obj32 = stack255_27.get((int) (byte) 10);
        boolean b33 = stack255_9.push((java.lang.Object) stack255_27);
        boolean b34 = stack255_2.push((java.lang.Object) stack255_27);
        io.github.agentsoz.jill.util.Stack255 stack255_37 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj39 = stack255_37.get((int) (short) 0);
        boolean b40 = stack255_37.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_43 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        java.lang.Object obj44 = null;
        boolean b45 = stack255_43.push(obj44);
        boolean b47 = stack255_43.push((java.lang.Object) 100.0f);
        boolean b48 = stack255_43.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_51 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i52 = stack255_51.capacity();
        int i53 = stack255_51.capacity();
        java.lang.Object obj55 = stack255_51.get((int) 'a');
        int i56 = stack255_51.size();
        boolean b58 = stack255_51.push((java.lang.Object) (byte) 10);
        boolean b59 = stack255_43.push((java.lang.Object) stack255_51);
        boolean b60 = stack255_37.push((java.lang.Object) stack255_51);
        boolean b61 = stack255_27.push((java.lang.Object) stack255_51);
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i10 == 255);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i52 == 1);
        org.junit.Assert.assertTrue(i53 == 1);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b61 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test171");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.size();
        java.lang.Object obj8 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.pop();
        java.lang.Object obj11 = stack255_2.get((-1));
        java.lang.Object obj13 = stack255_2.get((int) (short) 1);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test172");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        java.lang.Object obj11 = stack255_2.get((int) (short) -1);
        boolean b12 = stack255_2.isEmpty();
        int i13 = stack255_2.capacity();
        int i14 = stack255_2.capacity();
        boolean b15 = stack255_2.isEmpty();
        boolean b16 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_19 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj21 = stack255_19.get((int) (short) 100);
        java.lang.Object obj22 = stack255_19.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_25 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i26 = stack255_25.capacity();
        int i27 = stack255_25.capacity();
        java.lang.Object obj29 = stack255_25.get((int) 'a');
        java.lang.Object obj31 = stack255_25.get(100);
        int i32 = stack255_25.capacity();
        java.lang.Object obj34 = stack255_25.get((int) (short) 100);
        int i35 = stack255_25.size();
        boolean b36 = stack255_19.push((java.lang.Object) stack255_25);
        boolean b37 = stack255_2.push((java.lang.Object) stack255_25);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test173");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        int i6 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b10 = stack255_9.isFull();
        boolean b12 = stack255_9.push((java.lang.Object) 1);
        int i13 = stack255_9.capacity();
        boolean b14 = stack255_9.isFull();
        boolean b15 = stack255_2.push((java.lang.Object) stack255_9);
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b19 = stack255_18.isFull();
        boolean b20 = stack255_9.push((java.lang.Object) b19);
        int i21 = stack255_9.capacity();
        java.lang.Object obj22 = null;
        boolean b23 = stack255_9.push(obj22);
        int i24 = stack255_9.capacity();
        java.lang.Object obj25 = stack255_9.pop();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i21 == 10);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(i24 == 10);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test174");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        int i6 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b10 = stack255_9.isFull();
        boolean b12 = stack255_9.push((java.lang.Object) 1);
        int i13 = stack255_9.capacity();
        boolean b14 = stack255_9.isFull();
        boolean b15 = stack255_2.push((java.lang.Object) stack255_9);
        int i16 = stack255_9.size();
        io.github.agentsoz.jill.util.Stack255 stack255_19 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj20 = stack255_19.pop();
        java.lang.Object obj22 = stack255_19.get(1);
        boolean b23 = stack255_9.push((java.lang.Object) 1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test175");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b3 = stack255_2.isFull();
        java.lang.Object obj5 = stack255_2.get(2);
        int i6 = stack255_2.capacity();
        boolean b7 = stack255_2.isFull();
        boolean b8 = stack255_2.isEmpty();
        int i9 = stack255_2.capacity();
        int i10 = stack255_2.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test176");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj9 = stack255_2.pop();
        int i10 = stack255_2.capacity();
        boolean b11 = stack255_2.isFull();
        java.lang.Object obj12 = stack255_2.pop();
        int i13 = stack255_2.capacity();
        int i14 = stack255_2.capacity();
        boolean b15 = stack255_2.isEmpty();
        int i16 = stack255_2.capacity();
        boolean b17 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test177");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        int i6 = stack255_2.capacity();
        boolean b7 = stack255_2.isFull();
        boolean b8 = stack255_2.isEmpty();
        int i9 = stack255_2.capacity();
        boolean b10 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test178");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.capacity();
        boolean b8 = stack255_2.isFull();
        boolean b9 = stack255_2.isEmpty();
        java.lang.Object obj10 = stack255_2.pop();
        int i11 = stack255_2.size();
        boolean b12 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test179");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        java.lang.Object obj3 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.get((int) 'a');
        io.github.agentsoz.jill.util.Stack255 stack255_8 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i9 = stack255_8.size();
        java.lang.Object obj11 = stack255_8.get((int) (short) 1);
        int i12 = stack255_8.size();
        java.lang.Object obj14 = stack255_8.get((int) (short) 100);
        int i15 = stack255_8.capacity();
        boolean b16 = stack255_2.push((java.lang.Object) stack255_8);
        boolean b17 = stack255_2.isEmpty();
        boolean b18 = stack255_2.isFull();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test180");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        java.lang.Object obj12 = stack255_2.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i19 = stack255_18.capacity();
        int i20 = stack255_18.capacity();
        java.lang.Object obj21 = stack255_18.pop();
        boolean b22 = stack255_18.isEmpty();
        boolean b24 = stack255_18.push((java.lang.Object) "");
        boolean b25 = stack255_15.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_28 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b29 = stack255_15.push((java.lang.Object) stack255_28);
        io.github.agentsoz.jill.util.Stack255 stack255_32 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i33 = stack255_32.capacity();
        int i34 = stack255_32.capacity();
        java.lang.Object obj36 = stack255_32.get((int) 'a');
        java.lang.Object obj38 = stack255_32.get(100);
        int i39 = stack255_32.capacity();
        boolean b40 = stack255_15.push((java.lang.Object) stack255_32);
        boolean b41 = stack255_15.isFull();
        boolean b42 = stack255_2.push((java.lang.Object) stack255_15);
        io.github.agentsoz.jill.util.Stack255 stack255_45 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i46 = stack255_45.capacity();
        int i47 = stack255_45.capacity();
        java.lang.Object obj48 = stack255_45.pop();
        java.lang.Object obj49 = stack255_45.pop();
        boolean b50 = stack255_45.isFull();
        boolean b52 = stack255_45.push((java.lang.Object) 100.0d);
        int i53 = stack255_45.size();
        int i54 = stack255_45.capacity();
        boolean b55 = stack255_45.isEmpty();
        boolean b56 = stack255_2.push((java.lang.Object) stack255_45);
        boolean b57 = stack255_45.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i33 == 1);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(i39 == 1);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(i46 == 1);
        org.junit.Assert.assertTrue(i47 == 1);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(i53 == 1);
        org.junit.Assert.assertTrue(i54 == 1);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test181");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        java.lang.Object obj4 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i10 = stack255_9.capacity();
        int i11 = stack255_9.capacity();
        boolean b12 = stack255_9.isFull();
        java.lang.Object obj13 = stack255_9.pop();
        boolean b14 = stack255_2.push((java.lang.Object) stack255_9);
        int i15 = stack255_2.size();
        java.lang.Object obj16 = stack255_2.pop();
        int i17 = stack255_2.capacity();
        boolean b18 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test182");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        boolean b7 = stack255_2.push((java.lang.Object) (short) 100);
        int i8 = stack255_2.capacity();
        int i9 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        boolean b13 = stack255_2.push((java.lang.Object) stack255_12);
        boolean b14 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test183");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.size();
        int i11 = stack255_2.capacity();
        boolean b12 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i19 = stack255_18.capacity();
        int i20 = stack255_18.capacity();
        java.lang.Object obj21 = stack255_18.pop();
        java.lang.Object obj22 = stack255_18.pop();
        java.lang.Object obj23 = stack255_18.pop();
        java.lang.Object obj25 = stack255_18.get((int) (short) 10);
        int i26 = stack255_18.size();
        boolean b27 = stack255_15.push((java.lang.Object) stack255_18);
        boolean b28 = stack255_2.push((java.lang.Object) stack255_18);
        java.lang.Object obj30 = stack255_2.get(255);
        boolean b31 = stack255_2.isFull();
        java.lang.Object obj33 = stack255_2.get(3);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test184");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test185");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        java.lang.Object obj4 = stack255_2.pop();
        java.lang.Object obj5 = null;
        boolean b6 = stack255_2.push(obj5);
        java.lang.Object obj8 = stack255_2.get((int) 'a');
        java.lang.Object obj9 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test186");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        boolean b5 = stack255_2.push((java.lang.Object) true);
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj8 = stack255_2.get(0);
        boolean b9 = stack255_2.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + true + "'", obj6.equals(true));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test187");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isEmpty();
        boolean b8 = stack255_2.isFull();
        boolean b9 = stack255_2.isFull();
        boolean b10 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i14 = stack255_13.size();
        java.lang.Object obj16 = stack255_13.get((int) (short) 1);
        boolean b17 = stack255_13.isFull();
        java.lang.Object obj19 = stack255_13.get(255);
        boolean b20 = stack255_2.push((java.lang.Object) 255);
        java.lang.Object obj22 = stack255_2.get(11);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test188");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isFull();
        java.lang.Object obj9 = stack255_2.get((int) (short) 0);
        int i10 = stack255_2.capacity();
        java.lang.Object obj11 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test189");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        int i6 = stack255_2.capacity();
        java.lang.Object obj7 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i11 = stack255_10.capacity();
        int i12 = stack255_10.capacity();
        java.lang.Object obj13 = stack255_10.pop();
        java.lang.Object obj14 = stack255_10.pop();
        java.lang.Object obj15 = stack255_10.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj19 = stack255_18.pop();
        boolean b20 = stack255_18.isEmpty();
        boolean b21 = stack255_10.push((java.lang.Object) stack255_18);
        boolean b22 = stack255_2.push((java.lang.Object) stack255_10);
        boolean b23 = stack255_10.isFull();
        java.lang.Object obj25 = stack255_10.get(3);
        java.lang.Object obj26 = stack255_10.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test190");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        java.lang.Object obj3 = null;
        boolean b4 = stack255_2.push(obj3);
        int i5 = stack255_2.capacity();
        boolean b6 = stack255_2.isEmpty();
        int i7 = stack255_2.size();
        int i8 = stack255_2.capacity();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 10);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test191");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        boolean b6 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj10 = stack255_9.pop();
        boolean b11 = stack255_9.isEmpty();
        boolean b12 = stack255_9.isFull();
        int i13 = stack255_9.capacity();
        boolean b14 = stack255_2.push((java.lang.Object) stack255_9);
        java.lang.Object obj16 = stack255_2.get(3);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 255);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test192");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        java.lang.Object obj7 = stack255_2.get((int) (byte) 1);
        int i8 = stack255_2.size();
        java.lang.Object obj10 = stack255_2.get(2);
        java.lang.Object obj11 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        boolean b15 = stack255_2.push((java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test193");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        java.lang.Object obj3 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.get((int) 'a');
        io.github.agentsoz.jill.util.Stack255 stack255_8 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i9 = stack255_8.size();
        java.lang.Object obj11 = stack255_8.get((int) (short) 1);
        int i12 = stack255_8.size();
        java.lang.Object obj14 = stack255_8.get((int) (short) 100);
        int i15 = stack255_8.capacity();
        boolean b16 = stack255_2.push((java.lang.Object) stack255_8);
        java.lang.Object obj17 = stack255_2.pop();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test194");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        boolean b4 = stack255_2.isFull();
        int i5 = stack255_2.size();
        int i6 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test195");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        boolean b7 = stack255_2.push((java.lang.Object) (short) 100);
        java.lang.Object obj9 = stack255_2.get((-1));
        boolean b10 = stack255_2.isEmpty();
        java.lang.Object obj11 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i18 = stack255_17.capacity();
        int i19 = stack255_17.capacity();
        java.lang.Object obj20 = stack255_17.pop();
        boolean b21 = stack255_17.isEmpty();
        boolean b23 = stack255_17.push((java.lang.Object) "");
        boolean b24 = stack255_14.push((java.lang.Object) "");
        boolean b25 = stack255_14.isEmpty();
        boolean b26 = stack255_2.push((java.lang.Object) stack255_14);
        boolean b27 = stack255_14.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_30 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj31 = stack255_30.pop();
        boolean b32 = stack255_30.isFull();
        java.lang.Object obj33 = stack255_30.pop();
        int i34 = stack255_30.capacity();
        boolean b35 = stack255_14.push((java.lang.Object) i34);
        java.lang.Object obj37 = stack255_14.get(3);
        java.lang.Object obj39 = stack255_14.get((int) '4');
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(i34 == 255);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test196");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.size();
        java.lang.Object obj9 = stack255_5.get((int) (short) 0);
        boolean b10 = stack255_2.push((java.lang.Object) (short) 0);
        boolean b11 = stack255_2.isEmpty();
        int i12 = stack255_2.size();
        org.junit.Assert.assertTrue(i6 == 255);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test197");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isFull();
        boolean b11 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test198");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isFull();
        int i11 = stack255_2.capacity();
        boolean b12 = stack255_2.isFull();
        int i13 = stack255_2.size();
        boolean b14 = stack255_2.isEmpty();
        boolean b15 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test199");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b3 = stack255_2.isFull();
        boolean b4 = stack255_2.isEmpty();
        boolean b5 = stack255_2.isEmpty();
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test200");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        boolean b6 = stack255_2.isFull();
        int i7 = stack255_2.capacity();
        int i8 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) -1);
        java.lang.Object obj13 = stack255_11.get((int) ' ');
        boolean b14 = stack255_2.push((java.lang.Object) ' ');
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test201");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj9 = stack255_5.get((int) 'a');
        boolean b10 = stack255_2.push((java.lang.Object) stack255_5);
        java.lang.Object obj11 = stack255_5.pop();
        java.lang.Object obj12 = stack255_5.pop();
        int i13 = stack255_5.capacity();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test202");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        java.lang.Object obj3 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.get((int) 'a');
        io.github.agentsoz.jill.util.Stack255 stack255_8 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i9 = stack255_8.size();
        java.lang.Object obj11 = stack255_8.get((int) (short) 1);
        int i12 = stack255_8.size();
        java.lang.Object obj14 = stack255_8.get((int) (short) 100);
        int i15 = stack255_8.capacity();
        boolean b16 = stack255_2.push((java.lang.Object) stack255_8);
        boolean b17 = stack255_8.isFull();
        java.lang.Object obj19 = stack255_8.get((int) (byte) -1);
        boolean b20 = stack255_8.isFull();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test203");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        int i6 = stack255_2.capacity();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj8 = stack255_2.pop();
        java.lang.Object obj10 = stack255_2.get((int) (byte) 10);
        boolean b11 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test204");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        java.lang.Object obj4 = stack255_2.get((int) (byte) -1);
        boolean b6 = stack255_2.push((java.lang.Object) (-1.0d));
        boolean b7 = stack255_2.isEmpty();
        boolean b8 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 1);
        int i12 = stack255_11.capacity();
        boolean b13 = stack255_11.isFull();
        int i14 = stack255_11.capacity();
        boolean b15 = stack255_2.push((java.lang.Object) stack255_11);
        int i16 = stack255_2.capacity();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 100);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test205");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj12 = stack255_10.get((int) (short) 0);
        boolean b13 = stack255_10.isFull();
        java.lang.Object obj15 = stack255_10.get((int) (short) 0);
        java.lang.Object obj17 = stack255_10.get((int) ' ');
        java.lang.Object obj19 = stack255_10.get((int) (short) -1);
        boolean b20 = stack255_10.isEmpty();
        int i21 = stack255_10.capacity();
        int i22 = stack255_10.capacity();
        boolean b23 = stack255_2.push((java.lang.Object) stack255_10);
        io.github.agentsoz.jill.util.Stack255 stack255_26 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i27 = stack255_26.size();
        boolean b28 = stack255_26.isFull();
        java.lang.Object obj29 = stack255_26.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_32 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_35 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i36 = stack255_35.capacity();
        int i37 = stack255_35.capacity();
        java.lang.Object obj38 = stack255_35.pop();
        boolean b39 = stack255_35.isEmpty();
        boolean b41 = stack255_35.push((java.lang.Object) "");
        boolean b42 = stack255_32.push((java.lang.Object) "");
        boolean b43 = stack255_32.isEmpty();
        boolean b44 = stack255_32.isEmpty();
        boolean b45 = stack255_26.push((java.lang.Object) b44);
        boolean b46 = stack255_2.push((java.lang.Object) b44);
        boolean b47 = stack255_2.isFull();
        java.lang.Object obj48 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i36 == 1);
        org.junit.Assert.assertTrue(i37 == 1);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + false + "'", obj48.equals(false));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test206");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        java.lang.Object obj4 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj8 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.pop();
        java.lang.Object obj10 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test207");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b3 = stack255_2.isFull();
        boolean b5 = stack255_2.push((java.lang.Object) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_8 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b9 = stack255_2.push((java.lang.Object) stack255_8);
        java.lang.Object obj11 = stack255_8.get(2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test208");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        boolean b9 = stack255_5.isEmpty();
        boolean b11 = stack255_5.push((java.lang.Object) "");
        boolean b12 = stack255_2.push((java.lang.Object) "");
        boolean b13 = stack255_2.isEmpty();
        java.lang.Object obj15 = stack255_2.get((int) (byte) 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test209");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        boolean b10 = stack255_2.isFull();
        boolean b11 = stack255_2.isEmpty();
        java.lang.Object obj12 = stack255_2.pop();
        boolean b13 = stack255_2.isEmpty();
        int i14 = stack255_2.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test210");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        java.lang.Object obj7 = stack255_2.get((int) (byte) 1);
        int i8 = stack255_2.size();
        boolean b9 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        int i13 = stack255_12.size();
        boolean b14 = stack255_12.isEmpty();
        java.lang.Object obj16 = stack255_12.get((int) 'a');
        boolean b17 = stack255_2.push((java.lang.Object) stack255_12);
        int i18 = stack255_12.size();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test211");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        java.lang.Object obj7 = stack255_2.get((int) (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj12 = stack255_10.get((int) (short) 100);
        java.lang.Object obj13 = stack255_10.pop();
        java.lang.Object obj14 = stack255_10.pop();
        int i15 = stack255_10.size();
        int i16 = stack255_10.size();
        boolean b17 = stack255_2.push((java.lang.Object) stack255_10);
        int i18 = stack255_2.size();
        java.lang.Object obj20 = stack255_2.get((int) (short) 100);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test212");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 100);
        java.lang.Object obj5 = stack255_2.pop();
        int i6 = stack255_2.capacity();
        java.lang.Object obj7 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i11 = stack255_10.capacity();
        int i12 = stack255_10.capacity();
        boolean b13 = stack255_10.isFull();
        boolean b15 = stack255_10.push((java.lang.Object) (short) 100);
        boolean b16 = stack255_2.push((java.lang.Object) (short) 100);
        java.lang.Object obj18 = stack255_2.get(0);
        io.github.agentsoz.jill.util.Stack255 stack255_21 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i22 = stack255_21.capacity();
        int i23 = stack255_21.capacity();
        boolean b24 = stack255_21.isFull();
        boolean b26 = stack255_21.push((java.lang.Object) (short) 100);
        int i27 = stack255_21.capacity();
        int i28 = stack255_21.size();
        io.github.agentsoz.jill.util.Stack255 stack255_31 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        boolean b32 = stack255_21.push((java.lang.Object) stack255_31);
        int i33 = stack255_31.size();
        java.lang.Object obj34 = stack255_31.pop();
        int i35 = stack255_31.size();
        int i36 = stack255_31.capacity();
        boolean b37 = stack255_2.push((java.lang.Object) stack255_31);
        java.lang.Object obj39 = stack255_31.get(0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 100 + "'", obj18.equals((short) 100));
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test213");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        int i6 = stack255_2.capacity();
        java.lang.Object obj8 = stack255_2.get(255);
        java.lang.Object obj9 = stack255_2.pop();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test214");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        java.lang.Object obj11 = stack255_2.get((int) (byte) 1);
        java.lang.Object obj12 = stack255_2.pop();
        boolean b13 = stack255_2.isEmpty();
        java.lang.Object obj15 = stack255_2.get(0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test215");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) ' ');
        java.lang.Object obj8 = stack255_2.pop();
        java.lang.Object obj10 = stack255_2.get(1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test216");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.size();
        int i11 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i15 = stack255_14.capacity();
        int i16 = stack255_14.capacity();
        boolean b17 = stack255_2.push((java.lang.Object) stack255_14);
        boolean b18 = stack255_14.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i15 == 255);
        org.junit.Assert.assertTrue(i16 == 255);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test217");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        int i6 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj11 = stack255_9.get((int) (short) 0);
        boolean b12 = stack255_9.isFull();
        int i13 = stack255_9.capacity();
        boolean b14 = stack255_2.push((java.lang.Object) stack255_9);
        java.lang.Object obj15 = stack255_2.pop();
        boolean b16 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test218");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj9 = stack255_5.get((int) 'a');
        boolean b10 = stack255_2.push((java.lang.Object) stack255_5);
        boolean b11 = stack255_5.isFull();
        boolean b12 = stack255_5.isEmpty();
        java.lang.Object obj14 = stack255_5.get(100);
        boolean b15 = stack255_5.isFull();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test219");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        boolean b6 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj10 = stack255_9.pop();
        boolean b11 = stack255_9.isEmpty();
        boolean b12 = stack255_9.isFull();
        int i13 = stack255_9.capacity();
        boolean b14 = stack255_2.push((java.lang.Object) stack255_9);
        boolean b15 = stack255_2.isEmpty();
        boolean b16 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 255);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test220");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.size();
        int i11 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i15 = stack255_14.capacity();
        int i16 = stack255_14.capacity();
        boolean b17 = stack255_2.push((java.lang.Object) stack255_14);
        boolean b18 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_21 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b22 = stack255_21.isFull();
        boolean b24 = stack255_21.push((java.lang.Object) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj29 = stack255_27.get((int) (short) 0);
        boolean b30 = stack255_27.isEmpty();
        java.lang.Object obj32 = stack255_27.get(0);
        boolean b33 = stack255_21.push((java.lang.Object) stack255_27);
        io.github.agentsoz.jill.util.Stack255 stack255_36 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj37 = stack255_36.pop();
        boolean b39 = stack255_36.push((java.lang.Object) true);
        int i40 = stack255_36.size();
        java.lang.Object obj41 = stack255_36.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_44 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj45 = stack255_44.pop();
        java.lang.Object obj47 = stack255_44.get((int) (byte) -1);
        boolean b48 = stack255_44.isEmpty();
        int i49 = stack255_44.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_52 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i53 = stack255_52.size();
        java.lang.Object obj55 = stack255_52.get((int) (short) 1);
        int i56 = stack255_52.size();
        java.lang.Object obj58 = stack255_52.get((int) (short) 100);
        int i59 = stack255_52.capacity();
        boolean b60 = stack255_44.push((java.lang.Object) stack255_52);
        io.github.agentsoz.jill.util.Stack255 stack255_63 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_66 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i67 = stack255_66.capacity();
        java.lang.Object obj68 = stack255_66.pop();
        java.lang.Object obj69 = null;
        boolean b70 = stack255_66.push(obj69);
        boolean b71 = stack255_63.push((java.lang.Object) b70);
        boolean b72 = stack255_52.push((java.lang.Object) b71);
        boolean b73 = stack255_52.isEmpty();
        boolean b74 = stack255_52.isEmpty();
        boolean b75 = stack255_36.push((java.lang.Object) stack255_52);
        java.lang.Object obj76 = stack255_36.pop();
        boolean b77 = stack255_21.push((java.lang.Object) stack255_36);
        boolean b78 = stack255_2.push((java.lang.Object) stack255_36);
        io.github.agentsoz.jill.util.Stack255 stack255_81 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i82 = stack255_81.capacity();
        int i83 = stack255_81.capacity();
        boolean b84 = stack255_81.isFull();
        boolean b86 = stack255_81.push((java.lang.Object) (short) 100);
        java.lang.Object obj88 = stack255_81.get((-1));
        boolean b89 = stack255_81.isEmpty();
        java.lang.Object obj90 = stack255_81.pop();
        int i91 = stack255_81.capacity();
        java.lang.Object obj93 = stack255_81.get((int) '4');
        boolean b94 = stack255_2.push((java.lang.Object) stack255_81);
        java.lang.Object obj95 = stack255_81.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i15 == 255);
        org.junit.Assert.assertTrue(i16 == 255);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i40 == 1);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + true + "'", obj41.equals(true));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(i49 == 10);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(i59 == 1);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(i67 == 255);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(i82 == 1);
        org.junit.Assert.assertTrue(i83 == 1);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + (short) 100 + "'", obj90.equals((short) 100));
        org.junit.Assert.assertTrue(i91 == 1);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue(b94 == true);
        org.junit.Assert.assertNull(obj95);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test221");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        int i3 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_6 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj8 = stack255_6.get((int) (short) 0);
        boolean b9 = stack255_6.isFull();
        java.lang.Object obj11 = stack255_6.get((int) (short) 0);
        java.lang.Object obj12 = stack255_6.pop();
        boolean b13 = stack255_6.isEmpty();
        boolean b14 = stack255_2.push((java.lang.Object) stack255_6);
        int i15 = stack255_6.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i19 = stack255_18.capacity();
        int i20 = stack255_18.size();
        java.lang.Object obj22 = stack255_18.get((int) (short) 0);
        int i23 = stack255_18.capacity();
        boolean b24 = stack255_18.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i28 = stack255_27.capacity();
        int i29 = stack255_27.capacity();
        boolean b30 = stack255_27.isFull();
        int i31 = stack255_27.capacity();
        int i32 = stack255_27.capacity();
        boolean b33 = stack255_18.push((java.lang.Object) stack255_27);
        java.lang.Object obj34 = stack255_18.pop();
        int i35 = stack255_18.size();
        boolean b36 = stack255_18.isFull();
        java.lang.Object obj37 = stack255_18.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_40 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj42 = stack255_40.get((int) (short) 0);
        boolean b43 = stack255_40.isFull();
        java.lang.Object obj45 = stack255_40.get((int) ' ');
        int i46 = stack255_40.size();
        boolean b47 = stack255_40.isEmpty();
        boolean b48 = stack255_18.push((java.lang.Object) stack255_40);
        boolean b49 = stack255_40.isFull();
        boolean b50 = stack255_6.push((java.lang.Object) b49);
        java.lang.Object obj51 = stack255_6.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_54 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        java.lang.Object obj56 = stack255_54.get((int) (byte) -1);
        boolean b58 = stack255_54.push((java.lang.Object) (-1.0d));
        boolean b59 = stack255_54.isFull();
        int i60 = stack255_54.capacity();
        boolean b61 = stack255_54.isFull();
        boolean b62 = stack255_6.push((java.lang.Object) stack255_54);
        boolean b63 = stack255_54.isFull();
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i19 == 255);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i23 == 255);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 1);
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + false + "'", obj51.equals(false));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i60 == 100);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test222");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i14 = stack255_13.size();
        java.lang.Object obj16 = stack255_13.get((int) (short) 1);
        java.lang.Object obj18 = stack255_13.get((int) (byte) 1);
        boolean b19 = stack255_13.isFull();
        boolean b20 = stack255_2.push((java.lang.Object) b19);
        java.lang.Object obj22 = stack255_2.get((-1));
        int i23 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i23 == 1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test223");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        int i11 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i15 = stack255_14.capacity();
        int i16 = stack255_14.capacity();
        java.lang.Object obj18 = stack255_14.get((int) 'a');
        java.lang.Object obj20 = stack255_14.get(100);
        java.lang.Object obj22 = stack255_14.get((int) (short) 10);
        java.lang.Object obj24 = stack255_14.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj28 = stack255_27.pop();
        boolean b29 = stack255_27.isFull();
        boolean b30 = stack255_14.push((java.lang.Object) stack255_27);
        boolean b31 = stack255_2.push((java.lang.Object) stack255_14);
        boolean b32 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_35 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_38 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i39 = stack255_38.capacity();
        int i40 = stack255_38.capacity();
        java.lang.Object obj41 = stack255_38.pop();
        boolean b42 = stack255_38.isEmpty();
        boolean b44 = stack255_38.push((java.lang.Object) "");
        boolean b45 = stack255_35.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_48 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b49 = stack255_35.push((java.lang.Object) stack255_48);
        java.lang.Object obj50 = stack255_35.pop();
        boolean b51 = stack255_2.push((java.lang.Object) stack255_35);
        boolean b52 = stack255_2.isEmpty();
        boolean b53 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i39 == 1);
        org.junit.Assert.assertTrue(i40 == 1);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test224");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        boolean b7 = stack255_2.push((java.lang.Object) (short) 100);
        java.lang.Object obj9 = stack255_2.get((-1));
        boolean b10 = stack255_2.isEmpty();
        java.lang.Object obj11 = stack255_2.pop();
        java.lang.Object obj13 = stack255_2.get(11);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test225");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_8 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj10 = stack255_8.get((int) (short) 0);
        boolean b11 = stack255_8.isFull();
        java.lang.Object obj13 = stack255_8.get((int) (short) 0);
        java.lang.Object obj15 = stack255_8.get((int) ' ');
        java.lang.Object obj17 = stack255_8.get((int) (short) -1);
        boolean b18 = stack255_2.push((java.lang.Object) (short) -1);
        java.lang.Object obj20 = stack255_2.get((int) '4');
        int i21 = stack255_2.size();
        boolean b22 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test226");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isFull();
        int i11 = stack255_2.capacity();
        boolean b13 = stack255_2.push((java.lang.Object) ' ');
        int i14 = stack255_2.size();
        boolean b15 = stack255_2.isFull();
        boolean b16 = stack255_2.isFull();
        boolean b17 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test227");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        java.lang.Object obj4 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i10 = stack255_9.capacity();
        int i11 = stack255_9.capacity();
        boolean b12 = stack255_9.isFull();
        java.lang.Object obj13 = stack255_9.pop();
        boolean b14 = stack255_2.push((java.lang.Object) stack255_9);
        int i15 = stack255_9.size();
        java.lang.Object obj16 = stack255_9.pop();
        int i17 = stack255_9.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test228");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        boolean b4 = stack255_2.isEmpty();
        int i5 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_8 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i9 = stack255_8.capacity();
        int i10 = stack255_8.size();
        java.lang.Object obj12 = stack255_8.get((int) (short) 0);
        int i13 = stack255_8.capacity();
        boolean b14 = stack255_8.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i18 = stack255_17.capacity();
        int i19 = stack255_17.capacity();
        boolean b20 = stack255_17.isFull();
        int i21 = stack255_17.capacity();
        int i22 = stack255_17.capacity();
        boolean b23 = stack255_8.push((java.lang.Object) stack255_17);
        java.lang.Object obj24 = stack255_17.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i28 = stack255_27.capacity();
        int i29 = stack255_27.size();
        java.lang.Object obj31 = stack255_27.get((int) (short) 0);
        int i32 = stack255_27.capacity();
        boolean b33 = stack255_27.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_36 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i37 = stack255_36.capacity();
        int i38 = stack255_36.capacity();
        boolean b39 = stack255_36.isFull();
        int i40 = stack255_36.capacity();
        int i41 = stack255_36.capacity();
        boolean b42 = stack255_27.push((java.lang.Object) stack255_36);
        java.lang.Object obj43 = stack255_27.pop();
        int i44 = stack255_27.size();
        boolean b45 = stack255_27.isFull();
        boolean b46 = stack255_17.push((java.lang.Object) stack255_27);
        io.github.agentsoz.jill.util.Stack255 stack255_49 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj50 = stack255_49.pop();
        boolean b51 = stack255_49.isEmpty();
        int i52 = stack255_49.size();
        int i53 = stack255_49.size();
        boolean b54 = stack255_49.isEmpty();
        boolean b55 = stack255_17.push((java.lang.Object) stack255_49);
        boolean b56 = stack255_17.isFull();
        int i57 = stack255_17.size();
        boolean b58 = stack255_2.push((java.lang.Object) stack255_17);
        int i59 = stack255_2.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 255);
        org.junit.Assert.assertTrue(i9 == 255);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 255);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(i28 == 255);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(i32 == 255);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i37 == 1);
        org.junit.Assert.assertTrue(i38 == 1);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 1);
        org.junit.Assert.assertTrue(i41 == 1);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(i57 == 2);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(i59 == 1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test229");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj4 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_7 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj9 = stack255_7.get((int) (short) 100);
        java.lang.Object obj10 = stack255_7.pop();
        boolean b11 = stack255_2.push((java.lang.Object) stack255_7);
        int i12 = stack255_2.capacity();
        boolean b13 = stack255_2.isEmpty();
        int i14 = stack255_2.size();
        boolean b15 = stack255_2.isFull();
        int i16 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test230");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        java.lang.Object obj4 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.pop();
        boolean b6 = stack255_2.isEmpty();
        boolean b7 = stack255_2.isFull();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test231");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj4 = stack255_2.pop();
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) -1);
        java.lang.Object obj8 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test232");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        boolean b6 = stack255_2.isEmpty();
        boolean b8 = stack255_2.push((java.lang.Object) "");
        java.lang.Object obj9 = null;
        boolean b10 = stack255_2.push(obj9);
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i14 = stack255_13.capacity();
        int i15 = stack255_13.capacity();
        java.lang.Object obj16 = stack255_13.pop();
        java.lang.Object obj17 = stack255_13.pop();
        java.lang.Object obj18 = stack255_13.pop();
        java.lang.Object obj20 = stack255_13.get((int) (short) 10);
        int i21 = stack255_13.size();
        int i22 = stack255_13.capacity();
        boolean b23 = stack255_13.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_26 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_29 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i30 = stack255_29.capacity();
        int i31 = stack255_29.capacity();
        java.lang.Object obj32 = stack255_29.pop();
        java.lang.Object obj33 = stack255_29.pop();
        java.lang.Object obj34 = stack255_29.pop();
        java.lang.Object obj36 = stack255_29.get((int) (short) 10);
        int i37 = stack255_29.size();
        boolean b38 = stack255_26.push((java.lang.Object) stack255_29);
        boolean b39 = stack255_13.push((java.lang.Object) stack255_29);
        java.lang.Object obj41 = stack255_13.get(255);
        java.lang.Object obj42 = stack255_13.pop();
        boolean b43 = stack255_13.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_46 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj47 = stack255_46.pop();
        boolean b48 = stack255_46.isEmpty();
        boolean b49 = stack255_46.isFull();
        boolean b50 = stack255_46.isEmpty();
        boolean b51 = stack255_46.isEmpty();
        java.lang.Object obj52 = stack255_46.pop();
        java.lang.Object obj53 = null;
        boolean b54 = stack255_46.push(obj53);
        int i55 = stack255_46.size();
        boolean b56 = stack255_13.push((java.lang.Object) i55);
        boolean b57 = stack255_13.isEmpty();
        boolean b58 = stack255_2.push((java.lang.Object) b57);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertTrue(i31 == 1);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(i55 == 1);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test233");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.get((int) (byte) 1);
        java.lang.Object obj7 = stack255_2.get((int) (short) -1);
        int i8 = stack255_2.size();
        boolean b9 = stack255_2.isFull();
        boolean b10 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test234");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b3 = stack255_2.isFull();
        boolean b4 = stack255_2.isEmpty();
        java.lang.Object obj6 = stack255_2.get((int) (byte) -1);
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get(10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test235");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b3 = stack255_2.isFull();
        boolean b5 = stack255_2.push((java.lang.Object) 1);
        int i6 = stack255_2.capacity();
        boolean b7 = stack255_2.isFull();
        boolean b8 = stack255_2.isFull();
        int i9 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 100);
        int i13 = stack255_12.size();
        java.lang.Object obj14 = stack255_12.pop();
        boolean b15 = stack255_2.push((java.lang.Object) stack255_12);
        java.lang.Object obj17 = stack255_2.get((int) (byte) 100);
        int i18 = stack255_2.capacity();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test236");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        int i11 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i15 = stack255_14.capacity();
        int i16 = stack255_14.capacity();
        java.lang.Object obj18 = stack255_14.get((int) 'a');
        java.lang.Object obj20 = stack255_14.get(100);
        java.lang.Object obj22 = stack255_14.get((int) (short) 10);
        java.lang.Object obj24 = stack255_14.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj28 = stack255_27.pop();
        boolean b29 = stack255_27.isFull();
        boolean b30 = stack255_14.push((java.lang.Object) stack255_27);
        boolean b31 = stack255_2.push((java.lang.Object) stack255_14);
        boolean b32 = stack255_14.isEmpty();
        boolean b33 = stack255_14.isFull();
        boolean b34 = stack255_14.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test237");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        int i6 = stack255_2.capacity();
        java.lang.Object obj7 = stack255_2.pop();
        boolean b8 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i12 = stack255_11.capacity();
        int i13 = stack255_11.capacity();
        java.lang.Object obj15 = stack255_11.get((int) 'a');
        int i16 = stack255_11.size();
        java.lang.Object obj18 = stack255_11.get(0);
        io.github.agentsoz.jill.util.Stack255 stack255_21 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        java.lang.Object obj23 = stack255_21.get((int) (byte) -1);
        boolean b25 = stack255_21.push((java.lang.Object) (-1.0d));
        boolean b26 = stack255_21.isFull();
        int i27 = stack255_21.size();
        boolean b28 = stack255_21.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_31 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) -1);
        boolean b32 = stack255_31.isEmpty();
        boolean b34 = stack255_31.push((java.lang.Object) 10L);
        java.lang.Object obj36 = stack255_31.get((int) (short) 0);
        boolean b37 = stack255_21.push(obj36);
        boolean b38 = stack255_11.push((java.lang.Object) b37);
        boolean b39 = stack255_2.push((java.lang.Object) stack255_11);
        io.github.agentsoz.jill.util.Stack255 stack255_42 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj43 = stack255_42.pop();
        java.lang.Object obj45 = stack255_42.get((int) (byte) -1);
        boolean b46 = stack255_42.isEmpty();
        int i47 = stack255_42.size();
        int i48 = stack255_42.size();
        boolean b49 = stack255_11.push((java.lang.Object) i48);
        io.github.agentsoz.jill.util.Stack255 stack255_52 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i53 = stack255_52.capacity();
        int i54 = stack255_52.capacity();
        java.lang.Object obj55 = stack255_52.pop();
        java.lang.Object obj56 = stack255_52.pop();
        boolean b57 = stack255_52.isEmpty();
        boolean b58 = stack255_52.isFull();
        boolean b59 = stack255_52.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_62 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) -1);
        io.github.agentsoz.jill.util.Stack255 stack255_65 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_68 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i69 = stack255_68.capacity();
        int i70 = stack255_68.capacity();
        java.lang.Object obj72 = stack255_68.get((int) 'a');
        boolean b73 = stack255_65.push((java.lang.Object) stack255_68);
        boolean b74 = stack255_62.push((java.lang.Object) stack255_65);
        boolean b75 = stack255_52.push((java.lang.Object) stack255_62);
        boolean b76 = stack255_11.push((java.lang.Object) stack255_62);
        java.lang.Object obj78 = stack255_11.get(11);
        java.lang.Object obj79 = stack255_11.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 10L + "'", obj36.equals(10L));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(i53 == 1);
        org.junit.Assert.assertTrue(i54 == 1);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i69 == 1);
        org.junit.Assert.assertTrue(i70 == 1);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(obj79);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test238");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test239");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.size();
        int i11 = stack255_2.capacity();
        boolean b12 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i19 = stack255_18.capacity();
        int i20 = stack255_18.capacity();
        java.lang.Object obj21 = stack255_18.pop();
        java.lang.Object obj22 = stack255_18.pop();
        java.lang.Object obj23 = stack255_18.pop();
        java.lang.Object obj25 = stack255_18.get((int) (short) 10);
        int i26 = stack255_18.size();
        boolean b27 = stack255_15.push((java.lang.Object) stack255_18);
        boolean b28 = stack255_2.push((java.lang.Object) stack255_18);
        boolean b29 = stack255_18.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test240");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) -1);
        java.lang.Object obj4 = stack255_2.get((int) (byte) 1);
        boolean b5 = stack255_2.isFull();
        int i6 = stack255_2.capacity();
        boolean b7 = stack255_2.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test241");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        boolean b6 = stack255_2.isFull();
        boolean b7 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test242");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        boolean b9 = stack255_5.isEmpty();
        boolean b11 = stack255_5.push((java.lang.Object) "");
        boolean b12 = stack255_2.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b16 = stack255_2.push((java.lang.Object) stack255_15);
        java.lang.Object obj17 = stack255_2.pop();
        int i18 = stack255_2.size();
        int i19 = stack255_2.capacity();
        int i20 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(i20 == 100);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test243");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 100);
        int i3 = stack255_2.size();
        java.lang.Object obj4 = stack255_2.pop();
        boolean b5 = stack255_2.isFull();
        boolean b6 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test244");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        boolean b4 = stack255_2.isEmpty();
        int i5 = stack255_2.size();
        int i6 = stack255_2.size();
        java.lang.Object obj8 = stack255_2.get((int) (short) 100);
        boolean b9 = stack255_2.isFull();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test245");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isEmpty();
        int i6 = stack255_2.size();
        boolean b7 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i14 = stack255_13.capacity();
        int i15 = stack255_13.capacity();
        java.lang.Object obj16 = stack255_13.pop();
        boolean b17 = stack255_13.isEmpty();
        boolean b19 = stack255_13.push((java.lang.Object) "");
        boolean b20 = stack255_10.push((java.lang.Object) "");
        boolean b21 = stack255_2.push((java.lang.Object) stack255_10);
        boolean b22 = stack255_2.isEmpty();
        java.lang.Object obj24 = stack255_2.get((int) (byte) 0);
        java.lang.Object obj26 = stack255_2.get(0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test246");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) -1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        java.lang.Object obj9 = stack255_5.pop();
        java.lang.Object obj10 = stack255_5.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj14 = stack255_13.pop();
        boolean b15 = stack255_13.isEmpty();
        boolean b16 = stack255_5.push((java.lang.Object) stack255_13);
        boolean b17 = stack255_2.push((java.lang.Object) stack255_13);
        boolean b18 = stack255_13.isEmpty();
        java.lang.Object obj19 = stack255_13.pop();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test247");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.size();
        java.lang.Object obj9 = stack255_5.get((int) (short) 0);
        boolean b10 = stack255_2.push((java.lang.Object) (short) 0);
        int i11 = stack255_2.size();
        org.junit.Assert.assertTrue(i6 == 255);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test248");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        java.lang.Object obj6 = stack255_2.get((int) (byte) 10);
        java.lang.Object obj7 = stack255_2.pop();
        boolean b8 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj13 = stack255_11.get((int) (short) 0);
        boolean b14 = stack255_11.isFull();
        java.lang.Object obj16 = stack255_11.get((int) (short) 0);
        java.lang.Object obj18 = stack255_11.get((int) ' ');
        java.lang.Object obj20 = stack255_11.get((int) (byte) 1);
        java.lang.Object obj21 = stack255_11.pop();
        int i22 = stack255_11.capacity();
        boolean b23 = stack255_2.push((java.lang.Object) i22);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test249");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        boolean b9 = stack255_5.isEmpty();
        boolean b11 = stack255_5.push((java.lang.Object) "");
        boolean b12 = stack255_2.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b16 = stack255_2.push((java.lang.Object) stack255_15);
        java.lang.Object obj17 = stack255_2.pop();
        int i18 = stack255_2.size();
        boolean b19 = stack255_2.isEmpty();
        boolean b20 = stack255_2.isEmpty();
        int i21 = stack255_2.size();
        int i22 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertTrue(i22 == 100);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test250");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        java.lang.Object obj4 = stack255_2.pop();
        int i5 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.pop();
        int i7 = stack255_2.size();
        java.lang.Object obj9 = stack255_2.get((int) '#');
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 255);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test251");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        java.lang.Object obj3 = null;
        boolean b4 = stack255_2.push(obj3);
        boolean b6 = stack255_2.push((java.lang.Object) 100.0f);
        boolean b7 = stack255_2.isEmpty();
        boolean b8 = stack255_2.isEmpty();
        boolean b9 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test252");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        java.lang.Object obj4 = stack255_2.get((int) (byte) -1);
        boolean b6 = stack255_2.push((java.lang.Object) (-1.0d));
        boolean b7 = stack255_2.isFull();
        int i8 = stack255_2.size();
        boolean b9 = stack255_2.isFull();
        int i10 = stack255_2.capacity();
        int i11 = stack255_2.capacity();
        int i12 = stack255_2.capacity();
        java.lang.Object obj13 = null;
        boolean b14 = stack255_2.push(obj13);
        boolean b15 = stack255_2.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 100);
        org.junit.Assert.assertTrue(i11 == 100);
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test253");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj9 = stack255_2.pop();
        int i10 = stack255_2.capacity();
        boolean b11 = stack255_2.isFull();
        boolean b12 = stack255_2.isFull();
        java.lang.Object obj13 = stack255_2.pop();
        boolean b14 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test254");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) -1);
        boolean b3 = stack255_2.isEmpty();
        java.lang.Object obj4 = stack255_2.pop();
        int i5 = stack255_2.size();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test255");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        java.lang.Object obj4 = stack255_2.pop();
        int i5 = stack255_2.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test256");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        java.lang.Object obj12 = stack255_2.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i19 = stack255_18.capacity();
        int i20 = stack255_18.capacity();
        java.lang.Object obj21 = stack255_18.pop();
        boolean b22 = stack255_18.isEmpty();
        boolean b24 = stack255_18.push((java.lang.Object) "");
        boolean b25 = stack255_15.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_28 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b29 = stack255_15.push((java.lang.Object) stack255_28);
        io.github.agentsoz.jill.util.Stack255 stack255_32 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i33 = stack255_32.capacity();
        int i34 = stack255_32.capacity();
        java.lang.Object obj36 = stack255_32.get((int) 'a');
        java.lang.Object obj38 = stack255_32.get(100);
        int i39 = stack255_32.capacity();
        boolean b40 = stack255_15.push((java.lang.Object) stack255_32);
        boolean b41 = stack255_15.isFull();
        boolean b42 = stack255_2.push((java.lang.Object) stack255_15);
        int i43 = stack255_2.size();
        boolean b44 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i33 == 1);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(i39 == 1);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(i43 == 1);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test257");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        java.lang.Object obj3 = stack255_2.pop();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) (byte) -1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test258");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) ' ');
        int i8 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i12 = stack255_11.capacity();
        int i13 = stack255_11.capacity();
        boolean b14 = stack255_11.isFull();
        int i15 = stack255_11.capacity();
        boolean b16 = stack255_11.isFull();
        java.lang.Object obj17 = stack255_11.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_20 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) -1);
        boolean b21 = stack255_20.isEmpty();
        boolean b23 = stack255_20.push((java.lang.Object) 10L);
        java.lang.Object obj25 = stack255_20.get((int) (short) 0);
        java.lang.Object obj27 = stack255_20.get(10);
        boolean b28 = stack255_11.push(obj27);
        boolean b29 = stack255_2.push((java.lang.Object) stack255_11);
        boolean b30 = stack255_2.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 10L + "'", obj25.equals(10L));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test259");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.size();
        java.lang.Object obj6 = stack255_2.get((int) (short) 0);
        int i7 = stack255_2.capacity();
        boolean b8 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i12 = stack255_11.capacity();
        int i13 = stack255_11.capacity();
        boolean b14 = stack255_11.isFull();
        int i15 = stack255_11.capacity();
        int i16 = stack255_11.capacity();
        boolean b17 = stack255_2.push((java.lang.Object) stack255_11);
        java.lang.Object obj18 = stack255_2.pop();
        int i19 = stack255_2.size();
        boolean b20 = stack255_2.isEmpty();
        int i21 = stack255_2.size();
        boolean b22 = stack255_2.isFull();
        java.lang.Object obj24 = stack255_2.get(100);
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 255);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test260");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.size();
        boolean b5 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test261");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 100);
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        int i7 = stack255_2.size();
        java.lang.Object obj9 = stack255_2.get((int) (short) -1);
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i13 = stack255_12.capacity();
        int i14 = stack255_12.capacity();
        boolean b15 = stack255_12.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj19 = stack255_18.pop();
        int i20 = stack255_18.size();
        int i21 = stack255_18.capacity();
        boolean b22 = stack255_18.isEmpty();
        boolean b23 = stack255_12.push((java.lang.Object) stack255_18);
        boolean b24 = stack255_2.push((java.lang.Object) stack255_12);
        int i25 = stack255_2.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 255);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i25 == 1);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test262");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isFull();
        java.lang.Object obj12 = stack255_2.get((int) (short) -1);
        java.lang.Object obj13 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test263");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        java.lang.Object obj4 = stack255_2.get((int) (byte) -1);
        boolean b6 = stack255_2.push((java.lang.Object) (-1.0d));
        boolean b7 = stack255_2.isFull();
        int i8 = stack255_2.capacity();
        int i9 = stack255_2.capacity();
        java.lang.Object obj11 = stack255_2.get(1);
        boolean b12 = stack255_2.isFull();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(i9 == 100);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test264");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isEmpty();
        boolean b8 = stack255_2.isFull();
        boolean b9 = stack255_2.isFull();
        boolean b10 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i14 = stack255_13.size();
        java.lang.Object obj16 = stack255_13.get((int) (short) 1);
        boolean b17 = stack255_13.isFull();
        java.lang.Object obj19 = stack255_13.get(255);
        boolean b20 = stack255_2.push((java.lang.Object) 255);
        boolean b21 = stack255_2.isFull();
        java.lang.Object obj23 = stack255_2.get((int) 'a');
        java.lang.Object obj25 = stack255_2.get((int) '#');
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test265");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b3 = stack255_2.isFull();
        boolean b5 = stack255_2.push((java.lang.Object) 1);
        int i6 = stack255_2.capacity();
        boolean b7 = stack255_2.isFull();
        boolean b8 = stack255_2.isFull();
        int i9 = stack255_2.capacity();
        java.lang.Object obj10 = stack255_2.pop();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 10);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1 + "'", obj10.equals(1));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test266");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.size();
        int i11 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i15 = stack255_14.capacity();
        int i16 = stack255_14.capacity();
        boolean b17 = stack255_2.push((java.lang.Object) stack255_14);
        int i18 = stack255_14.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i15 == 255);
        org.junit.Assert.assertTrue(i16 == 255);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test267");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.size();
        java.lang.Object obj9 = stack255_5.get((int) (short) 0);
        boolean b10 = stack255_2.push((java.lang.Object) (short) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i14 = stack255_13.capacity();
        int i15 = stack255_13.capacity();
        boolean b16 = stack255_13.isFull();
        int i17 = stack255_13.size();
        io.github.agentsoz.jill.util.Stack255 stack255_20 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj22 = stack255_20.get((int) (short) 0);
        boolean b23 = stack255_20.isFull();
        int i24 = stack255_20.capacity();
        boolean b25 = stack255_13.push((java.lang.Object) stack255_20);
        java.lang.Object obj26 = stack255_13.pop();
        boolean b27 = stack255_2.push((java.lang.Object) stack255_13);
        int i28 = stack255_13.size();
        int i29 = stack255_13.size();
        org.junit.Assert.assertTrue(i6 == 255);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(i29 == 0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test268");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        int i6 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj11 = stack255_9.get((int) (short) 0);
        boolean b12 = stack255_9.isFull();
        int i13 = stack255_9.capacity();
        boolean b14 = stack255_2.push((java.lang.Object) stack255_9);
        java.lang.Object obj15 = stack255_9.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test269");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        boolean b4 = stack255_2.isFull();
        java.lang.Object obj5 = stack255_2.pop();
        boolean b6 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i10 = stack255_9.capacity();
        int i11 = stack255_9.capacity();
        java.lang.Object obj12 = stack255_9.pop();
        java.lang.Object obj13 = stack255_9.pop();
        java.lang.Object obj14 = stack255_9.pop();
        java.lang.Object obj16 = stack255_9.get((int) (short) 10);
        int i17 = stack255_9.size();
        int i18 = stack255_9.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_21 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i22 = stack255_21.capacity();
        int i23 = stack255_21.capacity();
        boolean b24 = stack255_9.push((java.lang.Object) stack255_21);
        boolean b25 = stack255_9.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_28 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b29 = stack255_28.isFull();
        boolean b31 = stack255_28.push((java.lang.Object) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_34 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj36 = stack255_34.get((int) (short) 0);
        boolean b37 = stack255_34.isEmpty();
        java.lang.Object obj39 = stack255_34.get(0);
        boolean b40 = stack255_28.push((java.lang.Object) stack255_34);
        io.github.agentsoz.jill.util.Stack255 stack255_43 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj44 = stack255_43.pop();
        boolean b46 = stack255_43.push((java.lang.Object) true);
        int i47 = stack255_43.size();
        java.lang.Object obj48 = stack255_43.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_51 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj52 = stack255_51.pop();
        java.lang.Object obj54 = stack255_51.get((int) (byte) -1);
        boolean b55 = stack255_51.isEmpty();
        int i56 = stack255_51.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_59 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i60 = stack255_59.size();
        java.lang.Object obj62 = stack255_59.get((int) (short) 1);
        int i63 = stack255_59.size();
        java.lang.Object obj65 = stack255_59.get((int) (short) 100);
        int i66 = stack255_59.capacity();
        boolean b67 = stack255_51.push((java.lang.Object) stack255_59);
        io.github.agentsoz.jill.util.Stack255 stack255_70 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_73 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i74 = stack255_73.capacity();
        java.lang.Object obj75 = stack255_73.pop();
        java.lang.Object obj76 = null;
        boolean b77 = stack255_73.push(obj76);
        boolean b78 = stack255_70.push((java.lang.Object) b77);
        boolean b79 = stack255_59.push((java.lang.Object) b78);
        boolean b80 = stack255_59.isEmpty();
        boolean b81 = stack255_59.isEmpty();
        boolean b82 = stack255_43.push((java.lang.Object) stack255_59);
        java.lang.Object obj83 = stack255_43.pop();
        boolean b84 = stack255_28.push((java.lang.Object) stack255_43);
        boolean b85 = stack255_9.push((java.lang.Object) stack255_43);
        boolean b86 = stack255_43.isFull();
        boolean b87 = stack255_2.push((java.lang.Object) stack255_43);
        java.lang.Object obj88 = stack255_43.pop();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i22 == 255);
        org.junit.Assert.assertTrue(i23 == 255);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(i47 == 1);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + true + "'", obj48.equals(true));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(i56 == 10);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(i66 == 1);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(i74 == 255);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test270");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        java.lang.Object obj11 = stack255_2.get((int) (byte) 1);
        java.lang.Object obj12 = stack255_2.pop();
        int i13 = stack255_2.capacity();
        java.lang.Object obj14 = stack255_2.pop();
        boolean b15 = stack255_2.isFull();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test271");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        java.lang.Object obj6 = stack255_2.get((int) (byte) 10);
        boolean b8 = stack255_2.push((java.lang.Object) 10);
        int i9 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) -1);
        boolean b13 = stack255_12.isEmpty();
        boolean b14 = stack255_12.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i18 = stack255_17.capacity();
        int i19 = stack255_17.capacity();
        boolean b20 = stack255_17.isFull();
        int i21 = stack255_17.size();
        io.github.agentsoz.jill.util.Stack255 stack255_24 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj26 = stack255_24.get((int) (short) 0);
        boolean b27 = stack255_24.isFull();
        int i28 = stack255_24.capacity();
        boolean b29 = stack255_17.push((java.lang.Object) stack255_24);
        java.lang.Object obj30 = stack255_17.pop();
        boolean b31 = stack255_12.push((java.lang.Object) stack255_17);
        boolean b32 = stack255_12.isEmpty();
        int i33 = stack255_12.capacity();
        boolean b34 = stack255_2.push((java.lang.Object) stack255_12);
        boolean b35 = stack255_2.isFull();
        int i36 = stack255_2.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 10);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == 2);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test272");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        java.lang.Object obj4 = stack255_2.get((int) (byte) -1);
        boolean b6 = stack255_2.push((java.lang.Object) (-1.0d));
        boolean b7 = stack255_2.isFull();
        int i8 = stack255_2.size();
        boolean b9 = stack255_2.isFull();
        int i10 = stack255_2.capacity();
        int i11 = stack255_2.capacity();
        int i12 = stack255_2.capacity();
        boolean b13 = stack255_2.isFull();
        int i14 = stack255_2.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 100);
        org.junit.Assert.assertTrue(i11 == 100);
        org.junit.Assert.assertTrue(i12 == 100);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test273");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        boolean b4 = stack255_2.isEmpty();
        boolean b5 = stack255_2.isFull();
        boolean b6 = stack255_2.isEmpty();
        boolean b7 = stack255_2.isEmpty();
        java.lang.Object obj9 = stack255_2.get(255);
        boolean b10 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj14 = stack255_13.pop();
        java.lang.Object obj16 = stack255_13.get((int) (byte) -1);
        boolean b17 = stack255_13.isEmpty();
        int i18 = stack255_13.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_21 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i22 = stack255_21.size();
        java.lang.Object obj24 = stack255_21.get((int) (short) 1);
        int i25 = stack255_21.size();
        java.lang.Object obj27 = stack255_21.get((int) (short) 100);
        int i28 = stack255_21.capacity();
        boolean b29 = stack255_13.push((java.lang.Object) stack255_21);
        io.github.agentsoz.jill.util.Stack255 stack255_32 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_35 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i36 = stack255_35.capacity();
        java.lang.Object obj37 = stack255_35.pop();
        java.lang.Object obj38 = null;
        boolean b39 = stack255_35.push(obj38);
        boolean b40 = stack255_32.push((java.lang.Object) b39);
        boolean b41 = stack255_21.push((java.lang.Object) b40);
        boolean b42 = stack255_21.isEmpty();
        java.lang.Object obj44 = stack255_21.get((int) (byte) 100);
        boolean b45 = stack255_2.push(obj44);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i18 == 10);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i36 == 255);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test274");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        java.lang.Object obj12 = stack255_2.get((int) '4');
        int i13 = stack255_2.capacity();
        int i14 = stack255_2.size();
        boolean b15 = stack255_2.isFull();
        java.lang.Object obj17 = stack255_2.get((int) (byte) -1);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test275");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isEmpty();
        int i6 = stack255_2.size();
        boolean b7 = stack255_2.isFull();
        int i8 = stack255_2.capacity();
        java.lang.Object obj9 = stack255_2.pop();
        int i10 = stack255_2.size();
        boolean b11 = stack255_2.isFull();
        int i12 = stack255_2.capacity();
        boolean b13 = stack255_2.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test276");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj9 = stack255_5.get((int) 'a');
        boolean b10 = stack255_2.push((java.lang.Object) stack255_5);
        int i11 = stack255_5.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 1);
        int i15 = stack255_14.capacity();
        java.lang.Object obj17 = stack255_14.get((int) (short) 1);
        java.lang.Object obj19 = stack255_14.get(255);
        boolean b20 = stack255_5.push((java.lang.Object) stack255_14);
        int i21 = stack255_5.size();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i15 == 255);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i21 == 1);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test277");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b3 = stack255_2.isFull();
        boolean b5 = stack255_2.push((java.lang.Object) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_8 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b9 = stack255_2.push((java.lang.Object) stack255_8);
        java.lang.Object obj11 = stack255_2.get((int) (byte) 1);
        boolean b12 = stack255_2.isFull();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test278");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        int i6 = stack255_2.capacity();
        java.lang.Object obj7 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i11 = stack255_10.capacity();
        int i12 = stack255_10.capacity();
        java.lang.Object obj13 = stack255_10.pop();
        java.lang.Object obj14 = stack255_10.pop();
        java.lang.Object obj15 = stack255_10.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj19 = stack255_18.pop();
        boolean b20 = stack255_18.isEmpty();
        boolean b21 = stack255_10.push((java.lang.Object) stack255_18);
        boolean b22 = stack255_2.push((java.lang.Object) stack255_10);
        java.lang.Object obj24 = stack255_2.get(11);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test279");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.size();
        java.lang.Object obj9 = stack255_2.get(0);
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj14 = stack255_12.get((int) (short) 0);
        boolean b15 = stack255_12.isFull();
        java.lang.Object obj17 = stack255_12.get((int) (short) 0);
        java.lang.Object obj19 = stack255_12.get((int) ' ');
        java.lang.Object obj21 = stack255_12.get((int) (short) -1);
        boolean b22 = stack255_12.isEmpty();
        boolean b23 = stack255_12.isEmpty();
        java.lang.Object obj25 = stack255_12.get(0);
        io.github.agentsoz.jill.util.Stack255 stack255_28 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i29 = stack255_28.capacity();
        int i30 = stack255_28.capacity();
        boolean b31 = stack255_28.isFull();
        boolean b33 = stack255_28.push((java.lang.Object) (short) 100);
        java.lang.Object obj35 = stack255_28.get((-1));
        boolean b36 = stack255_28.isEmpty();
        java.lang.Object obj37 = stack255_28.pop();
        int i38 = stack255_28.capacity();
        java.lang.Object obj39 = stack255_28.pop();
        boolean b40 = stack255_12.push((java.lang.Object) stack255_28);
        boolean b41 = stack255_2.push((java.lang.Object) b40);
        boolean b42 = stack255_2.isEmpty();
        int i43 = stack255_2.size();
        int i44 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 100 + "'", obj37.equals((short) 100));
        org.junit.Assert.assertTrue(i38 == 1);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == 1);
        org.junit.Assert.assertTrue(i44 == 1);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test280");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) -1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        java.lang.Object obj9 = stack255_5.pop();
        java.lang.Object obj10 = stack255_5.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj14 = stack255_13.pop();
        boolean b15 = stack255_13.isEmpty();
        boolean b16 = stack255_5.push((java.lang.Object) stack255_13);
        boolean b17 = stack255_2.push((java.lang.Object) stack255_13);
        boolean b18 = stack255_2.isFull();
        boolean b19 = stack255_2.isFull();
        boolean b20 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test281");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.get((int) (byte) 1);
        boolean b6 = stack255_2.isFull();
        boolean b7 = stack255_2.isFull();
        boolean b8 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test282");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        java.lang.Object obj11 = stack255_2.get((int) (short) -1);
        boolean b12 = stack255_2.isEmpty();
        int i13 = stack255_2.capacity();
        int i14 = stack255_2.capacity();
        java.lang.Object obj15 = null;
        boolean b16 = stack255_2.push(obj15);
        java.lang.Object obj17 = stack255_2.pop();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test283");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj11 = stack255_10.pop();
        boolean b12 = stack255_10.isEmpty();
        boolean b13 = stack255_2.push((java.lang.Object) stack255_10);
        boolean b14 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        java.lang.Object obj18 = stack255_17.pop();
        java.lang.Object obj20 = stack255_17.get((int) 'a');
        io.github.agentsoz.jill.util.Stack255 stack255_23 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i24 = stack255_23.size();
        java.lang.Object obj26 = stack255_23.get((int) (short) 1);
        int i27 = stack255_23.size();
        java.lang.Object obj29 = stack255_23.get((int) (short) 100);
        int i30 = stack255_23.capacity();
        boolean b31 = stack255_17.push((java.lang.Object) stack255_23);
        boolean b32 = stack255_2.push((java.lang.Object) b31);
        int i33 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_36 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        boolean b37 = stack255_36.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_40 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i41 = stack255_40.capacity();
        int i42 = stack255_40.capacity();
        java.lang.Object obj43 = stack255_40.pop();
        java.lang.Object obj44 = stack255_40.pop();
        java.lang.Object obj45 = stack255_40.pop();
        int i46 = stack255_40.capacity();
        boolean b47 = stack255_36.push((java.lang.Object) stack255_40);
        boolean b48 = stack255_2.push((java.lang.Object) stack255_40);
        int i49 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(i33 == 2);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i41 == 1);
        org.junit.Assert.assertTrue(i42 == 1);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(i46 == 1);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(i49 == 3);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test284");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_6 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj8 = stack255_6.get((int) (short) 0);
        boolean b9 = stack255_6.isFull();
        java.lang.Object obj11 = stack255_6.get((int) ' ');
        int i12 = stack255_6.size();
        java.lang.Object obj14 = stack255_6.get((int) (byte) 0);
        boolean b15 = stack255_2.push((java.lang.Object) stack255_6);
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i19 = stack255_18.capacity();
        int i20 = stack255_18.capacity();
        int i21 = stack255_18.size();
        boolean b22 = stack255_2.push((java.lang.Object) stack255_18);
        io.github.agentsoz.jill.util.Stack255 stack255_25 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj27 = stack255_25.get((int) (short) 100);
        java.lang.Object obj28 = stack255_25.pop();
        boolean b29 = stack255_18.push((java.lang.Object) stack255_25);
        java.lang.Object obj30 = stack255_25.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test285");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isEmpty();
        boolean b8 = stack255_2.isFull();
        boolean b9 = stack255_2.isFull();
        boolean b10 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i14 = stack255_13.size();
        java.lang.Object obj16 = stack255_13.get((int) (short) 1);
        boolean b17 = stack255_13.isFull();
        java.lang.Object obj19 = stack255_13.get(255);
        boolean b20 = stack255_2.push((java.lang.Object) 255);
        boolean b21 = stack255_2.isFull();
        java.lang.Object obj23 = stack255_2.get(2);
        int i24 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i24 == 1);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test286");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        java.lang.Object obj3 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.get((int) 'a');
        io.github.agentsoz.jill.util.Stack255 stack255_8 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i9 = stack255_8.size();
        java.lang.Object obj11 = stack255_8.get((int) (short) 1);
        int i12 = stack255_8.size();
        java.lang.Object obj14 = stack255_8.get((int) (short) 100);
        int i15 = stack255_8.capacity();
        boolean b16 = stack255_2.push((java.lang.Object) stack255_8);
        boolean b17 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_20 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i21 = stack255_20.capacity();
        int i22 = stack255_20.capacity();
        java.lang.Object obj24 = stack255_20.get((int) 'a');
        int i25 = stack255_20.size();
        java.lang.Object obj27 = stack255_20.get((int) (byte) 10);
        boolean b28 = stack255_2.push((java.lang.Object) stack255_20);
        int i29 = stack255_20.size();
        io.github.agentsoz.jill.util.Stack255 stack255_32 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj34 = stack255_32.get((int) (short) 100);
        io.github.agentsoz.jill.util.Stack255 stack255_37 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj39 = stack255_37.get((int) (short) 0);
        boolean b40 = stack255_37.isFull();
        java.lang.Object obj42 = stack255_37.get((int) ' ');
        int i43 = stack255_37.size();
        boolean b44 = stack255_32.push((java.lang.Object) stack255_37);
        java.lang.Object obj46 = stack255_37.get(10);
        boolean b47 = stack255_20.push(obj46);
        java.lang.Object obj49 = stack255_20.get((int) (byte) 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test287");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.size();
        java.lang.Object obj9 = stack255_5.get((int) (short) 0);
        boolean b10 = stack255_2.push((java.lang.Object) (short) 0);
        boolean b11 = stack255_2.isEmpty();
        java.lang.Object obj12 = stack255_2.pop();
        java.lang.Object obj14 = stack255_2.get((int) (short) 1);
        int i15 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i6 == 255);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 0 + "'", obj12.equals((short) 0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test288");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj12 = stack255_10.get((int) (short) 0);
        boolean b13 = stack255_10.isFull();
        java.lang.Object obj15 = stack255_10.get((int) (short) 0);
        java.lang.Object obj17 = stack255_10.get((int) ' ');
        java.lang.Object obj19 = stack255_10.get((int) (short) -1);
        boolean b20 = stack255_10.isEmpty();
        int i21 = stack255_10.capacity();
        int i22 = stack255_10.capacity();
        boolean b23 = stack255_2.push((java.lang.Object) stack255_10);
        io.github.agentsoz.jill.util.Stack255 stack255_26 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i27 = stack255_26.size();
        boolean b28 = stack255_26.isFull();
        java.lang.Object obj29 = stack255_26.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_32 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_35 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i36 = stack255_35.capacity();
        int i37 = stack255_35.capacity();
        java.lang.Object obj38 = stack255_35.pop();
        boolean b39 = stack255_35.isEmpty();
        boolean b41 = stack255_35.push((java.lang.Object) "");
        boolean b42 = stack255_32.push((java.lang.Object) "");
        boolean b43 = stack255_32.isEmpty();
        boolean b44 = stack255_32.isEmpty();
        boolean b45 = stack255_26.push((java.lang.Object) b44);
        boolean b46 = stack255_2.push((java.lang.Object) b44);
        int i47 = stack255_2.size();
        boolean b48 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i36 == 1);
        org.junit.Assert.assertTrue(i37 == 1);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(i47 == 2);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test289");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        boolean b6 = stack255_2.isFull();
        java.lang.Object obj8 = stack255_2.get(255);
        boolean b9 = stack255_2.isFull();
        boolean b10 = stack255_2.isFull();
        java.lang.Object obj11 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test290");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 1);
        java.lang.Object obj3 = stack255_2.pop();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test291");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        java.lang.Object obj4 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) '#');
        boolean b10 = stack255_2.isEmpty();
        boolean b11 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        int i15 = stack255_14.capacity();
        java.lang.Object obj17 = stack255_14.get((int) 'a');
        boolean b18 = stack255_2.push((java.lang.Object) 'a');
        java.lang.Object obj20 = stack255_2.get((int) (byte) 10);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i15 == 10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test292");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isFull();
        boolean b9 = stack255_2.push((java.lang.Object) 100.0d);
        int i10 = stack255_2.size();
        boolean b11 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj15 = stack255_14.pop();
        boolean b16 = stack255_14.isEmpty();
        int i17 = stack255_14.size();
        java.lang.Object obj19 = stack255_14.get((int) (byte) 100);
        int i20 = stack255_14.size();
        boolean b21 = stack255_2.push((java.lang.Object) i20);
        java.lang.Object obj23 = stack255_2.get((int) (short) -1);
        boolean b24 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test293");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        java.lang.Object obj4 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isEmpty();
        boolean b8 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test294");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        boolean b10 = stack255_2.isFull();
        boolean b11 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        java.lang.Object obj15 = stack255_14.pop();
        java.lang.Object obj17 = stack255_14.get((int) 'a');
        io.github.agentsoz.jill.util.Stack255 stack255_20 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i21 = stack255_20.size();
        java.lang.Object obj23 = stack255_20.get((int) (short) 1);
        int i24 = stack255_20.size();
        java.lang.Object obj26 = stack255_20.get((int) (short) 100);
        int i27 = stack255_20.capacity();
        boolean b28 = stack255_14.push((java.lang.Object) stack255_20);
        io.github.agentsoz.jill.util.Stack255 stack255_31 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        java.lang.Object obj32 = stack255_31.pop();
        java.lang.Object obj34 = stack255_31.get(1);
        java.lang.Object obj35 = null;
        boolean b36 = stack255_31.push(obj35);
        boolean b37 = stack255_20.push((java.lang.Object) stack255_31);
        boolean b38 = stack255_2.push((java.lang.Object) stack255_31);
        boolean b39 = stack255_2.isFull();
        java.lang.Object obj40 = stack255_2.pop();
        int i41 = stack255_2.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue(i41 == 0);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test295");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.size();
        boolean b9 = stack255_2.push((java.lang.Object) (byte) 10);
        int i10 = stack255_2.size();
        java.lang.Object obj12 = stack255_2.get(10);
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i16 = stack255_15.size();
        java.lang.Object obj17 = stack255_15.pop();
        java.lang.Object obj18 = stack255_15.pop();
        boolean b19 = stack255_2.push(obj18);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test296");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        int i3 = stack255_2.size();
        int i4 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 10);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test297");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        java.lang.Object obj7 = stack255_2.get((int) (byte) 1);
        int i8 = stack255_2.size();
        java.lang.Object obj10 = stack255_2.get(0);
        boolean b11 = stack255_2.isEmpty();
        boolean b12 = stack255_2.isFull();
        boolean b13 = stack255_2.isFull();
        boolean b14 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test298");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isEmpty();
        boolean b8 = stack255_2.isFull();
        boolean b9 = stack255_2.isFull();
        boolean b10 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i14 = stack255_13.size();
        java.lang.Object obj16 = stack255_13.get((int) (short) 1);
        boolean b17 = stack255_13.isFull();
        java.lang.Object obj19 = stack255_13.get(255);
        boolean b20 = stack255_2.push((java.lang.Object) 255);
        int i21 = stack255_2.size();
        boolean b22 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test299");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj9 = stack255_2.pop();
        int i10 = stack255_2.capacity();
        boolean b11 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b15 = stack255_14.isFull();
        boolean b17 = stack255_14.push((java.lang.Object) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_20 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b21 = stack255_14.push((java.lang.Object) stack255_20);
        boolean b22 = stack255_20.isEmpty();
        boolean b23 = stack255_2.push((java.lang.Object) stack255_20);
        java.lang.Object obj24 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test300");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isFull();
        int i11 = stack255_2.capacity();
        boolean b13 = stack255_2.push((java.lang.Object) ' ');
        int i14 = stack255_2.size();
        boolean b15 = stack255_2.isEmpty();
        java.lang.Object obj16 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + ' ' + "'", obj16.equals(' '));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test301");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        java.lang.Object obj7 = stack255_2.get((int) (byte) 1);
        int i8 = stack255_2.size();
        boolean b9 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        int i13 = stack255_12.size();
        boolean b14 = stack255_12.isEmpty();
        java.lang.Object obj16 = stack255_12.get((int) 'a');
        boolean b17 = stack255_2.push((java.lang.Object) stack255_12);
        java.lang.Object obj18 = stack255_12.pop();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test302");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        java.lang.Object obj9 = stack255_5.pop();
        java.lang.Object obj10 = stack255_5.pop();
        java.lang.Object obj12 = stack255_5.get((int) (short) 10);
        int i13 = stack255_5.size();
        boolean b14 = stack255_2.push((java.lang.Object) stack255_5);
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b18 = stack255_17.isFull();
        boolean b19 = stack255_17.isEmpty();
        java.lang.Object obj21 = stack255_17.get((int) (byte) -1);
        int i22 = stack255_17.size();
        int i23 = stack255_17.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_26 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i27 = stack255_26.capacity();
        int i28 = stack255_26.capacity();
        boolean b29 = stack255_26.isFull();
        boolean b31 = stack255_26.push((java.lang.Object) (short) 100);
        java.lang.Object obj33 = stack255_26.get((-1));
        boolean b34 = stack255_26.isEmpty();
        java.lang.Object obj35 = stack255_26.pop();
        boolean b36 = stack255_17.push((java.lang.Object) stack255_26);
        boolean b37 = stack255_5.push((java.lang.Object) stack255_17);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 100 + "'", obj35.equals((short) 100));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test303");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isFull();
        int i11 = stack255_2.capacity();
        int i12 = stack255_2.size();
        java.lang.Object obj13 = stack255_2.pop();
        boolean b14 = stack255_2.isFull();
        boolean b15 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test304");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_6 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) -1);
        boolean b7 = stack255_2.push((java.lang.Object) (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i11 = stack255_10.capacity();
        int i12 = stack255_10.capacity();
        java.lang.Object obj13 = stack255_10.pop();
        boolean b14 = stack255_10.isEmpty();
        boolean b16 = stack255_10.push((java.lang.Object) "");
        boolean b17 = stack255_2.push((java.lang.Object) "");
        java.lang.Object obj18 = stack255_2.pop();
        int i19 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "" + "'", obj18.equals(""));
        org.junit.Assert.assertTrue(i19 == 255);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test305");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.size();
        int i11 = stack255_2.capacity();
        boolean b12 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i19 = stack255_18.capacity();
        int i20 = stack255_18.capacity();
        java.lang.Object obj21 = stack255_18.pop();
        java.lang.Object obj22 = stack255_18.pop();
        java.lang.Object obj23 = stack255_18.pop();
        java.lang.Object obj25 = stack255_18.get((int) (short) 10);
        int i26 = stack255_18.size();
        boolean b27 = stack255_15.push((java.lang.Object) stack255_18);
        boolean b28 = stack255_2.push((java.lang.Object) stack255_18);
        java.lang.Object obj30 = stack255_2.get(255);
        boolean b31 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test306");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        boolean b9 = stack255_5.isEmpty();
        boolean b11 = stack255_5.push((java.lang.Object) "");
        boolean b12 = stack255_2.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b16 = stack255_2.push((java.lang.Object) stack255_15);
        io.github.agentsoz.jill.util.Stack255 stack255_19 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i20 = stack255_19.capacity();
        int i21 = stack255_19.capacity();
        java.lang.Object obj23 = stack255_19.get((int) 'a');
        java.lang.Object obj25 = stack255_19.get(100);
        int i26 = stack255_19.capacity();
        boolean b27 = stack255_2.push((java.lang.Object) stack255_19);
        java.lang.Object obj29 = stack255_19.get((int) (short) 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test307");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        boolean b7 = stack255_2.push((java.lang.Object) (short) 100);
        java.lang.Object obj9 = stack255_2.get((-1));
        boolean b10 = stack255_2.isEmpty();
        java.lang.Object obj11 = stack255_2.pop();
        java.lang.Object obj12 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i16 = stack255_15.size();
        java.lang.Object obj18 = stack255_15.get((int) (short) 1);
        int i19 = stack255_15.size();
        java.lang.Object obj21 = stack255_15.get((int) (short) 100);
        boolean b22 = stack255_2.push(obj21);
        java.lang.Object obj24 = stack255_2.get(11);
        int i25 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(i25 == 1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test308");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.size();
        java.lang.Object obj6 = stack255_2.get((int) (short) 0);
        int i7 = stack255_2.capacity();
        boolean b8 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i12 = stack255_11.capacity();
        int i13 = stack255_11.capacity();
        boolean b14 = stack255_11.isFull();
        int i15 = stack255_11.capacity();
        int i16 = stack255_11.capacity();
        boolean b17 = stack255_2.push((java.lang.Object) stack255_11);
        java.lang.Object obj18 = stack255_2.pop();
        int i19 = stack255_2.size();
        boolean b20 = stack255_2.isEmpty();
        java.lang.Object obj22 = stack255_2.get((int) ' ');
        int i23 = stack255_2.size();
        boolean b24 = stack255_2.isFull();
        boolean b25 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 255);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test309");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.size();
        java.lang.Object obj6 = stack255_2.get((int) (short) 0);
        int i7 = stack255_2.capacity();
        boolean b8 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i12 = stack255_11.capacity();
        int i13 = stack255_11.capacity();
        boolean b14 = stack255_11.isFull();
        int i15 = stack255_11.capacity();
        int i16 = stack255_11.capacity();
        boolean b17 = stack255_2.push((java.lang.Object) stack255_11);
        io.github.agentsoz.jill.util.Stack255 stack255_20 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj22 = stack255_20.get((int) (short) 0);
        boolean b23 = stack255_20.isEmpty();
        int i24 = stack255_20.size();
        boolean b25 = stack255_20.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_28 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_31 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i32 = stack255_31.capacity();
        int i33 = stack255_31.capacity();
        java.lang.Object obj34 = stack255_31.pop();
        boolean b35 = stack255_31.isEmpty();
        boolean b37 = stack255_31.push((java.lang.Object) "");
        boolean b38 = stack255_28.push((java.lang.Object) "");
        boolean b39 = stack255_20.push((java.lang.Object) stack255_28);
        boolean b40 = stack255_2.push((java.lang.Object) stack255_20);
        boolean b41 = stack255_20.isFull();
        int i42 = stack255_20.capacity();
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 255);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertTrue(i33 == 1);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == 11);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test310");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        java.lang.Object obj9 = stack255_5.pop();
        java.lang.Object obj10 = stack255_5.pop();
        java.lang.Object obj12 = stack255_5.get((int) (short) 10);
        int i13 = stack255_5.size();
        boolean b14 = stack255_2.push((java.lang.Object) stack255_5);
        int i15 = stack255_2.capacity();
        java.lang.Object obj17 = stack255_2.get((int) (short) 0);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test311");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        java.lang.Object obj4 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i10 = stack255_9.capacity();
        int i11 = stack255_9.capacity();
        boolean b12 = stack255_9.isFull();
        java.lang.Object obj13 = stack255_9.pop();
        boolean b14 = stack255_2.push((java.lang.Object) stack255_9);
        int i15 = stack255_2.size();
        java.lang.Object obj17 = stack255_2.get(0);
        int i18 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue(i18 == 1);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test312");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        java.lang.Object obj4 = stack255_2.get((int) (byte) -1);
        boolean b6 = stack255_2.push((java.lang.Object) 10.0f);
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 100);
        java.lang.Object obj10 = stack255_2.pop();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0f + "'", obj7.equals(10.0f));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test313");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.get((int) (byte) 1);
        boolean b6 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.pop();
        int i8 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test314");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b3 = stack255_2.isFull();
        boolean b5 = stack255_2.push((java.lang.Object) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_8 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b9 = stack255_2.push((java.lang.Object) stack255_8);
        int i10 = stack255_2.size();
        java.lang.Object obj12 = stack255_2.get((int) (short) 10);
        boolean b13 = stack255_2.isEmpty();
        int i14 = stack255_2.size();
        int i15 = stack255_2.capacity();
        java.lang.Object obj17 = stack255_2.get((int) (short) -1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 2);
        org.junit.Assert.assertTrue(i15 == 10);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test315");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isFull();
        boolean b9 = stack255_2.push((java.lang.Object) 100.0d);
        int i10 = stack255_2.size();
        boolean b11 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj15 = stack255_14.pop();
        boolean b16 = stack255_14.isEmpty();
        int i17 = stack255_14.size();
        java.lang.Object obj19 = stack255_14.get((int) (byte) 100);
        int i20 = stack255_14.size();
        boolean b21 = stack255_2.push((java.lang.Object) i20);
        boolean b22 = stack255_2.isEmpty();
        java.lang.Object obj24 = stack255_2.get((int) (byte) 0);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100.0d + "'", obj24.equals(100.0d));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test316");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        boolean b7 = stack255_2.push((java.lang.Object) (short) 100);
        java.lang.Object obj9 = stack255_2.get((-1));
        boolean b10 = stack255_2.isEmpty();
        java.lang.Object obj11 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i18 = stack255_17.capacity();
        int i19 = stack255_17.capacity();
        java.lang.Object obj20 = stack255_17.pop();
        boolean b21 = stack255_17.isEmpty();
        boolean b23 = stack255_17.push((java.lang.Object) "");
        boolean b24 = stack255_14.push((java.lang.Object) "");
        boolean b25 = stack255_14.isEmpty();
        boolean b26 = stack255_2.push((java.lang.Object) stack255_14);
        boolean b27 = stack255_2.isEmpty();
        boolean b28 = stack255_2.isEmpty();
        boolean b29 = stack255_2.isEmpty();
        java.lang.Object obj30 = stack255_2.pop();
        int i31 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue(i31 == 1);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test317");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        boolean b7 = stack255_2.push((java.lang.Object) (short) 100);
        int i8 = stack255_2.capacity();
        int i9 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        boolean b13 = stack255_2.push((java.lang.Object) stack255_12);
        java.lang.Object obj15 = stack255_12.get(0);
        int i16 = stack255_12.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test318");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        boolean b4 = stack255_2.isFull();
        boolean b5 = stack255_2.isEmpty();
        java.lang.Object obj7 = stack255_2.get((-1));
        boolean b8 = stack255_2.isEmpty();
        int i9 = stack255_2.capacity();
        int i10 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test319");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        int i11 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i15 = stack255_14.capacity();
        int i16 = stack255_14.capacity();
        java.lang.Object obj18 = stack255_14.get((int) 'a');
        java.lang.Object obj20 = stack255_14.get(100);
        java.lang.Object obj22 = stack255_14.get((int) (short) 10);
        java.lang.Object obj24 = stack255_14.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj28 = stack255_27.pop();
        boolean b29 = stack255_27.isFull();
        boolean b30 = stack255_14.push((java.lang.Object) stack255_27);
        boolean b31 = stack255_2.push((java.lang.Object) stack255_14);
        java.lang.Object obj33 = stack255_2.get((int) (byte) -1);
        java.lang.Object obj34 = stack255_2.pop();
        int i35 = stack255_2.capacity();
        int i36 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue(i36 == 1);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test320");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 100);
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        int i7 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i11 = stack255_10.capacity();
        java.lang.Object obj12 = stack255_10.pop();
        java.lang.Object obj13 = stack255_10.pop();
        java.lang.Object obj14 = stack255_10.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i18 = stack255_17.capacity();
        int i19 = stack255_17.capacity();
        boolean b20 = stack255_17.isFull();
        java.lang.Object obj21 = stack255_17.pop();
        boolean b22 = stack255_10.push((java.lang.Object) stack255_17);
        int i23 = stack255_10.size();
        java.lang.Object obj24 = stack255_10.pop();
        boolean b25 = stack255_2.push((java.lang.Object) stack255_10);
        io.github.agentsoz.jill.util.Stack255 stack255_28 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i29 = stack255_28.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_32 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) -1);
        boolean b33 = stack255_28.push((java.lang.Object) (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_36 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i37 = stack255_36.capacity();
        int i38 = stack255_36.capacity();
        java.lang.Object obj39 = stack255_36.pop();
        boolean b40 = stack255_36.isEmpty();
        boolean b42 = stack255_36.push((java.lang.Object) "");
        boolean b43 = stack255_28.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_46 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        java.lang.Object obj47 = stack255_46.pop();
        java.lang.Object obj49 = stack255_46.get((int) 'a');
        java.lang.Object obj51 = stack255_46.get((int) (byte) 10);
        boolean b52 = stack255_28.push((java.lang.Object) stack255_46);
        boolean b53 = stack255_2.push((java.lang.Object) b52);
        java.lang.Object obj54 = stack255_2.pop();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(i29 == 255);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(i37 == 1);
        org.junit.Assert.assertTrue(i38 == 1);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + true + "'", obj54.equals(true));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test321");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        boolean b7 = stack255_2.push((java.lang.Object) (short) 100);
        int i8 = stack255_2.capacity();
        int i9 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        boolean b13 = stack255_2.push((java.lang.Object) stack255_12);
        int i14 = stack255_12.size();
        java.lang.Object obj16 = stack255_12.get((int) '#');
        io.github.agentsoz.jill.util.Stack255 stack255_19 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj21 = stack255_19.get((int) (short) 0);
        java.lang.Object obj23 = stack255_19.get((int) (byte) 10);
        java.lang.Object obj24 = stack255_19.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) -1);
        boolean b28 = stack255_27.isEmpty();
        boolean b29 = stack255_27.isEmpty();
        boolean b30 = stack255_27.isEmpty();
        java.lang.Object obj31 = null;
        boolean b32 = stack255_27.push(obj31);
        int i33 = stack255_27.capacity();
        java.lang.Object obj35 = stack255_27.get((int) (short) 100);
        boolean b36 = stack255_19.push((java.lang.Object) stack255_27);
        boolean b37 = stack255_12.push((java.lang.Object) stack255_27);
        java.lang.Object obj39 = stack255_27.get(10);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(i33 == 10);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test322");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.size();
        java.lang.Object obj9 = stack255_2.get(0);
        boolean b10 = stack255_2.isFull();
        boolean b11 = stack255_2.isFull();
        int i12 = stack255_2.size();
        java.lang.Object obj13 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test323");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        int i11 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i15 = stack255_14.capacity();
        int i16 = stack255_14.capacity();
        java.lang.Object obj18 = stack255_14.get((int) 'a');
        java.lang.Object obj20 = stack255_14.get(100);
        java.lang.Object obj22 = stack255_14.get((int) (short) 10);
        java.lang.Object obj24 = stack255_14.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj28 = stack255_27.pop();
        boolean b29 = stack255_27.isFull();
        boolean b30 = stack255_14.push((java.lang.Object) stack255_27);
        boolean b31 = stack255_2.push((java.lang.Object) stack255_14);
        int i32 = stack255_14.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(i32 == 1);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test324");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) -1);
        boolean b3 = stack255_2.isEmpty();
        boolean b4 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_7 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i8 = stack255_7.capacity();
        int i9 = stack255_7.capacity();
        java.lang.Object obj11 = stack255_7.get((int) 'a');
        java.lang.Object obj13 = stack255_7.get(100);
        java.lang.Object obj15 = stack255_7.get((int) (short) 10);
        int i16 = stack255_7.capacity();
        java.lang.Object obj17 = stack255_7.pop();
        boolean b18 = stack255_2.push(obj17);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test325");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        java.lang.Object obj4 = stack255_2.get((int) (short) -1);
        java.lang.Object obj6 = stack255_2.get(0);
        boolean b7 = stack255_2.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test326");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        boolean b9 = stack255_5.isEmpty();
        boolean b11 = stack255_5.push((java.lang.Object) "");
        boolean b12 = stack255_2.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        java.lang.Object obj16 = null;
        boolean b17 = stack255_15.push(obj16);
        boolean b18 = stack255_2.push(obj16);
        io.github.agentsoz.jill.util.Stack255 stack255_21 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i22 = stack255_21.capacity();
        int i23 = stack255_21.capacity();
        boolean b24 = stack255_21.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj29 = stack255_27.get((int) (short) 0);
        boolean b30 = stack255_27.isFull();
        java.lang.Object obj32 = stack255_27.get((int) (short) 0);
        java.lang.Object obj34 = stack255_27.get((int) ' ');
        java.lang.Object obj36 = stack255_27.get((int) (short) -1);
        boolean b37 = stack255_21.push((java.lang.Object) (short) -1);
        boolean b38 = stack255_21.isFull();
        boolean b39 = stack255_2.push((java.lang.Object) b38);
        int i40 = stack255_2.size();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i40 == 3);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test327");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        int i6 = stack255_2.size();
        int i7 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test328");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isFull();
        int i11 = stack255_2.capacity();
        boolean b13 = stack255_2.push((java.lang.Object) ' ');
        int i14 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 0);
        boolean b18 = stack255_2.push((java.lang.Object) (byte) 0);
        java.lang.Object obj19 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (byte) 0 + "'", obj19.equals((byte) 0));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test329");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        java.lang.Object obj11 = stack255_2.get((int) (short) -1);
        boolean b12 = stack255_2.isEmpty();
        int i13 = stack255_2.capacity();
        int i14 = stack255_2.capacity();
        java.lang.Object obj15 = null;
        boolean b16 = stack255_2.push(obj15);
        boolean b17 = stack255_2.isFull();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test330");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        java.lang.Object obj12 = stack255_2.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj16 = stack255_15.pop();
        boolean b17 = stack255_15.isFull();
        boolean b18 = stack255_2.push((java.lang.Object) stack255_15);
        java.lang.Object obj20 = stack255_15.get((int) 'a');
        boolean b21 = stack255_15.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_24 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 1);
        int i25 = stack255_24.capacity();
        boolean b26 = stack255_15.push((java.lang.Object) i25);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test331");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        java.lang.Object obj4 = stack255_2.get((int) (byte) -1);
        boolean b6 = stack255_2.push((java.lang.Object) (-1.0d));
        boolean b7 = stack255_2.isFull();
        java.lang.Object obj9 = stack255_2.get((int) '#');
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test332");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        java.lang.Object obj11 = stack255_2.get((int) (short) -1);
        boolean b12 = stack255_2.isEmpty();
        int i13 = stack255_2.capacity();
        int i14 = stack255_2.capacity();
        boolean b15 = stack255_2.isEmpty();
        int i16 = stack255_2.size();
        boolean b17 = stack255_2.isFull();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test333");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        java.lang.Object obj9 = stack255_5.pop();
        java.lang.Object obj10 = stack255_5.pop();
        java.lang.Object obj12 = stack255_5.get((int) (short) 10);
        int i13 = stack255_5.size();
        boolean b14 = stack255_2.push((java.lang.Object) stack255_5);
        java.lang.Object obj16 = stack255_2.get((int) 'a');
        java.lang.Object obj18 = stack255_2.get((int) (byte) 100);
        io.github.agentsoz.jill.util.Stack255 stack255_21 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        java.lang.Object obj23 = stack255_21.get(255);
        boolean b24 = stack255_2.push((java.lang.Object) stack255_21);
        int i25 = stack255_21.capacity();
        int i26 = stack255_21.capacity();
        int i27 = stack255_21.size();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test334");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.size();
        boolean b8 = stack255_2.isFull();
        java.lang.Object obj9 = stack255_2.pop();
        boolean b10 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test335");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        boolean b10 = stack255_2.isEmpty();
        int i11 = stack255_2.capacity();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test336");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b3 = stack255_2.isFull();
        java.lang.Object obj5 = stack255_2.get(2);
        int i6 = stack255_2.capacity();
        int i7 = stack255_2.capacity();
        boolean b8 = stack255_2.isEmpty();
        int i9 = stack255_2.capacity();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test337");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) -1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.size();
        java.lang.Object obj9 = stack255_5.get((int) (short) 0);
        int i10 = stack255_5.capacity();
        boolean b11 = stack255_5.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i15 = stack255_14.capacity();
        int i16 = stack255_14.capacity();
        boolean b17 = stack255_14.isFull();
        int i18 = stack255_14.capacity();
        int i19 = stack255_14.capacity();
        boolean b20 = stack255_5.push((java.lang.Object) stack255_14);
        io.github.agentsoz.jill.util.Stack255 stack255_23 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj25 = stack255_23.get((int) (short) 0);
        boolean b26 = stack255_23.isEmpty();
        int i27 = stack255_23.size();
        boolean b28 = stack255_23.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_31 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_34 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i35 = stack255_34.capacity();
        int i36 = stack255_34.capacity();
        java.lang.Object obj37 = stack255_34.pop();
        boolean b38 = stack255_34.isEmpty();
        boolean b40 = stack255_34.push((java.lang.Object) "");
        boolean b41 = stack255_31.push((java.lang.Object) "");
        boolean b42 = stack255_23.push((java.lang.Object) stack255_31);
        boolean b43 = stack255_5.push((java.lang.Object) stack255_23);
        boolean b44 = stack255_23.isFull();
        boolean b45 = stack255_23.isEmpty();
        boolean b46 = stack255_2.push((java.lang.Object) stack255_23);
        io.github.agentsoz.jill.util.Stack255 stack255_49 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj50 = stack255_49.pop();
        boolean b51 = stack255_49.isEmpty();
        int i52 = stack255_49.size();
        int i53 = stack255_49.size();
        boolean b54 = stack255_49.isEmpty();
        int i55 = stack255_49.size();
        int i56 = stack255_49.capacity();
        java.lang.Object obj58 = stack255_49.get((int) (byte) 100);
        boolean b59 = stack255_2.push((java.lang.Object) (byte) 100);
        java.lang.Object obj61 = stack255_2.get((int) (byte) 1);
        org.junit.Assert.assertTrue(i6 == 255);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 255);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue(i36 == 1);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertTrue(i56 == 255);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + (byte) 100 + "'", obj61.equals((byte) 100));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test338");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        java.lang.Object obj6 = stack255_2.get((int) (byte) 10);
        boolean b8 = stack255_2.push((java.lang.Object) 10);
        int i9 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) -1);
        boolean b13 = stack255_12.isEmpty();
        boolean b14 = stack255_12.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i18 = stack255_17.capacity();
        int i19 = stack255_17.capacity();
        boolean b20 = stack255_17.isFull();
        int i21 = stack255_17.size();
        io.github.agentsoz.jill.util.Stack255 stack255_24 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj26 = stack255_24.get((int) (short) 0);
        boolean b27 = stack255_24.isFull();
        int i28 = stack255_24.capacity();
        boolean b29 = stack255_17.push((java.lang.Object) stack255_24);
        java.lang.Object obj30 = stack255_17.pop();
        boolean b31 = stack255_12.push((java.lang.Object) stack255_17);
        boolean b32 = stack255_12.isEmpty();
        int i33 = stack255_12.capacity();
        boolean b34 = stack255_2.push((java.lang.Object) stack255_12);
        int i35 = stack255_2.size();
        int i36 = stack255_2.size();
        java.lang.Object obj38 = stack255_2.get(3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 10);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(i35 == 2);
        org.junit.Assert.assertTrue(i36 == 2);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test339");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        boolean b8 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj13 = stack255_11.get((int) (short) 0);
        boolean b14 = stack255_11.isFull();
        java.lang.Object obj16 = stack255_11.get((int) (short) 0);
        boolean b17 = stack255_11.isFull();
        java.lang.Object obj19 = stack255_11.get((int) (byte) 100);
        io.github.agentsoz.jill.util.Stack255 stack255_22 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        int i23 = stack255_22.size();
        boolean b24 = stack255_11.push((java.lang.Object) stack255_22);
        boolean b25 = stack255_2.push((java.lang.Object) b24);
        int i26 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(i26 == 1);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test340");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        boolean b9 = stack255_5.isEmpty();
        boolean b11 = stack255_5.push((java.lang.Object) "");
        boolean b12 = stack255_2.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b16 = stack255_2.push((java.lang.Object) stack255_15);
        io.github.agentsoz.jill.util.Stack255 stack255_19 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i20 = stack255_19.capacity();
        int i21 = stack255_19.capacity();
        java.lang.Object obj23 = stack255_19.get((int) 'a');
        java.lang.Object obj25 = stack255_19.get(100);
        int i26 = stack255_19.capacity();
        boolean b27 = stack255_2.push((java.lang.Object) stack255_19);
        int i28 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_31 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i32 = stack255_31.capacity();
        int i33 = stack255_31.capacity();
        java.lang.Object obj35 = stack255_31.get((int) 'a');
        java.lang.Object obj37 = stack255_31.get(100);
        java.lang.Object obj39 = stack255_31.get((int) (short) 10);
        java.lang.Object obj41 = stack255_31.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_44 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_47 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i48 = stack255_47.capacity();
        int i49 = stack255_47.capacity();
        java.lang.Object obj50 = stack255_47.pop();
        boolean b51 = stack255_47.isEmpty();
        boolean b53 = stack255_47.push((java.lang.Object) "");
        boolean b54 = stack255_44.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_57 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b58 = stack255_44.push((java.lang.Object) stack255_57);
        io.github.agentsoz.jill.util.Stack255 stack255_61 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i62 = stack255_61.capacity();
        int i63 = stack255_61.capacity();
        java.lang.Object obj65 = stack255_61.get((int) 'a');
        java.lang.Object obj67 = stack255_61.get(100);
        int i68 = stack255_61.capacity();
        boolean b69 = stack255_44.push((java.lang.Object) stack255_61);
        boolean b70 = stack255_44.isFull();
        boolean b71 = stack255_31.push((java.lang.Object) stack255_44);
        java.lang.Object obj73 = stack255_31.get((int) ' ');
        int i74 = stack255_31.capacity();
        boolean b75 = stack255_31.isFull();
        java.lang.Object obj76 = stack255_31.pop();
        boolean b77 = stack255_2.push(obj76);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(i28 == 3);
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertTrue(i33 == 1);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(i48 == 1);
        org.junit.Assert.assertTrue(i49 == 1);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(i62 == 1);
        org.junit.Assert.assertTrue(i63 == 1);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(i68 == 1);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(i74 == 1);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertTrue(b77 == true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test341");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.size();
        java.lang.Object obj6 = stack255_2.get((int) (short) 0);
        int i7 = stack255_2.capacity();
        boolean b8 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i12 = stack255_11.capacity();
        int i13 = stack255_11.capacity();
        boolean b14 = stack255_11.isFull();
        int i15 = stack255_11.capacity();
        int i16 = stack255_11.capacity();
        boolean b17 = stack255_2.push((java.lang.Object) stack255_11);
        java.lang.Object obj18 = stack255_2.pop();
        int i19 = stack255_2.capacity();
        java.lang.Object obj20 = new java.lang.Object();
        boolean b21 = stack255_2.push(obj20);
        int i22 = stack255_2.capacity();
        java.lang.Object obj24 = stack255_2.get(1);
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        boolean b28 = stack255_2.push((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 255);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue(i19 == 255);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i22 == 255);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b28 == true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test342");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        boolean b6 = stack255_2.isEmpty();
        boolean b8 = stack255_2.push((java.lang.Object) "");
        java.lang.Object obj9 = null;
        boolean b10 = stack255_2.push(obj9);
        boolean b11 = stack255_2.isEmpty();
        boolean b12 = stack255_2.isEmpty();
        java.lang.Object obj14 = stack255_2.get((int) (byte) 10);
        java.lang.Object obj16 = stack255_2.get(3);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test343");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj9 = stack255_2.pop();
        java.lang.Object obj11 = stack255_2.get((int) 'a');
        boolean b12 = stack255_2.isEmpty();
        boolean b13 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test344");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 100);
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        int i7 = stack255_2.size();
        java.lang.Object obj9 = stack255_2.get((int) (short) -1);
        java.lang.Object obj10 = stack255_2.pop();
        boolean b11 = stack255_2.isFull();
        int i12 = stack255_2.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test345");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (byte) -1);
        int i5 = stack255_2.capacity();
        int i6 = stack255_2.capacity();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test346");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i11 = stack255_10.capacity();
        int i12 = stack255_10.capacity();
        java.lang.Object obj14 = stack255_10.get((int) 'a');
        int i15 = stack255_10.size();
        java.lang.Object obj17 = stack255_10.get(0);
        int i18 = stack255_10.capacity();
        int i19 = stack255_10.capacity();
        boolean b20 = stack255_2.push((java.lang.Object) i19);
        io.github.agentsoz.jill.util.Stack255 stack255_23 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj25 = stack255_23.get((int) (short) 100);
        java.lang.Object obj26 = stack255_23.pop();
        java.lang.Object obj27 = stack255_23.pop();
        int i28 = stack255_23.size();
        int i29 = stack255_23.size();
        boolean b30 = stack255_2.push((java.lang.Object) stack255_23);
        int i31 = stack255_23.capacity();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(i31 == 1);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test347");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        boolean b4 = stack255_2.isEmpty();
        int i5 = stack255_2.size();
        java.lang.Object obj7 = stack255_2.get((int) (byte) 100);
        boolean b8 = stack255_2.isFull();
        boolean b9 = stack255_2.isEmpty();
        int i10 = stack255_2.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test348");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isFull();
        int i11 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i15 = stack255_14.capacity();
        int i16 = stack255_14.capacity();
        boolean b17 = stack255_14.isFull();
        int i18 = stack255_14.size();
        io.github.agentsoz.jill.util.Stack255 stack255_21 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj23 = stack255_21.get((int) (short) 0);
        boolean b24 = stack255_21.isFull();
        int i25 = stack255_21.capacity();
        boolean b26 = stack255_14.push((java.lang.Object) stack255_21);
        boolean b27 = stack255_2.push((java.lang.Object) stack255_21);
        int i28 = stack255_21.capacity();
        boolean b29 = stack255_21.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test349");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        java.lang.Object obj4 = stack255_2.get((int) (byte) -1);
        boolean b6 = stack255_2.push((java.lang.Object) 10.0f);
        int i7 = stack255_2.capacity();
        int i8 = stack255_2.size();
        int i9 = stack255_2.capacity();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 100);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 100);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test350");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.size();
        boolean b9 = stack255_2.push((java.lang.Object) (byte) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 1);
        int i13 = stack255_12.capacity();
        boolean b14 = stack255_12.isEmpty();
        boolean b15 = stack255_12.isEmpty();
        boolean b16 = stack255_12.isFull();
        boolean b17 = stack255_2.push((java.lang.Object) b16);
        int i18 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i13 == 255);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i18 == 255);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test351");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj11 = stack255_10.pop();
        boolean b12 = stack255_10.isEmpty();
        boolean b13 = stack255_2.push((java.lang.Object) stack255_10);
        int i14 = stack255_2.size();
        boolean b15 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj20 = stack255_18.get((int) (short) 100);
        java.lang.Object obj21 = stack255_18.pop();
        java.lang.Object obj22 = stack255_18.pop();
        int i23 = stack255_18.capacity();
        int i24 = stack255_18.size();
        java.lang.Object obj26 = stack255_18.get((int) ' ');
        java.lang.Object obj28 = stack255_18.get(10);
        boolean b29 = stack255_2.push((java.lang.Object) stack255_18);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test352");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.get(255);
        int i6 = stack255_2.size();
        int i7 = stack255_2.capacity();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 255);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test353");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b3 = stack255_2.isFull();
        boolean b4 = stack255_2.isFull();
        boolean b6 = stack255_2.push((java.lang.Object) 3);
        java.lang.Object obj7 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i11 = stack255_10.capacity();
        int i12 = stack255_10.size();
        java.lang.Object obj14 = stack255_10.get((int) (short) 0);
        int i15 = stack255_10.capacity();
        boolean b16 = stack255_10.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_19 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i20 = stack255_19.capacity();
        int i21 = stack255_19.capacity();
        boolean b22 = stack255_19.isFull();
        int i23 = stack255_19.capacity();
        int i24 = stack255_19.capacity();
        boolean b25 = stack255_10.push((java.lang.Object) stack255_19);
        java.lang.Object obj26 = stack255_19.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_29 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i30 = stack255_29.capacity();
        int i31 = stack255_29.size();
        java.lang.Object obj33 = stack255_29.get((int) (short) 0);
        int i34 = stack255_29.capacity();
        boolean b35 = stack255_29.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_38 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i39 = stack255_38.capacity();
        int i40 = stack255_38.capacity();
        boolean b41 = stack255_38.isFull();
        int i42 = stack255_38.capacity();
        int i43 = stack255_38.capacity();
        boolean b44 = stack255_29.push((java.lang.Object) stack255_38);
        java.lang.Object obj45 = stack255_29.pop();
        int i46 = stack255_29.size();
        boolean b47 = stack255_29.isFull();
        boolean b48 = stack255_19.push((java.lang.Object) stack255_29);
        boolean b49 = stack255_2.push((java.lang.Object) stack255_29);
        java.lang.Object obj51 = stack255_29.get(100);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 3 + "'", obj7.equals(3));
        org.junit.Assert.assertTrue(i11 == 255);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 255);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertTrue(i24 == 1);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i30 == 255);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(i34 == 255);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i39 == 1);
        org.junit.Assert.assertTrue(i40 == 1);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == 1);
        org.junit.Assert.assertTrue(i43 == 1);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test354");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isFull();
        int i11 = stack255_2.capacity();
        int i12 = stack255_2.size();
        java.lang.Object obj13 = stack255_2.pop();
        int i14 = stack255_2.capacity();
        java.lang.Object obj16 = stack255_2.get(1);
        boolean b17 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test355");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        java.lang.Object obj4 = stack255_2.get(255);
        io.github.agentsoz.jill.util.Stack255 stack255_7 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i8 = stack255_7.capacity();
        int i9 = stack255_7.capacity();
        java.lang.Object obj10 = stack255_7.pop();
        java.lang.Object obj11 = stack255_7.pop();
        boolean b12 = stack255_7.isFull();
        boolean b14 = stack255_7.push((java.lang.Object) 100.0d);
        int i15 = stack255_7.size();
        boolean b16 = stack255_7.isFull();
        boolean b17 = stack255_7.isEmpty();
        boolean b18 = stack255_2.push((java.lang.Object) stack255_7);
        java.lang.Object obj20 = stack255_2.get((int) (byte) 10);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test356");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        boolean b7 = stack255_2.push((java.lang.Object) (short) 100);
        java.lang.Object obj9 = stack255_2.get((-1));
        boolean b10 = stack255_2.isEmpty();
        java.lang.Object obj11 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i18 = stack255_17.capacity();
        int i19 = stack255_17.capacity();
        java.lang.Object obj20 = stack255_17.pop();
        boolean b21 = stack255_17.isEmpty();
        boolean b23 = stack255_17.push((java.lang.Object) "");
        boolean b24 = stack255_14.push((java.lang.Object) "");
        boolean b25 = stack255_14.isEmpty();
        boolean b26 = stack255_2.push((java.lang.Object) stack255_14);
        io.github.agentsoz.jill.util.Stack255 stack255_29 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i30 = stack255_29.capacity();
        java.lang.Object obj31 = stack255_29.pop();
        java.lang.Object obj32 = stack255_29.pop();
        java.lang.Object obj33 = stack255_29.pop();
        java.lang.Object obj34 = stack255_29.pop();
        java.lang.Object obj36 = stack255_29.get((int) '#');
        boolean b37 = stack255_29.isEmpty();
        boolean b38 = stack255_29.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_41 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        int i42 = stack255_41.capacity();
        java.lang.Object obj44 = stack255_41.get((int) 'a');
        boolean b45 = stack255_29.push((java.lang.Object) 'a');
        boolean b46 = stack255_14.push((java.lang.Object) stack255_29);
        boolean b47 = stack255_14.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(i42 == 10);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test357");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.size();
        java.lang.Object obj9 = stack255_2.get(0);
        int i10 = stack255_2.capacity();
        int i11 = stack255_2.capacity();
        int i12 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i16 = stack255_15.capacity();
        int i17 = stack255_15.size();
        java.lang.Object obj19 = stack255_15.get((int) (short) 0);
        int i20 = stack255_15.capacity();
        boolean b21 = stack255_15.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_24 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i25 = stack255_24.capacity();
        int i26 = stack255_24.capacity();
        boolean b27 = stack255_24.isFull();
        int i28 = stack255_24.capacity();
        int i29 = stack255_24.capacity();
        boolean b30 = stack255_15.push((java.lang.Object) stack255_24);
        io.github.agentsoz.jill.util.Stack255 stack255_33 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj35 = stack255_33.get((int) (short) 0);
        boolean b36 = stack255_33.isEmpty();
        int i37 = stack255_33.size();
        boolean b38 = stack255_33.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_41 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_44 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i45 = stack255_44.capacity();
        int i46 = stack255_44.capacity();
        java.lang.Object obj47 = stack255_44.pop();
        boolean b48 = stack255_44.isEmpty();
        boolean b50 = stack255_44.push((java.lang.Object) "");
        boolean b51 = stack255_41.push((java.lang.Object) "");
        boolean b52 = stack255_33.push((java.lang.Object) stack255_41);
        boolean b53 = stack255_15.push((java.lang.Object) stack255_33);
        boolean b54 = stack255_33.isFull();
        java.lang.Object obj55 = stack255_33.pop();
        boolean b56 = stack255_33.isFull();
        int i57 = stack255_33.size();
        boolean b58 = stack255_2.push((java.lang.Object) i57);
        boolean b59 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i16 == 255);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 255);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i45 == 1);
        org.junit.Assert.assertTrue(i46 == 1);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test358");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj9 = stack255_5.get((int) 'a');
        boolean b10 = stack255_2.push((java.lang.Object) stack255_5);
        int i11 = stack255_5.capacity();
        java.lang.Object obj12 = stack255_5.pop();
        int i13 = stack255_5.size();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test359");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        int i3 = stack255_2.capacity();
        java.lang.Object obj4 = stack255_2.pop();
        boolean b5 = stack255_2.isEmpty();
        java.lang.Object obj7 = stack255_2.get((int) (short) 10);
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test360");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        java.lang.Object obj4 = stack255_2.get((int) (byte) -1);
        boolean b6 = stack255_2.push((java.lang.Object) (-1.0d));
        boolean b7 = stack255_2.isFull();
        int i8 = stack255_2.capacity();
        int i9 = stack255_2.size();
        boolean b10 = stack255_2.isFull();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test361");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj9 = stack255_2.pop();
        int i10 = stack255_2.capacity();
        boolean b11 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b15 = stack255_14.isFull();
        boolean b17 = stack255_14.push((java.lang.Object) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_20 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b21 = stack255_14.push((java.lang.Object) stack255_20);
        boolean b22 = stack255_20.isEmpty();
        boolean b23 = stack255_2.push((java.lang.Object) stack255_20);
        boolean b24 = stack255_2.isEmpty();
        int i25 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 1);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test362");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        boolean b3 = stack255_2.isFull();
        java.lang.Object obj4 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.get((int) (short) 1);
        boolean b7 = stack255_2.isEmpty();
        int i8 = stack255_2.capacity();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test363");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.size();
        int i11 = stack255_2.capacity();
        boolean b12 = stack255_2.isFull();
        boolean b13 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_16 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj17 = stack255_16.pop();
        boolean b18 = stack255_16.isEmpty();
        boolean b19 = stack255_16.isFull();
        int i20 = stack255_16.capacity();
        boolean b21 = stack255_2.push((java.lang.Object) stack255_16);
        java.lang.Object obj23 = stack255_2.get(100);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 255);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test364");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isEmpty();
        int i11 = stack255_2.capacity();
        java.lang.Object obj13 = stack255_2.get(0);
        int i14 = stack255_2.capacity();
        boolean b15 = stack255_2.isFull();
        java.lang.Object obj16 = stack255_2.pop();
        boolean b17 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test365");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isEmpty();
        boolean b8 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj12 = stack255_11.pop();
        java.lang.Object obj14 = stack255_11.get((int) (byte) -1);
        boolean b15 = stack255_2.push((java.lang.Object) (byte) -1);
        java.lang.Object obj17 = stack255_2.get((int) ' ');
        int i18 = stack255_2.size();
        boolean b19 = stack255_2.isEmpty();
        boolean b20 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test366");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.size();
        java.lang.Object obj6 = stack255_2.get((int) (short) 0);
        int i7 = stack255_2.capacity();
        boolean b8 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i12 = stack255_11.capacity();
        int i13 = stack255_11.capacity();
        boolean b14 = stack255_11.isFull();
        int i15 = stack255_11.capacity();
        int i16 = stack255_11.capacity();
        boolean b17 = stack255_2.push((java.lang.Object) stack255_11);
        java.lang.Object obj18 = stack255_2.pop();
        int i19 = stack255_2.size();
        boolean b20 = stack255_2.isFull();
        java.lang.Object obj21 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_24 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj26 = stack255_24.get((int) (short) 0);
        boolean b27 = stack255_24.isFull();
        java.lang.Object obj29 = stack255_24.get((int) ' ');
        int i30 = stack255_24.size();
        boolean b31 = stack255_24.isEmpty();
        boolean b32 = stack255_2.push((java.lang.Object) stack255_24);
        int i33 = stack255_24.size();
        int i34 = stack255_24.capacity();
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 255);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(i34 == 0);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test367");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 100);
        boolean b3 = stack255_2.isEmpty();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) (byte) 100);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test368");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        int i3 = stack255_2.size();
        boolean b4 = stack255_2.isFull();
        int i5 = stack255_2.size();
        int i6 = stack255_2.capacity();
        boolean b7 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test369");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b3 = stack255_2.isFull();
        boolean b5 = stack255_2.push((java.lang.Object) 1);
        int i6 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        java.lang.Object obj10 = stack255_9.pop();
        java.lang.Object obj12 = stack255_9.get((int) 'a');
        boolean b13 = stack255_2.push((java.lang.Object) stack255_9);
        int i14 = stack255_9.capacity();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test370");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.size();
        java.lang.Object obj9 = stack255_2.get(0);
        int i10 = stack255_2.capacity();
        int i11 = stack255_2.capacity();
        int i12 = stack255_2.capacity();
        int i13 = stack255_2.size();
        int i14 = stack255_2.size();
        int i15 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test371");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        boolean b4 = stack255_2.isEmpty();
        int i5 = stack255_2.size();
        int i6 = stack255_2.size();
        java.lang.Object obj8 = stack255_2.get((int) (short) 1);
        java.lang.Object obj9 = stack255_2.pop();
        java.lang.Object obj11 = stack255_2.get((int) '4');
        java.lang.Object obj12 = stack255_2.pop();
        java.lang.Object obj14 = stack255_2.get((int) (byte) 100);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test372");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        int i6 = stack255_2.capacity();
        java.lang.Object obj7 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i11 = stack255_10.capacity();
        int i12 = stack255_10.capacity();
        java.lang.Object obj13 = stack255_10.pop();
        java.lang.Object obj14 = stack255_10.pop();
        java.lang.Object obj15 = stack255_10.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj19 = stack255_18.pop();
        boolean b20 = stack255_18.isEmpty();
        boolean b21 = stack255_10.push((java.lang.Object) stack255_18);
        boolean b22 = stack255_2.push((java.lang.Object) stack255_10);
        java.lang.Object obj23 = stack255_2.pop();
        boolean b24 = stack255_2.isEmpty();
        int i25 = stack255_2.capacity();
        boolean b26 = stack255_2.isEmpty();
        int i27 = stack255_2.size();
        boolean b28 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test373");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj9 = stack255_2.pop();
        int i10 = stack255_2.capacity();
        boolean b11 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b15 = stack255_14.isFull();
        boolean b17 = stack255_14.push((java.lang.Object) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_20 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b21 = stack255_14.push((java.lang.Object) stack255_20);
        boolean b22 = stack255_20.isEmpty();
        boolean b23 = stack255_2.push((java.lang.Object) stack255_20);
        int i24 = stack255_20.capacity();
        int i25 = stack255_20.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_28 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i29 = stack255_28.capacity();
        int i30 = stack255_28.capacity();
        java.lang.Object obj31 = stack255_28.pop();
        java.lang.Object obj32 = stack255_28.pop();
        boolean b33 = stack255_28.isEmpty();
        boolean b34 = stack255_28.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_37 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj38 = stack255_37.pop();
        java.lang.Object obj40 = stack255_37.get((int) (byte) -1);
        boolean b41 = stack255_28.push((java.lang.Object) (byte) -1);
        java.lang.Object obj42 = stack255_28.pop();
        java.lang.Object obj44 = stack255_28.get((int) (byte) 100);
        boolean b45 = stack255_20.push((java.lang.Object) stack255_28);
        java.lang.Object obj47 = stack255_28.get((int) (short) 1);
        java.lang.Object obj49 = stack255_28.get((int) (short) 100);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(i24 == 1);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (byte) -1 + "'", obj42.equals((byte) -1));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test374");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.size();
        java.lang.Object obj6 = stack255_2.get((int) (short) 0);
        int i7 = stack255_2.capacity();
        boolean b8 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i12 = stack255_11.capacity();
        int i13 = stack255_11.capacity();
        boolean b14 = stack255_11.isFull();
        int i15 = stack255_11.capacity();
        int i16 = stack255_11.capacity();
        boolean b17 = stack255_2.push((java.lang.Object) stack255_11);
        java.lang.Object obj19 = stack255_2.get(11);
        boolean b20 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 255);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test375");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isEmpty();
        int i6 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i10 = stack255_9.capacity();
        int i11 = stack255_9.capacity();
        boolean b12 = stack255_9.isFull();
        boolean b14 = stack255_9.push((java.lang.Object) (short) 100);
        java.lang.Object obj16 = stack255_9.get((-1));
        boolean b17 = stack255_9.isEmpty();
        java.lang.Object obj18 = stack255_9.pop();
        int i19 = stack255_9.capacity();
        boolean b20 = stack255_2.push((java.lang.Object) i19);
        boolean b21 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 100 + "'", obj18.equals((short) 100));
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test376");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.size();
        int i11 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i15 = stack255_14.capacity();
        int i16 = stack255_14.capacity();
        boolean b17 = stack255_2.push((java.lang.Object) stack255_14);
        int i18 = stack255_14.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i15 == 255);
        org.junit.Assert.assertTrue(i16 == 255);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i18 == 255);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test377");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        java.lang.Object obj4 = stack255_2.get((int) (byte) -1);
        int i5 = stack255_2.capacity();
        boolean b6 = stack255_2.isFull();
        boolean b7 = stack255_2.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 100);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test378");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        boolean b9 = stack255_5.isEmpty();
        boolean b11 = stack255_5.push((java.lang.Object) "");
        boolean b12 = stack255_2.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b16 = stack255_2.push((java.lang.Object) stack255_15);
        io.github.agentsoz.jill.util.Stack255 stack255_19 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i20 = stack255_19.capacity();
        int i21 = stack255_19.capacity();
        java.lang.Object obj23 = stack255_19.get((int) 'a');
        java.lang.Object obj25 = stack255_19.get(100);
        int i26 = stack255_19.capacity();
        boolean b27 = stack255_2.push((java.lang.Object) stack255_19);
        java.lang.Object obj28 = stack255_2.pop();
        boolean b29 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test379");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        boolean b4 = stack255_2.isEmpty();
        boolean b5 = stack255_2.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test380");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj3 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.get((int) (byte) -1);
        boolean b6 = stack255_2.isEmpty();
        int i7 = stack255_2.size();
        boolean b8 = stack255_2.isEmpty();
        boolean b9 = stack255_2.isEmpty();
        int i10 = stack255_2.capacity();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 10);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test381");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 100);
        int i3 = stack255_2.size();
        java.lang.Object obj4 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.get(1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test382");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        boolean b6 = stack255_2.isEmpty();
        int i7 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test383");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 10);
        int i3 = stack255_2.size();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isEmpty();
        int i6 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i10 = stack255_9.capacity();
        int i11 = stack255_9.size();
        java.lang.Object obj13 = stack255_9.get((int) (short) 0);
        int i14 = stack255_9.capacity();
        boolean b15 = stack255_9.isFull();
        boolean b16 = stack255_9.isFull();
        boolean b17 = stack255_2.push((java.lang.Object) stack255_9);
        boolean b18 = stack255_9.isFull();
        int i19 = stack255_9.capacity();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i10 == 255);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 255);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 255);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test384");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        java.lang.Object obj11 = stack255_2.get((int) (short) -1);
        int i12 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i16 = stack255_15.capacity();
        int i17 = stack255_15.capacity();
        java.lang.Object obj18 = stack255_15.pop();
        java.lang.Object obj19 = stack255_15.pop();
        java.lang.Object obj20 = stack255_15.pop();
        int i21 = stack255_15.capacity();
        java.lang.Object obj23 = stack255_15.get((int) (short) 100);
        boolean b24 = stack255_2.push((java.lang.Object) stack255_15);
        int i25 = stack255_2.size();
        boolean b26 = stack255_2.isEmpty();
        int i27 = stack255_2.size();
        int i28 = stack255_2.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertTrue(i28 == 1);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test385");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        int i11 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i15 = stack255_14.capacity();
        int i16 = stack255_14.capacity();
        java.lang.Object obj18 = stack255_14.get((int) 'a');
        java.lang.Object obj20 = stack255_14.get(100);
        java.lang.Object obj22 = stack255_14.get((int) (short) 10);
        java.lang.Object obj24 = stack255_14.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj28 = stack255_27.pop();
        boolean b29 = stack255_27.isFull();
        boolean b30 = stack255_14.push((java.lang.Object) stack255_27);
        boolean b31 = stack255_2.push((java.lang.Object) stack255_14);
        java.lang.Object obj33 = stack255_2.get((int) (byte) 100);
        int i34 = stack255_2.size();
        java.lang.Object obj35 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test386");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj8 = stack255_2.get((int) (byte) 1);
        boolean b9 = stack255_2.isEmpty();
        int i10 = stack255_2.size();
        java.lang.Object obj12 = stack255_2.get((int) (short) 0);
        boolean b13 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test387");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 10);
        int i3 = stack255_2.size();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isEmpty();
        int i6 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 1);
        int i10 = stack255_9.capacity();
        boolean b11 = stack255_9.isEmpty();
        boolean b12 = stack255_9.isEmpty();
        boolean b13 = stack255_9.isFull();
        boolean b14 = stack255_9.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i18 = stack255_17.size();
        java.lang.Object obj20 = stack255_17.get((int) (short) 1);
        java.lang.Object obj22 = stack255_17.get((int) (byte) 1);
        int i23 = stack255_17.size();
        java.lang.Object obj25 = stack255_17.get(0);
        boolean b26 = stack255_17.isEmpty();
        boolean b27 = stack255_17.isFull();
        java.lang.Object obj29 = stack255_17.get((int) (short) 0);
        boolean b30 = stack255_9.push((java.lang.Object) (short) 0);
        int i31 = stack255_9.capacity();
        boolean b32 = stack255_9.isEmpty();
        boolean b33 = stack255_2.push((java.lang.Object) stack255_9);
        int i34 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(i10 == 255);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(i31 == 255);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(i34 == 10);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test388");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        boolean b8 = stack255_2.isEmpty();
        boolean b9 = stack255_2.isFull();
        boolean b10 = stack255_2.isFull();
        boolean b11 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test389");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isFull();
        int i11 = stack255_2.capacity();
        int i12 = stack255_2.size();
        java.lang.Object obj13 = stack255_2.pop();
        int i14 = stack255_2.capacity();
        java.lang.Object obj16 = stack255_2.get(1);
        int i17 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test390");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) -1);
        boolean b3 = stack255_2.isEmpty();
        boolean b5 = stack255_2.push((java.lang.Object) 10L);
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get(10);
        int i10 = stack255_2.capacity();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10L + "'", obj7.equals(10L));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 10);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test391");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        boolean b9 = stack255_5.isEmpty();
        boolean b11 = stack255_5.push((java.lang.Object) "");
        boolean b12 = stack255_2.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b16 = stack255_2.push((java.lang.Object) stack255_15);
        io.github.agentsoz.jill.util.Stack255 stack255_19 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i20 = stack255_19.capacity();
        int i21 = stack255_19.capacity();
        java.lang.Object obj23 = stack255_19.get((int) 'a');
        java.lang.Object obj25 = stack255_19.get(100);
        int i26 = stack255_19.capacity();
        boolean b27 = stack255_2.push((java.lang.Object) stack255_19);
        int i28 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_31 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i32 = stack255_31.capacity();
        int i33 = stack255_31.capacity();
        java.lang.Object obj34 = stack255_31.pop();
        java.lang.Object obj35 = stack255_31.pop();
        java.lang.Object obj36 = stack255_31.pop();
        java.lang.Object obj38 = stack255_31.get((int) (short) 10);
        boolean b39 = stack255_31.isFull();
        int i40 = stack255_31.capacity();
        boolean b41 = stack255_31.isFull();
        boolean b42 = stack255_31.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_45 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_48 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i49 = stack255_48.capacity();
        int i50 = stack255_48.capacity();
        java.lang.Object obj51 = stack255_48.pop();
        boolean b52 = stack255_48.isEmpty();
        boolean b54 = stack255_48.push((java.lang.Object) "");
        boolean b55 = stack255_45.push((java.lang.Object) "");
        boolean b56 = stack255_45.isEmpty();
        boolean b57 = stack255_45.isEmpty();
        boolean b58 = stack255_31.push((java.lang.Object) b57);
        io.github.agentsoz.jill.util.Stack255 stack255_61 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 100);
        boolean b62 = stack255_31.push((java.lang.Object) stack255_61);
        boolean b63 = stack255_2.push((java.lang.Object) stack255_31);
        boolean b64 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_67 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i68 = stack255_67.capacity();
        int i69 = stack255_67.capacity();
        java.lang.Object obj71 = stack255_67.get((int) 'a');
        int i72 = stack255_67.size();
        boolean b74 = stack255_67.push((java.lang.Object) (byte) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_77 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 1);
        int i78 = stack255_77.capacity();
        boolean b79 = stack255_77.isEmpty();
        boolean b80 = stack255_77.isEmpty();
        boolean b81 = stack255_77.isFull();
        boolean b82 = stack255_67.push((java.lang.Object) b81);
        boolean b83 = stack255_67.isEmpty();
        boolean b84 = stack255_2.push((java.lang.Object) stack255_67);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(i28 == 3);
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertTrue(i33 == 1);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 1);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i49 == 1);
        org.junit.Assert.assertTrue(i50 == 1);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i68 == 1);
        org.junit.Assert.assertTrue(i69 == 1);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(i78 == 255);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(b84 == true);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test392");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        java.lang.Object obj9 = stack255_5.pop();
        java.lang.Object obj10 = stack255_5.pop();
        java.lang.Object obj12 = stack255_5.get((int) (short) 10);
        int i13 = stack255_5.size();
        boolean b14 = stack255_2.push((java.lang.Object) stack255_5);
        java.lang.Object obj16 = stack255_2.get((int) 'a');
        java.lang.Object obj18 = stack255_2.get(1);
        int i19 = stack255_2.size();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(i19 == 1);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test393");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        java.lang.Object obj6 = stack255_2.get((int) (byte) 10);
        boolean b8 = stack255_2.push((java.lang.Object) 10);
        int i9 = stack255_2.capacity();
        java.lang.Object obj10 = stack255_2.pop();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 11);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 10 + "'", obj10.equals(10));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test394");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isFull();
        int i11 = stack255_2.capacity();
        boolean b12 = stack255_2.isFull();
        boolean b13 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_16 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_19 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i20 = stack255_19.capacity();
        int i21 = stack255_19.capacity();
        java.lang.Object obj22 = stack255_19.pop();
        boolean b23 = stack255_19.isEmpty();
        boolean b25 = stack255_19.push((java.lang.Object) "");
        boolean b26 = stack255_16.push((java.lang.Object) "");
        boolean b27 = stack255_16.isEmpty();
        boolean b28 = stack255_16.isEmpty();
        boolean b29 = stack255_2.push((java.lang.Object) b28);
        boolean b30 = stack255_2.isEmpty();
        java.lang.Object obj32 = stack255_2.get(3);
        java.lang.Object obj33 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + false + "'", obj33.equals(false));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test395");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        int i3 = stack255_2.size();
        boolean b4 = stack255_2.isEmpty();
        java.lang.Object obj6 = stack255_2.get((int) (short) 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test396");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        boolean b10 = stack255_2.isFull();
        boolean b11 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i18 = stack255_17.capacity();
        int i19 = stack255_17.size();
        java.lang.Object obj21 = stack255_17.get((int) (short) 0);
        boolean b22 = stack255_14.push((java.lang.Object) (short) 0);
        boolean b23 = stack255_14.isEmpty();
        java.lang.Object obj24 = stack255_14.pop();
        boolean b25 = stack255_2.push(obj24);
        int i26 = stack255_2.capacity();
        int i27 = stack255_2.size();
        int i28 = stack255_2.size();
        int i29 = stack255_2.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i18 == 255);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) 0 + "'", obj24.equals((short) 0));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(i26 == 11);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertTrue(i29 == 1);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test397");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        java.lang.Object obj11 = stack255_2.get((int) (short) -1);
        boolean b12 = stack255_2.isEmpty();
        int i13 = stack255_2.capacity();
        int i14 = stack255_2.capacity();
        boolean b15 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i19 = stack255_18.capacity();
        int i20 = stack255_18.capacity();
        boolean b21 = stack255_18.isFull();
        int i22 = stack255_18.capacity();
        java.lang.Object obj23 = stack255_18.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_26 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i27 = stack255_26.capacity();
        int i28 = stack255_26.capacity();
        java.lang.Object obj29 = stack255_26.pop();
        java.lang.Object obj30 = stack255_26.pop();
        java.lang.Object obj31 = stack255_26.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_34 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj35 = stack255_34.pop();
        boolean b36 = stack255_34.isEmpty();
        boolean b37 = stack255_26.push((java.lang.Object) stack255_34);
        boolean b38 = stack255_18.push((java.lang.Object) stack255_26);
        boolean b39 = stack255_2.push((java.lang.Object) b38);
        io.github.agentsoz.jill.util.Stack255 stack255_42 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i43 = stack255_42.capacity();
        int i44 = stack255_42.size();
        java.lang.Object obj46 = stack255_42.get((int) '#');
        boolean b47 = stack255_42.isFull();
        int i48 = stack255_42.capacity();
        boolean b49 = stack255_2.push((java.lang.Object) stack255_42);
        java.lang.Object obj51 = stack255_42.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_54 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj56 = stack255_54.get((int) (short) 0);
        boolean b57 = stack255_54.isFull();
        java.lang.Object obj59 = stack255_54.get((int) (short) 0);
        java.lang.Object obj61 = stack255_54.get((int) ' ');
        java.lang.Object obj63 = stack255_54.get((int) (short) -1);
        boolean b64 = stack255_54.isEmpty();
        int i65 = stack255_54.capacity();
        int i66 = stack255_54.capacity();
        java.lang.Object obj67 = null;
        boolean b68 = stack255_54.push(obj67);
        java.lang.Object obj70 = stack255_54.get(10);
        boolean b71 = stack255_42.push(obj70);
        int i72 = stack255_42.capacity();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i43 == 255);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i48 == 255);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(i72 == 255);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test398");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        java.lang.Object obj3 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.get((int) 'a');
        java.lang.Object obj7 = stack255_2.get((int) (byte) 10);
        boolean b8 = stack255_2.isEmpty();
        int i9 = stack255_2.size();
        int i10 = stack255_2.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test399");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        int i6 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj11 = stack255_9.get((int) (short) 0);
        boolean b12 = stack255_9.isFull();
        java.lang.Object obj14 = stack255_9.get((int) ' ');
        boolean b15 = stack255_2.push((java.lang.Object) ' ');
        java.lang.Object obj16 = stack255_2.pop();
        boolean b17 = stack255_2.isEmpty();
        java.lang.Object obj19 = stack255_2.get((int) (short) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_22 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i23 = stack255_22.capacity();
        int i24 = stack255_22.size();
        java.lang.Object obj26 = stack255_22.get((int) (short) 0);
        int i27 = stack255_22.capacity();
        boolean b28 = stack255_22.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_31 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i32 = stack255_31.capacity();
        int i33 = stack255_31.capacity();
        boolean b34 = stack255_31.isFull();
        int i35 = stack255_31.capacity();
        int i36 = stack255_31.capacity();
        boolean b37 = stack255_22.push((java.lang.Object) stack255_31);
        io.github.agentsoz.jill.util.Stack255 stack255_40 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj42 = stack255_40.get((int) (short) 0);
        boolean b43 = stack255_40.isEmpty();
        int i44 = stack255_40.size();
        boolean b45 = stack255_40.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_48 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_51 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i52 = stack255_51.capacity();
        int i53 = stack255_51.capacity();
        java.lang.Object obj54 = stack255_51.pop();
        boolean b55 = stack255_51.isEmpty();
        boolean b57 = stack255_51.push((java.lang.Object) "");
        boolean b58 = stack255_48.push((java.lang.Object) "");
        boolean b59 = stack255_40.push((java.lang.Object) stack255_48);
        boolean b60 = stack255_22.push((java.lang.Object) stack255_40);
        boolean b61 = stack255_40.isFull();
        boolean b62 = stack255_2.push((java.lang.Object) b61);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + ' ' + "'", obj16.equals(' '));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i23 == 255);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 255);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertTrue(i33 == 1);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue(i36 == 1);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(i52 == 1);
        org.junit.Assert.assertTrue(i53 == 1);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == true);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test400");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 1);
        java.lang.Object obj4 = stack255_2.get((int) (short) 100);
        io.github.agentsoz.jill.util.Stack255 stack255_7 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i8 = stack255_7.capacity();
        int i9 = stack255_7.capacity();
        java.lang.Object obj10 = stack255_7.pop();
        java.lang.Object obj11 = stack255_7.pop();
        java.lang.Object obj12 = stack255_7.pop();
        java.lang.Object obj14 = stack255_7.get((int) (short) 10);
        int i15 = stack255_7.size();
        int i16 = stack255_7.capacity();
        boolean b17 = stack255_7.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_20 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_23 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i24 = stack255_23.capacity();
        int i25 = stack255_23.capacity();
        java.lang.Object obj26 = stack255_23.pop();
        java.lang.Object obj27 = stack255_23.pop();
        java.lang.Object obj28 = stack255_23.pop();
        java.lang.Object obj30 = stack255_23.get((int) (short) 10);
        int i31 = stack255_23.size();
        boolean b32 = stack255_20.push((java.lang.Object) stack255_23);
        boolean b33 = stack255_7.push((java.lang.Object) stack255_23);
        java.lang.Object obj35 = stack255_7.get(255);
        boolean b36 = stack255_7.isFull();
        java.lang.Object obj37 = stack255_7.pop();
        boolean b38 = stack255_2.push(obj37);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i24 == 1);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test401");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b3 = stack255_2.isFull();
        boolean b4 = stack255_2.isEmpty();
        java.lang.Object obj5 = stack255_2.pop();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test402");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        java.lang.Object obj3 = stack255_2.pop();
        boolean b4 = stack255_2.isEmpty();
        java.lang.Object obj5 = stack255_2.pop();
        boolean b6 = stack255_2.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test403");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b3 = stack255_2.isFull();
        boolean b5 = stack255_2.push((java.lang.Object) 1);
        int i6 = stack255_2.capacity();
        boolean b7 = stack255_2.isFull();
        int i8 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i12 = stack255_11.capacity();
        java.lang.Object obj14 = stack255_11.get((int) (byte) 1);
        java.lang.Object obj16 = stack255_11.get((int) (short) 10);
        java.lang.Object obj18 = stack255_11.get((int) (byte) 10);
        int i19 = stack255_11.capacity();
        boolean b20 = stack255_11.isEmpty();
        java.lang.Object obj22 = stack255_11.get((int) (byte) 100);
        boolean b23 = stack255_2.push((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 10);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(i12 == 255);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(i19 == 255);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test404");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        boolean b7 = stack255_2.push((java.lang.Object) (short) 100);
        int i8 = stack255_2.capacity();
        int i9 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        boolean b13 = stack255_2.push((java.lang.Object) stack255_12);
        java.lang.Object obj15 = stack255_12.get(0);
        boolean b16 = stack255_12.isFull();
        java.lang.Object obj17 = stack255_12.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test405");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj3 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.get((int) ' ');
        boolean b6 = stack255_2.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test406");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 1);
        int i3 = stack255_2.capacity();
        java.lang.Object obj4 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.get(10);
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) -1);
        boolean b10 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test407");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test408");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.size();
        int i11 = stack255_2.capacity();
        boolean b12 = stack255_2.isFull();
        boolean b13 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_16 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj17 = stack255_16.pop();
        boolean b18 = stack255_16.isEmpty();
        boolean b19 = stack255_16.isFull();
        int i20 = stack255_16.capacity();
        boolean b21 = stack255_2.push((java.lang.Object) stack255_16);
        java.lang.Object obj22 = stack255_16.pop();
        int i23 = stack255_16.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 255);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i23 == 255);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test409");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = null;
        boolean b8 = stack255_2.push(obj7);
        int i9 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test410");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b3 = stack255_2.isFull();
        java.lang.Object obj5 = stack255_2.get(2);
        int i6 = stack255_2.capacity();
        boolean b7 = stack255_2.isEmpty();
        java.lang.Object obj9 = stack255_2.get((int) (byte) 1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test411");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.size();
        java.lang.Object obj6 = stack255_2.get((int) (short) 0);
        int i7 = stack255_2.capacity();
        boolean b8 = stack255_2.isFull();
        java.lang.Object obj10 = stack255_2.get((int) (short) -1);
        boolean b11 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 255);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test412");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        java.lang.Object obj9 = stack255_5.pop();
        java.lang.Object obj10 = stack255_5.pop();
        java.lang.Object obj12 = stack255_5.get((int) (short) 10);
        int i13 = stack255_5.size();
        boolean b14 = stack255_2.push((java.lang.Object) stack255_5);
        boolean b15 = stack255_2.isFull();
        boolean b16 = stack255_2.isEmpty();
        java.lang.Object obj18 = stack255_2.get(0);
        java.lang.Object obj20 = stack255_2.get((int) (short) -1);
        boolean b21 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test413");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_6 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj8 = stack255_6.get((int) (short) 0);
        boolean b9 = stack255_6.isFull();
        java.lang.Object obj11 = stack255_6.get((int) ' ');
        int i12 = stack255_6.size();
        java.lang.Object obj14 = stack255_6.get((int) (byte) 0);
        boolean b15 = stack255_2.push((java.lang.Object) stack255_6);
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i19 = stack255_18.capacity();
        int i20 = stack255_18.capacity();
        int i21 = stack255_18.size();
        boolean b22 = stack255_2.push((java.lang.Object) stack255_18);
        int i23 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(i23 == 2);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test414");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isEmpty();
        boolean b8 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj12 = stack255_11.pop();
        java.lang.Object obj14 = stack255_11.get((int) (byte) -1);
        boolean b15 = stack255_2.push((java.lang.Object) (byte) -1);
        java.lang.Object obj17 = stack255_2.get((int) ' ');
        int i18 = stack255_2.size();
        boolean b19 = stack255_2.isEmpty();
        java.lang.Object obj21 = stack255_2.get((int) (byte) 10);
        int i22 = stack255_2.size();
        int i23 = stack255_2.capacity();
        java.lang.Object obj24 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte) -1 + "'", obj24.equals((byte) -1));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test415");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        boolean b3 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_6 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i7 = stack255_6.capacity();
        int i8 = stack255_6.capacity();
        java.lang.Object obj9 = stack255_6.pop();
        java.lang.Object obj10 = stack255_6.pop();
        java.lang.Object obj11 = stack255_6.pop();
        int i12 = stack255_6.capacity();
        boolean b13 = stack255_2.push((java.lang.Object) stack255_6);
        int i14 = stack255_6.size();
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_20 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i21 = stack255_20.capacity();
        int i22 = stack255_20.capacity();
        java.lang.Object obj23 = stack255_20.pop();
        java.lang.Object obj24 = stack255_20.pop();
        java.lang.Object obj25 = stack255_20.pop();
        java.lang.Object obj27 = stack255_20.get((int) (short) 10);
        int i28 = stack255_20.size();
        boolean b29 = stack255_17.push((java.lang.Object) stack255_20);
        boolean b30 = stack255_17.isEmpty();
        boolean b31 = stack255_6.push((java.lang.Object) b30);
        int i32 = stack255_6.capacity();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(i32 == 1);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test416");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isFull();
        boolean b9 = stack255_2.push((java.lang.Object) 100.0d);
        int i10 = stack255_2.size();
        boolean b11 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj15 = stack255_14.pop();
        boolean b16 = stack255_14.isEmpty();
        int i17 = stack255_14.size();
        java.lang.Object obj19 = stack255_14.get((int) (byte) 100);
        int i20 = stack255_14.size();
        boolean b21 = stack255_2.push((java.lang.Object) i20);
        java.lang.Object obj23 = stack255_2.get((int) (byte) 0);
        boolean b24 = stack255_2.isFull();
        int i25 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100.0d + "'", obj23.equals(100.0d));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 255);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test417");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        int i11 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i15 = stack255_14.capacity();
        int i16 = stack255_14.capacity();
        java.lang.Object obj18 = stack255_14.get((int) 'a');
        java.lang.Object obj20 = stack255_14.get(100);
        java.lang.Object obj22 = stack255_14.get((int) (short) 10);
        java.lang.Object obj24 = stack255_14.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj28 = stack255_27.pop();
        boolean b29 = stack255_27.isFull();
        boolean b30 = stack255_14.push((java.lang.Object) stack255_27);
        boolean b31 = stack255_2.push((java.lang.Object) stack255_14);
        boolean b32 = stack255_2.isEmpty();
        boolean b33 = stack255_2.isEmpty();
        boolean b34 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test418");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        int i6 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b10 = stack255_9.isFull();
        boolean b12 = stack255_9.push((java.lang.Object) 1);
        int i13 = stack255_9.capacity();
        boolean b14 = stack255_9.isFull();
        boolean b15 = stack255_2.push((java.lang.Object) stack255_9);
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b19 = stack255_18.isFull();
        boolean b20 = stack255_9.push((java.lang.Object) b19);
        int i21 = stack255_9.capacity();
        java.lang.Object obj23 = stack255_9.get((int) '4');
        boolean b24 = stack255_9.isEmpty();
        boolean b25 = stack255_9.isFull();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(i21 == 10);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test419");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isFull();
        boolean b9 = stack255_2.push((java.lang.Object) 100.0d);
        int i10 = stack255_2.size();
        boolean b11 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj15 = stack255_14.pop();
        boolean b16 = stack255_14.isEmpty();
        int i17 = stack255_14.size();
        java.lang.Object obj19 = stack255_14.get((int) (byte) 100);
        int i20 = stack255_14.size();
        boolean b21 = stack255_2.push((java.lang.Object) i20);
        java.lang.Object obj23 = stack255_2.get((int) (byte) 0);
        int i24 = stack255_2.capacity();
        int i25 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100.0d + "'", obj23.equals(100.0d));
        org.junit.Assert.assertTrue(i24 == 255);
        org.junit.Assert.assertTrue(i25 == 255);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test420");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj4 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_7 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj9 = stack255_7.get((int) (short) 100);
        java.lang.Object obj10 = stack255_7.pop();
        boolean b11 = stack255_2.push((java.lang.Object) stack255_7);
        int i12 = stack255_2.capacity();
        java.lang.Object obj13 = null;
        boolean b14 = stack255_2.push(obj13);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test421");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        boolean b4 = stack255_2.isFull();
        boolean b5 = stack255_2.isEmpty();
        java.lang.Object obj7 = stack255_2.get((-1));
        java.lang.Object obj8 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test422");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        java.lang.Object obj4 = stack255_2.get((int) (byte) -1);
        boolean b6 = stack255_2.push((java.lang.Object) (-1.0d));
        boolean b7 = stack255_2.isFull();
        int i8 = stack255_2.capacity();
        java.lang.Object obj10 = stack255_2.get((int) (byte) -1);
        io.github.agentsoz.jill.util.Stack255 stack255_13 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i14 = stack255_13.capacity();
        int i15 = stack255_13.capacity();
        boolean b16 = stack255_13.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_19 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj21 = stack255_19.get((int) (short) 0);
        boolean b22 = stack255_19.isFull();
        java.lang.Object obj24 = stack255_19.get((int) (short) 0);
        java.lang.Object obj26 = stack255_19.get((int) ' ');
        java.lang.Object obj28 = stack255_19.get((int) (short) -1);
        boolean b29 = stack255_13.push((java.lang.Object) (short) -1);
        java.lang.Object obj31 = stack255_13.get((int) '4');
        int i32 = stack255_13.size();
        io.github.agentsoz.jill.util.Stack255 stack255_35 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj37 = stack255_35.get((int) (short) 0);
        boolean b38 = stack255_35.isFull();
        java.lang.Object obj40 = stack255_35.get((int) (short) 0);
        java.lang.Object obj41 = stack255_35.pop();
        boolean b42 = stack255_35.isEmpty();
        boolean b43 = stack255_13.push((java.lang.Object) stack255_35);
        boolean b44 = stack255_2.push((java.lang.Object) stack255_13);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test423");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        int i11 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i15 = stack255_14.capacity();
        int i16 = stack255_14.capacity();
        java.lang.Object obj18 = stack255_14.get((int) 'a');
        java.lang.Object obj20 = stack255_14.get(100);
        java.lang.Object obj22 = stack255_14.get((int) (short) 10);
        java.lang.Object obj24 = stack255_14.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj28 = stack255_27.pop();
        boolean b29 = stack255_27.isFull();
        boolean b30 = stack255_14.push((java.lang.Object) stack255_27);
        boolean b31 = stack255_2.push((java.lang.Object) stack255_14);
        io.github.agentsoz.jill.util.Stack255 stack255_34 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj35 = stack255_34.pop();
        boolean b36 = stack255_34.isEmpty();
        boolean b37 = stack255_34.isFull();
        boolean b38 = stack255_34.isEmpty();
        boolean b39 = stack255_34.isEmpty();
        java.lang.Object obj40 = stack255_34.pop();
        java.lang.Object obj41 = stack255_34.pop();
        boolean b42 = stack255_2.push(obj41);
        int i43 = stack255_2.size();
        java.lang.Object obj44 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(i43 == 2);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test424");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        int i6 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj11 = stack255_9.get((int) (short) 0);
        boolean b12 = stack255_9.isFull();
        java.lang.Object obj14 = stack255_9.get((int) ' ');
        boolean b15 = stack255_2.push((java.lang.Object) ' ');
        java.lang.Object obj16 = stack255_2.pop();
        boolean b17 = stack255_2.isEmpty();
        java.lang.Object obj19 = stack255_2.get((int) (short) 1);
        int i20 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + ' ' + "'", obj16.equals(' '));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test425");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isFull();
        boolean b9 = stack255_2.push((java.lang.Object) 100.0d);
        int i10 = stack255_2.size();
        boolean b11 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj15 = stack255_14.pop();
        boolean b16 = stack255_14.isEmpty();
        int i17 = stack255_14.size();
        java.lang.Object obj19 = stack255_14.get((int) (byte) 100);
        int i20 = stack255_14.size();
        boolean b21 = stack255_2.push((java.lang.Object) i20);
        int i22 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i22 == 2);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test426");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        int i11 = stack255_2.capacity();
        java.lang.Object obj12 = stack255_2.pop();
        int i13 = stack255_2.capacity();
        boolean b14 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test427");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.size();
        int i11 = stack255_2.capacity();
        boolean b12 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i19 = stack255_18.capacity();
        int i20 = stack255_18.capacity();
        java.lang.Object obj21 = stack255_18.pop();
        java.lang.Object obj22 = stack255_18.pop();
        java.lang.Object obj23 = stack255_18.pop();
        java.lang.Object obj25 = stack255_18.get((int) (short) 10);
        int i26 = stack255_18.size();
        boolean b27 = stack255_15.push((java.lang.Object) stack255_18);
        boolean b28 = stack255_2.push((java.lang.Object) stack255_18);
        java.lang.Object obj30 = stack255_2.get(255);
        boolean b31 = stack255_2.isFull();
        int i32 = stack255_2.size();
        int i33 = stack255_2.capacity();
        int i34 = stack255_2.capacity();
        java.lang.Object obj35 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertTrue(i33 == 1);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test428");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b3 = stack255_2.isFull();
        boolean b5 = stack255_2.push((java.lang.Object) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_8 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b9 = stack255_2.push((java.lang.Object) stack255_8);
        int i10 = stack255_2.size();
        boolean b11 = stack255_2.isFull();
        boolean b12 = stack255_2.isEmpty();
        boolean b13 = stack255_2.isFull();
        boolean b14 = stack255_2.isFull();
        java.lang.Object obj15 = stack255_2.pop();
        java.lang.Object obj17 = stack255_2.get(255);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test429");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        boolean b4 = stack255_2.isEmpty();
        boolean b5 = stack255_2.isFull();
        boolean b6 = stack255_2.isEmpty();
        int i7 = stack255_2.capacity();
        int i8 = stack255_2.capacity();
        java.lang.Object obj10 = stack255_2.get((int) '#');
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 255);
        org.junit.Assert.assertTrue(i8 == 255);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test430");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        int i6 = stack255_2.capacity();
        boolean b7 = stack255_2.isFull();
        boolean b8 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        boolean b12 = stack255_11.isFull();
        int i13 = stack255_11.capacity();
        int i14 = stack255_11.size();
        int i15 = stack255_11.size();
        int i16 = stack255_11.capacity();
        boolean b17 = stack255_2.push((java.lang.Object) i16);
        int i18 = stack255_2.capacity();
        java.lang.Object obj19 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test431");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 10);
        int i3 = stack255_2.size();
        boolean b5 = stack255_2.push((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test432");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.size();
        java.lang.Object obj6 = stack255_2.get((int) (short) 0);
        int i7 = stack255_2.capacity();
        boolean b8 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i12 = stack255_11.capacity();
        int i13 = stack255_11.capacity();
        boolean b14 = stack255_11.isFull();
        int i15 = stack255_11.capacity();
        int i16 = stack255_11.capacity();
        boolean b17 = stack255_2.push((java.lang.Object) stack255_11);
        java.lang.Object obj18 = stack255_2.pop();
        int i19 = stack255_2.size();
        boolean b20 = stack255_2.isEmpty();
        java.lang.Object obj22 = stack255_2.get((int) ' ');
        int i23 = stack255_2.size();
        boolean b24 = stack255_2.isFull();
        boolean b25 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 255);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test433");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        java.lang.Object obj12 = stack255_2.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i19 = stack255_18.capacity();
        int i20 = stack255_18.capacity();
        java.lang.Object obj21 = stack255_18.pop();
        boolean b22 = stack255_18.isEmpty();
        boolean b24 = stack255_18.push((java.lang.Object) "");
        boolean b25 = stack255_15.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_28 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b29 = stack255_15.push((java.lang.Object) stack255_28);
        io.github.agentsoz.jill.util.Stack255 stack255_32 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i33 = stack255_32.capacity();
        int i34 = stack255_32.capacity();
        java.lang.Object obj36 = stack255_32.get((int) 'a');
        java.lang.Object obj38 = stack255_32.get(100);
        int i39 = stack255_32.capacity();
        boolean b40 = stack255_15.push((java.lang.Object) stack255_32);
        boolean b41 = stack255_15.isFull();
        boolean b42 = stack255_2.push((java.lang.Object) stack255_15);
        java.lang.Object obj44 = stack255_2.get((int) ' ');
        int i45 = stack255_2.capacity();
        boolean b46 = stack255_2.isFull();
        int i47 = stack255_2.capacity();
        java.lang.Object obj49 = stack255_2.get((int) (short) -1);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i33 == 1);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(i39 == 1);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(i45 == 1);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i47 == 1);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test434");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        boolean b8 = stack255_2.isFull();
        java.lang.Object obj10 = stack255_2.get((int) (byte) 100);
        boolean b12 = stack255_2.push((java.lang.Object) 100);
        int i13 = stack255_2.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test435");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        boolean b9 = stack255_2.push((java.lang.Object) 0L);
        int i10 = stack255_2.capacity();
        boolean b11 = stack255_2.isEmpty();
        java.lang.Object obj13 = stack255_2.get((int) '4');
        java.lang.Object obj14 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test436");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj4 = stack255_2.pop();
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get(10);
        int i8 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i12 = stack255_11.capacity();
        int i13 = stack255_11.capacity();
        boolean b14 = stack255_11.isFull();
        boolean b16 = stack255_11.push((java.lang.Object) (short) 100);
        java.lang.Object obj18 = stack255_11.get((-1));
        boolean b19 = stack255_11.isEmpty();
        java.lang.Object obj20 = stack255_11.pop();
        int i21 = stack255_11.capacity();
        java.lang.Object obj22 = stack255_11.pop();
        boolean b23 = stack255_2.push((java.lang.Object) stack255_11);
        boolean b24 = stack255_11.isFull();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 100 + "'", obj20.equals((short) 100));
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test437");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        boolean b4 = stack255_2.isEmpty();
        int i5 = stack255_2.size();
        int i6 = stack255_2.size();
        boolean b7 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i11 = stack255_10.capacity();
        int i12 = stack255_10.capacity();
        boolean b13 = stack255_10.isFull();
        boolean b14 = stack255_10.isFull();
        boolean b15 = stack255_10.isEmpty();
        boolean b16 = stack255_2.push((java.lang.Object) b15);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test438");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        int i6 = stack255_2.capacity();
        java.lang.Object obj7 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i11 = stack255_10.capacity();
        int i12 = stack255_10.capacity();
        java.lang.Object obj13 = stack255_10.pop();
        java.lang.Object obj14 = stack255_10.pop();
        java.lang.Object obj15 = stack255_10.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj19 = stack255_18.pop();
        boolean b20 = stack255_18.isEmpty();
        boolean b21 = stack255_10.push((java.lang.Object) stack255_18);
        boolean b22 = stack255_2.push((java.lang.Object) stack255_10);
        boolean b23 = stack255_10.isFull();
        java.lang.Object obj24 = stack255_10.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test439");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isFull();
        int i11 = stack255_2.capacity();
        boolean b13 = stack255_2.push((java.lang.Object) ' ');
        int i14 = stack255_2.size();
        java.lang.Object obj15 = stack255_2.pop();
        java.lang.Object obj17 = stack255_2.get((int) (byte) 10);
        int i18 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + ' ' + "'", obj15.equals(' '));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test440");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) -1);
        boolean b3 = stack255_2.isEmpty();
        boolean b4 = stack255_2.isEmpty();
        boolean b5 = stack255_2.isEmpty();
        java.lang.Object obj6 = null;
        boolean b7 = stack255_2.push(obj6);
        java.lang.Object obj8 = stack255_2.pop();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test441");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        boolean b7 = stack255_2.push((java.lang.Object) (short) 100);
        int i8 = stack255_2.capacity();
        int i9 = stack255_2.capacity();
        boolean b10 = stack255_2.isFull();
        java.lang.Object obj12 = stack255_2.get((int) '#');
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b16 = stack255_15.isFull();
        boolean b18 = stack255_15.push((java.lang.Object) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_21 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i22 = stack255_21.capacity();
        int i23 = stack255_21.size();
        java.lang.Object obj25 = stack255_21.get((int) (short) 0);
        int i26 = stack255_21.capacity();
        boolean b27 = stack255_21.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_30 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i31 = stack255_30.capacity();
        int i32 = stack255_30.capacity();
        boolean b33 = stack255_30.isFull();
        int i34 = stack255_30.capacity();
        int i35 = stack255_30.capacity();
        boolean b36 = stack255_21.push((java.lang.Object) stack255_30);
        java.lang.Object obj37 = stack255_21.pop();
        int i38 = stack255_21.capacity();
        boolean b39 = stack255_15.push((java.lang.Object) i38);
        java.lang.Object obj40 = stack255_15.pop();
        java.lang.Object obj42 = stack255_15.get((-1));
        boolean b43 = stack255_2.push((java.lang.Object) (-1));
        boolean b44 = stack255_2.isEmpty();
        boolean b45 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i22 == 255);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 255);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i31 == 1);
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue(i38 == 255);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 255 + "'", obj40.equals(255));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test442");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.capacity();
        boolean b11 = stack255_2.isEmpty();
        boolean b12 = stack255_2.isEmpty();
        java.lang.Object obj13 = stack255_2.pop();
        java.lang.Object obj15 = stack255_2.get(11);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test443");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        boolean b4 = stack255_2.isEmpty();
        boolean b5 = stack255_2.isFull();
        boolean b6 = stack255_2.isEmpty();
        boolean b7 = stack255_2.isEmpty();
        java.lang.Object obj9 = stack255_2.get(255);
        int i10 = stack255_2.capacity();
        boolean b11 = stack255_2.isFull();
        int i12 = stack255_2.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 255);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test444");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        boolean b8 = stack255_2.isEmpty();
        int i9 = stack255_2.size();
        int i10 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test445");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.size();
        java.lang.Object obj8 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.pop();
        java.lang.Object obj10 = stack255_2.pop();
        java.lang.Object obj12 = stack255_2.get(11);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test446");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isEmpty();
        int i11 = stack255_2.capacity();
        java.lang.Object obj13 = stack255_2.get(0);
        int i14 = stack255_2.capacity();
        boolean b15 = stack255_2.isFull();
        java.lang.Object obj16 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_19 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i20 = stack255_19.capacity();
        int i21 = stack255_19.capacity();
        java.lang.Object obj22 = stack255_19.pop();
        java.lang.Object obj23 = stack255_19.pop();
        java.lang.Object obj24 = stack255_19.pop();
        java.lang.Object obj26 = stack255_19.get((int) (short) 10);
        int i27 = stack255_19.size();
        int i28 = stack255_19.capacity();
        boolean b29 = stack255_19.isFull();
        boolean b30 = stack255_19.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_33 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj34 = stack255_33.pop();
        boolean b35 = stack255_33.isEmpty();
        boolean b36 = stack255_33.isFull();
        int i37 = stack255_33.capacity();
        boolean b38 = stack255_19.push((java.lang.Object) stack255_33);
        boolean b39 = stack255_2.push((java.lang.Object) stack255_19);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i37 == 255);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test447");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        java.lang.Object obj4 = stack255_2.get((int) (byte) -1);
        boolean b6 = stack255_2.push((java.lang.Object) (-1.0d));
        boolean b7 = stack255_2.isFull();
        int i8 = stack255_2.capacity();
        int i9 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        java.lang.Object obj14 = stack255_12.get((int) (byte) -1);
        boolean b16 = stack255_12.push((java.lang.Object) (-1.0d));
        boolean b17 = stack255_12.isFull();
        int i18 = stack255_12.size();
        boolean b19 = stack255_12.isFull();
        boolean b20 = stack255_12.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_23 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i24 = stack255_23.capacity();
        int i25 = stack255_23.capacity();
        java.lang.Object obj26 = stack255_23.pop();
        java.lang.Object obj27 = stack255_23.pop();
        boolean b28 = stack255_23.isEmpty();
        boolean b29 = stack255_23.isFull();
        boolean b30 = stack255_23.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_33 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) -1);
        io.github.agentsoz.jill.util.Stack255 stack255_36 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_39 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i40 = stack255_39.capacity();
        int i41 = stack255_39.capacity();
        java.lang.Object obj43 = stack255_39.get((int) 'a');
        boolean b44 = stack255_36.push((java.lang.Object) stack255_39);
        boolean b45 = stack255_33.push((java.lang.Object) stack255_36);
        boolean b46 = stack255_23.push((java.lang.Object) stack255_33);
        boolean b47 = stack255_12.push((java.lang.Object) stack255_33);
        boolean b48 = stack255_12.isFull();
        boolean b49 = stack255_2.push((java.lang.Object) stack255_12);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(i9 == 100);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i24 == 1);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i40 == 1);
        org.junit.Assert.assertTrue(i41 == 1);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == true);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test448");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        boolean b9 = stack255_2.push((java.lang.Object) 0L);
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i13 = stack255_12.size();
        java.lang.Object obj15 = stack255_12.get((int) (short) 1);
        java.lang.Object obj17 = stack255_12.get((int) (byte) 1);
        int i18 = stack255_12.size();
        java.lang.Object obj20 = stack255_12.get(0);
        boolean b21 = stack255_12.isEmpty();
        boolean b22 = stack255_2.push((java.lang.Object) stack255_12);
        io.github.agentsoz.jill.util.Stack255 stack255_25 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj26 = stack255_25.pop();
        boolean b27 = stack255_25.isFull();
        java.lang.Object obj28 = stack255_25.pop();
        boolean b29 = stack255_25.isFull();
        boolean b30 = stack255_2.push((java.lang.Object) b29);
        java.lang.Object obj31 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + false + "'", obj31.equals(false));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test449");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.capacity();
        boolean b8 = stack255_2.isFull();
        boolean b10 = stack255_2.push((java.lang.Object) 0L);
        java.lang.Object obj11 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) -1);
        boolean b15 = stack255_14.isFull();
        boolean b16 = stack255_2.push((java.lang.Object) stack255_14);
        int i17 = stack255_2.capacity();
        int i18 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(i18 == 1);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test450");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) -1);
        boolean b3 = stack255_2.isEmpty();
        boolean b4 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_7 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i8 = stack255_7.capacity();
        int i9 = stack255_7.capacity();
        boolean b10 = stack255_7.isFull();
        int i11 = stack255_7.size();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj16 = stack255_14.get((int) (short) 0);
        boolean b17 = stack255_14.isFull();
        int i18 = stack255_14.capacity();
        boolean b19 = stack255_7.push((java.lang.Object) stack255_14);
        java.lang.Object obj20 = stack255_7.pop();
        boolean b21 = stack255_2.push((java.lang.Object) stack255_7);
        boolean b22 = stack255_2.isEmpty();
        int i23 = stack255_2.capacity();
        boolean b24 = stack255_2.isEmpty();
        boolean b25 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 10);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test451");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.size();
        boolean b9 = stack255_2.push((java.lang.Object) (byte) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 1);
        int i13 = stack255_12.capacity();
        boolean b14 = stack255_12.isEmpty();
        boolean b15 = stack255_12.isEmpty();
        boolean b16 = stack255_12.isFull();
        boolean b17 = stack255_2.push((java.lang.Object) b16);
        java.lang.Object obj18 = stack255_2.pop();
        boolean b19 = stack255_2.isEmpty();
        int i20 = stack255_2.size();
        java.lang.Object obj22 = stack255_2.get(0);
        io.github.agentsoz.jill.util.Stack255 stack255_25 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b26 = stack255_25.isFull();
        boolean b28 = stack255_25.push((java.lang.Object) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_31 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b32 = stack255_25.push((java.lang.Object) stack255_31);
        boolean b33 = stack255_25.isFull();
        int i34 = stack255_25.capacity();
        boolean b35 = stack255_2.push((java.lang.Object) stack255_25);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i13 == 255);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte) 10 + "'", obj22.equals((byte) 10));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 10);
        org.junit.Assert.assertTrue(b35 == true);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test452");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        java.lang.Object obj4 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.get((-1));
        int i7 = stack255_2.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test453");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj11 = stack255_10.pop();
        boolean b12 = stack255_10.isEmpty();
        boolean b13 = stack255_2.push((java.lang.Object) stack255_10);
        boolean b14 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        java.lang.Object obj18 = stack255_17.pop();
        java.lang.Object obj20 = stack255_17.get((int) 'a');
        io.github.agentsoz.jill.util.Stack255 stack255_23 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i24 = stack255_23.size();
        java.lang.Object obj26 = stack255_23.get((int) (short) 1);
        int i27 = stack255_23.size();
        java.lang.Object obj29 = stack255_23.get((int) (short) 100);
        int i30 = stack255_23.capacity();
        boolean b31 = stack255_17.push((java.lang.Object) stack255_23);
        boolean b32 = stack255_2.push((java.lang.Object) b31);
        boolean b33 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_36 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj38 = stack255_36.get((int) (short) 0);
        java.lang.Object obj40 = stack255_36.get((int) (byte) 10);
        java.lang.Object obj41 = stack255_36.pop();
        boolean b42 = stack255_2.push((java.lang.Object) stack255_36);
        int i43 = stack255_2.size();
        java.lang.Object obj44 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(i43 == 3);
        org.junit.Assert.assertNotNull(obj44);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test454");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b3 = stack255_2.isFull();
        boolean b5 = stack255_2.push((java.lang.Object) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_8 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj10 = stack255_8.get((int) (short) 0);
        boolean b11 = stack255_8.isEmpty();
        java.lang.Object obj13 = stack255_8.get(0);
        boolean b14 = stack255_2.push((java.lang.Object) stack255_8);
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj19 = stack255_17.get((int) (short) 0);
        boolean b20 = stack255_17.isFull();
        java.lang.Object obj22 = stack255_17.get((int) (short) 0);
        java.lang.Object obj24 = stack255_17.get((int) ' ');
        java.lang.Object obj26 = stack255_17.get((int) (short) -1);
        int i27 = stack255_17.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_30 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i31 = stack255_30.capacity();
        int i32 = stack255_30.capacity();
        java.lang.Object obj33 = stack255_30.pop();
        java.lang.Object obj34 = stack255_30.pop();
        java.lang.Object obj35 = stack255_30.pop();
        int i36 = stack255_30.capacity();
        java.lang.Object obj38 = stack255_30.get((int) (short) 100);
        boolean b39 = stack255_17.push((java.lang.Object) stack255_30);
        boolean b40 = stack255_8.push((java.lang.Object) stack255_17);
        java.lang.Object obj42 = stack255_17.get(100);
        boolean b43 = stack255_17.isFull();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i31 == 1);
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(i36 == 1);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test455");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) -1);
        int i3 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_6 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i7 = stack255_6.capacity();
        int i8 = stack255_6.capacity();
        java.lang.Object obj9 = stack255_6.pop();
        java.lang.Object obj10 = stack255_6.pop();
        java.lang.Object obj11 = stack255_6.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj15 = stack255_14.pop();
        boolean b16 = stack255_14.isEmpty();
        boolean b17 = stack255_6.push((java.lang.Object) stack255_14);
        boolean b18 = stack255_6.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_21 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        java.lang.Object obj22 = stack255_21.pop();
        java.lang.Object obj24 = stack255_21.get((int) 'a');
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i28 = stack255_27.size();
        java.lang.Object obj30 = stack255_27.get((int) (short) 1);
        int i31 = stack255_27.size();
        java.lang.Object obj33 = stack255_27.get((int) (short) 100);
        int i34 = stack255_27.capacity();
        boolean b35 = stack255_21.push((java.lang.Object) stack255_27);
        boolean b36 = stack255_6.push((java.lang.Object) b35);
        int i37 = stack255_6.size();
        boolean b38 = stack255_2.push((java.lang.Object) stack255_6);
        int i39 = stack255_6.size();
        java.lang.Object obj41 = stack255_6.get((int) (byte) 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(i37 == 2);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(i39 == 2);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test456");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        java.lang.Object obj6 = stack255_2.get((int) (byte) 10);
        boolean b8 = stack255_2.push((java.lang.Object) 10);
        java.lang.Object obj9 = stack255_2.pop();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10 + "'", obj9.equals(10));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test457");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        int i3 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_6 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj8 = stack255_6.get((int) (short) 0);
        boolean b9 = stack255_6.isFull();
        java.lang.Object obj11 = stack255_6.get((int) (short) 0);
        java.lang.Object obj12 = stack255_6.pop();
        boolean b13 = stack255_6.isEmpty();
        boolean b14 = stack255_2.push((java.lang.Object) stack255_6);
        java.lang.Object obj15 = stack255_6.pop();
        int i16 = stack255_6.size();
        org.junit.Assert.assertTrue(i3 == 10);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test458");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        int i6 = stack255_2.capacity();
        java.lang.Object obj7 = stack255_2.pop();
        boolean b8 = stack255_2.isFull();
        boolean b9 = stack255_2.isEmpty();
        int i10 = stack255_2.size();
        int i11 = stack255_2.size();
        java.lang.Object obj13 = stack255_2.get((-1));
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test459");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        java.lang.Object obj12 = stack255_2.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj16 = stack255_15.pop();
        boolean b17 = stack255_15.isFull();
        boolean b18 = stack255_2.push((java.lang.Object) stack255_15);
        java.lang.Object obj20 = stack255_15.get((int) 'a');
        boolean b21 = stack255_15.isEmpty();
        int i22 = stack255_15.capacity();
        int i23 = stack255_15.size();
        boolean b24 = stack255_15.isEmpty();
        boolean b25 = stack255_15.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i22 == 10);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test460");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        java.lang.Object obj4 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) '#');
        boolean b10 = stack255_2.isEmpty();
        boolean b11 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        int i15 = stack255_14.capacity();
        java.lang.Object obj17 = stack255_14.get((int) 'a');
        boolean b18 = stack255_2.push((java.lang.Object) 'a');
        java.lang.Object obj20 = stack255_2.get(0);
        io.github.agentsoz.jill.util.Stack255 stack255_23 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj25 = stack255_23.get((int) (short) 0);
        boolean b26 = stack255_23.isFull();
        java.lang.Object obj28 = stack255_23.get((int) (short) 0);
        java.lang.Object obj30 = stack255_23.get((int) ' ');
        boolean b31 = stack255_23.isEmpty();
        boolean b32 = stack255_23.isEmpty();
        int i33 = stack255_23.capacity();
        int i34 = stack255_23.capacity();
        boolean b35 = stack255_2.push((java.lang.Object) i34);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i15 == 10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 'a' + "'", obj20.equals('a'));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(b35 == true);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test461");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_6 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj8 = stack255_6.get((int) (short) 0);
        boolean b9 = stack255_6.isFull();
        java.lang.Object obj11 = stack255_6.get((int) ' ');
        int i12 = stack255_6.size();
        java.lang.Object obj14 = stack255_6.get((int) (byte) 0);
        boolean b15 = stack255_2.push((java.lang.Object) stack255_6);
        boolean b16 = stack255_6.isEmpty();
        boolean b17 = stack255_6.isEmpty();
        int i18 = stack255_6.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test462");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        java.lang.Object obj3 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.get((int) (byte) 1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test463");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.size();
        java.lang.Object obj9 = stack255_2.get(0);
        int i10 = stack255_2.capacity();
        java.lang.Object obj12 = stack255_2.get((int) '4');
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test464");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 100);
        int i5 = stack255_2.size();
        int i6 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i10 = stack255_9.capacity();
        int i11 = stack255_9.capacity();
        java.lang.Object obj12 = stack255_9.pop();
        java.lang.Object obj13 = stack255_9.pop();
        boolean b14 = stack255_9.isFull();
        java.lang.Object obj15 = stack255_9.pop();
        boolean b16 = stack255_9.isEmpty();
        int i17 = stack255_9.capacity();
        java.lang.Object obj19 = stack255_9.get(255);
        boolean b20 = stack255_2.push((java.lang.Object) stack255_9);
        boolean b21 = stack255_2.isFull();
        boolean b22 = stack255_2.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test465");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isEmpty();
        boolean b6 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj10 = stack255_9.pop();
        java.lang.Object obj12 = stack255_9.get((int) (byte) -1);
        int i13 = stack255_9.size();
        boolean b14 = stack255_2.push((java.lang.Object) stack255_9);
        int i15 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i19 = stack255_18.capacity();
        int i20 = stack255_18.capacity();
        java.lang.Object obj22 = stack255_18.get((int) 'a');
        int i23 = stack255_18.size();
        java.lang.Object obj25 = stack255_18.get(0);
        int i26 = stack255_18.capacity();
        int i27 = stack255_18.capacity();
        int i28 = stack255_18.size();
        boolean b29 = stack255_2.push((java.lang.Object) stack255_18);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test466");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b3 = stack255_2.isFull();
        boolean b5 = stack255_2.push((java.lang.Object) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_8 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        boolean b9 = stack255_2.push((java.lang.Object) stack255_8);
        int i10 = stack255_2.size();
        boolean b11 = stack255_2.isFull();
        boolean b12 = stack255_2.isEmpty();
        boolean b13 = stack255_2.isFull();
        java.lang.Object obj15 = stack255_2.get(11);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test467");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.size();
        int i11 = stack255_2.capacity();
        java.lang.Object obj13 = stack255_2.get((int) (short) 100);
        int i14 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i18 = stack255_17.capacity();
        int i19 = stack255_17.capacity();
        java.lang.Object obj20 = stack255_17.pop();
        java.lang.Object obj21 = stack255_17.pop();
        java.lang.Object obj22 = stack255_17.pop();
        java.lang.Object obj24 = stack255_17.get((int) (short) 10);
        boolean b25 = stack255_17.isFull();
        int i26 = stack255_17.size();
        java.lang.Object obj28 = stack255_17.get(1);
        boolean b29 = stack255_2.push((java.lang.Object) 1);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test468");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i3 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_6 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) -1);
        boolean b7 = stack255_2.push((java.lang.Object) (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i11 = stack255_10.capacity();
        int i12 = stack255_10.capacity();
        java.lang.Object obj13 = stack255_10.pop();
        boolean b14 = stack255_10.isEmpty();
        boolean b16 = stack255_10.push((java.lang.Object) "");
        boolean b17 = stack255_2.push((java.lang.Object) "");
        java.lang.Object obj18 = stack255_2.pop();
        java.lang.Object obj20 = stack255_2.get((int) 'a');
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "" + "'", obj18.equals(""));
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test469");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        java.lang.Object obj11 = stack255_2.get((int) (short) -1);
        boolean b12 = stack255_2.isEmpty();
        int i13 = stack255_2.capacity();
        int i14 = stack255_2.capacity();
        java.lang.Object obj15 = null;
        boolean b16 = stack255_2.push(obj15);
        int i17 = stack255_2.size();
        boolean b18 = stack255_2.isFull();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test470");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        boolean b4 = stack255_2.isFull();
        java.lang.Object obj5 = stack255_2.pop();
        boolean b6 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i10 = stack255_9.capacity();
        int i11 = stack255_9.capacity();
        java.lang.Object obj12 = stack255_9.pop();
        java.lang.Object obj13 = stack255_9.pop();
        java.lang.Object obj14 = stack255_9.pop();
        java.lang.Object obj16 = stack255_9.get((int) (short) 10);
        int i17 = stack255_9.size();
        int i18 = stack255_9.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_21 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i22 = stack255_21.capacity();
        int i23 = stack255_21.capacity();
        boolean b24 = stack255_9.push((java.lang.Object) stack255_21);
        boolean b25 = stack255_9.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_28 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b29 = stack255_28.isFull();
        boolean b31 = stack255_28.push((java.lang.Object) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_34 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj36 = stack255_34.get((int) (short) 0);
        boolean b37 = stack255_34.isEmpty();
        java.lang.Object obj39 = stack255_34.get(0);
        boolean b40 = stack255_28.push((java.lang.Object) stack255_34);
        io.github.agentsoz.jill.util.Stack255 stack255_43 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj44 = stack255_43.pop();
        boolean b46 = stack255_43.push((java.lang.Object) true);
        int i47 = stack255_43.size();
        java.lang.Object obj48 = stack255_43.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_51 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj52 = stack255_51.pop();
        java.lang.Object obj54 = stack255_51.get((int) (byte) -1);
        boolean b55 = stack255_51.isEmpty();
        int i56 = stack255_51.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_59 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i60 = stack255_59.size();
        java.lang.Object obj62 = stack255_59.get((int) (short) 1);
        int i63 = stack255_59.size();
        java.lang.Object obj65 = stack255_59.get((int) (short) 100);
        int i66 = stack255_59.capacity();
        boolean b67 = stack255_51.push((java.lang.Object) stack255_59);
        io.github.agentsoz.jill.util.Stack255 stack255_70 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_73 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i74 = stack255_73.capacity();
        java.lang.Object obj75 = stack255_73.pop();
        java.lang.Object obj76 = null;
        boolean b77 = stack255_73.push(obj76);
        boolean b78 = stack255_70.push((java.lang.Object) b77);
        boolean b79 = stack255_59.push((java.lang.Object) b78);
        boolean b80 = stack255_59.isEmpty();
        boolean b81 = stack255_59.isEmpty();
        boolean b82 = stack255_43.push((java.lang.Object) stack255_59);
        java.lang.Object obj83 = stack255_43.pop();
        boolean b84 = stack255_28.push((java.lang.Object) stack255_43);
        boolean b85 = stack255_9.push((java.lang.Object) stack255_43);
        boolean b86 = stack255_43.isFull();
        boolean b87 = stack255_2.push((java.lang.Object) stack255_43);
        int i88 = stack255_43.capacity();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i22 == 255);
        org.junit.Assert.assertTrue(i23 == 255);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(i47 == 1);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + true + "'", obj48.equals(true));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(i56 == 10);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(i66 == 1);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(i74 == 255);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertTrue(i88 == 255);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test471");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 1);
        int i3 = stack255_2.capacity();
        boolean b4 = stack255_2.isEmpty();
        boolean b5 = stack255_2.isEmpty();
        boolean b6 = stack255_2.isFull();
        boolean b7 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i11 = stack255_10.size();
        java.lang.Object obj13 = stack255_10.get((int) (short) 1);
        java.lang.Object obj15 = stack255_10.get((int) (byte) 1);
        int i16 = stack255_10.size();
        java.lang.Object obj18 = stack255_10.get(0);
        boolean b19 = stack255_10.isEmpty();
        boolean b20 = stack255_10.isFull();
        java.lang.Object obj22 = stack255_10.get((int) (short) 0);
        boolean b23 = stack255_2.push((java.lang.Object) (short) 0);
        java.lang.Object obj24 = stack255_2.pop();
        int i25 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) 0 + "'", obj24.equals((short) 0));
        org.junit.Assert.assertTrue(i25 == 255);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test472");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj9 = stack255_5.get((int) 'a');
        boolean b10 = stack255_2.push((java.lang.Object) stack255_5);
        int i11 = stack255_5.capacity();
        java.lang.Object obj12 = stack255_5.pop();
        java.lang.Object obj13 = stack255_5.pop();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test473");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) -1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        io.github.agentsoz.jill.util.Stack255 stack255_8 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i9 = stack255_8.capacity();
        int i10 = stack255_8.capacity();
        java.lang.Object obj12 = stack255_8.get((int) 'a');
        boolean b13 = stack255_5.push((java.lang.Object) stack255_8);
        boolean b14 = stack255_2.push((java.lang.Object) stack255_5);
        boolean b16 = stack255_2.push((java.lang.Object) 10L);
        java.lang.Object obj17 = stack255_2.pop();
        boolean b18 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 10L + "'", obj17.equals(10L));
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test474");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.size();
        java.lang.Object obj5 = stack255_2.get((int) (short) 1);
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i11 = stack255_10.capacity();
        int i12 = stack255_10.capacity();
        java.lang.Object obj14 = stack255_10.get((int) 'a');
        int i15 = stack255_10.size();
        java.lang.Object obj17 = stack255_10.get(0);
        int i18 = stack255_10.capacity();
        int i19 = stack255_10.capacity();
        boolean b20 = stack255_2.push((java.lang.Object) i19);
        io.github.agentsoz.jill.util.Stack255 stack255_23 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 10);
        java.lang.Object obj25 = stack255_23.get((int) (short) 100);
        java.lang.Object obj26 = stack255_23.pop();
        java.lang.Object obj27 = stack255_23.pop();
        int i28 = stack255_23.size();
        int i29 = stack255_23.size();
        boolean b30 = stack255_2.push((java.lang.Object) stack255_23);
        int i31 = stack255_2.size();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(i31 == 2);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test475");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        boolean b10 = stack255_2.isFull();
        boolean b11 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i18 = stack255_17.capacity();
        int i19 = stack255_17.size();
        java.lang.Object obj21 = stack255_17.get((int) (short) 0);
        boolean b22 = stack255_14.push((java.lang.Object) (short) 0);
        boolean b23 = stack255_14.isEmpty();
        java.lang.Object obj24 = stack255_14.pop();
        boolean b25 = stack255_2.push(obj24);
        int i26 = stack255_2.capacity();
        int i27 = stack255_2.size();
        int i28 = stack255_2.size();
        java.lang.Object obj29 = stack255_2.pop();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i18 == 255);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) 0 + "'", obj24.equals((short) 0));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(i26 == 11);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (short) 0 + "'", obj29.equals((short) 0));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test476");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj3 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.get((int) ' ');
        java.lang.Object obj6 = stack255_2.pop();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test477");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 0);
        java.lang.Object obj4 = stack255_2.get(255);
        java.lang.Object obj6 = stack255_2.get((int) (byte) 1);
        int i7 = stack255_2.capacity();
        java.lang.Object obj9 = stack255_2.get((int) (byte) 0);
        boolean b10 = stack255_2.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test478");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        boolean b3 = stack255_2.isEmpty();
        boolean b4 = stack255_2.isEmpty();
        java.lang.Object obj6 = stack255_2.get((int) (short) 100);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test479");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        boolean b9 = stack255_2.push((java.lang.Object) 0L);
        int i10 = stack255_2.capacity();
        int i11 = stack255_2.capacity();
        boolean b12 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test480");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        boolean b10 = stack255_2.isFull();
        int i11 = stack255_2.capacity();
        boolean b13 = stack255_2.push((java.lang.Object) ' ');
        int i14 = stack255_2.size();
        java.lang.Object obj15 = stack255_2.pop();
        boolean b16 = stack255_2.isEmpty();
        java.lang.Object obj17 = stack255_2.pop();
        java.lang.Object obj18 = stack255_2.pop();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + ' ' + "'", obj15.equals(' '));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test481");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        java.lang.Object obj12 = stack255_2.get((int) (short) 10);
        int i13 = stack255_2.capacity();
        java.lang.Object obj14 = stack255_2.pop();
        boolean b15 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test482");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        java.lang.Object obj7 = stack255_2.pop();
        java.lang.Object obj9 = stack255_2.get((int) (short) 10);
        int i10 = stack255_2.size();
        int i11 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i15 = stack255_14.capacity();
        int i16 = stack255_14.capacity();
        boolean b17 = stack255_2.push((java.lang.Object) stack255_14);
        boolean b18 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_21 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        boolean b22 = stack255_21.isFull();
        boolean b24 = stack255_21.push((java.lang.Object) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_27 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj29 = stack255_27.get((int) (short) 0);
        boolean b30 = stack255_27.isEmpty();
        java.lang.Object obj32 = stack255_27.get(0);
        boolean b33 = stack255_21.push((java.lang.Object) stack255_27);
        io.github.agentsoz.jill.util.Stack255 stack255_36 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj37 = stack255_36.pop();
        boolean b39 = stack255_36.push((java.lang.Object) true);
        int i40 = stack255_36.size();
        java.lang.Object obj41 = stack255_36.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_44 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj45 = stack255_44.pop();
        java.lang.Object obj47 = stack255_44.get((int) (byte) -1);
        boolean b48 = stack255_44.isEmpty();
        int i49 = stack255_44.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_52 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i53 = stack255_52.size();
        java.lang.Object obj55 = stack255_52.get((int) (short) 1);
        int i56 = stack255_52.size();
        java.lang.Object obj58 = stack255_52.get((int) (short) 100);
        int i59 = stack255_52.capacity();
        boolean b60 = stack255_44.push((java.lang.Object) stack255_52);
        io.github.agentsoz.jill.util.Stack255 stack255_63 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_66 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i67 = stack255_66.capacity();
        java.lang.Object obj68 = stack255_66.pop();
        java.lang.Object obj69 = null;
        boolean b70 = stack255_66.push(obj69);
        boolean b71 = stack255_63.push((java.lang.Object) b70);
        boolean b72 = stack255_52.push((java.lang.Object) b71);
        boolean b73 = stack255_52.isEmpty();
        boolean b74 = stack255_52.isEmpty();
        boolean b75 = stack255_36.push((java.lang.Object) stack255_52);
        java.lang.Object obj76 = stack255_36.pop();
        boolean b77 = stack255_21.push((java.lang.Object) stack255_36);
        boolean b78 = stack255_2.push((java.lang.Object) stack255_36);
        int i79 = stack255_36.size();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i15 == 255);
        org.junit.Assert.assertTrue(i16 == 255);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i40 == 1);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + true + "'", obj41.equals(true));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(i49 == 10);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(i59 == 1);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(i67 == 255);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(i79 == 0);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test483");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        boolean b7 = stack255_2.push((java.lang.Object) (short) 100);
        int i8 = stack255_2.capacity();
        int i9 = stack255_2.size();
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 1);
        boolean b13 = stack255_2.push((java.lang.Object) stack255_12);
        int i14 = stack255_12.size();
        java.lang.Object obj16 = stack255_12.get((int) '#');
        boolean b17 = stack255_12.isEmpty();
        boolean b18 = stack255_12.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test484");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        int i6 = stack255_2.capacity();
        java.lang.Object obj7 = stack255_2.pop();
        int i8 = stack255_2.size();
        boolean b9 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test485");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj3 = stack255_2.pop();
        boolean b4 = stack255_2.isEmpty();
        int i5 = stack255_2.size();
        boolean b6 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.pop();
        boolean b8 = stack255_2.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i12 = stack255_11.capacity();
        int i13 = stack255_11.size();
        java.lang.Object obj15 = stack255_11.get((int) (short) 0);
        int i16 = stack255_11.capacity();
        boolean b17 = stack255_11.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_20 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i21 = stack255_20.capacity();
        int i22 = stack255_20.capacity();
        boolean b23 = stack255_20.isFull();
        int i24 = stack255_20.capacity();
        int i25 = stack255_20.capacity();
        boolean b26 = stack255_11.push((java.lang.Object) stack255_20);
        io.github.agentsoz.jill.util.Stack255 stack255_29 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj31 = stack255_29.get((int) (short) 0);
        boolean b32 = stack255_29.isEmpty();
        int i33 = stack255_29.size();
        boolean b34 = stack255_29.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_37 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_40 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i41 = stack255_40.capacity();
        int i42 = stack255_40.capacity();
        java.lang.Object obj43 = stack255_40.pop();
        boolean b44 = stack255_40.isEmpty();
        boolean b46 = stack255_40.push((java.lang.Object) "");
        boolean b47 = stack255_37.push((java.lang.Object) "");
        boolean b48 = stack255_29.push((java.lang.Object) stack255_37);
        boolean b49 = stack255_11.push((java.lang.Object) stack255_29);
        java.lang.Object obj50 = stack255_11.pop();
        boolean b51 = stack255_2.push((java.lang.Object) stack255_11);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i12 == 255);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 255);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 1);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i41 == 1);
        org.junit.Assert.assertTrue(i42 == 1);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue(b51 == true);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test486");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 1);
        int i3 = stack255_2.capacity();
        boolean b4 = stack255_2.isEmpty();
        int i5 = stack255_2.capacity();
        int i6 = stack255_2.capacity();
        java.lang.Object obj8 = stack255_2.get((int) (byte) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_11 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i12 = stack255_11.capacity();
        int i13 = stack255_11.capacity();
        java.lang.Object obj15 = stack255_11.get((int) 'a');
        java.lang.Object obj17 = stack255_11.get(100);
        int i18 = stack255_11.capacity();
        java.lang.Object obj20 = stack255_11.get((int) (short) 100);
        boolean b21 = stack255_2.push(obj20);
        org.junit.Assert.assertTrue(i3 == 255);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 255);
        org.junit.Assert.assertTrue(i6 == 255);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test487");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 1);
        java.lang.Object obj3 = stack255_2.pop();
        java.lang.Object obj5 = stack255_2.get((int) (byte) -1);
        boolean b6 = stack255_2.isEmpty();
        int i7 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_10 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i11 = stack255_10.size();
        java.lang.Object obj13 = stack255_10.get((int) (short) 1);
        int i14 = stack255_10.size();
        java.lang.Object obj16 = stack255_10.get((int) (short) 100);
        int i17 = stack255_10.capacity();
        boolean b18 = stack255_2.push((java.lang.Object) stack255_10);
        io.github.agentsoz.jill.util.Stack255 stack255_21 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_24 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        int i25 = stack255_24.capacity();
        java.lang.Object obj26 = stack255_24.pop();
        java.lang.Object obj27 = null;
        boolean b28 = stack255_24.push(obj27);
        boolean b29 = stack255_21.push((java.lang.Object) b28);
        boolean b30 = stack255_10.push((java.lang.Object) b29);
        boolean b31 = stack255_10.isEmpty();
        boolean b32 = stack255_10.isEmpty();
        boolean b33 = stack255_10.isEmpty();
        int i34 = stack255_10.capacity();
        int i35 = stack255_10.capacity();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i25 == 255);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i35 == 1);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test488");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i10 = stack255_9.capacity();
        int i11 = stack255_9.capacity();
        boolean b12 = stack255_9.isFull();
        int i13 = stack255_9.size();
        boolean b14 = stack255_9.isEmpty();
        boolean b15 = stack255_2.push((java.lang.Object) stack255_9);
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i19 = stack255_18.capacity();
        int i20 = stack255_18.capacity();
        java.lang.Object obj22 = stack255_18.get((int) 'a');
        java.lang.Object obj24 = stack255_18.get(100);
        java.lang.Object obj26 = stack255_18.get((int) (short) 10);
        java.lang.Object obj28 = stack255_18.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_31 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_34 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i35 = stack255_34.capacity();
        int i36 = stack255_34.capacity();
        java.lang.Object obj37 = stack255_34.pop();
        boolean b38 = stack255_34.isEmpty();
        boolean b40 = stack255_34.push((java.lang.Object) "");
        boolean b41 = stack255_31.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_44 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b45 = stack255_31.push((java.lang.Object) stack255_44);
        io.github.agentsoz.jill.util.Stack255 stack255_48 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i49 = stack255_48.capacity();
        int i50 = stack255_48.capacity();
        java.lang.Object obj52 = stack255_48.get((int) 'a');
        java.lang.Object obj54 = stack255_48.get(100);
        int i55 = stack255_48.capacity();
        boolean b56 = stack255_31.push((java.lang.Object) stack255_48);
        boolean b57 = stack255_31.isFull();
        boolean b58 = stack255_18.push((java.lang.Object) stack255_31);
        int i59 = stack255_18.size();
        boolean b60 = stack255_2.push((java.lang.Object) i59);
        io.github.agentsoz.jill.util.Stack255 stack255_63 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i64 = stack255_63.size();
        java.lang.Object obj66 = stack255_63.get((int) (short) 1);
        java.lang.Object obj68 = stack255_63.get((int) (byte) 1);
        java.lang.Object obj69 = stack255_63.pop();
        boolean b70 = stack255_2.push(obj69);
        boolean b71 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue(i36 == 1);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(i49 == 1);
        org.junit.Assert.assertTrue(i50 == 1);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(i55 == 1);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(i59 == 1);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b71 == false);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test489");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        java.lang.Object obj4 = stack255_2.get((int) (byte) -1);
        java.lang.Object obj6 = stack255_2.get((int) '#');
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i10 = stack255_9.capacity();
        int i11 = stack255_9.capacity();
        java.lang.Object obj12 = stack255_9.pop();
        java.lang.Object obj13 = stack255_9.pop();
        int i14 = stack255_9.size();
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        boolean b18 = stack255_9.push((java.lang.Object) stack255_17);
        boolean b19 = stack255_2.push((java.lang.Object) b18);
        boolean b20 = stack255_2.isFull();
        int i21 = stack255_2.size();
        int i22 = stack255_2.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertTrue(i22 == 1);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test490");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        boolean b7 = stack255_2.push((java.lang.Object) (short) 100);
        int i8 = stack255_2.capacity();
        int i9 = stack255_2.size();
        boolean b10 = stack255_2.isEmpty();
        boolean b11 = stack255_2.isFull();
        boolean b12 = stack255_2.isFull();
        boolean b13 = stack255_2.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test491");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        io.github.agentsoz.jill.util.Stack255 stack255_9 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i10 = stack255_9.capacity();
        int i11 = stack255_9.capacity();
        boolean b12 = stack255_9.isFull();
        int i13 = stack255_9.size();
        boolean b14 = stack255_9.isEmpty();
        boolean b15 = stack255_2.push((java.lang.Object) stack255_9);
        io.github.agentsoz.jill.util.Stack255 stack255_18 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i19 = stack255_18.capacity();
        int i20 = stack255_18.capacity();
        java.lang.Object obj22 = stack255_18.get((int) 'a');
        java.lang.Object obj24 = stack255_18.get(100);
        java.lang.Object obj26 = stack255_18.get((int) (short) 10);
        java.lang.Object obj28 = stack255_18.get((int) (short) 10);
        io.github.agentsoz.jill.util.Stack255 stack255_31 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_34 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i35 = stack255_34.capacity();
        int i36 = stack255_34.capacity();
        java.lang.Object obj37 = stack255_34.pop();
        boolean b38 = stack255_34.isEmpty();
        boolean b40 = stack255_34.push((java.lang.Object) "");
        boolean b41 = stack255_31.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_44 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b45 = stack255_31.push((java.lang.Object) stack255_44);
        io.github.agentsoz.jill.util.Stack255 stack255_48 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i49 = stack255_48.capacity();
        int i50 = stack255_48.capacity();
        java.lang.Object obj52 = stack255_48.get((int) 'a');
        java.lang.Object obj54 = stack255_48.get(100);
        int i55 = stack255_48.capacity();
        boolean b56 = stack255_31.push((java.lang.Object) stack255_48);
        boolean b57 = stack255_31.isFull();
        boolean b58 = stack255_18.push((java.lang.Object) stack255_31);
        int i59 = stack255_18.size();
        boolean b60 = stack255_2.push((java.lang.Object) i59);
        io.github.agentsoz.jill.util.Stack255 stack255_63 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i64 = stack255_63.size();
        java.lang.Object obj66 = stack255_63.get((int) (short) 1);
        java.lang.Object obj68 = stack255_63.get((int) (byte) 1);
        java.lang.Object obj69 = stack255_63.pop();
        boolean b70 = stack255_2.push(obj69);
        java.lang.Object obj72 = stack255_2.get((int) (byte) 10);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue(i36 == 1);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(i49 == 1);
        org.junit.Assert.assertTrue(i50 == 1);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(i55 == 1);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(i59 == 1);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNull(obj72);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test492");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj9 = stack255_5.get((int) 'a');
        int i10 = stack255_5.capacity();
        int i11 = stack255_5.capacity();
        boolean b12 = stack255_2.push((java.lang.Object) stack255_5);
        int i13 = stack255_5.capacity();
        java.lang.Object obj14 = stack255_5.pop();
        boolean b15 = stack255_5.isEmpty();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test493");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        int i7 = stack255_2.capacity();
        java.lang.Object obj8 = stack255_2.pop();
        boolean b9 = stack255_2.isFull();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test494");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj6 = stack255_2.get((int) 'a');
        java.lang.Object obj8 = stack255_2.get(100);
        java.lang.Object obj10 = stack255_2.get((int) (short) 10);
        java.lang.Object obj12 = stack255_2.get((int) (short) 10);
        int i13 = stack255_2.capacity();
        int i14 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test495");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        java.lang.Object obj4 = stack255_2.get((int) (byte) -1);
        boolean b6 = stack255_2.push((java.lang.Object) 10.0f);
        boolean b7 = stack255_2.isEmpty();
        boolean b8 = stack255_2.isFull();
        boolean b9 = stack255_2.isFull();
        io.github.agentsoz.jill.util.Stack255 stack255_12 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i13 = stack255_12.capacity();
        int i14 = stack255_12.capacity();
        java.lang.Object obj15 = stack255_12.pop();
        java.lang.Object obj16 = stack255_12.pop();
        java.lang.Object obj17 = stack255_12.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_20 = new io.github.agentsoz.jill.util.Stack255((byte) -1, (byte) 10);
        java.lang.Object obj21 = stack255_20.pop();
        boolean b22 = stack255_20.isEmpty();
        boolean b23 = stack255_12.push((java.lang.Object) stack255_20);
        io.github.agentsoz.jill.util.Stack255 stack255_26 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_29 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i30 = stack255_29.capacity();
        int i31 = stack255_29.capacity();
        java.lang.Object obj32 = stack255_29.pop();
        boolean b33 = stack255_29.isEmpty();
        boolean b35 = stack255_29.push((java.lang.Object) "");
        boolean b36 = stack255_26.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_39 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b40 = stack255_26.push((java.lang.Object) stack255_39);
        io.github.agentsoz.jill.util.Stack255 stack255_43 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i44 = stack255_43.capacity();
        int i45 = stack255_43.capacity();
        java.lang.Object obj47 = stack255_43.get((int) 'a');
        java.lang.Object obj49 = stack255_43.get(100);
        int i50 = stack255_43.capacity();
        boolean b51 = stack255_26.push((java.lang.Object) stack255_43);
        java.lang.Object obj52 = stack255_26.pop();
        boolean b53 = stack255_12.push(obj52);
        java.lang.Object obj55 = stack255_12.get((int) (short) 10);
        boolean b56 = stack255_2.push((java.lang.Object) stack255_12);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertTrue(i31 == 1);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(i44 == 1);
        org.junit.Assert.assertTrue(i45 == 1);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(i50 == 1);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b56 == true);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test496");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        java.lang.Object obj5 = stack255_2.pop();
        java.lang.Object obj6 = stack255_2.pop();
        boolean b7 = stack255_2.isEmpty();
        java.lang.Object obj9 = stack255_2.get(0);
        java.lang.Object obj10 = stack255_2.pop();
        java.lang.Object obj11 = stack255_2.pop();
        java.lang.Object obj13 = stack255_2.get((int) (byte) 100);
        boolean b15 = stack255_2.push((java.lang.Object) (-1.0f));
        int i16 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test497");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        boolean b9 = stack255_5.isEmpty();
        boolean b11 = stack255_5.push((java.lang.Object) "");
        boolean b12 = stack255_2.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b16 = stack255_2.push((java.lang.Object) stack255_15);
        io.github.agentsoz.jill.util.Stack255 stack255_19 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i20 = stack255_19.capacity();
        int i21 = stack255_19.capacity();
        java.lang.Object obj23 = stack255_19.get((int) 'a');
        java.lang.Object obj25 = stack255_19.get(100);
        int i26 = stack255_19.capacity();
        boolean b27 = stack255_2.push((java.lang.Object) stack255_19);
        boolean b28 = stack255_2.isFull();
        int i29 = stack255_2.size();
        int i30 = stack255_2.capacity();
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 3);
        org.junit.Assert.assertTrue(i30 == 100);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test498");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_5 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i6 = stack255_5.capacity();
        int i7 = stack255_5.capacity();
        java.lang.Object obj8 = stack255_5.pop();
        boolean b9 = stack255_5.isEmpty();
        boolean b11 = stack255_5.push((java.lang.Object) "");
        boolean b12 = stack255_2.push((java.lang.Object) "");
        io.github.agentsoz.jill.util.Stack255 stack255_15 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        boolean b16 = stack255_2.push((java.lang.Object) stack255_15);
        java.lang.Object obj17 = stack255_2.pop();
        int i18 = stack255_2.size();
        int i19 = stack255_2.capacity();
        io.github.agentsoz.jill.util.Stack255 stack255_22 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 10);
        boolean b23 = stack255_2.push((java.lang.Object) stack255_22);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test499");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i3 = stack255_2.capacity();
        int i4 = stack255_2.capacity();
        boolean b5 = stack255_2.isFull();
        boolean b7 = stack255_2.push((java.lang.Object) (short) 100);
        java.lang.Object obj9 = stack255_2.get((-1));
        boolean b10 = stack255_2.isEmpty();
        java.lang.Object obj11 = stack255_2.pop();
        io.github.agentsoz.jill.util.Stack255 stack255_14 = new io.github.agentsoz.jill.util.Stack255((byte) 100, (byte) 1);
        io.github.agentsoz.jill.util.Stack255 stack255_17 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i18 = stack255_17.capacity();
        int i19 = stack255_17.capacity();
        java.lang.Object obj20 = stack255_17.pop();
        boolean b21 = stack255_17.isEmpty();
        boolean b23 = stack255_17.push((java.lang.Object) "");
        boolean b24 = stack255_14.push((java.lang.Object) "");
        boolean b25 = stack255_14.isEmpty();
        boolean b26 = stack255_2.push((java.lang.Object) stack255_14);
        io.github.agentsoz.jill.util.Stack255 stack255_29 = new io.github.agentsoz.jill.util.Stack255((byte) 1, (byte) -1);
        int i30 = stack255_29.capacity();
        java.lang.Object obj31 = stack255_29.pop();
        java.lang.Object obj32 = stack255_29.pop();
        java.lang.Object obj33 = stack255_29.pop();
        java.lang.Object obj34 = stack255_29.pop();
        java.lang.Object obj36 = stack255_29.get((int) '#');
        boolean b37 = stack255_29.isEmpty();
        boolean b38 = stack255_29.isEmpty();
        io.github.agentsoz.jill.util.Stack255 stack255_41 = new io.github.agentsoz.jill.util.Stack255((byte) 10, (byte) 0);
        int i42 = stack255_41.capacity();
        java.lang.Object obj44 = stack255_41.get((int) 'a');
        boolean b45 = stack255_29.push((java.lang.Object) 'a');
        boolean b46 = stack255_14.push((java.lang.Object) stack255_29);
        java.lang.Object obj48 = stack255_14.get(2);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 100 + "'", obj11.equals((short) 100));
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(i42 == 10);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Stack255RegressionTest1.test500");
        io.github.agentsoz.jill.util.Stack255 stack255_2 = new io.github.agentsoz.jill.util.Stack255((byte) 0, (byte) 10);
        java.lang.Object obj4 = stack255_2.get((int) (short) 0);
        boolean b5 = stack255_2.isFull();
        java.lang.Object obj7 = stack255_2.get((int) (short) 0);
        java.lang.Object obj9 = stack255_2.get((int) ' ');
        java.lang.Object obj11 = stack255_2.get((int) (short) -1);
        boolean b12 = stack255_2.isEmpty();
        int i13 = stack255_2.capacity();
        int i14 = stack255_2.capacity();
        java.lang.Object obj15 = null;
        boolean b16 = stack255_2.push(obj15);
        int i17 = stack255_2.size();
        int i18 = stack255_2.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(i18 == 1);
    }
}

