package com.exercise.notifications.dependencyInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EmailService implements NotificationService{
    @Value("${mail.host}")
    private String host;

    @Value("${mail.port}")
    private int port;

    @Override
    public void message (String message, String recipientEmail) {
        System.out.println("Email sent:" + message + " to " + recipientEmail);
        System.out.println(host + ":" + port);
    }

}
