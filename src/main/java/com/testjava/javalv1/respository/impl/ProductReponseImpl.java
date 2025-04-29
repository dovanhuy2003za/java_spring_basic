package com.testjava.javalv1.respository.impl;

import com.testjava.javalv1.entity.ProductEntity;
import com.testjava.javalv1.respository.ProductRespository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
@Repository
public class ProductReponseImpl implements ProductRespository {

    @Override
    public ProductEntity createProduc(ProductEntity product) {
        ProductEntity productEntity=new ProductEntity();
        productEntity.setId(1L);
        productEntity.setProductName("dovanhuy");
        productEntity.setProductPrice(new BigDecimal(21.6));
        return productEntity;
    }

    @Override
    public List<ProductEntity> findAllProducts() {
        ProductEntity productEntity=new ProductEntity();
        productEntity.setId(1L);
        productEntity.setProductName("dovanhuy");
        productEntity.setProductPrice(new BigDecimal(21.6));
        return List.of(productEntity);
    }
}
