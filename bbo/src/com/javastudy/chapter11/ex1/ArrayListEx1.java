package com.javastudy.chapter11.ex1;

import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(10);
        print(list1, list2);



    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 " + list1);
        System.out.println("list2 " + list2);
        System.out.println();
    }
}
