package com.arham.jdbc;

import java.sql.*;

public class JDBCIntro {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
        Connection connection = null;
        Statement statement = null;
        try {
            // Establish connection object
            connection = DriverManager.getConnection(url, "root", "arham@123");

            // create a statement object to send to the database
            statement = connection.createStatement();

            // Execute the statement object
            ResultSet resultSet = statement.executeQuery("select * from employees_tbl");

            // Process the object
            int salaryTotal = 0;
            int counter = 1;
            while(resultSet.next()) {
                String employeeData = counter + ". Name: " + resultSet.getString("name") + ", Job Title: " + resultSet.getString("dept")
                        + ", Salary: " + resultSet.getInt("salary");
                System.out.println(employeeData);
                salaryTotal += resultSet.getInt("salary");
                counter++;
            }
            System.out.println("Salary total is: " + salaryTotal);

//            while(resultSet.next()) {
//                System.out.println(resultSet.getString("name"));
//            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
