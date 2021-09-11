package com.javastudy.chapter13.ex11;

public class ThreadEx11_1 extends Thread {
    ThreadEx11_1 (String name) {
        super(name);
    }

    public void run() {
        try {
            sleep(5* 1000);
        } catch (InterruptedException e ) {}
    }
}
