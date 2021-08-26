package com.javastudy.chapter09.ex02;

public class EqualsEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(801108111222L);
        Person p2 = new Person(801108111222L);

        if(p1 == p2) {
            System.out.println("p1 과 p2 는 같은 사람");
        } else {
            System.out.println("p1과 p2 는 다른 사람");
        }

        // 주소값 비교
        if (p1.equals(p2)) {
            System.out.println("p1과 p2 같은 사람");
        } else {
            System.out.println("p1과 p2 다른 사람");
        }
    }
}
