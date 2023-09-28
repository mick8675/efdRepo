package com.solers.delivery.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
//import org.hibernate.validator.constraints.NotEmpty;
//import org.hibernate.validator.constraints.Pattern;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.solers.delivery.daos.UserDAO;
import javax.persistence.Access;
import javax.persistence.Temporal;
import javax.validation.constraints.Pattern;


@Configurable("userPrototype")
@Entity
@Table(name = "users")
@NamedQuery(name = UserDAO.GET_USER_BY_USERNAME, query = "SELECT u FROM User u WHERE u.username=:username")
public class User {

    private Long id;
    private String username;
    private boolean enabled;
    private boolean adminRole = false;
    private boolean initialPassword;
    private String firstName, lastName;
    private Date lastLogin;
    private Date currLogin;
    private int failedLogins = 0;
    private Integer lastFailedLogins = 0;
    private String location;
    private String lastLocation;

    @Transient
    public String getName() {
        return String.format("%s %s", getFirstName(), getLastName());
    }

    //@Transient
    @Override
    public String toString() {
        return String.format("Id: %s, Name: %s", this.id, this.getUsername());
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(nullable = false, unique = true)
    @NotEmpty(message = "{user.username.required}")
    @Pattern(regexp = "[\\w-]*", message = "{user.username.invalid}")
    public String getUsername() {
        return username;
    }

    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getCurrLogin() {
        return currLogin;
    }

    public void setCurrLogin(Date currLogin) {
        this.currLogin = currLogin;
    }

    @Column(nullable = false)
    public int getFailedLogins() {
        return failedLogins;
    }

    public void setFailedLogins(int count) {
        this.failedLogins = count;
    }

    @Column
    public Integer getLastFailedLogins() {
        return lastFailedLogins;
    }

    public void setLastFailedLogins(Integer count) {
        this.lastFailedLogins = count;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Column(nullable = false)
    public boolean isEnabled() {
        return this.enabled;
    }

    @Column(nullable = false)
    public boolean isAdminRole() {
        return this.adminRole;
    }

    public void setAdminRole(boolean adminRole) {
        this.adminRole = adminRole;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(nullable = false)
    @NotEmpty(message = "{user.first.required}")
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(nullable = false)
    @NotEmpty(message = "{user.last.required}")
    public String getLastName() {
        return lastName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Column
    public String getLocation() {
        return location;
    }

    public void setLastLocation(String lastLocation) {
        this.lastLocation = lastLocation;
    }

    @Column
    public String getLastLocation() {
        return lastLocation;
    }

    @Column(nullable = false)
    public boolean isInitialPassword() {
        return initialPassword;
    }

    public void setInitialPassword(boolean initialPassword) {
        this.initialPassword = initialPassword;
    }

    @Transient
    public GrantedAuthority[] getAuthorities() {
        if (adminRole) {
            return new GrantedAuthority[]{new SimpleGrantedAuthority("ROLE_ADMIN")};
        } else {
            return new GrantedAuthority[]{new SimpleGrantedAuthority("ROLE_USER")};
        }
    }

    
    public void updateLastLogin(String remoteIPAddr) {
        this.lastFailedLogins = this.failedLogins;
        this.failedLogins = 0;

        // The first time login, there is no last login history, use the current location. Same for lastLogin
        this.lastLocation = (this.location == null) ? remoteIPAddr : this.location;
        this.location = remoteIPAddr;

        this.lastLogin = (this.currLogin == null) ? new Date() : this.currLogin;
        this.currLogin = new Date();
    }

    public void updateFailedLogin() {
        this.failedLogins++;
    }
}


/* 
package com.solers.delivery.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

//import com.solers.delivery.validator.NotEmpty;
import javax.validation.constraints.NotEmpty;
//import com.solers.delivery.validator.Pattern;
import javax.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.authority.GrantedAuthoritiesContainer;
        
import com.solers.delivery.daos.UserDAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Temporal;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.security.core.context.SecurityContextHolder;
//import java.io.Serializable;

@Configurable("userPrototype")
@Entity
//@DynamicUpdate
@Table(name = "users")
@NamedQuery(name = UserDAO.GET_USER_BY_USERNAME, query = "SELECT u FROM User u WHERE u.username=:username")
public class User implements Serializable {

    private Long id;
    private String username;
    private boolean enabled;
    private boolean adminRole = false;
    private boolean initialPassword;
    private String firstName, lastName;
    private Date lastLogin;
    private Date currLogin; 
    private int failedLogins = 0;
    private Integer lastFailedLogins = 0;
    private String location;
    private String lastLocation;

    @Transient
    public String getName() {
        return String.format("%s %s", getFirstName(), getLastName());
    }
    
    //@Transient
    @Override
    public String toString() {
        return String.format("Id: %s, Name: %s", this.id, this.getUsername());
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(nullable = false, unique = true)
    @NotEmpty(message="{user.username.required}")
    @Pattern(regexp = "[\\w-]*", message="{user.username.invalid}")
    public String getUsername() {
        return username;
    }

    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getCurrLogin() {
        return currLogin;
    }

    public void setCurrLogin(Date currLogin) {
        this.currLogin = currLogin;
    }

    @Column(nullable = false)
    public int getFailedLogins() {
        return failedLogins;
    }

    public void setFailedLogins(int count) {
        this.failedLogins = count;
    }

    @Column
    public Integer getLastFailedLogins() {
        return lastFailedLogins;
    }

    public void setLastFailedLogins(Integer count) {
        this.lastFailedLogins = count;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Column(nullable = false)
    public boolean isEnabled() {
        return this.enabled;
    }

    @Column(nullable = false)
    public boolean isAdminRole() {
        return this.adminRole;
    }

    public void setAdminRole(boolean adminRole) {
        this.adminRole = adminRole;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(nullable = false)
    @NotEmpty(message="{user.first.required}")
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(nullable = false)
    @NotEmpty(message="{user.last.required}")
    public String getLastName() {
        return lastName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Column
    public String getLocation() {
        return location;
    }
    
    public void setLastLocation(String lastLocation) {
        this.lastLocation = lastLocation;
    }

    @Column
    public String getLastLocation() {
        return lastLocation;
    }

    @Column(nullable = false)
    public boolean isInitialPassword() {
        return initialPassword;
    }

    public void setInitialPassword(boolean initialPassword) {
        this.initialPassword = initialPassword;
    }

    @Transient()
    public Collection<GrantedAuthority> getAuthorities() 
    {
        
        List<GrantedAuthority> authList;
        authList = new ArrayList<>(2);
        if (adminRole) 
        {
            
            authList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
            //return new GrantedAuthority[] { new GrantedAuthorityImpl("ROLE_ADMIN") };
        } 
        else 
        {
             authList.add(new SimpleGrantedAuthority("ROLE_USER"));
            //return new GrantedAuthority[] { new GrantedAuthorityImpl("ROLE_USER") };
        }
        return authList;
    }

    //@Transient()
    public void updateLastLogin(String remoteIPAddr) {        
        this.lastFailedLogins = this.failedLogins;
        this.failedLogins = 0;
        
        // The first time login, there is no last login history, use the current location. Same for lastLogin
        this.lastLocation = (this.location == null) ? remoteIPAddr : this.location;
        this.location = remoteIPAddr;
        
        this.lastLogin = (this.currLogin == null) ? new Date() : this.currLogin;
        this.currLogin = new Date();
    }

    //@Transient()
    public void updateFailedLogin() {
        this.failedLogins++;
    }
  
     
}
*/