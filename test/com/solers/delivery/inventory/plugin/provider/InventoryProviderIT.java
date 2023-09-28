/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.plugin.provider;

import com.solers.delivery.inventory.Inventory;
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
public class InventoryProviderIT {
    
    public InventoryProviderIT() {
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
     * Test of accept method, of class InventoryProvider.
     */
    @Test
    public void testAccept() {
        System.out.println("accept");
        URI resource = null;
        InventoryProvider instance = new InventoryProviderImpl();
        boolean expResult = false;
        boolean result = instance.accept(resource);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProviderInfo method, of class InventoryProvider.
     */
    @Test
    public void testGetProviderInfo() {
        System.out.println("getProviderInfo");
        InventoryProvider instance = new InventoryProviderImpl();
        ProviderInfo expResult = null;
        ProviderInfo result = instance.getProviderInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParameterInfo method, of class InventoryProvider.
     */
    @Test
    public void testGetParameterInfo() {
        System.out.println("getParameterInfo");
        InventoryProvider instance = new InventoryProviderImpl();
        Collection<Parameter> expResult = null;
        Collection<Parameter> result = instance.getParameterInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newInstance method, of class InventoryProvider.
     */
    @Test
    public void testNewInstance() {
        System.out.println("newInstance");
        URI resource = null;
        Map<String, Object> parameters = null;
        InventoryProvider instance = new InventoryProviderImpl();
        Inventory expResult = null;
        Inventory result = instance.newInstance(resource, parameters);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class InventoryProviderImpl implements InventoryProvider {

        public boolean accept(URI resource) {
            return false;
        }

        public ProviderInfo getProviderInfo() {
            return null;
        }

        public Collection<Parameter> getParameterInfo() {
            return null;
        }

        public Inventory newInstance(URI resource, Map<String, Object> parameters) {
            return null;
        }
    }
    
}
