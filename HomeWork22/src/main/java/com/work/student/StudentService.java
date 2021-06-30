package com.work.student;

import com.work.display.Display;
import org.hibernate.Query;
import java.util.List;

public class StudentService {

    /* Adding a student */
    public static boolean add(String fullName, int groupNumber, int year) {
        StudentH st = new StudentH().setFull_name(fullName).setGroup_number(groupNumber).setYear(year);
        Display.session.save(st);
        Display.session.getTransaction().commit();
        return true;
    }

    /* Deleting a student by id */
    public static boolean delete(int id) {
        Query q = Display.session.createQuery("From StudentH where deleted = 0 and id =" + id);
        StudentH st = (StudentH) q.uniqueResult();
        st.setDeleted(true);
        Display.session.save(st);
        Display.session.getTransaction().commit();
        return true;
    }

    /*print all students*/
    public static void getAll() {
        Query q = Display.session.createQuery("From StudentH where deleted = 0");
        List<StudentH> resultList = q.list();
        resultList.forEach(System.out::println);
    }

    /*get student by id*/
    public static void getById(int studentId) {
        Query q = Display.session.createQuery("From StudentH where deleted = 0 and id =" + studentId);
        StudentH st = (StudentH) q.uniqueResult();
        System.out.println(st);
    }

    /*get student by name*/
    public static void getByName(String studentName) {
        Query q = Display.session.createQuery("From StudentH where deleted = 0 and full_name =:name");
        q.setParameter("name", studentName);
        List<StudentH> resultList = q.list();
        if (resultList.size() == 0){
            System.out.println("There are no this name students");
        } else {
            resultList.forEach(System.out::println);
        }

    }


}
