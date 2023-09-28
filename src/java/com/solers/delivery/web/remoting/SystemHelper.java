package com.solers.delivery.web.remoting;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.directwebremoting.WebContextFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;

import com.solers.delivery.domain.User;
import com.solers.delivery.user.PasswordService;
import com.solers.delivery.user.UserService;
import com.solers.delivery.util.password.InvalidPasswordException;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;

public class SystemHelper {

    private static final Logger log = Logger.getLogger(SystemHelper.class);

    private final AuthenticationManager authenticationManager;
    private final UserService userService;
    private final PasswordService passwordService;

    public SystemHelper(AuthenticationManager authenticationManager, UserService userService,
            PasswordService passwordService) {
        this.authenticationManager = authenticationManager;
        this.userService = userService;
        this.passwordService = passwordService;
    }

    public void changePassword(String oldpw, String newpw, String newpwconfirm) {
        Authentication auth = getAuth();
        String username = auth.getName();

        if (!newpw.equals(newpwconfirm)) {
            throw new InvalidPasswordException("Passwords do not match");
        }

        passwordService.changePassword(username, oldpw, newpw);
        login(username, newpw);
    }

    public User login(String username, String password) throws AuthenticationException {
        HttpSession session = getSession();
        session.setAttribute("SPRING_SECURITY_LAST_USERNAME", username);

        HttpServletRequest request = getRequest();
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username,
                password);

        try {
            Authentication authentication = authenticationManager.authenticate(authenticationToken);
            SecurityContextHolder.getContext().setAuthentication(authentication);
            return userService.get(username);
        } catch (AuthenticationException ex) {
            log.error("Authentication exception while logging in", ex);
            throw new AuthenticationServiceException("Authentication failed: " + ex.getMessage(), ex);
        }
    }

    public void logout() {
        getSession().invalidate();
    }

    /**
     * Heartbeat method. The client sends this periodically to keep its session alive.
     */
    public void heartbeat() {
        // Implementation for heartbeat method
    }

    private HttpSession getSession() {
        return WebContextFactory.get().getHttpServletRequest().getSession();
    }

    private HttpServletRequest getRequest() {
        return WebContextFactory.get().getHttpServletRequest();
    }

    private Authentication getAuth() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            return auth;
        }
        throw new AuthenticationCredentialsNotFoundException("Not logged in");
    }
}



/*public class SystemHelper 
{
    
    private static final Logger log = Logger.getLogger(SystemHelper.class);
    
    private final ProviderManager auth;
    private final UserService userService;
    private final PasswordService passwordService;

    public SystemHelper(ProviderManager auth, UserService userService, PasswordService passwordService) {
        this.auth = auth;
        this.userService = userService;
        this.passwordService = passwordService;
    }
    
    public void changePassword(String oldpw, String newpw, String newpwconfirm) {
        Authentication auth = getAuth();
        String username = auth.getName();
        
        if (!newpw.equals(newpwconfirm)) {
            throw new InvalidPasswordException("Passwords do not match");
        }
        
        passwordService.changePassword(username, oldpw, newpw);
        login(username, newpw);
    }
    
    public User login(String username, String password) throws AuthenticationException {
        getSession().setAttribute(UsernamePasswordAuthenticationFilter.SPRING_SECURITY_FORM_USERNAME_KEY, username);
 
        UsernamePasswordAuthenticationToken request = new UsernamePasswordAuthenticationToken(username, password);
        request.setDetails(new WebAuthenticationDetails(getRequest()));
        SecurityContextHolder.getContext().setAuthentication(request);
        
        try {
            Authentication result = auth.authenticate(request);//.doAuthentication(request);
            SecurityContextHolder.getContext().setAuthentication(result);
            return userService.get(username);
        } catch (CredentialsExpiredException ex) {
            // There needs to be an auth value
            // for the user to change his password
            SecurityContextHolder.getContext().setAuthentication(request);
            throw ex;
        } catch (RuntimeException ex) {
            log.error("Unhandled exception while logging in", ex);
            throw ex;
        }
    }
    
    public void logout() {
        getSession().invalidate();
    }
    */
    /**
     * Heartbeat method.  The client sends this periodically to keep its
     * session alive.
     */

/*
    public void heartbeat() {
        
    }
    
    private HttpSession getSession() {
        return WebContextFactory.get().getSession();
    }     
    
    private HttpServletRequest getRequest() {
        return WebContextFactory.get().getHttpServletRequest();
    }
    
    private Authentication getAuth() {
        SecurityContext ctx = SecurityContextHolder.getContext();
        if (ctx != null) {
            Authentication auth = ctx.getAuthentication();
            if (auth != null) {
                return auth;
            }
        }
        throw new AuthenticationCredentialsNotFoundException("Not logged in!");
    }
}
*/