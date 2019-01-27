package com.bruce.enums;

import lombok.Getter;

/**
 * @Author: Bruce
 * @Date: 2019/1/27 20:01
 * @Version 1.0
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "new order"),
    FINISHED(1, "order completed"),
    CANCEL(2, "order cancelled"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
