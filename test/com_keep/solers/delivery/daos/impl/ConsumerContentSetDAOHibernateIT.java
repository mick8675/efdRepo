/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.daos.impl;

import com.solers.delivery.domain.ConsumerContentSet;
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
public class ConsumerContentSetDAOHibernateIT {
    
    public ConsumerContentSetDAOHibernateIT() {
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
     * Test of getConsumerByName method, of class ConsumerContentSetDAOHibernate.
     */
    @Test
    public void testGetConsumerByName() {
        System.out.println("getConsumerByName");
        String name = "";
        ConsumerContentSetDAOHibernate instance = null;
        ConsumerContentSet expResult = null;
        ConsumerContentSet result = instance.getConsumerByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConsumerSets method, of class ConsumerContentSetDAOHibernate.
     */
    @Test
    public void testGetConsumerSets() {
        System.out.println("getConsumerSets");
        ConsumerContentSetDAOHibernate instance = null;
        List<ConsumerContentSet> expResult = null;
        List<ConsumerContentSet> result = instance.getConsumerSets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
