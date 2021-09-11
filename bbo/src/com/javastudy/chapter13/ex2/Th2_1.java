package com.javastudy.chapter13.ex2;

public class Th2_1 extends Thread {
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
