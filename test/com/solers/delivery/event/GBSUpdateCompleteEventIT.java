/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.event;

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
public class GBSUpdateCompleteEventIT {
    
    public GBSUpdateCompleteEventIT() {
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
     * Test of getContentSetId method, of class GBSUpdateCompleteEvent.
     */
    @Test
    public void testGetContentSetId() {
        System.out.println("getContentSetId");
        GBSUpdateCompleteEvent instance = null;
        long expResult = 0L;
        long result = instance.getContentSetId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSyncId method, of class GBSUpdateCompleteEvent.
     */
    @Test
    public void testGetSyncId() {
        System.out.println("getSyncId");
        GBSUpdateCompleteEvent instance = null;
        String expResult = "";
        String result = instance.getSyncId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class GBSUpdateCompleteEvent.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        GBSUpdateCompleteEvent instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
