package com.vk.vkcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vk.vkcart.Service.ProductService;
import com.vk.vkcart.models.product;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;
    
    @GetMapping
    public List<product> getAllProduct() {
        return productService.getAllProducts();
    }

    // @GetMapping("/category")
    // public List<Map<String, Object>> getcategoryProduct() {
    //     return Arrays.asList(Map.of("Name", "Product 1", "Price", 234),
    //     Map.of("Name", "Product 1", "Price", 156)
    //     );
    // }
    
}
