package com.solers.delivery.daos.impl;

import java.util.List;

import org.hibernate.query.Query;

import com.solers.delivery.daos.PasswordDAO;
import com.solers.delivery.domain.Password;
import com.solers.util.dao.GenericHibernateDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PasswordDAOHibernate extends GenericHibernateDAO<Password, Long> implements PasswordDAO {
    
    @Autowired 
    public PasswordDAOHibernate(SessionFactory sessionFactory) 
    {
        super(sessionFactory);
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public List<Password> getPasswords(Long id) {
        List<Password> retVal = null;
        Query q = getSession().getNamedQuery(PasswordDAO.GET_PASSWORDS);
        q.setParameter("id", id);
        retVal = (List<Password>) q.list();
        return retVal;
    }

    @Override
    public void deleteOldest(Long id) {
        Query q = getSession().getNamedQuery(PasswordDAO.DELETE_OLDEST);
        q.setParameter("id", id);
        q.executeUpdate();
    }

    @Override
    public void deleteAll(Long id) {
        Query q = getSession().getNamedQuery(PasswordDAO.DELETE_ALL);
        q.setParameter("id", id);
        q.executeUpdate();
    }
    
}