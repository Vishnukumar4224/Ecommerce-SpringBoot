package com.vk.vkcart.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vk.vkcart.Repostitory.ProductRepository;
import com.vk.vkcart.models.product;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<product> getAllProducts(){
        return productRepository.findAll();
    }
}
