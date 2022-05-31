package com.arham.web.dao;

import java.sql.*;

import com.arham.web.model.Student;

public class StudentDAO {
	
	String url = "jdbc:mysql://localhost:3306/StudentInfo";
	String userName = "root";
	String password = "arham@123";
	
	String querySELECT = "SELECT * from Student WHERE RollNo = ?;";
	String queryINSERT = "INSERT into Student (RollNo, StudentName, ClassName) VALUES (?, ?, ?);";
	String queryUPDATE = "UPDATE Student SET RollNo = ?, StudentName = ?, ClassName = ?;";
	String queryDELETE = "DELETE from Student WHERE RollNo = ?;";

	
	public Student getStudent(int rollNo) {
		
		Student student = new Student();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, userName, password);
			PreparedStatement statement = connection.prepareStatement(querySELECT);
			statement.setInt(1, rollNo);
			
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				student.setRollNo(resultSet.getInt("RollNo"));
				student.setStudentName(resultSet.getString("StudentName"));
				student.setClassName(resultSet.getString("ClassName"));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return student;
	}
	
	public void createStudent(Student student) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, userName, password);
			PreparedStatement statement = connection.prepareStatement(queryINSERT);
			statement.setInt(1, student.getRollNo());
			statement.setString(2, student.getStudentName());
			statement.setString(3, student.getClassName());
			statement.executeUpdate();			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void updateStudent(Student student) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, userName, password);
			PreparedStatement statement = connection.prepareStatement(queryUPDATE);
			statement.setInt(1, student.getRollNo());
			statement.setString(2, student.getStudentName());
			statement.setString(3, student.getClassName());
			statement.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void deleteStudent(int rollNo) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, userName, password);
			PreparedStatement statement = connection.prepareStatement(queryDELETE);
			statement.setInt(1, rollNo);
			statement.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
