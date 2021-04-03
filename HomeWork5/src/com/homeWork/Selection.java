package com.homeWork;

import java.util.ArrayList;


public class Selection {

    public static void addStudent(StudentsArr arr, Student student) {
        for (Student s: arr.getArr()){
            if (s != null && s.getId() == student.getId() ){
                System.out.println("the student is already in array");
                return;
            }
        }

        if (arr.getArr()[arr.getArr().length - 1] != null) {
            System.out.println("Array is full");
        } else {
            for (int i = 0; i < arr.getArr().length; i++) {
                if (arr.getArr()[i] == null) {
                    arr.getArr()[i] = student;
                    break;
                }
            }
        }
    }

    public static void faculty(StudentsArr arr, String facultet) {
        int counter = 0;
        for (Student s: arr.getArr()) {
            if (s != null && s.getFaculty() != null && s.getFaculty().equals(facultet)) {
                counter++;
            }
        }
        Student[] fac = new Student[counter];
        counter = 0;
        for (Student s: arr.getArr()) {
            if (s != null && s.getFaculty() != null && s.getFaculty().equals(facultet)) {
                fac[counter++] = s;
            }
        }
        System.out.println("the students that learn on " + facultet + " faculty");
        for (Student s: fac){
            System.out.println(s);
        }
    }

/*
Возможно неправильно понял этот пункт: списки студентов для каждого факультета и курса; - Факультет, Группа
*/
    public static void facultyCourse(StudentsArr arr) {

        int counter = 0;
        for (Student s: arr.getArr()) {
            if (s != null && s.getFaculty() != null) {
                counter++;
            }
        }
        String[] facultets = new String[counter];
        counter = 0;
        for (Student s: arr.getArr()) {
            if (s != null && s.getFaculty() != null) {
                facultets[counter++] = s.getFaculty();
            }
        }

        // не смог придумать, как убрать повторяющиеся значения, нашел данную реализацию
        ArrayList<String> store = new ArrayList<>();

        for (String facultet : facultets) {
            if (!store.contains(facultet)) {
                store.add(facultet);
            }
        }
        facultets = new String[store.size()];
        for (int n = 0; n < store.size(); n++){
            facultets[n] = store.get(n);
        }

        for (String fac : facultets){
            System.out.println("in " + fac + "faculty learns students:");
            for (Student t: arr.getArr()) {
                if (t != null && t.getFaculty() != null && t.getFaculty().equals(fac)) {
                    System.out.println(t);
                }
            }
        }
        counter = 0;
        for (Student s: arr.getArr()) {
            if (s != null && s.getCourse() != 0) {
                counter++;
            }
        }
        int[] courses = new int[counter];
        counter = 0;
        for (Student s: arr.getArr()) {
            if (s != null && s.getCourse() != 0) {
                courses[counter++] = s.getCourse();
            }
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int c : courses) {
            if (!numbers.contains(c)) {
                numbers.add(c);
            }
        }
        courses = new int[numbers.size()];
        for (int n = 0; n < numbers.size(); n++){
            courses[n] = numbers.get(n);
        }

        for (int cours : courses){
            System.out.println();
            System.out.println("on " + cours + "course learns students:");
            for (Student t: arr.getArr()) {
                if (t != null && t.getCourse() != 0 && t.getCourse() == cours) {
                    System.out.println(t);
                }
            }
        }
    }


    public static void older(StudentsArr arr, int year) {
        int counter = 0;
        for (Student s: arr.getArr()) {
            if (s != null && s.getBirthYear() != 0 && s.getBirthYear() > year) {
                counter++;
            }
        }
        Student[] olderThan = new Student[counter];
        counter = 0;
        for (Student s: arr.getArr()) {
            if (s != null && s.getBirthYear() != 0 && s.getBirthYear() > year) {
                olderThan[counter++] = s;
            }
        }
        System.out.println("the students that was born after " + year + " year");
        for (Student s: olderThan){
            System.out.println(s);
        }
    }
    public static void group(StudentsArr arr, int group) {
        int counter = 0;
        for (Student s: arr.getArr()) {
            if (s != null && s.getGroup() != 0 && s.getGroup() == group) {
                counter++;
            }
        }
        Student[] grou = new Student[counter];
        counter = 0;
        for (Student s: arr.getArr()) {
            if (s != null && s.getGroup() != 0 && s.getGroup() == group) {
                grou[counter++] = s;
            }
        }
        System.out.println("the students of the " + group + " group");
        for (Student s: grou){
            System.out.println(s);
        }
    }
}
