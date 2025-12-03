package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
   private PaymentService paymentService;


   @Autowired // we need to add this annotation if more constructors
    public OrderService(@Qualifier("stripe") PaymentService paymentService) {
    this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(10.00);
    }
}
