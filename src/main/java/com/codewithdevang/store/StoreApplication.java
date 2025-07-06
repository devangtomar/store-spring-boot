package com.codewithdevang.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        SpringApplication.run(StoreApplication.class, args);
        var orderPaypalService = new OrderService();
//        var orderPaypalService = new OrderService(new PayPalPaymentService());
//        var orderStripeService = new OrderService(new StripePaymentService());
        orderPaypalService.placeOrder();
    }
}
