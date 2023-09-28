package com.solers.delivery.daos.impl;

import java.util.List;

import org.hibernate.query.Query;

import com.solers.delivery.daos.ContentSetDAO;
import com.solers.delivery.domain.ContentSet;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * This class extends the generic DAO operations to provide methods for each of the named queries associated with a content set. The queries are
 *         performed via hibernate queries.
 */
@Transactional
public class ContentSetDAOHibernate extends BaseContentSetHibernateDAO<ContentSet, Long> implements ContentSetDAO 
{

    @Autowired
    public ContentSetDAOHibernate(SessionFactory sessionFactory) 
    {
        super(sessionFactory);
    }
    /**
     * Perform hibernate query on the content_set table.
     * 
     * @param name -
     *            The logical name of the supplier content set.
     * @return - A single content set whose logical name matches the parameter 'name'.
     */
    public ContentSet getSupplierByName(String name) {
        ContentSet retVal = null;
        Query q = getSession().getNamedQuery(ContentSetDAO.GET_SUPPLIER_BY_NAME);
        q.setParameter("name", name);
        retVal = (ContentSet) q.uniqueResult();
        return retVal;
    }

    /**
     * Perform hibernate query on the content_set table.
     * 
     * @return - A complete list of supplier content sets.
     */
    @SuppressWarnings("unchecked")
    public List<ContentSet> getSupplierSets() {
        List<ContentSet> retVal = null;
        Query q = getSession().getNamedQuery(ContentSetDAO.GET_SUPPLIER_SETS);
        retVal = (List<ContentSet>) q.list();
        return retVal;
    }
}
