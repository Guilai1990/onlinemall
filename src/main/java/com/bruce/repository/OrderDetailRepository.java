package com.bruce.repository;

import com.bruce.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: Bruce
 * @Date: 2019/1/27 20:18
 * @Version 1.0
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrderId(String orderId);
}
