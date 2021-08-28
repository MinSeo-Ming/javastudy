package com.javastudy;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
    public static void main(String[] args) {
        String source = "100,222,300,400";
        StringTokenizer st = new StringTokenizer(source,",");

        while (st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}
