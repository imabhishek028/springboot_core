package com.codewithmosh.store;

import com.codewithmosh.store.exercise_entities_mapping.Categories;
import com.codewithmosh.store.exercise_entities_mapping.Product;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

//        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//        var orderService = context.getBean(OrderService.class);
//        orderService.placeOrder();
//
//        var sendNotification = context.getBean(SendNotificationService.class);
//        sendNotification.setNotificationService();
//
//        var userService = context.getBean(UserService.class);
//        userService.registerUser(new User("Abhishek", "imabhishek028@gmail.com", "12345678"));


//          var address= Address.builder()
//                  .street("123 Main St")
//                  .city("Main St")
//                  .state("Main St")
//                  .zip("12345")
//                  .build();
//
//          var user = User.builder()
//                  .id(122)
//                  .email("imabhishek028@gmail.com")
//                  .name("Abhi")
//                  .password("password")
//                  .build();
//
//          var tag= new Tags("tag");
//          var profile = new Profile("abhishek");
//
//         user.addTag(tag);
//          user.addAddress(address);
//          user.setProfile(profile);
//          profile.setUser(user);
//          System.out.println(user);

           var product = new Product(1, "khel", new BigDecimal("12.90"));
           var category= new Categories("sports");

           // this can be encapsulated in category or products
           product.setCategory(category);
           category.getProducts().add(product);

            System.out.println(product.getCategory());

    }

}
