package com.bilingoal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("LOG IN");
        System.out.print("Username: ");
        String userName = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        Authenticator authenticator = new Authenticator();
        authenticator.authenticate(userName, password);
    }
}
