package com.solers.delivery.reports.metrics.server;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.resource.Resource;
import org.restlet.resource.ResourceException;
import org.restlet.representation.Variant;

import com.solers.delivery.reports.metrics.server.csv.CsvStore;
import org.restlet.resource.ServerResource;


public class DataResource extends ServerResource 
{

    private static final Logger log = Logger.getLogger(DataResource.class);
    
    private final CsvStore store;
    
    public DataResource(CsvStore store) {
        this.store = store;
        getVariants().add(new Variant(MediaType.TEXT_XML));
    }
    
    
    public void storeRepresentation(Representation entity) throws ResourceException 
    {
        String host = getRequest().getClientInfo().getAddress();
        try {
            String xml = entity.getText();
            store.store(host, xml);
        } 
        catch (IOException ex) 
        {
            log.error("Error storing message from host: "+host, ex);
            throw new ResourceException(ex);
        }
    }
    
      
    public boolean allowGet() 
    {
        return false;
    }

    public boolean allowPut() 
    {
        return true;
    }
}
