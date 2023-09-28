package com.solers.delivery.transport.http.server;

import static com.solers.delivery.transport.http.HTTPContextPaths.CONTENT_CONTEXT_PATH;
import static com.solers.delivery.transport.http.HTTPContextPaths.EVENTS_CONTEXT_PATH;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.http.HttpURI;

import com.solers.delivery.transport.http.HTTPHeaders;

public class LegacyHandler extends AbstractHandler {

    private static final String EFD_VERSION_REGEX = "EFD/[0-9]+.[0-9]+.?[0-9]*";

    private static final String FORWARDED = "forwarded";

    private RequestDispatcher contentDispatch;
    private RequestDispatcher eventDispatch;

    public void setContentDispatch(RequestDispatcher transportDispatch) {
        this.contentDispatch = transportDispatch;
    }

    public void setEventDispatch(RequestDispatcher eventDispatch) {
        this.eventDispatch = eventDispatch;
    }

    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        if (request.getMethod().equalsIgnoreCase("OPTIONS")) {
            baseRequest.setHandled(true);
            return;
        }

        if (!request.getHeader(HTTPHeaders.USER_AGENT.headerName()).matches(EFD_VERSION_REGEX) && request.getAttribute(FORWARDED) == null) {

            request.setAttribute(FORWARDED, FORWARDED);

            if (baseRequest.getMethod().equalsIgnoreCase("GET") || baseRequest.getMethod().equalsIgnoreCase("OPTIONS")) {
                baseRequest.setContextPath(CONTENT_CONTEXT_PATH);
                baseRequest.setPathInfo(CONTENT_CONTEXT_PATH + baseRequest.getPathInfo());
                contentDispatch.forward(request, response);
            } else if (baseRequest.getMethod().equalsIgnoreCase("PUT")) {
                baseRequest.setContextPath(EVENTS_CONTEXT_PATH);
                baseRequest.setPathInfo(EVENTS_CONTEXT_PATH + baseRequest.getPathInfo());
                eventDispatch.forward(request, response);
            }
        }
    }
}






/*original code
package com.solers.delivery.transport.http.server;

import static com.solers.delivery.transport.http.HTTPContextPaths.CONTENT_CONTEXT_PATH;
import static com.solers.delivery.transport.http.HTTPContextPaths.EVENTS_CONTEXT_PATH;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.mortbay.jetty.HttpConnection;
//import org.mortbay.jetty.HttpURI;
//import org.mortbay.jetty.Request;
//import org.mortbay.jetty.servlet.Dispatcher;
import org.eclipse.jetty.server.HttpConnection;
import org.eclipse.jetty.http.HttpURI;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Dispatcher;

import com.solers.delivery.transport.http.HTTPHeaders;

public class LegacyHandler extends BaseHandler {

    private static final String EFD_VERSION_REGEX = "EFD/[0-9]+.[0-9]+.?[0-9]*";

    private static final String FORWARDED = "forwarded";

    private Dispatcher contentDispatch;
    private Dispatcher eventDispatch;

    public void setContentDispatch(Dispatcher transportDispatch) {
        this.contentDispatch = transportDispatch;
    }

    public void setEventDispatch(Dispatcher eventDispatch) {
        this.eventDispatch = eventDispatch;
    }

    public void handle(String arg0, HttpServletRequest request, HttpServletResponse response, int arg3) throws IOException, ServletException {
        
        if (request.getMethod().equalsIgnoreCase("OPTIONS")) {
            setRequestHandled(request, response);
            return;
        }

        if (!request.getHeader(HTTPHeaders.USER_AGENT.headerName()).matches(EFD_VERSION_REGEX) && request.getAttribute(FORWARDED) == null) {
            
            request.setAttribute(FORWARDED, FORWARDED);
            Request base_request = null;

            if (request instanceof Request) {
                base_request = (Request) request;
            } else {
                base_request = HttpConnection.getCurrentConnection().getRequest();
            }

            if (base_request.getMethod().equalsIgnoreCase("GET") || base_request.getMethod().equalsIgnoreCase("OPTIONS") ) {
                base_request.setContextPath(CONTENT_CONTEXT_PATH);
                base_request.setUri(new HttpURI(CONTENT_CONTEXT_PATH + base_request.getUri()));
                contentDispatch.forward(base_request, response);
            } else if (base_request.getMethod().equalsIgnoreCase("PUT")) {
                base_request.setContextPath(EVENTS_CONTEXT_PATH);
                base_request.setUri(new HttpURI(EVENTS_CONTEXT_PATH + base_request.getUri()));
                eventDispatch.forward(base_request, response);
            }
        }
    }
}
*/