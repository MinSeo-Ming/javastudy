package com.javastudy.chapter12.ex8;

abstract class MyEnum<T extends MyEnum<T>> implements Comparable<T> {

    static int id = 0;
    int ordinal;
    String name = "" ;

    public int ordinal() { return ordinal; }

    MyEnum(String name) {
        this.name = name;
        ordinal = id++;
    }

    @Override
    public int compareTo(T o) {
        return ordinal - o.ordinal();
    }


}
