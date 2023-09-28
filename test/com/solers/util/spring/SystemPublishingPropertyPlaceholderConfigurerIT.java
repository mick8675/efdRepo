/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.solers.util.spring;

import java.util.Properties;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
public class SystemPublishingPropertyPlaceholderConfigurerIT {
    
    public SystemPublishingPropertyPlaceholderConfigurerIT() {
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
     * Test of processProperties method, of class SystemPublishingPropertyPlaceholderConfigurer.
     */
    @Test
    public void testProcessProperties() {
        System.out.println("processProperties");
        ConfigurableListableBeanFactory factory = null;
        Properties properties = null;
        SystemPublishingPropertyPlaceholderConfigurer instance = new SystemPublishingPropertyPlaceholderConfigurer();
        instance.processProperties(factory, properties);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
