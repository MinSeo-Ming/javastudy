package com.javastudy.chapter07.ex14;

public class SingletonTest {
    public static void main(String[] args) {
      //  Singleton s = new Singleton(); 싱글톤도 한번 선언하고 가져다 슴
        Singleton s = Singleton.getInstance();
    }
}
