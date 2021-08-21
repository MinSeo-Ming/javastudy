package test;

public class BindingTest3 {
    public static void main(String args[]){
        Parent__ p = new Child__();
        Child__ c = new Child__();
        System.out.println(" p.x = "+p.x);
        p.method();
        System.out.println();
        System.out.println("c.x = "+c.x);
        c.method();
    }
}
class Parent__{
    int x=100;
    void method(){
        System.out.println("Parent method");
    }
}
class Child__ extends Parent__{
    int x =200;

    @Override
    void method() {
        System.out.println("x = "+x);
        System.out.println("super.x = "+super.x);
        System.out.println("this.x = "+this.x);
    }
}
