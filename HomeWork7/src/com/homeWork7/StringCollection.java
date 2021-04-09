package com.homeWork7;

import java.util.Arrays;

public class StringCollection implements Cloneable {

    String[] arr;

    public StringCollection(int length) {
        this.arr = new String[length];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + "";
        }
    }
    public StringCollection() {
        this.arr = new String[10];
    }

    public boolean add(int index, String value){
        String[] collection;
        if (arr.length < index){
            collection = new String[index + 1];
        } else {
            collection = new String[arr.length + 1];
        }
        for (int i = 0; i < collection.length; i++){
            if (i < index & i < arr.length){
                collection[i] = arr[i];
            } else if (i == index){
                collection[i] = value;
            } else if (i > index & i <= arr.length ) {
                collection[i] = arr[i - 1];
            }
        }
        arr = collection.clone();
        return true;
    }

    public boolean add(String value){
        String[] collection = new String[arr.length + 1];

        for (int i = 0; i < collection.length; i++){
            if (i <  arr.length){
                collection[i] = arr[i];
            } else {
                collection[i] = value;
            }
        }
        arr = collection.clone();
        return true;
    }

    public boolean delete(int index){
        if (arr.length <= index) {
            return false;
        }
        String[] collection = new String[arr.length - 1];
        for (int i = 0; i < collection.length; i++){
            if (i < index){
                collection[i] = arr[i];
            } else {
                collection[i] = arr[i + 1];
            }
        }
        arr = collection.clone();
        return true;
    }

    public boolean delete(String value){
        int numb = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != null && arr[i].equals(value)){
                numb = i;
            }
        }
        if (numb == 0) {
            return false;
        }
        String[] collection = new String[arr.length - 1];
        for (int i = 0; i < collection.length; i++){
            if (i < numb){
                collection[i] = arr[i];
            } else {
                collection[i] = arr[i + 1];
            }
        }
        arr = collection.clone();
        return true;
    }

    public String get(int index){
        if (arr.length <= index) {
            return "There are no this index in the collection";
        }
        return arr[index];
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "StringCollection{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
