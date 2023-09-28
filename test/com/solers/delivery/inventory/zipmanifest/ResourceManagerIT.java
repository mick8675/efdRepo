/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.zipmanifest;

import java.io.File;
import org.apache.tools.zip.ZipFile;
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
public class ResourceManagerIT {
    
    public ResourceManagerIT() {
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
     * Test of submit method, of class ResourceManager.
     */
    @Test
    public void testSubmit_File_String() {
        System.out.println("submit");
        File zip = null;
        String root = "";
        File expResult = null;
        File result = ResourceManager.submit(zip, root);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of submit method, of class ResourceManager.
     */
    @Test
    public void testSubmit_3args() {
        System.out.println("submit");
        ZipFileCacheEntry key = null;
        File zip = null;
        String root = "";
        File expResult = null;
        File result = ResourceManager.submit(key, zip, root);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class ResourceManager.
     */
    @Test
    public void testClose_File() {
        System.out.println("close");
        File zip = null;
        ResourceManager.close(zip);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class ResourceManager.
     */
    @Test
    public void testClose_ZipFileCacheEntry() {
        System.out.println("close");
        ZipFileCacheEntry key = null;
        ResourceManager.close(key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTempDir method, of class ResourceManager.
     */
    @Test
    public void testGetTempDir() throws Exception {
        System.out.println("getTempDir");
        File expResult = null;
        File result = ResourceManager.getTempDir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of expand method, of class ResourceManager.
     */
    @Test
    public void testExpand() throws Exception {
        System.out.println("expand");
        ZipFile zf = null;
        File tempDir = null;
        String rootName = "";
        ResourceManager.expand(zf, tempDir, rootName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
