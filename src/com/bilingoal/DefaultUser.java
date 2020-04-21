package com.bilingoal;

public class DefaultUser extends User {
    private String userRole;

    public DefaultUser(String userName, String password, String userRole) {
        setUserName(userName);
        setPassword(password);
        this.userRole = userRole;
    }

    @Override
    public String getUserRole() {
        return this.userRole;
    }
}
