package com.bruce.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Author: Bruce
 * @Date: 2019/1/26 17:43
 * @Version 1.0
 */
@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productDescription;

    private String productIcon;

    // 0 means normal, 1 means off the shelf
    private Integer productStatus;

    private Integer categoryType;


}
