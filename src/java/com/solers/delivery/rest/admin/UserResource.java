package com.solers.delivery.rest.admin;

import org.apache.log4j.Logger;
import org.restlet.data.MediaType;
import org.restlet.data.Reference;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Status;
import org.restlet.representation.Representation;
import org.restlet.resource.Resource;
import org.restlet.representation.Variant;

import com.solers.delivery.domain.User;
import com.solers.delivery.rest.Utils;
import com.solers.delivery.rest.converter.AdminConverter;
import com.solers.delivery.user.UserService;
import com.solers.util.dao.ValidationException;
import org.restlet.resource.ServerResource;


public class UserResource extends ServerResource {
    
    private static final Logger log = Logger.getLogger(UserResource.class);
    
    private final UserService service;
    private final AdminConverter converter;
    
    private String username;
    private Long id;
    
    public UserResource(UserService service, AdminConverter converter) {
        this.service = service;
        this.converter = converter;
    }
    
    public boolean allowDelete() {
        return true;
    }
    
    public boolean allowPut() {
        return true;
    }
    
    @Override
    protected void doInit() {
        super.doInit();
        getVariants().add(new Variant(MediaType.TEXT_XML));
        getVariants().add(new Variant(MediaType.APPLICATION_JSON));
        
        id = -1L;
        username = null;
        if (getRequest().getAttributes().containsKey("id")) {
            String value = (String) getRequest().getAttributes().get("id");
            value = Reference.decode(value);
            try {
                id = Long.parseLong(value);
            } catch (NumberFormatException ex) {
                username = value;
            }
        }
    }

    public Representation represent(Variant variant) {
        if (id == -1 && username == null) {
            return converter.to(variant.getMediaType(), service.getUsers());
        }
        
        User user = null;
        if (username == null) {
            user = service.get(id);
        }
        if (id == -1) {
            user = service.get(username);
        }
        if (user == null) {
            setStatus(Status.CLIENT_ERROR_NOT_FOUND);
            return null;
        }
        return converter.to(variant.getMediaType(), user);
    }
    
    public void removeRepresentations() {
        if (id == -1) {
            setStatus(Status.CLIENT_ERROR_BAD_REQUEST);
            return;
        }
        
        User user = service.get(id);
        if (user != null) {
            service.remove(user.getId());
        } else {
            setStatus(Status.CLIENT_ERROR_NOT_FOUND);
        }
        Utils.sendEmptyResponse(getResponse());
    }
    
    public void storeRepresentation(Representation entity) 
    {
        Utils.sendEmptyResponse(getResponse());
        User user = convert(entity);
        if (user != null) 
        {
            try 
            {
                service.save(user);
                getResponse().setStatus(Status.SUCCESS_CREATED);
                getResponse().setEntity(converter.to(entity.getMediaType(), user.getId()));
            } 
            catch (ValidationException ex) 
            {
                Utils.sendValidationError(getRequest(), getResponse(), ex);
            }
        }  
    }
    
    protected User convert(Representation entity) 
    {
        try 
        {
            User user = converter.convertUser(entity);
            if (shouldSave(user)) 
            {
                return user;
            } 
            else 
            {
                String message = "Invalid ID specified in entity body: " + user.getId();
                log.warn(message);
                getResponse().setStatus(Status.CLIENT_ERROR_BAD_REQUEST, message);
            }
        } 
        catch (Exception ex) 
        {
            getResponse().setStatus(Status.CLIENT_ERROR_BAD_REQUEST, "Invalid data specified");
            log.warn("A conversion error occurred", ex);
        }
        return null;
    }
    
    /**
     * @param user
     * @return True if the entity should be saved
     */
    protected boolean shouldSave(User user) {
        if (id == -1) {
            return user.getId() == null;
        }
        return user.getId() != null && user.getId().equals(id);
    }
}



/* old code
package com.solers.delivery.rest.admin;

import org.apache.log4j.Logger;
import org.restlet.Context;
import org.restlet.data.MediaType;
import org.restlet.data.Reference;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Status;
import org.restlet.representation.Representation;
import org.restlet.resource.Resource;
import org.restlet.representation.Variant;

import com.solers.delivery.domain.User;
import com.solers.delivery.rest.Utils;
import com.solers.delivery.rest.converter.AdminConverter;
import com.solers.delivery.user.UserService;
import com.solers.util.dao.ValidationException;

public class UserResource extends Resource {
    
    private static final Logger log = Logger.getLogger(UserResource.class);
    
    private final UserService service;
    private final AdminConverter converter;
    
    private String username;
    private Long id;
    
    public UserResource(UserService service, AdminConverter converter) {
        this.service = service;
        this.converter = converter;
    }
    
    @Override
    public boolean allowDelete() {
        return true;
    }
    
    @Override
    public boolean allowPut() {
        return true;
    }
    
    @Override
    public void init(Context context, Request request, Response response) {
        super.init(context, request, response);
        getVariants().add(new Variant(MediaType.TEXT_XML));
        getVariants().add(new Variant(MediaType.APPLICATION_JSON));
        
        id = -1L;
        username = null;
        if (request.getAttributes().containsKey("id")) {
            String value = (String) request.getAttributes().get("id");
            value = Reference.decode(value);
            try {
                id = Long.parseLong(value);
            } catch (NumberFormatException ex) {
                username = value;
            }
        }
    }

    @Override
    public Representation represent(Variant variant) {
        if (id == -1 && username == null) {
            return converter.to(variant.getMediaType(), service.getUsers());
        }
        
        User user = null;
        if (username == null) {
            user = service.get(id);
        }
        if (id == -1) {
            user = service.get(username);
        }
        if (user == null) {
            getResponse().setStatus(Status.CLIENT_ERROR_NOT_FOUND);
            return null;
        }
        return converter.to(variant.getMediaType(), user);
    }
    
    @Override
    public void removeRepresentations() {
        if (id == -1) {
            getResponse().setStatus(Status.CLIENT_ERROR_BAD_REQUEST);
            return;
        }
        
        User user = service.get(id);
        if (user != null) {
            service.remove(user.getId());
        } else {
            getResponse().setStatus(Status.CLIENT_ERROR_NOT_FOUND);
        }
        Utils.sendEmptyResponse(getResponse());
    }
    
    @Override
    public void storeRepresentation(Representation entity) {
        Utils.sendEmptyResponse(getResponse());
        User user = convert(entity);
        if (user != null) {
            try {
                service.save(user);
                getResponse().setStatus(Status.SUCCESS_CREATED);
                getResponse().setEntity(converter.to(entity.getMediaType(), user.getId()));
            } catch (ValidationException ex) {
                Utils.sendValidationError(getRequest(), getResponse(), ex);
            }
        }  
    }
    
    protected User convert(Representation entity) {
        try {
            User user = converter.convertUser(entity);
            if (shouldSave(user)) {
                return user;
            } else {
                String message = "Invalid ID specified in entity body: " + user.getId();
                log.warn(message);
                getResponse().setStatus(Status.CLIENT_ERROR_BAD_REQUEST, message);
            }
        } catch (Exception ex) {
            getResponse().setStatus(Status.CLIENT_ERROR_BAD_REQUEST, "Invalid data specified");
            log.warn("A conversion error occurred", ex);
        }
        return null;
    }
    
   
    protected boolean shouldSave(User user) {
        if (id == -1) {
            return user.getId() == null;
        }
        return user.getId() != null && user.getId().equals(id);
    }
}
*/