package com.solers.delivery.rest.reports;

import org.restlet.Context;
import org.restlet.data.MediaType;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Status;
import org.restlet.representation.Representation;
import org.restlet.resource.Resource;
import org.restlet.representation.Variant;

import com.solers.delivery.content.ContentService;
import com.solers.delivery.domain.ContentSet;
import com.solers.delivery.management.ConsumerStatus;
import com.solers.delivery.management.StatusService;
import com.solers.delivery.management.SupplierStatus;
import com.solers.delivery.rest.Utils;
import com.solers.delivery.rest.converter.StatusConverter;
import org.restlet.resource.ServerResource;

public class StatusResource extends ServerResource 
{
    
    private final StatusService status;
    private final ContentService service;
    private final StatusConverter converter;
    
    private long id;
    
    public StatusResource(StatusService status, ContentService service) {
        this.status = status;
        this.service = service;
        this.converter = new StatusConverter();
    }
    
    @Override
    public void init(Context context, Request request, Response response) {
        super.init(context, request, response);
        getVariants().add(new Variant(MediaType.TEXT_XML));
        getVariants().add(new Variant(MediaType.APPLICATION_JSON));
        this.id = Utils.findId(request, response);
    }
    
    //@Override
    public Representation represent(Variant variant) {
        ContentSet cs = service.get(id);
        
        if (cs == null) {
            getResponse().setStatus(Status.CLIENT_ERROR_NOT_FOUND, id + " not found");
            return null;
        }
        
        if (cs.isSupplier()) {
            SupplierStatus supplier = status.getSupplierStatus(id);
            return converter.to(variant.getMediaType(), supplier);
        }
        
        ConsumerStatus consumer = status.getConsumerStatus(id);
        return converter.to(variant.getMediaType(), consumer);
    }
}
