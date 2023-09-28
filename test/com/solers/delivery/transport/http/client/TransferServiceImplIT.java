/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.http.client;

import com.solers.delivery.event.SynchronizationEvent;
import com.solers.delivery.transport.http.TransferStatus;
import com.solers.delivery.transport.http.client.util.CompressionRules;
import com.solers.delivery.transport.http.monitor.TransferMonitor;
import java.util.List;
import java.util.concurrent.Callable;
import org.apache.commons.httpclient.HttpClient;
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
public class TransferServiceImplIT {
    
    public TransferServiceImplIT() {
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
     * Test of toString method, of class TransferServiceImpl.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TransferServiceImpl instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class TransferServiceImpl.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        TransferServiceImpl instance = null;
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTransferMonitor method, of class TransferServiceImpl.
     */
    @Test
    public void testSetTransferMonitor() {
        System.out.println("setTransferMonitor");
        TransferMonitor transferMonitor = null;
        TransferServiceImpl instance = null;
        instance.setTransferMonitor(transferMonitor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompressionRules method, of class TransferServiceImpl.
     */
    @Test
    public void testSetCompressionRules() {
        System.out.println("setCompressionRules");
        CompressionRules compressionRules = null;
        TransferServiceImpl instance = null;
        instance.setCompressionRules(compressionRules);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class TransferServiceImpl.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        TransferServiceImpl instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRunning method, of class TransferServiceImpl.
     */
    @Test
    public void testIsRunning() {
        System.out.println("isRunning");
        TransferServiceImpl instance = null;
        boolean expResult = false;
        boolean result = instance.isRunning();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of process method, of class TransferServiceImpl.
     */
    @Test
    public void testProcess() {
        System.out.println("process");
        Transfer transfer = null;
        TransferServiceImpl instance = null;
        Transfer expResult = null;
        Transfer result = instance.process(transfer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentTransfers method, of class TransferServiceImpl.
     */
    @Test
    public void testGetCurrentTransfers() {
        System.out.println("getCurrentTransfers");
        TransferServiceImpl instance = null;
        List<TransferStatus> expResult = null;
        List<TransferStatus> result = instance.getCurrentTransfers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class TransferServiceImpl.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        SynchronizationEvent event = null;
        TransferServiceImpl instance = null;
        instance.start(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class TransferServiceImpl.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        SynchronizationEvent event = null;
        TransferServiceImpl instance = null;
        instance.stop(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMetrics method, of class TransferServiceImpl.
     */
    @Test
    public void testSendMetrics() {
        System.out.println("sendMetrics");
        long totalRequests = 0L;
        long totalBytes = 0L;
        TransferServiceImpl instance = null;
        instance.sendMetrics(totalRequests, totalBytes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClient method, of class TransferServiceImpl.
     */
    @Test
    public void testGetClient() {
        System.out.println("getClient");
        TransferServiceImpl instance = null;
        HttpClient expResult = null;
        HttpClient result = instance.getClient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTask method, of class TransferServiceImpl.
     */
    @Test
    public void testGetTask() {
        System.out.println("getTask");
        Transfer transfer = null;
        TransferServiceImpl instance = null;
        Callable<Transfer> expResult = null;
        Callable<Transfer> result = instance.getTask(transfer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
