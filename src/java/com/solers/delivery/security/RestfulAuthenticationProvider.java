package com.solers.delivery.security;

import org.apache.log4j.Logger;
import org.restlet.data.MediaType;
import org.restlet.Response;
import org.restlet.data.Status;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.authentication.AuthenticationProvider;
       
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.rcp.RemoteAuthenticationException;
import org.springframework.security.web.authentication.WebAuthenticationDetails;

import com.solers.delivery.rest.RestfulService;
import com.solers.delivery.rest.Utils;
import com.solers.delivery.rest.converter.AdminConverter;
import java.io.IOException;
import java.util.logging.Level;
import org.springframework.stereotype.Component;

@Component
public class RestfulAuthenticationProvider implements AuthenticationProvider {
    
    private static final Logger log = Logger.getLogger(RestfulAuthenticationProvider.class);
    
    private final RestfulService service;
    private final AdminConverter converter;
    
    public RestfulAuthenticationProvider(RestfulService service, AdminConverter converter) {
        this.service = service;
        this.converter = converter;
    }

    /**
     * @param authentication
     * @return 
     * @see org.springframework.security.AuthenticationManager#authenticate(org.springframework.security.Authentication)
     */
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException 
    {
        WebAuthenticationDetails source = (WebAuthenticationDetails) authentication.getDetails();
        RestfulAuthenticationDetails details = new RestfulAuthenticationDetails(source.getRemoteAddress(), source.getSessionId(), (String) authentication.getCredentials());
        Response response = service.put(converter.to(MediaType.TEXT_XML, details), "admin/authenticate", authentication.getName());
        Utils.checkForException(response);
        
        if (response.getStatus().equals(Status.SUCCESS_OK)) {
            try {
                return (Authentication) converter.convert(response.getEntity());
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(RestfulAuthenticationProvider.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        } else {
            log.warn("Unexpected response: "+response.getStatus());
            throw new RemoteAuthenticationException("Error authenticating.  Server responded with: "+response.getStatus());
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean supports(Class authentication) {
        return authentication.isAssignableFrom(UsernamePasswordAuthenticationToken.class);
    }

}
