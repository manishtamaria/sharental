package com.sharental.app.controller;

import com.sharental.app.pojo.Image;
import com.sharental.app.pojo.Product;
import com.sharental.app.pojo.User;
import com.sharental.app.repository.ProductRepository;
import com.sharental.app.repository.UserRepository;
import com.sharental.app.service.ImageUploadService;
import com.sharental.app.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductApiController {
    private final ProductService productService;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;
    private final ImageUploadService imageUploadService;

    @PostMapping("/api/product/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody Product product, Integer id){
        productService.addProduct(product,id);
    }
    @GetMapping("/api/user/{id}/products")
    public List<Product> getAllProductsByUser(@PathVariable Integer id) {
        User user =userRepository.getOne(id);
        return productRepository.findByUser(user);
    }

    @RequestMapping(value = "/api/image/upload", method = RequestMethod.POST)
    @ResponseBody
    public String appointmentFileUpload(@RequestParam MultipartFile file) {
        Image image = imageUploadService.uploadImage(file);
        return image.getImageUrl();

    }

}
