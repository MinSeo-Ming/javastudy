package com.javastudy.chapter13.ex11;

import com.javastudy.chapter13.ex10.ThreadEx10;

public class ThreadEx11 {
    public static void main(String[] args) {
        ThreadEx11_1 t1 = new ThreadEx11_1("Thread1");
        ThreadEx11_2 t2 = new ThreadEx11_2("Thread2");

        t1.start();
        t2.start();
    }
}
