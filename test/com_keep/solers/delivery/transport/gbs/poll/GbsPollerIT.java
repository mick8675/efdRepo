/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.gbs.poll;

import com.solers.delivery.transport.gbs.GbsTransferStatus;
import java.io.File;
import java.util.List;
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
public class GbsPollerIT {
    
    public GbsPollerIT() {
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
     * Test of start method, of class GbsPoller.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        GbsPoller instance = null;
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class GbsPoller.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        GbsPoller instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class GbsPoller.
     */
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        GbsPoller instance = null;
        instance.destroy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFile method, of class GbsPoller.
     */
    @Test
    public void testRemoveFile() {
        System.out.println("removeFile");
        File file = null;
        GbsPoller.removeFile(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class GbsPoller.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        GbsPoller instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class GbsPoller.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        GbsPoller instance = null;
        List<GbsTransferStatus> expResult = null;
        List<GbsTransferStatus> result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRunning method, of class GbsPoller.
     */
    @Test
    public void testIsRunning() {
        System.out.println("isRunning");
        GbsPoller instance = null;
        boolean expResult = false;
        boolean result = instance.isRunning();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfFiles method, of class GbsPoller.
     */
    @Test
    public void testGetNumberOfFiles() {
        System.out.println("getNumberOfFiles");
        GbsPoller instance = null;
        int expResult = 0;
        int result = instance.getNumberOfFiles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfFilesCompleted method, of class GbsPoller.
     */
    @Test
    public void testGetNumberOfFilesCompleted() {
        System.out.println("getNumberOfFilesCompleted");
        GbsPoller instance = null;
        int expResult = 0;
        int result = instance.getNumberOfFilesCompleted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doStart method, of class GbsPoller.
     */
    @Test
    public void testDoStart() {
        System.out.println("doStart");
        Long id = null;
        GbsPoller instance = null;
        instance.doStart(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doStop method, of class GbsPoller.
     */
    @Test
    public void testDoStop() {
        System.out.println("doStop");
        Long id = null;
        GbsPoller instance = null;
        instance.doStop(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
