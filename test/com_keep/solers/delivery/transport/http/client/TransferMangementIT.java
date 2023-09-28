/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.http.client;

import com.solers.delivery.transport.http.client.util.Session;
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
public class TransferMangementIT {
    
    public TransferMangementIT() {
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
     * Test of sendStart method, of class TransferMangement.
     */
    @Test
    public void testSendStart() {
        System.out.println("sendStart");
        Session session = null;
        TransferMangement instance = null;
        instance.sendStart(session);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendStop method, of class TransferMangement.
     */
    @Test
    public void testSendStop() {
        System.out.println("sendStop");
        Session session = null;
        TransferMangement instance = null;
        instance.sendStop(session);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendHandshake method, of class TransferMangement.
     */
    @Test
    public void testSendHandshake() {
        System.out.println("sendHandshake");
        TransferMangement instance = null;
        String expResult = "";
        String result = instance.sendHandshake();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMetrics method, of class TransferMangement.
     */
    @Test
    public void testSendMetrics() {
        System.out.println("sendMetrics");
        Session session = null;
        long totalRequests = 0L;
        long totalBytes = 0L;
        TransferMangement instance = null;
        instance.sendMetrics(session, totalRequests, totalBytes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
