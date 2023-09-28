/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.management;

import com.solers.delivery.content.status.CurrentSynchronization;
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
public class SupplierStatusIT {
    
    public SupplierStatusIT() {
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
     * Test of isEnabled method, of class SupplierStatus.
     */
    @Test
    public void testIsEnabled() {
        System.out.println("isEnabled");
        SupplierStatus instance = new SupplierStatusImpl();
        boolean expResult = false;
        boolean result = instance.isEnabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class SupplierStatus.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        SupplierStatus instance = new SupplierStatusImpl();
        long expResult = 0L;
        long result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemCount method, of class SupplierStatus.
     */
    @Test
    public void testGetItemCount() {
        System.out.println("getItemCount");
        SupplierStatus instance = new SupplierStatusImpl();
        long expResult = 0L;
        long result = instance.getItemCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastRuntime method, of class SupplierStatus.
     */
    @Test
    public void testGetLastRuntime() {
        System.out.println("getLastRuntime");
        SupplierStatus instance = new SupplierStatusImpl();
        long expResult = 0L;
        long result = instance.getLastRuntime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextEstimatedRuntime method, of class SupplierStatus.
     */
    @Test
    public void testGetNextEstimatedRuntime() {
        System.out.println("getNextEstimatedRuntime");
        SupplierStatus instance = new SupplierStatusImpl();
        long expResult = 0L;
        long result = instance.getNextEstimatedRuntime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getState method, of class SupplierStatus.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        SupplierStatus instance = new SupplierStatusImpl();
        String expResult = "";
        String result = instance.getState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentSynchronizations method, of class SupplierStatus.
     */
    @Test
    public void testGetCurrentSynchronizations() {
        System.out.println("getCurrentSynchronizations");
        SupplierStatus instance = new SupplierStatusImpl();
        List<CurrentSynchronization> expResult = null;
        List<CurrentSynchronization> result = instance.getCurrentSynchronizations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class SupplierStatusImpl implements SupplierStatus {

        public boolean isEnabled() {
            return false;
        }

        public long getSize() {
            return 0L;
        }

        public long getItemCount() {
            return 0L;
        }

        public long getLastRuntime() {
            return 0L;
        }

        public long getNextEstimatedRuntime() {
            return 0L;
        }

        public String getState() {
            return "";
        }

        public List<CurrentSynchronization> getCurrentSynchronizations() {
            return null;
        }
    }
    
}
