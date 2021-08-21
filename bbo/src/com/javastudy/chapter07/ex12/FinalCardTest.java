package com.javastudy.chapter07.ex12;

public class FinalCardTest {
    public static void main(String[] args) {
        Card c = new Card("HEART" , 10);
      //  c.NUM = 5; 에너남 final 은 한번 초기화 하면 프로그램 끝날때까지 유지 됨
        System.out.println(c.KIND);
        System.out.println(c.NUM);
        System.out.println(c);

    }
}
