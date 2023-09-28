/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.scripting;

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
@Suite.SuiteClasses({com.solers.delivery.scripting.ExecutionStatusIT.class, com.solers.delivery.scripting.input.InputITSuite.class, com.solers.delivery.scripting.ScriptExecutionTaskIT.class, com.solers.delivery.scripting.ScriptConfigurationIT.class, com.solers.delivery.scripting.JavaToScriptInterfaceIT.class, com.solers.delivery.scripting.service.ServiceITSuite.class, com.solers.delivery.scripting.StartScriptCmdLneParserIT.class, com.solers.delivery.scripting.ScriptingApplicationIT.class, com.solers.delivery.scripting.ScriptExecutionManagerIT.class, com.solers.delivery.scripting.ScriptExecutionTaskFactoryIT.class, com.solers.delivery.scripting.ScriptStatusIT.class, com.solers.delivery.scripting.ScriptUnitIT.class, com.solers.delivery.scripting.security.SecurityITSuite.class, com.solers.delivery.scripting.ScriptExceptionIT.class, com.solers.delivery.scripting.StartScriptIT.class, com.solers.delivery.scripting.event.EventITSuite.class})
public class ScriptingITSuite {

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
