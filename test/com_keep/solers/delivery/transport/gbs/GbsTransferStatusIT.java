/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.gbs;

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
public class GbsTransferStatusIT {
    
    public GbsTransferStatusIT() {
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
     * Test of getArchiveName method, of class GbsTransferStatus.
     */
    @Test
    public void testGetArchiveName() {
        System.out.println("getArchiveName");
        GbsTransferStatus instance = new GbsTransferStatusImpl();
        String expResult = "";
        String result = instance.getArchiveName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArchiveSize method, of class GbsTransferStatus.
     */
    @Test
    public void testGetArchiveSize() {
        System.out.println("getArchiveSize");
        GbsTransferStatus instance = new GbsTransferStatusImpl();
        long expResult = 0L;
        long result = instance.getArchiveSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFileNames method, of class GbsTransferStatus.
     */
    @Test
    public void testGetFileNames() {
        System.out.println("getFileNames");
        GbsTransferStatus instance = new GbsTransferStatusImpl();
        List<String> expResult = null;
        List<String> result = instance.getFileNames();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentSetName method, of class GbsTransferStatus.
     */
    @Test
    public void testGetContentSetName() {
        System.out.println("getContentSetName");
        GbsTransferStatus instance = new GbsTransferStatusImpl();
        String expResult = "";
        String result = instance.getContentSetName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSyncKey method, of class GbsTransferStatus.
     */
    @Test
    public void testGetSyncKey() {
        System.out.println("getSyncKey");
        GbsTransferStatus instance = new GbsTransferStatusImpl();
        String expResult = "";
        String result = instance.getSyncKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GbsTransferStatusImpl implements GbsTransferStatus {

        public String getArchiveName() {
            return "";
        }

        public long getArchiveSize() {
            return 0L;
        }

        public List<String> getFileNames() {
            return null;
        }

        public String getContentSetName() {
            return "";
        }

        public String getSyncKey() {
            return "";
        }
    }

    public class GbsTransferStatusImpl implements GbsTransferStatus {

        public String getArchiveName() {
            return "";
        }

        public long getArchiveSize() {
            return 0L;
        }

        public List<String> getFileNames() {
            return null;
        }

        public String getContentSetName() {
            return "";
        }

        public String getSyncKey() {
            return "";
        }
    }
    
}
