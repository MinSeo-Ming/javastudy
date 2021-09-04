package code;

import java.util.*;

public class ArrayListEx01_01 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1,list2);

        Collections.sort(list1);
        Collections.sort(list2);
        print(list1,list2);

        System.out.println("list1.containsAll(list2)"+
                list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3,"A");
        print(list1,list2);

        list2.set(3,"AA");
        print(list1,list2);

        System.out.println("list1.retainAll(list2)"+list1.retainAll(list2));
        print(list1,list2);
/*
거꾸로 하는 이유는 만약에 i =0부터 시작을 하면 삭제된 만큼
빈공간을 매꾸기 위해서 나머지들이 자리이동을 하기 때문에
올바른 결과를 낼 순 없다.

그래서 뒤에서부터 하나씩 찾아서 간다
 */
        for(int i=list2.size()-1; i>=0; i--){
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1,list2);
    }
    static void print(ArrayList list1, ArrayList list2){
        System.out.println("list1 : "+list1);
        System.out.println("list2 : "+list2);
        System.out.println();
    }
}
