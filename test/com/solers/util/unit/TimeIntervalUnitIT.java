/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.util.unit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class TimeIntervalUnitIT {
    
    public TimeIntervalUnitIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of values method, of class TimeIntervalUnit.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        TimeIntervalUnit[] expResult = null;
        TimeIntervalUnit[] result = TimeIntervalUnit.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class TimeIntervalUnit.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        TimeIntervalUnit expResult = null;
        TimeIntervalUnit result = TimeIntervalUnit.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class TimeIntervalUnit.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        TimeIntervalUnit instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TimeIntervalUnit.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TimeIntervalUnit instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toValue method, of class TimeIntervalUnit.
     */
    @Test
    public void testToValue() {
        System.out.println("toValue");
        String value = "";
        TimeIntervalUnit expResult = null;
        TimeIntervalUnit result = TimeIntervalUnit.toValue(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMillisFactor method, of class TimeIntervalUnit.
     */
    @Test
    public void testGetMillisFactor() {
        System.out.println("getMillisFactor");
        TimeIntervalUnit instance = null;
        long expResult = 0L;
        long result = instance.getMillisFactor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toMillis method, of class TimeIntervalUnit.
     */
    @Test
    public void testToMillis() {
        System.out.println("toMillis");
        long value = 0L;
        TimeIntervalUnit instance = null;
        long expResult = 0L;
        long result = instance.toMillis(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDisplayName method, of class TimeIntervalUnit.
     */
    @Test
    public void testGetDisplayName() {
        System.out.println("getDisplayName");
        TimeIntervalUnit instance = null;
        String expResult = "";
        String result = instance.getDisplayName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convert method, of class TimeIntervalUnit.
     */
    @Test
    public void testConvert() {
        System.out.println("convert");
        long value = 0L;
        TimeIntervalUnit unit = null;
        TimeIntervalUnit instance = null;
        long expResult = 0L;
        long result = instance.convert(value, unit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of format method, of class TimeIntervalUnit.
     */
    @Test
    public void testFormat_long() {
        System.out.println("format");
        long value = 0L;
        String expResult = "";
        String result = TimeIntervalUnit.format(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of format method, of class TimeIntervalUnit.
     */
    @Test
    public void testFormat_3args() {
        System.out.println("format");
        long value = 0L;
        TimeIntervalUnit unitValue = null;
        TimeIntervalUnit base = null;
        String expResult = "";
        String result = TimeIntervalUnit.format(value, unitValue, base);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
