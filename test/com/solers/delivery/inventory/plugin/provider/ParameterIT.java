/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.plugin.provider;

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
public class ParameterIT {
    
    public ParameterIT() {
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
     * Test of name method, of class Parameter.
     */
    @Test
    public void testName() {
        System.out.println("name");
        Parameter instance = new ParameterImpl();
        String expResult = "";
        String result = instance.name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of type method, of class Parameter.
     */
    @Test
    public void testType() {
        System.out.println("type");
        Parameter instance = new ParameterImpl();
        Class expResult = null;
        Class result = instance.type();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encrypted method, of class Parameter.
     */
    @Test
    public void testEncrypted() {
        System.out.println("encrypted");
        Parameter instance = new ParameterImpl();
        boolean expResult = false;
        boolean result = instance.encrypted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mandatory method, of class Parameter.
     */
    @Test
    public void testMandatory() {
        System.out.println("mandatory");
        Parameter instance = new ParameterImpl();
        boolean expResult = false;
        boolean result = instance.mandatory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of description method, of class Parameter.
     */
    @Test
    public void testDescription() {
        System.out.println("description");
        Parameter instance = new ParameterImpl();
        String expResult = "";
        String result = instance.description();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ParameterImpl implements Parameter {

        public String name() {
            return "";
        }

        public Class<?> type() {
            return null;
        }

        public boolean encrypted() {
            return false;
        }

        public boolean mandatory() {
            return false;
        }

        public String description() {
            return "";
        }
    }
    
}
