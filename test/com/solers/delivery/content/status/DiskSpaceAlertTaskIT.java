/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.status;

import java.io.File;
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
public class DiskSpaceAlertTaskIT {
    
    public DiskSpaceAlertTaskIT() {
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
     * Test of run method, of class DiskSpaceAlertTask.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        DiskSpaceAlertTask instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFreeSpace method, of class DiskSpaceAlertTask.
     */
    @Test
    public void testGetFreeSpace() {
        System.out.println("getFreeSpace");
        File path = null;
        DiskSpaceAlertTask instance = null;
        long expResult = 0L;
        long result = instance.getFreeSpace(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalSpace method, of class DiskSpaceAlertTask.
     */
    @Test
    public void testGetTotalSpace() {
        System.out.println("getTotalSpace");
        File path = null;
        DiskSpaceAlertTask instance = null;
        long expResult = 0L;
        long result = instance.getTotalSpace(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
