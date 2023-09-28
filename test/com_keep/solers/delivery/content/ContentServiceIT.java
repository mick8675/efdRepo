/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content;

import com.solers.delivery.domain.ConsumerContentSet;
import com.solers.delivery.domain.ContentSet;
import com.solers.util.dao.ValidationException;
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
public class ContentServiceIT {
    
    public ContentServiceIT() {
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
     * Test of getContentSets method, of class ContentService.
     */
    @Test
    public void testGetContentSets() {
        System.out.println("getContentSets");
        ContentService instance = new ContentServiceImpl();
        List<ContentSet> expResult = null;
        List<ContentSet> result = instance.getContentSets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuppliers method, of class ContentService.
     */
    @Test
    public void testGetSuppliers() {
        System.out.println("getSuppliers");
        ContentService instance = new ContentServiceImpl();
        List<ContentSet> expResult = null;
        List<ContentSet> result = instance.getSuppliers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConsumers method, of class ContentService.
     */
    @Test
    public void testGetConsumers() {
        System.out.println("getConsumers");
        ContentService instance = new ContentServiceImpl();
        List<ConsumerContentSet> expResult = null;
        List<ConsumerContentSet> result = instance.getConsumers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class ContentService.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Long id = null;
        ContentService instance = new ContentServiceImpl();
        ContentSet expResult = null;
        ContentSet result = instance.get(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class ContentService.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        ContentSet contentSet = null;
        ContentService instance = new ContentServiceImpl();
        Long expResult = null;
        Long result = instance.save(contentSet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class ContentService.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Long id = null;
        ContentService instance = new ContentServiceImpl();
        instance.remove(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enable method, of class ContentService.
     */
    @Test
    public void testEnable() {
        System.out.println("enable");
        Long id = null;
        ContentService instance = new ContentServiceImpl();
        instance.enable(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disable method, of class ContentService.
     */
    @Test
    public void testDisable() {
        System.out.println("disable");
        Long id = null;
        ContentService instance = new ContentServiceImpl();
        instance.disable(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ContentServiceImpl implements ContentService {

        public List<ContentSet> getContentSets() {
            return null;
        }

        public List<ContentSet> getSuppliers() {
            return null;
        }

        public List<ConsumerContentSet> getConsumers() {
            return null;
        }

        public <T extends ContentSet> T get(Long id) {
            return null;
        }

        public Long save(ContentSet contentSet) throws ValidationException {
            return null;
        }

        public void remove(Long id) {
        }

        public void enable(Long id) {
        }

        public void disable(Long id) {
        }
    }

    public class ContentServiceImpl implements ContentService {

        public List<ContentSet> getContentSets() {
            return null;
        }

        public List<ContentSet> getSuppliers() {
            return null;
        }

        public List<ConsumerContentSet> getConsumers() {
            return null;
        }

        public <T extends ContentSet> T get(Long id) {
            return null;
        }

        public Long save(ContentSet contentSet) throws ValidationException {
            return null;
        }

        public void remove(Long id) {
        }

        public void enable(Long id) {
        }

        public void disable(Long id) {
        }
    }
    
}
