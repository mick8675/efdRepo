package com.solers.delivery.rest.auth;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;



public class AcegiRestAuthentication implements RestAuthentication {

    @Override
    public ChallengeResponse getDetails() {
        SecurityContext ctx = SecurityContextHolder.getContext();
        if (ctx != null) {
            Authentication auth = ctx.getAuthentication();
            if (auth != null && auth.getCredentials() != null) 
            {
                char[] credentials = auth.getCredentials().toString().toCharArray();
                return new ChallengeResponse(ChallengeScheme.HTTP_BASIC, auth.getName(), credentials);
            }
        }
        return null;
    }

}


/*
public class AcegiRestAuthentication implements RestAuthentication {

    @Override
    public ChallengeResponse getDetails() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null && auth.getCredentials() != null) {
            char[] credentials = auth.getCredentials().toString().toCharArray();
            return new ChallengeResponse(ChallengeScheme.HTTP_BASIC, auth.getName(), credentials);
        }
        return null;
    }

}
*/