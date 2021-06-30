package com.work.display;

import com.work.HibernateUtil;
import com.work.student.StudentService;
import org.hibernate.Session;
import java.util.Scanner;

public class Display {

    public static Session session = HibernateUtil.getSessionFactory().openSession();

    public static void display() {
        session.beginTransaction();
        System.out.println("Hi! Choose what you want to do:");
        System.out.println("1 - add some student");
        System.out.println("2 - delete some student");
        System.out.println("3 - display all students");
        System.out.println("4 - display student by id");
        System.out.println("5 - display student by name");

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String chose = sc.next();
        System.out.println("You chose " + chose);

        switch (chose) {
            case "1":
                try {
                    System.out.println("please enter the name of this student");
                    String name = sc.next();
                    System.out.println("please enter the group of this student");
                    int group = sc.nextInt();
                    System.out.println("please enter the year of this student learning");
                    int year = sc.nextInt();
                    System.out.println(StudentService.add(name, group, year));
                } catch (Exception ex){
                    System.out.println("you enter inappropriate data");
                }
                break;
            case "2":
                try {
                    System.out.println("please enter the id of the student you want to delete");
                    int id = sc.nextInt();
                    System.out.println(StudentService.delete(id));
                } catch (NullPointerException ex){
                    System.out.println("This student is already deleted");
                } catch (Exception ex){
                    System.out.println("You enter not a number");
                }
                break;
            case "3":
                StudentService.getAll();
                break;
            case "4":
                try {
                    System.out.println("please enter the id of the student you want to display");
                    int displayId = sc.nextInt();
                    StudentService.getById(displayId);
                } catch (Exception ex){
                    System.out.println("you enter not a number");
                }
                break;
            case "5":
                System.out.println("please enter the name of the student you want to display");
                String displayName = sc.next();
                StudentService.getByName(displayName);
                break;
            default:
                System.out.println("You don`t choose any function");
        }
    }

}
