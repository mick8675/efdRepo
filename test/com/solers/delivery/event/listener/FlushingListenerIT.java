/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.event.listener;

import com.solers.delivery.event.ContentEvent;
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
public class FlushingListenerIT {
    
    public FlushingListenerIT() {
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
     * Test of received method, of class FlushingListener.
     */
    @Test
    public void testReceived() {
        System.out.println("received");
        ContentEvent event = null;
        FlushingListener instance = null;
        instance.received(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supplied method, of class FlushingListener.
     */
    @Test
    public void testSupplied() {
        System.out.println("supplied");
        ContentEvent event = null;
        FlushingListener instance = null;
        instance.supplied(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class FlushingListener.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        ContentEvent event = null;
        FlushingListener instance = null;
        instance.add(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of flush method, of class FlushingListener.
     */
    @Test
    public void testFlush_0args() {
        System.out.println("flush");
        FlushingListener instance = null;
        instance.flush();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of flush method, of class FlushingListener.
     */
    @Test
    public void testFlush_List() {
        System.out.println("flush");
        List<ContentEvent> events = null;
        FlushingListener instance = null;
        instance.flush(events);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class FlushingListenerImpl extends FlushingListener {

        public FlushingListenerImpl() {
            super(0, 0);
        }

        public void flush(List<ContentEvent> events) {
        }
    }
    
}
