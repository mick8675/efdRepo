/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.domain;

import com.solers.util.unit.FileSizeUnit;
import com.solers.util.unit.TimeIntervalUnit;
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
public class ConsumerContentSetIT {
    
    public ConsumerContentSetIT() {
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
     * Test of getSupplierName method, of class ConsumerContentSet.
     */
    @Test
    public void testGetSupplierName() {
        System.out.println("getSupplierName");
        ConsumerContentSet instance = new ConsumerContentSet();
        String expResult = "";
        String result = instance.getSupplierName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSupplierName method, of class ConsumerContentSet.
     */
    @Test
    public void testSetSupplierName() {
        System.out.println("setSupplierName");
        String supplierName = "";
        ConsumerContentSet instance = new ConsumerContentSet();
        instance.setSupplierName(supplierName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPath method, of class ConsumerContentSet.
     */
    @Test
    public void testGetPath() {
        System.out.println("getPath");
        ConsumerContentSet instance = new ConsumerContentSet();
        String expResult = "";
        String result = instance.getPath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSupplierAddress method, of class ConsumerContentSet.
     */
    @Test
    public void testGetSupplierAddress() {
        System.out.println("getSupplierAddress");
        ConsumerContentSet instance = new ConsumerContentSet();
        String expResult = "";
        String result = instance.getSupplierAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSupplierAddress method, of class ConsumerContentSet.
     */
    @Test
    public void testSetSupplierAddress() {
        System.out.println("setSupplierAddress");
        String supplierAddress = "";
        ConsumerContentSet instance = new ConsumerContentSet();
        instance.setSupplierAddress(supplierAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSupplierPort method, of class ConsumerContentSet.
     */
    @Test
    public void testGetSupplierPort() {
        System.out.println("getSupplierPort");
        ConsumerContentSet instance = new ConsumerContentSet();
        int expResult = 0;
        int result = instance.getSupplierPort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSupplierPort method, of class ConsumerContentSet.
     */
    @Test
    public void testSetSupplierPort() {
        System.out.println("setSupplierPort");
        int supplierPort = 0;
        ConsumerContentSet instance = new ConsumerContentSet();
        instance.setSupplierPort(supplierPort);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFileDeleteDelay method, of class ConsumerContentSet.
     */
    @Test
    public void testGetFileDeleteDelay() {
        System.out.println("getFileDeleteDelay");
        ConsumerContentSet instance = new ConsumerContentSet();
        int expResult = 0;
        int result = instance.getFileDeleteDelay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFileDeleteDelay method, of class ConsumerContentSet.
     */
    @Test
    public void testSetFileDeleteDelay() {
        System.out.println("setFileDeleteDelay");
        int fileDeleteDelay = 0;
        ConsumerContentSet instance = new ConsumerContentSet();
        instance.setFileDeleteDelay(fileDeleteDelay);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFileDeleteDelayUnit method, of class ConsumerContentSet.
     */
    @Test
    public void testGetFileDeleteDelayUnit() {
        System.out.println("getFileDeleteDelayUnit");
        ConsumerContentSet instance = new ConsumerContentSet();
        TimeIntervalUnit expResult = null;
        TimeIntervalUnit result = instance.getFileDeleteDelayUnit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFileDeleteDelayUnit method, of class ConsumerContentSet.
     */
    @Test
    public void testSetFileDeleteDelayUnit() {
        System.out.println("setFileDeleteDelayUnit");
        TimeIntervalUnit fileDeleteDelayUnit = null;
        ConsumerContentSet instance = new ConsumerContentSet();
        instance.setFileDeleteDelayUnit(fileDeleteDelayUnit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxFileSize method, of class ConsumerContentSet.
     */
    @Test
    public void testGetMaxFileSize() {
        System.out.println("getMaxFileSize");
        ConsumerContentSet instance = new ConsumerContentSet();
        long expResult = 0L;
        long result = instance.getMaxFileSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaxFileSize method, of class ConsumerContentSet.
     */
    @Test
    public void testSetMaxFileSize() {
        System.out.println("setMaxFileSize");
        long maxFileSize = 0L;
        ConsumerContentSet instance = new ConsumerContentSet();
        instance.setMaxFileSize(maxFileSize);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxFileSizeUnit method, of class ConsumerContentSet.
     */
    @Test
    public void testGetMaxFileSizeUnit() {
        System.out.println("getMaxFileSizeUnit");
        ConsumerContentSet instance = new ConsumerContentSet();
        FileSizeUnit expResult = null;
        FileSizeUnit result = instance.getMaxFileSizeUnit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaxFileSizeUnit method, of class ConsumerContentSet.
     */
    @Test
    public void testSetMaxFileSizeUnit() {
        System.out.println("setMaxFileSizeUnit");
        FileSizeUnit maxFileSizeUnit = null;
        ConsumerContentSet instance = new ConsumerContentSet();
        instance.setMaxFileSizeUnit(maxFileSizeUnit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVirtualManifest method, of class ConsumerContentSet.
     */
    @Test
    public void testGetVirtualManifest() {
        System.out.println("getVirtualManifest");
        ConsumerContentSet instance = new ConsumerContentSet();
        String expResult = "";
        String result = instance.getVirtualManifest();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVirtualManifest method, of class ConsumerContentSet.
     */
    @Test
    public void testSetVirtualManifest() {
        System.out.println("setVirtualManifest");
        String virtualManifest = "";
        ConsumerContentSet instance = new ConsumerContentSet();
        instance.setVirtualManifest(virtualManifest);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConcurrentTransfers method, of class ConsumerContentSet.
     */
    @Test
    public void testGetConcurrentTransfers() {
        System.out.println("getConcurrentTransfers");
        ConsumerContentSet instance = new ConsumerContentSet();
        Integer expResult = null;
        Integer result = instance.getConcurrentTransfers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConcurrentTransfers method, of class ConsumerContentSet.
     */
    @Test
    public void testSetConcurrentTransfers() {
        System.out.println("setConcurrentTransfers");
        Integer concurrentTransfers = null;
        ConsumerContentSet instance = new ConsumerContentSet();
        instance.setConcurrentTransfers(concurrentTransfers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
