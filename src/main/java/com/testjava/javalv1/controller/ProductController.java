package com.testjava.javalv1.controller;

import com.testjava.javalv1.entity.ProductEntity;
import com.testjava.javalv1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/add")
    public ProductEntity createProduct(ProductEntity productEntity){
        return productService.createProduc(productEntity);
    }

    @GetMapping("/products")
    public List<ProductEntity> getAllProduct(){
        return productService.findAllProducts();
    }
}
