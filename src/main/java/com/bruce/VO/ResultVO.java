package com.bruce.VO;

import lombok.Data;

/**
 * @Author: Bruce
 * @Date: 2019/1/27 8:39
 * @Version 1.0
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}
