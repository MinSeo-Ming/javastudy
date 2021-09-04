package com.javastudy.chapter11.ex24;

import java.util.HashSet;

public class HashSetEx4 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(new String("abc"));
        set.add(new String("abc"));

        set.add(new Person2("David", 10));

        System.out.println(set);
    }


}
