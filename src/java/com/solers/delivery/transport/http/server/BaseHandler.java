package com.solers.delivery.transport.http.server;

import static com.solers.delivery.transport.http.HTTPHeaders.CONTENT_SET_NAME;
import static com.solers.delivery.transport.http.HTTPHeaders.SYNC_ID;
import static com.solers.delivery.transport.http.HTTPHeaders.USER_AGENT;
import com.solers.delivery.content.supplier.ContentSetMapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.mortbay.jetty.HttpConnection;
//import org.mortbay.jetty.Request;
//import org.mortbay.jetty.handler.AbstractHandler;

import org.eclipse.jetty.server.HttpConnection;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;




public abstract class BaseHandler extends AbstractHandler 
{

    protected ContentSetMapper cm;

    public void setCm(ContentSetMapper cm) {
        this.cm = cm;
    }

    public String getContentSetName(HttpServletRequest request) {
        return request.getHeader(CONTENT_SET_NAME.headerName());
    }

    public String getSyncKey(HttpServletRequest request) {
        return request.getHeader(SYNC_ID.headerName());
    }

    /**
     * Set the Jetty request as handled.
     * 
     * @param request
     * @param response
     */
    protected void setRequestHandled(HttpServletRequest request, HttpServletResponse response) {
        Request base_request = (request instanceof Request) ? (Request) request : Request.getBaseRequest(request);

        response.addHeader(USER_AGENT.headerName(), USER_AGENT.defaultValue());

        if (base_request != null) {
            base_request.setHandled(true);
        }
    }

    /*protected void setRequestHandled(HttpServletRequest request, HttpServletResponse response) {
        Request base_request = null;

        if (request instanceof Request) {
            base_request = (Request) request;
        } else {
            base_request = HttpConnection.getCurrentConnection().getRequest();
        }
        response.addHeader(USER_AGENT.headerName(), USER_AGENT.defaultValue());
        base_request.setHandled(true);
    }*/

    /**
     * Get the path info without the leading "/"
     * 
     * @param request
     * @return
     */
    protected String getPathInfo(HttpServletRequest request) {
        String result = request.getPathInfo();
        if (result.startsWith("/") && !result.equals("/")) {
            result = result.substring(1);
        }
        return result;
    }
}





/* keep for new

package com.solers.delivery.transport.http.server;

import static com.solers.delivery.transport.http.HTTPHeaders.CONTENT_SET_NAME;
import static com.solers.delivery.transport.http.HTTPHeaders.SYNC_ID;
import static com.solers.delivery.transport.http.HTTPHeaders.USER_AGENT;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.eclipse.jetty.server.HttpConnection;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;


import com.solers.delivery.content.supplier.ContentSetMapper;


public abstract class BaseHandler extends AbstractHandler 
{

    protected ContentSetMapper cm;

    public void setCm(ContentSetMapper cm) {
        this.cm = cm;
    }

    public String getContentSetName(HttpServletRequest request) {
        return request.getHeader(CONTENT_SET_NAME.headerName());
    }

    public String getSyncKey(HttpServletRequest request) {
        return request.getHeader(SYNC_ID.headerName());
    }*/

    
     // Set the Jetty request as handled.
      
     // @param request
     //@param response
     
    /*protected void setRequestHandled(HttpServletRequest request, HttpServletResponse response) 
   {
        Request base_request = (request instanceof Request) ? (Request) request : Request.getBaseRequest(request);

        response.addHeader(USER_AGENT.headerName(), USER_AGENT.defaultValue());

        if (base_request != null) 
        {
            base_request.setHandled(true);
        }
    }



    /*
    
    protected void setRequestHandled(HttpServletRequest request, HttpServletResponse response) 
    {
        Request base_request = null;
        
        if (request instanceof Request) 
        {
            base_request = (Request) request;
        } 
        else 
        {
            base_request = HttpConnection.getCurrentConnection().getRequest();
        }
        response.addHeader(USER_AGENT.headerName(), USER_AGENT.defaultValue());
        base_request.setHandled(true);
    }

    
     // Get the path info without the leading "/"
     //
     // @param request
     // @return
     
    protected String getPathInfo(HttpServletRequest request) {
        String result = request.getPathInfo();
        if (result.startsWith("/") && !result.equals("/")) {
            result = result.substring(1);
        }
        return result;
    }
}*/
