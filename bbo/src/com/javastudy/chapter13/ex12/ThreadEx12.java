package com.javastudy.chapter13.ex12;

public class ThreadEx12 {
    public static void main(String[] args) {
        ThreadEx12_1 th1 = new ThreadEx12_1();
        ThreadEx12_2 th2 = new ThreadEx12_2();

        th1.start();
        th2.start();

        try {
            th1.sleep(2000);

        } catch (InterruptedException e) {}
        System.out.println("<< main 종료 >>");

    }
}
