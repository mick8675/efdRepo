/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.delivery.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.security.core.AuthenticationException;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class SessionTimeOutProcessingIT {
    
    public SessionTimeOutProcessingIT() {
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
     * Test of commence method, of class SessionTimeOutProcessing.
     */
    @Test
    public void testCommence() throws Exception {
        System.out.println("commence");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        AuthenticationException authException = null;
        SessionTimeOutProcessing instance = null;
        instance.commence(request, response, authException);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
