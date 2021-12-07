package com.dipper.apibookingflight.domain.availableClass.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Available_Class")
public class AvailableClass {

    @Id
    private String id;

    private String name;
    private Integer capacity;
    private Double price;
    private String description;

    public AvailableClass() {
    }

    public AvailableClass(String id, String name, Integer capacity, Double price, String description) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.price = price;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
