package com.solers.delivery.rest;

import org.restlet.routing.Filter;
import org.restlet.Request;
import org.restlet.Response;

import com.solers.delivery.transport.http.HTTPHeaders;

public class ServerAgentFilter extends Filter {

    @Override
    protected void afterHandle(Request request, Response response) 
    {
        response.getServerInfo().setAgent(HTTPHeaders.USER_AGENT.defaultValue());
    }

}
