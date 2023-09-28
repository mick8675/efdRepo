package com.solers.delivery.user;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.solers.delivery.daos.DAOFactory;
import com.solers.delivery.daos.UserDAO;
import com.solers.delivery.domain.User;
import com.solers.security.audit.Auditable;
import com.solers.security.audit.Auditable.Action;
import com.solers.security.audit.Auditable.Severity;
import org.springframework.stereotype.Repository;

@Repository
public class UserServiceImpl implements UserService 
{

    private final DAOFactory factory;
    
    public UserServiceImpl(DAOFactory factory) 
    {
        this.factory = factory;
    }

    @Override
    @Transactional
    public User get(Long id) {
        return dao().getById(id);
    }

    @Override
    @Transactional
    public User get(String username) {
        return dao().getUserByUsername(username);
    }

    @Override
    @Transactional
    public List<User> getUsers() {
        return dao().findAll();
    }

    @Override
    @Transactional
    @Auditable(action = Action.MODIFY, severity = Severity.MEDIUM)
    public Long save(User user) 
    {
        //dao().makePersistent(user);
        dao().makePersistent(user);
        return user.getId();
    }
    
    @Override
    @Transactional
    @Auditable(action = Action.DISABLE, severity = Severity.MEDIUM)
    public void disable(Long id) {
        User u = get(id);
        if (u.isEnabled()) {
            u.setEnabled(false);
        }
    }

    @Override
    @Transactional
    @Auditable(action = Action.ENABLE, severity = Severity.MEDIUM)
    public void enable(Long id) {
        User u = get(id);
        if (!u.isEnabled()) {
            u.setEnabled(true);
            u.setFailedLogins(0);
        }
    }

    @Override
    @Transactional
    @Auditable(action = Action.DELETE, severity = Severity.MEDIUM)
    public void remove(Long id) {
        factory.getPasswordDAO().deleteAll(id);
        dao().makeTransient(get(id));
    }

    private UserDAO dao() 
    {
        return factory.getUserDAO();
    }
}
