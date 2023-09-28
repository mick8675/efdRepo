package com.solers.delivery.util.password;

import org.springframework.dao.DataAccessException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserPasswordEncoder implements PasswordEncoder {

    private final PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
    
    public String encode(CharSequence rawPassword) {
        return encoder.encode(rawPassword);
    }
    
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encoder.matches(rawPassword, encodedPassword);
    }
    
    public String encodePassword(String rawPass) throws DataAccessException {
        return encoder.encode(rawPass);
    }

    public boolean isPasswordValid(String encPass, String rawPass) throws DataAccessException {
        return encoder.matches(rawPass, encPass);
    }
}
/*
package com.solers.delivery.util.password;

import org.springframework.dao.DataAccessException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
//import org.springframework.security.authentication.encoding;//.ShaPasswordEncoder;
//import org.springframework.security.authentication.encoding.ShaPasswordEncoder;

*/

/**
 * Encapsulates the configuration of the Spring Security Password encoder in one place.
 * 
 * Password encoding happens in the course of the normal application as well
 * as during the installer.  Normally the Spring Security encoder would be configured through 
 * Spring but we don't use any Spring configs during the installer
 * 
 * Thus, it is necessary that the encoder be accessible without special configuration.
 * 
 * We use a constant salt value so any salt value passed is ignored
 * 
 * @author <a href="mailto:kevin.conaway@solers.com">Kevin Conaway</a>
 */
/*
public class UserPasswordEncoder implements PasswordEncoder {

    private final ShaPasswordEncoder encoder;
    private final String salt;
    
    public UserPasswordEncoder() {
        encoder = new ShaPasswordEncoder();
        salt = "SALT";
    }
    
    public String encodePassword(String rawPass) {
        return encoder.encodePassword(rawPass, this.salt);
    }
    
    public boolean isPasswordValid(String encPass, String rawPass) throws DataAccessException {
        return encoder.isPasswordValid(encPass, rawPass, this.salt);
    }
    
    @Override
    public String encodePassword(String rawPass, Object salt) throws DataAccessException {
        return encodePassword(rawPass);
    }
    
    @Override
    public boolean isPasswordValid(String encPass, String rawPass, Object salt) throws DataAccessException {
        return isPasswordValid(encPass, rawPass);
    }

}

public class UserPasswordEncoder// implements PasswordEncoderFactories {
{
    private final PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
    
    private final String salt;
    
    public UserPasswordEncoder() 
    {
        //encoder = new PasswordEncoder();
        salt = "SALT";
    }
    
    public String encodePassword(String rawPass) throws DataAccessException 
    {
        return encoder.encode(rawPass);
        //return encoder.encodePassword(rawPass, this.salt);
    }
    
    public boolean isPasswordValid(String encPass, String rawPass) throws DataAccessException 
    {
        return encoder.matches(rawPass, encPass);
        //return encoder.isPasswordValid(encPass, rawPass, this.salt);
    }*/
    
   /* @Override
    public String encodePassword(String rawPass, Object salt) throws DataAccessException {
        return encodePassword(rawPass);
    }
    
    @Override
    public boolean isPasswordValid(String encPass, String rawPass, Object salt) throws DataAccessException {
        return isPasswordValid(encPass, rawPass);
    }

}*/

