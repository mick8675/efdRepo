package com.solers.security.audit;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AbstractAuthenticationEvent;
import org.springframework.security.authentication.event.AbstractAuthenticationFailureEvent;
import org.springframework.security.web.session.HttpSessionCreatedEvent;
import org.springframework.security.web.session.HttpSessionDestroyedEvent;

import com.solers.security.audit.AuditLogger;
import com.solers.security.audit.Auditable.Severity;

import javax.servlet.http.HttpSession;

public class AuthenticationListener implements ApplicationListener<ApplicationEvent> {

    protected static final String CURRENT_USER_LOGGED_IN = "CURRENT_USER_LOGGED_IN";

    private AuditLogger audit;

    public void setAuditLogger(AuditLogger audit) {
        this.audit = audit;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) 
    {
        if (event instanceof AbstractAuthenticationEvent) 
        {
            handleAuthenticationEvent((AbstractAuthenticationEvent) event);
        } 
        else if (event instanceof HttpSessionCreatedEvent) 
        {
            handleSessionCreatedEvent((HttpSessionCreatedEvent) event);
        } 
        else if (event instanceof HttpSessionDestroyedEvent) 
        {
            handleSessionDestroyedEvent((HttpSessionDestroyedEvent) event);
        }
    }

    private void handleAuthenticationEvent(AbstractAuthenticationEvent event) 
    {
        String message;
        Severity severity;

        if (event instanceof AbstractAuthenticationFailureEvent) 
        {
            message = String.format("Authentication FAILED (%s)", ((AbstractAuthenticationFailureEvent) event).getException().getMessage());
            severity = Severity.HIGH;
        } 
        else 
        {
            message = "Authentication SUCCEEDED";
            severity = Severity.LOW;
        }

        audit.log(message, severity, event.getAuthentication());
    }

    private void handleSessionCreatedEvent(HttpSessionCreatedEvent event) 
    {
        HttpSession session = event.getSession();
        String userName = (String) session.getAttribute(CURRENT_USER_LOGGED_IN);
        String message = String.format("User Session Created for User: %s, Session ID: %s", userName, session.getId());
        audit.log(message, Severity.LOW);
    }

    private void handleSessionDestroyedEvent(HttpSessionDestroyedEvent event) 
    {
        HttpSession session = event.getSession();
        String userName = (String) session.getAttribute(CURRENT_USER_LOGGED_IN);
        String message = String.format("User Session Ended for User: %s, Session ID: %s", userName, session.getId());
        audit.log(message, Severity.HIGH);
    }
}
