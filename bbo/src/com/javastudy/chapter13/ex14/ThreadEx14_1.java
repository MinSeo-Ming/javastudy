package com.javastudy.chapter13.ex14;

public class ThreadEx14_1 extends Thread{
    public void run() {
        int i = 0;
        while(i!=0 && !isInterrupted()) {
            System.out.println(i--);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }

        System.out.println("카운트가 종료");
    }
}
