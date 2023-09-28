/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.rest.auth;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.restlet.data.ChallengeResponse;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class AcegiRestAuthenticationIT {
    
    public AcegiRestAuthenticationIT() {
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
     * Test of getDetails method, of class AcegiRestAuthentication.
     */
    @Test
    public void testGetDetails() {
        System.out.println("getDetails");
        AcegiRestAuthentication instance = new AcegiRestAuthentication();
        ChallengeResponse expResult = null;
        ChallengeResponse result = instance.getDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
