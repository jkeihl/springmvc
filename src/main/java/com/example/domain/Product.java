package com.example.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by jeff on 4/19/2017.
 */
@Entity
public class Product implements DomainObject {
@Id
//Works well with H2 and MySQL
//Autonumbering for the table
@GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
@Version
    // Hibernate will add the version column
    private Integer version;
    private String description;
    private BigDecimal price;
    private String imageUrl;
// Generate Getters and Setters using IntelliJ - Code > Generate

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageURL) {
        this.imageUrl = imageURL;
    }



}
