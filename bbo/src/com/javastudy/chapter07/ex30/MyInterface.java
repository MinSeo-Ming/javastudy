package com.javastudy.chapter07.ex30;

 interface MyInterface {
    default void method1() {
        System.out.println("method1() in MyInterface");
    }
     default void method2() {
         System.out.println("method2() in MyInterface");
     }
     static void staticmethod() {
         System.out.println("staticmethod() in MyInterface");
     }
}
