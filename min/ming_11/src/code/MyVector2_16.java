package code;

import java.util.Iterator;

public class MyVector2_16 extends MyVector_04 implements Iterator {
    int cursor = 0;
    int lastRet =-1;

    public MyVector2_16(int capacity){
        super(capacity);
    }
    public MyVector2_16(){
        this(10);
    }
    public String toString(){
        String tmp ="";
        Iterator it = iterator();

        for(int i=0; it.hasNext(); i++){
            if(i!=0 )tmp +=", ";
            tmp+= it.next();
        }
        return "["+tmp+"]";
    }

    public Iterator iterator(){
        cursor =0;
        lastRet =-1;
        return this;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        if(lastRet ==-1)
            throw  new IllegalStateException();
        else {
            remove(lastRet);
            cursor--;
            lastRet =-1;
        }
    }
}
