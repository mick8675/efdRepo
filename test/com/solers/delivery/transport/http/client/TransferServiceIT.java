/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.http.client;

import com.solers.delivery.event.SynchronizationEvent;
import com.solers.delivery.transport.http.TransferStatus;
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
public class TransferServiceIT {
    
    public TransferServiceIT() {
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
     * Test of process method, of class TransferService.
     */
    @Test
    public void testProcess() {
        System.out.println("process");
        Transfer transfer = null;
        TransferService instance = new TransferServiceImpl();
        Transfer expResult = null;
        Transfer result = instance.process(transfer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class TransferService.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        SynchronizationEvent event = null;
        TransferService instance = new TransferServiceImpl();
        instance.start(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class TransferService.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        SynchronizationEvent event = null;
        TransferService instance = new TransferServiceImpl();
        instance.stop(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMetrics method, of class TransferService.
     */
    @Test
    public void testSendMetrics() {
        System.out.println("sendMetrics");
        long totalRequests = 0L;
        long totalBytes = 0L;
        TransferService instance = new TransferServiceImpl();
        instance.sendMetrics(totalRequests, totalBytes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentTransfers method, of class TransferService.
     */
    @Test
    public void testGetCurrentTransfers() {
        System.out.println("getCurrentTransfers");
        TransferService instance = new TransferServiceImpl();
        List<TransferStatus> expResult = null;
        List<TransferStatus> result = instance.getCurrentTransfers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TransferServiceImpl implements TransferService {

        public Transfer process(Transfer transfer) {
            return null;
        }

        public void start(SynchronizationEvent event) {
        }

        public void stop(SynchronizationEvent event) {
        }

        public void sendMetrics(long totalRequests, long totalBytes) {
        }

        public List<TransferStatus> getCurrentTransfers() {
            return null;
        }
    }
    
}
