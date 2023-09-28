package com.solers.delivery.domain.validations;

//import org.hibernate.validator.Validator;
//import com.solers.delivery.validator.Validator;

import com.solers.delivery.transport.gbs.GBSConfigurator;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class GbsIsEnabledValidatorTestCase implements ConstraintValidator<GbsIsEnabled, Boolean> 
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
