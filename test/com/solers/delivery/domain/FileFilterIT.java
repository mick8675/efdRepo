/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.domain;

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
public class FileFilterIT {
    
    public FileFilterIT() {
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
     * Test of getId method, of class FileFilter.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        FileFilter instance = new FileFilter();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class FileFilter.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        FileFilter instance = new FileFilter();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPattern method, of class FileFilter.
     */
    @Test
    public void testGetPattern() {
        System.out.println("getPattern");
        FileFilter instance = new FileFilter();
        String expResult = "";
        String result = instance.getPattern();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPattern method, of class FileFilter.
     */
    @Test
    public void testSetPattern() {
        System.out.println("setPattern");
        String pattern = "";
        FileFilter instance = new FileFilter();
        instance.setPattern(pattern);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInclusive method, of class FileFilter.
     */
    @Test
    public void testIsInclusive() {
        System.out.println("isInclusive");
        FileFilter instance = new FileFilter();
        Boolean expResult = null;
        Boolean result = instance.isInclusive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInclusive method, of class FileFilter.
     */
    @Test
    public void testGetInclusive() {
        System.out.println("getInclusive");
        FileFilter instance = new FileFilter();
        boolean expResult = false;
        boolean result = instance.getInclusive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInclusive method, of class FileFilter.
     */
    @Test
    public void testSetInclusive_Boolean() {
        System.out.println("setInclusive");
        Boolean inclusive = null;
        FileFilter instance = new FileFilter();
        instance.setInclusive(inclusive);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInclusive method, of class FileFilter.
     */
    @Test
    public void testSetInclusive_boolean() {
        System.out.println("setInclusive");
        boolean inclusive = false;
        FileFilter instance = new FileFilter();
        instance.setInclusive(inclusive);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatternType method, of class FileFilter.
     */
    @Test
    public void testGetPatternType() {
        System.out.println("getPatternType");
        FileFilter instance = new FileFilter();
        FileFilter.Pattern expResult = null;
        FileFilter.Pattern result = instance.getPatternType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPatternType method, of class FileFilter.
     */
    @Test
    public void testSetPatternType() {
        System.out.println("setPatternType");
        FileFilter.Pattern patternType = null;
        FileFilter instance = new FileFilter();
        instance.setPatternType(patternType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class FileFilter.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        FileFilter instance = new FileFilter();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class FileFilter.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        FileFilter instance = new FileFilter();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
