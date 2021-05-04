package com.work;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Arrays;

public class StringCollection implements Collection, Cloneable {

    private String[] arr;
    private int count;

    public StringCollection(int length) {
        this.arr = new String[length];
        this.count = length;
//for (int i = 0; i < arr.length; i++) {
//    arr[i] = RandomStringUtils.random(i+1, true, false);
//}
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + "";
        }
    }


    @Override
    public boolean add(Object s) {
        String value = s.toString();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = value;
                count++;
                return true;
            }
        }
        String[] collection = new String[2 * count++];
        for (int i = 0; i < arr.length; i++){
            collection[i] = arr[i];
        }
        collection[arr.length] = value;
        arr = collection.clone();
        return true;
    }

    @Override
    public boolean add(int index, Object s) {
        if (count < index){
            return false;
        }
        String value = s.toString();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = value;
                count++;
                return true;
            }
        }
        String[] collection = new String[2 * count++];
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
        for (int i = 0; i < count; i++){
            if (arr[i] != null && arr[i].equals(value)){
                numb = i;
            }
        }
        if (numb == 0) {
            return false;
        }
        for (int i = 0; i < count - 1; i++){
            if (i >= numb){
                arr[i] = arr[i + 1];
            }
        }
        arr[count - 1] = null;
        count--;
        return true;
    }

    @Override
    public String get(int index){
        if (count <= index) {
            return "There are no this index in the collection";
        }
        return arr[index];
    }

    @Override
    public boolean contain(Object s) {
        String value = s.toString();
        for (String str : arr){
            if (str != null && str.equals(value)){
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
        if (count == 0) return false;
        for (int i = 0; i < count; i++){
            arr[i] = null;
        }
        count = 0;
        return true;
    }

    @Override
    public int size() {
        return count;
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
        for (int i = 0; i < count; i++){
            if (arr[i] != null) {
                if (i < count - 1){
                    out = out.concat(arr[i] + ", ");
                } else {
                    out = out.concat(arr[count - 1]);
                }
            }
        }
        out = out.concat("]");
        return out;
    }
}
