package com.javastudy.chapter13.ex15;

public class ThreadEx15 {
    public static void main(String[] args) {
        RunImplEx15 r = new RunImplEx15();
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
