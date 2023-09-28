/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.security.password;

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
@Suite.SuiteClasses({com.solers.security.password.MapPasswordProviderIT.class, com.solers.security.password.PasswordFactoryBeanIT.class, com.solers.security.password.DefaultPasswordProviderIT.class, com.solers.security.password.PasswordReaderIT.class, com.solers.security.password.DPAPIPasswordProviderIT.class, com.solers.security.password.PasswordProviderIT.class, com.solers.security.password.UPMPasswordProviderIT.class})
public class PasswordITSuite {

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
