/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.consumer.difference;

import com.solers.delivery.content.status.ConsumerProgress;
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
public class ContentDifferenceHandlerIT {
    
    public ContentDifferenceHandlerIT() {
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
     * Test of handle method, of class ContentDifferenceHandler.
     */
    @Test
    public void testHandle() {
        System.out.println("handle");
        ContentDifference difference = null;
        ConsumerProgress progress = null;
        ContentDifferenceHandler instance = new ContentDifferenceHandlerImpl();
        instance.handle(difference, progress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cleanup method, of class ContentDifferenceHandler.
     */
    @Test
    public void testCleanup() {
        System.out.println("cleanup");
        ConsumerProgress progress = null;
        ContentDifferenceHandler instance = new ContentDifferenceHandlerImpl();
        instance.cleanup(progress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ContentDifferenceHandlerImpl implements ContentDifferenceHandler {

        public void handle(ContentDifference difference, ConsumerProgress progress) {
        }

        public void cleanup(ConsumerProgress progress) {
        }
    }
    
}
