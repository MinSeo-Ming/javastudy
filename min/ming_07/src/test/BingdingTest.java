package test;
/*
멤버변수가 중복으로 저의 된경우
조상타입의 참조 변수를 사용했을 때 : 조상 클래스에서 선언된 멤버 변수가
자손 타입의 참조변수를 사용했을 때 : 자손 클래스에서 선언된 멤버 변수가
사용되고

method의 경우 참조 변수 타입에 관계 x 항상 실제 인스턴스 타입인 child 클래스에 정의된 메소드가 호출된다.
 */
public class BingdingTest {
    public static void main(String args[]){
        Parent_ p = new Child_();
        Child_ c = new Child_();
        System.out.println(" p.x = "+p.x);
        p.method();
        System.out.println("c.x = "+c.x);
        c.method();
    }
}
class Parent_{
    int x=100;
    void method(){
        System.out.println("Parent method");
    }
}
class Child_ extends Parent_{
    int x =200;

    @Override
    void method() {
        System.out.println("Child Method");
    }
}
