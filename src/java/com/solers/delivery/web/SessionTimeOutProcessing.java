package com.solers.delivery.web;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;

public class SessionTimeOutProcessing implements AuthenticationEntryPoint 
{
    
    private static final Logger log = Logger.getLogger(SessionTimeOutProcessing.class);
    private String loginFormUrl;

    public void setLoginFormUrl(String loginFormUrl) 
    {
        this.loginFormUrl = loginFormUrl;
    }
         
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException 
    {
        if (authException instanceof AuthenticationCredentialsNotFoundException) 
        {
            request.getSession().setAttribute("sessionTimeOut", "The previous session has expired due to inactivity. Please try again.");
        }
        log.info("\n\n\n~~~~~~~~~~~~~~~~~\nmick test SessionTimeOutProcessing.java\nloginURL="+request.getContextPath() + 
                "/index.xml\nShould be="+request.getContextPath() +"/"+"\n\n\n~~~~~~~~~~~~~~~~~~\n");
        response.sendRedirect(request.getContextPath() + "/index.xml"); 
    }
}


//keep #1
/*
package com.solers.delivery.web;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;

public class SessionTimeOutProcessing implements AuthenticationEntryPoint {

    private final AuthenticationEntryPoint delegate;

    public SessionTimeOutProcessing(AuthenticationEntryPoint delegate) {
        this.delegate = delegate;
    }

    //@Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        if (authException instanceof AuthenticationCredentialsNotFoundException) 
        {
            request.getSession().setAttribute("sessionTimeOut", "The previous session has expired due to inactivity. Please try again.");
        }
        delegate.commence(request, response, authException);
        
    }
}
*/




//keep
/*package com.solers.delivery.web;

import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.AuthenticationCredentialsNotFoundException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
*/
/**
 * This class helps to capture the exception and based on the exception type, set a proper error message.
 */
/*
public class SessionTimeOutProcessing implements AuthenticationEntryPoint {
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        if (authException instanceof AuthenticationCredentialsNotFoundException) {
            request.setAttribute("sessionTimeOut", "The previous session has expired due to inactivity. Please try again.");
        }
    }
}
*/



/*package com.solers.delivery.web;

//import org.springframework.security.web.AuthenticationEntryPoint;

//import org.springframework.security.ui.webapp.AuthenticationProcessingFilterEntryPoint;//originally here
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;
//import org.springframework.security.AuthenticationException; //originally here
//import org.springframework.security.AuthenticationCredentialsNotFoundException;//originally here

import java.io.IOException;

//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.AuthenticationException;

//import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
//import org.springframework.security.core.AuthenticationException;
*/

/**
 * This class helps to capture the exception and base on the exception type set a proper error message
 */
/*
public class SessionTimeOutProcessing extends LoginUrlAuthenticationEntryPoint// extends AuthenticationProcessingFilterEntryPoint {
{ 

    public SessionTimeOutProcessing(String loginFormUrl) 
    {
        super("/");
    }
    
@Override
public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException 
    {
        if (authException instanceof AuthenticationCredentialsNotFoundException)
        {
            ((HttpServletRequest) request).getSession().setAttribute("sessionTimeOut", "The previous session has expired due to inactivity. Please try again.");
        }
        super.commence(request, response, authException);
    }
}
*/