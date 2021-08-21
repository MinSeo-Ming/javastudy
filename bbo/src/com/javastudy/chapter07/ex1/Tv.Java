package com.javastudy.chapter07.ex1;

class Tv {
    boolean power;
    int channel;

    void power() { power =!power; }
    void channelUp() { ++channel;}
    void channelDown() {--channel;}
}