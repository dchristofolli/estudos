package com.github.dchristofolli.store.controllers;

public class ProductInput {
    private String id;
    private String description;
    private Double value;

    public ProductInput() {}

    public ProductInput(String id, String description, Double value) {
        this.id = id;
        this.description = description;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
