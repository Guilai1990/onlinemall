package com.bruce.utils;

import java.util.Random;

/**
 * @Author: Bruce
 * @Date: 2019/1/27 21:43
 * @Version 1.0
 */
public class KeyUtil {

    public static synchronized String genUniqueKey() {

        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return  System.currentTimeMillis() + String.valueOf(number);
    }
}
