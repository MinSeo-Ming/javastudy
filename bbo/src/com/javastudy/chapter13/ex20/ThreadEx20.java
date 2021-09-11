package com.javastudy.chapter13.ex20;

public class ThreadEx20 {
    public static void main(String[] args) {
        ThreadEx20_1 gc = new ThreadEx20_1();
        gc.setDaemon(true);
        gc.start();

        int requiredMemory = 0;

        for(int i = 0; i < 20; i++) {
            requiredMemory = (int) (Math.random()* 10) * 20;
            if(gc.freeMemory() < requiredMemory
            || gc.freeMemory() < gc.totalMemory() * 0.4) {
                gc.interrupt();
            }

            gc.usedMemory += requiredMemory;
            System.out.println("usedMemory : " + gc.usedMemory);
        }
    }
}
