package edu.mum.cs.cs544.orderservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.mum.cs.cs544.orderservice.model.Order;
import edu.mum.cs.cs544.orderservice.model.Product;
import edu.mum.cs.cs544.orderservice.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class OrderController {
    private String paymentType;
    private boolean paymentStatus;
    private List<Product> productList;
    private String jsonProducts;
    ObjectMapper objectMapper = new ObjectMapper();
    private static final Logger log = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    OrderRepository orderRepository;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.build();
    }

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/placeorder/{order}")
    public String placeOrder(@PathVariable("order") Order order) throws JsonProcessingException {

        jsonProducts = restTemplate.getForObject("http://localhost:8081/products", String.class);
        productList = objectMapper.readValue(jsonProducts, new TypeReference<List<Product>>() {});


        //Checking if the Items are available
        boolean itemsAvailableFlag = true;


        //checking if payment has been successful
        if (paymentStatus) {
            return "Order Successful order forwarded for shipping";
        }

        //Calling the shipping services


        return "Order not successful";
    }


    //Discovering the payment service
    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            paymentStatus = restTemplate.getForObject("http://localhost:8084/payment/paymentType=" + paymentType, Boolean.class);
        };
    }




}
