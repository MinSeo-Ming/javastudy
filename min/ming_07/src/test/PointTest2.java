package test;

public class PointTest2 {
    public static void main(String args[]){
        Point3D p3 = new Point3D();
        System.out.println("p3.x = "+p3.x);
        System.out.println("p3.y = "+p3.y);
        System.out.println("p3.z = "+p3.z);
    }
}
class Point_{
    int x =10;
    int y =20;
    Point_(int x, int y){
        this.x = x;
        this.y =y;
    }
}
class Point3D extends Point_ {
    int z = 30;

    Point3D() {
        this(100,200,300);
    }
    Point3D(int x,int y,int z){
        super(x,y);
        this.z =z;
    }

}