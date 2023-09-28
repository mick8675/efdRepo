/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.daos;

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
@Suite.SuiteClasses({com.solers.delivery.daos.AlertDAOIT.class, com.solers.delivery.daos.UserDAOIT.class, com.solers.delivery.daos.ContentSetDAOIT.class, com.solers.delivery.daos.PendingDeleteDAOIT.class, com.solers.delivery.daos.DAOFactoryIT.class, com.solers.delivery.daos.impl.ImplITSuite.class, com.solers.delivery.daos.AllowedHostDAOIT.class, com.solers.delivery.daos.ConsumerContentSetDAOIT.class, com.solers.delivery.daos.PasswordDAOIT.class})
public class DaosITSuite {

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
