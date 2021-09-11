package com.javastudy.chapter13.ex13;

import javax.swing.*;

public class ThreadEx13 {
    public static void main(String[] args) throws Exception {
        ThreadEx13_1 th1 = new ThreadEx13_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하시오");
        System.out.println("입력하신 값을 : " + input + "입니다");
        th1.interrupt();
        System.out.println("isInterrupted() : " + th1.isInterrupted()) ;

    }
}
