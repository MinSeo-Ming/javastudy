package com.javastudy.chapter12.ex2;

public class FruitBoxEx2 {
    public static void main(String[] args) {

        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
        //      FruitBox<Grape> grapeBox = new FruitBox<Apple>(); 에러 타입 불일치
        //      FruitBox<Toy> toyBox = new FruitBox<Toy>(); 에러 타입 불일치

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        // 타입 에러       appleBox.add(new Grape());

        grapeBox.add(new Grape());

        System.out.println("fruitbox - " + fruitBox);
        System.out.println("appleBox - " + appleBox);
        System.out.println("grapeBox - " + grapeBox);
    }
}
