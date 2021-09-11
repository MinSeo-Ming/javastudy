package com.javastudy.chapter13.ex1;

public class ThEx1 {
    public static void main(String[] args) {
        ThEx1_1 t1 = new ThEx1_1();

        Runnable r = new ThEx1_2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}
