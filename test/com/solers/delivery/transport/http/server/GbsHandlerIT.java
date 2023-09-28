/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.http.server;

import com.solers.delivery.transport.http.monitor.TransferMonitor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
public class GbsHandlerIT {
    
    public GbsHandlerIT() {
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
     * Test of setTransferMonitor method, of class GbsHandler.
     */
    @Test
    public void testSetTransferMonitor() {
        System.out.println("setTransferMonitor");
        TransferMonitor transfers = null;
        GbsHandler instance = null;
        instance.setTransferMonitor(transfers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class GbsHandler.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        GbsHandler instance = null;
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handle method, of class GbsHandler.
     */
    @Test
    public void testHandle() throws Exception {
        System.out.println("handle");
        String arg0 = "";
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        int arg3 = 0;
        GbsHandler instance = null;
        instance.handle(arg0, request, response, arg3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
