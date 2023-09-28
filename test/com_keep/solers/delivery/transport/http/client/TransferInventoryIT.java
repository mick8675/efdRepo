/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.http.client;

import org.apache.commons.httpclient.HttpMethod;
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
public class TransferInventoryIT {
    
    public TransferInventoryIT() {
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
     * Test of toString method, of class TransferInventory.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TransferInventory instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHttpMethod method, of class TransferInventory.
     */
    @Test
    public void testGetHttpMethod() {
        System.out.println("getHttpMethod");
        TransferInventory instance = null;
        HttpMethod expResult = null;
        HttpMethod result = instance.getHttpMethod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNotModified method, of class TransferInventory.
     */
    @Test
    public void testIsNotModified() {
        System.out.println("isNotModified");
        TransferInventory instance = null;
        boolean expResult = false;
        boolean result = instance.isNotModified();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
