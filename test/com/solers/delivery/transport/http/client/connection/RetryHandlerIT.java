/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.http.client.connection;

import java.io.IOException;
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
public class RetryHandlerIT {
    
    public RetryHandlerIT() {
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
     * Test of retryMethod method, of class RetryHandler.
     */
    @Test
    public void testRetryMethod() {
        System.out.println("retryMethod");
        HttpMethod method = null;
        IOException exception = null;
        int executionCount = 0;
        RetryHandler instance = null;
        boolean expResult = false;
        boolean result = instance.retryMethod(method, exception, executionCount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
