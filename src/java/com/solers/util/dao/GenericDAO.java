package com.solers.util.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Interface is used as described by Hibernate authors in (http://www.hibernate.org/328.html).Designed to be the
 base interface extended by all other persistant entity interfaces.Goal is to capture basic Create, Read, Update,
 and Delete (CRUD) operations in this base interface for any persistant entity through use of Generics.
 *
 * @author JGimourginas
 * @param <T>
 * @param <ID>
 */
public interface GenericDAO<T, ID extends Serializable> 
{
    T findById(ID id, boolean lock);
    
    T getById(ID id);

    List<T> findAll();

    List<T> findByExample(T exampleInstance, String[] excludeProperty);

    T makePersistent(T entity);

    void makeTransient(T entity);

    void flush();
}