/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content;

import com.solers.delivery.domain.AllowedHost;
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
public class AllowedHostServiceIT {
    
    public AllowedHostServiceIT() {
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
     * Test of list method, of class AllowedHostService.
     */
    @Test
    public void testList() {
        System.out.println("list");
        AllowedHostService instance = new AllowedHostServiceImpl();
        List<AllowedHost> expResult = null;
        List<AllowedHost> result = instance.list();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class AllowedHostService.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        String alias = "";
        AllowedHostService instance = new AllowedHostServiceImpl();
        AllowedHost expResult = null;
        AllowedHost result = instance.get(alias);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class AllowedHostService.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        AllowedHost host = null;
        AllowedHostService instance = new AllowedHostServiceImpl();
        Long expResult = null;
        Long result = instance.save(host);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class AllowedHostService.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        AllowedHost host = null;
        AllowedHostService instance = new AllowedHostServiceImpl();
        instance.remove(host);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AllowedHostServiceImpl implements AllowedHostService {

        public List<AllowedHost> list() {
            return null;
        }

        public AllowedHost get(String alias) {
            return null;
        }

        public Long save(AllowedHost host) {
            return null;
        }

        public void remove(AllowedHost host) {
        }
    }

    public class AllowedHostServiceImpl implements AllowedHostService {

        public List<AllowedHost> list() {
            return null;
        }

        public AllowedHost get(String alias) {
            return null;
        }

        public Long save(AllowedHost host) {
            return null;
        }

        public void remove(AllowedHost host) {
        }
    }
    
}
