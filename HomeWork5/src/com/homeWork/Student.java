/*Создать класс, спецификация которого приведена ниже. Определить конструкторы и методы setТип(),
getТип(), toString(). Определить дополнительно методы в классе, создающем массив объектов
. Задать критерий выбора данных и вывести эти данные на консоль. В каждом классе, обладающем
 информацией, должно быть объявлено несколько конструкторов.

Student: id, Фамилия, Имя, Отчество, Год рождения, Адрес, Телефон, Факультет, Курс, Группа.

Создать массив объектов.

Вывести:

a) список студентов заданного факультета; - Факульет

b) списки студентов для каждого факультета и курса; - Факультет, Группа

c) список студентов, родившихся после заданного года; - Год рождения

d) список учебной группы. - Группа*/
package com.homeWork;

public class Student {

    private int id;
    private String surname;
    private String name;
    private String secondName;
    private int birthYear;
    private String address;
    private int phoneNumber;
    private String faculty;
    private int course;
    private int group;
    private static int count = 0;

    public Student(String surname, String name, String faculty, int course, int group) {
        this.id = ++count;
        this.surname = surname;
        this.name = name;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(String surname, String name, String secondName, int birthYear, String address,
                   int phoneNumber, String faculty, int course, int group) {
        this.id = ++count;
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.birthYear = birthYear;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student() {
        this.id = ++count;
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birthYear=" + birthYear +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}
