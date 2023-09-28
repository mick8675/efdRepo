package com.solers.delivery.rest.content;

import org.restlet.Context;
import org.restlet.data.MediaType;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Status;
import org.restlet.representation.Representation;
import org.restlet.representation.Variant;

import com.solers.delivery.content.ContentService;
import com.solers.delivery.domain.ContentSet;
import com.solers.delivery.rest.Utils;


public class ContentSetResource extends ListingResource {
    
    private Long id;

    public ContentSetResource(ContentService service) {
        super(service);
    }
    
    //@Override
    public boolean allowDelete() 
    {
        return true;
    }

    @Override
    public void init(Context context, Request request, Response response) {
        super.init(context, request, response);
        getVariants().clear();
        getVariants().add(new Variant(MediaType.TEXT_XML));
        getVariants().add(new Variant(MediaType.APPLICATION_JSON));
        this.id = Utils.findId(request, response);
    }
    
    @Override
    public Representation represent(Variant variant) {  
        ContentSet cs = service.get(id);
        if (cs == null) {
            getResponse().setStatus(Status.CLIENT_ERROR_NOT_FOUND);
            return null;
        }
        
        return converter.to(variant.getMediaType(), cs);
    }
    
    /**
     * Ensure that the entity actually exists before attempting to save
     */
    @Override
    public void storeRepresentation(Representation entity) {
        ContentSet set = service.get(id);
        if (set == null) {
            getResponse().setStatus(Status.CLIENT_ERROR_NOT_FOUND, id+" not found");
        } else {
            super.storeRepresentation(entity);
        }
    }
    
    //@Override
    public void removeRepresentations() {
        ContentSet cs = service.get(id);
        if (cs != null) {
            service.remove(cs.getId());
        } else {
            getResponse().setStatus(Status.CLIENT_ERROR_NOT_FOUND);
        }
        Utils.sendEmptyResponse(getResponse());
    }
    
    @Override
    protected boolean shouldSave(ContentSet cs) {
        return cs.getId() != null && cs.getId().equals(id);
    }
}


/* keep - NOT original code
package com.solers.delivery.rest.content;

import org.restlet.Context;
import org.restlet.data.MediaType;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Status;
import org.restlet.representation.Representation;
import org.restlet.representation.Variant;

import com.solers.delivery.content.ContentService;
import com.solers.delivery.domain.ContentSet;
import com.solers.delivery.rest.Utils;
import org.restlet.resource.ServerResource;

public class ContentSetResource extends ServerResource 
{
    
    private Long id;
    public ContentService service;
    
    public ContentSetResource(ContentService service) 
    {
        super();
        this.service = service;
    }
    //@Override
    public boolean allowDelete() 
    {
        return true;
    }

    @Override
    public void init(Context context, Request request, Response response) 
    {
        super.init(context, request, response);
        getVariants().clear();
        getVariants().add(new Variant(MediaType.TEXT_XML));
        getVariants().add(new Variant(MediaType.APPLICATION_JSON));
        this.id = Utils.findId(request, response);
    }
    
    //@Override
    public Representation represent(Variant variant) {  
        ContentSet cs = service.get(id);
        if (cs == null) {
            getResponse().setStatus(Status.CLIENT_ERROR_NOT_FOUND);
            return null;
        }
        
        return converter.to(variant.getMediaType(), cs);
    }
    
   
    @Override
    public void storeRepresentation(Representation entity) {
        ContentSet set = service.get(id);
        if (set == null) {
            getResponse().setStatus(Status.CLIENT_ERROR_NOT_FOUND, id+" not found");
        } else {
            super.storeRepresentation(entity);
        }
    }
    
    @Override
    public void removeRepresentations() {
        ContentSet cs = service.get(id);
        if (cs != null) {
            service.remove(cs.getId());
        } else {
            getResponse().setStatus(Status.CLIENT_ERROR_NOT_FOUND);
        }
        Utils.sendEmptyResponse(getResponse());
    }
    
    @Override
    protected boolean shouldSave(ContentSet cs) {
        return cs.getId() != null && cs.getId().equals(id);
    }
}
*/