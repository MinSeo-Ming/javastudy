package com.javastudy.chapter12.ex4;

import java.util.Comparator;

public class AppleComp implements Comparator<Apple> {
    public int compare(Apple t1, Apple t2) {
        return t2.weight - t1.weight;
    }
}
