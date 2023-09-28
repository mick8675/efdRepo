/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.tools.inventory;

import com.solers.delivery.inventory.Inventory;
import com.solers.delivery.inventory.plugin.provider.Parameter;
import com.solers.delivery.inventory.plugin.provider.ProviderInfo;
import java.net.URI;
import java.util.Collection;
import java.util.Map;
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
public class IndexInventoryProviderIT {
    
    public IndexInventoryProviderIT() {
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
     * Test of accept method, of class IndexInventoryProvider.
     */
    @Test
    public void testAccept() {
        System.out.println("accept");
        URI resource = null;
        IndexInventoryProvider instance = new IndexInventoryProvider();
        boolean expResult = false;
        boolean result = instance.accept(resource);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParameterInfo method, of class IndexInventoryProvider.
     */
    @Test
    public void testGetParameterInfo() {
        System.out.println("getParameterInfo");
        IndexInventoryProvider instance = new IndexInventoryProvider();
        Collection<Parameter> expResult = null;
        Collection<Parameter> result = instance.getParameterInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProviderInfo method, of class IndexInventoryProvider.
     */
    @Test
    public void testGetProviderInfo() {
        System.out.println("getProviderInfo");
        IndexInventoryProvider instance = new IndexInventoryProvider();
        ProviderInfo expResult = null;
        ProviderInfo result = instance.getProviderInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newInstance method, of class IndexInventoryProvider.
     */
    @Test
    public void testNewInstance() {
        System.out.println("newInstance");
        URI resource = null;
        Map<String, Object> parameters = null;
        IndexInventoryProvider instance = new IndexInventoryProvider();
        Inventory expResult = null;
        Inventory result = instance.newInstance(resource, parameters);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
