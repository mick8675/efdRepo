/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.supplier;

import com.solers.delivery.domain.ContentSet;
import com.solers.util.Callback;
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
public class SupplierContentSetManagerIT {
    
    public SupplierContentSetManagerIT() {
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
     * Test of registerContentSet method, of class SupplierContentSetManager.
     */
    @Test
    public void testRegisterContentSet() {
        System.out.println("registerContentSet");
        ContentSet contentSet = null;
        SupplierContentSetManager instance = null;
        instance.registerContentSet(contentSet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInventory method, of class SupplierContentSetManager.
     */
    @Test
    public void testIsInventory() {
        System.out.println("isInventory");
        String path = "";
        SupplierContentSetManager instance = null;
        boolean expResult = false;
        boolean result = instance.isInventory(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFile method, of class SupplierContentSetManager.
     */
    @Test
    public void testGetFile_String_String() {
        System.out.println("getFile");
        String contentSetName = "";
        String pathFromRoot = "";
        SupplierContentSetManager instance = null;
        File expResult = null;
        File result = instance.getFile(contentSetName, pathFromRoot);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFile method, of class SupplierContentSetManager.
     */
    @Test
    public void testGetFile_3args() {
        System.out.println("getFile");
        String contentSetName = "";
        String pathFromRoot = "";
        long timestamp = 0L;
        SupplierContentSetManager instance = null;
        File expResult = null;
        File result = instance.getFile(contentSetName, pathFromRoot, timestamp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class SupplierContentSetManager.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        String contentSetName = "";
        SupplierContentSetManager instance = null;
        Long expResult = null;
        Long result = instance.getId(contentSetName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAllowed method, of class SupplierContentSetManager.
     */
    @Test
    public void testIsAllowed() {
        System.out.println("isAllowed");
        String contentSetName = "";
        String commonName = "";
        SupplierContentSetManager instance = null;
        boolean expResult = false;
        boolean result = instance.isAllowed(contentSetName, commonName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDisabledListener method, of class SupplierContentSetManager.
     */
    @Test
    public void testAddDisabledListener() {
        System.out.println("addDisabledListener");
        Callback<ContentSet> e = null;
        SupplierContentSetManager instance = null;
        instance.addDisabledListener(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeDisabledListener method, of class SupplierContentSetManager.
     */
    @Test
    public void testRemoveDisabledListener() {
        System.out.println("removeDisabledListener");
        Callback<ContentSet> e = null;
        SupplierContentSetManager instance = null;
        instance.removeDisabledListener(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
