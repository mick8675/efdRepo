/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.domain;

import com.solers.util.unit.TimeIntervalUnit;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
public class ContentSetIT {
    
    public ContentSetIT() {
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
     * Test of getId method, of class ContentSet.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        ContentSet instance = new ContentSet();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class ContentSet.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        ContentSet instance = new ContentSet();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFileFilters method, of class ContentSet.
     */
    @Test
    public void testGetFileFilters() {
        System.out.println("getFileFilters");
        ContentSet instance = new ContentSet();
        List<FileFilter> expResult = null;
        List<FileFilter> result = instance.getFileFilters();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFileFilters method, of class ContentSet.
     */
    @Test
    public void testSetFileFilters() {
        System.out.println("setFileFilters");
        List<FileFilter> fileFilters = null;
        ContentSet instance = new ContentSet();
        instance.setFileFilters(fileFilters);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilters method, of class ContentSet.
     */
    @Test
    public void testSetFilters() {
        System.out.println("setFilters");
        List<FileFilter> filters = null;
        ContentSet instance = new ContentSet();
        instance.setFilters(filters);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResourceParameters method, of class ContentSet.
     */
    @Test
    public void testGetResourceParameters() {
        System.out.println("getResourceParameters");
        ContentSet instance = new ContentSet();
        Set<ResourceParameter> expResult = null;
        Set<ResourceParameter> result = instance.getResourceParameters();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParameters method, of class ContentSet.
     */
    @Test
    public void testGetParameters() {
        System.out.println("getParameters");
        ContentSet instance = new ContentSet();
        Set<ResourceParameter> expResult = null;
        Set<ResourceParameter> result = instance.getParameters();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResourceParametersAsMap method, of class ContentSet.
     */
    @Test
    public void testGetResourceParametersAsMap() {
        System.out.println("getResourceParametersAsMap");
        ContentSet instance = new ContentSet();
        Map<String, Object> expResult = null;
        Map<String, Object> result = instance.getResourceParametersAsMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResourceParameters method, of class ContentSet.
     */
    @Test
    public void testSetResourceParameters() {
        System.out.println("setResourceParameters");
        Set<ResourceParameter> resourceParameters = null;
        ContentSet instance = new ContentSet();
        instance.setResourceParameters(resourceParameters);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilters method, of class ContentSet.
     */
    @Test
    public void testGetFilters() {
        System.out.println("getFilters");
        ContentSet instance = new ContentSet();
        List<FileFilter> expResult = null;
        List<FileFilter> result = instance.getFilters();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class ContentSet.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        ContentSet instance = new ContentSet();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class ContentSet.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        ContentSet instance = new ContentSet();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPath method, of class ContentSet.
     */
    @Test
    public void testGetPath() {
        System.out.println("getPath");
        ContentSet instance = new ContentSet();
        String expResult = "";
        String result = instance.getPath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPath method, of class ContentSet.
     */
    @Test
    public void testSetPath() {
        System.out.println("setPath");
        String path = "";
        ContentSet instance = new ContentSet();
        instance.setPath(path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEnabled method, of class ContentSet.
     */
    @Test
    public void testIsEnabled() {
        System.out.println("isEnabled");
        ContentSet instance = new ContentSet();
        boolean expResult = false;
        boolean result = instance.isEnabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnabled method, of class ContentSet.
     */
    @Test
    public void testSetEnabled() {
        System.out.println("setEnabled");
        boolean enabled = false;
        ContentSet instance = new ContentSet();
        instance.setEnabled(enabled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSupplier method, of class ContentSet.
     */
    @Test
    public void testIsSupplier() {
        System.out.println("isSupplier");
        ContentSet instance = new ContentSet();
        boolean expResult = false;
        boolean result = instance.isSupplier();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSupplier method, of class ContentSet.
     */
    @Test
    public void testSetSupplier() {
        System.out.println("setSupplier");
        boolean supplier = false;
        ContentSet instance = new ContentSet();
        instance.setSupplier(supplier);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInventoryInterval method, of class ContentSet.
     */
    @Test
    public void testGetInventoryInterval() {
        System.out.println("getInventoryInterval");
        ContentSet instance = new ContentSet();
        int expResult = 0;
        int result = instance.getInventoryInterval();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInventoryInterval method, of class ContentSet.
     */
    @Test
    public void testSetInventoryInterval() {
        System.out.println("setInventoryInterval");
        int inventoryInterval = 0;
        ContentSet instance = new ContentSet();
        instance.setInventoryInterval(inventoryInterval);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInventoryIntervalUnit method, of class ContentSet.
     */
    @Test
    public void testGetInventoryIntervalUnit() {
        System.out.println("getInventoryIntervalUnit");
        ContentSet instance = new ContentSet();
        TimeIntervalUnit expResult = null;
        TimeIntervalUnit result = instance.getInventoryIntervalUnit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInventoryIntervalUnit method, of class ContentSet.
     */
    @Test
    public void testSetInventoryIntervalUnit() {
        System.out.println("setInventoryIntervalUnit");
        TimeIntervalUnit inventoryIntervalUnit = null;
        ContentSet instance = new ContentSet();
        instance.setInventoryIntervalUnit(inventoryIntervalUnit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreationTime method, of class ContentSet.
     */
    @Test
    public void testGetCreationTime() {
        System.out.println("getCreationTime");
        ContentSet instance = new ContentSet();
        long expResult = 0L;
        long result = instance.getCreationTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreationTime method, of class ContentSet.
     */
    @Test
    public void testSetCreationTime() {
        System.out.println("setCreationTime");
        long creationTime = 0L;
        ContentSet instance = new ContentSet();
        instance.setCreationTime(creationTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class ContentSet.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        ContentSet instance = new ContentSet();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class ContentSet.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        ContentSet instance = new ContentSet();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSupportsGbsTransport method, of class ContentSet.
     */
    @Test
    public void testIsSupportsGbsTransport() {
        System.out.println("isSupportsGbsTransport");
        ContentSet instance = new ContentSet();
        boolean expResult = false;
        boolean result = instance.isSupportsGbsTransport();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSupportsGbsTransport method, of class ContentSet.
     */
    @Test
    public void testSetSupportsGbsTransport() {
        System.out.println("setSupportsGbsTransport");
        boolean supportsGbsTransport = false;
        ContentSet instance = new ContentSet();
        instance.setSupportsGbsTransport(supportsGbsTransport);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFtpConnection method, of class ContentSet.
     */
    @Test
    public void testGetFtpConnection() {
        System.out.println("getFtpConnection");
        ContentSet instance = new ContentSet();
        FtpConnection expResult = null;
        FtpConnection result = instance.getFtpConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFtpConnection method, of class ContentSet.
     */
    @Test
    public void testSetFtpConnection() {
        System.out.println("setFtpConnection");
        FtpConnection ftpConnection = null;
        ContentSet instance = new ContentSet();
        instance.setFtpConnection(ftpConnection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ContentSet.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ContentSet instance = new ContentSet();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpressions method, of class ContentSet.
     */
    @Test
    public void testGetExpressions() {
        System.out.println("getExpressions");
        ContentSet instance = new ContentSet();
        Set<ScheduleExpression> expResult = null;
        Set<ScheduleExpression> result = instance.getExpressions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExpressions method, of class ContentSet.
     */
    @Test
    public void testSetExpressions() {
        System.out.println("setExpressions");
        Set<ScheduleExpression> expressions = null;
        ContentSet instance = new ContentSet();
        instance.setExpressions(expressions);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addScheduleExpression method, of class ContentSet.
     */
    @Test
    public void testAddScheduleExpression() {
        System.out.println("addScheduleExpression");
        ScheduleExpression expression = null;
        ContentSet instance = new ContentSet();
        instance.addScheduleExpression(expression);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScheduleExpressions method, of class ContentSet.
     */
    @Test
    public void testGetScheduleExpressions() {
        System.out.println("getScheduleExpressions");
        ContentSet instance = new ContentSet();
        Set<ScheduleExpression> expResult = null;
        Set<ScheduleExpression> result = instance.getScheduleExpressions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setScheduleExpressions method, of class ContentSet.
     */
    @Test
    public void testSetScheduleExpressions() {
        System.out.println("setScheduleExpressions");
        Set<ScheduleExpression> expressions = null;
        ContentSet instance = new ContentSet();
        instance.setScheduleExpressions(expressions);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAliases method, of class ContentSet.
     */
    @Test
    public void testGetAliases() {
        System.out.println("getAliases");
        ContentSet instance = new ContentSet();
        Set<AllowedHost> expResult = null;
        Set<AllowedHost> result = instance.getAliases();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAliases method, of class ContentSet.
     */
    @Test
    public void testSetAliases() {
        System.out.println("setAliases");
        Set<AllowedHost> aliases = null;
        ContentSet instance = new ContentSet();
        instance.setAliases(aliases);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllowedHosts method, of class ContentSet.
     */
    @Test
    public void testGetAllowedHosts() {
        System.out.println("getAllowedHosts");
        ContentSet instance = new ContentSet();
        Set<AllowedHost> expResult = null;
        Set<AllowedHost> result = instance.getAllowedHosts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAllowedHosts method, of class ContentSet.
     */
    @Test
    public void testSetAllowedHosts() {
        System.out.println("setAllowedHosts");
        Set<AllowedHost> hosts = null;
        ContentSet instance = new ContentSet();
        instance.setAllowedHosts(hosts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allows method, of class ContentSet.
     */
    @Test
    public void testAllows() {
        System.out.println("allows");
        String commonName = "";
        ContentSet instance = new ContentSet();
        boolean expResult = false;
        boolean result = instance.allows(commonName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAllowedHost method, of class ContentSet.
     */
    @Test
    public void testAddAllowedHost() {
        System.out.println("addAllowedHost");
        AllowedHost host = null;
        ContentSet instance = new ContentSet();
        instance.addAllowedHost(host);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAllowedHost method, of class ContentSet.
     */
    @Test
    public void testRemoveAllowedHost() {
        System.out.println("removeAllowedHost");
        AllowedHost host = null;
        ContentSet instance = new ContentSet();
        boolean expResult = false;
        boolean result = instance.removeAllowedHost(host);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDisplayPath method, of class ContentSet.
     */
    @Test
    public void testGetDisplayPath() {
        System.out.println("getDisplayPath");
        ContentSet instance = new ContentSet();
        String expResult = "";
        String result = instance.getDisplayPath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDisplayPath method, of class ContentSet.
     */
    @Test
    public void testSetDisplayPath() {
        System.out.println("setDisplayPath");
        String displayPath = "";
        ContentSet instance = new ContentSet();
        instance.setDisplayPath(displayPath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUpdateTime method, of class ContentSet.
     */
    @Test
    public void testGetUpdateTime() {
        System.out.println("getUpdateTime");
        ContentSet instance = new ContentSet();
        long expResult = 0L;
        long result = instance.getUpdateTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUpdateTime method, of class ContentSet.
     */
    @Test
    public void testSetUpdateTime() {
        System.out.println("setUpdateTime");
        long updateTime = 0L;
        ContentSet instance = new ContentSet();
        instance.setUpdateTime(updateTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
