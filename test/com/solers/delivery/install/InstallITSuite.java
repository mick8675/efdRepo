/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.install;

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
@Suite.SuiteClasses({com.solers.delivery.install.SecuritySetupTaskIT.class, com.solers.delivery.install.InputTaskIT.class, com.solers.delivery.install.RequestTypeIT.class, com.solers.delivery.install.BaseRequestIT.class, com.solers.delivery.install.PathRequestIT.class, com.solers.delivery.install.IntRequestIT.class, com.solers.delivery.install.PasswordRequestIT.class, com.solers.delivery.install.StringRequestIT.class, com.solers.delivery.install.PasswordProviderConsoleIT.class, com.solers.delivery.install.ConfigureMetricsTaskIT.class, com.solers.delivery.install.ClasspathTaskIT.class, com.solers.delivery.install.CombineTaskIT.class, com.solers.delivery.install.InputHandlerIT.class, com.solers.delivery.install.PropertyMergeTaskIT.class, com.solers.delivery.install.upgrade.UpgradeITSuite.class, com.solers.delivery.install.CRLSetupTaskIT.class, com.solers.delivery.install.ConfigClassificationTaskIT.class, com.solers.delivery.install.VerifyJavaTaskIT.class, com.solers.delivery.install.NativeSecuritySetupTaskIT.class, com.solers.delivery.install.NativePasswordProviderConsoleIT.class})
public class InstallITSuite {

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
