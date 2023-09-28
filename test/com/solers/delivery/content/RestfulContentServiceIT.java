/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content;

import com.solers.delivery.domain.ConsumerContentSet;
import com.solers.delivery.domain.ContentSet;
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
public class RestfulContentServiceIT {
    
    public RestfulContentServiceIT() {
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
     * Test of disable method, of class RestfulContentService.
     */
    @Test
    public void testDisable() {
        System.out.println("disable");
        Long id = null;
        RestfulContentService instance = null;
        instance.disable(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enable method, of class RestfulContentService.
     */
    @Test
    public void testEnable() {
        System.out.println("enable");
        Long id = null;
        RestfulContentService instance = null;
        instance.enable(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class RestfulContentService.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Long id = null;
        RestfulContentService instance = null;
        instance.remove(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class RestfulContentService.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Long id = null;
        RestfulContentService instance = null;
        ContentSet expResult = null;
        ContentSet result = instance.get(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentSets method, of class RestfulContentService.
     */
    @Test
    public void testGetContentSets() {
        System.out.println("getContentSets");
        RestfulContentService instance = null;
        List<ContentSet> expResult = null;
        List<ContentSet> result = instance.getContentSets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuppliers method, of class RestfulContentService.
     */
    @Test
    public void testGetSuppliers() {
        System.out.println("getSuppliers");
        RestfulContentService instance = null;
        List<ContentSet> expResult = null;
        List<ContentSet> result = instance.getSuppliers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConsumers method, of class RestfulContentService.
     */
    @Test
    public void testGetConsumers() {
        System.out.println("getConsumers");
        RestfulContentService instance = null;
        List<ConsumerContentSet> expResult = null;
        List<ConsumerContentSet> result = instance.getConsumers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class RestfulContentService.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        ContentSet contentSet = null;
        RestfulContentService instance = null;
        Long expResult = null;
        Long result = instance.save(contentSet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
