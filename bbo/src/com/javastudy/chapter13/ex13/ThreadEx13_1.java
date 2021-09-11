package com.javastudy.chapter13.ex13;

public class ThreadEx13_1 extends Thread {
    public  void run() {
        int i = 0;

        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);
            for(long x=0; x < 2500000000L ; x++) ;
        }
        System.out.println("카운트 종료하고 있음");
    }
}
