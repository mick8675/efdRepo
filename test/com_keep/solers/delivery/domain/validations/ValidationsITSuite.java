/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.solers.delivery.domain.validations;

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
@Suite.SuiteClasses({com.solers.delivery.domain.validations.RestrictedPathIT.class, com.solers.delivery.domain.validations.WritableValidatorIT.class, com.solers.delivery.domain.validations.ExistingDirectoryValidatorIT.class, com.solers.delivery.domain.validations.ValidScheduleDurationIT.class, com.solers.delivery.domain.validations.ExistingDirectoryIT.class, com.solers.delivery.domain.validations.ValidFileNameIT.class, com.solers.delivery.domain.validations.ReadableIT.class, com.solers.delivery.domain.validations.ValidationExceptionIT.class, com.solers.delivery.domain.validations.ValidScheduleExpressionValidatorIT.class, com.solers.delivery.domain.validations.exceptions.ExceptionsITSuite.class, com.solers.delivery.domain.validations.NotBlankValidatorIT.class, com.solers.delivery.domain.validations.ValidFilterValidatorIT.class, com.solers.delivery.domain.validations.ValidFtpConnectionIT.class, com.solers.delivery.domain.validations.NotBlankIT.class, com.solers.delivery.domain.validations.ValidScheduleDurationValidatorIT.class, com.solers.delivery.domain.validations.ValidFtpConnectionValidatorIT.class, com.solers.delivery.domain.validations.RestrictedPathValidatorIT.class, com.solers.delivery.domain.validations.WritableIT.class, com.solers.delivery.domain.validations.ValidFilterIT.class, com.solers.delivery.domain.validations.ValidScheduleExpressionIT.class, com.solers.delivery.domain.validations.GbsIsEnabledIT.class, com.solers.delivery.domain.validations.GbsIsEnabledValidatorIT.class, com.solers.delivery.domain.validations.ValidFileNameValidatorIT.class, com.solers.delivery.domain.validations.ReadableValidatorIT.class})
public class ValidationsITSuite {

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
