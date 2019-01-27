package com.bruce.dto;

import lombok.Data;

/**
 * @Author: Bruce
 * @Date: 2019/1/27 21:59
 * @Version 1.0
 */
@Data
public class CartDTO {

    private String productId;

    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
