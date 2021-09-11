package com.javastudy.chapter13.ex12;

public class ThreadEx12_1 extends Thread{
    public void run() {
        for(int i = 0; i < 300; i++) {
            System.out.print("-");
        }
        System.out.print("<<th1 종료>>");
    }
}
