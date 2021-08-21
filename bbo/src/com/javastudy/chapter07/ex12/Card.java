package com.javastudy.chapter07.ex12;

public class Card {
    final int NUM;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card(String kind, int num) {
        KIND = kind;
        NUM = num;
    }

    Card() {
        this("HEART", 1);
    }
    public String toString() {
        return KIND + " " + NUM;
    }

}
