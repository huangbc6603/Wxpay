package com.github.wxpay.sdk;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author huangbc
 * @version 1.0
 * @date 2021/12/12 8:12
 */
public class TestThread implements Runnable {
    private String name;

    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println(name + "运行，i = " + i);
        }
    }

    public TestThread(String name) {
        this.name = name;
    }
}
