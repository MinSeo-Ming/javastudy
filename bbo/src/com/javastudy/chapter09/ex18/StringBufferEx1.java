package com.javastudy.chapter09.ex18;

public class StringBufferEx1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        System.out.println("sb == sb2 ? " + (sb == sb2));
        System.out.println(
                "sb.equals(sb2) ? " + sb.equals(sb2)
        );

        String s = sb.toString();
        String s2 = sb2.toString();

        System.out.println("s.eqauls(s2) ? " + s.equals(s2));

        StringBuffer sb3 = new StringBuffer(100);
        sb3.append("abcd");
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());

        StringBuffer sb4 = new StringBuffer("abc");
        System.out.println(sb4.charAt(2));


        StringBuffer sb5 = new StringBuffer("0123456");
        System.out.println(sb5.delete(3,5));

        StringBuffer sb6 = new StringBuffer("0123456");
        System.out.println(sb6.replace(3,6,"AB"));
        System.out.println(sb6.reverse());

    }
}
