package com.bruce.service;

import com.bruce.dataobject.OrderDetail;
import com.bruce.dto.OrderDTO;
import com.bruce.enums.OrderStatusEnum;
import com.bruce.service.Impl.OrderServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: Bruce
 * @Date: 2019/1/27 23:06
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceTest {

    @Autowired
    private OrderServiceImpl orderService;

    private final String BUYER_OPENID = "112221";

    @Test
    public void create() {

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("hulk");
        orderDTO.setBuyerAddress("Tianhe District");
        orderDTO.setBuyerPhone("18900991234");
        orderDTO.setBuyerOpenid(BUYER_OPENID);

        List<OrderDetail> orderDetailList = new ArrayList<>();

        OrderDetail orderDetail1 = new OrderDetail();
        orderDetail1.setProductId("123457");
        orderDetail1.setProductQuantity(2);
        orderDetailList.add(orderDetail1);

        OrderDetail orderDetail2 = new OrderDetail();
        orderDetail2.setProductId("123458");
        orderDetail2.setProductQuantity(3);

        orderDetailList.add(orderDetail1);
        orderDetailList.add(orderDetail2);

        orderDTO.setOrderDetailList(orderDetailList);

        OrderDTO result = orderService.create(orderDTO);
        log.info("create order result={}", result);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOne() {


    }

    @Test
    public void findList() {
    }

    @Test
    public void cancel() {
    }

    @Test
    public void finish() {
    }

    @Test
    public void paid() {
    }
}