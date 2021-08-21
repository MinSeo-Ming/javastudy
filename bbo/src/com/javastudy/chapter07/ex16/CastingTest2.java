package com.javastudy.chapter07.ex16;

public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;
        // 이렇게 선언하면 에러남
        // Car car2 = new  FireEngine(); 으로 선언하면 에러 안남
        car.drive();
        fe = (FireEngine) car;
        car2 = fe;
        car2.drive();
    }
}
