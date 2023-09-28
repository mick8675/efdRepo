/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.consumer.difference;

import com.solers.delivery.content.status.ConsumerProgress;
import com.solers.delivery.daos.DAOFactory;
import com.solers.delivery.event.EventManager;
import java.io.File;
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
public class RemoverIT {
    
    public RemoverIT() {
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
     * Test of setDaoFactory method, of class Remover.
     */
    @Test
    public void testSetDaoFactory() {
        System.out.println("setDaoFactory");
        DAOFactory factory = null;
        Remover instance = null;
        instance.setDaoFactory(factory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEventManager method, of class Remover.
     */
    @Test
    public void testSetEventManager() {
        System.out.println("setEventManager");
        EventManager manager = null;
        Remover instance = null;
        instance.setEventManager(manager);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handle method, of class Remover.
     */
    @Test
    public void testHandle() {
        System.out.println("handle");
        ContentDifference difference = null;
        ConsumerProgress progress = null;
        Remover instance = null;
        instance.handle(difference, progress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cleanup method, of class Remover.
     */
    @Test
    public void testCleanup() {
        System.out.println("cleanup");
        ConsumerProgress progress = null;
        Remover instance = null;
        instance.cleanup(progress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Remover.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        File entry = null;
        ConsumerProgress progress = null;
        Remover instance = null;
        instance.remove(entry, progress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
