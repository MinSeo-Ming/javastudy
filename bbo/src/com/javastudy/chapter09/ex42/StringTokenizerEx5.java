package com.javastudy.chapter09.ex42;

import java.util.StringTokenizer;

public class StringTokenizerEx5 {
    public static void main(String[] args) {
        String data = "100,,,200,300";
        String [] res = data.split(",");

        StringTokenizer st = new StringTokenizer(data, ",");

        for(int i = 0; i < res.length ; i++){
            System.out.println(res[i] + "|");
        }

        System.out.println("개수 : " + res.length);
        int i =0;

        System.out.println("개수 : " + i);


    }
}
