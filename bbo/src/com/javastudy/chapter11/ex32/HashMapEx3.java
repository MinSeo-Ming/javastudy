package com.javastudy.chapter11.ex32;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx3 {
    static HashMap phoneBock = new HashMap();

    public static void main(String [] args ) {
        addPhoneNo("친구" ,"이자바", "010-111-1111");
        addPhoneNo("친구" ,"김자바", "010-121-1111");
        addPhoneNo("친구" ,"유자바", "010-141-1111");
        addPhoneNo("친구" ,"조자바", "010-131-1111");
        addPhoneNo("회사" ,"하자바", "010-151-1111");
        addPhoneNo("회사" ,"바자바", "010-161-1111");
        addPhoneNo("회사" ,"지자바", "010-171-1111");
        addPhoneNo("회사" ,"크자바", "010-181-1111");
        printList();
    }

    static void addPhoneNo(String groupName, String name, String tel) {
        addGroup(groupName);
        HashMap group = (HashMap) phoneBock.get(groupName);
        group.put(tel,name);

    }

    static void addGroup( String groupName) {
        if(!phoneBock.containsKey(groupName)) {
            phoneBock.put(groupName,new HashMap());
        }
    }

    static void addPhoneNo(String name, String tel) {
        addPhoneNo("기타",name,tel);
    }

    static void printList() {
        Set set = phoneBock.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();

            Set subSet = ((HashMap) e.getValue()).entrySet();
            Iterator subit = subSet.iterator();

            System.out.println("*" + e.getKey()  + "[" + subSet.size() + "]");

            while(subit.hasNext()) {
                Map.Entry subE = (Map.Entry) subit.next();
                String telNo = (String) subE.getKey();
                String name = (String) subE.getValue();
                System.out.println(name + " " + telNo);
            }

            System.out.println();
        }
    }
}
