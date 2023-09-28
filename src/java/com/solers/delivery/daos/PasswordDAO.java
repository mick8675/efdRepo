package com.solers.delivery.daos;

import java.util.List;

import com.solers.delivery.domain.Password;
import com.solers.util.dao.GenericDAO;


public interface PasswordDAO extends GenericDAO<Password, Long> 
{
    
    String GET_PASSWORDS = "getPasswords";
    String DELETE_OLDEST = "deleteOldest";
    String DELETE_ALL = "deleteAll";
    
    List<Password> getPasswords(Long id);
    
    /**
     * Drop the oldest password for the user with id {@code id}
     * @param id
     */
    void deleteOldest(Long id);
    
    /**
     * Delete all passwords for the user with id {@code id}
     * @param id
     */
    void deleteAll(Long id);
    
}
