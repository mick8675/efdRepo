/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.transport.gbs.poll;

import com.solers.delivery.domain.ContentSet;
import com.solers.delivery.transport.gbs.Archive;
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
public class GbsPollListenerIT {
    
    public GbsPollListenerIT() {
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
     * Test of onAdd method, of class GbsPollListener.
     */
    @Test
    public void testOnAdd() {
        System.out.println("onAdd");
        Archive archive = null;
        String path = "";
        String syncKey = "";
        ContentSet contentSet = null;
        GbsPollListener instance = null;
        instance.onAdd(archive, path, syncKey, contentSet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
