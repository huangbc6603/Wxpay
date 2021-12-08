package com.github.wxpay.sdk;

import java.math.BigDecimal;

/**
 * @author huangbc
 * @version 1.0
 * @date 2021/12/7 18:54
 */
public class Test {

    public static void main(String[] args) {

        System.out.println(0.3 - 0.1);
        System.out.println(0.2 + 0.1);
        System.out.println(0.2 * 0.1);
        System.out.println(0.3 / 0.1);
        System.out.println(new BigDecimal("0.3").multiply(new BigDecimal("0.1")));//乘法
        System.out.println(new BigDecimal("0.3").max(new BigDecimal("0.1")));//
        System.out.println(new BigDecimal("0.3").min(new BigDecimal("0.1")));
        System.out.println(new BigDecimal("0.3").add(new BigDecimal("0.1")));//加法
        System.out.println(new BigDecimal("0.3").divide(new BigDecimal("0.1")));//除法
        System.out.println(new BigDecimal("0.3").subtract(new BigDecimal(10)));//减法。。


    }

}
