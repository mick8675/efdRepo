/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.http.server;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mortbay.jetty.servlet.Dispatcher;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class LegacyHandlerIT {
    
    public LegacyHandlerIT() {
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
     * Test of setContentDispatch method, of class LegacyHandler.
     */
    @Test
    public void testSetContentDispatch() {
        System.out.println("setContentDispatch");
        Dispatcher transportDispatch = null;
        LegacyHandler instance = new LegacyHandler();
        instance.setContentDispatch(transportDispatch);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEventDispatch method, of class LegacyHandler.
     */
    @Test
    public void testSetEventDispatch() {
        System.out.println("setEventDispatch");
        Dispatcher eventDispatch = null;
        LegacyHandler instance = new LegacyHandler();
        instance.setEventDispatch(eventDispatch);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handle method, of class LegacyHandler.
     */
    @Test
    public void testHandle() throws Exception {
        System.out.println("handle");
        String arg0 = "";
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        int arg3 = 0;
        LegacyHandler instance = new LegacyHandler();
        instance.handle(arg0, request, response, arg3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
