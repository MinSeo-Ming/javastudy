package com.javastudy.chapter13.ex23;

public class ThreadWaitEx1 {
    public static void main(String[] args) throws Exception {
        Table table = new Table();

        new Thread(new Cook(table), "COOKI").start();
        new Thread(new Customer(table, "donut"), "CUST1").start();
        new Thread(new Customer(table, "burget"), "CUST2").start();
        Thread.sleep(100);
        System.exit(0);
    }
}
