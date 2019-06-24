package com.github.dchristofolli.store.controllers;

import com.github.dchristofolli.store.repositories.ProductRepository;
import com.github.dchristofolli.store.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;
import java.util.List;

@RequestMapping("/")
@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<ProductInput>> listProduct(){
        return (ResponseEntity<List<ProductInput>>) ResponseEntity.status(HttpStatus.OK);
    }

    @PostMapping("/products")
    public ResponseEntity<?> createProduct(@RequestBody ProductInput productInput) {
        productService.createProduct(productInput);
        return null;
    }
}
