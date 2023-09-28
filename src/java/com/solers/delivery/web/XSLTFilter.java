package com.solers.delivery.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

public class XSLTFilter implements Filter 
{

    private static final Logger log = LogManager.getLogger(XSLTFilter.class);

    private boolean debug;
    private ServletContext ctx;
    private Templates cache;
    private TransformerFactory factory;
    private String styleSheet;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
    {
        response.setContentType("text/html");

        try (PrintWriter out = response.getWriter()) {
            Source inputSource = getSource(request, response);
            try {
                Transformer transformer = newTransformer();
                StreamResult result = new StreamResult(out);
                transformer.transform(inputSource, result);
            } catch (TransformerException ex) {
                log.error("Could not perform transformation", ex);
                throw new ServletException("Could not perform transformation", ex);
            }
        }
    }

    @Override
    public void init(FilterConfig config) throws ServletException 
    {
        ctx = config.getServletContext();
        debug = Boolean.parseBoolean(config.getInitParameter("debug"));
        String file = config.getInitParameter("styleSheet");

        try (InputStream style = ctx.getResourceAsStream(file))
        {
            Source styleSource = new StreamSource(style);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();

            if (debug) 
            {
                factory = transformerFactory;
                styleSheet = file;
            } 
            else 
            {
                try 
                {
                    cache = transformerFactory.newTemplates(styleSource);
                } 
                catch (TransformerConfigurationException ex) 
                {
                    log.error("Could not configure transformer", ex);
                    throw new ServletException("Could not configure transformer", ex);
                }
            }
        } 
        catch (IOException ex) 
        {
            throw new ServletException("Could not establish InputStream object in init() method", ex);
        }
}

    @Override
    public void destroy() 
    {
        // Clean up resources, if any
    }

    private Source getSource(ServletRequest request, ServletResponse response) throws ServletException, IOException 
    {
        ResponseWrapper wrapper = new ResponseWrapper((HttpServletResponse) response);
        RequestDispatcher dispatcher = ctx.getRequestDispatcher(((HttpServletRequest) request).getRequestURI());
        dispatcher.include(request, wrapper);
        return new StreamSource(wrapper.getReader());
    }

    private Transformer newTransformer() throws TransformerConfigurationException, IOException 
    {
        if (debug) 
        {
            try (InputStream inputStream = ctx.getResourceAsStream(styleSheet)) 
            {
                return factory.newTransformer(new StreamSource(inputStream));
            }
        } 
        else 
        {
            return cache.newTransformer();
        }
    }

    private static class ResponseWrapper extends HttpServletResponseWrapper 
    {

        private final StringWriter output;

        public ResponseWrapper(HttpServletResponse response) 
        {
            super(response);
            output = new StringWriter();
        }

        public Reader getReader() 
        {
            return new StringReader(output.toString());
        }

        @Override
        public PrintWriter getWriter() 
        {
            return new PrintWriter(output);
        }
    }

}
