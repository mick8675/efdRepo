package com.solers.delivery.rest;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Status;
import org.restlet.representation.Representation;
import org.restlet.resource.Resource;
import org.restlet.resource.ServerResource;

/**
 * @param <T>
 */
public abstract class BaseEnableResource<T> extends ServerResource 
{
    
    private static final Logger logger = Logger.getLogger(BaseEnableResource.class);
    
    protected long id;
    
    //@Override
    public boolean allowPut() {
        return true;
    }
    
    //@Override
    public boolean allowGet() {
        return false;
    }
    
    @Override
    public void init(Context context, Request request, Response response) {
        super.init(context, request, response);
        this.id = Utils.findId(request, response);
    }
    
    //@Override
    public void storeRepresentation(Representation entity) {
        T item = lookup(id);
        if (item == null) {
            getResponse().setStatus(Status.CLIENT_ERROR_NOT_FOUND, id+" not found");
            return;
        }
        
        String text = getText(entity);
        if (enabling(text)) {
            enable(item);
        } else if (disabling(text)) {
            disable(item);
        } else {
            getResponse().setStatus(Status.CLIENT_ERROR_BAD_REQUEST);
        }
        Utils.sendEmptyResponse(getResponse());
    }
    
    protected String getText(Representation entity) {
        try {
            return entity.getText();
        } catch (IOException ex) {
            logger.warn("Exception occurred parsing control data: ", ex);
            return null;
        }
    }
    
    protected boolean enabling(String text) {
        return text != null && text.equalsIgnoreCase("true");
    }
    
    protected boolean disabling(String text) {
        return text != null && text.equalsIgnoreCase("false");
    }
    
    protected abstract T lookup(long id);
    
    protected abstract void enable(T item);
    protected abstract void disable(T item);
    
}
