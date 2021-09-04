package com.javastudy.chapter12.ex4;

import java.util.Comparator;

public class FruitComp implements Comparator<Fruit> {
    public int compare(Fruit t1, Fruit t2) {
        return t2.weight - t1.weight;
    }
}
