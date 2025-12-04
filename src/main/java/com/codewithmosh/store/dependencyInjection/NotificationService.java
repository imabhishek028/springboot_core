package com.codewithmosh.store.dependencyInjection;

import org.springframework.stereotype.Service;

public interface NotificationService {
    void message (String message, String recipientEmail);
}
