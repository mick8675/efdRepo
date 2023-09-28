package com.solers.delivery.user;



public interface PasswordService {
    
    /**
     * @param username
     * @return The current password for the user with id {@code id}
     */
    String getPassword(String username);
    
    /**
     * @param username
     * @return True if the password for {@code user} is expired or needs to be reset
     */
    boolean isPasswordExpired(String username);
    
    /**
     * Change the password for {@code username} to {@code newPassword}. 
     * 
     * The users current password must match {@code oldPassword}
     * @param username
     * @param oldpassword
     * @param newPassword
     */
    void changePassword(String username, String oldpassword, String newPassword);
    
    /**
     * Update the password for {@code user} to {@code newPassword}
     * @param username
     * @param newPassword
     */
    void updatePassword(String username, String newPassword);
}
