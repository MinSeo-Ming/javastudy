package com.javastudy.chpater08.ex14;

public class ExceptionEx14 {
    public static void main(String[] args) {
        try {
            method1();
        } catch ( Exception e ) {
            System.out.println("Main 메서드에서 예외가 처리 되었습니다.");
            e.printStackTrace();
        }
    }
    static void method1() throws Exception {
        throw new Exception();
    }
}
