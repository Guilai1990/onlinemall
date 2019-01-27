package com.bruce.repository;

import com.bruce.dataobject.OrderDetail;
import org.hibernate.criterion.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: Bruce
 * @Date: 2019/1/27 20:43
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("1234567778");
        orderDetail.setOrderId("122200111");
        orderDetail.setProductIcon("http://xxx.jpg");
        orderDetail.setProductId("1222211");
        orderDetail.setProductName("Chicken McNuggets");
        orderDetail.setProductPrice(new BigDecimal(19.99));
        orderDetail.setProductQuantity(2);

        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetailList = repository.findByOrderId("122200111");
        Assert.assertNotEquals(0, orderDetailList.size());

    }
}