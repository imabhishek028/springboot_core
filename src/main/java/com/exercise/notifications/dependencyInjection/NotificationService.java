package com.exercise.notifications.dependencyInjection;

import org.springframework.stereotype.Service;

public interface NotificationService {
    void message (String message, String recipientEmail);
}
