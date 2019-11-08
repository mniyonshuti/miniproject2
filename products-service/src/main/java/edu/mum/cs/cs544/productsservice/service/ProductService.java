package edu.mum.cs.cs544.productsservice.service;

import edu.mum.cs.cs544.productsservice.model.Product;
import edu.mum.cs.cs544.productsservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProductService implements CommandLineRunner {
    @Autowired
    ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product(1L, "IPhone 11", "Apple", "Electronics", 200,4));
        productRepository.save(new Product(2L, "Shoes", "Nike", "Clothing", 600, 5));
        productRepository.save(new Product(3L, "Shirts", "NB", "Clothing", 500, 8));
        productRepository.save(new Product(4L, "Mac", "Apple", "Electronics", 200, 3));
        productRepository.save(new Product(5L, "Books", "Niyo", "Stationary", 800,17));
        productRepository.save(new Product(6L, "pens", "Niyo", "Stationary", 600,14));
    }
}
