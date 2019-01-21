package io.github.agentsoz.jill.core.beliefbase;

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
public class BeliefBaseExceptionRegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test01");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException2 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str3 = beliefBaseException2.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str6 = beliefBaseException5.toString();
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException5);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException2);
        java.lang.String str9 = beliefBaseException8.toString();
        java.lang.String str10 = beliefBaseException8.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str3.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str6.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test02");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.Throwable[] throwable_array5 = beliefBaseException4.getSuppressed();
        java.lang.String str6 = beliefBaseException4.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException4);
        java.lang.Throwable[] throwable_array8 = beliefBaseException7.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException7);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException9);
        org.junit.Assert.assertNotNull(throwable_array5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str6.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array8);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test03");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str10 = beliefBaseException9.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str13 = beliefBaseException12.toString();
        beliefBaseException9.addSuppressed((java.lang.Throwable) beliefBaseException12);
        beliefBaseException7.addSuppressed((java.lang.Throwable) beliefBaseException12);
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException12);
        java.lang.Throwable[] throwable_array17 = beliefBaseException5.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException5);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException5);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException19);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str25 = beliefBaseException24.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException27 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str28 = beliefBaseException27.toString();
        beliefBaseException24.addSuppressed((java.lang.Throwable) beliefBaseException27);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException30 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException24);
        java.lang.Throwable[] throwable_array31 = beliefBaseException30.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException32 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException30);
        beliefBaseException19.addSuppressed((java.lang.Throwable) beliefBaseException30);
        java.lang.String str34 = beliefBaseException30.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException35 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException30);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str13.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array17);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str25.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str28.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array31);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str34.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test04");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException2 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.String str3 = beliefBaseException2.toString();
        java.lang.String str4 = beliefBaseException2.toString();
        java.lang.Throwable[] throwable_array5 = beliefBaseException2.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str10 = beliefBaseException9.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str13 = beliefBaseException12.toString();
        beliefBaseException9.addSuppressed((java.lang.Throwable) beliefBaseException12);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException15 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException9);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException15);
        java.lang.Throwable[] throwable_array17 = beliefBaseException16.getSuppressed();
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException16);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str22 = beliefBaseException21.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str25 = beliefBaseException24.toString();
        beliefBaseException21.addSuppressed((java.lang.Throwable) beliefBaseException24);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException27 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException21);
        java.lang.String str28 = beliefBaseException27.toString();
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException27);
        java.lang.Throwable[] throwable_array30 = beliefBaseException2.getSuppressed();
        java.lang.String str31 = beliefBaseException2.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException32 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException2);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException37 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str38 = beliefBaseException37.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException40 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str41 = beliefBaseException40.toString();
        beliefBaseException37.addSuppressed((java.lang.Throwable) beliefBaseException40);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException43 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException37);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException46 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str47 = beliefBaseException46.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException49 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str50 = beliefBaseException49.toString();
        beliefBaseException46.addSuppressed((java.lang.Throwable) beliefBaseException49);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException52 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException46);
        beliefBaseException43.addSuppressed((java.lang.Throwable) beliefBaseException52);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException54 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException52);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException55 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException54);
        beliefBaseException32.addSuppressed((java.lang.Throwable) beliefBaseException54);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str3.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array5);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str13.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array17);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str22.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str25.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str28.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str31.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str38.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str41.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str47.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str50.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test05");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str5 = beliefBaseException4.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str8 = beliefBaseException7.toString();
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException7);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException4);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException10);
        java.lang.String str12 = beliefBaseException11.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException14 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str19 = beliefBaseException18.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str22 = beliefBaseException21.toString();
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException21);
        beliefBaseException16.addSuppressed((java.lang.Throwable) beliefBaseException21);
        beliefBaseException14.addSuppressed((java.lang.Throwable) beliefBaseException21);
        java.lang.Throwable[] throwable_array26 = beliefBaseException14.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException14.addSuppressed((java.lang.Throwable) beliefBaseException28);
        java.lang.Throwable[] throwable_array30 = beliefBaseException14.getSuppressed();
        beliefBaseException11.addSuppressed((java.lang.Throwable) beliefBaseException14);
        java.lang.String str32 = beliefBaseException14.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException37 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str38 = beliefBaseException37.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException40 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str41 = beliefBaseException40.toString();
        beliefBaseException37.addSuppressed((java.lang.Throwable) beliefBaseException40);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException43 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException37);
        java.lang.String str44 = beliefBaseException43.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException45 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException43);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException46 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException43);
        java.lang.Throwable[] throwable_array47 = beliefBaseException46.getSuppressed();
        beliefBaseException14.addSuppressed((java.lang.Throwable) beliefBaseException46);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException49 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException46);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str5.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str8.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str19.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str22.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array26);
        org.junit.Assert.assertNotNull(throwable_array30);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str32.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str38.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str41.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str44.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array47);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test06");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException1 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test07");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException2 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str12 = beliefBaseException11.toString();
        beliefBaseException8.addSuppressed((java.lang.Throwable) beliefBaseException11);
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException11);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException11);
        java.lang.Throwable[] throwable_array16 = beliefBaseException4.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException18);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str24 = beliefBaseException23.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException26 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str27 = beliefBaseException26.toString();
        beliefBaseException23.addSuppressed((java.lang.Throwable) beliefBaseException26);
        beliefBaseException21.addSuppressed((java.lang.Throwable) beliefBaseException26);
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException26);
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException18);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException33 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException35 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException37 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str38 = beliefBaseException37.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException40 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str41 = beliefBaseException40.toString();
        beliefBaseException37.addSuppressed((java.lang.Throwable) beliefBaseException40);
        beliefBaseException35.addSuppressed((java.lang.Throwable) beliefBaseException40);
        beliefBaseException33.addSuppressed((java.lang.Throwable) beliefBaseException40);
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException40);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException46 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException18);
        java.lang.Throwable[] throwable_array47 = beliefBaseException46.getSuppressed();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array16);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str24.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str27.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str38.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str41.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array47);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test08");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str4 = beliefBaseException3.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException6);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException3);
        java.lang.Throwable[] throwable_array10 = beliefBaseException9.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException9);
        java.lang.String str12 = beliefBaseException9.toString();
        java.lang.Throwable[] throwable_array13 = beliefBaseException9.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException17 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str22 = beliefBaseException21.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str25 = beliefBaseException24.toString();
        beliefBaseException21.addSuppressed((java.lang.Throwable) beliefBaseException24);
        beliefBaseException19.addSuppressed((java.lang.Throwable) beliefBaseException24);
        beliefBaseException17.addSuppressed((java.lang.Throwable) beliefBaseException24);
        java.lang.Throwable[] throwable_array29 = beliefBaseException17.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException31 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException17.addSuppressed((java.lang.Throwable) beliefBaseException31);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException34 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException36 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str37 = beliefBaseException36.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException39 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str40 = beliefBaseException39.toString();
        beliefBaseException36.addSuppressed((java.lang.Throwable) beliefBaseException39);
        beliefBaseException34.addSuppressed((java.lang.Throwable) beliefBaseException39);
        beliefBaseException31.addSuppressed((java.lang.Throwable) beliefBaseException39);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException44 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException39);
        java.lang.Throwable[] throwable_array45 = beliefBaseException44.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException46 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException44);
        beliefBaseException9.addSuppressed((java.lang.Throwable) beliefBaseException44);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException50 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str51 = beliefBaseException50.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException53 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str54 = beliefBaseException53.toString();
        beliefBaseException50.addSuppressed((java.lang.Throwable) beliefBaseException53);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException56 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException50);
        java.lang.Throwable[] throwable_array57 = beliefBaseException56.getSuppressed();
        java.lang.Throwable[] throwable_array58 = beliefBaseException56.getSuppressed();
        beliefBaseException9.addSuppressed((java.lang.Throwable) beliefBaseException56);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array13);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str22.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str25.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array29);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str37.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str40.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array45);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str51.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str54.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array57);
        org.junit.Assert.assertNotNull(throwable_array58);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test09");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException2 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str10 = beliefBaseException9.toString();
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException9);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException9);
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException9);
        java.lang.Throwable[] throwable_array14 = beliefBaseException2.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException15 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException2);
        java.lang.Throwable[] throwable_array16 = beliefBaseException2.getSuppressed();
        java.lang.String str17 = beliefBaseException2.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str23 = beliefBaseException22.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException25 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str26 = beliefBaseException25.toString();
        beliefBaseException22.addSuppressed((java.lang.Throwable) beliefBaseException25);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException22);
        java.lang.Throwable[] throwable_array29 = beliefBaseException28.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException30 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException28);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException31 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException28);
        java.lang.String str32 = beliefBaseException28.toString();
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException28);
        java.lang.String str34 = beliefBaseException2.toString();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array14);
        org.junit.Assert.assertNotNull(throwable_array16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str17.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str23.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str26.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array29);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str32.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str34.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test10");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str6 = beliefBaseException5.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException5);
        java.lang.Throwable[] throwable_array8 = beliefBaseException7.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str12 = beliefBaseException11.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException14 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str15 = beliefBaseException14.toString();
        beliefBaseException11.addSuppressed((java.lang.Throwable) beliefBaseException14);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException17 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException11);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str25 = beliefBaseException24.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException27 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str28 = beliefBaseException27.toString();
        beliefBaseException24.addSuppressed((java.lang.Throwable) beliefBaseException27);
        beliefBaseException22.addSuppressed((java.lang.Throwable) beliefBaseException27);
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException27);
        java.lang.Throwable[] throwable_array32 = beliefBaseException20.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException33 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException20);
        beliefBaseException11.addSuppressed((java.lang.Throwable) beliefBaseException20);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException37 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str38 = beliefBaseException37.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException40 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str41 = beliefBaseException40.toString();
        beliefBaseException37.addSuppressed((java.lang.Throwable) beliefBaseException40);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException43 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException37);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException46 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException48 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException50 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str51 = beliefBaseException50.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException53 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str54 = beliefBaseException53.toString();
        beliefBaseException50.addSuppressed((java.lang.Throwable) beliefBaseException53);
        beliefBaseException48.addSuppressed((java.lang.Throwable) beliefBaseException53);
        beliefBaseException46.addSuppressed((java.lang.Throwable) beliefBaseException53);
        java.lang.Throwable[] throwable_array58 = beliefBaseException46.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException59 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException46);
        beliefBaseException37.addSuppressed((java.lang.Throwable) beliefBaseException46);
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException46);
        beliefBaseException7.addSuppressed((java.lang.Throwable) beliefBaseException46);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException63 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException7);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException64 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException7);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException67 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException69 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException71 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str72 = beliefBaseException71.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException74 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str75 = beliefBaseException74.toString();
        beliefBaseException71.addSuppressed((java.lang.Throwable) beliefBaseException74);
        beliefBaseException69.addSuppressed((java.lang.Throwable) beliefBaseException74);
        beliefBaseException67.addSuppressed((java.lang.Throwable) beliefBaseException74);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException79 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException67);
        java.lang.String str80 = beliefBaseException67.toString();
        beliefBaseException64.addSuppressed((java.lang.Throwable) beliefBaseException67);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException86 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.String str87 = beliefBaseException86.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException88 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException86);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException89 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException86);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException90 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException89);
        beliefBaseException64.addSuppressed((java.lang.Throwable) beliefBaseException89);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException92 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException64);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str6.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str15.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str25.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str28.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array32);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str38.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str41.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str51.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str54.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array58);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str72.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str75.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str80.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str87.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test11");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str6 = beliefBaseException5.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException8);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException5);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException11);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException13 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException12);
        java.lang.String str14 = beliefBaseException13.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException15 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException13);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str25 = beliefBaseException24.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException27 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str28 = beliefBaseException27.toString();
        beliefBaseException24.addSuppressed((java.lang.Throwable) beliefBaseException27);
        beliefBaseException22.addSuppressed((java.lang.Throwable) beliefBaseException27);
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException27);
        java.lang.Throwable[] throwable_array32 = beliefBaseException20.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException34 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException34);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException37 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException39 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str40 = beliefBaseException39.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException42 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str43 = beliefBaseException42.toString();
        beliefBaseException39.addSuppressed((java.lang.Throwable) beliefBaseException42);
        beliefBaseException37.addSuppressed((java.lang.Throwable) beliefBaseException42);
        beliefBaseException34.addSuppressed((java.lang.Throwable) beliefBaseException42);
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException34);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException48 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException34);
        java.lang.Throwable[] throwable_array49 = beliefBaseException34.getSuppressed();
        beliefBaseException15.addSuppressed((java.lang.Throwable) beliefBaseException34);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str6.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str14.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str25.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str28.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array32);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str40.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str43.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array49);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test12");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str4 = beliefBaseException3.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException6);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException3);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException9);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException14 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str15 = beliefBaseException14.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException17 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str18 = beliefBaseException17.toString();
        beliefBaseException14.addSuppressed((java.lang.Throwable) beliefBaseException17);
        beliefBaseException12.addSuppressed((java.lang.Throwable) beliefBaseException17);
        java.lang.String str21 = beliefBaseException12.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.Throwable[] throwable_array25 = beliefBaseException24.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException26 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException24);
        beliefBaseException12.addSuppressed((java.lang.Throwable) beliefBaseException24);
        beliefBaseException10.addSuppressed((java.lang.Throwable) beliefBaseException24);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str15.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str18.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str21.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array25);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test13");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str5 = beliefBaseException4.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str8 = beliefBaseException7.toString();
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException7);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException4);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException10);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException10);
        java.lang.Throwable[] throwable_array13 = beliefBaseException12.getSuppressed();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str5.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str8.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array13);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test14");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str5 = beliefBaseException4.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str8 = beliefBaseException7.toString();
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException7);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException4);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException13 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException15 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException17 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str18 = beliefBaseException17.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str21 = beliefBaseException20.toString();
        beliefBaseException17.addSuppressed((java.lang.Throwable) beliefBaseException20);
        beliefBaseException15.addSuppressed((java.lang.Throwable) beliefBaseException20);
        beliefBaseException13.addSuppressed((java.lang.Throwable) beliefBaseException20);
        java.lang.Throwable[] throwable_array25 = beliefBaseException13.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException26 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException13);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException13);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException30 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException32 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException34 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str35 = beliefBaseException34.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException37 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str38 = beliefBaseException37.toString();
        beliefBaseException34.addSuppressed((java.lang.Throwable) beliefBaseException37);
        beliefBaseException32.addSuppressed((java.lang.Throwable) beliefBaseException37);
        beliefBaseException30.addSuppressed((java.lang.Throwable) beliefBaseException37);
        java.lang.Throwable[] throwable_array42 = beliefBaseException30.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException43 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException30);
        beliefBaseException13.addSuppressed((java.lang.Throwable) beliefBaseException30);
        java.lang.String str45 = beliefBaseException30.toString();
        java.lang.Throwable[] throwable_array46 = beliefBaseException30.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException47 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException30);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException48 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException47);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str5.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str8.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str18.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str21.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array25);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str35.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str38.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array42);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str45.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array46);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test15");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("");
        java.lang.String str4 = beliefBaseException3.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException3);
        java.lang.String str6 = beliefBaseException3.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str13 = beliefBaseException12.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException15 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str16 = beliefBaseException15.toString();
        beliefBaseException12.addSuppressed((java.lang.Throwable) beliefBaseException15);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException12);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException18);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException19);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException20);
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException21);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException3);
        java.lang.Throwable[] throwable_array24 = beliefBaseException23.getSuppressed();
        java.lang.Throwable[] throwable_array25 = beliefBaseException23.getSuppressed();
        java.lang.String str26 = beliefBaseException23.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str6.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str13.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str16.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array24);
        org.junit.Assert.assertNotNull(throwable_array25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str26.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test16");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str6 = beliefBaseException5.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException8);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException5);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException14 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str15 = beliefBaseException14.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException17 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str18 = beliefBaseException17.toString();
        beliefBaseException14.addSuppressed((java.lang.Throwable) beliefBaseException17);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException14);
        beliefBaseException11.addSuppressed((java.lang.Throwable) beliefBaseException20);
        java.lang.Throwable[] throwable_array22 = beliefBaseException11.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException11);
        java.lang.String str24 = beliefBaseException11.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException25 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException11);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException30 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str31 = beliefBaseException30.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException33 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str34 = beliefBaseException33.toString();
        beliefBaseException30.addSuppressed((java.lang.Throwable) beliefBaseException33);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException36 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException30);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException37 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException36);
        java.lang.Throwable[] throwable_array38 = beliefBaseException37.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException39 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException37);
        beliefBaseException11.addSuppressed((java.lang.Throwable) beliefBaseException37);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException44 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("");
        java.lang.String str45 = beliefBaseException44.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException46 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException44);
        java.lang.String str47 = beliefBaseException44.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException48 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException44);
        java.lang.Throwable[] throwable_array49 = beliefBaseException44.getSuppressed();
        beliefBaseException11.addSuppressed((java.lang.Throwable) beliefBaseException44);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException51 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException11);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str6.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str15.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str18.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array22);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str24.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str31.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str34.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array38);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str45.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str47.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertNotNull(throwable_array49);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test17");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.String str4 = beliefBaseException3.toString();
        java.lang.String str5 = beliefBaseException3.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException13 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str14 = beliefBaseException13.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str17 = beliefBaseException16.toString();
        beliefBaseException13.addSuppressed((java.lang.Throwable) beliefBaseException16);
        beliefBaseException11.addSuppressed((java.lang.Throwable) beliefBaseException16);
        beliefBaseException9.addSuppressed((java.lang.Throwable) beliefBaseException16);
        java.lang.Throwable[] throwable_array21 = beliefBaseException9.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException9.addSuppressed((java.lang.Throwable) beliefBaseException23);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException26 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str29 = beliefBaseException28.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException31 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str32 = beliefBaseException31.toString();
        beliefBaseException28.addSuppressed((java.lang.Throwable) beliefBaseException31);
        beliefBaseException26.addSuppressed((java.lang.Throwable) beliefBaseException31);
        beliefBaseException23.addSuppressed((java.lang.Throwable) beliefBaseException31);
        beliefBaseException7.addSuppressed((java.lang.Throwable) beliefBaseException23);
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException23);
        java.lang.String str38 = beliefBaseException3.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException39 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException3);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException40 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException39);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str5.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str14.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str17.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array21);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str29.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str32.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str38.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test18");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str8 = beliefBaseException7.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str11 = beliefBaseException10.toString();
        beliefBaseException7.addSuppressed((java.lang.Throwable) beliefBaseException10);
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException10);
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException10);
        java.lang.Throwable[] throwable_array15 = beliefBaseException3.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException17 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str22 = beliefBaseException21.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str25 = beliefBaseException24.toString();
        beliefBaseException21.addSuppressed((java.lang.Throwable) beliefBaseException24);
        beliefBaseException19.addSuppressed((java.lang.Throwable) beliefBaseException24);
        beliefBaseException17.addSuppressed((java.lang.Throwable) beliefBaseException24);
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException17);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException32 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("");
        java.lang.String str33 = beliefBaseException32.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException34 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException32);
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException34);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException39 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException41 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException43 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str44 = beliefBaseException43.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException46 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str47 = beliefBaseException46.toString();
        beliefBaseException43.addSuppressed((java.lang.Throwable) beliefBaseException46);
        beliefBaseException41.addSuppressed((java.lang.Throwable) beliefBaseException46);
        beliefBaseException39.addSuppressed((java.lang.Throwable) beliefBaseException46);
        java.lang.Throwable[] throwable_array51 = beliefBaseException39.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException53 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException39.addSuppressed((java.lang.Throwable) beliefBaseException53);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException55 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException39);
        java.lang.String str56 = beliefBaseException39.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException58 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException60 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException62 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str63 = beliefBaseException62.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException65 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str66 = beliefBaseException65.toString();
        beliefBaseException62.addSuppressed((java.lang.Throwable) beliefBaseException65);
        beliefBaseException60.addSuppressed((java.lang.Throwable) beliefBaseException65);
        beliefBaseException58.addSuppressed((java.lang.Throwable) beliefBaseException60);
        beliefBaseException39.addSuppressed((java.lang.Throwable) beliefBaseException58);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException71 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException58);
        beliefBaseException34.addSuppressed((java.lang.Throwable) beliefBaseException71);
        java.lang.String str73 = beliefBaseException71.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException74 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException71);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException75 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException71);
        java.lang.Throwable[] throwable_array76 = beliefBaseException75.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException81 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str82 = beliefBaseException81.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException84 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str85 = beliefBaseException84.toString();
        beliefBaseException81.addSuppressed((java.lang.Throwable) beliefBaseException84);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException87 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException81);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException88 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException87);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException89 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException88);
        beliefBaseException75.addSuppressed((java.lang.Throwable) beliefBaseException88);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str8.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str11.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array15);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str22.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str25.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str33.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str44.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str47.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array51);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str56.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str63.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str66.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str73.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array76);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str82.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str85.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test19");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str12 = beliefBaseException11.toString();
        beliefBaseException8.addSuppressed((java.lang.Throwable) beliefBaseException11);
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException11);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException11);
        java.lang.Throwable[] throwable_array16 = beliefBaseException4.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException17 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException4);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException17);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str25 = beliefBaseException24.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException27 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str28 = beliefBaseException27.toString();
        beliefBaseException24.addSuppressed((java.lang.Throwable) beliefBaseException27);
        beliefBaseException22.addSuppressed((java.lang.Throwable) beliefBaseException27);
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException27);
        java.lang.Throwable[] throwable_array32 = beliefBaseException20.getSuppressed();
        java.lang.String str33 = beliefBaseException20.toString();
        java.lang.Throwable[] throwable_array34 = beliefBaseException20.getSuppressed();
        beliefBaseException17.addSuppressed((java.lang.Throwable) beliefBaseException20);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException36 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException17);
        java.lang.Throwable[] throwable_array37 = beliefBaseException36.getSuppressed();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array16);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str25.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str28.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str33.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array34);
        org.junit.Assert.assertNotNull(throwable_array37);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test20");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException1 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ");
        java.lang.String str2 = beliefBaseException1.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str12 = beliefBaseException11.toString();
        beliefBaseException8.addSuppressed((java.lang.Throwable) beliefBaseException11);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException14 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException8);
        java.lang.String str15 = beliefBaseException14.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException14);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str23 = beliefBaseException22.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException25 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str26 = beliefBaseException25.toString();
        beliefBaseException22.addSuppressed((java.lang.Throwable) beliefBaseException25);
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException25);
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException25);
        java.lang.Throwable[] throwable_array30 = beliefBaseException18.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException32 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException32);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException35 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException37 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str38 = beliefBaseException37.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException40 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str41 = beliefBaseException40.toString();
        beliefBaseException37.addSuppressed((java.lang.Throwable) beliefBaseException40);
        beliefBaseException35.addSuppressed((java.lang.Throwable) beliefBaseException40);
        beliefBaseException32.addSuppressed((java.lang.Throwable) beliefBaseException40);
        beliefBaseException16.addSuppressed((java.lang.Throwable) beliefBaseException40);
        java.lang.Throwable[] throwable_array46 = beliefBaseException40.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException49 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str50 = beliefBaseException49.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException51 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException49);
        beliefBaseException40.addSuppressed((java.lang.Throwable) beliefBaseException49);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException53 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException49);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException56 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("");
        java.lang.String str57 = beliefBaseException56.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException58 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException56);
        beliefBaseException49.addSuppressed((java.lang.Throwable) beliefBaseException56);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException63 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str64 = beliefBaseException63.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException66 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str67 = beliefBaseException66.toString();
        beliefBaseException63.addSuppressed((java.lang.Throwable) beliefBaseException66);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException69 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException63);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException70 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException69);
        java.lang.String str71 = beliefBaseException70.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException73 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException75 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException77 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str78 = beliefBaseException77.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException80 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str81 = beliefBaseException80.toString();
        beliefBaseException77.addSuppressed((java.lang.Throwable) beliefBaseException80);
        beliefBaseException75.addSuppressed((java.lang.Throwable) beliefBaseException80);
        beliefBaseException73.addSuppressed((java.lang.Throwable) beliefBaseException80);
        java.lang.Throwable[] throwable_array85 = beliefBaseException73.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException87 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException73.addSuppressed((java.lang.Throwable) beliefBaseException87);
        java.lang.Throwable[] throwable_array89 = beliefBaseException73.getSuppressed();
        beliefBaseException70.addSuppressed((java.lang.Throwable) beliefBaseException73);
        java.lang.Throwable[] throwable_array91 = beliefBaseException70.getSuppressed();
        beliefBaseException56.addSuppressed((java.lang.Throwable) beliefBaseException70);
        java.lang.Throwable[] throwable_array93 = beliefBaseException70.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException94 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException70);
        java.lang.Throwable[] throwable_array95 = beliefBaseException70.getSuppressed();
        beliefBaseException1.addSuppressed((java.lang.Throwable) beliefBaseException70);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str2.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str15.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str23.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str26.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array30);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str38.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str41.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array46);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str50.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str57.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str64.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str67.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str71.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str78.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str81.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array85);
        org.junit.Assert.assertNotNull(throwable_array89);
        org.junit.Assert.assertNotNull(throwable_array91);
        org.junit.Assert.assertNotNull(throwable_array93);
        org.junit.Assert.assertNotNull(throwable_array95);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test21");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str4 = beliefBaseException3.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException6);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException3);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException9);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException14 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException15 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException14);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException14);
        java.lang.Throwable[] throwable_array17 = beliefBaseException16.getSuppressed();
        beliefBaseException9.addSuppressed((java.lang.Throwable) beliefBaseException16);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array17);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test22");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str4 = beliefBaseException3.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException3);
        java.lang.Throwable[] throwable_array6 = beliefBaseException5.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str10 = beliefBaseException9.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str13 = beliefBaseException12.toString();
        beliefBaseException9.addSuppressed((java.lang.Throwable) beliefBaseException12);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException15 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException9);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str23 = beliefBaseException22.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException25 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str26 = beliefBaseException25.toString();
        beliefBaseException22.addSuppressed((java.lang.Throwable) beliefBaseException25);
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException25);
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException25);
        java.lang.Throwable[] throwable_array30 = beliefBaseException18.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException31 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException18);
        beliefBaseException9.addSuppressed((java.lang.Throwable) beliefBaseException18);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException35 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str36 = beliefBaseException35.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException38 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str39 = beliefBaseException38.toString();
        beliefBaseException35.addSuppressed((java.lang.Throwable) beliefBaseException38);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException41 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException35);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException44 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException46 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException48 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str49 = beliefBaseException48.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException51 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str52 = beliefBaseException51.toString();
        beliefBaseException48.addSuppressed((java.lang.Throwable) beliefBaseException51);
        beliefBaseException46.addSuppressed((java.lang.Throwable) beliefBaseException51);
        beliefBaseException44.addSuppressed((java.lang.Throwable) beliefBaseException51);
        java.lang.Throwable[] throwable_array56 = beliefBaseException44.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException57 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException44);
        beliefBaseException35.addSuppressed((java.lang.Throwable) beliefBaseException44);
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException44);
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException44);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException61 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException5);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException63 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException65 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str66 = beliefBaseException65.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException68 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str69 = beliefBaseException68.toString();
        beliefBaseException65.addSuppressed((java.lang.Throwable) beliefBaseException68);
        beliefBaseException63.addSuppressed((java.lang.Throwable) beliefBaseException68);
        java.lang.String str72 = beliefBaseException63.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException75 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.Throwable[] throwable_array76 = beliefBaseException75.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException77 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException75);
        beliefBaseException63.addSuppressed((java.lang.Throwable) beliefBaseException75);
        beliefBaseException61.addSuppressed((java.lang.Throwable) beliefBaseException75);
        java.lang.Throwable[] throwable_array80 = beliefBaseException61.getSuppressed();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str13.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str23.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str26.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array30);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str36.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str39.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str49.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str52.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array56);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str66.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str69.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str72.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array76);
        org.junit.Assert.assertNotNull(throwable_array80);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test23");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException1 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str6 = beliefBaseException5.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException8);
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException8);
        beliefBaseException1.addSuppressed((java.lang.Throwable) beliefBaseException8);
        java.lang.Throwable[] throwable_array13 = beliefBaseException1.getSuppressed();
        java.lang.String str14 = beliefBaseException1.toString();
        java.lang.Throwable[] throwable_array15 = beliefBaseException1.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str21 = beliefBaseException20.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str24 = beliefBaseException23.toString();
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException23);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException26 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException20);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException27 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException26);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException27);
        beliefBaseException1.addSuppressed((java.lang.Throwable) beliefBaseException28);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException32 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str33 = beliefBaseException32.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException35 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str36 = beliefBaseException35.toString();
        beliefBaseException32.addSuppressed((java.lang.Throwable) beliefBaseException35);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException38 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException32);
        java.lang.Throwable[] throwable_array39 = beliefBaseException38.getSuppressed();
        java.lang.Throwable[] throwable_array40 = beliefBaseException38.getSuppressed();
        beliefBaseException1.addSuppressed((java.lang.Throwable) beliefBaseException38);
        java.lang.Throwable[] throwable_array42 = beliefBaseException38.getSuppressed();
        java.lang.String str43 = beliefBaseException38.toString();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str6.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str14.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array15);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str21.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str24.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str33.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str36.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array39);
        org.junit.Assert.assertNotNull(throwable_array40);
        org.junit.Assert.assertNotNull(throwable_array42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str43.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test24");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException1 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("");
        java.lang.Throwable[] throwable_array2 = beliefBaseException1.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str11 = beliefBaseException10.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException13 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str14 = beliefBaseException13.toString();
        beliefBaseException10.addSuppressed((java.lang.Throwable) beliefBaseException13);
        beliefBaseException8.addSuppressed((java.lang.Throwable) beliefBaseException13);
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException13);
        java.lang.Throwable[] throwable_array18 = beliefBaseException6.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException20);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException25 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str26 = beliefBaseException25.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str29 = beliefBaseException28.toString();
        beliefBaseException25.addSuppressed((java.lang.Throwable) beliefBaseException28);
        beliefBaseException23.addSuppressed((java.lang.Throwable) beliefBaseException28);
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException28);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException33 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException28);
        java.lang.Throwable[] throwable_array34 = beliefBaseException28.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException40 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str41 = beliefBaseException40.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException43 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str44 = beliefBaseException43.toString();
        beliefBaseException40.addSuppressed((java.lang.Throwable) beliefBaseException43);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException46 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException40);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException47 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException46);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException48 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException47);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException49 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException47);
        beliefBaseException28.addSuppressed((java.lang.Throwable) beliefBaseException49);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException51 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException49);
        java.lang.Throwable[] throwable_array52 = beliefBaseException49.getSuppressed();
        beliefBaseException1.addSuppressed((java.lang.Throwable) beliefBaseException49);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException58 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException60 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException62 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str63 = beliefBaseException62.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException65 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str66 = beliefBaseException65.toString();
        beliefBaseException62.addSuppressed((java.lang.Throwable) beliefBaseException65);
        beliefBaseException60.addSuppressed((java.lang.Throwable) beliefBaseException65);
        beliefBaseException58.addSuppressed((java.lang.Throwable) beliefBaseException65);
        java.lang.Throwable[] throwable_array70 = beliefBaseException58.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException71 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException58);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException72 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException58);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException73 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException58);
        beliefBaseException49.addSuppressed((java.lang.Throwable) beliefBaseException58);
        org.junit.Assert.assertNotNull(throwable_array2);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str11.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str14.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array18);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str26.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str29.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array34);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str41.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str44.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array52);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str63.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str66.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array70);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test25");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str5 = beliefBaseException4.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str8 = beliefBaseException7.toString();
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException7);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException4);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException10);
        java.lang.String str12 = beliefBaseException11.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException14 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str19 = beliefBaseException18.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str22 = beliefBaseException21.toString();
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException21);
        beliefBaseException16.addSuppressed((java.lang.Throwable) beliefBaseException21);
        beliefBaseException14.addSuppressed((java.lang.Throwable) beliefBaseException21);
        java.lang.Throwable[] throwable_array26 = beliefBaseException14.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException14.addSuppressed((java.lang.Throwable) beliefBaseException28);
        java.lang.Throwable[] throwable_array30 = beliefBaseException14.getSuppressed();
        beliefBaseException11.addSuppressed((java.lang.Throwable) beliefBaseException14);
        java.lang.String str32 = beliefBaseException11.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException33 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException11);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str5.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str8.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str19.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str22.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array26);
        org.junit.Assert.assertNotNull(throwable_array30);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str32.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test26");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str6 = beliefBaseException5.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException8);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException5);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException11);
        java.lang.Throwable[] throwable_array13 = beliefBaseException12.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException14 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException12);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str24 = beliefBaseException23.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException26 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str27 = beliefBaseException26.toString();
        beliefBaseException23.addSuppressed((java.lang.Throwable) beliefBaseException26);
        beliefBaseException21.addSuppressed((java.lang.Throwable) beliefBaseException26);
        beliefBaseException19.addSuppressed((java.lang.Throwable) beliefBaseException26);
        java.lang.Throwable[] throwable_array31 = beliefBaseException19.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException32 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException19);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException33 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException32);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException35 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException37 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException39 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str40 = beliefBaseException39.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException42 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str43 = beliefBaseException42.toString();
        beliefBaseException39.addSuppressed((java.lang.Throwable) beliefBaseException42);
        beliefBaseException37.addSuppressed((java.lang.Throwable) beliefBaseException42);
        beliefBaseException35.addSuppressed((java.lang.Throwable) beliefBaseException42);
        java.lang.Throwable[] throwable_array47 = beliefBaseException35.getSuppressed();
        java.lang.String str48 = beliefBaseException35.toString();
        java.lang.Throwable[] throwable_array49 = beliefBaseException35.getSuppressed();
        beliefBaseException32.addSuppressed((java.lang.Throwable) beliefBaseException35);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException51 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException32);
        beliefBaseException14.addSuppressed((java.lang.Throwable) beliefBaseException32);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException53 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException14);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str6.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array13);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str24.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str27.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array31);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str40.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str43.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str48.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array49);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test27");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str10 = beliefBaseException9.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str13 = beliefBaseException12.toString();
        beliefBaseException9.addSuppressed((java.lang.Throwable) beliefBaseException12);
        beliefBaseException7.addSuppressed((java.lang.Throwable) beliefBaseException12);
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException12);
        java.lang.Throwable[] throwable_array17 = beliefBaseException5.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException5);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException5);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException5);
        java.lang.String str21 = beliefBaseException5.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException5);
        java.lang.String str23 = beliefBaseException22.toString();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str13.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array17);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str21.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str23.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test28");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str12 = beliefBaseException11.toString();
        beliefBaseException8.addSuppressed((java.lang.Throwable) beliefBaseException11);
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException11);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException11);
        java.lang.Throwable[] throwable_array16 = beliefBaseException4.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException18);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException4);
        java.lang.String str21 = beliefBaseException4.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException4);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException4);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException27 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException29 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException31 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str32 = beliefBaseException31.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException34 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str35 = beliefBaseException34.toString();
        beliefBaseException31.addSuppressed((java.lang.Throwable) beliefBaseException34);
        beliefBaseException29.addSuppressed((java.lang.Throwable) beliefBaseException34);
        beliefBaseException27.addSuppressed((java.lang.Throwable) beliefBaseException34);
        java.lang.Throwable[] throwable_array39 = beliefBaseException27.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException41 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException27.addSuppressed((java.lang.Throwable) beliefBaseException41);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException44 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException46 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str47 = beliefBaseException46.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException49 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str50 = beliefBaseException49.toString();
        beliefBaseException46.addSuppressed((java.lang.Throwable) beliefBaseException49);
        beliefBaseException44.addSuppressed((java.lang.Throwable) beliefBaseException49);
        beliefBaseException41.addSuppressed((java.lang.Throwable) beliefBaseException49);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException54 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException49);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException55 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException49);
        beliefBaseException23.addSuppressed((java.lang.Throwable) beliefBaseException49);
        java.lang.String str57 = beliefBaseException23.toString();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array16);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str21.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str32.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str35.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array39);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str47.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str50.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str57.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test29");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str10 = beliefBaseException9.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str13 = beliefBaseException12.toString();
        beliefBaseException9.addSuppressed((java.lang.Throwable) beliefBaseException12);
        beliefBaseException7.addSuppressed((java.lang.Throwable) beliefBaseException12);
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException12);
        java.lang.Throwable[] throwable_array17 = beliefBaseException5.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException19);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException5);
        java.lang.String str22 = beliefBaseException5.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException5);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException5);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException25 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException24);
        java.lang.String str26 = beliefBaseException25.toString();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str13.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array17);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str22.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str26.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test30");
        java.lang.Exception exception1 = null;
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException2 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", exception1);
        java.lang.Throwable[] throwable_array3 = beliefBaseException2.getSuppressed();
        java.lang.String str4 = beliefBaseException2.toString();
        org.junit.Assert.assertNotNull(throwable_array3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test31");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str6 = beliefBaseException5.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException8);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException5);
        java.lang.String str12 = beliefBaseException11.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException13 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException11);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException15 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException17 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str20 = beliefBaseException19.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str23 = beliefBaseException22.toString();
        beliefBaseException19.addSuppressed((java.lang.Throwable) beliefBaseException22);
        beliefBaseException17.addSuppressed((java.lang.Throwable) beliefBaseException22);
        beliefBaseException15.addSuppressed((java.lang.Throwable) beliefBaseException22);
        java.lang.Throwable[] throwable_array27 = beliefBaseException15.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException29 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException15.addSuppressed((java.lang.Throwable) beliefBaseException29);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException32 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException34 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str35 = beliefBaseException34.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException37 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str38 = beliefBaseException37.toString();
        beliefBaseException34.addSuppressed((java.lang.Throwable) beliefBaseException37);
        beliefBaseException32.addSuppressed((java.lang.Throwable) beliefBaseException37);
        beliefBaseException29.addSuppressed((java.lang.Throwable) beliefBaseException37);
        beliefBaseException13.addSuppressed((java.lang.Throwable) beliefBaseException37);
        java.lang.Throwable[] throwable_array43 = beliefBaseException37.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException46 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str47 = beliefBaseException46.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException48 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException46);
        beliefBaseException37.addSuppressed((java.lang.Throwable) beliefBaseException46);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException50 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException46);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException51 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException46);
        java.lang.String str52 = beliefBaseException46.toString();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str6.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str20.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str23.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array27);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str35.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str38.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array43);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str47.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str52.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test32");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str4 = beliefBaseException3.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException6);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException3);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str13 = beliefBaseException12.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException15 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str16 = beliefBaseException15.toString();
        beliefBaseException12.addSuppressed((java.lang.Throwable) beliefBaseException15);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException12);
        beliefBaseException9.addSuppressed((java.lang.Throwable) beliefBaseException18);
        java.lang.Throwable[] throwable_array20 = beliefBaseException9.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException9);
        java.lang.String str22 = beliefBaseException21.toString();
        java.lang.Throwable[] throwable_array23 = beliefBaseException21.getSuppressed();
        java.lang.String str24 = beliefBaseException21.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str13.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str16.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str22.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertNotNull(throwable_array23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str24.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test33");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str11 = beliefBaseException10.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException13 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str14 = beliefBaseException13.toString();
        beliefBaseException10.addSuppressed((java.lang.Throwable) beliefBaseException13);
        beliefBaseException8.addSuppressed((java.lang.Throwable) beliefBaseException13);
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException13);
        java.lang.Throwable[] throwable_array18 = beliefBaseException6.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException6);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str23 = beliefBaseException22.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException25 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str26 = beliefBaseException25.toString();
        beliefBaseException22.addSuppressed((java.lang.Throwable) beliefBaseException25);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException22);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException31 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException33 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException35 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str36 = beliefBaseException35.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException38 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str39 = beliefBaseException38.toString();
        beliefBaseException35.addSuppressed((java.lang.Throwable) beliefBaseException38);
        beliefBaseException33.addSuppressed((java.lang.Throwable) beliefBaseException38);
        beliefBaseException31.addSuppressed((java.lang.Throwable) beliefBaseException38);
        java.lang.Throwable[] throwable_array43 = beliefBaseException31.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException44 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException31);
        beliefBaseException22.addSuppressed((java.lang.Throwable) beliefBaseException31);
        beliefBaseException19.addSuppressed((java.lang.Throwable) beliefBaseException22);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException47 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException19);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException48 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException47);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException52 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str53 = beliefBaseException52.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException55 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str56 = beliefBaseException55.toString();
        beliefBaseException52.addSuppressed((java.lang.Throwable) beliefBaseException55);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException58 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException52);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException59 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException58);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException61 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException63 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException65 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str66 = beliefBaseException65.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException68 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str69 = beliefBaseException68.toString();
        beliefBaseException65.addSuppressed((java.lang.Throwable) beliefBaseException68);
        beliefBaseException63.addSuppressed((java.lang.Throwable) beliefBaseException68);
        beliefBaseException61.addSuppressed((java.lang.Throwable) beliefBaseException68);
        java.lang.Throwable[] throwable_array73 = beliefBaseException61.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException75 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException61.addSuppressed((java.lang.Throwable) beliefBaseException75);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException78 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException80 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str81 = beliefBaseException80.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException83 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str84 = beliefBaseException83.toString();
        beliefBaseException80.addSuppressed((java.lang.Throwable) beliefBaseException83);
        beliefBaseException78.addSuppressed((java.lang.Throwable) beliefBaseException83);
        beliefBaseException75.addSuppressed((java.lang.Throwable) beliefBaseException83);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException89 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str90 = beliefBaseException89.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException92 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str93 = beliefBaseException92.toString();
        beliefBaseException89.addSuppressed((java.lang.Throwable) beliefBaseException92);
        beliefBaseException75.addSuppressed((java.lang.Throwable) beliefBaseException89);
        beliefBaseException58.addSuppressed((java.lang.Throwable) beliefBaseException89);
        beliefBaseException48.addSuppressed((java.lang.Throwable) beliefBaseException58);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException98 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException48);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException99 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException98);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str11.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str14.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array18);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str23.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str26.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str36.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str39.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array43);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str53.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str56.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str66.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str69.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array73);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str81.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str84.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str90.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str93.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test34");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException2 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str10 = beliefBaseException9.toString();
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException9);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException9);
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException9);
        java.lang.Throwable[] throwable_array14 = beliefBaseException2.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str21 = beliefBaseException20.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str24 = beliefBaseException23.toString();
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException23);
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException23);
        beliefBaseException16.addSuppressed((java.lang.Throwable) beliefBaseException23);
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException16);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException31 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("");
        java.lang.String str32 = beliefBaseException31.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException33 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException31);
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException33);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException38 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException40 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException42 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str43 = beliefBaseException42.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException45 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str46 = beliefBaseException45.toString();
        beliefBaseException42.addSuppressed((java.lang.Throwable) beliefBaseException45);
        beliefBaseException40.addSuppressed((java.lang.Throwable) beliefBaseException45);
        beliefBaseException38.addSuppressed((java.lang.Throwable) beliefBaseException45);
        java.lang.Throwable[] throwable_array50 = beliefBaseException38.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException52 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException38.addSuppressed((java.lang.Throwable) beliefBaseException52);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException54 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException38);
        java.lang.String str55 = beliefBaseException38.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException57 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException59 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException61 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str62 = beliefBaseException61.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException64 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str65 = beliefBaseException64.toString();
        beliefBaseException61.addSuppressed((java.lang.Throwable) beliefBaseException64);
        beliefBaseException59.addSuppressed((java.lang.Throwable) beliefBaseException64);
        beliefBaseException57.addSuppressed((java.lang.Throwable) beliefBaseException59);
        beliefBaseException38.addSuppressed((java.lang.Throwable) beliefBaseException57);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException70 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException57);
        beliefBaseException33.addSuppressed((java.lang.Throwable) beliefBaseException70);
        java.lang.String str72 = beliefBaseException70.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException73 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException70);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array14);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str21.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str24.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str32.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str43.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str46.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array50);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str55.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str62.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str65.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str72.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test35");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException2 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str10 = beliefBaseException9.toString();
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException9);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException9);
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException9);
        java.lang.Throwable[] throwable_array14 = beliefBaseException2.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException15 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException2);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("");
        java.lang.String str19 = beliefBaseException18.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException25 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str26 = beliefBaseException25.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str29 = beliefBaseException28.toString();
        beliefBaseException25.addSuppressed((java.lang.Throwable) beliefBaseException28);
        beliefBaseException23.addSuppressed((java.lang.Throwable) beliefBaseException28);
        beliefBaseException21.addSuppressed((java.lang.Throwable) beliefBaseException28);
        java.lang.Throwable[] throwable_array33 = beliefBaseException21.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException35 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException21.addSuppressed((java.lang.Throwable) beliefBaseException35);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException38 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException40 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str41 = beliefBaseException40.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException43 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str44 = beliefBaseException43.toString();
        beliefBaseException40.addSuppressed((java.lang.Throwable) beliefBaseException43);
        beliefBaseException38.addSuppressed((java.lang.Throwable) beliefBaseException43);
        beliefBaseException35.addSuppressed((java.lang.Throwable) beliefBaseException43);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException49 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str50 = beliefBaseException49.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException52 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str53 = beliefBaseException52.toString();
        beliefBaseException49.addSuppressed((java.lang.Throwable) beliefBaseException52);
        beliefBaseException35.addSuppressed((java.lang.Throwable) beliefBaseException49);
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException35);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException57 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException35);
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException57);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException60 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.Throwable[] throwable_array61 = beliefBaseException60.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException64 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException66 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException68 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str69 = beliefBaseException68.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException71 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str72 = beliefBaseException71.toString();
        beliefBaseException68.addSuppressed((java.lang.Throwable) beliefBaseException71);
        beliefBaseException66.addSuppressed((java.lang.Throwable) beliefBaseException71);
        beliefBaseException64.addSuppressed((java.lang.Throwable) beliefBaseException71);
        java.lang.Throwable[] throwable_array76 = beliefBaseException64.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException77 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException64);
        java.lang.String str78 = beliefBaseException77.toString();
        beliefBaseException60.addSuppressed((java.lang.Throwable) beliefBaseException77);
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException60);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array14);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str19.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str26.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str29.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array33);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str41.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str44.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str50.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str53.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array61);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str69.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str72.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array76);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str78.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test36");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str10 = beliefBaseException9.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str13 = beliefBaseException12.toString();
        beliefBaseException9.addSuppressed((java.lang.Throwable) beliefBaseException12);
        beliefBaseException7.addSuppressed((java.lang.Throwable) beliefBaseException12);
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException12);
        java.lang.Throwable[] throwable_array17 = beliefBaseException5.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException5);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException18);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException25 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str26 = beliefBaseException25.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str29 = beliefBaseException28.toString();
        beliefBaseException25.addSuppressed((java.lang.Throwable) beliefBaseException28);
        beliefBaseException23.addSuppressed((java.lang.Throwable) beliefBaseException28);
        beliefBaseException21.addSuppressed((java.lang.Throwable) beliefBaseException28);
        java.lang.Throwable[] throwable_array33 = beliefBaseException21.getSuppressed();
        java.lang.String str34 = beliefBaseException21.toString();
        java.lang.Throwable[] throwable_array35 = beliefBaseException21.getSuppressed();
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException21);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException37 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException18);
        java.lang.Throwable[] throwable_array38 = beliefBaseException18.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException39 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException18);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException43 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException45 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException47 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str48 = beliefBaseException47.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException50 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str51 = beliefBaseException50.toString();
        beliefBaseException47.addSuppressed((java.lang.Throwable) beliefBaseException50);
        beliefBaseException45.addSuppressed((java.lang.Throwable) beliefBaseException50);
        beliefBaseException43.addSuppressed((java.lang.Throwable) beliefBaseException50);
        java.lang.Throwable[] throwable_array55 = beliefBaseException43.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException56 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException43);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException57 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException56);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException61 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str62 = beliefBaseException61.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException64 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str65 = beliefBaseException64.toString();
        beliefBaseException61.addSuppressed((java.lang.Throwable) beliefBaseException64);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException67 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException61);
        java.lang.String str68 = beliefBaseException67.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException69 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException67);
        java.lang.String str70 = beliefBaseException67.toString();
        beliefBaseException56.addSuppressed((java.lang.Throwable) beliefBaseException67);
        java.lang.Throwable[] throwable_array72 = beliefBaseException67.getSuppressed();
        java.lang.String str73 = beliefBaseException67.toString();
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException67);
        java.lang.Throwable[] throwable_array75 = beliefBaseException67.getSuppressed();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str13.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array17);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str26.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str29.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str34.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array35);
        org.junit.Assert.assertNotNull(throwable_array38);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str48.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str51.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array55);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str62.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str65.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str68.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str70.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array72);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str73.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array75);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test37");
        java.lang.Exception exception4 = null;
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", exception4);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException5);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException5);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException5);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str12 = beliefBaseException11.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException14 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str15 = beliefBaseException14.toString();
        beliefBaseException11.addSuppressed((java.lang.Throwable) beliefBaseException14);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException17 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException11);
        java.lang.String str18 = beliefBaseException17.toString();
        java.lang.Throwable[] throwable_array19 = beliefBaseException17.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str24 = beliefBaseException23.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException26 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str27 = beliefBaseException26.toString();
        beliefBaseException23.addSuppressed((java.lang.Throwable) beliefBaseException26);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException29 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException23);
        java.lang.String str30 = beliefBaseException29.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException31 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException29);
        beliefBaseException17.addSuppressed((java.lang.Throwable) beliefBaseException29);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException36 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException38 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException40 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str41 = beliefBaseException40.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException43 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str44 = beliefBaseException43.toString();
        beliefBaseException40.addSuppressed((java.lang.Throwable) beliefBaseException43);
        beliefBaseException38.addSuppressed((java.lang.Throwable) beliefBaseException43);
        beliefBaseException36.addSuppressed((java.lang.Throwable) beliefBaseException43);
        java.lang.Throwable[] throwable_array48 = beliefBaseException36.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException49 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException36);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException50 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException36);
        beliefBaseException29.addSuppressed((java.lang.Throwable) beliefBaseException50);
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException29);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str15.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str18.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array19);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str24.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str27.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str30.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str41.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str44.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array48);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test38");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str4 = beliefBaseException3.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException3);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str11 = beliefBaseException10.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException13 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str14 = beliefBaseException13.toString();
        beliefBaseException10.addSuppressed((java.lang.Throwable) beliefBaseException13);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException10);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str20 = beliefBaseException19.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str23 = beliefBaseException22.toString();
        beliefBaseException19.addSuppressed((java.lang.Throwable) beliefBaseException22);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException25 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException19);
        beliefBaseException16.addSuppressed((java.lang.Throwable) beliefBaseException25);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException27 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException25);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException27);
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException28);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException30 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException28);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException34 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException36 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException38 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str39 = beliefBaseException38.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException41 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str42 = beliefBaseException41.toString();
        beliefBaseException38.addSuppressed((java.lang.Throwable) beliefBaseException41);
        beliefBaseException36.addSuppressed((java.lang.Throwable) beliefBaseException41);
        beliefBaseException34.addSuppressed((java.lang.Throwable) beliefBaseException41);
        java.lang.Throwable[] throwable_array46 = beliefBaseException34.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException47 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException34);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException48 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException34);
        beliefBaseException30.addSuppressed((java.lang.Throwable) beliefBaseException48);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str11.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str14.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str20.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str23.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str39.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str42.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array46);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test39");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str12 = beliefBaseException11.toString();
        beliefBaseException8.addSuppressed((java.lang.Throwable) beliefBaseException11);
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException11);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException11);
        java.lang.Throwable[] throwable_array16 = beliefBaseException4.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException18);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException4);
        java.lang.String str21 = beliefBaseException4.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException25 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException27 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str28 = beliefBaseException27.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException30 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str31 = beliefBaseException30.toString();
        beliefBaseException27.addSuppressed((java.lang.Throwable) beliefBaseException30);
        beliefBaseException25.addSuppressed((java.lang.Throwable) beliefBaseException30);
        beliefBaseException23.addSuppressed((java.lang.Throwable) beliefBaseException25);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException23);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException36 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException23);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException37 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException23);
        java.lang.String str38 = beliefBaseException37.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException40 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException42 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str43 = beliefBaseException42.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException45 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str46 = beliefBaseException45.toString();
        beliefBaseException42.addSuppressed((java.lang.Throwable) beliefBaseException45);
        beliefBaseException40.addSuppressed((java.lang.Throwable) beliefBaseException45);
        java.lang.String str49 = beliefBaseException40.toString();
        beliefBaseException37.addSuppressed((java.lang.Throwable) beliefBaseException40);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException55 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException57 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException59 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str60 = beliefBaseException59.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException62 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str63 = beliefBaseException62.toString();
        beliefBaseException59.addSuppressed((java.lang.Throwable) beliefBaseException62);
        beliefBaseException57.addSuppressed((java.lang.Throwable) beliefBaseException62);
        beliefBaseException55.addSuppressed((java.lang.Throwable) beliefBaseException62);
        java.lang.Throwable[] throwable_array67 = beliefBaseException55.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException68 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException55);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException71 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str72 = beliefBaseException71.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException74 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str75 = beliefBaseException74.toString();
        beliefBaseException71.addSuppressed((java.lang.Throwable) beliefBaseException74);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException77 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException71);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException80 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException82 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException84 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str85 = beliefBaseException84.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException87 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str88 = beliefBaseException87.toString();
        beliefBaseException84.addSuppressed((java.lang.Throwable) beliefBaseException87);
        beliefBaseException82.addSuppressed((java.lang.Throwable) beliefBaseException87);
        beliefBaseException80.addSuppressed((java.lang.Throwable) beliefBaseException87);
        java.lang.Throwable[] throwable_array92 = beliefBaseException80.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException93 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException80);
        beliefBaseException71.addSuppressed((java.lang.Throwable) beliefBaseException80);
        beliefBaseException68.addSuppressed((java.lang.Throwable) beliefBaseException71);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException96 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException68);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException97 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException96);
        beliefBaseException40.addSuppressed((java.lang.Throwable) beliefBaseException97);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array16);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str21.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str28.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str31.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str38.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str43.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str46.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str49.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str60.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str63.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array67);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str72.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str75.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str85.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str88 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str88.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array92);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test40");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str6 = beliefBaseException5.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException8);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException5);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException11);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException14 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str19 = beliefBaseException18.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str22 = beliefBaseException21.toString();
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException21);
        beliefBaseException16.addSuppressed((java.lang.Throwable) beliefBaseException21);
        beliefBaseException14.addSuppressed((java.lang.Throwable) beliefBaseException21);
        java.lang.Throwable[] throwable_array26 = beliefBaseException14.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException14.addSuppressed((java.lang.Throwable) beliefBaseException28);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException31 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException33 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str34 = beliefBaseException33.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException36 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str37 = beliefBaseException36.toString();
        beliefBaseException33.addSuppressed((java.lang.Throwable) beliefBaseException36);
        beliefBaseException31.addSuppressed((java.lang.Throwable) beliefBaseException36);
        beliefBaseException28.addSuppressed((java.lang.Throwable) beliefBaseException36);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException42 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str43 = beliefBaseException42.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException45 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str46 = beliefBaseException45.toString();
        beliefBaseException42.addSuppressed((java.lang.Throwable) beliefBaseException45);
        beliefBaseException28.addSuppressed((java.lang.Throwable) beliefBaseException42);
        beliefBaseException11.addSuppressed((java.lang.Throwable) beliefBaseException42);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException50 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException11);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException51 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException11);
        java.lang.String str52 = beliefBaseException51.toString();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str6.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str19.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str22.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array26);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str34.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str37.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str43.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str46.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str52.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test41");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str10 = beliefBaseException9.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str13 = beliefBaseException12.toString();
        beliefBaseException9.addSuppressed((java.lang.Throwable) beliefBaseException12);
        beliefBaseException7.addSuppressed((java.lang.Throwable) beliefBaseException12);
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException12);
        java.lang.Throwable[] throwable_array17 = beliefBaseException5.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException19);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException5);
        java.lang.String str22 = beliefBaseException5.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException26 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str29 = beliefBaseException28.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException31 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str32 = beliefBaseException31.toString();
        beliefBaseException28.addSuppressed((java.lang.Throwable) beliefBaseException31);
        beliefBaseException26.addSuppressed((java.lang.Throwable) beliefBaseException31);
        beliefBaseException24.addSuppressed((java.lang.Throwable) beliefBaseException26);
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException24);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException37 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException24);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException38 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException24);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException39 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException38);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException42 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.Throwable[] throwable_array43 = beliefBaseException42.getSuppressed();
        java.lang.String str44 = beliefBaseException42.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException45 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException42);
        beliefBaseException38.addSuppressed((java.lang.Throwable) beliefBaseException45);
        java.lang.Throwable[] throwable_array47 = beliefBaseException38.getSuppressed();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str13.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array17);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str22.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str29.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str32.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str44.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array47);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test42");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str10 = beliefBaseException9.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str13 = beliefBaseException12.toString();
        beliefBaseException9.addSuppressed((java.lang.Throwable) beliefBaseException12);
        beliefBaseException7.addSuppressed((java.lang.Throwable) beliefBaseException12);
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException12);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException17 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException5);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException17);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException18);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException18);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str13.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test43");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str12 = beliefBaseException11.toString();
        beliefBaseException8.addSuppressed((java.lang.Throwable) beliefBaseException11);
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException11);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException11);
        java.lang.Throwable[] throwable_array16 = beliefBaseException4.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException18);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException4);
        java.lang.String str21 = beliefBaseException4.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException25 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException27 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str28 = beliefBaseException27.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException30 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str31 = beliefBaseException30.toString();
        beliefBaseException27.addSuppressed((java.lang.Throwable) beliefBaseException30);
        beliefBaseException25.addSuppressed((java.lang.Throwable) beliefBaseException30);
        beliefBaseException23.addSuppressed((java.lang.Throwable) beliefBaseException25);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException23);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException36 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException23);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException37 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException23);
        java.lang.Throwable[] throwable_array38 = beliefBaseException23.getSuppressed();
        java.lang.String str39 = beliefBaseException23.toString();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array16);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str21.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str28.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str31.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str39.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test44");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str6 = beliefBaseException5.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException8);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException5);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException11);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException13 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException12);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException14 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException13);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str24 = beliefBaseException23.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException26 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str27 = beliefBaseException26.toString();
        beliefBaseException23.addSuppressed((java.lang.Throwable) beliefBaseException26);
        beliefBaseException21.addSuppressed((java.lang.Throwable) beliefBaseException26);
        beliefBaseException19.addSuppressed((java.lang.Throwable) beliefBaseException26);
        java.lang.Throwable[] throwable_array31 = beliefBaseException19.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException33 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException19.addSuppressed((java.lang.Throwable) beliefBaseException33);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException36 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException38 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str39 = beliefBaseException38.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException41 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str42 = beliefBaseException41.toString();
        beliefBaseException38.addSuppressed((java.lang.Throwable) beliefBaseException41);
        beliefBaseException36.addSuppressed((java.lang.Throwable) beliefBaseException41);
        beliefBaseException33.addSuppressed((java.lang.Throwable) beliefBaseException41);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException46 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException41);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException47 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException41);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException51 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException52 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException51);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException55 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException57 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException59 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str60 = beliefBaseException59.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException62 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str63 = beliefBaseException62.toString();
        beliefBaseException59.addSuppressed((java.lang.Throwable) beliefBaseException62);
        beliefBaseException57.addSuppressed((java.lang.Throwable) beliefBaseException62);
        beliefBaseException55.addSuppressed((java.lang.Throwable) beliefBaseException62);
        java.lang.Throwable[] throwable_array67 = beliefBaseException55.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException68 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException55);
        beliefBaseException51.addSuppressed((java.lang.Throwable) beliefBaseException55);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException70 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException55);
        beliefBaseException41.addSuppressed((java.lang.Throwable) beliefBaseException70);
        java.lang.Throwable[] throwable_array72 = beliefBaseException70.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException73 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException70);
        beliefBaseException13.addSuppressed((java.lang.Throwable) beliefBaseException73);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str6.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str24.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str27.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array31);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str39.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str42.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str60.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str63.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array67);
        org.junit.Assert.assertNotNull(throwable_array72);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test45");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException1 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.String str2 = beliefBaseException1.toString();
        java.lang.String str3 = beliefBaseException1.toString();
        java.lang.Throwable[] throwable_array4 = beliefBaseException1.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str12 = beliefBaseException11.toString();
        beliefBaseException8.addSuppressed((java.lang.Throwable) beliefBaseException11);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException14 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException8);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException15 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException14);
        java.lang.Throwable[] throwable_array16 = beliefBaseException15.getSuppressed();
        beliefBaseException1.addSuppressed((java.lang.Throwable) beliefBaseException15);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str21 = beliefBaseException20.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str24 = beliefBaseException23.toString();
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException23);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException26 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException20);
        java.lang.String str27 = beliefBaseException26.toString();
        beliefBaseException1.addSuppressed((java.lang.Throwable) beliefBaseException26);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException32 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException34 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException36 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str37 = beliefBaseException36.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException39 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str40 = beliefBaseException39.toString();
        beliefBaseException36.addSuppressed((java.lang.Throwable) beliefBaseException39);
        beliefBaseException34.addSuppressed((java.lang.Throwable) beliefBaseException39);
        beliefBaseException32.addSuppressed((java.lang.Throwable) beliefBaseException39);
        java.lang.Throwable[] throwable_array44 = beliefBaseException32.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException45 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException32);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException46 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException45);
        java.lang.Throwable[] throwable_array47 = beliefBaseException46.getSuppressed();
        beliefBaseException1.addSuppressed((java.lang.Throwable) beliefBaseException46);
        java.lang.Throwable[] throwable_array49 = beliefBaseException1.getSuppressed();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str2.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str3.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array4);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array16);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str21.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str24.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str27.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str37.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str40.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array44);
        org.junit.Assert.assertNotNull(throwable_array47);
        org.junit.Assert.assertNotNull(throwable_array49);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test46");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.String str4 = beliefBaseException3.toString();
        java.lang.String str5 = beliefBaseException3.toString();
        java.lang.String str6 = beliefBaseException3.toString();
        java.lang.String str7 = beliefBaseException3.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException3);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException3);
        java.lang.Throwable[] throwable_array10 = beliefBaseException9.getSuppressed();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str5.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str6.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array10);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test47");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str12 = beliefBaseException11.toString();
        beliefBaseException8.addSuppressed((java.lang.Throwable) beliefBaseException11);
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException11);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException11);
        java.lang.Throwable[] throwable_array16 = beliefBaseException4.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException18);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException4);
        java.lang.Throwable[] throwable_array21 = beliefBaseException20.getSuppressed();
        java.lang.Throwable[] throwable_array22 = beliefBaseException20.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException20);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException23);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array16);
        org.junit.Assert.assertNotNull(throwable_array21);
        org.junit.Assert.assertNotNull(throwable_array22);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test48");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException1 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ");
        java.lang.String str2 = beliefBaseException1.toString();
        java.lang.String str3 = beliefBaseException1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str2.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str3.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test49");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str11 = beliefBaseException10.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException13 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str14 = beliefBaseException13.toString();
        beliefBaseException10.addSuppressed((java.lang.Throwable) beliefBaseException13);
        beliefBaseException8.addSuppressed((java.lang.Throwable) beliefBaseException13);
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException13);
        java.lang.Throwable[] throwable_array18 = beliefBaseException6.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException6);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException6);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException6);
        java.lang.String str22 = beliefBaseException6.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException6);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException23);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str11.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str14.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array18);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str22.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test50");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException2 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.Throwable[] throwable_array3 = beliefBaseException2.getSuppressed();
        java.lang.String str4 = beliefBaseException2.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException2);
        java.lang.Throwable[] throwable_array6 = beliefBaseException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwable_array3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array6);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test51");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str6 = beliefBaseException5.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException5);
        java.lang.Throwable[] throwable_array8 = beliefBaseException7.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str12 = beliefBaseException11.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException14 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str15 = beliefBaseException14.toString();
        beliefBaseException11.addSuppressed((java.lang.Throwable) beliefBaseException14);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException17 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException11);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str25 = beliefBaseException24.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException27 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str28 = beliefBaseException27.toString();
        beliefBaseException24.addSuppressed((java.lang.Throwable) beliefBaseException27);
        beliefBaseException22.addSuppressed((java.lang.Throwable) beliefBaseException27);
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException27);
        java.lang.Throwable[] throwable_array32 = beliefBaseException20.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException33 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException20);
        beliefBaseException11.addSuppressed((java.lang.Throwable) beliefBaseException20);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException37 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str38 = beliefBaseException37.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException40 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str41 = beliefBaseException40.toString();
        beliefBaseException37.addSuppressed((java.lang.Throwable) beliefBaseException40);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException43 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException37);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException46 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException48 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException50 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str51 = beliefBaseException50.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException53 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str54 = beliefBaseException53.toString();
        beliefBaseException50.addSuppressed((java.lang.Throwable) beliefBaseException53);
        beliefBaseException48.addSuppressed((java.lang.Throwable) beliefBaseException53);
        beliefBaseException46.addSuppressed((java.lang.Throwable) beliefBaseException53);
        java.lang.Throwable[] throwable_array58 = beliefBaseException46.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException59 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException46);
        beliefBaseException37.addSuppressed((java.lang.Throwable) beliefBaseException46);
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException46);
        beliefBaseException7.addSuppressed((java.lang.Throwable) beliefBaseException46);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException63 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException7);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException65 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException67 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str68 = beliefBaseException67.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException70 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str71 = beliefBaseException70.toString();
        beliefBaseException67.addSuppressed((java.lang.Throwable) beliefBaseException70);
        beliefBaseException65.addSuppressed((java.lang.Throwable) beliefBaseException70);
        java.lang.String str74 = beliefBaseException65.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException77 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.Throwable[] throwable_array78 = beliefBaseException77.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException79 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException77);
        beliefBaseException65.addSuppressed((java.lang.Throwable) beliefBaseException77);
        beliefBaseException63.addSuppressed((java.lang.Throwable) beliefBaseException77);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException82 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException63);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException83 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException82);
        java.lang.String str84 = beliefBaseException82.toString();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str6.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str15.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str25.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str28.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array32);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str38.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str41.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str51.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str54.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array58);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str68.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str71.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str74.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array78);
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str84.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test52");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException2 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str12 = beliefBaseException11.toString();
        beliefBaseException8.addSuppressed((java.lang.Throwable) beliefBaseException11);
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException11);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException11);
        java.lang.Throwable[] throwable_array16 = beliefBaseException4.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException18);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str24 = beliefBaseException23.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException26 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str27 = beliefBaseException26.toString();
        beliefBaseException23.addSuppressed((java.lang.Throwable) beliefBaseException26);
        beliefBaseException21.addSuppressed((java.lang.Throwable) beliefBaseException26);
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException26);
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException18);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException32 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException18);
        java.lang.Throwable[] throwable_array33 = beliefBaseException32.getSuppressed();
        java.lang.String str34 = beliefBaseException32.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException38 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str39 = beliefBaseException38.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException41 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str42 = beliefBaseException41.toString();
        beliefBaseException38.addSuppressed((java.lang.Throwable) beliefBaseException41);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException44 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException38);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException45 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException44);
        java.lang.String str46 = beliefBaseException45.toString();
        beliefBaseException32.addSuppressed((java.lang.Throwable) beliefBaseException45);
        java.lang.Throwable[] throwable_array48 = beliefBaseException32.getSuppressed();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array16);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str24.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str27.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str34.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str39.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str42.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str46.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array48);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test53");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str4 = beliefBaseException3.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException6);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException3);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException9);
        java.lang.String str11 = beliefBaseException10.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str21 = beliefBaseException20.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str24 = beliefBaseException23.toString();
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException23);
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException23);
        beliefBaseException16.addSuppressed((java.lang.Throwable) beliefBaseException23);
        java.lang.Throwable[] throwable_array28 = beliefBaseException16.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException30 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException16.addSuppressed((java.lang.Throwable) beliefBaseException30);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException33 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException35 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str36 = beliefBaseException35.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException38 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str39 = beliefBaseException38.toString();
        beliefBaseException35.addSuppressed((java.lang.Throwable) beliefBaseException38);
        beliefBaseException33.addSuppressed((java.lang.Throwable) beliefBaseException38);
        beliefBaseException30.addSuppressed((java.lang.Throwable) beliefBaseException38);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException43 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException38);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException44 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException38);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException45 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException44);
        beliefBaseException10.addSuppressed((java.lang.Throwable) beliefBaseException44);
        java.lang.String str47 = beliefBaseException44.toString();
        java.lang.Throwable[] throwable_array48 = beliefBaseException44.getSuppressed();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str11.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str21.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str24.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array28);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str36.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str39.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str47.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertNotNull(throwable_array48);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test54");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str8 = beliefBaseException7.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str11 = beliefBaseException10.toString();
        beliefBaseException7.addSuppressed((java.lang.Throwable) beliefBaseException10);
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException10);
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException10);
        java.lang.Throwable[] throwable_array15 = beliefBaseException3.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException3);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException17 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException3);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException20);
        beliefBaseException17.addSuppressed((java.lang.Throwable) beliefBaseException20);
        java.lang.Throwable throwable23 = null;
        try {
            beliefBaseException20.addSuppressed(throwable23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str8.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str11.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array15);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test55");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException2 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str3 = beliefBaseException2.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str6 = beliefBaseException5.toString();
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException5);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException2);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException13 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException15 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str16 = beliefBaseException15.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str19 = beliefBaseException18.toString();
        beliefBaseException15.addSuppressed((java.lang.Throwable) beliefBaseException18);
        beliefBaseException13.addSuppressed((java.lang.Throwable) beliefBaseException18);
        beliefBaseException11.addSuppressed((java.lang.Throwable) beliefBaseException18);
        java.lang.Throwable[] throwable_array23 = beliefBaseException11.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException11);
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException11);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException30 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException32 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str33 = beliefBaseException32.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException35 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str36 = beliefBaseException35.toString();
        beliefBaseException32.addSuppressed((java.lang.Throwable) beliefBaseException35);
        beliefBaseException30.addSuppressed((java.lang.Throwable) beliefBaseException35);
        beliefBaseException28.addSuppressed((java.lang.Throwable) beliefBaseException35);
        java.lang.Throwable[] throwable_array40 = beliefBaseException28.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException41 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException28);
        beliefBaseException11.addSuppressed((java.lang.Throwable) beliefBaseException28);
        java.lang.String str43 = beliefBaseException11.toString();
        java.lang.String str44 = beliefBaseException11.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str3.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str6.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str16.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str19.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array23);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str33.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str36.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array40);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str43.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str44.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test56");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str10 = beliefBaseException9.toString();
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException9);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException6);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException13 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException12);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException14 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException13);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException15 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException14);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str21 = beliefBaseException20.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str24 = beliefBaseException23.toString();
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException23);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException26 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException20);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException27 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException26);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException27);
        beliefBaseException14.addSuppressed((java.lang.Throwable) beliefBaseException27);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException30 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException27);
        java.lang.Throwable[] throwable_array31 = beliefBaseException30.getSuppressed();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str21.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str24.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array31);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test57");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException2 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str10 = beliefBaseException9.toString();
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException9);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException9);
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException9);
        java.lang.Throwable[] throwable_array14 = beliefBaseException2.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException15 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException2);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str19 = beliefBaseException18.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str22 = beliefBaseException21.toString();
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException21);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException18);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException27 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException29 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException31 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str32 = beliefBaseException31.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException34 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str35 = beliefBaseException34.toString();
        beliefBaseException31.addSuppressed((java.lang.Throwable) beliefBaseException34);
        beliefBaseException29.addSuppressed((java.lang.Throwable) beliefBaseException34);
        beliefBaseException27.addSuppressed((java.lang.Throwable) beliefBaseException34);
        java.lang.Throwable[] throwable_array39 = beliefBaseException27.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException40 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException27);
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException27);
        beliefBaseException15.addSuppressed((java.lang.Throwable) beliefBaseException18);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException45 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str46 = beliefBaseException45.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException48 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str49 = beliefBaseException48.toString();
        beliefBaseException45.addSuppressed((java.lang.Throwable) beliefBaseException48);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException51 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException45);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException54 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str55 = beliefBaseException54.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException57 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str58 = beliefBaseException57.toString();
        beliefBaseException54.addSuppressed((java.lang.Throwable) beliefBaseException57);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException60 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException54);
        beliefBaseException51.addSuppressed((java.lang.Throwable) beliefBaseException60);
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException60);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException64 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ");
        java.lang.String str65 = beliefBaseException64.toString();
        java.lang.String str66 = beliefBaseException64.toString();
        beliefBaseException60.addSuppressed((java.lang.Throwable) beliefBaseException64);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException70 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str71 = beliefBaseException70.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException73 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str74 = beliefBaseException73.toString();
        beliefBaseException70.addSuppressed((java.lang.Throwable) beliefBaseException73);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException76 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException70);
        java.lang.String str77 = beliefBaseException76.toString();
        java.lang.Throwable[] throwable_array78 = beliefBaseException76.getSuppressed();
        beliefBaseException60.addSuppressed((java.lang.Throwable) beliefBaseException76);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array14);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str19.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str22.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str32.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str35.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array39);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str46.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str49.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str55.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str58.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str65.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str66.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str71.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str74.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str77.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array78);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test58");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str5 = beliefBaseException4.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str8 = beliefBaseException7.toString();
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException7);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException4);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException13 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException15 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException17 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str18 = beliefBaseException17.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str21 = beliefBaseException20.toString();
        beliefBaseException17.addSuppressed((java.lang.Throwable) beliefBaseException20);
        beliefBaseException15.addSuppressed((java.lang.Throwable) beliefBaseException20);
        beliefBaseException13.addSuppressed((java.lang.Throwable) beliefBaseException20);
        java.lang.Throwable[] throwable_array25 = beliefBaseException13.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException26 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException13);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException13);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException30 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str31 = beliefBaseException30.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException33 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str34 = beliefBaseException33.toString();
        beliefBaseException30.addSuppressed((java.lang.Throwable) beliefBaseException33);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException36 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException30);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException39 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException41 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException43 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str44 = beliefBaseException43.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException46 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str47 = beliefBaseException46.toString();
        beliefBaseException43.addSuppressed((java.lang.Throwable) beliefBaseException46);
        beliefBaseException41.addSuppressed((java.lang.Throwable) beliefBaseException46);
        beliefBaseException39.addSuppressed((java.lang.Throwable) beliefBaseException46);
        java.lang.Throwable[] throwable_array51 = beliefBaseException39.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException52 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException39);
        beliefBaseException30.addSuppressed((java.lang.Throwable) beliefBaseException39);
        beliefBaseException13.addSuppressed((java.lang.Throwable) beliefBaseException39);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException57 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException59 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException61 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str62 = beliefBaseException61.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException64 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str65 = beliefBaseException64.toString();
        beliefBaseException61.addSuppressed((java.lang.Throwable) beliefBaseException64);
        beliefBaseException59.addSuppressed((java.lang.Throwable) beliefBaseException64);
        beliefBaseException57.addSuppressed((java.lang.Throwable) beliefBaseException64);
        java.lang.Throwable[] throwable_array69 = beliefBaseException57.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException71 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException57.addSuppressed((java.lang.Throwable) beliefBaseException71);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException74 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException76 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str77 = beliefBaseException76.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException79 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str80 = beliefBaseException79.toString();
        beliefBaseException76.addSuppressed((java.lang.Throwable) beliefBaseException79);
        beliefBaseException74.addSuppressed((java.lang.Throwable) beliefBaseException79);
        beliefBaseException71.addSuppressed((java.lang.Throwable) beliefBaseException79);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException84 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException79);
        beliefBaseException13.addSuppressed((java.lang.Throwable) beliefBaseException79);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException86 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException13);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException88 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str89 = beliefBaseException88.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException91 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str92 = beliefBaseException91.toString();
        beliefBaseException88.addSuppressed((java.lang.Throwable) beliefBaseException91);
        java.lang.String str94 = beliefBaseException91.toString();
        java.lang.String str95 = beliefBaseException91.toString();
        beliefBaseException13.addSuppressed((java.lang.Throwable) beliefBaseException91);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException97 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException91);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str5.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str8.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str18.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str21.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array25);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str31.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str34.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str44.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str47.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array51);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str62.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str65.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array69);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str77.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str80.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str89.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str92.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str94.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str95.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test59");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException3);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException3);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test60");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException2 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str3 = beliefBaseException2.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException2);
        java.lang.Throwable[] throwable_array5 = beliefBaseException4.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str12 = beliefBaseException11.toString();
        beliefBaseException8.addSuppressed((java.lang.Throwable) beliefBaseException11);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException14 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException8);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException17 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str22 = beliefBaseException21.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str25 = beliefBaseException24.toString();
        beliefBaseException21.addSuppressed((java.lang.Throwable) beliefBaseException24);
        beliefBaseException19.addSuppressed((java.lang.Throwable) beliefBaseException24);
        beliefBaseException17.addSuppressed((java.lang.Throwable) beliefBaseException24);
        java.lang.Throwable[] throwable_array29 = beliefBaseException17.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException30 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException17);
        beliefBaseException8.addSuppressed((java.lang.Throwable) beliefBaseException17);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException34 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str35 = beliefBaseException34.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException37 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str38 = beliefBaseException37.toString();
        beliefBaseException34.addSuppressed((java.lang.Throwable) beliefBaseException37);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException40 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException34);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException43 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException45 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException47 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str48 = beliefBaseException47.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException50 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str51 = beliefBaseException50.toString();
        beliefBaseException47.addSuppressed((java.lang.Throwable) beliefBaseException50);
        beliefBaseException45.addSuppressed((java.lang.Throwable) beliefBaseException50);
        beliefBaseException43.addSuppressed((java.lang.Throwable) beliefBaseException50);
        java.lang.Throwable[] throwable_array55 = beliefBaseException43.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException56 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException43);
        beliefBaseException34.addSuppressed((java.lang.Throwable) beliefBaseException43);
        beliefBaseException17.addSuppressed((java.lang.Throwable) beliefBaseException43);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException43);
        java.lang.String str60 = beliefBaseException4.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException63 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str64 = beliefBaseException63.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException65 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException63);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException67 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.String str68 = beliefBaseException67.toString();
        java.lang.String str69 = beliefBaseException67.toString();
        java.lang.Throwable[] throwable_array70 = beliefBaseException67.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException74 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str75 = beliefBaseException74.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException77 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str78 = beliefBaseException77.toString();
        beliefBaseException74.addSuppressed((java.lang.Throwable) beliefBaseException77);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException80 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException74);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException81 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException80);
        java.lang.Throwable[] throwable_array82 = beliefBaseException81.getSuppressed();
        beliefBaseException67.addSuppressed((java.lang.Throwable) beliefBaseException81);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException86 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str87 = beliefBaseException86.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException89 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str90 = beliefBaseException89.toString();
        beliefBaseException86.addSuppressed((java.lang.Throwable) beliefBaseException89);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException92 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException86);
        java.lang.String str93 = beliefBaseException92.toString();
        beliefBaseException67.addSuppressed((java.lang.Throwable) beliefBaseException92);
        beliefBaseException65.addSuppressed((java.lang.Throwable) beliefBaseException67);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException67);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str3.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array5);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str22.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str25.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array29);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str35.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str38.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str48.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str51.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array55);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str60.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str64.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str68.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str69.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array70);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str75.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str78.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array82);
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str87.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str90.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str93.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test61");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str8 = beliefBaseException7.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str11 = beliefBaseException10.toString();
        beliefBaseException7.addSuppressed((java.lang.Throwable) beliefBaseException10);
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException10);
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException10);
        java.lang.Throwable[] throwable_array15 = beliefBaseException3.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException3);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException17 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException16);
        java.lang.String str18 = beliefBaseException16.toString();
        java.lang.Throwable[] throwable_array19 = beliefBaseException16.getSuppressed();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str8.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str11.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str18.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array19);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test62");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException1 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.String str2 = beliefBaseException1.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str5 = beliefBaseException4.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str8 = beliefBaseException7.toString();
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException7);
        java.lang.String str10 = beliefBaseException7.toString();
        beliefBaseException1.addSuppressed((java.lang.Throwable) beliefBaseException7);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str17 = beliefBaseException16.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str20 = beliefBaseException19.toString();
        beliefBaseException16.addSuppressed((java.lang.Throwable) beliefBaseException19);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException16);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException22);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException23);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException26 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str29 = beliefBaseException28.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException31 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str32 = beliefBaseException31.toString();
        beliefBaseException28.addSuppressed((java.lang.Throwable) beliefBaseException31);
        beliefBaseException26.addSuppressed((java.lang.Throwable) beliefBaseException31);
        beliefBaseException24.addSuppressed((java.lang.Throwable) beliefBaseException26);
        beliefBaseException1.addSuppressed((java.lang.Throwable) beliefBaseException26);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str2.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str5.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str8.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str17.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str20.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str29.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str32.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test63");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str12 = beliefBaseException11.toString();
        beliefBaseException8.addSuppressed((java.lang.Throwable) beliefBaseException11);
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException11);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException11);
        java.lang.Throwable[] throwable_array16 = beliefBaseException4.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException18);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str24 = beliefBaseException23.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException26 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str27 = beliefBaseException26.toString();
        beliefBaseException23.addSuppressed((java.lang.Throwable) beliefBaseException26);
        beliefBaseException21.addSuppressed((java.lang.Throwable) beliefBaseException26);
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException26);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException31 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException26);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException32 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException26);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException36 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException37 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException36);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException40 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException42 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException44 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str45 = beliefBaseException44.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException47 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str48 = beliefBaseException47.toString();
        beliefBaseException44.addSuppressed((java.lang.Throwable) beliefBaseException47);
        beliefBaseException42.addSuppressed((java.lang.Throwable) beliefBaseException47);
        beliefBaseException40.addSuppressed((java.lang.Throwable) beliefBaseException47);
        java.lang.Throwable[] throwable_array52 = beliefBaseException40.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException53 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException40);
        beliefBaseException36.addSuppressed((java.lang.Throwable) beliefBaseException40);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException55 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException40);
        beliefBaseException26.addSuppressed((java.lang.Throwable) beliefBaseException55);
        java.lang.Throwable[] throwable_array57 = beliefBaseException55.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException58 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException55);
        java.lang.String str59 = beliefBaseException58.toString();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array16);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str24.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str27.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str45.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str48.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array52);
        org.junit.Assert.assertNotNull(throwable_array57);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str59.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test64");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException1 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.String str2 = beliefBaseException1.toString();
        java.lang.String str3 = beliefBaseException1.toString();
        java.lang.String str4 = beliefBaseException1.toString();
        java.lang.String str5 = beliefBaseException1.toString();
        java.lang.Throwable throwable6 = null;
        try {
            beliefBaseException1.addSuppressed(throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str2.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str3.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str5.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test65");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str12 = beliefBaseException11.toString();
        beliefBaseException8.addSuppressed((java.lang.Throwable) beliefBaseException11);
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException11);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException11);
        java.lang.Throwable[] throwable_array16 = beliefBaseException4.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException18);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str24 = beliefBaseException23.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException26 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str27 = beliefBaseException26.toString();
        beliefBaseException23.addSuppressed((java.lang.Throwable) beliefBaseException26);
        beliefBaseException21.addSuppressed((java.lang.Throwable) beliefBaseException26);
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException26);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException31 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException26);
        java.lang.String str32 = beliefBaseException26.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException33 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException26);
        java.lang.String str34 = beliefBaseException26.toString();
        java.lang.String str35 = beliefBaseException26.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException36 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException26);
        java.lang.Throwable[] throwable_array37 = beliefBaseException26.getSuppressed();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array16);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str24.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str27.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str32.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str34.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str35.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array37);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test66");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str4 = beliefBaseException3.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException6);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException3);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException9);
        java.lang.Throwable[] throwable_array11 = beliefBaseException9.getSuppressed();
        java.lang.String str12 = beliefBaseException9.toString();
        java.lang.String str13 = beliefBaseException9.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str13.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test67");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException2 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str10 = beliefBaseException9.toString();
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException9);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException9);
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException9);
        java.lang.Throwable[] throwable_array14 = beliefBaseException2.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException16);
        java.lang.Throwable[] throwable_array18 = beliefBaseException2.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.String str21 = beliefBaseException20.toString();
        java.lang.String str22 = beliefBaseException20.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException26 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException30 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str31 = beliefBaseException30.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException33 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str34 = beliefBaseException33.toString();
        beliefBaseException30.addSuppressed((java.lang.Throwable) beliefBaseException33);
        beliefBaseException28.addSuppressed((java.lang.Throwable) beliefBaseException33);
        beliefBaseException26.addSuppressed((java.lang.Throwable) beliefBaseException33);
        java.lang.Throwable[] throwable_array38 = beliefBaseException26.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException40 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException26.addSuppressed((java.lang.Throwable) beliefBaseException40);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException43 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException45 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str46 = beliefBaseException45.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException48 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str49 = beliefBaseException48.toString();
        beliefBaseException45.addSuppressed((java.lang.Throwable) beliefBaseException48);
        beliefBaseException43.addSuppressed((java.lang.Throwable) beliefBaseException48);
        beliefBaseException40.addSuppressed((java.lang.Throwable) beliefBaseException48);
        beliefBaseException24.addSuppressed((java.lang.Throwable) beliefBaseException40);
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException40);
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException20);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException57 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.Throwable[] throwable_array58 = beliefBaseException57.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException62 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException64 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException66 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str67 = beliefBaseException66.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException69 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str70 = beliefBaseException69.toString();
        beliefBaseException66.addSuppressed((java.lang.Throwable) beliefBaseException69);
        beliefBaseException64.addSuppressed((java.lang.Throwable) beliefBaseException69);
        beliefBaseException62.addSuppressed((java.lang.Throwable) beliefBaseException69);
        java.lang.Throwable[] throwable_array74 = beliefBaseException62.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException75 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException62);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException76 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException75);
        java.lang.String str77 = beliefBaseException75.toString();
        beliefBaseException57.addSuppressed((java.lang.Throwable) beliefBaseException75);
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException75);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException80 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException75);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array14);
        org.junit.Assert.assertNotNull(throwable_array18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str21.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str22.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str31.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str34.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array38);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str46.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str49.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array58);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str67.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str70.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array74);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str77.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test68");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str8 = beliefBaseException7.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str11 = beliefBaseException10.toString();
        beliefBaseException7.addSuppressed((java.lang.Throwable) beliefBaseException10);
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException10);
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException10);
        java.lang.Throwable[] throwable_array15 = beliefBaseException3.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException3);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException17 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException16);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str22 = beliefBaseException21.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str25 = beliefBaseException24.toString();
        beliefBaseException21.addSuppressed((java.lang.Throwable) beliefBaseException24);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException27 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException21);
        java.lang.String str28 = beliefBaseException27.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException29 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException27);
        java.lang.String str30 = beliefBaseException27.toString();
        beliefBaseException16.addSuppressed((java.lang.Throwable) beliefBaseException27);
        java.lang.Throwable[] throwable_array32 = beliefBaseException27.getSuppressed();
        java.lang.String str33 = beliefBaseException27.toString();
        java.lang.Throwable[] throwable_array34 = beliefBaseException27.getSuppressed();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str8.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str11.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array15);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str22.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str25.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str28.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str30.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str33.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array34);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test69");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException2 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.String str3 = beliefBaseException2.toString();
        java.lang.String str4 = beliefBaseException2.toString();
        java.lang.Throwable[] throwable_array5 = beliefBaseException2.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str10 = beliefBaseException9.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str13 = beliefBaseException12.toString();
        beliefBaseException9.addSuppressed((java.lang.Throwable) beliefBaseException12);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException15 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException9);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException15);
        java.lang.Throwable[] throwable_array17 = beliefBaseException16.getSuppressed();
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException16);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str22 = beliefBaseException21.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str25 = beliefBaseException24.toString();
        beliefBaseException21.addSuppressed((java.lang.Throwable) beliefBaseException24);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException27 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException21);
        java.lang.String str28 = beliefBaseException27.toString();
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException27);
        java.lang.Throwable[] throwable_array30 = beliefBaseException2.getSuppressed();
        java.lang.String str31 = beliefBaseException2.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException32 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException2);
        java.lang.String str33 = beliefBaseException32.toString();
        java.lang.Throwable[] throwable_array34 = beliefBaseException32.getSuppressed();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str3.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array5);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str13.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array17);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str22.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str25.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str28.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str31.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str33.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertNotNull(throwable_array34);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test70");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str12 = beliefBaseException11.toString();
        beliefBaseException8.addSuppressed((java.lang.Throwable) beliefBaseException11);
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException11);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException11);
        java.lang.Throwable[] throwable_array16 = beliefBaseException4.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException17 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException4);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException17);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str23 = beliefBaseException22.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException25 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str26 = beliefBaseException25.toString();
        beliefBaseException22.addSuppressed((java.lang.Throwable) beliefBaseException25);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException22);
        java.lang.String str29 = beliefBaseException28.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException30 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException28);
        java.lang.String str31 = beliefBaseException28.toString();
        beliefBaseException17.addSuppressed((java.lang.Throwable) beliefBaseException28);
        java.lang.String str33 = beliefBaseException28.toString();
        java.lang.String str34 = beliefBaseException28.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException35 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException28);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array16);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str23.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str26.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str29.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str31.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str33.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str34.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test71");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException2 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str10 = beliefBaseException9.toString();
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException9);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException9);
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException9);
        java.lang.Throwable[] throwable_array14 = beliefBaseException2.getSuppressed();
        java.lang.String str15 = beliefBaseException2.toString();
        java.lang.Throwable[] throwable_array16 = beliefBaseException2.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str22 = beliefBaseException21.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str25 = beliefBaseException24.toString();
        beliefBaseException21.addSuppressed((java.lang.Throwable) beliefBaseException24);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException27 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException21);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException27);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException29 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException28);
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException29);
        java.lang.Throwable[] throwable_array31 = beliefBaseException29.getSuppressed();
        java.lang.String str32 = beliefBaseException29.toString();
        java.lang.String str33 = beliefBaseException29.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException34 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException29);
        java.lang.Throwable[] throwable_array35 = beliefBaseException29.getSuppressed();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str15.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array16);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str22.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str25.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str32.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str33.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array35);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test72");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException2 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str10 = beliefBaseException9.toString();
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException9);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException9);
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException9);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException14 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException9);
        java.lang.String str15 = beliefBaseException9.toString();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str15.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test73");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException2 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str10 = beliefBaseException9.toString();
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException9);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException9);
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException9);
        java.lang.Throwable[] throwable_array14 = beliefBaseException2.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException15 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException2);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str25 = beliefBaseException24.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException27 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str28 = beliefBaseException27.toString();
        beliefBaseException24.addSuppressed((java.lang.Throwable) beliefBaseException27);
        beliefBaseException22.addSuppressed((java.lang.Throwable) beliefBaseException27);
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException27);
        java.lang.Throwable[] throwable_array32 = beliefBaseException20.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException33 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException20);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException36 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str37 = beliefBaseException36.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException39 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str40 = beliefBaseException39.toString();
        beliefBaseException36.addSuppressed((java.lang.Throwable) beliefBaseException39);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException42 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException36);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException45 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException47 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException49 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str50 = beliefBaseException49.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException52 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str53 = beliefBaseException52.toString();
        beliefBaseException49.addSuppressed((java.lang.Throwable) beliefBaseException52);
        beliefBaseException47.addSuppressed((java.lang.Throwable) beliefBaseException52);
        beliefBaseException45.addSuppressed((java.lang.Throwable) beliefBaseException52);
        java.lang.Throwable[] throwable_array57 = beliefBaseException45.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException58 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException45);
        beliefBaseException36.addSuppressed((java.lang.Throwable) beliefBaseException45);
        beliefBaseException33.addSuppressed((java.lang.Throwable) beliefBaseException36);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException61 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException33);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException62 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException61);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException65 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException67 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException69 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str70 = beliefBaseException69.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException72 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str73 = beliefBaseException72.toString();
        beliefBaseException69.addSuppressed((java.lang.Throwable) beliefBaseException72);
        beliefBaseException67.addSuppressed((java.lang.Throwable) beliefBaseException72);
        beliefBaseException65.addSuppressed((java.lang.Throwable) beliefBaseException72);
        java.lang.Throwable[] throwable_array77 = beliefBaseException65.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException78 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException65);
        java.lang.Throwable[] throwable_array79 = beliefBaseException65.getSuppressed();
        java.lang.String str80 = beliefBaseException65.toString();
        beliefBaseException62.addSuppressed((java.lang.Throwable) beliefBaseException65);
        beliefBaseException15.addSuppressed((java.lang.Throwable) beliefBaseException62);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array14);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str25.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str28.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array32);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str37.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str40.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str50.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str53.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array57);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str70.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str73.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array77);
        org.junit.Assert.assertNotNull(throwable_array79);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str80.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test74");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str11 = beliefBaseException10.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException13 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str14 = beliefBaseException13.toString();
        beliefBaseException10.addSuppressed((java.lang.Throwable) beliefBaseException13);
        beliefBaseException8.addSuppressed((java.lang.Throwable) beliefBaseException13);
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException13);
        java.lang.Throwable[] throwable_array18 = beliefBaseException6.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException6);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException19);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException26 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str27 = beliefBaseException26.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException29 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str30 = beliefBaseException29.toString();
        beliefBaseException26.addSuppressed((java.lang.Throwable) beliefBaseException29);
        beliefBaseException24.addSuppressed((java.lang.Throwable) beliefBaseException29);
        beliefBaseException22.addSuppressed((java.lang.Throwable) beliefBaseException29);
        java.lang.Throwable[] throwable_array34 = beliefBaseException22.getSuppressed();
        java.lang.String str35 = beliefBaseException22.toString();
        java.lang.Throwable[] throwable_array36 = beliefBaseException22.getSuppressed();
        beliefBaseException19.addSuppressed((java.lang.Throwable) beliefBaseException22);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException38 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException19);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException39 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException19);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException40 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException19);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str11.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str14.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array18);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str27.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str30.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str35.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array36);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test75");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str4 = beliefBaseException3.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException6);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException3);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException14 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str17 = beliefBaseException16.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str20 = beliefBaseException19.toString();
        beliefBaseException16.addSuppressed((java.lang.Throwable) beliefBaseException19);
        beliefBaseException14.addSuppressed((java.lang.Throwable) beliefBaseException19);
        beliefBaseException12.addSuppressed((java.lang.Throwable) beliefBaseException19);
        java.lang.Throwable[] throwable_array24 = beliefBaseException12.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException25 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException12);
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException12);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException29 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str30 = beliefBaseException29.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException32 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str33 = beliefBaseException32.toString();
        beliefBaseException29.addSuppressed((java.lang.Throwable) beliefBaseException32);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException35 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException29);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException38 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException40 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException42 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str43 = beliefBaseException42.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException45 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str46 = beliefBaseException45.toString();
        beliefBaseException42.addSuppressed((java.lang.Throwable) beliefBaseException45);
        beliefBaseException40.addSuppressed((java.lang.Throwable) beliefBaseException45);
        beliefBaseException38.addSuppressed((java.lang.Throwable) beliefBaseException45);
        java.lang.Throwable[] throwable_array50 = beliefBaseException38.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException51 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException38);
        beliefBaseException29.addSuppressed((java.lang.Throwable) beliefBaseException38);
        beliefBaseException12.addSuppressed((java.lang.Throwable) beliefBaseException38);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException56 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException58 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException60 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str61 = beliefBaseException60.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException63 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str64 = beliefBaseException63.toString();
        beliefBaseException60.addSuppressed((java.lang.Throwable) beliefBaseException63);
        beliefBaseException58.addSuppressed((java.lang.Throwable) beliefBaseException63);
        beliefBaseException56.addSuppressed((java.lang.Throwable) beliefBaseException63);
        java.lang.Throwable[] throwable_array68 = beliefBaseException56.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException70 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException56.addSuppressed((java.lang.Throwable) beliefBaseException70);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException73 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException75 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str76 = beliefBaseException75.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException78 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str79 = beliefBaseException78.toString();
        beliefBaseException75.addSuppressed((java.lang.Throwable) beliefBaseException78);
        beliefBaseException73.addSuppressed((java.lang.Throwable) beliefBaseException78);
        beliefBaseException70.addSuppressed((java.lang.Throwable) beliefBaseException78);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException83 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException78);
        beliefBaseException12.addSuppressed((java.lang.Throwable) beliefBaseException78);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException85 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException12);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException87 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str88 = beliefBaseException87.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException90 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str91 = beliefBaseException90.toString();
        beliefBaseException87.addSuppressed((java.lang.Throwable) beliefBaseException90);
        java.lang.String str93 = beliefBaseException90.toString();
        java.lang.String str94 = beliefBaseException90.toString();
        beliefBaseException12.addSuppressed((java.lang.Throwable) beliefBaseException90);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException97 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        beliefBaseException12.addSuppressed((java.lang.Throwable) beliefBaseException97);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str17.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str20.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array24);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str30.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str33.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str43.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str46.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array50);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str61.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str64.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array68);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str76.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str79.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str88 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str88.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str91.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str93.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str94.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test76");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str8 = beliefBaseException7.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str11 = beliefBaseException10.toString();
        beliefBaseException7.addSuppressed((java.lang.Throwable) beliefBaseException10);
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException10);
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException10);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException15 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException3);
        java.lang.String str16 = beliefBaseException15.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException17 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException15);
        java.lang.Throwable[] throwable_array18 = beliefBaseException17.getSuppressed();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str8.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str11.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str16.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertNotNull(throwable_array18);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test77");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException1 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.String str2 = beliefBaseException1.toString();
        java.lang.String str3 = beliefBaseException1.toString();
        java.lang.String str4 = beliefBaseException1.toString();
        java.lang.Throwable[] throwable_array5 = beliefBaseException1.getSuppressed();
        java.lang.String str6 = beliefBaseException1.toString();
        java.lang.String str7 = beliefBaseException1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str2.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str3.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str6.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test78");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str8 = beliefBaseException7.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str11 = beliefBaseException10.toString();
        beliefBaseException7.addSuppressed((java.lang.Throwable) beliefBaseException10);
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException10);
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException10);
        java.lang.Throwable[] throwable_array15 = beliefBaseException3.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException3);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str20 = beliefBaseException19.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str23 = beliefBaseException22.toString();
        beliefBaseException19.addSuppressed((java.lang.Throwable) beliefBaseException22);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException25 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException19);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException30 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException32 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str33 = beliefBaseException32.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException35 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str36 = beliefBaseException35.toString();
        beliefBaseException32.addSuppressed((java.lang.Throwable) beliefBaseException35);
        beliefBaseException30.addSuppressed((java.lang.Throwable) beliefBaseException35);
        beliefBaseException28.addSuppressed((java.lang.Throwable) beliefBaseException35);
        java.lang.Throwable[] throwable_array40 = beliefBaseException28.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException41 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException28);
        beliefBaseException19.addSuppressed((java.lang.Throwable) beliefBaseException28);
        beliefBaseException16.addSuppressed((java.lang.Throwable) beliefBaseException19);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException46 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str47 = beliefBaseException46.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException49 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str50 = beliefBaseException49.toString();
        beliefBaseException46.addSuppressed((java.lang.Throwable) beliefBaseException49);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException52 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException46);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException55 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str56 = beliefBaseException55.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException58 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str59 = beliefBaseException58.toString();
        beliefBaseException55.addSuppressed((java.lang.Throwable) beliefBaseException58);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException61 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException55);
        beliefBaseException52.addSuppressed((java.lang.Throwable) beliefBaseException61);
        beliefBaseException19.addSuppressed((java.lang.Throwable) beliefBaseException61);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException64 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException61);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException68 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException70 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException72 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str73 = beliefBaseException72.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException75 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str76 = beliefBaseException75.toString();
        beliefBaseException72.addSuppressed((java.lang.Throwable) beliefBaseException75);
        beliefBaseException70.addSuppressed((java.lang.Throwable) beliefBaseException75);
        beliefBaseException68.addSuppressed((java.lang.Throwable) beliefBaseException75);
        java.lang.Throwable[] throwable_array80 = beliefBaseException68.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException82 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException68.addSuppressed((java.lang.Throwable) beliefBaseException82);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException84 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException68);
        java.lang.Throwable[] throwable_array85 = beliefBaseException84.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException86 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException84);
        beliefBaseException61.addSuppressed((java.lang.Throwable) beliefBaseException86);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str8.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str11.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array15);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str20.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str23.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str33.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str36.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array40);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str47.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str50.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str56.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str59.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str73.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str76.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array80);
        org.junit.Assert.assertNotNull(throwable_array85);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test79");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str4 = beliefBaseException3.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException6);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException3);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException9);
        java.lang.Throwable[] throwable_array11 = beliefBaseException9.getSuppressed();
        java.lang.String str12 = beliefBaseException9.toString();
        java.lang.String str13 = beliefBaseException9.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str13.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test80");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException2 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.String str3 = beliefBaseException2.toString();
        java.lang.Throwable[] throwable_array4 = beliefBaseException2.getSuppressed();
        java.lang.String str5 = beliefBaseException2.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str3.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str5.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test81");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.Throwable[] throwable_array4 = beliefBaseException3.getSuppressed();
        java.lang.String str5 = beliefBaseException3.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException3);
        java.lang.Throwable[] throwable_array7 = beliefBaseException6.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException6);
        java.lang.String str9 = beliefBaseException6.toString();
        org.junit.Assert.assertNotNull(throwable_array4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str5.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test82");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str5 = beliefBaseException4.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str8 = beliefBaseException7.toString();
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException7);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException4);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException10);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException11);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str17 = beliefBaseException16.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str20 = beliefBaseException19.toString();
        beliefBaseException16.addSuppressed((java.lang.Throwable) beliefBaseException19);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException16);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException25 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException27 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException29 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str30 = beliefBaseException29.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException32 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str33 = beliefBaseException32.toString();
        beliefBaseException29.addSuppressed((java.lang.Throwable) beliefBaseException32);
        beliefBaseException27.addSuppressed((java.lang.Throwable) beliefBaseException32);
        beliefBaseException25.addSuppressed((java.lang.Throwable) beliefBaseException32);
        java.lang.Throwable[] throwable_array37 = beliefBaseException25.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException38 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException25);
        beliefBaseException16.addSuppressed((java.lang.Throwable) beliefBaseException25);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException42 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException44 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException46 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str47 = beliefBaseException46.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException49 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str50 = beliefBaseException49.toString();
        beliefBaseException46.addSuppressed((java.lang.Throwable) beliefBaseException49);
        beliefBaseException44.addSuppressed((java.lang.Throwable) beliefBaseException49);
        beliefBaseException42.addSuppressed((java.lang.Throwable) beliefBaseException49);
        java.lang.Throwable[] throwable_array54 = beliefBaseException42.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException55 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException42);
        beliefBaseException25.addSuppressed((java.lang.Throwable) beliefBaseException42);
        java.lang.String str57 = beliefBaseException42.toString();
        java.lang.Throwable[] throwable_array58 = beliefBaseException42.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException59 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException42);
        beliefBaseException11.addSuppressed((java.lang.Throwable) beliefBaseException59);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str5.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str8.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str17.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str20.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str30.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str33.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array37);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str47.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str50.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array54);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str57.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array58);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test83");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str4 = beliefBaseException3.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException6);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException3);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException9);
        java.lang.Throwable[] throwable_array11 = beliefBaseException10.getSuppressed();
        java.lang.String str12 = beliefBaseException10.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test84");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException2 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str10 = beliefBaseException9.toString();
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException9);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException9);
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException9);
        java.lang.Throwable[] throwable_array14 = beliefBaseException2.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException16);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str22 = beliefBaseException21.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str25 = beliefBaseException24.toString();
        beliefBaseException21.addSuppressed((java.lang.Throwable) beliefBaseException24);
        beliefBaseException19.addSuppressed((java.lang.Throwable) beliefBaseException24);
        beliefBaseException16.addSuppressed((java.lang.Throwable) beliefBaseException24);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException29 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException24);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException35 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str36 = beliefBaseException35.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException38 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str39 = beliefBaseException38.toString();
        beliefBaseException35.addSuppressed((java.lang.Throwable) beliefBaseException38);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException41 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException35);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException42 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException41);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException43 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException42);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException44 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException42);
        beliefBaseException24.addSuppressed((java.lang.Throwable) beliefBaseException42);
        java.lang.String str46 = beliefBaseException24.toString();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array14);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str22.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str25.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str36.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str39.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str46.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test85");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException2 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.Throwable[] throwable_array3 = beliefBaseException2.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException2);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str13 = beliefBaseException12.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException15 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str16 = beliefBaseException15.toString();
        beliefBaseException12.addSuppressed((java.lang.Throwable) beliefBaseException15);
        beliefBaseException10.addSuppressed((java.lang.Throwable) beliefBaseException15);
        beliefBaseException8.addSuppressed((java.lang.Throwable) beliefBaseException15);
        java.lang.Throwable[] throwable_array20 = beliefBaseException8.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException8);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException21);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException26 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str27 = beliefBaseException26.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException29 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str30 = beliefBaseException29.toString();
        beliefBaseException26.addSuppressed((java.lang.Throwable) beliefBaseException29);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException32 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException26);
        java.lang.String str33 = beliefBaseException32.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException34 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException32);
        java.lang.String str35 = beliefBaseException32.toString();
        beliefBaseException21.addSuppressed((java.lang.Throwable) beliefBaseException32);
        java.lang.Throwable[] throwable_array37 = beliefBaseException32.getSuppressed();
        java.lang.Throwable[] throwable_array38 = beliefBaseException32.getSuppressed();
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException32);
        java.lang.Throwable[] throwable_array40 = beliefBaseException32.getSuppressed();
        org.junit.Assert.assertNotNull(throwable_array3);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str13.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str16.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array20);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str27.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str30.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str33.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str35.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array37);
        org.junit.Assert.assertNotNull(throwable_array38);
        org.junit.Assert.assertNotNull(throwable_array40);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test86");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str4 = beliefBaseException3.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException6);
        java.lang.String str9 = beliefBaseException6.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException6);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.String str13 = beliefBaseException12.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str21 = beliefBaseException20.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str24 = beliefBaseException23.toString();
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException23);
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException23);
        beliefBaseException16.addSuppressed((java.lang.Throwable) beliefBaseException23);
        java.lang.Throwable[] throwable_array28 = beliefBaseException16.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException29 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException16);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException32 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str33 = beliefBaseException32.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException35 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str36 = beliefBaseException35.toString();
        beliefBaseException32.addSuppressed((java.lang.Throwable) beliefBaseException35);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException38 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException32);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException41 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException43 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException45 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str46 = beliefBaseException45.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException48 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str49 = beliefBaseException48.toString();
        beliefBaseException45.addSuppressed((java.lang.Throwable) beliefBaseException48);
        beliefBaseException43.addSuppressed((java.lang.Throwable) beliefBaseException48);
        beliefBaseException41.addSuppressed((java.lang.Throwable) beliefBaseException48);
        java.lang.Throwable[] throwable_array53 = beliefBaseException41.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException54 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException41);
        beliefBaseException32.addSuppressed((java.lang.Throwable) beliefBaseException41);
        beliefBaseException29.addSuppressed((java.lang.Throwable) beliefBaseException32);
        beliefBaseException12.addSuppressed((java.lang.Throwable) beliefBaseException32);
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException32);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException59 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException32);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str13.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str21.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str24.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array28);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str33.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str36.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str46.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str49.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array53);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test87");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str5 = beliefBaseException4.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str8 = beliefBaseException7.toString();
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException7);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException4);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException10);
        java.lang.Throwable[] throwable_array12 = beliefBaseException11.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException14 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str19 = beliefBaseException18.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str22 = beliefBaseException21.toString();
        beliefBaseException18.addSuppressed((java.lang.Throwable) beliefBaseException21);
        beliefBaseException16.addSuppressed((java.lang.Throwable) beliefBaseException21);
        beliefBaseException14.addSuppressed((java.lang.Throwable) beliefBaseException21);
        java.lang.Throwable[] throwable_array26 = beliefBaseException14.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException30 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException32 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str33 = beliefBaseException32.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException35 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str36 = beliefBaseException35.toString();
        beliefBaseException32.addSuppressed((java.lang.Throwable) beliefBaseException35);
        beliefBaseException30.addSuppressed((java.lang.Throwable) beliefBaseException35);
        beliefBaseException28.addSuppressed((java.lang.Throwable) beliefBaseException35);
        beliefBaseException14.addSuppressed((java.lang.Throwable) beliefBaseException28);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException43 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("");
        java.lang.String str44 = beliefBaseException43.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException45 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException43);
        beliefBaseException14.addSuppressed((java.lang.Throwable) beliefBaseException45);
        beliefBaseException11.addSuppressed((java.lang.Throwable) beliefBaseException45);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException48 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException45);
        java.lang.Throwable[] throwable_array49 = beliefBaseException45.getSuppressed();
        java.lang.Throwable[] throwable_array50 = beliefBaseException45.getSuppressed();
        java.lang.String str51 = beliefBaseException45.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str5.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str8.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array12);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str19.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str22.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array26);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str33.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str36.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str44.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertNotNull(throwable_array49);
        org.junit.Assert.assertNotNull(throwable_array50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str51.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test88");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException2 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.String str3 = beliefBaseException2.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException2);
        java.lang.String str5 = beliefBaseException2.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException14 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str15 = beliefBaseException14.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException17 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str18 = beliefBaseException17.toString();
        beliefBaseException14.addSuppressed((java.lang.Throwable) beliefBaseException17);
        beliefBaseException12.addSuppressed((java.lang.Throwable) beliefBaseException17);
        beliefBaseException10.addSuppressed((java.lang.Throwable) beliefBaseException17);
        java.lang.Throwable[] throwable_array22 = beliefBaseException10.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException10);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException10);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException27 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException27);
        beliefBaseException24.addSuppressed((java.lang.Throwable) beliefBaseException27);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException33 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException35 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException37 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str38 = beliefBaseException37.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException40 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str41 = beliefBaseException40.toString();
        beliefBaseException37.addSuppressed((java.lang.Throwable) beliefBaseException40);
        beliefBaseException35.addSuppressed((java.lang.Throwable) beliefBaseException40);
        beliefBaseException33.addSuppressed((java.lang.Throwable) beliefBaseException40);
        java.lang.Throwable[] throwable_array45 = beliefBaseException33.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException47 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException33.addSuppressed((java.lang.Throwable) beliefBaseException47);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException50 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException52 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str53 = beliefBaseException52.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException55 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str56 = beliefBaseException55.toString();
        beliefBaseException52.addSuppressed((java.lang.Throwable) beliefBaseException55);
        beliefBaseException50.addSuppressed((java.lang.Throwable) beliefBaseException55);
        beliefBaseException47.addSuppressed((java.lang.Throwable) beliefBaseException55);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException60 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException55);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException61 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException55);
        beliefBaseException24.addSuppressed((java.lang.Throwable) beliefBaseException61);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException63 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException61);
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException63);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str3.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str5.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str15.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str18.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array22);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str38.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str41.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array45);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str53.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str56.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test89");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException2 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str10 = beliefBaseException9.toString();
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException9);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException9);
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException9);
        java.lang.Throwable[] throwable_array14 = beliefBaseException2.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException2.addSuppressed((java.lang.Throwable) beliefBaseException16);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str22 = beliefBaseException21.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str25 = beliefBaseException24.toString();
        beliefBaseException21.addSuppressed((java.lang.Throwable) beliefBaseException24);
        beliefBaseException19.addSuppressed((java.lang.Throwable) beliefBaseException24);
        beliefBaseException16.addSuppressed((java.lang.Throwable) beliefBaseException24);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException29 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException24);
        java.lang.Throwable throwable30 = null;
        try {
            beliefBaseException29.addSuppressed(throwable30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array14);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str22.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str25.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test90");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str6 = beliefBaseException5.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException8);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException5);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException11);
        java.lang.Throwable[] throwable_array13 = beliefBaseException12.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException15 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException17 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str20 = beliefBaseException19.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str23 = beliefBaseException22.toString();
        beliefBaseException19.addSuppressed((java.lang.Throwable) beliefBaseException22);
        beliefBaseException17.addSuppressed((java.lang.Throwable) beliefBaseException22);
        beliefBaseException15.addSuppressed((java.lang.Throwable) beliefBaseException22);
        java.lang.Throwable[] throwable_array27 = beliefBaseException15.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException29 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException31 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException33 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str34 = beliefBaseException33.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException36 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str37 = beliefBaseException36.toString();
        beliefBaseException33.addSuppressed((java.lang.Throwable) beliefBaseException36);
        beliefBaseException31.addSuppressed((java.lang.Throwable) beliefBaseException36);
        beliefBaseException29.addSuppressed((java.lang.Throwable) beliefBaseException36);
        beliefBaseException15.addSuppressed((java.lang.Throwable) beliefBaseException29);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException44 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("");
        java.lang.String str45 = beliefBaseException44.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException46 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException44);
        beliefBaseException15.addSuppressed((java.lang.Throwable) beliefBaseException46);
        beliefBaseException12.addSuppressed((java.lang.Throwable) beliefBaseException46);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException49 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException46);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException50 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException46);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str6.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array13);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str20.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str23.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array27);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str34.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str37.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str45.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test91");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str12 = beliefBaseException11.toString();
        beliefBaseException8.addSuppressed((java.lang.Throwable) beliefBaseException11);
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException11);
        beliefBaseException4.addSuppressed((java.lang.Throwable) beliefBaseException11);
        java.lang.Throwable[] throwable_array16 = beliefBaseException4.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException17 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException4);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str21 = beliefBaseException20.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str24 = beliefBaseException23.toString();
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException23);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException26 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException20);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException29 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException31 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException33 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str34 = beliefBaseException33.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException36 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str37 = beliefBaseException36.toString();
        beliefBaseException33.addSuppressed((java.lang.Throwable) beliefBaseException36);
        beliefBaseException31.addSuppressed((java.lang.Throwable) beliefBaseException36);
        beliefBaseException29.addSuppressed((java.lang.Throwable) beliefBaseException36);
        java.lang.Throwable[] throwable_array41 = beliefBaseException29.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException42 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException29);
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException29);
        beliefBaseException17.addSuppressed((java.lang.Throwable) beliefBaseException20);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException45 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException17);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException46 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException45);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException49 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException51 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException53 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str54 = beliefBaseException53.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException56 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str57 = beliefBaseException56.toString();
        beliefBaseException53.addSuppressed((java.lang.Throwable) beliefBaseException56);
        beliefBaseException51.addSuppressed((java.lang.Throwable) beliefBaseException56);
        beliefBaseException49.addSuppressed((java.lang.Throwable) beliefBaseException56);
        java.lang.Throwable[] throwable_array61 = beliefBaseException49.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException62 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException49);
        java.lang.Throwable[] throwable_array63 = beliefBaseException49.getSuppressed();
        java.lang.String str64 = beliefBaseException49.toString();
        beliefBaseException46.addSuppressed((java.lang.Throwable) beliefBaseException49);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException69 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException71 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException73 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str74 = beliefBaseException73.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException76 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str77 = beliefBaseException76.toString();
        beliefBaseException73.addSuppressed((java.lang.Throwable) beliefBaseException76);
        beliefBaseException71.addSuppressed((java.lang.Throwable) beliefBaseException76);
        beliefBaseException69.addSuppressed((java.lang.Throwable) beliefBaseException76);
        java.lang.Throwable[] throwable_array81 = beliefBaseException69.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException83 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException69.addSuppressed((java.lang.Throwable) beliefBaseException83);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException86 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException88 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str89 = beliefBaseException88.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException91 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str92 = beliefBaseException91.toString();
        beliefBaseException88.addSuppressed((java.lang.Throwable) beliefBaseException91);
        beliefBaseException86.addSuppressed((java.lang.Throwable) beliefBaseException91);
        beliefBaseException83.addSuppressed((java.lang.Throwable) beliefBaseException91);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException96 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException91);
        java.lang.Throwable[] throwable_array97 = beliefBaseException96.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException98 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException96);
        beliefBaseException49.addSuppressed((java.lang.Throwable) beliefBaseException98);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array16);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str21.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str24.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str34.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str37.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array41);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str54.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str57.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array61);
        org.junit.Assert.assertNotNull(throwable_array63);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str64.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str74.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str77.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array81);
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str89.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str92.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array97);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test92");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str4 = beliefBaseException3.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException6);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException3);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException9);
        java.lang.Throwable[] throwable_array11 = beliefBaseException10.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str17 = beliefBaseException16.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str20 = beliefBaseException19.toString();
        beliefBaseException16.addSuppressed((java.lang.Throwable) beliefBaseException19);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException16);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException22);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException23);
        beliefBaseException10.addSuppressed((java.lang.Throwable) beliefBaseException24);
        java.lang.Throwable[] throwable_array26 = beliefBaseException24.getSuppressed();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str17.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str20.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array26);
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test93");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str10 = beliefBaseException9.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str13 = beliefBaseException12.toString();
        beliefBaseException9.addSuppressed((java.lang.Throwable) beliefBaseException12);
        beliefBaseException7.addSuppressed((java.lang.Throwable) beliefBaseException12);
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException12);
        java.lang.Throwable[] throwable_array17 = beliefBaseException5.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException19);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str25 = beliefBaseException24.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException27 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str28 = beliefBaseException27.toString();
        beliefBaseException24.addSuppressed((java.lang.Throwable) beliefBaseException27);
        beliefBaseException22.addSuppressed((java.lang.Throwable) beliefBaseException27);
        beliefBaseException19.addSuppressed((java.lang.Throwable) beliefBaseException27);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException32 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException27);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException33 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException27);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException37 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException38 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException37);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException41 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException43 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException45 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str46 = beliefBaseException45.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException48 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str49 = beliefBaseException48.toString();
        beliefBaseException45.addSuppressed((java.lang.Throwable) beliefBaseException48);
        beliefBaseException43.addSuppressed((java.lang.Throwable) beliefBaseException48);
        beliefBaseException41.addSuppressed((java.lang.Throwable) beliefBaseException48);
        java.lang.Throwable[] throwable_array53 = beliefBaseException41.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException54 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException41);
        beliefBaseException37.addSuppressed((java.lang.Throwable) beliefBaseException41);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException56 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException41);
        beliefBaseException27.addSuppressed((java.lang.Throwable) beliefBaseException56);
        java.lang.Throwable[] throwable_array58 = beliefBaseException56.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException59 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException56);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException60 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException56);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str13.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array17);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str25.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str28.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str46.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str49.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array53);
        org.junit.Assert.assertNotNull(throwable_array58);
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test94");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("");
        java.lang.String str4 = beliefBaseException3.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str11 = beliefBaseException10.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException13 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str14 = beliefBaseException13.toString();
        beliefBaseException10.addSuppressed((java.lang.Throwable) beliefBaseException13);
        beliefBaseException8.addSuppressed((java.lang.Throwable) beliefBaseException13);
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException13);
        java.lang.Throwable[] throwable_array18 = beliefBaseException6.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        beliefBaseException6.addSuppressed((java.lang.Throwable) beliefBaseException20);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException25 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str26 = beliefBaseException25.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str29 = beliefBaseException28.toString();
        beliefBaseException25.addSuppressed((java.lang.Throwable) beliefBaseException28);
        beliefBaseException23.addSuppressed((java.lang.Throwable) beliefBaseException28);
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException28);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException34 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str35 = beliefBaseException34.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException37 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str38 = beliefBaseException37.toString();
        beliefBaseException34.addSuppressed((java.lang.Throwable) beliefBaseException37);
        beliefBaseException20.addSuppressed((java.lang.Throwable) beliefBaseException34);
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException20);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException42 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException20);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException43 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException42);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str11.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str14.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array18);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str26.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str29.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str35.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str38.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test95");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        java.lang.String str6 = beliefBaseException5.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException8 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str9 = beliefBaseException8.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str12 = beliefBaseException11.toString();
        beliefBaseException8.addSuppressed((java.lang.Throwable) beliefBaseException11);
        java.lang.String str14 = beliefBaseException11.toString();
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException11);
        java.lang.Throwable[] throwable_array16 = beliefBaseException5.getSuppressed();
        java.lang.Throwable[] throwable_array17 = beliefBaseException5.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException18 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException5);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException18);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException20 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException18);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException21 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException20);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str6.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str9.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str12.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str14.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array16);
        org.junit.Assert.assertNotNull(throwable_array17);
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test96");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str4 = beliefBaseException3.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException6 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str7 = beliefBaseException6.toString();
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException6);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException9 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException3);
        java.lang.String str10 = beliefBaseException9.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException11 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException9);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str17 = beliefBaseException16.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str20 = beliefBaseException19.toString();
        beliefBaseException16.addSuppressed((java.lang.Throwable) beliefBaseException19);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException16);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException22);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException23);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException26 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str29 = beliefBaseException28.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException31 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str32 = beliefBaseException31.toString();
        beliefBaseException28.addSuppressed((java.lang.Throwable) beliefBaseException31);
        beliefBaseException26.addSuppressed((java.lang.Throwable) beliefBaseException31);
        beliefBaseException24.addSuppressed((java.lang.Throwable) beliefBaseException26);
        beliefBaseException9.addSuppressed((java.lang.Throwable) beliefBaseException24);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException39 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str40 = beliefBaseException39.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException41 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException39);
        java.lang.Throwable[] throwable_array42 = beliefBaseException41.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException45 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str46 = beliefBaseException45.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException48 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str49 = beliefBaseException48.toString();
        beliefBaseException45.addSuppressed((java.lang.Throwable) beliefBaseException48);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException51 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException45);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException54 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException56 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException58 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str59 = beliefBaseException58.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException61 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str62 = beliefBaseException61.toString();
        beliefBaseException58.addSuppressed((java.lang.Throwable) beliefBaseException61);
        beliefBaseException56.addSuppressed((java.lang.Throwable) beliefBaseException61);
        beliefBaseException54.addSuppressed((java.lang.Throwable) beliefBaseException61);
        java.lang.Throwable[] throwable_array66 = beliefBaseException54.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException67 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException54);
        beliefBaseException45.addSuppressed((java.lang.Throwable) beliefBaseException54);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException71 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str72 = beliefBaseException71.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException74 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str75 = beliefBaseException74.toString();
        beliefBaseException71.addSuppressed((java.lang.Throwable) beliefBaseException74);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException77 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException71);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException80 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException82 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException84 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str85 = beliefBaseException84.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException87 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str88 = beliefBaseException87.toString();
        beliefBaseException84.addSuppressed((java.lang.Throwable) beliefBaseException87);
        beliefBaseException82.addSuppressed((java.lang.Throwable) beliefBaseException87);
        beliefBaseException80.addSuppressed((java.lang.Throwable) beliefBaseException87);
        java.lang.Throwable[] throwable_array92 = beliefBaseException80.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException93 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException80);
        beliefBaseException71.addSuppressed((java.lang.Throwable) beliefBaseException80);
        beliefBaseException54.addSuppressed((java.lang.Throwable) beliefBaseException80);
        beliefBaseException41.addSuppressed((java.lang.Throwable) beliefBaseException80);
        beliefBaseException24.addSuppressed((java.lang.Throwable) beliefBaseException41);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str4.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str7.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str10.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str17.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str20.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str29.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str32.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str40.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array42);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str46.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str49.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str59.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str62.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array66);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str72.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str75.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str85.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str88 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str88.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array92);
    }

    @Test
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test97");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException4 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException3);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException3);
        java.lang.Throwable[] throwable_array6 = beliefBaseException3.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException12 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException14 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str15 = beliefBaseException14.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException17 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str18 = beliefBaseException17.toString();
        beliefBaseException14.addSuppressed((java.lang.Throwable) beliefBaseException17);
        beliefBaseException12.addSuppressed((java.lang.Throwable) beliefBaseException17);
        beliefBaseException10.addSuppressed((java.lang.Throwable) beliefBaseException17);
        java.lang.Throwable[] throwable_array22 = beliefBaseException10.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException23 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException10);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException24 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException23);
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException23);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException29 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException31 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException33 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str34 = beliefBaseException33.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException36 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str37 = beliefBaseException36.toString();
        beliefBaseException33.addSuppressed((java.lang.Throwable) beliefBaseException36);
        beliefBaseException31.addSuppressed((java.lang.Throwable) beliefBaseException36);
        beliefBaseException29.addSuppressed((java.lang.Throwable) beliefBaseException36);
        java.lang.Throwable[] throwable_array41 = beliefBaseException29.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException42 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException29);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException43 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException42);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException47 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str48 = beliefBaseException47.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException50 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str51 = beliefBaseException50.toString();
        beliefBaseException47.addSuppressed((java.lang.Throwable) beliefBaseException50);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException53 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException47);
        java.lang.String str54 = beliefBaseException53.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException55 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException53);
        java.lang.String str56 = beliefBaseException53.toString();
        beliefBaseException42.addSuppressed((java.lang.Throwable) beliefBaseException53);
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException42);
        java.lang.String str59 = beliefBaseException3.toString();
        java.lang.String str60 = beliefBaseException3.toString();
        org.junit.Assert.assertNotNull(throwable_array6);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str15.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str18.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array22);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str34.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str37.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array41);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str48.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str51.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str54.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str56.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str59.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str60.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
    }

    @Test
    public void test98() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BeliefBaseExceptionRegressionTest1.test98");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException3 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException5 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException7 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str8 = beliefBaseException7.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException10 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str11 = beliefBaseException10.toString();
        beliefBaseException7.addSuppressed((java.lang.Throwable) beliefBaseException10);
        beliefBaseException5.addSuppressed((java.lang.Throwable) beliefBaseException10);
        beliefBaseException3.addSuppressed((java.lang.Throwable) beliefBaseException10);
        java.lang.Throwable[] throwable_array15 = beliefBaseException3.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException16 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException3);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException19 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str20 = beliefBaseException19.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException22 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str23 = beliefBaseException22.toString();
        beliefBaseException19.addSuppressed((java.lang.Throwable) beliefBaseException22);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException25 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: ", (java.lang.Exception) beliefBaseException19);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException28 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException30 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException32 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str33 = beliefBaseException32.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException35 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str36 = beliefBaseException35.toString();
        beliefBaseException32.addSuppressed((java.lang.Throwable) beliefBaseException35);
        beliefBaseException30.addSuppressed((java.lang.Throwable) beliefBaseException35);
        beliefBaseException28.addSuppressed((java.lang.Throwable) beliefBaseException35);
        java.lang.Throwable[] throwable_array40 = beliefBaseException28.getSuppressed();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException41 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException28);
        beliefBaseException19.addSuppressed((java.lang.Throwable) beliefBaseException28);
        beliefBaseException16.addSuppressed((java.lang.Throwable) beliefBaseException19);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException46 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str47 = beliefBaseException46.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException49 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str50 = beliefBaseException49.toString();
        beliefBaseException46.addSuppressed((java.lang.Throwable) beliefBaseException49);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException52 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException46);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException55 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str56 = beliefBaseException55.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException58 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!");
        java.lang.String str59 = beliefBaseException58.toString();
        beliefBaseException55.addSuppressed((java.lang.Throwable) beliefBaseException58);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException61 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException55);
        beliefBaseException52.addSuppressed((java.lang.Throwable) beliefBaseException61);
        beliefBaseException19.addSuppressed((java.lang.Throwable) beliefBaseException61);
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException64 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!", (java.lang.Exception) beliefBaseException61);
        java.lang.Throwable[] throwable_array65 = beliefBaseException61.getSuppressed();
        java.lang.String str66 = beliefBaseException61.toString();
        java.lang.String str67 = beliefBaseException61.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException71 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("");
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException72 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("hi!", (java.lang.Exception) beliefBaseException71);
        java.lang.String str73 = beliefBaseException71.toString();
        java.lang.String str74 = beliefBaseException71.toString();
        java.lang.String str75 = beliefBaseException71.toString();
        io.github.agentsoz.jill.core.beliefbase.BeliefBaseException beliefBaseException76 = new io.github.agentsoz.jill.core.beliefbase.BeliefBaseException("", (java.lang.Exception) beliefBaseException71);
        java.lang.Throwable[] throwable_array77 = beliefBaseException71.getSuppressed();
        beliefBaseException61.addSuppressed((java.lang.Throwable) beliefBaseException71);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str8.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str11.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array15);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str20.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str23.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str33.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str36.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array40);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str47.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str50.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str56.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str59.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array65);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str66.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!" + "'", str67.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: hi!"));
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str73.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str74.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: " + "'", str75.equals("io.github.agentsoz.jill.core.beliefbase.BeliefBaseException: "));
        org.junit.Assert.assertNotNull(throwable_array77);
    }
}

