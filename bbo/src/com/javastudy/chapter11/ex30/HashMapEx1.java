package com.javastudy.chapter11.ex30;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId" ,"1234");
        map.put("asdf","1111");
        map.put("asdf","1234");

        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println("id 와 password 을 입력해주세요");
            System.out.println("id : ");
            String id = s.nextLine().trim();

            System.out.println("password : ");
            String password = s.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)) {
                System.out.println("입력하신 id 가 존재 하지 않습니다");
                continue;
            } else {
                if(!map.get(id).equals(password)) {
                    System.out.println("비밀번호 일치하지 않음");
                } else {
                    System.out.println("id 와 비밀번호가 일치합니다");
                    break;
                }
            }


        }


    }
}
