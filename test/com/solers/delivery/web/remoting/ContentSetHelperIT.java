/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.web.remoting;

import com.solers.delivery.domain.ConsumerContentSet;
import com.solers.delivery.domain.ContentSet;
import java.util.List;
import java.util.Set;
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
public class ContentSetHelperIT {
    
    public ContentSetHelperIT() {
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
     * Test of getConsumers method, of class ContentSetHelper.
     */
    @Test
    public void testGetConsumers() {
        System.out.println("getConsumers");
        ContentSetHelper instance = null;
        Set<ContentSetNode> expResult = null;
        Set<ContentSetNode> result = instance.getConsumers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuppliers method, of class ContentSetHelper.
     */
    @Test
    public void testGetSuppliers() {
        System.out.println("getSuppliers");
        ContentSetHelper instance = null;
        Set<ContentSetNode> expResult = null;
        Set<ContentSetNode> result = instance.getSuppliers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentSet method, of class ContentSetHelper.
     */
    @Test
    public void testGetContentSet() {
        System.out.println("getContentSet");
        Long id = null;
        ContentSetHelper instance = null;
        ContentSet expResult = null;
        ContentSet result = instance.getContentSet(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newSupplier method, of class ContentSetHelper.
     */
    @Test
    public void testNewSupplier() {
        System.out.println("newSupplier");
        ContentSetHelper instance = null;
        ContentSet expResult = null;
        ContentSet result = instance.newSupplier();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newConsumer method, of class ContentSetHelper.
     */
    @Test
    public void testNewConsumer() {
        System.out.println("newConsumer");
        ContentSetHelper instance = null;
        ConsumerContentSet expResult = null;
        ConsumerContentSet result = instance.newConsumer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveSupplier method, of class ContentSetHelper.
     */
    @Test
    public void testSaveSupplier() {
        System.out.println("saveSupplier");
        ContentSet contentSet = null;
        ContentSetHelper instance = null;
        Long expResult = null;
        Long result = instance.saveSupplier(contentSet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveConsumer method, of class ContentSetHelper.
     */
    @Test
    public void testSaveConsumer() {
        System.out.println("saveConsumer");
        ConsumerContentSet contentSet = null;
        ContentSetHelper instance = null;
        Long expResult = null;
        Long result = instance.saveConsumer(contentSet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enable method, of class ContentSetHelper.
     */
    @Test
    public void testEnable() {
        System.out.println("enable");
        Long[] ids = null;
        ContentSetHelper instance = null;
        instance.enable(ids);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disable method, of class ContentSetHelper.
     */
    @Test
    public void testDisable() {
        System.out.println("disable");
        Long[] ids = null;
        ContentSetHelper instance = null;
        instance.disable(ids);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class ContentSetHelper.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Long[] ids = null;
        ContentSetHelper instance = null;
        instance.remove(ids);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listSuppliers method, of class ContentSetHelper.
     */
    @Test
    public void testListSuppliers() {
        System.out.println("listSuppliers");
        String host = "";
        int port = 0;
        ContentSetHelper instance = null;
        List<ContentSetNode> expResult = null;
        List<ContentSetNode> result = instance.listSuppliers(host, port);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDisplayPath method, of class ContentSetHelper.
     */
    @Test
    public void testUpdateDisplayPath() {
        System.out.println("updateDisplayPath");
        String displayPath = "";
        Long id = null;
        ContentSetHelper instance = null;
        instance.updateDisplayPath(displayPath, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
