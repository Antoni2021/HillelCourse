/*
Вывести:

a) список студентов заданного факультета; - Факульет

b) списки студентов для каждого факультета и курса; - Факультет, Группа

c) список студентов, родившихся после заданного года; - Год рождения

d) список учебной группы. - Группа*/

package com.homeWork;

public class Selection {

    public static void faculty(StudentsArr arr, String facultet) {
        int counter = 0;
        for (Student s: arr.getArr()) {
            if (s.getFaculty().equals(facultet)) {
                counter++;
            }
        }
        Student[] fac = new Student[counter];
        counter = 0;
        for (Student s: arr.getArr()) {
            if (s.getFaculty().equals(facultet)) {
                fac[counter++] = s;
            }
        }
        for (Student s: fac){
            System.out.println(s);
        }
    }
}
