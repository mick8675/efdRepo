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
public class FileSizeUnitIT {
    
    public FileSizeUnitIT() {
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
     * Test of values method, of class FileSizeUnit.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        FileSizeUnit[] expResult = null;
        FileSizeUnit[] result = FileSizeUnit.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class FileSizeUnit.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        FileSizeUnit expResult = null;
        FileSizeUnit result = FileSizeUnit.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class FileSizeUnit.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        FileSizeUnit instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toValue method, of class FileSizeUnit.
     */
    @Test
    public void testToValue() {
        System.out.println("toValue");
        String value = "";
        FileSizeUnit expResult = null;
        FileSizeUnit result = FileSizeUnit.toValue(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDisplayName method, of class FileSizeUnit.
     */
    @Test
    public void testGetDisplayName() {
        System.out.println("getDisplayName");
        FileSizeUnit instance = null;
        String expResult = "";
        String result = instance.getDisplayName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convert method, of class FileSizeUnit.
     */
    @Test
    public void testConvert() {
        System.out.println("convert");
        double size = 0.0;
        FileSizeUnit units = null;
        FileSizeUnit instance = null;
        double expResult = 0.0;
        double result = instance.convert(size, units);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recommendUnit method, of class FileSizeUnit.
     */
    @Test
    public void testRecommendUnit() {
        System.out.println("recommendUnit");
        double size = 0.0;
        FileSizeUnit instance = null;
        FileSizeUnit expResult = null;
        FileSizeUnit result = instance.recommendUnit(size);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of format method, of class FileSizeUnit.
     */
    @Test
    public void testFormat() {
        System.out.println("format");
        double size = 0.0;
        String expResult = "";
        String result = FileSizeUnit.format(size);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
