package com.javastudy.chapter07.ex1;

class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello world");
        ctv.caption =true;
        ctv.displayCaption("Hello world");
    }
}