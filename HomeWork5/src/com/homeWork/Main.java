package com.homeWork;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Bondarenko", "Anton", "MFU", 5, 5);
        Student s3 = new Student("Vasiliev", "Vasilij", "Vasilievich", 1973,
                "Recordnaya str", "380670002413", "MFU", 3, 4);
        Student s4 = new Student("Vasiliev", "Oleg", "Andreevich", 1992,
                "Morskaya str", "380662550250", "MFU", 3, 4);
        Student[] arr = {s1, s2, s3, s4};

        StudentsArr stud = new StudentsArr(s1, s2);

        StudentsArr sArr1 = new StudentsArr(4);

        StudentsArr sArr2 = new StudentsArr(arr);

        Selection.addStudent(sArr1, s2);
        Selection.addStudent(sArr1, s3);
        Selection.addStudent(stud, s2);

        System.out.println();
        Selection.faculty(sArr2, "Internetional Economy");

        System.out.println();
        Selection.facultyCourse(sArr2);

        System.out.println();
        Selection.faculty(sArr2, "MFU");

        System.out.println();
        Selection.older(sArr2, 1975);

        System.out.println();
        Selection.group(sArr2, 4);
    }
}
