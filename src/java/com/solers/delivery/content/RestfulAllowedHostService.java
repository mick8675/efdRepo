package com.solers.delivery.content;

import java.util.List;

import org.restlet.data.MediaType;
import org.restlet.data.Status;
import org.restlet.Response;
import org.restlet.representation.Representation;

import com.solers.delivery.domain.AllowedHost;
import com.solers.delivery.rest.RestfulService;
import com.solers.delivery.rest.Utils;
import com.solers.delivery.rest.auth.RestAuthentication;
import com.solers.delivery.rest.converter.AllowedHostConverter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RestfulAllowedHostService extends RestfulService implements AllowedHostService {

    private final AllowedHostConverter converter;

    public RestfulAllowedHostService(String host, int port, RestAuthentication auth) 
    {
        super(host, port, auth);
        converter = new AllowedHostConverter();
    }

    @Override
    public AllowedHost get(String alias) 
    {
        Response response = (Response) super.get("admin/allowedHost/", alias);
        if (response.getStatus().equals(Status.CLIENT_ERROR_NOT_FOUND)) 
        {
            return null;
        }
        return converter.convertAllowedHost(response.getEntity());
    }

    @Override
    //@SuppressWarnings("unchecked")
    public List<AllowedHost> list() 
    {
        try {
            return (List<AllowedHost>) converter.convert(super.get("admin/allowedHost/").getEntity());
            //return (List<AllowedHost>) converter.convert(response.getEntityAsText());
        } catch (IOException ex) {
            Logger.getLogger(RestfulAllowedHostService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    @Override
    public void remove(AllowedHost host) 
    {
        delete("admin/allowedHost/", host.getAlias());
    }

    @Override
    public Long save(AllowedHost host) {
        try {
            Response response = put(converter.to(MediaType.TEXT_XML, host), "admin/allowedHost/", host.getAlias());// put(converter.to(MediaType.TEXT_XML, host), "admin/allowedHost/", host.getAlias());
            Utils.checkForException(response);
            return (Long) converter.convert(response.getEntity());
        } catch (IOException ex) {
            Logger.getLogger(RestfulAllowedHostService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    /*@Override
    public void remove(AllowedHost host) {
        delete("admin/allowedHost/", host.getAlias());
    }

    @Override
    public Long save(AllowedHost host) {
        //Representation representation = converter.toRepresentation(host);
       // Response response = super.put(representation, "admin/allowedHost/", host.getAlias());
       
         Response response = (Response) put(converter.to(MediaType.TEXT_XML, host), "admin/allowedHost/", host.getAlias());
        return (Long) converter.convert(response.getEntity());
    }*/
    
    /*
    @Override
    public Long save(AllowedHost host) {
        Response response = (Response) put(converter.to(MediaType.TEXT_XML, host), "admin/allowedHost/", host.getAlias());
        Utils.checkForException(response);
        return (Long) converter.convert(response.getEntity());
    }
    */
    
}


/*package com.solers.delivery.content;

import java.util.List;
import org.restlet.util.Utils;
import org.restlet.data.MediaType;
import org.restlet.data.Status;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;

import com.solers.delivery.domain.AllowedHost;
import com.solers.delivery.rest.RestfulService;
import com.solers.delivery.rest.auth.RestAuthentication;
import com.solers.delivery.rest.converter.AllowedHostConverter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.restlet.Response;

public class RestfulAllowedHostService extends RestfulService implements AllowedHostService {

    private final AllowedHostConverter converter;
    //public Response response;

    public RestfulAllowedHostService(String host, int port, RestAuthentication auth) {
        super(host, port, auth);
        converter = new AllowedHostConverter();
    }

    @Override
    public AllowedHost get(String alias) 
    {
        Response response = super.get("admin/allowedHost/", alias); 
        if (response.getStatus().equals(Status.CLIENT_ERROR_NOT_FOUND))
        {
            return null;
        }
        Representation resp=response.getEntity();
        
            return converter.convertAllowedHost(resp);
        
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<AllowedHost> list() {
        Response response = super.get("admin/allowedHost/");
        return (List<AllowedHost>) converter.convertAllowedHost(response.getEntity());//.convert(response.getEntity());
    }

    @Override
    public void remove(AllowedHost host) {
        delete("admin/allowedHost/", host.getAlias());
    }

    @Override
    public Long save(AllowedHost host) 
    {
        Representation representation = converter.toRepresentation(host);
        Response response = super.put(representation, "admin/allowedHost/", host.getAlias());
        org.restlet.util.Utils.checkForException(response);
        return (Long) converter.convert(response.getEntity());
    }
}
*/

/* keep
package com.solers.delivery.content;

import java.util.List;

import org.restlet.data.MediaType;
import org.restlet.data.Status;
import org.restlet.resource.ClientResource;

import com.solers.delivery.domain.AllowedHost;
import com.solers.delivery.rest.RestfulService;
import com.solers.delivery.rest.Utils;
import com.solers.delivery.rest.auth.RestAuthentication;
import com.solers.delivery.rest.converter.AllowedHostConverter;

public class RestfulAllowedHostService extends RestfulService implements AllowedHostService {

    private final AllowedHostConverter converter;
    
    public RestfulAllowedHostService(String host, int port, RestAuthentication auth) {
        super(host, port, auth);
        converter = new AllowedHostConverter();
    }

    @Override
    public AllowedHost get(String alias) {
        ClientResource client = getClientResource("admin/allowedHost/" + alias);
        client.setMethod(org.restlet.data.Method.GET);
        org.restlet.Response response = client.getResponse();
        if (response.getStatus().equals(Status.CLIENT_ERROR_NOT_FOUND)) {
            return null;
        }
        return converter.convertAllowedHost(response.getEntity());
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<AllowedHost> list() {
        ClientResource client = getClientResource("admin/allowedHost/");
        client.setMethod(org.restlet.data.Method.GET);
        org.restlet.Response response = client.getResponse();
        return (List<AllowedHost>) converter.convert(response.getEntity());
    }

    @Override
    public void remove(AllowedHost host) {
        ClientResource client = getClientResource("admin/allowedHost/" + host.getAlias());
        client.setMethod(org.restlet.data.Method.DELETE);
        client.getResponse();
    }

    @Override
    public Long save(AllowedHost host) {
        ClientResource client = getClientResource("admin/allowedHost/" + host.getAlias());
        client.setMethod(org.restlet.data.Method.PUT);
        client.getRequestEntity().setMediaType(MediaType.TEXT_XML);
        client.getRequestEntity().setText(converter.to(MediaType.TEXT_XML, host));
        org.restlet.Response response = client.getResponse();
        Utils.checkForException(response);
        return (Long) converter.convert(response.getEntity());
    }
}

*/


/* original code below
package com.solers.delivery.content;

import java.util.List;

import org.restlet.data.MediaType;
import org.restlet.Response;
import org.restlet.data.Status;

import com.solers.delivery.domain.AllowedHost;
import com.solers.delivery.rest.RestfulService;
import com.solers.delivery.rest.Utils;
import com.solers.delivery.rest.auth.RestAuthentication;
import com.solers.delivery.rest.converter.AllowedHostConverter;


public class RestfulAllowedHostService extends RestfulService implements AllowedHostService {

    private final AllowedHostConverter converter;
    
    public RestfulAllowedHostService(String host, int port, RestAuthentication auth) {
        super(host, port, auth);
        converter = new AllowedHostConverter();
    }

    @Override
    public AllowedHost get(String alias) {
        Response response = (Response) super.get("admin/allowedHost/", alias);
        if (response.getStatus().equals(Status.CLIENT_ERROR_NOT_FOUND)) {
            return null;
        }
        return converter.convertAllowedHost(response.getEntity());
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<AllowedHost> list() {
        return (List<AllowedHost>) converter.convert(super.get("admin/allowedHost/").getEntity());
        //return (List<AllowedHost>) converter.convert(response.getEntityAsText());

    }

    @Override
    public void remove(AllowedHost host) {
        delete("admin/allowedHost/", host.getAlias());
    }

    @Override
    public Long save(AllowedHost host) {
        Response response = (Response) put(converter.to(MediaType.TEXT_XML, host), "admin/allowedHost/", host.getAlias());
        Utils.checkForException(response);
        return (Long) converter.convert(response.getEntity());
    }
}
*/