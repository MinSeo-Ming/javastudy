package test;
//생성자에 접근 제어아 사용 = 인스턴스 생성 제한
public class SingletonTest {
    public static void main(String args[]){
//        Singleton s= new Singleton();
        //위의 경우는  private 생성자이기 때문에 사용하면 에러가 발생함.
        Singleton s = Singleton.getInstance();
    }
}
final class Singleton{
    private static Singleton s = new Singleton();//getInstance에서 사용이 가능해야함으로  static이다.
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(s==null)
            s = new Singleton();
        return s;
    }
}
