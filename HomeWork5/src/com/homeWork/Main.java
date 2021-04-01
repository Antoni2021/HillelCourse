package com.homeWork;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Bondarenko", "Anton", "Internetional Economy", 5, 5);
        System.out.println(s1.hashCode());
        StudentsArr stud = new StudentsArr(s1, s2);
        System.out.println(s1);
        System.out.println(s2);
//        Selection.faculty(stud, "Internetional Economy");

    }
}
