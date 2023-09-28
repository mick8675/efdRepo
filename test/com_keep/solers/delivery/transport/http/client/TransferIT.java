/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.http.client;

import com.solers.delivery.transport.http.TransferType;
import com.solers.delivery.transport.http.client.util.Session;
import com.solers.util.Callback;
import org.apache.commons.httpclient.HttpMethod;
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
public class TransferIT {
    
    public TransferIT() {
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
     * Test of getSession method, of class Transfer.
     */
    @Test
    public void testGetSession() {
        System.out.println("getSession");
        Transfer instance = null;
        Session expResult = null;
        Session result = instance.getSession();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSession method, of class Transfer.
     */
    @Test
    public void testSetSession() {
        System.out.println("setSession");
        Session session = null;
        Transfer instance = null;
        instance.setSession(session);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHttpMethod method, of class Transfer.
     */
    @Test
    public void testGetHttpMethod() {
        System.out.println("getHttpMethod");
        Transfer instance = null;
        HttpMethod expResult = null;
        HttpMethod result = instance.getHttpMethod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransferType method, of class Transfer.
     */
    @Test
    public void testGetTransferType() {
        System.out.println("getTransferType");
        Transfer instance = null;
        TransferType expResult = null;
        TransferType result = instance.getTransferType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTransferType method, of class Transfer.
     */
    @Test
    public void testSetTransferType() {
        System.out.println("setTransferType");
        TransferType type = null;
        Transfer instance = null;
        instance.setTransferType(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFileName method, of class Transfer.
     */
    @Test
    public void testGetFileName() {
        System.out.println("getFileName");
        Transfer instance = null;
        String expResult = "";
        String result = instance.getFileName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPercentComplete method, of class Transfer.
     */
    @Test
    public void testGetPercentComplete() {
        System.out.println("getPercentComplete");
        Transfer instance = null;
        double expResult = 0.0;
        double result = instance.getPercentComplete();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBytesTransferred method, of class Transfer.
     */
    @Test
    public void testSetBytesTransferred() {
        System.out.println("setBytesTransferred");
        long bytesTransferred = 0L;
        Transfer instance = null;
        instance.setBytesTransferred(bytesTransferred);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBytesTransferred method, of class Transfer.
     */
    @Test
    public void testAddBytesTransferred() {
        System.out.println("addBytesTransferred");
        long bytes = 0L;
        Transfer instance = null;
        instance.addBytesTransferred(bytes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesTransferred method, of class Transfer.
     */
    @Test
    public void testGetBytesTransferred() {
        System.out.println("getBytesTransferred");
        Transfer instance = null;
        long expResult = 0L;
        long result = instance.getBytesTransferred();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Transfer.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Transfer instance = null;
        Transfer.Status expResult = null;
        Transfer.Status result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocalPath method, of class Transfer.
     */
    @Test
    public void testGetLocalPath() {
        System.out.println("getLocalPath");
        Transfer instance = null;
        String expResult = "";
        String result = instance.getLocalPath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Transfer.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        Transfer.Status status = null;
        Transfer instance = null;
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatusCleanup method, of class Transfer.
     */
    @Test
    public void testSetStatusCleanup() {
        System.out.println("setStatusCleanup");
        Transfer.Status status = null;
        Transfer instance = null;
        instance.setStatusCleanup(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cleanup method, of class Transfer.
     */
    @Test
    public void testCleanup() {
        System.out.println("cleanup");
        Transfer instance = null;
        instance.cleanup();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of failed method, of class Transfer.
     */
    @Test
    public void testFailed() {
        System.out.println("failed");
        Transfer instance = null;
        boolean expResult = false;
        boolean result = instance.failed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataReceivedCallback method, of class Transfer.
     */
    @Test
    public void testSetDataReceivedCallback() {
        System.out.println("setDataReceivedCallback");
        Callback<Long> dataReceivedCallback = null;
        Transfer instance = null;
        instance.setDataReceivedCallback(dataReceivedCallback);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TransferImpl extends Transfer {

        public TransferImpl() {
            super("", "", "", "");
        }

        public HttpMethod getHttpMethod() {
            return null;
        }
    }

    public class TransferImpl extends Transfer {

        public TransferImpl() {
            super("", "", "", "");
        }

        public HttpMethod getHttpMethod() {
            return null;
        }
    }
    
}
