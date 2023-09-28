package com.solers.ui.dwr;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Set;

import org.apache.log4j.Logger;
import org.directwebremoting.impl.DefaultAccessControl;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class SpringSecurityAccessControl extends DefaultAccessControl {
    
    private static final Logger log = Logger.getLogger(SpringSecurityAccessControl.class);
    
    @Override
    public void addRoleRestriction(String scriptName, String methodName, String role) {
        for (String r : role.split(",")) {
            super.addRoleRestriction(scriptName, methodName, r.trim());
        }
    }

    //@Override
    protected void assertIsRestrictedByRole(String scriptName, Method method) {
        String methodName = method.getName();
        
        Set<String> roles = getRoleRestrictions(scriptName, methodName);
        if (roles != null && !roles.isEmpty()) {
            Collection<? extends GrantedAuthority> authorities = getAuthorities(scriptName, methodName);
            boolean allowed = false;
            for (String role : roles) {
                if (isAllowed(role, authorities)) {
                    allowed = true;
                    break;
                }
            }
            if (!allowed) {
                log.warn(String.format("Insufficient access to %s.%s", scriptName, methodName));
                throw new AccessDeniedException("Insufficient permissions for the requested method");
            }
        }
    }
    
    private Collection<? extends GrantedAuthority> getAuthorities(String scriptName, String methodName)  
    {
        SecurityContext ctx = SecurityContextHolder.getContext();
        if (ctx != null) {
            Authentication auth = ctx.getAuthentication();
            if (auth != null) {
                return auth.getAuthorities();
            }
        }
        log.warn(String.format("User is not logged in and trying to access %s.%s", scriptName, methodName));
        throw new AuthenticationCredentialsNotFoundException("Not logged in");
    }
    
    private boolean isAllowed(String role, Collection<? extends GrantedAuthority> auths) {
        if (role.equals("*")) {
            return true;
        }
        
        if (auths == null) {
            return false;
        }
        
        for (GrantedAuthority auth : auths) {
            if (auth.getAuthority().equals(role)) {
                return true;
            }
        }
        
        return false;
    }
}
