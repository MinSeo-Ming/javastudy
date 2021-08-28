package com.javastudy.chapter09.ex14;

import java.util.StringJoiner;

public class StringEx14 {
    public static void main(String[] args) {
        String ani = "dog,cat,bear";
        String[] arr = ani.split(",");

        System.out.println(String.join("-",arr));
        StringJoiner sj = new StringJoiner("/","[","]");

        for(String s : arr)
            sj.add(s);

        System.out.println(sj.toString());
    }
}
