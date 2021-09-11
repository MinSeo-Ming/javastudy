package com.javastudy.chapter13.ex20;



public class ThreadEx20_1 extends Thread{
    final static int MAX_MEMORY = 1000;
    int usedMemory = 0;

    public void run() {
        while(true) {
            try {
                Thread.sleep(10* 1000);
            } catch (InterruptedException e) {
                System.out.println("Awakend by interrupt () .");
            }

            gc();
            System.out.println("Garbage Collected . Free Mem : ");
        }
    }
    public void gc() {
        usedMemory -= 300;
        if(usedMemory < 0) usedMemory =0;
    }

    public int totalMemory() { return MAX_MEMORY; }
    public int freeMemory() { return MAX_MEMORY - usedMemory; }
}
