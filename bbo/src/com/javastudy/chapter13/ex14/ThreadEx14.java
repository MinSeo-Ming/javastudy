package com.javastudy.chapter13.ex14;

import javax.swing.*;

public class ThreadEx14 {
    public static void main(String[] args) throws Exception {
        ThreadEx14_1 th1 = new ThreadEx14_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 잉ㅂ력하세요");
        System.out.println("입력하신 값은 " + input + "입니다");
        th1.interrupt();
        System.out.println("isInterrupted() : " + th1.isInterrupted());

    }
}
