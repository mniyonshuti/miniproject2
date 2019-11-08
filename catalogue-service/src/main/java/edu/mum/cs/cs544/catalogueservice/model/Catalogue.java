package edu.mum.cs.cs544.catalogueservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Catalogue {
    @Id
    private Long id;

    @OneToMany
    private List<Product> productList;

    public Catalogue() {
    }

    public Catalogue(Long id, List<Product> productList) {
        this.id = id;
        this.productList = productList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Catalogue{" +
                "id=" + id +
                ", productList=" + productList +
                '}';
    }
}
