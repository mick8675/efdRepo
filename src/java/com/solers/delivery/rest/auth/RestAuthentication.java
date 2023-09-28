package com.solers.delivery.rest.auth;

import org.restlet.data.ChallengeResponse;

public interface RestAuthentication 
{
    
    /**
     * @return The authentication details
     */
    ChallengeResponse getDetails();
    
}
