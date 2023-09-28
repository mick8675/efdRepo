/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.lucene;

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
public class ConverterIT {
    
    public ConverterIT() {
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
     * Test of values method, of class Converter.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Converter[] expResult = null;
        Converter[] result = Converter.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Converter.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        Converter expResult = null;
        Converter result = Converter.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertTo method, of class Converter.
     */
    @Test
    public void testConvertTo() {
        System.out.println("convertTo");
        Object o = null;
        Converter instance = null;
        String expResult = "";
        String result = instance.convertTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertFrom method, of class Converter.
     */
    @Test
    public void testConvertFrom() {
        System.out.println("convertFrom");
        String value = "";
        Converter instance = null;
        Object expResult = null;
        Object result = instance.convertFrom(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
