package com.javastudy.chapter07.ex24;

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if( f instanceof  Unit ){
            System.out.println("f는 Unit 클래스 자손");
        }
        if( f instanceof  Fightable ){
            System.out.println("f는 Fightable 구현");
        }
        if( f instanceof  Movable ){
            System.out.println("f는 Movable 구현");
        }
        if( f instanceof  Attackable ){
            System.out.println("f는 Attackable 구현");
        }
        if( f instanceof  Object){
            System.out.println("f는 Object 자손");
        }
    }
}
