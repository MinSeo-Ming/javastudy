package com.javastudy.chapter13.ex16;

import com.javastudy.chapter13.ex15.RunImplEx15;

public class ThreadEx16 {
    public static void main(String[] args) {
        RunImplEx16 r = new RunImplEx16();
        Thread th1 = new Thread(r, "*");
        Thread th2 = new Thread(r, "**");
        Thread th3 = new Thread(r, "***");

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
