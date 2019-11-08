package edu.mum.cs.cs544.orderservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductOrder {
    @Id
    private Long id;
    private Product product;
    private int numberOfItemsOrdered;

    public ProductOrder() {
    }

    public ProductOrder(Long id, Product product, int numberOfItemsOrdered) {
        this.id = id;
        this.product = product;
        this.numberOfItemsOrdered = numberOfItemsOrdered;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getNumberOfItemsOrdered() {
        return numberOfItemsOrdered;
    }

    public void setNumberOfItemsOrdered(int numberOfItemsOrdered) {
        this.numberOfItemsOrdered = numberOfItemsOrdered;
    }

    @Override
    public String toString() {
        return "ProductOrder{" +
                "id=" + id +
                ", product=" + product +
                ", numberOfItemsOrdered=" + numberOfItemsOrdered +
                '}';
    }
}
