package com.javastudy.chapter11.ex38;

import java.util.Properties;

public class PropertiesEx4 {
    public static void main(String[] args) {
        Properties sysProp = System.getProperties();

        System.out.println("java veresion : " + sysProp.getProperty("java.version"));
        System.out.println("user. language : " + sysProp.getProperty("user.language"));

        sysProp.list(System.out);
    }
}
