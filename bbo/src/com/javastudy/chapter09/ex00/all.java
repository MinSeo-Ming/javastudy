package com.javastudy.chapter09.ex00;

public class all{
    public static void main(String[] args) {

        // 일반 String
        String s = new String("Hello");
        System.out.println("s = " + s);
        System.out.println();

        // char 를 String 로
        char[] c = {'H', 'e', 'l', 'l', 'o'};
        String s2 = new String(c);
        System.out.println("s2 = " + s2);
        System.out.println();

        // StringBuffer을 String 를
        StringBuffer sb = new StringBuffer("Hello");
        String s3 = new String(sb);
        System.out.println("s3 = " + s3);
        System.out.println();

        // charAt
        String s4 = "Hello";
        String n = "0123456";
        char c2 = s.charAt(1);
        char c3 = n.charAt(1);
        System.out.println("c3 = " + c2);
        System.out.println("c4 = " + c3);
        System.out.println();


        // carpareTo (String str)
        System.out.println("aaa".compareTo("aaa"));
        System.out.println("aaa".compareTo("bbb"));
        System.out.println("bbb".compareTo("aaa"));




    }
}
