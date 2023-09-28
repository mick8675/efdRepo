package com.solers.delivery.daos.impl;

import java.io.Serializable;

import org.hibernate.query.Query;

import com.solers.delivery.domain.ContentSet;
import com.solers.util.dao.GenericHibernateDAO;
import com.solers.util.dao.ValidationException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @param <T>
 * @param <ID>
 */
@Repository
public class BaseContentSetHibernateDAO<T extends ContentSet, ID extends Serializable> extends GenericHibernateDAO<T, ID> {
    
     
    @Autowired
    public BaseContentSetHibernateDAO(SessionFactory sessionFactory) 
    {
        super(sessionFactory);
    }
    
    @Override
    protected void validate(T contentSet) {
        ValidationException result = null;
        
        try {
            super.validate(contentSet);
        } catch (ValidationException ex) {
            result = ex;
        }
        
        ContentSet existing = byName(contentSet.getName());
        if (existing != null ) {
            if (!equals(contentSet.getId(), existing.getId())) {
                if (result == null) {
                    result = new ValidationException();
                }
                result.addMessage("A Content Set with the given name already exists");
            }
            getSession().evict(existing);
        }
      
        if (result != null) 
        {
            throw result;
        }
    }
    
    private boolean equals(Long one, Long two) {
        return one != null && two != null && one.equals(two);
    }
    
    private ContentSet byName(String name) 
    {
        Query q = getSession().createQuery("from ContentSet cs where cs.name = :name");
        q.setParameter("name", name);
        return (ContentSet) q.uniqueResult();
    }
    
}
