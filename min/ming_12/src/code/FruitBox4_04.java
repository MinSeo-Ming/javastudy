package code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Fruit_{
    String name;
    int weight;
    Fruit_(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    public String toString(){
        return name+"("+weight+")";
    }
}
class Apple_ extends Fruit_{
    Apple_(String name, int weight){
        super(name,weight);
    }
}
class Grape_ extends Fruit_{
    Grape_(String name, int weight){
        super(name,weight);
    }
}

class AppleComp implements Comparator<Apple_>{
    public int compare(Apple_ t1, Apple_ t2){
        return t2.weight - t1.weight;
    }
}
class GrapeComp implements Comparator<Grape_>{
    public int compare(Grape_ t1, Grape_ t2){
        return t2.weight - t1.weight;
    }
}
class FruitComp implements Comparator<Fruit_>{
    public int compare(Fruit_ t1, Fruit_ t2){
        return t1.weight - t2.weight;
    }
}

public class FruitBox4_04 {
    public static void main(String[] args) {
        FruitBox_<Apple_>applebox = new FruitBox_<Apple_>();
        FruitBox_<Grape_>grapebox = new FruitBox_<Grape_>();

        applebox.add(new Apple_("GreenApple",300));
        applebox.add(new Apple_("GreenApple",100));
        applebox.add(new Apple_("GreenApple",200));

        grapebox.add(new Grape_("GreenGrape",400));
        grapebox.add(new Grape_("GreenGrape",300));
        grapebox.add(new Grape_("GreenGrape",200));

        Collections.sort(applebox.getList(), new AppleComp());
        Collections.sort(grapebox.getList(), new GrapeComp());

        System.out.println(applebox);
        System.out.println(grapebox);
        System.out.println();
        Collections.sort(applebox.getList(),new FruitComp());
        Collections.sort(grapebox.getList(),new FruitComp());
        System.out.println(applebox);
        System.out.println(grapebox);
    }
}
class FruitBox_ <T extends Fruit_> extends Box_<T>{}

class Box_<T>{
    ArrayList<T>list = new ArrayList<T>();

    void add(T item){
        list.add(item);
    }
    T get(int i){
        return list.get(i);
    }
    ArrayList<T> getList() {return list;}

    int size(){
        return list.size();
    }

    public String toString(){
        return list.toString();
    }
}