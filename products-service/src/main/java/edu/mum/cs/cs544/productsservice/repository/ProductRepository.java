package edu.mum.cs.cs544.productsservice.repository;

import edu.mum.cs.cs544.productsservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
