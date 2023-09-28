/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.gbs;

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
public class GBSServiceIT {
    
    public GBSServiceIT() {
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
     * Test of addContentSet method, of class GBSService.
     */
    @Test
    public void testAddContentSet() {
        System.out.println("addContentSet");
        ContentSet contentSet = null;
        GBSService instance = new GBSServiceImpl();
        instance.addContentSet(contentSet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeContentSet method, of class GBSService.
     */
    @Test
    public void testRemoveContentSet() {
        System.out.println("removeContentSet");
        Long id = null;
        GBSService instance = new GBSServiceImpl();
        instance.removeContentSet(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startContentSet method, of class GBSService.
     */
    @Test
    public void testStartContentSet() {
        System.out.println("startContentSet");
        Long id = null;
        GBSService instance = new GBSServiceImpl();
        instance.startContentSet(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stopContentSet method, of class GBSService.
     */
    @Test
    public void testStopContentSet() {
        System.out.println("stopContentSet");
        Long id = null;
        GBSService instance = new GBSServiceImpl();
        instance.stopContentSet(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFile method, of class GBSService.
     */
    @Test
    public void testAddFile() {
        System.out.println("addFile");
        String consumerContentSet = "";
        String syncKey = "";
        String supplierContentSet = "";
        String host = "";
        File file = null;
        String path = "";
        GBSService instance = new GBSServiceImpl();
        instance.addFile(consumerContentSet, syncKey, supplierContentSet, host, file, path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GBSServiceImpl implements GBSService {

        public void addContentSet(ContentSet contentSet) {
        }

        public void removeContentSet(Long id) {
        }

        public void startContentSet(Long id) {
        }

        public void stopContentSet(Long id) {
        }

        public void addFile(String consumerContentSet, String syncKey, String supplierContentSet, String host, File file, String path) {
        }

        @Override
        public void run() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
