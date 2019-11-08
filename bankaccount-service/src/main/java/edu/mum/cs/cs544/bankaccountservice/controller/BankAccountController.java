package edu.mum.cs.cs544.bankaccountservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankAccountController {
    @GetMapping("/bankaccount")
    public  String processPayment(){
        return "Bank account payment successful";
    }
}
