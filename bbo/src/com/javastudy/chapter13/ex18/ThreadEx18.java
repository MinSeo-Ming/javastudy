package com.javastudy.chapter13.ex18;

import com.javastudy.chapter13.ex17.ThreadEx17_1;

public class ThreadEx18 {
    public static void main(String[] args) {
        ThreadEx18_1 th1 = new ThreadEx18_1( "*");
        ThreadEx18_1 th2 = new ThreadEx18_1( "**");
        ThreadEx18_1 th3 = new ThreadEx18_1( "***");

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
