package com.codewithmosh.store;

import com.codewithmosh.store.notifications.SendNotificationService;
import com.codewithmosh.store.dependencyInjection.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();

        var sendNotification = context.getBean(SendNotificationService.class);
        sendNotification.setNotificationService();

        var userService = context.getBean(UserService.class);
        userService.registerUser(new User("Abhishek", "imabhishek028@gmail.com", "12345678"));

    }

}
