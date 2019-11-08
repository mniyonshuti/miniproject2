package edu.mum.cs.cs544.paymentservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PaymentController {
    private String payPalReply;
    private String creditCardReply;
    private String accountReply;
    private static final Logger log = LoggerFactory.getLogger(PaymentController.class);

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.build();
    }

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/payment/{paymentType}")
    public  String processPayment(@PathVariable("paymentType") String paymentType){
        if(paymentType.equals("PayPal")){
            String reply = restTemplate.getForObject("http://localhost:8088/paypal", String.class);
            log.info(reply);
            return restTemplate.getForObject("http://localhost:8089/shipping", String.class);
        }
        else if(paymentType.equals("CreditCard")){
            String reply = restTemplate.getForObject("http://localhost:8087/creditcard", String.class);
            log.info(reply);
            return restTemplate.getForObject("http://localhost:8089/shipping", String.class);
        }
        else if(paymentType.equals("BankAccount")){
            String reply = restTemplate.getForObject("http://localhost:8086/bankaccount", String.class);
            log.info(reply);
            return restTemplate.getForObject("http://localhost:8089/shipping", String.class);
        }
        else{
            return "Order Has been rejected";
        }
    }

}
