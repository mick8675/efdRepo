/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.gbs;

import com.solers.delivery.transport.gbs.poll.ExtractProgress;
import java.io.File;
import java.io.IOException;
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
public class ArchiveIT {
    
    public ArchiveIT() {
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
     * Test of getArchive method, of class Archive.
     */
    @Test
    public void testGetArchive() {
        System.out.println("getArchive");
        Archive instance = new ArchiveImpl();
        File expResult = null;
        File result = instance.getArchive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFilesToArchive method, of class Archive.
     */
    @Test
    public void testAddFilesToArchive() {
        System.out.println("addFilesToArchive");
        List<GbsFile> files = null;
        String consumerName = "";
        String syncId = "";
        Archive instance = new ArchiveImpl();
        boolean expResult = false;
        boolean result = instance.addFilesToArchive(files, consumerName, syncId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentSet method, of class Archive.
     */
    @Test
    public void testGetContentSet() {
        System.out.println("getContentSet");
        Archive instance = new ArchiveImpl();
        String expResult = "";
        String result = instance.getContentSet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSyncKey method, of class Archive.
     */
    @Test
    public void testGetSyncKey() {
        System.out.println("getSyncKey");
        Archive instance = new ArchiveImpl();
        String expResult = "";
        String result = instance.getSyncKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extractFilesToPath method, of class Archive.
     */
    @Test
    public void testExtractFilesToPath() throws Exception {
        System.out.println("extractFilesToPath");
        String path = "";
        ExtractProgress pathCallback = null;
        Archive instance = new ArchiveImpl();
        instance.extractFilesToPath(path, pathCallback);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class Archive.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Archive instance = new ArchiveImpl();
        long expResult = 0L;
        long result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFileNames method, of class Archive.
     */
    @Test
    public void testGetFileNames() {
        System.out.println("getFileNames");
        Archive instance = new ArchiveImpl();
        List<String> expResult = null;
        List<String> result = instance.getFileNames();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Archive.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Archive instance = new ArchiveImpl();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ArchiveImpl implements Archive {

        public File getArchive() {
            return null;
        }

        public boolean addFilesToArchive(List<GbsFile> files, String consumerName, String syncId) {
            return false;
        }

        public String getContentSet() {
            return "";
        }

        public String getSyncKey() {
            return "";
        }

        public void extractFilesToPath(String path, ExtractProgress pathCallback) throws IOException {
        }

        public long getSize() {
            return 0L;
        }

        public List<String> getFileNames() {
            return null;
        }

        public String getName() {
            return "";
        }
    }

    public class ArchiveImpl implements Archive {

        public File getArchive() {
            return null;
        }

        public boolean addFilesToArchive(List<GbsFile> files, String consumerName, String syncId) {
            return false;
        }

        public String getContentSet() {
            return "";
        }

        public String getSyncKey() {
            return "";
        }

        public void extractFilesToPath(String path, ExtractProgress pathCallback) throws IOException {
        }

        public long getSize() {
            return 0L;
        }

        public List<String> getFileNames() {
            return null;
        }

        public String getName() {
            return "";
        }
    }
    
}
