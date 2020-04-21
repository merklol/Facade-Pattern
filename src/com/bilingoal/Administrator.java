package com.bilingoal;

public class Administrator extends User {
    private String userRole;

    public Administrator(String userName, String password, String userRole) {
        setUserName(userName);
        setPassword(password);
        this.userRole = userRole;
    }

    @Override
    public String getUserRole() {
        return this.userRole;
    }
}
