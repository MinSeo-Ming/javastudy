package com.javastudy.chapter09.ex32;

import com.javastudy.chapter09.ex02.Person;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx2 {
    public static void main(String[] args) {
        String[] data = {"bat","baby","bonus", "c","cA","ca","co"};

        String [] pattern = {".*", "c[a-z]*","c[a-z]","c[a-zA-Z]",
        "c[a-zA-Z0-9]","c.","c.*","c\\.","c\\w", "c\\d",
                "c.*t", "[b|c].*", ".*a.*",".*a.+", "[b|c].{2}" };

        for(int i =0 ; i < pattern.length ; i++){
            Pattern p = Pattern.compile(pattern[i]);
            System.out.println("Rattern : " + pattern[i] + "결과 : ");
            for(int x = 0; i< data.length ; x++) {
                Matcher m  = p.matcher(data[x]);
                if(m.matches())
                    System.out.println(data[i] + ",");
            }

        }
    }
}
