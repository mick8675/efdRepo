package com.solers.delivery.rest;

import com.solers.delivery.Start;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.ChallengeScheme;
import org.restlet.security.Verifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;

import com.solers.delivery.alerts.AlertManager;
import com.solers.delivery.domain.Alert;
import com.solers.delivery.domain.Alert.AlertType;
import com.solers.delivery.domain.User;
import com.solers.delivery.user.UserService;
import org.springframework.stereotype.Component;

@Component
public class AcegiGuard implements Verifier 
{

    public static final int MAX_FAILED_PASSWORDS = 3;
    private static final Logger log = Logger.getLogger(AcegiGuard.class);

    private final List<String> ignored;
    private final AuthenticationManager authenticationManager;
    private final String usernameHeader;
    private final String passwordHeader;

    public AcegiGuard(AuthenticationManager authenticationManager, String usernameHeader, String passwordHeader) {
        this.authenticationManager = authenticationManager;
        this.usernameHeader = usernameHeader;
        this.passwordHeader = passwordHeader;
        this.ignored = new ArrayList<>();
    }

    public boolean checkSecret(Request request, Response response) {
        String username = request.getHeaders().getFirstValue(usernameHeader, true);
        String password = request.getHeaders().getFirstValue(passwordHeader, true);

        if (username == null || password == null) {
            log.warn("Username or password is missing");
            return false;
        }

        boolean authenticated = false;
        SecurityContextHolder.clearContext();
        UsernamePasswordAuthenticationToken usernameToken = new UsernamePasswordAuthenticationToken(username, password);
        usernameToken.setDetails(request.getClientInfo().getAddress());
        String userName = usernameToken.getName();

        // check to see if user is enabled
        UserService userService = Start.getDeliveryService().getContext().getBean(UserService.class);
        User user = userService.get(userName);
        if (user == null) {
            log.warn("User does not exist: Authentication failed for user: " + username);
            return false;
        }
        if (!user.isEnabled()) {
            log.warn("User is Disabled: Authentication failed for user: " + username);
            return false;
        }

        try {
            Authentication authentication = authenticationManager.authenticate(usernameToken);
            authenticated = authentication != null && authentication.isAuthenticated();
            if (authenticated) {
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
        } catch (AuthenticationException ex) {
            log.warn("Authentication failed for user: " + username);
            if (log.isDebugEnabled()) {
                log.debug("Authentication exception was: " + ex.getMessage(), ex);
            }
            Utils.setException(request, response, ex);
            authenticated = false;
        } catch (Exception ex) {
            log.error("An error occurred authenticating", ex);
            throw new RuntimeException(ex);
        }

        // apply 3 login failure rule
        if (!authenticated) {
            user.updateFailedLogin();
            if (user.getFailedLogins() >= MAX_FAILED_PASSWORDS && user.isEnabled()) {
                user.setEnabled(false);
                AlertManager alertManager = Start.getDeliveryService().getContext().getBean(AlertManager.class);
                alertManager.onAlert(new Alert(user.getUsername() + "'s account has been disabled after "
                        + user.getFailedLogins() + " failed login attempts", AlertType.ADMIN));
            }
            userService.save(user);
        }

        return authenticated;
    }

    public int verify(Request request, Response response) {
        for (String value : ignored) {
            if (request.getResourceRef().getPath().startsWith(value)) {
                return Verifier.RESULT_VALID;
            }
        }
        return Verifier.RESULT_MISSING;
    }

    public void addIgnoredPattern(String pattern) {
        ignored.add(pattern);
    }

    public void removeIgnoredPattern(String pattern) {
        ignored.remove(pattern);
    }
}


/*package com.solers.delivery.rest;


import java.util.ArrayList;
import java.util.List;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.apache.log4j.Logger;
//import org.restlet.Guard; //deprecated

import org.restlet.data.ChallengeScheme;
import org.restlet.Request;
import org.restlet.Response;
import org.springframework.context.ConfigurableApplicationContext;



//import org.springframework.security.authentication.AuthenticationProvider;

import com.solers.delivery.alerts.AlertManager;  
import com.solers.delivery.user.UserService;

import com.solers.delivery.Start;
import com.solers.delivery.domain.Alert;
import com.solers.delivery.domain.User;
import com.solers.delivery.domain.Alert.AlertType;



public class AcegiGuard extends Guard 
{
    
	public static final int MAX_FAILED_PASSWORDS = 3;
    private static final Logger log = Logger.getLogger(AcegiGuard.class);
    
    //private final AuthenticationProvider provider;
    private final List<String> ignored;
    private final AuthenticationManager authenticationManager;
    
 
    
    
    public AcegiGuard(AuthenticationManager authenticationManager) 
    {
        super(null, ChallengeScheme.HTTP_BASIC, "EFD");
        this.authenticationManager = authenticationManager;
        this.ignored = new ArrayList<>();
    }

    
     
    // to enforce REST account disabling after 3 failed logins
    @Override
    public boolean checkSecret(Request request, Response response, String identifier, char[] secret) 
    {
        boolean authenticated = false;
        SecurityContextHolder.clearContext();
        UsernamePasswordAuthenticationToken usernameToken = new UsernamePasswordAuthenticationToken(identifier, new String(secret));
        usernameToken.setDetails(request.getClientInfo().getAddress());
        String userName = usernameToken.getName();

        // check to see if user is enabled
        ConfigurableApplicationContext context = Start.getDeliveryService().getContext();

        UserService userService = (UserService) context.getBean("userService");
        User user = userService.get(userName);
        if (user == null) 
        {
            log.warn("User does not exist: Authentication failed for user: " + identifier);
            return false;
        }
        if (!user.isEnabled()) 
        {
            log.warn("User is Disabled: Authentication failed for user: " + identifier);
            return false;
        }

        try 
        {
            Authentication authentication = authenticationManager.authenticate(usernameToken);
            authenticated = authentication != null && authentication.isAuthenticated();
            if (authenticated) 
            {
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
        } 
        catch (AuthenticationException ex) 
        {
            log.warn("Authentication failed for user: " + identifier);
            if (log.isDebugEnabled()) 
            {
                log.debug("Authentication exception was: " + ex.getMessage(), ex);
            }
            Utils.setException(request, response, ex);
            authenticated = false;
        } 
        catch (Exception ex) 
        {
            log.error("An error occurred authenticating", ex);
            throw new RuntimeException(ex);
        }
        // apply 3 logout rule
        if (!authenticated) 
        {
            user.updateFailedLogin();
            if (user.getFailedLogins() >= MAX_FAILED_PASSWORDS && user.isEnabled()) 
            {
                user.setEnabled(false);
                AlertManager alertManager = (AlertManager) context.getBean("alertManager");
                alertManager.onAlert(new Alert(user.getUsername() + "'s account has been disabled after " + user.getFailedLogins() + " failed login attempts", AlertType.ADMIN));
            }
            userService.save(user);
        }

        return authenticated;
}


    //@Override
    public int authenticate(Request request, Response response) {
        for (String value : ignored) {
            if (request.getResourceRef().getPath().startsWith(value)) {
                return Guard.AUTHENTICATION_VALID;
            }
        }
        return super.authenticate(request, response);
    }
}
*/