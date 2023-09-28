/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.http.server;

import com.solers.delivery.event.EventManager;
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
public class FileHandlerIT {
    
    public FileHandlerIT() {
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
     * Test of setEventMgr method, of class FileHandler.
     */
    @Test
    public void testSetEventMgr() {
        System.out.println("setEventMgr");
        EventManager eventMgr = null;
        FileHandler instance = new FileHandler();
        instance.setEventMgr(eventMgr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTransferMonitor method, of class FileHandler.
     */
    @Test
    public void testSetTransferMonitor() {
        System.out.println("setTransferMonitor");
        TransferMonitor transfers = null;
        FileHandler instance = new FileHandler();
        instance.setTransferMonitor(transfers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handle method, of class FileHandler.
     */
    @Test
    public void testHandle() throws Exception {
        System.out.println("handle");
        String target = "";
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        int dispatch = 0;
        FileHandler instance = new FileHandler();
        instance.handle(target, request, response, dispatch);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
