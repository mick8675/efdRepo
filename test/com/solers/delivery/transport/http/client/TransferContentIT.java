/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.http.client;

import com.solers.delivery.transport.http.client.util.CompressionRules;
import java.io.File;
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
public class TransferContentIT {
    
    public TransferContentIT() {
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
     * Test of getBytesRequested method, of class TransferContent.
     */
    @Test
    public void testGetBytesRequested() {
        System.out.println("getBytesRequested");
        TransferContent instance = null;
        long expResult = 0L;
        long result = instance.getBytesRequested();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TransferContent.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TransferContent instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHttpMethod method, of class TransferContent.
     */
    @Test
    public void testGetHttpMethod() {
        System.out.println("getHttpMethod");
        TransferContent instance = null;
        HttpMethod expResult = null;
        HttpMethod result = instance.getHttpMethod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cleanup method, of class TransferContent.
     */
    @Test
    public void testCleanup() {
        System.out.println("cleanup");
        TransferContent instance = null;
        instance.cleanup();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCompressionRules method, of class TransferContent.
     */
    @Test
    public void testAddCompressionRules() {
        System.out.println("addCompressionRules");
        CompressionRules compression = null;
        TransferContent instance = null;
        instance.addCompressionRules(compression);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFile method, of class TransferContent.
     */
    @Test
    public void testSetFile() {
        System.out.println("setFile");
        File file = null;
        TransferContent instance = null;
        instance.setFile(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFile method, of class TransferContent.
     */
    @Test
    public void testGetFile() {
        System.out.println("getFile");
        TransferContent instance = null;
        File expResult = null;
        File result = instance.getFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
