package com.work.student;

import com.work.StartConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("DuplicatedCode")
public class StudentService {

    /* Adding a student */
    public static boolean add(String fullName, int groupNumber, int year) throws SQLException {
        StartConnection.statement.executeUpdate("INSERT student(full_name, group_number, year)" +
                "VALUES ('" + fullName +"', " + groupNumber + ", " + year + ")");
        return true;
    }

    /* Deleting a student by id */
    public static boolean delete(int id) throws SQLException {
        StartConnection.statement.executeUpdate("UPDATE student SET deleted = true where id = " + id);
        return true;
    }

    /*print all students*/
    public static void getAll() throws SQLException {
        ResultSet rs = StartConnection.statement.executeQuery("select * from student where student.deleted = 0");
        studentPrint(rs);
    }

    /*get student by id*/
    public static void getById(int studentId) throws SQLException {
        ResultSet rs = StartConnection.statement.executeQuery("select * from student where student.id = " +
                studentId + " and student.deleted = 0");
        studentPrint(rs);
    }

    /*get student by name*/
    public static void getByName(String studentName) throws SQLException {
        ResultSet rs = StartConnection.statement.executeQuery("select * from student where student.full_name = '" +
                studentName + "' and student.deleted = 0");
        studentPrint(rs);
    }

    private static void studentPrint(ResultSet rs) throws SQLException {
        List<Student> students = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String fullName = rs.getString("full_name");
            int groupNumber = rs.getInt("group_number");
            int year = rs.getInt("year");
            students.add(new Student(id, fullName, groupNumber, year));
        }
        for (Student st : students){
            System.out.println(st);
        }
    }


}
