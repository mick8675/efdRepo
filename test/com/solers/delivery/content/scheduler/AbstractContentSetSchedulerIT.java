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
public class AbstractContentSetSchedulerIT {
    
    public AbstractContentSetSchedulerIT() {
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
     * Test of getConfig method, of class AbstractContentSetScheduler.
     */
    @Test
    public void testGetConfig() {
        System.out.println("getConfig");
        AbstractContentSetScheduler instance = null;
        ContentSet expResult = null;
        ContentSet result = instance.getConfig();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public abstract class AbstractContentSetSchedulerImpl extends AbstractContentSetScheduler {

        public AbstractContentSetSchedulerImpl() {
            super(null);
        }
    }
    
}
