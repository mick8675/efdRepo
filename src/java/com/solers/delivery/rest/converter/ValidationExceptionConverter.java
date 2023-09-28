package com.solers.delivery.rest.converter;

import org.restlet.representation.Representation;
import org.springframework.security.core.AuthenticationException;

import com.solers.delivery.util.password.InvalidPasswordException;
import com.solers.util.dao.ValidationException;
import com.thoughtworks.xstream.XStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ValidationExceptionConverter extends Converter {
    
    public RuntimeException from(Representation r) {
        try {
            return (RuntimeException) convert(r);
        } catch (IOException ex) {
            Logger.getLogger(ValidationExceptionConverter.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    protected XStream initialize(XStream stream) {
        stream.setMode(XStream.NO_REFERENCES);
        
        stream.omitField(Throwable.class, "stackTrace");
        stream.alias("validation-errors", ValidationException.class);
        stream.alias("invalid-password", InvalidPasswordException.class);
        stream.alias("authentication-exception", AuthenticationException.class);
        stream.addImplicitCollection(ValidationException.class, "messages");
        
        return stream;
    }
}
