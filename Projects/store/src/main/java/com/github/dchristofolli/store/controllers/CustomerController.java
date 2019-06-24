package com.github.dchristofolli.store.controllers;

import com.github.dchristofolli.store.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/customers")
    public ResponseEntity<?> createCustomer(@RequestBody CustomerInput customerInput){
        customerService.createCustomer(customerInput);
        return null;
    }
}
