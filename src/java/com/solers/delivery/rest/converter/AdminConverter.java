package com.solers.delivery.rest.converter;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.restlet.data.MediaType;
import org.restlet.representation.Representation;


import com.solers.delivery.domain.User;
import com.solers.delivery.security.PasswordType;
import com.solers.security.EncryptionUtils;
import com.solers.security.password.PasswordProvider;
import com.thoughtworks.xstream.XStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Converter to handle "admin" domain objects: User and Password. The converter (en/de)crypts the XML before returning
 * the result to the caller.
 */
public class AdminConverter extends Converter {

    private final PasswordProvider provider;

    public AdminConverter(PasswordProvider provider) {
        this.provider = provider;
    }

    public User convertUser(Representation r) {
        try {
            return (User) convert(r);
        } catch (IOException ex) {
            Logger.getLogger(AdminConverter.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public String[] convertPasswords(Representation r) {
        try {
            return (String[]) convert(r);
        } catch (IOException ex) {
            Logger.getLogger(AdminConverter.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    protected XStream initialize(XStream stream) {
        stream.setMode(XStream.NO_REFERENCES);
        stream.alias("user", User.class);
        return stream;
    }

    @Override
    protected InputStream getInputStream(Representation r) {

        // KRJ 2016-08-31: Converted r.getStream call to "try with resources"
        // based on an HP Fortify recommendation

        try (InputStream inputStream = r.getStream()) {
            byte[] bytes = IOUtils.toByteArray(inputStream);
            Cipher cipher = getCipher(Cipher.DECRYPT_MODE);
            byte[] plain = cipher.doFinal(Base64.decodeBase64(bytes));
            return new ByteArrayInputStream(plain);
        } catch (GeneralSecurityException ex) {
            throw new ConverterException(ex);
        } catch (IOException ex) {
            throw new ConverterException(ex);
        }
    }

    @Override
    protected String toString(XStream stream, Object arg) {
        String xml = stream.toXML(arg);
        try {
            Cipher cipher = getCipher(Cipher.ENCRYPT_MODE);
            byte[] encrypted = cipher.doFinal(xml.getBytes());
            return new String(Base64.encodeBase64(encrypted));
        } catch (GeneralSecurityException ex) {
            throw new ConverterException(ex);
        }
    }

    private Cipher getCipher(int opmode) throws GeneralSecurityException {
        Cipher result = Cipher.getInstance("AES");
        result.init(opmode, getKey());
        return result;
    }

    private Key getKey() {
        byte[] bytes = EncryptionUtils.fromHex(provider.getPassword(PasswordType.ENCRYPTION.key()));
        return new SecretKeySpec(bytes, "AES");
    }
}


/*package com.solers.delivery.rest.converter;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.restlet.representation.Representation;

import com.solers.delivery.domain.User;
import com.solers.delivery.security.PasswordType;
import com.solers.security.EncryptionUtils;
import com.solers.security.password.PasswordProvider;
import com.thoughtworks.xstream.XStream;
*/
/**
 * Converter to handle "admin" domain objects: User and Password.  The converter (en/de)crypts the XML before returning
 * the result to the caller.
 * 
 */
/*
public class AdminConverter extends Converter 
{

    private final PasswordProvider provider;
    
    public AdminConverter(PasswordProvider provider) 
    {
        this.provider = provider;
    }

    public User convertUser(Representation r) 
    {
        return (User) convert(r);
    }
    
    public String[] convertPasswords(Representation r) 
    {
        return (String[]) convert(r);
    }
    
    @Override
    protected XStream initialize(XStream stream) 
    {
        stream.setMode(XStream.NO_REFERENCES);
        stream.alias("user", User.class);
        return stream;
    }

    @Override
    protected InputStream getInputStream(Representation r) 
    {
        
        // KRJ 2016-08-31: Converted r.getStream call to "try with resources"
        // based on an HP Fortify recommendation
        
        try (InputStream inputStream = r.getStream()) 
        {
            byte [] bytes = IOUtils.toByteArray(inputStream);
            Cipher cipher = getCipher(Cipher.DECRYPT_MODE);
            byte [] plain = cipher.doFinal(Base64.decodeBase64(bytes));
            return new ByteArrayInputStream(plain);
        } 
        catch (GeneralSecurityException | IOException ex) 
        {
            throw new ConverterException(ex);
        }
    }

    @Override
    protected String toString(XStream stream, Object arg) 
    {
        String xml = stream.toXML(arg);
        try 
        {
            Cipher cipher = getCipher(Cipher.ENCRYPT_MODE);
            byte [] encrypted = cipher.doFinal(xml.getBytes());
            return new String(Base64.encodeBase64(encrypted));
        } 
        catch (GeneralSecurityException ex) 
        {
            throw new ConverterException(ex);
        }
    }
    
    private Cipher getCipher(int opmode) throws GeneralSecurityException {
        Cipher result = Cipher.getInstance("AES");
        result.init(opmode, getKey());
        return result;
    }
    
    private Key getKey() {
        byte [] bytes = EncryptionUtils.fromHex(provider.getPassword(PasswordType.ENCRYPTION.key()));
        return new SecretKeySpec(bytes, "AES");
    }
}
*/