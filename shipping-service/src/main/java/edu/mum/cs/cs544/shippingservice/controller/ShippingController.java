package edu.mum.cs.cs544.shippingservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingController {

    @GetMapping("/shipping")
    public String processPayment() {
        return "Order has been shipped";
    }
}
