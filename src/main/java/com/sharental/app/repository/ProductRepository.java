package com.sharental.app.repository;

import com.sharental.app.pojo.Product;
import com.sharental.app.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByUser(User user);
    List<Product> findTopByProductNameContaining(String query);
}
