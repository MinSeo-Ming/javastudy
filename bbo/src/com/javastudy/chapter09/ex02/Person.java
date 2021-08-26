package com.javastudy.chapter09.ex02;


public class Person {
    long id;

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof Person)
            return id == ((Person) o).id;
        else
            return false;
    }

    Person(long id) {
        this.id = id;
    }
}
