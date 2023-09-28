package com.solers.delivery.rest.reports;

import org.restlet.Context;
import org.restlet.data.MediaType;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.representation.Representation;
import org.restlet.resource.Resource;
import org.restlet.representation.Variant;

import com.solers.delivery.management.StatusService;
import com.solers.delivery.rest.converter.StatusConverter;
import org.restlet.resource.ServerResource;

public class CurrentStatusResource extends ServerResource 
{
    
    private final StatusService service;
    private final StatusConverter converter;

    public CurrentStatusResource(StatusService service) {
        this.service = service;
        this.converter = new StatusConverter();
    }
    
    @Override
    public void init(Context context, Request request, Response response) {
        super.init(context, request, response);
        getVariants().add(new Variant(MediaType.TEXT_XML));
        getVariants().add(new Variant(MediaType.APPLICATION_JSON));
    }
    
    //@Override
    public Representation represent(Variant variant) {
        return converter.to(variant, service.getCurrentSynchronizations());
    }

}
