/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.supplier;

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
public class SupplierTaskIT {
    
    public SupplierTaskIT() {
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
     * Test of setTransferMonitor method, of class SupplierTask.
     */
    @Test
    public void testSetTransferMonitor() {
        System.out.println("setTransferMonitor");
        TransferMonitor transferMonitor = null;
        SupplierTask instance = null;
        instance.setTransferMonitor(transferMonitor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentSetId method, of class SupplierTask.
     */
    @Test
    public void testGetContentSetId() {
        System.out.println("getContentSetId");
        SupplierTask instance = null;
        Long expResult = null;
        Long result = instance.getContentSetId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SupplierTask.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SupplierTask instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class SupplierTask.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        SupplierTask instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentSynchronizations method, of class SupplierTask.
     */
    @Test
    public void testGetCurrentSynchronizations() {
        System.out.println("getCurrentSynchronizations");
        SupplierTask instance = null;
        List<CurrentSynchronization> expResult = null;
        List<CurrentSynchronization> result = instance.getCurrentSynchronizations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEnabled method, of class SupplierTask.
     */
    @Test
    public void testIsEnabled() {
        System.out.println("isEnabled");
        SupplierTask instance = null;
        boolean expResult = false;
        boolean result = instance.isEnabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemCount method, of class SupplierTask.
     */
    @Test
    public void testGetItemCount() {
        System.out.println("getItemCount");
        SupplierTask instance = null;
        long expResult = 0L;
        long result = instance.getItemCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastRuntime method, of class SupplierTask.
     */
    @Test
    public void testGetLastRuntime() {
        System.out.println("getLastRuntime");
        SupplierTask instance = null;
        long expResult = 0L;
        long result = instance.getLastRuntime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextEstimatedRuntime method, of class SupplierTask.
     */
    @Test
    public void testGetNextEstimatedRuntime() {
        System.out.println("getNextEstimatedRuntime");
        SupplierTask instance = null;
        long expResult = 0L;
        long result = instance.getNextEstimatedRuntime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class SupplierTask.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        SupplierTask instance = null;
        long expResult = 0L;
        long result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getState method, of class SupplierTask.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        SupplierTask instance = null;
        String expResult = "";
        String result = instance.getState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
