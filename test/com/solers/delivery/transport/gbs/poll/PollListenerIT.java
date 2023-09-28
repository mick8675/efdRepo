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
public class PollListenerIT {
    
    public PollListenerIT() {
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
     * Test of onAdd method, of class PollListener.
     */
    @Test
    public void testOnAdd() {
        System.out.println("onAdd");
        Archive archive = null;
        String path = "";
        String syncId = "";
        ContentSet contentSet = null;
        PollListener instance = new PollListenerImpl();
        instance.onAdd(archive, path, syncId, contentSet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PollListenerImpl implements PollListener {

        public void onAdd(Archive archive, String path, String syncId, ContentSet contentSet) {
        }
    }
    
}
