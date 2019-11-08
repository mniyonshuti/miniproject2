package edu.mum.cs.cs544.orderservice.repository;

import edu.mum.cs.cs544.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
