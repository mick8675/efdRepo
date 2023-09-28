/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.scheduler;

import com.solers.delivery.domain.ContentSet;
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
public class ContentSetSchedulerIT {
    
    public ContentSetSchedulerIT() {
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
     * Test of getConfig method, of class ContentSetScheduler.
     */
    @Test
    public void testGetConfig() {
        System.out.println("getConfig");
        ContentSetScheduler instance = new ContentSetSchedulerImpl();
        ContentSet expResult = null;
        ContentSet result = instance.getConfig();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class ContentSetScheduler.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        ContentSetScheduler instance = new ContentSetSchedulerImpl();
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class ContentSetScheduler.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        ContentSetScheduler instance = new ContentSetSchedulerImpl();
        instance.stop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ContentSetSchedulerImpl implements ContentSetScheduler {

        public ContentSet getConfig() {
            return null;
        }

        public void start() {
        }

        public void stop() {
        }
    }
    
}
