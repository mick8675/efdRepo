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

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.NotBlank;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class NotBlankValidator implements ConstraintValidator<NotBlank, CharSequence> 
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
