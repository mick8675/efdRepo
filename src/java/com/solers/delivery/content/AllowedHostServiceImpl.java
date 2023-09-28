package com.solers.delivery.content;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.solers.delivery.daos.AllowedHostDAO;
import com.solers.delivery.daos.DAOFactory;
import com.solers.delivery.domain.AllowedHost;
import com.solers.delivery.domain.ContentSet;
import com.solers.security.audit.Auditable;//.Action;
import com.solers.security.audit.Auditable.Action;
import com.solers.security.audit.Auditable.Severity;
//import com.solers.security.audit.Auditable.Severity;

@Service
@Transactional
public class AllowedHostServiceImpl implements AllowedHostService {

    private final DAOFactory factory;
    private final ContentService service;

    public AllowedHostServiceImpl(DAOFactory factory, ContentService service) {
        this.factory = factory;
        this.service = service;
    }

    @Override
    @Transactional
    @Auditable(action = Action.MODIFY, severity = Severity.MEDIUM)
    public Long save(AllowedHost host) {
        dao().makePersistent(host);
        return host.getId();
    }

    @Override
    public List<AllowedHost> list() {
        return dao().findAll();
    }

    @Override
    @Transactional
    @Auditable(action = Action.DELETE, severity = Severity.MEDIUM)
    
    public void remove(AllowedHost host) {
        dao().makeTransient(host);

        for (ContentSet c : service.getSuppliers()) {
            if (c.removeAllowedHost(host)) {
                service.save(c);
            }
        }
    }

    @Override
    public AllowedHost get(String alias) {
        return dao().getByAlias(alias);
    }

    private AllowedHostDAO dao() {
        return factory.getAllowedHostDAO();
    }
}



//_________old code


/*package com.solers.delivery.content;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.solers.delivery.daos.AllowedHostDAO;
import com.solers.delivery.daos.DAOFactory;
import com.solers.delivery.domain.AllowedHost;
import com.solers.delivery.domain.ContentSet;
import com.solers.security.audit.Auditable;
import com.solers.security.audit.Auditable.Action;
import com.solers.security.audit.Auditable.Severity;


public class AllowedHostServiceImpl implements AllowedHostService 
{
    private static final Logger LOGGER = LoggerFactory.getLogger(AllowedHostServiceImpl.class);
    @Autowired
    private EntityManager em;

    private final DAOFactory factory;
    private final ContentService service;
    
    public AllowedHostServiceImpl(DAOFactory factory, ContentService service) 
    {
        this.factory = factory;
        this.service = service;
    }

    //@Override
    @Transactional
    @Auditable(action = Action.MODIFY, severity = Severity.MEDIUM)
    public Long save(AllowedHost host) 
    {
       // dao().makePersistent(host);
        dao().makePersistent(host);
        return host.getId();
    }

    @Override
    @Transactional
    public List<AllowedHost> list() 
    {
        return dao().findAll();
    }

    @Override
    @Transactional
    @Auditable(action = Action.DELETE, severity = Severity.MEDIUM)
    public void remove(AllowedHost host) {
        dao().makeTransient(host);
        
        for (ContentSet c : service.getSuppliers()) {
            if (c.removeAllowedHost(host)) {
                service.save(c);
            }
        }
    }
    
    @Override
    @Transactional
    public AllowedHost get(String alias) {
        return dao().getByAlias(alias);
    }
    
    private AllowedHostDAO dao() 
    {
        return factory.getAllowedHostDAO();
    }
}
*/