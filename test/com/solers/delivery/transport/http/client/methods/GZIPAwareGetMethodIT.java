/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.http.client.methods;

import org.apache.commons.httpclient.HttpConnection;
import org.apache.commons.httpclient.HttpState;
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
public class GZIPAwareGetMethodIT {
    
    public GZIPAwareGetMethodIT() {
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
     * Test of execute method, of class GZIPAwareGetMethod.
     */
    @Test
    public void testExecute() throws Exception {
        System.out.println("execute");
        HttpState state = null;
        HttpConnection conn = null;
        GZIPAwareGetMethod instance = null;
        int expResult = 0;
        int result = instance.execute(state, conn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readResponseBody method, of class GZIPAwareGetMethod.
     */
    @Test
    public void testReadResponseBody() throws Exception {
        System.out.println("readResponseBody");
        HttpState state = null;
        HttpConnection conn = null;
        GZIPAwareGetMethod instance = null;
        instance.readResponseBody(state, conn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
