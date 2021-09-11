package com.javastudy.chapter11.ex16;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class MyVector implements List {
    Object[] data = null;
    int capacity = 0;
    int size = 0;

    public MyVector(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("유효하지 않음 : " + capacity);
        this.capacity = capacity;
        data = new Object[capacity];
    }

    public MyVector() {
        this(10);
    }

    public void ensureCapacity(int minCapa) {
        if (minCapa - data.length > 0) {
            setCapa(minCapa);
        }
    }

    private void setCapa(int capa) {

        if (this.capacity == capa) return;

        Object[] tmp = new Object[capa];
        System.arraycopy(data, 0, tmp, 0, size);
        data = tmp;
        this.capacity = capa;
    }

    public boolean add(Object obj) {
        ensureCapacity(size + 1);
        data[size++] = obj;
        return true;
    }

    public Object get(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException("범위 벗어남");
        }
        return data[idx];
    }

    public Object remove(int idx) {
        Object oldObj = null;

        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException("범위 벗어남");
        }
        oldObj = data[idx];

        if (idx != size - 1) {
            System.arraycopy(data, idx + 1, data, idx, size - idx - 1);
        }

        data[size - 1] = null;
        size--;
        return oldObj;


    }

    public boolean remove(Object obj) {
        for(int i =0; i < size; i++) {
            if(obj.equals(data[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public void trimToSize() {
        setCapa(size);
    }

    public void clear() {
        for(int i =0 ; i < size ; i ++) {
            data[i] = null;
        }
        size =0;
    }


    public Object[] toArray() {
        Object[] res = new Object[size];
        System.arraycopy(data, 0, res, 0, size);

        return res;
    }

    public boolean isEmpty() { return size == 0; }
    public int capacity() { return capacity; }
    public int size() { return size; }
    public boolean contains(Object o) { return false; }
    public Iterator iterator() { return null; }
    public Object[] toArray(Object a[]) { return null; }
    public boolean containsAll(Collection c) { return false; }
    public boolean addAll(Collection c) { return false; }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) { return false; }
    public boolean eqauls(Object o) { return false; }
    public Object set(int indix, Object element) { return null; }
    public void add(int index, Object element) {}

    public int indexOf(Object o) { return -1 ; }
    public int lastIndexOf(Object o) {return -1; }
    public ListIterator listIterator() { return null; }
    public ListIterator listIterator(int index ) { return null; }
    public List subList(int fromIdx, int toIdx) {return null;}



}
