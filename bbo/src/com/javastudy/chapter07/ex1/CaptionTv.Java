package com.javastudy.chapter07.ex1;

class CaptionTv extends Tv {
    boolean caption;
    void displayCaption (String text )  {
        if ( caption ) {
            System.out.println(text);
        }
    }
}