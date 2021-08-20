package test;

public class Casting2 {
    public static void main(String args[]){
        Car car = new Car();
        Car car2= null;
        FireEngine fe =null;

        car.drive();
        fe = (FireEngine) car; //컴파일에선 문제가 없어보이지만 사실
        //car 가 참조하고 있는 인스턴스가 Car타입의 인스턴스라는 점이 있다.
        //이는 조상타입의 인스턴스를 자손타입의 참조변수로 ㅊ참조하는 것은 허용되닞 않는다는것이다.

        //이는 참조변수가 가리키는 인스턴스의 자손타입으로의 형변환은 허용되지 않음을 알 수 있다.
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}
class Car{
    String color;
    int door;

    void drive(){
        System.out.println("drive Brr~");
    }
    void stop(){
        System.out.println("Stop!!");
    }
}
class FireEngine extends Car{
    void water(){
        System.out.println("water!!");
    }
}
