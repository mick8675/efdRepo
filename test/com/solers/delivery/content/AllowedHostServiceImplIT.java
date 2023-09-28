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
public class AllowedHostServiceImplIT {
    
    public AllowedHostServiceImplIT() {
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
     * Test of save method, of class AllowedHostServiceImpl.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        AllowedHost host = null;
        AllowedHostServiceImpl instance = null;
        Long expResult = null;
        Long result = instance.save(host);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of list method, of class AllowedHostServiceImpl.
     */
    @Test
    public void testList() {
        System.out.println("list");
        AllowedHostServiceImpl instance = null;
        List<AllowedHost> expResult = null;
        List<AllowedHost> result = instance.list();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class AllowedHostServiceImpl.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        AllowedHost host = null;
        AllowedHostServiceImpl instance = null;
        instance.remove(host);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class AllowedHostServiceImpl.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        String alias = "";
        AllowedHostServiceImpl instance = null;
        AllowedHost expResult = null;
        AllowedHost result = instance.get(alias);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
