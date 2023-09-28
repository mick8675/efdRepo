/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.management;

import com.solers.delivery.transport.http.TransferStatus;
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
public class TransferServiceStatusIT {
    
    public TransferServiceStatusIT() {
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
     * Test of getCurrentTransfers method, of class TransferServiceStatus.
     */
    @Test
    public void testGetCurrentTransfers() {
        System.out.println("getCurrentTransfers");
        TransferServiceStatus instance = new TransferServiceStatusImpl();
        List<TransferStatus> expResult = null;
        List<TransferStatus> result = instance.getCurrentTransfers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRunning method, of class TransferServiceStatus.
     */
    @Test
    public void testIsRunning() {
        System.out.println("isRunning");
        TransferServiceStatus instance = new TransferServiceStatusImpl();
        boolean expResult = false;
        boolean result = instance.isRunning();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TransferServiceStatusImpl implements TransferServiceStatus {

        public List<TransferStatus> getCurrentTransfers() {
            return null;
        }

        public boolean isRunning() {
            return false;
        }
    }

    public class TransferServiceStatusImpl implements TransferServiceStatus {

        public List<TransferStatus> getCurrentTransfers() {
            return null;
        }

        public boolean isRunning() {
            return false;
        }
    }
    
}
