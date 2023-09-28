/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.web.remoting;

import com.solers.delivery.domain.Alert;
import com.solers.util.Page;
import java.util.List;
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
public class AlertHelperIT {
    
    public AlertHelperIT() {
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
     * Test of getUserAlerts method, of class AlertHelper.
     */
    @Test
    public void testGetUserAlerts() {
        System.out.println("getUserAlerts");
        int start = 0;
        int numRecords = 0;
        AlertHelper instance = null;
        Page<Alert> expResult = null;
        Page<Alert> result = instance.getUserAlerts(start, numRecords);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdminAlerts method, of class AlertHelper.
     */
    @Test
    public void testGetAdminAlerts() {
        System.out.println("getAdminAlerts");
        int start = 0;
        int numRecords = 0;
        AlertHelper instance = null;
        Page<Alert> expResult = null;
        Page<Alert> result = instance.getAdminAlerts(start, numRecords);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of markRead method, of class AlertHelper.
     */
    @Test
    public void testMarkRead() {
        System.out.println("markRead");
        Long id = null;
        AlertHelper instance = null;
        instance.markRead(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class AlertHelper.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        List<Long> ids = null;
        AlertHelper instance = null;
        instance.remove(ids);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
