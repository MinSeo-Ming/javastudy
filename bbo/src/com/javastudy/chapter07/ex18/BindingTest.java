package com.javastudy.chapter07.ex18;

/**
 * 멤버 변수가 조상 클래스와 자손 클래스에 중복으로 정의된 경우 조상 타입의 참조 변수를 사용했을 때는
 * 조상 클래스에 선언된 멤버 변수가 사용되고, 자손 타입의 참조 변수를 사용했을 대는 자손 클래스에
 * 선언된 멤버 변수가 사용됨
 */
public class BindingTest {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x =" + p.x);
        p.method();
        System.out.println("c.y =" + c.x);
        c.method();
    }

}
