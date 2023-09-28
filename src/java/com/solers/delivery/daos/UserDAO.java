package com.solers.delivery.daos;

import com.solers.delivery.domain.User;
import com.solers.util.dao.GenericDAO;

/**
 * Created by IntelliJ IDEA.
 * User: mhasan
 * Date: Mar 21, 2007
 * Time: 2:32:06 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UserDAO extends GenericDAO<User, Long> {

    public static final String GET_USER_BY_USERNAME = "getUserByUsername";

    public User getUserByUsername(String username);
}
