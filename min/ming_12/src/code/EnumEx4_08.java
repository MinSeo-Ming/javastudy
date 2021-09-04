package code;

abstract class MyEnum <T extends MyEnum<T>> implements Comparable<T>{
    static int id =0;
    int ordinal;
    String name ="";

    public int ordinal()    {   return ordinal; }

    MyEnum(String name){
        this.name = name;
        ordinal = id ++;
    }
    public int compareTo(T t){
        return ordinal - t.ordinal;
    }
}

abstract class MyTransportation extends MyEnum{
    static final MyTransportation Bus = new MyTransportation("BUS",100) {
        @Override
        int fare(int distance) {    return distance * BASIC_FARE;   }
    };
    static final MyTransportation TRAIN = new MyTransportation("TRAIN",150) {
        @Override
        int fare(int distance) {    return distance * BASIC_FARE;   }
    };
    static final MyTransportation SHIP = new MyTransportation("SHIP",100) {
        @Override
        int fare(int distance) {    return distance * BASIC_FARE;   }
    };
    static final MyTransportation AIRPLANE = new MyTransportation("AIRPLANE",300) {
        @Override
        int fare(int distance) {    return distance * BASIC_FARE;   }
    };

    abstract int fare(int distance);

    protected final int BASIC_FARE;

    private MyTransportation(String name, int basicFare){
        super(name);
        BASIC_FARE = basicFare;
    }
    public String name()        {   return name;    }
    public String toString()    {   return name;    }
}

public class EnumEx4_08 {
    public static void main(String[] args) {

    }
}
