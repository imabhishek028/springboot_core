package com.exercise.notifications.dependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public interface UserRespository {
     void saveUser(User user);
     User findByEmail(String email);
}
