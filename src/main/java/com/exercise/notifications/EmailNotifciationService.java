package com.exercise.notifications;

//@Service("email") This was first way annotation
//@Qualifier
public class EmailNotifciationService implements NotificationServiceInterface {
    @Override
    public void message (String message) {
        System.out.println("Email sent:" + message);
    }
}
