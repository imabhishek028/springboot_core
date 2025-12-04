package com.codewithmosh.store;

import com.codewithmosh.store.dependencyInjection.NotificationService;
import com.codewithmosh.store.dependencyInjection.User;
import com.codewithmosh.store.dependencyInjection.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
   private final NotificationService notificationService;
   private  final UserRespository userRespository;

   @Autowired
   public UserService(NotificationService notificationService, UserRespository userRespository) {
       this.notificationService = notificationService;
       this.userRespository = userRespository;
   }

   public void registerUser(User user) {
       if(userRespository.findByEmail(user.getEmail())!=null) {
           System.out.println("Email already in use:" + user.getEmail());
           return;
       } else {
           userRespository.saveUser(user);
           System.out.println("User saved:" + user.getEmail());
           notificationService.message("Email hai bhai", user.getEmail());
       }
   }

}
