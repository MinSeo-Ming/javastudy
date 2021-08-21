package test;

public class InnerEx2 {
    class InstanceInner{}
    static class  StaticInner{}
    InstanceInner iv = new InstanceInner();
    static  StaticInner cv = new StaticInner();

    static void StaticMethod()
    {
        StaticInner obj2= new StaticInner();

        InnerEx2 outer = new InnerEx2();
        InstanceInner obj1 = outer.new InstanceInner();
    }
    void instanceMethod(){
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

//        LocalInner Iv = new LocalInner();
    }
    void myMethod(){
        class LocalInner{}
        LocalInner Iv = new LocalInner();
    }

}

