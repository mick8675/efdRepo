/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.domain;

import java.util.Collection;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class UserIT {
    
    public UserIT() {
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
     * Test of getName method, of class User.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        User instance = new User();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class User.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        User instance = new User();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class User.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        User instance = new User();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class User.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        User instance = new User();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class User.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        User instance = new User();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class User.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        User instance = new User();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastLogin method, of class User.
     */
    @Test
    public void testGetLastLogin() {
        System.out.println("getLastLogin");
        User instance = new User();
        Date expResult = null;
        Date result = instance.getLastLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastLogin method, of class User.
     */
    @Test
    public void testSetLastLogin() {
        System.out.println("setLastLogin");
        Date lastLogin = null;
        User instance = new User();
        instance.setLastLogin(lastLogin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrLogin method, of class User.
     */
    @Test
    public void testGetCurrLogin() {
        System.out.println("getCurrLogin");
        User instance = new User();
        Date expResult = null;
        Date result = instance.getCurrLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrLogin method, of class User.
     */
    @Test
    public void testSetCurrLogin() {
        System.out.println("setCurrLogin");
        Date currLogin = null;
        User instance = new User();
        instance.setCurrLogin(currLogin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFailedLogins method, of class User.
     */
    @Test
    public void testGetFailedLogins() {
        System.out.println("getFailedLogins");
        User instance = new User();
        int expResult = 0;
        int result = instance.getFailedLogins();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFailedLogins method, of class User.
     */
    @Test
    public void testSetFailedLogins() {
        System.out.println("setFailedLogins");
        int count = 0;
        User instance = new User();
        instance.setFailedLogins(count);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastFailedLogins method, of class User.
     */
    @Test
    public void testGetLastFailedLogins() {
        System.out.println("getLastFailedLogins");
        User instance = new User();
        Integer expResult = null;
        Integer result = instance.getLastFailedLogins();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastFailedLogins method, of class User.
     */
    @Test
    public void testSetLastFailedLogins() {
        System.out.println("setLastFailedLogins");
        Integer count = null;
        User instance = new User();
        instance.setLastFailedLogins(count);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnabled method, of class User.
     */
    @Test
    public void testSetEnabled() {
        System.out.println("setEnabled");
        boolean enabled = false;
        User instance = new User();
        instance.setEnabled(enabled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEnabled method, of class User.
     */
    @Test
    public void testIsEnabled() {
        System.out.println("isEnabled");
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.isEnabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAdminRole method, of class User.
     */
    @Test
    public void testIsAdminRole() {
        System.out.println("isAdminRole");
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.isAdminRole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdminRole method, of class User.
     */
    @Test
    public void testSetAdminRole() {
        System.out.println("setAdminRole");
        boolean adminRole = false;
        User instance = new User();
        instance.setAdminRole(adminRole);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class User.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        User instance = new User();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class User.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        User instance = new User();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class User.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        User instance = new User();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class User.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        User instance = new User();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class User.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        String location = "";
        User instance = new User();
        instance.setLocation(location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocation method, of class User.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        User instance = new User();
        String expResult = "";
        String result = instance.getLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastLocation method, of class User.
     */
    @Test
    public void testSetLastLocation() {
        System.out.println("setLastLocation");
        String lastLocation = "";
        User instance = new User();
        instance.setLastLocation(lastLocation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastLocation method, of class User.
     */
    @Test
    public void testGetLastLocation() {
        System.out.println("getLastLocation");
        User instance = new User();
        String expResult = "";
        String result = instance.getLastLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInitialPassword method, of class User.
     */
    @Test
    public void testIsInitialPassword() {
        System.out.println("isInitialPassword");
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.isInitialPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInitialPassword method, of class User.
     */
    @Test
    public void testSetInitialPassword() {
        System.out.println("setInitialPassword");
        boolean initialPassword = false;
        User instance = new User();
        instance.setInitialPassword(initialPassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorities method, of class User.
     */
    @Test
    public void testGetAuthorities() {
        System.out.println("getAuthorities");
        User instance = new User();
        Collection<GrantedAuthority> expResult = null;
        Collection<GrantedAuthority> result = instance.getAuthorities();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateLastLogin method, of class User.
     */
    @Test
    public void testUpdateLastLogin() {
        System.out.println("updateLastLogin");
        String remoteIPAddr = "";
        User instance = new User();
        instance.updateLastLogin(remoteIPAddr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateFailedLogin method, of class User.
     */
    @Test
    public void testUpdateFailedLogin() {
        System.out.println("updateFailedLogin");
        User instance = new User();
        instance.updateFailedLogin();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
