package com.exercise.notifications;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("paypal")
@Primary
public class PayPalPaymentService implements PaymentService {
    @Override
    public void processPayment(Double paymentAmount) {
        System.out.println("PayPal payment");
        System.out.println("Payment amount: " + paymentAmount);
    }
}
