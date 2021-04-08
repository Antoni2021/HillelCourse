package com.homeWork7;

public class StringCollection {

    String[] arr;
    int count;

    public StringCollection(int length) {
        this.arr = new String[length];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + "";
        }
    }
}
