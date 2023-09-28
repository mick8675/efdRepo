/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.http.client.util;

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
public class SessionIT {
    
    public SessionIT() {
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
     * Test of getContentSetName method, of class Session.
     */
    @Test
    public void testGetContentSetName() {
        System.out.println("getContentSetName");
        Session instance = null;
        String expResult = "";
        String result = instance.getContentSetName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSyncId method, of class Session.
     */
    @Test
    public void testGetSyncId() {
        System.out.println("getSyncId");
        Session instance = null;
        String expResult = "";
        String result = instance.getSyncId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRemoteVersion method, of class Session.
     */
    @Test
    public void testGetRemoteVersion() {
        System.out.println("getRemoteVersion");
        Session instance = null;
        String expResult = "";
        String result = instance.getRemoteVersion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Session.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Session instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
