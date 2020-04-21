package com.bilingoal;

public class Authenticator {

    public void authenticate(String userName, String password){
        Database db = new AppDatabase("db.txt");
        User user = db.search(userName);
        if(user != null){
            if(String.valueOf(password.hashCode()).equals(user.getPasswordHashCode())){
                System.out.println("Welcome back " + user.getUserName().substring(0, 1).toUpperCase()
                        + user.getUserName().substring(1) + "!");
                System.out.println("You are logged in as " + user.getUserRole());
            } else {
                System.out.println("Wrong password. Try again.");
            }
        } else {
            System.out.println("This user doesn't exist.");
        }
    }
}
