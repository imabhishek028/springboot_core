package com.exercise.notifications.dependencyInjection;


import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


@Repository
public class InMemoryUser implements UserRespository {
   private final Map<String, User> users = new HashMap<>();

   @Override
    public void saveUser(User user) {
       System.out.println("Saving user: " + user);
       users.put(user.getEmail(), user);
   }

   @Override
    public User findByEmail(String email) {
       System.out.println("Finding user by email: " + email);
       return users.getOrDefault(email, null);
   }

}
