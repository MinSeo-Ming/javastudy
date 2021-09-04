package code;

import  java.util.*;

public class MyVector_04 implements List{
    Object[] data = null;
    int capacity;
    int size =0;

    public MyVector_04(int capacity){
        if (capacity <0)
            throw new IllegalArgumentException("유효하지 않은 값입니다 : "+capacity);
        this.capacity = capacity;
        data = new Object[capacity];
    }

    public MyVector_04(){
        this(10);
    }

    public void ensureCapacity(int minCapacity){
        if(minCapacity - data.length > 0)
            setCapacity(minCapacity);
    }
    public boolean add(Object obj){
        ensureCapacity(size +1);
        data[size++] =obj;
        return true;
    }
    public Object get(int index){
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("범위에서 벗어났습니다.");
        return data[index];
    }
    public Object remove(int index){
        Object oldObj = null;

        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("범위에서 벗어났습니다.");
        oldObj = data[index];

        if(index != size-1){
            System.arraycopy(data,index+1,data,index,size-index-1);
        }
        data[size-1]=null;
        size--;
        return oldObj;
    }
    public boolean  remove(Object obj){
        for(int i=0; i<size; i++){
            if(obj.equals(data[i])){
                remove(i);
                return true;
            }
        }
        return false;
    }
    public void trimToSize(){
        setCapacity(size);
    }
    private void setCapacity(int capacity){
        if(this.capacity == capacity) return;

        Object tmp[]= new Object[capacity];
        System.arraycopy(data,0,tmp,0,size);
        data = tmp;
        this.capacity = capacity;
    }
    public void clear(){
        for(int i=0; i< size; i++)
            data[i] = null;
        size =0;
    }
    public Object[] toArray(){
        Object[] result = new Object[size];
        System.arraycopy(data,0,result,0,size);
        return result;
    }

    public boolean isEmpty() {return size==0;}
    public int capacity()   {return capacity;}
    public int size()       {return size;}

    public boolean contains(Object o)   {return false;}
    public Iterator iterator()          {return null;}

    public Object[] toArray(Object a[]) {return null;}

    public boolean containsAll(Collection c){return false;}


    public boolean addAll(Collection c) {return false;}
    public boolean addAll(int index, Collection c) {return false;}
    public boolean retainAll(Collection c) {return false;}
    public boolean removeAll(Collection c) {return false;}
    public boolean equals(Object o) {return  false;}

    public Object set(int index, Object element){return  null;}
    public void add(int index, Object element) {}

    public int indexOf(Object o){return -1;}
    public int lastIndexOf(Object o){return -1;}
    public ListIterator listIterator(){return null;}
    public ListIterator listIterator(int index){return null;}
    public List subList(int fromIndex,int toIndex){return null;}

//    default void sort(Comparator c) {}
}
