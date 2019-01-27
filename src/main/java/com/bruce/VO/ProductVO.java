package com.bruce.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author: Bruce
 * @Date: 2019/1/27 8:47
 * @Version 1.0
 */
@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer CategoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
