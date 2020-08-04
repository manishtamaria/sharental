package com.sharental.app.service;

import com.sharental.app.pojo.Product;
import com.sharental.app.repository.ProductRepository;
import com.sharental.app.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor

public class ProductService {
    private final ProductRepository productRepository;
    private final UserRepository userRepository;

    public void addProduct(Product product,Integer userId) {
        product.setCreatedAt(LocalDateTime.now());
        product.setUser(userRepository.getOne(userId));
        productRepository.save(product);
    }
}
