package com.arham.jdbc;

import java.sql.*;
import java.util.Scanner;

public class StudentCourseRelation {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/StudentInfo";
        String query = "select s.StudentName AS student_name, c.CourseName AS course_name" +
                " from Student s" +
                " inner join Course_Enrolment ce" +
                " on s.RollNo = ce.roll_no" +
                " inner join Course c" +
                " on ce.course_id = c.CourseId" +
                " where s.Rollno = ?;";

        Scanner input = new Scanner(System.in);
        int rollNumber;

        try {
            Connection connection = DriverManager.getConnection(url, "root", "arham@123");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            System.out.print("Enter roll number: ");
            rollNumber = input.nextInt();
            preparedStatement.setInt(1, rollNumber);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Student with roll number " + rollNumber + " is enrolled in the following courses: ");
            int counter = 1;
            while (resultSet.next()) {
                if(counter == 1)
                    System.out.println("Student's name: " + resultSet.getString("student_name"));
                System.out.println(counter + ". " + resultSet.getString("course_name"));
                counter++;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
