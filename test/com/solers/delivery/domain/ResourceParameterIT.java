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
public class ResourceParameterIT {
    
    public ResourceParameterIT() {
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
     * Test of getId method, of class ResourceParameter.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        ResourceParameter instance = new ResourceParameter();
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class ResourceParameter.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        ResourceParameter instance = new ResourceParameter();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class ResourceParameter.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        ResourceParameter instance = new ResourceParameter();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class ResourceParameter.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        ResourceParameter instance = new ResourceParameter();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersistedValue method, of class ResourceParameter.
     */
    @Test
    public void testGetPersistedValue() {
        System.out.println("getPersistedValue");
        ResourceParameter instance = new ResourceParameter();
        String expResult = "";
        String result = instance.getPersistedValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersistedValue method, of class ResourceParameter.
     */
    @Test
    public void testSetPersistedValue() {
        System.out.println("setPersistedValue");
        String value = "";
        ResourceParameter instance = new ResourceParameter();
        instance.setPersistedValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEncrypted method, of class ResourceParameter.
     */
    @Test
    public void testIsEncrypted() {
        System.out.println("isEncrypted");
        ResourceParameter instance = new ResourceParameter();
        boolean expResult = false;
        boolean result = instance.isEncrypted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEncrypted method, of class ResourceParameter.
     */
    @Test
    public void testSetEncrypted() {
        System.out.println("setEncrypted");
        boolean encrypted = false;
        ResourceParameter instance = new ResourceParameter();
        instance.setEncrypted(encrypted);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class ResourceParameter.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        ResourceParameter instance = new ResourceParameter();
        String expResult = "";
        String result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class ResourceParameter.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        String value = "";
        ResourceParameter instance = new ResourceParameter();
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
