package com.testjava.javalv1.service.impl;

import com.testjava.javalv1.entity.ProductEntity;
import com.testjava.javalv1.respository.ProductRespository;
import com.testjava.javalv1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRespository productRespository;


    @Override
    public ProductEntity createProduc(ProductEntity product) {
        return productRespository.createProduc(product);
    }

    @Override
    public List<ProductEntity> findAllProducts() {
        return productRespository.findAllProducts();
    }
}
