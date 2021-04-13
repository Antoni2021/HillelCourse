package com.homeWork8;

import java.util.Arrays;

public class StringCollection implements Collection, Cloneable {

    private String[] arr;

    public StringCollection(int length) {
        this.arr = new String[length];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + "";
        }
    }

    public StringCollection() {
        this.arr = new String[10];
    }

    @Override
    public boolean add(Object s) {
        String value = s.toString();
        String[] collection = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++){
            collection[i] = arr[i];
        }
        collection[collection.length-1] = value;
        arr = collection.clone();
        return true;
    }

    @Override
    public boolean add(int index, Object s) {
        String value = s.toString();
        String[] collection;
        if (arr.length < index){
            return false;
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

    @Override
    public boolean delete(Object s) {
        String value = s.toString();
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
    public boolean contain(Object s) {
        String value = s.toString();
        for (String str : arr){
            if (str.equals(value)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringCollection that = (StringCollection) o;
        return Arrays.equals(arr, that.arr);
    }

/* another equals realization
@Override
    public boolean equals(StringCollection str) {
        if (arr.length != str.arr.length){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(str.arr[i])) {
                return false;
            }
        }
        return true;
    }
*/

    @Override
    public boolean clear() {
        arr  = new String[0];
        return true;
    }


    @Override
    public int size() {
        return arr.length;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }

    @Override
    public String toString() {
        String out = "[";
        for (int i = 0; i < arr.length; i++){
            if (i < arr.length - 1){
                out = out.concat(arr[i] + ", ");
            } else {
                out = out.concat(arr[i]);
            }
        }
        out = out.concat("]");
        return out;
    }
}
