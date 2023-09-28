/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.consumer;

import com.solers.delivery.domain.ConsumerContentSet;
import com.solers.delivery.transport.http.client.TransferService;
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
public class InventoryRetrieverIT {
    
    public InventoryRetrieverIT() {
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
     * Test of setNumBackups method, of class InventoryRetriever.
     */
    @Test
    public void testSetNumBackups() {
        System.out.println("setNumBackups");
        int numBackups = 0;
        InventoryRetriever instance = new InventoryRetriever();
        instance.setNumBackups(numBackups);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewInventory method, of class InventoryRetriever.
     */
    @Test
    public void testGetNewInventory() {
        System.out.println("getNewInventory");
        ConsumerContentSet contentSet = null;
        long timestamp = 0L;
        TransferService transferService = null;
        String syncId = "";
        InventoryRetriever instance = new InventoryRetriever();
        InventoryResult expResult = null;
        InventoryResult result = instance.getNewInventory(contentSet, timestamp, transferService, syncId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
