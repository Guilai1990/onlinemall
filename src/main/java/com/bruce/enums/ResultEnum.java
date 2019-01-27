package com.bruce.enums;

import lombok.Getter;

/**
 * @Author: Bruce
 * @Date: 2019/1/27 21:31
 * @Version 1.0
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10, "product not exist"),
    PRODUCT_STOCK_ERROR(11, "stock quantity is not correct"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
