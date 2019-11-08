package edu.mum.cs.cs544.paypalservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayPalController {
    @GetMapping("/paypal")
    public  String processPayment(){
        return "Paypal payment successful";
    }
}
