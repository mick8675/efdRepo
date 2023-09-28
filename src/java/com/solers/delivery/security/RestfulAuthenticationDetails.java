/****************************************************************
 *
 * Solers, Inc. as the author of Enterprise File Delivery 2.1 (EFD 2.1)
 * source code submitted herewith to the Government under contract
 * retains those intellectual property rights as set forth by the Federal 
 * Acquisition Regulations agreement (FAR). The Government has 
 * unlimited rights to redistribute copies of the EFD 2.1 in 
 * executable or source format to support operational installation 
 * and software maintenance. Additionally, the executable or 
 * source may be used or modified for by third parties as 
 * directed by the government.
 *
 * (c) 2009 Solers, Inc.
 ***********************************************************/
package com.solers.delivery.security;
//import javax.servlet.http.HttpSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;

//import org.springframework.security.core.context.SecurityContext;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.concurrent.SessionIdentifierAware;
//import org.springframework.security.Authentication;
//import org.springframework.security.core.session.SessionInformation;
//import org.springframework.security.web.authentication.WebAuthenticationDetails;


/**
 * @author <a href="mailto:kevin.conaway@solers.com">Kevin Conaway</a>
 */
//public class RestfulAuthenticationDetails implements SessionIdentifierAware {
  public class RestfulAuthenticationDetails extends AccountStatusUserDetailsChecker //implements SessionIdentifierAware
  {  
   // @Autowired 
    //private HttpSession httpSession;
    
    private String remoteAddress;
    private String sessionId;
    private String password;
    //private SecurityContext securityContext;
    
    public RestfulAuthenticationDetails() 
    {
        //securityContext = SecurityContextHolder.getContext();
        //securityContext.getAuthentication().getDetails();
    }
    
    public RestfulAuthenticationDetails(String remoteAddress, String sessionId, String password) 
    {
        this.remoteAddress = remoteAddress;
        this.sessionId = sessionId;
        this.password = password;
        //httpSession.getId();
        //httpSession.
        //((WebAuthenticationDetails) SecurityContextHolder.getContext().getAuthentication().getDetails()).getSessionId();
        //((WebAuthenticationDetails) SecurityContextHolder.getContext().getAuthentication().getCredentials()).getRemoteAddress();
        
    }

    public String getRemoteAddress() {
        return remoteAddress;
    }
    
    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }
    
    //@Override
    public String getSessionId() {
        return sessionId;
    }
    
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return getRemoteAddress();
    }
    
}
