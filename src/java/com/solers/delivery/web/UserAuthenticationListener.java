package com.solers.delivery.web;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import com.solers.delivery.alerts.AlertManager;
import com.solers.delivery.domain.Alert;
import com.solers.delivery.domain.User;
import com.solers.delivery.domain.Alert.AlertType;
import com.solers.delivery.user.UserService;
import org.springframework.security.authentication.event.AbstractAuthenticationEvent;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.core.Authentication;


import org.springframework.security.web.authentication.WebAuthenticationDetails;

public class UserAuthenticationListener implements ApplicationListener<AbstractAuthenticationEvent> 
{

    private UserService userService;
    private int maxFailedPasswords;
    private AlertManager alertManager;
    
    public void setMaxFailedPasswords(int maxFailedPasswords) {
        this.maxFailedPasswords = maxFailedPasswords;
    }
    
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
    public void setAlertManager(AlertManager alertManager) {
        this.alertManager = alertManager;
    }

    @Override
    public void onApplicationEvent(AbstractAuthenticationEvent event) 
    {
        Authentication auth = event.getAuthentication();
        String userName = auth.getName();

        if (event instanceof AuthenticationFailureBadCredentialsEvent) 
        {
            User user = userService.get(userName);
            if (user != null) 
            {
                user.updateFailedLogin();
                if (user.getFailedLogins() >= maxFailedPasswords && user.isEnabled()) 
                {
                    user.setEnabled(false);
                    alertManager.onAlert(new Alert(user.getUsername() + "'s account has been disabled after " +user.getFailedLogins()+" failed login attempts", AlertType.ADMIN));
                }
            userService.save(user);
            }
        } 
        else if (event instanceof AuthenticationSuccessEvent) 
        {
            User user = userService.get(userName);
            WebAuthenticationDetails details = (WebAuthenticationDetails) auth.getDetails();
            user.updateLastLogin(details.getRemoteAddress());
            userService.save(user);
        }
    }
}



//old code_______________________________________________________________
/*package com.solers.delivery.web;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.core.Authentication;
import org.springframework.security.authentication.event.AbstractAuthenticationEvent;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;

import com.solers.delivery.alerts.AlertManager;
import com.solers.delivery.domain.Alert;
import com.solers.delivery.domain.User;
import com.solers.delivery.domain.Alert.AlertType;
import com.solers.delivery.security.RestfulAuthenticationDetails;
import com.solers.delivery.user.UserService;

public class UserAuthenticationListener implements ApplicationListener {

    private UserService userService;
    private int maxFailedPasswords;
    private AlertManager alertManager;
    
    public void setMaxFailedPasswords( int maxFailedPasswords) {
        this.maxFailedPasswords = maxFailedPasswords;
    }
    
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
    public void setAlertManager(AlertManager alertManager) {
        this.alertManager = alertManager;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof AbstractAuthenticationEvent) {
            Authentication auth = ((AbstractAuthenticationEvent) event).getAuthentication();
            String userName = auth.getName();

            if (event instanceof AuthenticationFailureBadCredentialsEvent) {
                User user = userService.get(userName);
                if (user != null) {
                    user.updateFailedLogin();
                    if (user.getFailedLogins() >= maxFailedPasswords && user.isEnabled()) {
                        user.setEnabled(false);
                        alertManager.onAlert(new Alert(user.getUsername()+"'s account has been disabled after "+user.getFailedLogins()+" failed login attempts", AlertType.ADMIN));
                    }
                    userService.save(user);
                }
            } else if (event instanceof AuthenticationSuccessEvent) {               
                User user = userService.get(userName); 
                RestfulAuthenticationDetails details = (RestfulAuthenticationDetails) auth.getDetails();
                user.updateLastLogin(details.getRemoteAddress());
                userService.save(user);
            }
        }
    }
}

*/