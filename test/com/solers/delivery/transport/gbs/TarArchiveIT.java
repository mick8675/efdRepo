/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.gbs;

import com.solers.delivery.transport.gbs.poll.ExtractProgress;
import java.io.File;
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
public class TarArchiveIT {
    
    public TarArchiveIT() {
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
     * Test of addFilesToArchive method, of class TarArchive.
     */
    @Test
    public void testAddFilesToArchive() {
        System.out.println("addFilesToArchive");
        List<GbsFile> files = null;
        String consumerName = "";
        String syncId = "";
        TarArchive instance = null;
        boolean expResult = false;
        boolean result = instance.addFilesToArchive(files, consumerName, syncId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentSet method, of class TarArchive.
     */
    @Test
    public void testGetContentSet() {
        System.out.println("getContentSet");
        TarArchive instance = null;
        String expResult = "";
        String result = instance.getContentSet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSyncKey method, of class TarArchive.
     */
    @Test
    public void testGetSyncKey() {
        System.out.println("getSyncKey");
        TarArchive instance = null;
        String expResult = "";
        String result = instance.getSyncKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extractFilesToPath method, of class TarArchive.
     */
    @Test
    public void testExtractFilesToPath() throws Exception {
        System.out.println("extractFilesToPath");
        String filePath = "";
        ExtractProgress pathCallback = null;
        TarArchive instance = null;
        instance.extractFilesToPath(filePath, pathCallback);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArchive method, of class TarArchive.
     */
    @Test
    public void testGetArchive() {
        System.out.println("getArchive");
        TarArchive instance = null;
        File expResult = null;
        File result = instance.getArchive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFileNames method, of class TarArchive.
     */
    @Test
    public void testGetFileNames() {
        System.out.println("getFileNames");
        TarArchive instance = null;
        List<String> expResult = null;
        List<String> result = instance.getFileNames();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class TarArchive.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        TarArchive instance = null;
        long expResult = 0L;
        long result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class TarArchive.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        TarArchive instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
