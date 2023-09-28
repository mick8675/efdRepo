/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.gbs;

import com.solers.delivery.domain.ContentSet;
import java.io.File;
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
public class AbstractGBSServiceIT {
    
    public AbstractGBSServiceIT() {
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
     * Test of addContentSet method, of class AbstractGBSService.
     */
    @Test
    public void testAddContentSet() {
        System.out.println("addContentSet");
        ContentSet contentSet = null;
        AbstractGBSService instance = new AbstractGBSServiceImpl();
        instance.addContentSet(contentSet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeContentSet method, of class AbstractGBSService.
     */
    @Test
    public void testRemoveContentSet() {
        System.out.println("removeContentSet");
        Long id = null;
        AbstractGBSService instance = new AbstractGBSServiceImpl();
        instance.removeContentSet(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startContentSet method, of class AbstractGBSService.
     */
    @Test
    public void testStartContentSet() {
        System.out.println("startContentSet");
        Long id = null;
        AbstractGBSService instance = new AbstractGBSServiceImpl();
        instance.startContentSet(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stopContentSet method, of class AbstractGBSService.
     */
    @Test
    public void testStopContentSet() {
        System.out.println("stopContentSet");
        Long id = null;
        AbstractGBSService instance = new AbstractGBSServiceImpl();
        instance.stopContentSet(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentSetName method, of class AbstractGBSService.
     */
    @Test
    public void testGetContentSetName() {
        System.out.println("getContentSetName");
        Long id = null;
        AbstractGBSService instance = new AbstractGBSServiceImpl();
        String expResult = "";
        String result = instance.getContentSetName(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentSets method, of class AbstractGBSService.
     */
    @Test
    public void testGetContentSets() {
        System.out.println("getContentSets");
        AbstractGBSService instance = new AbstractGBSServiceImpl();
        Map<Long, ContentSet> expResult = null;
        Map<Long, ContentSet> result = instance.getContentSets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentSet method, of class AbstractGBSService.
     */
    @Test
    public void testGetContentSet() {
        System.out.println("getContentSet");
        Long id = null;
        AbstractGBSService instance = new AbstractGBSServiceImpl();
        ContentSet expResult = null;
        ContentSet result = instance.getContentSet(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doStart method, of class AbstractGBSService.
     */
    @Test
    public void testDoStart() {
        System.out.println("doStart");
        Long id = null;
        AbstractGBSService instance = new AbstractGBSServiceImpl();
        instance.doStart(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doStop method, of class AbstractGBSService.
     */
    @Test
    public void testDoStop() {
        System.out.println("doStop");
        Long id = null;
        AbstractGBSService instance = new AbstractGBSServiceImpl();
        instance.doStop(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFile method, of class AbstractGBSService.
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
        AbstractGBSService instance = new AbstractGBSServiceImpl();
        instance.addFile(consumerContentSet, syncKey, supplierContentSet, host, file, path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AbstractGBSServiceImpl extends AbstractGBSService {

        public void doStart(Long id) {
        }

        public void doStop(Long id) {
        }

        @Override
        public void run() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
