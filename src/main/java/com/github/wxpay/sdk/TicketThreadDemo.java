package com.github.wxpay.sdk;

import sun.dc.pr.PRError;

/**
 * @author huangbc
 * @version 1.0
 * @date 2021/12/12 9:23
 */
public class TicketThreadDemo implements Runnable {

    public TicketThreadDemo(int ticket) {
        this.ticket = ticket;
    }

    private int ticket;
    private String name;

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TicketThreadDemo(int ticket, String name) {
        this.ticket = ticket;
        this.name = name;
    }

    public void run() {

        for (int i = 0; i < 1000; i++) {

            synchronized (this) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"卖票：ticket = " + ticket--);
                }else {
                    System.out.println("票卖完了");
                    System.exit(0);
                }
            }

        }
    }

    public static void main(String[] args) {
        TicketThreadDemo ticketThreadDemo = new TicketThreadDemo(1000);
        Thread thread1 = new Thread(ticketThreadDemo,"窗口一");
        thread1.start();

        Thread thread2 = new Thread(ticketThreadDemo,"窗口二");
        thread2.start();

        Thread thread3 = new Thread(ticketThreadDemo,"窗口三");
        thread3.start();

    }

}
