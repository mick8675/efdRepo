/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.gbs.poll;

import com.solers.delivery.event.ContentEvent;
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
public class ExtractProgressIT {
    
    public ExtractProgressIT() {
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
     * Test of success method, of class ExtractProgress.
     */
    @Test
    public void testSuccess() {
        System.out.println("success");
        String path = "";
        long size = 0L;
        ContentEvent.ContentEventAction action = null;
        ExtractProgress instance = new ExtractProgressImpl();
        instance.success(path, size, action);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of skipped method, of class ExtractProgress.
     */
    @Test
    public void testSkipped() {
        System.out.println("skipped");
        String path = "";
        long size = 0L;
        ExtractProgress instance = new ExtractProgressImpl();
        instance.skipped(path, size);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ExtractProgressImpl implements ExtractProgress {

        public void success(String path, long size, ContentEvent.ContentEventAction action) {
        }

        public void skipped(String path, long size) {
        }
    }

    public class ExtractProgressImpl implements ExtractProgress {

        public void success(String path, long size, ContentEvent.ContentEventAction action) {
        }

        public void skipped(String path, long size) {
        }
    }
    
}
