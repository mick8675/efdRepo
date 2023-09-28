package com.solers.util.dao;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
//import javax.persistence.TypedQuery;
import org.apache.log4j.Logger;
//import org.hibernate.Criteria;
import org.hibernate.HibernateException;
//import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.annotations.common.util.impl.Log;
import org.hibernate.criterion.Criterion;
import org.hibernate.validator.internal.engine.ValidatorImpl;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Path;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.hibernate.LockOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public class GenericHibernateDAO<T, ID extends Serializable> implements GenericDAO<T, ID> 
{

    private static final Logger log = Logger.getLogger(GenericHibernateDAO.class);

    //private final ValidatorImpl validator;
    private final Validator validator;
    
    private Class<T> persistentClass;
    //private SessionFactory sessionFactory;
    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) 
    {
        this.sessionFactory = sessionFactory;
    }
    
    //@SuppressWarnings("unchecked")
   
    /*public GenericHibernateDAO(Class<T> persistentClass,SessionFactory sessionFactory) 
    {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validatorF = validatorFactory.getValidator();
        this.persistentClass = persistentClass;//(Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.validator = (ValidatorImpl)validatorF.getConstraintsForClass(this.persistentClass);
        this.sessionFactory = sessionFactory;
        
    }*/
    
    public GenericHibernateDAO(Class<T> persistentClass, SessionFactory sessionFactory) 
    {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        this.persistentClass = persistentClass;
        this.validator = validatorFactory.getValidator();
        this.sessionFactory = sessionFactory;
    }

    
    public GenericHibernateDAO() 
    {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validatorF = validatorFactory.getValidator();
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.validator = (ValidatorImpl)validatorF.getConstraintsForClass(this.persistentClass);
    }
    
    /*public GenericHibernateDAO(SessionFactory sessionFactory) 
    {
        this.sessionFactory = sessionFactory;
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validatorF = validatorFactory.getValidator();
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.validator = (ValidatorImpl)validatorF.getConstraintsForClass(this.persistentClass);
    }*/
    
    public GenericHibernateDAO(SessionFactory sessionFactory) 
    {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.validator = validatorFactory.getValidator();
        this.sessionFactory = sessionFactory;
    }

    
    
    /* original
     public GenericHibernateDAO() {
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.validator =  new ClassValidator<T>(this.persistentClass);
    }
    
    public GenericHibernateDAO(Class<T> persistentClass) {
        this.persistentClass = persistentClass;
        this.validator = new ClassValidator<T>(this.persistentClass);
    }
    */
    
    /*public GenericHibernateDAO(Class<T> persistentClass) 
    {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validatorF = validatorFactory.getValidator();
        this.persistentClass = persistentClass;
        this.validator = (ValidatorImpl)validatorF;
        
    }*/
       
    
    
       
    public Session getSession() 
    {
        if (sessionFactory == null) 
        {
            throw new IllegalStateException("SessionFactory has not been set on DAO before usage");
        }
        return sessionFactory.getCurrentSession();
    }
    

    public Class<T> getPersistentClass() {
        return persistentClass;
    }

    //@SuppressWarnings("unchecked")
    public T findById(ID id, boolean lock) {
        T entity;
        if (lock) {
            entity = (T) getSession().load(getPersistentClass(), id, LockOptions.UPGRADE);// LockMode.UPGRADE);
        } else {
            entity = (T) getSession().load(getPersistentClass(), id);
        }

        return entity;
    }
    

    //@SuppressWarnings("unchecked")
    public T getById(ID id) {
        return (T) getSession().get(getPersistentClass(), id);
    }

    public List<T> findAll() {
        return findByCriteria();
    }

    /*@SuppressWarnings("unchecked")
    public List<T> findByExample(T exampleInstance, String[] excludeProperty) 
    {
        CriteriaBuilder criteriaBuilder = getSession().getCriteriaBuilder();
        CriteriaQuery<T> crit = criteriaBuilder.createQuery(getPersistentClass());
        Root<T> root = crit.from(getPersistentClass());
        crit.select(root);
        
        //Criteria crit = getSession().createCriteria(getPersistentClass());
        Example example = Example.create(exampleInstance);
        for (String exclude : excludeProperty) {
            example.excludeProperty(exclude);
        }
        crit.add(example);
        return crit.list();
    }*/
    
    public List<T> findByExample(T exampleInstance, String[] excludeProperty) 
    {
        CriteriaBuilder criteriaBuilder = getSession().getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(getPersistentClass());
        Root<T> root = criteriaQuery.from(getPersistentClass());
        criteriaQuery.select(root);

        Predicate[] predicates = getPropertyPredicates(exampleInstance, excludeProperty, criteriaBuilder, root);
        criteriaQuery.where(predicates);

        return getSession().createQuery(criteriaQuery).getResultList();
    }
    
    /*private Predicate[] getPropertyPredicates(T exampleInstance, String[] excludeProperty, CriteriaBuilder criteriaBuilder, Root<T> root) 
    {
        List<Predicate> predicates = new ArrayList<>();
        BeanInfo beanInfo;
        try 
        {
            beanInfo = Introspector.getBeanInfo(exampleInstance.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) 
            {
                String propertyName = propertyDescriptor.getName();

                if (Arrays.stream(excludeProperty).noneMatch(propertyName::equals)) 
                {
                    Object propertyValue = propertyDescriptor.getReadMethod().invoke(exampleInstance);

                    if (propertyValue != null) 
                    {
                        Path<?> propertyPath = root.get(propertyName);
                        predicates.add(criteriaBuilder.equal(propertyPath, propertyValue));
                    }
                }
            }
        } 
        catch (IntrospectionException | IllegalAccessException | InvocationTargetException e) 
        {
            log.error(e.toString());
            //e.printStackTrace();
        }

        return predicates.toArray(new Predicate[0]);
}*/
    private Predicate[] getPropertyPredicates(T exampleInstance, String[] excludeProperty, CriteriaBuilder criteriaBuilder, Root<T> root) 
    {
    List<Predicate> predicates = new ArrayList<>();
    BeanInfo beanInfo;
    try 
    {
        beanInfo = Introspector.getBeanInfo(exampleInstance.getClass());
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) 
        {
            String propertyName = propertyDescriptor.getName();

            if (Arrays.stream(excludeProperty).noneMatch(propertyName::equals)) 
            {
                Object propertyValue = propertyDescriptor.getReadMethod().invoke(exampleInstance);

                if (propertyValue != null) 
                {
                    Path<?> propertyPath = root.get(propertyName);
                    predicates.add(criteriaBuilder.equal(propertyPath, propertyValue));
                }
            }
        }
    } 
    catch (IntrospectionException | IllegalAccessException | InvocationTargetException e) 
    {
        log.error("Error retrieving property predicates: " + e.getMessage());
    }

    return predicates.toArray(new Predicate[0]);
}


    /*public T makePersistent(T entity) {
        try 
        {
            validate(entity);
            getSession().saveOrUpdate(entity);
        } 
        catch (HibernateException e) 
        {
            log.error("Error making persistent: " + entity, e);
        }
        return entity;
    }*/
    
    public T makePersistent(T entity) 
    {
        Set<ConstraintViolation<T>> violations = validator.validate(entity);
        if (!violations.isEmpty()) 
        {
            // Handle validation errors
            for (ConstraintViolation<T> violation : violations) 
            {
                String message = violation.getMessage();
                // Handle or log validation error messages
            }
            throw new ValidationException("Entity validation failed");
        }

        try 
        {
            getSession().saveOrUpdate(entity);
        } 
        catch (HibernateException e) 
        {
            log.error("Error making persistent: " + entity, e);
        }
        return entity;
    }


    public void makeTransient(T entity) {
        try {
            getSession().delete(entity);
        } catch (HibernateException e) {
            log.error("Error making transient: " + entity, e);
        }
    }
    
    public void makeTransientById(Collection<ID> ids) 
    {
        for (ID id : ids) 
        {
            T entity = getById(id);
            if (entity != null) {
                makeTransient(entity);
            }
        }
    }

    public void flush() 
    {
        getSession().flush();
    }

    public void clear() 
    {
        getSession().clear();
    }

    
    //@SuppressWarnings("unchecked")
    /*protected List<T> findByCriteriaKeep(Criterion... criterion) 
    {
                
        Criteria crit = getSession().createCriteria(getPersistentClass());
        //Criteria crit = getSession().createNamedQuery("1", persistentClass);
        for (Criterion c : criterion) {
            crit.add(c);
        }
        
        return crit.list();
    }
    
    */

    /**
     * Use this inside subclasses as a convenience method.
     * @param criterion
     * @return 
     */
     protected List<T> findByCriteria(Criterion... criterion) 
     {
        
        CriteriaBuilder cb = getSession().getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(getPersistentClass());
        cq.from(getPersistentClass());
        //cq.select(root);
        List critList = getSession().createQuery(cq).getResultList();
        for (Criterion c : criterion) 
        {
            critList.add(c);
        }
        
        
        return critList;
    }
    
   
    
    
    protected void validate(T entity) 
    {
        Set<ConstraintViolation<T>> violations = validator.validate(entity);
        if (!violations.isEmpty()) 
        {
            List<String> messages = new ArrayList<>();
            for (ConstraintViolation<T> violation : violations) 
            {
                messages.add(violation.getMessage());
            }
            throw new ConstraintViolationException("Validation failed: " + messages, violations);
        }
    }

    
    
}//________________end class______________________________________