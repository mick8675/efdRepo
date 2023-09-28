/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content;

import com.solers.delivery.content.scheduler.ContentSetScheduler;
import com.solers.delivery.domain.ContentSet;
import java.util.Collection;
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
public class ContentSetManagerIT {
    
    public ContentSetManagerIT() {
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
     * Test of registerContentSet method, of class ContentSetManager.
     */
    @Test
    public void testRegisterContentSet() {
        System.out.println("registerContentSet");
        ContentSet config = null;
        ContentSetManager instance = null;
        instance.registerContentSet(config);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shutdown method, of class ContentSetManager.
     */
    @Test
    public void testShutdown() {
        System.out.println("shutdown");
        ContentSetManager instance = null;
        instance.shutdown();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class ContentSetManager.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Long id = null;
        ContentSetManager instance = null;
        String expResult = "";
        String result = instance.getName(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addContentSet method, of class ContentSetManager.
     */
    @Test
    public void testAddContentSet() {
        System.out.println("addContentSet");
        ContentSet contentSet = null;
        ContentSetManager instance = null;
        instance.addContentSet(contentSet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unregisterContentSet method, of class ContentSetManager.
     */
    @Test
    public void testUnregisterContentSet() {
        System.out.println("unregisterContentSet");
        Long id = null;
        ContentSetManager instance = null;
        instance.unregisterContentSet(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startContentSet method, of class ContentSetManager.
     */
    @Test
    public void testStartContentSet() {
        System.out.println("startContentSet");
        Long id = null;
        ContentSetManager instance = null;
        instance.startContentSet(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stopContentSet method, of class ContentSetManager.
     */
    @Test
    public void testStopContentSet() {
        System.out.println("stopContentSet");
        Long id = null;
        ContentSetManager instance = null;
        instance.stopContentSet(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addSchedulerAndConfig method, of class ContentSetManager.
     */
    @Test
    public void testAddSchedulerAndConfig() {
        System.out.println("addSchedulerAndConfig");
        ContentSet contentSet = null;
        Runnable task = null;
        ContentSetManager instance = null;
        instance.addSchedulerAndConfig(contentSet, task);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSchedulers method, of class ContentSetManager.
     */
    @Test
    public void testGetSchedulers() {
        System.out.println("getSchedulers");
        ContentSetManager instance = null;
        Collection<ContentSetScheduler> expResult = null;
        Collection<ContentSetScheduler> result = instance.getSchedulers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ContentSetManagerImpl extends ContentSetManager {

        public ContentSetManagerImpl() {
            super(null, null);
        }

        public void registerContentSet(ContentSet config) {
        }
    }

    public class ContentSetManagerImpl extends ContentSetManager {

        public ContentSetManagerImpl() {
            super(null, null);
        }

        public void registerContentSet(ContentSet config) {
        }
    }
    
}
