/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.user;

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
@Suite.SuiteClasses({com.solers.delivery.user.RestfulUserServiceIT.class, com.solers.delivery.user.PasswordServiceIT.class, com.solers.delivery.user.DefaultUserDetailsServiceIT.class, com.solers.delivery.user.RestfulPasswordServiceIT.class, com.solers.delivery.user.UserServiceImplIT.class, com.solers.delivery.user.UserServiceIT.class, com.solers.delivery.user.PasswordServiceImplIT.class})
public class UserITSuite {

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
