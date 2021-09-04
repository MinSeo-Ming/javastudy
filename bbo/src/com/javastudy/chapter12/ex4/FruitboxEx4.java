package com.javastudy.chapter12.ex4;


public class FruitboxEx4 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();

        appleBox.add(new Apple("greenApple", 300));
        appleBox.add(new Apple("greenApple", 100));
        appleBox.add(new Apple("greenApple", 200));

        grapeBox.add(new Grape("greenGrape", 400));
        grapeBox.add(new Grape("greenGrape", 300));
        grapeBox.add(new Grape("greenGrape", 200));
    }
}
