package com.javastudy.chapter12.ex8;

abstract class MyTransportation extends MyEnum{

    static final MyTransportation Bus = new MyTransportation("BUS", 100) {
        int fare(int distance) { return distance * BASIC_FARE; }
    };

    static final MyTransportation TRANS = new MyTransportation("TRANS", 150) {
        int fare(int distance) { return distance * BASIC_FARE; }
    };

    static final MyTransportation SHIP = new MyTransportation("SHIP", 100) {
        int fare(int distance) { return distance * BASIC_FARE; }
    };

    static final MyTransportation AIRPLANE = new MyTransportation("AIRPLANE", 300) {
        int fare(int distance) { return distance * BASIC_FARE; }
    };
    abstract int fare(int distance) ;

    protected final int BASIC_FARE;


    private MyTransportation(String name, int baseFare) {
        super(name);
        BASIC_FARE = baseFare;
    }
    public String name() { return name; }
    public String toString() { return name; }
}
