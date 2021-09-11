package com.javastudy.chapter13.ex1;

public class ThEx1_2 implements Runnable{
    public void run() {
        for(int i =0; i< 5; i++ ){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
