package com.javastudy.chapter13.ex17;

import com.javastudy.chapter13.ex16.RunImplEx16;

public class ThreadEx17 {
    public static void main(String[] args) {
        ThreadEx17_1 th1 = new ThreadEx17_1( "*");
        ThreadEx17_1 th2 = new ThreadEx17_1( "**");
        ThreadEx17_1 th3 = new ThreadEx17_1( "***");

        th1.start();
        th2.start();
        th3.start();

        try {
            Thread.sleep(2000);
            th1.suspend();
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(3000);
            th1.suspend();
            th1.stop();
            th2.stop();
            Thread.sleep(2000);
            th3.suspend();

        } catch (InterruptedException e ) {}

    }
}
