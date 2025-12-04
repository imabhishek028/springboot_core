package com.codewithmosh.store.notifications;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service("email") This was first way annotation
//@Qualifier
public class EmailNotifciationService implements NotificationServiceInterface {
    @Override
    public void message (String message) {
        System.out.println("Email sent:" + message);
    }
}
