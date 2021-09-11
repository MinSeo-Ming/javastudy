package com.javastudy.chapter13.ex25;




public class ThreadWaitEx3 {
    public static void main(String[] args) throws Exception {
       Table table2 = new Table();

        new Thread(new Cook(table2), "COOKI").start();
        new Thread(new Customer(table2, "donut"), "CUST1").start();
        new Thread(new Customer(table2, "burget"), "CUST2").start();
        Thread.sleep(100);
        System.exit(0);
    }
}
