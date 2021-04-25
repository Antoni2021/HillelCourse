package com.homeWork8;

import javax.swing.*;
import java.util.Iterator;

public class ArrayIterator implements Iterator {

    StringCollection sc;
    int index;

    public ArrayIterator(StringCollection list) {
        sc = list;
    }

    @Override
    public boolean hasNext() {
        return index < sc.size();
    }

    @Override
    public Object next() {
        if (hasNext()){
            return sc.get(index++);
        }
        return null;
    }

    @Override
    public void remove() {
        if (index == 0){
            System.out.println("can`t remove nothing");
            return;
        }
//        else if ( index == sc.size()){
//            System.out.println("there is no any elements");
//            return;
//        }
        sc.delete(sc.get(--index));
    }
}
