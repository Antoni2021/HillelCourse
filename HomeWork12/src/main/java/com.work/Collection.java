package com.work;

public interface Collection {

    boolean add(Object s);

    boolean add(int index, Object s);

    boolean delete (Object s);

    String get(int index);

    boolean contain(Object s);

    boolean equals (Object str);

    boolean clear();

    int size();
}
