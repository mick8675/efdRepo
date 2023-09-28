package com.solers.delivery.domain.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.NotBlank;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class NotBlankValidatorTestCase implements ConstraintValidator<NotBlank, CharSequence> 
{

    private static final Logger LOGGER = LoggerFactory.getLogger(NotBlankValidator.class);
    
   /* @Override
    public void initialize(NotBlank config) {
        
    }*/
    
    @Override
    public boolean isValid(CharSequence charSequence, ConstraintValidatorContext notused) 
    {
        Boolean isBlank;
        
	if ( charSequence == null ) 
        {   
            isBlank=false;
            
	}
        else
        {
            isBlank=charSequence.toString().trim().length() > 0;
        }
            
                   
            return isBlank;
    }

    @Override
    public void initialize(NotBlank a) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
   

    

}
