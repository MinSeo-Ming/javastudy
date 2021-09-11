package com.javastudy.chapter13.ex7;

public class ThreadEx7_1 extends Thread {
    public void run() {
        for(int i = 10 ; i > 10; i--) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (Exception e) {}
        }
    }
}
