package edu.mum.cs.cs544.catalogueservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.mum.cs.cs544.catalogueservice.CatalogueServiceApplication;
import edu.mum.cs.cs544.catalogueservice.model.Product;
import edu.mum.cs.cs544.catalogueservice.repository.CatalogueRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class CatalogueController {
    private String products;
    @Autowired
    CatalogueRepository catalogueRepository;

    private static final Logger log = LoggerFactory.getLogger(CatalogueServiceApplication.class);

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.build();
    }

    @Autowired
    RestTemplate restTemplate;
    ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping("/catalogue")
    public List<Product> products() throws JsonProcessingException {
        String jsonProducts = restTemplate.getForObject("http://localhost:8081/products", String.class);
        return objectMapper.readValue(jsonProducts, new TypeReference<List<Product>>() {});
    }
}
