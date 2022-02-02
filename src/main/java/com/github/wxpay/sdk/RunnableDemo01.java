package com.github.wxpay.sdk;

/**
 * @author huangbc
 */
public class RunnableDemo01 {

    public static void main(String args[]) {
        TestThread mt1 = new TestThread("线程A ");    // 实例化对象
        TestThread mt2 = new TestThread("线程B ");    // 实例化对象
        Thread t1 = new Thread(mt1);       // 实例化Thread类对象
        Thread t2 = new Thread(mt2);       // 实例化Thread类对象
        t1.start();    // 启动多线程
        t2.start();    // 启动多线程
        System.out.println("----------------------------------------------------------");
        MyThread thread = new MyThread("线程A");
        MyThread thread1 = new MyThread("线程B");
        thread.start();
        thread1.start();

    }


}
