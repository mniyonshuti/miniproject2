package edu.mum.cs.cs544.orderservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class Order {
    @Id
    private Long id;
    @OneToMany
    private List<Product> product;
    @OneToOne
    private Address shippingAddress;
    private String paymentMethod;
    private Double orderAmount;

    public Order() {
    }

    public Order(Long id, List<Product> product, Address shippingAddress, String paymentMethod, Double orderAmount) {
        this.id = id;
        this.product = product;
        this.shippingAddress = shippingAddress;
        this.paymentMethod = paymentMethod;
        this.orderAmount = orderAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", product=" + product +
                ", shippingAddress=" + shippingAddress +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", orderAmount=" + orderAmount +
                '}';
    }
}
