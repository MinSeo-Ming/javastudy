package com.javastudy.chapter09.ex07;

public class CloneEx1 {
    public static void main(String[] args) {
        Point ori = new Point(3,5);
        Point copy = (Point) ori.clone();
        System.out.println(ori);
        System.out.println(copy);
    }
}
