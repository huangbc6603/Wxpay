package com.github.wxpay.sdk;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *@author  huangbc
 */
public class ConcurrentHashMapTest {

    public static void main(String[] args) {

        //获取当前日期 年月日
        LocalDate today = LocalDate.now();
        System.out.println(today);

        //时分秒
        System.out.println(LocalTime.now());

        //年月日 时分秒
        System.out.println(LocalDateTime.now());

    }

}
