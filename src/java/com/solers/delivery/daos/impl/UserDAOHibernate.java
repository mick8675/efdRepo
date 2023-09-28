package com.solers.delivery.daos.impl;

import org.hibernate.query.Query;

import com.solers.delivery.daos.UserDAO;
import com.solers.delivery.domain.User;
import com.solers.util.dao.GenericHibernateDAO;
import com.solers.util.dao.ValidationException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOHibernate extends GenericHibernateDAO<User, Long> implements UserDAO {
    
    @Autowired 
    public UserDAOHibernate(SessionFactory sessionFactory) 
    {
        super(sessionFactory);
    }
    
    public User getUserByUsername(String username) {
        Query q = getSession().getNamedQuery(UserDAO.GET_USER_BY_USERNAME);
        q.setParameter("username", username);
        return (User) q.uniqueResult();
    }
    
    @Override
    protected void validate(User user) {
        ValidationException result = null;
        
        try {
            super.validate(user);
        } catch (ValidationException ex) {
            result = ex;
        }
        
        User existing = getUserByUsername(user.getUsername());
        if (existing != null ) {
            if (!equals(user.getId(), existing.getId())) {
                if (result == null) {
                    result = new ValidationException();
                }
                result.addMessage("A User with the given username already exists");
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
