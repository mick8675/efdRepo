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
package com.solers.ui.dwr;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//import org.springframework.security.AccessDeniedException;
import org.springframework.security.access.AccessDeniedException;
//import org.springframework.security.Authentication;
import org.springframework.security.core.Authentication;
//import org.springframework.security.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
//import org.springframework.security.GrantedAuthority;
import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.GrantedAuthorityImpl;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.providers.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

/**
 * @author <a href="mailto:kevin.conaway@solers.com">Kevin Conaway</a>
 */
public class SpringSecurityAccessControlTestCase {
    
    SpringSecurityAccessControl ac;
    String scriptName = "scriptName";
    Method method = getClass().getMethods()[0];
    
   // Authentication auth = new UsernamePasswordAuthenticationToken("", "", new GrantedAuthority[] {});
    //List<GrantedAuthority> auth= new ArrayList<>(2);
    //auth = new UsernamePasswordAuthenticationToken("", "",new Collection<GrantedAuthority> );
    Authentication auth = new UsernamePasswordAuthenticationToken("", "" );
    
    @Before
    public void setUp() {
        ac = new SpringSecurityAccessControl();
        SecurityContextHolder.clearContext();
    }
    
    @Test
    public void testNoRestrictions() {
        ac.assertIsRestrictedByRole(scriptName, method);
    }
    
    @Test
    public void testValidRole() {
        ac.addRoleRestriction(scriptName, method.getName(), "TEST_ROLE");
        
        try {
            ac.assertIsRestrictedByRole(scriptName, method);
            Assert.fail();
        } catch (AuthenticationCredentialsNotFoundException expected) {
            
        }
        
        SecurityContext ctx = SecurityContextHolder.getContext();
        ctx.setAuthentication(auth);
        
        try {
            ac.assertIsRestrictedByRole(scriptName, method);
            Assert.fail();
        } catch (AccessDeniedException expected) {
            
        }
        
        //auth = new UsernamePasswordAuthenticationToken("", "", new GrantedAuthority[] {new GrantedAuthorityImpl("OTHER_ROLE"), new GrantedAuthorityImpl("TEST_ROLE")});
        //auth = new UsernamePasswordAuthenticationToken("", "", new Collection<? GrantedAuthority ?> {new GrantedAuthorityImpl("OTHER_ROLE"), new GrantedAuthorityImpl("TEST_ROLE")});
        List<GrantedAuthority> authorities;
        authorities = new ArrayList<>(2);
        authorities.add(new SimpleGrantedAuthority("OTHER_ROLE"));
        authorities.add(new SimpleGrantedAuthority("TEST_ROLE"));
        
        auth=new UsernamePasswordAuthenticationToken("", "", authorities);
        // authList.add(new SimpleGrantedAuthority("ROLE_USER"));
        ctx.setAuthentication(auth);
        
        ac.assertIsRestrictedByRole(scriptName, method);
    }
    
    @Test
    public void testAnyRole() {
        ac.addRoleRestriction(scriptName, method.getName(), "*");
        
        try {
            ac.assertIsRestrictedByRole(scriptName, method);
            Assert.fail();
        } catch (AuthenticationCredentialsNotFoundException expected) {
            
        }
        
        SecurityContext ctx = SecurityContextHolder.getContext();
        ctx.setAuthentication(auth);
        
        ac.assertIsRestrictedByRole(scriptName, method);
    }
    
    @Test
    public void testAddMultipleRoleRestrictions() 
    {
        ac.addRoleRestriction(scriptName, method.getName(), "ROLE_USER, *, TEST_USER");
        
         List<GrantedAuthority> testAuth;
        testAuth = new ArrayList<>(1);
        testAuth.add(new SimpleGrantedAuthority("ROLE_USER"));
        
        SecurityContext ctx = SecurityContextHolder.getContext();
        ctx.setAuthentication(auth);
        
        ac.assertIsRestrictedByRole(scriptName, method);
        
        auth = new UsernamePasswordAuthenticationToken("","",testAuth);
        testAuth.clear();
        testAuth.add(new SimpleGrantedAuthority("TEST_USER"));
        ac.assertIsRestrictedByRole(scriptName, method);
        
        auth = new UsernamePasswordAuthenticationToken("", "",testAuth);
        ac.assertIsRestrictedByRole(scriptName, method);
    }
}
