package com.github.dchristofolli.store.services;

import com.github.dchristofolli.store.controllers.ProductInput;
import com.github.dchristofolli.store.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public void createProduct(ProductInput productInput) {
//        validacao();
//        transformacao();
//        ..
//        ..
        productRepository.createProduct(productInput);
    }
}
