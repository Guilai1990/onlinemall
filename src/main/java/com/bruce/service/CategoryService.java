package com.bruce.service;

import com.bruce.dataobject.ProductCategory;

import java.util.List;

/**
 * @Author: Bruce
 * @Date: 2019/1/26 17:23
 * @Version 1.0
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
