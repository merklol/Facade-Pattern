package com.bilingoal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AppDatabase implements Database {
    private List<User> users = new ArrayList<>();

    public AppDatabase(String fileName) {
        try(Stream<String> stream = Files.lines(Paths.get(fileName))){
            stream.forEach(user -> {
                String[] res = user.split(":");
                users.add(res[2].equals("administrator") ? new Administrator(res[0], res[1], res[2])
                        : new DefaultUser(res[0], res[1], res[2]));
            });
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public User search(String userName) {
        return users.stream()
                .filter(user -> user.getUserName().equals(userName))
                .findAny()
                .orElse(null);
    }
}
