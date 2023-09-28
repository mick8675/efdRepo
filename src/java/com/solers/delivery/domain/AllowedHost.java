package com.solers.delivery.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.solers.delivery.daos.AllowedHostDAO;
//import com.solers.delivery.domain.validations.NotBlank;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


@Entity
@Table(name="allowed_hosts")
@NamedQuery(name = AllowedHostDAO.GET_BY_ALIAS, query = "SELECT a FROM AllowedHost a WHERE a.alias = :alias")
public class AllowedHost implements Serializable 
{
    
    private static final long serialVersionUID = 1l;
    
    private Long id;
    private String alias;
    private String commonName;
    
    public AllowedHost() {
        
    }
    
    public AllowedHost(String alias, String commonName) 
    {
        setAlias(alias);
        setCommonName(commonName);
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() 
    {
        return id;
    }

    public void setId(Long id) 
    {
        this.id = id;
    }
    
    @Column
    @NotBlank(message="{allowedhost.alias.required}")
    @Pattern(regexp = "^[a-zA-Z0-9\\s_.-]+$", message="{allowedhost.alias.invalid}")
    public String getAlias() 
    {
        return alias;
    }
    
    public void setAlias(String alias) 
    {
        this.alias = alias;
    }
    
    @Column(nullable=false, updatable=true)
    @NotBlank(message="{allowedhost.commonname.required}")
     @Pattern(regexp = "^[a-zA-Z0-9\\s_.-]+$", message="{allowedhost.commonname.invalid}")
    public String getCommonName() 
    {
        return commonName;
    }
    
    public void setCommonName(String commonName) 
    {
        this.commonName = commonName;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (obj instanceof AllowedHost) 
        {
            return ((AllowedHost) obj).alias.equals(alias);
        }
        return false;
    }

    @Override
    public int hashCode() 
    {
        return alias == null ? 0 : alias.hashCode();
    }
    
    @Override
    public String toString() 
    {
        return alias;
    }
}
