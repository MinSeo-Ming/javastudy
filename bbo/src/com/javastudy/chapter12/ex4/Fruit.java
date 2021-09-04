package com.javastudy.chapter12.ex4;

public class Fruit {
    String name;
    int weight;

    Fruit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String toString() { return name + "(" + weight+ ")" ;}

}
