package edu.mum.cs.cs544.productsservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    private Long id;
    private String name;
    private String vendor;
    private String category;
    private Integer quantityAvailable;

    public Product() {
    }

    public Product(Long id, String name, String vendor, String category, Integer quantityAvailable) {
        this.id = id;
        this.name = name;
        this.vendor = vendor;
        this.category = category;
        this.quantityAvailable = quantityAvailable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(Integer quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vendor='" + vendor + '\'' +
                ", category='" + category + '\'' +
                ", quantityAvailable=" + quantityAvailable +
                '}';
    }
}
