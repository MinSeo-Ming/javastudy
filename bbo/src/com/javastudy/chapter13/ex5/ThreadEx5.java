package com.javastudy.chapter13.ex5;

public class ThreadEx5 {
    static long startTime = 0;

    public static void main(String[] args) {
        ThreadEx5_1 th1 = new ThreadEx5_1();
        th1.start();

        for(int i =0; i < 300; i++) {
            System.out.printf("%s", new String("-"));
        }

        System.out.println("소요시간 1: " + (System.currentTimeMillis() - ThreadEx5.startTime));

    }
}
