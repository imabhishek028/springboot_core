package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("stripe")
@Qualifier
public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(Double paymentAmount) {
        System.out.println("Stripe payment");
        System.out.println("Payment amount: " + paymentAmount);
    }

}
