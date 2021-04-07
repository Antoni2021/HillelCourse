package com.homeWork;

import java.util.Arrays;

public class PhonesMass implements Cloneable{

    private Phone[] arr;

    public PhonesMass(Phone[] arr) {
        this.arr = arr;
    }

    public PhonesMass(Phone ph1, Phone ph2) {
        arr = new Phone[2];
        arr[0] = ph1;
        arr[1] = ph2;

    }

    public Phone[] getArr() {
        return arr;
    }

    public void setArr(Phone[] arr) {
        this.arr = arr;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "PhonesMass{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
