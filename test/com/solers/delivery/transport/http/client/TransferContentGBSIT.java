/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.http.client;

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
public class TransferContentGBSIT {
    
    public TransferContentGBSIT() {
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
     * Test of toString method, of class TransferContentGBS.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TransferContentGBS instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHttpMethod method, of class TransferContentGBS.
     */
    @Test
    public void testGetHttpMethod() {
        System.out.println("getHttpMethod");
        TransferContentGBS instance = null;
        HttpMethod expResult = null;
        HttpMethod result = instance.getHttpMethod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesTransferred method, of class TransferContentGBS.
     */
    @Test
    public void testGetBytesTransferred() {
        System.out.println("getBytesTransferred");
        TransferContentGBS instance = null;
        long expResult = 0L;
        long result = instance.getBytesTransferred();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesRequested method, of class TransferContentGBS.
     */
    @Test
    public void testGetBytesRequested() {
        System.out.println("getBytesRequested");
        TransferContentGBS instance = null;
        long expResult = 0L;
        long result = instance.getBytesRequested();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
