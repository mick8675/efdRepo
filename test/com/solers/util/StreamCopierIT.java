/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.util;

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
public class StreamCopierIT {
    
    public StreamCopierIT() {
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
     * Test of copy method, of class StreamCopier.
     */
    @Test
    public void testCopy_0args() throws Exception {
        System.out.println("copy");
        StreamCopier instance = null;
        long expResult = 0L;
        long result = instance.copy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of copy method, of class StreamCopier.
     */
    @Test
    public void testCopy_Callback() throws Exception {
        System.out.println("copy");
        Callback<Integer> callback = null;
        StreamCopier instance = null;
        long expResult = 0L;
        long result = instance.copy(callback);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class StreamCopier.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        StreamCopier instance = null;
        instance.stop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
