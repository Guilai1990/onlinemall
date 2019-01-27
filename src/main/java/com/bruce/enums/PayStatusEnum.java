package com.bruce.enums;

import lombok.Getter;

/**
 * @Author: Bruce
 * @Date: 2019/1/27 20:03
 * @Version 1.0
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "waiting to pay"),
    SUCCESS(1, "paid successfully"),

    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
