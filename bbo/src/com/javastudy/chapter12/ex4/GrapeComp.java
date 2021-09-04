package com.javastudy.chapter12.ex4;

import java.util.Comparator;

public class GrapeComp implements Comparator<Grape> {
    public int compare(Grape t1, Grape t2) {
        return t2.weight - t1.weight;
    }
}
