/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.reports.history;

import com.solers.delivery.event.ContentEvent;
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
public class ReportDetailIT {
    
    public ReportDetailIT() {
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
     * Test of getPath method, of class ReportDetail.
     */
    @Test
    public void testGetPath() {
        System.out.println("getPath");
        ReportDetail instance = new ReportDetail();
        String expResult = "";
        String result = instance.getPath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPath method, of class ReportDetail.
     */
    @Test
    public void testSetPath() {
        System.out.println("setPath");
        String path = "";
        ReportDetail instance = new ReportDetail();
        instance.setPath(path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class ReportDetail.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        ReportDetail instance = new ReportDetail();
        long expResult = 0L;
        long result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSize method, of class ReportDetail.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        long size = 0L;
        ReportDetail instance = new ReportDetail();
        instance.setSize(size);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransferred method, of class ReportDetail.
     */
    @Test
    public void testGetTransferred() {
        System.out.println("getTransferred");
        ReportDetail instance = new ReportDetail();
        long expResult = 0L;
        long result = instance.getTransferred();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTransferred method, of class ReportDetail.
     */
    @Test
    public void testSetTransferred() {
        System.out.println("setTransferred");
        long transferred = 0L;
        ReportDetail instance = new ReportDetail();
        instance.setTransferred(transferred);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuccessful method, of class ReportDetail.
     */
    @Test
    public void testGetSuccessful() {
        System.out.println("getSuccessful");
        ReportDetail instance = new ReportDetail();
        long expResult = 0L;
        long result = instance.getSuccessful();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSuccessful method, of class ReportDetail.
     */
    @Test
    public void testSetSuccessful() {
        System.out.println("setSuccessful");
        long bytes = 0L;
        ReportDetail instance = new ReportDetail();
        instance.setSuccessful(bytes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFailed method, of class ReportDetail.
     */
    @Test
    public void testGetFailed() {
        System.out.println("getFailed");
        ReportDetail instance = new ReportDetail();
        long expResult = 0L;
        long result = instance.getFailed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFailed method, of class ReportDetail.
     */
    @Test
    public void testSetFailed() {
        System.out.println("setFailed");
        long bytes = 0L;
        ReportDetail instance = new ReportDetail();
        instance.setFailed(bytes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAction method, of class ReportDetail.
     */
    @Test
    public void testGetAction() {
        System.out.println("getAction");
        ReportDetail instance = new ReportDetail();
        String expResult = "";
        String result = instance.getAction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAction method, of class ReportDetail.
     */
    @Test
    public void testSetAction() {
        System.out.println("setAction");
        String action = "";
        ReportDetail instance = new ReportDetail();
        instance.setAction(action);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class ReportDetail.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        ReportDetail instance = new ReportDetail();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class ReportDetail.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        ReportDetail instance = new ReportDetail();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatusValue method, of class ReportDetail.
     */
    @Test
    public void testGetStatusValue() {
        System.out.println("getStatusValue");
        ReportDetail instance = new ReportDetail();
        ContentEvent.ContentEventResult expResult = null;
        ContentEvent.ContentEventResult result = instance.getStatusValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ReportDetail.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ReportDetail instance = new ReportDetail();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimestamp method, of class ReportDetail.
     */
    @Test
    public void testGetTimestamp() {
        System.out.println("getTimestamp");
        ReportDetail instance = new ReportDetail();
        long expResult = 0L;
        long result = instance.getTimestamp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimestamp method, of class ReportDetail.
     */
    @Test
    public void testSetTimestamp() {
        System.out.println("setTimestamp");
        long timestamp = 0L;
        ReportDetail instance = new ReportDetail();
        instance.setTimestamp(timestamp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSearchTime method, of class ReportDetail.
     */
    @Test
    public void testSetSearchTime() {
        System.out.println("setSearchTime");
        Date searchTime = null;
        ReportDetail instance = new ReportDetail();
        instance.setSearchTime(searchTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
