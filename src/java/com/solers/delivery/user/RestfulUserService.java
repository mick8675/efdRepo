package com.solers.delivery.user;

import java.util.List;
import java.util.Properties;

import org.restlet.data.MediaType;
import org.restlet.Response;
import org.restlet.data.Status;

import com.solers.delivery.domain.User;
import com.solers.delivery.rest.RestfulService;
import com.solers.delivery.rest.Utils;
import com.solers.delivery.rest.auth.RestAuthentication;
import com.solers.delivery.rest.converter.AdminConverter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RestfulUserService implements UserService {
    
    private final AdminConverter converter;
    private final RestfulService service;
    
    public RestfulUserService(String host, int port, RestAuthentication auth, Properties connectionParameters, AdminConverter converter) {
        service = new RestfulService(host, port, auth);
        service.setConnectionParameters(connectionParameters);
        this.converter = converter;
    }
    
    @Override
    public User get(String username) {
         Response response = service.get("admin/user/", username);
    	
        if (response.getStatus().equals(Status.CLIENT_ERROR_NOT_FOUND)) {
            return null;
        }
        
        Utils.checkForException(response);
        
        return converter.convertUser(response.getEntity());
    }
    
    @Override
    public User get(Long id) {
        Response response = service.get("admin/user/", id);
        if (response.getStatus().equals(Status.CLIENT_ERROR_NOT_FOUND)) {
            return null;
        }
        return converter.convertUser(response.getEntity());
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getUsers() {
        try {
            return (List<User>) converter.convert(service.get("admin/user/").getEntity());
        } catch (IOException ex) {
            Logger.getLogger(RestfulUserService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void disable(Long id) {
        service.put("false", MediaType.TEXT_PLAIN, "admin/user/enable/", id);
    }

    @Override
    public void enable(Long id) {
        service.put("true", MediaType.TEXT_PLAIN, "admin/user/enable/", id);
    }

    @Override
    public void remove(Long id) {
        service.delete("admin/user/", id);
    }

    @Override
    public Long save(User user) {
        Response response = service.put(converter.to(MediaType.TEXT_XML, user), "admin/user/", user.getId());
        Utils.checkForException(response);
        try {
            return (Long) converter.convert(response.getEntity());
        } catch (IOException ex) {
            Logger.getLogger(RestfulUserService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
