package test;

class TV {
    boolean power;
    int channel;

    void power(){power = !power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}

}

class VCR{
    boolean power;
    int counter =0;
    void power(){power =!power;}
    void play(){}
    void stop(){}
    void rew(){}
    void ff(){}
}

class TVCR extends TV{
    //부모는 TV클래스로
    // VCR은 내부에서 포함시키는 방식으로 했다.
    //이방식을 통해 외부에선 TVCR의 인스턴스를 생성하는 것처럼 보이지만 실질적으론
    //VCR 인스턴스를 생성하는 방법을 사용했다.
    VCR vcr = new VCR();
    int counter = vcr.counter;
    void play(){
        vcr.play();
    }
    void stop(){
        vcr.stop();
    }
    void rew(){
        vcr.rew();
    }
    void ff(){
        vcr.ff();
    }

}
