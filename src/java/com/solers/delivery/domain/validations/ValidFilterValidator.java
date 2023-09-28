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

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import com.solers.delivery.domain.FileFilter;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class ValidFilterValidator implements  ConstraintValidator<ValidFilter, FileFilter> 
{
   
    public boolean isValid(FileFilter filter, ConstraintValidatorContext unused) 
    {
        boolean valid = false;
        if (filter != null) 
        {
            if ((filter.getPatternType() != null) && (filter.getPattern() != null)) 
            {
                if (filter.getPatternType().equals(FileFilter.Pattern.REGEX)) 
                {
                    try 
                    {
                        Pattern.compile(filter.getPattern());
                        valid = true;
                    } 
                    catch (PatternSyntaxException pse) 
                    {
                        valid = false;
                    }
                }
            }
        }
        return valid;
}//___

    @Override
    public void initialize(ValidFilter a) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}//______________________________end class______________________________________
