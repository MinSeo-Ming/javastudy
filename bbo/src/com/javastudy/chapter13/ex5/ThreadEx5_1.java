package com.javastudy.chapter13.ex5;

public class ThreadEx5_1  extends Thread{
    public void run() {
        for(int i =0; i < 300; i++) {
            System.out.printf("%s", new String("|"));
        }

        System.out.println("소요시간 1: " + (System.currentTimeMillis() - ThreadEx5.startTime));

    }
}
