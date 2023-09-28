/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.daos;

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
public class ConsumerContentSetDAOIT {
    
    public ConsumerContentSetDAOIT() {
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
     * Test of getConsumerByName method, of class ConsumerContentSetDAO.
     */
    @Test
    public void testGetConsumerByName() {
        System.out.println("getConsumerByName");
        String name = "";
        ConsumerContentSetDAO instance = new ConsumerContentSetDAOImpl();
        ConsumerContentSet expResult = null;
        ConsumerContentSet result = instance.getConsumerByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConsumerSets method, of class ConsumerContentSetDAO.
     */
    @Test
    public void testGetConsumerSets() {
        System.out.println("getConsumerSets");
        ConsumerContentSetDAO instance = new ConsumerContentSetDAOImpl();
        List<ConsumerContentSet> expResult = null;
        List<ConsumerContentSet> result = instance.getConsumerSets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ConsumerContentSetDAOImpl implements ConsumerContentSetDAO {

        public ConsumerContentSet getConsumerByName(String name) {
            return null;
        }

        public List<ConsumerContentSet> getConsumerSets() {
            return null;
        }
    }

    public class ConsumerContentSetDAOImpl implements ConsumerContentSetDAO {

        public ConsumerContentSet getConsumerByName(String name) {
            return null;
        }

        public List<ConsumerContentSet> getConsumerSets() {
            return null;
        }
    }
    
}
