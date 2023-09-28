/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.event.listener;

import com.solers.delivery.event.ContentEvent;
import org.apache.lucene.index.IndexWriter;
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
public class LuceneContentEventFlusherIT {
    
    public LuceneContentEventFlusherIT() {
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
     * Test of run method, of class LuceneContentEventFlusher.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        LuceneContentEventFlusher instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handle method, of class LuceneContentEventFlusher.
     */
    @Test
    public void testHandle() throws Exception {
        System.out.println("handle");
        IndexWriter writer = null;
        ContentEvent event = null;
        LuceneContentEventFlusher instance = null;
        instance.handle(writer, event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
