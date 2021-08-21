package com.javastudy.chapter07.ex30;

interface MyInterface2 {
    default void method1() {
        System.out.println("method1() in My Interface2");
    }
    static void staticmethod() {
        System.out.println("staticmethod() in MyInterface2");
    }
}
