/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.util;

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
public class FileSystemUtilIT {
    
    public FileSystemUtilIT() {
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
     * Test of isReadable method, of class FileSystemUtil.
     */
    @Test
    public void testIsReadable() {
        System.out.println("isReadable");
        File file = null;
        boolean expResult = false;
        boolean result = FileSystemUtil.isReadable(file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEFDHome method, of class FileSystemUtil.
     */
    @Test
    public void testGetEFDHome() {
        System.out.println("getEFDHome");
        File expResult = null;
        File result = FileSystemUtil.getEFDHome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of relativeToEFDHome method, of class FileSystemUtil.
     */
    @Test
    public void testRelativeToEFDHome() {
        System.out.println("relativeToEFDHome");
        String path = "";
        File expResult = null;
        File result = FileSystemUtil.relativeToEFDHome(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pathTree method, of class FileSystemUtil.
     */
    @Test
    public void testPathTree() {
        System.out.println("pathTree");
        String canonicalPath = "";
        String[] expResult = null;
        String[] result = FileSystemUtil.pathTree(canonicalPath);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nonCanonicalizingPathTree method, of class FileSystemUtil.
     */
    @Test
    public void testNonCanonicalizingPathTree() {
        System.out.println("nonCanonicalizingPathTree");
        String canonicalPath = "";
        String[] expResult = null;
        String[] result = FileSystemUtil.nonCanonicalizingPathTree(canonicalPath);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of correctPath method, of class FileSystemUtil.
     */
    @Test
    public void testCorrectPath() {
        System.out.println("correctPath");
        String path = "";
        String expResult = "";
        String result = FileSystemUtil.correctPath(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pathIsChild method, of class FileSystemUtil.
     */
    @Test
    public void testPathIsChild() {
        System.out.println("pathIsChild");
        String childPath = "";
        String path = "";
        boolean expResult = false;
        boolean result = FileSystemUtil.pathIsChild(childPath, path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFilenameValid method, of class FileSystemUtil.
     */
    @Test
    public void testIsFilenameValid() {
        System.out.println("isFilenameValid");
        String path = "";
        boolean expResult = false;
        boolean result = FileSystemUtil.isFilenameValid(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateDirectoryStatistics method, of class FileSystemUtil.
     */
    @Test
    public void testCalculateDirectoryStatistics() {
        System.out.println("calculateDirectoryStatistics");
        File directory = null;
        FileSystemUtil.Stats expResult = null;
        FileSystemUtil.Stats result = FileSystemUtil.calculateDirectoryStatistics(directory);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
