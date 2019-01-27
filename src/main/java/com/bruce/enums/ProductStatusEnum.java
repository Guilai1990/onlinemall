package com.bruce.enums;

import lombok.Getter;

/**
 * @Author: Bruce
 * @Date: 2019/1/26 23:21
 * @Version 1.0
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "on sale"),
    DOWN(1, "off shelves")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
