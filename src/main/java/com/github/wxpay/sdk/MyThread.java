package com.github.wxpay.sdk;

/**
 * @author huangbc
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
