package com.javastudy.chapter07.ex4;


// 다중산속을 포기하고 단일 상속만허용
public class TVCR extends Tv{
    VCR vcr = new VCR();
    int counter = vcr.counter;

    void play() {
        vcr.play();
    }

    void stop() {
        vcr.stop();
    }
    void rew() {
        vcr.rew();
    }
    void ff() {
        vcr.ff();
    }
}
