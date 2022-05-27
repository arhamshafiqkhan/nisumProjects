package com.arham.jdbc;

import javax.swing.plaf.IconUIResource;
import java.sql.*;
import java.util.Scanner;

public class StudentDetailsJDBC {
    public static void main(String[] args) {

        String url = "jdbc:mysql://127.0.0.1:3306/StudentInfo";
        Scanner input = new Scanner(System.in);
        String toContinue = null;

        String studentName = null;
        int rollNo = 0;
        String className = null;

        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        String query = "insert into Student (RollNo, StudentName, Class) values (?, ?, ?);";

//        String query = "insert into Student (RollNo, StudentName, Class) values (103, 'Arham', '9');";

//        try {
//            connection = DriverManager.getConnection(url, "root", "arham@123");
//            statement = connection.createStatement();
//            statement.executeUpdate(query);
//            System.out.println("Executed an insert statement.");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

        // Inserting the data
        try {
            connection = DriverManager.getConnection(url, "root", "arham@123");
            statement = connection.createStatement();
            System.out.print("To add a student, press 'yes', or press 'no' to continue... ");
            toContinue = input.nextLine();

            while ("yes".equalsIgnoreCase(toContinue)) {
                preparedStatement = connection.prepareStatement(query);

                System.out.print("Enter student's name: ");
                studentName = input.nextLine();

                System.out.print("Enter student's Roll no: ");
                rollNo = Integer.parseInt(input.nextLine());

                System.out.print("Enter student's class: ");
                className = input.nextLine();

                System.out.print("Would you like to add more students? press [yes/no]... ");
                toContinue = input.nextLine();

                preparedStatement.setInt(1, rollNo);
                preparedStatement.setString(2, studentName);
                preparedStatement.setString(3, className);

                preparedStatement.executeUpdate(); // to execute insert using preparedStatement
                System.out.println("Executed an insert statement.");
                System.out.println();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // Retrieving the data by entering Roll Number of the student on the Console
        try {
            System.out.println("Enter roll number of the student: ");
            int rollNumber = Integer.parseInt(input.nextLine());
            preparedStatement = connection.prepareStatement("select * from Student where rollNo = ?;");

            preparedStatement.setInt(1, rollNumber);
            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("Details of the selected student are: ");
            while (resultSet.next()) {
                String studentData = "Name: " + resultSet.getString("StudentName") + ", Roll Number: " + resultSet.getInt("RollNo")
                        + ", Class: " + resultSet.getString("Class");
                System.out.println(studentData);
                System.out.println();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // Retrieving the data
        try {
            ResultSet resultSet = statement.executeQuery("select * from Student;");
            int counter = 1;
            System.out.println("Details of Students retrieved from the Database are as follows: ");
            while(resultSet.next()) {
                String studentData = counter + ". Name: " + resultSet.getString("StudentName") + ", Roll Number: " + resultSet.getInt("RollNo")
                        + ", Class: " + resultSet.getString("Class");
                System.out.println(studentData);
                counter++;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
                if(preparedStatement != null)
                    preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
