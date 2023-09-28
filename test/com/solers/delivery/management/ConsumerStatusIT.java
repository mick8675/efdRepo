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
public class ConsumerStatusIT {
    
    public ConsumerStatusIT() {
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
     * Test of getPercentCompleted method, of class ConsumerStatus.
     */
    @Test
    public void testGetPercentCompleted() {
        System.out.println("getPercentCompleted");
        ConsumerStatus instance = new ConsumerStatusImpl();
        double expResult = 0.0;
        double result = instance.getPercentCompleted();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getState method, of class ConsumerStatus.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        ConsumerStatus instance = new ConsumerStatusImpl();
        String expResult = "";
        String result = instance.getState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemCount method, of class ConsumerStatus.
     */
    @Test
    public void testGetItemCount() {
        System.out.println("getItemCount");
        ConsumerStatus instance = new ConsumerStatusImpl();
        long expResult = 0L;
        long result = instance.getItemCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class ConsumerStatus.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        ConsumerStatus instance = new ConsumerStatusImpl();
        long expResult = 0L;
        long result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastRuntime method, of class ConsumerStatus.
     */
    @Test
    public void testGetLastRuntime() {
        System.out.println("getLastRuntime");
        ConsumerStatus instance = new ConsumerStatusImpl();
        long expResult = 0L;
        long result = instance.getLastRuntime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEnabled method, of class ConsumerStatus.
     */
    @Test
    public void testIsEnabled() {
        System.out.println("isEnabled");
        ConsumerStatus instance = new ConsumerStatusImpl();
        boolean expResult = false;
        boolean result = instance.isEnabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getElapsedTime method, of class ConsumerStatus.
     */
    @Test
    public void testGetElapsedTime() {
        System.out.println("getElapsedTime");
        ConsumerStatus instance = new ConsumerStatusImpl();
        long expResult = 0L;
        long result = instance.getElapsedTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextEstimatedRuntime method, of class ConsumerStatus.
     */
    @Test
    public void testGetNextEstimatedRuntime() {
        System.out.println("getNextEstimatedRuntime");
        ConsumerStatus instance = new ConsumerStatusImpl();
        long expResult = 0L;
        long result = instance.getNextEstimatedRuntime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRemainingTime method, of class ConsumerStatus.
     */
    @Test
    public void testGetRemainingTime() {
        System.out.println("getRemainingTime");
        ConsumerStatus instance = new ConsumerStatusImpl();
        long expResult = 0L;
        long result = instance.getRemainingTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentTransfers method, of class ConsumerStatus.
     */
    @Test
    public void testGetCurrentTransfers() {
        System.out.println("getCurrentTransfers");
        ConsumerStatus instance = new ConsumerStatusImpl();
        List<TransferStatus> expResult = null;
        List<TransferStatus> result = instance.getCurrentTransfers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAdded method, of class ConsumerStatus.
     */
    @Test
    public void testGetItemsAdded() {
        System.out.println("getItemsAdded");
        ConsumerStatus instance = new ConsumerStatusImpl();
        long expResult = 0L;
        long result = instance.getItemsAdded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsUpdated method, of class ConsumerStatus.
     */
    @Test
    public void testGetItemsUpdated() {
        System.out.println("getItemsUpdated");
        ConsumerStatus instance = new ConsumerStatusImpl();
        long expResult = 0L;
        long result = instance.getItemsUpdated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsDeleted method, of class ConsumerStatus.
     */
    @Test
    public void testGetItemsDeleted() {
        System.out.println("getItemsDeleted");
        ConsumerStatus instance = new ConsumerStatusImpl();
        long expResult = 0L;
        long result = instance.getItemsDeleted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAddedRemaining method, of class ConsumerStatus.
     */
    @Test
    public void testGetItemsAddedRemaining() {
        System.out.println("getItemsAddedRemaining");
        ConsumerStatus instance = new ConsumerStatusImpl();
        long expResult = 0L;
        long result = instance.getItemsAddedRemaining();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsUpdatedRemaining method, of class ConsumerStatus.
     */
    @Test
    public void testGetItemsUpdatedRemaining() {
        System.out.println("getItemsUpdatedRemaining");
        ConsumerStatus instance = new ConsumerStatusImpl();
        long expResult = 0L;
        long result = instance.getItemsUpdatedRemaining();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsDeletedRemaining method, of class ConsumerStatus.
     */
    @Test
    public void testGetItemsDeletedRemaining() {
        System.out.println("getItemsDeletedRemaining");
        ConsumerStatus instance = new ConsumerStatusImpl();
        long expResult = 0L;
        long result = instance.getItemsDeletedRemaining();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesAdded method, of class ConsumerStatus.
     */
    @Test
    public void testGetBytesAdded() {
        System.out.println("getBytesAdded");
        ConsumerStatus instance = new ConsumerStatusImpl();
        long expResult = 0L;
        long result = instance.getBytesAdded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesUpdated method, of class ConsumerStatus.
     */
    @Test
    public void testGetBytesUpdated() {
        System.out.println("getBytesUpdated");
        ConsumerStatus instance = new ConsumerStatusImpl();
        long expResult = 0L;
        long result = instance.getBytesUpdated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesDeleted method, of class ConsumerStatus.
     */
    @Test
    public void testGetBytesDeleted() {
        System.out.println("getBytesDeleted");
        ConsumerStatus instance = new ConsumerStatusImpl();
        long expResult = 0L;
        long result = instance.getBytesDeleted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesAddedRemaining method, of class ConsumerStatus.
     */
    @Test
    public void testGetBytesAddedRemaining() {
        System.out.println("getBytesAddedRemaining");
        ConsumerStatus instance = new ConsumerStatusImpl();
        long expResult = 0L;
        long result = instance.getBytesAddedRemaining();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesUpdatedRemaining method, of class ConsumerStatus.
     */
    @Test
    public void testGetBytesUpdatedRemaining() {
        System.out.println("getBytesUpdatedRemaining");
        ConsumerStatus instance = new ConsumerStatusImpl();
        long expResult = 0L;
        long result = instance.getBytesUpdatedRemaining();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesDeletedRemaining method, of class ConsumerStatus.
     */
    @Test
    public void testGetBytesDeletedRemaining() {
        System.out.println("getBytesDeletedRemaining");
        ConsumerStatus instance = new ConsumerStatusImpl();
        long expResult = 0L;
        long result = instance.getBytesDeletedRemaining();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFailures method, of class ConsumerStatus.
     */
    @Test
    public void testGetFailures() {
        System.out.println("getFailures");
        ConsumerStatus instance = new ConsumerStatusImpl();
        long expResult = 0L;
        long result = instance.getFailures();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesFailed method, of class ConsumerStatus.
     */
    @Test
    public void testGetBytesFailed() {
        System.out.println("getBytesFailed");
        ConsumerStatus instance = new ConsumerStatusImpl();
        long expResult = 0L;
        long result = instance.getBytesFailed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ConsumerStatusImpl implements ConsumerStatus {

        public double getPercentCompleted() {
            return 0.0;
        }

        public String getState() {
            return "";
        }

        public long getItemCount() {
            return 0L;
        }

        public long getSize() {
            return 0L;
        }

        public long getLastRuntime() {
            return 0L;
        }

        public boolean isEnabled() {
            return false;
        }

        public long getElapsedTime() {
            return 0L;
        }

        public long getNextEstimatedRuntime() {
            return 0L;
        }

        public long getRemainingTime() {
            return 0L;
        }

        public List<TransferStatus> getCurrentTransfers() {
            return null;
        }

        public long getItemsAdded() {
            return 0L;
        }

        public long getItemsUpdated() {
            return 0L;
        }

        public long getItemsDeleted() {
            return 0L;
        }

        public long getItemsAddedRemaining() {
            return 0L;
        }

        public long getItemsUpdatedRemaining() {
            return 0L;
        }

        public long getItemsDeletedRemaining() {
            return 0L;
        }

        public long getBytesAdded() {
            return 0L;
        }

        public long getBytesUpdated() {
            return 0L;
        }

        public long getBytesDeleted() {
            return 0L;
        }

        public long getBytesAddedRemaining() {
            return 0L;
        }

        public long getBytesUpdatedRemaining() {
            return 0L;
        }

        public long getBytesDeletedRemaining() {
            return 0L;
        }

        public long getFailures() {
            return 0L;
        }

        public long getBytesFailed() {
            return 0L;
        }
    }
    
}
