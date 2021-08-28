package com.javastudy.chapter10.ex18;

import java.text.MessageFormat;

public class MessageFormatEx1 {
    public static void main(String[] args) {
        String msg = "Name : {0} \nTel: {1} \nAge: {2}"
                + "\nBirthday: {3} ";
        Object [] arguments = { "이자바" , "02-1223-1234","27","07-09"};

        String res = MessageFormat.format(msg,arguments);
        System.out.println(res);
    }
}
