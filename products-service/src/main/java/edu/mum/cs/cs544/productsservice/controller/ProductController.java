package edu.mum.cs.cs544.productsservice.controller;

import edu.mum.cs.cs544.productsservice.model.Product;
import edu.mum.cs.cs544.productsservice.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(Product.class);

    @GetMapping("/products")
    public List<Product> findAll() {
        LOGGER.info("Finding Products");
        return productRepository.findAll();
    }
}
