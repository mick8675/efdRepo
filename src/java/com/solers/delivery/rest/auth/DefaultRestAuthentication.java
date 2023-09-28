package com.solers.delivery.rest.auth;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;


public class DefaultRestAuthentication implements RestAuthentication {

    private final String username;
    private final String password;
    
    public DefaultRestAuthentication(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public ChallengeResponse getDetails() {
        return new ChallengeResponse(ChallengeScheme.HTTP_BASIC, username, password);
    }
    
}
