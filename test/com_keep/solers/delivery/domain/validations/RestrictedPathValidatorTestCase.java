package com.solers.delivery.domain.validations;

import java.io.File;
import java.io.IOException;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.solers.delivery.util.FileSystemUtil;


public class RestrictedPathValidatorTestCase implements ConstraintValidator<RestrictedPath, File> 
{
    
      private static final Logger LOGGER = LoggerFactory.getLogger(RestrictedPathValidator.class);
    
      
      /**
     * This <code>isValid</code> method will determine whether input File
     * falls within the EFD directories.  
     * 
     * @param source
     * @param arg1
     * @return True if the incoming file falls underneath the EFD home
     * directory.
     */
      
    @Override
	public boolean isValid(File source, ConstraintValidatorContext arg1) 
        {
            boolean valid = false;
            if (source != null) 
            { 
	        try 
                {
	            String canonicalPath = source.getCanonicalPath();
	            String efdPath = FileSystemUtil.getEFDHome().getCanonicalPath();
	            valid = FileSystemUtil.pathIsChild(canonicalPath, efdPath);
	        } 
                catch (IOException ioe) 
                {
                    LOGGER.warn("Failed to canonicalize path.", ioe);
	            return true;
	        }
            }
		return valid;
	}

    @Override
    public void initialize(RestrictedPath a) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
   

   
    
    
    
}//______________________________________end of class__________________________
