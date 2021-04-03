package com.homeWork;

import java.util.Arrays;

public class StudentsArr {
    private Student[] arr;

    public StudentsArr(Student s1, Student s2) {
        arr = new Student[2];
        arr[0] = s1;
        arr[1] = s2;
    }

    public StudentsArr(Student[] arr) {
        this.arr = arr;
    }

    public StudentsArr(int num) {
        arr = new Student[num];
    }


    public Student[] getArr() {
        return arr;
    }

    public void setArr(Student[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "StudentsArr{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
