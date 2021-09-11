package com.javastudy.chapter13.ex3;

public class ThreadEx3_1 extends Thread {
    public void run() {
        throwException();
    }

    private void throwException() {
        try {
            throw  new Exception();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
