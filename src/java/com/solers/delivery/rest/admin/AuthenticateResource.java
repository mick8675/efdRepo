package com.solers.delivery.rest.admin;

import org.restlet.Context;
import org.restlet.data.MediaType;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Status;
import org.restlet.representation.Representation;
import org.restlet.resource.Resource;
import org.restlet.representation.Variant;
import org.springframework.security.core.Authentication;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import com.solers.delivery.rest.Utils;
import com.solers.delivery.rest.converter.AdminConverter;
import com.solers.delivery.security.RestfulAuthenticationDetails;
import com.solers.delivery.user.PasswordService;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.restlet.resource.ServerResource;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:kevin.conaway@solers.com">Kevin Conaway</a>
 */
@Component
public class AuthenticateResource extends ServerResource 
{
    
    private final AdminConverter converter;
    private final ProviderManager provider;
    private final PasswordService passwordService;
    
    private String username;
    
    public AuthenticateResource(AdminConverter converter, ProviderManager provider, PasswordService passwordService) {
        this.converter = converter;
        this.provider = provider;
        this.passwordService = passwordService;
    }
    
    @Override
    public void init(Context context, Request request, Response response) {
        super.init(context, request, response);
        getVariants().add(new Variant(MediaType.TEXT_XML));
        
        username = Utils.findString(request, response, "username");
    }
    
    
    public boolean allowPut() {
        return true;
    }
    
    
    public boolean allowGet() {
        return false;
    }
    
    
    public void storeRepresentation(Representation entity) {
        SecurityContextHolder.clearContext();
        RestfulAuthenticationDetails details=null;
        try {
            details = (RestfulAuthenticationDetails) converter.convert(entity);
        } catch (IOException ex) {
            Logger.getLogger(AuthenticateResource.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, details.getPassword());
        token.setDetails(details);
        
        try 
        {
            //Authentication result = provider.doAuthentication(token);
            Authentication result = provider.authenticate(token);
            if (passwordService.isPasswordExpired(username)) 
            {
                throw new CredentialsExpiredException("User credentials have expired");
            }
            getResponse().setEntity(converter.to(MediaType.TEXT_XML, result));
        } 
        //catch (SpringSecurityException ex) 
        catch(AuthenticationException ex)
        {
            getResponse().setStatus(Status.CLIENT_ERROR_UNAUTHORIZED);
            Utils.setException(getRequest(), getResponse(), ex);
        }
    }
    
}
