package com.solers.delivery.rest.op;

import com.solers.delivery.content.ContentService;
import com.solers.delivery.domain.ContentSet;
import com.solers.delivery.rest.BaseEnableResource;
import org.restlet.representation.Representation;

/**
 * Enables or disables a given content set.
 * 
 * This resource only accepts PUT requests and requires that the entity body
 * be either "true" or "false".  
 * 
 * Enabling a content set that is already enabled has no effect.
 * Disable a content set that is already disabled has no effect.
 * 
 */
public class EnableResource extends BaseEnableResource<ContentSet> 
{
    
    private final ContentService service;
    
    public EnableResource(ContentService service) 
    {
        this.service = service;
    }

    @Override
    protected void disable(ContentSet item) 
    {
        service.disable(item.getId());
    }

    @Override
    protected void enable(ContentSet item) 
    {
        service.enable(item.getId());
    }

    @Override
    protected ContentSet lookup(long id) 
    {
        return service.get(id);
    }

    
    public String getAttribute(String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    
    public Representation handle() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    
    public void setAttribute(String string, Object o) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
   
}
