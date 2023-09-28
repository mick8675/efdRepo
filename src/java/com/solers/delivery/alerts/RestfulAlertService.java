
package com.solers.delivery.alerts;

import java.util.Collection;

import org.restlet.data.MediaType;
import org.restlet.data.Method;
import org.restlet.data.Reference;
import org.restlet.Request;
import org.restlet.Response;

import com.solers.delivery.domain.Alert;
import com.solers.delivery.domain.Alert.AlertType;
import com.solers.delivery.rest.RestfulService;
import com.solers.delivery.rest.Utils;
import com.solers.delivery.rest.auth.RestAuthentication;
import com.solers.delivery.rest.converter.AdminConverter;
import com.solers.util.Page;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RestfulAlertService extends RestfulService implements AlertService 
{
    
    private final AdminConverter converter;
    
    public RestfulAlertService(String host, int port, RestAuthentication auth, AdminConverter converter) 
    {
        super(host, port, auth);
        this.converter = converter;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public Page<Alert> list(AlertType type, int startIndex, int numRecords) 
    {
        try {
            Reference uri = uri("admin/alerts/");
            uri.addQueryParameter("type", String.valueOf(type.ordinal()));
            uri.addQueryParameter("startIndex", String.valueOf(startIndex));
            uri.addQueryParameter("numRecords", String.valueOf(numRecords));
            Request request = new Request(Method.GET, uri);
            Response response = (Response) handle(request);
            Utils.checkForException(response);
            return (Page<Alert>) converter.convert(response.getEntity());
        } catch (IOException ex) {
            Logger.getLogger(RestfulAlertService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void remove(Long id) 
    {
        Response response = (Response) delete("admin/alerts/", id);
        Utils.checkForException(response);
    }

    @Override
    public void save(Alert alert) 
    {
        Response response = (Response) put(converter.to(MediaType.TEXT_XML, alert), "admin/alerts/");
        Utils.checkForException(response);
    }

    @Override
    public Alert get(Long id) 
    {
        try {
            Response response = (Response) get("admin/alerts/", id);
            Utils.checkForException(response);
            return (Alert) converter.convert(response.getEntity());
        } catch (IOException ex) {
            Logger.getLogger(RestfulAlertService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void remove(Collection<Long> ids) 
    {
        if (ids == null || ids.isEmpty()) 
        {
            return;
        }
        Reference uri = uri("admin/alerts/");
        for (Long id : ids) 
        {
            uri.addQueryParameter("ids", id.toString());
        }
        Request request = new Request(Method.DELETE, uri);
        Response response = (Response) handle(request);
        Utils.checkForException(response);
    }

}
