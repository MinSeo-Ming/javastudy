package com.javastudy.chapter08.ex02;

public class ExceptionEx2 {
    public static void main(String[] args) {
        int num = 100;
        int res = 0;

        for(int i =0 ; i < 10; i++){
            res = num / (int) (Math.random() *10);
            // 0을 나누는 에
            System.out.println(res);
        }

    }
}
