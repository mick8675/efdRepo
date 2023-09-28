package com.solers.delivery.content;

import java.util.ArrayList;
import java.util.List;

import org.restlet.data.MediaType;
import org.restlet.Response;
import org.restlet.data.Status;

import com.solers.delivery.domain.ConsumerContentSet;
import com.solers.delivery.domain.ContentSet;
import com.solers.delivery.rest.RestfulService;
import com.solers.delivery.rest.Utils;
import com.solers.delivery.rest.auth.RestAuthentication;
import com.solers.delivery.rest.converter.ContentSetConverter;
import com.solers.util.dao.ValidationException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * REST implementation of ContentService
 * 
 */
public class RestfulContentService extends RestfulService implements ContentService 
{
    
    private final ContentSetConverter converter;
    private RestAuthentication authentication;
    private String myHost;
    private Integer myPort;
    
    public RestfulContentService(String host, int port, RestAuthentication auth) {
        super(host, port, auth);
        this.converter = new ContentSetConverter();
        this.authentication = auth;
        this.myHost=host;
        this.myPort=port;
    }

    
    
    
    @Override
    public void disable(Long id) {
        put("false", MediaType.TEXT_PLAIN, "op/enable/", id);
    }

    @Override
    public void enable(Long id) {
        put("true", MediaType.TEXT_PLAIN, "op/enable/", id);
    }
    
    @Override
    public void remove(Long id) {
        delete("content/", id);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T extends ContentSet> T get(Long id) {
        Response response = get("content/", id);
        if (response.getStatus().equals(Status.CLIENT_ERROR_NOT_FOUND)) {
            return null;
        }
        return (T) converter.from(response.getEntity());
    }

    @Override
    public List<ContentSet> getContentSets() {
        return converter.fromList(get("content/").getEntity());
    }
    
    @Override
    public List<ContentSet> getSuppliers() {
        List<ContentSet> result = new ArrayList<>();
        
        for (ContentSet set : getContentSets()) {
            if (set.isSupplier()) {
                result.add(set);
            }
        }
        
        return result;
    }
    
    @Override
    public List<ConsumerContentSet> getConsumers() {
        List<ConsumerContentSet> result = new ArrayList<>();
        
        for (ContentSet set : getContentSets()) {
            if (!set.isSupplier()) {
                result.add((ConsumerContentSet)set);
            }
        }
        
        return result;
    }

    @Override
    public Long save(ContentSet contentSet) throws ValidationException {
        Response response = put(converter.to(MediaType.TEXT_XML, contentSet), "content/", contentSet.getId());
        Utils.checkForException(response);
        try { 
            return (Long) converter.convert(response.getEntity());
        } catch (IOException ex) {
            Logger.getLogger(RestfulContentService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
        
    @Override
    public RestAuthentication getAuthentication() 
    {
        return authentication;
    }
    
    @Override
    public void setAuthentication(RestAuthentication auth) 
    {
        this.authentication = auth;
    }
    
    @Override
    public void setPort(int port) 
    {
        //Properties properties = new Properties();
        //properties.setProperty("org.restlet.http.port", Integer.toString(port));
        //super.setConnectionParameters(properties);
        this.myPort=port;

    }

    @Override
    public void setHost(String host) 
    {
        this.myHost=host;
    }

    
    @Override
    public int getPort() 
    {

        return this.myPort;
    }
    
    @Override
    public String getHost() 
    {
        return myHost; 
    }
    
}
