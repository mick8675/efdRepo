package com.solers.delivery.domain.validations;


import com.solers.delivery.domain.ContentSet;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
     * This <code>isValid</code> method will determine whether the FTP 
     * connection associated with GBS transport is valid.
     *
     */
public class ValidFtpConnectionValidatorTestCase implements ConstraintValidator<ValidFtpConnection, ContentSet> 
{

    @Override
    public boolean isValid(ContentSet cs, ConstraintValidatorContext unused) 
    {
        boolean valid = false;
        if (cs != null) 
        {
            if (cs.isSupplier()) 
            {
                if (cs.isSupportsGbsTransport()) 
                {
                        valid = (cs.getFtpConnection() != null);
                }
                else 
                {
                        valid = (cs.getFtpConnection() != null);
                }
            }
        }
        return valid;
    }

    @Override
    public void initialize(ValidFtpConnection a) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}//__________________end class_________________________________________________
