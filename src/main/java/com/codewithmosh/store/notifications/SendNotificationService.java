package com.codewithmosh.store.notifications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//@Component
public class SendNotificationService {
    private final NotificationServiceInterface notificationService;

//    @Autowired
    public SendNotificationService(@Qualifier("sms") NotificationServiceInterface notificationService) {
        this.notificationService = notificationService;
    }

    public void setNotificationService(){
        notificationService.message("The Message has been sent");

    }

}
