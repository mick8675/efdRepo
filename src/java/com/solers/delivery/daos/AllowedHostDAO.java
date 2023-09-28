package com.solers.delivery.daos;

import com.solers.delivery.domain.AllowedHost;
import com.solers.util.dao.GenericDAO;
//import com.solers.util.dao.GenericDAO;


public interface AllowedHostDAO extends GenericDAO<AllowedHost, Long> 
{
    
    String GET_BY_ALIAS = "getByAlias";
    
    public AllowedHost getByAlias(String alias);
    
}
