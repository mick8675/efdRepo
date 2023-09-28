/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.status;

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
public class ProgressIT {
    
    public ProgressIT() {
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
     * Test of getPercentComplete method, of class Progress.
     */
    @Test
    public void testGetPercentComplete() {
        System.out.println("getPercentComplete");
        Progress instance = new ProgressImpl();
        double expResult = 0.0;
        double result = instance.getPercentComplete();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalItems method, of class Progress.
     */
    @Test
    public void testGetTotalItems() {
        System.out.println("getTotalItems");
        Progress instance = new ProgressImpl();
        long expResult = 0L;
        long result = instance.getTotalItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalBytes method, of class Progress.
     */
    @Test
    public void testGetTotalBytes() {
        System.out.println("getTotalBytes");
        Progress instance = new ProgressImpl();
        long expResult = 0L;
        long result = instance.getTotalBytes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompletedBytes method, of class Progress.
     */
    @Test
    public void testGetCompletedBytes() {
        System.out.println("getCompletedBytes");
        Progress instance = new ProgressImpl();
        long expResult = 0L;
        long result = instance.getCompletedBytes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompletedItems method, of class Progress.
     */
    @Test
    public void testGetCompletedItems() {
        System.out.println("getCompletedItems");
        Progress instance = new ProgressImpl();
        long expResult = 0L;
        long result = instance.getCompletedItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastUpdateTime method, of class Progress.
     */
    @Test
    public void testGetLastUpdateTime() {
        System.out.println("getLastUpdateTime");
        Progress instance = new ProgressImpl();
        long expResult = 0L;
        long result = instance.getLastUpdateTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ProgressImpl implements Progress {

        public double getPercentComplete() {
            return 0.0;
        }

        public long getTotalItems() {
            return 0L;
        }

        public long getTotalBytes() {
            return 0L;
        }

        public long getCompletedBytes() {
            return 0L;
        }

        public long getCompletedItems() {
            return 0L;
        }

        public long getLastUpdateTime() {
            return 0L;
        }
    }

    public class ProgressImpl implements Progress {

        public double getPercentComplete() {
            return 0.0;
        }

        public long getTotalItems() {
            return 0L;
        }

        public long getTotalBytes() {
            return 0L;
        }

        public long getCompletedBytes() {
            return 0L;
        }

        public long getCompletedItems() {
            return 0L;
        }

        public long getLastUpdateTime() {
            return 0L;
        }
    }
    
}
