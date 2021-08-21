package test;

public class FinalCardTest {
    public static void main(String args[]){
        Card_ c = new Card_("HEART",10);
//        c.NUMBER =5;
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}
class Card_{
    final int NUMBER;
    final String KIND;
    static int width =100;
    static int height =250;

    Card_(String kind, int num){
        KIND =kind;
        NUMBER =num;

    }
    Card_(){
        this("HEART",1);
    }
    public String toString(){
        return KIND +" "+NUMBER;
    }
}
