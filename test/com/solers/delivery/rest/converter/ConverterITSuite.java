/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.rest.converter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Mick Lecher - NPD Contract
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.solers.delivery.rest.converter.AdminConverterIT.class, com.solers.delivery.rest.converter.ParameterConverterIT.class, com.solers.delivery.rest.converter.AllowedHostConverterIT.class, com.solers.delivery.rest.converter.ConverterExceptionIT.class, com.solers.delivery.rest.converter.StatusConverterIT.class, com.solers.delivery.rest.converter.HistoryConverterIT.class, com.solers.delivery.rest.converter.ValidationExceptionConverterIT.class, com.solers.delivery.rest.converter.ConverterIT.class, com.solers.delivery.rest.converter.ProviderInfoConverterIT.class, com.solers.delivery.rest.converter.ContentSetConverterIT.class})
public class ConverterITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
