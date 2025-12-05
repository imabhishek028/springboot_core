package com.exercise.notifications;

import org.springframework.beans.factory.annotation.Qualifier;

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
