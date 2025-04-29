package com.testjava.javalv1.respository;

import com.testjava.javalv1.entity.ProductEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRespository {

    ProductEntity createProduc(ProductEntity product);

    List<ProductEntity> findAllProducts();
}
