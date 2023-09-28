package com.solers.delivery.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="resource_parameter")
public class ResourceParameter implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private String name;
    private String persistedValue;
    private boolean encrypted;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPersistedValue() {
        return this.persistedValue;
    }
    
    public void setPersistedValue(String value) {
        this.persistedValue = value;
    }
    
    public boolean isEncrypted() {
        return encrypted;
    }
    
    public void setEncrypted(boolean encrypted) {
        if (this.encrypted) {
            if (!encrypted) setPersistedValue(decrypt(getPersistedValue()));
        } else {
            if (encrypted) setPersistedValue(encrypt(getPersistedValue()));
        }
        this.encrypted = encrypted;
    }
    
    @Transient
    public String getValue() {
        return isEncrypted() ? decrypt(getPersistedValue()) : getPersistedValue();
    }
    
    public void setValue(String value) {
        setPersistedValue(isEncrypted() ? encrypt(value) : value);
    }
    
    //TODO: Put some *real* encryption in here.
    private String encrypt(String clear) {
        if (clear == null) return null;
        return new StringBuilder(clear).reverse().toString();
    }
    
    private String decrypt(String secret) {
        if (secret == null) return null;
        return new StringBuilder(secret).reverse().toString();
    }
}
