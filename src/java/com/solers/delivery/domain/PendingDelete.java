package com.solers.delivery.domain;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//import org.hibernate.annotations.Index;
//import org.hibernate.annotations.common.
import javax.persistence.Index;

import com.solers.delivery.content.consumer.difference.ContentDifference;
import com.solers.delivery.daos.PendingDeleteDAO;


@Entity
//@Table(name = "pending_delete")
@Table(name = "pending_delete", indexes={@Index(name = "pathIndex",columnList = "path"),@Index(name = "consumerIdIndex", columnList="consumerId")})
@NamedQueries({
    @NamedQuery(name = PendingDeleteDAO.GET_BY_PATH, 
                query = "SELECT p from PendingDelete p WHERE p.consumerContentSetId = :consumerId AND p.path LIKE :path"),
    @NamedQuery(name = PendingDeleteDAO.GET_NEXT_TO_DELETE, 
                query = "SELECT p from PendingDelete p WHERE id=(SELECT MIN(pd.id) from PendingDelete pd WHERE pd.consumerContentSetId = :consumerId AND (pd.timeMarkedForDeletion <= :adjustedTime)) AND p.consumerContentSetId = :consumerId AND (p.timeMarkedForDeletion <= :adjustedTime)")
    })
public class PendingDelete implements Serializable 
{

    private static final long serialVersionUID = 1l;    
    private static final int PATH_LENGTH = 512;

    private Long id = null;
    private String path = null;
    private Calendar timeMarkedForDeletion = null;
    private Long consumerContentSetId = null;

    public PendingDelete() 
    {
        
    }

    public PendingDelete(ContentDifference cd) 
    {
        this.path = cd.getPath();
        this.timeMarkedForDeletion = cd.getTimeAdded();
        this.consumerContentSetId = cd.getConsumerContentSetId();
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

    @Column(length = PATH_LENGTH)
    //@Index(name = "pathIndex")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Column(updatable = false)
    public Calendar getTimeMarkedForDeletion() {
        return timeMarkedForDeletion;
    }

    public void setTimeMarkedForDeletion(Calendar timeMarkedForDeletion) {
        this.timeMarkedForDeletion = timeMarkedForDeletion;
    }

    @Column
    //@Index(name = "consumerIdIndex")
    public Long getConsumerContentSetId() 
    {
        return consumerContentSetId;
    }

    public void setConsumerContentSetId(Long consumerContentSetId) 
    {
        this.consumerContentSetId = consumerContentSetId;
    }
}
