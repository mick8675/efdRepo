/****************************************************************
 *
 * Solers, Inc. as the author of Enterprise File Delivery 2.1 (EFD 2.1)
 * source code submitted herewith to the Government under contract
 * retains those intellectual property rights as set forth by the Federal 
 * Acquisition Regulations agreement (FAR). The Government has 
 * unlimited rights to redistribute copies of the EFD 2.1 in 
 * executable or source format to support operational installation 
 * and software maintenance. Additionally, the executable or 
 * source may be used or modified for by third parties as 
 * directed by the government.
 *
 * (c) 2009 Solers, Inc.
 ***********************************************************/
package com.solers.delivery.domain.validations;

//import org.hibernate.validator.Validator;
//import com.solers.delivery.validator.Validator;

import com.solers.delivery.transport.gbs.GBSConfigurator;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class GbsIsEnabledValidator implements ConstraintValidator<GbsIsEnabled, Boolean> 
{

    @Override
	public boolean isValid(Boolean gbsEnabled, ConstraintValidatorContext notused) 
        {
            boolean valid = false;
            if (gbsEnabled != null) 
            {
                if (gbsEnabled) 
                {
                    valid = GBSConfigurator.isGBSEnabled();
		
                }
            }
            return valid;
	}

    @Override
    public void initialize(GbsIsEnabled a) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}//_____________________end class_____________________________________________
