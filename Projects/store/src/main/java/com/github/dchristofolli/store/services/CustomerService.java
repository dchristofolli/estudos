package com.github.dchristofolli.store.services;

import com.github.dchristofolli.store.controllers.CustomerInput;
import com.github.dchristofolli.store.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public void createCustomer(CustomerInput customerInput){
        customerRepository.createCustomer(customerInput);
    }
}
