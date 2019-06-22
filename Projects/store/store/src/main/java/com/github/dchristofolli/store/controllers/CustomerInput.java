package com.github.dchristofolli.store.controllers;

public class CustomerInput {
    private String id;
    private String name;
    private String cpf;
    private String telephone_number;
    
    public CustomerInput(){}

    public CustomerInput(String id, String name, String cpf, String telephone_number) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.telephone_number = telephone_number;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelephone_number() {
        return telephone_number;
    }

    public void setTelephone_number(String telephone_number) {
        this.telephone_number = telephone_number;
    }
}
