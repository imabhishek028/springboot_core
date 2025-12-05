package com.exercise.notifications;

//@Service("sms")
//@Primary
public class SMSMessageService implements NotificationServiceInterface {
    @Override
    public void message(String message) {
        System.out.println("SMS Message : " + message);
    }
}
