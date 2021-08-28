package com.javastudy.chapter09.ex28;

import javax.swing.*;
import java.util.Random;

public class RandomEx2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] num = new int [100];
        int[] cnt =  new int [10];

        for (int i = 0; i < num.length ; i++){
            System.out.println(num[i] = r.nextInt(10));
        }
        System.out.println();

        for(int i = 0; i < num.length ; i++) {
            cnt[num[i]]++;
        }

        for(int i = 0 ; i < cnt.length ; i++){
            System.out.println(i + "의 개수 : " + printGraph('#',cnt[i]) + " " +cnt[i]);
        }
    }

    public static String printGraph(char ch, int value) {
        char [] bar = new char[value];
        for(int i = 0; i < bar.length; i++){
            bar[i] =ch;
        }
        return new String(bar);
    }
}
