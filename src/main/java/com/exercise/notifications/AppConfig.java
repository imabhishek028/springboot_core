package com.exercise.notifications;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${notification.serviceName}")
   private String notifcationService;

    @Bean
    public  EmailNotifciationService email(){
        return new EmailNotifciationService();
    }

    @Bean
    public SMSMessageService sms(){
        return new SMSMessageService();
    }

    @Bean
    public SendNotificationService sendNotification(){
        if(notifcationService.equals("email")){
            return new SendNotificationService(email());
        } else return new SendNotificationService(sms());
    }

}
