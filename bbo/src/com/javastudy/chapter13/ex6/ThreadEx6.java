package com.javastudy.chapter13.ex6;

import javax.swing.*;

public class ThreadEx6 {
    public static void main(String[] args) throws InterruptedException {
        String input = JOptionPane.showInputDialog("아무거나 입력");
        System.out.println("입력하신 값은 " + input + "입니다");

        for(int i =10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}
