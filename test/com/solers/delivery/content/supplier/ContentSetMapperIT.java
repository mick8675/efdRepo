/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.content.supplier;

import com.solers.delivery.domain.ContentSet;
import com.solers.util.Callback;
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
public class ContentSetMapperIT {
    
    public ContentSetMapperIT() {
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
     * Test of getFile method, of class ContentSetMapper.
     */
    @Test
    public void testGetFile_String_String() {
        System.out.println("getFile");
        String contentSetName = "";
        String pathFromRoot = "";
        ContentSetMapper instance = new ContentSetMapperImpl();
        File expResult = null;
        File result = instance.getFile(contentSetName, pathFromRoot);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFile method, of class ContentSetMapper.
     */
    @Test
    public void testGetFile_3args() {
        System.out.println("getFile");
        String contentSetName = "";
        String pathFromRoot = "";
        long timestamp = 0L;
        ContentSetMapper instance = new ContentSetMapperImpl();
        File expResult = null;
        File result = instance.getFile(contentSetName, pathFromRoot, timestamp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class ContentSetMapper.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        String contentSetName = "";
        ContentSetMapper instance = new ContentSetMapperImpl();
        Long expResult = null;
        Long result = instance.getId(contentSetName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class ContentSetMapper.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Long id = null;
        ContentSetMapper instance = new ContentSetMapperImpl();
        String expResult = "";
        String result = instance.getName(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInventory method, of class ContentSetMapper.
     */
    @Test
    public void testIsInventory() {
        System.out.println("isInventory");
        String path = "";
        ContentSetMapper instance = new ContentSetMapperImpl();
        boolean expResult = false;
        boolean result = instance.isInventory(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAllowed method, of class ContentSetMapper.
     */
    @Test
    public void testIsAllowed() {
        System.out.println("isAllowed");
        String contentSetName = "";
        String commonName = "";
        ContentSetMapper instance = new ContentSetMapperImpl();
        boolean expResult = false;
        boolean result = instance.isAllowed(contentSetName, commonName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDisabledListener method, of class ContentSetMapper.
     */
    @Test
    public void testAddDisabledListener() {
        System.out.println("addDisabledListener");
        Callback<ContentSet> e = null;
        ContentSetMapper instance = new ContentSetMapperImpl();
        instance.addDisabledListener(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeDisabledListener method, of class ContentSetMapper.
     */
    @Test
    public void testRemoveDisabledListener() {
        System.out.println("removeDisabledListener");
        Callback<ContentSet> e = null;
        ContentSetMapper instance = new ContentSetMapperImpl();
        instance.removeDisabledListener(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ContentSetMapperImpl implements ContentSetMapper {

        public File getFile(String contentSetName, String pathFromRoot) {
            return null;
        }

        public File getFile(String contentSetName, String pathFromRoot, long timestamp) {
            return null;
        }

        public Long getId(String contentSetName) {
            return null;
        }

        public String getName(Long id) {
            return "";
        }

        public boolean isInventory(String path) {
            return false;
        }

        public boolean isAllowed(String contentSetName, String commonName) {
            return false;
        }

        public void addDisabledListener(Callback<ContentSet> e) {
        }

        public void removeDisabledListener(Callback<ContentSet> e) {
        }
    }
    
}
