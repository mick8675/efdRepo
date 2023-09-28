package com.solers.delivery.web.remoting;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.solers.delivery.domain.User;
import com.solers.delivery.user.PasswordService;
import com.solers.delivery.user.UserService;
import com.solers.delivery.util.password.InvalidPasswordException;

public class UserHelper {
    
    private final UserService userService;
    private final PasswordService passwordService;

    public UserHelper(UserService userService, PasswordService passwordService) {
        this.userService = userService;
        this.passwordService = passwordService;
    }
    
    public List<UserNode> getUsers() {
        List<User> users = userService.getUsers();
        List<UserNode> result = new ArrayList<UserNode>(users.size());
        
        for (User u : users) {
            UserNode node = new UserNode(u.getId(), u.getUsername());
            node.setEnabled(u.isEnabled());
            node.setName(u.getName());
            node.setLastLogin(u.getLastLogin());
            node.setFailedLogins(u.getFailedLogins());
            result.add(node);
        }
        return result;
    }
    
    public Long saveUser(User user, String pw, String pwConfirm) {
        boolean newUser = user.getId() == null;
        
        if (newUser) {
            Long newId = userService.save(user);
            user.setId(newId);
        }
        
        try {
            if (newUser || !StringUtils.isBlank(pw) || !StringUtils.isBlank(pwConfirm)) {
                if (!pw.equals(pwConfirm)) {
                    throw new InvalidPasswordException("Passwords do not match");
                }
                passwordService.updatePassword(user.getUsername(), pw);
            }
        } catch (InvalidPasswordException ex) {
            // We need to rollback the user save if the users password was invalid
            if (newUser) {
                userService.remove(user.getId());
            }
            throw ex;
        }
        
        
        if (!newUser) {
            userService.save(user);
        }
        
        return user.getId();
    }
    
    public User getUserById(Long id) {
        return userService.get(id);
    }
    
    public User getUserByName(String username) {
        return userService.get(username);
    }
}
