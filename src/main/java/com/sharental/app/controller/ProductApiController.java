package com.sharental.app.controller;

import com.sharental.app.pojo.Product;
import com.sharental.app.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ProductApiController {
    private final ProductService productService;

    @PostMapping("/api/product/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody Product product, Integer id){
        productService.addProduct(product,id);
    }
}
