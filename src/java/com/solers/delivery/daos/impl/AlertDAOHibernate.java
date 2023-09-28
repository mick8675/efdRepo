package com.solers.delivery.daos.impl;

import java.util.Collection;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.solers.delivery.daos.AlertDAO;
import com.solers.delivery.domain.Alert;
import com.solers.delivery.domain.Alert.AlertType;
import com.solers.util.Page;
import com.solers.util.dao.GenericHibernateDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class AlertDAOHibernate extends GenericHibernateDAO<Alert, Long> implements AlertDAO 
{
    @Autowired
    public AlertDAOHibernate(SessionFactory sessionFactory) 
    {
        super(sessionFactory);
    }
    
    @Override
    public Page<Alert> listBy(AlertType type, int startIndex, int max) 
    {
        Session session = getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Alert> criteriaQuery = builder.createQuery(Alert.class);
        Root<Alert> root = criteriaQuery.from(Alert.class);

        Predicate typePredicate = builder.or(
            builder.equal(root.get("type"), type),
            builder.equal(root.get("type"), AlertType.ALL)
        );
        criteriaQuery.where(typePredicate);
        criteriaQuery.orderBy(builder.desc(root.get("timestamp")));

        List<Alert> resultList = session.createQuery(criteriaQuery)
                                        .setFirstResult(startIndex)
                                        .setMaxResults(max)
                                        .getResultList();

        // Count query
        CriteriaQuery<Long> countQuery = builder.createQuery(Long.class);
        countQuery.select(builder.count(countQuery.from(Alert.class)))
                  .where(typePredicate);
        Long count = session.createQuery(countQuery).getSingleResult();

        return new Page<>(count.intValue(), resultList);
    }

    @Override
    public void makeTransientById(Collection<Long> ids) 
    {
        getSession().createQuery("delete from Alert where id in (:ids)")
                    .setParameter("ids", ids)
                    .executeUpdate();
    }
}
