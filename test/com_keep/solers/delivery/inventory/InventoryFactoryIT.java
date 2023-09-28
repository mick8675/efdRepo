/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory;

import com.solers.delivery.domain.ConsumerContentSet;
import com.solers.delivery.domain.ContentSet;
import java.io.File;
import java.net.URI;
import java.util.Date;
import java.util.Map;
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
public class InventoryFactoryIT {
    
    public InventoryFactoryIT() {
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
     * Test of setSiteDirectory method, of class InventoryFactory.
     */
    @Test
    public void testSetSiteDirectory() {
        System.out.println("setSiteDirectory");
        String siteDirectory = "";
        InventoryFactory.setSiteDirectory(siteDirectory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cleanup method, of class InventoryFactory.
     */
    @Test
    public void testCleanup() {
        System.out.println("cleanup");
        ContentSet contentset = null;
        InventoryFactory.cleanup(contentset);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPackageLocation method, of class InventoryFactory.
     */
    @Test
    public void testGetPackageLocation() {
        System.out.println("getPackageLocation");
        ContentSet contentset = null;
        File expResult = null;
        File result = InventoryFactory.getPackageLocation(contentset);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPackage method, of class InventoryFactory.
     */
    @Test
    public void testGetPackage() {
        System.out.println("getPackage");
        ConsumerContentSet contentset = null;
        File expResult = null;
        File result = InventoryFactory.getPackage(contentset);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpenLocation method, of class InventoryFactory.
     */
    @Test
    public void testGetOpenLocation() {
        System.out.println("getOpenLocation");
        ContentSet contentset = null;
        File expResult = null;
        File result = InventoryFactory.getOpenLocation(contentset);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInventoryFile method, of class InventoryFactory.
     */
    @Test
    public void testGetInventoryFile() {
        System.out.println("getInventoryFile");
        ContentSet contentset = null;
        File expResult = null;
        File result = InventoryFactory.getInventoryFile(contentset);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInventoryFileTimestamp method, of class InventoryFactory.
     */
    @Test
    public void testGetInventoryFileTimestamp() {
        System.out.println("getInventoryFileTimestamp");
        ContentSet contentSet = null;
        Date expResult = null;
        Date result = InventoryFactory.getInventoryFileTimestamp(contentSet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createInventory method, of class InventoryFactory.
     */
    @Test
    public void testCreateInventory() throws Exception {
        System.out.println("createInventory");
        ContentSet contentset = null;
        long expResult = 0L;
        long result = InventoryFactory.createInventory(contentset);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInventory method, of class InventoryFactory.
     */
    @Test
    public void testGetInventory_ContentSet() {
        System.out.println("getInventory");
        ContentSet contentset = null;
        Inventory expResult = null;
        Inventory result = InventoryFactory.getInventory(contentset);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInventory method, of class InventoryFactory.
     */
    @Test
    public void testGetInventory_ContentSet_boolean() {
        System.out.println("getInventory");
        ContentSet contentset = null;
        boolean useFilter = false;
        Inventory expResult = null;
        Inventory result = InventoryFactory.getInventory(contentset, useFilter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBackingInventory method, of class InventoryFactory.
     */
    @Test
    public void testGetBackingInventory_ConsumerContentSet_String() throws Exception {
        System.out.println("getBackingInventory");
        ConsumerContentSet cs = null;
        String rootName = "";
        Inventory expResult = null;
        Inventory result = InventoryFactory.getBackingInventory(cs, rootName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBackingInventory method, of class InventoryFactory.
     */
    @Test
    public void testGetBackingInventory_File_String() {
        System.out.println("getBackingInventory");
        File rootDirectory = null;
        String rootName = "";
        Inventory expResult = null;
        Inventory result = InventoryFactory.getBackingInventory(rootDirectory, rootName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBackingInventory method, of class InventoryFactory.
     */
    @Test
    public void testGetBackingInventory_URI() throws Exception {
        System.out.println("getBackingInventory");
        URI inventoryResource = null;
        Inventory expResult = null;
        Inventory result = InventoryFactory.getBackingInventory(inventoryResource);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBackingInventory method, of class InventoryFactory.
     */
    @Test
    public void testGetBackingInventory_URI_Map() throws Exception {
        System.out.println("getBackingInventory");
        URI inventoryResource = null;
        Map<String, Object> parameters = null;
        Inventory expResult = null;
        Inventory result = InventoryFactory.getBackingInventory(inventoryResource, parameters);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVirtualInventory method, of class InventoryFactory.
     */
    @Test
    public void testGetVirtualInventory() throws Exception {
        System.out.println("getVirtualInventory");
        ConsumerContentSet cs = null;
        Inventory expResult = null;
        Inventory result = InventoryFactory.getVirtualInventory(cs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBackingInventory method, of class InventoryFactory.
     */
    @Test
    public void testGetBackingInventory_ContentSet() throws Exception {
        System.out.println("getBackingInventory");
        ContentSet cs = null;
        Inventory expResult = null;
        Inventory result = InventoryFactory.getBackingInventory(cs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findBackingInventory method, of class InventoryFactory.
     */
    @Test
    public void testFindBackingInventory() throws Exception {
        System.out.println("findBackingInventory");
        ContentSet cs = null;
        String path = "";
        Inventory expResult = null;
        Inventory result = InventoryFactory.findBackingInventory(cs, path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of scanDifferences method, of class InventoryFactory.
     */
    @Test
    public void testScanDifferences_ContentSet() {
        System.out.println("scanDifferences");
        ContentSet contentset = null;
        File expResult = null;
        File result = InventoryFactory.scanDifferences(contentset);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of scanDifferences method, of class InventoryFactory.
     */
    @Test
    public void testScanDifferences_Inventory_ContentSet() {
        System.out.println("scanDifferences");
        Inventory existing = null;
        ContentSet contentset = null;
        File expResult = null;
        File result = InventoryFactory.scanDifferences(existing, contentset);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of availableDifferences method, of class InventoryFactory.
     */
    @Test
    public void testAvailableDifferences() {
        System.out.println("availableDifferences");
        ContentSet contentset = null;
        InventoryFactory.Stats expResult = null;
        InventoryFactory.Stats result = InventoryFactory.availableDifferences(contentset);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of applyDifferences method, of class InventoryFactory.
     */
    @Test
    public void testApplyDifferences_ContentSet_FileArr() throws Exception {
        System.out.println("applyDifferences");
        ContentSet contentset = null;
        File[] differenceFiles = null;
        long expResult = 0L;
        long result = InventoryFactory.applyDifferences(contentset, differenceFiles);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of applyDifferences method, of class InventoryFactory.
     */
    @Test
    public void testApplyDifferences_3args() throws Exception {
        System.out.println("applyDifferences");
        Inventory existing = null;
        ContentSet contentset = null;
        File[] differenceFiles = null;
        long expResult = 0L;
        long result = InventoryFactory.applyDifferences(existing, contentset, differenceFiles);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFileSystemInventoryLoaded method, of class InventoryFactory.
     */
    @Test
    public void testIsFileSystemInventoryLoaded() {
        System.out.println("isFileSystemInventoryLoaded");
        boolean expResult = false;
        boolean result = InventoryFactory.isFileSystemInventoryLoaded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
