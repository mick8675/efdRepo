package com.solers.delivery.daos.impl;

import com.solers.delivery.daos.AllowedHostDAO;
import com.solers.delivery.domain.AllowedHost;
import com.solers.util.dao.GenericHibernateDAO;
import com.solers.util.dao.ValidationException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AllowedHostDAOHibernate extends GenericHibernateDAO<AllowedHost, Long> implements AllowedHostDAO {

    @Autowired 
    public AllowedHostDAOHibernate(SessionFactory sessionFactory) 
    {
        super(sessionFactory);
    }
    @Override
    public AllowedHost getByAlias(String alias) 
    {
        Query<AllowedHost> q = getSession().createNamedQuery(AllowedHostDAO.GET_BY_ALIAS, AllowedHost.class);
        q.setParameter("alias", alias);
        return q.uniqueResult();
    }
    
    @Override
    protected void validate(AllowedHost allowedHost) 
    {
        ValidationException result = null;
        
        try 
        {
            super.validate(allowedHost);
        } 
        catch (ValidationException ex) 
        {
            result = ex;
        }
        
        AllowedHost existing = getByAlias(allowedHost.getAlias());
        if (existing != null ) {
            if (!equals(allowedHost.getId(), existing.getId())) {
                if (result == null) {
                    result = new ValidationException();
                }
                result.addMessage("An Allowed host with the given alias already exists");
            }
            getSession().evict(existing);
        }
      
        if (result != null) {
            throw result;
        }
    }
    
    private boolean equals(Long one, Long two) {
        return one != null && two != null && one.equals(two);
    }
}
