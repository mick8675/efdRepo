/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.event;

import java.util.Date;
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
public class BaseEventIT {
    
    public BaseEventIT() {
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
     * Test of setTimestamp method, of class BaseEvent.
     */
    @Test
    public void testSetTimestamp() {
        System.out.println("setTimestamp");
        long timestamp = 0L;
        BaseEvent instance = new BaseEventImpl();
        instance.setTimestamp(timestamp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSearchTimestamp method, of class BaseEvent.
     */
    @Test
    public void testGetSearchTimestamp() {
        System.out.println("getSearchTimestamp");
        BaseEvent instance = new BaseEventImpl();
        Date expResult = null;
        Date result = instance.getSearchTimestamp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimestamp method, of class BaseEvent.
     */
    @Test
    public void testGetTimestamp() {
        System.out.println("getTimestamp");
        BaseEvent instance = new BaseEventImpl();
        long expResult = 0L;
        long result = instance.getTimestamp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class BaseEventImpl extends BaseEvent {
    }
    
}
