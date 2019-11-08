package edu.mum.cs.cs544.creditcard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditCardController {
    @GetMapping("/creditcard")
    public  String processPayment(){
        return "Credit card payment successful";
    }
}
