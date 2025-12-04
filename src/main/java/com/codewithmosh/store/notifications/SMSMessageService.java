package com.codewithmosh.store.notifications;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Service("sms")
//@Primary
public class SMSMessageService implements NotificationServiceInterface {
    @Override
    public void message(String message) {
        System.out.println("SMS Message : " + message);
    }
}
