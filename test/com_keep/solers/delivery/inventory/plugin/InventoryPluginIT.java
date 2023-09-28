/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.inventory.plugin;

import com.solers.delivery.inventory.Inventory;
import com.solers.delivery.inventory.plugin.provider.InventoryProvider;
import com.solers.delivery.inventory.plugin.provider.Parameter;
import com.solers.delivery.inventory.plugin.provider.ProviderInfo;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
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
public class InventoryPluginIT {
    
    public InventoryPluginIT() {
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
     * Test of newJarFileClassLoader method, of class InventoryPlugin.
     */
    @Test
    public void testNewJarFileClassLoader_File() throws Exception {
        System.out.println("newJarFileClassLoader");
        File jarFile = null;
        URLClassLoader expResult = null;
        URLClassLoader result = InventoryPlugin.newJarFileClassLoader(jarFile);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newJarFileClassLoader method, of class InventoryPlugin.
     */
    @Test
    public void testNewJarFileClassLoader_File_ClassLoader() throws Exception {
        System.out.println("newJarFileClassLoader");
        File jarFile = null;
        ClassLoader parent = null;
        URLClassLoader expResult = null;
        URLClassLoader result = InventoryPlugin.newJarFileClassLoader(jarFile, parent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImplementation method, of class InventoryPlugin.
     */
    @Test
    public void testGetImplementation() throws Exception {
        System.out.println("getImplementation");
        URL resource = null;
        ClassLoader cl = null;
        Class<? extends InventoryProvider> expResult = null;
        Class<? extends InventoryProvider> result = InventoryPlugin.getImplementation(resource, cl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class InventoryPlugin.
     */
    @Test
    public void testRegister_Class() throws Exception {
        System.out.println("register");
        Class<? extends InventoryProvider> providerImpl = null;
        ProviderInfo expResult = null;
        ProviderInfo result = InventoryPlugin.register(providerImpl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class InventoryPlugin.
     */
    @Test
    public void testRegister_File() throws Exception {
        System.out.println("register");
        File pluginFile = null;
        ProviderInfo expResult = null;
        ProviderInfo result = InventoryPlugin.register(pluginFile);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newInstance method, of class InventoryPlugin.
     */
    @Test
    public void testNewInstance() throws Exception {
        System.out.println("newInstance");
        URI inventoryResource = null;
        Map<String, Object> parameters = null;
        Inventory expResult = null;
        Inventory result = InventoryPlugin.newInstance(inventoryResource, parameters);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProvider method, of class InventoryPlugin.
     */
    @Test
    public void testGetProvider() throws Exception {
        System.out.println("getProvider");
        URI inventoryResource = null;
        InventoryProvider expResult = null;
        InventoryProvider result = InventoryPlugin.getProvider(inventoryResource);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParameterInfo method, of class InventoryPlugin.
     */
    @Test
    public void testGetParameterInfo() throws Exception {
        System.out.println("getParameterInfo");
        URI inventoryResource = null;
        Collection<Parameter> expResult = null;
        Collection<Parameter> result = InventoryPlugin.getParameterInfo(inventoryResource);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProviderInfo method, of class InventoryPlugin.
     */
    @Test
    public void testGetProviderInfo() {
        System.out.println("getProviderInfo");
        Collection<ProviderInfo> expResult = null;
        Collection<ProviderInfo> result = InventoryPlugin.getProviderInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newProviderInstance method, of class InventoryPlugin.
     */
    @Test
    public void testNewProviderInstance() throws Exception {
        System.out.println("newProviderInstance");
        Class<? extends InventoryProvider> clazz = null;
        InventoryProvider expResult = null;
        InventoryProvider result = InventoryPlugin.newProviderInstance(clazz);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearPlugins method, of class InventoryPlugin.
     */
    @Test
    public void testClearPlugins() {
        System.out.println("clearPlugins");
        InventoryPlugin.clearPlugins();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
