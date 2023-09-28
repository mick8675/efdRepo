package com.solers.delivery.rest;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.restlet.routing.Filter;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Status;

public class IpFilter extends Filter {
    
    private static final Logger logger = Logger.getLogger(IpFilter.class);
    
    private final Collection<String> addresses;
    
    public IpFilter(Collection<String> addresses) {
        this.addresses = addresses;
    }

    @Override
    protected int beforeHandle(Request request, Response response) {
        String ip = request.getClientInfo().getAddress();
        
        if (addresses.contains(ip)) {
            return super.beforeHandle(request, response);
        } else {
            logger.warn(ip+" was denied access in IpFilter");
            response.setStatus(Status.CLIENT_ERROR_FORBIDDEN);
            return Filter.STOP;
        }
    }
}
