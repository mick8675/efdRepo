package com.solers.delivery.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alerts")
public class Alert implements Serializable 
{
    
    public static enum AlertType 
    {
        ADMIN, USER, ALL
    }
    
    private Long id;
    private Date timestamp;
    private String message;
    private AlertType type;
    private boolean unread; // Derby couldn't handle a column named "read"
    
    public Alert() 
    { 
    
    }
    
    public Alert(String message, AlertType type) 
    {
        setMessage(message);
        setType(type);
        setTimestamp(new Date());
        setUnread(true);
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
    
    @Column(name="timestamp")
    public Date getTimestamp() 
    {
        return timestamp;
    }
    
    public void setTimestamp(Date timestamp) 
    {
        this.timestamp = timestamp;
    }
    
    @Column(name="message")
    public String getMessage() 
    {
        return message;
    }
    
    public void setMessage(String message) 
    {
        this.message = message;
    }

    @Column(name="type")
    @Enumerated(EnumType.STRING)
    public AlertType getType() 
    {
        return type;
    }

    public void setType(AlertType type) 
    {
        this.type = type;
    }

    @Column(name="unread")
    public boolean isUnread() 
    {
        return unread;
    }

    public void setUnread(boolean unread) 
    {
        this.unread = unread;
    }
    
}//_______________________________________end class______________________________
