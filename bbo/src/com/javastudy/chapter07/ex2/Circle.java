package com.javastudy.chapter07.ex2;

class Circle extends Shape {
    Point center;
    int r;

    Circle() {
        this(new Point(0,0), 100);
    }

    public Circle(Point center, int i) {
        this.center = center;

    }

    void draw() {
        System.out.printf("[center=(%d,%d), r=%d, [color=%s]%n", center.x, center.y, r, color);
    }

}
