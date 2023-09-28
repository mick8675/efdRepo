/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.management;

import com.solers.delivery.transport.gbs.GbsTransferStatus;
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
public class GbsPollerStatusIT {
    
    public GbsPollerStatusIT() {
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
     * Test of getStatus method, of class GbsPollerStatus.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        GbsPollerStatus instance = new GbsPollerStatusImpl();
        List<GbsTransferStatus> expResult = null;
        List<GbsTransferStatus> result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfFiles method, of class GbsPollerStatus.
     */
    @Test
    public void testGetNumberOfFiles() {
        System.out.println("getNumberOfFiles");
        GbsPollerStatus instance = new GbsPollerStatusImpl();
        int expResult = 0;
        int result = instance.getNumberOfFiles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfFilesCompleted method, of class GbsPollerStatus.
     */
    @Test
    public void testGetNumberOfFilesCompleted() {
        System.out.println("getNumberOfFilesCompleted");
        GbsPollerStatus instance = new GbsPollerStatusImpl();
        int expResult = 0;
        int result = instance.getNumberOfFilesCompleted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRunning method, of class GbsPollerStatus.
     */
    @Test
    public void testIsRunning() {
        System.out.println("isRunning");
        GbsPollerStatus instance = new GbsPollerStatusImpl();
        boolean expResult = false;
        boolean result = instance.isRunning();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GbsPollerStatusImpl implements GbsPollerStatus {

        public List<GbsTransferStatus> getStatus() {
            return null;
        }

        public int getNumberOfFiles() {
            return 0;
        }

        public int getNumberOfFilesCompleted() {
            return 0;
        }

        public boolean isRunning() {
            return false;
        }
    }
    
}
