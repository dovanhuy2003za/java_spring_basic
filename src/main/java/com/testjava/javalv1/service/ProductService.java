package com.testjava.javalv1.service;

import com.testjava.javalv1.entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {


    ProductEntity createProduc(ProductEntity product);

    List<ProductEntity> findAllProducts();
}
