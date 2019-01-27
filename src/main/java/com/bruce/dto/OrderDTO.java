package com.bruce.dto;

import com.bruce.dataobject.OrderDetail;
import com.bruce.enums.OrderStatusEnum;
import com.bruce.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author: Bruce
 * @Date: 2019/1/27 21:07
 * @Version 1.0
 */
@Data
public class OrderDTO {

    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    private Integer orderStatus;

    private Integer payStatus;

    private Date createTime;

    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
