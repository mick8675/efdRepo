/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.rest.connectors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mortbay.jetty.AbstractConnector;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class JettySslHelperIT {
    
    public JettySslHelperIT() {
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
     * Test of createConnector method, of class JettySslHelper.
     */
    @Test
    public void testCreateConnector() {
        System.out.println("createConnector");
        JettySslHelper instance = new JettySslHelper();
        AbstractConnector expResult = null;
        AbstractConnector result = instance.createConnector();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
