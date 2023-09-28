/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.daos.impl;

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
@Suite.SuiteClasses({com.solers.delivery.daos.impl.AllowedHostDAOHibernateIT.class, com.solers.delivery.daos.impl.AlertDAOHibernateIT.class, com.solers.delivery.daos.impl.UserDAOHibernateIT.class, com.solers.delivery.daos.impl.HibernateDAOFactoryIT.class, com.solers.delivery.daos.impl.PendingDeleteDAOHibernateIT.class, com.solers.delivery.daos.impl.PasswordDAOHibernateIT.class, com.solers.delivery.daos.impl.ConsumerContentSetDAOHibernateIT.class, com.solers.delivery.daos.impl.ContentSetDAOHibernateIT.class, com.solers.delivery.daos.impl.BaseContentSetHibernateDAOIT.class})
public class ImplITSuite {

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
