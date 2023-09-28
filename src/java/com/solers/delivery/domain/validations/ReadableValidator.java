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

//import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


//import org.hibernate.validator.Validator;
//import com.solers.delivery.validator.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class ReadableValidator implements ConstraintValidator<Readable, String>
{
    @Override
	public boolean isValid(String path, ConstraintValidatorContext notused) 
        {
		boolean valid = false;
		if ((path != null) && (!path.isEmpty())) 
                {
			Path p = Paths.get(path);
			valid = Files.isReadable(p);
		}
		return valid;
	}

    @Override
    public void initialize(Readable a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

