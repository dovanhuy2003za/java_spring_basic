package com.testjava.javalv1.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductEntity {

    private Long id;
    private String productName;
    private BigDecimal productPrice;


}
