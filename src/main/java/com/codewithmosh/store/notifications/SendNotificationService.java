package com.codewithmosh.store.notifications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SendNotificationService {
    private final NotificationServiceInterface notificationService;

    @Autowired
    public SendNotificationService(@Qualifier("email") NotificationServiceInterface notificationService) {
        this.notificationService = notificationService;
    }

    public void setNotificationService(){
        notificationService.message("The Message has been sent");

    }

}
