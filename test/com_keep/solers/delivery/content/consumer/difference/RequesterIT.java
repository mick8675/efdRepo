/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.consumer.difference;

import com.solers.delivery.content.status.ConsumerProgress;
import com.solers.delivery.event.ContentEvent;
import com.solers.delivery.event.EventManager;
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
public class RequesterIT {
    
    public RequesterIT() {
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
     * Test of setEventManager method, of class Requester.
     */
    @Test
    public void testSetEventManager() {
        System.out.println("setEventManager");
        EventManager eventManager = null;
        Requester instance = null;
        instance.setEventManager(eventManager);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cleanup method, of class Requester.
     */
    @Test
    public void testCleanup() {
        System.out.println("cleanup");
        ConsumerProgress progress = null;
        Requester instance = null;
        instance.cleanup(progress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handle method, of class Requester.
     */
    @Test
    public void testHandle() {
        System.out.println("handle");
        ContentDifference difference = null;
        ConsumerProgress progress = null;
        Requester instance = null;
        instance.handle(difference, progress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of requestContent method, of class Requester.
     */
    @Test
    public void testRequestContent() {
        System.out.println("requestContent");
        ContentDifference contentToGet = null;
        ConsumerProgress progress = null;
        Requester instance = null;
        boolean expResult = false;
        boolean result = instance.requestContent(contentToGet, progress);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createDirectory method, of class Requester.
     */
    @Test
    public void testCreateDirectory() {
        System.out.println("createDirectory");
        ContentDifference content = null;
        String syncKey = "";
        Requester instance = null;
        boolean expResult = false;
        boolean result = instance.createDirectory(content, syncKey);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createContentEvent method, of class Requester.
     */
    @Test
    public void testCreateContentEvent() {
        System.out.println("createContentEvent");
        ContentDifference difference = null;
        String syncKey = "";
        Requester instance = null;
        ContentEvent expResult = null;
        ContentEvent result = instance.createContentEvent(difference, syncKey);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
