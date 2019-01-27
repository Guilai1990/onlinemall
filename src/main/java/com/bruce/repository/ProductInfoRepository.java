package com.bruce.repository;

import com.bruce.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: Bruce
 * @Date: 2019/1/26 17:49
 * @Version 1.0
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);


}
