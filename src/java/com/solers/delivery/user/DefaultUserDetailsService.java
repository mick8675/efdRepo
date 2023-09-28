package com.solers.delivery.user;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.solers.delivery.domain.User;
import java.util.Arrays;
import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;

public class DefaultUserDetailsService implements UserDetailsService {

    private final UserService userService;
    private final PasswordService passwordService;

    public DefaultUserDetailsService(UserService userService, PasswordService passwordService) {
        this.userService = userService;
        this.passwordService = passwordService;
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
        User user = userService.get(username);

        if (user != null) {
            String password = passwordService.getPassword(username);
            // Ignore whether the users credentials are expired or not.  That check will be made explicitly 
            // when the user logs in. See SystemHelper.login()
            boolean notExpired = true;
            Collection<? extends GrantedAuthority> authorities = Arrays.asList(user.getAuthorities());
            return new org.springframework.security.core.userdetails.User(user.getUsername(), password, user.isEnabled(), true, notExpired, true, authorities);

            //return new org.springframework.security.core.userdetails.User(user.getUsername(), password, user.isEnabled(), true, notExpired, true, user.getAuthorities());
            
           
        }
        throw new UsernameNotFoundException("Username does not exist.");
    }
}
