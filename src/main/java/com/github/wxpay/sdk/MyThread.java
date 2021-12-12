package com.github.wxpay.sdk;

/**
 * @author huangbc
 * @version 1.0
 * @date 2021/12/12 8:31
 */
public class MyThread extends Thread{

    private String name;

    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println(name + "运行，i = " + i) ;
        }
    }

    public MyThread(String name) {
        this.name = name;
    }
}
