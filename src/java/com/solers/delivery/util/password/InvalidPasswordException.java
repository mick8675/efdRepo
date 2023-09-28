package com.solers.delivery.util.password;

import org.springframework.security.core.AuthenticationException;

public class InvalidPasswordException extends AuthenticationException {
    
    private static final long serialVersionUID = 1l;

    public InvalidPasswordException(String message) {
        super(message);
    }

}
