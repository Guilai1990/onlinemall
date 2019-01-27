package com.bruce.exception;

import com.bruce.enums.ResultEnum;
import lombok.Getter;

/**
 * @Author: Bruce
 * @Date: 2019/1/27 21:25
 * @Version 1.0
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
}
