package com.javastudy.chapter12.ex12;

import java.util.Arrays;

public class MyArrayList<T> {
    T[] arr;

    @SafeVarargs
    @SuppressWarnings("varargs")
    MyArrayList(T ... arr) {
        this.arr = arr;
    }

    @SafeVarargs
    public static <T> MyArrayList<T> asList(T ...a) {
        return new MyArrayList<> (a);
    }
    public String toString() {
        return Arrays.toString(arr);
    }

}
