package com.testjava.javalv1.dto.request.product;

import lombok.Data;

@Data
public class ProductCreateRequest {

    private  String productName;
    private  String productPrice;
}
