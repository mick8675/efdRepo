package com.solers.delivery.rest.admin;

import java.util.ArrayList;
import java.util.List;

import org.restlet.Context;
import org.restlet.data.MediaType;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Status;
import org.restlet.representation.Representation;
//import org.restlet.resource.Resource;
import org.restlet.resource.ResourceException;
import org.restlet.representation.Variant;

import com.solers.delivery.alerts.AlertService;
import com.solers.delivery.domain.Alert;
import com.solers.delivery.domain.Alert.AlertType;
import com.solers.delivery.rest.Utils;
import com.solers.delivery.rest.converter.AdminConverter;
import java.io.IOException;
import org.restlet.resource.ServerResource;


public class AlertResource extends ServerResource 
{
    
    private final AlertService service;
    private final AdminConverter converter;
    
    private Long id;
    
    public AlertResource(AlertService service, AdminConverter converter) 
    {
        this.service = service;
        this.converter = converter;
    }

    //@Override
    public boolean allowDelete() 
    {
        return true;
    }

    //@Override
    public boolean allowPut() 
    {
        return true;
    }
    
    @Override
    public void init(Context context, Request request, Response response) {
        super.init(context, request, response);
        getVariants().add(new Variant(MediaType.TEXT_XML));
        getVariants().add(new Variant(MediaType.APPLICATION_JSON));

        String idValue = (String) request.getAttributes().get("id");
        if (idValue != null) {
            id = Utils.convertLong(idValue, response);
        }
    }

    
    public void removeRepresentations() throws ResourceException {
        Utils.sendEmptyResponse(getResponse());
        
        if (id == null || id == 0) {
            List<Long> ids = new ArrayList<>();
            for (String value : getQuery().getValuesArray("ids")) {
                ids.add(Utils.convertLong(value, getResponse()));
            }
            
            if (ids.size() == 0) {
                getResponse().setStatus(Status.CLIENT_ERROR_BAD_REQUEST);
                return;
            } else {
                service.remove(ids);
            }
        } else {
            service.remove(id);
        }        
    }
    
    
    public void storeRepresentation(Representation entity) throws ResourceException, IOException {
        Utils.sendEmptyResponse(getResponse());
        Alert alert = (Alert) converter.convert(entity);
        service.save(alert);
    }

    
    public Representation represent(Variant variant) throws ResourceException {
        if (id == null) {
            Long typeValue = Long.parseLong(getQuery().getFirstValue("type"));
            AlertType type = null;
            for (AlertType t : AlertType.values()) {
                if (t.ordinal() == typeValue) {
                    type = t;
                }
            }
            Integer startIndex = Integer.parseInt(getQuery().getFirstValue("startIndex"));
            Integer numRecords = Integer.parseInt(getQuery().getFirstValue("numRecords"));
            return converter.to(variant, service.list(type, startIndex, numRecords));
        }
        return converter.to(variant, service.get(id));
    }
    
}
