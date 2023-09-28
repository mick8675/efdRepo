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
public class PendingGBSUpdateEventIT {
    
    public PendingGBSUpdateEventIT() {
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
     * Test of getContentEvent method, of class PendingGBSUpdateEvent.
     */
    @Test
    public void testGetContentEvent() {
        System.out.println("getContentEvent");
        PendingGBSUpdateEvent instance = null;
        ContentEvent expResult = null;
        ContentEvent result = instance.getContentEvent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResultValue method, of class PendingGBSUpdateEvent.
     */
    @Test
    public void testGetResultValue() {
        System.out.println("getResultValue");
        PendingGBSUpdateEvent instance = null;
        ContentEvent.ContentEventResult expResult = null;
        ContentEvent.ContentEventResult result = instance.getResultValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResult method, of class PendingGBSUpdateEvent.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        PendingGBSUpdateEvent instance = null;
        String expResult = "";
        String result = instance.getResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPath method, of class PendingGBSUpdateEvent.
     */
    @Test
    public void testGetPath() {
        System.out.println("getPath");
        PendingGBSUpdateEvent instance = null;
        String expResult = "";
        String result = instance.getPath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSyncId method, of class PendingGBSUpdateEvent.
     */
    @Test
    public void testGetSyncId() {
        System.out.println("getSyncId");
        PendingGBSUpdateEvent instance = null;
        String expResult = "";
        String result = instance.getSyncId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentSetId method, of class PendingGBSUpdateEvent.
     */
    @Test
    public void testGetContentSetId() {
        System.out.println("getContentSetId");
        PendingGBSUpdateEvent instance = null;
        long expResult = 0L;
        long result = instance.getContentSetId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class PendingGBSUpdateEvent.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        PendingGBSUpdateEvent instance = null;
        long expResult = 0L;
        long result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAction method, of class PendingGBSUpdateEvent.
     */
    @Test
    public void testGetAction() {
        System.out.println("getAction");
        PendingGBSUpdateEvent instance = null;
        ContentEvent.ContentEventAction expResult = null;
        ContentEvent.ContentEventAction result = instance.getAction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PendingGBSUpdateEvent.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PendingGBSUpdateEvent instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
