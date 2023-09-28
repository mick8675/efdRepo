/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory;

import com.solers.delivery.domain.ConsumerContentSet;
import com.solers.delivery.domain.ContentSet;
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
public class InventoryPathCreatorIT {
    
    public InventoryPathCreatorIT() {
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
     * Test of getRuntimeDirectory method, of class InventoryPathCreator.
     */
    @Test
    public void testGetRuntimeDirectory() {
        System.out.println("getRuntimeDirectory");
        InventoryPathCreator instance = null;
        String expResult = "";
        String result = instance.getRuntimeDirectory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentSetLocation method, of class InventoryPathCreator.
     */
    @Test
    public void testGetContentSetLocation() {
        System.out.println("getContentSetLocation");
        ContentSet config = null;
        InventoryPathCreator instance = null;
        File expResult = null;
        File result = instance.getContentSetLocation(config);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPackagedInventory method, of class InventoryPathCreator.
     */
    @Test
    public void testGetPackagedInventory() {
        System.out.println("getPackagedInventory");
        ContentSet config = null;
        InventoryPathCreator instance = null;
        File expResult = null;
        File result = instance.getPackagedInventory(config);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPackagedInventoryFile method, of class InventoryPathCreator.
     */
    @Test
    public void testGetPackagedInventoryFile() {
        System.out.println("getPackagedInventoryFile");
        ConsumerContentSet config = null;
        InventoryPathCreator instance = null;
        File expResult = null;
        File result = instance.getPackagedInventoryFile(config);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpenInventory method, of class InventoryPathCreator.
     */
    @Test
    public void testGetOpenInventory() {
        System.out.println("getOpenInventory");
        ContentSet config = null;
        InventoryPathCreator instance = null;
        File expResult = null;
        File result = instance.getOpenInventory(config);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
