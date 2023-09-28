/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.management;

import com.solers.delivery.content.status.CurrentSynchronization;
import com.solers.delivery.transport.http.monitor.TransferMonitor;
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
public class StatusServiceImplIT {
    
    public StatusServiceImplIT() {
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
     * Test of setTransferMonitor method, of class StatusServiceImpl.
     */
    @Test
    public void testSetTransferMonitor() {
        System.out.println("setTransferMonitor");
        TransferMonitor monitor = null;
        StatusServiceImpl instance = null;
        instance.setTransferMonitor(monitor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConsumerStatus method, of class StatusServiceImpl.
     */
    @Test
    public void testGetConsumerStatus() {
        System.out.println("getConsumerStatus");
        Long contentSetId = null;
        StatusServiceImpl instance = null;
        ConsumerStatus expResult = null;
        ConsumerStatus result = instance.getConsumerStatus(contentSetId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSupplierStatus method, of class StatusServiceImpl.
     */
    @Test
    public void testGetSupplierStatus() {
        System.out.println("getSupplierStatus");
        Long contentSetId = null;
        StatusServiceImpl instance = null;
        SupplierStatus expResult = null;
        SupplierStatus result = instance.getSupplierStatus(contentSetId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentSynchronizations method, of class StatusServiceImpl.
     */
    @Test
    public void testGetCurrentSynchronizations() {
        System.out.println("getCurrentSynchronizations");
        StatusServiceImpl instance = null;
        List<CurrentSynchronization> expResult = null;
        List<CurrentSynchronization> result = instance.getCurrentSynchronizations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
