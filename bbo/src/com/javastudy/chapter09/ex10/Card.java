package com.javastudy.chapter09.ex10;

public class Card {
    String kind;
    int number;

    Card() {
        this("SPACE", 1);
    }

    Card(String kind, int num) {
        this.kind = kind;
        this.number = num;
    }

    public String toString() {
        return "kind : " + kind + ", number : " + number;
    }
}



