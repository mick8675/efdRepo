/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.consumer.difference;

import java.util.Calendar;
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
public class ContentDifferenceIT {
    
    public ContentDifferenceIT() {
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
     * Test of getPath method, of class ContentDifference.
     */
    @Test
    public void testGetPath() {
        System.out.println("getPath");
        ContentDifference instance = new ContentDifference();
        String expResult = "";
        String result = instance.getPath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPath method, of class ContentDifference.
     */
    @Test
    public void testSetPath() {
        System.out.println("setPath");
        String path = "";
        ContentDifference instance = new ContentDifference();
        instance.setPath(path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimestamp method, of class ContentDifference.
     */
    @Test
    public void testGetTimestamp() {
        System.out.println("getTimestamp");
        ContentDifference instance = new ContentDifference();
        long expResult = 0L;
        long result = instance.getTimestamp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimestamp method, of class ContentDifference.
     */
    @Test
    public void testSetTimestamp() {
        System.out.println("setTimestamp");
        long timestamp = 0L;
        ContentDifference instance = new ContentDifference();
        instance.setTimestamp(timestamp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class ContentDifference.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        ContentDifference instance = new ContentDifference();
        long expResult = 0L;
        long result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSize method, of class ContentDifference.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        long size = 0L;
        ContentDifference instance = new ContentDifference();
        instance.setSize(size);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAction method, of class ContentDifference.
     */
    @Test
    public void testGetAction() {
        System.out.println("getAction");
        ContentDifference instance = new ContentDifference();
        ContentDifferenceActions expResult = null;
        ContentDifferenceActions result = instance.getAction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAction method, of class ContentDifference.
     */
    @Test
    public void testSetAction() {
        System.out.println("setAction");
        ContentDifferenceActions action = null;
        ContentDifference instance = new ContentDifference();
        instance.setAction(action);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeAdded method, of class ContentDifference.
     */
    @Test
    public void testGetTimeAdded() {
        System.out.println("getTimeAdded");
        ContentDifference instance = new ContentDifference();
        Calendar expResult = null;
        Calendar result = instance.getTimeAdded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeAdded method, of class ContentDifference.
     */
    @Test
    public void testSetTimeAdded() {
        System.out.println("setTimeAdded");
        Calendar timeAdded = null;
        ContentDifference instance = new ContentDifference();
        instance.setTimeAdded(timeAdded);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConsumerContentSetId method, of class ContentDifference.
     */
    @Test
    public void testGetConsumerContentSetId() {
        System.out.println("getConsumerContentSetId");
        ContentDifference instance = new ContentDifference();
        Long expResult = null;
        Long result = instance.getConsumerContentSetId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConsumerContentSetId method, of class ContentDifference.
     */
    @Test
    public void testSetConsumerContentSetId() {
        System.out.println("setConsumerContentSetId");
        Long consumerContentSetId = null;
        ContentDifference instance = new ContentDifference();
        instance.setConsumerContentSetId(consumerContentSetId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDirectory method, of class ContentDifference.
     */
    @Test
    public void testIsDirectory() {
        System.out.println("isDirectory");
        ContentDifference instance = new ContentDifference();
        boolean expResult = false;
        boolean result = instance.isDirectory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDirectory method, of class ContentDifference.
     */
    @Test
    public void testSetDirectory() {
        System.out.println("setDirectory");
        boolean directory = false;
        ContentDifference instance = new ContentDifference();
        instance.setDirectory(directory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
